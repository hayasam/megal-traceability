package org.softlang.megal.language.ui.highlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

class MegalAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	static val UPPER_CASE_ID_RULE = "RULE_ICID"

	static val LOWER_CASE_ID_RULE = "RULE_LCID"

	static val URI_RULE = "RULE_URI"

	override protected calculateId(String tokenName, int tokenType) {
		switch tokenName {
			// Upper case is most likely an entity, so start off there
			case UPPER_CASE_ID_RULE:
				MegalHighlightingConfiguration.ENTITY_ID
			// Lower case is most likely a relationship, so start off there
			case LOWER_CASE_ID_RULE:
				MegalHighlightingConfiguration.RELATIONSHIP_ID
			// URI directly mapped
			case URI_RULE:
				MegalHighlightingConfiguration.URI_ID
			// Map any other by supertypes method
			default:
				super.calculateId(tokenName, tokenType)
		}
	}

}
