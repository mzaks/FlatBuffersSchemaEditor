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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HASH_ATTRIBUTE", "RULE_ID_ATTRIBUTE", "RULE_REQUIRED_ATTRIBUTE", "RULE_KEY_ATTRIBUTE", "RULE_DEPRECTED_ATTRIBUTE", "RULE_ID", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bool'", "'float'", "'double'", "'string'", "'byte'", "'ubyte'", "'short'", "'ushort'", "'int'", "'uint'", "'long'", "'ulong'", "'root_type'", "';'", "'attribute'", "'file_identifier'", "'file_extension'", "'namespace'", "'include'", "'struct'", "'{'", "'}'", "':'", "'table'", "'='", "'('", "')'", "','", "'.'", "'['", "']'", "'enum'", "'union'", "'false'", "'true'", "'original_order'", "'force_align'", "'bit_flags'", "'nested_flatbuffer'"
    };
    public static final int RULE_HEX=10;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=9;
    public static final int RULE_DEPRECTED_ATTRIBUTE=8;
    public static final int RULE_DECIMAL=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_KEY_ATTRIBUTE=7;
    public static final int T__21=21;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_ID_ATTRIBUTE=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_HASH_ATTRIBUTE=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_REQUIRED_ATTRIBUTE=6;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleFileExtension"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:172:1: entryRuleFileExtension : ruleFileExtension EOF ;
    public final void entryRuleFileExtension() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:173:1: ( ruleFileExtension EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:174:1: ruleFileExtension EOF
            {
             before(grammarAccess.getFileExtensionRule()); 
            pushFollow(FOLLOW_ruleFileExtension_in_entryRuleFileExtension301);
            ruleFileExtension();

            state._fsp--;

             after(grammarAccess.getFileExtensionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileExtension308); 

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
    // $ANTLR end "entryRuleFileExtension"


    // $ANTLR start "ruleFileExtension"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:181:1: ruleFileExtension : ( ( rule__FileExtension__Group__0 ) ) ;
    public final void ruleFileExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:185:2: ( ( ( rule__FileExtension__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:186:1: ( ( rule__FileExtension__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:186:1: ( ( rule__FileExtension__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:187:1: ( rule__FileExtension__Group__0 )
            {
             before(grammarAccess.getFileExtensionAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:188:1: ( rule__FileExtension__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:188:2: rule__FileExtension__Group__0
            {
            pushFollow(FOLLOW_rule__FileExtension__Group__0_in_ruleFileExtension334);
            rule__FileExtension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileExtensionAccess().getGroup()); 

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
    // $ANTLR end "ruleFileExtension"


    // $ANTLR start "entryRuleNamespace"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:200:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:201:1: ( ruleNamespace EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:202:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace361);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace368); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:209:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:213:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:214:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:214:1: ( ( rule__Namespace__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:215:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:216:1: ( rule__Namespace__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:216:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace394);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:228:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:229:1: ( ruleInclude EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:230:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude421);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude428); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:237:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:241:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:242:1: ( ( rule__Include__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:242:1: ( ( rule__Include__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:243:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:244:1: ( rule__Include__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:244:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude454);
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


    // $ANTLR start "entryRuleDefinition"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:256:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:257:1: ( ruleDefinition EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:258:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition481);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition488); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:265:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:269:2: ( ( ( rule__Definition__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:270:1: ( ( rule__Definition__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:270:1: ( ( rule__Definition__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:271:1: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:272:1: ( rule__Definition__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:272:2: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_rule__Definition__Alternatives_in_ruleDefinition514);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleStruct"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:284:1: entryRuleStruct : ruleStruct EOF ;
    public final void entryRuleStruct() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:285:1: ( ruleStruct EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:286:1: ruleStruct EOF
            {
             before(grammarAccess.getStructRule()); 
            pushFollow(FOLLOW_ruleStruct_in_entryRuleStruct541);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getStructRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStruct548); 

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
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:293:1: ruleStruct : ( ( rule__Struct__Group__0 ) ) ;
    public final void ruleStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:297:2: ( ( ( rule__Struct__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:298:1: ( ( rule__Struct__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:298:1: ( ( rule__Struct__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:299:1: ( rule__Struct__Group__0 )
            {
             before(grammarAccess.getStructAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:300:1: ( rule__Struct__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:300:2: rule__Struct__Group__0
            {
            pushFollow(FOLLOW_rule__Struct__Group__0_in_ruleStruct574);
            rule__Struct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getGroup()); 

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
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleStructFields"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:312:1: entryRuleStructFields : ruleStructFields EOF ;
    public final void entryRuleStructFields() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:313:1: ( ruleStructFields EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:314:1: ruleStructFields EOF
            {
             before(grammarAccess.getStructFieldsRule()); 
            pushFollow(FOLLOW_ruleStructFields_in_entryRuleStructFields601);
            ruleStructFields();

            state._fsp--;

             after(grammarAccess.getStructFieldsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructFields608); 

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
    // $ANTLR end "entryRuleStructFields"


    // $ANTLR start "ruleStructFields"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:321:1: ruleStructFields : ( ( rule__StructFields__Group__0 ) ) ;
    public final void ruleStructFields() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:325:2: ( ( ( rule__StructFields__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:326:1: ( ( rule__StructFields__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:326:1: ( ( rule__StructFields__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:327:1: ( rule__StructFields__Group__0 )
            {
             before(grammarAccess.getStructFieldsAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:328:1: ( rule__StructFields__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:328:2: rule__StructFields__Group__0
            {
            pushFollow(FOLLOW_rule__StructFields__Group__0_in_ruleStructFields634);
            rule__StructFields__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldsAccess().getGroup()); 

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
    // $ANTLR end "ruleStructFields"


    // $ANTLR start "entryRuleTable"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:340:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:341:1: ( ruleTable EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:342:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable661);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable668); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:349:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:353:2: ( ( ( rule__Table__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:354:1: ( ( rule__Table__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:354:1: ( ( rule__Table__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:355:1: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:356:1: ( rule__Table__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:356:2: rule__Table__Group__0
            {
            pushFollow(FOLLOW_rule__Table__Group__0_in_ruleTable694);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:368:1: entryRuleFields : ruleFields EOF ;
    public final void entryRuleFields() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:369:1: ( ruleFields EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:370:1: ruleFields EOF
            {
             before(grammarAccess.getFieldsRule()); 
            pushFollow(FOLLOW_ruleFields_in_entryRuleFields721);
            ruleFields();

            state._fsp--;

             after(grammarAccess.getFieldsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFields728); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:377:1: ruleFields : ( ( rule__Fields__Group__0 ) ) ;
    public final void ruleFields() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:381:2: ( ( ( rule__Fields__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:382:1: ( ( rule__Fields__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:382:1: ( ( rule__Fields__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:383:1: ( rule__Fields__Group__0 )
            {
             before(grammarAccess.getFieldsAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:384:1: ( rule__Fields__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:384:2: rule__Fields__Group__0
            {
            pushFollow(FOLLOW_rule__Fields__Group__0_in_ruleFields754);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:396:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:397:1: ( ruleValue EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:398:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue781);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue788); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:405:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:409:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:410:1: ( ( rule__Value__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:410:1: ( ( rule__Value__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:411:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:412:1: ( rule__Value__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:412:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue814);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:424:1: entryRuleFieldAttributes : ruleFieldAttributes EOF ;
    public final void entryRuleFieldAttributes() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:425:1: ( ruleFieldAttributes EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:426:1: ruleFieldAttributes EOF
            {
             before(grammarAccess.getFieldAttributesRule()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_entryRuleFieldAttributes841);
            ruleFieldAttributes();

            state._fsp--;

             after(grammarAccess.getFieldAttributesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAttributes848); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:433:1: ruleFieldAttributes : ( ( rule__FieldAttributes__Group__0 ) ) ;
    public final void ruleFieldAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:437:2: ( ( ( rule__FieldAttributes__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:438:1: ( ( rule__FieldAttributes__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:438:1: ( ( rule__FieldAttributes__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:439:1: ( rule__FieldAttributes__Group__0 )
            {
             before(grammarAccess.getFieldAttributesAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:440:1: ( rule__FieldAttributes__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:440:2: rule__FieldAttributes__Group__0
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__0_in_ruleFieldAttributes874);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:452:1: entryRuleAttributeName : ruleAttributeName EOF ;
    public final void entryRuleAttributeName() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:453:1: ( ruleAttributeName EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:454:1: ruleAttributeName EOF
            {
             before(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName901);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getAttributeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName908); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:461:1: ruleAttributeName : ( ( rule__AttributeName__Alternatives ) ) ;
    public final void ruleAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:465:2: ( ( ( rule__AttributeName__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:466:1: ( ( rule__AttributeName__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:466:1: ( ( rule__AttributeName__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:467:1: ( rule__AttributeName__Alternatives )
            {
             before(grammarAccess.getAttributeNameAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:468:1: ( rule__AttributeName__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:468:2: rule__AttributeName__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeName__Alternatives_in_ruleAttributeName934);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:480:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:481:1: ( ruleType EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:482:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType961);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType968); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:489:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:493:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:494:1: ( ( rule__Type__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:494:1: ( ( rule__Type__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:495:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:496:1: ( rule__Type__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:496:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType994);
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


    // $ANTLR start "entryRuleQualifiedType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:508:1: entryRuleQualifiedType : ruleQualifiedType EOF ;
    public final void entryRuleQualifiedType() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:509:1: ( ruleQualifiedType EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:510:1: ruleQualifiedType EOF
            {
             before(grammarAccess.getQualifiedTypeRule()); 
            pushFollow(FOLLOW_ruleQualifiedType_in_entryRuleQualifiedType1021);
            ruleQualifiedType();

            state._fsp--;

             after(grammarAccess.getQualifiedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedType1028); 

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
    // $ANTLR end "entryRuleQualifiedType"


    // $ANTLR start "ruleQualifiedType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:517:1: ruleQualifiedType : ( ( rule__QualifiedType__Group__0 ) ) ;
    public final void ruleQualifiedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:521:2: ( ( ( rule__QualifiedType__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:522:1: ( ( rule__QualifiedType__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:522:1: ( ( rule__QualifiedType__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:523:1: ( rule__QualifiedType__Group__0 )
            {
             before(grammarAccess.getQualifiedTypeAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:524:1: ( rule__QualifiedType__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:524:2: rule__QualifiedType__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedType__Group__0_in_ruleQualifiedType1054);
            rule__QualifiedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedType"


    // $ANTLR start "entryRuleVector"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:536:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:540:1: ( ruleVector EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:541:1: ruleVector EOF
            {
             before(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector1086);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getVectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector1093); 

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
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:551:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:556:2: ( ( ( rule__Vector__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:557:1: ( ( rule__Vector__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:557:1: ( ( rule__Vector__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:558:1: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:559:1: ( rule__Vector__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:559:2: rule__Vector__Group__0
            {
            pushFollow(FOLLOW_rule__Vector__Group__0_in_ruleVector1123);
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRulePrimitiveWithoutString"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:572:1: entryRulePrimitiveWithoutString : rulePrimitiveWithoutString EOF ;
    public final void entryRulePrimitiveWithoutString() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:573:1: ( rulePrimitiveWithoutString EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:574:1: rulePrimitiveWithoutString EOF
            {
             before(grammarAccess.getPrimitiveWithoutStringRule()); 
            pushFollow(FOLLOW_rulePrimitiveWithoutString_in_entryRulePrimitiveWithoutString1150);
            rulePrimitiveWithoutString();

            state._fsp--;

             after(grammarAccess.getPrimitiveWithoutStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveWithoutString1157); 

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
    // $ANTLR end "entryRulePrimitiveWithoutString"


    // $ANTLR start "rulePrimitiveWithoutString"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:581:1: rulePrimitiveWithoutString : ( ( rule__PrimitiveWithoutString__Alternatives ) ) ;
    public final void rulePrimitiveWithoutString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:585:2: ( ( ( rule__PrimitiveWithoutString__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:586:1: ( ( rule__PrimitiveWithoutString__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:586:1: ( ( rule__PrimitiveWithoutString__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:587:1: ( rule__PrimitiveWithoutString__Alternatives )
            {
             before(grammarAccess.getPrimitiveWithoutStringAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:588:1: ( rule__PrimitiveWithoutString__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:588:2: rule__PrimitiveWithoutString__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveWithoutString__Alternatives_in_rulePrimitiveWithoutString1183);
            rule__PrimitiveWithoutString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveWithoutStringAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitiveWithoutString"


    // $ANTLR start "entryRulePrimitive"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:600:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:601:1: ( rulePrimitive EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:602:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive1210);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive1217); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:609:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:613:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:614:1: ( ( rule__Primitive__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:614:1: ( ( rule__Primitive__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:615:1: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:616:1: ( rule__Primitive__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:616:2: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive1243);
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


    // $ANTLR start "entryRuleEnum"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:628:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:629:1: ( ruleEnum EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:630:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1270);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1277); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:637:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:641:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:642:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:642:1: ( ( rule__Enum__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:643:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:644:1: ( rule__Enum__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:644:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum1303);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumCase"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:656:1: entryRuleEnumCase : ruleEnumCase EOF ;
    public final void entryRuleEnumCase() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:657:1: ( ruleEnumCase EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:658:1: ruleEnumCase EOF
            {
             before(grammarAccess.getEnumCaseRule()); 
            pushFollow(FOLLOW_ruleEnumCase_in_entryRuleEnumCase1330);
            ruleEnumCase();

            state._fsp--;

             after(grammarAccess.getEnumCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumCase1337); 

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
    // $ANTLR end "entryRuleEnumCase"


    // $ANTLR start "ruleEnumCase"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:665:1: ruleEnumCase : ( ( rule__EnumCase__Group__0 ) ) ;
    public final void ruleEnumCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:669:2: ( ( ( rule__EnumCase__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:670:1: ( ( rule__EnumCase__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:670:1: ( ( rule__EnumCase__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:671:1: ( rule__EnumCase__Group__0 )
            {
             before(grammarAccess.getEnumCaseAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:672:1: ( rule__EnumCase__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:672:2: rule__EnumCase__Group__0
            {
            pushFollow(FOLLOW_rule__EnumCase__Group__0_in_ruleEnumCase1363);
            rule__EnumCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumCaseAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumCase"


    // $ANTLR start "entryRuleUnion"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:684:1: entryRuleUnion : ruleUnion EOF ;
    public final void entryRuleUnion() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:685:1: ( ruleUnion EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:686:1: ruleUnion EOF
            {
             before(grammarAccess.getUnionRule()); 
            pushFollow(FOLLOW_ruleUnion_in_entryRuleUnion1390);
            ruleUnion();

            state._fsp--;

             after(grammarAccess.getUnionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnion1397); 

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
    // $ANTLR end "entryRuleUnion"


    // $ANTLR start "ruleUnion"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:693:1: ruleUnion : ( ( rule__Union__Group__0 ) ) ;
    public final void ruleUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:697:2: ( ( ( rule__Union__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:698:1: ( ( rule__Union__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:698:1: ( ( rule__Union__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:699:1: ( rule__Union__Group__0 )
            {
             before(grammarAccess.getUnionAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:700:1: ( rule__Union__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:700:2: rule__Union__Group__0
            {
            pushFollow(FOLLOW_rule__Union__Group__0_in_ruleUnion1423);
            rule__Union__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionAccess().getGroup()); 

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
    // $ANTLR end "ruleUnion"


    // $ANTLR start "entryRulePrimitiveNumberType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:712:1: entryRulePrimitiveNumberType : rulePrimitiveNumberType EOF ;
    public final void entryRulePrimitiveNumberType() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:713:1: ( rulePrimitiveNumberType EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:714:1: rulePrimitiveNumberType EOF
            {
             before(grammarAccess.getPrimitiveNumberTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveNumberType_in_entryRulePrimitiveNumberType1450);
            rulePrimitiveNumberType();

            state._fsp--;

             after(grammarAccess.getPrimitiveNumberTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveNumberType1457); 

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
    // $ANTLR end "entryRulePrimitiveNumberType"


    // $ANTLR start "rulePrimitiveNumberType"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:721:1: rulePrimitiveNumberType : ( ( rule__PrimitiveNumberType__Alternatives ) ) ;
    public final void rulePrimitiveNumberType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:725:2: ( ( ( rule__PrimitiveNumberType__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:726:1: ( ( rule__PrimitiveNumberType__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:726:1: ( ( rule__PrimitiveNumberType__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:727:1: ( rule__PrimitiveNumberType__Alternatives )
            {
             before(grammarAccess.getPrimitiveNumberTypeAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:728:1: ( rule__PrimitiveNumberType__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:728:2: rule__PrimitiveNumberType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveNumberType__Alternatives_in_rulePrimitiveNumberType1483);
            rule__PrimitiveNumberType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveNumberTypeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitiveNumberType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:740:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:741:1: ( ruleQualifiedName EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:742:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1510);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1517); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:749:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:753:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:754:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:754:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:755:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:756:1: ( rule__QualifiedName__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:756:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1543);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:768:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:769:1: ( ruleValidID EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:770:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1570);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1577); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:777:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:781:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:782:1: ( ( rule__ValidID__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:782:1: ( ( rule__ValidID__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:783:1: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:784:1: ( rule__ValidID__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:784:2: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1603);
            rule__ValidID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidIDAccess().getAlternatives()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:796:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:800:1: ( ruleNumber EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:801:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1635);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1642); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:811:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:816:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:817:1: ( ( rule__Number__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:817:1: ( ( rule__Number__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:818:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:819:1: ( rule__Number__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:819:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber1672);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

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


    // $ANTLR start "rule__Definition__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:832:1: rule__Definition__Alternatives : ( ( ruleTable ) | ( ruleStruct ) | ( ruleEnum ) | ( ruleUnion ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:836:1: ( ( ruleTable ) | ( ruleStruct ) | ( ruleEnum ) | ( ruleUnion ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 49:
                {
                alt1=3;
                }
                break;
            case 50:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:837:1: ( ruleTable )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:837:1: ( ruleTable )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:838:1: ruleTable
                    {
                     before(grammarAccess.getDefinitionAccess().getTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTable_in_rule__Definition__Alternatives1708);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:843:6: ( ruleStruct )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:843:6: ( ruleStruct )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:844:1: ruleStruct
                    {
                     before(grammarAccess.getDefinitionAccess().getStructParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStruct_in_rule__Definition__Alternatives1725);
                    ruleStruct();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getStructParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:849:6: ( ruleEnum )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:849:6: ( ruleEnum )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:850:1: ruleEnum
                    {
                     before(grammarAccess.getDefinitionAccess().getEnumParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Definition__Alternatives1742);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getEnumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:855:6: ( ruleUnion )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:855:6: ( ruleUnion )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:856:1: ruleUnion
                    {
                     before(grammarAccess.getDefinitionAccess().getUnionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUnion_in_rule__Definition__Alternatives1759);
                    ruleUnion();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getUnionParserRuleCall_3()); 

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
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__StructFields__Alternatives_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:866:1: rule__StructFields__Alternatives_2 : ( ( ( rule__StructFields__PrimTypeAssignment_2_0 ) ) | ( ( rule__StructFields__DefTypeAssignment_2_1 ) ) );
    public final void rule__StructFields__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:870:1: ( ( ( rule__StructFields__PrimTypeAssignment_2_0 ) ) | ( ( rule__StructFields__DefTypeAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=20)||(LA2_0>=22 && LA2_0<=29)) ) {
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:871:1: ( ( rule__StructFields__PrimTypeAssignment_2_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:871:1: ( ( rule__StructFields__PrimTypeAssignment_2_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:872:1: ( rule__StructFields__PrimTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getStructFieldsAccess().getPrimTypeAssignment_2_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:873:1: ( rule__StructFields__PrimTypeAssignment_2_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:873:2: rule__StructFields__PrimTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__StructFields__PrimTypeAssignment_2_0_in_rule__StructFields__Alternatives_21791);
                    rule__StructFields__PrimTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructFieldsAccess().getPrimTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:877:6: ( ( rule__StructFields__DefTypeAssignment_2_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:877:6: ( ( rule__StructFields__DefTypeAssignment_2_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:878:1: ( rule__StructFields__DefTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getStructFieldsAccess().getDefTypeAssignment_2_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:879:1: ( rule__StructFields__DefTypeAssignment_2_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:879:2: rule__StructFields__DefTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__StructFields__DefTypeAssignment_2_1_in_rule__StructFields__Alternatives_21809);
                    rule__StructFields__DefTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructFieldsAccess().getDefTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__StructFields__Alternatives_2"


    // $ANTLR start "rule__Value__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:888:1: rule__Value__Alternatives : ( ( ( rule__Value__NumberAssignment_0 ) ) | ( ( rule__Value__IsFalseAssignment_1 ) ) | ( ( rule__Value__IsTrueAssignment_2 ) ) | ( ( rule__Value__EnumCaseAssignment_3 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:892:1: ( ( ( rule__Value__NumberAssignment_0 ) ) | ( ( rule__Value__IsFalseAssignment_1 ) ) | ( ( rule__Value__IsTrueAssignment_2 ) ) | ( ( rule__Value__EnumCaseAssignment_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt3=1;
                }
                break;
            case 51:
                {
                alt3=2;
                }
                break;
            case 52:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:893:1: ( ( rule__Value__NumberAssignment_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:893:1: ( ( rule__Value__NumberAssignment_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:894:1: ( rule__Value__NumberAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getNumberAssignment_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:895:1: ( rule__Value__NumberAssignment_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:895:2: rule__Value__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Value__NumberAssignment_0_in_rule__Value__Alternatives1842);
                    rule__Value__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:899:6: ( ( rule__Value__IsFalseAssignment_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:899:6: ( ( rule__Value__IsFalseAssignment_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:900:1: ( rule__Value__IsFalseAssignment_1 )
                    {
                     before(grammarAccess.getValueAccess().getIsFalseAssignment_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:901:1: ( rule__Value__IsFalseAssignment_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:901:2: rule__Value__IsFalseAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Value__IsFalseAssignment_1_in_rule__Value__Alternatives1860);
                    rule__Value__IsFalseAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getIsFalseAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:905:6: ( ( rule__Value__IsTrueAssignment_2 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:905:6: ( ( rule__Value__IsTrueAssignment_2 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:906:1: ( rule__Value__IsTrueAssignment_2 )
                    {
                     before(grammarAccess.getValueAccess().getIsTrueAssignment_2()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:907:1: ( rule__Value__IsTrueAssignment_2 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:907:2: rule__Value__IsTrueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Value__IsTrueAssignment_2_in_rule__Value__Alternatives1878);
                    rule__Value__IsTrueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getIsTrueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:911:6: ( ( rule__Value__EnumCaseAssignment_3 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:911:6: ( ( rule__Value__EnumCaseAssignment_3 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:912:1: ( rule__Value__EnumCaseAssignment_3 )
                    {
                     before(grammarAccess.getValueAccess().getEnumCaseAssignment_3()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:913:1: ( rule__Value__EnumCaseAssignment_3 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:913:2: rule__Value__EnumCaseAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Value__EnumCaseAssignment_3_in_rule__Value__Alternatives1896);
                    rule__Value__EnumCaseAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getEnumCaseAssignment_3()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:922:1: rule__AttributeName__Alternatives : ( ( ( rule__AttributeName__DeprectatedAssignment_0 ) ) | ( ( rule__AttributeName__Group_1__0 ) ) | ( ( rule__AttributeName__RequiredAssignment_2 ) ) | ( ( rule__AttributeName__Original_orderAssignment_3 ) ) | ( ( rule__AttributeName__Group_4__0 ) ) | ( ( rule__AttributeName__Group_5__0 ) ) | ( ( rule__AttributeName__Bit_flagsAssignment_6 ) ) | ( ( rule__AttributeName__Group_7__0 ) ) | ( ( rule__AttributeName__KeyAssignment_8 ) ) | ( ( rule__AttributeName__Group_9__0 ) ) );
    public final void rule__AttributeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:926:1: ( ( ( rule__AttributeName__DeprectatedAssignment_0 ) ) | ( ( rule__AttributeName__Group_1__0 ) ) | ( ( rule__AttributeName__RequiredAssignment_2 ) ) | ( ( rule__AttributeName__Original_orderAssignment_3 ) ) | ( ( rule__AttributeName__Group_4__0 ) ) | ( ( rule__AttributeName__Group_5__0 ) ) | ( ( rule__AttributeName__Bit_flagsAssignment_6 ) ) | ( ( rule__AttributeName__Group_7__0 ) ) | ( ( rule__AttributeName__KeyAssignment_8 ) ) | ( ( rule__AttributeName__Group_9__0 ) ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case RULE_DEPRECTED_ATTRIBUTE:
                {
                alt4=1;
                }
                break;
            case RULE_ID_ATTRIBUTE:
                {
                alt4=2;
                }
                break;
            case RULE_REQUIRED_ATTRIBUTE:
                {
                alt4=3;
                }
                break;
            case 53:
                {
                alt4=4;
                }
                break;
            case 54:
                {
                alt4=5;
                }
                break;
            case RULE_HASH_ATTRIBUTE:
                {
                alt4=6;
                }
                break;
            case 55:
                {
                alt4=7;
                }
                break;
            case 56:
                {
                alt4=8;
                }
                break;
            case RULE_KEY_ATTRIBUTE:
                {
                alt4=9;
                }
                break;
            case RULE_ID:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:927:1: ( ( rule__AttributeName__DeprectatedAssignment_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:927:1: ( ( rule__AttributeName__DeprectatedAssignment_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:928:1: ( rule__AttributeName__DeprectatedAssignment_0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getDeprectatedAssignment_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:929:1: ( rule__AttributeName__DeprectatedAssignment_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:929:2: rule__AttributeName__DeprectatedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__DeprectatedAssignment_0_in_rule__AttributeName__Alternatives1929);
                    rule__AttributeName__DeprectatedAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getDeprectatedAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:933:6: ( ( rule__AttributeName__Group_1__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:933:6: ( ( rule__AttributeName__Group_1__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:934:1: ( rule__AttributeName__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:935:1: ( rule__AttributeName__Group_1__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:935:2: rule__AttributeName__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Alternatives1947);
                    rule__AttributeName__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:939:6: ( ( rule__AttributeName__RequiredAssignment_2 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:939:6: ( ( rule__AttributeName__RequiredAssignment_2 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:940:1: ( rule__AttributeName__RequiredAssignment_2 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getRequiredAssignment_2()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:941:1: ( rule__AttributeName__RequiredAssignment_2 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:941:2: rule__AttributeName__RequiredAssignment_2
                    {
                    pushFollow(FOLLOW_rule__AttributeName__RequiredAssignment_2_in_rule__AttributeName__Alternatives1965);
                    rule__AttributeName__RequiredAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getRequiredAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:945:6: ( ( rule__AttributeName__Original_orderAssignment_3 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:945:6: ( ( rule__AttributeName__Original_orderAssignment_3 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:946:1: ( rule__AttributeName__Original_orderAssignment_3 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getOriginal_orderAssignment_3()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:947:1: ( rule__AttributeName__Original_orderAssignment_3 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:947:2: rule__AttributeName__Original_orderAssignment_3
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Original_orderAssignment_3_in_rule__AttributeName__Alternatives1983);
                    rule__AttributeName__Original_orderAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getOriginal_orderAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:951:6: ( ( rule__AttributeName__Group_4__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:951:6: ( ( rule__AttributeName__Group_4__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:952:1: ( rule__AttributeName__Group_4__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_4()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:953:1: ( rule__AttributeName__Group_4__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:953:2: rule__AttributeName__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_4__0_in_rule__AttributeName__Alternatives2001);
                    rule__AttributeName__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:957:6: ( ( rule__AttributeName__Group_5__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:957:6: ( ( rule__AttributeName__Group_5__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:958:1: ( rule__AttributeName__Group_5__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_5()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:959:1: ( rule__AttributeName__Group_5__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:959:2: rule__AttributeName__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_5__0_in_rule__AttributeName__Alternatives2019);
                    rule__AttributeName__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:963:6: ( ( rule__AttributeName__Bit_flagsAssignment_6 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:963:6: ( ( rule__AttributeName__Bit_flagsAssignment_6 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:964:1: ( rule__AttributeName__Bit_flagsAssignment_6 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getBit_flagsAssignment_6()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:965:1: ( rule__AttributeName__Bit_flagsAssignment_6 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:965:2: rule__AttributeName__Bit_flagsAssignment_6
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Bit_flagsAssignment_6_in_rule__AttributeName__Alternatives2037);
                    rule__AttributeName__Bit_flagsAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getBit_flagsAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:969:6: ( ( rule__AttributeName__Group_7__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:969:6: ( ( rule__AttributeName__Group_7__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:970:1: ( rule__AttributeName__Group_7__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_7()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:971:1: ( rule__AttributeName__Group_7__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:971:2: rule__AttributeName__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_7__0_in_rule__AttributeName__Alternatives2055);
                    rule__AttributeName__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:975:6: ( ( rule__AttributeName__KeyAssignment_8 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:975:6: ( ( rule__AttributeName__KeyAssignment_8 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:976:1: ( rule__AttributeName__KeyAssignment_8 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getKeyAssignment_8()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:977:1: ( rule__AttributeName__KeyAssignment_8 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:977:2: rule__AttributeName__KeyAssignment_8
                    {
                    pushFollow(FOLLOW_rule__AttributeName__KeyAssignment_8_in_rule__AttributeName__Alternatives2073);
                    rule__AttributeName__KeyAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getKeyAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:981:6: ( ( rule__AttributeName__Group_9__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:981:6: ( ( rule__AttributeName__Group_9__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:982:1: ( rule__AttributeName__Group_9__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_9()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:983:1: ( rule__AttributeName__Group_9__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:983:2: rule__AttributeName__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_9__0_in_rule__AttributeName__Alternatives2091);
                    rule__AttributeName__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getGroup_9()); 

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


    // $ANTLR start "rule__AttributeName__Alternatives_9_1_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:992:1: rule__AttributeName__Alternatives_9_1_1 : ( ( ( rule__AttributeName__IntValueAssignment_9_1_1_0 ) ) | ( ( rule__AttributeName__StringValueAssignment_9_1_1_1 ) ) );
    public final void rule__AttributeName__Alternatives_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:996:1: ( ( ( rule__AttributeName__IntValueAssignment_9_1_1_0 ) ) | ( ( rule__AttributeName__StringValueAssignment_9_1_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:997:1: ( ( rule__AttributeName__IntValueAssignment_9_1_1_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:997:1: ( ( rule__AttributeName__IntValueAssignment_9_1_1_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:998:1: ( rule__AttributeName__IntValueAssignment_9_1_1_0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getIntValueAssignment_9_1_1_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:999:1: ( rule__AttributeName__IntValueAssignment_9_1_1_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:999:2: rule__AttributeName__IntValueAssignment_9_1_1_0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__IntValueAssignment_9_1_1_0_in_rule__AttributeName__Alternatives_9_1_12124);
                    rule__AttributeName__IntValueAssignment_9_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getIntValueAssignment_9_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1003:6: ( ( rule__AttributeName__StringValueAssignment_9_1_1_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1003:6: ( ( rule__AttributeName__StringValueAssignment_9_1_1_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1004:1: ( rule__AttributeName__StringValueAssignment_9_1_1_1 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getStringValueAssignment_9_1_1_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1005:1: ( rule__AttributeName__StringValueAssignment_9_1_1_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1005:2: rule__AttributeName__StringValueAssignment_9_1_1_1
                    {
                    pushFollow(FOLLOW_rule__AttributeName__StringValueAssignment_9_1_1_1_in_rule__AttributeName__Alternatives_9_1_12142);
                    rule__AttributeName__StringValueAssignment_9_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getStringValueAssignment_9_1_1_1()); 

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
    // $ANTLR end "rule__AttributeName__Alternatives_9_1_1"


    // $ANTLR start "rule__Type__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1014:1: rule__Type__Alternatives : ( ( ( rule__Type__PrimTypeAssignment_0 ) ) | ( ( rule__Type__VectorTypeAssignment_1 ) ) | ( ( rule__Type__DefTypeAssignment_2 ) ) | ( ( rule__Type__QualifiedTypeAssignment_3 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1018:1: ( ( ( rule__Type__PrimTypeAssignment_0 ) ) | ( ( rule__Type__VectorTypeAssignment_1 ) ) | ( ( rule__Type__DefTypeAssignment_2 ) ) | ( ( rule__Type__QualifiedTypeAssignment_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt6=1;
                }
                break;
            case 47:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==EOF||LA6_3==31||(LA6_3>=42 && LA6_3<=43)||LA6_3==48) ) {
                    alt6=3;
                }
                else if ( (LA6_3==46) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HASH_ATTRIBUTE:
            case RULE_ID_ATTRIBUTE:
            case RULE_REQUIRED_ATTRIBUTE:
            case RULE_KEY_ATTRIBUTE:
            case RULE_DEPRECTED_ATTRIBUTE:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1019:1: ( ( rule__Type__PrimTypeAssignment_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1019:1: ( ( rule__Type__PrimTypeAssignment_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1020:1: ( rule__Type__PrimTypeAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getPrimTypeAssignment_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1021:1: ( rule__Type__PrimTypeAssignment_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1021:2: rule__Type__PrimTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__PrimTypeAssignment_0_in_rule__Type__Alternatives2175);
                    rule__Type__PrimTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getPrimTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1025:6: ( ( rule__Type__VectorTypeAssignment_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1025:6: ( ( rule__Type__VectorTypeAssignment_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1026:1: ( rule__Type__VectorTypeAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getVectorTypeAssignment_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1027:1: ( rule__Type__VectorTypeAssignment_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1027:2: rule__Type__VectorTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__VectorTypeAssignment_1_in_rule__Type__Alternatives2193);
                    rule__Type__VectorTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getVectorTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1031:6: ( ( rule__Type__DefTypeAssignment_2 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1031:6: ( ( rule__Type__DefTypeAssignment_2 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1032:1: ( rule__Type__DefTypeAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getDefTypeAssignment_2()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1033:1: ( rule__Type__DefTypeAssignment_2 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1033:2: rule__Type__DefTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__DefTypeAssignment_2_in_rule__Type__Alternatives2211);
                    rule__Type__DefTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getDefTypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1037:6: ( ( rule__Type__QualifiedTypeAssignment_3 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1037:6: ( ( rule__Type__QualifiedTypeAssignment_3 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1038:1: ( rule__Type__QualifiedTypeAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getQualifiedTypeAssignment_3()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1039:1: ( rule__Type__QualifiedTypeAssignment_3 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1039:2: rule__Type__QualifiedTypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Type__QualifiedTypeAssignment_3_in_rule__Type__Alternatives2229);
                    rule__Type__QualifiedTypeAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getQualifiedTypeAssignment_3()); 

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


    // $ANTLR start "rule__PrimitiveWithoutString__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1048:1: rule__PrimitiveWithoutString__Alternatives : ( ( 'bool' ) | ( 'float' ) | ( 'double' ) | ( rulePrimitiveNumberType ) );
    public final void rule__PrimitiveWithoutString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1052:1: ( ( 'bool' ) | ( 'float' ) | ( 'double' ) | ( rulePrimitiveNumberType ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1053:1: ( 'bool' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1053:1: ( 'bool' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1054:1: 'bool'
                    {
                     before(grammarAccess.getPrimitiveWithoutStringAccess().getBoolKeyword_0()); 
                    match(input,18,FOLLOW_18_in_rule__PrimitiveWithoutString__Alternatives2263); 
                     after(grammarAccess.getPrimitiveWithoutStringAccess().getBoolKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1061:6: ( 'float' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1061:6: ( 'float' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1062:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveWithoutStringAccess().getFloatKeyword_1()); 
                    match(input,19,FOLLOW_19_in_rule__PrimitiveWithoutString__Alternatives2283); 
                     after(grammarAccess.getPrimitiveWithoutStringAccess().getFloatKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1069:6: ( 'double' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1069:6: ( 'double' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1070:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveWithoutStringAccess().getDoubleKeyword_2()); 
                    match(input,20,FOLLOW_20_in_rule__PrimitiveWithoutString__Alternatives2303); 
                     after(grammarAccess.getPrimitiveWithoutStringAccess().getDoubleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1077:6: ( rulePrimitiveNumberType )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1077:6: ( rulePrimitiveNumberType )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1078:1: rulePrimitiveNumberType
                    {
                     before(grammarAccess.getPrimitiveWithoutStringAccess().getPrimitiveNumberTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePrimitiveNumberType_in_rule__PrimitiveWithoutString__Alternatives2322);
                    rulePrimitiveNumberType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveWithoutStringAccess().getPrimitiveNumberTypeParserRuleCall_3()); 

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
    // $ANTLR end "rule__PrimitiveWithoutString__Alternatives"


    // $ANTLR start "rule__Primitive__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1088:1: rule__Primitive__Alternatives : ( ( 'string' ) | ( rulePrimitiveWithoutString ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1092:1: ( ( 'string' ) | ( rulePrimitiveWithoutString ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=18 && LA8_0<=20)||(LA8_0>=22 && LA8_0<=29)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1093:1: ( 'string' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1093:1: ( 'string' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1094:1: 'string'
                    {
                     before(grammarAccess.getPrimitiveAccess().getStringKeyword_0()); 
                    match(input,21,FOLLOW_21_in_rule__Primitive__Alternatives2355); 
                     after(grammarAccess.getPrimitiveAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1101:6: ( rulePrimitiveWithoutString )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1101:6: ( rulePrimitiveWithoutString )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1102:1: rulePrimitiveWithoutString
                    {
                     before(grammarAccess.getPrimitiveAccess().getPrimitiveWithoutStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitiveWithoutString_in_rule__Primitive__Alternatives2374);
                    rulePrimitiveWithoutString();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getPrimitiveWithoutStringParserRuleCall_1()); 

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


    // $ANTLR start "rule__PrimitiveNumberType__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1112:1: rule__PrimitiveNumberType__Alternatives : ( ( 'byte' ) | ( 'ubyte' ) | ( 'short' ) | ( 'ushort' ) | ( 'int' ) | ( 'uint' ) | ( 'long' ) | ( 'ulong' ) );
    public final void rule__PrimitiveNumberType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1116:1: ( ( 'byte' ) | ( 'ubyte' ) | ( 'short' ) | ( 'ushort' ) | ( 'int' ) | ( 'uint' ) | ( 'long' ) | ( 'ulong' ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            case 27:
                {
                alt9=6;
                }
                break;
            case 28:
                {
                alt9=7;
                }
                break;
            case 29:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1117:1: ( 'byte' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1117:1: ( 'byte' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1118:1: 'byte'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getByteKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__PrimitiveNumberType__Alternatives2407); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1125:6: ( 'ubyte' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1125:6: ( 'ubyte' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1126:1: 'ubyte'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getUbyteKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__PrimitiveNumberType__Alternatives2427); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getUbyteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1133:6: ( 'short' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1133:6: ( 'short' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1134:1: 'short'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getShortKeyword_2()); 
                    match(input,24,FOLLOW_24_in_rule__PrimitiveNumberType__Alternatives2447); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getShortKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1141:6: ( 'ushort' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1141:6: ( 'ushort' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1142:1: 'ushort'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getUshortKeyword_3()); 
                    match(input,25,FOLLOW_25_in_rule__PrimitiveNumberType__Alternatives2467); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getUshortKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1149:6: ( 'int' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1149:6: ( 'int' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1150:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getIntKeyword_4()); 
                    match(input,26,FOLLOW_26_in_rule__PrimitiveNumberType__Alternatives2487); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getIntKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1157:6: ( 'uint' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1157:6: ( 'uint' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1158:1: 'uint'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getUintKeyword_5()); 
                    match(input,27,FOLLOW_27_in_rule__PrimitiveNumberType__Alternatives2507); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getUintKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1165:6: ( 'long' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1165:6: ( 'long' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1166:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getLongKeyword_6()); 
                    match(input,28,FOLLOW_28_in_rule__PrimitiveNumberType__Alternatives2527); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getLongKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1173:6: ( 'ulong' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1173:6: ( 'ulong' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1174:1: 'ulong'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getUlongKeyword_7()); 
                    match(input,29,FOLLOW_29_in_rule__PrimitiveNumberType__Alternatives2547); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getUlongKeyword_7()); 

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
    // $ANTLR end "rule__PrimitiveNumberType__Alternatives"


    // $ANTLR start "rule__ValidID__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1186:1: rule__ValidID__Alternatives : ( ( RULE_HASH_ATTRIBUTE ) | ( RULE_ID_ATTRIBUTE ) | ( RULE_REQUIRED_ATTRIBUTE ) | ( RULE_KEY_ATTRIBUTE ) | ( RULE_DEPRECTED_ATTRIBUTE ) | ( RULE_ID ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1190:1: ( ( RULE_HASH_ATTRIBUTE ) | ( RULE_ID_ATTRIBUTE ) | ( RULE_REQUIRED_ATTRIBUTE ) | ( RULE_KEY_ATTRIBUTE ) | ( RULE_DEPRECTED_ATTRIBUTE ) | ( RULE_ID ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case RULE_HASH_ATTRIBUTE:
                {
                alt10=1;
                }
                break;
            case RULE_ID_ATTRIBUTE:
                {
                alt10=2;
                }
                break;
            case RULE_REQUIRED_ATTRIBUTE:
                {
                alt10=3;
                }
                break;
            case RULE_KEY_ATTRIBUTE:
                {
                alt10=4;
                }
                break;
            case RULE_DEPRECTED_ATTRIBUTE:
                {
                alt10=5;
                }
                break;
            case RULE_ID:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1191:1: ( RULE_HASH_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1191:1: ( RULE_HASH_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1192:1: RULE_HASH_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getHASH_ATTRIBUTETerminalRuleCall_0()); 
                    match(input,RULE_HASH_ATTRIBUTE,FOLLOW_RULE_HASH_ATTRIBUTE_in_rule__ValidID__Alternatives2581); 
                     after(grammarAccess.getValidIDAccess().getHASH_ATTRIBUTETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1197:6: ( RULE_ID_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1197:6: ( RULE_ID_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1198:1: RULE_ID_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getID_ATTRIBUTETerminalRuleCall_1()); 
                    match(input,RULE_ID_ATTRIBUTE,FOLLOW_RULE_ID_ATTRIBUTE_in_rule__ValidID__Alternatives2598); 
                     after(grammarAccess.getValidIDAccess().getID_ATTRIBUTETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1203:6: ( RULE_REQUIRED_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1203:6: ( RULE_REQUIRED_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1204:1: RULE_REQUIRED_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getREQUIRED_ATTRIBUTETerminalRuleCall_2()); 
                    match(input,RULE_REQUIRED_ATTRIBUTE,FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_rule__ValidID__Alternatives2615); 
                     after(grammarAccess.getValidIDAccess().getREQUIRED_ATTRIBUTETerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1209:6: ( RULE_KEY_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1209:6: ( RULE_KEY_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1210:1: RULE_KEY_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getKEY_ATTRIBUTETerminalRuleCall_3()); 
                    match(input,RULE_KEY_ATTRIBUTE,FOLLOW_RULE_KEY_ATTRIBUTE_in_rule__ValidID__Alternatives2632); 
                     after(grammarAccess.getValidIDAccess().getKEY_ATTRIBUTETerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1215:6: ( RULE_DEPRECTED_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1215:6: ( RULE_DEPRECTED_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1216:1: RULE_DEPRECTED_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getDEPRECTED_ATTRIBUTETerminalRuleCall_4()); 
                    match(input,RULE_DEPRECTED_ATTRIBUTE,FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_rule__ValidID__Alternatives2649); 
                     after(grammarAccess.getValidIDAccess().getDEPRECTED_ATTRIBUTETerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1221:6: ( RULE_ID )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1221:6: ( RULE_ID )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1222:1: RULE_ID
                    {
                     before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_5()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValidID__Alternatives2666); 
                     after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1232:1: rule__Number__Alternatives : ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1236:1: ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_HEX) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_DECIMAL)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1237:1: ( RULE_HEX )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1237:1: ( RULE_HEX )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1238:1: RULE_HEX
                    {
                     before(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                    match(input,RULE_HEX,FOLLOW_RULE_HEX_in_rule__Number__Alternatives2698); 
                     after(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1243:6: ( ( rule__Number__Group_1__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1243:6: ( ( rule__Number__Group_1__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1244:1: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1245:1: ( rule__Number__Group_1__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1245:2: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives2715);
                    rule__Number__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Number__Alternatives_1_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1254:1: rule__Number__Alternatives_1_0 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1258:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_DECIMAL) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1259:1: ( RULE_INT )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1259:1: ( RULE_INT )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1260:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_02748); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1265:6: ( RULE_DECIMAL )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1265:6: ( RULE_DECIMAL )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1266:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_02765); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Number__Alternatives_1_0"


    // $ANTLR start "rule__Number__Alternatives_1_1_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1276:1: rule__Number__Alternatives_1_1_1 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1280:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_DECIMAL) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1281:1: ( RULE_INT )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1281:1: ( RULE_INT )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1282:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_12797); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1287:6: ( RULE_DECIMAL )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1287:6: ( RULE_DECIMAL )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1288:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_12814); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 

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
    // $ANTLR end "rule__Number__Alternatives_1_1_1"


    // $ANTLR start "rule__Schema__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1300:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1304:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1305:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__02844);
            rule__Schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__02847);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1312:1: rule__Schema__Group__0__Impl : ( ( rule__Schema__IncludesAssignment_0 )* ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1316:1: ( ( ( rule__Schema__IncludesAssignment_0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1317:1: ( ( rule__Schema__IncludesAssignment_0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1317:1: ( ( rule__Schema__IncludesAssignment_0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1318:1: ( rule__Schema__IncludesAssignment_0 )*
            {
             before(grammarAccess.getSchemaAccess().getIncludesAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1319:1: ( rule__Schema__IncludesAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1319:2: rule__Schema__IncludesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Schema__IncludesAssignment_0_in_rule__Schema__Group__0__Impl2874);
            	    rule__Schema__IncludesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1329:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1333:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1334:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__12905);
            rule__Schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__12908);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1341:1: rule__Schema__Group__1__Impl : ( ( rule__Schema__NamepsaceAssignment_1 )? ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1345:1: ( ( ( rule__Schema__NamepsaceAssignment_1 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1346:1: ( ( rule__Schema__NamepsaceAssignment_1 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1346:1: ( ( rule__Schema__NamepsaceAssignment_1 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1347:1: ( rule__Schema__NamepsaceAssignment_1 )?
            {
             before(grammarAccess.getSchemaAccess().getNamepsaceAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1348:1: ( rule__Schema__NamepsaceAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1348:2: rule__Schema__NamepsaceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Schema__NamepsaceAssignment_1_in_rule__Schema__Group__1__Impl2935);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1358:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1362:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1363:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__22966);
            rule__Schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__3_in_rule__Schema__Group__22969);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1370:1: rule__Schema__Group__2__Impl : ( ( rule__Schema__FileIdentifierAssignment_2 )? ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1374:1: ( ( ( rule__Schema__FileIdentifierAssignment_2 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1375:1: ( ( rule__Schema__FileIdentifierAssignment_2 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1375:1: ( ( rule__Schema__FileIdentifierAssignment_2 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1376:1: ( rule__Schema__FileIdentifierAssignment_2 )?
            {
             before(grammarAccess.getSchemaAccess().getFileIdentifierAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1377:1: ( rule__Schema__FileIdentifierAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1377:2: rule__Schema__FileIdentifierAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Schema__FileIdentifierAssignment_2_in_rule__Schema__Group__2__Impl2996);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1387:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1391:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1392:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_rule__Schema__Group__3__Impl_in_rule__Schema__Group__33027);
            rule__Schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__4_in_rule__Schema__Group__33030);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1399:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__File_extensionAssignment_3 )? ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1403:1: ( ( ( rule__Schema__File_extensionAssignment_3 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1404:1: ( ( rule__Schema__File_extensionAssignment_3 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1404:1: ( ( rule__Schema__File_extensionAssignment_3 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1405:1: ( rule__Schema__File_extensionAssignment_3 )?
            {
             before(grammarAccess.getSchemaAccess().getFile_extensionAssignment_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1406:1: ( rule__Schema__File_extensionAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1406:2: rule__Schema__File_extensionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Schema__File_extensionAssignment_3_in_rule__Schema__Group__3__Impl3057);
                    rule__Schema__File_extensionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getFile_extensionAssignment_3()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1416:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1420:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1421:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
            {
            pushFollow(FOLLOW_rule__Schema__Group__4__Impl_in_rule__Schema__Group__43088);
            rule__Schema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__5_in_rule__Schema__Group__43091);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1428:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__CustomAttributesAssignment_4 )* ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1432:1: ( ( ( rule__Schema__CustomAttributesAssignment_4 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1433:1: ( ( rule__Schema__CustomAttributesAssignment_4 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1433:1: ( ( rule__Schema__CustomAttributesAssignment_4 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1434:1: ( rule__Schema__CustomAttributesAssignment_4 )*
            {
             before(grammarAccess.getSchemaAccess().getCustomAttributesAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1435:1: ( rule__Schema__CustomAttributesAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1435:2: rule__Schema__CustomAttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Schema__CustomAttributesAssignment_4_in_rule__Schema__Group__4__Impl3118);
            	    rule__Schema__CustomAttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getCustomAttributesAssignment_4()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1445:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl rule__Schema__Group__6 ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1449:1: ( rule__Schema__Group__5__Impl rule__Schema__Group__6 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1450:2: rule__Schema__Group__5__Impl rule__Schema__Group__6
            {
            pushFollow(FOLLOW_rule__Schema__Group__5__Impl_in_rule__Schema__Group__53149);
            rule__Schema__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__6_in_rule__Schema__Group__53152);
            rule__Schema__Group__6();

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1457:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__DefinitionsAssignment_5 )* ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1461:1: ( ( ( rule__Schema__DefinitionsAssignment_5 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1462:1: ( ( rule__Schema__DefinitionsAssignment_5 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1462:1: ( ( rule__Schema__DefinitionsAssignment_5 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1463:1: ( rule__Schema__DefinitionsAssignment_5 )*
            {
             before(grammarAccess.getSchemaAccess().getDefinitionsAssignment_5()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1464:1: ( rule__Schema__DefinitionsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37||LA19_0==41||(LA19_0>=49 && LA19_0<=50)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1464:2: rule__Schema__DefinitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Schema__DefinitionsAssignment_5_in_rule__Schema__Group__5__Impl3179);
            	    rule__Schema__DefinitionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getDefinitionsAssignment_5()); 

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


    // $ANTLR start "rule__Schema__Group__6"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1474:1: rule__Schema__Group__6 : rule__Schema__Group__6__Impl ;
    public final void rule__Schema__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1478:1: ( rule__Schema__Group__6__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1479:2: rule__Schema__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Schema__Group__6__Impl_in_rule__Schema__Group__63210);
            rule__Schema__Group__6__Impl();

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
    // $ANTLR end "rule__Schema__Group__6"


    // $ANTLR start "rule__Schema__Group__6__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1485:1: rule__Schema__Group__6__Impl : ( ( rule__Schema__RootTypeAssignment_6 ) ) ;
    public final void rule__Schema__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1489:1: ( ( ( rule__Schema__RootTypeAssignment_6 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1490:1: ( ( rule__Schema__RootTypeAssignment_6 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1490:1: ( ( rule__Schema__RootTypeAssignment_6 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1491:1: ( rule__Schema__RootTypeAssignment_6 )
            {
             before(grammarAccess.getSchemaAccess().getRootTypeAssignment_6()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1492:1: ( rule__Schema__RootTypeAssignment_6 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1492:2: rule__Schema__RootTypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Schema__RootTypeAssignment_6_in_rule__Schema__Group__6__Impl3237);
            rule__Schema__RootTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getRootTypeAssignment_6()); 

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
    // $ANTLR end "rule__Schema__Group__6__Impl"


    // $ANTLR start "rule__RootType__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1516:1: rule__RootType__Group__0 : rule__RootType__Group__0__Impl rule__RootType__Group__1 ;
    public final void rule__RootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1520:1: ( rule__RootType__Group__0__Impl rule__RootType__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1521:2: rule__RootType__Group__0__Impl rule__RootType__Group__1
            {
            pushFollow(FOLLOW_rule__RootType__Group__0__Impl_in_rule__RootType__Group__03281);
            rule__RootType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootType__Group__1_in_rule__RootType__Group__03284);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1528:1: rule__RootType__Group__0__Impl : ( 'root_type' ) ;
    public final void rule__RootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1532:1: ( ( 'root_type' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1533:1: ( 'root_type' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1533:1: ( 'root_type' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1534:1: 'root_type'
            {
             before(grammarAccess.getRootTypeAccess().getRoot_typeKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__RootType__Group__0__Impl3312); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1547:1: rule__RootType__Group__1 : rule__RootType__Group__1__Impl rule__RootType__Group__2 ;
    public final void rule__RootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1551:1: ( rule__RootType__Group__1__Impl rule__RootType__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1552:2: rule__RootType__Group__1__Impl rule__RootType__Group__2
            {
            pushFollow(FOLLOW_rule__RootType__Group__1__Impl_in_rule__RootType__Group__13343);
            rule__RootType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootType__Group__2_in_rule__RootType__Group__13346);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1559:1: rule__RootType__Group__1__Impl : ( ( rule__RootType__TypeAssignment_1 ) ) ;
    public final void rule__RootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1563:1: ( ( ( rule__RootType__TypeAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1564:1: ( ( rule__RootType__TypeAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1564:1: ( ( rule__RootType__TypeAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1565:1: ( rule__RootType__TypeAssignment_1 )
            {
             before(grammarAccess.getRootTypeAccess().getTypeAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1566:1: ( rule__RootType__TypeAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1566:2: rule__RootType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__RootType__TypeAssignment_1_in_rule__RootType__Group__1__Impl3373);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1576:1: rule__RootType__Group__2 : rule__RootType__Group__2__Impl ;
    public final void rule__RootType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1580:1: ( rule__RootType__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1581:2: rule__RootType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RootType__Group__2__Impl_in_rule__RootType__Group__23403);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1587:1: rule__RootType__Group__2__Impl : ( ';' ) ;
    public final void rule__RootType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1591:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1592:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1592:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1593:1: ';'
            {
             before(grammarAccess.getRootTypeAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__RootType__Group__2__Impl3431); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1612:1: rule__CustomAttributes__Group__0 : rule__CustomAttributes__Group__0__Impl rule__CustomAttributes__Group__1 ;
    public final void rule__CustomAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1616:1: ( rule__CustomAttributes__Group__0__Impl rule__CustomAttributes__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1617:2: rule__CustomAttributes__Group__0__Impl rule__CustomAttributes__Group__1
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__0__Impl_in_rule__CustomAttributes__Group__03468);
            rule__CustomAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttributes__Group__1_in_rule__CustomAttributes__Group__03471);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1624:1: rule__CustomAttributes__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__CustomAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1628:1: ( ( 'attribute' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1629:1: ( 'attribute' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1629:1: ( 'attribute' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1630:1: 'attribute'
            {
             before(grammarAccess.getCustomAttributesAccess().getAttributeKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__CustomAttributes__Group__0__Impl3499); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1643:1: rule__CustomAttributes__Group__1 : rule__CustomAttributes__Group__1__Impl rule__CustomAttributes__Group__2 ;
    public final void rule__CustomAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1647:1: ( rule__CustomAttributes__Group__1__Impl rule__CustomAttributes__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1648:2: rule__CustomAttributes__Group__1__Impl rule__CustomAttributes__Group__2
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__1__Impl_in_rule__CustomAttributes__Group__13530);
            rule__CustomAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttributes__Group__2_in_rule__CustomAttributes__Group__13533);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1655:1: rule__CustomAttributes__Group__1__Impl : ( ( rule__CustomAttributes__NameAssignment_1 ) ) ;
    public final void rule__CustomAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1659:1: ( ( ( rule__CustomAttributes__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1660:1: ( ( rule__CustomAttributes__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1660:1: ( ( rule__CustomAttributes__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1661:1: ( rule__CustomAttributes__NameAssignment_1 )
            {
             before(grammarAccess.getCustomAttributesAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1662:1: ( rule__CustomAttributes__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1662:2: rule__CustomAttributes__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomAttributes__NameAssignment_1_in_rule__CustomAttributes__Group__1__Impl3560);
            rule__CustomAttributes__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributesAccess().getNameAssignment_1()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1672:1: rule__CustomAttributes__Group__2 : rule__CustomAttributes__Group__2__Impl ;
    public final void rule__CustomAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1676:1: ( rule__CustomAttributes__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1677:2: rule__CustomAttributes__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__2__Impl_in_rule__CustomAttributes__Group__23590);
            rule__CustomAttributes__Group__2__Impl();

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1683:1: rule__CustomAttributes__Group__2__Impl : ( ';' ) ;
    public final void rule__CustomAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1687:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1688:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1688:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1689:1: ';'
            {
             before(grammarAccess.getCustomAttributesAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__CustomAttributes__Group__2__Impl3618); 
             after(grammarAccess.getCustomAttributesAccess().getSemicolonKeyword_2()); 

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


    // $ANTLR start "rule__FileIdentifier__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1708:1: rule__FileIdentifier__Group__0 : rule__FileIdentifier__Group__0__Impl rule__FileIdentifier__Group__1 ;
    public final void rule__FileIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1712:1: ( rule__FileIdentifier__Group__0__Impl rule__FileIdentifier__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1713:2: rule__FileIdentifier__Group__0__Impl rule__FileIdentifier__Group__1
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__0__Impl_in_rule__FileIdentifier__Group__03655);
            rule__FileIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileIdentifier__Group__1_in_rule__FileIdentifier__Group__03658);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1720:1: rule__FileIdentifier__Group__0__Impl : ( 'file_identifier' ) ;
    public final void rule__FileIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1724:1: ( ( 'file_identifier' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1725:1: ( 'file_identifier' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1725:1: ( 'file_identifier' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1726:1: 'file_identifier'
            {
             before(grammarAccess.getFileIdentifierAccess().getFile_identifierKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__FileIdentifier__Group__0__Impl3686); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1739:1: rule__FileIdentifier__Group__1 : rule__FileIdentifier__Group__1__Impl rule__FileIdentifier__Group__2 ;
    public final void rule__FileIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1743:1: ( rule__FileIdentifier__Group__1__Impl rule__FileIdentifier__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1744:2: rule__FileIdentifier__Group__1__Impl rule__FileIdentifier__Group__2
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__1__Impl_in_rule__FileIdentifier__Group__13717);
            rule__FileIdentifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileIdentifier__Group__2_in_rule__FileIdentifier__Group__13720);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1751:1: rule__FileIdentifier__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__FileIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1755:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1756:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1756:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1757:1: RULE_STRING
            {
             before(grammarAccess.getFileIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FileIdentifier__Group__1__Impl3747); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1768:1: rule__FileIdentifier__Group__2 : rule__FileIdentifier__Group__2__Impl ;
    public final void rule__FileIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1772:1: ( rule__FileIdentifier__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1773:2: rule__FileIdentifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__2__Impl_in_rule__FileIdentifier__Group__23776);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1779:1: rule__FileIdentifier__Group__2__Impl : ( ';' ) ;
    public final void rule__FileIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1783:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1784:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1784:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1785:1: ';'
            {
             before(grammarAccess.getFileIdentifierAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__FileIdentifier__Group__2__Impl3804); 
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


    // $ANTLR start "rule__FileExtension__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1804:1: rule__FileExtension__Group__0 : rule__FileExtension__Group__0__Impl rule__FileExtension__Group__1 ;
    public final void rule__FileExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1808:1: ( rule__FileExtension__Group__0__Impl rule__FileExtension__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1809:2: rule__FileExtension__Group__0__Impl rule__FileExtension__Group__1
            {
            pushFollow(FOLLOW_rule__FileExtension__Group__0__Impl_in_rule__FileExtension__Group__03841);
            rule__FileExtension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileExtension__Group__1_in_rule__FileExtension__Group__03844);
            rule__FileExtension__Group__1();

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
    // $ANTLR end "rule__FileExtension__Group__0"


    // $ANTLR start "rule__FileExtension__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1816:1: rule__FileExtension__Group__0__Impl : ( 'file_extension' ) ;
    public final void rule__FileExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1820:1: ( ( 'file_extension' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1821:1: ( 'file_extension' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1821:1: ( 'file_extension' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1822:1: 'file_extension'
            {
             before(grammarAccess.getFileExtensionAccess().getFile_extensionKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FileExtension__Group__0__Impl3872); 
             after(grammarAccess.getFileExtensionAccess().getFile_extensionKeyword_0()); 

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
    // $ANTLR end "rule__FileExtension__Group__0__Impl"


    // $ANTLR start "rule__FileExtension__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1835:1: rule__FileExtension__Group__1 : rule__FileExtension__Group__1__Impl rule__FileExtension__Group__2 ;
    public final void rule__FileExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1839:1: ( rule__FileExtension__Group__1__Impl rule__FileExtension__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1840:2: rule__FileExtension__Group__1__Impl rule__FileExtension__Group__2
            {
            pushFollow(FOLLOW_rule__FileExtension__Group__1__Impl_in_rule__FileExtension__Group__13903);
            rule__FileExtension__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileExtension__Group__2_in_rule__FileExtension__Group__13906);
            rule__FileExtension__Group__2();

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
    // $ANTLR end "rule__FileExtension__Group__1"


    // $ANTLR start "rule__FileExtension__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1847:1: rule__FileExtension__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__FileExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1851:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1852:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1852:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1853:1: RULE_STRING
            {
             before(grammarAccess.getFileExtensionAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FileExtension__Group__1__Impl3933); 
             after(grammarAccess.getFileExtensionAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__FileExtension__Group__1__Impl"


    // $ANTLR start "rule__FileExtension__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1864:1: rule__FileExtension__Group__2 : rule__FileExtension__Group__2__Impl ;
    public final void rule__FileExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1868:1: ( rule__FileExtension__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1869:2: rule__FileExtension__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FileExtension__Group__2__Impl_in_rule__FileExtension__Group__23962);
            rule__FileExtension__Group__2__Impl();

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
    // $ANTLR end "rule__FileExtension__Group__2"


    // $ANTLR start "rule__FileExtension__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1875:1: rule__FileExtension__Group__2__Impl : ( ';' ) ;
    public final void rule__FileExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1879:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1880:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1880:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1881:1: ';'
            {
             before(grammarAccess.getFileExtensionAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__FileExtension__Group__2__Impl3990); 
             after(grammarAccess.getFileExtensionAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__FileExtension__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1900:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1904:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1905:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__04027);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__04030);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1912:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1916:1: ( ( 'namespace' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1917:1: ( 'namespace' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1917:1: ( 'namespace' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1918:1: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Namespace__Group__0__Impl4058); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1931:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1935:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1936:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__14089);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__14092);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1943:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1947:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1948:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1948:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1949:1: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1950:1: ( rule__Namespace__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1950:2: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl4119);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1960:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1964:1: ( rule__Namespace__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1965:2: rule__Namespace__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__24149);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1971:1: rule__Namespace__Group__2__Impl : ( ';' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1975:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1976:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1976:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1977:1: ';'
            {
             before(grammarAccess.getNamespaceAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Namespace__Group__2__Impl4177); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1996:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2000:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2001:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__04214);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__04217);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2008:1: rule__Include__Group__0__Impl : ( 'include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2012:1: ( ( 'include' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2013:1: ( 'include' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2013:1: ( 'include' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2014:1: 'include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Include__Group__0__Impl4245); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2027:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2031:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2032:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__14276);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__14279);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2039:1: rule__Include__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2043:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2044:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2044:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2045:1: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__Group__1__Impl4306); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2056:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2060:1: ( rule__Include__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2061:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__24335);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2067:1: rule__Include__Group__2__Impl : ( ';' ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2071:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2072:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2072:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2073:1: ';'
            {
             before(grammarAccess.getIncludeAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Include__Group__2__Impl4363); 
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


    // $ANTLR start "rule__Struct__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2092:1: rule__Struct__Group__0 : rule__Struct__Group__0__Impl rule__Struct__Group__1 ;
    public final void rule__Struct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2096:1: ( rule__Struct__Group__0__Impl rule__Struct__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2097:2: rule__Struct__Group__0__Impl rule__Struct__Group__1
            {
            pushFollow(FOLLOW_rule__Struct__Group__0__Impl_in_rule__Struct__Group__04400);
            rule__Struct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__1_in_rule__Struct__Group__04403);
            rule__Struct__Group__1();

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
    // $ANTLR end "rule__Struct__Group__0"


    // $ANTLR start "rule__Struct__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2104:1: rule__Struct__Group__0__Impl : ( 'struct' ) ;
    public final void rule__Struct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2108:1: ( ( 'struct' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2109:1: ( 'struct' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2109:1: ( 'struct' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2110:1: 'struct'
            {
             before(grammarAccess.getStructAccess().getStructKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Struct__Group__0__Impl4431); 
             after(grammarAccess.getStructAccess().getStructKeyword_0()); 

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
    // $ANTLR end "rule__Struct__Group__0__Impl"


    // $ANTLR start "rule__Struct__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2123:1: rule__Struct__Group__1 : rule__Struct__Group__1__Impl rule__Struct__Group__2 ;
    public final void rule__Struct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2127:1: ( rule__Struct__Group__1__Impl rule__Struct__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2128:2: rule__Struct__Group__1__Impl rule__Struct__Group__2
            {
            pushFollow(FOLLOW_rule__Struct__Group__1__Impl_in_rule__Struct__Group__14462);
            rule__Struct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__2_in_rule__Struct__Group__14465);
            rule__Struct__Group__2();

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
    // $ANTLR end "rule__Struct__Group__1"


    // $ANTLR start "rule__Struct__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2135:1: rule__Struct__Group__1__Impl : ( ( rule__Struct__NameAssignment_1 ) ) ;
    public final void rule__Struct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2139:1: ( ( ( rule__Struct__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2140:1: ( ( rule__Struct__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2140:1: ( ( rule__Struct__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2141:1: ( rule__Struct__NameAssignment_1 )
            {
             before(grammarAccess.getStructAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2142:1: ( rule__Struct__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2142:2: rule__Struct__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Struct__NameAssignment_1_in_rule__Struct__Group__1__Impl4492);
            rule__Struct__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Struct__Group__1__Impl"


    // $ANTLR start "rule__Struct__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2152:1: rule__Struct__Group__2 : rule__Struct__Group__2__Impl rule__Struct__Group__3 ;
    public final void rule__Struct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2156:1: ( rule__Struct__Group__2__Impl rule__Struct__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2157:2: rule__Struct__Group__2__Impl rule__Struct__Group__3
            {
            pushFollow(FOLLOW_rule__Struct__Group__2__Impl_in_rule__Struct__Group__24522);
            rule__Struct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__3_in_rule__Struct__Group__24525);
            rule__Struct__Group__3();

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
    // $ANTLR end "rule__Struct__Group__2"


    // $ANTLR start "rule__Struct__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2164:1: rule__Struct__Group__2__Impl : ( ( rule__Struct__AttributesAssignment_2 )? ) ;
    public final void rule__Struct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2168:1: ( ( ( rule__Struct__AttributesAssignment_2 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2169:1: ( ( rule__Struct__AttributesAssignment_2 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2169:1: ( ( rule__Struct__AttributesAssignment_2 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2170:1: ( rule__Struct__AttributesAssignment_2 )?
            {
             before(grammarAccess.getStructAccess().getAttributesAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2171:1: ( rule__Struct__AttributesAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2171:2: rule__Struct__AttributesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Struct__AttributesAssignment_2_in_rule__Struct__Group__2__Impl4552);
                    rule__Struct__AttributesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructAccess().getAttributesAssignment_2()); 

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
    // $ANTLR end "rule__Struct__Group__2__Impl"


    // $ANTLR start "rule__Struct__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2181:1: rule__Struct__Group__3 : rule__Struct__Group__3__Impl rule__Struct__Group__4 ;
    public final void rule__Struct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2185:1: ( rule__Struct__Group__3__Impl rule__Struct__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2186:2: rule__Struct__Group__3__Impl rule__Struct__Group__4
            {
            pushFollow(FOLLOW_rule__Struct__Group__3__Impl_in_rule__Struct__Group__34583);
            rule__Struct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__4_in_rule__Struct__Group__34586);
            rule__Struct__Group__4();

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
    // $ANTLR end "rule__Struct__Group__3"


    // $ANTLR start "rule__Struct__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2193:1: rule__Struct__Group__3__Impl : ( '{' ) ;
    public final void rule__Struct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2197:1: ( ( '{' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2198:1: ( '{' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2198:1: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2199:1: '{'
            {
             before(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__Struct__Group__3__Impl4614); 
             after(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Struct__Group__3__Impl"


    // $ANTLR start "rule__Struct__Group__4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2212:1: rule__Struct__Group__4 : rule__Struct__Group__4__Impl rule__Struct__Group__5 ;
    public final void rule__Struct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2216:1: ( rule__Struct__Group__4__Impl rule__Struct__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2217:2: rule__Struct__Group__4__Impl rule__Struct__Group__5
            {
            pushFollow(FOLLOW_rule__Struct__Group__4__Impl_in_rule__Struct__Group__44645);
            rule__Struct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__5_in_rule__Struct__Group__44648);
            rule__Struct__Group__5();

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
    // $ANTLR end "rule__Struct__Group__4"


    // $ANTLR start "rule__Struct__Group__4__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2224:1: rule__Struct__Group__4__Impl : ( ( rule__Struct__FieldsAssignment_4 )* ) ;
    public final void rule__Struct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2228:1: ( ( ( rule__Struct__FieldsAssignment_4 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2229:1: ( ( rule__Struct__FieldsAssignment_4 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2229:1: ( ( rule__Struct__FieldsAssignment_4 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2230:1: ( rule__Struct__FieldsAssignment_4 )*
            {
             before(grammarAccess.getStructAccess().getFieldsAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2231:1: ( rule__Struct__FieldsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2231:2: rule__Struct__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Struct__FieldsAssignment_4_in_rule__Struct__Group__4__Impl4675);
            	    rule__Struct__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStructAccess().getFieldsAssignment_4()); 

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
    // $ANTLR end "rule__Struct__Group__4__Impl"


    // $ANTLR start "rule__Struct__Group__5"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2241:1: rule__Struct__Group__5 : rule__Struct__Group__5__Impl ;
    public final void rule__Struct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2245:1: ( rule__Struct__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2246:2: rule__Struct__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Struct__Group__5__Impl_in_rule__Struct__Group__54706);
            rule__Struct__Group__5__Impl();

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
    // $ANTLR end "rule__Struct__Group__5"


    // $ANTLR start "rule__Struct__Group__5__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2252:1: rule__Struct__Group__5__Impl : ( '}' ) ;
    public final void rule__Struct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2256:1: ( ( '}' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2257:1: ( '}' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2257:1: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2258:1: '}'
            {
             before(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__Struct__Group__5__Impl4734); 
             after(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Struct__Group__5__Impl"


    // $ANTLR start "rule__StructFields__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2283:1: rule__StructFields__Group__0 : rule__StructFields__Group__0__Impl rule__StructFields__Group__1 ;
    public final void rule__StructFields__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2287:1: ( rule__StructFields__Group__0__Impl rule__StructFields__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2288:2: rule__StructFields__Group__0__Impl rule__StructFields__Group__1
            {
            pushFollow(FOLLOW_rule__StructFields__Group__0__Impl_in_rule__StructFields__Group__04777);
            rule__StructFields__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructFields__Group__1_in_rule__StructFields__Group__04780);
            rule__StructFields__Group__1();

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
    // $ANTLR end "rule__StructFields__Group__0"


    // $ANTLR start "rule__StructFields__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2295:1: rule__StructFields__Group__0__Impl : ( ( rule__StructFields__NameAssignment_0 ) ) ;
    public final void rule__StructFields__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2299:1: ( ( ( rule__StructFields__NameAssignment_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2300:1: ( ( rule__StructFields__NameAssignment_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2300:1: ( ( rule__StructFields__NameAssignment_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2301:1: ( rule__StructFields__NameAssignment_0 )
            {
             before(grammarAccess.getStructFieldsAccess().getNameAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2302:1: ( rule__StructFields__NameAssignment_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2302:2: rule__StructFields__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StructFields__NameAssignment_0_in_rule__StructFields__Group__0__Impl4807);
            rule__StructFields__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldsAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__StructFields__Group__0__Impl"


    // $ANTLR start "rule__StructFields__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2312:1: rule__StructFields__Group__1 : rule__StructFields__Group__1__Impl rule__StructFields__Group__2 ;
    public final void rule__StructFields__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2316:1: ( rule__StructFields__Group__1__Impl rule__StructFields__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2317:2: rule__StructFields__Group__1__Impl rule__StructFields__Group__2
            {
            pushFollow(FOLLOW_rule__StructFields__Group__1__Impl_in_rule__StructFields__Group__14837);
            rule__StructFields__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructFields__Group__2_in_rule__StructFields__Group__14840);
            rule__StructFields__Group__2();

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
    // $ANTLR end "rule__StructFields__Group__1"


    // $ANTLR start "rule__StructFields__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2324:1: rule__StructFields__Group__1__Impl : ( ':' ) ;
    public final void rule__StructFields__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2328:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2329:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2329:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2330:1: ':'
            {
             before(grammarAccess.getStructFieldsAccess().getColonKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__StructFields__Group__1__Impl4868); 
             after(grammarAccess.getStructFieldsAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__StructFields__Group__1__Impl"


    // $ANTLR start "rule__StructFields__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2343:1: rule__StructFields__Group__2 : rule__StructFields__Group__2__Impl rule__StructFields__Group__3 ;
    public final void rule__StructFields__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2347:1: ( rule__StructFields__Group__2__Impl rule__StructFields__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2348:2: rule__StructFields__Group__2__Impl rule__StructFields__Group__3
            {
            pushFollow(FOLLOW_rule__StructFields__Group__2__Impl_in_rule__StructFields__Group__24899);
            rule__StructFields__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructFields__Group__3_in_rule__StructFields__Group__24902);
            rule__StructFields__Group__3();

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
    // $ANTLR end "rule__StructFields__Group__2"


    // $ANTLR start "rule__StructFields__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2355:1: rule__StructFields__Group__2__Impl : ( ( rule__StructFields__Alternatives_2 ) ) ;
    public final void rule__StructFields__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2359:1: ( ( ( rule__StructFields__Alternatives_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2360:1: ( ( rule__StructFields__Alternatives_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2360:1: ( ( rule__StructFields__Alternatives_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2361:1: ( rule__StructFields__Alternatives_2 )
            {
             before(grammarAccess.getStructFieldsAccess().getAlternatives_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2362:1: ( rule__StructFields__Alternatives_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2362:2: rule__StructFields__Alternatives_2
            {
            pushFollow(FOLLOW_rule__StructFields__Alternatives_2_in_rule__StructFields__Group__2__Impl4929);
            rule__StructFields__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldsAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__StructFields__Group__2__Impl"


    // $ANTLR start "rule__StructFields__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2372:1: rule__StructFields__Group__3 : rule__StructFields__Group__3__Impl ;
    public final void rule__StructFields__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2376:1: ( rule__StructFields__Group__3__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2377:2: rule__StructFields__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StructFields__Group__3__Impl_in_rule__StructFields__Group__34959);
            rule__StructFields__Group__3__Impl();

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
    // $ANTLR end "rule__StructFields__Group__3"


    // $ANTLR start "rule__StructFields__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2383:1: rule__StructFields__Group__3__Impl : ( ';' ) ;
    public final void rule__StructFields__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2387:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2388:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2388:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2389:1: ';'
            {
             before(grammarAccess.getStructFieldsAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__StructFields__Group__3__Impl4987); 
             after(grammarAccess.getStructFieldsAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__StructFields__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2410:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2414:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2415:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__05026);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__1_in_rule__Table__Group__05029);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2422:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2426:1: ( ( 'table' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2427:1: ( 'table' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2427:1: ( 'table' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2428:1: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Table__Group__0__Impl5057); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2441:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2445:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2446:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__15088);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__2_in_rule__Table__Group__15091);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2453:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2457:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2458:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2458:1: ( ( rule__Table__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2459:1: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2460:1: ( rule__Table__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2460:2: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl5118);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2470:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2474:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2475:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__25148);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__3_in_rule__Table__Group__25151);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2482:1: rule__Table__Group__2__Impl : ( ( rule__Table__AttributesAssignment_2 )? ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2486:1: ( ( ( rule__Table__AttributesAssignment_2 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2487:1: ( ( rule__Table__AttributesAssignment_2 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2487:1: ( ( rule__Table__AttributesAssignment_2 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2488:1: ( rule__Table__AttributesAssignment_2 )?
            {
             before(grammarAccess.getTableAccess().getAttributesAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2489:1: ( rule__Table__AttributesAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2489:2: rule__Table__AttributesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Table__AttributesAssignment_2_in_rule__Table__Group__2__Impl5178);
                    rule__Table__AttributesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getAttributesAssignment_2()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2499:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2503:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2504:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__35209);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__4_in_rule__Table__Group__35212);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2511:1: rule__Table__Group__3__Impl : ( '{' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2515:1: ( ( '{' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2516:1: ( '{' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2516:1: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2517:1: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__Table__Group__3__Impl5240); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2530:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2534:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2535:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__45271);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__5_in_rule__Table__Group__45274);
            rule__Table__Group__5();

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2542:1: rule__Table__Group__4__Impl : ( ( rule__Table__FieldsAssignment_4 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2546:1: ( ( ( rule__Table__FieldsAssignment_4 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2547:1: ( ( rule__Table__FieldsAssignment_4 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2547:1: ( ( rule__Table__FieldsAssignment_4 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2548:1: ( rule__Table__FieldsAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getFieldsAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2549:1: ( rule__Table__FieldsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_HASH_ATTRIBUTE && LA23_0<=RULE_ID)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2549:2: rule__Table__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Table__FieldsAssignment_4_in_rule__Table__Group__4__Impl5301);
            	    rule__Table__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getFieldsAssignment_4()); 

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


    // $ANTLR start "rule__Table__Group__5"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2559:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2563:1: ( rule__Table__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2564:2: rule__Table__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__55332);
            rule__Table__Group__5__Impl();

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
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2570:1: rule__Table__Group__5__Impl : ( '}' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2574:1: ( ( '}' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2575:1: ( '}' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2575:1: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2576:1: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__Table__Group__5__Impl5360); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Fields__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2601:1: rule__Fields__Group__0 : rule__Fields__Group__0__Impl rule__Fields__Group__1 ;
    public final void rule__Fields__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2605:1: ( rule__Fields__Group__0__Impl rule__Fields__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2606:2: rule__Fields__Group__0__Impl rule__Fields__Group__1
            {
            pushFollow(FOLLOW_rule__Fields__Group__0__Impl_in_rule__Fields__Group__05403);
            rule__Fields__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__1_in_rule__Fields__Group__05406);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2613:1: rule__Fields__Group__0__Impl : ( ( rule__Fields__NameAssignment_0 ) ) ;
    public final void rule__Fields__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2617:1: ( ( ( rule__Fields__NameAssignment_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2618:1: ( ( rule__Fields__NameAssignment_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2618:1: ( ( rule__Fields__NameAssignment_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2619:1: ( rule__Fields__NameAssignment_0 )
            {
             before(grammarAccess.getFieldsAccess().getNameAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2620:1: ( rule__Fields__NameAssignment_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2620:2: rule__Fields__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fields__NameAssignment_0_in_rule__Fields__Group__0__Impl5433);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2630:1: rule__Fields__Group__1 : rule__Fields__Group__1__Impl rule__Fields__Group__2 ;
    public final void rule__Fields__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2634:1: ( rule__Fields__Group__1__Impl rule__Fields__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2635:2: rule__Fields__Group__1__Impl rule__Fields__Group__2
            {
            pushFollow(FOLLOW_rule__Fields__Group__1__Impl_in_rule__Fields__Group__15463);
            rule__Fields__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__2_in_rule__Fields__Group__15466);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2642:1: rule__Fields__Group__1__Impl : ( ':' ) ;
    public final void rule__Fields__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2646:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2647:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2647:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2648:1: ':'
            {
             before(grammarAccess.getFieldsAccess().getColonKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Fields__Group__1__Impl5494); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2661:1: rule__Fields__Group__2 : rule__Fields__Group__2__Impl rule__Fields__Group__3 ;
    public final void rule__Fields__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2665:1: ( rule__Fields__Group__2__Impl rule__Fields__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2666:2: rule__Fields__Group__2__Impl rule__Fields__Group__3
            {
            pushFollow(FOLLOW_rule__Fields__Group__2__Impl_in_rule__Fields__Group__25525);
            rule__Fields__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__3_in_rule__Fields__Group__25528);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2673:1: rule__Fields__Group__2__Impl : ( ( rule__Fields__TypeAssignment_2 ) ) ;
    public final void rule__Fields__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2677:1: ( ( ( rule__Fields__TypeAssignment_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2678:1: ( ( rule__Fields__TypeAssignment_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2678:1: ( ( rule__Fields__TypeAssignment_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2679:1: ( rule__Fields__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldsAccess().getTypeAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2680:1: ( rule__Fields__TypeAssignment_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2680:2: rule__Fields__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Fields__TypeAssignment_2_in_rule__Fields__Group__2__Impl5555);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2690:1: rule__Fields__Group__3 : rule__Fields__Group__3__Impl rule__Fields__Group__4 ;
    public final void rule__Fields__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2694:1: ( rule__Fields__Group__3__Impl rule__Fields__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2695:2: rule__Fields__Group__3__Impl rule__Fields__Group__4
            {
            pushFollow(FOLLOW_rule__Fields__Group__3__Impl_in_rule__Fields__Group__35585);
            rule__Fields__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__4_in_rule__Fields__Group__35588);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2702:1: rule__Fields__Group__3__Impl : ( ( rule__Fields__Group_3__0 )? ) ;
    public final void rule__Fields__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2706:1: ( ( ( rule__Fields__Group_3__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2707:1: ( ( rule__Fields__Group_3__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2707:1: ( ( rule__Fields__Group_3__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2708:1: ( rule__Fields__Group_3__0 )?
            {
             before(grammarAccess.getFieldsAccess().getGroup_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2709:1: ( rule__Fields__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2709:2: rule__Fields__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fields__Group_3__0_in_rule__Fields__Group__3__Impl5615);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2719:1: rule__Fields__Group__4 : rule__Fields__Group__4__Impl rule__Fields__Group__5 ;
    public final void rule__Fields__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2723:1: ( rule__Fields__Group__4__Impl rule__Fields__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2724:2: rule__Fields__Group__4__Impl rule__Fields__Group__5
            {
            pushFollow(FOLLOW_rule__Fields__Group__4__Impl_in_rule__Fields__Group__45646);
            rule__Fields__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__5_in_rule__Fields__Group__45649);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2731:1: rule__Fields__Group__4__Impl : ( ( rule__Fields__AttributesAssignment_4 )? ) ;
    public final void rule__Fields__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2735:1: ( ( ( rule__Fields__AttributesAssignment_4 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2736:1: ( ( rule__Fields__AttributesAssignment_4 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2736:1: ( ( rule__Fields__AttributesAssignment_4 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2737:1: ( rule__Fields__AttributesAssignment_4 )?
            {
             before(grammarAccess.getFieldsAccess().getAttributesAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2738:1: ( rule__Fields__AttributesAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2738:2: rule__Fields__AttributesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Fields__AttributesAssignment_4_in_rule__Fields__Group__4__Impl5676);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2748:1: rule__Fields__Group__5 : rule__Fields__Group__5__Impl ;
    public final void rule__Fields__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2752:1: ( rule__Fields__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2753:2: rule__Fields__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Fields__Group__5__Impl_in_rule__Fields__Group__55707);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2759:1: rule__Fields__Group__5__Impl : ( ';' ) ;
    public final void rule__Fields__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2763:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2764:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2764:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2765:1: ';'
            {
             before(grammarAccess.getFieldsAccess().getSemicolonKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__Fields__Group__5__Impl5735); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2790:1: rule__Fields__Group_3__0 : rule__Fields__Group_3__0__Impl rule__Fields__Group_3__1 ;
    public final void rule__Fields__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2794:1: ( rule__Fields__Group_3__0__Impl rule__Fields__Group_3__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2795:2: rule__Fields__Group_3__0__Impl rule__Fields__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fields__Group_3__0__Impl_in_rule__Fields__Group_3__05778);
            rule__Fields__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group_3__1_in_rule__Fields__Group_3__05781);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2802:1: rule__Fields__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Fields__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2806:1: ( ( '=' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2807:1: ( '=' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2807:1: ( '=' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2808:1: '='
            {
             before(grammarAccess.getFieldsAccess().getEqualsSignKeyword_3_0()); 
            match(input,42,FOLLOW_42_in_rule__Fields__Group_3__0__Impl5809); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2821:1: rule__Fields__Group_3__1 : rule__Fields__Group_3__1__Impl ;
    public final void rule__Fields__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2825:1: ( rule__Fields__Group_3__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2826:2: rule__Fields__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fields__Group_3__1__Impl_in_rule__Fields__Group_3__15840);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2832:1: rule__Fields__Group_3__1__Impl : ( ( rule__Fields__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__Fields__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2836:1: ( ( ( rule__Fields__DefaultValueAssignment_3_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2837:1: ( ( rule__Fields__DefaultValueAssignment_3_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2837:1: ( ( rule__Fields__DefaultValueAssignment_3_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2838:1: ( rule__Fields__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getFieldsAccess().getDefaultValueAssignment_3_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2839:1: ( rule__Fields__DefaultValueAssignment_3_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2839:2: rule__Fields__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fields__DefaultValueAssignment_3_1_in_rule__Fields__Group_3__1__Impl5867);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2853:1: rule__FieldAttributes__Group__0 : rule__FieldAttributes__Group__0__Impl rule__FieldAttributes__Group__1 ;
    public final void rule__FieldAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2857:1: ( rule__FieldAttributes__Group__0__Impl rule__FieldAttributes__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2858:2: rule__FieldAttributes__Group__0__Impl rule__FieldAttributes__Group__1
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__0__Impl_in_rule__FieldAttributes__Group__05901);
            rule__FieldAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group__1_in_rule__FieldAttributes__Group__05904);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2865:1: rule__FieldAttributes__Group__0__Impl : ( '(' ) ;
    public final void rule__FieldAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2869:1: ( ( '(' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2870:1: ( '(' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2870:1: ( '(' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2871:1: '('
            {
             before(grammarAccess.getFieldAttributesAccess().getLeftParenthesisKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__FieldAttributes__Group__0__Impl5932); 
             after(grammarAccess.getFieldAttributesAccess().getLeftParenthesisKeyword_0()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2884:1: rule__FieldAttributes__Group__1 : rule__FieldAttributes__Group__1__Impl rule__FieldAttributes__Group__2 ;
    public final void rule__FieldAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2888:1: ( rule__FieldAttributes__Group__1__Impl rule__FieldAttributes__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2889:2: rule__FieldAttributes__Group__1__Impl rule__FieldAttributes__Group__2
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__1__Impl_in_rule__FieldAttributes__Group__15963);
            rule__FieldAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group__2_in_rule__FieldAttributes__Group__15966);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2896:1: rule__FieldAttributes__Group__1__Impl : ( ( rule__FieldAttributes__AtributeNamesAssignment_1 ) ) ;
    public final void rule__FieldAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2900:1: ( ( ( rule__FieldAttributes__AtributeNamesAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2901:1: ( ( rule__FieldAttributes__AtributeNamesAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2901:1: ( ( rule__FieldAttributes__AtributeNamesAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2902:1: ( rule__FieldAttributes__AtributeNamesAssignment_1 )
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNamesAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2903:1: ( rule__FieldAttributes__AtributeNamesAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2903:2: rule__FieldAttributes__AtributeNamesAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldAttributes__AtributeNamesAssignment_1_in_rule__FieldAttributes__Group__1__Impl5993);
            rule__FieldAttributes__AtributeNamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAttributesAccess().getAtributeNamesAssignment_1()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2913:1: rule__FieldAttributes__Group__2 : rule__FieldAttributes__Group__2__Impl rule__FieldAttributes__Group__3 ;
    public final void rule__FieldAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2917:1: ( rule__FieldAttributes__Group__2__Impl rule__FieldAttributes__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2918:2: rule__FieldAttributes__Group__2__Impl rule__FieldAttributes__Group__3
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__2__Impl_in_rule__FieldAttributes__Group__26023);
            rule__FieldAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group__3_in_rule__FieldAttributes__Group__26026);
            rule__FieldAttributes__Group__3();

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2925:1: rule__FieldAttributes__Group__2__Impl : ( ( rule__FieldAttributes__Group_2__0 )* ) ;
    public final void rule__FieldAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2929:1: ( ( ( rule__FieldAttributes__Group_2__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2930:1: ( ( rule__FieldAttributes__Group_2__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2930:1: ( ( rule__FieldAttributes__Group_2__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2931:1: ( rule__FieldAttributes__Group_2__0 )*
            {
             before(grammarAccess.getFieldAttributesAccess().getGroup_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2932:1: ( rule__FieldAttributes__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2932:2: rule__FieldAttributes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldAttributes__Group_2__0_in_rule__FieldAttributes__Group__2__Impl6053);
            	    rule__FieldAttributes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFieldAttributesAccess().getGroup_2()); 

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


    // $ANTLR start "rule__FieldAttributes__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2942:1: rule__FieldAttributes__Group__3 : rule__FieldAttributes__Group__3__Impl ;
    public final void rule__FieldAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2946:1: ( rule__FieldAttributes__Group__3__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2947:2: rule__FieldAttributes__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__3__Impl_in_rule__FieldAttributes__Group__36084);
            rule__FieldAttributes__Group__3__Impl();

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
    // $ANTLR end "rule__FieldAttributes__Group__3"


    // $ANTLR start "rule__FieldAttributes__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2953:1: rule__FieldAttributes__Group__3__Impl : ( ')' ) ;
    public final void rule__FieldAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2957:1: ( ( ')' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2958:1: ( ')' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2958:1: ( ')' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2959:1: ')'
            {
             before(grammarAccess.getFieldAttributesAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__FieldAttributes__Group__3__Impl6112); 
             after(grammarAccess.getFieldAttributesAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FieldAttributes__Group__3__Impl"


    // $ANTLR start "rule__FieldAttributes__Group_2__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2980:1: rule__FieldAttributes__Group_2__0 : rule__FieldAttributes__Group_2__0__Impl rule__FieldAttributes__Group_2__1 ;
    public final void rule__FieldAttributes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2984:1: ( rule__FieldAttributes__Group_2__0__Impl rule__FieldAttributes__Group_2__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2985:2: rule__FieldAttributes__Group_2__0__Impl rule__FieldAttributes__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group_2__0__Impl_in_rule__FieldAttributes__Group_2__06151);
            rule__FieldAttributes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group_2__1_in_rule__FieldAttributes__Group_2__06154);
            rule__FieldAttributes__Group_2__1();

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
    // $ANTLR end "rule__FieldAttributes__Group_2__0"


    // $ANTLR start "rule__FieldAttributes__Group_2__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2992:1: rule__FieldAttributes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FieldAttributes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2996:1: ( ( ',' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2997:1: ( ',' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2997:1: ( ',' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2998:1: ','
            {
             before(grammarAccess.getFieldAttributesAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__FieldAttributes__Group_2__0__Impl6182); 
             after(grammarAccess.getFieldAttributesAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__FieldAttributes__Group_2__0__Impl"


    // $ANTLR start "rule__FieldAttributes__Group_2__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3011:1: rule__FieldAttributes__Group_2__1 : rule__FieldAttributes__Group_2__1__Impl ;
    public final void rule__FieldAttributes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3015:1: ( rule__FieldAttributes__Group_2__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3016:2: rule__FieldAttributes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group_2__1__Impl_in_rule__FieldAttributes__Group_2__16213);
            rule__FieldAttributes__Group_2__1__Impl();

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
    // $ANTLR end "rule__FieldAttributes__Group_2__1"


    // $ANTLR start "rule__FieldAttributes__Group_2__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3022:1: rule__FieldAttributes__Group_2__1__Impl : ( ( rule__FieldAttributes__AtributeNamesAssignment_2_1 ) ) ;
    public final void rule__FieldAttributes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3026:1: ( ( ( rule__FieldAttributes__AtributeNamesAssignment_2_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3027:1: ( ( rule__FieldAttributes__AtributeNamesAssignment_2_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3027:1: ( ( rule__FieldAttributes__AtributeNamesAssignment_2_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3028:1: ( rule__FieldAttributes__AtributeNamesAssignment_2_1 )
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNamesAssignment_2_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3029:1: ( rule__FieldAttributes__AtributeNamesAssignment_2_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3029:2: rule__FieldAttributes__AtributeNamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FieldAttributes__AtributeNamesAssignment_2_1_in_rule__FieldAttributes__Group_2__1__Impl6240);
            rule__FieldAttributes__AtributeNamesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAttributesAccess().getAtributeNamesAssignment_2_1()); 

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
    // $ANTLR end "rule__FieldAttributes__Group_2__1__Impl"


    // $ANTLR start "rule__AttributeName__Group_1__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3043:1: rule__AttributeName__Group_1__0 : rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 ;
    public final void rule__AttributeName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3047:1: ( rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3048:2: rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__06274);
            rule__AttributeName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__06277);
            rule__AttributeName__Group_1__1();

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
    // $ANTLR end "rule__AttributeName__Group_1__0"


    // $ANTLR start "rule__AttributeName__Group_1__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3055:1: rule__AttributeName__Group_1__0__Impl : ( ( rule__AttributeName__HasAttributeIdAssignment_1_0 ) ) ;
    public final void rule__AttributeName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3059:1: ( ( ( rule__AttributeName__HasAttributeIdAssignment_1_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3060:1: ( ( rule__AttributeName__HasAttributeIdAssignment_1_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3060:1: ( ( rule__AttributeName__HasAttributeIdAssignment_1_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3061:1: ( rule__AttributeName__HasAttributeIdAssignment_1_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getHasAttributeIdAssignment_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3062:1: ( rule__AttributeName__HasAttributeIdAssignment_1_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3062:2: rule__AttributeName__HasAttributeIdAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AttributeName__HasAttributeIdAssignment_1_0_in_rule__AttributeName__Group_1__0__Impl6304);
            rule__AttributeName__HasAttributeIdAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getHasAttributeIdAssignment_1_0()); 

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
    // $ANTLR end "rule__AttributeName__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeName__Group_1__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3072:1: rule__AttributeName__Group_1__1 : rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2 ;
    public final void rule__AttributeName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3076:1: ( rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3077:2: rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__16334);
            rule__AttributeName__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_1__2_in_rule__AttributeName__Group_1__16337);
            rule__AttributeName__Group_1__2();

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
    // $ANTLR end "rule__AttributeName__Group_1__1"


    // $ANTLR start "rule__AttributeName__Group_1__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3084:1: rule__AttributeName__Group_1__1__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3088:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3089:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3089:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3090:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_1_1()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_1__1__Impl6365); 
             after(grammarAccess.getAttributeNameAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__AttributeName__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeName__Group_1__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3103:1: rule__AttributeName__Group_1__2 : rule__AttributeName__Group_1__2__Impl ;
    public final void rule__AttributeName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3107:1: ( rule__AttributeName__Group_1__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3108:2: rule__AttributeName__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__2__Impl_in_rule__AttributeName__Group_1__26396);
            rule__AttributeName__Group_1__2__Impl();

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
    // $ANTLR end "rule__AttributeName__Group_1__2"


    // $ANTLR start "rule__AttributeName__Group_1__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3114:1: rule__AttributeName__Group_1__2__Impl : ( ( rule__AttributeName__AttributeIdAssignment_1_2 ) ) ;
    public final void rule__AttributeName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3118:1: ( ( ( rule__AttributeName__AttributeIdAssignment_1_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3119:1: ( ( rule__AttributeName__AttributeIdAssignment_1_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3119:1: ( ( rule__AttributeName__AttributeIdAssignment_1_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3120:1: ( rule__AttributeName__AttributeIdAssignment_1_2 )
            {
             before(grammarAccess.getAttributeNameAccess().getAttributeIdAssignment_1_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3121:1: ( rule__AttributeName__AttributeIdAssignment_1_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3121:2: rule__AttributeName__AttributeIdAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AttributeName__AttributeIdAssignment_1_2_in_rule__AttributeName__Group_1__2__Impl6423);
            rule__AttributeName__AttributeIdAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getAttributeIdAssignment_1_2()); 

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
    // $ANTLR end "rule__AttributeName__Group_1__2__Impl"


    // $ANTLR start "rule__AttributeName__Group_4__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3137:1: rule__AttributeName__Group_4__0 : rule__AttributeName__Group_4__0__Impl rule__AttributeName__Group_4__1 ;
    public final void rule__AttributeName__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3141:1: ( rule__AttributeName__Group_4__0__Impl rule__AttributeName__Group_4__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3142:2: rule__AttributeName__Group_4__0__Impl rule__AttributeName__Group_4__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_4__0__Impl_in_rule__AttributeName__Group_4__06459);
            rule__AttributeName__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_4__1_in_rule__AttributeName__Group_4__06462);
            rule__AttributeName__Group_4__1();

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
    // $ANTLR end "rule__AttributeName__Group_4__0"


    // $ANTLR start "rule__AttributeName__Group_4__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3149:1: rule__AttributeName__Group_4__0__Impl : ( ( rule__AttributeName__HasAlignSizeAssignment_4_0 ) ) ;
    public final void rule__AttributeName__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3153:1: ( ( ( rule__AttributeName__HasAlignSizeAssignment_4_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3154:1: ( ( rule__AttributeName__HasAlignSizeAssignment_4_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3154:1: ( ( rule__AttributeName__HasAlignSizeAssignment_4_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3155:1: ( rule__AttributeName__HasAlignSizeAssignment_4_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getHasAlignSizeAssignment_4_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3156:1: ( rule__AttributeName__HasAlignSizeAssignment_4_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3156:2: rule__AttributeName__HasAlignSizeAssignment_4_0
            {
            pushFollow(FOLLOW_rule__AttributeName__HasAlignSizeAssignment_4_0_in_rule__AttributeName__Group_4__0__Impl6489);
            rule__AttributeName__HasAlignSizeAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getHasAlignSizeAssignment_4_0()); 

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
    // $ANTLR end "rule__AttributeName__Group_4__0__Impl"


    // $ANTLR start "rule__AttributeName__Group_4__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3166:1: rule__AttributeName__Group_4__1 : rule__AttributeName__Group_4__1__Impl rule__AttributeName__Group_4__2 ;
    public final void rule__AttributeName__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3170:1: ( rule__AttributeName__Group_4__1__Impl rule__AttributeName__Group_4__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3171:2: rule__AttributeName__Group_4__1__Impl rule__AttributeName__Group_4__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_4__1__Impl_in_rule__AttributeName__Group_4__16519);
            rule__AttributeName__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_4__2_in_rule__AttributeName__Group_4__16522);
            rule__AttributeName__Group_4__2();

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
    // $ANTLR end "rule__AttributeName__Group_4__1"


    // $ANTLR start "rule__AttributeName__Group_4__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3178:1: rule__AttributeName__Group_4__1__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3182:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3183:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3183:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3184:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_4_1()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_4__1__Impl6550); 
             after(grammarAccess.getAttributeNameAccess().getColonKeyword_4_1()); 

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
    // $ANTLR end "rule__AttributeName__Group_4__1__Impl"


    // $ANTLR start "rule__AttributeName__Group_4__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3197:1: rule__AttributeName__Group_4__2 : rule__AttributeName__Group_4__2__Impl ;
    public final void rule__AttributeName__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3201:1: ( rule__AttributeName__Group_4__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3202:2: rule__AttributeName__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_4__2__Impl_in_rule__AttributeName__Group_4__26581);
            rule__AttributeName__Group_4__2__Impl();

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
    // $ANTLR end "rule__AttributeName__Group_4__2"


    // $ANTLR start "rule__AttributeName__Group_4__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3208:1: rule__AttributeName__Group_4__2__Impl : ( ( rule__AttributeName__AlignSizeAssignment_4_2 ) ) ;
    public final void rule__AttributeName__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3212:1: ( ( ( rule__AttributeName__AlignSizeAssignment_4_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3213:1: ( ( rule__AttributeName__AlignSizeAssignment_4_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3213:1: ( ( rule__AttributeName__AlignSizeAssignment_4_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3214:1: ( rule__AttributeName__AlignSizeAssignment_4_2 )
            {
             before(grammarAccess.getAttributeNameAccess().getAlignSizeAssignment_4_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3215:1: ( rule__AttributeName__AlignSizeAssignment_4_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3215:2: rule__AttributeName__AlignSizeAssignment_4_2
            {
            pushFollow(FOLLOW_rule__AttributeName__AlignSizeAssignment_4_2_in_rule__AttributeName__Group_4__2__Impl6608);
            rule__AttributeName__AlignSizeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getAlignSizeAssignment_4_2()); 

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
    // $ANTLR end "rule__AttributeName__Group_4__2__Impl"


    // $ANTLR start "rule__AttributeName__Group_5__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3231:1: rule__AttributeName__Group_5__0 : rule__AttributeName__Group_5__0__Impl rule__AttributeName__Group_5__1 ;
    public final void rule__AttributeName__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3235:1: ( rule__AttributeName__Group_5__0__Impl rule__AttributeName__Group_5__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3236:2: rule__AttributeName__Group_5__0__Impl rule__AttributeName__Group_5__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_5__0__Impl_in_rule__AttributeName__Group_5__06644);
            rule__AttributeName__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_5__1_in_rule__AttributeName__Group_5__06647);
            rule__AttributeName__Group_5__1();

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
    // $ANTLR end "rule__AttributeName__Group_5__0"


    // $ANTLR start "rule__AttributeName__Group_5__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3243:1: rule__AttributeName__Group_5__0__Impl : ( ( rule__AttributeName__HasHashAssignment_5_0 ) ) ;
    public final void rule__AttributeName__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3247:1: ( ( ( rule__AttributeName__HasHashAssignment_5_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3248:1: ( ( rule__AttributeName__HasHashAssignment_5_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3248:1: ( ( rule__AttributeName__HasHashAssignment_5_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3249:1: ( rule__AttributeName__HasHashAssignment_5_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getHasHashAssignment_5_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3250:1: ( rule__AttributeName__HasHashAssignment_5_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3250:2: rule__AttributeName__HasHashAssignment_5_0
            {
            pushFollow(FOLLOW_rule__AttributeName__HasHashAssignment_5_0_in_rule__AttributeName__Group_5__0__Impl6674);
            rule__AttributeName__HasHashAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getHasHashAssignment_5_0()); 

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
    // $ANTLR end "rule__AttributeName__Group_5__0__Impl"


    // $ANTLR start "rule__AttributeName__Group_5__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3260:1: rule__AttributeName__Group_5__1 : rule__AttributeName__Group_5__1__Impl rule__AttributeName__Group_5__2 ;
    public final void rule__AttributeName__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3264:1: ( rule__AttributeName__Group_5__1__Impl rule__AttributeName__Group_5__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3265:2: rule__AttributeName__Group_5__1__Impl rule__AttributeName__Group_5__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_5__1__Impl_in_rule__AttributeName__Group_5__16704);
            rule__AttributeName__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_5__2_in_rule__AttributeName__Group_5__16707);
            rule__AttributeName__Group_5__2();

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
    // $ANTLR end "rule__AttributeName__Group_5__1"


    // $ANTLR start "rule__AttributeName__Group_5__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3272:1: rule__AttributeName__Group_5__1__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3276:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3277:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3277:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3278:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_5_1()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_5__1__Impl6735); 
             after(grammarAccess.getAttributeNameAccess().getColonKeyword_5_1()); 

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
    // $ANTLR end "rule__AttributeName__Group_5__1__Impl"


    // $ANTLR start "rule__AttributeName__Group_5__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3291:1: rule__AttributeName__Group_5__2 : rule__AttributeName__Group_5__2__Impl ;
    public final void rule__AttributeName__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3295:1: ( rule__AttributeName__Group_5__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3296:2: rule__AttributeName__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_5__2__Impl_in_rule__AttributeName__Group_5__26766);
            rule__AttributeName__Group_5__2__Impl();

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
    // $ANTLR end "rule__AttributeName__Group_5__2"


    // $ANTLR start "rule__AttributeName__Group_5__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3302:1: rule__AttributeName__Group_5__2__Impl : ( ( rule__AttributeName__HashKeyAssignment_5_2 ) ) ;
    public final void rule__AttributeName__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3306:1: ( ( ( rule__AttributeName__HashKeyAssignment_5_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3307:1: ( ( rule__AttributeName__HashKeyAssignment_5_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3307:1: ( ( rule__AttributeName__HashKeyAssignment_5_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3308:1: ( rule__AttributeName__HashKeyAssignment_5_2 )
            {
             before(grammarAccess.getAttributeNameAccess().getHashKeyAssignment_5_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3309:1: ( rule__AttributeName__HashKeyAssignment_5_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3309:2: rule__AttributeName__HashKeyAssignment_5_2
            {
            pushFollow(FOLLOW_rule__AttributeName__HashKeyAssignment_5_2_in_rule__AttributeName__Group_5__2__Impl6793);
            rule__AttributeName__HashKeyAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getHashKeyAssignment_5_2()); 

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
    // $ANTLR end "rule__AttributeName__Group_5__2__Impl"


    // $ANTLR start "rule__AttributeName__Group_7__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3325:1: rule__AttributeName__Group_7__0 : rule__AttributeName__Group_7__0__Impl rule__AttributeName__Group_7__1 ;
    public final void rule__AttributeName__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3329:1: ( rule__AttributeName__Group_7__0__Impl rule__AttributeName__Group_7__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3330:2: rule__AttributeName__Group_7__0__Impl rule__AttributeName__Group_7__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_7__0__Impl_in_rule__AttributeName__Group_7__06829);
            rule__AttributeName__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_7__1_in_rule__AttributeName__Group_7__06832);
            rule__AttributeName__Group_7__1();

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
    // $ANTLR end "rule__AttributeName__Group_7__0"


    // $ANTLR start "rule__AttributeName__Group_7__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3337:1: rule__AttributeName__Group_7__0__Impl : ( ( rule__AttributeName__HasNestedTableNameAssignment_7_0 ) ) ;
    public final void rule__AttributeName__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3341:1: ( ( ( rule__AttributeName__HasNestedTableNameAssignment_7_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3342:1: ( ( rule__AttributeName__HasNestedTableNameAssignment_7_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3342:1: ( ( rule__AttributeName__HasNestedTableNameAssignment_7_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3343:1: ( rule__AttributeName__HasNestedTableNameAssignment_7_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getHasNestedTableNameAssignment_7_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3344:1: ( rule__AttributeName__HasNestedTableNameAssignment_7_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3344:2: rule__AttributeName__HasNestedTableNameAssignment_7_0
            {
            pushFollow(FOLLOW_rule__AttributeName__HasNestedTableNameAssignment_7_0_in_rule__AttributeName__Group_7__0__Impl6859);
            rule__AttributeName__HasNestedTableNameAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getHasNestedTableNameAssignment_7_0()); 

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
    // $ANTLR end "rule__AttributeName__Group_7__0__Impl"


    // $ANTLR start "rule__AttributeName__Group_7__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3354:1: rule__AttributeName__Group_7__1 : rule__AttributeName__Group_7__1__Impl rule__AttributeName__Group_7__2 ;
    public final void rule__AttributeName__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3358:1: ( rule__AttributeName__Group_7__1__Impl rule__AttributeName__Group_7__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3359:2: rule__AttributeName__Group_7__1__Impl rule__AttributeName__Group_7__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_7__1__Impl_in_rule__AttributeName__Group_7__16889);
            rule__AttributeName__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_7__2_in_rule__AttributeName__Group_7__16892);
            rule__AttributeName__Group_7__2();

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
    // $ANTLR end "rule__AttributeName__Group_7__1"


    // $ANTLR start "rule__AttributeName__Group_7__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3366:1: rule__AttributeName__Group_7__1__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3370:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3371:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3371:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3372:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_7_1()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_7__1__Impl6920); 
             after(grammarAccess.getAttributeNameAccess().getColonKeyword_7_1()); 

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
    // $ANTLR end "rule__AttributeName__Group_7__1__Impl"


    // $ANTLR start "rule__AttributeName__Group_7__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3385:1: rule__AttributeName__Group_7__2 : rule__AttributeName__Group_7__2__Impl ;
    public final void rule__AttributeName__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3389:1: ( rule__AttributeName__Group_7__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3390:2: rule__AttributeName__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_7__2__Impl_in_rule__AttributeName__Group_7__26951);
            rule__AttributeName__Group_7__2__Impl();

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
    // $ANTLR end "rule__AttributeName__Group_7__2"


    // $ANTLR start "rule__AttributeName__Group_7__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3396:1: rule__AttributeName__Group_7__2__Impl : ( ( rule__AttributeName__NestedTableNameAssignment_7_2 ) ) ;
    public final void rule__AttributeName__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3400:1: ( ( ( rule__AttributeName__NestedTableNameAssignment_7_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3401:1: ( ( rule__AttributeName__NestedTableNameAssignment_7_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3401:1: ( ( rule__AttributeName__NestedTableNameAssignment_7_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3402:1: ( rule__AttributeName__NestedTableNameAssignment_7_2 )
            {
             before(grammarAccess.getAttributeNameAccess().getNestedTableNameAssignment_7_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3403:1: ( rule__AttributeName__NestedTableNameAssignment_7_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3403:2: rule__AttributeName__NestedTableNameAssignment_7_2
            {
            pushFollow(FOLLOW_rule__AttributeName__NestedTableNameAssignment_7_2_in_rule__AttributeName__Group_7__2__Impl6978);
            rule__AttributeName__NestedTableNameAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getNestedTableNameAssignment_7_2()); 

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
    // $ANTLR end "rule__AttributeName__Group_7__2__Impl"


    // $ANTLR start "rule__AttributeName__Group_9__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3419:1: rule__AttributeName__Group_9__0 : rule__AttributeName__Group_9__0__Impl rule__AttributeName__Group_9__1 ;
    public final void rule__AttributeName__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3423:1: ( rule__AttributeName__Group_9__0__Impl rule__AttributeName__Group_9__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3424:2: rule__AttributeName__Group_9__0__Impl rule__AttributeName__Group_9__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_9__0__Impl_in_rule__AttributeName__Group_9__07014);
            rule__AttributeName__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_9__1_in_rule__AttributeName__Group_9__07017);
            rule__AttributeName__Group_9__1();

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
    // $ANTLR end "rule__AttributeName__Group_9__0"


    // $ANTLR start "rule__AttributeName__Group_9__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3431:1: rule__AttributeName__Group_9__0__Impl : ( ( rule__AttributeName__CustomNameAssignment_9_0 ) ) ;
    public final void rule__AttributeName__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3435:1: ( ( ( rule__AttributeName__CustomNameAssignment_9_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3436:1: ( ( rule__AttributeName__CustomNameAssignment_9_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3436:1: ( ( rule__AttributeName__CustomNameAssignment_9_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3437:1: ( rule__AttributeName__CustomNameAssignment_9_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getCustomNameAssignment_9_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3438:1: ( rule__AttributeName__CustomNameAssignment_9_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3438:2: rule__AttributeName__CustomNameAssignment_9_0
            {
            pushFollow(FOLLOW_rule__AttributeName__CustomNameAssignment_9_0_in_rule__AttributeName__Group_9__0__Impl7044);
            rule__AttributeName__CustomNameAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getCustomNameAssignment_9_0()); 

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
    // $ANTLR end "rule__AttributeName__Group_9__0__Impl"


    // $ANTLR start "rule__AttributeName__Group_9__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3448:1: rule__AttributeName__Group_9__1 : rule__AttributeName__Group_9__1__Impl ;
    public final void rule__AttributeName__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3452:1: ( rule__AttributeName__Group_9__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3453:2: rule__AttributeName__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_9__1__Impl_in_rule__AttributeName__Group_9__17074);
            rule__AttributeName__Group_9__1__Impl();

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
    // $ANTLR end "rule__AttributeName__Group_9__1"


    // $ANTLR start "rule__AttributeName__Group_9__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3459:1: rule__AttributeName__Group_9__1__Impl : ( ( rule__AttributeName__Group_9_1__0 )? ) ;
    public final void rule__AttributeName__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3463:1: ( ( ( rule__AttributeName__Group_9_1__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3464:1: ( ( rule__AttributeName__Group_9_1__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3464:1: ( ( rule__AttributeName__Group_9_1__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3465:1: ( rule__AttributeName__Group_9_1__0 )?
            {
             before(grammarAccess.getAttributeNameAccess().getGroup_9_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3466:1: ( rule__AttributeName__Group_9_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3466:2: rule__AttributeName__Group_9_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_9_1__0_in_rule__AttributeName__Group_9__1__Impl7101);
                    rule__AttributeName__Group_9_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeNameAccess().getGroup_9_1()); 

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
    // $ANTLR end "rule__AttributeName__Group_9__1__Impl"


    // $ANTLR start "rule__AttributeName__Group_9_1__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3480:1: rule__AttributeName__Group_9_1__0 : rule__AttributeName__Group_9_1__0__Impl rule__AttributeName__Group_9_1__1 ;
    public final void rule__AttributeName__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3484:1: ( rule__AttributeName__Group_9_1__0__Impl rule__AttributeName__Group_9_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3485:2: rule__AttributeName__Group_9_1__0__Impl rule__AttributeName__Group_9_1__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_9_1__0__Impl_in_rule__AttributeName__Group_9_1__07136);
            rule__AttributeName__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_9_1__1_in_rule__AttributeName__Group_9_1__07139);
            rule__AttributeName__Group_9_1__1();

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
    // $ANTLR end "rule__AttributeName__Group_9_1__0"


    // $ANTLR start "rule__AttributeName__Group_9_1__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3492:1: rule__AttributeName__Group_9_1__0__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3496:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3497:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3497:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3498:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_9_1_0()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_9_1__0__Impl7167); 
             after(grammarAccess.getAttributeNameAccess().getColonKeyword_9_1_0()); 

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
    // $ANTLR end "rule__AttributeName__Group_9_1__0__Impl"


    // $ANTLR start "rule__AttributeName__Group_9_1__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3511:1: rule__AttributeName__Group_9_1__1 : rule__AttributeName__Group_9_1__1__Impl ;
    public final void rule__AttributeName__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3515:1: ( rule__AttributeName__Group_9_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3516:2: rule__AttributeName__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_9_1__1__Impl_in_rule__AttributeName__Group_9_1__17198);
            rule__AttributeName__Group_9_1__1__Impl();

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
    // $ANTLR end "rule__AttributeName__Group_9_1__1"


    // $ANTLR start "rule__AttributeName__Group_9_1__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3522:1: rule__AttributeName__Group_9_1__1__Impl : ( ( rule__AttributeName__Alternatives_9_1_1 ) ) ;
    public final void rule__AttributeName__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3526:1: ( ( ( rule__AttributeName__Alternatives_9_1_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3527:1: ( ( rule__AttributeName__Alternatives_9_1_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3527:1: ( ( rule__AttributeName__Alternatives_9_1_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3528:1: ( rule__AttributeName__Alternatives_9_1_1 )
            {
             before(grammarAccess.getAttributeNameAccess().getAlternatives_9_1_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3529:1: ( rule__AttributeName__Alternatives_9_1_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3529:2: rule__AttributeName__Alternatives_9_1_1
            {
            pushFollow(FOLLOW_rule__AttributeName__Alternatives_9_1_1_in_rule__AttributeName__Group_9_1__1__Impl7225);
            rule__AttributeName__Alternatives_9_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getAlternatives_9_1_1()); 

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
    // $ANTLR end "rule__AttributeName__Group_9_1__1__Impl"


    // $ANTLR start "rule__QualifiedType__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3543:1: rule__QualifiedType__Group__0 : rule__QualifiedType__Group__0__Impl rule__QualifiedType__Group__1 ;
    public final void rule__QualifiedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3547:1: ( rule__QualifiedType__Group__0__Impl rule__QualifiedType__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3548:2: rule__QualifiedType__Group__0__Impl rule__QualifiedType__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedType__Group__0__Impl_in_rule__QualifiedType__Group__07259);
            rule__QualifiedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedType__Group__1_in_rule__QualifiedType__Group__07262);
            rule__QualifiedType__Group__1();

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
    // $ANTLR end "rule__QualifiedType__Group__0"


    // $ANTLR start "rule__QualifiedType__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3555:1: rule__QualifiedType__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3559:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3560:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3560:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3561:1: ruleValidID
            {
             before(grammarAccess.getQualifiedTypeAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedType__Group__0__Impl7289);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedTypeAccess().getValidIDParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedType__Group__0__Impl"


    // $ANTLR start "rule__QualifiedType__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3572:1: rule__QualifiedType__Group__1 : rule__QualifiedType__Group__1__Impl rule__QualifiedType__Group__2 ;
    public final void rule__QualifiedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3576:1: ( rule__QualifiedType__Group__1__Impl rule__QualifiedType__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3577:2: rule__QualifiedType__Group__1__Impl rule__QualifiedType__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedType__Group__1__Impl_in_rule__QualifiedType__Group__17318);
            rule__QualifiedType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedType__Group__2_in_rule__QualifiedType__Group__17321);
            rule__QualifiedType__Group__2();

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
    // $ANTLR end "rule__QualifiedType__Group__1"


    // $ANTLR start "rule__QualifiedType__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3584:1: rule__QualifiedType__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3588:1: ( ( '.' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3589:1: ( '.' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3589:1: ( '.' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3590:1: '.'
            {
             before(grammarAccess.getQualifiedTypeAccess().getFullStopKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__QualifiedType__Group__1__Impl7349); 
             after(grammarAccess.getQualifiedTypeAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedType__Group__1__Impl"


    // $ANTLR start "rule__QualifiedType__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3603:1: rule__QualifiedType__Group__2 : rule__QualifiedType__Group__2__Impl rule__QualifiedType__Group__3 ;
    public final void rule__QualifiedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3607:1: ( rule__QualifiedType__Group__2__Impl rule__QualifiedType__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3608:2: rule__QualifiedType__Group__2__Impl rule__QualifiedType__Group__3
            {
            pushFollow(FOLLOW_rule__QualifiedType__Group__2__Impl_in_rule__QualifiedType__Group__27380);
            rule__QualifiedType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedType__Group__3_in_rule__QualifiedType__Group__27383);
            rule__QualifiedType__Group__3();

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
    // $ANTLR end "rule__QualifiedType__Group__2"


    // $ANTLR start "rule__QualifiedType__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3615:1: rule__QualifiedType__Group__2__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3619:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3620:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3620:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3621:1: ruleValidID
            {
             before(grammarAccess.getQualifiedTypeAccess().getValidIDParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedType__Group__2__Impl7410);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedTypeAccess().getValidIDParserRuleCall_2()); 

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
    // $ANTLR end "rule__QualifiedType__Group__2__Impl"


    // $ANTLR start "rule__QualifiedType__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3632:1: rule__QualifiedType__Group__3 : rule__QualifiedType__Group__3__Impl ;
    public final void rule__QualifiedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3636:1: ( rule__QualifiedType__Group__3__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3637:2: rule__QualifiedType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedType__Group__3__Impl_in_rule__QualifiedType__Group__37439);
            rule__QualifiedType__Group__3__Impl();

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
    // $ANTLR end "rule__QualifiedType__Group__3"


    // $ANTLR start "rule__QualifiedType__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3643:1: rule__QualifiedType__Group__3__Impl : ( ( rule__QualifiedType__Group_3__0 )* ) ;
    public final void rule__QualifiedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3647:1: ( ( ( rule__QualifiedType__Group_3__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3648:1: ( ( rule__QualifiedType__Group_3__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3648:1: ( ( rule__QualifiedType__Group_3__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3649:1: ( rule__QualifiedType__Group_3__0 )*
            {
             before(grammarAccess.getQualifiedTypeAccess().getGroup_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3650:1: ( rule__QualifiedType__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==46) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3650:2: rule__QualifiedType__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedType__Group_3__0_in_rule__QualifiedType__Group__3__Impl7466);
            	    rule__QualifiedType__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getQualifiedTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__QualifiedType__Group__3__Impl"


    // $ANTLR start "rule__QualifiedType__Group_3__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3668:1: rule__QualifiedType__Group_3__0 : rule__QualifiedType__Group_3__0__Impl rule__QualifiedType__Group_3__1 ;
    public final void rule__QualifiedType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3672:1: ( rule__QualifiedType__Group_3__0__Impl rule__QualifiedType__Group_3__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3673:2: rule__QualifiedType__Group_3__0__Impl rule__QualifiedType__Group_3__1
            {
            pushFollow(FOLLOW_rule__QualifiedType__Group_3__0__Impl_in_rule__QualifiedType__Group_3__07505);
            rule__QualifiedType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedType__Group_3__1_in_rule__QualifiedType__Group_3__07508);
            rule__QualifiedType__Group_3__1();

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
    // $ANTLR end "rule__QualifiedType__Group_3__0"


    // $ANTLR start "rule__QualifiedType__Group_3__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3680:1: rule__QualifiedType__Group_3__0__Impl : ( '.' ) ;
    public final void rule__QualifiedType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3684:1: ( ( '.' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3685:1: ( '.' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3685:1: ( '.' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3686:1: '.'
            {
             before(grammarAccess.getQualifiedTypeAccess().getFullStopKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__QualifiedType__Group_3__0__Impl7536); 
             after(grammarAccess.getQualifiedTypeAccess().getFullStopKeyword_3_0()); 

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
    // $ANTLR end "rule__QualifiedType__Group_3__0__Impl"


    // $ANTLR start "rule__QualifiedType__Group_3__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3699:1: rule__QualifiedType__Group_3__1 : rule__QualifiedType__Group_3__1__Impl ;
    public final void rule__QualifiedType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3703:1: ( rule__QualifiedType__Group_3__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3704:2: rule__QualifiedType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedType__Group_3__1__Impl_in_rule__QualifiedType__Group_3__17567);
            rule__QualifiedType__Group_3__1__Impl();

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
    // $ANTLR end "rule__QualifiedType__Group_3__1"


    // $ANTLR start "rule__QualifiedType__Group_3__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3710:1: rule__QualifiedType__Group_3__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3714:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3715:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3715:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3716:1: ruleValidID
            {
             before(grammarAccess.getQualifiedTypeAccess().getValidIDParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedType__Group_3__1__Impl7594);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedTypeAccess().getValidIDParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__QualifiedType__Group_3__1__Impl"


    // $ANTLR start "rule__Vector__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3731:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3735:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3736:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
            {
            pushFollow(FOLLOW_rule__Vector__Group__0__Impl_in_rule__Vector__Group__07627);
            rule__Vector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__1_in_rule__Vector__Group__07630);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3743:1: rule__Vector__Group__0__Impl : ( '[' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3747:1: ( ( '[' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3748:1: ( '[' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3748:1: ( '[' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3749:1: '['
            {
             before(grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Vector__Group__0__Impl7658); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3762:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3766:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3767:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
            {
            pushFollow(FOLLOW_rule__Vector__Group__1__Impl_in_rule__Vector__Group__17689);
            rule__Vector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__2_in_rule__Vector__Group__17692);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3774:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__TypeAssignment_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3778:1: ( ( ( rule__Vector__TypeAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3779:1: ( ( rule__Vector__TypeAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3779:1: ( ( rule__Vector__TypeAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3780:1: ( rule__Vector__TypeAssignment_1 )
            {
             before(grammarAccess.getVectorAccess().getTypeAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3781:1: ( rule__Vector__TypeAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3781:2: rule__Vector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Vector__TypeAssignment_1_in_rule__Vector__Group__1__Impl7719);
            rule__Vector__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getTypeAssignment_1()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3791:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3795:1: ( rule__Vector__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3796:2: rule__Vector__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Vector__Group__2__Impl_in_rule__Vector__Group__27749);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3802:1: rule__Vector__Group__2__Impl : ( ']' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3806:1: ( ( ']' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3807:1: ( ']' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3807:1: ( ']' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3808:1: ']'
            {
             before(grammarAccess.getVectorAccess().getRightSquareBracketKeyword_2()); 
            match(input,48,FOLLOW_48_in_rule__Vector__Group__2__Impl7777); 
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


    // $ANTLR start "rule__Enum__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3827:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3831:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3832:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__07814);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__07817);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3839:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3843:1: ( ( 'enum' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3844:1: ( 'enum' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3844:1: ( 'enum' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3845:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Enum__Group__0__Impl7845); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3858:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3862:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3863:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__17876);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__17879);
            rule__Enum__Group__2();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3870:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3874:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3875:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3875:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3876:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3877:1: ( rule__Enum__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3877:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl7906);
            rule__Enum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3887:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3891:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3892:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__27936);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__27939);
            rule__Enum__Group__3();

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
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3899:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__Group_2__0 )? ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3903:1: ( ( ( rule__Enum__Group_2__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3904:1: ( ( rule__Enum__Group_2__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3904:1: ( ( rule__Enum__Group_2__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3905:1: ( rule__Enum__Group_2__0 )?
            {
             before(grammarAccess.getEnumAccess().getGroup_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3906:1: ( rule__Enum__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3906:2: rule__Enum__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Enum__Group_2__0_in_rule__Enum__Group__2__Impl7966);
                    rule__Enum__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3916:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3920:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3921:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__37997);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__38000);
            rule__Enum__Group__4();

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
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3928:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__AttributesAssignment_3 )? ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3932:1: ( ( ( rule__Enum__AttributesAssignment_3 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3933:1: ( ( rule__Enum__AttributesAssignment_3 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3933:1: ( ( rule__Enum__AttributesAssignment_3 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3934:1: ( rule__Enum__AttributesAssignment_3 )?
            {
             before(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3935:1: ( rule__Enum__AttributesAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3935:2: rule__Enum__AttributesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Enum__AttributesAssignment_3_in_rule__Enum__Group__3__Impl8027);
                    rule__Enum__AttributesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3945:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3949:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3950:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__48058);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__48061);
            rule__Enum__Group__5();

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
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3957:1: rule__Enum__Group__4__Impl : ( '{' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3961:1: ( ( '{' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3962:1: ( '{' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3962:1: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3963:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__Enum__Group__4__Impl8089); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3976:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl rule__Enum__Group__6 ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3980:1: ( rule__Enum__Group__5__Impl rule__Enum__Group__6 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3981:2: rule__Enum__Group__5__Impl rule__Enum__Group__6
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__58120);
            rule__Enum__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__6_in_rule__Enum__Group__58123);
            rule__Enum__Group__6();

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
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3988:1: rule__Enum__Group__5__Impl : ( ( rule__Enum__EnumCasesAssignment_5 ) ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3992:1: ( ( ( rule__Enum__EnumCasesAssignment_5 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3993:1: ( ( rule__Enum__EnumCasesAssignment_5 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3993:1: ( ( rule__Enum__EnumCasesAssignment_5 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3994:1: ( rule__Enum__EnumCasesAssignment_5 )
            {
             before(grammarAccess.getEnumAccess().getEnumCasesAssignment_5()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3995:1: ( rule__Enum__EnumCasesAssignment_5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3995:2: rule__Enum__EnumCasesAssignment_5
            {
            pushFollow(FOLLOW_rule__Enum__EnumCasesAssignment_5_in_rule__Enum__Group__5__Impl8150);
            rule__Enum__EnumCasesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getEnumCasesAssignment_5()); 

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
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__Enum__Group__6"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4005:1: rule__Enum__Group__6 : rule__Enum__Group__6__Impl rule__Enum__Group__7 ;
    public final void rule__Enum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4009:1: ( rule__Enum__Group__6__Impl rule__Enum__Group__7 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4010:2: rule__Enum__Group__6__Impl rule__Enum__Group__7
            {
            pushFollow(FOLLOW_rule__Enum__Group__6__Impl_in_rule__Enum__Group__68180);
            rule__Enum__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__7_in_rule__Enum__Group__68183);
            rule__Enum__Group__7();

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
    // $ANTLR end "rule__Enum__Group__6"


    // $ANTLR start "rule__Enum__Group__6__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4017:1: rule__Enum__Group__6__Impl : ( ( rule__Enum__Group_6__0 )* ) ;
    public final void rule__Enum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4021:1: ( ( ( rule__Enum__Group_6__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4022:1: ( ( rule__Enum__Group_6__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4022:1: ( ( rule__Enum__Group_6__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4023:1: ( rule__Enum__Group_6__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_6()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4024:1: ( rule__Enum__Group_6__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4024:2: rule__Enum__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_6__0_in_rule__Enum__Group__6__Impl8210);
            	    rule__Enum__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Enum__Group__6__Impl"


    // $ANTLR start "rule__Enum__Group__7"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4034:1: rule__Enum__Group__7 : rule__Enum__Group__7__Impl ;
    public final void rule__Enum__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4038:1: ( rule__Enum__Group__7__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4039:2: rule__Enum__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__7__Impl_in_rule__Enum__Group__78241);
            rule__Enum__Group__7__Impl();

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
    // $ANTLR end "rule__Enum__Group__7"


    // $ANTLR start "rule__Enum__Group__7__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4045:1: rule__Enum__Group__7__Impl : ( '}' ) ;
    public final void rule__Enum__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4049:1: ( ( '}' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4050:1: ( '}' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4050:1: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4051:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7()); 
            match(input,39,FOLLOW_39_in_rule__Enum__Group__7__Impl8269); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Enum__Group__7__Impl"


    // $ANTLR start "rule__Enum__Group_2__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4080:1: rule__Enum__Group_2__0 : rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 ;
    public final void rule__Enum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4084:1: ( rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4085:2: rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_2__0__Impl_in_rule__Enum__Group_2__08316);
            rule__Enum__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_2__1_in_rule__Enum__Group_2__08319);
            rule__Enum__Group_2__1();

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
    // $ANTLR end "rule__Enum__Group_2__0"


    // $ANTLR start "rule__Enum__Group_2__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4092:1: rule__Enum__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Enum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4096:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4097:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4097:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4098:1: ':'
            {
             before(grammarAccess.getEnumAccess().getColonKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__Enum__Group_2__0__Impl8347); 
             after(grammarAccess.getEnumAccess().getColonKeyword_2_0()); 

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
    // $ANTLR end "rule__Enum__Group_2__0__Impl"


    // $ANTLR start "rule__Enum__Group_2__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4111:1: rule__Enum__Group_2__1 : rule__Enum__Group_2__1__Impl ;
    public final void rule__Enum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4115:1: ( rule__Enum__Group_2__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4116:2: rule__Enum__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_2__1__Impl_in_rule__Enum__Group_2__18378);
            rule__Enum__Group_2__1__Impl();

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
    // $ANTLR end "rule__Enum__Group_2__1"


    // $ANTLR start "rule__Enum__Group_2__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4122:1: rule__Enum__Group_2__1__Impl : ( ( rule__Enum__TypeAssignment_2_1 ) ) ;
    public final void rule__Enum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4126:1: ( ( ( rule__Enum__TypeAssignment_2_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4127:1: ( ( rule__Enum__TypeAssignment_2_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4127:1: ( ( rule__Enum__TypeAssignment_2_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4128:1: ( rule__Enum__TypeAssignment_2_1 )
            {
             before(grammarAccess.getEnumAccess().getTypeAssignment_2_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4129:1: ( rule__Enum__TypeAssignment_2_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4129:2: rule__Enum__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Enum__TypeAssignment_2_1_in_rule__Enum__Group_2__1__Impl8405);
            rule__Enum__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Enum__Group_2__1__Impl"


    // $ANTLR start "rule__Enum__Group_6__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4143:1: rule__Enum__Group_6__0 : rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1 ;
    public final void rule__Enum__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4147:1: ( rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4148:2: rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_6__0__Impl_in_rule__Enum__Group_6__08439);
            rule__Enum__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_6__1_in_rule__Enum__Group_6__08442);
            rule__Enum__Group_6__1();

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
    // $ANTLR end "rule__Enum__Group_6__0"


    // $ANTLR start "rule__Enum__Group_6__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4155:1: rule__Enum__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4159:1: ( ( ',' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4160:1: ( ',' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4160:1: ( ',' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4161:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_6_0()); 
            match(input,45,FOLLOW_45_in_rule__Enum__Group_6__0__Impl8470); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Enum__Group_6__0__Impl"


    // $ANTLR start "rule__Enum__Group_6__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4174:1: rule__Enum__Group_6__1 : rule__Enum__Group_6__1__Impl ;
    public final void rule__Enum__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4178:1: ( rule__Enum__Group_6__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4179:2: rule__Enum__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_6__1__Impl_in_rule__Enum__Group_6__18501);
            rule__Enum__Group_6__1__Impl();

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
    // $ANTLR end "rule__Enum__Group_6__1"


    // $ANTLR start "rule__Enum__Group_6__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4185:1: rule__Enum__Group_6__1__Impl : ( ( rule__Enum__EnumCasesAssignment_6_1 ) ) ;
    public final void rule__Enum__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4189:1: ( ( ( rule__Enum__EnumCasesAssignment_6_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4190:1: ( ( rule__Enum__EnumCasesAssignment_6_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4190:1: ( ( rule__Enum__EnumCasesAssignment_6_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4191:1: ( rule__Enum__EnumCasesAssignment_6_1 )
            {
             before(grammarAccess.getEnumAccess().getEnumCasesAssignment_6_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4192:1: ( rule__Enum__EnumCasesAssignment_6_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4192:2: rule__Enum__EnumCasesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Enum__EnumCasesAssignment_6_1_in_rule__Enum__Group_6__1__Impl8528);
            rule__Enum__EnumCasesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getEnumCasesAssignment_6_1()); 

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
    // $ANTLR end "rule__Enum__Group_6__1__Impl"


    // $ANTLR start "rule__EnumCase__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4206:1: rule__EnumCase__Group__0 : rule__EnumCase__Group__0__Impl rule__EnumCase__Group__1 ;
    public final void rule__EnumCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4210:1: ( rule__EnumCase__Group__0__Impl rule__EnumCase__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4211:2: rule__EnumCase__Group__0__Impl rule__EnumCase__Group__1
            {
            pushFollow(FOLLOW_rule__EnumCase__Group__0__Impl_in_rule__EnumCase__Group__08562);
            rule__EnumCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumCase__Group__1_in_rule__EnumCase__Group__08565);
            rule__EnumCase__Group__1();

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
    // $ANTLR end "rule__EnumCase__Group__0"


    // $ANTLR start "rule__EnumCase__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4218:1: rule__EnumCase__Group__0__Impl : ( ( rule__EnumCase__NameAssignment_0 ) ) ;
    public final void rule__EnumCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4222:1: ( ( ( rule__EnumCase__NameAssignment_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4223:1: ( ( rule__EnumCase__NameAssignment_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4223:1: ( ( rule__EnumCase__NameAssignment_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4224:1: ( rule__EnumCase__NameAssignment_0 )
            {
             before(grammarAccess.getEnumCaseAccess().getNameAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4225:1: ( rule__EnumCase__NameAssignment_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4225:2: rule__EnumCase__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumCase__NameAssignment_0_in_rule__EnumCase__Group__0__Impl8592);
            rule__EnumCase__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumCaseAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__EnumCase__Group__0__Impl"


    // $ANTLR start "rule__EnumCase__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4235:1: rule__EnumCase__Group__1 : rule__EnumCase__Group__1__Impl ;
    public final void rule__EnumCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4239:1: ( rule__EnumCase__Group__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4240:2: rule__EnumCase__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumCase__Group__1__Impl_in_rule__EnumCase__Group__18622);
            rule__EnumCase__Group__1__Impl();

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
    // $ANTLR end "rule__EnumCase__Group__1"


    // $ANTLR start "rule__EnumCase__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4246:1: rule__EnumCase__Group__1__Impl : ( ( rule__EnumCase__Group_1__0 )? ) ;
    public final void rule__EnumCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4250:1: ( ( ( rule__EnumCase__Group_1__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4251:1: ( ( rule__EnumCase__Group_1__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4251:1: ( ( rule__EnumCase__Group_1__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4252:1: ( rule__EnumCase__Group_1__0 )?
            {
             before(grammarAccess.getEnumCaseAccess().getGroup_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4253:1: ( rule__EnumCase__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4253:2: rule__EnumCase__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumCase__Group_1__0_in_rule__EnumCase__Group__1__Impl8649);
                    rule__EnumCase__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumCaseAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EnumCase__Group__1__Impl"


    // $ANTLR start "rule__EnumCase__Group_1__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4267:1: rule__EnumCase__Group_1__0 : rule__EnumCase__Group_1__0__Impl rule__EnumCase__Group_1__1 ;
    public final void rule__EnumCase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4271:1: ( rule__EnumCase__Group_1__0__Impl rule__EnumCase__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4272:2: rule__EnumCase__Group_1__0__Impl rule__EnumCase__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumCase__Group_1__0__Impl_in_rule__EnumCase__Group_1__08684);
            rule__EnumCase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumCase__Group_1__1_in_rule__EnumCase__Group_1__08687);
            rule__EnumCase__Group_1__1();

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
    // $ANTLR end "rule__EnumCase__Group_1__0"


    // $ANTLR start "rule__EnumCase__Group_1__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4279:1: rule__EnumCase__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumCase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4283:1: ( ( '=' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4284:1: ( '=' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4284:1: ( '=' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4285:1: '='
            {
             before(grammarAccess.getEnumCaseAccess().getEqualsSignKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__EnumCase__Group_1__0__Impl8715); 
             after(grammarAccess.getEnumCaseAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__EnumCase__Group_1__0__Impl"


    // $ANTLR start "rule__EnumCase__Group_1__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4298:1: rule__EnumCase__Group_1__1 : rule__EnumCase__Group_1__1__Impl ;
    public final void rule__EnumCase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4302:1: ( rule__EnumCase__Group_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4303:2: rule__EnumCase__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumCase__Group_1__1__Impl_in_rule__EnumCase__Group_1__18746);
            rule__EnumCase__Group_1__1__Impl();

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
    // $ANTLR end "rule__EnumCase__Group_1__1"


    // $ANTLR start "rule__EnumCase__Group_1__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4309:1: rule__EnumCase__Group_1__1__Impl : ( ( rule__EnumCase__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumCase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4313:1: ( ( ( rule__EnumCase__ValueAssignment_1_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4314:1: ( ( rule__EnumCase__ValueAssignment_1_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4314:1: ( ( rule__EnumCase__ValueAssignment_1_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4315:1: ( rule__EnumCase__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumCaseAccess().getValueAssignment_1_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4316:1: ( rule__EnumCase__ValueAssignment_1_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4316:2: rule__EnumCase__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumCase__ValueAssignment_1_1_in_rule__EnumCase__Group_1__1__Impl8773);
            rule__EnumCase__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumCaseAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__EnumCase__Group_1__1__Impl"


    // $ANTLR start "rule__Union__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4330:1: rule__Union__Group__0 : rule__Union__Group__0__Impl rule__Union__Group__1 ;
    public final void rule__Union__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4334:1: ( rule__Union__Group__0__Impl rule__Union__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4335:2: rule__Union__Group__0__Impl rule__Union__Group__1
            {
            pushFollow(FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__08807);
            rule__Union__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__1_in_rule__Union__Group__08810);
            rule__Union__Group__1();

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
    // $ANTLR end "rule__Union__Group__0"


    // $ANTLR start "rule__Union__Group__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4342:1: rule__Union__Group__0__Impl : ( 'union' ) ;
    public final void rule__Union__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4346:1: ( ( 'union' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4347:1: ( 'union' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4347:1: ( 'union' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4348:1: 'union'
            {
             before(grammarAccess.getUnionAccess().getUnionKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Union__Group__0__Impl8838); 
             after(grammarAccess.getUnionAccess().getUnionKeyword_0()); 

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
    // $ANTLR end "rule__Union__Group__0__Impl"


    // $ANTLR start "rule__Union__Group__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4361:1: rule__Union__Group__1 : rule__Union__Group__1__Impl rule__Union__Group__2 ;
    public final void rule__Union__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4365:1: ( rule__Union__Group__1__Impl rule__Union__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4366:2: rule__Union__Group__1__Impl rule__Union__Group__2
            {
            pushFollow(FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__18869);
            rule__Union__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__2_in_rule__Union__Group__18872);
            rule__Union__Group__2();

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
    // $ANTLR end "rule__Union__Group__1"


    // $ANTLR start "rule__Union__Group__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4373:1: rule__Union__Group__1__Impl : ( ( rule__Union__NameAssignment_1 ) ) ;
    public final void rule__Union__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4377:1: ( ( ( rule__Union__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4378:1: ( ( rule__Union__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4378:1: ( ( rule__Union__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4379:1: ( rule__Union__NameAssignment_1 )
            {
             before(grammarAccess.getUnionAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4380:1: ( rule__Union__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4380:2: rule__Union__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Union__NameAssignment_1_in_rule__Union__Group__1__Impl8899);
            rule__Union__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Union__Group__1__Impl"


    // $ANTLR start "rule__Union__Group__2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4390:1: rule__Union__Group__2 : rule__Union__Group__2__Impl rule__Union__Group__3 ;
    public final void rule__Union__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4394:1: ( rule__Union__Group__2__Impl rule__Union__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4395:2: rule__Union__Group__2__Impl rule__Union__Group__3
            {
            pushFollow(FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__28929);
            rule__Union__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__3_in_rule__Union__Group__28932);
            rule__Union__Group__3();

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
    // $ANTLR end "rule__Union__Group__2"


    // $ANTLR start "rule__Union__Group__2__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4402:1: rule__Union__Group__2__Impl : ( '{' ) ;
    public final void rule__Union__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4406:1: ( ( '{' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4407:1: ( '{' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4407:1: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4408:1: '{'
            {
             before(grammarAccess.getUnionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Union__Group__2__Impl8960); 
             after(grammarAccess.getUnionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Union__Group__2__Impl"


    // $ANTLR start "rule__Union__Group__3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4421:1: rule__Union__Group__3 : rule__Union__Group__3__Impl rule__Union__Group__4 ;
    public final void rule__Union__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4425:1: ( rule__Union__Group__3__Impl rule__Union__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4426:2: rule__Union__Group__3__Impl rule__Union__Group__4
            {
            pushFollow(FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__38991);
            rule__Union__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__4_in_rule__Union__Group__38994);
            rule__Union__Group__4();

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
    // $ANTLR end "rule__Union__Group__3"


    // $ANTLR start "rule__Union__Group__3__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4433:1: rule__Union__Group__3__Impl : ( ( rule__Union__UnionCasesAssignment_3 ) ) ;
    public final void rule__Union__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4437:1: ( ( ( rule__Union__UnionCasesAssignment_3 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4438:1: ( ( rule__Union__UnionCasesAssignment_3 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4438:1: ( ( rule__Union__UnionCasesAssignment_3 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4439:1: ( rule__Union__UnionCasesAssignment_3 )
            {
             before(grammarAccess.getUnionAccess().getUnionCasesAssignment_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4440:1: ( rule__Union__UnionCasesAssignment_3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4440:2: rule__Union__UnionCasesAssignment_3
            {
            pushFollow(FOLLOW_rule__Union__UnionCasesAssignment_3_in_rule__Union__Group__3__Impl9021);
            rule__Union__UnionCasesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUnionAccess().getUnionCasesAssignment_3()); 

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
    // $ANTLR end "rule__Union__Group__3__Impl"


    // $ANTLR start "rule__Union__Group__4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4450:1: rule__Union__Group__4 : rule__Union__Group__4__Impl rule__Union__Group__5 ;
    public final void rule__Union__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4454:1: ( rule__Union__Group__4__Impl rule__Union__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4455:2: rule__Union__Group__4__Impl rule__Union__Group__5
            {
            pushFollow(FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__49051);
            rule__Union__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__5_in_rule__Union__Group__49054);
            rule__Union__Group__5();

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
    // $ANTLR end "rule__Union__Group__4"


    // $ANTLR start "rule__Union__Group__4__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4462:1: rule__Union__Group__4__Impl : ( ( rule__Union__Group_4__0 )* ) ;
    public final void rule__Union__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4466:1: ( ( ( rule__Union__Group_4__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4467:1: ( ( rule__Union__Group_4__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4467:1: ( ( rule__Union__Group_4__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4468:1: ( rule__Union__Group_4__0 )*
            {
             before(grammarAccess.getUnionAccess().getGroup_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4469:1: ( rule__Union__Group_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==45) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4469:2: rule__Union__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Union__Group_4__0_in_rule__Union__Group__4__Impl9081);
            	    rule__Union__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getUnionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Union__Group__4__Impl"


    // $ANTLR start "rule__Union__Group__5"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4479:1: rule__Union__Group__5 : rule__Union__Group__5__Impl ;
    public final void rule__Union__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4483:1: ( rule__Union__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4484:2: rule__Union__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__59112);
            rule__Union__Group__5__Impl();

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
    // $ANTLR end "rule__Union__Group__5"


    // $ANTLR start "rule__Union__Group__5__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4490:1: rule__Union__Group__5__Impl : ( '}' ) ;
    public final void rule__Union__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4494:1: ( ( '}' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4495:1: ( '}' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4495:1: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4496:1: '}'
            {
             before(grammarAccess.getUnionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__Union__Group__5__Impl9140); 
             after(grammarAccess.getUnionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Union__Group__5__Impl"


    // $ANTLR start "rule__Union__Group_4__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4521:1: rule__Union__Group_4__0 : rule__Union__Group_4__0__Impl rule__Union__Group_4__1 ;
    public final void rule__Union__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4525:1: ( rule__Union__Group_4__0__Impl rule__Union__Group_4__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4526:2: rule__Union__Group_4__0__Impl rule__Union__Group_4__1
            {
            pushFollow(FOLLOW_rule__Union__Group_4__0__Impl_in_rule__Union__Group_4__09183);
            rule__Union__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group_4__1_in_rule__Union__Group_4__09186);
            rule__Union__Group_4__1();

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
    // $ANTLR end "rule__Union__Group_4__0"


    // $ANTLR start "rule__Union__Group_4__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4533:1: rule__Union__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Union__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4537:1: ( ( ',' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4538:1: ( ',' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4538:1: ( ',' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4539:1: ','
            {
             before(grammarAccess.getUnionAccess().getCommaKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__Union__Group_4__0__Impl9214); 
             after(grammarAccess.getUnionAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Union__Group_4__0__Impl"


    // $ANTLR start "rule__Union__Group_4__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4552:1: rule__Union__Group_4__1 : rule__Union__Group_4__1__Impl ;
    public final void rule__Union__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4556:1: ( rule__Union__Group_4__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4557:2: rule__Union__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Union__Group_4__1__Impl_in_rule__Union__Group_4__19245);
            rule__Union__Group_4__1__Impl();

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
    // $ANTLR end "rule__Union__Group_4__1"


    // $ANTLR start "rule__Union__Group_4__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4563:1: rule__Union__Group_4__1__Impl : ( ( rule__Union__UnionCasesAssignment_4_1 ) ) ;
    public final void rule__Union__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4567:1: ( ( ( rule__Union__UnionCasesAssignment_4_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4568:1: ( ( rule__Union__UnionCasesAssignment_4_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4568:1: ( ( rule__Union__UnionCasesAssignment_4_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4569:1: ( rule__Union__UnionCasesAssignment_4_1 )
            {
             before(grammarAccess.getUnionAccess().getUnionCasesAssignment_4_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4570:1: ( rule__Union__UnionCasesAssignment_4_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4570:2: rule__Union__UnionCasesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Union__UnionCasesAssignment_4_1_in_rule__Union__Group_4__1__Impl9272);
            rule__Union__UnionCasesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionAccess().getUnionCasesAssignment_4_1()); 

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
    // $ANTLR end "rule__Union__Group_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4584:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4588:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4589:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09306);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09309);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4596:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4600:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4601:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4601:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4602:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl9336);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4613:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4617:1: ( rule__QualifiedName__Group__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4618:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19365);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4624:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4628:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4629:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4629:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4630:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4631:1: ( rule__QualifiedName__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==46) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4631:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9392);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4645:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4649:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4650:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09427);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09430);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4657:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4661:1: ( ( '.' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4662:1: ( '.' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4662:1: ( '.' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4663:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__QualifiedName__Group_1__0__Impl9458); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4676:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4680:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4681:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19489);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4687:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4691:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4692:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4692:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4693:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl9516);
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


    // $ANTLR start "rule__Number__Group_1__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4708:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4712:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4713:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__09549);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__09552);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4720:1: rule__Number__Group_1__0__Impl : ( ( rule__Number__Alternatives_1_0 ) ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4724:1: ( ( ( rule__Number__Alternatives_1_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4725:1: ( ( rule__Number__Alternatives_1_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4725:1: ( ( rule__Number__Alternatives_1_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4726:1: ( rule__Number__Alternatives_1_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4727:1: ( rule__Number__Alternatives_1_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4727:2: rule__Number__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl9579);
            rule__Number__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1_0()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4737:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4741:1: ( rule__Number__Group_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4742:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__19609);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4748:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__Group_1_1__0 )? ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4752:1: ( ( ( rule__Number__Group_1_1__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4753:1: ( ( rule__Number__Group_1_1__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4753:1: ( ( rule__Number__Group_1_1__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4754:1: ( rule__Number__Group_1_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4755:1: ( rule__Number__Group_1_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4755:2: rule__Number__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl9636);
                    rule__Number__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_1_1()); 

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


    // $ANTLR start "rule__Number__Group_1_1__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4769:1: rule__Number__Group_1_1__0 : rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 ;
    public final void rule__Number__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4773:1: ( rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4774:2: rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__09671);
            rule__Number__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__09674);
            rule__Number__Group_1_1__1();

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
    // $ANTLR end "rule__Number__Group_1_1__0"


    // $ANTLR start "rule__Number__Group_1_1__0__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4781:1: rule__Number__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4785:1: ( ( '.' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4786:1: ( '.' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4786:1: ( '.' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4787:1: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Number__Group_1_1__0__Impl9702); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Number__Group_1_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1_1__1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4800:1: rule__Number__Group_1_1__1 : rule__Number__Group_1_1__1__Impl ;
    public final void rule__Number__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4804:1: ( rule__Number__Group_1_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4805:2: rule__Number__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__19733);
            rule__Number__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Number__Group_1_1__1"


    // $ANTLR start "rule__Number__Group_1_1__1__Impl"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4811:1: rule__Number__Group_1_1__1__Impl : ( ( rule__Number__Alternatives_1_1_1 ) ) ;
    public final void rule__Number__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4815:1: ( ( ( rule__Number__Alternatives_1_1_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4816:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4816:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4817:1: ( rule__Number__Alternatives_1_1_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4818:1: ( rule__Number__Alternatives_1_1_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4818:2: rule__Number__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl9760);
            rule__Number__Alternatives_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 

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
    // $ANTLR end "rule__Number__Group_1_1__1__Impl"


    // $ANTLR start "rule__Schema__IncludesAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4833:1: rule__Schema__IncludesAssignment_0 : ( ruleInclude ) ;
    public final void rule__Schema__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4837:1: ( ( ruleInclude ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4838:1: ( ruleInclude )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4838:1: ( ruleInclude )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4839:1: ruleInclude
            {
             before(grammarAccess.getSchemaAccess().getIncludesIncludeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__Schema__IncludesAssignment_09799);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4848:1: rule__Schema__NamepsaceAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Schema__NamepsaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4852:1: ( ( ruleNamespace ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4853:1: ( ruleNamespace )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4853:1: ( ruleNamespace )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4854:1: ruleNamespace
            {
             before(grammarAccess.getSchemaAccess().getNamepsaceNamespaceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__Schema__NamepsaceAssignment_19830);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4863:1: rule__Schema__FileIdentifierAssignment_2 : ( ruleFileIdentifier ) ;
    public final void rule__Schema__FileIdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4867:1: ( ( ruleFileIdentifier ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4868:1: ( ruleFileIdentifier )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4868:1: ( ruleFileIdentifier )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4869:1: ruleFileIdentifier
            {
             before(grammarAccess.getSchemaAccess().getFileIdentifierFileIdentifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFileIdentifier_in_rule__Schema__FileIdentifierAssignment_29861);
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


    // $ANTLR start "rule__Schema__File_extensionAssignment_3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4878:1: rule__Schema__File_extensionAssignment_3 : ( ruleFileExtension ) ;
    public final void rule__Schema__File_extensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4882:1: ( ( ruleFileExtension ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4883:1: ( ruleFileExtension )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4883:1: ( ruleFileExtension )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4884:1: ruleFileExtension
            {
             before(grammarAccess.getSchemaAccess().getFile_extensionFileExtensionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFileExtension_in_rule__Schema__File_extensionAssignment_39892);
            ruleFileExtension();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getFile_extensionFileExtensionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Schema__File_extensionAssignment_3"


    // $ANTLR start "rule__Schema__CustomAttributesAssignment_4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4893:1: rule__Schema__CustomAttributesAssignment_4 : ( ruleCustomAttributes ) ;
    public final void rule__Schema__CustomAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4897:1: ( ( ruleCustomAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4898:1: ( ruleCustomAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4898:1: ( ruleCustomAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4899:1: ruleCustomAttributes
            {
             before(grammarAccess.getSchemaAccess().getCustomAttributesCustomAttributesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCustomAttributes_in_rule__Schema__CustomAttributesAssignment_49923);
            ruleCustomAttributes();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getCustomAttributesCustomAttributesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Schema__CustomAttributesAssignment_4"


    // $ANTLR start "rule__Schema__DefinitionsAssignment_5"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4908:1: rule__Schema__DefinitionsAssignment_5 : ( ruleDefinition ) ;
    public final void rule__Schema__DefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4912:1: ( ( ruleDefinition ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4913:1: ( ruleDefinition )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4913:1: ( ruleDefinition )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4914:1: ruleDefinition
            {
             before(grammarAccess.getSchemaAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__Schema__DefinitionsAssignment_59954);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Schema__DefinitionsAssignment_5"


    // $ANTLR start "rule__Schema__RootTypeAssignment_6"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4923:1: rule__Schema__RootTypeAssignment_6 : ( ruleRootType ) ;
    public final void rule__Schema__RootTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4927:1: ( ( ruleRootType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4928:1: ( ruleRootType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4928:1: ( ruleRootType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4929:1: ruleRootType
            {
             before(grammarAccess.getSchemaAccess().getRootTypeRootTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRootType_in_rule__Schema__RootTypeAssignment_69985);
            ruleRootType();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getRootTypeRootTypeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Schema__RootTypeAssignment_6"


    // $ANTLR start "rule__RootType__TypeAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4938:1: rule__RootType__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RootType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4942:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4943:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4943:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4944:1: ( RULE_ID )
            {
             before(grammarAccess.getRootTypeAccess().getTypeTableCrossReference_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4945:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4946:1: RULE_ID
            {
             before(grammarAccess.getRootTypeAccess().getTypeTableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RootType__TypeAssignment_110020); 
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


    // $ANTLR start "rule__CustomAttributes__NameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4957:1: rule__CustomAttributes__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomAttributes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4961:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4962:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4962:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4963:1: RULE_STRING
            {
             before(grammarAccess.getCustomAttributesAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomAttributes__NameAssignment_110055); 
             after(grammarAccess.getCustomAttributesAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CustomAttributes__NameAssignment_1"


    // $ANTLR start "rule__Namespace__NameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4972:1: rule__Namespace__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4976:1: ( ( ruleQualifiedName ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4977:1: ( ruleQualifiedName )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4977:1: ( ruleQualifiedName )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4978:1: ruleQualifiedName
            {
             before(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Namespace__NameAssignment_110086);
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


    // $ANTLR start "rule__Struct__NameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4987:1: rule__Struct__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Struct__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4991:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4992:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4992:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4993:1: RULE_ID
            {
             before(grammarAccess.getStructAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Struct__NameAssignment_110117); 
             after(grammarAccess.getStructAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Struct__NameAssignment_1"


    // $ANTLR start "rule__Struct__AttributesAssignment_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5002:1: rule__Struct__AttributesAssignment_2 : ( ruleFieldAttributes ) ;
    public final void rule__Struct__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5006:1: ( ( ruleFieldAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5007:1: ( ruleFieldAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5007:1: ( ruleFieldAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5008:1: ruleFieldAttributes
            {
             before(grammarAccess.getStructAccess().getAttributesFieldAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_rule__Struct__AttributesAssignment_210148);
            ruleFieldAttributes();

            state._fsp--;

             after(grammarAccess.getStructAccess().getAttributesFieldAttributesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Struct__AttributesAssignment_2"


    // $ANTLR start "rule__Struct__FieldsAssignment_4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5017:1: rule__Struct__FieldsAssignment_4 : ( ruleStructFields ) ;
    public final void rule__Struct__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5021:1: ( ( ruleStructFields ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5022:1: ( ruleStructFields )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5022:1: ( ruleStructFields )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5023:1: ruleStructFields
            {
             before(grammarAccess.getStructAccess().getFieldsStructFieldsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStructFields_in_rule__Struct__FieldsAssignment_410179);
            ruleStructFields();

            state._fsp--;

             after(grammarAccess.getStructAccess().getFieldsStructFieldsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Struct__FieldsAssignment_4"


    // $ANTLR start "rule__StructFields__NameAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5032:1: rule__StructFields__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StructFields__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5036:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5037:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5037:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5038:1: RULE_ID
            {
             before(grammarAccess.getStructFieldsAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructFields__NameAssignment_010210); 
             after(grammarAccess.getStructFieldsAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__StructFields__NameAssignment_0"


    // $ANTLR start "rule__StructFields__PrimTypeAssignment_2_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5047:1: rule__StructFields__PrimTypeAssignment_2_0 : ( rulePrimitiveWithoutString ) ;
    public final void rule__StructFields__PrimTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5051:1: ( ( rulePrimitiveWithoutString ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5052:1: ( rulePrimitiveWithoutString )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5052:1: ( rulePrimitiveWithoutString )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5053:1: rulePrimitiveWithoutString
            {
             before(grammarAccess.getStructFieldsAccess().getPrimTypePrimitiveWithoutStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_rulePrimitiveWithoutString_in_rule__StructFields__PrimTypeAssignment_2_010241);
            rulePrimitiveWithoutString();

            state._fsp--;

             after(grammarAccess.getStructFieldsAccess().getPrimTypePrimitiveWithoutStringParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__StructFields__PrimTypeAssignment_2_0"


    // $ANTLR start "rule__StructFields__DefTypeAssignment_2_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5062:1: rule__StructFields__DefTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__StructFields__DefTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5066:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5067:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5067:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5068:1: ( RULE_ID )
            {
             before(grammarAccess.getStructFieldsAccess().getDefTypeDefinitionCrossReference_2_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5069:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5070:1: RULE_ID
            {
             before(grammarAccess.getStructFieldsAccess().getDefTypeDefinitionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructFields__DefTypeAssignment_2_110276); 
             after(grammarAccess.getStructFieldsAccess().getDefTypeDefinitionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStructFieldsAccess().getDefTypeDefinitionCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__StructFields__DefTypeAssignment_2_1"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5081:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5085:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5086:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5086:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5087:1: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Table__NameAssignment_110311); 
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


    // $ANTLR start "rule__Table__AttributesAssignment_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5096:1: rule__Table__AttributesAssignment_2 : ( ruleFieldAttributes ) ;
    public final void rule__Table__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5100:1: ( ( ruleFieldAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5101:1: ( ruleFieldAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5101:1: ( ruleFieldAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5102:1: ruleFieldAttributes
            {
             before(grammarAccess.getTableAccess().getAttributesFieldAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_rule__Table__AttributesAssignment_210342);
            ruleFieldAttributes();

            state._fsp--;

             after(grammarAccess.getTableAccess().getAttributesFieldAttributesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Table__AttributesAssignment_2"


    // $ANTLR start "rule__Table__FieldsAssignment_4"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5111:1: rule__Table__FieldsAssignment_4 : ( ruleFields ) ;
    public final void rule__Table__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5115:1: ( ( ruleFields ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5116:1: ( ruleFields )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5116:1: ( ruleFields )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5117:1: ruleFields
            {
             before(grammarAccess.getTableAccess().getFieldsFieldsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFields_in_rule__Table__FieldsAssignment_410373);
            ruleFields();

            state._fsp--;

             after(grammarAccess.getTableAccess().getFieldsFieldsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Table__FieldsAssignment_4"


    // $ANTLR start "rule__Fields__NameAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5126:1: rule__Fields__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__Fields__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5130:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5131:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5131:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5132:1: ruleValidID
            {
             before(grammarAccess.getFieldsAccess().getNameValidIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Fields__NameAssignment_010404);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getFieldsAccess().getNameValidIDParserRuleCall_0_0()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5141:1: rule__Fields__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Fields__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5145:1: ( ( ruleType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5146:1: ( ruleType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5146:1: ( ruleType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5147:1: ruleType
            {
             before(grammarAccess.getFieldsAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Fields__TypeAssignment_210435);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5156:1: rule__Fields__DefaultValueAssignment_3_1 : ( ruleValue ) ;
    public final void rule__Fields__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5160:1: ( ( ruleValue ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5161:1: ( ruleValue )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5161:1: ( ruleValue )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5162:1: ruleValue
            {
             before(grammarAccess.getFieldsAccess().getDefaultValueValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Fields__DefaultValueAssignment_3_110466);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5171:1: rule__Fields__AttributesAssignment_4 : ( ruleFieldAttributes ) ;
    public final void rule__Fields__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5175:1: ( ( ruleFieldAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5176:1: ( ruleFieldAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5176:1: ( ruleFieldAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5177:1: ruleFieldAttributes
            {
             before(grammarAccess.getFieldsAccess().getAttributesFieldAttributesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_rule__Fields__AttributesAssignment_410497);
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


    // $ANTLR start "rule__Value__NumberAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5186:1: rule__Value__NumberAssignment_0 : ( ruleNumber ) ;
    public final void rule__Value__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5190:1: ( ( ruleNumber ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5191:1: ( ruleNumber )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5191:1: ( ruleNumber )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5192:1: ruleNumber
            {
             before(grammarAccess.getValueAccess().getNumberNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__Value__NumberAssignment_010528);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getValueAccess().getNumberNumberParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Value__NumberAssignment_0"


    // $ANTLR start "rule__Value__IsFalseAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5201:1: rule__Value__IsFalseAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__Value__IsFalseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5205:1: ( ( ( 'false' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5206:1: ( ( 'false' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5206:1: ( ( 'false' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5207:1: ( 'false' )
            {
             before(grammarAccess.getValueAccess().getIsFalseFalseKeyword_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5208:1: ( 'false' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5209:1: 'false'
            {
             before(grammarAccess.getValueAccess().getIsFalseFalseKeyword_1_0()); 
            match(input,51,FOLLOW_51_in_rule__Value__IsFalseAssignment_110564); 
             after(grammarAccess.getValueAccess().getIsFalseFalseKeyword_1_0()); 

            }

             after(grammarAccess.getValueAccess().getIsFalseFalseKeyword_1_0()); 

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
    // $ANTLR end "rule__Value__IsFalseAssignment_1"


    // $ANTLR start "rule__Value__IsTrueAssignment_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5224:1: rule__Value__IsTrueAssignment_2 : ( ( 'true' ) ) ;
    public final void rule__Value__IsTrueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5228:1: ( ( ( 'true' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5229:1: ( ( 'true' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5229:1: ( ( 'true' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5230:1: ( 'true' )
            {
             before(grammarAccess.getValueAccess().getIsTrueTrueKeyword_2_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5231:1: ( 'true' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5232:1: 'true'
            {
             before(grammarAccess.getValueAccess().getIsTrueTrueKeyword_2_0()); 
            match(input,52,FOLLOW_52_in_rule__Value__IsTrueAssignment_210608); 
             after(grammarAccess.getValueAccess().getIsTrueTrueKeyword_2_0()); 

            }

             after(grammarAccess.getValueAccess().getIsTrueTrueKeyword_2_0()); 

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
    // $ANTLR end "rule__Value__IsTrueAssignment_2"


    // $ANTLR start "rule__Value__EnumCaseAssignment_3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5247:1: rule__Value__EnumCaseAssignment_3 : ( RULE_ID ) ;
    public final void rule__Value__EnumCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5251:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5252:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5252:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5253:1: RULE_ID
            {
             before(grammarAccess.getValueAccess().getEnumCaseIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__EnumCaseAssignment_310647); 
             after(grammarAccess.getValueAccess().getEnumCaseIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Value__EnumCaseAssignment_3"


    // $ANTLR start "rule__FieldAttributes__AtributeNamesAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5262:1: rule__FieldAttributes__AtributeNamesAssignment_1 : ( ruleAttributeName ) ;
    public final void rule__FieldAttributes__AtributeNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5266:1: ( ( ruleAttributeName ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5267:1: ( ruleAttributeName )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5267:1: ( ruleAttributeName )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5268:1: ruleAttributeName
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNamesAttributeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNamesAssignment_110678);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getFieldAttributesAccess().getAtributeNamesAttributeNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FieldAttributes__AtributeNamesAssignment_1"


    // $ANTLR start "rule__FieldAttributes__AtributeNamesAssignment_2_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5277:1: rule__FieldAttributes__AtributeNamesAssignment_2_1 : ( ruleAttributeName ) ;
    public final void rule__FieldAttributes__AtributeNamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5281:1: ( ( ruleAttributeName ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5282:1: ( ruleAttributeName )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5282:1: ( ruleAttributeName )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5283:1: ruleAttributeName
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNamesAttributeNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNamesAssignment_2_110709);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getFieldAttributesAccess().getAtributeNamesAttributeNameParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__FieldAttributes__AtributeNamesAssignment_2_1"


    // $ANTLR start "rule__AttributeName__DeprectatedAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5292:1: rule__AttributeName__DeprectatedAssignment_0 : ( RULE_DEPRECTED_ATTRIBUTE ) ;
    public final void rule__AttributeName__DeprectatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5296:1: ( ( RULE_DEPRECTED_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5297:1: ( RULE_DEPRECTED_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5297:1: ( RULE_DEPRECTED_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5298:1: RULE_DEPRECTED_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getDeprectatedDEPRECTED_ATTRIBUTETerminalRuleCall_0_0()); 
            match(input,RULE_DEPRECTED_ATTRIBUTE,FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_rule__AttributeName__DeprectatedAssignment_010740); 
             after(grammarAccess.getAttributeNameAccess().getDeprectatedDEPRECTED_ATTRIBUTETerminalRuleCall_0_0()); 

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


    // $ANTLR start "rule__AttributeName__HasAttributeIdAssignment_1_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5307:1: rule__AttributeName__HasAttributeIdAssignment_1_0 : ( RULE_ID_ATTRIBUTE ) ;
    public final void rule__AttributeName__HasAttributeIdAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5311:1: ( ( RULE_ID_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5312:1: ( RULE_ID_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5312:1: ( RULE_ID_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5313:1: RULE_ID_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getHasAttributeIdID_ATTRIBUTETerminalRuleCall_1_0_0()); 
            match(input,RULE_ID_ATTRIBUTE,FOLLOW_RULE_ID_ATTRIBUTE_in_rule__AttributeName__HasAttributeIdAssignment_1_010771); 
             after(grammarAccess.getAttributeNameAccess().getHasAttributeIdID_ATTRIBUTETerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__AttributeName__HasAttributeIdAssignment_1_0"


    // $ANTLR start "rule__AttributeName__AttributeIdAssignment_1_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5322:1: rule__AttributeName__AttributeIdAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__AttributeName__AttributeIdAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5326:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5327:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5327:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5328:1: RULE_INT
            {
             before(grammarAccess.getAttributeNameAccess().getAttributeIdINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeName__AttributeIdAssignment_1_210802); 
             after(grammarAccess.getAttributeNameAccess().getAttributeIdINTTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AttributeName__AttributeIdAssignment_1_2"


    // $ANTLR start "rule__AttributeName__RequiredAssignment_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5337:1: rule__AttributeName__RequiredAssignment_2 : ( RULE_REQUIRED_ATTRIBUTE ) ;
    public final void rule__AttributeName__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5341:1: ( ( RULE_REQUIRED_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5342:1: ( RULE_REQUIRED_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5342:1: ( RULE_REQUIRED_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5343:1: RULE_REQUIRED_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getRequiredREQUIRED_ATTRIBUTETerminalRuleCall_2_0()); 
            match(input,RULE_REQUIRED_ATTRIBUTE,FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_rule__AttributeName__RequiredAssignment_210833); 
             after(grammarAccess.getAttributeNameAccess().getRequiredREQUIRED_ATTRIBUTETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__AttributeName__RequiredAssignment_2"


    // $ANTLR start "rule__AttributeName__Original_orderAssignment_3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5352:1: rule__AttributeName__Original_orderAssignment_3 : ( ( 'original_order' ) ) ;
    public final void rule__AttributeName__Original_orderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5356:1: ( ( ( 'original_order' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5357:1: ( ( 'original_order' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5357:1: ( ( 'original_order' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5358:1: ( 'original_order' )
            {
             before(grammarAccess.getAttributeNameAccess().getOriginal_orderOriginal_orderKeyword_3_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5359:1: ( 'original_order' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5360:1: 'original_order'
            {
             before(grammarAccess.getAttributeNameAccess().getOriginal_orderOriginal_orderKeyword_3_0()); 
            match(input,53,FOLLOW_53_in_rule__AttributeName__Original_orderAssignment_310869); 
             after(grammarAccess.getAttributeNameAccess().getOriginal_orderOriginal_orderKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeNameAccess().getOriginal_orderOriginal_orderKeyword_3_0()); 

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
    // $ANTLR end "rule__AttributeName__Original_orderAssignment_3"


    // $ANTLR start "rule__AttributeName__HasAlignSizeAssignment_4_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5375:1: rule__AttributeName__HasAlignSizeAssignment_4_0 : ( ( 'force_align' ) ) ;
    public final void rule__AttributeName__HasAlignSizeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5379:1: ( ( ( 'force_align' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5380:1: ( ( 'force_align' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5380:1: ( ( 'force_align' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5381:1: ( 'force_align' )
            {
             before(grammarAccess.getAttributeNameAccess().getHasAlignSizeForce_alignKeyword_4_0_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5382:1: ( 'force_align' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5383:1: 'force_align'
            {
             before(grammarAccess.getAttributeNameAccess().getHasAlignSizeForce_alignKeyword_4_0_0()); 
            match(input,54,FOLLOW_54_in_rule__AttributeName__HasAlignSizeAssignment_4_010913); 
             after(grammarAccess.getAttributeNameAccess().getHasAlignSizeForce_alignKeyword_4_0_0()); 

            }

             after(grammarAccess.getAttributeNameAccess().getHasAlignSizeForce_alignKeyword_4_0_0()); 

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
    // $ANTLR end "rule__AttributeName__HasAlignSizeAssignment_4_0"


    // $ANTLR start "rule__AttributeName__AlignSizeAssignment_4_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5398:1: rule__AttributeName__AlignSizeAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__AttributeName__AlignSizeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5402:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5403:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5403:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5404:1: RULE_INT
            {
             before(grammarAccess.getAttributeNameAccess().getAlignSizeINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeName__AlignSizeAssignment_4_210952); 
             after(grammarAccess.getAttributeNameAccess().getAlignSizeINTTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__AttributeName__AlignSizeAssignment_4_2"


    // $ANTLR start "rule__AttributeName__HasHashAssignment_5_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5413:1: rule__AttributeName__HasHashAssignment_5_0 : ( RULE_HASH_ATTRIBUTE ) ;
    public final void rule__AttributeName__HasHashAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5417:1: ( ( RULE_HASH_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5418:1: ( RULE_HASH_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5418:1: ( RULE_HASH_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5419:1: RULE_HASH_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getHasHashHASH_ATTRIBUTETerminalRuleCall_5_0_0()); 
            match(input,RULE_HASH_ATTRIBUTE,FOLLOW_RULE_HASH_ATTRIBUTE_in_rule__AttributeName__HasHashAssignment_5_010983); 
             after(grammarAccess.getAttributeNameAccess().getHasHashHASH_ATTRIBUTETerminalRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__AttributeName__HasHashAssignment_5_0"


    // $ANTLR start "rule__AttributeName__HashKeyAssignment_5_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5428:1: rule__AttributeName__HashKeyAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__AttributeName__HashKeyAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5432:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5433:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5433:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5434:1: RULE_STRING
            {
             before(grammarAccess.getAttributeNameAccess().getHashKeySTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributeName__HashKeyAssignment_5_211014); 
             after(grammarAccess.getAttributeNameAccess().getHashKeySTRINGTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__AttributeName__HashKeyAssignment_5_2"


    // $ANTLR start "rule__AttributeName__Bit_flagsAssignment_6"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5443:1: rule__AttributeName__Bit_flagsAssignment_6 : ( ( 'bit_flags' ) ) ;
    public final void rule__AttributeName__Bit_flagsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5447:1: ( ( ( 'bit_flags' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5448:1: ( ( 'bit_flags' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5448:1: ( ( 'bit_flags' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5449:1: ( 'bit_flags' )
            {
             before(grammarAccess.getAttributeNameAccess().getBit_flagsBit_flagsKeyword_6_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5450:1: ( 'bit_flags' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5451:1: 'bit_flags'
            {
             before(grammarAccess.getAttributeNameAccess().getBit_flagsBit_flagsKeyword_6_0()); 
            match(input,55,FOLLOW_55_in_rule__AttributeName__Bit_flagsAssignment_611050); 
             after(grammarAccess.getAttributeNameAccess().getBit_flagsBit_flagsKeyword_6_0()); 

            }

             after(grammarAccess.getAttributeNameAccess().getBit_flagsBit_flagsKeyword_6_0()); 

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
    // $ANTLR end "rule__AttributeName__Bit_flagsAssignment_6"


    // $ANTLR start "rule__AttributeName__HasNestedTableNameAssignment_7_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5466:1: rule__AttributeName__HasNestedTableNameAssignment_7_0 : ( ( 'nested_flatbuffer' ) ) ;
    public final void rule__AttributeName__HasNestedTableNameAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5470:1: ( ( ( 'nested_flatbuffer' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5471:1: ( ( 'nested_flatbuffer' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5471:1: ( ( 'nested_flatbuffer' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5472:1: ( 'nested_flatbuffer' )
            {
             before(grammarAccess.getAttributeNameAccess().getHasNestedTableNameNested_flatbufferKeyword_7_0_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5473:1: ( 'nested_flatbuffer' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5474:1: 'nested_flatbuffer'
            {
             before(grammarAccess.getAttributeNameAccess().getHasNestedTableNameNested_flatbufferKeyword_7_0_0()); 
            match(input,56,FOLLOW_56_in_rule__AttributeName__HasNestedTableNameAssignment_7_011094); 
             after(grammarAccess.getAttributeNameAccess().getHasNestedTableNameNested_flatbufferKeyword_7_0_0()); 

            }

             after(grammarAccess.getAttributeNameAccess().getHasNestedTableNameNested_flatbufferKeyword_7_0_0()); 

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
    // $ANTLR end "rule__AttributeName__HasNestedTableNameAssignment_7_0"


    // $ANTLR start "rule__AttributeName__NestedTableNameAssignment_7_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5489:1: rule__AttributeName__NestedTableNameAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__AttributeName__NestedTableNameAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5493:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5494:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5494:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5495:1: RULE_STRING
            {
             before(grammarAccess.getAttributeNameAccess().getNestedTableNameSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributeName__NestedTableNameAssignment_7_211133); 
             after(grammarAccess.getAttributeNameAccess().getNestedTableNameSTRINGTerminalRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__AttributeName__NestedTableNameAssignment_7_2"


    // $ANTLR start "rule__AttributeName__KeyAssignment_8"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5504:1: rule__AttributeName__KeyAssignment_8 : ( RULE_KEY_ATTRIBUTE ) ;
    public final void rule__AttributeName__KeyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5508:1: ( ( RULE_KEY_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5509:1: ( RULE_KEY_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5509:1: ( RULE_KEY_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5510:1: RULE_KEY_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getKeyKEY_ATTRIBUTETerminalRuleCall_8_0()); 
            match(input,RULE_KEY_ATTRIBUTE,FOLLOW_RULE_KEY_ATTRIBUTE_in_rule__AttributeName__KeyAssignment_811164); 
             after(grammarAccess.getAttributeNameAccess().getKeyKEY_ATTRIBUTETerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__AttributeName__KeyAssignment_8"


    // $ANTLR start "rule__AttributeName__CustomNameAssignment_9_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5519:1: rule__AttributeName__CustomNameAssignment_9_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeName__CustomNameAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5523:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5524:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5524:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5525:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesCrossReference_9_0_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5526:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5527:1: RULE_ID
            {
             before(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesIDTerminalRuleCall_9_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeName__CustomNameAssignment_9_011199); 
             after(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesIDTerminalRuleCall_9_0_0_1()); 

            }

             after(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesCrossReference_9_0_0()); 

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
    // $ANTLR end "rule__AttributeName__CustomNameAssignment_9_0"


    // $ANTLR start "rule__AttributeName__IntValueAssignment_9_1_1_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5538:1: rule__AttributeName__IntValueAssignment_9_1_1_0 : ( RULE_INT ) ;
    public final void rule__AttributeName__IntValueAssignment_9_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5542:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5543:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5543:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5544:1: RULE_INT
            {
             before(grammarAccess.getAttributeNameAccess().getIntValueINTTerminalRuleCall_9_1_1_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeName__IntValueAssignment_9_1_1_011234); 
             after(grammarAccess.getAttributeNameAccess().getIntValueINTTerminalRuleCall_9_1_1_0_0()); 

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
    // $ANTLR end "rule__AttributeName__IntValueAssignment_9_1_1_0"


    // $ANTLR start "rule__AttributeName__StringValueAssignment_9_1_1_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5553:1: rule__AttributeName__StringValueAssignment_9_1_1_1 : ( RULE_STRING ) ;
    public final void rule__AttributeName__StringValueAssignment_9_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5557:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5558:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5558:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5559:1: RULE_STRING
            {
             before(grammarAccess.getAttributeNameAccess().getStringValueSTRINGTerminalRuleCall_9_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributeName__StringValueAssignment_9_1_1_111265); 
             after(grammarAccess.getAttributeNameAccess().getStringValueSTRINGTerminalRuleCall_9_1_1_1_0()); 

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
    // $ANTLR end "rule__AttributeName__StringValueAssignment_9_1_1_1"


    // $ANTLR start "rule__Type__PrimTypeAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5568:1: rule__Type__PrimTypeAssignment_0 : ( rulePrimitive ) ;
    public final void rule__Type__PrimTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5572:1: ( ( rulePrimitive ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5573:1: ( rulePrimitive )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5573:1: ( rulePrimitive )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5574:1: rulePrimitive
            {
             before(grammarAccess.getTypeAccess().getPrimTypePrimitiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Type__PrimTypeAssignment_011296);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5583:1: rule__Type__VectorTypeAssignment_1 : ( ruleVector ) ;
    public final void rule__Type__VectorTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5587:1: ( ( ruleVector ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5588:1: ( ruleVector )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5588:1: ( ruleVector )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5589:1: ruleVector
            {
             before(grammarAccess.getTypeAccess().getVectorTypeVectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVector_in_rule__Type__VectorTypeAssignment_111327);
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


    // $ANTLR start "rule__Type__DefTypeAssignment_2"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5598:1: rule__Type__DefTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Type__DefTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5602:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5603:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5603:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5604:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getDefTypeDefinitionCrossReference_2_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5605:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5606:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getDefTypeDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__DefTypeAssignment_211362); 
             after(grammarAccess.getTypeAccess().getDefTypeDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getDefTypeDefinitionCrossReference_2_0()); 

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
    // $ANTLR end "rule__Type__DefTypeAssignment_2"


    // $ANTLR start "rule__Type__QualifiedTypeAssignment_3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5617:1: rule__Type__QualifiedTypeAssignment_3 : ( ruleQualifiedType ) ;
    public final void rule__Type__QualifiedTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5621:1: ( ( ruleQualifiedType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5622:1: ( ruleQualifiedType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5622:1: ( ruleQualifiedType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5623:1: ruleQualifiedType
            {
             before(grammarAccess.getTypeAccess().getQualifiedTypeQualifiedTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQualifiedType_in_rule__Type__QualifiedTypeAssignment_311397);
            ruleQualifiedType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getQualifiedTypeQualifiedTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Type__QualifiedTypeAssignment_3"


    // $ANTLR start "rule__Vector__TypeAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5632:1: rule__Vector__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Vector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5636:1: ( ( ruleType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5637:1: ( ruleType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5637:1: ( ruleType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5638:1: ruleType
            {
             before(grammarAccess.getVectorAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Vector__TypeAssignment_111428);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Vector__TypeAssignment_1"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5647:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5651:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5652:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5652:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5653:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_111459); 
             after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__TypeAssignment_2_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5662:1: rule__Enum__TypeAssignment_2_1 : ( rulePrimitiveNumberType ) ;
    public final void rule__Enum__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5666:1: ( ( rulePrimitiveNumberType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5667:1: ( rulePrimitiveNumberType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5667:1: ( rulePrimitiveNumberType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5668:1: rulePrimitiveNumberType
            {
             before(grammarAccess.getEnumAccess().getTypePrimitiveNumberTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePrimitiveNumberType_in_rule__Enum__TypeAssignment_2_111490);
            rulePrimitiveNumberType();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getTypePrimitiveNumberTypeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Enum__TypeAssignment_2_1"


    // $ANTLR start "rule__Enum__AttributesAssignment_3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5677:1: rule__Enum__AttributesAssignment_3 : ( ruleFieldAttributes ) ;
    public final void rule__Enum__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5681:1: ( ( ruleFieldAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5682:1: ( ruleFieldAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5682:1: ( ruleFieldAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5683:1: ruleFieldAttributes
            {
             before(grammarAccess.getEnumAccess().getAttributesFieldAttributesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_rule__Enum__AttributesAssignment_311521);
            ruleFieldAttributes();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getAttributesFieldAttributesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Enum__AttributesAssignment_3"


    // $ANTLR start "rule__Enum__EnumCasesAssignment_5"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5692:1: rule__Enum__EnumCasesAssignment_5 : ( ruleEnumCase ) ;
    public final void rule__Enum__EnumCasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5696:1: ( ( ruleEnumCase ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5697:1: ( ruleEnumCase )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5697:1: ( ruleEnumCase )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5698:1: ruleEnumCase
            {
             before(grammarAccess.getEnumAccess().getEnumCasesEnumCaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEnumCase_in_rule__Enum__EnumCasesAssignment_511552);
            ruleEnumCase();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getEnumCasesEnumCaseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Enum__EnumCasesAssignment_5"


    // $ANTLR start "rule__Enum__EnumCasesAssignment_6_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5707:1: rule__Enum__EnumCasesAssignment_6_1 : ( ruleEnumCase ) ;
    public final void rule__Enum__EnumCasesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5711:1: ( ( ruleEnumCase ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5712:1: ( ruleEnumCase )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5712:1: ( ruleEnumCase )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5713:1: ruleEnumCase
            {
             before(grammarAccess.getEnumAccess().getEnumCasesEnumCaseParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleEnumCase_in_rule__Enum__EnumCasesAssignment_6_111583);
            ruleEnumCase();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getEnumCasesEnumCaseParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Enum__EnumCasesAssignment_6_1"


    // $ANTLR start "rule__EnumCase__NameAssignment_0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5722:1: rule__EnumCase__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumCase__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5726:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5727:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5727:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5728:1: RULE_ID
            {
             before(grammarAccess.getEnumCaseAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumCase__NameAssignment_011614); 
             after(grammarAccess.getEnumCaseAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__EnumCase__NameAssignment_0"


    // $ANTLR start "rule__EnumCase__ValueAssignment_1_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5737:1: rule__EnumCase__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumCase__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5741:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5742:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5742:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5743:1: RULE_INT
            {
             before(grammarAccess.getEnumCaseAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumCase__ValueAssignment_1_111645); 
             after(grammarAccess.getEnumCaseAccess().getValueINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EnumCase__ValueAssignment_1_1"


    // $ANTLR start "rule__Union__NameAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5752:1: rule__Union__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Union__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5756:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5757:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5757:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5758:1: RULE_ID
            {
             before(grammarAccess.getUnionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Union__NameAssignment_111676); 
             after(grammarAccess.getUnionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Union__NameAssignment_1"


    // $ANTLR start "rule__Union__UnionCasesAssignment_3"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5767:1: rule__Union__UnionCasesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Union__UnionCasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5771:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5772:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5772:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5773:1: ( RULE_ID )
            {
             before(grammarAccess.getUnionAccess().getUnionCasesTableCrossReference_3_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5774:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5775:1: RULE_ID
            {
             before(grammarAccess.getUnionAccess().getUnionCasesTableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Union__UnionCasesAssignment_311711); 
             after(grammarAccess.getUnionAccess().getUnionCasesTableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getUnionAccess().getUnionCasesTableCrossReference_3_0()); 

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
    // $ANTLR end "rule__Union__UnionCasesAssignment_3"


    // $ANTLR start "rule__Union__UnionCasesAssignment_4_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5786:1: rule__Union__UnionCasesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Union__UnionCasesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5790:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5791:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5791:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5792:1: ( RULE_ID )
            {
             before(grammarAccess.getUnionAccess().getUnionCasesTableCrossReference_4_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5793:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5794:1: RULE_ID
            {
             before(grammarAccess.getUnionAccess().getUnionCasesTableIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Union__UnionCasesAssignment_4_111750); 
             after(grammarAccess.getUnionAccess().getUnionCasesTableIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getUnionAccess().getUnionCasesTableCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Union__UnionCasesAssignment_4_1"

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
    public static final BitSet FOLLOW_ruleFileExtension_in_entryRuleFileExtension301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileExtension308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__0_in_ruleFileExtension334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Alternatives_in_ruleDefinition514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_in_entryRuleStruct541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStruct548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__0_in_ruleStruct574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructFields_in_entryRuleStructFields601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructFields608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Group__0_in_ruleStructFields634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0_in_ruleTable694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFields_in_entryRuleFields721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFields728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__0_in_ruleFields754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_entryRuleFieldAttributes841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAttributes848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__0_in_ruleFieldAttributes874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Alternatives_in_ruleAttributeName934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedType_in_entryRuleQualifiedType1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedType1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group__0_in_ruleQualifiedType1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__0_in_ruleVector1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveWithoutString_in_entryRulePrimitiveWithoutString1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveWithoutString1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveWithoutString__Alternatives_in_rulePrimitiveWithoutString1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumCase_in_entryRuleEnumCase1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumCase1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group__0_in_ruleEnumCase1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnion_in_entryRuleUnion1390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnion1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__0_in_ruleUnion1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveNumberType_in_entryRulePrimitiveNumberType1450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveNumberType1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveNumberType__Alternatives_in_rulePrimitiveNumberType1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Definition__Alternatives1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_in_rule__Definition__Alternatives1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Definition__Alternatives1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnion_in_rule__Definition__Alternatives1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__PrimTypeAssignment_2_0_in_rule__StructFields__Alternatives_21791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__DefTypeAssignment_2_1_in_rule__StructFields__Alternatives_21809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__NumberAssignment_0_in_rule__Value__Alternatives1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__IsFalseAssignment_1_in_rule__Value__Alternatives1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__IsTrueAssignment_2_in_rule__Value__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__EnumCaseAssignment_3_in_rule__Value__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__DeprectatedAssignment_0_in_rule__AttributeName__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__RequiredAssignment_2_in_rule__AttributeName__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Original_orderAssignment_3_in_rule__AttributeName__Alternatives1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__0_in_rule__AttributeName__Alternatives2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__0_in_rule__AttributeName__Alternatives2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Bit_flagsAssignment_6_in_rule__AttributeName__Alternatives2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__0_in_rule__AttributeName__Alternatives2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__KeyAssignment_8_in_rule__AttributeName__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9__0_in_rule__AttributeName__Alternatives2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__IntValueAssignment_9_1_1_0_in_rule__AttributeName__Alternatives_9_1_12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__StringValueAssignment_9_1_1_1_in_rule__AttributeName__Alternatives_9_1_12142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrimTypeAssignment_0_in_rule__Type__Alternatives2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__VectorTypeAssignment_1_in_rule__Type__Alternatives2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DefTypeAssignment_2_in_rule__Type__Alternatives2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__QualifiedTypeAssignment_3_in_rule__Type__Alternatives2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimitiveWithoutString__Alternatives2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimitiveWithoutString__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimitiveWithoutString__Alternatives2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveNumberType_in_rule__PrimitiveWithoutString__Alternatives2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Primitive__Alternatives2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveWithoutString_in_rule__Primitive__Alternatives2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimitiveNumberType__Alternatives2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrimitiveNumberType__Alternatives2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrimitiveNumberType__Alternatives2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimitiveNumberType__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimitiveNumberType__Alternatives2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PrimitiveNumberType__Alternatives2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PrimitiveNumberType__Alternatives2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PrimitiveNumberType__Alternatives2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_ATTRIBUTE_in_rule__ValidID__Alternatives2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ATTRIBUTE_in_rule__ValidID__Alternatives2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_rule__ValidID__Alternatives2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEY_ATTRIBUTE_in_rule__ValidID__Alternatives2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_rule__ValidID__Alternatives2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValidID__Alternatives2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_rule__Number__Alternatives2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_02748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_02765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_12797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_12814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__02844 = new BitSet(new long[]{0x0006022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__02847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__IncludesAssignment_0_in_rule__Schema__Group__0__Impl2874 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__12905 = new BitSet(new long[]{0x0006022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__12908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__NamepsaceAssignment_1_in_rule__Schema__Group__1__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__22966 = new BitSet(new long[]{0x0006022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__3_in_rule__Schema__Group__22969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__FileIdentifierAssignment_2_in_rule__Schema__Group__2__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__3__Impl_in_rule__Schema__Group__33027 = new BitSet(new long[]{0x0006022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__4_in_rule__Schema__Group__33030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__File_extensionAssignment_3_in_rule__Schema__Group__3__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__4__Impl_in_rule__Schema__Group__43088 = new BitSet(new long[]{0x0006022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__5_in_rule__Schema__Group__43091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__CustomAttributesAssignment_4_in_rule__Schema__Group__4__Impl3118 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__5__Impl_in_rule__Schema__Group__53149 = new BitSet(new long[]{0x0006022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__6_in_rule__Schema__Group__53152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__DefinitionsAssignment_5_in_rule__Schema__Group__5__Impl3179 = new BitSet(new long[]{0x0006022000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__6__Impl_in_rule__Schema__Group__63210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__RootTypeAssignment_6_in_rule__Schema__Group__6__Impl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__0__Impl_in_rule__RootType__Group__03281 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RootType__Group__1_in_rule__RootType__Group__03284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RootType__Group__0__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__1__Impl_in_rule__RootType__Group__13343 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__RootType__Group__2_in_rule__RootType__Group__13346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__TypeAssignment_1_in_rule__RootType__Group__1__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__2__Impl_in_rule__RootType__Group__23403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RootType__Group__2__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__0__Impl_in_rule__CustomAttributes__Group__03468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__1_in_rule__CustomAttributes__Group__03471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CustomAttributes__Group__0__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__1__Impl_in_rule__CustomAttributes__Group__13530 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__2_in_rule__CustomAttributes__Group__13533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__NameAssignment_1_in_rule__CustomAttributes__Group__1__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__2__Impl_in_rule__CustomAttributes__Group__23590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CustomAttributes__Group__2__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__0__Impl_in_rule__FileIdentifier__Group__03655 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__1_in_rule__FileIdentifier__Group__03658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FileIdentifier__Group__0__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__1__Impl_in_rule__FileIdentifier__Group__13717 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__2_in_rule__FileIdentifier__Group__13720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FileIdentifier__Group__1__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__2__Impl_in_rule__FileIdentifier__Group__23776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FileIdentifier__Group__2__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__0__Impl_in_rule__FileExtension__Group__03841 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__1_in_rule__FileExtension__Group__03844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FileExtension__Group__0__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__1__Impl_in_rule__FileExtension__Group__13903 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__2_in_rule__FileExtension__Group__13906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FileExtension__Group__1__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__2__Impl_in_rule__FileExtension__Group__23962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FileExtension__Group__2__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__04027 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__04030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Namespace__Group__0__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__14089 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__14092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__24149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Namespace__Group__2__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__04214 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__04217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Include__Group__0__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__14276 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__14279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__Group__1__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__24335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Include__Group__2__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__0__Impl_in_rule__Struct__Group__04400 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Struct__Group__1_in_rule__Struct__Group__04403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Struct__Group__0__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__1__Impl_in_rule__Struct__Group__14462 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_rule__Struct__Group__2_in_rule__Struct__Group__14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__NameAssignment_1_in_rule__Struct__Group__1__Impl4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__2__Impl_in_rule__Struct__Group__24522 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_rule__Struct__Group__3_in_rule__Struct__Group__24525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__AttributesAssignment_2_in_rule__Struct__Group__2__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__3__Impl_in_rule__Struct__Group__34583 = new BitSet(new long[]{0x0000008000000200L});
    public static final BitSet FOLLOW_rule__Struct__Group__4_in_rule__Struct__Group__34586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Struct__Group__3__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__4__Impl_in_rule__Struct__Group__44645 = new BitSet(new long[]{0x0000008000000200L});
    public static final BitSet FOLLOW_rule__Struct__Group__5_in_rule__Struct__Group__44648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__FieldsAssignment_4_in_rule__Struct__Group__4__Impl4675 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Struct__Group__5__Impl_in_rule__Struct__Group__54706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Struct__Group__5__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Group__0__Impl_in_rule__StructFields__Group__04777 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__StructFields__Group__1_in_rule__StructFields__Group__04780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__NameAssignment_0_in_rule__StructFields__Group__0__Impl4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Group__1__Impl_in_rule__StructFields__Group__14837 = new BitSet(new long[]{0x000000003FDC0200L});
    public static final BitSet FOLLOW_rule__StructFields__Group__2_in_rule__StructFields__Group__14840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__StructFields__Group__1__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Group__2__Impl_in_rule__StructFields__Group__24899 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__StructFields__Group__3_in_rule__StructFields__Group__24902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Alternatives_2_in_rule__StructFields__Group__2__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Group__3__Impl_in_rule__StructFields__Group__34959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StructFields__Group__3__Impl4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__05026 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__05029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Table__Group__0__Impl5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__15088 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__15091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__25148 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_rule__Table__Group__3_in_rule__Table__Group__25151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__AttributesAssignment_2_in_rule__Table__Group__2__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__35209 = new BitSet(new long[]{0x00000080000003F0L});
    public static final BitSet FOLLOW_rule__Table__Group__4_in_rule__Table__Group__35212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Table__Group__3__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__45271 = new BitSet(new long[]{0x00000080000003F0L});
    public static final BitSet FOLLOW_rule__Table__Group__5_in_rule__Table__Group__45274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__FieldsAssignment_4_in_rule__Table__Group__4__Impl5301 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__55332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Table__Group__5__Impl5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__0__Impl_in_rule__Fields__Group__05403 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__1_in_rule__Fields__Group__05406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__NameAssignment_0_in_rule__Fields__Group__0__Impl5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__1__Impl_in_rule__Fields__Group__15463 = new BitSet(new long[]{0x000080003FFC03F0L});
    public static final BitSet FOLLOW_rule__Fields__Group__2_in_rule__Fields__Group__15466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Fields__Group__1__Impl5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__2__Impl_in_rule__Fields__Group__25525 = new BitSet(new long[]{0x00000C0080000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__3_in_rule__Fields__Group__25528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__TypeAssignment_2_in_rule__Fields__Group__2__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__3__Impl_in_rule__Fields__Group__35585 = new BitSet(new long[]{0x00000C0080000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__4_in_rule__Fields__Group__35588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__0_in_rule__Fields__Group__3__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__4__Impl_in_rule__Fields__Group__45646 = new BitSet(new long[]{0x00000C0080000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__5_in_rule__Fields__Group__45649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__AttributesAssignment_4_in_rule__Fields__Group__4__Impl5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__5__Impl_in_rule__Fields__Group__55707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Fields__Group__5__Impl5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__0__Impl_in_rule__Fields__Group_3__05778 = new BitSet(new long[]{0x0018000000001E00L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__1_in_rule__Fields__Group_3__05781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Fields__Group_3__0__Impl5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__1__Impl_in_rule__Fields__Group_3__15840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__DefaultValueAssignment_3_1_in_rule__Fields__Group_3__1__Impl5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__0__Impl_in_rule__FieldAttributes__Group__05901 = new BitSet(new long[]{0x01E00000000003F0L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__1_in_rule__FieldAttributes__Group__05904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FieldAttributes__Group__0__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__1__Impl_in_rule__FieldAttributes__Group__15963 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__2_in_rule__FieldAttributes__Group__15966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__AtributeNamesAssignment_1_in_rule__FieldAttributes__Group__1__Impl5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__2__Impl_in_rule__FieldAttributes__Group__26023 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__3_in_rule__FieldAttributes__Group__26026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group_2__0_in_rule__FieldAttributes__Group__2__Impl6053 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__3__Impl_in_rule__FieldAttributes__Group__36084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FieldAttributes__Group__3__Impl6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group_2__0__Impl_in_rule__FieldAttributes__Group_2__06151 = new BitSet(new long[]{0x01E00000000003F0L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group_2__1_in_rule__FieldAttributes__Group_2__06154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FieldAttributes__Group_2__0__Impl6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group_2__1__Impl_in_rule__FieldAttributes__Group_2__16213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__AtributeNamesAssignment_2_1_in_rule__FieldAttributes__Group_2__1__Impl6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__06274 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__06277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HasAttributeIdAssignment_1_0_in_rule__AttributeName__Group_1__0__Impl6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__16334 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__2_in_rule__AttributeName__Group_1__16337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_1__1__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__2__Impl_in_rule__AttributeName__Group_1__26396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__AttributeIdAssignment_1_2_in_rule__AttributeName__Group_1__2__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__0__Impl_in_rule__AttributeName__Group_4__06459 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__1_in_rule__AttributeName__Group_4__06462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HasAlignSizeAssignment_4_0_in_rule__AttributeName__Group_4__0__Impl6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__1__Impl_in_rule__AttributeName__Group_4__16519 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__2_in_rule__AttributeName__Group_4__16522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_4__1__Impl6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__2__Impl_in_rule__AttributeName__Group_4__26581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__AlignSizeAssignment_4_2_in_rule__AttributeName__Group_4__2__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__0__Impl_in_rule__AttributeName__Group_5__06644 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__1_in_rule__AttributeName__Group_5__06647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HasHashAssignment_5_0_in_rule__AttributeName__Group_5__0__Impl6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__1__Impl_in_rule__AttributeName__Group_5__16704 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__2_in_rule__AttributeName__Group_5__16707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_5__1__Impl6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__2__Impl_in_rule__AttributeName__Group_5__26766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HashKeyAssignment_5_2_in_rule__AttributeName__Group_5__2__Impl6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__0__Impl_in_rule__AttributeName__Group_7__06829 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__1_in_rule__AttributeName__Group_7__06832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HasNestedTableNameAssignment_7_0_in_rule__AttributeName__Group_7__0__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__1__Impl_in_rule__AttributeName__Group_7__16889 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__2_in_rule__AttributeName__Group_7__16892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_7__1__Impl6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__2__Impl_in_rule__AttributeName__Group_7__26951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__NestedTableNameAssignment_7_2_in_rule__AttributeName__Group_7__2__Impl6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9__0__Impl_in_rule__AttributeName__Group_9__07014 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9__1_in_rule__AttributeName__Group_9__07017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__CustomNameAssignment_9_0_in_rule__AttributeName__Group_9__0__Impl7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9__1__Impl_in_rule__AttributeName__Group_9__17074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9_1__0_in_rule__AttributeName__Group_9__1__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9_1__0__Impl_in_rule__AttributeName__Group_9_1__07136 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9_1__1_in_rule__AttributeName__Group_9_1__07139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_9_1__0__Impl7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9_1__1__Impl_in_rule__AttributeName__Group_9_1__17198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Alternatives_9_1_1_in_rule__AttributeName__Group_9_1__1__Impl7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group__0__Impl_in_rule__QualifiedType__Group__07259 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group__1_in_rule__QualifiedType__Group__07262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedType__Group__0__Impl7289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group__1__Impl_in_rule__QualifiedType__Group__17318 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group__2_in_rule__QualifiedType__Group__17321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__QualifiedType__Group__1__Impl7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group__2__Impl_in_rule__QualifiedType__Group__27380 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group__3_in_rule__QualifiedType__Group__27383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedType__Group__2__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group__3__Impl_in_rule__QualifiedType__Group__37439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group_3__0_in_rule__QualifiedType__Group__3__Impl7466 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group_3__0__Impl_in_rule__QualifiedType__Group_3__07505 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group_3__1_in_rule__QualifiedType__Group_3__07508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__QualifiedType__Group_3__0__Impl7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedType__Group_3__1__Impl_in_rule__QualifiedType__Group_3__17567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedType__Group_3__1__Impl7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__0__Impl_in_rule__Vector__Group__07627 = new BitSet(new long[]{0x000080003FFC03F0L});
    public static final BitSet FOLLOW_rule__Vector__Group__1_in_rule__Vector__Group__07630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Vector__Group__0__Impl7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__1__Impl_in_rule__Vector__Group__17689 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Vector__Group__2_in_rule__Vector__Group__17692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__TypeAssignment_1_in_rule__Vector__Group__1__Impl7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__2__Impl_in_rule__Vector__Group__27749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Vector__Group__2__Impl7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__07814 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__07817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Enum__Group__0__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__17876 = new BitSet(new long[]{0x0000094000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__17879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__27936 = new BitSet(new long[]{0x0000094000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__27939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__0_in_rule__Enum__Group__2__Impl7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__37997 = new BitSet(new long[]{0x0000094000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__38000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__AttributesAssignment_3_in_rule__Enum__Group__3__Impl8027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__48058 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__48061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Enum__Group__4__Impl8089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__58120 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__6_in_rule__Enum__Group__58123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__EnumCasesAssignment_5_in_rule__Enum__Group__5__Impl8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__6__Impl_in_rule__Enum__Group__68180 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__7_in_rule__Enum__Group__68183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_6__0_in_rule__Enum__Group__6__Impl8210 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__7__Impl_in_rule__Enum__Group__78241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Enum__Group__7__Impl8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__0__Impl_in_rule__Enum__Group_2__08316 = new BitSet(new long[]{0x000000003FDC0000L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__1_in_rule__Enum__Group_2__08319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Enum__Group_2__0__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__1__Impl_in_rule__Enum__Group_2__18378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__TypeAssignment_2_1_in_rule__Enum__Group_2__1__Impl8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_6__0__Impl_in_rule__Enum__Group_6__08439 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Enum__Group_6__1_in_rule__Enum__Group_6__08442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Enum__Group_6__0__Impl8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_6__1__Impl_in_rule__Enum__Group_6__18501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__EnumCasesAssignment_6_1_in_rule__Enum__Group_6__1__Impl8528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group__0__Impl_in_rule__EnumCase__Group__08562 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EnumCase__Group__1_in_rule__EnumCase__Group__08565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__NameAssignment_0_in_rule__EnumCase__Group__0__Impl8592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group__1__Impl_in_rule__EnumCase__Group__18622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group_1__0_in_rule__EnumCase__Group__1__Impl8649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group_1__0__Impl_in_rule__EnumCase__Group_1__08684 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumCase__Group_1__1_in_rule__EnumCase__Group_1__08687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EnumCase__Group_1__0__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group_1__1__Impl_in_rule__EnumCase__Group_1__18746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__ValueAssignment_1_1_in_rule__EnumCase__Group_1__1__Impl8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__08807 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Union__Group__1_in_rule__Union__Group__08810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Union__Group__0__Impl8838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__18869 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Union__Group__2_in_rule__Union__Group__18872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__NameAssignment_1_in_rule__Union__Group__1__Impl8899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__28929 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Union__Group__3_in_rule__Union__Group__28932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Union__Group__2__Impl8960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__38991 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_rule__Union__Group__4_in_rule__Union__Group__38994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__UnionCasesAssignment_3_in_rule__Union__Group__3__Impl9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__49051 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_rule__Union__Group__5_in_rule__Union__Group__49054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group_4__0_in_rule__Union__Group__4__Impl9081 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__59112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Union__Group__5__Impl9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group_4__0__Impl_in_rule__Union__Group_4__09183 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Union__Group_4__1_in_rule__Union__Group_4__09186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Union__Group_4__0__Impl9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group_4__1__Impl_in_rule__Union__Group_4__19245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__UnionCasesAssignment_4_1_in_rule__Union__Group_4__1__Impl9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09306 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl9336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9392 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09427 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__QualifiedName__Group_1__0__Impl9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__09549 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__09552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__19609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl9636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__09671 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__09674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Number__Group_1_1__0__Impl9702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__19733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl9760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Schema__IncludesAssignment_09799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__Schema__NamepsaceAssignment_19830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileIdentifier_in_rule__Schema__FileIdentifierAssignment_29861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileExtension_in_rule__Schema__File_extensionAssignment_39892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributes_in_rule__Schema__CustomAttributesAssignment_49923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Schema__DefinitionsAssignment_59954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootType_in_rule__Schema__RootTypeAssignment_69985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RootType__TypeAssignment_110020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomAttributes__NameAssignment_110055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Namespace__NameAssignment_110086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Struct__NameAssignment_110117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_rule__Struct__AttributesAssignment_210148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructFields_in_rule__Struct__FieldsAssignment_410179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructFields__NameAssignment_010210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveWithoutString_in_rule__StructFields__PrimTypeAssignment_2_010241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructFields__DefTypeAssignment_2_110276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Table__NameAssignment_110311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_rule__Table__AttributesAssignment_210342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFields_in_rule__Table__FieldsAssignment_410373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Fields__NameAssignment_010404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Fields__TypeAssignment_210435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Fields__DefaultValueAssignment_3_110466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_rule__Fields__AttributesAssignment_410497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Value__NumberAssignment_010528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Value__IsFalseAssignment_110564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Value__IsTrueAssignment_210608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__EnumCaseAssignment_310647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNamesAssignment_110678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNamesAssignment_2_110709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_rule__AttributeName__DeprectatedAssignment_010740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ATTRIBUTE_in_rule__AttributeName__HasAttributeIdAssignment_1_010771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeName__AttributeIdAssignment_1_210802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_rule__AttributeName__RequiredAssignment_210833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__AttributeName__Original_orderAssignment_310869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__AttributeName__HasAlignSizeAssignment_4_010913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeName__AlignSizeAssignment_4_210952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_ATTRIBUTE_in_rule__AttributeName__HasHashAssignment_5_010983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeName__HashKeyAssignment_5_211014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__AttributeName__Bit_flagsAssignment_611050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__AttributeName__HasNestedTableNameAssignment_7_011094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeName__NestedTableNameAssignment_7_211133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEY_ATTRIBUTE_in_rule__AttributeName__KeyAssignment_811164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeName__CustomNameAssignment_9_011199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeName__IntValueAssignment_9_1_1_011234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeName__StringValueAssignment_9_1_1_111265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Type__PrimTypeAssignment_011296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_rule__Type__VectorTypeAssignment_111327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__DefTypeAssignment_211362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedType_in_rule__Type__QualifiedTypeAssignment_311397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Vector__TypeAssignment_111428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_111459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveNumberType_in_rule__Enum__TypeAssignment_2_111490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_rule__Enum__AttributesAssignment_311521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumCase_in_rule__Enum__EnumCasesAssignment_511552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumCase_in_rule__Enum__EnumCasesAssignment_6_111583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumCase__NameAssignment_011614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumCase__ValueAssignment_1_111645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Union__NameAssignment_111676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Union__UnionCasesAssignment_311711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Union__UnionCasesAssignment_4_111750 = new BitSet(new long[]{0x0000000000000002L});

}