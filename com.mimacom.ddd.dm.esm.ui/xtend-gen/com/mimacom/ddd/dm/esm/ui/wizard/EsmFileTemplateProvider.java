/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.ui.wizard;

import com.mimacom.ddd.dm.esm.ui.wizard.HelloWorldFile;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileTemplateProvider;

/**
 * Create a list with all file templates to be shown in the template new file wizard.
 * 
 * Each template is able to generate one or more files.
 */
@SuppressWarnings("all")
public class EsmFileTemplateProvider implements IFileTemplateProvider {
  @Override
  public AbstractFileTemplate[] getFileTemplates() {
    HelloWorldFile _helloWorldFile = new HelloWorldFile();
    return new AbstractFileTemplate[] { _helloWorldFile };
  }
}
