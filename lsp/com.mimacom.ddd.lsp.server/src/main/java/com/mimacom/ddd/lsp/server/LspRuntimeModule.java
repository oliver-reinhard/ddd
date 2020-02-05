package com.mimacom.ddd.lsp.server;

import org.eclipse.xtext.ide.server.ILanguageServerShutdownAndExitHandler;
import org.eclipse.xtext.ide.server.ServerModule;

public class LspRuntimeModule extends ServerModule {

  @Override
  protected void configure() {
    super.configure();
    this.bind(ILanguageServerShutdownAndExitHandler.class)
        .to(CallbackLanguageServerShutdownHandler.class);
  }
}
