package org.softlang.megal.language.ui.highlighting;

import com.google.common.base.Objects;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.softlang.megal.language.ui.highlighting.MegalHighlightingConfiguration;

@SuppressWarnings("all")
public class MegalAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  private final static String UPPER_CASE_ID_RULE = "RULE_ICID";
  
  private final static String LOWER_CASE_ID_RULE = "RULE_LCID";
  
  private final static String URI_RULE = "RULE_URI";
  
  protected String calculateId(final String tokenName, final int tokenType) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(tokenName, MegalAntlrTokenToAttributeIdMapper.UPPER_CASE_ID_RULE)) {
        _matched=true;
        _switchResult = MegalHighlightingConfiguration.ENTITY_ID;
      }
    }
    if (!_matched) {
      if (Objects.equal(tokenName, MegalAntlrTokenToAttributeIdMapper.LOWER_CASE_ID_RULE)) {
        _matched=true;
        _switchResult = MegalHighlightingConfiguration.RELATIONSHIP_ID;
      }
    }
    if (!_matched) {
      if (Objects.equal(tokenName, MegalAntlrTokenToAttributeIdMapper.URI_RULE)) {
        _matched=true;
        _switchResult = MegalHighlightingConfiguration.URI_ID;
      }
    }
    if (!_matched) {
      _switchResult = super.calculateId(tokenName, tokenType);
    }
    return _switchResult;
  }
}
