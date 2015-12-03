package maxim.zaks.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import maxim.zaks.services.FlatBuffersGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlatBuffersParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'true'", "'bool'", "'byte'", "'ubyte'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'long'", "'ulong'", "'double'", "'string'", "'root_type'", "';'", "'attribute'", "'\"'", "'file_identifier'", "'namespace'", "'include'", "'table'", "'{'", "'}'", "':'", "'='", "')'", "'['", "']'", "'.'", "'('", "'deprecated'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFlatBuffersParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFlatBuffersParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFlatBuffersParser.tokenNames; }
    public String getGrammarFileName() { return "../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g"; }


     
     	private FlatBuffersGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FlatBuffersGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSchema"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:60:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:61:1: ( ruleSchema EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:62:1: ruleSchema EOF
            {
             before(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_ruleSchema_in_entryRuleSchema61);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchema68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:69:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:73:2: ( ( ( rule__Schema__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:74:1: ( ( rule__Schema__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:74:1: ( ( rule__Schema__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:75:1: ( rule__Schema__Group__0 )
            {
             before(grammarAccess.getSchemaAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:76:1: ( rule__Schema__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:76:2: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_rule__Schema__Group__0_in_ruleSchema94);
            rule__Schema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleRootType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:88:1: entryRuleRootType : ruleRootType EOF ;
    public final void entryRuleRootType() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:89:1: ( ruleRootType EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:90:1: ruleRootType EOF
            {
             before(grammarAccess.getRootTypeRule()); 
            pushFollow(FOLLOW_ruleRootType_in_entryRuleRootType121);
            ruleRootType();

            state._fsp--;

             after(grammarAccess.getRootTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRootType"


    // $ANTLR start "ruleRootType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:97:1: ruleRootType : ( ( rule__RootType__Group__0 ) ) ;
    public final void ruleRootType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:101:2: ( ( ( rule__RootType__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:102:1: ( ( rule__RootType__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:102:1: ( ( rule__RootType__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:103:1: ( rule__RootType__Group__0 )
            {
             before(grammarAccess.getRootTypeAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:104:1: ( rule__RootType__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:104:2: rule__RootType__Group__0
            {
            pushFollow(FOLLOW_rule__RootType__Group__0_in_ruleRootType154);
            rule__RootType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootType"


    // $ANTLR start "entryRuleCustomAttributes"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:116:1: entryRuleCustomAttributes : ruleCustomAttributes EOF ;
    public final void entryRuleCustomAttributes() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:117:1: ( ruleCustomAttributes EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:118:1: ruleCustomAttributes EOF
            {
             before(grammarAccess.getCustomAttributesRule()); 
            pushFollow(FOLLOW_ruleCustomAttributes_in_entryRuleCustomAttributes181);
            ruleCustomAttributes();

            state._fsp--;

             after(grammarAccess.getCustomAttributesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomAttributes188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomAttributes"


    // $ANTLR start "ruleCustomAttributes"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:125:1: ruleCustomAttributes : ( ( rule__CustomAttributes__Group__0 ) ) ;
    public final void ruleCustomAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:129:2: ( ( ( rule__CustomAttributes__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:130:1: ( ( rule__CustomAttributes__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:130:1: ( ( rule__CustomAttributes__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:131:1: ( rule__CustomAttributes__Group__0 )
            {
             before(grammarAccess.getCustomAttributesAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:132:1: ( rule__CustomAttributes__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:132:2: rule__CustomAttributes__Group__0
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__0_in_ruleCustomAttributes214);
            rule__CustomAttributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomAttributes"


    // $ANTLR start "entryRuleFileIdentifier"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:144:1: entryRuleFileIdentifier : ruleFileIdentifier EOF ;
    public final void entryRuleFileIdentifier() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:145:1: ( ruleFileIdentifier EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:146:1: ruleFileIdentifier EOF
            {
             before(grammarAccess.getFileIdentifierRule()); 
            pushFollow(FOLLOW_ruleFileIdentifier_in_entryRuleFileIdentifier241);
            ruleFileIdentifier();

            state._fsp--;

             after(grammarAccess.getFileIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileIdentifier248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFileIdentifier"


    // $ANTLR start "ruleFileIdentifier"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:153:1: ruleFileIdentifier : ( ( rule__FileIdentifier__Group__0 ) ) ;
    public final void ruleFileIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:157:2: ( ( ( rule__FileIdentifier__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:158:1: ( ( rule__FileIdentifier__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:158:1: ( ( rule__FileIdentifier__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:159:1: ( rule__FileIdentifier__Group__0 )
            {
             before(grammarAccess.getFileIdentifierAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:160:1: ( rule__FileIdentifier__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:160:2: rule__FileIdentifier__Group__0
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__0_in_ruleFileIdentifier274);
            rule__FileIdentifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileIdentifier"


    // $ANTLR start "entryRuleNamespace"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:172:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:173:1: ( ruleNamespace EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:174:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace301);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:181:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:185:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:186:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:186:1: ( ( rule__Namespace__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:187:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:188:1: ( rule__Namespace__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:188:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace334);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleInclude"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:200:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:201:1: ( ruleInclude EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:202:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude361);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:209:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:213:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:214:1: ( ( rule__Include__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:214:1: ( ( rule__Include__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:215:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:216:1: ( rule__Include__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:216:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude394);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleTable"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:228:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:229:1: ( ruleTable EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:230:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable421);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:237:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:241:2: ( ( ( rule__Table__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:242:1: ( ( rule__Table__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:242:1: ( ( rule__Table__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:243:1: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:244:1: ( rule__Table__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:244:2: rule__Table__Group__0
            {
            pushFollow(FOLLOW_rule__Table__Group__0_in_ruleTable454);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleFields"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:256:1: entryRuleFields : ruleFields EOF ;
    public final void entryRuleFields() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:257:1: ( ruleFields EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:258:1: ruleFields EOF
            {
             before(grammarAccess.getFieldsRule()); 
            pushFollow(FOLLOW_ruleFields_in_entryRuleFields481);
            ruleFields();

            state._fsp--;

             after(grammarAccess.getFieldsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFields488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFields"


    // $ANTLR start "ruleFields"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:265:1: ruleFields : ( ( rule__Fields__Group__0 ) ) ;
    public final void ruleFields() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:269:2: ( ( ( rule__Fields__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:270:1: ( ( rule__Fields__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:270:1: ( ( rule__Fields__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:271:1: ( rule__Fields__Group__0 )
            {
             before(grammarAccess.getFieldsAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:272:1: ( rule__Fields__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:272:2: rule__Fields__Group__0
            {
            pushFollow(FOLLOW_rule__Fields__Group__0_in_ruleFields514);
            rule__Fields__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFields"


    // $ANTLR start "entryRuleValue"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:284:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:285:1: ( ruleValue EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:286:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue541);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:293:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:297:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:298:1: ( ( rule__Value__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:298:1: ( ( rule__Value__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:299:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:300:1: ( rule__Value__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:300:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue574);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFieldAttributes"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:312:1: entryRuleFieldAttributes : ruleFieldAttributes EOF ;
    public final void entryRuleFieldAttributes() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:313:1: ( ruleFieldAttributes EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:314:1: ruleFieldAttributes EOF
            {
             before(grammarAccess.getFieldAttributesRule()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_entryRuleFieldAttributes601);
            ruleFieldAttributes();

            state._fsp--;

             after(grammarAccess.getFieldAttributesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAttributes608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldAttributes"


    // $ANTLR start "ruleFieldAttributes"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:321:1: ruleFieldAttributes : ( ( rule__FieldAttributes__Group__0 ) ) ;
    public final void ruleFieldAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:325:2: ( ( ( rule__FieldAttributes__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:326:1: ( ( rule__FieldAttributes__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:326:1: ( ( rule__FieldAttributes__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:327:1: ( rule__FieldAttributes__Group__0 )
            {
             before(grammarAccess.getFieldAttributesAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:328:1: ( rule__FieldAttributes__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:328:2: rule__FieldAttributes__Group__0
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__0_in_ruleFieldAttributes634);
            rule__FieldAttributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldAttributes"


    // $ANTLR start "entryRuleAttributeName"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:340:1: entryRuleAttributeName : ruleAttributeName EOF ;
    public final void entryRuleAttributeName() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:341:1: ( ruleAttributeName EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:342:1: ruleAttributeName EOF
            {
             before(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName661);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getAttributeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:349:1: ruleAttributeName : ( ( rule__AttributeName__Alternatives ) ) ;
    public final void ruleAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:353:2: ( ( ( rule__AttributeName__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:354:1: ( ( rule__AttributeName__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:354:1: ( ( rule__AttributeName__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:355:1: ( rule__AttributeName__Alternatives )
            {
             before(grammarAccess.getAttributeNameAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:356:1: ( rule__AttributeName__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:356:2: rule__AttributeName__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeName__Alternatives_in_ruleAttributeName694);
            rule__AttributeName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:368:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:369:1: ( ruleType EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:370:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType721);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:377:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:381:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:382:1: ( ( rule__Type__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:382:1: ( ( rule__Type__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:383:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:384:1: ( rule__Type__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:384:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType754);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVector"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:396:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:397:1: ( ruleVector EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:398:1: ruleVector EOF
            {
             before(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector781);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getVectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:405:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:409:2: ( ( ( rule__Vector__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:410:1: ( ( rule__Vector__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:410:1: ( ( rule__Vector__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:411:1: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:412:1: ( rule__Vector__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:412:2: rule__Vector__Group__0
            {
            pushFollow(FOLLOW_rule__Vector__Group__0_in_ruleVector814);
            rule__Vector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRulePrimitive"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:424:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:425:1: ( rulePrimitive EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:426:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive841);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:433:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:437:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:438:1: ( ( rule__Primitive__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:438:1: ( ( rule__Primitive__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:439:1: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:440:1: ( rule__Primitive__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:440:2: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive874);
            rule__Primitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleTableType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:452:1: entryRuleTableType : ruleTableType EOF ;
    public final void entryRuleTableType() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:453:1: ( ruleTableType EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:454:1: ruleTableType EOF
            {
             before(grammarAccess.getTableTypeRule()); 
            pushFollow(FOLLOW_ruleTableType_in_entryRuleTableType901);
            ruleTableType();

            state._fsp--;

             after(grammarAccess.getTableTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableType908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableType"


    // $ANTLR start "ruleTableType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:461:1: ruleTableType : ( ( rule__TableType__TypeAssignment ) ) ;
    public final void ruleTableType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:465:2: ( ( ( rule__TableType__TypeAssignment ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:466:1: ( ( rule__TableType__TypeAssignment ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:466:1: ( ( rule__TableType__TypeAssignment ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:467:1: ( rule__TableType__TypeAssignment )
            {
             before(grammarAccess.getTableTypeAccess().getTypeAssignment()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:468:1: ( rule__TableType__TypeAssignment )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:468:2: rule__TableType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__TableType__TypeAssignment_in_ruleTableType934);
            rule__TableType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:480:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:481:1: ( ruleQualifiedName EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:482:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName961);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:489:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:493:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:494:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:494:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:495:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:496:1: ( rule__QualifiedName__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:496:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName994);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:508:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:509:1: ( ruleValidID EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:510:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1021);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:517:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:521:2: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:522:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:522:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:523:1: RULE_ID
            {
             before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID1054); 
             after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleNumber"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:536:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:540:1: ( ruleNumber EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:541:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1085);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1092); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:551:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:556:2: ( ( ( rule__Number__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:557:1: ( ( rule__Number__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:557:1: ( ( rule__Number__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:558:1: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:559:1: ( rule__Number__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:559:2: rule__Number__Group__0
            {
            pushFollow(FOLLOW_rule__Number__Group__0_in_ruleNumber1122);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Value__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:572:1: rule__Value__Alternatives : ( ( ruleNumber ) | ( 'false' ) | ( 'true' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:576:1: ( ( ruleNumber ) | ( 'false' ) | ( 'true' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:577:1: ( ruleNumber )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:577:1: ( ruleNumber )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:578:1: ruleNumber
                    {
                     before(grammarAccess.getValueAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Value__Alternatives1158);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:583:6: ( 'false' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:583:6: ( 'false' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:584:1: 'false'
                    {
                     before(grammarAccess.getValueAccess().getFalseKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__Value__Alternatives1176); 
                     after(grammarAccess.getValueAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:591:6: ( 'true' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:591:6: ( 'true' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:592:1: 'true'
                    {
                     before(grammarAccess.getValueAccess().getTrueKeyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__Value__Alternatives1196); 
                     after(grammarAccess.getValueAccess().getTrueKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__AttributeName__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:604:1: rule__AttributeName__Alternatives : ( ( ( rule__AttributeName__DeprectatedAssignment_0 ) ) | ( ( rule__AttributeName__CustomNameAssignment_1 ) ) );
    public final void rule__AttributeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:608:1: ( ( ( rule__AttributeName__DeprectatedAssignment_0 ) ) | ( ( rule__AttributeName__CustomNameAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:609:1: ( ( rule__AttributeName__DeprectatedAssignment_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:609:1: ( ( rule__AttributeName__DeprectatedAssignment_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:610:1: ( rule__AttributeName__DeprectatedAssignment_0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getDeprectatedAssignment_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:611:1: ( rule__AttributeName__DeprectatedAssignment_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:611:2: rule__AttributeName__DeprectatedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__DeprectatedAssignment_0_in_rule__AttributeName__Alternatives1230);
                    rule__AttributeName__DeprectatedAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getDeprectatedAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:615:6: ( ( rule__AttributeName__CustomNameAssignment_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:615:6: ( ( rule__AttributeName__CustomNameAssignment_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:616:1: ( rule__AttributeName__CustomNameAssignment_1 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getCustomNameAssignment_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:617:1: ( rule__AttributeName__CustomNameAssignment_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:617:2: rule__AttributeName__CustomNameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AttributeName__CustomNameAssignment_1_in_rule__AttributeName__Alternatives1248);
                    rule__AttributeName__CustomNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getCustomNameAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:626:1: rule__Type__Alternatives : ( ( ( rule__Type__PrimTypeAssignment_0 ) ) | ( ( rule__Type__VectorTypeAssignment_1 ) ) | ( ( rule__Type__TableTypeAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:630:1: ( ( ( rule__Type__PrimTypeAssignment_0 ) ) | ( ( rule__Type__VectorTypeAssignment_1 ) ) | ( ( rule__Type__TableTypeAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:631:1: ( ( rule__Type__PrimTypeAssignment_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:631:1: ( ( rule__Type__PrimTypeAssignment_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:632:1: ( rule__Type__PrimTypeAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getPrimTypeAssignment_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:633:1: ( rule__Type__PrimTypeAssignment_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:633:2: rule__Type__PrimTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__PrimTypeAssignment_0_in_rule__Type__Alternatives1281);
                    rule__Type__PrimTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getPrimTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:637:6: ( ( rule__Type__VectorTypeAssignment_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:637:6: ( ( rule__Type__VectorTypeAssignment_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:638:1: ( rule__Type__VectorTypeAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getVectorTypeAssignment_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:639:1: ( rule__Type__VectorTypeAssignment_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:639:2: rule__Type__VectorTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__VectorTypeAssignment_1_in_rule__Type__Alternatives1299);
                    rule__Type__VectorTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getVectorTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:643:6: ( ( rule__Type__TableTypeAssignment_2 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:643:6: ( ( rule__Type__TableTypeAssignment_2 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:644:1: ( rule__Type__TableTypeAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getTableTypeAssignment_2()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:645:1: ( rule__Type__TableTypeAssignment_2 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:645:2: rule__Type__TableTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__TableTypeAssignment_2_in_rule__Type__Alternatives1317);
                    rule__Type__TableTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTableTypeAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Vector__Alternatives_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:654:1: rule__Vector__Alternatives_1 : ( ( ( rule__Vector__PrimTypeAssignment_1_0 ) ) | ( ( rule__Vector__TableTypeAssignment_1_1 ) ) );
    public final void rule__Vector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:658:1: ( ( ( rule__Vector__PrimTypeAssignment_1_0 ) ) | ( ( rule__Vector__TableTypeAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=24)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:659:1: ( ( rule__Vector__PrimTypeAssignment_1_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:659:1: ( ( rule__Vector__PrimTypeAssignment_1_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:660:1: ( rule__Vector__PrimTypeAssignment_1_0 )
                    {
                     before(grammarAccess.getVectorAccess().getPrimTypeAssignment_1_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:661:1: ( rule__Vector__PrimTypeAssignment_1_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:661:2: rule__Vector__PrimTypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Vector__PrimTypeAssignment_1_0_in_rule__Vector__Alternatives_11350);
                    rule__Vector__PrimTypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVectorAccess().getPrimTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:665:6: ( ( rule__Vector__TableTypeAssignment_1_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:665:6: ( ( rule__Vector__TableTypeAssignment_1_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:666:1: ( rule__Vector__TableTypeAssignment_1_1 )
                    {
                     before(grammarAccess.getVectorAccess().getTableTypeAssignment_1_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:667:1: ( rule__Vector__TableTypeAssignment_1_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:667:2: rule__Vector__TableTypeAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Vector__TableTypeAssignment_1_1_in_rule__Vector__Alternatives_11368);
                    rule__Vector__TableTypeAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVectorAccess().getTableTypeAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Alternatives_1"


    // $ANTLR start "rule__Primitive__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:676:1: rule__Primitive__Alternatives : ( ( 'bool' ) | ( 'byte' ) | ( 'ubyte' ) | ( 'short' ) | ( 'ushort' ) | ( 'int' ) | ( 'uint' ) | ( 'float' ) | ( 'long' ) | ( 'ulong' ) | ( 'double' ) | ( 'string' ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:680:1: ( ( 'bool' ) | ( 'byte' ) | ( 'ubyte' ) | ( 'short' ) | ( 'ushort' ) | ( 'int' ) | ( 'uint' ) | ( 'float' ) | ( 'long' ) | ( 'ulong' ) | ( 'double' ) | ( 'string' ) )
            int alt5=12;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
                {
                alt5=6;
                }
                break;
            case 19:
                {
                alt5=7;
                }
                break;
            case 20:
                {
                alt5=8;
                }
                break;
            case 21:
                {
                alt5=9;
                }
                break;
            case 22:
                {
                alt5=10;
                }
                break;
            case 23:
                {
                alt5=11;
                }
                break;
            case 24:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:681:1: ( 'bool' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:681:1: ( 'bool' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:682:1: 'bool'
                    {
                     before(grammarAccess.getPrimitiveAccess().getBoolKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Primitive__Alternatives1402); 
                     after(grammarAccess.getPrimitiveAccess().getBoolKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:689:6: ( 'byte' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:689:6: ( 'byte' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:690:1: 'byte'
                    {
                     before(grammarAccess.getPrimitiveAccess().getByteKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Primitive__Alternatives1422); 
                     after(grammarAccess.getPrimitiveAccess().getByteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:697:6: ( 'ubyte' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:697:6: ( 'ubyte' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:698:1: 'ubyte'
                    {
                     before(grammarAccess.getPrimitiveAccess().getUbyteKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__Primitive__Alternatives1442); 
                     after(grammarAccess.getPrimitiveAccess().getUbyteKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:705:6: ( 'short' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:705:6: ( 'short' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:706:1: 'short'
                    {
                     before(grammarAccess.getPrimitiveAccess().getShortKeyword_3()); 
                    match(input,16,FOLLOW_16_in_rule__Primitive__Alternatives1462); 
                     after(grammarAccess.getPrimitiveAccess().getShortKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:713:6: ( 'ushort' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:713:6: ( 'ushort' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:714:1: 'ushort'
                    {
                     before(grammarAccess.getPrimitiveAccess().getUshortKeyword_4()); 
                    match(input,17,FOLLOW_17_in_rule__Primitive__Alternatives1482); 
                     after(grammarAccess.getPrimitiveAccess().getUshortKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:721:6: ( 'int' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:721:6: ( 'int' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:722:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveAccess().getIntKeyword_5()); 
                    match(input,18,FOLLOW_18_in_rule__Primitive__Alternatives1502); 
                     after(grammarAccess.getPrimitiveAccess().getIntKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:729:6: ( 'uint' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:729:6: ( 'uint' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:730:1: 'uint'
                    {
                     before(grammarAccess.getPrimitiveAccess().getUintKeyword_6()); 
                    match(input,19,FOLLOW_19_in_rule__Primitive__Alternatives1522); 
                     after(grammarAccess.getPrimitiveAccess().getUintKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:737:6: ( 'float' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:737:6: ( 'float' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:738:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveAccess().getFloatKeyword_7()); 
                    match(input,20,FOLLOW_20_in_rule__Primitive__Alternatives1542); 
                     after(grammarAccess.getPrimitiveAccess().getFloatKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:745:6: ( 'long' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:745:6: ( 'long' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:746:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveAccess().getLongKeyword_8()); 
                    match(input,21,FOLLOW_21_in_rule__Primitive__Alternatives1562); 
                     after(grammarAccess.getPrimitiveAccess().getLongKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:753:6: ( 'ulong' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:753:6: ( 'ulong' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:754:1: 'ulong'
                    {
                     before(grammarAccess.getPrimitiveAccess().getUlongKeyword_9()); 
                    match(input,22,FOLLOW_22_in_rule__Primitive__Alternatives1582); 
                     after(grammarAccess.getPrimitiveAccess().getUlongKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:761:6: ( 'double' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:761:6: ( 'double' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:762:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveAccess().getDoubleKeyword_10()); 
                    match(input,23,FOLLOW_23_in_rule__Primitive__Alternatives1602); 
                     after(grammarAccess.getPrimitiveAccess().getDoubleKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:769:6: ( 'string' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:769:6: ( 'string' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:770:1: 'string'
                    {
                     before(grammarAccess.getPrimitiveAccess().getStringKeyword_11()); 
                    match(input,24,FOLLOW_24_in_rule__Primitive__Alternatives1622); 
                     after(grammarAccess.getPrimitiveAccess().getStringKeyword_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Alternatives"


    // $ANTLR start "rule__Schema__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:784:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:788:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:789:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__01654);
            rule__Schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__01657);
            rule__Schema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0"


    // $ANTLR start "rule__Schema__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:796:1: rule__Schema__Group__0__Impl : ( ( rule__Schema__IncludesAssignment_0 )* ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:800:1: ( ( ( rule__Schema__IncludesAssignment_0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:801:1: ( ( rule__Schema__IncludesAssignment_0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:801:1: ( ( rule__Schema__IncludesAssignment_0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:802:1: ( rule__Schema__IncludesAssignment_0 )*
            {
             before(grammarAccess.getSchemaAccess().getIncludesAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:803:1: ( rule__Schema__IncludesAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:803:2: rule__Schema__IncludesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Schema__IncludesAssignment_0_in_rule__Schema__Group__0__Impl1684);
            	    rule__Schema__IncludesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getIncludesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0__Impl"


    // $ANTLR start "rule__Schema__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:813:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:817:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:818:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__11715);
            rule__Schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__11718);
            rule__Schema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1"


    // $ANTLR start "rule__Schema__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:825:1: rule__Schema__Group__1__Impl : ( ( rule__Schema__NamepsaceAssignment_1 )? ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:829:1: ( ( ( rule__Schema__NamepsaceAssignment_1 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:830:1: ( ( rule__Schema__NamepsaceAssignment_1 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:830:1: ( ( rule__Schema__NamepsaceAssignment_1 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:831:1: ( rule__Schema__NamepsaceAssignment_1 )?
            {
             before(grammarAccess.getSchemaAccess().getNamepsaceAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:832:1: ( rule__Schema__NamepsaceAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:832:2: rule__Schema__NamepsaceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Schema__NamepsaceAssignment_1_in_rule__Schema__Group__1__Impl1745);
                    rule__Schema__NamepsaceAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getNamepsaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:842:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:846:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:847:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__21776);
            rule__Schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__3_in_rule__Schema__Group__21779);
            rule__Schema__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2"


    // $ANTLR start "rule__Schema__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:854:1: rule__Schema__Group__2__Impl : ( ( rule__Schema__FileIdentifierAssignment_2 )? ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:858:1: ( ( ( rule__Schema__FileIdentifierAssignment_2 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:859:1: ( ( rule__Schema__FileIdentifierAssignment_2 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:859:1: ( ( rule__Schema__FileIdentifierAssignment_2 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:860:1: ( rule__Schema__FileIdentifierAssignment_2 )?
            {
             before(grammarAccess.getSchemaAccess().getFileIdentifierAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:861:1: ( rule__Schema__FileIdentifierAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:861:2: rule__Schema__FileIdentifierAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Schema__FileIdentifierAssignment_2_in_rule__Schema__Group__2__Impl1806);
                    rule__Schema__FileIdentifierAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getFileIdentifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:871:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:875:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:876:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_rule__Schema__Group__3__Impl_in_rule__Schema__Group__31837);
            rule__Schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__4_in_rule__Schema__Group__31840);
            rule__Schema__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3"


    // $ANTLR start "rule__Schema__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:883:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__CustomAttributesAssignment_3 )* ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:887:1: ( ( ( rule__Schema__CustomAttributesAssignment_3 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:888:1: ( ( rule__Schema__CustomAttributesAssignment_3 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:888:1: ( ( rule__Schema__CustomAttributesAssignment_3 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:889:1: ( rule__Schema__CustomAttributesAssignment_3 )*
            {
             before(grammarAccess.getSchemaAccess().getCustomAttributesAssignment_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:890:1: ( rule__Schema__CustomAttributesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:890:2: rule__Schema__CustomAttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Schema__CustomAttributesAssignment_3_in_rule__Schema__Group__3__Impl1867);
            	    rule__Schema__CustomAttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getCustomAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3__Impl"


    // $ANTLR start "rule__Schema__Group__4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:900:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:904:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:905:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
            {
            pushFollow(FOLLOW_rule__Schema__Group__4__Impl_in_rule__Schema__Group__41898);
            rule__Schema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__5_in_rule__Schema__Group__41901);
            rule__Schema__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4"


    // $ANTLR start "rule__Schema__Group__4__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:912:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__TablesAssignment_4 )* ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:916:1: ( ( ( rule__Schema__TablesAssignment_4 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:917:1: ( ( rule__Schema__TablesAssignment_4 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:917:1: ( ( rule__Schema__TablesAssignment_4 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:918:1: ( rule__Schema__TablesAssignment_4 )*
            {
             before(grammarAccess.getSchemaAccess().getTablesAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:919:1: ( rule__Schema__TablesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:919:2: rule__Schema__TablesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Schema__TablesAssignment_4_in_rule__Schema__Group__4__Impl1928);
            	    rule__Schema__TablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getTablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4__Impl"


    // $ANTLR start "rule__Schema__Group__5"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:929:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:933:1: ( rule__Schema__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:934:2: rule__Schema__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Schema__Group__5__Impl_in_rule__Schema__Group__51959);
            rule__Schema__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__5"


    // $ANTLR start "rule__Schema__Group__5__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:940:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__RootTypeAssignment_5 ) ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:944:1: ( ( ( rule__Schema__RootTypeAssignment_5 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:945:1: ( ( rule__Schema__RootTypeAssignment_5 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:945:1: ( ( rule__Schema__RootTypeAssignment_5 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:946:1: ( rule__Schema__RootTypeAssignment_5 )
            {
             before(grammarAccess.getSchemaAccess().getRootTypeAssignment_5()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:947:1: ( rule__Schema__RootTypeAssignment_5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:947:2: rule__Schema__RootTypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Schema__RootTypeAssignment_5_in_rule__Schema__Group__5__Impl1986);
            rule__Schema__RootTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getRootTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__5__Impl"


    // $ANTLR start "rule__RootType__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:969:1: rule__RootType__Group__0 : rule__RootType__Group__0__Impl rule__RootType__Group__1 ;
    public final void rule__RootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:973:1: ( rule__RootType__Group__0__Impl rule__RootType__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:974:2: rule__RootType__Group__0__Impl rule__RootType__Group__1
            {
            pushFollow(FOLLOW_rule__RootType__Group__0__Impl_in_rule__RootType__Group__02028);
            rule__RootType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootType__Group__1_in_rule__RootType__Group__02031);
            rule__RootType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__0"


    // $ANTLR start "rule__RootType__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:981:1: rule__RootType__Group__0__Impl : ( 'root_type' ) ;
    public final void rule__RootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:985:1: ( ( 'root_type' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:986:1: ( 'root_type' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:986:1: ( 'root_type' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:987:1: 'root_type'
            {
             before(grammarAccess.getRootTypeAccess().getRoot_typeKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__RootType__Group__0__Impl2059); 
             after(grammarAccess.getRootTypeAccess().getRoot_typeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__0__Impl"


    // $ANTLR start "rule__RootType__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1000:1: rule__RootType__Group__1 : rule__RootType__Group__1__Impl rule__RootType__Group__2 ;
    public final void rule__RootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1004:1: ( rule__RootType__Group__1__Impl rule__RootType__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1005:2: rule__RootType__Group__1__Impl rule__RootType__Group__2
            {
            pushFollow(FOLLOW_rule__RootType__Group__1__Impl_in_rule__RootType__Group__12090);
            rule__RootType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootType__Group__2_in_rule__RootType__Group__12093);
            rule__RootType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__1"


    // $ANTLR start "rule__RootType__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1012:1: rule__RootType__Group__1__Impl : ( ( rule__RootType__TypeAssignment_1 ) ) ;
    public final void rule__RootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1016:1: ( ( ( rule__RootType__TypeAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1017:1: ( ( rule__RootType__TypeAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1017:1: ( ( rule__RootType__TypeAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1018:1: ( rule__RootType__TypeAssignment_1 )
            {
             before(grammarAccess.getRootTypeAccess().getTypeAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1019:1: ( rule__RootType__TypeAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1019:2: rule__RootType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__RootType__TypeAssignment_1_in_rule__RootType__Group__1__Impl2120);
            rule__RootType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__1__Impl"


    // $ANTLR start "rule__RootType__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1029:1: rule__RootType__Group__2 : rule__RootType__Group__2__Impl ;
    public final void rule__RootType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1033:1: ( rule__RootType__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1034:2: rule__RootType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RootType__Group__2__Impl_in_rule__RootType__Group__22150);
            rule__RootType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__2"


    // $ANTLR start "rule__RootType__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1040:1: rule__RootType__Group__2__Impl : ( ';' ) ;
    public final void rule__RootType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1044:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1045:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1045:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1046:1: ';'
            {
             before(grammarAccess.getRootTypeAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__RootType__Group__2__Impl2178); 
             after(grammarAccess.getRootTypeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__2__Impl"


    // $ANTLR start "rule__CustomAttributes__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1065:1: rule__CustomAttributes__Group__0 : rule__CustomAttributes__Group__0__Impl rule__CustomAttributes__Group__1 ;
    public final void rule__CustomAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1069:1: ( rule__CustomAttributes__Group__0__Impl rule__CustomAttributes__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1070:2: rule__CustomAttributes__Group__0__Impl rule__CustomAttributes__Group__1
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__0__Impl_in_rule__CustomAttributes__Group__02215);
            rule__CustomAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttributes__Group__1_in_rule__CustomAttributes__Group__02218);
            rule__CustomAttributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__0"


    // $ANTLR start "rule__CustomAttributes__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1077:1: rule__CustomAttributes__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__CustomAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1081:1: ( ( 'attribute' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1082:1: ( 'attribute' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1082:1: ( 'attribute' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1083:1: 'attribute'
            {
             before(grammarAccess.getCustomAttributesAccess().getAttributeKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__CustomAttributes__Group__0__Impl2246); 
             after(grammarAccess.getCustomAttributesAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__0__Impl"


    // $ANTLR start "rule__CustomAttributes__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1096:1: rule__CustomAttributes__Group__1 : rule__CustomAttributes__Group__1__Impl rule__CustomAttributes__Group__2 ;
    public final void rule__CustomAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1100:1: ( rule__CustomAttributes__Group__1__Impl rule__CustomAttributes__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1101:2: rule__CustomAttributes__Group__1__Impl rule__CustomAttributes__Group__2
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__1__Impl_in_rule__CustomAttributes__Group__12277);
            rule__CustomAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttributes__Group__2_in_rule__CustomAttributes__Group__12280);
            rule__CustomAttributes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__1"


    // $ANTLR start "rule__CustomAttributes__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1108:1: rule__CustomAttributes__Group__1__Impl : ( '\"' ) ;
    public final void rule__CustomAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1112:1: ( ( '\"' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1113:1: ( '\"' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1113:1: ( '\"' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1114:1: '\"'
            {
             before(grammarAccess.getCustomAttributesAccess().getQuotationMarkKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__CustomAttributes__Group__1__Impl2308); 
             after(grammarAccess.getCustomAttributesAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__1__Impl"


    // $ANTLR start "rule__CustomAttributes__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1127:1: rule__CustomAttributes__Group__2 : rule__CustomAttributes__Group__2__Impl rule__CustomAttributes__Group__3 ;
    public final void rule__CustomAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1131:1: ( rule__CustomAttributes__Group__2__Impl rule__CustomAttributes__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1132:2: rule__CustomAttributes__Group__2__Impl rule__CustomAttributes__Group__3
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__2__Impl_in_rule__CustomAttributes__Group__22339);
            rule__CustomAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttributes__Group__3_in_rule__CustomAttributes__Group__22342);
            rule__CustomAttributes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__2"


    // $ANTLR start "rule__CustomAttributes__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1139:1: rule__CustomAttributes__Group__2__Impl : ( ( rule__CustomAttributes__NameAssignment_2 ) ) ;
    public final void rule__CustomAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1143:1: ( ( ( rule__CustomAttributes__NameAssignment_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1144:1: ( ( rule__CustomAttributes__NameAssignment_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1144:1: ( ( rule__CustomAttributes__NameAssignment_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1145:1: ( rule__CustomAttributes__NameAssignment_2 )
            {
             before(grammarAccess.getCustomAttributesAccess().getNameAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1146:1: ( rule__CustomAttributes__NameAssignment_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1146:2: rule__CustomAttributes__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CustomAttributes__NameAssignment_2_in_rule__CustomAttributes__Group__2__Impl2369);
            rule__CustomAttributes__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributesAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__2__Impl"


    // $ANTLR start "rule__CustomAttributes__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1156:1: rule__CustomAttributes__Group__3 : rule__CustomAttributes__Group__3__Impl rule__CustomAttributes__Group__4 ;
    public final void rule__CustomAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1160:1: ( rule__CustomAttributes__Group__3__Impl rule__CustomAttributes__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1161:2: rule__CustomAttributes__Group__3__Impl rule__CustomAttributes__Group__4
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__3__Impl_in_rule__CustomAttributes__Group__32399);
            rule__CustomAttributes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttributes__Group__4_in_rule__CustomAttributes__Group__32402);
            rule__CustomAttributes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__3"


    // $ANTLR start "rule__CustomAttributes__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1168:1: rule__CustomAttributes__Group__3__Impl : ( '\"' ) ;
    public final void rule__CustomAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1172:1: ( ( '\"' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1173:1: ( '\"' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1173:1: ( '\"' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1174:1: '\"'
            {
             before(grammarAccess.getCustomAttributesAccess().getQuotationMarkKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__CustomAttributes__Group__3__Impl2430); 
             after(grammarAccess.getCustomAttributesAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__3__Impl"


    // $ANTLR start "rule__CustomAttributes__Group__4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1187:1: rule__CustomAttributes__Group__4 : rule__CustomAttributes__Group__4__Impl ;
    public final void rule__CustomAttributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1191:1: ( rule__CustomAttributes__Group__4__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1192:2: rule__CustomAttributes__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__4__Impl_in_rule__CustomAttributes__Group__42461);
            rule__CustomAttributes__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__4"


    // $ANTLR start "rule__CustomAttributes__Group__4__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1198:1: rule__CustomAttributes__Group__4__Impl : ( ';' ) ;
    public final void rule__CustomAttributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1202:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1203:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1203:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1204:1: ';'
            {
             before(grammarAccess.getCustomAttributesAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__CustomAttributes__Group__4__Impl2489); 
             after(grammarAccess.getCustomAttributesAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__Group__4__Impl"


    // $ANTLR start "rule__FileIdentifier__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1227:1: rule__FileIdentifier__Group__0 : rule__FileIdentifier__Group__0__Impl rule__FileIdentifier__Group__1 ;
    public final void rule__FileIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1231:1: ( rule__FileIdentifier__Group__0__Impl rule__FileIdentifier__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1232:2: rule__FileIdentifier__Group__0__Impl rule__FileIdentifier__Group__1
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__0__Impl_in_rule__FileIdentifier__Group__02530);
            rule__FileIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileIdentifier__Group__1_in_rule__FileIdentifier__Group__02533);
            rule__FileIdentifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileIdentifier__Group__0"


    // $ANTLR start "rule__FileIdentifier__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1239:1: rule__FileIdentifier__Group__0__Impl : ( 'file_identifier' ) ;
    public final void rule__FileIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1243:1: ( ( 'file_identifier' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1244:1: ( 'file_identifier' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1244:1: ( 'file_identifier' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1245:1: 'file_identifier'
            {
             before(grammarAccess.getFileIdentifierAccess().getFile_identifierKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__FileIdentifier__Group__0__Impl2561); 
             after(grammarAccess.getFileIdentifierAccess().getFile_identifierKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileIdentifier__Group__0__Impl"


    // $ANTLR start "rule__FileIdentifier__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1258:1: rule__FileIdentifier__Group__1 : rule__FileIdentifier__Group__1__Impl rule__FileIdentifier__Group__2 ;
    public final void rule__FileIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1262:1: ( rule__FileIdentifier__Group__1__Impl rule__FileIdentifier__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1263:2: rule__FileIdentifier__Group__1__Impl rule__FileIdentifier__Group__2
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__1__Impl_in_rule__FileIdentifier__Group__12592);
            rule__FileIdentifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileIdentifier__Group__2_in_rule__FileIdentifier__Group__12595);
            rule__FileIdentifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileIdentifier__Group__1"


    // $ANTLR start "rule__FileIdentifier__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1270:1: rule__FileIdentifier__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__FileIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1274:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1275:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1275:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1276:1: RULE_STRING
            {
             before(grammarAccess.getFileIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FileIdentifier__Group__1__Impl2622); 
             after(grammarAccess.getFileIdentifierAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileIdentifier__Group__1__Impl"


    // $ANTLR start "rule__FileIdentifier__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1287:1: rule__FileIdentifier__Group__2 : rule__FileIdentifier__Group__2__Impl ;
    public final void rule__FileIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1291:1: ( rule__FileIdentifier__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1292:2: rule__FileIdentifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__2__Impl_in_rule__FileIdentifier__Group__22651);
            rule__FileIdentifier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileIdentifier__Group__2"


    // $ANTLR start "rule__FileIdentifier__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1298:1: rule__FileIdentifier__Group__2__Impl : ( ';' ) ;
    public final void rule__FileIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1302:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1303:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1303:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1304:1: ';'
            {
             before(grammarAccess.getFileIdentifierAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__FileIdentifier__Group__2__Impl2679); 
             after(grammarAccess.getFileIdentifierAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileIdentifier__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1323:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1327:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1328:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__02716);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__02719);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1335:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1339:1: ( ( 'namespace' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1340:1: ( 'namespace' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1340:1: ( 'namespace' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1341:1: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Namespace__Group__0__Impl2747); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1354:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1358:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1359:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__12778);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__12781);
            rule__Namespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1366:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1370:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1371:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1371:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1372:1: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1373:1: ( rule__Namespace__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1373:2: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl2808);
            rule__Namespace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1383:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1387:1: ( rule__Namespace__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1388:2: rule__Namespace__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__22838);
            rule__Namespace__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1394:1: rule__Namespace__Group__2__Impl : ( ';' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1398:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1399:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1399:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1400:1: ';'
            {
             before(grammarAccess.getNamespaceAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Namespace__Group__2__Impl2866); 
             after(grammarAccess.getNamespaceAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1419:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1423:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1424:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__02903);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__02906);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1431:1: rule__Include__Group__0__Impl : ( 'include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1435:1: ( ( 'include' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1436:1: ( 'include' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1436:1: ( 'include' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1437:1: 'include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Include__Group__0__Impl2934); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1450:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1454:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1455:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12965);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12968);
            rule__Include__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1462:1: rule__Include__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1466:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1467:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1467:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1468:1: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__Group__1__Impl2995); 
             after(grammarAccess.getIncludeAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1479:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1483:1: ( rule__Include__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1484:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__23024);
            rule__Include__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1490:1: rule__Include__Group__2__Impl : ( ';' ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1494:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1495:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1495:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1496:1: ';'
            {
             before(grammarAccess.getIncludeAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Include__Group__2__Impl3052); 
             after(grammarAccess.getIncludeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1515:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1519:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1520:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03089);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03092);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1527:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1531:1: ( ( 'table' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1532:1: ( 'table' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1532:1: ( 'table' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1533:1: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Table__Group__0__Impl3120); 
             after(grammarAccess.getTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1546:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1550:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1551:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13151);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__2_in_rule__Table__Group__13154);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1558:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1562:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1563:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1563:1: ( ( rule__Table__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1564:1: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1565:1: ( rule__Table__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1565:2: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl3181);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1575:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1579:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1580:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__23211);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__3_in_rule__Table__Group__23214);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1587:1: rule__Table__Group__2__Impl : ( '{' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1591:1: ( ( '{' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1592:1: ( '{' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1592:1: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1593:1: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Table__Group__2__Impl3242); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1606:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1610:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1611:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__33273);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__4_in_rule__Table__Group__33276);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1618:1: rule__Table__Group__3__Impl : ( ( rule__Table__FieldsAssignment_3 )* ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1622:1: ( ( ( rule__Table__FieldsAssignment_3 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1623:1: ( ( rule__Table__FieldsAssignment_3 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1623:1: ( ( rule__Table__FieldsAssignment_3 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1624:1: ( rule__Table__FieldsAssignment_3 )*
            {
             before(grammarAccess.getTableAccess().getFieldsAssignment_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1625:1: ( rule__Table__FieldsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1625:2: rule__Table__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Table__FieldsAssignment_3_in_rule__Table__Group__3__Impl3303);
            	    rule__Table__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getFieldsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1635:1: rule__Table__Group__4 : rule__Table__Group__4__Impl ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1639:1: ( rule__Table__Group__4__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1640:2: rule__Table__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__43334);
            rule__Table__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1646:1: rule__Table__Group__4__Impl : ( '}' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1650:1: ( ( '}' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1651:1: ( '}' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1651:1: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1652:1: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__Table__Group__4__Impl3362); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Fields__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1675:1: rule__Fields__Group__0 : rule__Fields__Group__0__Impl rule__Fields__Group__1 ;
    public final void rule__Fields__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1679:1: ( rule__Fields__Group__0__Impl rule__Fields__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1680:2: rule__Fields__Group__0__Impl rule__Fields__Group__1
            {
            pushFollow(FOLLOW_rule__Fields__Group__0__Impl_in_rule__Fields__Group__03403);
            rule__Fields__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__1_in_rule__Fields__Group__03406);
            rule__Fields__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__0"


    // $ANTLR start "rule__Fields__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1687:1: rule__Fields__Group__0__Impl : ( ( rule__Fields__NameAssignment_0 ) ) ;
    public final void rule__Fields__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1691:1: ( ( ( rule__Fields__NameAssignment_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1692:1: ( ( rule__Fields__NameAssignment_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1692:1: ( ( rule__Fields__NameAssignment_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1693:1: ( rule__Fields__NameAssignment_0 )
            {
             before(grammarAccess.getFieldsAccess().getNameAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1694:1: ( rule__Fields__NameAssignment_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1694:2: rule__Fields__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fields__NameAssignment_0_in_rule__Fields__Group__0__Impl3433);
            rule__Fields__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__0__Impl"


    // $ANTLR start "rule__Fields__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1704:1: rule__Fields__Group__1 : rule__Fields__Group__1__Impl rule__Fields__Group__2 ;
    public final void rule__Fields__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1708:1: ( rule__Fields__Group__1__Impl rule__Fields__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1709:2: rule__Fields__Group__1__Impl rule__Fields__Group__2
            {
            pushFollow(FOLLOW_rule__Fields__Group__1__Impl_in_rule__Fields__Group__13463);
            rule__Fields__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__2_in_rule__Fields__Group__13466);
            rule__Fields__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__1"


    // $ANTLR start "rule__Fields__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1716:1: rule__Fields__Group__1__Impl : ( ':' ) ;
    public final void rule__Fields__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1720:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1721:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1721:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1722:1: ':'
            {
             before(grammarAccess.getFieldsAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Fields__Group__1__Impl3494); 
             after(grammarAccess.getFieldsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__1__Impl"


    // $ANTLR start "rule__Fields__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1735:1: rule__Fields__Group__2 : rule__Fields__Group__2__Impl rule__Fields__Group__3 ;
    public final void rule__Fields__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1739:1: ( rule__Fields__Group__2__Impl rule__Fields__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1740:2: rule__Fields__Group__2__Impl rule__Fields__Group__3
            {
            pushFollow(FOLLOW_rule__Fields__Group__2__Impl_in_rule__Fields__Group__23525);
            rule__Fields__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__3_in_rule__Fields__Group__23528);
            rule__Fields__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__2"


    // $ANTLR start "rule__Fields__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1747:1: rule__Fields__Group__2__Impl : ( ( rule__Fields__TypeAssignment_2 ) ) ;
    public final void rule__Fields__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1751:1: ( ( ( rule__Fields__TypeAssignment_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1752:1: ( ( rule__Fields__TypeAssignment_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1752:1: ( ( rule__Fields__TypeAssignment_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1753:1: ( rule__Fields__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldsAccess().getTypeAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1754:1: ( rule__Fields__TypeAssignment_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1754:2: rule__Fields__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Fields__TypeAssignment_2_in_rule__Fields__Group__2__Impl3555);
            rule__Fields__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldsAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__2__Impl"


    // $ANTLR start "rule__Fields__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1764:1: rule__Fields__Group__3 : rule__Fields__Group__3__Impl rule__Fields__Group__4 ;
    public final void rule__Fields__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1768:1: ( rule__Fields__Group__3__Impl rule__Fields__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1769:2: rule__Fields__Group__3__Impl rule__Fields__Group__4
            {
            pushFollow(FOLLOW_rule__Fields__Group__3__Impl_in_rule__Fields__Group__33585);
            rule__Fields__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__4_in_rule__Fields__Group__33588);
            rule__Fields__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__3"


    // $ANTLR start "rule__Fields__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1776:1: rule__Fields__Group__3__Impl : ( ( rule__Fields__Group_3__0 )? ) ;
    public final void rule__Fields__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1780:1: ( ( ( rule__Fields__Group_3__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1781:1: ( ( rule__Fields__Group_3__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1781:1: ( ( rule__Fields__Group_3__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1782:1: ( rule__Fields__Group_3__0 )?
            {
             before(grammarAccess.getFieldsAccess().getGroup_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1783:1: ( rule__Fields__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1783:2: rule__Fields__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fields__Group_3__0_in_rule__Fields__Group__3__Impl3615);
                    rule__Fields__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__3__Impl"


    // $ANTLR start "rule__Fields__Group__4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1793:1: rule__Fields__Group__4 : rule__Fields__Group__4__Impl rule__Fields__Group__5 ;
    public final void rule__Fields__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1797:1: ( rule__Fields__Group__4__Impl rule__Fields__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1798:2: rule__Fields__Group__4__Impl rule__Fields__Group__5
            {
            pushFollow(FOLLOW_rule__Fields__Group__4__Impl_in_rule__Fields__Group__43646);
            rule__Fields__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__5_in_rule__Fields__Group__43649);
            rule__Fields__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__4"


    // $ANTLR start "rule__Fields__Group__4__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1805:1: rule__Fields__Group__4__Impl : ( ( rule__Fields__AttributesAssignment_4 )? ) ;
    public final void rule__Fields__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1809:1: ( ( ( rule__Fields__AttributesAssignment_4 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1810:1: ( ( rule__Fields__AttributesAssignment_4 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1810:1: ( ( rule__Fields__AttributesAssignment_4 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1811:1: ( rule__Fields__AttributesAssignment_4 )?
            {
             before(grammarAccess.getFieldsAccess().getAttributesAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1812:1: ( rule__Fields__AttributesAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1812:2: rule__Fields__AttributesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Fields__AttributesAssignment_4_in_rule__Fields__Group__4__Impl3676);
                    rule__Fields__AttributesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldsAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__4__Impl"


    // $ANTLR start "rule__Fields__Group__5"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1822:1: rule__Fields__Group__5 : rule__Fields__Group__5__Impl ;
    public final void rule__Fields__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1826:1: ( rule__Fields__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1827:2: rule__Fields__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Fields__Group__5__Impl_in_rule__Fields__Group__53707);
            rule__Fields__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__5"


    // $ANTLR start "rule__Fields__Group__5__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1833:1: rule__Fields__Group__5__Impl : ( ';' ) ;
    public final void rule__Fields__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1837:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1838:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1838:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1839:1: ';'
            {
             before(grammarAccess.getFieldsAccess().getSemicolonKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Fields__Group__5__Impl3735); 
             after(grammarAccess.getFieldsAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group__5__Impl"


    // $ANTLR start "rule__Fields__Group_3__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1864:1: rule__Fields__Group_3__0 : rule__Fields__Group_3__0__Impl rule__Fields__Group_3__1 ;
    public final void rule__Fields__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1868:1: ( rule__Fields__Group_3__0__Impl rule__Fields__Group_3__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1869:2: rule__Fields__Group_3__0__Impl rule__Fields__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fields__Group_3__0__Impl_in_rule__Fields__Group_3__03778);
            rule__Fields__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group_3__1_in_rule__Fields__Group_3__03781);
            rule__Fields__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group_3__0"


    // $ANTLR start "rule__Fields__Group_3__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1876:1: rule__Fields__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Fields__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1880:1: ( ( '=' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1881:1: ( '=' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1881:1: ( '=' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1882:1: '='
            {
             before(grammarAccess.getFieldsAccess().getEqualsSignKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__Fields__Group_3__0__Impl3809); 
             after(grammarAccess.getFieldsAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group_3__0__Impl"


    // $ANTLR start "rule__Fields__Group_3__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1895:1: rule__Fields__Group_3__1 : rule__Fields__Group_3__1__Impl ;
    public final void rule__Fields__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1899:1: ( rule__Fields__Group_3__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1900:2: rule__Fields__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fields__Group_3__1__Impl_in_rule__Fields__Group_3__13840);
            rule__Fields__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group_3__1"


    // $ANTLR start "rule__Fields__Group_3__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1906:1: rule__Fields__Group_3__1__Impl : ( ( rule__Fields__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__Fields__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1910:1: ( ( ( rule__Fields__DefaultValueAssignment_3_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1911:1: ( ( rule__Fields__DefaultValueAssignment_3_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1911:1: ( ( rule__Fields__DefaultValueAssignment_3_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1912:1: ( rule__Fields__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getFieldsAccess().getDefaultValueAssignment_3_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1913:1: ( rule__Fields__DefaultValueAssignment_3_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1913:2: rule__Fields__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fields__DefaultValueAssignment_3_1_in_rule__Fields__Group_3__1__Impl3867);
            rule__Fields__DefaultValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldsAccess().getDefaultValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__Group_3__1__Impl"


    // $ANTLR start "rule__FieldAttributes__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1927:1: rule__FieldAttributes__Group__0 : rule__FieldAttributes__Group__0__Impl rule__FieldAttributes__Group__1 ;
    public final void rule__FieldAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1931:1: ( rule__FieldAttributes__Group__0__Impl rule__FieldAttributes__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1932:2: rule__FieldAttributes__Group__0__Impl rule__FieldAttributes__Group__1
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__0__Impl_in_rule__FieldAttributes__Group__03901);
            rule__FieldAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group__1_in_rule__FieldAttributes__Group__03904);
            rule__FieldAttributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldAttributes__Group__0"


    // $ANTLR start "rule__FieldAttributes__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1939:1: rule__FieldAttributes__Group__0__Impl : ( ( rule__FieldAttributes__AttributeListAssignment_0 ) ) ;
    public final void rule__FieldAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1943:1: ( ( ( rule__FieldAttributes__AttributeListAssignment_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1944:1: ( ( rule__FieldAttributes__AttributeListAssignment_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1944:1: ( ( rule__FieldAttributes__AttributeListAssignment_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1945:1: ( rule__FieldAttributes__AttributeListAssignment_0 )
            {
             before(grammarAccess.getFieldAttributesAccess().getAttributeListAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1946:1: ( rule__FieldAttributes__AttributeListAssignment_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1946:2: rule__FieldAttributes__AttributeListAssignment_0
            {
            pushFollow(FOLLOW_rule__FieldAttributes__AttributeListAssignment_0_in_rule__FieldAttributes__Group__0__Impl3931);
            rule__FieldAttributes__AttributeListAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAttributesAccess().getAttributeListAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldAttributes__Group__0__Impl"


    // $ANTLR start "rule__FieldAttributes__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1956:1: rule__FieldAttributes__Group__1 : rule__FieldAttributes__Group__1__Impl rule__FieldAttributes__Group__2 ;
    public final void rule__FieldAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1960:1: ( rule__FieldAttributes__Group__1__Impl rule__FieldAttributes__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1961:2: rule__FieldAttributes__Group__1__Impl rule__FieldAttributes__Group__2
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__1__Impl_in_rule__FieldAttributes__Group__13961);
            rule__FieldAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group__2_in_rule__FieldAttributes__Group__13964);
            rule__FieldAttributes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldAttributes__Group__1"


    // $ANTLR start "rule__FieldAttributes__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1968:1: rule__FieldAttributes__Group__1__Impl : ( ( rule__FieldAttributes__AtributeNameAssignment_1 )* ) ;
    public final void rule__FieldAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1972:1: ( ( ( rule__FieldAttributes__AtributeNameAssignment_1 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1973:1: ( ( rule__FieldAttributes__AtributeNameAssignment_1 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1973:1: ( ( rule__FieldAttributes__AtributeNameAssignment_1 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1974:1: ( rule__FieldAttributes__AtributeNameAssignment_1 )*
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1975:1: ( rule__FieldAttributes__AtributeNameAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1975:2: rule__FieldAttributes__AtributeNameAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__FieldAttributes__AtributeNameAssignment_1_in_rule__FieldAttributes__Group__1__Impl3991);
            	    rule__FieldAttributes__AtributeNameAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFieldAttributesAccess().getAtributeNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldAttributes__Group__1__Impl"


    // $ANTLR start "rule__FieldAttributes__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1985:1: rule__FieldAttributes__Group__2 : rule__FieldAttributes__Group__2__Impl ;
    public final void rule__FieldAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1989:1: ( rule__FieldAttributes__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1990:2: rule__FieldAttributes__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__2__Impl_in_rule__FieldAttributes__Group__24022);
            rule__FieldAttributes__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldAttributes__Group__2"


    // $ANTLR start "rule__FieldAttributes__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1996:1: rule__FieldAttributes__Group__2__Impl : ( ')' ) ;
    public final void rule__FieldAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2000:1: ( ( ')' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2001:1: ( ')' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2001:1: ( ')' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2002:1: ')'
            {
             before(grammarAccess.getFieldAttributesAccess().getRightParenthesisKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__FieldAttributes__Group__2__Impl4050); 
             after(grammarAccess.getFieldAttributesAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldAttributes__Group__2__Impl"


    // $ANTLR start "rule__Vector__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2021:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2025:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2026:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
            {
            pushFollow(FOLLOW_rule__Vector__Group__0__Impl_in_rule__Vector__Group__04087);
            rule__Vector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__1_in_rule__Vector__Group__04090);
            rule__Vector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__0"


    // $ANTLR start "rule__Vector__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2033:1: rule__Vector__Group__0__Impl : ( '[' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2037:1: ( ( '[' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2038:1: ( '[' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2038:1: ( '[' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2039:1: '['
            {
             before(grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Vector__Group__0__Impl4118); 
             after(grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__0__Impl"


    // $ANTLR start "rule__Vector__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2052:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2056:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2057:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
            {
            pushFollow(FOLLOW_rule__Vector__Group__1__Impl_in_rule__Vector__Group__14149);
            rule__Vector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__2_in_rule__Vector__Group__14152);
            rule__Vector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__1"


    // $ANTLR start "rule__Vector__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2064:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__Alternatives_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2068:1: ( ( ( rule__Vector__Alternatives_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2069:1: ( ( rule__Vector__Alternatives_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2069:1: ( ( rule__Vector__Alternatives_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2070:1: ( rule__Vector__Alternatives_1 )
            {
             before(grammarAccess.getVectorAccess().getAlternatives_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2071:1: ( rule__Vector__Alternatives_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2071:2: rule__Vector__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Vector__Alternatives_1_in_rule__Vector__Group__1__Impl4179);
            rule__Vector__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__1__Impl"


    // $ANTLR start "rule__Vector__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2081:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2085:1: ( rule__Vector__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2086:2: rule__Vector__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Vector__Group__2__Impl_in_rule__Vector__Group__24209);
            rule__Vector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__2"


    // $ANTLR start "rule__Vector__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2092:1: rule__Vector__Group__2__Impl : ( ']' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2096:1: ( ( ']' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2097:1: ( ']' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2097:1: ( ']' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2098:1: ']'
            {
             before(grammarAccess.getVectorAccess().getRightSquareBracketKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__Vector__Group__2__Impl4237); 
             after(grammarAccess.getVectorAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2117:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2121:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2122:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04274);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04277);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2129:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2133:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2134:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2134:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2135:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4304);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2146:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2150:1: ( rule__QualifiedName__Group__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2151:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14333);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2157:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2161:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2162:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2162:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2163:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2164:1: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2164:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4360);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2178:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2182:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2183:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04395);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04398);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2190:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2194:1: ( ( '.' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2195:1: ( '.' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2195:1: ( '.' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2196:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__QualifiedName__Group_1__0__Impl4426); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2209:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2213:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2214:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14457);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2220:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2224:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2225:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2225:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2226:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4484);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2241:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2245:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2246:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__04517);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__1_in_rule__Number__Group__04520);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2253:1: rule__Number__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2257:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2258:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2258:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2259:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Group__0__Impl4547); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2270:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2274:1: ( rule__Number__Group__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2275:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__14576);
            rule__Number__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2281:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2285:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2286:1: ( ( rule__Number__Group_1__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2286:1: ( ( rule__Number__Group_1__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2287:1: ( rule__Number__Group_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2288:1: ( rule__Number__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2288:2: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1__0_in_rule__Number__Group__1__Impl4603);
                    rule__Number__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2302:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2306:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2307:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__04638);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__04641);
            rule__Number__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2314:1: rule__Number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2318:1: ( ( '.' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2319:1: ( '.' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2319:1: ( '.' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2320:1: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Number__Group_1__0__Impl4669); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2333:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2337:1: ( rule__Number__Group_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2338:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__14700);
            rule__Number__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2344:1: rule__Number__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2348:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2349:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2349:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2350:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Group_1__1__Impl4727); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__Schema__IncludesAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2366:1: rule__Schema__IncludesAssignment_0 : ( ruleInclude ) ;
    public final void rule__Schema__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2370:1: ( ( ruleInclude ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2371:1: ( ruleInclude )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2371:1: ( ruleInclude )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2372:1: ruleInclude
            {
             before(grammarAccess.getSchemaAccess().getIncludesIncludeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__Schema__IncludesAssignment_04765);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getIncludesIncludeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__IncludesAssignment_0"


    // $ANTLR start "rule__Schema__NamepsaceAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2381:1: rule__Schema__NamepsaceAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Schema__NamepsaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2385:1: ( ( ruleNamespace ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2386:1: ( ruleNamespace )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2386:1: ( ruleNamespace )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2387:1: ruleNamespace
            {
             before(grammarAccess.getSchemaAccess().getNamepsaceNamespaceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__Schema__NamepsaceAssignment_14796);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getNamepsaceNamespaceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__NamepsaceAssignment_1"


    // $ANTLR start "rule__Schema__FileIdentifierAssignment_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2396:1: rule__Schema__FileIdentifierAssignment_2 : ( ruleFileIdentifier ) ;
    public final void rule__Schema__FileIdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2400:1: ( ( ruleFileIdentifier ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2401:1: ( ruleFileIdentifier )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2401:1: ( ruleFileIdentifier )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2402:1: ruleFileIdentifier
            {
             before(grammarAccess.getSchemaAccess().getFileIdentifierFileIdentifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFileIdentifier_in_rule__Schema__FileIdentifierAssignment_24827);
            ruleFileIdentifier();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getFileIdentifierFileIdentifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__FileIdentifierAssignment_2"


    // $ANTLR start "rule__Schema__CustomAttributesAssignment_3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2411:1: rule__Schema__CustomAttributesAssignment_3 : ( ruleCustomAttributes ) ;
    public final void rule__Schema__CustomAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2415:1: ( ( ruleCustomAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2416:1: ( ruleCustomAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2416:1: ( ruleCustomAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2417:1: ruleCustomAttributes
            {
             before(grammarAccess.getSchemaAccess().getCustomAttributesCustomAttributesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCustomAttributes_in_rule__Schema__CustomAttributesAssignment_34858);
            ruleCustomAttributes();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getCustomAttributesCustomAttributesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__CustomAttributesAssignment_3"


    // $ANTLR start "rule__Schema__TablesAssignment_4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2426:1: rule__Schema__TablesAssignment_4 : ( ruleTable ) ;
    public final void rule__Schema__TablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2430:1: ( ( ruleTable ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2431:1: ( ruleTable )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2431:1: ( ruleTable )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2432:1: ruleTable
            {
             before(grammarAccess.getSchemaAccess().getTablesTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTable_in_rule__Schema__TablesAssignment_44889);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getTablesTableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__TablesAssignment_4"


    // $ANTLR start "rule__Schema__RootTypeAssignment_5"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2441:1: rule__Schema__RootTypeAssignment_5 : ( ruleRootType ) ;
    public final void rule__Schema__RootTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2445:1: ( ( ruleRootType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2446:1: ( ruleRootType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2446:1: ( ruleRootType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2447:1: ruleRootType
            {
             before(grammarAccess.getSchemaAccess().getRootTypeRootTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRootType_in_rule__Schema__RootTypeAssignment_54920);
            ruleRootType();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getRootTypeRootTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__RootTypeAssignment_5"


    // $ANTLR start "rule__RootType__TypeAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2456:1: rule__RootType__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RootType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2460:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2461:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2461:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2462:1: ( RULE_ID )
            {
             before(grammarAccess.getRootTypeAccess().getTypeTableCrossReference_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2463:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2464:1: RULE_ID
            {
             before(grammarAccess.getRootTypeAccess().getTypeTableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RootType__TypeAssignment_14955); 
             after(grammarAccess.getRootTypeAccess().getTypeTableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRootTypeAccess().getTypeTableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__TypeAssignment_1"


    // $ANTLR start "rule__CustomAttributes__NameAssignment_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2475:1: rule__CustomAttributes__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CustomAttributes__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2479:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2480:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2480:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2481:1: RULE_ID
            {
             before(grammarAccess.getCustomAttributesAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomAttributes__NameAssignment_24990); 
             after(grammarAccess.getCustomAttributesAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttributes__NameAssignment_2"


    // $ANTLR start "rule__Namespace__NameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2490:1: rule__Namespace__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2494:1: ( ( ruleQualifiedName ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2495:1: ( ruleQualifiedName )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2495:1: ( ruleQualifiedName )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2496:1: ruleQualifiedName
            {
             before(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Namespace__NameAssignment_15021);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__NameAssignment_1"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2505:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2509:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2510:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2510:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2511:1: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Table__NameAssignment_15052); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__FieldsAssignment_3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2520:1: rule__Table__FieldsAssignment_3 : ( ruleFields ) ;
    public final void rule__Table__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2524:1: ( ( ruleFields ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2525:1: ( ruleFields )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2525:1: ( ruleFields )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2526:1: ruleFields
            {
             before(grammarAccess.getTableAccess().getFieldsFieldsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFields_in_rule__Table__FieldsAssignment_35083);
            ruleFields();

            state._fsp--;

             after(grammarAccess.getTableAccess().getFieldsFieldsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__FieldsAssignment_3"


    // $ANTLR start "rule__Fields__NameAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2535:1: rule__Fields__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fields__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2539:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2540:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2540:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2541:1: RULE_ID
            {
             before(grammarAccess.getFieldsAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fields__NameAssignment_05114); 
             after(grammarAccess.getFieldsAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__NameAssignment_0"


    // $ANTLR start "rule__Fields__TypeAssignment_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2550:1: rule__Fields__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Fields__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2554:1: ( ( ruleType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2555:1: ( ruleType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2555:1: ( ruleType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2556:1: ruleType
            {
             before(grammarAccess.getFieldsAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Fields__TypeAssignment_25145);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFieldsAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__TypeAssignment_2"


    // $ANTLR start "rule__Fields__DefaultValueAssignment_3_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2565:1: rule__Fields__DefaultValueAssignment_3_1 : ( ruleValue ) ;
    public final void rule__Fields__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2569:1: ( ( ruleValue ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2570:1: ( ruleValue )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2570:1: ( ruleValue )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2571:1: ruleValue
            {
             before(grammarAccess.getFieldsAccess().getDefaultValueValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Fields__DefaultValueAssignment_3_15176);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFieldsAccess().getDefaultValueValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__DefaultValueAssignment_3_1"


    // $ANTLR start "rule__Fields__AttributesAssignment_4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2580:1: rule__Fields__AttributesAssignment_4 : ( ruleFieldAttributes ) ;
    public final void rule__Fields__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2584:1: ( ( ruleFieldAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2585:1: ( ruleFieldAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2585:1: ( ruleFieldAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2586:1: ruleFieldAttributes
            {
             before(grammarAccess.getFieldsAccess().getAttributesFieldAttributesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_rule__Fields__AttributesAssignment_45207);
            ruleFieldAttributes();

            state._fsp--;

             after(grammarAccess.getFieldsAccess().getAttributesFieldAttributesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fields__AttributesAssignment_4"


    // $ANTLR start "rule__FieldAttributes__AttributeListAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2595:1: rule__FieldAttributes__AttributeListAssignment_0 : ( ( '(' ) ) ;
    public final void rule__FieldAttributes__AttributeListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2599:1: ( ( ( '(' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2600:1: ( ( '(' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2600:1: ( ( '(' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2601:1: ( '(' )
            {
             before(grammarAccess.getFieldAttributesAccess().getAttributeListLeftParenthesisKeyword_0_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2602:1: ( '(' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2603:1: '('
            {
             before(grammarAccess.getFieldAttributesAccess().getAttributeListLeftParenthesisKeyword_0_0()); 
            match(input,41,FOLLOW_41_in_rule__FieldAttributes__AttributeListAssignment_05243); 
             after(grammarAccess.getFieldAttributesAccess().getAttributeListLeftParenthesisKeyword_0_0()); 

            }

             after(grammarAccess.getFieldAttributesAccess().getAttributeListLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldAttributes__AttributeListAssignment_0"


    // $ANTLR start "rule__FieldAttributes__AtributeNameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2618:1: rule__FieldAttributes__AtributeNameAssignment_1 : ( ruleAttributeName ) ;
    public final void rule__FieldAttributes__AtributeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2622:1: ( ( ruleAttributeName ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2623:1: ( ruleAttributeName )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2623:1: ( ruleAttributeName )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2624:1: ruleAttributeName
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNameAttributeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNameAssignment_15282);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getFieldAttributesAccess().getAtributeNameAttributeNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldAttributes__AtributeNameAssignment_1"


    // $ANTLR start "rule__AttributeName__DeprectatedAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2633:1: rule__AttributeName__DeprectatedAssignment_0 : ( ( 'deprecated' ) ) ;
    public final void rule__AttributeName__DeprectatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2637:1: ( ( ( 'deprecated' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2638:1: ( ( 'deprecated' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2638:1: ( ( 'deprecated' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2639:1: ( 'deprecated' )
            {
             before(grammarAccess.getAttributeNameAccess().getDeprectatedDeprecatedKeyword_0_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2640:1: ( 'deprecated' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2641:1: 'deprecated'
            {
             before(grammarAccess.getAttributeNameAccess().getDeprectatedDeprecatedKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__AttributeName__DeprectatedAssignment_05318); 
             after(grammarAccess.getAttributeNameAccess().getDeprectatedDeprecatedKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeNameAccess().getDeprectatedDeprecatedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__DeprectatedAssignment_0"


    // $ANTLR start "rule__AttributeName__CustomNameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2656:1: rule__AttributeName__CustomNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeName__CustomNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2660:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2661:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2661:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2662:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesCrossReference_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2663:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2664:1: RULE_ID
            {
             before(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeName__CustomNameAssignment_15361); 
             after(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__CustomNameAssignment_1"


    // $ANTLR start "rule__Type__PrimTypeAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2675:1: rule__Type__PrimTypeAssignment_0 : ( rulePrimitive ) ;
    public final void rule__Type__PrimTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2679:1: ( ( rulePrimitive ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2680:1: ( rulePrimitive )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2680:1: ( rulePrimitive )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2681:1: rulePrimitive
            {
             before(grammarAccess.getTypeAccess().getPrimTypePrimitiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Type__PrimTypeAssignment_05396);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getPrimTypePrimitiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__PrimTypeAssignment_0"


    // $ANTLR start "rule__Type__VectorTypeAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2690:1: rule__Type__VectorTypeAssignment_1 : ( ruleVector ) ;
    public final void rule__Type__VectorTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2694:1: ( ( ruleVector ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2695:1: ( ruleVector )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2695:1: ( ruleVector )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2696:1: ruleVector
            {
             before(grammarAccess.getTypeAccess().getVectorTypeVectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVector_in_rule__Type__VectorTypeAssignment_15427);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getVectorTypeVectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__VectorTypeAssignment_1"


    // $ANTLR start "rule__Type__TableTypeAssignment_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2705:1: rule__Type__TableTypeAssignment_2 : ( ruleTableType ) ;
    public final void rule__Type__TableTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2709:1: ( ( ruleTableType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2710:1: ( ruleTableType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2710:1: ( ruleTableType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2711:1: ruleTableType
            {
             before(grammarAccess.getTypeAccess().getTableTypeTableTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTableType_in_rule__Type__TableTypeAssignment_25458);
            ruleTableType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTableTypeTableTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TableTypeAssignment_2"


    // $ANTLR start "rule__Vector__PrimTypeAssignment_1_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2720:1: rule__Vector__PrimTypeAssignment_1_0 : ( rulePrimitive ) ;
    public final void rule__Vector__PrimTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2724:1: ( ( rulePrimitive ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2725:1: ( rulePrimitive )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2725:1: ( rulePrimitive )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2726:1: rulePrimitive
            {
             before(grammarAccess.getVectorAccess().getPrimTypePrimitiveParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Vector__PrimTypeAssignment_1_05489);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getPrimTypePrimitiveParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__PrimTypeAssignment_1_0"


    // $ANTLR start "rule__Vector__TableTypeAssignment_1_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2735:1: rule__Vector__TableTypeAssignment_1_1 : ( ruleTableType ) ;
    public final void rule__Vector__TableTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2739:1: ( ( ruleTableType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2740:1: ( ruleTableType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2740:1: ( ruleTableType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2741:1: ruleTableType
            {
             before(grammarAccess.getVectorAccess().getTableTypeTableTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTableType_in_rule__Vector__TableTypeAssignment_1_15520);
            ruleTableType();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getTableTypeTableTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__TableTypeAssignment_1_1"


    // $ANTLR start "rule__TableType__TypeAssignment"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2750:1: rule__TableType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TableType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2754:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2755:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2755:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2756:1: ( RULE_ID )
            {
             before(grammarAccess.getTableTypeAccess().getTypeTableCrossReference_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2757:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2758:1: RULE_ID
            {
             before(grammarAccess.getTableTypeAccess().getTypeTableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TableType__TypeAssignment5555); 
             after(grammarAccess.getTableTypeAccess().getTypeTableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTableTypeAccess().getTypeTableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableType__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSchema_in_entryRuleSchema61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchema68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__0_in_ruleSchema94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootType_in_entryRuleRootType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__0_in_ruleRootType154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributes_in_entryRuleCustomAttributes181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomAttributes188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__0_in_ruleCustomAttributes214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileIdentifier_in_entryRuleFileIdentifier241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileIdentifier248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__0_in_ruleFileIdentifier274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0_in_ruleTable454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFields_in_entryRuleFields481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFields488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__0_in_ruleFields514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_entryRuleFieldAttributes601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAttributes608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__0_in_ruleFieldAttributes634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Alternatives_in_ruleAttributeName694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__0_in_ruleVector814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableType_in_entryRuleTableType901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableType908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableType__TypeAssignment_in_ruleTableType934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0_in_ruleNumber1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Value__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Value__Alternatives1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Value__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__DeprectatedAssignment_0_in_rule__AttributeName__Alternatives1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__CustomNameAssignment_1_in_rule__AttributeName__Alternatives1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrimTypeAssignment_0_in_rule__Type__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__VectorTypeAssignment_1_in_rule__Type__Alternatives1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TableTypeAssignment_2_in_rule__Type__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__PrimTypeAssignment_1_0_in_rule__Vector__Alternatives_11350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__TableTypeAssignment_1_1_in_rule__Vector__Alternatives_11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Primitive__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Primitive__Alternatives1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Primitive__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Primitive__Alternatives1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Primitive__Alternatives1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Primitive__Alternatives1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Primitive__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Primitive__Alternatives1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Primitive__Alternatives1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Primitive__Alternatives1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Primitive__Alternatives1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Primitive__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__01654 = new BitSet(new long[]{0x000000016A000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__01657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__IncludesAssignment_0_in_rule__Schema__Group__0__Impl1684 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__11715 = new BitSet(new long[]{0x000000016A000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__NamepsaceAssignment_1_in_rule__Schema__Group__1__Impl1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__21776 = new BitSet(new long[]{0x000000016A000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__3_in_rule__Schema__Group__21779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__FileIdentifierAssignment_2_in_rule__Schema__Group__2__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__3__Impl_in_rule__Schema__Group__31837 = new BitSet(new long[]{0x000000016A000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__4_in_rule__Schema__Group__31840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__CustomAttributesAssignment_3_in_rule__Schema__Group__3__Impl1867 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__4__Impl_in_rule__Schema__Group__41898 = new BitSet(new long[]{0x000000016A000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__5_in_rule__Schema__Group__41901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__TablesAssignment_4_in_rule__Schema__Group__4__Impl1928 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__5__Impl_in_rule__Schema__Group__51959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__RootTypeAssignment_5_in_rule__Schema__Group__5__Impl1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__0__Impl_in_rule__RootType__Group__02028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootType__Group__1_in_rule__RootType__Group__02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RootType__Group__0__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__1__Impl_in_rule__RootType__Group__12090 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__RootType__Group__2_in_rule__RootType__Group__12093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__TypeAssignment_1_in_rule__RootType__Group__1__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__2__Impl_in_rule__RootType__Group__22150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RootType__Group__2__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__0__Impl_in_rule__CustomAttributes__Group__02215 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__1_in_rule__CustomAttributes__Group__02218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CustomAttributes__Group__0__Impl2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__1__Impl_in_rule__CustomAttributes__Group__12277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__2_in_rule__CustomAttributes__Group__12280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CustomAttributes__Group__1__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__2__Impl_in_rule__CustomAttributes__Group__22339 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__3_in_rule__CustomAttributes__Group__22342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__NameAssignment_2_in_rule__CustomAttributes__Group__2__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__3__Impl_in_rule__CustomAttributes__Group__32399 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__4_in_rule__CustomAttributes__Group__32402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CustomAttributes__Group__3__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__4__Impl_in_rule__CustomAttributes__Group__42461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CustomAttributes__Group__4__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__0__Impl_in_rule__FileIdentifier__Group__02530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__1_in_rule__FileIdentifier__Group__02533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FileIdentifier__Group__0__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__1__Impl_in_rule__FileIdentifier__Group__12592 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__2_in_rule__FileIdentifier__Group__12595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FileIdentifier__Group__1__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__2__Impl_in_rule__FileIdentifier__Group__22651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FileIdentifier__Group__2__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__02716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__02719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Namespace__Group__0__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__12778 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__12781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__22838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Namespace__Group__2__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__02903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__02906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Include__Group__0__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12965 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__Group__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__23024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Include__Group__2__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Table__Group__0__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13151 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__13154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__23211 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__Table__Group__3_in_rule__Table__Group__23214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Table__Group__2__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__33273 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__Table__Group__4_in_rule__Table__Group__33276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__FieldsAssignment_3_in_rule__Table__Group__3__Impl3303 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__43334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Table__Group__4__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__0__Impl_in_rule__Fields__Group__03403 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__1_in_rule__Fields__Group__03406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__NameAssignment_0_in_rule__Fields__Group__0__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__1__Impl_in_rule__Fields__Group__13463 = new BitSet(new long[]{0x0000004001FFE010L});
    public static final BitSet FOLLOW_rule__Fields__Group__2_in_rule__Fields__Group__13466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Fields__Group__1__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__2__Impl_in_rule__Fields__Group__23525 = new BitSet(new long[]{0x0000021004000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__3_in_rule__Fields__Group__23528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__TypeAssignment_2_in_rule__Fields__Group__2__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__3__Impl_in_rule__Fields__Group__33585 = new BitSet(new long[]{0x0000021004000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__4_in_rule__Fields__Group__33588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__0_in_rule__Fields__Group__3__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__4__Impl_in_rule__Fields__Group__43646 = new BitSet(new long[]{0x0000021004000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__5_in_rule__Fields__Group__43649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__AttributesAssignment_4_in_rule__Fields__Group__4__Impl3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__5__Impl_in_rule__Fields__Group__53707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Fields__Group__5__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__0__Impl_in_rule__Fields__Group_3__03778 = new BitSet(new long[]{0x0000000000001840L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__1_in_rule__Fields__Group_3__03781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Fields__Group_3__0__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__1__Impl_in_rule__Fields__Group_3__13840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__DefaultValueAssignment_3_1_in_rule__Fields__Group_3__1__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__0__Impl_in_rule__FieldAttributes__Group__03901 = new BitSet(new long[]{0x0000042000000010L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__1_in_rule__FieldAttributes__Group__03904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__AttributeListAssignment_0_in_rule__FieldAttributes__Group__0__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__1__Impl_in_rule__FieldAttributes__Group__13961 = new BitSet(new long[]{0x0000042000000010L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__2_in_rule__FieldAttributes__Group__13964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__AtributeNameAssignment_1_in_rule__FieldAttributes__Group__1__Impl3991 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__2__Impl_in_rule__FieldAttributes__Group__24022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FieldAttributes__Group__2__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__0__Impl_in_rule__Vector__Group__04087 = new BitSet(new long[]{0x0000004001FFE010L});
    public static final BitSet FOLLOW_rule__Vector__Group__1_in_rule__Vector__Group__04090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Vector__Group__0__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__1__Impl_in_rule__Vector__Group__14149 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Vector__Group__2_in_rule__Vector__Group__14152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Alternatives_1_in_rule__Vector__Group__1__Impl4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__2__Impl_in_rule__Vector__Group__24209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Vector__Group__2__Impl4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04274 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4360 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__QualifiedName__Group_1__0__Impl4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__04517 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Number__Group__1_in_rule__Number__Group__04520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Group__0__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__14576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0_in_rule__Number__Group__1__Impl4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__04638 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__04641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Number__Group_1__0__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__14700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Group_1__1__Impl4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Schema__IncludesAssignment_04765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__Schema__NamepsaceAssignment_14796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileIdentifier_in_rule__Schema__FileIdentifierAssignment_24827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributes_in_rule__Schema__CustomAttributesAssignment_34858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Schema__TablesAssignment_44889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootType_in_rule__Schema__RootTypeAssignment_54920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RootType__TypeAssignment_14955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomAttributes__NameAssignment_24990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Namespace__NameAssignment_15021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Table__NameAssignment_15052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFields_in_rule__Table__FieldsAssignment_35083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fields__NameAssignment_05114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Fields__TypeAssignment_25145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Fields__DefaultValueAssignment_3_15176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_rule__Fields__AttributesAssignment_45207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FieldAttributes__AttributeListAssignment_05243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNameAssignment_15282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AttributeName__DeprectatedAssignment_05318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeName__CustomNameAssignment_15361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Type__PrimTypeAssignment_05396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_rule__Type__VectorTypeAssignment_15427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableType_in_rule__Type__TableTypeAssignment_25458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Vector__PrimTypeAssignment_1_05489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableType_in_rule__Vector__TableTypeAssignment_1_15520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TableType__TypeAssignment5555 = new BitSet(new long[]{0x0000000000000002L});

}