package org.softlang.megal.language.values;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.softlang.megal.api.URI;
import org.softlang.megal.language.values.URIConverter;

@SuppressWarnings("all")
public class MegalValueConverterService extends Ecore2XtextTerminalConverters {
  @ValueConverter(rule = "URI")
  public IValueConverter<URI> URI() {
    return URIConverter.INSTANCE;
  }
}
