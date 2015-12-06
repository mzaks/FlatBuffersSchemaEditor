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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HASH_ATTRIBUTE", "RULE_ID_ATTRIBUTE", "RULE_REQUIRED_ATTRIBUTE", "RULE_KEY_ATTRIBUTE", "RULE_DEPRECTED_ATTRIBUTE", "RULE_ID", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bool'", "'float'", "'double'", "'string'", "'byte'", "'ubyte'", "'short'", "'ushort'", "'int'", "'uint'", "'long'", "'ulong'", "'root_type'", "';'", "'attribute'", "'file_identifier'", "'file_extension'", "'namespace'", "'include'", "'struct'", "'{'", "'}'", "':'", "'table'", "'='", "'('", "')'", "','", "'['", "']'", "'enum'", "'union'", "'.'", "'false'", "'true'", "'original_order'", "'force_align'", "'bit_flags'", "'nested_flatbuffer'"
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


    // $ANTLR start "entryRuleVector"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:508:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:512:1: ( ruleVector EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:513:1: ruleVector EOF
            {
             before(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector1026);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getVectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector1033); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:523:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:528:2: ( ( ( rule__Vector__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:529:1: ( ( rule__Vector__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:529:1: ( ( rule__Vector__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:530:1: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:531:1: ( rule__Vector__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:531:2: rule__Vector__Group__0
            {
            pushFollow(FOLLOW_rule__Vector__Group__0_in_ruleVector1063);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:544:1: entryRulePrimitiveWithoutString : rulePrimitiveWithoutString EOF ;
    public final void entryRulePrimitiveWithoutString() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:545:1: ( rulePrimitiveWithoutString EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:546:1: rulePrimitiveWithoutString EOF
            {
             before(grammarAccess.getPrimitiveWithoutStringRule()); 
            pushFollow(FOLLOW_rulePrimitiveWithoutString_in_entryRulePrimitiveWithoutString1090);
            rulePrimitiveWithoutString();

            state._fsp--;

             after(grammarAccess.getPrimitiveWithoutStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveWithoutString1097); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:553:1: rulePrimitiveWithoutString : ( ( rule__PrimitiveWithoutString__Alternatives ) ) ;
    public final void rulePrimitiveWithoutString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:557:2: ( ( ( rule__PrimitiveWithoutString__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:558:1: ( ( rule__PrimitiveWithoutString__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:558:1: ( ( rule__PrimitiveWithoutString__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:559:1: ( rule__PrimitiveWithoutString__Alternatives )
            {
             before(grammarAccess.getPrimitiveWithoutStringAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:560:1: ( rule__PrimitiveWithoutString__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:560:2: rule__PrimitiveWithoutString__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveWithoutString__Alternatives_in_rulePrimitiveWithoutString1123);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:572:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:573:1: ( rulePrimitive EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:574:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive1150);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive1157); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:581:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:585:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:586:1: ( ( rule__Primitive__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:586:1: ( ( rule__Primitive__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:587:1: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:588:1: ( rule__Primitive__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:588:2: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive1183);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:600:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:601:1: ( ruleEnum EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:602:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1210);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1217); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:609:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:613:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:614:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:614:1: ( ( rule__Enum__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:615:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:616:1: ( rule__Enum__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:616:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum1243);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:628:1: entryRuleEnumCase : ruleEnumCase EOF ;
    public final void entryRuleEnumCase() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:629:1: ( ruleEnumCase EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:630:1: ruleEnumCase EOF
            {
             before(grammarAccess.getEnumCaseRule()); 
            pushFollow(FOLLOW_ruleEnumCase_in_entryRuleEnumCase1270);
            ruleEnumCase();

            state._fsp--;

             after(grammarAccess.getEnumCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumCase1277); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:637:1: ruleEnumCase : ( ( rule__EnumCase__Group__0 ) ) ;
    public final void ruleEnumCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:641:2: ( ( ( rule__EnumCase__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:642:1: ( ( rule__EnumCase__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:642:1: ( ( rule__EnumCase__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:643:1: ( rule__EnumCase__Group__0 )
            {
             before(grammarAccess.getEnumCaseAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:644:1: ( rule__EnumCase__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:644:2: rule__EnumCase__Group__0
            {
            pushFollow(FOLLOW_rule__EnumCase__Group__0_in_ruleEnumCase1303);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:656:1: entryRuleUnion : ruleUnion EOF ;
    public final void entryRuleUnion() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:657:1: ( ruleUnion EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:658:1: ruleUnion EOF
            {
             before(grammarAccess.getUnionRule()); 
            pushFollow(FOLLOW_ruleUnion_in_entryRuleUnion1330);
            ruleUnion();

            state._fsp--;

             after(grammarAccess.getUnionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnion1337); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:665:1: ruleUnion : ( ( rule__Union__Group__0 ) ) ;
    public final void ruleUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:669:2: ( ( ( rule__Union__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:670:1: ( ( rule__Union__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:670:1: ( ( rule__Union__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:671:1: ( rule__Union__Group__0 )
            {
             before(grammarAccess.getUnionAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:672:1: ( rule__Union__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:672:2: rule__Union__Group__0
            {
            pushFollow(FOLLOW_rule__Union__Group__0_in_ruleUnion1363);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:684:1: entryRulePrimitiveNumberType : rulePrimitiveNumberType EOF ;
    public final void entryRulePrimitiveNumberType() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:685:1: ( rulePrimitiveNumberType EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:686:1: rulePrimitiveNumberType EOF
            {
             before(grammarAccess.getPrimitiveNumberTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveNumberType_in_entryRulePrimitiveNumberType1390);
            rulePrimitiveNumberType();

            state._fsp--;

             after(grammarAccess.getPrimitiveNumberTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveNumberType1397); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:693:1: rulePrimitiveNumberType : ( ( rule__PrimitiveNumberType__Alternatives ) ) ;
    public final void rulePrimitiveNumberType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:697:2: ( ( ( rule__PrimitiveNumberType__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:698:1: ( ( rule__PrimitiveNumberType__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:698:1: ( ( rule__PrimitiveNumberType__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:699:1: ( rule__PrimitiveNumberType__Alternatives )
            {
             before(grammarAccess.getPrimitiveNumberTypeAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:700:1: ( rule__PrimitiveNumberType__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:700:2: rule__PrimitiveNumberType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveNumberType__Alternatives_in_rulePrimitiveNumberType1423);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:712:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:713:1: ( ruleQualifiedName EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:714:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1450);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1457); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:721:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:725:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:726:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:726:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:727:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:728:1: ( rule__QualifiedName__Group__0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:728:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1483);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:740:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:741:1: ( ruleValidID EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:742:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1510);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1517); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:749:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:753:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:754:1: ( ( rule__ValidID__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:754:1: ( ( rule__ValidID__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:755:1: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:756:1: ( rule__ValidID__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:756:2: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1543);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:768:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:772:1: ( ruleNumber EOF )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:773:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1575);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1582); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:783:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:788:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:789:1: ( ( rule__Number__Alternatives ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:789:1: ( ( rule__Number__Alternatives ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:790:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:791:1: ( rule__Number__Alternatives )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:791:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber1612);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:804:1: rule__Definition__Alternatives : ( ( ruleTable ) | ( ruleStruct ) | ( ruleEnum ) | ( ruleUnion ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:808:1: ( ( ruleTable ) | ( ruleStruct ) | ( ruleEnum ) | ( ruleUnion ) )
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
            case 48:
                {
                alt1=3;
                }
                break;
            case 49:
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:809:1: ( ruleTable )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:809:1: ( ruleTable )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:810:1: ruleTable
                    {
                     before(grammarAccess.getDefinitionAccess().getTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTable_in_rule__Definition__Alternatives1648);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:815:6: ( ruleStruct )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:815:6: ( ruleStruct )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:816:1: ruleStruct
                    {
                     before(grammarAccess.getDefinitionAccess().getStructParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStruct_in_rule__Definition__Alternatives1665);
                    ruleStruct();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getStructParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:821:6: ( ruleEnum )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:821:6: ( ruleEnum )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:822:1: ruleEnum
                    {
                     before(grammarAccess.getDefinitionAccess().getEnumParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Definition__Alternatives1682);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getEnumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:827:6: ( ruleUnion )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:827:6: ( ruleUnion )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:828:1: ruleUnion
                    {
                     before(grammarAccess.getDefinitionAccess().getUnionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUnion_in_rule__Definition__Alternatives1699);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:838:1: rule__StructFields__Alternatives_2 : ( ( ( rule__StructFields__PrimTypeAssignment_2_0 ) ) | ( ( rule__StructFields__DefTypeAssignment_2_1 ) ) );
    public final void rule__StructFields__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:842:1: ( ( ( rule__StructFields__PrimTypeAssignment_2_0 ) ) | ( ( rule__StructFields__DefTypeAssignment_2_1 ) ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:843:1: ( ( rule__StructFields__PrimTypeAssignment_2_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:843:1: ( ( rule__StructFields__PrimTypeAssignment_2_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:844:1: ( rule__StructFields__PrimTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getStructFieldsAccess().getPrimTypeAssignment_2_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:845:1: ( rule__StructFields__PrimTypeAssignment_2_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:845:2: rule__StructFields__PrimTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__StructFields__PrimTypeAssignment_2_0_in_rule__StructFields__Alternatives_21731);
                    rule__StructFields__PrimTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructFieldsAccess().getPrimTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:849:6: ( ( rule__StructFields__DefTypeAssignment_2_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:849:6: ( ( rule__StructFields__DefTypeAssignment_2_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:850:1: ( rule__StructFields__DefTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getStructFieldsAccess().getDefTypeAssignment_2_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:851:1: ( rule__StructFields__DefTypeAssignment_2_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:851:2: rule__StructFields__DefTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__StructFields__DefTypeAssignment_2_1_in_rule__StructFields__Alternatives_21749);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:860:1: rule__Value__Alternatives : ( ( ( rule__Value__NumberAssignment_0 ) ) | ( ( rule__Value__IsFalseAssignment_1 ) ) | ( ( rule__Value__IsTrueAssignment_2 ) ) | ( ( rule__Value__EnumCaseAssignment_3 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:864:1: ( ( ( rule__Value__NumberAssignment_0 ) ) | ( ( rule__Value__IsFalseAssignment_1 ) ) | ( ( rule__Value__IsTrueAssignment_2 ) ) | ( ( rule__Value__EnumCaseAssignment_3 ) ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:865:1: ( ( rule__Value__NumberAssignment_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:865:1: ( ( rule__Value__NumberAssignment_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:866:1: ( rule__Value__NumberAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getNumberAssignment_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:867:1: ( rule__Value__NumberAssignment_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:867:2: rule__Value__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Value__NumberAssignment_0_in_rule__Value__Alternatives1782);
                    rule__Value__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:871:6: ( ( rule__Value__IsFalseAssignment_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:871:6: ( ( rule__Value__IsFalseAssignment_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:872:1: ( rule__Value__IsFalseAssignment_1 )
                    {
                     before(grammarAccess.getValueAccess().getIsFalseAssignment_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:873:1: ( rule__Value__IsFalseAssignment_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:873:2: rule__Value__IsFalseAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Value__IsFalseAssignment_1_in_rule__Value__Alternatives1800);
                    rule__Value__IsFalseAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getIsFalseAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:877:6: ( ( rule__Value__IsTrueAssignment_2 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:877:6: ( ( rule__Value__IsTrueAssignment_2 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:878:1: ( rule__Value__IsTrueAssignment_2 )
                    {
                     before(grammarAccess.getValueAccess().getIsTrueAssignment_2()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:879:1: ( rule__Value__IsTrueAssignment_2 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:879:2: rule__Value__IsTrueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Value__IsTrueAssignment_2_in_rule__Value__Alternatives1818);
                    rule__Value__IsTrueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getIsTrueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:883:6: ( ( rule__Value__EnumCaseAssignment_3 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:883:6: ( ( rule__Value__EnumCaseAssignment_3 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:884:1: ( rule__Value__EnumCaseAssignment_3 )
                    {
                     before(grammarAccess.getValueAccess().getEnumCaseAssignment_3()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:885:1: ( rule__Value__EnumCaseAssignment_3 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:885:2: rule__Value__EnumCaseAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Value__EnumCaseAssignment_3_in_rule__Value__Alternatives1836);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:894:1: rule__AttributeName__Alternatives : ( ( ( rule__AttributeName__DeprectatedAssignment_0 ) ) | ( ( rule__AttributeName__Group_1__0 ) ) | ( ( rule__AttributeName__RequiredAssignment_2 ) ) | ( ( rule__AttributeName__Original_orderAssignment_3 ) ) | ( ( rule__AttributeName__Group_4__0 ) ) | ( ( rule__AttributeName__Group_5__0 ) ) | ( ( rule__AttributeName__Bit_flagsAssignment_6 ) ) | ( ( rule__AttributeName__Group_7__0 ) ) | ( ( rule__AttributeName__KeyAssignment_8 ) ) | ( ( rule__AttributeName__Group_9__0 ) ) );
    public final void rule__AttributeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:898:1: ( ( ( rule__AttributeName__DeprectatedAssignment_0 ) ) | ( ( rule__AttributeName__Group_1__0 ) ) | ( ( rule__AttributeName__RequiredAssignment_2 ) ) | ( ( rule__AttributeName__Original_orderAssignment_3 ) ) | ( ( rule__AttributeName__Group_4__0 ) ) | ( ( rule__AttributeName__Group_5__0 ) ) | ( ( rule__AttributeName__Bit_flagsAssignment_6 ) ) | ( ( rule__AttributeName__Group_7__0 ) ) | ( ( rule__AttributeName__KeyAssignment_8 ) ) | ( ( rule__AttributeName__Group_9__0 ) ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:899:1: ( ( rule__AttributeName__DeprectatedAssignment_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:899:1: ( ( rule__AttributeName__DeprectatedAssignment_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:900:1: ( rule__AttributeName__DeprectatedAssignment_0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getDeprectatedAssignment_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:901:1: ( rule__AttributeName__DeprectatedAssignment_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:901:2: rule__AttributeName__DeprectatedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__DeprectatedAssignment_0_in_rule__AttributeName__Alternatives1869);
                    rule__AttributeName__DeprectatedAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getDeprectatedAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:905:6: ( ( rule__AttributeName__Group_1__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:905:6: ( ( rule__AttributeName__Group_1__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:906:1: ( rule__AttributeName__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:907:1: ( rule__AttributeName__Group_1__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:907:2: rule__AttributeName__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Alternatives1887);
                    rule__AttributeName__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:911:6: ( ( rule__AttributeName__RequiredAssignment_2 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:911:6: ( ( rule__AttributeName__RequiredAssignment_2 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:912:1: ( rule__AttributeName__RequiredAssignment_2 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getRequiredAssignment_2()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:913:1: ( rule__AttributeName__RequiredAssignment_2 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:913:2: rule__AttributeName__RequiredAssignment_2
                    {
                    pushFollow(FOLLOW_rule__AttributeName__RequiredAssignment_2_in_rule__AttributeName__Alternatives1905);
                    rule__AttributeName__RequiredAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getRequiredAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:917:6: ( ( rule__AttributeName__Original_orderAssignment_3 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:917:6: ( ( rule__AttributeName__Original_orderAssignment_3 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:918:1: ( rule__AttributeName__Original_orderAssignment_3 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getOriginal_orderAssignment_3()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:919:1: ( rule__AttributeName__Original_orderAssignment_3 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:919:2: rule__AttributeName__Original_orderAssignment_3
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Original_orderAssignment_3_in_rule__AttributeName__Alternatives1923);
                    rule__AttributeName__Original_orderAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getOriginal_orderAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:923:6: ( ( rule__AttributeName__Group_4__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:923:6: ( ( rule__AttributeName__Group_4__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:924:1: ( rule__AttributeName__Group_4__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_4()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:925:1: ( rule__AttributeName__Group_4__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:925:2: rule__AttributeName__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_4__0_in_rule__AttributeName__Alternatives1941);
                    rule__AttributeName__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:929:6: ( ( rule__AttributeName__Group_5__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:929:6: ( ( rule__AttributeName__Group_5__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:930:1: ( rule__AttributeName__Group_5__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_5()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:931:1: ( rule__AttributeName__Group_5__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:931:2: rule__AttributeName__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_5__0_in_rule__AttributeName__Alternatives1959);
                    rule__AttributeName__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:935:6: ( ( rule__AttributeName__Bit_flagsAssignment_6 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:935:6: ( ( rule__AttributeName__Bit_flagsAssignment_6 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:936:1: ( rule__AttributeName__Bit_flagsAssignment_6 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getBit_flagsAssignment_6()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:937:1: ( rule__AttributeName__Bit_flagsAssignment_6 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:937:2: rule__AttributeName__Bit_flagsAssignment_6
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Bit_flagsAssignment_6_in_rule__AttributeName__Alternatives1977);
                    rule__AttributeName__Bit_flagsAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getBit_flagsAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:941:6: ( ( rule__AttributeName__Group_7__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:941:6: ( ( rule__AttributeName__Group_7__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:942:1: ( rule__AttributeName__Group_7__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_7()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:943:1: ( rule__AttributeName__Group_7__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:943:2: rule__AttributeName__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_7__0_in_rule__AttributeName__Alternatives1995);
                    rule__AttributeName__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:947:6: ( ( rule__AttributeName__KeyAssignment_8 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:947:6: ( ( rule__AttributeName__KeyAssignment_8 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:948:1: ( rule__AttributeName__KeyAssignment_8 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getKeyAssignment_8()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:949:1: ( rule__AttributeName__KeyAssignment_8 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:949:2: rule__AttributeName__KeyAssignment_8
                    {
                    pushFollow(FOLLOW_rule__AttributeName__KeyAssignment_8_in_rule__AttributeName__Alternatives2013);
                    rule__AttributeName__KeyAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getKeyAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:953:6: ( ( rule__AttributeName__Group_9__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:953:6: ( ( rule__AttributeName__Group_9__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:954:1: ( rule__AttributeName__Group_9__0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getGroup_9()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:955:1: ( rule__AttributeName__Group_9__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:955:2: rule__AttributeName__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_9__0_in_rule__AttributeName__Alternatives2031);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:964:1: rule__AttributeName__Alternatives_9_1_1 : ( ( ( rule__AttributeName__IntValueAssignment_9_1_1_0 ) ) | ( ( rule__AttributeName__StringValueAssignment_9_1_1_1 ) ) );
    public final void rule__AttributeName__Alternatives_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:968:1: ( ( ( rule__AttributeName__IntValueAssignment_9_1_1_0 ) ) | ( ( rule__AttributeName__StringValueAssignment_9_1_1_1 ) ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:969:1: ( ( rule__AttributeName__IntValueAssignment_9_1_1_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:969:1: ( ( rule__AttributeName__IntValueAssignment_9_1_1_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:970:1: ( rule__AttributeName__IntValueAssignment_9_1_1_0 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getIntValueAssignment_9_1_1_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:971:1: ( rule__AttributeName__IntValueAssignment_9_1_1_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:971:2: rule__AttributeName__IntValueAssignment_9_1_1_0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__IntValueAssignment_9_1_1_0_in_rule__AttributeName__Alternatives_9_1_12064);
                    rule__AttributeName__IntValueAssignment_9_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeNameAccess().getIntValueAssignment_9_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:975:6: ( ( rule__AttributeName__StringValueAssignment_9_1_1_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:975:6: ( ( rule__AttributeName__StringValueAssignment_9_1_1_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:976:1: ( rule__AttributeName__StringValueAssignment_9_1_1_1 )
                    {
                     before(grammarAccess.getAttributeNameAccess().getStringValueAssignment_9_1_1_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:977:1: ( rule__AttributeName__StringValueAssignment_9_1_1_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:977:2: rule__AttributeName__StringValueAssignment_9_1_1_1
                    {
                    pushFollow(FOLLOW_rule__AttributeName__StringValueAssignment_9_1_1_1_in_rule__AttributeName__Alternatives_9_1_12082);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:986:1: rule__Type__Alternatives : ( ( ( rule__Type__PrimTypeAssignment_0 ) ) | ( ( rule__Type__VectorTypeAssignment_1 ) ) | ( ( rule__Type__DefTypeAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:990:1: ( ( ( rule__Type__PrimTypeAssignment_0 ) ) | ( ( rule__Type__VectorTypeAssignment_1 ) ) | ( ( rule__Type__DefTypeAssignment_2 ) ) )
            int alt6=3;
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
            case 46:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:991:1: ( ( rule__Type__PrimTypeAssignment_0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:991:1: ( ( rule__Type__PrimTypeAssignment_0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:992:1: ( rule__Type__PrimTypeAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getPrimTypeAssignment_0()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:993:1: ( rule__Type__PrimTypeAssignment_0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:993:2: rule__Type__PrimTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__PrimTypeAssignment_0_in_rule__Type__Alternatives2115);
                    rule__Type__PrimTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getPrimTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:997:6: ( ( rule__Type__VectorTypeAssignment_1 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:997:6: ( ( rule__Type__VectorTypeAssignment_1 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:998:1: ( rule__Type__VectorTypeAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getVectorTypeAssignment_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:999:1: ( rule__Type__VectorTypeAssignment_1 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:999:2: rule__Type__VectorTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__VectorTypeAssignment_1_in_rule__Type__Alternatives2133);
                    rule__Type__VectorTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getVectorTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1003:6: ( ( rule__Type__DefTypeAssignment_2 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1003:6: ( ( rule__Type__DefTypeAssignment_2 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1004:1: ( rule__Type__DefTypeAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getDefTypeAssignment_2()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1005:1: ( rule__Type__DefTypeAssignment_2 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1005:2: rule__Type__DefTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__DefTypeAssignment_2_in_rule__Type__Alternatives2151);
                    rule__Type__DefTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getDefTypeAssignment_2()); 

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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1014:1: rule__PrimitiveWithoutString__Alternatives : ( ( 'bool' ) | ( 'float' ) | ( 'double' ) | ( rulePrimitiveNumberType ) );
    public final void rule__PrimitiveWithoutString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1018:1: ( ( 'bool' ) | ( 'float' ) | ( 'double' ) | ( rulePrimitiveNumberType ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1019:1: ( 'bool' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1019:1: ( 'bool' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1020:1: 'bool'
                    {
                     before(grammarAccess.getPrimitiveWithoutStringAccess().getBoolKeyword_0()); 
                    match(input,18,FOLLOW_18_in_rule__PrimitiveWithoutString__Alternatives2185); 
                     after(grammarAccess.getPrimitiveWithoutStringAccess().getBoolKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1027:6: ( 'float' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1027:6: ( 'float' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1028:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveWithoutStringAccess().getFloatKeyword_1()); 
                    match(input,19,FOLLOW_19_in_rule__PrimitiveWithoutString__Alternatives2205); 
                     after(grammarAccess.getPrimitiveWithoutStringAccess().getFloatKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1035:6: ( 'double' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1035:6: ( 'double' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1036:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveWithoutStringAccess().getDoubleKeyword_2()); 
                    match(input,20,FOLLOW_20_in_rule__PrimitiveWithoutString__Alternatives2225); 
                     after(grammarAccess.getPrimitiveWithoutStringAccess().getDoubleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1043:6: ( rulePrimitiveNumberType )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1043:6: ( rulePrimitiveNumberType )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1044:1: rulePrimitiveNumberType
                    {
                     before(grammarAccess.getPrimitiveWithoutStringAccess().getPrimitiveNumberTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePrimitiveNumberType_in_rule__PrimitiveWithoutString__Alternatives2244);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1054:1: rule__Primitive__Alternatives : ( ( 'string' ) | ( rulePrimitiveWithoutString ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1058:1: ( ( 'string' ) | ( rulePrimitiveWithoutString ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1059:1: ( 'string' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1059:1: ( 'string' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1060:1: 'string'
                    {
                     before(grammarAccess.getPrimitiveAccess().getStringKeyword_0()); 
                    match(input,21,FOLLOW_21_in_rule__Primitive__Alternatives2277); 
                     after(grammarAccess.getPrimitiveAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1067:6: ( rulePrimitiveWithoutString )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1067:6: ( rulePrimitiveWithoutString )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1068:1: rulePrimitiveWithoutString
                    {
                     before(grammarAccess.getPrimitiveAccess().getPrimitiveWithoutStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitiveWithoutString_in_rule__Primitive__Alternatives2296);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1078:1: rule__PrimitiveNumberType__Alternatives : ( ( 'byte' ) | ( 'ubyte' ) | ( 'short' ) | ( 'ushort' ) | ( 'int' ) | ( 'uint' ) | ( 'long' ) | ( 'ulong' ) );
    public final void rule__PrimitiveNumberType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1082:1: ( ( 'byte' ) | ( 'ubyte' ) | ( 'short' ) | ( 'ushort' ) | ( 'int' ) | ( 'uint' ) | ( 'long' ) | ( 'ulong' ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1083:1: ( 'byte' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1083:1: ( 'byte' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1084:1: 'byte'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getByteKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__PrimitiveNumberType__Alternatives2329); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1091:6: ( 'ubyte' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1091:6: ( 'ubyte' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1092:1: 'ubyte'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getUbyteKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__PrimitiveNumberType__Alternatives2349); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getUbyteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1099:6: ( 'short' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1099:6: ( 'short' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1100:1: 'short'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getShortKeyword_2()); 
                    match(input,24,FOLLOW_24_in_rule__PrimitiveNumberType__Alternatives2369); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getShortKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1107:6: ( 'ushort' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1107:6: ( 'ushort' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1108:1: 'ushort'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getUshortKeyword_3()); 
                    match(input,25,FOLLOW_25_in_rule__PrimitiveNumberType__Alternatives2389); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getUshortKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1115:6: ( 'int' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1115:6: ( 'int' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1116:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getIntKeyword_4()); 
                    match(input,26,FOLLOW_26_in_rule__PrimitiveNumberType__Alternatives2409); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getIntKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1123:6: ( 'uint' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1123:6: ( 'uint' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1124:1: 'uint'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getUintKeyword_5()); 
                    match(input,27,FOLLOW_27_in_rule__PrimitiveNumberType__Alternatives2429); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getUintKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1131:6: ( 'long' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1131:6: ( 'long' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1132:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getLongKeyword_6()); 
                    match(input,28,FOLLOW_28_in_rule__PrimitiveNumberType__Alternatives2449); 
                     after(grammarAccess.getPrimitiveNumberTypeAccess().getLongKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1139:6: ( 'ulong' )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1139:6: ( 'ulong' )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1140:1: 'ulong'
                    {
                     before(grammarAccess.getPrimitiveNumberTypeAccess().getUlongKeyword_7()); 
                    match(input,29,FOLLOW_29_in_rule__PrimitiveNumberType__Alternatives2469); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1152:1: rule__ValidID__Alternatives : ( ( RULE_HASH_ATTRIBUTE ) | ( RULE_ID_ATTRIBUTE ) | ( RULE_REQUIRED_ATTRIBUTE ) | ( RULE_KEY_ATTRIBUTE ) | ( RULE_DEPRECTED_ATTRIBUTE ) | ( RULE_ID ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1156:1: ( ( RULE_HASH_ATTRIBUTE ) | ( RULE_ID_ATTRIBUTE ) | ( RULE_REQUIRED_ATTRIBUTE ) | ( RULE_KEY_ATTRIBUTE ) | ( RULE_DEPRECTED_ATTRIBUTE ) | ( RULE_ID ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1157:1: ( RULE_HASH_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1157:1: ( RULE_HASH_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1158:1: RULE_HASH_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getHASH_ATTRIBUTETerminalRuleCall_0()); 
                    match(input,RULE_HASH_ATTRIBUTE,FOLLOW_RULE_HASH_ATTRIBUTE_in_rule__ValidID__Alternatives2503); 
                     after(grammarAccess.getValidIDAccess().getHASH_ATTRIBUTETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1163:6: ( RULE_ID_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1163:6: ( RULE_ID_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1164:1: RULE_ID_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getID_ATTRIBUTETerminalRuleCall_1()); 
                    match(input,RULE_ID_ATTRIBUTE,FOLLOW_RULE_ID_ATTRIBUTE_in_rule__ValidID__Alternatives2520); 
                     after(grammarAccess.getValidIDAccess().getID_ATTRIBUTETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1169:6: ( RULE_REQUIRED_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1169:6: ( RULE_REQUIRED_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1170:1: RULE_REQUIRED_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getREQUIRED_ATTRIBUTETerminalRuleCall_2()); 
                    match(input,RULE_REQUIRED_ATTRIBUTE,FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_rule__ValidID__Alternatives2537); 
                     after(grammarAccess.getValidIDAccess().getREQUIRED_ATTRIBUTETerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1175:6: ( RULE_KEY_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1175:6: ( RULE_KEY_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1176:1: RULE_KEY_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getKEY_ATTRIBUTETerminalRuleCall_3()); 
                    match(input,RULE_KEY_ATTRIBUTE,FOLLOW_RULE_KEY_ATTRIBUTE_in_rule__ValidID__Alternatives2554); 
                     after(grammarAccess.getValidIDAccess().getKEY_ATTRIBUTETerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1181:6: ( RULE_DEPRECTED_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1181:6: ( RULE_DEPRECTED_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1182:1: RULE_DEPRECTED_ATTRIBUTE
                    {
                     before(grammarAccess.getValidIDAccess().getDEPRECTED_ATTRIBUTETerminalRuleCall_4()); 
                    match(input,RULE_DEPRECTED_ATTRIBUTE,FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_rule__ValidID__Alternatives2571); 
                     after(grammarAccess.getValidIDAccess().getDEPRECTED_ATTRIBUTETerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1187:6: ( RULE_ID )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1187:6: ( RULE_ID )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1188:1: RULE_ID
                    {
                     before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_5()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValidID__Alternatives2588); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1198:1: rule__Number__Alternatives : ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1202:1: ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1203:1: ( RULE_HEX )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1203:1: ( RULE_HEX )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1204:1: RULE_HEX
                    {
                     before(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                    match(input,RULE_HEX,FOLLOW_RULE_HEX_in_rule__Number__Alternatives2620); 
                     after(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1209:6: ( ( rule__Number__Group_1__0 ) )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1209:6: ( ( rule__Number__Group_1__0 ) )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1210:1: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1211:1: ( rule__Number__Group_1__0 )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1211:2: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives2637);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1220:1: rule__Number__Alternatives_1_0 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1224:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1225:1: ( RULE_INT )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1225:1: ( RULE_INT )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1226:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_02670); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1231:6: ( RULE_DECIMAL )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1231:6: ( RULE_DECIMAL )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1232:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_02687); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1242:1: rule__Number__Alternatives_1_1_1 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1246:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
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
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1247:1: ( RULE_INT )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1247:1: ( RULE_INT )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1248:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_12719); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1253:6: ( RULE_DECIMAL )
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1253:6: ( RULE_DECIMAL )
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1254:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_12736); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1266:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1270:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1271:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__02766);
            rule__Schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__02769);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1278:1: rule__Schema__Group__0__Impl : ( ( rule__Schema__IncludesAssignment_0 )* ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1282:1: ( ( ( rule__Schema__IncludesAssignment_0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1283:1: ( ( rule__Schema__IncludesAssignment_0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1283:1: ( ( rule__Schema__IncludesAssignment_0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1284:1: ( rule__Schema__IncludesAssignment_0 )*
            {
             before(grammarAccess.getSchemaAccess().getIncludesAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1285:1: ( rule__Schema__IncludesAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1285:2: rule__Schema__IncludesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Schema__IncludesAssignment_0_in_rule__Schema__Group__0__Impl2796);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1295:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1299:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1300:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__12827);
            rule__Schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__12830);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1307:1: rule__Schema__Group__1__Impl : ( ( rule__Schema__NamepsaceAssignment_1 )? ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1311:1: ( ( ( rule__Schema__NamepsaceAssignment_1 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1312:1: ( ( rule__Schema__NamepsaceAssignment_1 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1312:1: ( ( rule__Schema__NamepsaceAssignment_1 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1313:1: ( rule__Schema__NamepsaceAssignment_1 )?
            {
             before(grammarAccess.getSchemaAccess().getNamepsaceAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1314:1: ( rule__Schema__NamepsaceAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1314:2: rule__Schema__NamepsaceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Schema__NamepsaceAssignment_1_in_rule__Schema__Group__1__Impl2857);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1324:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1328:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1329:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__22888);
            rule__Schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__3_in_rule__Schema__Group__22891);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1336:1: rule__Schema__Group__2__Impl : ( ( rule__Schema__FileIdentifierAssignment_2 )? ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1340:1: ( ( ( rule__Schema__FileIdentifierAssignment_2 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1341:1: ( ( rule__Schema__FileIdentifierAssignment_2 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1341:1: ( ( rule__Schema__FileIdentifierAssignment_2 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1342:1: ( rule__Schema__FileIdentifierAssignment_2 )?
            {
             before(grammarAccess.getSchemaAccess().getFileIdentifierAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1343:1: ( rule__Schema__FileIdentifierAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1343:2: rule__Schema__FileIdentifierAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Schema__FileIdentifierAssignment_2_in_rule__Schema__Group__2__Impl2918);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1353:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1357:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1358:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_rule__Schema__Group__3__Impl_in_rule__Schema__Group__32949);
            rule__Schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__4_in_rule__Schema__Group__32952);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1365:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__File_extensionAssignment_3 )? ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1369:1: ( ( ( rule__Schema__File_extensionAssignment_3 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1370:1: ( ( rule__Schema__File_extensionAssignment_3 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1370:1: ( ( rule__Schema__File_extensionAssignment_3 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1371:1: ( rule__Schema__File_extensionAssignment_3 )?
            {
             before(grammarAccess.getSchemaAccess().getFile_extensionAssignment_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1372:1: ( rule__Schema__File_extensionAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1372:2: rule__Schema__File_extensionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Schema__File_extensionAssignment_3_in_rule__Schema__Group__3__Impl2979);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1382:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1386:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1387:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
            {
            pushFollow(FOLLOW_rule__Schema__Group__4__Impl_in_rule__Schema__Group__43010);
            rule__Schema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__5_in_rule__Schema__Group__43013);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1394:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__CustomAttributesAssignment_4 )* ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1398:1: ( ( ( rule__Schema__CustomAttributesAssignment_4 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1399:1: ( ( rule__Schema__CustomAttributesAssignment_4 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1399:1: ( ( rule__Schema__CustomAttributesAssignment_4 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1400:1: ( rule__Schema__CustomAttributesAssignment_4 )*
            {
             before(grammarAccess.getSchemaAccess().getCustomAttributesAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1401:1: ( rule__Schema__CustomAttributesAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1401:2: rule__Schema__CustomAttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Schema__CustomAttributesAssignment_4_in_rule__Schema__Group__4__Impl3040);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1411:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl rule__Schema__Group__6 ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1415:1: ( rule__Schema__Group__5__Impl rule__Schema__Group__6 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1416:2: rule__Schema__Group__5__Impl rule__Schema__Group__6
            {
            pushFollow(FOLLOW_rule__Schema__Group__5__Impl_in_rule__Schema__Group__53071);
            rule__Schema__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__6_in_rule__Schema__Group__53074);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1423:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__DefinitionsAssignment_5 )* ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1427:1: ( ( ( rule__Schema__DefinitionsAssignment_5 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1428:1: ( ( rule__Schema__DefinitionsAssignment_5 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1428:1: ( ( rule__Schema__DefinitionsAssignment_5 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1429:1: ( rule__Schema__DefinitionsAssignment_5 )*
            {
             before(grammarAccess.getSchemaAccess().getDefinitionsAssignment_5()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1430:1: ( rule__Schema__DefinitionsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37||LA19_0==41||(LA19_0>=48 && LA19_0<=49)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1430:2: rule__Schema__DefinitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Schema__DefinitionsAssignment_5_in_rule__Schema__Group__5__Impl3101);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1440:1: rule__Schema__Group__6 : rule__Schema__Group__6__Impl ;
    public final void rule__Schema__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1444:1: ( rule__Schema__Group__6__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1445:2: rule__Schema__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Schema__Group__6__Impl_in_rule__Schema__Group__63132);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1451:1: rule__Schema__Group__6__Impl : ( ( rule__Schema__RootTypeAssignment_6 ) ) ;
    public final void rule__Schema__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1455:1: ( ( ( rule__Schema__RootTypeAssignment_6 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1456:1: ( ( rule__Schema__RootTypeAssignment_6 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1456:1: ( ( rule__Schema__RootTypeAssignment_6 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1457:1: ( rule__Schema__RootTypeAssignment_6 )
            {
             before(grammarAccess.getSchemaAccess().getRootTypeAssignment_6()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1458:1: ( rule__Schema__RootTypeAssignment_6 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1458:2: rule__Schema__RootTypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Schema__RootTypeAssignment_6_in_rule__Schema__Group__6__Impl3159);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1482:1: rule__RootType__Group__0 : rule__RootType__Group__0__Impl rule__RootType__Group__1 ;
    public final void rule__RootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1486:1: ( rule__RootType__Group__0__Impl rule__RootType__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1487:2: rule__RootType__Group__0__Impl rule__RootType__Group__1
            {
            pushFollow(FOLLOW_rule__RootType__Group__0__Impl_in_rule__RootType__Group__03203);
            rule__RootType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootType__Group__1_in_rule__RootType__Group__03206);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1494:1: rule__RootType__Group__0__Impl : ( 'root_type' ) ;
    public final void rule__RootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1498:1: ( ( 'root_type' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1499:1: ( 'root_type' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1499:1: ( 'root_type' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1500:1: 'root_type'
            {
             before(grammarAccess.getRootTypeAccess().getRoot_typeKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__RootType__Group__0__Impl3234); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1513:1: rule__RootType__Group__1 : rule__RootType__Group__1__Impl rule__RootType__Group__2 ;
    public final void rule__RootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1517:1: ( rule__RootType__Group__1__Impl rule__RootType__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1518:2: rule__RootType__Group__1__Impl rule__RootType__Group__2
            {
            pushFollow(FOLLOW_rule__RootType__Group__1__Impl_in_rule__RootType__Group__13265);
            rule__RootType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootType__Group__2_in_rule__RootType__Group__13268);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1525:1: rule__RootType__Group__1__Impl : ( ( rule__RootType__TypeAssignment_1 ) ) ;
    public final void rule__RootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1529:1: ( ( ( rule__RootType__TypeAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1530:1: ( ( rule__RootType__TypeAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1530:1: ( ( rule__RootType__TypeAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1531:1: ( rule__RootType__TypeAssignment_1 )
            {
             before(grammarAccess.getRootTypeAccess().getTypeAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1532:1: ( rule__RootType__TypeAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1532:2: rule__RootType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__RootType__TypeAssignment_1_in_rule__RootType__Group__1__Impl3295);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1542:1: rule__RootType__Group__2 : rule__RootType__Group__2__Impl ;
    public final void rule__RootType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1546:1: ( rule__RootType__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1547:2: rule__RootType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RootType__Group__2__Impl_in_rule__RootType__Group__23325);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1553:1: rule__RootType__Group__2__Impl : ( ';' ) ;
    public final void rule__RootType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1557:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1558:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1558:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1559:1: ';'
            {
             before(grammarAccess.getRootTypeAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__RootType__Group__2__Impl3353); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1578:1: rule__CustomAttributes__Group__0 : rule__CustomAttributes__Group__0__Impl rule__CustomAttributes__Group__1 ;
    public final void rule__CustomAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1582:1: ( rule__CustomAttributes__Group__0__Impl rule__CustomAttributes__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1583:2: rule__CustomAttributes__Group__0__Impl rule__CustomAttributes__Group__1
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__0__Impl_in_rule__CustomAttributes__Group__03390);
            rule__CustomAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttributes__Group__1_in_rule__CustomAttributes__Group__03393);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1590:1: rule__CustomAttributes__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__CustomAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1594:1: ( ( 'attribute' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1595:1: ( 'attribute' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1595:1: ( 'attribute' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1596:1: 'attribute'
            {
             before(grammarAccess.getCustomAttributesAccess().getAttributeKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__CustomAttributes__Group__0__Impl3421); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1609:1: rule__CustomAttributes__Group__1 : rule__CustomAttributes__Group__1__Impl rule__CustomAttributes__Group__2 ;
    public final void rule__CustomAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1613:1: ( rule__CustomAttributes__Group__1__Impl rule__CustomAttributes__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1614:2: rule__CustomAttributes__Group__1__Impl rule__CustomAttributes__Group__2
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__1__Impl_in_rule__CustomAttributes__Group__13452);
            rule__CustomAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttributes__Group__2_in_rule__CustomAttributes__Group__13455);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1621:1: rule__CustomAttributes__Group__1__Impl : ( ( rule__CustomAttributes__NameAssignment_1 ) ) ;
    public final void rule__CustomAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1625:1: ( ( ( rule__CustomAttributes__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1626:1: ( ( rule__CustomAttributes__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1626:1: ( ( rule__CustomAttributes__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1627:1: ( rule__CustomAttributes__NameAssignment_1 )
            {
             before(grammarAccess.getCustomAttributesAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1628:1: ( rule__CustomAttributes__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1628:2: rule__CustomAttributes__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomAttributes__NameAssignment_1_in_rule__CustomAttributes__Group__1__Impl3482);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1638:1: rule__CustomAttributes__Group__2 : rule__CustomAttributes__Group__2__Impl ;
    public final void rule__CustomAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1642:1: ( rule__CustomAttributes__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1643:2: rule__CustomAttributes__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttributes__Group__2__Impl_in_rule__CustomAttributes__Group__23512);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1649:1: rule__CustomAttributes__Group__2__Impl : ( ';' ) ;
    public final void rule__CustomAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1653:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1654:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1654:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1655:1: ';'
            {
             before(grammarAccess.getCustomAttributesAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__CustomAttributes__Group__2__Impl3540); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1674:1: rule__FileIdentifier__Group__0 : rule__FileIdentifier__Group__0__Impl rule__FileIdentifier__Group__1 ;
    public final void rule__FileIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1678:1: ( rule__FileIdentifier__Group__0__Impl rule__FileIdentifier__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1679:2: rule__FileIdentifier__Group__0__Impl rule__FileIdentifier__Group__1
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__0__Impl_in_rule__FileIdentifier__Group__03577);
            rule__FileIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileIdentifier__Group__1_in_rule__FileIdentifier__Group__03580);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1686:1: rule__FileIdentifier__Group__0__Impl : ( 'file_identifier' ) ;
    public final void rule__FileIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1690:1: ( ( 'file_identifier' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1691:1: ( 'file_identifier' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1691:1: ( 'file_identifier' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1692:1: 'file_identifier'
            {
             before(grammarAccess.getFileIdentifierAccess().getFile_identifierKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__FileIdentifier__Group__0__Impl3608); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1705:1: rule__FileIdentifier__Group__1 : rule__FileIdentifier__Group__1__Impl rule__FileIdentifier__Group__2 ;
    public final void rule__FileIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1709:1: ( rule__FileIdentifier__Group__1__Impl rule__FileIdentifier__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1710:2: rule__FileIdentifier__Group__1__Impl rule__FileIdentifier__Group__2
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__1__Impl_in_rule__FileIdentifier__Group__13639);
            rule__FileIdentifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileIdentifier__Group__2_in_rule__FileIdentifier__Group__13642);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1717:1: rule__FileIdentifier__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__FileIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1721:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1722:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1722:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1723:1: RULE_STRING
            {
             before(grammarAccess.getFileIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FileIdentifier__Group__1__Impl3669); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1734:1: rule__FileIdentifier__Group__2 : rule__FileIdentifier__Group__2__Impl ;
    public final void rule__FileIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1738:1: ( rule__FileIdentifier__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1739:2: rule__FileIdentifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FileIdentifier__Group__2__Impl_in_rule__FileIdentifier__Group__23698);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1745:1: rule__FileIdentifier__Group__2__Impl : ( ';' ) ;
    public final void rule__FileIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1749:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1750:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1750:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1751:1: ';'
            {
             before(grammarAccess.getFileIdentifierAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__FileIdentifier__Group__2__Impl3726); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1770:1: rule__FileExtension__Group__0 : rule__FileExtension__Group__0__Impl rule__FileExtension__Group__1 ;
    public final void rule__FileExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1774:1: ( rule__FileExtension__Group__0__Impl rule__FileExtension__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1775:2: rule__FileExtension__Group__0__Impl rule__FileExtension__Group__1
            {
            pushFollow(FOLLOW_rule__FileExtension__Group__0__Impl_in_rule__FileExtension__Group__03763);
            rule__FileExtension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileExtension__Group__1_in_rule__FileExtension__Group__03766);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1782:1: rule__FileExtension__Group__0__Impl : ( 'file_extension' ) ;
    public final void rule__FileExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1786:1: ( ( 'file_extension' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1787:1: ( 'file_extension' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1787:1: ( 'file_extension' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1788:1: 'file_extension'
            {
             before(grammarAccess.getFileExtensionAccess().getFile_extensionKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FileExtension__Group__0__Impl3794); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1801:1: rule__FileExtension__Group__1 : rule__FileExtension__Group__1__Impl rule__FileExtension__Group__2 ;
    public final void rule__FileExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1805:1: ( rule__FileExtension__Group__1__Impl rule__FileExtension__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1806:2: rule__FileExtension__Group__1__Impl rule__FileExtension__Group__2
            {
            pushFollow(FOLLOW_rule__FileExtension__Group__1__Impl_in_rule__FileExtension__Group__13825);
            rule__FileExtension__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileExtension__Group__2_in_rule__FileExtension__Group__13828);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1813:1: rule__FileExtension__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__FileExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1817:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1818:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1818:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1819:1: RULE_STRING
            {
             before(grammarAccess.getFileExtensionAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FileExtension__Group__1__Impl3855); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1830:1: rule__FileExtension__Group__2 : rule__FileExtension__Group__2__Impl ;
    public final void rule__FileExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1834:1: ( rule__FileExtension__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1835:2: rule__FileExtension__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FileExtension__Group__2__Impl_in_rule__FileExtension__Group__23884);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1841:1: rule__FileExtension__Group__2__Impl : ( ';' ) ;
    public final void rule__FileExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1845:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1846:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1846:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1847:1: ';'
            {
             before(grammarAccess.getFileExtensionAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__FileExtension__Group__2__Impl3912); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1866:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1870:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1871:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03949);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03952);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1878:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1882:1: ( ( 'namespace' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1883:1: ( 'namespace' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1883:1: ( 'namespace' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1884:1: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Namespace__Group__0__Impl3980); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1897:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1901:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1902:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__14011);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__14014);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1909:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1913:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1914:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1914:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1915:1: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1916:1: ( rule__Namespace__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1916:2: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl4041);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1926:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1930:1: ( rule__Namespace__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1931:2: rule__Namespace__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__24071);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1937:1: rule__Namespace__Group__2__Impl : ( ';' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1941:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1942:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1942:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1943:1: ';'
            {
             before(grammarAccess.getNamespaceAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Namespace__Group__2__Impl4099); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1962:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1966:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1967:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__04136);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__04139);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1974:1: rule__Include__Group__0__Impl : ( 'include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1978:1: ( ( 'include' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1979:1: ( 'include' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1979:1: ( 'include' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1980:1: 'include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Include__Group__0__Impl4167); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1993:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1997:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1998:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__14198);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__14201);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2005:1: rule__Include__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2009:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2010:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2010:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2011:1: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__Group__1__Impl4228); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2022:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2026:1: ( rule__Include__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2027:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__24257);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2033:1: rule__Include__Group__2__Impl : ( ';' ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2037:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2038:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2038:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2039:1: ';'
            {
             before(grammarAccess.getIncludeAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Include__Group__2__Impl4285); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2058:1: rule__Struct__Group__0 : rule__Struct__Group__0__Impl rule__Struct__Group__1 ;
    public final void rule__Struct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2062:1: ( rule__Struct__Group__0__Impl rule__Struct__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2063:2: rule__Struct__Group__0__Impl rule__Struct__Group__1
            {
            pushFollow(FOLLOW_rule__Struct__Group__0__Impl_in_rule__Struct__Group__04322);
            rule__Struct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__1_in_rule__Struct__Group__04325);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2070:1: rule__Struct__Group__0__Impl : ( 'struct' ) ;
    public final void rule__Struct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2074:1: ( ( 'struct' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2075:1: ( 'struct' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2075:1: ( 'struct' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2076:1: 'struct'
            {
             before(grammarAccess.getStructAccess().getStructKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Struct__Group__0__Impl4353); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2089:1: rule__Struct__Group__1 : rule__Struct__Group__1__Impl rule__Struct__Group__2 ;
    public final void rule__Struct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2093:1: ( rule__Struct__Group__1__Impl rule__Struct__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2094:2: rule__Struct__Group__1__Impl rule__Struct__Group__2
            {
            pushFollow(FOLLOW_rule__Struct__Group__1__Impl_in_rule__Struct__Group__14384);
            rule__Struct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__2_in_rule__Struct__Group__14387);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2101:1: rule__Struct__Group__1__Impl : ( ( rule__Struct__NameAssignment_1 ) ) ;
    public final void rule__Struct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2105:1: ( ( ( rule__Struct__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2106:1: ( ( rule__Struct__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2106:1: ( ( rule__Struct__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2107:1: ( rule__Struct__NameAssignment_1 )
            {
             before(grammarAccess.getStructAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2108:1: ( rule__Struct__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2108:2: rule__Struct__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Struct__NameAssignment_1_in_rule__Struct__Group__1__Impl4414);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2118:1: rule__Struct__Group__2 : rule__Struct__Group__2__Impl rule__Struct__Group__3 ;
    public final void rule__Struct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2122:1: ( rule__Struct__Group__2__Impl rule__Struct__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2123:2: rule__Struct__Group__2__Impl rule__Struct__Group__3
            {
            pushFollow(FOLLOW_rule__Struct__Group__2__Impl_in_rule__Struct__Group__24444);
            rule__Struct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__3_in_rule__Struct__Group__24447);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2130:1: rule__Struct__Group__2__Impl : ( ( rule__Struct__AttributesAssignment_2 )? ) ;
    public final void rule__Struct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2134:1: ( ( ( rule__Struct__AttributesAssignment_2 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2135:1: ( ( rule__Struct__AttributesAssignment_2 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2135:1: ( ( rule__Struct__AttributesAssignment_2 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2136:1: ( rule__Struct__AttributesAssignment_2 )?
            {
             before(grammarAccess.getStructAccess().getAttributesAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2137:1: ( rule__Struct__AttributesAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2137:2: rule__Struct__AttributesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Struct__AttributesAssignment_2_in_rule__Struct__Group__2__Impl4474);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2147:1: rule__Struct__Group__3 : rule__Struct__Group__3__Impl rule__Struct__Group__4 ;
    public final void rule__Struct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2151:1: ( rule__Struct__Group__3__Impl rule__Struct__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2152:2: rule__Struct__Group__3__Impl rule__Struct__Group__4
            {
            pushFollow(FOLLOW_rule__Struct__Group__3__Impl_in_rule__Struct__Group__34505);
            rule__Struct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__4_in_rule__Struct__Group__34508);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2159:1: rule__Struct__Group__3__Impl : ( '{' ) ;
    public final void rule__Struct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2163:1: ( ( '{' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2164:1: ( '{' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2164:1: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2165:1: '{'
            {
             before(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__Struct__Group__3__Impl4536); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2178:1: rule__Struct__Group__4 : rule__Struct__Group__4__Impl rule__Struct__Group__5 ;
    public final void rule__Struct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2182:1: ( rule__Struct__Group__4__Impl rule__Struct__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2183:2: rule__Struct__Group__4__Impl rule__Struct__Group__5
            {
            pushFollow(FOLLOW_rule__Struct__Group__4__Impl_in_rule__Struct__Group__44567);
            rule__Struct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__5_in_rule__Struct__Group__44570);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2190:1: rule__Struct__Group__4__Impl : ( ( rule__Struct__FieldsAssignment_4 )* ) ;
    public final void rule__Struct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2194:1: ( ( ( rule__Struct__FieldsAssignment_4 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2195:1: ( ( rule__Struct__FieldsAssignment_4 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2195:1: ( ( rule__Struct__FieldsAssignment_4 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2196:1: ( rule__Struct__FieldsAssignment_4 )*
            {
             before(grammarAccess.getStructAccess().getFieldsAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2197:1: ( rule__Struct__FieldsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2197:2: rule__Struct__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Struct__FieldsAssignment_4_in_rule__Struct__Group__4__Impl4597);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2207:1: rule__Struct__Group__5 : rule__Struct__Group__5__Impl ;
    public final void rule__Struct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2211:1: ( rule__Struct__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2212:2: rule__Struct__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Struct__Group__5__Impl_in_rule__Struct__Group__54628);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2218:1: rule__Struct__Group__5__Impl : ( '}' ) ;
    public final void rule__Struct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2222:1: ( ( '}' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2223:1: ( '}' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2223:1: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2224:1: '}'
            {
             before(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__Struct__Group__5__Impl4656); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2249:1: rule__StructFields__Group__0 : rule__StructFields__Group__0__Impl rule__StructFields__Group__1 ;
    public final void rule__StructFields__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2253:1: ( rule__StructFields__Group__0__Impl rule__StructFields__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2254:2: rule__StructFields__Group__0__Impl rule__StructFields__Group__1
            {
            pushFollow(FOLLOW_rule__StructFields__Group__0__Impl_in_rule__StructFields__Group__04699);
            rule__StructFields__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructFields__Group__1_in_rule__StructFields__Group__04702);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2261:1: rule__StructFields__Group__0__Impl : ( ( rule__StructFields__NameAssignment_0 ) ) ;
    public final void rule__StructFields__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2265:1: ( ( ( rule__StructFields__NameAssignment_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2266:1: ( ( rule__StructFields__NameAssignment_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2266:1: ( ( rule__StructFields__NameAssignment_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2267:1: ( rule__StructFields__NameAssignment_0 )
            {
             before(grammarAccess.getStructFieldsAccess().getNameAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2268:1: ( rule__StructFields__NameAssignment_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2268:2: rule__StructFields__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StructFields__NameAssignment_0_in_rule__StructFields__Group__0__Impl4729);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2278:1: rule__StructFields__Group__1 : rule__StructFields__Group__1__Impl rule__StructFields__Group__2 ;
    public final void rule__StructFields__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2282:1: ( rule__StructFields__Group__1__Impl rule__StructFields__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2283:2: rule__StructFields__Group__1__Impl rule__StructFields__Group__2
            {
            pushFollow(FOLLOW_rule__StructFields__Group__1__Impl_in_rule__StructFields__Group__14759);
            rule__StructFields__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructFields__Group__2_in_rule__StructFields__Group__14762);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2290:1: rule__StructFields__Group__1__Impl : ( ':' ) ;
    public final void rule__StructFields__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2294:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2295:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2295:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2296:1: ':'
            {
             before(grammarAccess.getStructFieldsAccess().getColonKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__StructFields__Group__1__Impl4790); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2309:1: rule__StructFields__Group__2 : rule__StructFields__Group__2__Impl rule__StructFields__Group__3 ;
    public final void rule__StructFields__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2313:1: ( rule__StructFields__Group__2__Impl rule__StructFields__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2314:2: rule__StructFields__Group__2__Impl rule__StructFields__Group__3
            {
            pushFollow(FOLLOW_rule__StructFields__Group__2__Impl_in_rule__StructFields__Group__24821);
            rule__StructFields__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructFields__Group__3_in_rule__StructFields__Group__24824);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2321:1: rule__StructFields__Group__2__Impl : ( ( rule__StructFields__Alternatives_2 ) ) ;
    public final void rule__StructFields__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2325:1: ( ( ( rule__StructFields__Alternatives_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2326:1: ( ( rule__StructFields__Alternatives_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2326:1: ( ( rule__StructFields__Alternatives_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2327:1: ( rule__StructFields__Alternatives_2 )
            {
             before(grammarAccess.getStructFieldsAccess().getAlternatives_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2328:1: ( rule__StructFields__Alternatives_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2328:2: rule__StructFields__Alternatives_2
            {
            pushFollow(FOLLOW_rule__StructFields__Alternatives_2_in_rule__StructFields__Group__2__Impl4851);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2338:1: rule__StructFields__Group__3 : rule__StructFields__Group__3__Impl ;
    public final void rule__StructFields__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2342:1: ( rule__StructFields__Group__3__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2343:2: rule__StructFields__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StructFields__Group__3__Impl_in_rule__StructFields__Group__34881);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2349:1: rule__StructFields__Group__3__Impl : ( ';' ) ;
    public final void rule__StructFields__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2353:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2354:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2354:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2355:1: ';'
            {
             before(grammarAccess.getStructFieldsAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__StructFields__Group__3__Impl4909); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2376:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2380:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2381:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__04948);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__1_in_rule__Table__Group__04951);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2388:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2392:1: ( ( 'table' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2393:1: ( 'table' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2393:1: ( 'table' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2394:1: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Table__Group__0__Impl4979); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2407:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2411:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2412:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__15010);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__2_in_rule__Table__Group__15013);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2419:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2423:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2424:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2424:1: ( ( rule__Table__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2425:1: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2426:1: ( rule__Table__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2426:2: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl5040);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2436:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2440:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2441:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__25070);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__3_in_rule__Table__Group__25073);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2448:1: rule__Table__Group__2__Impl : ( ( rule__Table__AttributesAssignment_2 )? ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2452:1: ( ( ( rule__Table__AttributesAssignment_2 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2453:1: ( ( rule__Table__AttributesAssignment_2 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2453:1: ( ( rule__Table__AttributesAssignment_2 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2454:1: ( rule__Table__AttributesAssignment_2 )?
            {
             before(grammarAccess.getTableAccess().getAttributesAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2455:1: ( rule__Table__AttributesAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2455:2: rule__Table__AttributesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Table__AttributesAssignment_2_in_rule__Table__Group__2__Impl5100);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2465:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2469:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2470:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__35131);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__4_in_rule__Table__Group__35134);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2477:1: rule__Table__Group__3__Impl : ( '{' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2481:1: ( ( '{' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2482:1: ( '{' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2482:1: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2483:1: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__Table__Group__3__Impl5162); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2496:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2500:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2501:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__45193);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__5_in_rule__Table__Group__45196);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2508:1: rule__Table__Group__4__Impl : ( ( rule__Table__FieldsAssignment_4 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2512:1: ( ( ( rule__Table__FieldsAssignment_4 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2513:1: ( ( rule__Table__FieldsAssignment_4 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2513:1: ( ( rule__Table__FieldsAssignment_4 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2514:1: ( rule__Table__FieldsAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getFieldsAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2515:1: ( rule__Table__FieldsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_HASH_ATTRIBUTE && LA23_0<=RULE_ID)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2515:2: rule__Table__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Table__FieldsAssignment_4_in_rule__Table__Group__4__Impl5223);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2525:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2529:1: ( rule__Table__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2530:2: rule__Table__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__55254);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2536:1: rule__Table__Group__5__Impl : ( '}' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2540:1: ( ( '}' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2541:1: ( '}' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2541:1: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2542:1: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__Table__Group__5__Impl5282); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2567:1: rule__Fields__Group__0 : rule__Fields__Group__0__Impl rule__Fields__Group__1 ;
    public final void rule__Fields__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2571:1: ( rule__Fields__Group__0__Impl rule__Fields__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2572:2: rule__Fields__Group__0__Impl rule__Fields__Group__1
            {
            pushFollow(FOLLOW_rule__Fields__Group__0__Impl_in_rule__Fields__Group__05325);
            rule__Fields__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__1_in_rule__Fields__Group__05328);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2579:1: rule__Fields__Group__0__Impl : ( ( rule__Fields__NameAssignment_0 ) ) ;
    public final void rule__Fields__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2583:1: ( ( ( rule__Fields__NameAssignment_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2584:1: ( ( rule__Fields__NameAssignment_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2584:1: ( ( rule__Fields__NameAssignment_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2585:1: ( rule__Fields__NameAssignment_0 )
            {
             before(grammarAccess.getFieldsAccess().getNameAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2586:1: ( rule__Fields__NameAssignment_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2586:2: rule__Fields__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fields__NameAssignment_0_in_rule__Fields__Group__0__Impl5355);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2596:1: rule__Fields__Group__1 : rule__Fields__Group__1__Impl rule__Fields__Group__2 ;
    public final void rule__Fields__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2600:1: ( rule__Fields__Group__1__Impl rule__Fields__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2601:2: rule__Fields__Group__1__Impl rule__Fields__Group__2
            {
            pushFollow(FOLLOW_rule__Fields__Group__1__Impl_in_rule__Fields__Group__15385);
            rule__Fields__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__2_in_rule__Fields__Group__15388);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2608:1: rule__Fields__Group__1__Impl : ( ':' ) ;
    public final void rule__Fields__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2612:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2613:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2613:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2614:1: ':'
            {
             before(grammarAccess.getFieldsAccess().getColonKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Fields__Group__1__Impl5416); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2627:1: rule__Fields__Group__2 : rule__Fields__Group__2__Impl rule__Fields__Group__3 ;
    public final void rule__Fields__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2631:1: ( rule__Fields__Group__2__Impl rule__Fields__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2632:2: rule__Fields__Group__2__Impl rule__Fields__Group__3
            {
            pushFollow(FOLLOW_rule__Fields__Group__2__Impl_in_rule__Fields__Group__25447);
            rule__Fields__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__3_in_rule__Fields__Group__25450);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2639:1: rule__Fields__Group__2__Impl : ( ( rule__Fields__TypeAssignment_2 ) ) ;
    public final void rule__Fields__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2643:1: ( ( ( rule__Fields__TypeAssignment_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2644:1: ( ( rule__Fields__TypeAssignment_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2644:1: ( ( rule__Fields__TypeAssignment_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2645:1: ( rule__Fields__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldsAccess().getTypeAssignment_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2646:1: ( rule__Fields__TypeAssignment_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2646:2: rule__Fields__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Fields__TypeAssignment_2_in_rule__Fields__Group__2__Impl5477);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2656:1: rule__Fields__Group__3 : rule__Fields__Group__3__Impl rule__Fields__Group__4 ;
    public final void rule__Fields__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2660:1: ( rule__Fields__Group__3__Impl rule__Fields__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2661:2: rule__Fields__Group__3__Impl rule__Fields__Group__4
            {
            pushFollow(FOLLOW_rule__Fields__Group__3__Impl_in_rule__Fields__Group__35507);
            rule__Fields__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__4_in_rule__Fields__Group__35510);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2668:1: rule__Fields__Group__3__Impl : ( ( rule__Fields__Group_3__0 )? ) ;
    public final void rule__Fields__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2672:1: ( ( ( rule__Fields__Group_3__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2673:1: ( ( rule__Fields__Group_3__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2673:1: ( ( rule__Fields__Group_3__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2674:1: ( rule__Fields__Group_3__0 )?
            {
             before(grammarAccess.getFieldsAccess().getGroup_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2675:1: ( rule__Fields__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2675:2: rule__Fields__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fields__Group_3__0_in_rule__Fields__Group__3__Impl5537);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2685:1: rule__Fields__Group__4 : rule__Fields__Group__4__Impl rule__Fields__Group__5 ;
    public final void rule__Fields__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2689:1: ( rule__Fields__Group__4__Impl rule__Fields__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2690:2: rule__Fields__Group__4__Impl rule__Fields__Group__5
            {
            pushFollow(FOLLOW_rule__Fields__Group__4__Impl_in_rule__Fields__Group__45568);
            rule__Fields__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group__5_in_rule__Fields__Group__45571);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2697:1: rule__Fields__Group__4__Impl : ( ( rule__Fields__AttributesAssignment_4 )? ) ;
    public final void rule__Fields__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2701:1: ( ( ( rule__Fields__AttributesAssignment_4 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2702:1: ( ( rule__Fields__AttributesAssignment_4 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2702:1: ( ( rule__Fields__AttributesAssignment_4 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2703:1: ( rule__Fields__AttributesAssignment_4 )?
            {
             before(grammarAccess.getFieldsAccess().getAttributesAssignment_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2704:1: ( rule__Fields__AttributesAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2704:2: rule__Fields__AttributesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Fields__AttributesAssignment_4_in_rule__Fields__Group__4__Impl5598);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2714:1: rule__Fields__Group__5 : rule__Fields__Group__5__Impl ;
    public final void rule__Fields__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2718:1: ( rule__Fields__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2719:2: rule__Fields__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Fields__Group__5__Impl_in_rule__Fields__Group__55629);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2725:1: rule__Fields__Group__5__Impl : ( ';' ) ;
    public final void rule__Fields__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2729:1: ( ( ';' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2730:1: ( ';' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2730:1: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2731:1: ';'
            {
             before(grammarAccess.getFieldsAccess().getSemicolonKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__Fields__Group__5__Impl5657); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2756:1: rule__Fields__Group_3__0 : rule__Fields__Group_3__0__Impl rule__Fields__Group_3__1 ;
    public final void rule__Fields__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2760:1: ( rule__Fields__Group_3__0__Impl rule__Fields__Group_3__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2761:2: rule__Fields__Group_3__0__Impl rule__Fields__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fields__Group_3__0__Impl_in_rule__Fields__Group_3__05700);
            rule__Fields__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fields__Group_3__1_in_rule__Fields__Group_3__05703);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2768:1: rule__Fields__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Fields__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2772:1: ( ( '=' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2773:1: ( '=' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2773:1: ( '=' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2774:1: '='
            {
             before(grammarAccess.getFieldsAccess().getEqualsSignKeyword_3_0()); 
            match(input,42,FOLLOW_42_in_rule__Fields__Group_3__0__Impl5731); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2787:1: rule__Fields__Group_3__1 : rule__Fields__Group_3__1__Impl ;
    public final void rule__Fields__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2791:1: ( rule__Fields__Group_3__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2792:2: rule__Fields__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fields__Group_3__1__Impl_in_rule__Fields__Group_3__15762);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2798:1: rule__Fields__Group_3__1__Impl : ( ( rule__Fields__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__Fields__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2802:1: ( ( ( rule__Fields__DefaultValueAssignment_3_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2803:1: ( ( rule__Fields__DefaultValueAssignment_3_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2803:1: ( ( rule__Fields__DefaultValueAssignment_3_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2804:1: ( rule__Fields__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getFieldsAccess().getDefaultValueAssignment_3_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2805:1: ( rule__Fields__DefaultValueAssignment_3_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2805:2: rule__Fields__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fields__DefaultValueAssignment_3_1_in_rule__Fields__Group_3__1__Impl5789);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2819:1: rule__FieldAttributes__Group__0 : rule__FieldAttributes__Group__0__Impl rule__FieldAttributes__Group__1 ;
    public final void rule__FieldAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2823:1: ( rule__FieldAttributes__Group__0__Impl rule__FieldAttributes__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2824:2: rule__FieldAttributes__Group__0__Impl rule__FieldAttributes__Group__1
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__0__Impl_in_rule__FieldAttributes__Group__05823);
            rule__FieldAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group__1_in_rule__FieldAttributes__Group__05826);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2831:1: rule__FieldAttributes__Group__0__Impl : ( '(' ) ;
    public final void rule__FieldAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2835:1: ( ( '(' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2836:1: ( '(' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2836:1: ( '(' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2837:1: '('
            {
             before(grammarAccess.getFieldAttributesAccess().getLeftParenthesisKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__FieldAttributes__Group__0__Impl5854); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2850:1: rule__FieldAttributes__Group__1 : rule__FieldAttributes__Group__1__Impl rule__FieldAttributes__Group__2 ;
    public final void rule__FieldAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2854:1: ( rule__FieldAttributes__Group__1__Impl rule__FieldAttributes__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2855:2: rule__FieldAttributes__Group__1__Impl rule__FieldAttributes__Group__2
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__1__Impl_in_rule__FieldAttributes__Group__15885);
            rule__FieldAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group__2_in_rule__FieldAttributes__Group__15888);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2862:1: rule__FieldAttributes__Group__1__Impl : ( ( rule__FieldAttributes__AtributeNamesAssignment_1 ) ) ;
    public final void rule__FieldAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2866:1: ( ( ( rule__FieldAttributes__AtributeNamesAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2867:1: ( ( rule__FieldAttributes__AtributeNamesAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2867:1: ( ( rule__FieldAttributes__AtributeNamesAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2868:1: ( rule__FieldAttributes__AtributeNamesAssignment_1 )
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNamesAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2869:1: ( rule__FieldAttributes__AtributeNamesAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2869:2: rule__FieldAttributes__AtributeNamesAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldAttributes__AtributeNamesAssignment_1_in_rule__FieldAttributes__Group__1__Impl5915);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2879:1: rule__FieldAttributes__Group__2 : rule__FieldAttributes__Group__2__Impl rule__FieldAttributes__Group__3 ;
    public final void rule__FieldAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2883:1: ( rule__FieldAttributes__Group__2__Impl rule__FieldAttributes__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2884:2: rule__FieldAttributes__Group__2__Impl rule__FieldAttributes__Group__3
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__2__Impl_in_rule__FieldAttributes__Group__25945);
            rule__FieldAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group__3_in_rule__FieldAttributes__Group__25948);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2891:1: rule__FieldAttributes__Group__2__Impl : ( ( rule__FieldAttributes__Group_2__0 )* ) ;
    public final void rule__FieldAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2895:1: ( ( ( rule__FieldAttributes__Group_2__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2896:1: ( ( rule__FieldAttributes__Group_2__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2896:1: ( ( rule__FieldAttributes__Group_2__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2897:1: ( rule__FieldAttributes__Group_2__0 )*
            {
             before(grammarAccess.getFieldAttributesAccess().getGroup_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2898:1: ( rule__FieldAttributes__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2898:2: rule__FieldAttributes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldAttributes__Group_2__0_in_rule__FieldAttributes__Group__2__Impl5975);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2908:1: rule__FieldAttributes__Group__3 : rule__FieldAttributes__Group__3__Impl ;
    public final void rule__FieldAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2912:1: ( rule__FieldAttributes__Group__3__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2913:2: rule__FieldAttributes__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group__3__Impl_in_rule__FieldAttributes__Group__36006);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2919:1: rule__FieldAttributes__Group__3__Impl : ( ')' ) ;
    public final void rule__FieldAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2923:1: ( ( ')' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2924:1: ( ')' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2924:1: ( ')' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2925:1: ')'
            {
             before(grammarAccess.getFieldAttributesAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__FieldAttributes__Group__3__Impl6034); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2946:1: rule__FieldAttributes__Group_2__0 : rule__FieldAttributes__Group_2__0__Impl rule__FieldAttributes__Group_2__1 ;
    public final void rule__FieldAttributes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2950:1: ( rule__FieldAttributes__Group_2__0__Impl rule__FieldAttributes__Group_2__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2951:2: rule__FieldAttributes__Group_2__0__Impl rule__FieldAttributes__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group_2__0__Impl_in_rule__FieldAttributes__Group_2__06073);
            rule__FieldAttributes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAttributes__Group_2__1_in_rule__FieldAttributes__Group_2__06076);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2958:1: rule__FieldAttributes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FieldAttributes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2962:1: ( ( ',' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2963:1: ( ',' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2963:1: ( ',' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2964:1: ','
            {
             before(grammarAccess.getFieldAttributesAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__FieldAttributes__Group_2__0__Impl6104); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2977:1: rule__FieldAttributes__Group_2__1 : rule__FieldAttributes__Group_2__1__Impl ;
    public final void rule__FieldAttributes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2981:1: ( rule__FieldAttributes__Group_2__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2982:2: rule__FieldAttributes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldAttributes__Group_2__1__Impl_in_rule__FieldAttributes__Group_2__16135);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2988:1: rule__FieldAttributes__Group_2__1__Impl : ( ( rule__FieldAttributes__AtributeNamesAssignment_2_1 ) ) ;
    public final void rule__FieldAttributes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2992:1: ( ( ( rule__FieldAttributes__AtributeNamesAssignment_2_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2993:1: ( ( rule__FieldAttributes__AtributeNamesAssignment_2_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2993:1: ( ( rule__FieldAttributes__AtributeNamesAssignment_2_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2994:1: ( rule__FieldAttributes__AtributeNamesAssignment_2_1 )
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNamesAssignment_2_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2995:1: ( rule__FieldAttributes__AtributeNamesAssignment_2_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:2995:2: rule__FieldAttributes__AtributeNamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FieldAttributes__AtributeNamesAssignment_2_1_in_rule__FieldAttributes__Group_2__1__Impl6162);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3009:1: rule__AttributeName__Group_1__0 : rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 ;
    public final void rule__AttributeName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3013:1: ( rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3014:2: rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__06196);
            rule__AttributeName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__06199);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3021:1: rule__AttributeName__Group_1__0__Impl : ( ( rule__AttributeName__HasAttributeIdAssignment_1_0 ) ) ;
    public final void rule__AttributeName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3025:1: ( ( ( rule__AttributeName__HasAttributeIdAssignment_1_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3026:1: ( ( rule__AttributeName__HasAttributeIdAssignment_1_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3026:1: ( ( rule__AttributeName__HasAttributeIdAssignment_1_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3027:1: ( rule__AttributeName__HasAttributeIdAssignment_1_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getHasAttributeIdAssignment_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3028:1: ( rule__AttributeName__HasAttributeIdAssignment_1_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3028:2: rule__AttributeName__HasAttributeIdAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AttributeName__HasAttributeIdAssignment_1_0_in_rule__AttributeName__Group_1__0__Impl6226);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3038:1: rule__AttributeName__Group_1__1 : rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2 ;
    public final void rule__AttributeName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3042:1: ( rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3043:2: rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__16256);
            rule__AttributeName__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_1__2_in_rule__AttributeName__Group_1__16259);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3050:1: rule__AttributeName__Group_1__1__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3054:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3055:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3055:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3056:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_1_1()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_1__1__Impl6287); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3069:1: rule__AttributeName__Group_1__2 : rule__AttributeName__Group_1__2__Impl ;
    public final void rule__AttributeName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3073:1: ( rule__AttributeName__Group_1__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3074:2: rule__AttributeName__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__2__Impl_in_rule__AttributeName__Group_1__26318);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3080:1: rule__AttributeName__Group_1__2__Impl : ( ( rule__AttributeName__AttributeIdAssignment_1_2 ) ) ;
    public final void rule__AttributeName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3084:1: ( ( ( rule__AttributeName__AttributeIdAssignment_1_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3085:1: ( ( rule__AttributeName__AttributeIdAssignment_1_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3085:1: ( ( rule__AttributeName__AttributeIdAssignment_1_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3086:1: ( rule__AttributeName__AttributeIdAssignment_1_2 )
            {
             before(grammarAccess.getAttributeNameAccess().getAttributeIdAssignment_1_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3087:1: ( rule__AttributeName__AttributeIdAssignment_1_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3087:2: rule__AttributeName__AttributeIdAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AttributeName__AttributeIdAssignment_1_2_in_rule__AttributeName__Group_1__2__Impl6345);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3103:1: rule__AttributeName__Group_4__0 : rule__AttributeName__Group_4__0__Impl rule__AttributeName__Group_4__1 ;
    public final void rule__AttributeName__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3107:1: ( rule__AttributeName__Group_4__0__Impl rule__AttributeName__Group_4__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3108:2: rule__AttributeName__Group_4__0__Impl rule__AttributeName__Group_4__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_4__0__Impl_in_rule__AttributeName__Group_4__06381);
            rule__AttributeName__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_4__1_in_rule__AttributeName__Group_4__06384);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3115:1: rule__AttributeName__Group_4__0__Impl : ( ( rule__AttributeName__HasAlignSizeAssignment_4_0 ) ) ;
    public final void rule__AttributeName__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3119:1: ( ( ( rule__AttributeName__HasAlignSizeAssignment_4_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3120:1: ( ( rule__AttributeName__HasAlignSizeAssignment_4_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3120:1: ( ( rule__AttributeName__HasAlignSizeAssignment_4_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3121:1: ( rule__AttributeName__HasAlignSizeAssignment_4_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getHasAlignSizeAssignment_4_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3122:1: ( rule__AttributeName__HasAlignSizeAssignment_4_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3122:2: rule__AttributeName__HasAlignSizeAssignment_4_0
            {
            pushFollow(FOLLOW_rule__AttributeName__HasAlignSizeAssignment_4_0_in_rule__AttributeName__Group_4__0__Impl6411);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3132:1: rule__AttributeName__Group_4__1 : rule__AttributeName__Group_4__1__Impl rule__AttributeName__Group_4__2 ;
    public final void rule__AttributeName__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3136:1: ( rule__AttributeName__Group_4__1__Impl rule__AttributeName__Group_4__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3137:2: rule__AttributeName__Group_4__1__Impl rule__AttributeName__Group_4__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_4__1__Impl_in_rule__AttributeName__Group_4__16441);
            rule__AttributeName__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_4__2_in_rule__AttributeName__Group_4__16444);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3144:1: rule__AttributeName__Group_4__1__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3148:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3149:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3149:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3150:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_4_1()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_4__1__Impl6472); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3163:1: rule__AttributeName__Group_4__2 : rule__AttributeName__Group_4__2__Impl ;
    public final void rule__AttributeName__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3167:1: ( rule__AttributeName__Group_4__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3168:2: rule__AttributeName__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_4__2__Impl_in_rule__AttributeName__Group_4__26503);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3174:1: rule__AttributeName__Group_4__2__Impl : ( ( rule__AttributeName__AlignSizeAssignment_4_2 ) ) ;
    public final void rule__AttributeName__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3178:1: ( ( ( rule__AttributeName__AlignSizeAssignment_4_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3179:1: ( ( rule__AttributeName__AlignSizeAssignment_4_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3179:1: ( ( rule__AttributeName__AlignSizeAssignment_4_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3180:1: ( rule__AttributeName__AlignSizeAssignment_4_2 )
            {
             before(grammarAccess.getAttributeNameAccess().getAlignSizeAssignment_4_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3181:1: ( rule__AttributeName__AlignSizeAssignment_4_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3181:2: rule__AttributeName__AlignSizeAssignment_4_2
            {
            pushFollow(FOLLOW_rule__AttributeName__AlignSizeAssignment_4_2_in_rule__AttributeName__Group_4__2__Impl6530);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3197:1: rule__AttributeName__Group_5__0 : rule__AttributeName__Group_5__0__Impl rule__AttributeName__Group_5__1 ;
    public final void rule__AttributeName__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3201:1: ( rule__AttributeName__Group_5__0__Impl rule__AttributeName__Group_5__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3202:2: rule__AttributeName__Group_5__0__Impl rule__AttributeName__Group_5__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_5__0__Impl_in_rule__AttributeName__Group_5__06566);
            rule__AttributeName__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_5__1_in_rule__AttributeName__Group_5__06569);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3209:1: rule__AttributeName__Group_5__0__Impl : ( ( rule__AttributeName__HasHashAssignment_5_0 ) ) ;
    public final void rule__AttributeName__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3213:1: ( ( ( rule__AttributeName__HasHashAssignment_5_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3214:1: ( ( rule__AttributeName__HasHashAssignment_5_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3214:1: ( ( rule__AttributeName__HasHashAssignment_5_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3215:1: ( rule__AttributeName__HasHashAssignment_5_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getHasHashAssignment_5_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3216:1: ( rule__AttributeName__HasHashAssignment_5_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3216:2: rule__AttributeName__HasHashAssignment_5_0
            {
            pushFollow(FOLLOW_rule__AttributeName__HasHashAssignment_5_0_in_rule__AttributeName__Group_5__0__Impl6596);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3226:1: rule__AttributeName__Group_5__1 : rule__AttributeName__Group_5__1__Impl rule__AttributeName__Group_5__2 ;
    public final void rule__AttributeName__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3230:1: ( rule__AttributeName__Group_5__1__Impl rule__AttributeName__Group_5__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3231:2: rule__AttributeName__Group_5__1__Impl rule__AttributeName__Group_5__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_5__1__Impl_in_rule__AttributeName__Group_5__16626);
            rule__AttributeName__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_5__2_in_rule__AttributeName__Group_5__16629);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3238:1: rule__AttributeName__Group_5__1__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3242:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3243:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3243:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3244:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_5_1()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_5__1__Impl6657); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3257:1: rule__AttributeName__Group_5__2 : rule__AttributeName__Group_5__2__Impl ;
    public final void rule__AttributeName__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3261:1: ( rule__AttributeName__Group_5__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3262:2: rule__AttributeName__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_5__2__Impl_in_rule__AttributeName__Group_5__26688);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3268:1: rule__AttributeName__Group_5__2__Impl : ( ( rule__AttributeName__HashKeyAssignment_5_2 ) ) ;
    public final void rule__AttributeName__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3272:1: ( ( ( rule__AttributeName__HashKeyAssignment_5_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3273:1: ( ( rule__AttributeName__HashKeyAssignment_5_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3273:1: ( ( rule__AttributeName__HashKeyAssignment_5_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3274:1: ( rule__AttributeName__HashKeyAssignment_5_2 )
            {
             before(grammarAccess.getAttributeNameAccess().getHashKeyAssignment_5_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3275:1: ( rule__AttributeName__HashKeyAssignment_5_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3275:2: rule__AttributeName__HashKeyAssignment_5_2
            {
            pushFollow(FOLLOW_rule__AttributeName__HashKeyAssignment_5_2_in_rule__AttributeName__Group_5__2__Impl6715);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3291:1: rule__AttributeName__Group_7__0 : rule__AttributeName__Group_7__0__Impl rule__AttributeName__Group_7__1 ;
    public final void rule__AttributeName__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3295:1: ( rule__AttributeName__Group_7__0__Impl rule__AttributeName__Group_7__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3296:2: rule__AttributeName__Group_7__0__Impl rule__AttributeName__Group_7__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_7__0__Impl_in_rule__AttributeName__Group_7__06751);
            rule__AttributeName__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_7__1_in_rule__AttributeName__Group_7__06754);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3303:1: rule__AttributeName__Group_7__0__Impl : ( ( rule__AttributeName__HasNestedTableNameAssignment_7_0 ) ) ;
    public final void rule__AttributeName__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3307:1: ( ( ( rule__AttributeName__HasNestedTableNameAssignment_7_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3308:1: ( ( rule__AttributeName__HasNestedTableNameAssignment_7_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3308:1: ( ( rule__AttributeName__HasNestedTableNameAssignment_7_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3309:1: ( rule__AttributeName__HasNestedTableNameAssignment_7_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getHasNestedTableNameAssignment_7_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3310:1: ( rule__AttributeName__HasNestedTableNameAssignment_7_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3310:2: rule__AttributeName__HasNestedTableNameAssignment_7_0
            {
            pushFollow(FOLLOW_rule__AttributeName__HasNestedTableNameAssignment_7_0_in_rule__AttributeName__Group_7__0__Impl6781);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3320:1: rule__AttributeName__Group_7__1 : rule__AttributeName__Group_7__1__Impl rule__AttributeName__Group_7__2 ;
    public final void rule__AttributeName__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3324:1: ( rule__AttributeName__Group_7__1__Impl rule__AttributeName__Group_7__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3325:2: rule__AttributeName__Group_7__1__Impl rule__AttributeName__Group_7__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_7__1__Impl_in_rule__AttributeName__Group_7__16811);
            rule__AttributeName__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_7__2_in_rule__AttributeName__Group_7__16814);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3332:1: rule__AttributeName__Group_7__1__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3336:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3337:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3337:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3338:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_7_1()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_7__1__Impl6842); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3351:1: rule__AttributeName__Group_7__2 : rule__AttributeName__Group_7__2__Impl ;
    public final void rule__AttributeName__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3355:1: ( rule__AttributeName__Group_7__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3356:2: rule__AttributeName__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_7__2__Impl_in_rule__AttributeName__Group_7__26873);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3362:1: rule__AttributeName__Group_7__2__Impl : ( ( rule__AttributeName__NestedTableNameAssignment_7_2 ) ) ;
    public final void rule__AttributeName__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3366:1: ( ( ( rule__AttributeName__NestedTableNameAssignment_7_2 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3367:1: ( ( rule__AttributeName__NestedTableNameAssignment_7_2 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3367:1: ( ( rule__AttributeName__NestedTableNameAssignment_7_2 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3368:1: ( rule__AttributeName__NestedTableNameAssignment_7_2 )
            {
             before(grammarAccess.getAttributeNameAccess().getNestedTableNameAssignment_7_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3369:1: ( rule__AttributeName__NestedTableNameAssignment_7_2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3369:2: rule__AttributeName__NestedTableNameAssignment_7_2
            {
            pushFollow(FOLLOW_rule__AttributeName__NestedTableNameAssignment_7_2_in_rule__AttributeName__Group_7__2__Impl6900);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3385:1: rule__AttributeName__Group_9__0 : rule__AttributeName__Group_9__0__Impl rule__AttributeName__Group_9__1 ;
    public final void rule__AttributeName__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3389:1: ( rule__AttributeName__Group_9__0__Impl rule__AttributeName__Group_9__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3390:2: rule__AttributeName__Group_9__0__Impl rule__AttributeName__Group_9__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_9__0__Impl_in_rule__AttributeName__Group_9__06936);
            rule__AttributeName__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_9__1_in_rule__AttributeName__Group_9__06939);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3397:1: rule__AttributeName__Group_9__0__Impl : ( ( rule__AttributeName__CustomNameAssignment_9_0 ) ) ;
    public final void rule__AttributeName__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3401:1: ( ( ( rule__AttributeName__CustomNameAssignment_9_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3402:1: ( ( rule__AttributeName__CustomNameAssignment_9_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3402:1: ( ( rule__AttributeName__CustomNameAssignment_9_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3403:1: ( rule__AttributeName__CustomNameAssignment_9_0 )
            {
             before(grammarAccess.getAttributeNameAccess().getCustomNameAssignment_9_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3404:1: ( rule__AttributeName__CustomNameAssignment_9_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3404:2: rule__AttributeName__CustomNameAssignment_9_0
            {
            pushFollow(FOLLOW_rule__AttributeName__CustomNameAssignment_9_0_in_rule__AttributeName__Group_9__0__Impl6966);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3414:1: rule__AttributeName__Group_9__1 : rule__AttributeName__Group_9__1__Impl ;
    public final void rule__AttributeName__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3418:1: ( rule__AttributeName__Group_9__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3419:2: rule__AttributeName__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_9__1__Impl_in_rule__AttributeName__Group_9__16996);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3425:1: rule__AttributeName__Group_9__1__Impl : ( ( rule__AttributeName__Group_9_1__0 )? ) ;
    public final void rule__AttributeName__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3429:1: ( ( ( rule__AttributeName__Group_9_1__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3430:1: ( ( rule__AttributeName__Group_9_1__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3430:1: ( ( rule__AttributeName__Group_9_1__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3431:1: ( rule__AttributeName__Group_9_1__0 )?
            {
             before(grammarAccess.getAttributeNameAccess().getGroup_9_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3432:1: ( rule__AttributeName__Group_9_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3432:2: rule__AttributeName__Group_9_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_9_1__0_in_rule__AttributeName__Group_9__1__Impl7023);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3446:1: rule__AttributeName__Group_9_1__0 : rule__AttributeName__Group_9_1__0__Impl rule__AttributeName__Group_9_1__1 ;
    public final void rule__AttributeName__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3450:1: ( rule__AttributeName__Group_9_1__0__Impl rule__AttributeName__Group_9_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3451:2: rule__AttributeName__Group_9_1__0__Impl rule__AttributeName__Group_9_1__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_9_1__0__Impl_in_rule__AttributeName__Group_9_1__07058);
            rule__AttributeName__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group_9_1__1_in_rule__AttributeName__Group_9_1__07061);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3458:1: rule__AttributeName__Group_9_1__0__Impl : ( ':' ) ;
    public final void rule__AttributeName__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3462:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3463:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3463:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3464:1: ':'
            {
             before(grammarAccess.getAttributeNameAccess().getColonKeyword_9_1_0()); 
            match(input,40,FOLLOW_40_in_rule__AttributeName__Group_9_1__0__Impl7089); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3477:1: rule__AttributeName__Group_9_1__1 : rule__AttributeName__Group_9_1__1__Impl ;
    public final void rule__AttributeName__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3481:1: ( rule__AttributeName__Group_9_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3482:2: rule__AttributeName__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_9_1__1__Impl_in_rule__AttributeName__Group_9_1__17120);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3488:1: rule__AttributeName__Group_9_1__1__Impl : ( ( rule__AttributeName__Alternatives_9_1_1 ) ) ;
    public final void rule__AttributeName__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3492:1: ( ( ( rule__AttributeName__Alternatives_9_1_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3493:1: ( ( rule__AttributeName__Alternatives_9_1_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3493:1: ( ( rule__AttributeName__Alternatives_9_1_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3494:1: ( rule__AttributeName__Alternatives_9_1_1 )
            {
             before(grammarAccess.getAttributeNameAccess().getAlternatives_9_1_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3495:1: ( rule__AttributeName__Alternatives_9_1_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3495:2: rule__AttributeName__Alternatives_9_1_1
            {
            pushFollow(FOLLOW_rule__AttributeName__Alternatives_9_1_1_in_rule__AttributeName__Group_9_1__1__Impl7147);
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


    // $ANTLR start "rule__Vector__Group__0"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3509:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3513:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3514:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
            {
            pushFollow(FOLLOW_rule__Vector__Group__0__Impl_in_rule__Vector__Group__07181);
            rule__Vector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__1_in_rule__Vector__Group__07184);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3521:1: rule__Vector__Group__0__Impl : ( '[' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3525:1: ( ( '[' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3526:1: ( '[' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3526:1: ( '[' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3527:1: '['
            {
             before(grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Vector__Group__0__Impl7212); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3540:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3544:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3545:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
            {
            pushFollow(FOLLOW_rule__Vector__Group__1__Impl_in_rule__Vector__Group__17243);
            rule__Vector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__2_in_rule__Vector__Group__17246);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3552:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__TypeAssignment_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3556:1: ( ( ( rule__Vector__TypeAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3557:1: ( ( rule__Vector__TypeAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3557:1: ( ( rule__Vector__TypeAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3558:1: ( rule__Vector__TypeAssignment_1 )
            {
             before(grammarAccess.getVectorAccess().getTypeAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3559:1: ( rule__Vector__TypeAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3559:2: rule__Vector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Vector__TypeAssignment_1_in_rule__Vector__Group__1__Impl7273);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3569:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3573:1: ( rule__Vector__Group__2__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3574:2: rule__Vector__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Vector__Group__2__Impl_in_rule__Vector__Group__27303);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3580:1: rule__Vector__Group__2__Impl : ( ']' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3584:1: ( ( ']' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3585:1: ( ']' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3585:1: ( ']' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3586:1: ']'
            {
             before(grammarAccess.getVectorAccess().getRightSquareBracketKeyword_2()); 
            match(input,47,FOLLOW_47_in_rule__Vector__Group__2__Impl7331); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3605:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3609:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3610:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__07368);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__07371);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3617:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3621:1: ( ( 'enum' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3622:1: ( 'enum' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3622:1: ( 'enum' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3623:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Enum__Group__0__Impl7399); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3636:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3640:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3641:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__17430);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__17433);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3648:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3652:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3653:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3653:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3654:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3655:1: ( rule__Enum__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3655:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl7460);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3665:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3669:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3670:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__27490);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__27493);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3677:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__Group_2__0 )? ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3681:1: ( ( ( rule__Enum__Group_2__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3682:1: ( ( rule__Enum__Group_2__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3682:1: ( ( rule__Enum__Group_2__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3683:1: ( rule__Enum__Group_2__0 )?
            {
             before(grammarAccess.getEnumAccess().getGroup_2()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3684:1: ( rule__Enum__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3684:2: rule__Enum__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Enum__Group_2__0_in_rule__Enum__Group__2__Impl7520);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3694:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3698:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3699:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__37551);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__37554);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3706:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__AttributesAssignment_3 )? ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3710:1: ( ( ( rule__Enum__AttributesAssignment_3 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3711:1: ( ( rule__Enum__AttributesAssignment_3 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3711:1: ( ( rule__Enum__AttributesAssignment_3 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3712:1: ( rule__Enum__AttributesAssignment_3 )?
            {
             before(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3713:1: ( rule__Enum__AttributesAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3713:2: rule__Enum__AttributesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Enum__AttributesAssignment_3_in_rule__Enum__Group__3__Impl7581);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3723:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3727:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3728:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__47612);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__47615);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3735:1: rule__Enum__Group__4__Impl : ( '{' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3739:1: ( ( '{' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3740:1: ( '{' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3740:1: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3741:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__Enum__Group__4__Impl7643); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3754:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl rule__Enum__Group__6 ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3758:1: ( rule__Enum__Group__5__Impl rule__Enum__Group__6 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3759:2: rule__Enum__Group__5__Impl rule__Enum__Group__6
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__57674);
            rule__Enum__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__6_in_rule__Enum__Group__57677);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3766:1: rule__Enum__Group__5__Impl : ( ( rule__Enum__EnumCasesAssignment_5 ) ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3770:1: ( ( ( rule__Enum__EnumCasesAssignment_5 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3771:1: ( ( rule__Enum__EnumCasesAssignment_5 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3771:1: ( ( rule__Enum__EnumCasesAssignment_5 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3772:1: ( rule__Enum__EnumCasesAssignment_5 )
            {
             before(grammarAccess.getEnumAccess().getEnumCasesAssignment_5()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3773:1: ( rule__Enum__EnumCasesAssignment_5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3773:2: rule__Enum__EnumCasesAssignment_5
            {
            pushFollow(FOLLOW_rule__Enum__EnumCasesAssignment_5_in_rule__Enum__Group__5__Impl7704);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3783:1: rule__Enum__Group__6 : rule__Enum__Group__6__Impl rule__Enum__Group__7 ;
    public final void rule__Enum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3787:1: ( rule__Enum__Group__6__Impl rule__Enum__Group__7 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3788:2: rule__Enum__Group__6__Impl rule__Enum__Group__7
            {
            pushFollow(FOLLOW_rule__Enum__Group__6__Impl_in_rule__Enum__Group__67734);
            rule__Enum__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__7_in_rule__Enum__Group__67737);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3795:1: rule__Enum__Group__6__Impl : ( ( rule__Enum__Group_6__0 )* ) ;
    public final void rule__Enum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3799:1: ( ( ( rule__Enum__Group_6__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3800:1: ( ( rule__Enum__Group_6__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3800:1: ( ( rule__Enum__Group_6__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3801:1: ( rule__Enum__Group_6__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_6()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3802:1: ( rule__Enum__Group_6__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3802:2: rule__Enum__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_6__0_in_rule__Enum__Group__6__Impl7764);
            	    rule__Enum__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3812:1: rule__Enum__Group__7 : rule__Enum__Group__7__Impl ;
    public final void rule__Enum__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3816:1: ( rule__Enum__Group__7__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3817:2: rule__Enum__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__7__Impl_in_rule__Enum__Group__77795);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3823:1: rule__Enum__Group__7__Impl : ( '}' ) ;
    public final void rule__Enum__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3827:1: ( ( '}' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3828:1: ( '}' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3828:1: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3829:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7()); 
            match(input,39,FOLLOW_39_in_rule__Enum__Group__7__Impl7823); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3858:1: rule__Enum__Group_2__0 : rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 ;
    public final void rule__Enum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3862:1: ( rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3863:2: rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_2__0__Impl_in_rule__Enum__Group_2__07870);
            rule__Enum__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_2__1_in_rule__Enum__Group_2__07873);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3870:1: rule__Enum__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Enum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3874:1: ( ( ':' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3875:1: ( ':' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3875:1: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3876:1: ':'
            {
             before(grammarAccess.getEnumAccess().getColonKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__Enum__Group_2__0__Impl7901); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3889:1: rule__Enum__Group_2__1 : rule__Enum__Group_2__1__Impl ;
    public final void rule__Enum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3893:1: ( rule__Enum__Group_2__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3894:2: rule__Enum__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_2__1__Impl_in_rule__Enum__Group_2__17932);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3900:1: rule__Enum__Group_2__1__Impl : ( ( rule__Enum__TypeAssignment_2_1 ) ) ;
    public final void rule__Enum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3904:1: ( ( ( rule__Enum__TypeAssignment_2_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3905:1: ( ( rule__Enum__TypeAssignment_2_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3905:1: ( ( rule__Enum__TypeAssignment_2_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3906:1: ( rule__Enum__TypeAssignment_2_1 )
            {
             before(grammarAccess.getEnumAccess().getTypeAssignment_2_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3907:1: ( rule__Enum__TypeAssignment_2_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3907:2: rule__Enum__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Enum__TypeAssignment_2_1_in_rule__Enum__Group_2__1__Impl7959);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3921:1: rule__Enum__Group_6__0 : rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1 ;
    public final void rule__Enum__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3925:1: ( rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3926:2: rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_6__0__Impl_in_rule__Enum__Group_6__07993);
            rule__Enum__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_6__1_in_rule__Enum__Group_6__07996);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3933:1: rule__Enum__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3937:1: ( ( ',' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3938:1: ( ',' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3938:1: ( ',' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3939:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_6_0()); 
            match(input,45,FOLLOW_45_in_rule__Enum__Group_6__0__Impl8024); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3952:1: rule__Enum__Group_6__1 : rule__Enum__Group_6__1__Impl ;
    public final void rule__Enum__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3956:1: ( rule__Enum__Group_6__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3957:2: rule__Enum__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_6__1__Impl_in_rule__Enum__Group_6__18055);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3963:1: rule__Enum__Group_6__1__Impl : ( ( rule__Enum__EnumCasesAssignment_6_1 ) ) ;
    public final void rule__Enum__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3967:1: ( ( ( rule__Enum__EnumCasesAssignment_6_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3968:1: ( ( rule__Enum__EnumCasesAssignment_6_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3968:1: ( ( rule__Enum__EnumCasesAssignment_6_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3969:1: ( rule__Enum__EnumCasesAssignment_6_1 )
            {
             before(grammarAccess.getEnumAccess().getEnumCasesAssignment_6_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3970:1: ( rule__Enum__EnumCasesAssignment_6_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3970:2: rule__Enum__EnumCasesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Enum__EnumCasesAssignment_6_1_in_rule__Enum__Group_6__1__Impl8082);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3984:1: rule__EnumCase__Group__0 : rule__EnumCase__Group__0__Impl rule__EnumCase__Group__1 ;
    public final void rule__EnumCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3988:1: ( rule__EnumCase__Group__0__Impl rule__EnumCase__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3989:2: rule__EnumCase__Group__0__Impl rule__EnumCase__Group__1
            {
            pushFollow(FOLLOW_rule__EnumCase__Group__0__Impl_in_rule__EnumCase__Group__08116);
            rule__EnumCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumCase__Group__1_in_rule__EnumCase__Group__08119);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:3996:1: rule__EnumCase__Group__0__Impl : ( ( rule__EnumCase__NameAssignment_0 ) ) ;
    public final void rule__EnumCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4000:1: ( ( ( rule__EnumCase__NameAssignment_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4001:1: ( ( rule__EnumCase__NameAssignment_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4001:1: ( ( rule__EnumCase__NameAssignment_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4002:1: ( rule__EnumCase__NameAssignment_0 )
            {
             before(grammarAccess.getEnumCaseAccess().getNameAssignment_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4003:1: ( rule__EnumCase__NameAssignment_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4003:2: rule__EnumCase__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumCase__NameAssignment_0_in_rule__EnumCase__Group__0__Impl8146);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4013:1: rule__EnumCase__Group__1 : rule__EnumCase__Group__1__Impl ;
    public final void rule__EnumCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4017:1: ( rule__EnumCase__Group__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4018:2: rule__EnumCase__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumCase__Group__1__Impl_in_rule__EnumCase__Group__18176);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4024:1: rule__EnumCase__Group__1__Impl : ( ( rule__EnumCase__Group_1__0 )? ) ;
    public final void rule__EnumCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4028:1: ( ( ( rule__EnumCase__Group_1__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4029:1: ( ( rule__EnumCase__Group_1__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4029:1: ( ( rule__EnumCase__Group_1__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4030:1: ( rule__EnumCase__Group_1__0 )?
            {
             before(grammarAccess.getEnumCaseAccess().getGroup_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4031:1: ( rule__EnumCase__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4031:2: rule__EnumCase__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumCase__Group_1__0_in_rule__EnumCase__Group__1__Impl8203);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4045:1: rule__EnumCase__Group_1__0 : rule__EnumCase__Group_1__0__Impl rule__EnumCase__Group_1__1 ;
    public final void rule__EnumCase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4049:1: ( rule__EnumCase__Group_1__0__Impl rule__EnumCase__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4050:2: rule__EnumCase__Group_1__0__Impl rule__EnumCase__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumCase__Group_1__0__Impl_in_rule__EnumCase__Group_1__08238);
            rule__EnumCase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumCase__Group_1__1_in_rule__EnumCase__Group_1__08241);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4057:1: rule__EnumCase__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumCase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4061:1: ( ( '=' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4062:1: ( '=' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4062:1: ( '=' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4063:1: '='
            {
             before(grammarAccess.getEnumCaseAccess().getEqualsSignKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__EnumCase__Group_1__0__Impl8269); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4076:1: rule__EnumCase__Group_1__1 : rule__EnumCase__Group_1__1__Impl ;
    public final void rule__EnumCase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4080:1: ( rule__EnumCase__Group_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4081:2: rule__EnumCase__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumCase__Group_1__1__Impl_in_rule__EnumCase__Group_1__18300);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4087:1: rule__EnumCase__Group_1__1__Impl : ( ( rule__EnumCase__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumCase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4091:1: ( ( ( rule__EnumCase__ValueAssignment_1_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4092:1: ( ( rule__EnumCase__ValueAssignment_1_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4092:1: ( ( rule__EnumCase__ValueAssignment_1_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4093:1: ( rule__EnumCase__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumCaseAccess().getValueAssignment_1_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4094:1: ( rule__EnumCase__ValueAssignment_1_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4094:2: rule__EnumCase__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumCase__ValueAssignment_1_1_in_rule__EnumCase__Group_1__1__Impl8327);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4108:1: rule__Union__Group__0 : rule__Union__Group__0__Impl rule__Union__Group__1 ;
    public final void rule__Union__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4112:1: ( rule__Union__Group__0__Impl rule__Union__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4113:2: rule__Union__Group__0__Impl rule__Union__Group__1
            {
            pushFollow(FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__08361);
            rule__Union__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__1_in_rule__Union__Group__08364);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4120:1: rule__Union__Group__0__Impl : ( 'union' ) ;
    public final void rule__Union__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4124:1: ( ( 'union' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4125:1: ( 'union' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4125:1: ( 'union' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4126:1: 'union'
            {
             before(grammarAccess.getUnionAccess().getUnionKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Union__Group__0__Impl8392); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4139:1: rule__Union__Group__1 : rule__Union__Group__1__Impl rule__Union__Group__2 ;
    public final void rule__Union__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4143:1: ( rule__Union__Group__1__Impl rule__Union__Group__2 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4144:2: rule__Union__Group__1__Impl rule__Union__Group__2
            {
            pushFollow(FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__18423);
            rule__Union__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__2_in_rule__Union__Group__18426);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4151:1: rule__Union__Group__1__Impl : ( ( rule__Union__NameAssignment_1 ) ) ;
    public final void rule__Union__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4155:1: ( ( ( rule__Union__NameAssignment_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4156:1: ( ( rule__Union__NameAssignment_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4156:1: ( ( rule__Union__NameAssignment_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4157:1: ( rule__Union__NameAssignment_1 )
            {
             before(grammarAccess.getUnionAccess().getNameAssignment_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4158:1: ( rule__Union__NameAssignment_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4158:2: rule__Union__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Union__NameAssignment_1_in_rule__Union__Group__1__Impl8453);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4168:1: rule__Union__Group__2 : rule__Union__Group__2__Impl rule__Union__Group__3 ;
    public final void rule__Union__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4172:1: ( rule__Union__Group__2__Impl rule__Union__Group__3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4173:2: rule__Union__Group__2__Impl rule__Union__Group__3
            {
            pushFollow(FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__28483);
            rule__Union__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__3_in_rule__Union__Group__28486);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4180:1: rule__Union__Group__2__Impl : ( '{' ) ;
    public final void rule__Union__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4184:1: ( ( '{' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4185:1: ( '{' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4185:1: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4186:1: '{'
            {
             before(grammarAccess.getUnionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Union__Group__2__Impl8514); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4199:1: rule__Union__Group__3 : rule__Union__Group__3__Impl rule__Union__Group__4 ;
    public final void rule__Union__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4203:1: ( rule__Union__Group__3__Impl rule__Union__Group__4 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4204:2: rule__Union__Group__3__Impl rule__Union__Group__4
            {
            pushFollow(FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__38545);
            rule__Union__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__4_in_rule__Union__Group__38548);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4211:1: rule__Union__Group__3__Impl : ( ( rule__Union__UnionCasesAssignment_3 ) ) ;
    public final void rule__Union__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4215:1: ( ( ( rule__Union__UnionCasesAssignment_3 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4216:1: ( ( rule__Union__UnionCasesAssignment_3 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4216:1: ( ( rule__Union__UnionCasesAssignment_3 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4217:1: ( rule__Union__UnionCasesAssignment_3 )
            {
             before(grammarAccess.getUnionAccess().getUnionCasesAssignment_3()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4218:1: ( rule__Union__UnionCasesAssignment_3 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4218:2: rule__Union__UnionCasesAssignment_3
            {
            pushFollow(FOLLOW_rule__Union__UnionCasesAssignment_3_in_rule__Union__Group__3__Impl8575);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4228:1: rule__Union__Group__4 : rule__Union__Group__4__Impl rule__Union__Group__5 ;
    public final void rule__Union__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4232:1: ( rule__Union__Group__4__Impl rule__Union__Group__5 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4233:2: rule__Union__Group__4__Impl rule__Union__Group__5
            {
            pushFollow(FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__48605);
            rule__Union__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group__5_in_rule__Union__Group__48608);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4240:1: rule__Union__Group__4__Impl : ( ( rule__Union__Group_4__0 )* ) ;
    public final void rule__Union__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4244:1: ( ( ( rule__Union__Group_4__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4245:1: ( ( rule__Union__Group_4__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4245:1: ( ( rule__Union__Group_4__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4246:1: ( rule__Union__Group_4__0 )*
            {
             before(grammarAccess.getUnionAccess().getGroup_4()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4247:1: ( rule__Union__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==45) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4247:2: rule__Union__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Union__Group_4__0_in_rule__Union__Group__4__Impl8635);
            	    rule__Union__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4257:1: rule__Union__Group__5 : rule__Union__Group__5__Impl ;
    public final void rule__Union__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4261:1: ( rule__Union__Group__5__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4262:2: rule__Union__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__58666);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4268:1: rule__Union__Group__5__Impl : ( '}' ) ;
    public final void rule__Union__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4272:1: ( ( '}' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4273:1: ( '}' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4273:1: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4274:1: '}'
            {
             before(grammarAccess.getUnionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__Union__Group__5__Impl8694); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4299:1: rule__Union__Group_4__0 : rule__Union__Group_4__0__Impl rule__Union__Group_4__1 ;
    public final void rule__Union__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4303:1: ( rule__Union__Group_4__0__Impl rule__Union__Group_4__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4304:2: rule__Union__Group_4__0__Impl rule__Union__Group_4__1
            {
            pushFollow(FOLLOW_rule__Union__Group_4__0__Impl_in_rule__Union__Group_4__08737);
            rule__Union__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Union__Group_4__1_in_rule__Union__Group_4__08740);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4311:1: rule__Union__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Union__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4315:1: ( ( ',' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4316:1: ( ',' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4316:1: ( ',' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4317:1: ','
            {
             before(grammarAccess.getUnionAccess().getCommaKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__Union__Group_4__0__Impl8768); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4330:1: rule__Union__Group_4__1 : rule__Union__Group_4__1__Impl ;
    public final void rule__Union__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4334:1: ( rule__Union__Group_4__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4335:2: rule__Union__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Union__Group_4__1__Impl_in_rule__Union__Group_4__18799);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4341:1: rule__Union__Group_4__1__Impl : ( ( rule__Union__UnionCasesAssignment_4_1 ) ) ;
    public final void rule__Union__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4345:1: ( ( ( rule__Union__UnionCasesAssignment_4_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4346:1: ( ( rule__Union__UnionCasesAssignment_4_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4346:1: ( ( rule__Union__UnionCasesAssignment_4_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4347:1: ( rule__Union__UnionCasesAssignment_4_1 )
            {
             before(grammarAccess.getUnionAccess().getUnionCasesAssignment_4_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4348:1: ( rule__Union__UnionCasesAssignment_4_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4348:2: rule__Union__UnionCasesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Union__UnionCasesAssignment_4_1_in_rule__Union__Group_4__1__Impl8826);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4362:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4366:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4367:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08860);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08863);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4374:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4378:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4379:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4379:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4380:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl8890);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4391:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4395:1: ( rule__QualifiedName__Group__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4396:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18919);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4402:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4406:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4407:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4407:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4408:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4409:1: ( rule__QualifiedName__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==50) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4409:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8946);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4423:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4427:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4428:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08981);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08984);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4435:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4439:1: ( ( '.' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4440:1: ( '.' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4440:1: ( '.' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4441:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,50,FOLLOW_50_in_rule__QualifiedName__Group_1__0__Impl9012); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4454:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4458:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4459:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19043);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4465:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4469:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4470:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4470:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4471:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl9070);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4486:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4490:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4491:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__09103);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__09106);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4498:1: rule__Number__Group_1__0__Impl : ( ( rule__Number__Alternatives_1_0 ) ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4502:1: ( ( ( rule__Number__Alternatives_1_0 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4503:1: ( ( rule__Number__Alternatives_1_0 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4503:1: ( ( rule__Number__Alternatives_1_0 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4504:1: ( rule__Number__Alternatives_1_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4505:1: ( rule__Number__Alternatives_1_0 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4505:2: rule__Number__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl9133);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4515:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4519:1: ( rule__Number__Group_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4520:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__19163);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4526:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__Group_1_1__0 )? ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4530:1: ( ( ( rule__Number__Group_1_1__0 )? ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4531:1: ( ( rule__Number__Group_1_1__0 )? )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4531:1: ( ( rule__Number__Group_1_1__0 )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4532:1: ( rule__Number__Group_1_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4533:1: ( rule__Number__Group_1_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4533:2: rule__Number__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl9190);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4547:1: rule__Number__Group_1_1__0 : rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 ;
    public final void rule__Number__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4551:1: ( rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4552:2: rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__09225);
            rule__Number__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__09228);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4559:1: rule__Number__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4563:1: ( ( '.' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4564:1: ( '.' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4564:1: ( '.' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4565:1: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
            match(input,50,FOLLOW_50_in_rule__Number__Group_1_1__0__Impl9256); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4578:1: rule__Number__Group_1_1__1 : rule__Number__Group_1_1__1__Impl ;
    public final void rule__Number__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4582:1: ( rule__Number__Group_1_1__1__Impl )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4583:2: rule__Number__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__19287);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4589:1: rule__Number__Group_1_1__1__Impl : ( ( rule__Number__Alternatives_1_1_1 ) ) ;
    public final void rule__Number__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4593:1: ( ( ( rule__Number__Alternatives_1_1_1 ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4594:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4594:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4595:1: ( rule__Number__Alternatives_1_1_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4596:1: ( rule__Number__Alternatives_1_1_1 )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4596:2: rule__Number__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl9314);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4611:1: rule__Schema__IncludesAssignment_0 : ( ruleInclude ) ;
    public final void rule__Schema__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4615:1: ( ( ruleInclude ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4616:1: ( ruleInclude )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4616:1: ( ruleInclude )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4617:1: ruleInclude
            {
             before(grammarAccess.getSchemaAccess().getIncludesIncludeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__Schema__IncludesAssignment_09353);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4626:1: rule__Schema__NamepsaceAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Schema__NamepsaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4630:1: ( ( ruleNamespace ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4631:1: ( ruleNamespace )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4631:1: ( ruleNamespace )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4632:1: ruleNamespace
            {
             before(grammarAccess.getSchemaAccess().getNamepsaceNamespaceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__Schema__NamepsaceAssignment_19384);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4641:1: rule__Schema__FileIdentifierAssignment_2 : ( ruleFileIdentifier ) ;
    public final void rule__Schema__FileIdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4645:1: ( ( ruleFileIdentifier ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4646:1: ( ruleFileIdentifier )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4646:1: ( ruleFileIdentifier )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4647:1: ruleFileIdentifier
            {
             before(grammarAccess.getSchemaAccess().getFileIdentifierFileIdentifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFileIdentifier_in_rule__Schema__FileIdentifierAssignment_29415);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4656:1: rule__Schema__File_extensionAssignment_3 : ( ruleFileExtension ) ;
    public final void rule__Schema__File_extensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4660:1: ( ( ruleFileExtension ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4661:1: ( ruleFileExtension )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4661:1: ( ruleFileExtension )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4662:1: ruleFileExtension
            {
             before(grammarAccess.getSchemaAccess().getFile_extensionFileExtensionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFileExtension_in_rule__Schema__File_extensionAssignment_39446);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4671:1: rule__Schema__CustomAttributesAssignment_4 : ( ruleCustomAttributes ) ;
    public final void rule__Schema__CustomAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4675:1: ( ( ruleCustomAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4676:1: ( ruleCustomAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4676:1: ( ruleCustomAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4677:1: ruleCustomAttributes
            {
             before(grammarAccess.getSchemaAccess().getCustomAttributesCustomAttributesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCustomAttributes_in_rule__Schema__CustomAttributesAssignment_49477);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4686:1: rule__Schema__DefinitionsAssignment_5 : ( ruleDefinition ) ;
    public final void rule__Schema__DefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4690:1: ( ( ruleDefinition ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4691:1: ( ruleDefinition )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4691:1: ( ruleDefinition )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4692:1: ruleDefinition
            {
             before(grammarAccess.getSchemaAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__Schema__DefinitionsAssignment_59508);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4701:1: rule__Schema__RootTypeAssignment_6 : ( ruleRootType ) ;
    public final void rule__Schema__RootTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4705:1: ( ( ruleRootType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4706:1: ( ruleRootType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4706:1: ( ruleRootType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4707:1: ruleRootType
            {
             before(grammarAccess.getSchemaAccess().getRootTypeRootTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRootType_in_rule__Schema__RootTypeAssignment_69539);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4716:1: rule__RootType__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RootType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4720:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4721:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4721:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4722:1: ( RULE_ID )
            {
             before(grammarAccess.getRootTypeAccess().getTypeTableCrossReference_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4723:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4724:1: RULE_ID
            {
             before(grammarAccess.getRootTypeAccess().getTypeTableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RootType__TypeAssignment_19574); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4735:1: rule__CustomAttributes__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomAttributes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4739:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4740:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4740:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4741:1: RULE_STRING
            {
             before(grammarAccess.getCustomAttributesAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomAttributes__NameAssignment_19609); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4750:1: rule__Namespace__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4754:1: ( ( ruleQualifiedName ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4755:1: ( ruleQualifiedName )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4755:1: ( ruleQualifiedName )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4756:1: ruleQualifiedName
            {
             before(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Namespace__NameAssignment_19640);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4765:1: rule__Struct__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Struct__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4769:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4770:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4770:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4771:1: RULE_ID
            {
             before(grammarAccess.getStructAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Struct__NameAssignment_19671); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4780:1: rule__Struct__AttributesAssignment_2 : ( ruleFieldAttributes ) ;
    public final void rule__Struct__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4784:1: ( ( ruleFieldAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4785:1: ( ruleFieldAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4785:1: ( ruleFieldAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4786:1: ruleFieldAttributes
            {
             before(grammarAccess.getStructAccess().getAttributesFieldAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_rule__Struct__AttributesAssignment_29702);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4795:1: rule__Struct__FieldsAssignment_4 : ( ruleStructFields ) ;
    public final void rule__Struct__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4799:1: ( ( ruleStructFields ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4800:1: ( ruleStructFields )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4800:1: ( ruleStructFields )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4801:1: ruleStructFields
            {
             before(grammarAccess.getStructAccess().getFieldsStructFieldsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStructFields_in_rule__Struct__FieldsAssignment_49733);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4810:1: rule__StructFields__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StructFields__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4814:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4815:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4815:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4816:1: RULE_ID
            {
             before(grammarAccess.getStructFieldsAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructFields__NameAssignment_09764); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4825:1: rule__StructFields__PrimTypeAssignment_2_0 : ( rulePrimitiveWithoutString ) ;
    public final void rule__StructFields__PrimTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4829:1: ( ( rulePrimitiveWithoutString ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4830:1: ( rulePrimitiveWithoutString )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4830:1: ( rulePrimitiveWithoutString )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4831:1: rulePrimitiveWithoutString
            {
             before(grammarAccess.getStructFieldsAccess().getPrimTypePrimitiveWithoutStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_rulePrimitiveWithoutString_in_rule__StructFields__PrimTypeAssignment_2_09795);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4840:1: rule__StructFields__DefTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__StructFields__DefTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4844:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4845:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4845:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4846:1: ( RULE_ID )
            {
             before(grammarAccess.getStructFieldsAccess().getDefTypeDefinitionCrossReference_2_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4847:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4848:1: RULE_ID
            {
             before(grammarAccess.getStructFieldsAccess().getDefTypeDefinitionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructFields__DefTypeAssignment_2_19830); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4859:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4863:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4864:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4864:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4865:1: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Table__NameAssignment_19865); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4874:1: rule__Table__AttributesAssignment_2 : ( ruleFieldAttributes ) ;
    public final void rule__Table__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4878:1: ( ( ruleFieldAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4879:1: ( ruleFieldAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4879:1: ( ruleFieldAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4880:1: ruleFieldAttributes
            {
             before(grammarAccess.getTableAccess().getAttributesFieldAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_rule__Table__AttributesAssignment_29896);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4889:1: rule__Table__FieldsAssignment_4 : ( ruleFields ) ;
    public final void rule__Table__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4893:1: ( ( ruleFields ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4894:1: ( ruleFields )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4894:1: ( ruleFields )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4895:1: ruleFields
            {
             before(grammarAccess.getTableAccess().getFieldsFieldsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFields_in_rule__Table__FieldsAssignment_49927);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4904:1: rule__Fields__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__Fields__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4908:1: ( ( ruleValidID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4909:1: ( ruleValidID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4909:1: ( ruleValidID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4910:1: ruleValidID
            {
             before(grammarAccess.getFieldsAccess().getNameValidIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Fields__NameAssignment_09958);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4919:1: rule__Fields__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Fields__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4923:1: ( ( ruleType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4924:1: ( ruleType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4924:1: ( ruleType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4925:1: ruleType
            {
             before(grammarAccess.getFieldsAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Fields__TypeAssignment_29989);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4934:1: rule__Fields__DefaultValueAssignment_3_1 : ( ruleValue ) ;
    public final void rule__Fields__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4938:1: ( ( ruleValue ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4939:1: ( ruleValue )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4939:1: ( ruleValue )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4940:1: ruleValue
            {
             before(grammarAccess.getFieldsAccess().getDefaultValueValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Fields__DefaultValueAssignment_3_110020);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4949:1: rule__Fields__AttributesAssignment_4 : ( ruleFieldAttributes ) ;
    public final void rule__Fields__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4953:1: ( ( ruleFieldAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4954:1: ( ruleFieldAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4954:1: ( ruleFieldAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4955:1: ruleFieldAttributes
            {
             before(grammarAccess.getFieldsAccess().getAttributesFieldAttributesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_rule__Fields__AttributesAssignment_410051);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4964:1: rule__Value__NumberAssignment_0 : ( ruleNumber ) ;
    public final void rule__Value__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4968:1: ( ( ruleNumber ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4969:1: ( ruleNumber )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4969:1: ( ruleNumber )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4970:1: ruleNumber
            {
             before(grammarAccess.getValueAccess().getNumberNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__Value__NumberAssignment_010082);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4979:1: rule__Value__IsFalseAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__Value__IsFalseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4983:1: ( ( ( 'false' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4984:1: ( ( 'false' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4984:1: ( ( 'false' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4985:1: ( 'false' )
            {
             before(grammarAccess.getValueAccess().getIsFalseFalseKeyword_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4986:1: ( 'false' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:4987:1: 'false'
            {
             before(grammarAccess.getValueAccess().getIsFalseFalseKeyword_1_0()); 
            match(input,51,FOLLOW_51_in_rule__Value__IsFalseAssignment_110118); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5002:1: rule__Value__IsTrueAssignment_2 : ( ( 'true' ) ) ;
    public final void rule__Value__IsTrueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5006:1: ( ( ( 'true' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5007:1: ( ( 'true' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5007:1: ( ( 'true' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5008:1: ( 'true' )
            {
             before(grammarAccess.getValueAccess().getIsTrueTrueKeyword_2_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5009:1: ( 'true' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5010:1: 'true'
            {
             before(grammarAccess.getValueAccess().getIsTrueTrueKeyword_2_0()); 
            match(input,52,FOLLOW_52_in_rule__Value__IsTrueAssignment_210162); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5025:1: rule__Value__EnumCaseAssignment_3 : ( RULE_ID ) ;
    public final void rule__Value__EnumCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5029:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5030:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5030:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5031:1: RULE_ID
            {
             before(grammarAccess.getValueAccess().getEnumCaseIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__EnumCaseAssignment_310201); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5040:1: rule__FieldAttributes__AtributeNamesAssignment_1 : ( ruleAttributeName ) ;
    public final void rule__FieldAttributes__AtributeNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5044:1: ( ( ruleAttributeName ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5045:1: ( ruleAttributeName )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5045:1: ( ruleAttributeName )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5046:1: ruleAttributeName
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNamesAttributeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNamesAssignment_110232);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5055:1: rule__FieldAttributes__AtributeNamesAssignment_2_1 : ( ruleAttributeName ) ;
    public final void rule__FieldAttributes__AtributeNamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5059:1: ( ( ruleAttributeName ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5060:1: ( ruleAttributeName )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5060:1: ( ruleAttributeName )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5061:1: ruleAttributeName
            {
             before(grammarAccess.getFieldAttributesAccess().getAtributeNamesAttributeNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNamesAssignment_2_110263);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5070:1: rule__AttributeName__DeprectatedAssignment_0 : ( RULE_DEPRECTED_ATTRIBUTE ) ;
    public final void rule__AttributeName__DeprectatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5074:1: ( ( RULE_DEPRECTED_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5075:1: ( RULE_DEPRECTED_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5075:1: ( RULE_DEPRECTED_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5076:1: RULE_DEPRECTED_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getDeprectatedDEPRECTED_ATTRIBUTETerminalRuleCall_0_0()); 
            match(input,RULE_DEPRECTED_ATTRIBUTE,FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_rule__AttributeName__DeprectatedAssignment_010294); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5085:1: rule__AttributeName__HasAttributeIdAssignment_1_0 : ( RULE_ID_ATTRIBUTE ) ;
    public final void rule__AttributeName__HasAttributeIdAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5089:1: ( ( RULE_ID_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5090:1: ( RULE_ID_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5090:1: ( RULE_ID_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5091:1: RULE_ID_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getHasAttributeIdID_ATTRIBUTETerminalRuleCall_1_0_0()); 
            match(input,RULE_ID_ATTRIBUTE,FOLLOW_RULE_ID_ATTRIBUTE_in_rule__AttributeName__HasAttributeIdAssignment_1_010325); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5100:1: rule__AttributeName__AttributeIdAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__AttributeName__AttributeIdAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5104:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5105:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5105:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5106:1: RULE_INT
            {
             before(grammarAccess.getAttributeNameAccess().getAttributeIdINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeName__AttributeIdAssignment_1_210356); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5115:1: rule__AttributeName__RequiredAssignment_2 : ( RULE_REQUIRED_ATTRIBUTE ) ;
    public final void rule__AttributeName__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5119:1: ( ( RULE_REQUIRED_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5120:1: ( RULE_REQUIRED_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5120:1: ( RULE_REQUIRED_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5121:1: RULE_REQUIRED_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getRequiredREQUIRED_ATTRIBUTETerminalRuleCall_2_0()); 
            match(input,RULE_REQUIRED_ATTRIBUTE,FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_rule__AttributeName__RequiredAssignment_210387); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5130:1: rule__AttributeName__Original_orderAssignment_3 : ( ( 'original_order' ) ) ;
    public final void rule__AttributeName__Original_orderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5134:1: ( ( ( 'original_order' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5135:1: ( ( 'original_order' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5135:1: ( ( 'original_order' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5136:1: ( 'original_order' )
            {
             before(grammarAccess.getAttributeNameAccess().getOriginal_orderOriginal_orderKeyword_3_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5137:1: ( 'original_order' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5138:1: 'original_order'
            {
             before(grammarAccess.getAttributeNameAccess().getOriginal_orderOriginal_orderKeyword_3_0()); 
            match(input,53,FOLLOW_53_in_rule__AttributeName__Original_orderAssignment_310423); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5153:1: rule__AttributeName__HasAlignSizeAssignment_4_0 : ( ( 'force_align' ) ) ;
    public final void rule__AttributeName__HasAlignSizeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5157:1: ( ( ( 'force_align' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5158:1: ( ( 'force_align' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5158:1: ( ( 'force_align' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5159:1: ( 'force_align' )
            {
             before(grammarAccess.getAttributeNameAccess().getHasAlignSizeForce_alignKeyword_4_0_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5160:1: ( 'force_align' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5161:1: 'force_align'
            {
             before(grammarAccess.getAttributeNameAccess().getHasAlignSizeForce_alignKeyword_4_0_0()); 
            match(input,54,FOLLOW_54_in_rule__AttributeName__HasAlignSizeAssignment_4_010467); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5176:1: rule__AttributeName__AlignSizeAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__AttributeName__AlignSizeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5180:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5181:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5181:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5182:1: RULE_INT
            {
             before(grammarAccess.getAttributeNameAccess().getAlignSizeINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeName__AlignSizeAssignment_4_210506); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5191:1: rule__AttributeName__HasHashAssignment_5_0 : ( RULE_HASH_ATTRIBUTE ) ;
    public final void rule__AttributeName__HasHashAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5195:1: ( ( RULE_HASH_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5196:1: ( RULE_HASH_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5196:1: ( RULE_HASH_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5197:1: RULE_HASH_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getHasHashHASH_ATTRIBUTETerminalRuleCall_5_0_0()); 
            match(input,RULE_HASH_ATTRIBUTE,FOLLOW_RULE_HASH_ATTRIBUTE_in_rule__AttributeName__HasHashAssignment_5_010537); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5206:1: rule__AttributeName__HashKeyAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__AttributeName__HashKeyAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5210:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5211:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5211:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5212:1: RULE_STRING
            {
             before(grammarAccess.getAttributeNameAccess().getHashKeySTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributeName__HashKeyAssignment_5_210568); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5221:1: rule__AttributeName__Bit_flagsAssignment_6 : ( ( 'bit_flags' ) ) ;
    public final void rule__AttributeName__Bit_flagsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5225:1: ( ( ( 'bit_flags' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5226:1: ( ( 'bit_flags' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5226:1: ( ( 'bit_flags' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5227:1: ( 'bit_flags' )
            {
             before(grammarAccess.getAttributeNameAccess().getBit_flagsBit_flagsKeyword_6_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5228:1: ( 'bit_flags' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5229:1: 'bit_flags'
            {
             before(grammarAccess.getAttributeNameAccess().getBit_flagsBit_flagsKeyword_6_0()); 
            match(input,55,FOLLOW_55_in_rule__AttributeName__Bit_flagsAssignment_610604); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5244:1: rule__AttributeName__HasNestedTableNameAssignment_7_0 : ( ( 'nested_flatbuffer' ) ) ;
    public final void rule__AttributeName__HasNestedTableNameAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5248:1: ( ( ( 'nested_flatbuffer' ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5249:1: ( ( 'nested_flatbuffer' ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5249:1: ( ( 'nested_flatbuffer' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5250:1: ( 'nested_flatbuffer' )
            {
             before(grammarAccess.getAttributeNameAccess().getHasNestedTableNameNested_flatbufferKeyword_7_0_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5251:1: ( 'nested_flatbuffer' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5252:1: 'nested_flatbuffer'
            {
             before(grammarAccess.getAttributeNameAccess().getHasNestedTableNameNested_flatbufferKeyword_7_0_0()); 
            match(input,56,FOLLOW_56_in_rule__AttributeName__HasNestedTableNameAssignment_7_010648); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5267:1: rule__AttributeName__NestedTableNameAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__AttributeName__NestedTableNameAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5271:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5272:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5272:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5273:1: RULE_STRING
            {
             before(grammarAccess.getAttributeNameAccess().getNestedTableNameSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributeName__NestedTableNameAssignment_7_210687); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5282:1: rule__AttributeName__KeyAssignment_8 : ( RULE_KEY_ATTRIBUTE ) ;
    public final void rule__AttributeName__KeyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5286:1: ( ( RULE_KEY_ATTRIBUTE ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5287:1: ( RULE_KEY_ATTRIBUTE )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5287:1: ( RULE_KEY_ATTRIBUTE )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5288:1: RULE_KEY_ATTRIBUTE
            {
             before(grammarAccess.getAttributeNameAccess().getKeyKEY_ATTRIBUTETerminalRuleCall_8_0()); 
            match(input,RULE_KEY_ATTRIBUTE,FOLLOW_RULE_KEY_ATTRIBUTE_in_rule__AttributeName__KeyAssignment_810718); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5297:1: rule__AttributeName__CustomNameAssignment_9_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeName__CustomNameAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5301:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5302:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5302:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5303:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesCrossReference_9_0_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5304:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5305:1: RULE_ID
            {
             before(grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesIDTerminalRuleCall_9_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeName__CustomNameAssignment_9_010753); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5316:1: rule__AttributeName__IntValueAssignment_9_1_1_0 : ( RULE_INT ) ;
    public final void rule__AttributeName__IntValueAssignment_9_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5320:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5321:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5321:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5322:1: RULE_INT
            {
             before(grammarAccess.getAttributeNameAccess().getIntValueINTTerminalRuleCall_9_1_1_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeName__IntValueAssignment_9_1_1_010788); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5331:1: rule__AttributeName__StringValueAssignment_9_1_1_1 : ( RULE_STRING ) ;
    public final void rule__AttributeName__StringValueAssignment_9_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5335:1: ( ( RULE_STRING ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5336:1: ( RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5336:1: ( RULE_STRING )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5337:1: RULE_STRING
            {
             before(grammarAccess.getAttributeNameAccess().getStringValueSTRINGTerminalRuleCall_9_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributeName__StringValueAssignment_9_1_1_110819); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5346:1: rule__Type__PrimTypeAssignment_0 : ( rulePrimitive ) ;
    public final void rule__Type__PrimTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5350:1: ( ( rulePrimitive ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5351:1: ( rulePrimitive )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5351:1: ( rulePrimitive )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5352:1: rulePrimitive
            {
             before(grammarAccess.getTypeAccess().getPrimTypePrimitiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Type__PrimTypeAssignment_010850);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5361:1: rule__Type__VectorTypeAssignment_1 : ( ruleVector ) ;
    public final void rule__Type__VectorTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5365:1: ( ( ruleVector ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5366:1: ( ruleVector )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5366:1: ( ruleVector )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5367:1: ruleVector
            {
             before(grammarAccess.getTypeAccess().getVectorTypeVectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVector_in_rule__Type__VectorTypeAssignment_110881);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5376:1: rule__Type__DefTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Type__DefTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5380:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5381:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5381:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5382:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getDefTypeDefinitionCrossReference_2_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5383:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5384:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getDefTypeDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__DefTypeAssignment_210916); 
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


    // $ANTLR start "rule__Vector__TypeAssignment_1"
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5395:1: rule__Vector__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Vector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5399:1: ( ( ruleType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5400:1: ( ruleType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5400:1: ( ruleType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5401:1: ruleType
            {
             before(grammarAccess.getVectorAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Vector__TypeAssignment_110951);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5410:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5414:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5415:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5415:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5416:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_110982); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5425:1: rule__Enum__TypeAssignment_2_1 : ( rulePrimitiveNumberType ) ;
    public final void rule__Enum__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5429:1: ( ( rulePrimitiveNumberType ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5430:1: ( rulePrimitiveNumberType )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5430:1: ( rulePrimitiveNumberType )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5431:1: rulePrimitiveNumberType
            {
             before(grammarAccess.getEnumAccess().getTypePrimitiveNumberTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePrimitiveNumberType_in_rule__Enum__TypeAssignment_2_111013);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5440:1: rule__Enum__AttributesAssignment_3 : ( ruleFieldAttributes ) ;
    public final void rule__Enum__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5444:1: ( ( ruleFieldAttributes ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5445:1: ( ruleFieldAttributes )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5445:1: ( ruleFieldAttributes )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5446:1: ruleFieldAttributes
            {
             before(grammarAccess.getEnumAccess().getAttributesFieldAttributesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_rule__Enum__AttributesAssignment_311044);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5455:1: rule__Enum__EnumCasesAssignment_5 : ( ruleEnumCase ) ;
    public final void rule__Enum__EnumCasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5459:1: ( ( ruleEnumCase ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5460:1: ( ruleEnumCase )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5460:1: ( ruleEnumCase )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5461:1: ruleEnumCase
            {
             before(grammarAccess.getEnumAccess().getEnumCasesEnumCaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEnumCase_in_rule__Enum__EnumCasesAssignment_511075);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5470:1: rule__Enum__EnumCasesAssignment_6_1 : ( ruleEnumCase ) ;
    public final void rule__Enum__EnumCasesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5474:1: ( ( ruleEnumCase ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5475:1: ( ruleEnumCase )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5475:1: ( ruleEnumCase )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5476:1: ruleEnumCase
            {
             before(grammarAccess.getEnumAccess().getEnumCasesEnumCaseParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleEnumCase_in_rule__Enum__EnumCasesAssignment_6_111106);
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5485:1: rule__EnumCase__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumCase__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5489:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5490:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5490:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5491:1: RULE_ID
            {
             before(grammarAccess.getEnumCaseAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumCase__NameAssignment_011137); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5500:1: rule__EnumCase__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumCase__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5504:1: ( ( RULE_INT ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5505:1: ( RULE_INT )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5505:1: ( RULE_INT )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5506:1: RULE_INT
            {
             before(grammarAccess.getEnumCaseAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumCase__ValueAssignment_1_111168); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5515:1: rule__Union__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Union__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5519:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5520:1: ( RULE_ID )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5520:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5521:1: RULE_ID
            {
             before(grammarAccess.getUnionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Union__NameAssignment_111199); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5530:1: rule__Union__UnionCasesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Union__UnionCasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5534:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5535:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5535:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5536:1: ( RULE_ID )
            {
             before(grammarAccess.getUnionAccess().getUnionCasesTableCrossReference_3_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5537:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5538:1: RULE_ID
            {
             before(grammarAccess.getUnionAccess().getUnionCasesTableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Union__UnionCasesAssignment_311234); 
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
    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5549:1: rule__Union__UnionCasesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Union__UnionCasesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5553:1: ( ( ( RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5554:1: ( ( RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5554:1: ( ( RULE_ID ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5555:1: ( RULE_ID )
            {
             before(grammarAccess.getUnionAccess().getUnionCasesTableCrossReference_4_1_0()); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5556:1: ( RULE_ID )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5557:1: RULE_ID
            {
             before(grammarAccess.getUnionAccess().getUnionCasesTableIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Union__UnionCasesAssignment_4_111273); 
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
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__0_in_ruleVector1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveWithoutString_in_entryRulePrimitiveWithoutString1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveWithoutString1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveWithoutString__Alternatives_in_rulePrimitiveWithoutString1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumCase_in_entryRuleEnumCase1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumCase1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group__0_in_ruleEnumCase1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnion_in_entryRuleUnion1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnion1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__0_in_ruleUnion1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveNumberType_in_entryRulePrimitiveNumberType1390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveNumberType1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveNumberType__Alternatives_in_rulePrimitiveNumberType1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Definition__Alternatives1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_in_rule__Definition__Alternatives1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Definition__Alternatives1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnion_in_rule__Definition__Alternatives1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__PrimTypeAssignment_2_0_in_rule__StructFields__Alternatives_21731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__DefTypeAssignment_2_1_in_rule__StructFields__Alternatives_21749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__NumberAssignment_0_in_rule__Value__Alternatives1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__IsFalseAssignment_1_in_rule__Value__Alternatives1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__IsTrueAssignment_2_in_rule__Value__Alternatives1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__EnumCaseAssignment_3_in_rule__Value__Alternatives1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__DeprectatedAssignment_0_in_rule__AttributeName__Alternatives1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Alternatives1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__RequiredAssignment_2_in_rule__AttributeName__Alternatives1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Original_orderAssignment_3_in_rule__AttributeName__Alternatives1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__0_in_rule__AttributeName__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__0_in_rule__AttributeName__Alternatives1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Bit_flagsAssignment_6_in_rule__AttributeName__Alternatives1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__0_in_rule__AttributeName__Alternatives1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__KeyAssignment_8_in_rule__AttributeName__Alternatives2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9__0_in_rule__AttributeName__Alternatives2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__IntValueAssignment_9_1_1_0_in_rule__AttributeName__Alternatives_9_1_12064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__StringValueAssignment_9_1_1_1_in_rule__AttributeName__Alternatives_9_1_12082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrimTypeAssignment_0_in_rule__Type__Alternatives2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__VectorTypeAssignment_1_in_rule__Type__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DefTypeAssignment_2_in_rule__Type__Alternatives2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimitiveWithoutString__Alternatives2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimitiveWithoutString__Alternatives2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimitiveWithoutString__Alternatives2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveNumberType_in_rule__PrimitiveWithoutString__Alternatives2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Primitive__Alternatives2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveWithoutString_in_rule__Primitive__Alternatives2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimitiveNumberType__Alternatives2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrimitiveNumberType__Alternatives2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrimitiveNumberType__Alternatives2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimitiveNumberType__Alternatives2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimitiveNumberType__Alternatives2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PrimitiveNumberType__Alternatives2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PrimitiveNumberType__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PrimitiveNumberType__Alternatives2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_ATTRIBUTE_in_rule__ValidID__Alternatives2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ATTRIBUTE_in_rule__ValidID__Alternatives2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_rule__ValidID__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEY_ATTRIBUTE_in_rule__ValidID__Alternatives2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_rule__ValidID__Alternatives2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValidID__Alternatives2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_rule__Number__Alternatives2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_02670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_02687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_12719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_12736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__02766 = new BitSet(new long[]{0x0003022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__02769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__IncludesAssignment_0_in_rule__Schema__Group__0__Impl2796 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__12827 = new BitSet(new long[]{0x0003022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__12830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__NamepsaceAssignment_1_in_rule__Schema__Group__1__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__22888 = new BitSet(new long[]{0x0003022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__3_in_rule__Schema__Group__22891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__FileIdentifierAssignment_2_in_rule__Schema__Group__2__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__3__Impl_in_rule__Schema__Group__32949 = new BitSet(new long[]{0x0003022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__4_in_rule__Schema__Group__32952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__File_extensionAssignment_3_in_rule__Schema__Group__3__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__4__Impl_in_rule__Schema__Group__43010 = new BitSet(new long[]{0x0003022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__5_in_rule__Schema__Group__43013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__CustomAttributesAssignment_4_in_rule__Schema__Group__4__Impl3040 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__5__Impl_in_rule__Schema__Group__53071 = new BitSet(new long[]{0x0003022F40000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__6_in_rule__Schema__Group__53074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__DefinitionsAssignment_5_in_rule__Schema__Group__5__Impl3101 = new BitSet(new long[]{0x0003022000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__6__Impl_in_rule__Schema__Group__63132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__RootTypeAssignment_6_in_rule__Schema__Group__6__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__0__Impl_in_rule__RootType__Group__03203 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RootType__Group__1_in_rule__RootType__Group__03206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RootType__Group__0__Impl3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__1__Impl_in_rule__RootType__Group__13265 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__RootType__Group__2_in_rule__RootType__Group__13268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__TypeAssignment_1_in_rule__RootType__Group__1__Impl3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootType__Group__2__Impl_in_rule__RootType__Group__23325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RootType__Group__2__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__0__Impl_in_rule__CustomAttributes__Group__03390 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__1_in_rule__CustomAttributes__Group__03393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CustomAttributes__Group__0__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__1__Impl_in_rule__CustomAttributes__Group__13452 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__2_in_rule__CustomAttributes__Group__13455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__NameAssignment_1_in_rule__CustomAttributes__Group__1__Impl3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributes__Group__2__Impl_in_rule__CustomAttributes__Group__23512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CustomAttributes__Group__2__Impl3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__0__Impl_in_rule__FileIdentifier__Group__03577 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__1_in_rule__FileIdentifier__Group__03580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FileIdentifier__Group__0__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__1__Impl_in_rule__FileIdentifier__Group__13639 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__2_in_rule__FileIdentifier__Group__13642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FileIdentifier__Group__1__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileIdentifier__Group__2__Impl_in_rule__FileIdentifier__Group__23698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FileIdentifier__Group__2__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__0__Impl_in_rule__FileExtension__Group__03763 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__1_in_rule__FileExtension__Group__03766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FileExtension__Group__0__Impl3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__1__Impl_in_rule__FileExtension__Group__13825 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__2_in_rule__FileExtension__Group__13828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FileExtension__Group__1__Impl3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileExtension__Group__2__Impl_in_rule__FileExtension__Group__23884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FileExtension__Group__2__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03949 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Namespace__Group__0__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__14011 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__24071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Namespace__Group__2__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__04136 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__04139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Include__Group__0__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__14198 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__14201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__Group__1__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__24257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Include__Group__2__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__0__Impl_in_rule__Struct__Group__04322 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Struct__Group__1_in_rule__Struct__Group__04325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Struct__Group__0__Impl4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__1__Impl_in_rule__Struct__Group__14384 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_rule__Struct__Group__2_in_rule__Struct__Group__14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__NameAssignment_1_in_rule__Struct__Group__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__2__Impl_in_rule__Struct__Group__24444 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_rule__Struct__Group__3_in_rule__Struct__Group__24447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__AttributesAssignment_2_in_rule__Struct__Group__2__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__3__Impl_in_rule__Struct__Group__34505 = new BitSet(new long[]{0x0000008000000200L});
    public static final BitSet FOLLOW_rule__Struct__Group__4_in_rule__Struct__Group__34508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Struct__Group__3__Impl4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__4__Impl_in_rule__Struct__Group__44567 = new BitSet(new long[]{0x0000008000000200L});
    public static final BitSet FOLLOW_rule__Struct__Group__5_in_rule__Struct__Group__44570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__FieldsAssignment_4_in_rule__Struct__Group__4__Impl4597 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Struct__Group__5__Impl_in_rule__Struct__Group__54628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Struct__Group__5__Impl4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Group__0__Impl_in_rule__StructFields__Group__04699 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__StructFields__Group__1_in_rule__StructFields__Group__04702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__NameAssignment_0_in_rule__StructFields__Group__0__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Group__1__Impl_in_rule__StructFields__Group__14759 = new BitSet(new long[]{0x000000003FDC0200L});
    public static final BitSet FOLLOW_rule__StructFields__Group__2_in_rule__StructFields__Group__14762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__StructFields__Group__1__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Group__2__Impl_in_rule__StructFields__Group__24821 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__StructFields__Group__3_in_rule__StructFields__Group__24824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Alternatives_2_in_rule__StructFields__Group__2__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructFields__Group__3__Impl_in_rule__StructFields__Group__34881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StructFields__Group__3__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__04948 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__04951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Table__Group__0__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__15010 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__15013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__25070 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_rule__Table__Group__3_in_rule__Table__Group__25073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__AttributesAssignment_2_in_rule__Table__Group__2__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__35131 = new BitSet(new long[]{0x00000080000003F0L});
    public static final BitSet FOLLOW_rule__Table__Group__4_in_rule__Table__Group__35134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Table__Group__3__Impl5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__45193 = new BitSet(new long[]{0x00000080000003F0L});
    public static final BitSet FOLLOW_rule__Table__Group__5_in_rule__Table__Group__45196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__FieldsAssignment_4_in_rule__Table__Group__4__Impl5223 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__55254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Table__Group__5__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__0__Impl_in_rule__Fields__Group__05325 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__1_in_rule__Fields__Group__05328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__NameAssignment_0_in_rule__Fields__Group__0__Impl5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__1__Impl_in_rule__Fields__Group__15385 = new BitSet(new long[]{0x000040003FFC0200L});
    public static final BitSet FOLLOW_rule__Fields__Group__2_in_rule__Fields__Group__15388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Fields__Group__1__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__2__Impl_in_rule__Fields__Group__25447 = new BitSet(new long[]{0x00000C0080000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__3_in_rule__Fields__Group__25450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__TypeAssignment_2_in_rule__Fields__Group__2__Impl5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__3__Impl_in_rule__Fields__Group__35507 = new BitSet(new long[]{0x00000C0080000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__4_in_rule__Fields__Group__35510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__0_in_rule__Fields__Group__3__Impl5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__4__Impl_in_rule__Fields__Group__45568 = new BitSet(new long[]{0x00000C0080000000L});
    public static final BitSet FOLLOW_rule__Fields__Group__5_in_rule__Fields__Group__45571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__AttributesAssignment_4_in_rule__Fields__Group__4__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group__5__Impl_in_rule__Fields__Group__55629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Fields__Group__5__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__0__Impl_in_rule__Fields__Group_3__05700 = new BitSet(new long[]{0x0018000000001E00L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__1_in_rule__Fields__Group_3__05703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Fields__Group_3__0__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__Group_3__1__Impl_in_rule__Fields__Group_3__15762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fields__DefaultValueAssignment_3_1_in_rule__Fields__Group_3__1__Impl5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__0__Impl_in_rule__FieldAttributes__Group__05823 = new BitSet(new long[]{0x01E00000000003F0L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__1_in_rule__FieldAttributes__Group__05826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FieldAttributes__Group__0__Impl5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__1__Impl_in_rule__FieldAttributes__Group__15885 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__2_in_rule__FieldAttributes__Group__15888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__AtributeNamesAssignment_1_in_rule__FieldAttributes__Group__1__Impl5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__2__Impl_in_rule__FieldAttributes__Group__25945 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__3_in_rule__FieldAttributes__Group__25948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group_2__0_in_rule__FieldAttributes__Group__2__Impl5975 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group__3__Impl_in_rule__FieldAttributes__Group__36006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FieldAttributes__Group__3__Impl6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group_2__0__Impl_in_rule__FieldAttributes__Group_2__06073 = new BitSet(new long[]{0x01E00000000003F0L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group_2__1_in_rule__FieldAttributes__Group_2__06076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FieldAttributes__Group_2__0__Impl6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__Group_2__1__Impl_in_rule__FieldAttributes__Group_2__16135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAttributes__AtributeNamesAssignment_2_1_in_rule__FieldAttributes__Group_2__1__Impl6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__06196 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__06199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HasAttributeIdAssignment_1_0_in_rule__AttributeName__Group_1__0__Impl6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__16256 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__2_in_rule__AttributeName__Group_1__16259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_1__1__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__2__Impl_in_rule__AttributeName__Group_1__26318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__AttributeIdAssignment_1_2_in_rule__AttributeName__Group_1__2__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__0__Impl_in_rule__AttributeName__Group_4__06381 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__1_in_rule__AttributeName__Group_4__06384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HasAlignSizeAssignment_4_0_in_rule__AttributeName__Group_4__0__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__1__Impl_in_rule__AttributeName__Group_4__16441 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__2_in_rule__AttributeName__Group_4__16444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_4__1__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_4__2__Impl_in_rule__AttributeName__Group_4__26503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__AlignSizeAssignment_4_2_in_rule__AttributeName__Group_4__2__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__0__Impl_in_rule__AttributeName__Group_5__06566 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__1_in_rule__AttributeName__Group_5__06569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HasHashAssignment_5_0_in_rule__AttributeName__Group_5__0__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__1__Impl_in_rule__AttributeName__Group_5__16626 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__2_in_rule__AttributeName__Group_5__16629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_5__1__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_5__2__Impl_in_rule__AttributeName__Group_5__26688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HashKeyAssignment_5_2_in_rule__AttributeName__Group_5__2__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__0__Impl_in_rule__AttributeName__Group_7__06751 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__1_in_rule__AttributeName__Group_7__06754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__HasNestedTableNameAssignment_7_0_in_rule__AttributeName__Group_7__0__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__1__Impl_in_rule__AttributeName__Group_7__16811 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__2_in_rule__AttributeName__Group_7__16814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_7__1__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_7__2__Impl_in_rule__AttributeName__Group_7__26873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__NestedTableNameAssignment_7_2_in_rule__AttributeName__Group_7__2__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9__0__Impl_in_rule__AttributeName__Group_9__06936 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9__1_in_rule__AttributeName__Group_9__06939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__CustomNameAssignment_9_0_in_rule__AttributeName__Group_9__0__Impl6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9__1__Impl_in_rule__AttributeName__Group_9__16996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9_1__0_in_rule__AttributeName__Group_9__1__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9_1__0__Impl_in_rule__AttributeName__Group_9_1__07058 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9_1__1_in_rule__AttributeName__Group_9_1__07061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeName__Group_9_1__0__Impl7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_9_1__1__Impl_in_rule__AttributeName__Group_9_1__17120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Alternatives_9_1_1_in_rule__AttributeName__Group_9_1__1__Impl7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__0__Impl_in_rule__Vector__Group__07181 = new BitSet(new long[]{0x000040003FFC0200L});
    public static final BitSet FOLLOW_rule__Vector__Group__1_in_rule__Vector__Group__07184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Vector__Group__0__Impl7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__1__Impl_in_rule__Vector__Group__17243 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Vector__Group__2_in_rule__Vector__Group__17246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__TypeAssignment_1_in_rule__Vector__Group__1__Impl7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__2__Impl_in_rule__Vector__Group__27303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Vector__Group__2__Impl7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__07368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__07371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Enum__Group__0__Impl7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__17430 = new BitSet(new long[]{0x0000094000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__17433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__27490 = new BitSet(new long[]{0x0000094000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__27493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__0_in_rule__Enum__Group__2__Impl7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__37551 = new BitSet(new long[]{0x0000094000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__37554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__AttributesAssignment_3_in_rule__Enum__Group__3__Impl7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__47612 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__47615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Enum__Group__4__Impl7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__57674 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__6_in_rule__Enum__Group__57677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__EnumCasesAssignment_5_in_rule__Enum__Group__5__Impl7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__6__Impl_in_rule__Enum__Group__67734 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__7_in_rule__Enum__Group__67737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_6__0_in_rule__Enum__Group__6__Impl7764 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__7__Impl_in_rule__Enum__Group__77795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Enum__Group__7__Impl7823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__0__Impl_in_rule__Enum__Group_2__07870 = new BitSet(new long[]{0x000000003FDC0000L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__1_in_rule__Enum__Group_2__07873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Enum__Group_2__0__Impl7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__1__Impl_in_rule__Enum__Group_2__17932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__TypeAssignment_2_1_in_rule__Enum__Group_2__1__Impl7959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_6__0__Impl_in_rule__Enum__Group_6__07993 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Enum__Group_6__1_in_rule__Enum__Group_6__07996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Enum__Group_6__0__Impl8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_6__1__Impl_in_rule__Enum__Group_6__18055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__EnumCasesAssignment_6_1_in_rule__Enum__Group_6__1__Impl8082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group__0__Impl_in_rule__EnumCase__Group__08116 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EnumCase__Group__1_in_rule__EnumCase__Group__08119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__NameAssignment_0_in_rule__EnumCase__Group__0__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group__1__Impl_in_rule__EnumCase__Group__18176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group_1__0_in_rule__EnumCase__Group__1__Impl8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group_1__0__Impl_in_rule__EnumCase__Group_1__08238 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumCase__Group_1__1_in_rule__EnumCase__Group_1__08241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EnumCase__Group_1__0__Impl8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__Group_1__1__Impl_in_rule__EnumCase__Group_1__18300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumCase__ValueAssignment_1_1_in_rule__EnumCase__Group_1__1__Impl8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__08361 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Union__Group__1_in_rule__Union__Group__08364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Union__Group__0__Impl8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__18423 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Union__Group__2_in_rule__Union__Group__18426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__NameAssignment_1_in_rule__Union__Group__1__Impl8453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__28483 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Union__Group__3_in_rule__Union__Group__28486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Union__Group__2__Impl8514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__38545 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_rule__Union__Group__4_in_rule__Union__Group__38548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__UnionCasesAssignment_3_in_rule__Union__Group__3__Impl8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__48605 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_rule__Union__Group__5_in_rule__Union__Group__48608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group_4__0_in_rule__Union__Group__4__Impl8635 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__58666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Union__Group__5__Impl8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group_4__0__Impl_in_rule__Union__Group_4__08737 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Union__Group_4__1_in_rule__Union__Group_4__08740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Union__Group_4__0__Impl8768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__Group_4__1__Impl_in_rule__Union__Group_4__18799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Union__UnionCasesAssignment_4_1_in_rule__Union__Group_4__1__Impl8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08860 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8946 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08981 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__QualifiedName__Group_1__0__Impl9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl9070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__09103 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__09106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__19163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl9190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__09225 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__09228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Number__Group_1_1__0__Impl9256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__19287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Schema__IncludesAssignment_09353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__Schema__NamepsaceAssignment_19384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileIdentifier_in_rule__Schema__FileIdentifierAssignment_29415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileExtension_in_rule__Schema__File_extensionAssignment_39446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributes_in_rule__Schema__CustomAttributesAssignment_49477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Schema__DefinitionsAssignment_59508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootType_in_rule__Schema__RootTypeAssignment_69539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RootType__TypeAssignment_19574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomAttributes__NameAssignment_19609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Namespace__NameAssignment_19640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Struct__NameAssignment_19671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_rule__Struct__AttributesAssignment_29702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructFields_in_rule__Struct__FieldsAssignment_49733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructFields__NameAssignment_09764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveWithoutString_in_rule__StructFields__PrimTypeAssignment_2_09795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructFields__DefTypeAssignment_2_19830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Table__NameAssignment_19865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_rule__Table__AttributesAssignment_29896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFields_in_rule__Table__FieldsAssignment_49927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Fields__NameAssignment_09958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Fields__TypeAssignment_29989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Fields__DefaultValueAssignment_3_110020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_rule__Fields__AttributesAssignment_410051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Value__NumberAssignment_010082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Value__IsFalseAssignment_110118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Value__IsTrueAssignment_210162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__EnumCaseAssignment_310201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNamesAssignment_110232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__FieldAttributes__AtributeNamesAssignment_2_110263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_rule__AttributeName__DeprectatedAssignment_010294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ATTRIBUTE_in_rule__AttributeName__HasAttributeIdAssignment_1_010325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeName__AttributeIdAssignment_1_210356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_rule__AttributeName__RequiredAssignment_210387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__AttributeName__Original_orderAssignment_310423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__AttributeName__HasAlignSizeAssignment_4_010467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeName__AlignSizeAssignment_4_210506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_ATTRIBUTE_in_rule__AttributeName__HasHashAssignment_5_010537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeName__HashKeyAssignment_5_210568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__AttributeName__Bit_flagsAssignment_610604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__AttributeName__HasNestedTableNameAssignment_7_010648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeName__NestedTableNameAssignment_7_210687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEY_ATTRIBUTE_in_rule__AttributeName__KeyAssignment_810718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeName__CustomNameAssignment_9_010753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeName__IntValueAssignment_9_1_1_010788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeName__StringValueAssignment_9_1_1_110819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Type__PrimTypeAssignment_010850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_rule__Type__VectorTypeAssignment_110881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__DefTypeAssignment_210916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Vector__TypeAssignment_110951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_110982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveNumberType_in_rule__Enum__TypeAssignment_2_111013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_rule__Enum__AttributesAssignment_311044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumCase_in_rule__Enum__EnumCasesAssignment_511075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumCase_in_rule__Enum__EnumCasesAssignment_6_111106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumCase__NameAssignment_011137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumCase__ValueAssignment_1_111168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Union__NameAssignment_111199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Union__UnionCasesAssignment_311234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Union__UnionCasesAssignment_4_111273 = new BitSet(new long[]{0x0000000000000002L});

}