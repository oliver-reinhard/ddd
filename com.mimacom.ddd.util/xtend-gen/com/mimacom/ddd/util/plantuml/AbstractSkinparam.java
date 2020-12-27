package com.mimacom.ddd.util.plantuml;

@SuppressWarnings("all")
public abstract class AbstractSkinparam {
  private static final String NEWLINE = "\n";
  
  /**
   * Return "class", "package" etc.
   */
  protected abstract String scopeName();
  
  /**
   * Return the actual skinparam body lines. Use "\n" for new line.
   * No indenting required (applied automatically)
   */
  protected abstract String scopeBody();
  
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("skinparam ");
    sb.append(this.scopeName().toLowerCase());
    sb.append(" {");
    this.newLine(sb);
    this.indentAndAppend(sb, this.scopeBody());
    sb.append("}");
    return sb.toString();
  }
  
  protected void indentAndAppend(final StringBuilder sb, final String body) {
    final String[] lines = body.split(AbstractSkinparam.NEWLINE);
    for (final String line : lines) {
      {
        sb.append("\t");
        sb.append(line.trim());
        this.newLine(sb);
      }
    }
  }
  
  protected void newLine(final StringBuilder sb) {
    sb.append(AbstractSkinparam.NEWLINE);
  }
}
