/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.ui.wizard;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.FileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileGenerator;
import org.eclipse.xtext.ui.wizard.template.StringSelectionTemplateVariable;

@FileTemplate(label = "Hello World", icon = "file_template.png", description = "Create a hello world for Pub.")
@SuppressWarnings("all")
public final class HelloWorldFile extends AbstractFileTemplate {
  private final StringSelectionTemplateVariable helloName = this.combo("Hello Name:", new String[] { "Xtext", "World", "Foo", "Bar" }, "The name to say \'Hello\' to");
  
  @Override
  public void generateFiles(final IFileGenerator generator) {
    StringConcatenation _builder = new StringConcatenation();
    String _folder = this.getFolder();
    _builder.append(_folder);
    _builder.append("/");
    String _name = this.getName();
    _builder.append(_name);
    _builder.append(".pub");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("/*");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("* This is an example model");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("*/");
    _builder_1.newLine();
    _builder_1.append("Hello ");
    _builder_1.append(this.helloName);
    _builder_1.append("!");
    _builder_1.newLineIfNotEmpty();
    generator.generate(_builder, _builder_1);
  }
}
