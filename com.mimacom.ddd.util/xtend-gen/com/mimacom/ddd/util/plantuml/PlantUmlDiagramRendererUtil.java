package com.mimacom.ddd.util.plantuml;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.core.DiagramDescription;
import net.sourceforge.plantuml.eclipse.utils.Diagram;
import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;

@SuppressWarnings("all")
public class PlantUmlDiagramRendererUtil {
  private static final Logger LOGGER = Logger.getLogger(PlantUmlDiagramRendererUtil.class);
  
  public InputStream render(final String plantUmlText, final FileFormat format) throws Exception {
    boolean _equals = Objects.equal(format, FileFormat.PNG);
    if (_equals) {
      final ImageData imageData = Diagram.getImage(plantUmlText);
      final ImageLoader imageLoader = new ImageLoader();
      imageLoader.data = new ImageData[] { imageData };
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      int _xifexpression = (int) 0;
      boolean _equals_1 = Objects.equal(format, FileFormat.PNG);
      if (_equals_1) {
        _xifexpression = SWT.IMAGE_PNG;
      } else {
        _xifexpression = SWT.IMAGE_JPEG;
      }
      imageLoader.save(baos, _xifexpression);
      byte[] _byteArray = baos.toByteArray();
      final ByteArrayInputStream bais = new ByteArrayInputStream(_byteArray);
      return bais;
    } else {
      boolean _equals_2 = Objects.equal(format, FileFormat.SVG);
      if (_equals_2) {
        final SourceStringReader reader = new SourceStringReader(plantUmlText);
        final ByteArrayOutputStream baos_1 = new ByteArrayOutputStream();
        FileFormatOption _fileFormatOption = new FileFormatOption(FileFormat.SVG);
        final DiagramDescription desc = reader.outputImage(baos_1, _fileFormatOption);
        PlantUmlDiagramRendererUtil.LOGGER.debug(desc);
        baos_1.close();
        byte[] _byteArray_1 = baos_1.toByteArray();
        final ByteArrayInputStream bais_1 = new ByteArrayInputStream(_byteArray_1);
        return bais_1;
      } else {
        throw new IllegalArgumentException(("Unsupported format: " + format));
      }
    }
  }
}
