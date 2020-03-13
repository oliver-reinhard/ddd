package com.mimacom.ddd.pub.pub.generator;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class CodeListingFormatter {
  public static final int TAB_SIZE = 2;
  
  /**
   * Outdents the listing's lines by the leading indentation common to each line.
   */
  public String outdent(final String listing) {
    return this.outdent(listing, CodeListingFormatter.TAB_SIZE);
  }
  
  public String outdent(final String listing, final int tabSize) {
    String _xblockexpression = null;
    {
      final String[] lines = listing.split("\n");
      int minIndent = Integer.MAX_VALUE;
      final StringBuilder b = new StringBuilder();
      for (final String line : lines) {
        {
          final int indentCount = this.indentationSize(line, tabSize);
          minIndent = Math.min(minIndent, indentCount);
        }
      }
      for (final String line_1 : lines) {
        this.appendOutdentedLine(b, line_1, minIndent, tabSize);
      }
      _xblockexpression = b.toString();
    }
    return _xblockexpression;
  }
  
  protected int indentationSize(final String line, final int tabSize) {
    final char[] chars = line.toCharArray();
    int length = 0;
    int i = 0;
    while ((i < chars.length)) {
      {
        final char c = chars[i];
        boolean _equals = Objects.equal(Character.valueOf(c), "\t");
        if (_equals) {
          int _length = length;
          length = (_length + tabSize);
        } else {
          boolean _equals_1 = Objects.equal(Character.valueOf(c), " ");
          if (_equals_1) {
            length++;
          } else {
            return length;
          }
        }
        i++;
      }
    }
    return length;
  }
  
  protected void appendOutdentedLine(final StringBuilder b, final String line, final int tabSize, final int outdentSize) {
    final char[] chars = line.toCharArray();
    int outdentedSize = 0;
    int i = 0;
    while ((i < chars.length)) {
      {
        final char c = chars[i];
        boolean _equals = Objects.equal(Character.valueOf(c), "\t");
        if (_equals) {
          if ((outdentedSize < outdentSize)) {
            int _outdentedSize = outdentedSize;
            outdentedSize = (_outdentedSize + tabSize);
          } else {
            for (int j = 0; (j < tabSize); j++) {
              b.append(" ");
            }
          }
        } else {
          boolean _equals_1 = Objects.equal(Character.valueOf(c), " ");
          if (_equals_1) {
            if ((outdentedSize < outdentSize)) {
              outdentedSize++;
            } else {
              b.append(" ");
            }
          } else {
            int _length = chars.length;
            int _minus = (_length - i);
            b.append(chars, i, _minus);
            b.append("\n");
            return;
          }
        }
        i++;
      }
    }
    b.append("\n");
  }
}
