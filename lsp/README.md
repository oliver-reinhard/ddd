## Running DDD With Language Server Protocol
Xtext based projects may conventiently be integrated with the Language Server Protocol (LSP). The LSP is a language agnostic protocol that can be used between any editor and any language for advanced language support.

The main idea is to enable users to work with Xtext languages using an editor of their choice. This project provides some basic infrastructure for using Visual Studio Code for DDD modeling.

## Visual Studio Code as a LSP Client
The `vscode-extension` project provides a VS Code extension (plugin), providing basic editor features such as reference navigation, validation and syntax coloring.

### The LSP Server
A LSP client only works if there is a LSP server hosting the LSP languages. The client connects to this server and exchanges messages in the JSON-RPC format. `com.mimacom.ddd.lsp.server` provides a simple standalone Java application accepting socket connection on a predefined port.
