package com.mimacom.ddd.util.plantuml;

import com.google.common.base.Objects;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.core.DiagramDescription;
import net.sourceforge.plantuml.eclipse.utils.Diagram;
import org.apache.log4j.Logger;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class PlantUmlDiagramRendererUtil {
  private static final Logger LOGGER = Logger.getLogger(PlantUmlDiagramRendererUtil.class);
  
  public InputStream render(final String plantUmlText, final PlantUmlFileFormat format) throws Exception {
    try {
      if ((Objects.equal(format, PlantUmlFileFormat.PNG) || Objects.equal(format, PlantUmlFileFormat.JPG))) {
        final ImageData imageData = Diagram.getImage(plantUmlText);
        if ((imageData == null)) {
          throw new NullPointerException(
            "No image was generated: leading \'@startuml\' tag missing in PlantUML text?");
        }
        final ImageLoader imageLoader = new ImageLoader();
        imageLoader.data = new ImageData[] { imageData };
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        imageLoader.save(baos, format.value);
        byte[] _byteArray = baos.toByteArray();
        final ByteArrayInputStream bais = new ByteArrayInputStream(_byteArray);
        return bais;
      } else {
        if ((Objects.equal(format, PlantUmlFileFormat.SVG) || Objects.equal(format, PlantUmlFileFormat.EPS))) {
          FileFormat _xifexpression = null;
          boolean _equals = Objects.equal(format, PlantUmlFileFormat.SVG);
          if (_equals) {
            _xifexpression = FileFormat.SVG;
          } else {
            _xifexpression = FileFormat.EPS;
          }
          final FileFormat nativeFormat = _xifexpression;
          try {
            final SourceStringReader reader = new SourceStringReader(plantUmlText);
            final ByteArrayOutputStream baos_1 = new ByteArrayOutputStream();
            FileFormatOption _fileFormatOption = new FileFormatOption(nativeFormat);
            final DiagramDescription desc = reader.outputImage(baos_1, _fileFormatOption);
            PlantUmlDiagramRendererUtil.LOGGER.debug(desc);
            baos_1.close();
            byte[] _byteArray_1 = baos_1.toByteArray();
            final ByteArrayInputStream bais_1 = new ByteArrayInputStream(_byteArray_1);
            return bais_1;
          } catch (final Throwable _t) {
            if (_t instanceof Throwable) {
              final Throwable t = (Throwable)_t;
              String _name = nativeFormat.name();
              String _plus = ("PlantUML fails to render diagram as " + _name);
              PlantUmlDiagramRendererUtil.LOGGER.error(_plus, t);
              throw t;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        } else {
          throw new IllegalArgumentException(("Unsupported format: " + format));
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
