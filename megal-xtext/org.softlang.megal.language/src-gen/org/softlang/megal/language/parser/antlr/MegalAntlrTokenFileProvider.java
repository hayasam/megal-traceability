/*
* generated by Xtext
*/
package org.softlang.megal.language.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MegalAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/softlang/megal/language/parser/antlr/internal/InternalMegal.tokens");
	}
}
