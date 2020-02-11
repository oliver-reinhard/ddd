package com.mimacom.ddd.pub.pub.generator;

import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.TitledBlock;
import java.util.Arrays;

@SuppressWarnings("all")
public class PubElementNames {
  protected String _displayName(final TitledBlock b) {
    return b.getClass().getSimpleName().replace("Titled", "").replace("Impl", "");
  }
  
  protected String _displayName(final Division div) {
    return div.getClass().getSimpleName().replace("Impl", "");
  }
  
  protected String _displayName(final DocumentSegment seg) {
    return seg.getClass().getSimpleName().replace("Impl", "");
  }
  
  protected String _displayName(final Object obj) {
    String _name = obj.getClass().getName();
    String _plus = ("Unsupported object type: " + _name);
    throw new IllegalArgumentException(_plus);
  }
  
  public String displayName(final Object div) {
    if (div instanceof Division) {
      return _displayName((Division)div);
    } else if (div instanceof DocumentSegment) {
      return _displayName((DocumentSegment)div);
    } else if (div instanceof TitledBlock) {
      return _displayName((TitledBlock)div);
    } else if (div != null) {
      return _displayName(div);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(div).toString());
    }
  }
}
