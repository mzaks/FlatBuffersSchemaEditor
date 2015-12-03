/*
 * generated by Xtext
 */
package maxim.zaks.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import maxim.zaks.services.FlatBuffersGrammarAccess;

public class FlatBuffersParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FlatBuffersGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected maxim.zaks.parser.antlr.internal.InternalFlatBuffersParser createParser(XtextTokenStream stream) {
		return new maxim.zaks.parser.antlr.internal.InternalFlatBuffersParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Schema";
	}
	
	public FlatBuffersGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FlatBuffersGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
