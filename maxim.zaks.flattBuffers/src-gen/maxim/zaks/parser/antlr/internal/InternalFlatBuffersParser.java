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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'root_type'", "';'", "'attribute'", "'\"'", "'file_identifier'", "'namespace'", "'include'", "'table'", "'{'", "'}'", "':'", "'='", "'false'", "'true'", "'('", "')'", "'deprecated'", "'['", "']'", "'bool'", "'byte'", "'ubyte'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'long'", "'ulong'", "'double'", "'string'", "'.'"
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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:76:1: ruleSchema returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_customAttributes_3_0= ruleCustomAttributes ) )* ( (lv_tables_4_0= ruleTable ) )* ( (lv_rootType_5_0= ruleRootType ) ) ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_includes_0_0 = null;

        EObject lv_namepsace_1_0 = null;

        AntlrDatatypeRuleToken lv_fileIdentifier_2_0 = null;

        EObject lv_customAttributes_3_0 = null;

        EObject lv_tables_4_0 = null;

        EObject lv_rootType_5_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:79:28: ( ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_customAttributes_3_0= ruleCustomAttributes ) )* ( (lv_tables_4_0= ruleTable ) )* ( (lv_rootType_5_0= ruleRootType ) ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:80:1: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_customAttributes_3_0= ruleCustomAttributes ) )* ( (lv_tables_4_0= ruleTable ) )* ( (lv_rootType_5_0= ruleRootType ) ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:80:1: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_customAttributes_3_0= ruleCustomAttributes ) )* ( (lv_tables_4_0= ruleTable ) )* ( (lv_rootType_5_0= ruleRootType ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:80:2: ( (lv_includes_0_0= ruleInclude ) )* ( (lv_namepsace_1_0= ruleNamespace ) )? ( (lv_fileIdentifier_2_0= ruleFileIdentifier ) )? ( (lv_customAttributes_3_0= ruleCustomAttributes ) )* ( (lv_tables_4_0= ruleTable ) )* ( (lv_rootType_5_0= ruleRootType ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:80:2: ( (lv_includes_0_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
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

            if ( (LA2_0==16) ) {
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

            if ( (LA3_0==15) ) {
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

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:134:3: ( (lv_customAttributes_3_0= ruleCustomAttributes ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:135:1: (lv_customAttributes_3_0= ruleCustomAttributes )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:135:1: (lv_customAttributes_3_0= ruleCustomAttributes )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:136:3: lv_customAttributes_3_0= ruleCustomAttributes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSchemaAccess().getCustomAttributesCustomAttributesParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomAttributes_in_ruleSchema197);
            	    lv_customAttributes_3_0=ruleCustomAttributes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"customAttributes",
            	            		lv_customAttributes_3_0, 
            	            		"CustomAttributes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:152:3: ( (lv_tables_4_0= ruleTable ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:153:1: (lv_tables_4_0= ruleTable )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:153:1: (lv_tables_4_0= ruleTable )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:154:3: lv_tables_4_0= ruleTable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSchemaAccess().getTablesTableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTable_in_ruleSchema219);
            	    lv_tables_4_0=ruleTable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tables",
            	            		lv_tables_4_0, 
            	            		"Table");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:170:3: ( (lv_rootType_5_0= ruleRootType ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:171:1: (lv_rootType_5_0= ruleRootType )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:171:1: (lv_rootType_5_0= ruleRootType )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:172:3: lv_rootType_5_0= ruleRootType
            {
             
            	        newCompositeNode(grammarAccess.getSchemaAccess().getRootTypeRootTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRootType_in_ruleSchema241);
            lv_rootType_5_0=ruleRootType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSchemaRule());
            	        }
                   		set(
                   			current, 
                   			"rootType",
                    		lv_rootType_5_0, 
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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:196:1: entryRuleRootType returns [EObject current=null] : iv_ruleRootType= ruleRootType EOF ;
    public final EObject entryRuleRootType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootType = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:197:2: (iv_ruleRootType= ruleRootType EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:198:2: iv_ruleRootType= ruleRootType EOF
            {
             newCompositeNode(grammarAccess.getRootTypeRule()); 
            pushFollow(FOLLOW_ruleRootType_in_entryRuleRootType277);
            iv_ruleRootType=ruleRootType();

            state._fsp--;

             current =iv_ruleRootType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootType287); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:205:1: ruleRootType returns [EObject current=null] : (otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleRootType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:208:28: ( (otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:209:1: (otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:209:1: (otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:209:3: otherlv_0= 'root_type' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRootType324); 

                	newLeafNode(otherlv_0, grammarAccess.getRootTypeAccess().getRoot_typeKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:213:1: ( (otherlv_1= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:214:1: (otherlv_1= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:214:1: (otherlv_1= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:215:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRootTypeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRootType344); 

            		newLeafNode(otherlv_1, grammarAccess.getRootTypeAccess().getTypeTableCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRootType356); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:238:1: entryRuleCustomAttributes returns [EObject current=null] : iv_ruleCustomAttributes= ruleCustomAttributes EOF ;
    public final EObject entryRuleCustomAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomAttributes = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:239:2: (iv_ruleCustomAttributes= ruleCustomAttributes EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:240:2: iv_ruleCustomAttributes= ruleCustomAttributes EOF
            {
             newCompositeNode(grammarAccess.getCustomAttributesRule()); 
            pushFollow(FOLLOW_ruleCustomAttributes_in_entryRuleCustomAttributes392);
            iv_ruleCustomAttributes=ruleCustomAttributes();

            state._fsp--;

             current =iv_ruleCustomAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomAttributes402); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:247:1: ruleCustomAttributes returns [EObject current=null] : (otherlv_0= 'attribute' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= ';' ) ;
    public final EObject ruleCustomAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:250:28: ( (otherlv_0= 'attribute' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:251:1: (otherlv_0= 'attribute' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:251:1: (otherlv_0= 'attribute' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:251:3: otherlv_0= 'attribute' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleCustomAttributes439); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomAttributesAccess().getAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCustomAttributes451); 

                	newLeafNode(otherlv_1, grammarAccess.getCustomAttributesAccess().getQuotationMarkKeyword_1());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:259:1: ( (lv_name_2_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:260:1: (lv_name_2_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:260:1: (lv_name_2_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:261:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomAttributes468); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCustomAttributesAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomAttributesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleCustomAttributes485); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomAttributesAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleCustomAttributes497); 

                	newLeafNode(otherlv_4, grammarAccess.getCustomAttributesAccess().getSemicolonKeyword_4());
                

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:293:1: entryRuleFileIdentifier returns [String current=null] : iv_ruleFileIdentifier= ruleFileIdentifier EOF ;
    public final String entryRuleFileIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileIdentifier = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:294:2: (iv_ruleFileIdentifier= ruleFileIdentifier EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:295:2: iv_ruleFileIdentifier= ruleFileIdentifier EOF
            {
             newCompositeNode(grammarAccess.getFileIdentifierRule()); 
            pushFollow(FOLLOW_ruleFileIdentifier_in_entryRuleFileIdentifier534);
            iv_ruleFileIdentifier=ruleFileIdentifier();

            state._fsp--;

             current =iv_ruleFileIdentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileIdentifier545); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:302:1: ruleFileIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleFileIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:305:28: ( (kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:306:1: (kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:306:1: (kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:307:2: kw= 'file_identifier' this_STRING_1= RULE_STRING kw= ';'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleFileIdentifier583); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFileIdentifierAccess().getFile_identifierKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFileIdentifier598); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getFileIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleFileIdentifier616); 

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


    // $ANTLR start "entryRuleNamespace"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:333:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:334:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:335:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace656);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace666); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:342:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:345:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:346:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:346:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:346:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleNamespace703); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:350:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:351:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:351:1: (lv_name_1_0= ruleQualifiedName )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:352:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNamespace724);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNamespace736); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:380:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:381:2: (iv_ruleInclude= ruleInclude EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:382:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude773);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude784); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:389:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'include' this_STRING_1= RULE_STRING kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:392:28: ( (kw= 'include' this_STRING_1= RULE_STRING kw= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:393:1: (kw= 'include' this_STRING_1= RULE_STRING kw= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:393:1: (kw= 'include' this_STRING_1= RULE_STRING kw= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:394:2: kw= 'include' this_STRING_1= RULE_STRING kw= ';'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleInclude822); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude837); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getIncludeAccess().getSTRINGTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleInclude855); 

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


    // $ANTLR start "entryRuleTable"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:420:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:421:2: (iv_ruleTable= ruleTable EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:422:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable895);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable905); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:429:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFields ) )* otherlv_4= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:432:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFields ) )* otherlv_4= '}' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:433:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFields ) )* otherlv_4= '}' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:433:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFields ) )* otherlv_4= '}' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:433:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFields ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTable942); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:437:1: ( (lv_name_1_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:438:1: (lv_name_1_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:438:1: (lv_name_1_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:439:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTable959); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTable976); 

                	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:459:1: ( (lv_fields_3_0= ruleFields ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:460:1: (lv_fields_3_0= ruleFields )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:460:1: (lv_fields_3_0= ruleFields )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:461:3: lv_fields_3_0= ruleFields
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getFieldsFieldsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFields_in_ruleTable997);
            	    lv_fields_3_0=ruleFields();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_3_0, 
            	            		"Fields");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTable1010); 

                	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:489:1: entryRuleFields returns [EObject current=null] : iv_ruleFields= ruleFields EOF ;
    public final EObject entryRuleFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFields = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:490:2: (iv_ruleFields= ruleFields EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:491:2: iv_ruleFields= ruleFields EOF
            {
             newCompositeNode(grammarAccess.getFieldsRule()); 
            pushFollow(FOLLOW_ruleFields_in_entryRuleFields1046);
            iv_ruleFields=ruleFields();

            state._fsp--;

             current =iv_ruleFields; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFields1056); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:498:1: ruleFields returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';' ) ;
    public final EObject ruleFields() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_4_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:501:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:502:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:502:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:502:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )? ( (lv_attributes_5_0= ruleFieldAttributes ) )? otherlv_6= ';'
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:502:2: ( (lv_name_0_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:503:1: (lv_name_0_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:503:1: (lv_name_0_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:504:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFields1098); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFieldsAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleFields1115); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldsAccess().getColonKeyword_1());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:524:1: ( (lv_type_2_0= ruleType ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:525:1: (lv_type_2_0= ruleType )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:525:1: (lv_type_2_0= ruleType )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:526:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFieldsAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFields1136);
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

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:542:2: (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:542:4: otherlv_3= '=' ( (lv_defaultValue_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleFields1149); 

                        	newLeafNode(otherlv_3, grammarAccess.getFieldsAccess().getEqualsSignKeyword_3_0());
                        
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:546:1: ( (lv_defaultValue_4_0= ruleValue ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:547:1: (lv_defaultValue_4_0= ruleValue )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:547:1: (lv_defaultValue_4_0= ruleValue )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:548:3: lv_defaultValue_4_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldsAccess().getDefaultValueValueParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleFields1170);
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

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:564:4: ( (lv_attributes_5_0= ruleFieldAttributes ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:565:1: (lv_attributes_5_0= ruleFieldAttributes )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:565:1: (lv_attributes_5_0= ruleFieldAttributes )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:566:3: lv_attributes_5_0= ruleFieldAttributes
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldsAccess().getAttributesFieldAttributesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldAttributes_in_ruleFields1193);
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

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleFields1206); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:594:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:595:2: (iv_ruleValue= ruleValue EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:596:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1243);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1254); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:603:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber | kw= 'false' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Number_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:606:28: ( (this_Number_0= ruleNumber | kw= 'false' | kw= 'true' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:607:1: (this_Number_0= ruleNumber | kw= 'false' | kw= 'true' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:607:1: (this_Number_0= ruleNumber | kw= 'false' | kw= 'true' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:608:5: this_Number_0= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNumberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleValue1301);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    		current.merge(this_Number_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:620:2: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleValue1325); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValueAccess().getFalseKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:627:2: kw= 'true'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleValue1344); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValueAccess().getTrueKeyword_2()); 
                        

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:640:1: entryRuleFieldAttributes returns [EObject current=null] : iv_ruleFieldAttributes= ruleFieldAttributes EOF ;
    public final EObject entryRuleFieldAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAttributes = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:641:2: (iv_ruleFieldAttributes= ruleFieldAttributes EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:642:2: iv_ruleFieldAttributes= ruleFieldAttributes EOF
            {
             newCompositeNode(grammarAccess.getFieldAttributesRule()); 
            pushFollow(FOLLOW_ruleFieldAttributes_in_entryRuleFieldAttributes1384);
            iv_ruleFieldAttributes=ruleFieldAttributes();

            state._fsp--;

             current =iv_ruleFieldAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAttributes1394); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:649:1: ruleFieldAttributes returns [EObject current=null] : ( ( (lv_attributeList_0_0= '(' ) ) ( (lv_atributeName_1_0= ruleAttributeName ) )* otherlv_2= ')' ) ;
    public final EObject ruleFieldAttributes() throws RecognitionException {
        EObject current = null;

        Token lv_attributeList_0_0=null;
        Token otherlv_2=null;
        EObject lv_atributeName_1_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:652:28: ( ( ( (lv_attributeList_0_0= '(' ) ) ( (lv_atributeName_1_0= ruleAttributeName ) )* otherlv_2= ')' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:653:1: ( ( (lv_attributeList_0_0= '(' ) ) ( (lv_atributeName_1_0= ruleAttributeName ) )* otherlv_2= ')' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:653:1: ( ( (lv_attributeList_0_0= '(' ) ) ( (lv_atributeName_1_0= ruleAttributeName ) )* otherlv_2= ')' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:653:2: ( (lv_attributeList_0_0= '(' ) ) ( (lv_atributeName_1_0= ruleAttributeName ) )* otherlv_2= ')'
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:653:2: ( (lv_attributeList_0_0= '(' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:654:1: (lv_attributeList_0_0= '(' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:654:1: (lv_attributeList_0_0= '(' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:655:3: lv_attributeList_0_0= '('
            {
            lv_attributeList_0_0=(Token)match(input,25,FOLLOW_25_in_ruleFieldAttributes1437); 

                    newLeafNode(lv_attributeList_0_0, grammarAccess.getFieldAttributesAccess().getAttributeListLeftParenthesisKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldAttributesRule());
            	        }
                   		setWithLastConsumed(current, "attributeList", lv_attributeList_0_0, "(");
            	    

            }


            }

            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:668:2: ( (lv_atributeName_1_0= ruleAttributeName ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:669:1: (lv_atributeName_1_0= ruleAttributeName )
            	    {
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:669:1: (lv_atributeName_1_0= ruleAttributeName )
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:670:3: lv_atributeName_1_0= ruleAttributeName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAttributesAccess().getAtributeNameAttributeNameParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeName_in_ruleFieldAttributes1471);
            	    lv_atributeName_1_0=ruleAttributeName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldAttributesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atributeName",
            	            		lv_atributeName_1_0, 
            	            		"AttributeName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleFieldAttributes1484); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAttributesAccess().getRightParenthesisKeyword_2());
                

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:698:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:699:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:700:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName1520);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName1530); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:707:1: ruleAttributeName returns [EObject current=null] : ( ( (lv_deprectated_0_0= 'deprecated' ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        Token lv_deprectated_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:710:28: ( ( ( (lv_deprectated_0_0= 'deprecated' ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:711:1: ( ( (lv_deprectated_0_0= 'deprecated' ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:711:1: ( ( (lv_deprectated_0_0= 'deprecated' ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:711:2: ( (lv_deprectated_0_0= 'deprecated' ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:711:2: ( (lv_deprectated_0_0= 'deprecated' ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:712:1: (lv_deprectated_0_0= 'deprecated' )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:712:1: (lv_deprectated_0_0= 'deprecated' )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:713:3: lv_deprectated_0_0= 'deprecated'
                    {
                    lv_deprectated_0_0=(Token)match(input,27,FOLLOW_27_in_ruleAttributeName1573); 

                            newLeafNode(lv_deprectated_0_0, grammarAccess.getAttributeNameAccess().getDeprectatedDeprecatedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(current, "deprectated", true, "deprecated");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:727:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:727:6: ( (otherlv_1= RULE_ID ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:728:1: (otherlv_1= RULE_ID )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:728:1: (otherlv_1= RULE_ID )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:729:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeName1612); 

                    		newLeafNode(otherlv_1, grammarAccess.getAttributeNameAccess().getCustomNameCustomAttributesCrossReference_1_0()); 
                    	

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:748:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:749:2: (iv_ruleType= ruleType EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:750:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1648);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1658); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:757:1: ruleType returns [EObject current=null] : ( ( (lv_primType_0_0= rulePrimitive ) ) | ( (lv_vectorType_1_0= ruleVector ) ) | ( (lv_tableType_2_0= ruleTableType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_primType_0_0 = null;

        EObject lv_vectorType_1_0 = null;

        EObject lv_tableType_2_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:760:28: ( ( ( (lv_primType_0_0= rulePrimitive ) ) | ( (lv_vectorType_1_0= ruleVector ) ) | ( (lv_tableType_2_0= ruleTableType ) ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:761:1: ( ( (lv_primType_0_0= rulePrimitive ) ) | ( (lv_vectorType_1_0= ruleVector ) ) | ( (lv_tableType_2_0= ruleTableType ) ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:761:1: ( ( (lv_primType_0_0= rulePrimitive ) ) | ( (lv_vectorType_1_0= ruleVector ) ) | ( (lv_tableType_2_0= ruleTableType ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:761:2: ( (lv_primType_0_0= rulePrimitive ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:761:2: ( (lv_primType_0_0= rulePrimitive ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:762:1: (lv_primType_0_0= rulePrimitive )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:762:1: (lv_primType_0_0= rulePrimitive )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:763:3: lv_primType_0_0= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getPrimTypePrimitiveParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleType1704);
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
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:780:6: ( (lv_vectorType_1_0= ruleVector ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:780:6: ( (lv_vectorType_1_0= ruleVector ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:781:1: (lv_vectorType_1_0= ruleVector )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:781:1: (lv_vectorType_1_0= ruleVector )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:782:3: lv_vectorType_1_0= ruleVector
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getVectorTypeVectorParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVector_in_ruleType1731);
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
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:799:6: ( (lv_tableType_2_0= ruleTableType ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:799:6: ( (lv_tableType_2_0= ruleTableType ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:800:1: (lv_tableType_2_0= ruleTableType )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:800:1: (lv_tableType_2_0= ruleTableType )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:801:3: lv_tableType_2_0= ruleTableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getTableTypeTableTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTableType_in_ruleType1758);
                    lv_tableType_2_0=ruleTableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"tableType",
                            		lv_tableType_2_0, 
                            		"TableType");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:825:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:826:2: (iv_ruleVector= ruleVector EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:827:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector1794);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector1804); 

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
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:834:1: ruleVector returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_primType_1_0= rulePrimitive ) ) | ( (lv_tableType_2_0= ruleTableType ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_primType_1_0 = null;

        EObject lv_tableType_2_0 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:837:28: ( (otherlv_0= '[' ( ( (lv_primType_1_0= rulePrimitive ) ) | ( (lv_tableType_2_0= ruleTableType ) ) ) otherlv_3= ']' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:838:1: (otherlv_0= '[' ( ( (lv_primType_1_0= rulePrimitive ) ) | ( (lv_tableType_2_0= ruleTableType ) ) ) otherlv_3= ']' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:838:1: (otherlv_0= '[' ( ( (lv_primType_1_0= rulePrimitive ) ) | ( (lv_tableType_2_0= ruleTableType ) ) ) otherlv_3= ']' )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:838:3: otherlv_0= '[' ( ( (lv_primType_1_0= rulePrimitive ) ) | ( (lv_tableType_2_0= ruleTableType ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleVector1841); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_0());
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:842:1: ( ( (lv_primType_1_0= rulePrimitive ) ) | ( (lv_tableType_2_0= ruleTableType ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=30 && LA13_0<=41)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:842:2: ( (lv_primType_1_0= rulePrimitive ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:842:2: ( (lv_primType_1_0= rulePrimitive ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:843:1: (lv_primType_1_0= rulePrimitive )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:843:1: (lv_primType_1_0= rulePrimitive )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:844:3: lv_primType_1_0= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getVectorAccess().getPrimTypePrimitiveParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleVector1863);
                    lv_primType_1_0=rulePrimitive();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVectorRule());
                    	        }
                           		set(
                           			current, 
                           			"primType",
                            		lv_primType_1_0, 
                            		"Primitive");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:861:6: ( (lv_tableType_2_0= ruleTableType ) )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:861:6: ( (lv_tableType_2_0= ruleTableType ) )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:862:1: (lv_tableType_2_0= ruleTableType )
                    {
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:862:1: (lv_tableType_2_0= ruleTableType )
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:863:3: lv_tableType_2_0= ruleTableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVectorAccess().getTableTypeTableTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTableType_in_ruleVector1890);
                    lv_tableType_2_0=ruleTableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVectorRule());
                    	        }
                           		set(
                           			current, 
                           			"tableType",
                            		lv_tableType_2_0, 
                            		"TableType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleVector1903); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRulePrimitive"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:891:1: entryRulePrimitive returns [String current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final String entryRulePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitive = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:892:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:893:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive1940);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive1951); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:900:1: rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool' | kw= 'byte' | kw= 'ubyte' | kw= 'short' | kw= 'ushort' | kw= 'int' | kw= 'uint' | kw= 'float' | kw= 'long' | kw= 'ulong' | kw= 'double' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken rulePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:903:28: ( (kw= 'bool' | kw= 'byte' | kw= 'ubyte' | kw= 'short' | kw= 'ushort' | kw= 'int' | kw= 'uint' | kw= 'float' | kw= 'long' | kw= 'ulong' | kw= 'double' | kw= 'string' ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:904:1: (kw= 'bool' | kw= 'byte' | kw= 'ubyte' | kw= 'short' | kw= 'ushort' | kw= 'int' | kw= 'uint' | kw= 'float' | kw= 'long' | kw= 'ulong' | kw= 'double' | kw= 'string' )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:904:1: (kw= 'bool' | kw= 'byte' | kw= 'ubyte' | kw= 'short' | kw= 'ushort' | kw= 'int' | kw= 'uint' | kw= 'float' | kw= 'long' | kw= 'ulong' | kw= 'double' | kw= 'string' )
            int alt14=12;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 33:
                {
                alt14=4;
                }
                break;
            case 34:
                {
                alt14=5;
                }
                break;
            case 35:
                {
                alt14=6;
                }
                break;
            case 36:
                {
                alt14=7;
                }
                break;
            case 37:
                {
                alt14=8;
                }
                break;
            case 38:
                {
                alt14=9;
                }
                break;
            case 39:
                {
                alt14=10;
                }
                break;
            case 40:
                {
                alt14=11;
                }
                break;
            case 41:
                {
                alt14=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:905:2: kw= 'bool'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_rulePrimitive1989); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getBoolKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:912:2: kw= 'byte'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulePrimitive2008); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getByteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:919:2: kw= 'ubyte'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulePrimitive2027); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getUbyteKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:926:2: kw= 'short'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_rulePrimitive2046); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getShortKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:933:2: kw= 'ushort'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulePrimitive2065); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getUshortKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:940:2: kw= 'int'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_rulePrimitive2084); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getIntKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:947:2: kw= 'uint'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulePrimitive2103); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getUintKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:954:2: kw= 'float'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulePrimitive2122); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getFloatKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:961:2: kw= 'long'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulePrimitive2141); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getLongKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:968:2: kw= 'ulong'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_rulePrimitive2160); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getUlongKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:975:2: kw= 'double'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_rulePrimitive2179); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getDoubleKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:982:2: kw= 'string'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_rulePrimitive2198); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getStringKeyword_11()); 
                        

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


    // $ANTLR start "entryRuleTableType"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:995:1: entryRuleTableType returns [EObject current=null] : iv_ruleTableType= ruleTableType EOF ;
    public final EObject entryRuleTableType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableType = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:996:2: (iv_ruleTableType= ruleTableType EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:997:2: iv_ruleTableType= ruleTableType EOF
            {
             newCompositeNode(grammarAccess.getTableTypeRule()); 
            pushFollow(FOLLOW_ruleTableType_in_entryRuleTableType2238);
            iv_ruleTableType=ruleTableType();

            state._fsp--;

             current =iv_ruleTableType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableType2248); 

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
    // $ANTLR end "entryRuleTableType"


    // $ANTLR start "ruleTableType"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1004:1: ruleTableType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTableType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1007:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1008:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1008:1: ( (otherlv_0= RULE_ID ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1009:1: (otherlv_0= RULE_ID )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1009:1: (otherlv_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1010:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTableTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableType2292); 

            		newLeafNode(otherlv_0, grammarAccess.getTableTypeAccess().getTypeTableCrossReference_0()); 
            	

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
    // $ANTLR end "ruleTableType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1029:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1030:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1031:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2328);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2339); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1038:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1041:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1042:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1042:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1043:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName2386);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1053:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1054:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedName2405); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName2427);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1078:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1079:2: (iv_ruleValidID= ruleValidID EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1080:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID2475);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID2486); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1087:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1090:28: (this_ID_0= RULE_ID )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1091:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID2525); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1106:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1110:2: (iv_ruleNumber= ruleNumber EOF )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1111:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2576);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2587); 

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
    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1121:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1125:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1126:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1126:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1126:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2631); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                
            // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1133:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../maxim.zaks.flattBuffers/src-gen/maxim/zaks/parser/antlr/internal/InternalFlatBuffers.g:1134:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleNumber2650); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2665); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
                        

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSchema_in_entryRuleSchema75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchema85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleSchema131 = new BitSet(new long[]{0x000000000007A800L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleSchema153 = new BitSet(new long[]{0x000000000005A800L});
    public static final BitSet FOLLOW_ruleFileIdentifier_in_ruleSchema175 = new BitSet(new long[]{0x000000000005A800L});
    public static final BitSet FOLLOW_ruleCustomAttributes_in_ruleSchema197 = new BitSet(new long[]{0x000000000005A800L});
    public static final BitSet FOLLOW_ruleTable_in_ruleSchema219 = new BitSet(new long[]{0x000000000005A800L});
    public static final BitSet FOLLOW_ruleRootType_in_ruleSchema241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootType_in_entryRuleRootType277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootType287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRootType324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRootType344 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRootType356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributes_in_entryRuleCustomAttributes392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomAttributes402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCustomAttributes439 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomAttributes451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomAttributes468 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomAttributes485 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCustomAttributes497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileIdentifier_in_entryRuleFileIdentifier534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileIdentifier545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFileIdentifier583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFileIdentifier598 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFileIdentifier616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNamespace703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNamespace724 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNamespace736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInclude822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude837 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInclude855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTable942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTable959 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTable976 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleFields_in_ruleTable997 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleTable1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFields_in_entryRuleFields1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFields1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFields1098 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFields1115 = new BitSet(new long[]{0x000003FFD0000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFields1136 = new BitSet(new long[]{0x0000000002401000L});
    public static final BitSet FOLLOW_22_in_ruleFields1149 = new BitSet(new long[]{0x0000000001800040L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFields1170 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_ruleFields1193 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFields1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleValue1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValue1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValue1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAttributes_in_entryRuleFieldAttributes1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAttributes1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFieldAttributes1437 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleFieldAttributes1471 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_26_in_ruleFieldAttributes1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName1520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAttributeName1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeName1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleType1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_ruleType1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableType_in_ruleType1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVector1841 = new BitSet(new long[]{0x000003FFD0000010L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleVector1863 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleTableType_in_ruleVector1890 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleVector1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive1940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimitive1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrimitive2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePrimitive2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrimitive2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrimitive2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrimitive2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrimitive2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrimitive2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimitive2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrimitive2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimitive2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePrimitive2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableType_in_entryRuleTableType2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableType2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableType2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName2386 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedName2405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName2427 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2631 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumber2650 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2665 = new BitSet(new long[]{0x0000000000000002L});

}