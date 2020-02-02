package com.mimacom.ddd.util.plantuml

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import net.sourceforge.plantuml.FileFormatOption
import net.sourceforge.plantuml.SourceStringReader
import net.sourceforge.plantuml.eclipse.utils.Diagram
import org.apache.log4j.Logger
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.ImageLoader

import static net.sourceforge.plantuml.FileFormat.*
import net.sourceforge.plantuml.FileFormat

class PlantUmlDiagramRendererUtil {
	
	static final Logger LOGGER = Logger.getLogger(PlantUmlDiagramRendererUtil);

	def InputStream render(String plantUmlText, FileFormat format) throws Exception {

		if (format == PNG) {
			val imageData = Diagram::getImage(plantUmlText)
			val imageLoader = new ImageLoader();
			imageLoader.data = #[imageData]
			val baos = new ByteArrayOutputStream()
			imageLoader.save(baos, format == PNG ? SWT.IMAGE_PNG : SWT.IMAGE_JPEG);
			val bais = new ByteArrayInputStream(baos.toByteArray)
			return bais
			
		} else if (format == SVG) {
			//
			// Code taken from https://plantuml.com/api
			// Except generateImage (deprecated) --> outputImage
			//
			val reader = new SourceStringReader(plantUmlText);
			val baos = new ByteArrayOutputStream();
			// Write the first image to "os"
			val	desc = reader.outputImage(baos, new FileFormatOption(FileFormat.SVG));
			LOGGER.debug(desc)
			baos.close();
			// The XML is stored into svg
//			val svg = new String(baos.toByteArray(), Charset.forName("UTF-8"));
			val bais = new ByteArrayInputStream(baos.toByteArray)
			return bais

		} else {
			throw new IllegalArgumentException("Unsupported format: " + format)
		}
	}
}
