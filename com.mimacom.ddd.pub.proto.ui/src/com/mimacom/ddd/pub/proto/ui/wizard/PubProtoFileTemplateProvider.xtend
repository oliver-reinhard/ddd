/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.proto.ui.wizard

import org.eclipse.xtext.ui.wizard.template.FileTemplate
import org.eclipse.xtext.ui.wizard.template.IFileGenerator
import org.eclipse.xtext.ui.wizard.template.IFileTemplateProvider

/**
 * Create a list with all file templates to be shown in the template new file wizard.
 * 
 * Each template is able to generate one or more files.
 */
class PubProtoFileTemplateProvider implements IFileTemplateProvider {
	override getFileTemplates() {
		#[new PubProtoFile]
	}
}

@FileTemplate(label="Publication Class", icon="file_template.png", description="Create a class of publications defining their structural layout.")
final class PubProtoFile {
	val title = text("Title :", "Report", "The title of the publication class")

	override generateFiles(IFileGenerator generator) {
		generator.generate('''«folder»/«name».pubproto''', '''
			/*
			 * This publication prototype (a.k.a. class) defines the structural layout of publications for ....
			 */
			publication class «name.replaceAll(" \t", "")»
			title: "«title»"
			nature: Web
			segments:
				Abstract { }
				TableOfContents { }
				Body { parts:true appendix:true }
			divisions:
				Part { numbering:roman }
				Chapter {numbering:arabic}
				Section {numbering:arabic}
				Sub {numbering:arabic}
				Subsub {numbering:arabic}
		''')
	}
}
