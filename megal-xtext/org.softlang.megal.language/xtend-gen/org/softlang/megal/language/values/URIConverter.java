package org.softlang.megal.language.values;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.softlang.megal.api.URI;

@SuppressWarnings("all")
public class URIConverter extends AbstractNullSafeConverter<URI> {
  /**
   * The value converter instance
   */
  public final static URIConverter INSTANCE = new URIConverter();
  
  protected URI internalToValue(final String string, final INode node) throws ValueConverterException {
    URI _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = URI.valueOf(string);
    } catch (final Throwable _t) {
      if (_t instanceof IllegalArgumentException) {
        final IllegalArgumentException e = (IllegalArgumentException)_t;
        throw new ValueConverterException("Error converting string to URI", node, e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  protected String internalToString(final URI value) {
    return value.toString();
  }
}
