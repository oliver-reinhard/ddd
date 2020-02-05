package com.mimacom.ddd.lsp.server;

import com.google.inject.Singleton;
import java.util.function.Consumer;
import org.eclipse.xtext.ide.server.ILanguageServerShutdownAndExitHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class CallbackLanguageServerShutdownHandler<T>
    implements ILanguageServerShutdownAndExitHandler {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(CallbackLanguageServerShutdownHandler.class);

  private ILanguageServerShutdownAndExitHandler.DefaultImpl defaultHandler =
      new ILanguageServerShutdownAndExitHandler.DefaultImpl();

  private Consumer<T> callback;

  public void registerCallback(Consumer<T> callback) {
    this.callback = callback;
  }

  @Override
  public void exit() {
    LOGGER.info("exit {}, {}", callback == null, this);
    if (callback != null) {
      callback.accept(null);
    } else {
      defaultHandler.exit();
    }
  }

  @Override
  public void shutdown() {
    LOGGER.info("shutdown {}", callback == null);
    if (callback != null) {
      callback.accept(null);
    } else {
      defaultHandler.exit();
    }
  }
}
