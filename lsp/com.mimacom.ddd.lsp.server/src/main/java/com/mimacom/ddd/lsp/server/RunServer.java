package com.mimacom.ddd.lsp.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.Channels;
import java.util.ServiceLoader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.jsonrpc.MessageConsumer;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class RunServer {

  private static final Logger LOGGER = LoggerFactory.getLogger(RunServer.class);

  public static void main(String[] args)
      throws InterruptedException, IOException, ExecutionException {
    LOGGER.info("Starting up...");


    ServiceLoader.<ISetup>load(ISetup.class).forEach(it -> {
      LOGGER.debug("Registered {}", it.getClass());
    });


    LspRuntimeModule serverModule = new LspRuntimeModule();
    Injector injector = Guice.createInjector(serverModule);

    AsynchronousServerSocketChannel open = AsynchronousServerSocketChannel.open();
    InetSocketAddress socketAddress = new InetSocketAddress("localhost", 5007);
    AsynchronousServerSocketChannel serverSocket = open.bind(socketAddress);

    ExecutorService threadPool = Executors.newCachedThreadPool();

    while (true) {
      LanguageServerImpl languageServer =
          injector.<LanguageServerImpl>getInstance(LanguageServerImpl.class);
      AsynchronousSocketChannel socketChannel = serverSocket.accept().get();

      LOGGER.info("Client connected");

      InputStream in = Channels.newInputStream(socketChannel);
      OutputStream out = Channels.newOutputStream(socketChannel);

      Function<MessageConsumer, MessageConsumer> messageHandler = it -> {
        // no custom message handling
        return it;
      };

      Launcher<LanguageClient> launcher = Launcher.createIoLauncher(languageServer,
          LanguageClient.class, in, out, threadPool, messageHandler);
      languageServer.connect(launcher.getRemoteProxy());
      launcher.startListening();
    }
  }
}
