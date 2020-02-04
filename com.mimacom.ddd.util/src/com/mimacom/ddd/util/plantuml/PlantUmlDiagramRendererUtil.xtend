package com.mimacom.ddd.util.plantuml

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import net.sourceforge.plantuml.FileFormat
import net.sourceforge.plantuml.FileFormatOption
import net.sourceforge.plantuml.SourceStringReader
import net.sourceforge.plantuml.eclipse.utils.Diagram
import org.apache.log4j.Logger
import org.eclipse.swt.graphics.ImageLoader
import static  com.mimacom.ddd.util.plantuml.PlantUmlFileFormat.*

class PlantUmlDiagramRendererUtil {
	
	static final Logger LOGGER = Logger.getLogger(PlantUmlDiagramRendererUtil);

	def InputStream render(String plantUmlText, PlantUmlFileFormat format) throws Exception {

		if (format == PNG || format == JPG) {
			val imageData = Diagram::getImage(plantUmlText)
			if (imageData === null) {
				throw new NullPointerException("No PlantUML image was generated: '@startuml' missing?")
			}
			val imageLoader = new ImageLoader();
			imageLoader.data = #[imageData]
			val baos = new ByteArrayOutputStream()
			imageLoader.save(baos, format.value);
			val bais = new ByteArrayInputStream(baos.toByteArray)
			return bais
			
		} else if (format == SVG) {
			//
			// Code taken from https://plantuml.com/api
			// Except generateImage (deprecated) --> outputImage
			//
			val reader = new SourceStringReader(plantUmlText);
			val baos = new ByteArrayOutputStream();
			// Write the first image to "baos"
			val	desc = reader.outputImage(baos, new FileFormatOption(FileFormat.SVG));
			LOGGER.debug(desc)
			baos.close();
			// The XML is stored as svg
//			val svg = new String(baos.toByteArray(), Charset.forName("UTF-8"));
			val bais = new ByteArrayInputStream(baos.toByteArray)
			return bais

		} else {
			throw new IllegalArgumentException("Unsupported format: " + format)
		}
	}
}
