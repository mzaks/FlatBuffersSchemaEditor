package maxim.zaks.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import maxim.zaks.services.FlatBuffersGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlatBuffersParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DEPRECTED_ATTRIBUTE", "RULE_ID_ATTRIBUTE", "RULE_INT", "RULE_REQUIRED_ATTRIBUTE", "RULE_HASH_ATTRIBUTE", "RULE_KEY_ATTRIBUTE", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'root_type'", "';'", "'attribute'", "'file_identifier'", "'file_extension'", "'namespace'", "'include'", "'struct'", "'{'", "'}'", "':'", "'table'", "'='", "'false'", "'true'", "'('", "','", "')'", "'original_order'", "'force_align'", "'bit_flags'", "'nested_flatbuffer'", "'['", "']'", "'bool'", "'float'", "'double'", "'string'", "'enum'", "'union'", "'byte'", "'ubyte'", "'short'", "'ushort'", "'int'", "'uint'", "'long'", "'ulong'", "'.'"
    };
    public static final int RULE_HEX=12;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_DEPRECTED_ATTRIBUTE=6;
    public static final int RULE_DECIMAL=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_KEY_ATTRIBUTE=11;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_ID_ATTRIBUTE=7;
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
    public static final int RULE_HASH_ATTRIBUTE=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_REQUIRED_ATTRIBUTE=9;
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
    public String getGrammarFileName() { return "../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g"; }



     	private FlatBuffersGrammarAccess grammarAccess;
     	
        public InternalFlatBuffersParser(TokenStream input, FlatBuffersGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Schema";	
       	}
       	
       	@Override
       	protected FlatBuffersGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSchema"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:67:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:68:2: (iv_ruleSchema= ruleSchema EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:69:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_ruleSchema_in_entryRuleSchema75);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchema85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:76:1: ruleSchema returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_file_extension_3_0= ruleFileExtension ) )? ( (lv_customAttributes_4_0= ruleCustomAttributes ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_rootType_6_0= ruleRootType ) ) ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_includes_0_0 = null;

        EObject lv_namepsace_1_0 = null;

        AntlrDatatypeRuleToken lv_fileIdentifier_2_0 = null;

        AntlrDatatypeRuleToken lv_file_extension_3_0 = null;

        EObject lv_customAttributes_4_0 = null;

        EObject lv_definitions_5_0 = null;

        EObject lv_rootType_6_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:79:28: ( ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_file_extension_3_0= ruleFileExtension ) )? ( (lv_customAttributes_4_0= ruleCustomAttributes ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_rootType_6_0= ruleRootType ) ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:80:1: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_file_extension_3_0= ruleFileExtension ) )? ( (lv_customAttributes_4_0= ruleCustomAttributes ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_rootType_6_0= ruleRootType ) ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:80:1: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_file_extension_3_0= ruleFileExtension ) )? ( (lv_customAttributes_4_0= ruleCustomAttributes ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_rootType_6_0= ruleRootType ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:80:2: ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_file_extension_3_0= ruleFileExtension ) )? ( (lv_customAttributes_4_0= ruleCustomAttributes ) )* ( (lv_definitions_5_0= ruleDefinition ) )* ( (lv_rootType_6_0= ruleRootType ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:80:2: ( (lv_includes_0_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:81:1: (lv_includes_0_0= ruleInclude )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:81:1: (lv_includes_0_0= ruleInclude )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:82:3: lv_includes_0_0= ruleInclude
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSchemaAccess().getIncludesIncludeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInclude_in_ruleSchema131);
            	    lv_includes_0_0=ruleInclude();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"includes",
            	            		lv_includes_0_0, 
            	            		"Include");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:98:3: ( (lv_namepsace_1_0= ruleNamespace ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:99:1: (lv_namepsace_1_0= ruleNamespace )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:99:1: (lv_namepsace_1_0= ruleNamespace )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:100:3: lv_namepsace_1_0= ruleNamespace
                    {
                     
                    	        newCompositeNode(grammarAccess.getSchemaAccess().getNamepsaceNamespaceParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamespace_in_ruleSchema153);
                    lv_namepsace_1_0=ruleNamespace();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
                    	        }
                           		set(
                           			current, 
                           			"namepsace",
                            		lv_namepsace_1_0, 
                            		"Namespace");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:116:3: ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:117:1: (lv_fileIdentifier_2_0= ruleFileIdentifier )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:117:1: (lv_fileIdentifier_2_0= ruleFileIdentifier )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:118:3: lv_fileIdentifier_2_0= ruleFileIdentifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getSchemaAccess().getFileIdentifierFileIdentifierParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFileIdentifier_in_ruleSchema175);
                    lv_fileIdentifier_2_0=ruleFileIdentifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
                    	        }
                           		set(
                           			current, 
                           			"fileIdentifier",
                            		lv_fileIdentifier_2_0, 
                            		"FileIdentifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:134:3: ( (lv_file_extension_3_0= ruleFileExtension ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:135:1: (lv_file_extension_3_0= ruleFileExtension )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:135:1: (lv_file_extension_3_0= ruleFileExtension )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:136:3: lv_file_extension_3_0= ruleFileExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getSchemaAccess().getFile_extensionFileExtensionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFileExtension_in_ruleSchema197);
                    lv_file_extension_3_0=ruleFileExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
                    	        }
                           		set(
                           			current, 
                           			"file_extension",
                            		lv_file_extension_3_0, 
                            		"FileExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:152:3: ( (lv_customAttributes_4_0= ruleCustomAttributes ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:153:1: (lv_customAttributes_4_0= ruleCustomAttributes )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:153:1: (lv_customAttributes_4_0= ruleCustomAttributes )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:154:3: lv_customAttributes_4_0= ruleCustomAttributes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSchemaAccess().getCustomAttributesCustomAttributesParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomAttributes_in_ruleSchema219);
            	    lv_customAttributes_4_0=ruleCustomAttributes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"customAttributes",
            	            		lv_customAttributes_4_0, 
            	            		"CustomAttributes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:170:3: ( (lv_definitions_5_0= ruleDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25||LA6_0==29||(LA6_0>=46 && LA6_0<=47)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:171:1: (lv_definitions_5_0= ruleDefinition )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:171:1: (lv_definitions_5_0= ruleDefinition )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:172:3: lv_definitions_5_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSchemaAccess().getDefinitionsDefinitionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleSchema241);
            	    lv_definitions_5_0=ruleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_5_0, 
            	            		"Definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:188:3: ( (lv_rootType_6_0= ruleRootType ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:189:1: (lv_rootType_6_0= ruleRootType )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:189:1: (lv_rootType_6_0= ruleRootType )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:190:3: lv_rootType_6_0= ruleRootType
            {
             
            	        newCompositeNode(grammarAccess.getSchemaAccess().getRootTypeRootTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleRootType_in_ruleSchema263);
            lv_rootType_6_0=ruleRootType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSchemaRule());
            	        }
                   		set(
                   			current, 
                   			"rootType",
                    		lv_rootType_6_0, 
                    		"RootType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleRootType"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:214:1: entryRuleRootType returns [EObject current=null] : iv_ruleRootType= ruleRootType EOF ;
    public final EObject entryRuleRootType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootType = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:215:2: (iv_ruleRootType= ruleRootType EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:216:2: iv_ruleRootType= ruleRootType EOF
            {
             newCompositeNode(grammarAccess.getRootTypeRule()); 
            pushFollow(FOLLOW_ruleRootType_in_entryRuleRootType299);
            iv_ruleRootType=ruleRootType();

            state._fsp--;

             current =iv_ruleRootType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootType309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootType"


    // $ANTLR start "ruleRootType"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:223:1: ruleRootType returns [EObject current=null] : (otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleRootType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:226:28: ( (otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:227:1: (otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:227:1: (otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:227:3: otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleRootType346); 

                	newLeafNode(otherlv_0, grammarAccess.getRootTypeAccess().getRoot_typeKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:231:1: ( (otherlv_1= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:232:1: (otherlv_1= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:232:1: (otherlv_1= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:233:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRootTypeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRootType366); 

            		newLeafNode(otherlv_1, grammarAccess.getRootTypeAccess().getTypeTableCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRootType378); 

                	newLeafNode(otherlv_2, grammarAccess.getRootTypeAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootType"


    // $ANTLR start "entryRuleCustomAttributes"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:256:1: entryRuleCustomAttributes returns [EObject current=null] : iv_ruleCustomAttributes= ruleCustomAttributes EOF ;
    public final EObject entryRuleCustomAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomAttributes = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:257:2: (iv_ruleCustomAttributes= ruleCustomAttributes EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:258:2: iv_ruleCustomAttributes= ruleCustomAttributes EOF
            {
             newCompositeNode(grammarAccess.getCustomAttributesRule()); 
            pushFollow(FOLLOW_ruleCustomAttributes_in_entryRuleCustomAttributes414);
            iv_ruleCustomAttributes=ruleCustomAttributes();

            state._fsp--;

             current =iv_ruleCustomAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomAttributes424); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomAttributes"


    // $ANTLR start "ruleCustomAttributes"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:265:1: ruleCustomAttributes returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleCustomAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:268:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:269:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:269:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:269:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCustomAttributes461); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomAttributesAccess().getAttributeKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:273:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:274:1: (lv_name_1_0= RULE_STRING )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:274:1: (lv_name_1_0= RULE_STRING )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:275:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomAttributes478); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCustomAttributesAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomAttributesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleCustomAttributes495); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomAttributesAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomAttributes"


    // $ANTLR start "entryRuleFileIdentifier"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:303:1: entryRuleFileIdentifier returns [String current=null] : iv_ruleFileIdentifier= ruleFileIdentifier EOF ;
    public final String entryRuleFileIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileIdentifier = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:304:2: (iv_ruleFileIdentifier= ruleFileIdentifier EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:305:2: iv_ruleFileIdentifier= ruleFileIdentifier EOF
            {
             newCompositeNode(grammarAccess.getFileIdentifierRule()); 
            pushFollow(FOLLOW_ruleFileIdentifier_in_entryRuleFileIdentifier532);
            iv_ruleFileIdentifier=ruleFileIdentifier();

            state._fsp--;

             current =iv_ruleFileIdentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileIdentifier543); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileIdentifier"


    // $ANTLR start "ruleFileIdentifier"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:312:1: ruleFileIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleFileIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:315:28: ( (kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:316:1: (kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:316:1: (kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:317:2: kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleFileIdentifier581); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFileIdentifierAccess().getFile_identifierKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFileIdentifier596); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getFileIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleFileIdentifier614); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFileIdentifierAccess().getSemicolonKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileIdentifier"


    // $ANTLR start "entryRuleFileExtension"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:343:1: entryRuleFileExtension returns [String current=null] : iv_ruleFileExtension= ruleFileExtension EOF ;
    public final String entryRuleFileExtension() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileExtension = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:344:2: (iv_ruleFileExtension= ruleFileExtension EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:345:2: iv_ruleFileExtension= ruleFileExtension EOF
            {
             newCompositeNode(grammarAccess.getFileExtensionRule()); 
            pushFollow(FOLLOW_ruleFileExtension_in_entryRuleFileExtension655);
            iv_ruleFileExtension=ruleFileExtension();

            state._fsp--;

             current =iv_ruleFileExtension.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileExtension666); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileExtension"


    // $ANTLR start "ruleFileExtension"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:352:1: ruleFileExtension returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'file_extension' this_STRING_1= RULE_STRING kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleFileExtension() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:355:28: ( (kw= 'file_extension' this_STRING_1= RULE_STRING kw= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:356:1: (kw= 'file_extension' this_STRING_1= RULE_STRING kw= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:356:1: (kw= 'file_extension' this_STRING_1= RULE_STRING kw= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:357:2: kw= 'file_extension' this_STRING_1= RULE_STRING kw= ';'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleFileExtension704); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFileExtensionAccess().getFile_extensionKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFileExtension719); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getFileExtensionAccess().getSTRINGTerminalRuleCall_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleFileExtension737); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFileExtensionAccess().getSemicolonKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileExtension"


    // $ANTLR start "entryRuleNamespace"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:383:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:384:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:385:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace777);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace787); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:392:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:395:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:396:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:396:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:396:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleNamespace824); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:400:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:401:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:401:1: (lv_name_1_0= ruleQualifiedName )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:402:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNamespace845);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleNamespace857); 

                	newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleInclude"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:430:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:431:2: (iv_ruleInclude= ruleInclude EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:432:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude894);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude905); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:439:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'include' this_STRING_1= RULE_STRING kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:442:28: ( (kw= 'include' this_STRING_1= RULE_STRING kw= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:443:1: (kw= 'include' this_STRING_1= RULE_STRING kw= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:443:1: (kw= 'include' this_STRING_1= RULE_STRING kw= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:444:2: kw= 'include' this_STRING_1= RULE_STRING kw= ';'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleInclude943); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude958); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getIncludeAccess().getSTRINGTerminalRuleCall_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleInclude976); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIncludeAccess().getSemicolonKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleDefinition"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:470:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:471:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:472:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1016);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1026); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:479:1: ruleDefinition returns [EObject current=null] : (this_Table_0= ruleTable | this_Struct_1= ruleStruct | this_Enum_2= ruleEnum | this_Union_3= ruleUnion ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Table_0 = null;

        EObject this_Struct_1 = null;

        EObject this_Enum_2 = null;

        EObject this_Union_3 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:482:28: ( (this_Table_0= ruleTable | this_Struct_1= ruleStruct | this_Enum_2= ruleEnum | this_Union_3= ruleUnion ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:483:1: (this_Table_0= ruleTable | this_Struct_1= ruleStruct | this_Enum_2= ruleEnum | this_Union_3= ruleUnion )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:483:1: (this_Table_0= ruleTable | this_Struct_1= ruleStruct | this_Enum_2= ruleEnum | this_Union_3= ruleUnion )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 46:
                {
                alt7=3;
                }
                break;
            case 47:
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
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:484:5: this_Table_0= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionAccess().getTableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTable_in_ruleDefinition1073);
                    this_Table_0=ruleTable();

                    state._fsp--;

                     
                            current = this_Table_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:494:5: this_Struct_1= ruleStruct
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionAccess().getStructParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStruct_in_ruleDefinition1100);
                    this_Struct_1=ruleStruct();

                    state._fsp--;

                     
                            current = this_Struct_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:504:5: this_Enum_2= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionAccess().getEnumParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleDefinition1127);
                    this_Enum_2=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:514:5: this_Union_3= ruleUnion
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionAccess().getUnionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUnion_in_ruleDefinition1154);
                    this_Union_3=ruleUnion();

                    state._fsp--;

                     
                            current = this_Union_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleStruct"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:530:1: entryRuleStruct returns [EObject current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final EObject entryRuleStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:531:2: (iv_ruleStruct= ruleStruct EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:532:2: iv_ruleStruct= ruleStruct EOF
            {
             newCompositeNode(grammarAccess.getStructRule()); 
            pushFollow(FOLLOW_ruleStruct_in_entryRuleStruct1189);
            iv_ruleStruct=ruleStruct();

            state._fsp--;

             current =iv_ruleStruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStruct1199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:539:1: ruleStruct returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleStructFields ) )* otherlv_5= '}' ) ;
    public final EObject ruleStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_fields_4_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:542:28: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleStructFields ) )* otherlv_5= '}' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:543:1: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleStructFields ) )* otherlv_5= '}' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:543:1: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleStructFields ) )* otherlv_5= '}' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:543:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleStructFields ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleStruct1236); 

                	newLeafNode(otherlv_0, grammarAccess.getStructAccess().getStructKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:547:1: ( (lv_name_1_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:548:1: (lv_name_1_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:548:1: (lv_name_1_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:549:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStruct1253); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStructAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:565:2: ( (lv_attributes_2_0= ruleFieldAttributes ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:566:1: (lv_attributes_2_0= ruleFieldAttributes )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:566:1: (lv_attributes_2_0= ruleFieldAttributes )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:567:3: lv_attributes_2_0= ruleFieldAttributes
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructAccess().getAttributesFieldAttributesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldAttributes_in_ruleStruct1279);
                    lv_attributes_2_0=ruleFieldAttributes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructRule());
                    	        }
                           		set(
                           			current, 
                           			"attributes",
                            		lv_attributes_2_0, 
                            		"FieldAttributes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleStruct1292); 

                	newLeafNode(otherlv_3, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:587:1: ( (lv_fields_4_0= ruleStructFields ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:588:1: (lv_fields_4_0= ruleStructFields )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:588:1: (lv_fields_4_0= ruleStructFields )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:589:3: lv_fields_4_0= ruleStructFields
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructAccess().getFieldsStructFieldsParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructFields_in_ruleStruct1313);
            	    lv_fields_4_0=ruleStructFields();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_4_0, 
            	            		"StructFields");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleStruct1326); 

                	newLeafNode(otherlv_5, grammarAccess.getStructAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleStructFields"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:617:1: entryRuleStructFields returns [EObject current=null] : iv_ruleStructFields= ruleStructFields EOF ;
    public final EObject entryRuleStructFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructFields = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:618:2: (iv_ruleStructFields= ruleStructFields EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:619:2: iv_ruleStructFields= ruleStructFields EOF
            {
             newCompositeNode(grammarAccess.getStructFieldsRule()); 
            pushFollow(FOLLOW_ruleStructFields_in_entryRuleStructFields1362);
            iv_ruleStructFields=ruleStructFields();

            state._fsp--;

             current =iv_ruleStructFields; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructFields1372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructFields"


    // $ANTLR start "ruleStructFields"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:626:1: ruleStructFields returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_primType_2_0= rulePrimitiveWithoutString ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleStructFields() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_primType_2_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:629:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_primType_2_0= rulePrimitiveWithoutString ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:630:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_primType_2_0= rulePrimitiveWithoutString ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:630:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_primType_2_0= rulePrimitiveWithoutString ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:630:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_primType_2_0= rulePrimitiveWithoutString ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';'
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:630:2: ( (lv_name_0_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:631:1: (lv_name_0_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:631:1: (lv_name_0_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:632:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructFields1414); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStructFieldsAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructFieldsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleStructFields1431); 

                	newLeafNode(otherlv_1, grammarAccess.getStructFieldsAccess().getColonKeyword_1());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:652:1: ( ( (lv_primType_2_0= rulePrimitiveWithoutString ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=42 && LA10_0<=44)||(LA10_0>=48 && LA10_0<=55)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:652:2: ( (lv_primType_2_0= rulePrimitiveWithoutString ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:652:2: ( (lv_primType_2_0= rulePrimitiveWithoutString ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:653:1: (lv_primType_2_0= rulePrimitiveWithoutString )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:653:1: (lv_primType_2_0= rulePrimitiveWithoutString )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:654:3: lv_primType_2_0= rulePrimitiveWithoutString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructFieldsAccess().getPrimTypePrimitiveWithoutStringParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveWithoutString_in_ruleStructFields1453);
                    lv_primType_2_0=rulePrimitiveWithoutString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructFieldsRule());
                    	        }
                           		set(
                           			current, 
                           			"primType",
                            		lv_primType_2_0, 
                            		"PrimitiveWithoutString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:671:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:671:6: ( (otherlv_3= RULE_ID ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:672:1: (otherlv_3= RULE_ID )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:672:1: (otherlv_3= RULE_ID )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:673:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructFieldsRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructFields1479); 

                    		newLeafNode(otherlv_3, grammarAccess.getStructFieldsAccess().getDefTypeDefinitionCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleStructFields1492); 

                	newLeafNode(otherlv_4, grammarAccess.getStructFieldsAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructFields"


    // $ANTLR start "entryRuleTable"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:696:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:697:2: (iv_ruleTable= ruleTable EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:698:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable1528);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable1538); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:705:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleFields ) )* otherlv_5= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_fields_4_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:708:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleFields ) )* otherlv_5= '}' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:709:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleFields ) )* otherlv_5= '}' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:709:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleFields ) )* otherlv_5= '}' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:709:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleFieldAttributes ) )? otherlv_3= '{' ( (lv_fields_4_0= ruleFields ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleTable1575); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:713:1: ( (lv_name_1_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:714:1: (lv_name_1_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:714:1: (lv_name_1_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:715:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTable1592); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:731:2: ( (lv_attributes_2_0= ruleFieldAttributes ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:732:1: (lv_attributes_2_0= ruleFieldAttributes )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:732:1: (lv_attributes_2_0= ruleFieldAttributes )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:733:3: lv_attributes_2_0= ruleFieldAttributes
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getAttributesFieldAttributesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldAttributes_in_ruleTable1618);
                    lv_attributes_2_0=ruleFieldAttributes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	        }
                           		set(
                           			current, 
                           			"attributes",
                            		lv_attributes_2_0, 
                            		"FieldAttributes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleTable1631); 

                	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:753:1: ( (lv_fields_4_0= ruleFields ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=RULE_DEPRECTED_ATTRIBUTE && LA12_0<=RULE_ID_ATTRIBUTE)||(LA12_0>=RULE_REQUIRED_ATTRIBUTE && LA12_0<=RULE_KEY_ATTRIBUTE)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:754:1: (lv_fields_4_0= ruleFields )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:754:1: (lv_fields_4_0= ruleFields )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:755:3: lv_fields_4_0= ruleFields
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getFieldsFieldsParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFields_in_ruleTable1652);
            	    lv_fields_4_0=ruleFields();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_4_0, 
            	            		"Fields");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleTable1665); 

                	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleFields"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:783:1: entryRuleFields returns [EObject current=null] : iv_ruleFields= ruleFields EOF ;
    public final EObject entryRuleFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFields = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:784:2: (iv_ruleFields= ruleFields EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:785:2: iv_ruleFields= ruleFields EOF
            {
             newCompositeNode(grammarAccess.getFieldsRule()); 
            pushFollow(FOLLOW_ruleFields_in_entryRuleFields1701);
            iv_ruleFields=ruleFields();

            state._fsp--;

             current =iv_ruleFields; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFields1711); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFields"


    // $ANTLR start "ruleFields"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:792:1: ruleFields returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';' ) ;
    public final EObject ruleFields() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_defaultValue_4_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:795:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:796:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:796:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:796:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';'
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:796:2: ( (lv_name_0_0= ruleValidID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:797:1: (lv_name_0_0= ruleValidID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:797:1: (lv_name_0_0= ruleValidID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:798:3: lv_name_0_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getFieldsAccess().getNameValidIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleFields1757);
            lv_name_0_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldsRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleFields1769); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldsAccess().getColonKeyword_1());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:818:1: ( (lv_type_2_0= ruleType ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:819:1: (lv_type_2_0= ruleType )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:819:1: (lv_type_2_0= ruleType )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:820:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFieldsAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFields1790);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldsRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:836:2: (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:836:4: otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleFields1803); 

                        	newLeafNode(otherlv_3, grammarAccess.getFieldsAccess().getEqualsSignKeyword_3_0());
                        
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:840:1: ( (lv_defaultValue_4_0= ruleValue ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:841:1: (lv_defaultValue_4_0= ruleValue )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:841:1: (lv_defaultValue_4_0= ruleValue )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:842:3: lv_defaultValue_4_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldsAccess().getDefaultValueValueParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleFields1824);
                    lv_defaultValue_4_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldsRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_4_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:858:4: ( (lv_attributes_5_0= ruleFieldAttributes ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:859:1: (lv_attributes_5_0= ruleFieldAttributes )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:859:1: (lv_attributes_5_0= ruleFieldAttributes )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:860:3: lv_attributes_5_0= ruleFieldAttributes
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldsAccess().getAttributesFieldAttributesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldAttributes_in_ruleFields1847);
                    lv_attributes_5_0=ruleFieldAttributes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldsRule());
                    	        }
                           		set(
                           			current, 
                           			"attributes",
                            		lv_attributes_5_0, 
                            		"FieldAttributes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleFields1860); 

                	newLeafNode(otherlv_6, grammarAccess.getFieldsAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFields"


    // $ANTLR start "entryRuleValue"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:888:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:889:2: (iv_ruleValue= ruleValue EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:890:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1896);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1906); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:897:1: ruleValue returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_isFalse_1_0= 'false' ) ) | ( (lv_isTrue_2_0= 'true' ) ) | ( (lv_enumCase_3_0= RULE_ID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_isFalse_1_0=null;
        Token lv_isTrue_2_0=null;
        Token lv_enumCase_3_0=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:900:28: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_isFalse_1_0= 'false' ) ) | ( (lv_isTrue_2_0= 'true' ) ) | ( (lv_enumCase_3_0= RULE_ID ) ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:901:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_isFalse_1_0= 'false' ) ) | ( (lv_isTrue_2_0= 'true' ) ) | ( (lv_enumCase_3_0= RULE_ID ) ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:901:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_isFalse_1_0= 'false' ) ) | ( (lv_isTrue_2_0= 'true' ) ) | ( (lv_enumCase_3_0= RULE_ID ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            case RULE_ID:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:901:2: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:901:2: ( (lv_number_0_0= ruleNumber ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:902:1: (lv_number_0_0= ruleNumber )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:902:1: (lv_number_0_0= ruleNumber )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:903:3: lv_number_0_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getNumberNumberParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleValue1952);
                    lv_number_0_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:920:6: ( (lv_isFalse_1_0= 'false' ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:920:6: ( (lv_isFalse_1_0= 'false' ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:921:1: (lv_isFalse_1_0= 'false' )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:921:1: (lv_isFalse_1_0= 'false' )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:922:3: lv_isFalse_1_0= 'false'
                    {
                    lv_isFalse_1_0=(Token)match(input,31,FOLLOW_31_in_ruleValue1976); 

                            newLeafNode(lv_isFalse_1_0, grammarAccess.getValueAccess().getIsFalseFalseKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(current, "isFalse", true, "false");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:936:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:936:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:937:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:937:1: (lv_isTrue_2_0= 'true' )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:938:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,32,FOLLOW_32_in_ruleValue2013); 

                            newLeafNode(lv_isTrue_2_0, grammarAccess.getValueAccess().getIsTrueTrueKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(current, "isTrue", true, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:952:6: ( (lv_enumCase_3_0= RULE_ID ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:952:6: ( (lv_enumCase_3_0= RULE_ID ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:953:1: (lv_enumCase_3_0= RULE_ID )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:953:1: (lv_enumCase_3_0= RULE_ID )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:954:3: lv_enumCase_3_0= RULE_ID
                    {
                    lv_enumCase_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue2049); 

                    			newLeafNode(lv_enumCase_3_0, grammarAccess.getValueAccess().getEnumCaseIDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"enumCase",
                            		lv_enumCase_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFieldAttributes"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:978:1: entryRuleFieldAttributes returns [EObject current=null] : iv_ruleFieldAttributes= ruleFieldAttributes EOF ;
    public final EObject entryRuleFieldAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAttributes = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:979:2: (iv_ruleFieldAttributes= ruleFieldAttributes EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:980:2: iv_ruleFieldAttributes= ruleFieldAttributes EOF
            {
             newCompositeNode(grammarAccess.getFieldAttributesRule()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_entryRuleFieldAttributes2090);
            iv_ruleFieldAttributes=ruleFieldAttributes();

            state._fsp--;

             current =iv_ruleFieldAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAttributes2100); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldAttributes"


    // $ANTLR start "ruleFieldAttributes"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:987:1: ruleFieldAttributes returns [EObject current=null] : (otherlv_0= '(' ( (lv_atributeNames_1_0= ruleAttributeName ) ) (otherlv_2= ',' ( (lv_atributeNames_3_0= ruleAttributeName ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFieldAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atributeNames_1_0 = null;

        EObject lv_atributeNames_3_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:990:28: ( (otherlv_0= '(' ( (lv_atributeNames_1_0= ruleAttributeName ) ) (otherlv_2= ',' ( (lv_atributeNames_3_0= ruleAttributeName ) ) )* otherlv_4= ')' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:991:1: (otherlv_0= '(' ( (lv_atributeNames_1_0= ruleAttributeName ) ) (otherlv_2= ',' ( (lv_atributeNames_3_0= ruleAttributeName ) ) )* otherlv_4= ')' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:991:1: (otherlv_0= '(' ( (lv_atributeNames_1_0= ruleAttributeName ) ) (otherlv_2= ',' ( (lv_atributeNames_3_0= ruleAttributeName ) ) )* otherlv_4= ')' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:991:3: otherlv_0= '(' ( (lv_atributeNames_1_0= ruleAttributeName ) ) (otherlv_2= ',' ( (lv_atributeNames_3_0= ruleAttributeName ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFieldAttributes2137); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAttributesAccess().getLeftParenthesisKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:995:1: ( (lv_atributeNames_1_0= ruleAttributeName ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:996:1: (lv_atributeNames_1_0= ruleAttributeName )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:996:1: (lv_atributeNames_1_0= ruleAttributeName )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:997:3: lv_atributeNames_1_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getFieldAttributesAccess().getAtributeNamesAttributeNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleFieldAttributes2158);
            lv_atributeNames_1_0=ruleAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldAttributesRule());
            	        }
                   		add(
                   			current, 
                   			"atributeNames",
                    		lv_atributeNames_1_0, 
                    		"AttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1013:2: (otherlv_2= ',' ( (lv_atributeNames_3_0= ruleAttributeName ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1013:4: otherlv_2= ',' ( (lv_atributeNames_3_0= ruleAttributeName ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleFieldAttributes2171); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFieldAttributesAccess().getCommaKeyword_2_0());
            	        
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1017:1: ( (lv_atributeNames_3_0= ruleAttributeName ) )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1018:1: (lv_atributeNames_3_0= ruleAttributeName )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1018:1: (lv_atributeNames_3_0= ruleAttributeName )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1019:3: lv_atributeNames_3_0= ruleAttributeName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAttributesAccess().getAtributeNamesAttributeNameParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeName_in_ruleFieldAttributes2192);
            	    lv_atributeNames_3_0=ruleAttributeName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldAttributesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atributeNames",
            	            		lv_atributeNames_3_0, 
            	            		"AttributeName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleFieldAttributes2206); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldAttributesAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldAttributes"


    // $ANTLR start "entryRuleAttributeName"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1047:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1048:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1049:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName2242);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName2252); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1056:1: ruleAttributeName returns [EObject current=null] : ( ( (lv_deprectated_0_0= RULE_DEPRECTED_ATTRIBUTE ) ) | ( ( (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE ) ) otherlv_2= ':' ( (lv_attributeId_3_0= RULE_INT ) ) ) | ( (lv_required_4_0= RULE_REQUIRED_ATTRIBUTE ) ) | ( (lv_original_order_5_0= 'original_order' ) ) | ( ( (lv_hasAlignSize_6_0= 'force_align' ) ) otherlv_7= ':' ( (lv_alignSize_8_0= RULE_INT ) ) ) | ( ( (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE ) ) otherlv_10= ':' ( (lv_hashKey_11_0= RULE_STRING ) ) ) | ( (lv_bit_flags_12_0= 'bit_flags' ) ) | ( ( (lv_hasNestedTableName_13_0= 'nested_flatbuffer' ) ) otherlv_14= ':' ( (lv_nestedTableName_15_0= RULE_STRING ) ) ) | ( (lv_key_16_0= RULE_KEY_ATTRIBUTE ) ) | ( ( (otherlv_17= RULE_ID ) ) (otherlv_18= ':' ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) ) )? ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        Token lv_deprectated_0_0=null;
        Token lv_hasAttributeId_1_0=null;
        Token otherlv_2=null;
        Token lv_attributeId_3_0=null;
        Token lv_required_4_0=null;
        Token lv_original_order_5_0=null;
        Token lv_hasAlignSize_6_0=null;
        Token otherlv_7=null;
        Token lv_alignSize_8_0=null;
        Token lv_hasHash_9_0=null;
        Token otherlv_10=null;
        Token lv_hashKey_11_0=null;
        Token lv_bit_flags_12_0=null;
        Token lv_hasNestedTableName_13_0=null;
        Token otherlv_14=null;
        Token lv_nestedTableName_15_0=null;
        Token lv_key_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_intValue_19_0=null;
        Token lv_stringValue_20_0=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1059:28: ( ( ( (lv_deprectated_0_0= RULE_DEPRECTED_ATTRIBUTE ) ) | ( ( (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE ) ) otherlv_2= ':' ( (lv_attributeId_3_0= RULE_INT ) ) ) | ( (lv_required_4_0= RULE_REQUIRED_ATTRIBUTE ) ) | ( (lv_original_order_5_0= 'original_order' ) ) | ( ( (lv_hasAlignSize_6_0= 'force_align' ) ) otherlv_7= ':' ( (lv_alignSize_8_0= RULE_INT ) ) ) | ( ( (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE ) ) otherlv_10= ':' ( (lv_hashKey_11_0= RULE_STRING ) ) ) | ( (lv_bit_flags_12_0= 'bit_flags' ) ) | ( ( (lv_hasNestedTableName_13_0= 'nested_flatbuffer' ) ) otherlv_14= ':' ( (lv_nestedTableName_15_0= RULE_STRING ) ) ) | ( (lv_key_16_0= RULE_KEY_ATTRIBUTE ) ) | ( ( (otherlv_17= RULE_ID ) ) (otherlv_18= ':' ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) ) )? ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1060:1: ( ( (lv_deprectated_0_0= RULE_DEPRECTED_ATTRIBUTE ) ) | ( ( (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE ) ) otherlv_2= ':' ( (lv_attributeId_3_0= RULE_INT ) ) ) | ( (lv_required_4_0= RULE_REQUIRED_ATTRIBUTE ) ) | ( (lv_original_order_5_0= 'original_order' ) ) | ( ( (lv_hasAlignSize_6_0= 'force_align' ) ) otherlv_7= ':' ( (lv_alignSize_8_0= RULE_INT ) ) ) | ( ( (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE ) ) otherlv_10= ':' ( (lv_hashKey_11_0= RULE_STRING ) ) ) | ( (lv_bit_flags_12_0= 'bit_flags' ) ) | ( ( (lv_hasNestedTableName_13_0= 'nested_flatbuffer' ) ) otherlv_14= ':' ( (lv_nestedTableName_15_0= RULE_STRING ) ) ) | ( (lv_key_16_0= RULE_KEY_ATTRIBUTE ) ) | ( ( (otherlv_17= RULE_ID ) ) (otherlv_18= ':' ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) ) )? ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1060:1: ( ( (lv_deprectated_0_0= RULE_DEPRECTED_ATTRIBUTE ) ) | ( ( (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE ) ) otherlv_2= ':' ( (lv_attributeId_3_0= RULE_INT ) ) ) | ( (lv_required_4_0= RULE_REQUIRED_ATTRIBUTE ) ) | ( (lv_original_order_5_0= 'original_order' ) ) | ( ( (lv_hasAlignSize_6_0= 'force_align' ) ) otherlv_7= ':' ( (lv_alignSize_8_0= RULE_INT ) ) ) | ( ( (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE ) ) otherlv_10= ':' ( (lv_hashKey_11_0= RULE_STRING ) ) ) | ( (lv_bit_flags_12_0= 'bit_flags' ) ) | ( ( (lv_hasNestedTableName_13_0= 'nested_flatbuffer' ) ) otherlv_14= ':' ( (lv_nestedTableName_15_0= RULE_STRING ) ) ) | ( (lv_key_16_0= RULE_KEY_ATTRIBUTE ) ) | ( ( (otherlv_17= RULE_ID ) ) (otherlv_18= ':' ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) ) )? ) )
            int alt19=10;
            switch ( input.LA(1) ) {
            case RULE_DEPRECTED_ATTRIBUTE:
                {
                alt19=1;
                }
                break;
            case RULE_ID_ATTRIBUTE:
                {
                alt19=2;
                }
                break;
            case RULE_REQUIRED_ATTRIBUTE:
                {
                alt19=3;
                }
                break;
            case 36:
                {
                alt19=4;
                }
                break;
            case 37:
                {
                alt19=5;
                }
                break;
            case RULE_HASH_ATTRIBUTE:
                {
                alt19=6;
                }
                break;
            case 38:
                {
                alt19=7;
                }
                break;
            case 39:
                {
                alt19=8;
                }
                break;
            case RULE_KEY_ATTRIBUTE:
                {
                alt19=9;
                }
                break;
            case RULE_ID:
                {
                alt19=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1060:2: ( (lv_deprectated_0_0= RULE_DEPRECTED_ATTRIBUTE ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1060:2: ( (lv_deprectated_0_0= RULE_DEPRECTED_ATTRIBUTE ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1061:1: (lv_deprectated_0_0= RULE_DEPRECTED_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1061:1: (lv_deprectated_0_0= RULE_DEPRECTED_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1062:3: lv_deprectated_0_0= RULE_DEPRECTED_ATTRIBUTE
                    {
                    lv_deprectated_0_0=(Token)match(input,RULE_DEPRECTED_ATTRIBUTE,FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_ruleAttributeName2294); 

                    			newLeafNode(lv_deprectated_0_0, grammarAccess.getAttributeNameAccess().getDeprectatedDEPRECTED_ATTRIBUTETerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"deprectated",
                            		true, 
                            		"DEPRECTED_ATTRIBUTE");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1079:6: ( ( (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE ) ) otherlv_2= ':' ( (lv_attributeId_3_0= RULE_INT ) ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1079:6: ( ( (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE ) ) otherlv_2= ':' ( (lv_attributeId_3_0= RULE_INT ) ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1079:7: ( (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE ) ) otherlv_2= ':' ( (lv_attributeId_3_0= RULE_INT ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1079:7: ( (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1080:1: (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1080:1: (lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1081:3: lv_hasAttributeId_1_0= RULE_ID_ATTRIBUTE
                    {
                    lv_hasAttributeId_1_0=(Token)match(input,RULE_ID_ATTRIBUTE,FOLLOW_RULE_ID_ATTRIBUTE_in_ruleAttributeName2323); 

                    			newLeafNode(lv_hasAttributeId_1_0, grammarAccess.getAttributeNameAccess().getHasAttributeIdID_ATTRIBUTETerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hasAttributeId",
                            		true, 
                            		"ID_ATTRIBUTE");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleAttributeName2340); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeNameAccess().getColonKeyword_1_1());
                        
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1101:1: ( (lv_attributeId_3_0= RULE_INT ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1102:1: (lv_attributeId_3_0= RULE_INT )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1102:1: (lv_attributeId_3_0= RULE_INT )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1103:3: lv_attributeId_3_0= RULE_INT
                    {
                    lv_attributeId_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttributeName2357); 

                    			newLeafNode(lv_attributeId_3_0, grammarAccess.getAttributeNameAccess().getAttributeIdINTTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attributeId",
                            		lv_attributeId_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1120:6: ( (lv_required_4_0= RULE_REQUIRED_ATTRIBUTE ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1120:6: ( (lv_required_4_0= RULE_REQUIRED_ATTRIBUTE ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1121:1: (lv_required_4_0= RULE_REQUIRED_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1121:1: (lv_required_4_0= RULE_REQUIRED_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1122:3: lv_required_4_0= RULE_REQUIRED_ATTRIBUTE
                    {
                    lv_required_4_0=(Token)match(input,RULE_REQUIRED_ATTRIBUTE,FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_ruleAttributeName2386); 

                    			newLeafNode(lv_required_4_0, grammarAccess.getAttributeNameAccess().getRequiredREQUIRED_ATTRIBUTETerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"required",
                            		true, 
                            		"REQUIRED_ATTRIBUTE");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1139:6: ( (lv_original_order_5_0= 'original_order' ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1139:6: ( (lv_original_order_5_0= 'original_order' ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1140:1: (lv_original_order_5_0= 'original_order' )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1140:1: (lv_original_order_5_0= 'original_order' )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1141:3: lv_original_order_5_0= 'original_order'
                    {
                    lv_original_order_5_0=(Token)match(input,36,FOLLOW_36_in_ruleAttributeName2415); 

                            newLeafNode(lv_original_order_5_0, grammarAccess.getAttributeNameAccess().getOriginal_orderOriginal_orderKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(current, "original_order", true, "original_order");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1155:6: ( ( (lv_hasAlignSize_6_0= 'force_align' ) ) otherlv_7= ':' ( (lv_alignSize_8_0= RULE_INT ) ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1155:6: ( ( (lv_hasAlignSize_6_0= 'force_align' ) ) otherlv_7= ':' ( (lv_alignSize_8_0= RULE_INT ) ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1155:7: ( (lv_hasAlignSize_6_0= 'force_align' ) ) otherlv_7= ':' ( (lv_alignSize_8_0= RULE_INT ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1155:7: ( (lv_hasAlignSize_6_0= 'force_align' ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1156:1: (lv_hasAlignSize_6_0= 'force_align' )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1156:1: (lv_hasAlignSize_6_0= 'force_align' )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1157:3: lv_hasAlignSize_6_0= 'force_align'
                    {
                    lv_hasAlignSize_6_0=(Token)match(input,37,FOLLOW_37_in_ruleAttributeName2453); 

                            newLeafNode(lv_hasAlignSize_6_0, grammarAccess.getAttributeNameAccess().getHasAlignSizeForce_alignKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(current, "hasAlignSize", true, "force_align");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleAttributeName2478); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeNameAccess().getColonKeyword_4_1());
                        
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1174:1: ( (lv_alignSize_8_0= RULE_INT ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1175:1: (lv_alignSize_8_0= RULE_INT )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1175:1: (lv_alignSize_8_0= RULE_INT )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1176:3: lv_alignSize_8_0= RULE_INT
                    {
                    lv_alignSize_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttributeName2495); 

                    			newLeafNode(lv_alignSize_8_0, grammarAccess.getAttributeNameAccess().getAlignSizeINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"alignSize",
                            		lv_alignSize_8_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1193:6: ( ( (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE ) ) otherlv_10= ':' ( (lv_hashKey_11_0= RULE_STRING ) ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1193:6: ( ( (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE ) ) otherlv_10= ':' ( (lv_hashKey_11_0= RULE_STRING ) ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1193:7: ( (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE ) ) otherlv_10= ':' ( (lv_hashKey_11_0= RULE_STRING ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1193:7: ( (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1194:1: (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1194:1: (lv_hasHash_9_0= RULE_HASH_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1195:3: lv_hasHash_9_0= RULE_HASH_ATTRIBUTE
                    {
                    lv_hasHash_9_0=(Token)match(input,RULE_HASH_ATTRIBUTE,FOLLOW_RULE_HASH_ATTRIBUTE_in_ruleAttributeName2525); 

                    			newLeafNode(lv_hasHash_9_0, grammarAccess.getAttributeNameAccess().getHasHashHASH_ATTRIBUTETerminalRuleCall_5_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hasHash",
                            		true, 
                            		"HASH_ATTRIBUTE");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleAttributeName2542); 

                        	newLeafNode(otherlv_10, grammarAccess.getAttributeNameAccess().getColonKeyword_5_1());
                        
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1215:1: ( (lv_hashKey_11_0= RULE_STRING ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1216:1: (lv_hashKey_11_0= RULE_STRING )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1216:1: (lv_hashKey_11_0= RULE_STRING )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1217:3: lv_hashKey_11_0= RULE_STRING
                    {
                    lv_hashKey_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributeName2559); 

                    			newLeafNode(lv_hashKey_11_0, grammarAccess.getAttributeNameAccess().getHashKeySTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hashKey",
                            		lv_hashKey_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1234:6: ( (lv_bit_flags_12_0= 'bit_flags' ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1234:6: ( (lv_bit_flags_12_0= 'bit_flags' ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1235:1: (lv_bit_flags_12_0= 'bit_flags' )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1235:1: (lv_bit_flags_12_0= 'bit_flags' )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1236:3: lv_bit_flags_12_0= 'bit_flags'
                    {
                    lv_bit_flags_12_0=(Token)match(input,38,FOLLOW_38_in_ruleAttributeName2589); 

                            newLeafNode(lv_bit_flags_12_0, grammarAccess.getAttributeNameAccess().getBit_flagsBit_flagsKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(current, "bit_flags", true, "bit_flags");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1250:6: ( ( (lv_hasNestedTableName_13_0= 'nested_flatbuffer' ) ) otherlv_14= ':' ( (lv_nestedTableName_15_0= RULE_STRING ) ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1250:6: ( ( (lv_hasNestedTableName_13_0= 'nested_flatbuffer' ) ) otherlv_14= ':' ( (lv_nestedTableName_15_0= RULE_STRING ) ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1250:7: ( (lv_hasNestedTableName_13_0= 'nested_flatbuffer' ) ) otherlv_14= ':' ( (lv_nestedTableName_15_0= RULE_STRING ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1250:7: ( (lv_hasNestedTableName_13_0= 'nested_flatbuffer' ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1251:1: (lv_hasNestedTableName_13_0= 'nested_flatbuffer' )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1251:1: (lv_hasNestedTableName_13_0= 'nested_flatbuffer' )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1252:3: lv_hasNestedTableName_13_0= 'nested_flatbuffer'
                    {
                    lv_hasNestedTableName_13_0=(Token)match(input,39,FOLLOW_39_in_ruleAttributeName2627); 

                            newLeafNode(lv_hasNestedTableName_13_0, grammarAccess.getAttributeNameAccess().getHasNestedTableNameNested_flatbufferKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(current, "hasNestedTableName", true, "nested_flatbuffer");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleAttributeName2652); 

                        	newLeafNode(otherlv_14, grammarAccess.getAttributeNameAccess().getColonKeyword_7_1());
                        
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1269:1: ( (lv_nestedTableName_15_0= RULE_STRING ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1270:1: (lv_nestedTableName_15_0= RULE_STRING )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1270:1: (lv_nestedTableName_15_0= RULE_STRING )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1271:3: lv_nestedTableName_15_0= RULE_STRING
                    {
                    lv_nestedTableName_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributeName2669); 

                    			newLeafNode(lv_nestedTableName_15_0, grammarAccess.getAttributeNameAccess().getNestedTableNameSTRINGTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nestedTableName",
                            		lv_nestedTableName_15_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1288:6: ( (lv_key_16_0= RULE_KEY_ATTRIBUTE ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1288:6: ( (lv_key_16_0= RULE_KEY_ATTRIBUTE ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1289:1: (lv_key_16_0= RULE_KEY_ATTRIBUTE )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1289:1: (lv_key_16_0= RULE_KEY_ATTRIBUTE )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1290:3: lv_key_16_0= RULE_KEY_ATTRIBUTE
                    {
                    lv_key_16_0=(Token)match(input,RULE_KEY_ATTRIBUTE,FOLLOW_RULE_KEY_ATTRIBUTE_in_ruleAttributeName2698); 

                    			newLeafNode(lv_key_16_0, grammarAccess.getAttributeNameAccess().getKeyKEY_ATTRIBUTETerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"key",
                            		true, 
                            		"KEY_ATTRIBUTE");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1307:6: ( ( (otherlv_17= RULE_ID ) ) (otherlv_18= ':' ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) ) )? )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1307:6: ( ( (otherlv_17= RULE_ID ) ) (otherlv_18= ':' ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) ) )? )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1307:7: ( (otherlv_17= RULE_ID ) ) (otherlv_18= ':' ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) ) )?
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1307:7: ( (otherlv_17= RULE_ID ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1308:1: (otherlv_17= RULE_ID )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1308:1: (otherlv_17= RULE_ID )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1309:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeName2730); 

                    		newLeafNode(otherlv_17, grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesCrossReference_9_0_0()); 
                    	

                    }


                    }

                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1320:2: (otherlv_18= ':' ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==28) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1320:4: otherlv_18= ':' ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) )
                            {
                            otherlv_18=(Token)match(input,28,FOLLOW_28_in_ruleAttributeName2743); 

                                	newLeafNode(otherlv_18, grammarAccess.getAttributeNameAccess().getColonKeyword_9_1_0());
                                
                            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1324:1: ( ( (lv_intValue_19_0= RULE_INT ) ) | ( (lv_stringValue_20_0= RULE_STRING ) ) )
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==RULE_INT) ) {
                                alt17=1;
                            }
                            else if ( (LA17_0==RULE_STRING) ) {
                                alt17=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 0, input);

                                throw nvae;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1324:2: ( (lv_intValue_19_0= RULE_INT ) )
                                    {
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1324:2: ( (lv_intValue_19_0= RULE_INT ) )
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1325:1: (lv_intValue_19_0= RULE_INT )
                                    {
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1325:1: (lv_intValue_19_0= RULE_INT )
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1326:3: lv_intValue_19_0= RULE_INT
                                    {
                                    lv_intValue_19_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttributeName2761); 

                                    			newLeafNode(lv_intValue_19_0, grammarAccess.getAttributeNameAccess().getIntValueINTTerminalRuleCall_9_1_1_0_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"intValue",
                                            		lv_intValue_19_0, 
                                            		"INT");
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1343:6: ( (lv_stringValue_20_0= RULE_STRING ) )
                                    {
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1343:6: ( (lv_stringValue_20_0= RULE_STRING ) )
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1344:1: (lv_stringValue_20_0= RULE_STRING )
                                    {
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1344:1: (lv_stringValue_20_0= RULE_STRING )
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1345:3: lv_stringValue_20_0= RULE_STRING
                                    {
                                    lv_stringValue_20_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributeName2789); 

                                    			newLeafNode(lv_stringValue_20_0, grammarAccess.getAttributeNameAccess().getStringValueSTRINGTerminalRuleCall_9_1_1_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"stringValue",
                                            		lv_stringValue_20_0, 
                                            		"STRING");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleType"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1369:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1370:2: (iv_ruleType= ruleType EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1371:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2834);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2844); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1378:1: ruleType returns [EObject current=null] : ( ( (lv_primType_0_0= rulePrimitive ) ) | ( (lv_vectorType_1_0= ruleVector ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_primType_0_0 = null;

        EObject lv_vectorType_1_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1381:28: ( ( ( (lv_primType_0_0= rulePrimitive ) ) | ( (lv_vectorType_1_0= ruleVector ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1382:1: ( ( (lv_primType_0_0= rulePrimitive ) ) | ( (lv_vectorType_1_0= ruleVector ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1382:1: ( ( (lv_primType_0_0= rulePrimitive ) ) | ( (lv_vectorType_1_0= ruleVector ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1382:2: ( (lv_primType_0_0= rulePrimitive ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1382:2: ( (lv_primType_0_0= rulePrimitive ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1383:1: (lv_primType_0_0= rulePrimitive )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1383:1: (lv_primType_0_0= rulePrimitive )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1384:3: lv_primType_0_0= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getPrimTypePrimitiveParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleType2890);
                    lv_primType_0_0=rulePrimitive();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"primType",
                            		lv_primType_0_0, 
                            		"Primitive");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1401:6: ( (lv_vectorType_1_0= ruleVector ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1401:6: ( (lv_vectorType_1_0= ruleVector ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1402:1: (lv_vectorType_1_0= ruleVector )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1402:1: (lv_vectorType_1_0= ruleVector )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1403:3: lv_vectorType_1_0= ruleVector
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getVectorTypeVectorParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVector_in_ruleType2917);
                    lv_vectorType_1_0=ruleVector();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"vectorType",
                            		lv_vectorType_1_0, 
                            		"Vector");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1420:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1420:6: ( (otherlv_2= RULE_ID ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1421:1: (otherlv_2= RULE_ID )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1421:1: (otherlv_2= RULE_ID )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1422:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType2943); 

                    		newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getDefTypeDefinitionCrossReference_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVector"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1441:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1445:2: (iv_ruleVector= ruleVector EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1446:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector2985);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector2995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1456:1: ruleVector returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1460:28: ( (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1461:1: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1461:1: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1461:3: otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleVector3036); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1465:1: ( (lv_type_1_0= ruleType ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1466:1: (lv_type_1_0= ruleType )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1466:1: (lv_type_1_0= ruleType )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1467:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVector3057);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleVector3069); 

                	newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRulePrimitiveWithoutString"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1498:1: entryRulePrimitiveWithoutString returns [String current=null] : iv_rulePrimitiveWithoutString= rulePrimitiveWithoutString EOF ;
    public final String entryRulePrimitiveWithoutString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveWithoutString = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1499:2: (iv_rulePrimitiveWithoutString= rulePrimitiveWithoutString EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1500:2: iv_rulePrimitiveWithoutString= rulePrimitiveWithoutString EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveWithoutStringRule()); 
            pushFollow(FOLLOW_rulePrimitiveWithoutString_in_entryRulePrimitiveWithoutString3110);
            iv_rulePrimitiveWithoutString=rulePrimitiveWithoutString();

            state._fsp--;

             current =iv_rulePrimitiveWithoutString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveWithoutString3121); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveWithoutString"


    // $ANTLR start "rulePrimitiveWithoutString"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1507:1: rulePrimitiveWithoutString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool' | kw= 'float' | kw= 'double' | this_PrimitiveNumberType_3= rulePrimitiveNumberType ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveWithoutString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PrimitiveNumberType_3 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1510:28: ( (kw= 'bool' | kw= 'float' | kw= 'double' | this_PrimitiveNumberType_3= rulePrimitiveNumberType ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1511:1: (kw= 'bool' | kw= 'float' | kw= 'double' | this_PrimitiveNumberType_3= rulePrimitiveNumberType )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1511:1: (kw= 'bool' | kw= 'float' | kw= 'double' | this_PrimitiveNumberType_3= rulePrimitiveNumberType )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt21=1;
                }
                break;
            case 43:
                {
                alt21=2;
                }
                break;
            case 44:
                {
                alt21=3;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1512:2: kw= 'bool'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_rulePrimitiveWithoutString3159); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveWithoutStringAccess().getBoolKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1519:2: kw= 'float'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulePrimitiveWithoutString3178); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveWithoutStringAccess().getFloatKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1526:2: kw= 'double'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulePrimitiveWithoutString3197); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveWithoutStringAccess().getDoubleKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1533:5: this_PrimitiveNumberType_3= rulePrimitiveNumberType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveWithoutStringAccess().getPrimitiveNumberTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveNumberType_in_rulePrimitiveWithoutString3225);
                    this_PrimitiveNumberType_3=rulePrimitiveNumberType();

                    state._fsp--;


                    		current.merge(this_PrimitiveNumberType_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveWithoutString"


    // $ANTLR start "entryRulePrimitive"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1551:1: entryRulePrimitive returns [String current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final String entryRulePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitive = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1552:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1553:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive3271);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive3282); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1560:1: rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | this_PrimitiveWithoutString_1= rulePrimitiveWithoutString ) ;
    public final AntlrDatatypeRuleToken rulePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PrimitiveWithoutString_1 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1563:28: ( (kw= 'string' | this_PrimitiveWithoutString_1= rulePrimitiveWithoutString ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1564:1: (kw= 'string' | this_PrimitiveWithoutString_1= rulePrimitiveWithoutString )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1564:1: (kw= 'string' | this_PrimitiveWithoutString_1= rulePrimitiveWithoutString )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=42 && LA22_0<=44)||(LA22_0>=48 && LA22_0<=55)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1565:2: kw= 'string'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_rulePrimitive3320); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1572:5: this_PrimitiveWithoutString_1= rulePrimitiveWithoutString
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getPrimitiveWithoutStringParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveWithoutString_in_rulePrimitive3348);
                    this_PrimitiveWithoutString_1=rulePrimitiveWithoutString();

                    state._fsp--;


                    		current.merge(this_PrimitiveWithoutString_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleEnum"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1590:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1591:2: (iv_ruleEnum= ruleEnum EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1592:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum3393);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum3403); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1599:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveNumberType ) ) )? ( (lv_attributes_4_0= ruleFieldAttributes ) )? otherlv_5= '{' ( (lv_enumCases_6_0= ruleEnumCase ) ) (otherlv_7= ',' ( (lv_enumCases_8_0= ruleEnumCase ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_enumCases_6_0 = null;

        EObject lv_enumCases_8_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1602:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveNumberType ) ) )? ( (lv_attributes_4_0= ruleFieldAttributes ) )? otherlv_5= '{' ( (lv_enumCases_6_0= ruleEnumCase ) ) (otherlv_7= ',' ( (lv_enumCases_8_0= ruleEnumCase ) ) )* otherlv_9= '}' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1603:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveNumberType ) ) )? ( (lv_attributes_4_0= ruleFieldAttributes ) )? otherlv_5= '{' ( (lv_enumCases_6_0= ruleEnumCase ) ) (otherlv_7= ',' ( (lv_enumCases_8_0= ruleEnumCase ) ) )* otherlv_9= '}' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1603:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveNumberType ) ) )? ( (lv_attributes_4_0= ruleFieldAttributes ) )? otherlv_5= '{' ( (lv_enumCases_6_0= ruleEnumCase ) ) (otherlv_7= ',' ( (lv_enumCases_8_0= ruleEnumCase ) ) )* otherlv_9= '}' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1603:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveNumberType ) ) )? ( (lv_attributes_4_0= ruleFieldAttributes ) )? otherlv_5= '{' ( (lv_enumCases_6_0= ruleEnumCase ) ) (otherlv_7= ',' ( (lv_enumCases_8_0= ruleEnumCase ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleEnum3440); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1607:1: ( (lv_name_1_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1608:1: (lv_name_1_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1608:1: (lv_name_1_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1609:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum3457); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1625:2: (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveNumberType ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1625:4: otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveNumberType ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEnum3475); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getColonKeyword_2_0());
                        
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1629:1: ( (lv_type_3_0= rulePrimitiveNumberType ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1630:1: (lv_type_3_0= rulePrimitiveNumberType )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1630:1: (lv_type_3_0= rulePrimitiveNumberType )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1631:3: lv_type_3_0= rulePrimitiveNumberType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumAccess().getTypePrimitiveNumberTypeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveNumberType_in_ruleEnum3496);
                    lv_type_3_0=rulePrimitiveNumberType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"PrimitiveNumberType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1647:4: ( (lv_attributes_4_0= ruleFieldAttributes ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1648:1: (lv_attributes_4_0= ruleFieldAttributes )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1648:1: (lv_attributes_4_0= ruleFieldAttributes )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1649:3: lv_attributes_4_0= ruleFieldAttributes
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumAccess().getAttributesFieldAttributesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldAttributes_in_ruleEnum3519);
                    lv_attributes_4_0=ruleFieldAttributes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"attributes",
                            		lv_attributes_4_0, 
                            		"FieldAttributes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEnum3532); 

                	newLeafNode(otherlv_5, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_4());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1669:1: ( (lv_enumCases_6_0= ruleEnumCase ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1670:1: (lv_enumCases_6_0= ruleEnumCase )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1670:1: (lv_enumCases_6_0= ruleEnumCase )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1671:3: lv_enumCases_6_0= ruleEnumCase
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getEnumCasesEnumCaseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumCase_in_ruleEnum3553);
            lv_enumCases_6_0=ruleEnumCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	        }
                   		add(
                   			current, 
                   			"enumCases",
                    		lv_enumCases_6_0, 
                    		"EnumCase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1687:2: (otherlv_7= ',' ( (lv_enumCases_8_0= ruleEnumCase ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1687:4: otherlv_7= ',' ( (lv_enumCases_8_0= ruleEnumCase ) )
            	    {
            	    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleEnum3566); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEnumAccess().getCommaKeyword_6_0());
            	        
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1691:1: ( (lv_enumCases_8_0= ruleEnumCase ) )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1692:1: (lv_enumCases_8_0= ruleEnumCase )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1692:1: (lv_enumCases_8_0= ruleEnumCase )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1693:3: lv_enumCases_8_0= ruleEnumCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getEnumCasesEnumCaseParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumCase_in_ruleEnum3587);
            	    lv_enumCases_8_0=ruleEnumCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enumCases",
            	            		lv_enumCases_8_0, 
            	            		"EnumCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleEnum3601); 

                	newLeafNode(otherlv_9, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumCase"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1721:1: entryRuleEnumCase returns [EObject current=null] : iv_ruleEnumCase= ruleEnumCase EOF ;
    public final EObject entryRuleEnumCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumCase = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1722:2: (iv_ruleEnumCase= ruleEnumCase EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1723:2: iv_ruleEnumCase= ruleEnumCase EOF
            {
             newCompositeNode(grammarAccess.getEnumCaseRule()); 
            pushFollow(FOLLOW_ruleEnumCase_in_entryRuleEnumCase3637);
            iv_ruleEnumCase=ruleEnumCase();

            state._fsp--;

             current =iv_ruleEnumCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumCase3647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumCase"


    // $ANTLR start "ruleEnumCase"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1730:1: ruleEnumCase returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleEnumCase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1733:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1734:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1734:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1734:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )?
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1734:2: ( (lv_name_0_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1735:1: (lv_name_0_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1735:1: (lv_name_0_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1736:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumCase3689); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumCaseAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1752:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1752:4: otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleEnumCase3707); 

                        	newLeafNode(otherlv_1, grammarAccess.getEnumCaseAccess().getEqualsSignKeyword_1_0());
                        
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1756:1: ( (lv_value_2_0= RULE_INT ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1757:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1757:1: (lv_value_2_0= RULE_INT )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1758:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumCase3724); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getEnumCaseAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumCaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumCase"


    // $ANTLR start "entryRuleUnion"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1782:1: entryRuleUnion returns [EObject current=null] : iv_ruleUnion= ruleUnion EOF ;
    public final EObject entryRuleUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnion = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1783:2: (iv_ruleUnion= ruleUnion EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1784:2: iv_ruleUnion= ruleUnion EOF
            {
             newCompositeNode(grammarAccess.getUnionRule()); 
            pushFollow(FOLLOW_ruleUnion_in_entryRuleUnion3767);
            iv_ruleUnion=ruleUnion();

            state._fsp--;

             current =iv_ruleUnion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnion3777); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnion"


    // $ANTLR start "ruleUnion"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1791:1: ruleUnion returns [EObject current=null] : (otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1794:28: ( (otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1795:1: (otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1795:1: (otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1795:3: otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleUnion3814); 

                	newLeafNode(otherlv_0, grammarAccess.getUnionAccess().getUnionKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1799:1: ( (lv_name_1_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1800:1: (lv_name_1_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1800:1: (lv_name_1_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1801:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnion3831); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUnionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleUnion3848); 

                	newLeafNode(otherlv_2, grammarAccess.getUnionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1821:1: ( (otherlv_3= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1822:1: (otherlv_3= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1822:1: (otherlv_3= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1823:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUnionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnion3868); 

            		newLeafNode(otherlv_3, grammarAccess.getUnionAccess().getUnionCasesTableCrossReference_3_0()); 
            	

            }


            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1834:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==34) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1834:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleUnion3881); 

            	        	newLeafNode(otherlv_4, grammarAccess.getUnionAccess().getCommaKeyword_4_0());
            	        
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1838:1: ( (otherlv_5= RULE_ID ) )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1839:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1839:1: (otherlv_5= RULE_ID )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1840:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnionRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnion3901); 

            	    		newLeafNode(otherlv_5, grammarAccess.getUnionAccess().getUnionCasesTableCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleUnion3915); 

                	newLeafNode(otherlv_6, grammarAccess.getUnionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnion"


    // $ANTLR start "entryRulePrimitiveNumberType"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1863:1: entryRulePrimitiveNumberType returns [String current=null] : iv_rulePrimitiveNumberType= rulePrimitiveNumberType EOF ;
    public final String entryRulePrimitiveNumberType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveNumberType = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1864:2: (iv_rulePrimitiveNumberType= rulePrimitiveNumberType EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1865:2: iv_rulePrimitiveNumberType= rulePrimitiveNumberType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveNumberTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveNumberType_in_entryRulePrimitiveNumberType3952);
            iv_rulePrimitiveNumberType=rulePrimitiveNumberType();

            state._fsp--;

             current =iv_rulePrimitiveNumberType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveNumberType3963); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveNumberType"


    // $ANTLR start "rulePrimitiveNumberType"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1872:1: rulePrimitiveNumberType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'byte' | kw= 'ubyte' | kw= 'short' | kw= 'ushort' | kw= 'int' | kw= 'uint' | kw= 'long' | kw= 'ulong' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveNumberType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1875:28: ( (kw= 'byte' | kw= 'ubyte' | kw= 'short' | kw= 'ushort' | kw= 'int' | kw= 'uint' | kw= 'long' | kw= 'ulong' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1876:1: (kw= 'byte' | kw= 'ubyte' | kw= 'short' | kw= 'ushort' | kw= 'int' | kw= 'uint' | kw= 'long' | kw= 'ulong' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1876:1: (kw= 'byte' | kw= 'ubyte' | kw= 'short' | kw= 'ushort' | kw= 'int' | kw= 'uint' | kw= 'long' | kw= 'ulong' )
            int alt28=8;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt28=1;
                }
                break;
            case 49:
                {
                alt28=2;
                }
                break;
            case 50:
                {
                alt28=3;
                }
                break;
            case 51:
                {
                alt28=4;
                }
                break;
            case 52:
                {
                alt28=5;
                }
                break;
            case 53:
                {
                alt28=6;
                }
                break;
            case 54:
                {
                alt28=7;
                }
                break;
            case 55:
                {
                alt28=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1877:2: kw= 'byte'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_rulePrimitiveNumberType4001); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveNumberTypeAccess().getByteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1884:2: kw= 'ubyte'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_rulePrimitiveNumberType4020); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveNumberTypeAccess().getUbyteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1891:2: kw= 'short'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_rulePrimitiveNumberType4039); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveNumberTypeAccess().getShortKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1898:2: kw= 'ushort'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_rulePrimitiveNumberType4058); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveNumberTypeAccess().getUshortKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1905:2: kw= 'int'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_rulePrimitiveNumberType4077); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveNumberTypeAccess().getIntKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1912:2: kw= 'uint'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_rulePrimitiveNumberType4096); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveNumberTypeAccess().getUintKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1919:2: kw= 'long'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_rulePrimitiveNumberType4115); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveNumberTypeAccess().getLongKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1926:2: kw= 'ulong'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_rulePrimitiveNumberType4134); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveNumberTypeAccess().getUlongKeyword_7()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveNumberType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1939:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1940:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1941:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4175);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4186); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1948:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1951:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1952:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1952:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1953:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName4233);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1963:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1964:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_ruleQualifiedName4252); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName4274);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1988:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1989:2: (iv_ruleValidID= ruleValidID EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1990:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID4322);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID4333); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1997:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HASH_ATTRIBUTE_0= RULE_HASH_ATTRIBUTE | this_ID_ATTRIBUTE_1= RULE_ID_ATTRIBUTE | this_REQUIRED_ATTRIBUTE_2= RULE_REQUIRED_ATTRIBUTE | this_KEY_ATTRIBUTE_3= RULE_KEY_ATTRIBUTE | this_DEPRECTED_ATTRIBUTE_4= RULE_DEPRECTED_ATTRIBUTE | this_ID_5= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASH_ATTRIBUTE_0=null;
        Token this_ID_ATTRIBUTE_1=null;
        Token this_REQUIRED_ATTRIBUTE_2=null;
        Token this_KEY_ATTRIBUTE_3=null;
        Token this_DEPRECTED_ATTRIBUTE_4=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2000:28: ( (this_HASH_ATTRIBUTE_0= RULE_HASH_ATTRIBUTE | this_ID_ATTRIBUTE_1= RULE_ID_ATTRIBUTE | this_REQUIRED_ATTRIBUTE_2= RULE_REQUIRED_ATTRIBUTE | this_KEY_ATTRIBUTE_3= RULE_KEY_ATTRIBUTE | this_DEPRECTED_ATTRIBUTE_4= RULE_DEPRECTED_ATTRIBUTE | this_ID_5= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2001:1: (this_HASH_ATTRIBUTE_0= RULE_HASH_ATTRIBUTE | this_ID_ATTRIBUTE_1= RULE_ID_ATTRIBUTE | this_REQUIRED_ATTRIBUTE_2= RULE_REQUIRED_ATTRIBUTE | this_KEY_ATTRIBUTE_3= RULE_KEY_ATTRIBUTE | this_DEPRECTED_ATTRIBUTE_4= RULE_DEPRECTED_ATTRIBUTE | this_ID_5= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2001:1: (this_HASH_ATTRIBUTE_0= RULE_HASH_ATTRIBUTE | this_ID_ATTRIBUTE_1= RULE_ID_ATTRIBUTE | this_REQUIRED_ATTRIBUTE_2= RULE_REQUIRED_ATTRIBUTE | this_KEY_ATTRIBUTE_3= RULE_KEY_ATTRIBUTE | this_DEPRECTED_ATTRIBUTE_4= RULE_DEPRECTED_ATTRIBUTE | this_ID_5= RULE_ID )
            int alt30=6;
            switch ( input.LA(1) ) {
            case RULE_HASH_ATTRIBUTE:
                {
                alt30=1;
                }
                break;
            case RULE_ID_ATTRIBUTE:
                {
                alt30=2;
                }
                break;
            case RULE_REQUIRED_ATTRIBUTE:
                {
                alt30=3;
                }
                break;
            case RULE_KEY_ATTRIBUTE:
                {
                alt30=4;
                }
                break;
            case RULE_DEPRECTED_ATTRIBUTE:
                {
                alt30=5;
                }
                break;
            case RULE_ID:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2001:6: this_HASH_ATTRIBUTE_0= RULE_HASH_ATTRIBUTE
                    {
                    this_HASH_ATTRIBUTE_0=(Token)match(input,RULE_HASH_ATTRIBUTE,FOLLOW_RULE_HASH_ATTRIBUTE_in_ruleValidID4373); 

                    		current.merge(this_HASH_ATTRIBUTE_0);
                        
                     
                        newLeafNode(this_HASH_ATTRIBUTE_0, grammarAccess.getValidIDAccess().getHASH_ATTRIBUTETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2009:10: this_ID_ATTRIBUTE_1= RULE_ID_ATTRIBUTE
                    {
                    this_ID_ATTRIBUTE_1=(Token)match(input,RULE_ID_ATTRIBUTE,FOLLOW_RULE_ID_ATTRIBUTE_in_ruleValidID4399); 

                    		current.merge(this_ID_ATTRIBUTE_1);
                        
                     
                        newLeafNode(this_ID_ATTRIBUTE_1, grammarAccess.getValidIDAccess().getID_ATTRIBUTETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2017:10: this_REQUIRED_ATTRIBUTE_2= RULE_REQUIRED_ATTRIBUTE
                    {
                    this_REQUIRED_ATTRIBUTE_2=(Token)match(input,RULE_REQUIRED_ATTRIBUTE,FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_ruleValidID4425); 

                    		current.merge(this_REQUIRED_ATTRIBUTE_2);
                        
                     
                        newLeafNode(this_REQUIRED_ATTRIBUTE_2, grammarAccess.getValidIDAccess().getREQUIRED_ATTRIBUTETerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2025:10: this_KEY_ATTRIBUTE_3= RULE_KEY_ATTRIBUTE
                    {
                    this_KEY_ATTRIBUTE_3=(Token)match(input,RULE_KEY_ATTRIBUTE,FOLLOW_RULE_KEY_ATTRIBUTE_in_ruleValidID4451); 

                    		current.merge(this_KEY_ATTRIBUTE_3);
                        
                     
                        newLeafNode(this_KEY_ATTRIBUTE_3, grammarAccess.getValidIDAccess().getKEY_ATTRIBUTETerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2033:10: this_DEPRECTED_ATTRIBUTE_4= RULE_DEPRECTED_ATTRIBUTE
                    {
                    this_DEPRECTED_ATTRIBUTE_4=(Token)match(input,RULE_DEPRECTED_ATTRIBUTE,FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_ruleValidID4477); 

                    		current.merge(this_DEPRECTED_ATTRIBUTE_4);
                        
                     
                        newLeafNode(this_DEPRECTED_ATTRIBUTE_4, grammarAccess.getValidIDAccess().getDEPRECTED_ATTRIBUTETerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2041:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID4503); 

                    		current.merge(this_ID_5);
                        
                     
                        newLeafNode(this_ID_5, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleNumber"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2056:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2060:2: (iv_ruleNumber= ruleNumber EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2061:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber4555);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber4566); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2071:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2075:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2076:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2076:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_HEX) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_INT||LA34_0==RULE_DECIMAL) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2076:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber4610); 

                    		current.merge(this_HEX_0);
                        
                     
                        newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2084:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2084:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2084:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2084:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_INT) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==RULE_DECIMAL) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2084:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber4638); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2092:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber4664); 

                            		current.merge(this_DECIMAL_2);
                                
                             
                                newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }

                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2099:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==56) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2100:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,56,FOLLOW_56_in_ruleNumber4684); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                
                            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2105:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==RULE_INT) ) {
                                alt32=1;
                            }
                            else if ( (LA32_0==RULE_DECIMAL) ) {
                                alt32=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 0, input);

                                throw nvae;
                            }
                            switch (alt32) {
                                case 1 :
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2105:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber4700); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:2113:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber4726); 

                                    		current.merge(this_DECIMAL_5);
                                        
                                     
                                        newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSchema_in_entryRuleSchema75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchema85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleSchema131 = new BitSet(new long[]{0x0000C00023F40000L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleSchema153 = new BitSet(new long[]{0x0000C00022F40000L});
    public static final BitSet FOLLOW_ruleFileIdentifier_in_ruleSchema175 = new BitSet(new long[]{0x0000C00022F40000L});
    public static final BitSet FOLLOW_ruleFileExtension_in_ruleSchema197 = new BitSet(new long[]{0x0000C00022F40000L});
    public static final BitSet FOLLOW_ruleCustomAttributes_in_ruleSchema219 = new BitSet(new long[]{0x0000C00022F40000L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleSchema241 = new BitSet(new long[]{0x0000C00022F40000L});
    public static final BitSet FOLLOW_ruleRootType_in_ruleSchema263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootType_in_entryRuleRootType299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleRootType346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRootType366 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRootType378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributes_in_entryRuleCustomAttributes414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomAttributes424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCustomAttributes461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomAttributes478 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCustomAttributes495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileIdentifier_in_entryRuleFileIdentifier532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileIdentifier543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFileIdentifier581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFileIdentifier596 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFileIdentifier614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileExtension_in_entryRuleFileExtension655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileExtension666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFileExtension704 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFileExtension719 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFileExtension737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNamespace824 = new BitSet(new long[]{0x0000000000000ED0L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNamespace845 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNamespace857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInclude943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude958 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInclude976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_ruleDefinition1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_in_ruleDefinition1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleDefinition1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnion_in_ruleDefinition1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_in_entryRuleStruct1189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStruct1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStruct1236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStruct1253 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_ruleStruct1279 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStruct1292 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleStructFields_in_ruleStruct1313 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleStruct1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructFields_in_entryRuleStructFields1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructFields1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructFields1414 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleStructFields1431 = new BitSet(new long[]{0x00FF1C0000000010L});
    public static final BitSet FOLLOW_rulePrimitiveWithoutString_in_ruleStructFields1453 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructFields1479 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStructFields1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable1528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTable1575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTable1592 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_ruleTable1618 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTable1631 = new BitSet(new long[]{0x0000000008000ED0L});
    public static final BitSet FOLLOW_ruleFields_in_ruleTable1652 = new BitSet(new long[]{0x0000000008000ED0L});
    public static final BitSet FOLLOW_27_in_ruleTable1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFields_in_entryRuleFields1701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFields1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFields1757 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFields1769 = new BitSet(new long[]{0x00FF3D0000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFields1790 = new BitSet(new long[]{0x0000000240080000L});
    public static final BitSet FOLLOW_30_in_ruleFields1803 = new BitSet(new long[]{0x0000000180003110L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFields1824 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_ruleFields1847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFields1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleValue1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleValue1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleValue2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_entryRuleFieldAttributes2090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAttributes2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFieldAttributes2137 = new BitSet(new long[]{0x000000F000000ED0L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleFieldAttributes2158 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleFieldAttributes2171 = new BitSet(new long[]{0x000000F000000ED0L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleFieldAttributes2192 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleFieldAttributes2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_ruleAttributeName2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ATTRIBUTE_in_ruleAttributeName2323 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttributeName2340 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttributeName2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_ruleAttributeName2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttributeName2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAttributeName2453 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttributeName2478 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttributeName2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_ATTRIBUTE_in_ruleAttributeName2525 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttributeName2542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeName2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAttributeName2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAttributeName2627 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttributeName2652 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeName2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEY_ATTRIBUTE_in_ruleAttributeName2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeName2730 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAttributeName2743 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttributeName2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeName2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleType2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_ruleType2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector2985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVector3036 = new BitSet(new long[]{0x00FF3D0000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVector3057 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleVector3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveWithoutString_in_entryRulePrimitiveWithoutString3110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveWithoutString3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrimitiveWithoutString3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrimitiveWithoutString3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePrimitiveWithoutString3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveNumberType_in_rulePrimitiveWithoutString3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive3271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePrimitive3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveWithoutString_in_rulePrimitive3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEnum3440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum3457 = new BitSet(new long[]{0x0000000214000000L});
    public static final BitSet FOLLOW_28_in_ruleEnum3475 = new BitSet(new long[]{0x00FF1C0000000000L});
    public static final BitSet FOLLOW_rulePrimitiveNumberType_in_ruleEnum3496 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_ruleEnum3519 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEnum3532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumCase_in_ruleEnum3553 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_34_in_ruleEnum3566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumCase_in_ruleEnum3587 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_27_in_ruleEnum3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumCase_in_entryRuleEnumCase3637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumCase3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumCase3689 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleEnumCase3707 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumCase3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnion_in_entryRuleUnion3767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnion3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleUnion3814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnion3831 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUnion3848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnion3868 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_34_in_ruleUnion3881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnion3901 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_27_in_ruleUnion3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveNumberType_in_entryRulePrimitiveNumberType3952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveNumberType3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePrimitiveNumberType4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePrimitiveNumberType4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePrimitiveNumberType4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePrimitiveNumberType4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePrimitiveNumberType4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePrimitiveNumberType4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePrimitiveNumberType4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePrimitiveNumberType4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName4233 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleQualifiedName4252 = new BitSet(new long[]{0x0000000000000ED0L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName4274 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID4322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_ATTRIBUTE_in_ruleValidID4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ATTRIBUTE_in_ruleValidID4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REQUIRED_ATTRIBUTE_in_ruleValidID4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEY_ATTRIBUTE_in_ruleValidID4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEPRECTED_ATTRIBUTE_in_ruleValidID4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber4555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber4638 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber4664 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNumber4684 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber4726 = new BitSet(new long[]{0x0000000000000002L});

}