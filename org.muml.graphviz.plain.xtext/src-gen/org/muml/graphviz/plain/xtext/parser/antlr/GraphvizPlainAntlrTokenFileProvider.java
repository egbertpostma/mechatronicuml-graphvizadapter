/*
 * generated by Xtext
 */
package org.muml.graphviz.plain.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GraphvizPlainAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/muml/graphviz/plain/xtext/parser/antlr/internal/InternalGraphvizPlain.tokens");
	}
}
