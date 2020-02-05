// The module 'vscode' contains the extensibility API
// Import the module and reference it with the alias vscode in your code below
import * as net from 'net';
import * as path from 'path';
import * as os from 'os';
import { Trace } from 'vscode-jsonrpc';
import { commands, window, workspace, ExtensionContext } from 'vscode';
import { LanguageClient, LanguageClientOptions, StreamInfo, ServerOptions, ErrorHandler, ErrorAction, CloseAction, Message } from 'vscode-languageclient';
import { logger, initializeLogFile } from './log';

const extensionName = 'Language Support for DDD';
let clientLogFile;

class ClientErrorHandler implements ErrorHandler {
    private restarts: number[];

    constructor(private name: string) {
        this.restarts = [];
    }

    public error(_error: Error, _message: Message, count: number): ErrorAction {
        if (count && count <= 3) {
            logger.error(`${this.name} server encountered error: ${_message}, ${_error && _error.toString()}`);
            return ErrorAction.Continue;
        }

        if (_error && _error.toString().indexOf("ECONNREFUSED") > 0) {
            logger.error(`${this.name} server connection failed. Is the server running?`);
            return ErrorAction.Continue;
        }

        logger.error(`${this.name} server encountered error and will shut down: ${_message}, ${_error && _error.toString()}`);
        return ErrorAction.Shutdown;
    }

    public closed(): CloseAction {
        this.restarts.push(Date.now());
        if (this.restarts.length < 5) {
            logger.error(`The ${this.name} server crashed and will restart.`);
            return CloseAction.Restart;
        } else {
            const diff = this.restarts[this.restarts.length - 1] - this.restarts[0];
            if (diff <= 3 * 60 * 1000) {
                const message = `The ${this.name} server crashed 5 times in the last 3 minutes. The server will not be restarted.`;
                logger.error(message);
                window.showErrorMessage(message);
                return CloseAction.DoNotRestart;
            }

            logger.error(`The ${this.name} server crashed and will restart.`);
            this.restarts.shift();
            return CloseAction.Restart;
        }
    }
}

// this method is called when your extension is activated
// your extension is activated the very first time the command is executed
export function activate(context: ExtensionContext) {

    let storagePath = getTempWorkspace();
    initializeLogFile(path.join(storagePath, 'client.log'));

    logger.info('DDD extension activating');

    // The server is a started as a separate app and listens on port 5007
    let connectionInfo = {
        port: 5007
    };
    let serverOptions: ServerOptions = () => {
        // Connect to language server via socket
        let socket = net.connect(connectionInfo);
        let result: StreamInfo = {
            writer: socket,
            reader: socket
        };
        return Promise.resolve(result);
    };

    let clientOptions: LanguageClientOptions = {
        documentSelector: [
            { language: 'dmx', scheme: 'file' },
            { language: 'dim', scheme: 'file' }
        ],
        synchronize: {
            fileEvents: workspace.createFileSystemWatcher('**/*.*')
        },
        outputChannelName: 'DDD Language Server',
        errorHandler: new ClientErrorHandler(extensionName),
        initializationFailedHandler: error => {
            logger.error(`Failed to initialize ${extensionName} due to ${error && error.toString()}`);
            return true;
        }
    };

    // Create the language client and start the client.
    let lc = new LanguageClient('Language Client', serverOptions, clientOptions, true);

    // enable tracing (.Off, .Messages, Verbose)
    lc.trace = Trace.Verbose;
    let disposable = lc.start();

    console.log("DDD extension started");

    // Push the disposable to the context's subscriptions so that the 
    // client can be deactivated on extension deactivation
    context.subscriptions.push(disposable);
}

// this method is called when your extension is deactivated
export function deactivate() {
    console.log("DDD extension deactivated");
}

function getTempWorkspace() {
    const tempWorkspace = path.resolve(os.homedir(), 'vscodesws');
    return tempWorkspace;
}