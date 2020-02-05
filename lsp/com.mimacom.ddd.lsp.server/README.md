# Language Server Protocol (LSP)
Provides a language server based on server socket connection.

## Features
Any Xtext language on the classpath is supported! The `ISetup`, which is part of the IDE Xtext project, must be present on the classpath.

## Building the server
The [Maven shade plugin](https://maven.apache.org/plugins/maven-shade-plugin/) allows packaging a Maven module with dependencies as a single jar file using the following command:
```
mvn clean package
```
Successful completion will produce an output file such as `target/com.mimacom.ddd.lsp-<VERSION>.jar`.

## Starting the LSP
**Starting from the IDE**
* Just open the class `RunServer` and run its main method.

**Starting from the command line**
Build an uber jar and start the process as follows:

```
$ mvn clean package
$ java -jar target/com.mimacom.ddd.lsp.server-<version>-SNAPSHOT.jar 

```

## Known Issues
