/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.proto.ui.wizard;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.FileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileGenerator;
import org.eclipse.xtext.ui.wizard.template.StringTemplateVariable;

@FileTemplate(label = "Publication Class", icon = "file_template.png", description = "Create a class of publications defining their structural layout.")
@SuppressWarnings("all")
public final class PubProtoFile extends AbstractFileTemplate {
  private final StringTemplateVariable title = this.text("Title :", "Report", "The title of the publication class");
  
  @Override
  public void generateFiles(final IFileGenerator generator) {
    StringConcatenation _builder = new StringConcatenation();
    String _folder = this.getFolder();
    _builder.append(_folder);
    _builder.append("/");
    String _name = this.getName();
    _builder.append(_name);
    _builder.append(".pubproto");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("/*");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("* This publication prototype (a.k.a. class) defines the structural layout of publications for ....");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("*/");
    _builder_1.newLine();
    _builder_1.append("publication class ");
    String _replaceAll = this.getName().replaceAll(" \t", "");
    _builder_1.append(_replaceAll);
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("title: \"");
    _builder_1.append(this.title);
    _builder_1.append("\"");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("nature: Web");
    _builder_1.newLine();
    _builder_1.append("segments:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Abstract { }");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("TableOfContents { }");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Body { parts:true appendix:true }");
    _builder_1.newLine();
    _builder_1.append("divisions:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Part { numbering:roman }");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Chapter {numbering:arabic}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Section {numbering:arabic}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Sub {numbering:arabic}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Subsub {numbering:arabic}");
    _builder_1.newLine();
    generator.generate(_builder, _builder_1);
  }
}
