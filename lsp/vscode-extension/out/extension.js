"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
// The module 'vscode' contains the extensibility API
// Import the module and reference it with the alias vscode in your code below
const net = require("net");
const path = require("path");
const os = require("os");
const vscode_jsonrpc_1 = require("vscode-jsonrpc");
const vscode_1 = require("vscode");
const vscode_languageclient_1 = require("vscode-languageclient");
const log_1 = require("./log");
const extensionName = 'Language Support for DDD';
let clientLogFile;
class ClientErrorHandler {
    constructor(name) {
        this.name = name;
        this.restarts = [];
    }
    error(_error, _message, count) {
        if (count && count <= 3) {
            log_1.logger.error(`${this.name} server encountered error: ${_message}, ${_error && _error.toString()}`);
            return vscode_languageclient_1.ErrorAction.Continue;
        }
        if (_error && _error.toString().indexOf("ECONNREFUSED") > 0) {
            log_1.logger.error(`${this.name} server connection failed. Is the server running?`);
            return vscode_languageclient_1.ErrorAction.Continue;
        }
        log_1.logger.error(`${this.name} server encountered error and will shut down: ${_message}, ${_error && _error.toString()}`);
        return vscode_languageclient_1.ErrorAction.Shutdown;
    }
    closed() {
        this.restarts.push(Date.now());
        if (this.restarts.length < 5) {
            log_1.logger.error(`The ${this.name} server crashed and will restart.`);
            return vscode_languageclient_1.CloseAction.Restart;
        }
        else {
            const diff = this.restarts[this.restarts.length - 1] - this.restarts[0];
            if (diff <= 3 * 60 * 1000) {
                const message = `The ${this.name} server crashed 5 times in the last 3 minutes. The server will not be restarted.`;
                log_1.logger.error(message);
                vscode_1.window.showErrorMessage(message);
                return vscode_languageclient_1.CloseAction.DoNotRestart;
            }
            log_1.logger.error(`The ${this.name} server crashed and will restart.`);
            this.restarts.shift();
            return vscode_languageclient_1.CloseAction.Restart;
        }
    }
}
// this method is called when your extension is activated
// your extension is activated the very first time the command is executed
function activate(context) {
    let storagePath = getTempWorkspace();
    log_1.initializeLogFile(path.join(storagePath, 'client.log'));
    log_1.logger.info('DDD extension activating');
    // The server is a started as a separate app and listens on port 5007
    let connectionInfo = {
        port: 5007
    };
    let serverOptions = () => {
        // Connect to language server via socket
        let socket = net.connect(connectionInfo);
        let result = {
            writer: socket,
            reader: socket
        };
        return Promise.resolve(result);
    };
    let clientOptions = {
        documentSelector: [
            { language: 'dmx', scheme: 'file' },
            { language: 'dim', scheme: 'file' }
        ],
        synchronize: {
            fileEvents: vscode_1.workspace.createFileSystemWatcher('**/*.*')
        },
        outputChannelName: 'DDD Language Server',
        errorHandler: new ClientErrorHandler(extensionName),
        initializationFailedHandler: error => {
            log_1.logger.error(`Failed to initialize ${extensionName} due to ${error && error.toString()}`);
            return true;
        }
    };
    // Create the language client and start the client.
    let lc = new vscode_languageclient_1.LanguageClient('Language Client', serverOptions, clientOptions, true);
    // enable tracing (.Off, .Messages, Verbose)
    lc.trace = vscode_jsonrpc_1.Trace.Verbose;
    let disposable = lc.start();
    console.log("DDD extension started");
    // Push the disposable to the context's subscriptions so that the 
    // client can be deactivated on extension deactivation
    context.subscriptions.push(disposable);
}
exports.activate = activate;
// this method is called when your extension is deactivated
function deactivate() {
    console.log("DDD extension deactivated");
}
exports.deactivate = deactivate;
function getTempWorkspace() {
    const tempWorkspace = path.resolve(os.homedir(), 'vscodesws');
    return tempWorkspace;
}
//# sourceMappingURL=extension.js.map