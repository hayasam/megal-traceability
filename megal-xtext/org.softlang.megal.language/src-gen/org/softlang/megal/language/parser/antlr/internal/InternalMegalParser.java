package org.softlang.megal.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.softlang.megal.language.services.MegalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UCID", "RULE_LCID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_SEGMENT", "'model'", "'import'", "'@'", "'['", "']'", "'('", "')'", "'|'", "'->'", "'='", "'<'", "'as'", "'entity'", "'*'", "'?'", "'!'", "':'", "'+'", "'::'", "'.'"
    };
    public static final int RULE_SEGMENT=10;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_LCID=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_UCID=5;
    public static final int RULE_WS=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMegalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMegalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMegalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g"; }



     	private MegalGrammarAccess grammarAccess;
     	
        public InternalMegalParser(TokenStream input, MegalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Megamodel";	
       	}
       	
       	@Override
       	protected MegalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMegamodel"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:67:1: entryRuleMegamodel returns [EObject current=null] : iv_ruleMegamodel= ruleMegamodel EOF ;
    public final EObject entryRuleMegamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegamodel = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:68:2: (iv_ruleMegamodel= ruleMegamodel EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:69:2: iv_ruleMegamodel= ruleMegamodel EOF
            {
             newCompositeNode(grammarAccess.getMegamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegamodel_in_entryRuleMegamodel75);
            iv_ruleMegamodel=ruleMegamodel();

            state._fsp--;

             current =iv_ruleMegamodel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegamodel85); 

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
    // $ANTLR end "entryRuleMegamodel"


    // $ANTLR start "ruleMegamodel"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:76:1: ruleMegamodel returns [EObject current=null] : ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= ruleQID ) ) ( (otherlv_3= 'import' ( ( ruleQID ) ) ) | ( (lv_declarations_5_0= ruleDeclaration ) ) | ( (lv_bindings_6_0= ruleLink ) ) )* ) ;
    public final EObject ruleMegamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_bindings_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:79:28: ( ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= ruleQID ) ) ( (otherlv_3= 'import' ( ( ruleQID ) ) ) | ( (lv_declarations_5_0= ruleDeclaration ) ) | ( (lv_bindings_6_0= ruleLink ) ) )* ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:80:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= ruleQID ) ) ( (otherlv_3= 'import' ( ( ruleQID ) ) ) | ( (lv_declarations_5_0= ruleDeclaration ) ) | ( (lv_bindings_6_0= ruleLink ) ) )* )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:80:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= ruleQID ) ) ( (otherlv_3= 'import' ( ( ruleQID ) ) ) | ( (lv_declarations_5_0= ruleDeclaration ) ) | ( (lv_bindings_6_0= ruleLink ) ) )* )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:80:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= ruleQID ) ) ( (otherlv_3= 'import' ( ( ruleQID ) ) ) | ( (lv_declarations_5_0= ruleDeclaration ) ) | ( (lv_bindings_6_0= ruleLink ) ) )*
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:80:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:81:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:81:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:82:3: lv_annotations_0_0= rulePrefixAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegamodelAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_ruleMegamodel131);
            	    lv_annotations_0_0=rulePrefixAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegamodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"PrefixAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMegamodel144); 

                	newLeafNode(otherlv_1, grammarAccess.getMegamodelAccess().getModelKeyword_1());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:102:1: ( (lv_name_2_0= ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:103:1: (lv_name_2_0= ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:103:1: (lv_name_2_0= ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:104:3: lv_name_2_0= ruleQID
            {
             
            	        newCompositeNode(grammarAccess.getMegamodelAccess().getNameQIDParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleMegamodel165);
            lv_name_2_0=ruleQID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMegamodelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:120:2: ( (otherlv_3= 'import' ( ( ruleQID ) ) ) | ( (lv_declarations_5_0= ruleDeclaration ) ) | ( (lv_bindings_6_0= ruleLink ) ) )*
            loop2:
            do {
                int alt2=4;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:120:3: (otherlv_3= 'import' ( ( ruleQID ) ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:120:3: (otherlv_3= 'import' ( ( ruleQID ) ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:120:5: otherlv_3= 'import' ( ( ruleQID ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMegamodel179); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMegamodelAccess().getImportKeyword_3_0_0());
            	        
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:124:1: ( ( ruleQID ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:125:1: ( ruleQID )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:125:1: ( ruleQID )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:126:3: ruleQID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMegamodelRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMegamodelAccess().getImportsMegamodelCrossReference_3_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleMegamodel202);
            	    ruleQID();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:140:6: ( (lv_declarations_5_0= ruleDeclaration ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:140:6: ( (lv_declarations_5_0= ruleDeclaration ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:141:1: (lv_declarations_5_0= ruleDeclaration )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:141:1: (lv_declarations_5_0= ruleDeclaration )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:142:3: lv_declarations_5_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegamodelAccess().getDeclarationsDeclarationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_ruleMegamodel230);
            	    lv_declarations_5_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegamodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_5_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:159:6: ( (lv_bindings_6_0= ruleLink ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:159:6: ( (lv_bindings_6_0= ruleLink ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:160:1: (lv_bindings_6_0= ruleLink )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:160:1: (lv_bindings_6_0= ruleLink )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:161:3: lv_bindings_6_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegamodelAccess().getBindingsLinkParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleMegamodel257);
            	    lv_bindings_6_0=ruleLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegamodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bindings",
            	            		lv_bindings_6_0, 
            	            		"Link");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleMegamodel"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:185:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:186:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:187:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_entryRuleDeclaration295);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaration305); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:194:1: ruleDeclaration returns [EObject current=null] : (this_EntityType_0= ruleEntityType | this_RelationshipType_1= ruleRelationshipType | this_Entity_2= ruleEntity | this_Relationship_3= ruleRelationship | this_FunctionApplication_4= ruleFunctionApplication ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_EntityType_0 = null;

        EObject this_RelationshipType_1 = null;

        EObject this_Entity_2 = null;

        EObject this_Relationship_3 = null;

        EObject this_FunctionApplication_4 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:197:28: ( (this_EntityType_0= ruleEntityType | this_RelationshipType_1= ruleRelationshipType | this_Entity_2= ruleEntity | this_Relationship_3= ruleRelationship | this_FunctionApplication_4= ruleFunctionApplication ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:198:1: (this_EntityType_0= ruleEntityType | this_RelationshipType_1= ruleRelationshipType | this_Entity_2= ruleEntity | this_Relationship_3= ruleRelationship | this_FunctionApplication_4= ruleFunctionApplication )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:198:1: (this_EntityType_0= ruleEntityType | this_RelationshipType_1= ruleRelationshipType | this_Entity_2= ruleEntity | this_Relationship_3= ruleRelationship | this_FunctionApplication_4= ruleFunctionApplication )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:199:5: this_EntityType_0= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getEntityTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEntityType_in_ruleDeclaration352);
                    this_EntityType_0=ruleEntityType();

                    state._fsp--;

                     
                            current = this_EntityType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:209:5: this_RelationshipType_1= ruleRelationshipType
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getRelationshipTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRelationshipType_in_ruleDeclaration379);
                    this_RelationshipType_1=ruleRelationshipType();

                    state._fsp--;

                     
                            current = this_RelationshipType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:219:5: this_Entity_2= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_ruleDeclaration406);
                    this_Entity_2=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:229:5: this_Relationship_3= ruleRelationship
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getRelationshipParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleDeclaration433);
                    this_Relationship_3=ruleRelationship();

                    state._fsp--;

                     
                            current = this_Relationship_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:239:5: this_FunctionApplication_4= ruleFunctionApplication
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionApplicationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionApplication_in_ruleDeclaration460);
                    this_FunctionApplication_4=ruleFunctionApplication();

                    state._fsp--;

                     
                            current = this_FunctionApplication_4; 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRulePrefixAnnotation"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:255:1: entryRulePrefixAnnotation returns [EObject current=null] : iv_rulePrefixAnnotation= rulePrefixAnnotation EOF ;
    public final EObject entryRulePrefixAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixAnnotation = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:256:2: (iv_rulePrefixAnnotation= rulePrefixAnnotation EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:257:2: iv_rulePrefixAnnotation= rulePrefixAnnotation EOF
            {
             newCompositeNode(grammarAccess.getPrefixAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_entryRulePrefixAnnotation495);
            iv_rulePrefixAnnotation=rulePrefixAnnotation();

            state._fsp--;

             current =iv_rulePrefixAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixAnnotation505); 

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
    // $ANTLR end "entryRulePrefixAnnotation"


    // $ANTLR start "rulePrefixAnnotation"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:264:1: rulePrefixAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_key_1_0= ruleQID ) ) ( (lv_value_2_0= RULE_STRING ) )? ) ;
    public final EObject rulePrefixAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:267:28: ( (otherlv_0= '@' ( (lv_key_1_0= ruleQID ) ) ( (lv_value_2_0= RULE_STRING ) )? ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:268:1: (otherlv_0= '@' ( (lv_key_1_0= ruleQID ) ) ( (lv_value_2_0= RULE_STRING ) )? )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:268:1: (otherlv_0= '@' ( (lv_key_1_0= ruleQID ) ) ( (lv_value_2_0= RULE_STRING ) )? )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:268:3: otherlv_0= '@' ( (lv_key_1_0= ruleQID ) ) ( (lv_value_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePrefixAnnotation542); 

                	newLeafNode(otherlv_0, grammarAccess.getPrefixAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:272:1: ( (lv_key_1_0= ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:273:1: (lv_key_1_0= ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:273:1: (lv_key_1_0= ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:274:3: lv_key_1_0= ruleQID
            {
             
            	        newCompositeNode(grammarAccess.getPrefixAnnotationAccess().getKeyQIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rulePrefixAnnotation563);
            lv_key_1_0=ruleQID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefixAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"QID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:290:2: ( (lv_value_2_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:291:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:291:1: (lv_value_2_0= RULE_STRING )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:292:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePrefixAnnotation580); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getPrefixAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrefixAnnotationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "rulePrefixAnnotation"


    // $ANTLR start "entryRuleShowNameAnnotation"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:316:1: entryRuleShowNameAnnotation returns [EObject current=null] : iv_ruleShowNameAnnotation= ruleShowNameAnnotation EOF ;
    public final EObject entryRuleShowNameAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowNameAnnotation = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:317:2: (iv_ruleShowNameAnnotation= ruleShowNameAnnotation EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:318:2: iv_ruleShowNameAnnotation= ruleShowNameAnnotation EOF
            {
             newCompositeNode(grammarAccess.getShowNameAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShowNameAnnotation_in_entryRuleShowNameAnnotation622);
            iv_ruleShowNameAnnotation=ruleShowNameAnnotation();

            state._fsp--;

             current =iv_ruleShowNameAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShowNameAnnotation632); 

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
    // $ANTLR end "entryRuleShowNameAnnotation"


    // $ANTLR start "ruleShowNameAnnotation"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:325:1: ruleShowNameAnnotation returns [EObject current=null] : (otherlv_0= '[' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ']' ) ;
    public final EObject ruleShowNameAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:328:28: ( (otherlv_0= '[' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ']' ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:329:1: (otherlv_0= '[' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ']' )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:329:1: (otherlv_0= '[' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ']' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:329:3: otherlv_0= '[' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleShowNameAnnotation669); 

                	newLeafNode(otherlv_0, grammarAccess.getShowNameAnnotationAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:333:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:334:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:334:1: (lv_value_1_0= RULE_STRING )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:335:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleShowNameAnnotation686); 

            			newLeafNode(lv_value_1_0, grammarAccess.getShowNameAnnotationAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getShowNameAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleShowNameAnnotation703); 

                	newLeafNode(otherlv_2, grammarAccess.getShowNameAnnotationAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleShowNameAnnotation"


    // $ANTLR start "entryRuleLink"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:363:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:364:2: (iv_ruleLink= ruleLink EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:365:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink739);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink749); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:372:1: ruleLink returns [EObject current=null] : ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) (otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) )? otherlv_8= '=' ( (lv_to_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_to_9_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:375:28: ( ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) (otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) )? otherlv_8= '=' ( (lv_to_9_0= RULE_STRING ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:376:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) (otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) )? otherlv_8= '=' ( (lv_to_9_0= RULE_STRING ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:376:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) (otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) )? otherlv_8= '=' ( (lv_to_9_0= RULE_STRING ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:376:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) (otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) )? otherlv_8= '=' ( (lv_to_9_0= RULE_STRING ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:376:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:377:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:377:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:378:3: lv_annotations_0_0= rulePrefixAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_ruleLink795);
            	    lv_annotations_0_0=rulePrefixAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"PrefixAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:394:3: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:395:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:395:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:396:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getLinkEntityCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleLink819);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:409:2: (otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:409:4: otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) )
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLink832); 

                        	newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:413:1: ( ( ruleQID ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:414:1: ( ruleQID )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:414:1: ( ruleQID )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:415:3: ruleQID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getInputEntityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleLink855);
                    ruleQID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLink867); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getRightParenthesisKeyword_2_2());
                        
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLink879); 

                        	newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getVerticalLineKeyword_2_3());
                        
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLink891); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2_4());
                        
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:440:1: ( ( ruleQID ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:441:1: ( ruleQID )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:441:1: ( ruleQID )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:442:3: ruleQID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getOutputEntityCrossReference_2_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleLink914);
                    ruleQID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLink928); 

                	newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getEqualsSignKeyword_3());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:459:1: ( (lv_to_9_0= RULE_STRING ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:460:1: (lv_to_9_0= RULE_STRING )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:460:1: (lv_to_9_0= RULE_STRING )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:461:3: lv_to_9_0= RULE_STRING
            {
            lv_to_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLink945); 

            			newLeafNode(lv_to_9_0, grammarAccess.getLinkAccess().getToSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"to",
                    		lv_to_9_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleEntityType"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:485:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:486:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:487:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityType_in_entryRuleEntityType986);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityType996); 

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:494:1: ruleEntityType returns [EObject current=null] : ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? ( (otherlv_3= '<' ( (lv_supertype_4_0= ruleTypeReference ) ) ) | (otherlv_5= 'as' otherlv_6= 'entity' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_supertype_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:497:28: ( ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? ( (otherlv_3= '<' ( (lv_supertype_4_0= ruleTypeReference ) ) ) | (otherlv_5= 'as' otherlv_6= 'entity' ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:498:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? ( (otherlv_3= '<' ( (lv_supertype_4_0= ruleTypeReference ) ) ) | (otherlv_5= 'as' otherlv_6= 'entity' ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:498:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? ( (otherlv_3= '<' ( (lv_supertype_4_0= ruleTypeReference ) ) ) | (otherlv_5= 'as' otherlv_6= 'entity' ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:498:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? ( (otherlv_3= '<' ( (lv_supertype_4_0= ruleTypeReference ) ) ) | (otherlv_5= 'as' otherlv_6= 'entity' ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:498:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:499:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:499:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:500:3: lv_annotations_0_0= rulePrefixAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityTypeAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_ruleEntityType1042);
            	    lv_annotations_0_0=rulePrefixAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"PrefixAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:516:3: ( (lv_name_1_0= ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:517:1: (lv_name_1_0= ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:517:1: (lv_name_1_0= ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:518:3: lv_name_1_0= ruleQID
            {
             
            	        newCompositeNode(grammarAccess.getEntityTypeAccess().getNameQIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleEntityType1064);
            lv_name_1_0=ruleQID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:534:2: ( (lv_annotations_2_0= ruleShowNameAnnotation ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:535:1: (lv_annotations_2_0= ruleShowNameAnnotation )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:535:1: (lv_annotations_2_0= ruleShowNameAnnotation )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:536:3: lv_annotations_2_0= ruleShowNameAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityTypeAccess().getAnnotationsShowNameAnnotationParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleShowNameAnnotation_in_ruleEntityType1085);
                    lv_annotations_2_0=ruleShowNameAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_2_0, 
                            		"ShowNameAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:552:3: ( (otherlv_3= '<' ( (lv_supertype_4_0= ruleTypeReference ) ) ) | (otherlv_5= 'as' otherlv_6= 'entity' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:552:4: (otherlv_3= '<' ( (lv_supertype_4_0= ruleTypeReference ) ) )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:552:4: (otherlv_3= '<' ( (lv_supertype_4_0= ruleTypeReference ) ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:552:6: otherlv_3= '<' ( (lv_supertype_4_0= ruleTypeReference ) )
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEntityType1100); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityTypeAccess().getLessThanSignKeyword_3_0_0());
                        
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:556:1: ( (lv_supertype_4_0= ruleTypeReference ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:557:1: (lv_supertype_4_0= ruleTypeReference )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:557:1: (lv_supertype_4_0= ruleTypeReference )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:558:3: lv_supertype_4_0= ruleTypeReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityTypeAccess().getSupertypeTypeReferenceParserRuleCall_3_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_ruleEntityType1121);
                    lv_supertype_4_0=ruleTypeReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"supertype",
                            		lv_supertype_4_0, 
                            		"TypeReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:575:6: (otherlv_5= 'as' otherlv_6= 'entity' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:575:6: (otherlv_5= 'as' otherlv_6= 'entity' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:575:8: otherlv_5= 'as' otherlv_6= 'entity'
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEntityType1141); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityTypeAccess().getAsKeyword_3_1_0());
                        
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEntityType1153); 

                        	newLeafNode(otherlv_6, grammarAccess.getEntityTypeAccess().getEntityKeyword_3_1_1());
                        

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleRelationshipType"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:591:1: entryRuleRelationshipType returns [EObject current=null] : iv_ruleRelationshipType= ruleRelationshipType EOF ;
    public final EObject entryRuleRelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipType = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:592:2: (iv_ruleRelationshipType= ruleRelationshipType EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:593:2: iv_ruleRelationshipType= ruleRelationshipType EOF
            {
             newCompositeNode(grammarAccess.getRelationshipTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationshipType_in_entryRuleRelationshipType1191);
            iv_ruleRelationshipType=ruleRelationshipType();

            state._fsp--;

             current =iv_ruleRelationshipType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationshipType1201); 

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
    // $ANTLR end "entryRuleRelationshipType"


    // $ANTLR start "ruleRelationshipType"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:600:1: ruleRelationshipType returns [EObject current=null] : ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? otherlv_3= '<' ( (lv_left_4_0= ruleTypeReference ) ) otherlv_5= '*' ( (lv_right_6_0= ruleTypeReference ) ) ) ;
    public final EObject ruleRelationshipType() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:603:28: ( ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? otherlv_3= '<' ( (lv_left_4_0= ruleTypeReference ) ) otherlv_5= '*' ( (lv_right_6_0= ruleTypeReference ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:604:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? otherlv_3= '<' ( (lv_left_4_0= ruleTypeReference ) ) otherlv_5= '*' ( (lv_right_6_0= ruleTypeReference ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:604:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? otherlv_3= '<' ( (lv_left_4_0= ruleTypeReference ) ) otherlv_5= '*' ( (lv_right_6_0= ruleTypeReference ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:604:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( (lv_name_1_0= ruleQID ) ) ( (lv_annotations_2_0= ruleShowNameAnnotation ) )? otherlv_3= '<' ( (lv_left_4_0= ruleTypeReference ) ) otherlv_5= '*' ( (lv_right_6_0= ruleTypeReference ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:604:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:605:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:605:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:606:3: lv_annotations_0_0= rulePrefixAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationshipTypeAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_ruleRelationshipType1247);
            	    lv_annotations_0_0=rulePrefixAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationshipTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"PrefixAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:622:3: ( (lv_name_1_0= ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:623:1: (lv_name_1_0= ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:623:1: (lv_name_1_0= ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:624:3: lv_name_1_0= ruleQID
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipTypeAccess().getNameQIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleRelationshipType1269);
            lv_name_1_0=ruleQID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:640:2: ( (lv_annotations_2_0= ruleShowNameAnnotation ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:641:1: (lv_annotations_2_0= ruleShowNameAnnotation )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:641:1: (lv_annotations_2_0= ruleShowNameAnnotation )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:642:3: lv_annotations_2_0= ruleShowNameAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationshipTypeAccess().getAnnotationsShowNameAnnotationParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleShowNameAnnotation_in_ruleRelationshipType1290);
                    lv_annotations_2_0=ruleShowNameAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationshipTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_2_0, 
                            		"ShowNameAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRelationshipType1303); 

                	newLeafNode(otherlv_3, grammarAccess.getRelationshipTypeAccess().getLessThanSignKeyword_3());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:662:1: ( (lv_left_4_0= ruleTypeReference ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:663:1: (lv_left_4_0= ruleTypeReference )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:663:1: (lv_left_4_0= ruleTypeReference )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:664:3: lv_left_4_0= ruleTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipTypeAccess().getLeftTypeReferenceParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_ruleRelationshipType1324);
            lv_left_4_0=ruleTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipTypeRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_4_0, 
                    		"TypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRelationshipType1336); 

                	newLeafNode(otherlv_5, grammarAccess.getRelationshipTypeAccess().getAsteriskKeyword_5());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:684:1: ( (lv_right_6_0= ruleTypeReference ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:685:1: (lv_right_6_0= ruleTypeReference )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:685:1: (lv_right_6_0= ruleTypeReference )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:686:3: lv_right_6_0= ruleTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipTypeAccess().getRightTypeReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_ruleRelationshipType1357);
            lv_right_6_0=ruleTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipTypeRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_6_0, 
                    		"TypeReference");
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
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "entryRuleEntity"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:710:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:711:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:712:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity1393);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity1403); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:719:1: ruleEntity returns [EObject current=null] : ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( (lv_dependent_1_0= '?' ) ) | ( (lv_parameter_2_0= '!' ) ) )? ( (lv_name_3_0= ruleQID ) ) ( (lv_annotations_4_0= ruleShowNameAnnotation ) )? otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_dependent_1_0=null;
        Token lv_parameter_2_0=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_annotations_4_0 = null;

        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:722:28: ( ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( (lv_dependent_1_0= '?' ) ) | ( (lv_parameter_2_0= '!' ) ) )? ( (lv_name_3_0= ruleQID ) ) ( (lv_annotations_4_0= ruleShowNameAnnotation ) )? otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:723:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( (lv_dependent_1_0= '?' ) ) | ( (lv_parameter_2_0= '!' ) ) )? ( (lv_name_3_0= ruleQID ) ) ( (lv_annotations_4_0= ruleShowNameAnnotation ) )? otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:723:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( (lv_dependent_1_0= '?' ) ) | ( (lv_parameter_2_0= '!' ) ) )? ( (lv_name_3_0= ruleQID ) ) ( (lv_annotations_4_0= ruleShowNameAnnotation ) )? otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:723:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( (lv_dependent_1_0= '?' ) ) | ( (lv_parameter_2_0= '!' ) ) )? ( (lv_name_3_0= ruleQID ) ) ( (lv_annotations_4_0= ruleShowNameAnnotation ) )? otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:723:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:724:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:724:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:725:3: lv_annotations_0_0= rulePrefixAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_ruleEntity1449);
            	    lv_annotations_0_0=rulePrefixAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"PrefixAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:741:3: ( ( (lv_dependent_1_0= '?' ) ) | ( (lv_parameter_2_0= '!' ) ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:741:4: ( (lv_dependent_1_0= '?' ) )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:741:4: ( (lv_dependent_1_0= '?' ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:742:1: (lv_dependent_1_0= '?' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:742:1: (lv_dependent_1_0= '?' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:743:3: lv_dependent_1_0= '?'
                    {
                    lv_dependent_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEntity1469); 

                            newLeafNode(lv_dependent_1_0, grammarAccess.getEntityAccess().getDependentQuestionMarkKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "dependent", true, "?");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:757:6: ( (lv_parameter_2_0= '!' ) )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:757:6: ( (lv_parameter_2_0= '!' ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:758:1: (lv_parameter_2_0= '!' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:758:1: (lv_parameter_2_0= '!' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:759:3: lv_parameter_2_0= '!'
                    {
                    lv_parameter_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEntity1506); 

                            newLeafNode(lv_parameter_2_0, grammarAccess.getEntityAccess().getParameterExclamationMarkKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "parameter", true, "!");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:772:4: ( (lv_name_3_0= ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:773:1: (lv_name_3_0= ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:773:1: (lv_name_3_0= ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:774:3: lv_name_3_0= ruleQID
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNameQIDParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleEntity1542);
            lv_name_3_0=ruleQID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"QID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:790:2: ( (lv_annotations_4_0= ruleShowNameAnnotation ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:791:1: (lv_annotations_4_0= ruleShowNameAnnotation )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:791:1: (lv_annotations_4_0= ruleShowNameAnnotation )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:792:3: lv_annotations_4_0= ruleShowNameAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsShowNameAnnotationParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleShowNameAnnotation_in_ruleEntity1563);
                    lv_annotations_4_0=ruleShowNameAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_4_0, 
                            		"ShowNameAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEntity1576); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getColonKeyword_4());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:812:1: ( (lv_type_6_0= ruleTypeReference ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:813:1: (lv_type_6_0= ruleTypeReference )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:813:1: (lv_type_6_0= ruleTypeReference )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:814:3: lv_type_6_0= ruleTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getTypeTypeReferenceParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_ruleEntity1597);
            lv_type_6_0=ruleTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"TypeReference");
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelationship"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:838:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:839:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:840:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship1633);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship1643); 

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:847:1: ruleRelationship returns [EObject current=null] : ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) ( ( ruleQID ) ) ( ( ruleQID ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:850:28: ( ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) ( ( ruleQID ) ) ( ( ruleQID ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:851:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) ( ( ruleQID ) ) ( ( ruleQID ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:851:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) ( ( ruleQID ) ) ( ( ruleQID ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:851:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) ( ( ruleQID ) ) ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:851:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:852:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:852:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:853:3: lv_annotations_0_0= rulePrefixAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationshipAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_ruleRelationship1689);
            	    lv_annotations_0_0=rulePrefixAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"PrefixAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:869:3: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:870:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:870:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:871:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getLeftEntityCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleRelationship1713);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:884:2: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:885:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:885:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:886:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleRelationship1736);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:899:2: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:900:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:900:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:901:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getRightEntityCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleRelationship1759);
            ruleQID();

            state._fsp--;

             
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleFunctionApplication"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:922:1: entryRuleFunctionApplication returns [EObject current=null] : iv_ruleFunctionApplication= ruleFunctionApplication EOF ;
    public final EObject entryRuleFunctionApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionApplication = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:923:2: (iv_ruleFunctionApplication= ruleFunctionApplication EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:924:2: iv_ruleFunctionApplication= ruleFunctionApplication EOF
            {
             newCompositeNode(grammarAccess.getFunctionApplicationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFunctionApplication_in_entryRuleFunctionApplication1795);
            iv_ruleFunctionApplication=ruleFunctionApplication();

            state._fsp--;

             current =iv_ruleFunctionApplication; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionApplication1805); 

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
    // $ANTLR end "entryRuleFunctionApplication"


    // $ANTLR start "ruleFunctionApplication"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:931:1: ruleFunctionApplication returns [EObject current=null] : ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) ) ;
    public final EObject ruleFunctionApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:934:28: ( ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:935:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:935:1: ( ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:935:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )* ( ( ruleQID ) ) otherlv_2= '(' ( ( ruleQID ) ) otherlv_4= ')' otherlv_5= '|' otherlv_6= '->' ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:935:2: ( (lv_annotations_0_0= rulePrefixAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:936:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:936:1: (lv_annotations_0_0= rulePrefixAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:937:3: lv_annotations_0_0= rulePrefixAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionApplicationAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_ruleFunctionApplication1851);
            	    lv_annotations_0_0=rulePrefixAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionApplicationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"PrefixAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:953:3: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:954:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:954:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:955:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionApplicationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFunctionApplicationAccess().getFunctionEntityCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleFunctionApplication1875);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionApplication1887); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionApplicationAccess().getLeftParenthesisKeyword_2());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:972:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:973:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:973:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:974:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionApplicationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFunctionApplicationAccess().getInputEntityCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleFunctionApplication1910);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFunctionApplication1922); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionApplicationAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFunctionApplication1934); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionApplicationAccess().getVerticalLineKeyword_5());
                
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFunctionApplication1946); 

                	newLeafNode(otherlv_6, grammarAccess.getFunctionApplicationAccess().getHyphenMinusGreaterThanSignKeyword_6());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:999:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1000:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1000:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1001:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionApplicationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFunctionApplicationAccess().getOutputEntityCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleFunctionApplication1969);
            ruleQID();

            state._fsp--;

             
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
    // $ANTLR end "ruleFunctionApplication"


    // $ANTLR start "entryRuleTypeReference"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1022:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1023:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1024:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_entryRuleTypeReference2005);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeReference2015); 

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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1031:1: ruleTypeReference returns [EObject current=null] : (this_FunctionTypeReference_0= ruleFunctionTypeReference | this_EntityTypeReference_1= ruleEntityTypeReference ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionTypeReference_0 = null;

        EObject this_EntityTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1034:28: ( (this_FunctionTypeReference_0= ruleFunctionTypeReference | this_EntityTypeReference_1= ruleEntityTypeReference ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1035:1: (this_FunctionTypeReference_0= ruleFunctionTypeReference | this_EntityTypeReference_1= ruleEntityTypeReference )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1035:1: (this_FunctionTypeReference_0= ruleFunctionTypeReference | this_EntityTypeReference_1= ruleEntityTypeReference )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1036:5: this_FunctionTypeReference_0= ruleFunctionTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getTypeReferenceAccess().getFunctionTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionTypeReference_in_ruleTypeReference2062);
                    this_FunctionTypeReference_0=ruleFunctionTypeReference();

                    state._fsp--;

                     
                            current = this_FunctionTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1046:5: this_EntityTypeReference_1= ruleEntityTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getTypeReferenceAccess().getEntityTypeReferenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEntityTypeReference_in_ruleTypeReference2089);
                    this_EntityTypeReference_1=ruleEntityTypeReference();

                    state._fsp--;

                     
                            current = this_EntityTypeReference_1; 
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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleFunctionTypeReference"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1062:1: entryRuleFunctionTypeReference returns [EObject current=null] : iv_ruleFunctionTypeReference= ruleFunctionTypeReference EOF ;
    public final EObject entryRuleFunctionTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionTypeReference = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1063:2: (iv_ruleFunctionTypeReference= ruleFunctionTypeReference EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1064:2: iv_ruleFunctionTypeReference= ruleFunctionTypeReference EOF
            {
             newCompositeNode(grammarAccess.getFunctionTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFunctionTypeReference_in_entryRuleFunctionTypeReference2124);
            iv_ruleFunctionTypeReference=ruleFunctionTypeReference();

            state._fsp--;

             current =iv_ruleFunctionTypeReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionTypeReference2134); 

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
    // $ANTLR end "entryRuleFunctionTypeReference"


    // $ANTLR start "ruleFunctionTypeReference"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1071:1: ruleFunctionTypeReference returns [EObject current=null] : ( ( ( ruleQID ) ) otherlv_1= '[' ( ( ruleQID ) ) otherlv_3= '->' ( ( ruleQID ) ) otherlv_5= ']' ) ;
    public final EObject ruleFunctionTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1074:28: ( ( ( ( ruleQID ) ) otherlv_1= '[' ( ( ruleQID ) ) otherlv_3= '->' ( ( ruleQID ) ) otherlv_5= ']' ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1075:1: ( ( ( ruleQID ) ) otherlv_1= '[' ( ( ruleQID ) ) otherlv_3= '->' ( ( ruleQID ) ) otherlv_5= ']' )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1075:1: ( ( ( ruleQID ) ) otherlv_1= '[' ( ( ruleQID ) ) otherlv_3= '->' ( ( ruleQID ) ) otherlv_5= ']' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1075:2: ( ( ruleQID ) ) otherlv_1= '[' ( ( ruleQID ) ) otherlv_3= '->' ( ( ruleQID ) ) otherlv_5= ']'
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1075:2: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1076:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1076:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1077:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionTypeReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFunctionTypeReferenceAccess().getDefinitionEntityTypeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleFunctionTypeReference2182);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFunctionTypeReference2194); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionTypeReferenceAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1094:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1095:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1095:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1096:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionTypeReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFunctionTypeReferenceAccess().getDomainEntityCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleFunctionTypeReference2217);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFunctionTypeReference2229); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionTypeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1113:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1114:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1114:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1115:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionTypeReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFunctionTypeReferenceAccess().getCodomainEntityCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleFunctionTypeReference2252);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFunctionTypeReference2264); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionTypeReferenceAccess().getRightSquareBracketKeyword_5());
                

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
    // $ANTLR end "ruleFunctionTypeReference"


    // $ANTLR start "entryRuleEntityTypeReference"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1140:1: entryRuleEntityTypeReference returns [EObject current=null] : iv_ruleEntityTypeReference= ruleEntityTypeReference EOF ;
    public final EObject entryRuleEntityTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTypeReference = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1141:2: (iv_ruleEntityTypeReference= ruleEntityTypeReference EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1142:2: iv_ruleEntityTypeReference= ruleEntityTypeReference EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityTypeReference_in_entryRuleEntityTypeReference2300);
            iv_ruleEntityTypeReference=ruleEntityTypeReference();

            state._fsp--;

             current =iv_ruleEntityTypeReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityTypeReference2310); 

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
    // $ANTLR end "entryRuleEntityTypeReference"


    // $ANTLR start "ruleEntityTypeReference"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1149:1: ruleEntityTypeReference returns [EObject current=null] : ( ( ( ruleQID ) ) ( (lv_many_1_0= '+' ) )? ) ;
    public final EObject ruleEntityTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_many_1_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1152:28: ( ( ( ( ruleQID ) ) ( (lv_many_1_0= '+' ) )? ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1153:1: ( ( ( ruleQID ) ) ( (lv_many_1_0= '+' ) )? )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1153:1: ( ( ( ruleQID ) ) ( (lv_many_1_0= '+' ) )? )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1153:2: ( ( ruleQID ) ) ( (lv_many_1_0= '+' ) )?
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1153:2: ( ( ruleQID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1154:1: ( ruleQID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1154:1: ( ruleQID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1155:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityTypeReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityTypeReferenceAccess().getDefinitionEntityTypeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_ruleEntityTypeReference2358);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1168:2: ( (lv_many_1_0= '+' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1169:1: (lv_many_1_0= '+' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1169:1: (lv_many_1_0= '+' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1170:3: lv_many_1_0= '+'
                    {
                    lv_many_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEntityTypeReference2376); 

                            newLeafNode(lv_many_1_0, grammarAccess.getEntityTypeReferenceAccess().getManyPlusSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "+");
                    	    

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
    // $ANTLR end "ruleEntityTypeReference"


    // $ANTLR start "entryRuleQID"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1191:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1192:2: (iv_ruleQID= ruleQID EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1193:2: iv_ruleQID= ruleQID EOF
            {
             newCompositeNode(grammarAccess.getQIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_entryRuleQID2427);
            iv_ruleQID=ruleQID();

            state._fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQID2438); 

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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1200:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NAME_0= ruleNAME (kw= '::' this_NAME_2= ruleNAME )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NAME_0 = null;

        AntlrDatatypeRuleToken this_NAME_2 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1203:28: ( (this_NAME_0= ruleNAME (kw= '::' this_NAME_2= ruleNAME )* ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1204:1: (this_NAME_0= ruleNAME (kw= '::' this_NAME_2= ruleNAME )* )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1204:1: (this_NAME_0= ruleNAME (kw= '::' this_NAME_2= ruleNAME )* )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1205:5: this_NAME_0= ruleNAME (kw= '::' this_NAME_2= ruleNAME )*
            {
             
                    newCompositeNode(grammarAccess.getQIDAccess().getNAMEParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNAME_in_ruleQID2485);
            this_NAME_0=ruleNAME();

            state._fsp--;


            		current.merge(this_NAME_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1215:1: (kw= '::' this_NAME_2= ruleNAME )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1216:2: kw= '::' this_NAME_2= ruleNAME
            	    {
            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleQID2504); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQIDAccess().getColonColonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQIDAccess().getNAMEParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleNAME_in_ruleQID2526);
            	    this_NAME_2=ruleNAME();

            	    state._fsp--;


            	    		current.merge(this_NAME_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleQID"


    // $ANTLR start "entryRuleNAME"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1240:1: entryRuleNAME returns [String current=null] : iv_ruleNAME= ruleNAME EOF ;
    public final String entryRuleNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNAME = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1241:2: (iv_ruleNAME= ruleNAME EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1242:2: iv_ruleNAME= ruleNAME EOF
            {
             newCompositeNode(grammarAccess.getNAMERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNAME_in_entryRuleNAME2574);
            iv_ruleNAME=ruleNAME();

            state._fsp--;

             current =iv_ruleNAME.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNAME2585); 

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
    // $ANTLR end "entryRuleNAME"


    // $ANTLR start "ruleNAME"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1249:1: ruleNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= ruleID (kw= '.' this_ID_2= ruleID )* ) ;
    public final AntlrDatatypeRuleToken ruleNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ID_0 = null;

        AntlrDatatypeRuleToken this_ID_2 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1252:28: ( (this_ID_0= ruleID (kw= '.' this_ID_2= ruleID )* ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1253:1: (this_ID_0= ruleID (kw= '.' this_ID_2= ruleID )* )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1253:1: (this_ID_0= ruleID (kw= '.' this_ID_2= ruleID )* )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1254:5: this_ID_0= ruleID (kw= '.' this_ID_2= ruleID )*
            {
             
                    newCompositeNode(grammarAccess.getNAMEAccess().getIDParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleNAME2632);
            this_ID_0=ruleID();

            state._fsp--;


            		current.merge(this_ID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1264:1: (kw= '.' this_ID_2= ruleID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1265:2: kw= '.' this_ID_2= ruleID
            	    {
            	    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNAME2651); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNAMEAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getNAMEAccess().getIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleNAME2673);
            	    this_ID_2=ruleID();

            	    state._fsp--;


            	    		current.merge(this_ID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleNAME"


    // $ANTLR start "entryRuleID"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1289:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1290:2: (iv_ruleID= ruleID EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1291:2: iv_ruleID= ruleID EOF
            {
             newCompositeNode(grammarAccess.getIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID2721);
            iv_ruleID=ruleID();

            state._fsp--;

             current =iv_ruleID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID2732); 

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
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1298:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UCID_0= RULE_UCID | this_LCID_1= RULE_LCID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UCID_0=null;
        Token this_LCID_1=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1301:28: ( (this_UCID_0= RULE_UCID | this_LCID_1= RULE_LCID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1302:1: (this_UCID_0= RULE_UCID | this_LCID_1= RULE_LCID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1302:1: (this_UCID_0= RULE_UCID | this_LCID_1= RULE_LCID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_UCID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_LCID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1302:6: this_UCID_0= RULE_UCID
                    {
                    this_UCID_0=(Token)match(input,RULE_UCID,FollowSets000.FOLLOW_RULE_UCID_in_ruleID2772); 

                    		current.merge(this_UCID_0);
                        
                     
                        newLeafNode(this_UCID_0, grammarAccess.getIDAccess().getUCIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1310:10: this_LCID_1= RULE_LCID
                    {
                    this_LCID_1=(Token)match(input,RULE_LCID,FollowSets000.FOLLOW_RULE_LCID_in_ruleID2798); 

                    		current.merge(this_LCID_1);
                        
                     
                        newLeafNode(this_LCID_1, grammarAccess.getIDAccess().getLCIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleID"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA2_eotS =
        "\67\uffff";
    static final String DFA2_eofS =
        "\1\1\53\uffff\2\6\2\uffff\4\6\1\uffff\2\6";
    static final String DFA2_minS =
        "\1\5\2\uffff\3\5\1\uffff\2\4\3\5\1\uffff\7\5\2\21\4\4\3\5\1\22\3\5\4\21\1\23\2\4\2\5\2\21\13\5";
    static final String DFA2_maxS =
        "\1\32\2\uffff\1\6\2\36\1\uffff\2\36\3\6\1\uffff\2\6\1\32\12\36\3\6\1\22\1\6\6\36\1\23\2\36\2\6\4\36\2\6\4\36\1\6\2\36";
    static final String DFA2_acceptS =
        "\1\uffff\1\4\1\1\3\uffff\1\2\5\uffff\1\3\52\uffff";
    static final String DFA2_specialS =
        "\67\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\1\5\5\uffff\1\2\1\3\13\uffff\2\6",
            "",
            "",
            "\1\7\1\10",
            "\2\6\7\uffff\1\6\1\uffff\1\13\3\uffff\1\14\2\6\4\uffff\1\6\1\uffff\1\12\1\11",
            "\2\6\7\uffff\1\6\1\uffff\1\13\3\uffff\1\14\2\6\4\uffff\1\6\1\uffff\1\12\1\11",
            "",
            "\1\17\1\4\1\5\6\uffff\1\3\13\uffff\2\6\2\uffff\1\16\1\15",
            "\1\17\1\4\1\5\6\uffff\1\3\13\uffff\2\6\2\uffff\1\16\1\15",
            "\1\20\1\21",
            "\1\22\1\23",
            "\1\24\1\25",
            "",
            "\1\26\1\27",
            "\1\30\1\31",
            "\1\4\1\5\6\uffff\1\3\13\uffff\2\6",
            "\2\6\7\uffff\1\6\1\uffff\1\13\3\uffff\1\14\2\6\4\uffff\1\6\1\uffff\1\12\1\11",
            "\2\6\7\uffff\1\6\1\uffff\1\13\3\uffff\1\14\2\6\4\uffff\1\6\1\uffff\1\12\1\11",
            "\2\6\7\uffff\1\6\1\uffff\1\13\3\uffff\1\14\2\6\4\uffff\1\6\1\uffff\1\12\1\32",
            "\2\6\7\uffff\1\6\1\uffff\1\13\3\uffff\1\14\2\6\4\uffff\1\6\1\uffff\1\12\1\32",
            "\1\35\13\uffff\1\34\1\33",
            "\1\35\13\uffff\1\34\1\33",
            "\1\17\1\4\1\5\6\uffff\1\3\13\uffff\2\6\2\uffff\1\16\1\15",
            "\1\17\1\4\1\5\6\uffff\1\3\13\uffff\2\6\2\uffff\1\16\1\15",
            "\1\17\1\4\1\5\6\uffff\1\3\13\uffff\2\6\2\uffff\1\16\1\36",
            "\1\17\1\4\1\5\6\uffff\1\3\13\uffff\2\6\2\uffff\1\16\1\36",
            "\1\37\1\40",
            "\1\41\1\42",
            "\1\43\1\44",
            "\1\45",
            "\1\46\1\47",
            "\2\6\7\uffff\1\6\1\uffff\1\13\3\uffff\1\14\2\6\4\uffff\1\6\1\uffff\1\12\1\32",
            "\2\6\7\uffff\1\6\1\uffff\1\13\3\uffff\1\14\2\6\4\uffff\1\6\1\uffff\1\12\1\32",
            "\1\35\13\uffff\1\34\1\33",
            "\1\35\13\uffff\1\34\1\33",
            "\1\35\13\uffff\1\34\1\50",
            "\1\35\13\uffff\1\34\1\50",
            "\1\51",
            "\1\17\1\4\1\5\6\uffff\1\3\13\uffff\2\6\2\uffff\1\16\1\36",
            "\1\17\1\4\1\5\6\uffff\1\3\13\uffff\2\6\2\uffff\1\16\1\36",
            "\1\52\1\53",
            "\1\54\1\55",
            "\1\35\13\uffff\1\34\1\50",
            "\1\35\13\uffff\1\34\1\50",
            "\2\6\5\uffff\2\6\6\uffff\1\14\4\uffff\2\6\2\uffff\1\57\1\56",
            "\2\6\5\uffff\2\6\6\uffff\1\14\4\uffff\2\6\2\uffff\1\57\1\56",
            "\1\60\1\61",
            "\1\62\1\63",
            "\2\6\5\uffff\2\6\6\uffff\1\14\4\uffff\2\6\2\uffff\1\57\1\56",
            "\2\6\5\uffff\2\6\6\uffff\1\14\4\uffff\2\6\2\uffff\1\57\1\56",
            "\2\6\5\uffff\2\6\6\uffff\1\14\4\uffff\2\6\2\uffff\1\57\1\64",
            "\2\6\5\uffff\2\6\6\uffff\1\14\4\uffff\2\6\2\uffff\1\57\1\64",
            "\1\65\1\66",
            "\2\6\5\uffff\2\6\6\uffff\1\14\4\uffff\2\6\2\uffff\1\57\1\64",
            "\2\6\5\uffff\2\6\6\uffff\1\14\4\uffff\2\6\2\uffff\1\57\1\64"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 120:2: ( (otherlv_3= 'import' ( ( ruleQID ) ) ) | ( (lv_declarations_5_0= ruleDeclaration ) ) | ( (lv_bindings_6_0= ruleLink ) ) )*";
        }
    }
    static final String DFA3_eotS =
        "\107\uffff";
    static final String DFA3_eofS =
        "\26\uffff\2\15\10\uffff\1\15\5\uffff\4\15\10\uffff\2\15\11\uffff\1\15\11\uffff";
    static final String DFA3_minS =
        "\4\5\1\uffff\2\4\2\5\1\4\1\5\3\uffff\7\5\1\17\2\5\4\4\1\5\1\25\3\5\1\uffff\10\5\2\23\2\4\6\5\4\23\2\17\4\5\2\23\4\17\1\5\2\17";
    static final String DFA3_maxS =
        "\1\32\1\6\2\36\1\uffff\2\36\2\6\1\4\1\6\3\uffff\2\6\1\32\4\36\1\17\6\36\1\6\1\33\2\6\1\32\1\uffff\2\6\12\36\4\6\10\36\3\6\1\32\6\36\1\6\2\36";
    static final String DFA3_acceptS =
        "\4\uffff\1\3\6\uffff\1\4\1\5\1\1\23\uffff\1\2\45\uffff";
    static final String DFA3_specialS =
        "\107\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\3\6\uffff\1\1\13\uffff\2\4",
            "\1\5\1\6",
            "\2\13\7\uffff\1\11\1\uffff\1\14\4\uffff\1\12\1\15\4\uffff\1\4\1\uffff\1\10\1\7",
            "\2\13\7\uffff\1\11\1\uffff\1\14\4\uffff\1\12\1\15\4\uffff\1\4\1\uffff\1\10\1\7",
            "",
            "\1\20\1\2\1\3\6\uffff\1\1\13\uffff\2\4\2\uffff\1\17\1\16",
            "\1\20\1\2\1\3\6\uffff\1\1\13\uffff\2\4\2\uffff\1\17\1\16",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25",
            "\1\26\1\27",
            "",
            "",
            "",
            "\1\30\1\31",
            "\1\32\1\33",
            "\1\2\1\3\6\uffff\1\1\13\uffff\2\4",
            "\2\13\7\uffff\1\11\1\uffff\1\14\4\uffff\1\12\1\15\4\uffff\1\4\1\uffff\1\10\1\7",
            "\2\13\7\uffff\1\11\1\uffff\1\14\4\uffff\1\12\1\15\4\uffff\1\4\1\uffff\1\10\1\7",
            "\2\13\7\uffff\1\11\1\uffff\1\14\4\uffff\1\12\1\15\4\uffff\1\4\1\uffff\1\10\1\34",
            "\2\13\7\uffff\1\11\1\uffff\1\14\4\uffff\1\12\1\15\4\uffff\1\4\1\uffff\1\10\1\34",
            "\1\35",
            "\2\15\5\uffff\2\15\1\42\11\uffff\1\41\2\15\1\uffff\1\40\1\37\1\36",
            "\2\15\5\uffff\2\15\1\42\11\uffff\1\41\2\15\1\uffff\1\40\1\37\1\36",
            "\1\20\1\2\1\3\6\uffff\1\1\13\uffff\2\4\2\uffff\1\17\1\16",
            "\1\20\1\2\1\3\6\uffff\1\1\13\uffff\2\4\2\uffff\1\17\1\16",
            "\1\20\1\2\1\3\6\uffff\1\1\13\uffff\2\4\2\uffff\1\17\1\43",
            "\1\20\1\2\1\3\6\uffff\1\1\13\uffff\2\4\2\uffff\1\17\1\43",
            "\1\44\1\45",
            "\1\12\1\15\4\uffff\1\4",
            "\1\46\1\47",
            "\1\50\1\51",
            "\2\15\5\uffff\2\15\12\uffff\1\41\2\15",
            "",
            "\1\52\1\53",
            "\1\54\1\55",
            "\2\13\7\uffff\1\11\1\uffff\1\14\4\uffff\1\12\1\15\4\uffff\1\4\1\uffff\1\10\1\34",
            "\2\13\7\uffff\1\11\1\uffff\1\14\4\uffff\1\12\1\15\4\uffff\1\4\1\uffff\1\10\1\34",
            "\2\15\5\uffff\2\15\1\42\11\uffff\1\41\2\15\1\uffff\1\40\1\37\1\36",
            "\2\15\5\uffff\2\15\1\42\11\uffff\1\41\2\15\1\uffff\1\40\1\37\1\36",
            "\2\15\5\uffff\2\15\1\42\11\uffff\1\41\2\15\1\uffff\1\40\1\37\1\56",
            "\2\15\5\uffff\2\15\1\42\11\uffff\1\41\2\15\1\uffff\1\40\1\37\1\56",
            "\1\61\11\uffff\1\60\1\57",
            "\1\61\11\uffff\1\60\1\57",
            "\1\20\1\2\1\3\6\uffff\1\1\13\uffff\2\4\2\uffff\1\17\1\43",
            "\1\20\1\2\1\3\6\uffff\1\1\13\uffff\2\4\2\uffff\1\17\1\43",
            "\1\62\1\63",
            "\1\64\1\65",
            "\1\66\1\67",
            "\1\70\1\71",
            "\2\15\5\uffff\2\15\1\42\11\uffff\1\41\2\15\1\uffff\1\40\1\37\1\56",
            "\2\15\5\uffff\2\15\1\42\11\uffff\1\41\2\15\1\uffff\1\40\1\37\1\56",
            "\1\61\11\uffff\1\60\1\57",
            "\1\61\11\uffff\1\60\1\57",
            "\1\61\11\uffff\1\60\1\72",
            "\1\61\11\uffff\1\60\1\72",
            "\1\75\15\uffff\1\74\1\73",
            "\1\75\15\uffff\1\74\1\73",
            "\1\76\1\77",
            "\1\100\1\101",
            "\1\102\1\103",
            "\2\15\5\uffff\2\15\12\uffff\1\41\2\15",
            "\1\61\11\uffff\1\60\1\72",
            "\1\61\11\uffff\1\60\1\72",
            "\1\75\15\uffff\1\74\1\73",
            "\1\75\15\uffff\1\74\1\73",
            "\1\75\15\uffff\1\74\1\104",
            "\1\75\15\uffff\1\74\1\104",
            "\1\105\1\106",
            "\1\75\15\uffff\1\74\1\104",
            "\1\75\15\uffff\1\74\1\104"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "198:1: (this_EntityType_0= ruleEntityType | this_RelationshipType_1= ruleRelationshipType | this_Entity_2= ruleEntity | this_Relationship_3= ruleRelationship | this_FunctionApplication_4= ruleFunctionApplication )";
        }
    }
    static final String DFA17_eotS =
        "\16\uffff";
    static final String DFA17_eofS =
        "\1\uffff\2\6\4\uffff\4\6\1\uffff\2\6";
    static final String DFA17_minS =
        "\5\5\2\uffff\7\5";
    static final String DFA17_maxS =
        "\1\6\2\36\2\6\2\uffff\4\36\1\6\2\36";
    static final String DFA17_acceptS =
        "\5\uffff\1\1\1\2\7\uffff";
    static final String DFA17_specialS =
        "\16\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\2",
            "\2\6\5\uffff\2\6\1\5\11\uffff\3\6\1\uffff\1\6\1\4\1\3",
            "\2\6\5\uffff\2\6\1\5\11\uffff\3\6\1\uffff\1\6\1\4\1\3",
            "\1\7\1\10",
            "\1\11\1\12",
            "",
            "",
            "\2\6\5\uffff\2\6\1\5\11\uffff\3\6\1\uffff\1\6\1\4\1\3",
            "\2\6\5\uffff\2\6\1\5\11\uffff\3\6\1\uffff\1\6\1\4\1\3",
            "\2\6\5\uffff\2\6\1\5\11\uffff\3\6\1\uffff\1\6\1\4\1\13",
            "\2\6\5\uffff\2\6\1\5\11\uffff\3\6\1\uffff\1\6\1\4\1\13",
            "\1\14\1\15",
            "\2\6\5\uffff\2\6\1\5\11\uffff\3\6\1\uffff\1\6\1\4\1\13",
            "\2\6\5\uffff\2\6\1\5\11\uffff\3\6\1\uffff\1\6\1\4\1\13"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1035:1: (this_FunctionTypeReference_0= ruleFunctionTypeReference | this_EntityTypeReference_1= ruleEntityTypeReference )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMegamodel_in_entryRuleMegamodel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegamodel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_ruleMegamodel131 = new BitSet(new long[]{0x0000000000002800L});
        public static final BitSet FOLLOW_11_in_ruleMegamodel144 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleMegamodel165 = new BitSet(new long[]{0x0000000006003862L});
        public static final BitSet FOLLOW_12_in_ruleMegamodel179 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleMegamodel202 = new BitSet(new long[]{0x0000000006003862L});
        public static final BitSet FOLLOW_ruleDeclaration_in_ruleMegamodel230 = new BitSet(new long[]{0x0000000006003862L});
        public static final BitSet FOLLOW_ruleLink_in_ruleMegamodel257 = new BitSet(new long[]{0x0000000006003862L});
        public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityType_in_ruleDeclaration352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipType_in_ruleDeclaration379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_ruleDeclaration406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleDeclaration433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionApplication_in_ruleDeclaration460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_entryRulePrefixAnnotation495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixAnnotation505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rulePrefixAnnotation542 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_rulePrefixAnnotation563 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePrefixAnnotation580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShowNameAnnotation_in_entryRuleShowNameAnnotation622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShowNameAnnotation632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleShowNameAnnotation669 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleShowNameAnnotation686 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleShowNameAnnotation703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_ruleLink795 = new BitSet(new long[]{0x0000000000002860L});
        public static final BitSet FOLLOW_ruleQID_in_ruleLink819 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16_in_ruleLink832 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleLink855 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLink867 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLink879 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLink891 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleLink914 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleLink928 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLink945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType986 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityType996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_ruleEntityType1042 = new BitSet(new long[]{0x0000000000002860L});
        public static final BitSet FOLLOW_ruleQID_in_ruleEntityType1064 = new BitSet(new long[]{0x0000000000604000L});
        public static final BitSet FOLLOW_ruleShowNameAnnotation_in_ruleEntityType1085 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleEntityType1100 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleTypeReference_in_ruleEntityType1121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEntityType1141 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEntityType1153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipType_in_entryRuleRelationshipType1191 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipType1201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_ruleRelationshipType1247 = new BitSet(new long[]{0x0000000000002860L});
        public static final BitSet FOLLOW_ruleQID_in_ruleRelationshipType1269 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_ruleShowNameAnnotation_in_ruleRelationshipType1290 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRelationshipType1303 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleTypeReference_in_ruleRelationshipType1324 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleRelationshipType1336 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleTypeReference_in_ruleRelationshipType1357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1393 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity1403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_ruleEntity1449 = new BitSet(new long[]{0x0000000006002860L});
        public static final BitSet FOLLOW_25_in_ruleEntity1469 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_26_in_ruleEntity1506 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleEntity1542 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_ruleShowNameAnnotation_in_ruleEntity1563 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleEntity1576 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleTypeReference_in_ruleEntity1597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship1633 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship1643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_ruleRelationship1689 = new BitSet(new long[]{0x0000000000002860L});
        public static final BitSet FOLLOW_ruleQID_in_ruleRelationship1713 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleRelationship1736 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleRelationship1759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionApplication_in_entryRuleFunctionApplication1795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionApplication1805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_ruleFunctionApplication1851 = new BitSet(new long[]{0x0000000000002860L});
        public static final BitSet FOLLOW_ruleQID_in_ruleFunctionApplication1875 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionApplication1887 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleFunctionApplication1910 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFunctionApplication1922 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFunctionApplication1934 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFunctionApplication1946 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleFunctionApplication1969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference2005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionTypeReference_in_ruleTypeReference2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityTypeReference_in_ruleTypeReference2089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionTypeReference_in_entryRuleFunctionTypeReference2124 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTypeReference2134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_ruleFunctionTypeReference2182 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFunctionTypeReference2194 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleFunctionTypeReference2217 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFunctionTypeReference2229 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleQID_in_ruleFunctionTypeReference2252 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFunctionTypeReference2264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityTypeReference_in_entryRuleEntityTypeReference2300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityTypeReference2310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_ruleEntityTypeReference2358 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleEntityTypeReference2376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_entryRuleQID2427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQID2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNAME_in_ruleQID2485 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleQID2504 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleNAME_in_ruleQID2526 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleNAME_in_entryRuleNAME2574 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNAME2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleNAME2632 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleNAME2651 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleID_in_ruleNAME2673 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID2721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID2732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_UCID_in_ruleID2772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LCID_in_ruleID2798 = new BitSet(new long[]{0x0000000000000002L});
    }


}