package org.softlang.megal.language.ui.contentassist.antlr.internal; 

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
import org.softlang.megal.language.services.MegalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UCID", "RULE_LCID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_SEGMENT", "'model'", "'import'", "'@'", "'['", "']'", "'='", "'('", "')'", "'|'", "'->'", "'<'", "'as'", "'entity'", "'*'", "':'", "'::'", "'.'", "'?'", "'!'", "'+'"
    };
    public static final int RULE_SEGMENT=10;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_LCID=5;
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
    public static final int RULE_UCID=4;
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
    public String getGrammarFileName() { return "../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g"; }


     
     	private MegalGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MegalGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMegamodel"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:60:1: entryRuleMegamodel : ruleMegamodel EOF ;
    public final void entryRuleMegamodel() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:61:1: ( ruleMegamodel EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:62:1: ruleMegamodel EOF
            {
             before(grammarAccess.getMegamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegamodel_in_entryRuleMegamodel61);
            ruleMegamodel();

            state._fsp--;

             after(grammarAccess.getMegamodelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegamodel68); 

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
    // $ANTLR end "entryRuleMegamodel"


    // $ANTLR start "ruleMegamodel"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:69:1: ruleMegamodel : ( ( rule__Megamodel__Group__0 ) ) ;
    public final void ruleMegamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:73:2: ( ( ( rule__Megamodel__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:74:1: ( ( rule__Megamodel__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:74:1: ( ( rule__Megamodel__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:75:1: ( rule__Megamodel__Group__0 )
            {
             before(grammarAccess.getMegamodelAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:76:1: ( rule__Megamodel__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:76:2: rule__Megamodel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group__0_in_ruleMegamodel94);
            rule__Megamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegamodel"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:88:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:89:1: ( ruleDeclaration EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:90:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_entryRuleDeclaration121);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaration128); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:97:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:101:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:102:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:102:1: ( ( rule__Declaration__Alternatives ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:103:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:104:1: ( rule__Declaration__Alternatives )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:104:2: rule__Declaration__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration154);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRulePrefixAnnotation"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:116:1: entryRulePrefixAnnotation : rulePrefixAnnotation EOF ;
    public final void entryRulePrefixAnnotation() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:117:1: ( rulePrefixAnnotation EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:118:1: rulePrefixAnnotation EOF
            {
             before(grammarAccess.getPrefixAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_entryRulePrefixAnnotation181);
            rulePrefixAnnotation();

            state._fsp--;

             after(grammarAccess.getPrefixAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixAnnotation188); 

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
    // $ANTLR end "entryRulePrefixAnnotation"


    // $ANTLR start "rulePrefixAnnotation"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:125:1: rulePrefixAnnotation : ( ( rule__PrefixAnnotation__Group__0 ) ) ;
    public final void rulePrefixAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:129:2: ( ( ( rule__PrefixAnnotation__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:130:1: ( ( rule__PrefixAnnotation__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:130:1: ( ( rule__PrefixAnnotation__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:131:1: ( rule__PrefixAnnotation__Group__0 )
            {
             before(grammarAccess.getPrefixAnnotationAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:132:1: ( rule__PrefixAnnotation__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:132:2: rule__PrefixAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrefixAnnotation__Group__0_in_rulePrefixAnnotation214);
            rule__PrefixAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixAnnotation"


    // $ANTLR start "entryRuleShowNameAnnotation"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:144:1: entryRuleShowNameAnnotation : ruleShowNameAnnotation EOF ;
    public final void entryRuleShowNameAnnotation() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:145:1: ( ruleShowNameAnnotation EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:146:1: ruleShowNameAnnotation EOF
            {
             before(grammarAccess.getShowNameAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShowNameAnnotation_in_entryRuleShowNameAnnotation241);
            ruleShowNameAnnotation();

            state._fsp--;

             after(grammarAccess.getShowNameAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShowNameAnnotation248); 

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
    // $ANTLR end "entryRuleShowNameAnnotation"


    // $ANTLR start "ruleShowNameAnnotation"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:153:1: ruleShowNameAnnotation : ( ( rule__ShowNameAnnotation__Group__0 ) ) ;
    public final void ruleShowNameAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:157:2: ( ( ( rule__ShowNameAnnotation__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:158:1: ( ( rule__ShowNameAnnotation__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:158:1: ( ( rule__ShowNameAnnotation__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:159:1: ( rule__ShowNameAnnotation__Group__0 )
            {
             before(grammarAccess.getShowNameAnnotationAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:160:1: ( rule__ShowNameAnnotation__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:160:2: rule__ShowNameAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ShowNameAnnotation__Group__0_in_ruleShowNameAnnotation274);
            rule__ShowNameAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShowNameAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShowNameAnnotation"


    // $ANTLR start "entryRuleLink"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:172:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:173:1: ( ruleLink EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:174:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink301);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink308); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:181:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:185:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:186:1: ( ( rule__Link__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:186:1: ( ( rule__Link__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:187:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:188:1: ( rule__Link__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:188:2: rule__Link__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0_in_ruleLink334);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleEntityType"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:200:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:201:1: ( ruleEntityType EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:202:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityType_in_entryRuleEntityType361);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityType368); 

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:209:1: ruleEntityType : ( ( rule__EntityType__Group__0 ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:213:2: ( ( ( rule__EntityType__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:214:1: ( ( rule__EntityType__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:214:1: ( ( rule__EntityType__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:215:1: ( rule__EntityType__Group__0 )
            {
             before(grammarAccess.getEntityTypeAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:216:1: ( rule__EntityType__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:216:2: rule__EntityType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group__0_in_ruleEntityType394);
            rule__EntityType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleRelationshipType"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:228:1: entryRuleRelationshipType : ruleRelationshipType EOF ;
    public final void entryRuleRelationshipType() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:229:1: ( ruleRelationshipType EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:230:1: ruleRelationshipType EOF
            {
             before(grammarAccess.getRelationshipTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationshipType_in_entryRuleRelationshipType421);
            ruleRelationshipType();

            state._fsp--;

             after(grammarAccess.getRelationshipTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationshipType428); 

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
    // $ANTLR end "entryRuleRelationshipType"


    // $ANTLR start "ruleRelationshipType"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:237:1: ruleRelationshipType : ( ( rule__RelationshipType__Group__0 ) ) ;
    public final void ruleRelationshipType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:241:2: ( ( ( rule__RelationshipType__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:242:1: ( ( rule__RelationshipType__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:242:1: ( ( rule__RelationshipType__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:243:1: ( rule__RelationshipType__Group__0 )
            {
             before(grammarAccess.getRelationshipTypeAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:244:1: ( rule__RelationshipType__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:244:2: rule__RelationshipType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__0_in_ruleRelationshipType454);
            rule__RelationshipType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "entryRuleEntity"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:256:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:257:1: ( ruleEntity EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:258:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity481);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity488); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:265:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:269:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:270:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:270:1: ( ( rule__Entity__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:271:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:272:1: ( rule__Entity__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:272:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0_in_ruleEntity514);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelationship"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:284:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:285:1: ( ruleRelationship EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:286:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship541);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship548); 

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:293:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:297:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:298:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:298:1: ( ( rule__Relationship__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:299:1: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:300:1: ( rule__Relationship__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:300:2: rule__Relationship__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__0_in_ruleRelationship574);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleFunctionApplication"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:312:1: entryRuleFunctionApplication : ruleFunctionApplication EOF ;
    public final void entryRuleFunctionApplication() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:313:1: ( ruleFunctionApplication EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:314:1: ruleFunctionApplication EOF
            {
             before(grammarAccess.getFunctionApplicationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFunctionApplication_in_entryRuleFunctionApplication601);
            ruleFunctionApplication();

            state._fsp--;

             after(grammarAccess.getFunctionApplicationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionApplication608); 

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
    // $ANTLR end "entryRuleFunctionApplication"


    // $ANTLR start "ruleFunctionApplication"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:321:1: ruleFunctionApplication : ( ( rule__FunctionApplication__Group__0 ) ) ;
    public final void ruleFunctionApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:325:2: ( ( ( rule__FunctionApplication__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:326:1: ( ( rule__FunctionApplication__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:326:1: ( ( rule__FunctionApplication__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:327:1: ( rule__FunctionApplication__Group__0 )
            {
             before(grammarAccess.getFunctionApplicationAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:328:1: ( rule__FunctionApplication__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:328:2: rule__FunctionApplication__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__0_in_ruleFunctionApplication634);
            rule__FunctionApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionApplication"


    // $ANTLR start "entryRuleTypeReference"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:340:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:341:1: ( ruleTypeReference EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:342:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_entryRuleTypeReference661);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeReference668); 

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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:349:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:353:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:354:1: ( ( rule__TypeReference__Alternatives ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:354:1: ( ( rule__TypeReference__Alternatives ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:355:1: ( rule__TypeReference__Alternatives )
            {
             before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:356:1: ( rule__TypeReference__Alternatives )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:356:2: rule__TypeReference__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypeReference__Alternatives_in_ruleTypeReference694);
            rule__TypeReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleFunctionTypeReference"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:368:1: entryRuleFunctionTypeReference : ruleFunctionTypeReference EOF ;
    public final void entryRuleFunctionTypeReference() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:369:1: ( ruleFunctionTypeReference EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:370:1: ruleFunctionTypeReference EOF
            {
             before(grammarAccess.getFunctionTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFunctionTypeReference_in_entryRuleFunctionTypeReference721);
            ruleFunctionTypeReference();

            state._fsp--;

             after(grammarAccess.getFunctionTypeReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionTypeReference728); 

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
    // $ANTLR end "entryRuleFunctionTypeReference"


    // $ANTLR start "ruleFunctionTypeReference"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:377:1: ruleFunctionTypeReference : ( ( rule__FunctionTypeReference__Group__0 ) ) ;
    public final void ruleFunctionTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:381:2: ( ( ( rule__FunctionTypeReference__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:382:1: ( ( rule__FunctionTypeReference__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:382:1: ( ( rule__FunctionTypeReference__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:383:1: ( rule__FunctionTypeReference__Group__0 )
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:384:1: ( rule__FunctionTypeReference__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:384:2: rule__FunctionTypeReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__0_in_ruleFunctionTypeReference754);
            rule__FunctionTypeReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTypeReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionTypeReference"


    // $ANTLR start "entryRuleEntityTypeReference"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:396:1: entryRuleEntityTypeReference : ruleEntityTypeReference EOF ;
    public final void entryRuleEntityTypeReference() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:397:1: ( ruleEntityTypeReference EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:398:1: ruleEntityTypeReference EOF
            {
             before(grammarAccess.getEntityTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityTypeReference_in_entryRuleEntityTypeReference781);
            ruleEntityTypeReference();

            state._fsp--;

             after(grammarAccess.getEntityTypeReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityTypeReference788); 

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
    // $ANTLR end "entryRuleEntityTypeReference"


    // $ANTLR start "ruleEntityTypeReference"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:405:1: ruleEntityTypeReference : ( ( rule__EntityTypeReference__Group__0 ) ) ;
    public final void ruleEntityTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:409:2: ( ( ( rule__EntityTypeReference__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:410:1: ( ( rule__EntityTypeReference__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:410:1: ( ( rule__EntityTypeReference__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:411:1: ( rule__EntityTypeReference__Group__0 )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:412:1: ( rule__EntityTypeReference__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:412:2: rule__EntityTypeReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityTypeReference__Group__0_in_ruleEntityTypeReference814);
            rule__EntityTypeReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityTypeReference"


    // $ANTLR start "entryRuleQID"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:424:1: entryRuleQID : ruleQID EOF ;
    public final void entryRuleQID() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:425:1: ( ruleQID EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:426:1: ruleQID EOF
            {
             before(grammarAccess.getQIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_entryRuleQID841);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getQIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQID848); 

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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:433:1: ruleQID : ( ( rule__QID__Group__0 ) ) ;
    public final void ruleQID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:437:2: ( ( ( rule__QID__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:438:1: ( ( rule__QID__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:438:1: ( ( rule__QID__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:439:1: ( rule__QID__Group__0 )
            {
             before(grammarAccess.getQIDAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:440:1: ( rule__QID__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:440:2: rule__QID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QID__Group__0_in_ruleQID874);
            rule__QID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQID"


    // $ANTLR start "entryRuleNAME"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:452:1: entryRuleNAME : ruleNAME EOF ;
    public final void entryRuleNAME() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:453:1: ( ruleNAME EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:454:1: ruleNAME EOF
            {
             before(grammarAccess.getNAMERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNAME_in_entryRuleNAME901);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getNAMERule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNAME908); 

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
    // $ANTLR end "entryRuleNAME"


    // $ANTLR start "ruleNAME"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:461:1: ruleNAME : ( ( rule__NAME__Group__0 ) ) ;
    public final void ruleNAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:465:2: ( ( ( rule__NAME__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:466:1: ( ( rule__NAME__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:466:1: ( ( rule__NAME__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:467:1: ( rule__NAME__Group__0 )
            {
             before(grammarAccess.getNAMEAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:468:1: ( rule__NAME__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:468:2: rule__NAME__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NAME__Group__0_in_ruleNAME934);
            rule__NAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNAMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNAME"


    // $ANTLR start "entryRuleID"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:480:1: entryRuleID : ruleID EOF ;
    public final void entryRuleID() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:481:1: ( ruleID EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:482:1: ruleID EOF
            {
             before(grammarAccess.getIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID961);
            ruleID();

            state._fsp--;

             after(grammarAccess.getIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID968); 

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
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:489:1: ruleID : ( ( rule__ID__Alternatives ) ) ;
    public final void ruleID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:493:2: ( ( ( rule__ID__Alternatives ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:494:1: ( ( rule__ID__Alternatives ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:494:1: ( ( rule__ID__Alternatives ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:495:1: ( rule__ID__Alternatives )
            {
             before(grammarAccess.getIDAccess().getAlternatives()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:496:1: ( rule__ID__Alternatives )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:496:2: rule__ID__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ID__Alternatives_in_ruleID994);
            rule__ID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleID"


    // $ANTLR start "rule__Megamodel__Alternatives_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:508:1: rule__Megamodel__Alternatives_3 : ( ( ( rule__Megamodel__Group_3_0__0 ) ) | ( ( rule__Megamodel__DeclarationsAssignment_3_1 ) ) | ( ( rule__Megamodel__BindingsAssignment_3_2 ) ) );
    public final void rule__Megamodel__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:512:1: ( ( ( rule__Megamodel__Group_3_0__0 ) ) | ( ( rule__Megamodel__DeclarationsAssignment_3_1 ) ) | ( ( rule__Megamodel__BindingsAssignment_3_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:513:1: ( ( rule__Megamodel__Group_3_0__0 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:513:1: ( ( rule__Megamodel__Group_3_0__0 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:514:1: ( rule__Megamodel__Group_3_0__0 )
                    {
                     before(grammarAccess.getMegamodelAccess().getGroup_3_0()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:515:1: ( rule__Megamodel__Group_3_0__0 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:515:2: rule__Megamodel__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group_3_0__0_in_rule__Megamodel__Alternatives_31030);
                    rule__Megamodel__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegamodelAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:519:6: ( ( rule__Megamodel__DeclarationsAssignment_3_1 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:519:6: ( ( rule__Megamodel__DeclarationsAssignment_3_1 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:520:1: ( rule__Megamodel__DeclarationsAssignment_3_1 )
                    {
                     before(grammarAccess.getMegamodelAccess().getDeclarationsAssignment_3_1()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:521:1: ( rule__Megamodel__DeclarationsAssignment_3_1 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:521:2: rule__Megamodel__DeclarationsAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Megamodel__DeclarationsAssignment_3_1_in_rule__Megamodel__Alternatives_31048);
                    rule__Megamodel__DeclarationsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegamodelAccess().getDeclarationsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:525:6: ( ( rule__Megamodel__BindingsAssignment_3_2 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:525:6: ( ( rule__Megamodel__BindingsAssignment_3_2 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:526:1: ( rule__Megamodel__BindingsAssignment_3_2 )
                    {
                     before(grammarAccess.getMegamodelAccess().getBindingsAssignment_3_2()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:527:1: ( rule__Megamodel__BindingsAssignment_3_2 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:527:2: rule__Megamodel__BindingsAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Megamodel__BindingsAssignment_3_2_in_rule__Megamodel__Alternatives_31066);
                    rule__Megamodel__BindingsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegamodelAccess().getBindingsAssignment_3_2()); 

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
    // $ANTLR end "rule__Megamodel__Alternatives_3"


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:536:1: rule__Declaration__Alternatives : ( ( ruleEntityType ) | ( ruleRelationshipType ) | ( ruleEntity ) | ( ruleRelationship ) | ( ruleFunctionApplication ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:540:1: ( ( ruleEntityType ) | ( ruleRelationshipType ) | ( ruleEntity ) | ( ruleRelationship ) | ( ruleFunctionApplication ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:541:1: ( ruleEntityType )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:541:1: ( ruleEntityType )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:542:1: ruleEntityType
                    {
                     before(grammarAccess.getDeclarationAccess().getEntityTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEntityType_in_rule__Declaration__Alternatives1099);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEntityTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:547:6: ( ruleRelationshipType )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:547:6: ( ruleRelationshipType )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:548:1: ruleRelationshipType
                    {
                     before(grammarAccess.getDeclarationAccess().getRelationshipTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRelationshipType_in_rule__Declaration__Alternatives1116);
                    ruleRelationshipType();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRelationshipTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:553:6: ( ruleEntity )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:553:6: ( ruleEntity )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:554:1: ruleEntity
                    {
                     before(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Declaration__Alternatives1133);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:559:6: ( ruleRelationship )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:559:6: ( ruleRelationship )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:560:1: ruleRelationship
                    {
                     before(grammarAccess.getDeclarationAccess().getRelationshipParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_rule__Declaration__Alternatives1150);
                    ruleRelationship();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRelationshipParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:565:6: ( ruleFunctionApplication )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:565:6: ( ruleFunctionApplication )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:566:1: ruleFunctionApplication
                    {
                     before(grammarAccess.getDeclarationAccess().getFunctionApplicationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionApplication_in_rule__Declaration__Alternatives1167);
                    ruleFunctionApplication();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getFunctionApplicationParserRuleCall_4()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__EntityType__Alternatives_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:576:1: rule__EntityType__Alternatives_3 : ( ( ( rule__EntityType__Group_3_0__0 ) ) | ( ( rule__EntityType__Group_3_1__0 ) ) );
    public final void rule__EntityType__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:580:1: ( ( ( rule__EntityType__Group_3_0__0 ) ) | ( ( rule__EntityType__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:581:1: ( ( rule__EntityType__Group_3_0__0 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:581:1: ( ( rule__EntityType__Group_3_0__0 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:582:1: ( rule__EntityType__Group_3_0__0 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getGroup_3_0()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:583:1: ( rule__EntityType__Group_3_0__0 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:583:2: rule__EntityType__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group_3_0__0_in_rule__EntityType__Alternatives_31199);
                    rule__EntityType__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityTypeAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:587:6: ( ( rule__EntityType__Group_3_1__0 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:587:6: ( ( rule__EntityType__Group_3_1__0 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:588:1: ( rule__EntityType__Group_3_1__0 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getGroup_3_1()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:589:1: ( rule__EntityType__Group_3_1__0 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:589:2: rule__EntityType__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group_3_1__0_in_rule__EntityType__Alternatives_31217);
                    rule__EntityType__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityTypeAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__EntityType__Alternatives_3"


    // $ANTLR start "rule__Entity__Alternatives_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:598:1: rule__Entity__Alternatives_1 : ( ( ( rule__Entity__DependentAssignment_1_0 ) ) | ( ( rule__Entity__ParameterAssignment_1_1 ) ) );
    public final void rule__Entity__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:602:1: ( ( ( rule__Entity__DependentAssignment_1_0 ) ) | ( ( rule__Entity__ParameterAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:603:1: ( ( rule__Entity__DependentAssignment_1_0 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:603:1: ( ( rule__Entity__DependentAssignment_1_0 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:604:1: ( rule__Entity__DependentAssignment_1_0 )
                    {
                     before(grammarAccess.getEntityAccess().getDependentAssignment_1_0()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:605:1: ( rule__Entity__DependentAssignment_1_0 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:605:2: rule__Entity__DependentAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__DependentAssignment_1_0_in_rule__Entity__Alternatives_11250);
                    rule__Entity__DependentAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getDependentAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:609:6: ( ( rule__Entity__ParameterAssignment_1_1 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:609:6: ( ( rule__Entity__ParameterAssignment_1_1 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:610:1: ( rule__Entity__ParameterAssignment_1_1 )
                    {
                     before(grammarAccess.getEntityAccess().getParameterAssignment_1_1()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:611:1: ( rule__Entity__ParameterAssignment_1_1 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:611:2: rule__Entity__ParameterAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__ParameterAssignment_1_1_in_rule__Entity__Alternatives_11268);
                    rule__Entity__ParameterAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getParameterAssignment_1_1()); 

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
    // $ANTLR end "rule__Entity__Alternatives_1"


    // $ANTLR start "rule__TypeReference__Alternatives"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:620:1: rule__TypeReference__Alternatives : ( ( ruleFunctionTypeReference ) | ( ruleEntityTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:624:1: ( ( ruleFunctionTypeReference ) | ( ruleEntityTypeReference ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:625:1: ( ruleFunctionTypeReference )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:625:1: ( ruleFunctionTypeReference )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:626:1: ruleFunctionTypeReference
                    {
                     before(grammarAccess.getTypeReferenceAccess().getFunctionTypeReferenceParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionTypeReference_in_rule__TypeReference__Alternatives1301);
                    ruleFunctionTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getFunctionTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:631:6: ( ruleEntityTypeReference )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:631:6: ( ruleEntityTypeReference )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:632:1: ruleEntityTypeReference
                    {
                     before(grammarAccess.getTypeReferenceAccess().getEntityTypeReferenceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEntityTypeReference_in_rule__TypeReference__Alternatives1318);
                    ruleEntityTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getEntityTypeReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__TypeReference__Alternatives"


    // $ANTLR start "rule__ID__Alternatives"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:642:1: rule__ID__Alternatives : ( ( RULE_UCID ) | ( RULE_LCID ) );
    public final void rule__ID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:646:1: ( ( RULE_UCID ) | ( RULE_LCID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_UCID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_LCID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:647:1: ( RULE_UCID )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:647:1: ( RULE_UCID )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:648:1: RULE_UCID
                    {
                     before(grammarAccess.getIDAccess().getUCIDTerminalRuleCall_0()); 
                    match(input,RULE_UCID,FollowSets000.FOLLOW_RULE_UCID_in_rule__ID__Alternatives1350); 
                     after(grammarAccess.getIDAccess().getUCIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:653:6: ( RULE_LCID )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:653:6: ( RULE_LCID )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:654:1: RULE_LCID
                    {
                     before(grammarAccess.getIDAccess().getLCIDTerminalRuleCall_1()); 
                    match(input,RULE_LCID,FollowSets000.FOLLOW_RULE_LCID_in_rule__ID__Alternatives1367); 
                     after(grammarAccess.getIDAccess().getLCIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ID__Alternatives"


    // $ANTLR start "rule__Megamodel__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:666:1: rule__Megamodel__Group__0 : rule__Megamodel__Group__0__Impl rule__Megamodel__Group__1 ;
    public final void rule__Megamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:670:1: ( rule__Megamodel__Group__0__Impl rule__Megamodel__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:671:2: rule__Megamodel__Group__0__Impl rule__Megamodel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group__0__Impl_in_rule__Megamodel__Group__01397);
            rule__Megamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group__1_in_rule__Megamodel__Group__01400);
            rule__Megamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group__0"


    // $ANTLR start "rule__Megamodel__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:678:1: rule__Megamodel__Group__0__Impl : ( ( rule__Megamodel__AnnotationsAssignment_0 )* ) ;
    public final void rule__Megamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:682:1: ( ( ( rule__Megamodel__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:683:1: ( ( rule__Megamodel__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:683:1: ( ( rule__Megamodel__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:684:1: ( rule__Megamodel__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegamodelAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:685:1: ( rule__Megamodel__AnnotationsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:685:2: rule__Megamodel__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Megamodel__AnnotationsAssignment_0_in_rule__Megamodel__Group__0__Impl1427);
            	    rule__Megamodel__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMegamodelAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group__0__Impl"


    // $ANTLR start "rule__Megamodel__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:695:1: rule__Megamodel__Group__1 : rule__Megamodel__Group__1__Impl rule__Megamodel__Group__2 ;
    public final void rule__Megamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:699:1: ( rule__Megamodel__Group__1__Impl rule__Megamodel__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:700:2: rule__Megamodel__Group__1__Impl rule__Megamodel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group__1__Impl_in_rule__Megamodel__Group__11458);
            rule__Megamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group__2_in_rule__Megamodel__Group__11461);
            rule__Megamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group__1"


    // $ANTLR start "rule__Megamodel__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:707:1: rule__Megamodel__Group__1__Impl : ( 'model' ) ;
    public final void rule__Megamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:711:1: ( ( 'model' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:712:1: ( 'model' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:712:1: ( 'model' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:713:1: 'model'
            {
             before(grammarAccess.getMegamodelAccess().getModelKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Megamodel__Group__1__Impl1489); 
             after(grammarAccess.getMegamodelAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group__1__Impl"


    // $ANTLR start "rule__Megamodel__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:726:1: rule__Megamodel__Group__2 : rule__Megamodel__Group__2__Impl rule__Megamodel__Group__3 ;
    public final void rule__Megamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:730:1: ( rule__Megamodel__Group__2__Impl rule__Megamodel__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:731:2: rule__Megamodel__Group__2__Impl rule__Megamodel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group__2__Impl_in_rule__Megamodel__Group__21520);
            rule__Megamodel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group__3_in_rule__Megamodel__Group__21523);
            rule__Megamodel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group__2"


    // $ANTLR start "rule__Megamodel__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:738:1: rule__Megamodel__Group__2__Impl : ( ( rule__Megamodel__NameAssignment_2 ) ) ;
    public final void rule__Megamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:742:1: ( ( ( rule__Megamodel__NameAssignment_2 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:743:1: ( ( rule__Megamodel__NameAssignment_2 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:743:1: ( ( rule__Megamodel__NameAssignment_2 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:744:1: ( rule__Megamodel__NameAssignment_2 )
            {
             before(grammarAccess.getMegamodelAccess().getNameAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:745:1: ( rule__Megamodel__NameAssignment_2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:745:2: rule__Megamodel__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__NameAssignment_2_in_rule__Megamodel__Group__2__Impl1550);
            rule__Megamodel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMegamodelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group__2__Impl"


    // $ANTLR start "rule__Megamodel__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:755:1: rule__Megamodel__Group__3 : rule__Megamodel__Group__3__Impl ;
    public final void rule__Megamodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:759:1: ( rule__Megamodel__Group__3__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:760:2: rule__Megamodel__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group__3__Impl_in_rule__Megamodel__Group__31580);
            rule__Megamodel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group__3"


    // $ANTLR start "rule__Megamodel__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:766:1: rule__Megamodel__Group__3__Impl : ( ( rule__Megamodel__Alternatives_3 )* ) ;
    public final void rule__Megamodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:770:1: ( ( ( rule__Megamodel__Alternatives_3 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:771:1: ( ( rule__Megamodel__Alternatives_3 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:771:1: ( ( rule__Megamodel__Alternatives_3 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:772:1: ( rule__Megamodel__Alternatives_3 )*
            {
             before(grammarAccess.getMegamodelAccess().getAlternatives_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:773:1: ( rule__Megamodel__Alternatives_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_UCID && LA8_0<=RULE_LCID)||(LA8_0>=12 && LA8_0<=13)||(LA8_0>=28 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:773:2: rule__Megamodel__Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Alternatives_3_in_rule__Megamodel__Group__3__Impl1607);
            	    rule__Megamodel__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMegamodelAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group__3__Impl"


    // $ANTLR start "rule__Megamodel__Group_3_0__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:791:1: rule__Megamodel__Group_3_0__0 : rule__Megamodel__Group_3_0__0__Impl rule__Megamodel__Group_3_0__1 ;
    public final void rule__Megamodel__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:795:1: ( rule__Megamodel__Group_3_0__0__Impl rule__Megamodel__Group_3_0__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:796:2: rule__Megamodel__Group_3_0__0__Impl rule__Megamodel__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group_3_0__0__Impl_in_rule__Megamodel__Group_3_0__01646);
            rule__Megamodel__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group_3_0__1_in_rule__Megamodel__Group_3_0__01649);
            rule__Megamodel__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group_3_0__0"


    // $ANTLR start "rule__Megamodel__Group_3_0__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:803:1: rule__Megamodel__Group_3_0__0__Impl : ( 'import' ) ;
    public final void rule__Megamodel__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:807:1: ( ( 'import' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:808:1: ( 'import' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:808:1: ( 'import' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:809:1: 'import'
            {
             before(grammarAccess.getMegamodelAccess().getImportKeyword_3_0_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Megamodel__Group_3_0__0__Impl1677); 
             after(grammarAccess.getMegamodelAccess().getImportKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group_3_0__0__Impl"


    // $ANTLR start "rule__Megamodel__Group_3_0__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:822:1: rule__Megamodel__Group_3_0__1 : rule__Megamodel__Group_3_0__1__Impl ;
    public final void rule__Megamodel__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:826:1: ( rule__Megamodel__Group_3_0__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:827:2: rule__Megamodel__Group_3_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__Group_3_0__1__Impl_in_rule__Megamodel__Group_3_0__11708);
            rule__Megamodel__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group_3_0__1"


    // $ANTLR start "rule__Megamodel__Group_3_0__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:833:1: rule__Megamodel__Group_3_0__1__Impl : ( ( rule__Megamodel__ImportsAssignment_3_0_1 ) ) ;
    public final void rule__Megamodel__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:837:1: ( ( ( rule__Megamodel__ImportsAssignment_3_0_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:838:1: ( ( rule__Megamodel__ImportsAssignment_3_0_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:838:1: ( ( rule__Megamodel__ImportsAssignment_3_0_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:839:1: ( rule__Megamodel__ImportsAssignment_3_0_1 )
            {
             before(grammarAccess.getMegamodelAccess().getImportsAssignment_3_0_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:840:1: ( rule__Megamodel__ImportsAssignment_3_0_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:840:2: rule__Megamodel__ImportsAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Megamodel__ImportsAssignment_3_0_1_in_rule__Megamodel__Group_3_0__1__Impl1735);
            rule__Megamodel__ImportsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMegamodelAccess().getImportsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__Group_3_0__1__Impl"


    // $ANTLR start "rule__PrefixAnnotation__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:854:1: rule__PrefixAnnotation__Group__0 : rule__PrefixAnnotation__Group__0__Impl rule__PrefixAnnotation__Group__1 ;
    public final void rule__PrefixAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:858:1: ( rule__PrefixAnnotation__Group__0__Impl rule__PrefixAnnotation__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:859:2: rule__PrefixAnnotation__Group__0__Impl rule__PrefixAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrefixAnnotation__Group__0__Impl_in_rule__PrefixAnnotation__Group__01769);
            rule__PrefixAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrefixAnnotation__Group__1_in_rule__PrefixAnnotation__Group__01772);
            rule__PrefixAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixAnnotation__Group__0"


    // $ANTLR start "rule__PrefixAnnotation__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:866:1: rule__PrefixAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__PrefixAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:870:1: ( ( '@' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:871:1: ( '@' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:871:1: ( '@' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:872:1: '@'
            {
             before(grammarAccess.getPrefixAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__PrefixAnnotation__Group__0__Impl1800); 
             after(grammarAccess.getPrefixAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixAnnotation__Group__0__Impl"


    // $ANTLR start "rule__PrefixAnnotation__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:885:1: rule__PrefixAnnotation__Group__1 : rule__PrefixAnnotation__Group__1__Impl rule__PrefixAnnotation__Group__2 ;
    public final void rule__PrefixAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:889:1: ( rule__PrefixAnnotation__Group__1__Impl rule__PrefixAnnotation__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:890:2: rule__PrefixAnnotation__Group__1__Impl rule__PrefixAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrefixAnnotation__Group__1__Impl_in_rule__PrefixAnnotation__Group__11831);
            rule__PrefixAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrefixAnnotation__Group__2_in_rule__PrefixAnnotation__Group__11834);
            rule__PrefixAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixAnnotation__Group__1"


    // $ANTLR start "rule__PrefixAnnotation__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:897:1: rule__PrefixAnnotation__Group__1__Impl : ( ( rule__PrefixAnnotation__KeyAssignment_1 ) ) ;
    public final void rule__PrefixAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:901:1: ( ( ( rule__PrefixAnnotation__KeyAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:902:1: ( ( rule__PrefixAnnotation__KeyAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:902:1: ( ( rule__PrefixAnnotation__KeyAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:903:1: ( rule__PrefixAnnotation__KeyAssignment_1 )
            {
             before(grammarAccess.getPrefixAnnotationAccess().getKeyAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:904:1: ( rule__PrefixAnnotation__KeyAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:904:2: rule__PrefixAnnotation__KeyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrefixAnnotation__KeyAssignment_1_in_rule__PrefixAnnotation__Group__1__Impl1861);
            rule__PrefixAnnotation__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAnnotationAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixAnnotation__Group__1__Impl"


    // $ANTLR start "rule__PrefixAnnotation__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:914:1: rule__PrefixAnnotation__Group__2 : rule__PrefixAnnotation__Group__2__Impl ;
    public final void rule__PrefixAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:918:1: ( rule__PrefixAnnotation__Group__2__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:919:2: rule__PrefixAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrefixAnnotation__Group__2__Impl_in_rule__PrefixAnnotation__Group__21891);
            rule__PrefixAnnotation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixAnnotation__Group__2"


    // $ANTLR start "rule__PrefixAnnotation__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:925:1: rule__PrefixAnnotation__Group__2__Impl : ( ( rule__PrefixAnnotation__ValueAssignment_2 )? ) ;
    public final void rule__PrefixAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:929:1: ( ( ( rule__PrefixAnnotation__ValueAssignment_2 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:930:1: ( ( rule__PrefixAnnotation__ValueAssignment_2 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:930:1: ( ( rule__PrefixAnnotation__ValueAssignment_2 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:931:1: ( rule__PrefixAnnotation__ValueAssignment_2 )?
            {
             before(grammarAccess.getPrefixAnnotationAccess().getValueAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:932:1: ( rule__PrefixAnnotation__ValueAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:932:2: rule__PrefixAnnotation__ValueAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PrefixAnnotation__ValueAssignment_2_in_rule__PrefixAnnotation__Group__2__Impl1918);
                    rule__PrefixAnnotation__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrefixAnnotationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixAnnotation__Group__2__Impl"


    // $ANTLR start "rule__ShowNameAnnotation__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:948:1: rule__ShowNameAnnotation__Group__0 : rule__ShowNameAnnotation__Group__0__Impl rule__ShowNameAnnotation__Group__1 ;
    public final void rule__ShowNameAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:952:1: ( rule__ShowNameAnnotation__Group__0__Impl rule__ShowNameAnnotation__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:953:2: rule__ShowNameAnnotation__Group__0__Impl rule__ShowNameAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ShowNameAnnotation__Group__0__Impl_in_rule__ShowNameAnnotation__Group__01955);
            rule__ShowNameAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ShowNameAnnotation__Group__1_in_rule__ShowNameAnnotation__Group__01958);
            rule__ShowNameAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowNameAnnotation__Group__0"


    // $ANTLR start "rule__ShowNameAnnotation__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:960:1: rule__ShowNameAnnotation__Group__0__Impl : ( '[' ) ;
    public final void rule__ShowNameAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:964:1: ( ( '[' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:965:1: ( '[' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:965:1: ( '[' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:966:1: '['
            {
             before(grammarAccess.getShowNameAnnotationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ShowNameAnnotation__Group__0__Impl1986); 
             after(grammarAccess.getShowNameAnnotationAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowNameAnnotation__Group__0__Impl"


    // $ANTLR start "rule__ShowNameAnnotation__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:979:1: rule__ShowNameAnnotation__Group__1 : rule__ShowNameAnnotation__Group__1__Impl rule__ShowNameAnnotation__Group__2 ;
    public final void rule__ShowNameAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:983:1: ( rule__ShowNameAnnotation__Group__1__Impl rule__ShowNameAnnotation__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:984:2: rule__ShowNameAnnotation__Group__1__Impl rule__ShowNameAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ShowNameAnnotation__Group__1__Impl_in_rule__ShowNameAnnotation__Group__12017);
            rule__ShowNameAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ShowNameAnnotation__Group__2_in_rule__ShowNameAnnotation__Group__12020);
            rule__ShowNameAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowNameAnnotation__Group__1"


    // $ANTLR start "rule__ShowNameAnnotation__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:991:1: rule__ShowNameAnnotation__Group__1__Impl : ( ( rule__ShowNameAnnotation__ValueAssignment_1 ) ) ;
    public final void rule__ShowNameAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:995:1: ( ( ( rule__ShowNameAnnotation__ValueAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:996:1: ( ( rule__ShowNameAnnotation__ValueAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:996:1: ( ( rule__ShowNameAnnotation__ValueAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:997:1: ( rule__ShowNameAnnotation__ValueAssignment_1 )
            {
             before(grammarAccess.getShowNameAnnotationAccess().getValueAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:998:1: ( rule__ShowNameAnnotation__ValueAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:998:2: rule__ShowNameAnnotation__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ShowNameAnnotation__ValueAssignment_1_in_rule__ShowNameAnnotation__Group__1__Impl2047);
            rule__ShowNameAnnotation__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShowNameAnnotationAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowNameAnnotation__Group__1__Impl"


    // $ANTLR start "rule__ShowNameAnnotation__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1008:1: rule__ShowNameAnnotation__Group__2 : rule__ShowNameAnnotation__Group__2__Impl ;
    public final void rule__ShowNameAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1012:1: ( rule__ShowNameAnnotation__Group__2__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1013:2: rule__ShowNameAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ShowNameAnnotation__Group__2__Impl_in_rule__ShowNameAnnotation__Group__22077);
            rule__ShowNameAnnotation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowNameAnnotation__Group__2"


    // $ANTLR start "rule__ShowNameAnnotation__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1019:1: rule__ShowNameAnnotation__Group__2__Impl : ( ']' ) ;
    public final void rule__ShowNameAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1023:1: ( ( ']' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1024:1: ( ']' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1024:1: ( ']' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1025:1: ']'
            {
             before(grammarAccess.getShowNameAnnotationAccess().getRightSquareBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__ShowNameAnnotation__Group__2__Impl2105); 
             after(grammarAccess.getShowNameAnnotationAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowNameAnnotation__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1044:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1048:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1049:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__02142);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1_in_rule__Link__Group__02145);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1056:1: rule__Link__Group__0__Impl : ( ( rule__Link__AnnotationsAssignment_0 )* ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1060:1: ( ( ( rule__Link__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1061:1: ( ( rule__Link__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1061:1: ( ( rule__Link__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1062:1: ( rule__Link__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getLinkAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1063:1: ( rule__Link__AnnotationsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1063:2: rule__Link__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Link__AnnotationsAssignment_0_in_rule__Link__Group__0__Impl2172);
            	    rule__Link__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1073:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1077:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1078:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__12203);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__2_in_rule__Link__Group__12206);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1085:1: rule__Link__Group__1__Impl : ( ( rule__Link__LinkAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1089:1: ( ( ( rule__Link__LinkAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1090:1: ( ( rule__Link__LinkAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1090:1: ( ( rule__Link__LinkAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1091:1: ( rule__Link__LinkAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1092:1: ( rule__Link__LinkAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1092:2: rule__Link__LinkAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__LinkAssignment_1_in_rule__Link__Group__1__Impl2233);
            rule__Link__LinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getLinkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1102:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1106:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1107:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__22263);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__3_in_rule__Link__Group__22266);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1114:1: rule__Link__Group__2__Impl : ( ( rule__Link__Group_2__0 )? ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1118:1: ( ( ( rule__Link__Group_2__0 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1119:1: ( ( rule__Link__Group_2__0 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1119:1: ( ( rule__Link__Group_2__0 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1120:1: ( rule__Link__Group_2__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1121:1: ( rule__Link__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1121:2: rule__Link__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__0_in_rule__Link__Group__2__Impl2293);
                    rule__Link__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1131:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1135:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1136:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__32324);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__4_in_rule__Link__Group__32327);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1143:1: rule__Link__Group__3__Impl : ( '=' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1147:1: ( ( '=' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1148:1: ( '=' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1148:1: ( '=' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1149:1: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Link__Group__3__Impl2355); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1162:1: rule__Link__Group__4 : rule__Link__Group__4__Impl ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1166:1: ( rule__Link__Group__4__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1167:2: rule__Link__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__42386);
            rule__Link__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1173:1: rule__Link__Group__4__Impl : ( ( rule__Link__ToAssignment_4 ) ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1177:1: ( ( ( rule__Link__ToAssignment_4 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1178:1: ( ( rule__Link__ToAssignment_4 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1178:1: ( ( rule__Link__ToAssignment_4 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1179:1: ( rule__Link__ToAssignment_4 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_4()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1180:1: ( rule__Link__ToAssignment_4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1180:2: rule__Link__ToAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__ToAssignment_4_in_rule__Link__Group__4__Impl2413);
            rule__Link__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group_2__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1200:1: rule__Link__Group_2__0 : rule__Link__Group_2__0__Impl rule__Link__Group_2__1 ;
    public final void rule__Link__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1204:1: ( rule__Link__Group_2__0__Impl rule__Link__Group_2__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1205:2: rule__Link__Group_2__0__Impl rule__Link__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__0__Impl_in_rule__Link__Group_2__02453);
            rule__Link__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__1_in_rule__Link__Group_2__02456);
            rule__Link__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__0"


    // $ANTLR start "rule__Link__Group_2__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1212:1: rule__Link__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Link__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1216:1: ( ( '(' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1217:1: ( '(' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1217:1: ( '(' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1218:1: '('
            {
             before(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Link__Group_2__0__Impl2484); 
             after(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__0__Impl"


    // $ANTLR start "rule__Link__Group_2__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1231:1: rule__Link__Group_2__1 : rule__Link__Group_2__1__Impl rule__Link__Group_2__2 ;
    public final void rule__Link__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1235:1: ( rule__Link__Group_2__1__Impl rule__Link__Group_2__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1236:2: rule__Link__Group_2__1__Impl rule__Link__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__1__Impl_in_rule__Link__Group_2__12515);
            rule__Link__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__2_in_rule__Link__Group_2__12518);
            rule__Link__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__1"


    // $ANTLR start "rule__Link__Group_2__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1243:1: rule__Link__Group_2__1__Impl : ( ( rule__Link__InputAssignment_2_1 ) ) ;
    public final void rule__Link__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1247:1: ( ( ( rule__Link__InputAssignment_2_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1248:1: ( ( rule__Link__InputAssignment_2_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1248:1: ( ( rule__Link__InputAssignment_2_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1249:1: ( rule__Link__InputAssignment_2_1 )
            {
             before(grammarAccess.getLinkAccess().getInputAssignment_2_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1250:1: ( rule__Link__InputAssignment_2_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1250:2: rule__Link__InputAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__InputAssignment_2_1_in_rule__Link__Group_2__1__Impl2545);
            rule__Link__InputAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getInputAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__1__Impl"


    // $ANTLR start "rule__Link__Group_2__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1260:1: rule__Link__Group_2__2 : rule__Link__Group_2__2__Impl rule__Link__Group_2__3 ;
    public final void rule__Link__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1264:1: ( rule__Link__Group_2__2__Impl rule__Link__Group_2__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1265:2: rule__Link__Group_2__2__Impl rule__Link__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__2__Impl_in_rule__Link__Group_2__22575);
            rule__Link__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__3_in_rule__Link__Group_2__22578);
            rule__Link__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__2"


    // $ANTLR start "rule__Link__Group_2__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1272:1: rule__Link__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Link__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1276:1: ( ( ')' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1277:1: ( ')' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1277:1: ( ')' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1278:1: ')'
            {
             before(grammarAccess.getLinkAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Link__Group_2__2__Impl2606); 
             after(grammarAccess.getLinkAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__2__Impl"


    // $ANTLR start "rule__Link__Group_2__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1291:1: rule__Link__Group_2__3 : rule__Link__Group_2__3__Impl rule__Link__Group_2__4 ;
    public final void rule__Link__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1295:1: ( rule__Link__Group_2__3__Impl rule__Link__Group_2__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1296:2: rule__Link__Group_2__3__Impl rule__Link__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__3__Impl_in_rule__Link__Group_2__32637);
            rule__Link__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__4_in_rule__Link__Group_2__32640);
            rule__Link__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__3"


    // $ANTLR start "rule__Link__Group_2__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1303:1: rule__Link__Group_2__3__Impl : ( '|' ) ;
    public final void rule__Link__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1307:1: ( ( '|' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1308:1: ( '|' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1308:1: ( '|' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1309:1: '|'
            {
             before(grammarAccess.getLinkAccess().getVerticalLineKeyword_2_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Link__Group_2__3__Impl2668); 
             after(grammarAccess.getLinkAccess().getVerticalLineKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__3__Impl"


    // $ANTLR start "rule__Link__Group_2__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1322:1: rule__Link__Group_2__4 : rule__Link__Group_2__4__Impl rule__Link__Group_2__5 ;
    public final void rule__Link__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1326:1: ( rule__Link__Group_2__4__Impl rule__Link__Group_2__5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1327:2: rule__Link__Group_2__4__Impl rule__Link__Group_2__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__4__Impl_in_rule__Link__Group_2__42699);
            rule__Link__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__5_in_rule__Link__Group_2__42702);
            rule__Link__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__4"


    // $ANTLR start "rule__Link__Group_2__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1334:1: rule__Link__Group_2__4__Impl : ( '->' ) ;
    public final void rule__Link__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1338:1: ( ( '->' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1339:1: ( '->' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1339:1: ( '->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1340:1: '->'
            {
             before(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Link__Group_2__4__Impl2730); 
             after(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__4__Impl"


    // $ANTLR start "rule__Link__Group_2__5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1353:1: rule__Link__Group_2__5 : rule__Link__Group_2__5__Impl ;
    public final void rule__Link__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1357:1: ( rule__Link__Group_2__5__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1358:2: rule__Link__Group_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group_2__5__Impl_in_rule__Link__Group_2__52761);
            rule__Link__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__5"


    // $ANTLR start "rule__Link__Group_2__5__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1364:1: rule__Link__Group_2__5__Impl : ( ( rule__Link__OutputAssignment_2_5 ) ) ;
    public final void rule__Link__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1368:1: ( ( ( rule__Link__OutputAssignment_2_5 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1369:1: ( ( rule__Link__OutputAssignment_2_5 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1369:1: ( ( rule__Link__OutputAssignment_2_5 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1370:1: ( rule__Link__OutputAssignment_2_5 )
            {
             before(grammarAccess.getLinkAccess().getOutputAssignment_2_5()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1371:1: ( rule__Link__OutputAssignment_2_5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1371:2: rule__Link__OutputAssignment_2_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__OutputAssignment_2_5_in_rule__Link__Group_2__5__Impl2788);
            rule__Link__OutputAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getOutputAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__5__Impl"


    // $ANTLR start "rule__EntityType__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1393:1: rule__EntityType__Group__0 : rule__EntityType__Group__0__Impl rule__EntityType__Group__1 ;
    public final void rule__EntityType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1397:1: ( rule__EntityType__Group__0__Impl rule__EntityType__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1398:2: rule__EntityType__Group__0__Impl rule__EntityType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group__0__Impl_in_rule__EntityType__Group__02830);
            rule__EntityType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group__1_in_rule__EntityType__Group__02833);
            rule__EntityType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__0"


    // $ANTLR start "rule__EntityType__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1405:1: rule__EntityType__Group__0__Impl : ( ( rule__EntityType__AnnotationsAssignment_0 )* ) ;
    public final void rule__EntityType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1409:1: ( ( ( rule__EntityType__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1410:1: ( ( rule__EntityType__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1410:1: ( ( rule__EntityType__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1411:1: ( rule__EntityType__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getEntityTypeAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1412:1: ( rule__EntityType__AnnotationsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1412:2: rule__EntityType__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EntityType__AnnotationsAssignment_0_in_rule__EntityType__Group__0__Impl2860);
            	    rule__EntityType__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEntityTypeAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__0__Impl"


    // $ANTLR start "rule__EntityType__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1422:1: rule__EntityType__Group__1 : rule__EntityType__Group__1__Impl rule__EntityType__Group__2 ;
    public final void rule__EntityType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1426:1: ( rule__EntityType__Group__1__Impl rule__EntityType__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1427:2: rule__EntityType__Group__1__Impl rule__EntityType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group__1__Impl_in_rule__EntityType__Group__12891);
            rule__EntityType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group__2_in_rule__EntityType__Group__12894);
            rule__EntityType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__1"


    // $ANTLR start "rule__EntityType__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1434:1: rule__EntityType__Group__1__Impl : ( ( rule__EntityType__NameAssignment_1 ) ) ;
    public final void rule__EntityType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1438:1: ( ( ( rule__EntityType__NameAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1439:1: ( ( rule__EntityType__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1439:1: ( ( rule__EntityType__NameAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1440:1: ( rule__EntityType__NameAssignment_1 )
            {
             before(grammarAccess.getEntityTypeAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1441:1: ( rule__EntityType__NameAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1441:2: rule__EntityType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__NameAssignment_1_in_rule__EntityType__Group__1__Impl2921);
            rule__EntityType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__1__Impl"


    // $ANTLR start "rule__EntityType__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1451:1: rule__EntityType__Group__2 : rule__EntityType__Group__2__Impl rule__EntityType__Group__3 ;
    public final void rule__EntityType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1455:1: ( rule__EntityType__Group__2__Impl rule__EntityType__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1456:2: rule__EntityType__Group__2__Impl rule__EntityType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group__2__Impl_in_rule__EntityType__Group__22951);
            rule__EntityType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group__3_in_rule__EntityType__Group__22954);
            rule__EntityType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__2"


    // $ANTLR start "rule__EntityType__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1463:1: rule__EntityType__Group__2__Impl : ( ( rule__EntityType__AnnotationsAssignment_2 )? ) ;
    public final void rule__EntityType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1467:1: ( ( ( rule__EntityType__AnnotationsAssignment_2 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1468:1: ( ( rule__EntityType__AnnotationsAssignment_2 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1468:1: ( ( rule__EntityType__AnnotationsAssignment_2 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1469:1: ( rule__EntityType__AnnotationsAssignment_2 )?
            {
             before(grammarAccess.getEntityTypeAccess().getAnnotationsAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1470:1: ( rule__EntityType__AnnotationsAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1470:2: rule__EntityType__AnnotationsAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EntityType__AnnotationsAssignment_2_in_rule__EntityType__Group__2__Impl2981);
                    rule__EntityType__AnnotationsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityTypeAccess().getAnnotationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__2__Impl"


    // $ANTLR start "rule__EntityType__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1480:1: rule__EntityType__Group__3 : rule__EntityType__Group__3__Impl ;
    public final void rule__EntityType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1484:1: ( rule__EntityType__Group__3__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1485:2: rule__EntityType__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group__3__Impl_in_rule__EntityType__Group__33012);
            rule__EntityType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__3"


    // $ANTLR start "rule__EntityType__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1491:1: rule__EntityType__Group__3__Impl : ( ( rule__EntityType__Alternatives_3 ) ) ;
    public final void rule__EntityType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1495:1: ( ( ( rule__EntityType__Alternatives_3 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1496:1: ( ( rule__EntityType__Alternatives_3 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1496:1: ( ( rule__EntityType__Alternatives_3 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1497:1: ( rule__EntityType__Alternatives_3 )
            {
             before(grammarAccess.getEntityTypeAccess().getAlternatives_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1498:1: ( rule__EntityType__Alternatives_3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1498:2: rule__EntityType__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Alternatives_3_in_rule__EntityType__Group__3__Impl3039);
            rule__EntityType__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__3__Impl"


    // $ANTLR start "rule__EntityType__Group_3_0__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1516:1: rule__EntityType__Group_3_0__0 : rule__EntityType__Group_3_0__0__Impl rule__EntityType__Group_3_0__1 ;
    public final void rule__EntityType__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1520:1: ( rule__EntityType__Group_3_0__0__Impl rule__EntityType__Group_3_0__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1521:2: rule__EntityType__Group_3_0__0__Impl rule__EntityType__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group_3_0__0__Impl_in_rule__EntityType__Group_3_0__03077);
            rule__EntityType__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group_3_0__1_in_rule__EntityType__Group_3_0__03080);
            rule__EntityType__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3_0__0"


    // $ANTLR start "rule__EntityType__Group_3_0__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1528:1: rule__EntityType__Group_3_0__0__Impl : ( '<' ) ;
    public final void rule__EntityType__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1532:1: ( ( '<' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1533:1: ( '<' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1533:1: ( '<' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1534:1: '<'
            {
             before(grammarAccess.getEntityTypeAccess().getLessThanSignKeyword_3_0_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__EntityType__Group_3_0__0__Impl3108); 
             after(grammarAccess.getEntityTypeAccess().getLessThanSignKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3_0__0__Impl"


    // $ANTLR start "rule__EntityType__Group_3_0__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1547:1: rule__EntityType__Group_3_0__1 : rule__EntityType__Group_3_0__1__Impl ;
    public final void rule__EntityType__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1551:1: ( rule__EntityType__Group_3_0__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1552:2: rule__EntityType__Group_3_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group_3_0__1__Impl_in_rule__EntityType__Group_3_0__13139);
            rule__EntityType__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3_0__1"


    // $ANTLR start "rule__EntityType__Group_3_0__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1558:1: rule__EntityType__Group_3_0__1__Impl : ( ( rule__EntityType__SupertypeAssignment_3_0_1 ) ) ;
    public final void rule__EntityType__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1562:1: ( ( ( rule__EntityType__SupertypeAssignment_3_0_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1563:1: ( ( rule__EntityType__SupertypeAssignment_3_0_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1563:1: ( ( rule__EntityType__SupertypeAssignment_3_0_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1564:1: ( rule__EntityType__SupertypeAssignment_3_0_1 )
            {
             before(grammarAccess.getEntityTypeAccess().getSupertypeAssignment_3_0_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1565:1: ( rule__EntityType__SupertypeAssignment_3_0_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1565:2: rule__EntityType__SupertypeAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__SupertypeAssignment_3_0_1_in_rule__EntityType__Group_3_0__1__Impl3166);
            rule__EntityType__SupertypeAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getSupertypeAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3_0__1__Impl"


    // $ANTLR start "rule__EntityType__Group_3_1__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1579:1: rule__EntityType__Group_3_1__0 : rule__EntityType__Group_3_1__0__Impl rule__EntityType__Group_3_1__1 ;
    public final void rule__EntityType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1583:1: ( rule__EntityType__Group_3_1__0__Impl rule__EntityType__Group_3_1__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1584:2: rule__EntityType__Group_3_1__0__Impl rule__EntityType__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group_3_1__0__Impl_in_rule__EntityType__Group_3_1__03200);
            rule__EntityType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group_3_1__1_in_rule__EntityType__Group_3_1__03203);
            rule__EntityType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3_1__0"


    // $ANTLR start "rule__EntityType__Group_3_1__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1591:1: rule__EntityType__Group_3_1__0__Impl : ( 'as' ) ;
    public final void rule__EntityType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1595:1: ( ( 'as' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1596:1: ( 'as' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1596:1: ( 'as' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1597:1: 'as'
            {
             before(grammarAccess.getEntityTypeAccess().getAsKeyword_3_1_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__EntityType__Group_3_1__0__Impl3231); 
             after(grammarAccess.getEntityTypeAccess().getAsKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3_1__0__Impl"


    // $ANTLR start "rule__EntityType__Group_3_1__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1610:1: rule__EntityType__Group_3_1__1 : rule__EntityType__Group_3_1__1__Impl ;
    public final void rule__EntityType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1614:1: ( rule__EntityType__Group_3_1__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1615:2: rule__EntityType__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityType__Group_3_1__1__Impl_in_rule__EntityType__Group_3_1__13262);
            rule__EntityType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3_1__1"


    // $ANTLR start "rule__EntityType__Group_3_1__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1621:1: rule__EntityType__Group_3_1__1__Impl : ( 'entity' ) ;
    public final void rule__EntityType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1625:1: ( ( 'entity' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1626:1: ( 'entity' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1626:1: ( 'entity' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1627:1: 'entity'
            {
             before(grammarAccess.getEntityTypeAccess().getEntityKeyword_3_1_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__EntityType__Group_3_1__1__Impl3290); 
             after(grammarAccess.getEntityTypeAccess().getEntityKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3_1__1__Impl"


    // $ANTLR start "rule__RelationshipType__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1644:1: rule__RelationshipType__Group__0 : rule__RelationshipType__Group__0__Impl rule__RelationshipType__Group__1 ;
    public final void rule__RelationshipType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1648:1: ( rule__RelationshipType__Group__0__Impl rule__RelationshipType__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1649:2: rule__RelationshipType__Group__0__Impl rule__RelationshipType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__0__Impl_in_rule__RelationshipType__Group__03325);
            rule__RelationshipType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__1_in_rule__RelationshipType__Group__03328);
            rule__RelationshipType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__0"


    // $ANTLR start "rule__RelationshipType__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1656:1: rule__RelationshipType__Group__0__Impl : ( ( rule__RelationshipType__AnnotationsAssignment_0 )* ) ;
    public final void rule__RelationshipType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1660:1: ( ( ( rule__RelationshipType__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1661:1: ( ( rule__RelationshipType__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1661:1: ( ( rule__RelationshipType__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1662:1: ( rule__RelationshipType__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getRelationshipTypeAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1663:1: ( rule__RelationshipType__AnnotationsAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1663:2: rule__RelationshipType__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__AnnotationsAssignment_0_in_rule__RelationshipType__Group__0__Impl3355);
            	    rule__RelationshipType__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRelationshipTypeAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__0__Impl"


    // $ANTLR start "rule__RelationshipType__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1673:1: rule__RelationshipType__Group__1 : rule__RelationshipType__Group__1__Impl rule__RelationshipType__Group__2 ;
    public final void rule__RelationshipType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1677:1: ( rule__RelationshipType__Group__1__Impl rule__RelationshipType__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1678:2: rule__RelationshipType__Group__1__Impl rule__RelationshipType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__1__Impl_in_rule__RelationshipType__Group__13386);
            rule__RelationshipType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__2_in_rule__RelationshipType__Group__13389);
            rule__RelationshipType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__1"


    // $ANTLR start "rule__RelationshipType__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1685:1: rule__RelationshipType__Group__1__Impl : ( ( rule__RelationshipType__NameAssignment_1 ) ) ;
    public final void rule__RelationshipType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1689:1: ( ( ( rule__RelationshipType__NameAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1690:1: ( ( rule__RelationshipType__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1690:1: ( ( rule__RelationshipType__NameAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1691:1: ( rule__RelationshipType__NameAssignment_1 )
            {
             before(grammarAccess.getRelationshipTypeAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1692:1: ( rule__RelationshipType__NameAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1692:2: rule__RelationshipType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__NameAssignment_1_in_rule__RelationshipType__Group__1__Impl3416);
            rule__RelationshipType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__1__Impl"


    // $ANTLR start "rule__RelationshipType__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1702:1: rule__RelationshipType__Group__2 : rule__RelationshipType__Group__2__Impl rule__RelationshipType__Group__3 ;
    public final void rule__RelationshipType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1706:1: ( rule__RelationshipType__Group__2__Impl rule__RelationshipType__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1707:2: rule__RelationshipType__Group__2__Impl rule__RelationshipType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__2__Impl_in_rule__RelationshipType__Group__23446);
            rule__RelationshipType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__3_in_rule__RelationshipType__Group__23449);
            rule__RelationshipType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__2"


    // $ANTLR start "rule__RelationshipType__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1714:1: rule__RelationshipType__Group__2__Impl : ( ( rule__RelationshipType__AnnotationsAssignment_2 )? ) ;
    public final void rule__RelationshipType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1718:1: ( ( ( rule__RelationshipType__AnnotationsAssignment_2 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1719:1: ( ( rule__RelationshipType__AnnotationsAssignment_2 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1719:1: ( ( rule__RelationshipType__AnnotationsAssignment_2 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1720:1: ( rule__RelationshipType__AnnotationsAssignment_2 )?
            {
             before(grammarAccess.getRelationshipTypeAccess().getAnnotationsAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1721:1: ( rule__RelationshipType__AnnotationsAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1721:2: rule__RelationshipType__AnnotationsAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__AnnotationsAssignment_2_in_rule__RelationshipType__Group__2__Impl3476);
                    rule__RelationshipType__AnnotationsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipTypeAccess().getAnnotationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__2__Impl"


    // $ANTLR start "rule__RelationshipType__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1731:1: rule__RelationshipType__Group__3 : rule__RelationshipType__Group__3__Impl rule__RelationshipType__Group__4 ;
    public final void rule__RelationshipType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1735:1: ( rule__RelationshipType__Group__3__Impl rule__RelationshipType__Group__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1736:2: rule__RelationshipType__Group__3__Impl rule__RelationshipType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__3__Impl_in_rule__RelationshipType__Group__33507);
            rule__RelationshipType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__4_in_rule__RelationshipType__Group__33510);
            rule__RelationshipType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__3"


    // $ANTLR start "rule__RelationshipType__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1743:1: rule__RelationshipType__Group__3__Impl : ( '<' ) ;
    public final void rule__RelationshipType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1747:1: ( ( '<' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1748:1: ( '<' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1748:1: ( '<' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1749:1: '<'
            {
             before(grammarAccess.getRelationshipTypeAccess().getLessThanSignKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__RelationshipType__Group__3__Impl3538); 
             after(grammarAccess.getRelationshipTypeAccess().getLessThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__3__Impl"


    // $ANTLR start "rule__RelationshipType__Group__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1762:1: rule__RelationshipType__Group__4 : rule__RelationshipType__Group__4__Impl rule__RelationshipType__Group__5 ;
    public final void rule__RelationshipType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1766:1: ( rule__RelationshipType__Group__4__Impl rule__RelationshipType__Group__5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1767:2: rule__RelationshipType__Group__4__Impl rule__RelationshipType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__4__Impl_in_rule__RelationshipType__Group__43569);
            rule__RelationshipType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__5_in_rule__RelationshipType__Group__43572);
            rule__RelationshipType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__4"


    // $ANTLR start "rule__RelationshipType__Group__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1774:1: rule__RelationshipType__Group__4__Impl : ( ( rule__RelationshipType__LeftAssignment_4 ) ) ;
    public final void rule__RelationshipType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1778:1: ( ( ( rule__RelationshipType__LeftAssignment_4 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1779:1: ( ( rule__RelationshipType__LeftAssignment_4 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1779:1: ( ( rule__RelationshipType__LeftAssignment_4 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1780:1: ( rule__RelationshipType__LeftAssignment_4 )
            {
             before(grammarAccess.getRelationshipTypeAccess().getLeftAssignment_4()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1781:1: ( rule__RelationshipType__LeftAssignment_4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1781:2: rule__RelationshipType__LeftAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__LeftAssignment_4_in_rule__RelationshipType__Group__4__Impl3599);
            rule__RelationshipType__LeftAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipTypeAccess().getLeftAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__4__Impl"


    // $ANTLR start "rule__RelationshipType__Group__5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1791:1: rule__RelationshipType__Group__5 : rule__RelationshipType__Group__5__Impl rule__RelationshipType__Group__6 ;
    public final void rule__RelationshipType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1795:1: ( rule__RelationshipType__Group__5__Impl rule__RelationshipType__Group__6 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1796:2: rule__RelationshipType__Group__5__Impl rule__RelationshipType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__5__Impl_in_rule__RelationshipType__Group__53629);
            rule__RelationshipType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__6_in_rule__RelationshipType__Group__53632);
            rule__RelationshipType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__5"


    // $ANTLR start "rule__RelationshipType__Group__5__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1803:1: rule__RelationshipType__Group__5__Impl : ( '*' ) ;
    public final void rule__RelationshipType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1807:1: ( ( '*' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1808:1: ( '*' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1808:1: ( '*' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1809:1: '*'
            {
             before(grammarAccess.getRelationshipTypeAccess().getAsteriskKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__RelationshipType__Group__5__Impl3660); 
             after(grammarAccess.getRelationshipTypeAccess().getAsteriskKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__5__Impl"


    // $ANTLR start "rule__RelationshipType__Group__6"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1822:1: rule__RelationshipType__Group__6 : rule__RelationshipType__Group__6__Impl ;
    public final void rule__RelationshipType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1826:1: ( rule__RelationshipType__Group__6__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1827:2: rule__RelationshipType__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__Group__6__Impl_in_rule__RelationshipType__Group__63691);
            rule__RelationshipType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__6"


    // $ANTLR start "rule__RelationshipType__Group__6__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1833:1: rule__RelationshipType__Group__6__Impl : ( ( rule__RelationshipType__RightAssignment_6 ) ) ;
    public final void rule__RelationshipType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1837:1: ( ( ( rule__RelationshipType__RightAssignment_6 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1838:1: ( ( rule__RelationshipType__RightAssignment_6 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1838:1: ( ( rule__RelationshipType__RightAssignment_6 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1839:1: ( rule__RelationshipType__RightAssignment_6 )
            {
             before(grammarAccess.getRelationshipTypeAccess().getRightAssignment_6()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1840:1: ( rule__RelationshipType__RightAssignment_6 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1840:2: rule__RelationshipType__RightAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipType__RightAssignment_6_in_rule__RelationshipType__Group__6__Impl3718);
            rule__RelationshipType__RightAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipTypeAccess().getRightAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1864:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1868:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1869:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03762);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03765);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1876:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__AnnotationsAssignment_0 )* ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1880:1: ( ( ( rule__Entity__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1881:1: ( ( rule__Entity__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1881:1: ( ( rule__Entity__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1882:1: ( rule__Entity__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1883:1: ( rule__Entity__AnnotationsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1883:2: rule__Entity__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_0_in_rule__Entity__Group__0__Impl3792);
            	    rule__Entity__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1893:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1897:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1898:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13823);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13826);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1905:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Alternatives_1 )? ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1909:1: ( ( ( rule__Entity__Alternatives_1 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1910:1: ( ( rule__Entity__Alternatives_1 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1910:1: ( ( rule__Entity__Alternatives_1 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1911:1: ( rule__Entity__Alternatives_1 )?
            {
             before(grammarAccess.getEntityAccess().getAlternatives_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1912:1: ( rule__Entity__Alternatives_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=28 && LA17_0<=29)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1912:2: rule__Entity__Alternatives_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Alternatives_1_in_rule__Entity__Group__1__Impl3853);
                    rule__Entity__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1922:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1926:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1927:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23884);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23887);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1934:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1938:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1939:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1939:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1940:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1941:1: ( rule__Entity__NameAssignment_2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1941:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3914);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1951:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1955:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1956:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33944);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33947);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1963:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AnnotationsAssignment_3 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1967:1: ( ( ( rule__Entity__AnnotationsAssignment_3 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1968:1: ( ( rule__Entity__AnnotationsAssignment_3 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1968:1: ( ( rule__Entity__AnnotationsAssignment_3 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1969:1: ( rule__Entity__AnnotationsAssignment_3 )?
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1970:1: ( rule__Entity__AnnotationsAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1970:2: rule__Entity__AnnotationsAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_3_in_rule__Entity__Group__3__Impl3974);
                    rule__Entity__AnnotationsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1980:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1984:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1985:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44005);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44008);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1992:1: rule__Entity__Group__4__Impl : ( ':' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1996:1: ( ( ':' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1997:1: ( ':' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1997:1: ( ':' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1998:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Entity__Group__4__Impl4036); 
             after(grammarAccess.getEntityAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2011:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2015:1: ( rule__Entity__Group__5__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2016:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54067);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2022:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__TypeAssignment_5 ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2026:1: ( ( ( rule__Entity__TypeAssignment_5 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2027:1: ( ( rule__Entity__TypeAssignment_5 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2027:1: ( ( rule__Entity__TypeAssignment_5 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2028:1: ( rule__Entity__TypeAssignment_5 )
            {
             before(grammarAccess.getEntityAccess().getTypeAssignment_5()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2029:1: ( rule__Entity__TypeAssignment_5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2029:2: rule__Entity__TypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__TypeAssignment_5_in_rule__Entity__Group__5__Impl4094);
            rule__Entity__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2051:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2055:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2056:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04136);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04139);
            rule__Relationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2063:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__AnnotationsAssignment_0 )* ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2067:1: ( ( ( rule__Relationship__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2068:1: ( ( rule__Relationship__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2068:1: ( ( rule__Relationship__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2069:1: ( rule__Relationship__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getRelationshipAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2070:1: ( rule__Relationship__AnnotationsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2070:2: rule__Relationship__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Relationship__AnnotationsAssignment_0_in_rule__Relationship__Group__0__Impl4166);
            	    rule__Relationship__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2080:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2084:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2085:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__14197);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__14200);
            rule__Relationship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2092:1: rule__Relationship__Group__1__Impl : ( ( rule__Relationship__LeftAssignment_1 ) ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2096:1: ( ( ( rule__Relationship__LeftAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2097:1: ( ( rule__Relationship__LeftAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2097:1: ( ( rule__Relationship__LeftAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2098:1: ( rule__Relationship__LeftAssignment_1 )
            {
             before(grammarAccess.getRelationshipAccess().getLeftAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2099:1: ( rule__Relationship__LeftAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2099:2: rule__Relationship__LeftAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__LeftAssignment_1_in_rule__Relationship__Group__1__Impl4227);
            rule__Relationship__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2109:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2113:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2114:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__24257);
            rule__Relationship__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__24260);
            rule__Relationship__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2121:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__TypeAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2125:1: ( ( ( rule__Relationship__TypeAssignment_2 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2126:1: ( ( rule__Relationship__TypeAssignment_2 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2126:1: ( ( rule__Relationship__TypeAssignment_2 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2127:1: ( rule__Relationship__TypeAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getTypeAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2128:1: ( rule__Relationship__TypeAssignment_2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2128:2: rule__Relationship__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__TypeAssignment_2_in_rule__Relationship__Group__2__Impl4287);
            rule__Relationship__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2138:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2142:1: ( rule__Relationship__Group__3__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2143:2: rule__Relationship__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__34317);
            rule__Relationship__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2149:1: rule__Relationship__Group__3__Impl : ( ( rule__Relationship__RightAssignment_3 ) ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2153:1: ( ( ( rule__Relationship__RightAssignment_3 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2154:1: ( ( rule__Relationship__RightAssignment_3 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2154:1: ( ( rule__Relationship__RightAssignment_3 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2155:1: ( rule__Relationship__RightAssignment_3 )
            {
             before(grammarAccess.getRelationshipAccess().getRightAssignment_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2156:1: ( rule__Relationship__RightAssignment_3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2156:2: rule__Relationship__RightAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__RightAssignment_3_in_rule__Relationship__Group__3__Impl4344);
            rule__Relationship__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2174:1: rule__FunctionApplication__Group__0 : rule__FunctionApplication__Group__0__Impl rule__FunctionApplication__Group__1 ;
    public final void rule__FunctionApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2178:1: ( rule__FunctionApplication__Group__0__Impl rule__FunctionApplication__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2179:2: rule__FunctionApplication__Group__0__Impl rule__FunctionApplication__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__0__Impl_in_rule__FunctionApplication__Group__04382);
            rule__FunctionApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__1_in_rule__FunctionApplication__Group__04385);
            rule__FunctionApplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__0"


    // $ANTLR start "rule__FunctionApplication__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2186:1: rule__FunctionApplication__Group__0__Impl : ( ( rule__FunctionApplication__AnnotationsAssignment_0 )* ) ;
    public final void rule__FunctionApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2190:1: ( ( ( rule__FunctionApplication__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2191:1: ( ( rule__FunctionApplication__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2191:1: ( ( rule__FunctionApplication__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2192:1: ( rule__FunctionApplication__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getFunctionApplicationAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2193:1: ( rule__FunctionApplication__AnnotationsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2193:2: rule__FunctionApplication__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__AnnotationsAssignment_0_in_rule__FunctionApplication__Group__0__Impl4412);
            	    rule__FunctionApplication__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFunctionApplicationAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__0__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2203:1: rule__FunctionApplication__Group__1 : rule__FunctionApplication__Group__1__Impl rule__FunctionApplication__Group__2 ;
    public final void rule__FunctionApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2207:1: ( rule__FunctionApplication__Group__1__Impl rule__FunctionApplication__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2208:2: rule__FunctionApplication__Group__1__Impl rule__FunctionApplication__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__1__Impl_in_rule__FunctionApplication__Group__14443);
            rule__FunctionApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__2_in_rule__FunctionApplication__Group__14446);
            rule__FunctionApplication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__1"


    // $ANTLR start "rule__FunctionApplication__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2215:1: rule__FunctionApplication__Group__1__Impl : ( ( rule__FunctionApplication__FunctionAssignment_1 ) ) ;
    public final void rule__FunctionApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2219:1: ( ( ( rule__FunctionApplication__FunctionAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2220:1: ( ( rule__FunctionApplication__FunctionAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2220:1: ( ( rule__FunctionApplication__FunctionAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2221:1: ( rule__FunctionApplication__FunctionAssignment_1 )
            {
             before(grammarAccess.getFunctionApplicationAccess().getFunctionAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2222:1: ( rule__FunctionApplication__FunctionAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2222:2: rule__FunctionApplication__FunctionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__FunctionAssignment_1_in_rule__FunctionApplication__Group__1__Impl4473);
            rule__FunctionApplication__FunctionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionApplicationAccess().getFunctionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__1__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2232:1: rule__FunctionApplication__Group__2 : rule__FunctionApplication__Group__2__Impl rule__FunctionApplication__Group__3 ;
    public final void rule__FunctionApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2236:1: ( rule__FunctionApplication__Group__2__Impl rule__FunctionApplication__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2237:2: rule__FunctionApplication__Group__2__Impl rule__FunctionApplication__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__2__Impl_in_rule__FunctionApplication__Group__24503);
            rule__FunctionApplication__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__3_in_rule__FunctionApplication__Group__24506);
            rule__FunctionApplication__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__2"


    // $ANTLR start "rule__FunctionApplication__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2244:1: rule__FunctionApplication__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2248:1: ( ( '(' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2249:1: ( '(' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2249:1: ( '(' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2250:1: '('
            {
             before(grammarAccess.getFunctionApplicationAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__FunctionApplication__Group__2__Impl4534); 
             after(grammarAccess.getFunctionApplicationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__2__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2263:1: rule__FunctionApplication__Group__3 : rule__FunctionApplication__Group__3__Impl rule__FunctionApplication__Group__4 ;
    public final void rule__FunctionApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2267:1: ( rule__FunctionApplication__Group__3__Impl rule__FunctionApplication__Group__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2268:2: rule__FunctionApplication__Group__3__Impl rule__FunctionApplication__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__3__Impl_in_rule__FunctionApplication__Group__34565);
            rule__FunctionApplication__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__4_in_rule__FunctionApplication__Group__34568);
            rule__FunctionApplication__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__3"


    // $ANTLR start "rule__FunctionApplication__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2275:1: rule__FunctionApplication__Group__3__Impl : ( ( rule__FunctionApplication__InputAssignment_3 ) ) ;
    public final void rule__FunctionApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2279:1: ( ( ( rule__FunctionApplication__InputAssignment_3 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2280:1: ( ( rule__FunctionApplication__InputAssignment_3 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2280:1: ( ( rule__FunctionApplication__InputAssignment_3 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2281:1: ( rule__FunctionApplication__InputAssignment_3 )
            {
             before(grammarAccess.getFunctionApplicationAccess().getInputAssignment_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2282:1: ( rule__FunctionApplication__InputAssignment_3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2282:2: rule__FunctionApplication__InputAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__InputAssignment_3_in_rule__FunctionApplication__Group__3__Impl4595);
            rule__FunctionApplication__InputAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionApplicationAccess().getInputAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__3__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2292:1: rule__FunctionApplication__Group__4 : rule__FunctionApplication__Group__4__Impl rule__FunctionApplication__Group__5 ;
    public final void rule__FunctionApplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2296:1: ( rule__FunctionApplication__Group__4__Impl rule__FunctionApplication__Group__5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2297:2: rule__FunctionApplication__Group__4__Impl rule__FunctionApplication__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__4__Impl_in_rule__FunctionApplication__Group__44625);
            rule__FunctionApplication__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__5_in_rule__FunctionApplication__Group__44628);
            rule__FunctionApplication__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__4"


    // $ANTLR start "rule__FunctionApplication__Group__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2304:1: rule__FunctionApplication__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionApplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2308:1: ( ( ')' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2309:1: ( ')' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2309:1: ( ')' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2310:1: ')'
            {
             before(grammarAccess.getFunctionApplicationAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__FunctionApplication__Group__4__Impl4656); 
             after(grammarAccess.getFunctionApplicationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__4__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2323:1: rule__FunctionApplication__Group__5 : rule__FunctionApplication__Group__5__Impl rule__FunctionApplication__Group__6 ;
    public final void rule__FunctionApplication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2327:1: ( rule__FunctionApplication__Group__5__Impl rule__FunctionApplication__Group__6 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2328:2: rule__FunctionApplication__Group__5__Impl rule__FunctionApplication__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__5__Impl_in_rule__FunctionApplication__Group__54687);
            rule__FunctionApplication__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__6_in_rule__FunctionApplication__Group__54690);
            rule__FunctionApplication__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__5"


    // $ANTLR start "rule__FunctionApplication__Group__5__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2335:1: rule__FunctionApplication__Group__5__Impl : ( '|' ) ;
    public final void rule__FunctionApplication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2339:1: ( ( '|' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2340:1: ( '|' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2340:1: ( '|' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2341:1: '|'
            {
             before(grammarAccess.getFunctionApplicationAccess().getVerticalLineKeyword_5()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__FunctionApplication__Group__5__Impl4718); 
             after(grammarAccess.getFunctionApplicationAccess().getVerticalLineKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__5__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__6"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2354:1: rule__FunctionApplication__Group__6 : rule__FunctionApplication__Group__6__Impl rule__FunctionApplication__Group__7 ;
    public final void rule__FunctionApplication__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2358:1: ( rule__FunctionApplication__Group__6__Impl rule__FunctionApplication__Group__7 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2359:2: rule__FunctionApplication__Group__6__Impl rule__FunctionApplication__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__6__Impl_in_rule__FunctionApplication__Group__64749);
            rule__FunctionApplication__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__7_in_rule__FunctionApplication__Group__64752);
            rule__FunctionApplication__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__6"


    // $ANTLR start "rule__FunctionApplication__Group__6__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2366:1: rule__FunctionApplication__Group__6__Impl : ( '->' ) ;
    public final void rule__FunctionApplication__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2370:1: ( ( '->' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2371:1: ( '->' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2371:1: ( '->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2372:1: '->'
            {
             before(grammarAccess.getFunctionApplicationAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FunctionApplication__Group__6__Impl4780); 
             after(grammarAccess.getFunctionApplicationAccess().getHyphenMinusGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__6__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__7"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2385:1: rule__FunctionApplication__Group__7 : rule__FunctionApplication__Group__7__Impl ;
    public final void rule__FunctionApplication__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2389:1: ( rule__FunctionApplication__Group__7__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2390:2: rule__FunctionApplication__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__Group__7__Impl_in_rule__FunctionApplication__Group__74811);
            rule__FunctionApplication__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__7"


    // $ANTLR start "rule__FunctionApplication__Group__7__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2396:1: rule__FunctionApplication__Group__7__Impl : ( ( rule__FunctionApplication__OutputAssignment_7 ) ) ;
    public final void rule__FunctionApplication__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2400:1: ( ( ( rule__FunctionApplication__OutputAssignment_7 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2401:1: ( ( rule__FunctionApplication__OutputAssignment_7 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2401:1: ( ( rule__FunctionApplication__OutputAssignment_7 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2402:1: ( rule__FunctionApplication__OutputAssignment_7 )
            {
             before(grammarAccess.getFunctionApplicationAccess().getOutputAssignment_7()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2403:1: ( rule__FunctionApplication__OutputAssignment_7 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2403:2: rule__FunctionApplication__OutputAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionApplication__OutputAssignment_7_in_rule__FunctionApplication__Group__7__Impl4838);
            rule__FunctionApplication__OutputAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFunctionApplicationAccess().getOutputAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__7__Impl"


    // $ANTLR start "rule__FunctionTypeReference__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2429:1: rule__FunctionTypeReference__Group__0 : rule__FunctionTypeReference__Group__0__Impl rule__FunctionTypeReference__Group__1 ;
    public final void rule__FunctionTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2433:1: ( rule__FunctionTypeReference__Group__0__Impl rule__FunctionTypeReference__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2434:2: rule__FunctionTypeReference__Group__0__Impl rule__FunctionTypeReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__0__Impl_in_rule__FunctionTypeReference__Group__04884);
            rule__FunctionTypeReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__1_in_rule__FunctionTypeReference__Group__04887);
            rule__FunctionTypeReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__0"


    // $ANTLR start "rule__FunctionTypeReference__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2441:1: rule__FunctionTypeReference__Group__0__Impl : ( ( rule__FunctionTypeReference__DefinitionAssignment_0 ) ) ;
    public final void rule__FunctionTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2445:1: ( ( ( rule__FunctionTypeReference__DefinitionAssignment_0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2446:1: ( ( rule__FunctionTypeReference__DefinitionAssignment_0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2446:1: ( ( rule__FunctionTypeReference__DefinitionAssignment_0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2447:1: ( rule__FunctionTypeReference__DefinitionAssignment_0 )
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getDefinitionAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2448:1: ( rule__FunctionTypeReference__DefinitionAssignment_0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2448:2: rule__FunctionTypeReference__DefinitionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__DefinitionAssignment_0_in_rule__FunctionTypeReference__Group__0__Impl4914);
            rule__FunctionTypeReference__DefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTypeReferenceAccess().getDefinitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__0__Impl"


    // $ANTLR start "rule__FunctionTypeReference__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2458:1: rule__FunctionTypeReference__Group__1 : rule__FunctionTypeReference__Group__1__Impl rule__FunctionTypeReference__Group__2 ;
    public final void rule__FunctionTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2462:1: ( rule__FunctionTypeReference__Group__1__Impl rule__FunctionTypeReference__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2463:2: rule__FunctionTypeReference__Group__1__Impl rule__FunctionTypeReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__1__Impl_in_rule__FunctionTypeReference__Group__14944);
            rule__FunctionTypeReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__2_in_rule__FunctionTypeReference__Group__14947);
            rule__FunctionTypeReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__1"


    // $ANTLR start "rule__FunctionTypeReference__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2470:1: rule__FunctionTypeReference__Group__1__Impl : ( '[' ) ;
    public final void rule__FunctionTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2474:1: ( ( '[' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2475:1: ( '[' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2475:1: ( '[' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2476:1: '['
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FunctionTypeReference__Group__1__Impl4975); 
             after(grammarAccess.getFunctionTypeReferenceAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__1__Impl"


    // $ANTLR start "rule__FunctionTypeReference__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2489:1: rule__FunctionTypeReference__Group__2 : rule__FunctionTypeReference__Group__2__Impl rule__FunctionTypeReference__Group__3 ;
    public final void rule__FunctionTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2493:1: ( rule__FunctionTypeReference__Group__2__Impl rule__FunctionTypeReference__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2494:2: rule__FunctionTypeReference__Group__2__Impl rule__FunctionTypeReference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__2__Impl_in_rule__FunctionTypeReference__Group__25006);
            rule__FunctionTypeReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__3_in_rule__FunctionTypeReference__Group__25009);
            rule__FunctionTypeReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__2"


    // $ANTLR start "rule__FunctionTypeReference__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2501:1: rule__FunctionTypeReference__Group__2__Impl : ( ( rule__FunctionTypeReference__DomainAssignment_2 ) ) ;
    public final void rule__FunctionTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2505:1: ( ( ( rule__FunctionTypeReference__DomainAssignment_2 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2506:1: ( ( rule__FunctionTypeReference__DomainAssignment_2 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2506:1: ( ( rule__FunctionTypeReference__DomainAssignment_2 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2507:1: ( rule__FunctionTypeReference__DomainAssignment_2 )
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getDomainAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2508:1: ( rule__FunctionTypeReference__DomainAssignment_2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2508:2: rule__FunctionTypeReference__DomainAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__DomainAssignment_2_in_rule__FunctionTypeReference__Group__2__Impl5036);
            rule__FunctionTypeReference__DomainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTypeReferenceAccess().getDomainAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__2__Impl"


    // $ANTLR start "rule__FunctionTypeReference__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2518:1: rule__FunctionTypeReference__Group__3 : rule__FunctionTypeReference__Group__3__Impl rule__FunctionTypeReference__Group__4 ;
    public final void rule__FunctionTypeReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2522:1: ( rule__FunctionTypeReference__Group__3__Impl rule__FunctionTypeReference__Group__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2523:2: rule__FunctionTypeReference__Group__3__Impl rule__FunctionTypeReference__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__3__Impl_in_rule__FunctionTypeReference__Group__35066);
            rule__FunctionTypeReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__4_in_rule__FunctionTypeReference__Group__35069);
            rule__FunctionTypeReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__3"


    // $ANTLR start "rule__FunctionTypeReference__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2530:1: rule__FunctionTypeReference__Group__3__Impl : ( '->' ) ;
    public final void rule__FunctionTypeReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2534:1: ( ( '->' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2535:1: ( '->' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2535:1: ( '->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2536:1: '->'
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FunctionTypeReference__Group__3__Impl5097); 
             after(grammarAccess.getFunctionTypeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__3__Impl"


    // $ANTLR start "rule__FunctionTypeReference__Group__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2549:1: rule__FunctionTypeReference__Group__4 : rule__FunctionTypeReference__Group__4__Impl rule__FunctionTypeReference__Group__5 ;
    public final void rule__FunctionTypeReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2553:1: ( rule__FunctionTypeReference__Group__4__Impl rule__FunctionTypeReference__Group__5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2554:2: rule__FunctionTypeReference__Group__4__Impl rule__FunctionTypeReference__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__4__Impl_in_rule__FunctionTypeReference__Group__45128);
            rule__FunctionTypeReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__5_in_rule__FunctionTypeReference__Group__45131);
            rule__FunctionTypeReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__4"


    // $ANTLR start "rule__FunctionTypeReference__Group__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2561:1: rule__FunctionTypeReference__Group__4__Impl : ( ( rule__FunctionTypeReference__CodomainAssignment_4 ) ) ;
    public final void rule__FunctionTypeReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2565:1: ( ( ( rule__FunctionTypeReference__CodomainAssignment_4 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2566:1: ( ( rule__FunctionTypeReference__CodomainAssignment_4 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2566:1: ( ( rule__FunctionTypeReference__CodomainAssignment_4 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2567:1: ( rule__FunctionTypeReference__CodomainAssignment_4 )
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getCodomainAssignment_4()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2568:1: ( rule__FunctionTypeReference__CodomainAssignment_4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2568:2: rule__FunctionTypeReference__CodomainAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__CodomainAssignment_4_in_rule__FunctionTypeReference__Group__4__Impl5158);
            rule__FunctionTypeReference__CodomainAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTypeReferenceAccess().getCodomainAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__4__Impl"


    // $ANTLR start "rule__FunctionTypeReference__Group__5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2578:1: rule__FunctionTypeReference__Group__5 : rule__FunctionTypeReference__Group__5__Impl ;
    public final void rule__FunctionTypeReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2582:1: ( rule__FunctionTypeReference__Group__5__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2583:2: rule__FunctionTypeReference__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionTypeReference__Group__5__Impl_in_rule__FunctionTypeReference__Group__55188);
            rule__FunctionTypeReference__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__5"


    // $ANTLR start "rule__FunctionTypeReference__Group__5__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2589:1: rule__FunctionTypeReference__Group__5__Impl : ( ']' ) ;
    public final void rule__FunctionTypeReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2593:1: ( ( ']' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2594:1: ( ']' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2594:1: ( ']' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2595:1: ']'
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getRightSquareBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__FunctionTypeReference__Group__5__Impl5216); 
             after(grammarAccess.getFunctionTypeReferenceAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__Group__5__Impl"


    // $ANTLR start "rule__EntityTypeReference__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2620:1: rule__EntityTypeReference__Group__0 : rule__EntityTypeReference__Group__0__Impl rule__EntityTypeReference__Group__1 ;
    public final void rule__EntityTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2624:1: ( rule__EntityTypeReference__Group__0__Impl rule__EntityTypeReference__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2625:2: rule__EntityTypeReference__Group__0__Impl rule__EntityTypeReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityTypeReference__Group__0__Impl_in_rule__EntityTypeReference__Group__05259);
            rule__EntityTypeReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EntityTypeReference__Group__1_in_rule__EntityTypeReference__Group__05262);
            rule__EntityTypeReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityTypeReference__Group__0"


    // $ANTLR start "rule__EntityTypeReference__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2632:1: rule__EntityTypeReference__Group__0__Impl : ( ( rule__EntityTypeReference__DefinitionAssignment_0 ) ) ;
    public final void rule__EntityTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2636:1: ( ( ( rule__EntityTypeReference__DefinitionAssignment_0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2637:1: ( ( rule__EntityTypeReference__DefinitionAssignment_0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2637:1: ( ( rule__EntityTypeReference__DefinitionAssignment_0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2638:1: ( rule__EntityTypeReference__DefinitionAssignment_0 )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getDefinitionAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2639:1: ( rule__EntityTypeReference__DefinitionAssignment_0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2639:2: rule__EntityTypeReference__DefinitionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityTypeReference__DefinitionAssignment_0_in_rule__EntityTypeReference__Group__0__Impl5289);
            rule__EntityTypeReference__DefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeReferenceAccess().getDefinitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityTypeReference__Group__0__Impl"


    // $ANTLR start "rule__EntityTypeReference__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2649:1: rule__EntityTypeReference__Group__1 : rule__EntityTypeReference__Group__1__Impl ;
    public final void rule__EntityTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2653:1: ( rule__EntityTypeReference__Group__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2654:2: rule__EntityTypeReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityTypeReference__Group__1__Impl_in_rule__EntityTypeReference__Group__15319);
            rule__EntityTypeReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityTypeReference__Group__1"


    // $ANTLR start "rule__EntityTypeReference__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2660:1: rule__EntityTypeReference__Group__1__Impl : ( ( rule__EntityTypeReference__ManyAssignment_1 )? ) ;
    public final void rule__EntityTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2664:1: ( ( ( rule__EntityTypeReference__ManyAssignment_1 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2665:1: ( ( rule__EntityTypeReference__ManyAssignment_1 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2665:1: ( ( rule__EntityTypeReference__ManyAssignment_1 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2666:1: ( rule__EntityTypeReference__ManyAssignment_1 )?
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getManyAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2667:1: ( rule__EntityTypeReference__ManyAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2667:2: rule__EntityTypeReference__ManyAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EntityTypeReference__ManyAssignment_1_in_rule__EntityTypeReference__Group__1__Impl5346);
                    rule__EntityTypeReference__ManyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityTypeReferenceAccess().getManyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityTypeReference__Group__1__Impl"


    // $ANTLR start "rule__QID__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2681:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2685:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2686:2: rule__QID__Group__0__Impl rule__QID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__05381);
            rule__QID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QID__Group__1_in_rule__QID__Group__05384);
            rule__QID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group__0"


    // $ANTLR start "rule__QID__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2693:1: rule__QID__Group__0__Impl : ( ruleNAME ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2697:1: ( ( ruleNAME ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2698:1: ( ruleNAME )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2698:1: ( ruleNAME )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2699:1: ruleNAME
            {
             before(grammarAccess.getQIDAccess().getNAMEParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNAME_in_rule__QID__Group__0__Impl5411);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getQIDAccess().getNAMEParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group__0__Impl"


    // $ANTLR start "rule__QID__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2710:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2714:1: ( rule__QID__Group__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2715:2: rule__QID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__15440);
            rule__QID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group__1"


    // $ANTLR start "rule__QID__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2721:1: rule__QID__Group__1__Impl : ( ( rule__QID__Group_1__0 )* ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2725:1: ( ( ( rule__QID__Group_1__0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2726:1: ( ( rule__QID__Group_1__0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2726:1: ( ( rule__QID__Group_1__0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2727:1: ( rule__QID__Group_1__0 )*
            {
             before(grammarAccess.getQIDAccess().getGroup_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2728:1: ( rule__QID__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2728:2: rule__QID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl5467);
            	    rule__QID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getQIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group__1__Impl"


    // $ANTLR start "rule__QID__Group_1__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2742:1: rule__QID__Group_1__0 : rule__QID__Group_1__0__Impl rule__QID__Group_1__1 ;
    public final void rule__QID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2746:1: ( rule__QID__Group_1__0__Impl rule__QID__Group_1__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2747:2: rule__QID__Group_1__0__Impl rule__QID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__05502);
            rule__QID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__05505);
            rule__QID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group_1__0"


    // $ANTLR start "rule__QID__Group_1__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2754:1: rule__QID__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2758:1: ( ( '::' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2759:1: ( '::' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2759:1: ( '::' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2760:1: '::'
            {
             before(grammarAccess.getQIDAccess().getColonColonKeyword_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__QID__Group_1__0__Impl5533); 
             after(grammarAccess.getQIDAccess().getColonColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group_1__0__Impl"


    // $ANTLR start "rule__QID__Group_1__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2773:1: rule__QID__Group_1__1 : rule__QID__Group_1__1__Impl ;
    public final void rule__QID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2777:1: ( rule__QID__Group_1__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2778:2: rule__QID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__15564);
            rule__QID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group_1__1"


    // $ANTLR start "rule__QID__Group_1__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2784:1: rule__QID__Group_1__1__Impl : ( ruleNAME ) ;
    public final void rule__QID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2788:1: ( ( ruleNAME ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2789:1: ( ruleNAME )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2789:1: ( ruleNAME )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2790:1: ruleNAME
            {
             before(grammarAccess.getQIDAccess().getNAMEParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleNAME_in_rule__QID__Group_1__1__Impl5591);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getQIDAccess().getNAMEParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group_1__1__Impl"


    // $ANTLR start "rule__NAME__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2805:1: rule__NAME__Group__0 : rule__NAME__Group__0__Impl rule__NAME__Group__1 ;
    public final void rule__NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2809:1: ( rule__NAME__Group__0__Impl rule__NAME__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2810:2: rule__NAME__Group__0__Impl rule__NAME__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NAME__Group__0__Impl_in_rule__NAME__Group__05624);
            rule__NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NAME__Group__1_in_rule__NAME__Group__05627);
            rule__NAME__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group__0"


    // $ANTLR start "rule__NAME__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2817:1: rule__NAME__Group__0__Impl : ( ruleID ) ;
    public final void rule__NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2821:1: ( ( ruleID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2822:1: ( ruleID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2822:1: ( ruleID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2823:1: ruleID
            {
             before(grammarAccess.getNAMEAccess().getIDParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID_in_rule__NAME__Group__0__Impl5654);
            ruleID();

            state._fsp--;

             after(grammarAccess.getNAMEAccess().getIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group__0__Impl"


    // $ANTLR start "rule__NAME__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2834:1: rule__NAME__Group__1 : rule__NAME__Group__1__Impl ;
    public final void rule__NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2838:1: ( rule__NAME__Group__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2839:2: rule__NAME__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NAME__Group__1__Impl_in_rule__NAME__Group__15683);
            rule__NAME__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group__1"


    // $ANTLR start "rule__NAME__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2845:1: rule__NAME__Group__1__Impl : ( ( rule__NAME__Group_1__0 )* ) ;
    public final void rule__NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2849:1: ( ( ( rule__NAME__Group_1__0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2850:1: ( ( rule__NAME__Group_1__0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2850:1: ( ( rule__NAME__Group_1__0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2851:1: ( rule__NAME__Group_1__0 )*
            {
             before(grammarAccess.getNAMEAccess().getGroup_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2852:1: ( rule__NAME__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2852:2: rule__NAME__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__NAME__Group_1__0_in_rule__NAME__Group__1__Impl5710);
            	    rule__NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getNAMEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group__1__Impl"


    // $ANTLR start "rule__NAME__Group_1__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2866:1: rule__NAME__Group_1__0 : rule__NAME__Group_1__0__Impl rule__NAME__Group_1__1 ;
    public final void rule__NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2870:1: ( rule__NAME__Group_1__0__Impl rule__NAME__Group_1__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2871:2: rule__NAME__Group_1__0__Impl rule__NAME__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NAME__Group_1__0__Impl_in_rule__NAME__Group_1__05745);
            rule__NAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NAME__Group_1__1_in_rule__NAME__Group_1__05748);
            rule__NAME__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group_1__0"


    // $ANTLR start "rule__NAME__Group_1__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2878:1: rule__NAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2882:1: ( ( '.' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2883:1: ( '.' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2883:1: ( '.' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2884:1: '.'
            {
             before(grammarAccess.getNAMEAccess().getFullStopKeyword_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__NAME__Group_1__0__Impl5776); 
             after(grammarAccess.getNAMEAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group_1__0__Impl"


    // $ANTLR start "rule__NAME__Group_1__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2897:1: rule__NAME__Group_1__1 : rule__NAME__Group_1__1__Impl ;
    public final void rule__NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2901:1: ( rule__NAME__Group_1__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2902:2: rule__NAME__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NAME__Group_1__1__Impl_in_rule__NAME__Group_1__15807);
            rule__NAME__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group_1__1"


    // $ANTLR start "rule__NAME__Group_1__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2908:1: rule__NAME__Group_1__1__Impl : ( ruleID ) ;
    public final void rule__NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2912:1: ( ( ruleID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2913:1: ( ruleID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2913:1: ( ruleID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2914:1: ruleID
            {
             before(grammarAccess.getNAMEAccess().getIDParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleID_in_rule__NAME__Group_1__1__Impl5834);
            ruleID();

            state._fsp--;

             after(grammarAccess.getNAMEAccess().getIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group_1__1__Impl"


    // $ANTLR start "rule__Megamodel__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2930:1: rule__Megamodel__AnnotationsAssignment_0 : ( rulePrefixAnnotation ) ;
    public final void rule__Megamodel__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2934:1: ( ( rulePrefixAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2935:1: ( rulePrefixAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2935:1: ( rulePrefixAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2936:1: rulePrefixAnnotation
            {
             before(grammarAccess.getMegamodelAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_rule__Megamodel__AnnotationsAssignment_05872);
            rulePrefixAnnotation();

            state._fsp--;

             after(grammarAccess.getMegamodelAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__AnnotationsAssignment_0"


    // $ANTLR start "rule__Megamodel__NameAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2945:1: rule__Megamodel__NameAssignment_2 : ( ruleQID ) ;
    public final void rule__Megamodel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2949:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2950:1: ( ruleQID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2950:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2951:1: ruleQID
            {
             before(grammarAccess.getMegamodelAccess().getNameQIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__Megamodel__NameAssignment_25903);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getMegamodelAccess().getNameQIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__NameAssignment_2"


    // $ANTLR start "rule__Megamodel__ImportsAssignment_3_0_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2960:1: rule__Megamodel__ImportsAssignment_3_0_1 : ( ( ruleQID ) ) ;
    public final void rule__Megamodel__ImportsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2964:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2965:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2965:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2966:1: ( ruleQID )
            {
             before(grammarAccess.getMegamodelAccess().getImportsMegamodelCrossReference_3_0_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2967:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2968:1: ruleQID
            {
             before(grammarAccess.getMegamodelAccess().getImportsMegamodelQIDParserRuleCall_3_0_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__Megamodel__ImportsAssignment_3_0_15938);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getMegamodelAccess().getImportsMegamodelQIDParserRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getMegamodelAccess().getImportsMegamodelCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__ImportsAssignment_3_0_1"


    // $ANTLR start "rule__Megamodel__DeclarationsAssignment_3_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2979:1: rule__Megamodel__DeclarationsAssignment_3_1 : ( ruleDeclaration ) ;
    public final void rule__Megamodel__DeclarationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2983:1: ( ( ruleDeclaration ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2984:1: ( ruleDeclaration )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2984:1: ( ruleDeclaration )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2985:1: ruleDeclaration
            {
             before(grammarAccess.getMegamodelAccess().getDeclarationsDeclarationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_rule__Megamodel__DeclarationsAssignment_3_15973);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getMegamodelAccess().getDeclarationsDeclarationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__DeclarationsAssignment_3_1"


    // $ANTLR start "rule__Megamodel__BindingsAssignment_3_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2994:1: rule__Megamodel__BindingsAssignment_3_2 : ( ruleLink ) ;
    public final void rule__Megamodel__BindingsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2998:1: ( ( ruleLink ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2999:1: ( ruleLink )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2999:1: ( ruleLink )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3000:1: ruleLink
            {
             before(grammarAccess.getMegamodelAccess().getBindingsLinkParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_rule__Megamodel__BindingsAssignment_3_26004);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getMegamodelAccess().getBindingsLinkParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Megamodel__BindingsAssignment_3_2"


    // $ANTLR start "rule__PrefixAnnotation__KeyAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3009:1: rule__PrefixAnnotation__KeyAssignment_1 : ( ruleQID ) ;
    public final void rule__PrefixAnnotation__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3013:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3014:1: ( ruleQID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3014:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3015:1: ruleQID
            {
             before(grammarAccess.getPrefixAnnotationAccess().getKeyQIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__PrefixAnnotation__KeyAssignment_16035);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getPrefixAnnotationAccess().getKeyQIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixAnnotation__KeyAssignment_1"


    // $ANTLR start "rule__PrefixAnnotation__ValueAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3024:1: rule__PrefixAnnotation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PrefixAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3028:1: ( ( RULE_STRING ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3029:1: ( RULE_STRING )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3029:1: ( RULE_STRING )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3030:1: RULE_STRING
            {
             before(grammarAccess.getPrefixAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__PrefixAnnotation__ValueAssignment_26066); 
             after(grammarAccess.getPrefixAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__ShowNameAnnotation__ValueAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3039:1: rule__ShowNameAnnotation__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ShowNameAnnotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3043:1: ( ( RULE_STRING ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3044:1: ( RULE_STRING )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3044:1: ( RULE_STRING )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3045:1: RULE_STRING
            {
             before(grammarAccess.getShowNameAnnotationAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ShowNameAnnotation__ValueAssignment_16097); 
             after(grammarAccess.getShowNameAnnotationAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowNameAnnotation__ValueAssignment_1"


    // $ANTLR start "rule__Link__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3054:1: rule__Link__AnnotationsAssignment_0 : ( rulePrefixAnnotation ) ;
    public final void rule__Link__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3058:1: ( ( rulePrefixAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3059:1: ( rulePrefixAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3059:1: ( rulePrefixAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3060:1: rulePrefixAnnotation
            {
             before(grammarAccess.getLinkAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_rule__Link__AnnotationsAssignment_06128);
            rulePrefixAnnotation();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__AnnotationsAssignment_0"


    // $ANTLR start "rule__Link__LinkAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3069:1: rule__Link__LinkAssignment_1 : ( ( ruleQID ) ) ;
    public final void rule__Link__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3073:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3074:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3074:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3075:1: ( ruleQID )
            {
             before(grammarAccess.getLinkAccess().getLinkEntityCrossReference_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3076:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3077:1: ruleQID
            {
             before(grammarAccess.getLinkAccess().getLinkEntityQIDParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__Link__LinkAssignment_16163);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getLinkEntityQIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getLinkEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__LinkAssignment_1"


    // $ANTLR start "rule__Link__InputAssignment_2_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3088:1: rule__Link__InputAssignment_2_1 : ( ( ruleQID ) ) ;
    public final void rule__Link__InputAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3092:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3093:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3093:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3094:1: ( ruleQID )
            {
             before(grammarAccess.getLinkAccess().getInputEntityCrossReference_2_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3095:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3096:1: ruleQID
            {
             before(grammarAccess.getLinkAccess().getInputEntityQIDParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__Link__InputAssignment_2_16202);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInputEntityQIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getInputEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InputAssignment_2_1"


    // $ANTLR start "rule__Link__OutputAssignment_2_5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3107:1: rule__Link__OutputAssignment_2_5 : ( ( ruleQID ) ) ;
    public final void rule__Link__OutputAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3111:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3112:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3112:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3113:1: ( ruleQID )
            {
             before(grammarAccess.getLinkAccess().getOutputEntityCrossReference_2_5_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3114:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3115:1: ruleQID
            {
             before(grammarAccess.getLinkAccess().getOutputEntityQIDParserRuleCall_2_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__Link__OutputAssignment_2_56241);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getOutputEntityQIDParserRuleCall_2_5_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getOutputEntityCrossReference_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__OutputAssignment_2_5"


    // $ANTLR start "rule__Link__ToAssignment_4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3126:1: rule__Link__ToAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Link__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3130:1: ( ( RULE_STRING ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3131:1: ( RULE_STRING )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3131:1: ( RULE_STRING )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3132:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getToSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Link__ToAssignment_46276); 
             after(grammarAccess.getLinkAccess().getToSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__ToAssignment_4"


    // $ANTLR start "rule__EntityType__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3141:1: rule__EntityType__AnnotationsAssignment_0 : ( rulePrefixAnnotation ) ;
    public final void rule__EntityType__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3145:1: ( ( rulePrefixAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3146:1: ( rulePrefixAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3146:1: ( rulePrefixAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3147:1: rulePrefixAnnotation
            {
             before(grammarAccess.getEntityTypeAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_rule__EntityType__AnnotationsAssignment_06307);
            rulePrefixAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__AnnotationsAssignment_0"


    // $ANTLR start "rule__EntityType__NameAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3156:1: rule__EntityType__NameAssignment_1 : ( ruleQID ) ;
    public final void rule__EntityType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3160:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3161:1: ( ruleQID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3161:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3162:1: ruleQID
            {
             before(grammarAccess.getEntityTypeAccess().getNameQIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__EntityType__NameAssignment_16338);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getNameQIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__NameAssignment_1"


    // $ANTLR start "rule__EntityType__AnnotationsAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3171:1: rule__EntityType__AnnotationsAssignment_2 : ( ruleShowNameAnnotation ) ;
    public final void rule__EntityType__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3175:1: ( ( ruleShowNameAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3176:1: ( ruleShowNameAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3176:1: ( ruleShowNameAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3177:1: ruleShowNameAnnotation
            {
             before(grammarAccess.getEntityTypeAccess().getAnnotationsShowNameAnnotationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleShowNameAnnotation_in_rule__EntityType__AnnotationsAssignment_26369);
            ruleShowNameAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getAnnotationsShowNameAnnotationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__AnnotationsAssignment_2"


    // $ANTLR start "rule__EntityType__SupertypeAssignment_3_0_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3186:1: rule__EntityType__SupertypeAssignment_3_0_1 : ( ruleTypeReference ) ;
    public final void rule__EntityType__SupertypeAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3190:1: ( ( ruleTypeReference ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3191:1: ( ruleTypeReference )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3191:1: ( ruleTypeReference )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3192:1: ruleTypeReference
            {
             before(grammarAccess.getEntityTypeAccess().getSupertypeTypeReferenceParserRuleCall_3_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_rule__EntityType__SupertypeAssignment_3_0_16400);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getSupertypeTypeReferenceParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__SupertypeAssignment_3_0_1"


    // $ANTLR start "rule__RelationshipType__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3201:1: rule__RelationshipType__AnnotationsAssignment_0 : ( rulePrefixAnnotation ) ;
    public final void rule__RelationshipType__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3205:1: ( ( rulePrefixAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3206:1: ( rulePrefixAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3206:1: ( rulePrefixAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3207:1: rulePrefixAnnotation
            {
             before(grammarAccess.getRelationshipTypeAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_rule__RelationshipType__AnnotationsAssignment_06431);
            rulePrefixAnnotation();

            state._fsp--;

             after(grammarAccess.getRelationshipTypeAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__AnnotationsAssignment_0"


    // $ANTLR start "rule__RelationshipType__NameAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3216:1: rule__RelationshipType__NameAssignment_1 : ( ruleQID ) ;
    public final void rule__RelationshipType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3220:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3221:1: ( ruleQID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3221:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3222:1: ruleQID
            {
             before(grammarAccess.getRelationshipTypeAccess().getNameQIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__RelationshipType__NameAssignment_16462);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getRelationshipTypeAccess().getNameQIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__NameAssignment_1"


    // $ANTLR start "rule__RelationshipType__AnnotationsAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3231:1: rule__RelationshipType__AnnotationsAssignment_2 : ( ruleShowNameAnnotation ) ;
    public final void rule__RelationshipType__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3235:1: ( ( ruleShowNameAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3236:1: ( ruleShowNameAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3236:1: ( ruleShowNameAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3237:1: ruleShowNameAnnotation
            {
             before(grammarAccess.getRelationshipTypeAccess().getAnnotationsShowNameAnnotationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleShowNameAnnotation_in_rule__RelationshipType__AnnotationsAssignment_26493);
            ruleShowNameAnnotation();

            state._fsp--;

             after(grammarAccess.getRelationshipTypeAccess().getAnnotationsShowNameAnnotationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__AnnotationsAssignment_2"


    // $ANTLR start "rule__RelationshipType__LeftAssignment_4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3246:1: rule__RelationshipType__LeftAssignment_4 : ( ruleTypeReference ) ;
    public final void rule__RelationshipType__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3250:1: ( ( ruleTypeReference ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3251:1: ( ruleTypeReference )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3251:1: ( ruleTypeReference )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3252:1: ruleTypeReference
            {
             before(grammarAccess.getRelationshipTypeAccess().getLeftTypeReferenceParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_rule__RelationshipType__LeftAssignment_46524);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getRelationshipTypeAccess().getLeftTypeReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__LeftAssignment_4"


    // $ANTLR start "rule__RelationshipType__RightAssignment_6"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3261:1: rule__RelationshipType__RightAssignment_6 : ( ruleTypeReference ) ;
    public final void rule__RelationshipType__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3265:1: ( ( ruleTypeReference ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3266:1: ( ruleTypeReference )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3266:1: ( ruleTypeReference )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3267:1: ruleTypeReference
            {
             before(grammarAccess.getRelationshipTypeAccess().getRightTypeReferenceParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_rule__RelationshipType__RightAssignment_66555);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getRelationshipTypeAccess().getRightTypeReferenceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__RightAssignment_6"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3276:1: rule__Entity__AnnotationsAssignment_0 : ( rulePrefixAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3280:1: ( ( rulePrefixAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3281:1: ( rulePrefixAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3281:1: ( rulePrefixAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3282:1: rulePrefixAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_rule__Entity__AnnotationsAssignment_06586);
            rulePrefixAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnotationsAssignment_0"


    // $ANTLR start "rule__Entity__DependentAssignment_1_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3291:1: rule__Entity__DependentAssignment_1_0 : ( ( '?' ) ) ;
    public final void rule__Entity__DependentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3295:1: ( ( ( '?' ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3296:1: ( ( '?' ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3296:1: ( ( '?' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3297:1: ( '?' )
            {
             before(grammarAccess.getEntityAccess().getDependentQuestionMarkKeyword_1_0_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3298:1: ( '?' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3299:1: '?'
            {
             before(grammarAccess.getEntityAccess().getDependentQuestionMarkKeyword_1_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Entity__DependentAssignment_1_06622); 
             after(grammarAccess.getEntityAccess().getDependentQuestionMarkKeyword_1_0_0()); 

            }

             after(grammarAccess.getEntityAccess().getDependentQuestionMarkKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DependentAssignment_1_0"


    // $ANTLR start "rule__Entity__ParameterAssignment_1_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3314:1: rule__Entity__ParameterAssignment_1_1 : ( ( '!' ) ) ;
    public final void rule__Entity__ParameterAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3318:1: ( ( ( '!' ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3319:1: ( ( '!' ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3319:1: ( ( '!' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3320:1: ( '!' )
            {
             before(grammarAccess.getEntityAccess().getParameterExclamationMarkKeyword_1_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3321:1: ( '!' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3322:1: '!'
            {
             before(grammarAccess.getEntityAccess().getParameterExclamationMarkKeyword_1_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Entity__ParameterAssignment_1_16666); 
             after(grammarAccess.getEntityAccess().getParameterExclamationMarkKeyword_1_1_0()); 

            }

             after(grammarAccess.getEntityAccess().getParameterExclamationMarkKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ParameterAssignment_1_1"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3337:1: rule__Entity__NameAssignment_2 : ( ruleQID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3341:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3342:1: ( ruleQID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3342:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3343:1: ruleQID
            {
             before(grammarAccess.getEntityAccess().getNameQIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__Entity__NameAssignment_26705);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameQIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3352:1: rule__Entity__AnnotationsAssignment_3 : ( ruleShowNameAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3356:1: ( ( ruleShowNameAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3357:1: ( ruleShowNameAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3357:1: ( ruleShowNameAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3358:1: ruleShowNameAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsShowNameAnnotationParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleShowNameAnnotation_in_rule__Entity__AnnotationsAssignment_36736);
            ruleShowNameAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsShowNameAnnotationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnotationsAssignment_3"


    // $ANTLR start "rule__Entity__TypeAssignment_5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3367:1: rule__Entity__TypeAssignment_5 : ( ruleTypeReference ) ;
    public final void rule__Entity__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3371:1: ( ( ruleTypeReference ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3372:1: ( ruleTypeReference )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3372:1: ( ruleTypeReference )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3373:1: ruleTypeReference
            {
             before(grammarAccess.getEntityAccess().getTypeTypeReferenceParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_rule__Entity__TypeAssignment_56767);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getTypeTypeReferenceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__TypeAssignment_5"


    // $ANTLR start "rule__Relationship__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3382:1: rule__Relationship__AnnotationsAssignment_0 : ( rulePrefixAnnotation ) ;
    public final void rule__Relationship__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3386:1: ( ( rulePrefixAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3387:1: ( rulePrefixAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3387:1: ( rulePrefixAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3388:1: rulePrefixAnnotation
            {
             before(grammarAccess.getRelationshipAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_rule__Relationship__AnnotationsAssignment_06798);
            rulePrefixAnnotation();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__AnnotationsAssignment_0"


    // $ANTLR start "rule__Relationship__LeftAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3397:1: rule__Relationship__LeftAssignment_1 : ( ( ruleQID ) ) ;
    public final void rule__Relationship__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3401:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3402:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3402:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3403:1: ( ruleQID )
            {
             before(grammarAccess.getRelationshipAccess().getLeftEntityCrossReference_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3404:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3405:1: ruleQID
            {
             before(grammarAccess.getRelationshipAccess().getLeftEntityQIDParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__Relationship__LeftAssignment_16833);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getLeftEntityQIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getLeftEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__LeftAssignment_1"


    // $ANTLR start "rule__Relationship__TypeAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3416:1: rule__Relationship__TypeAssignment_2 : ( ( ruleQID ) ) ;
    public final void rule__Relationship__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3420:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3421:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3421:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3422:1: ( ruleQID )
            {
             before(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeCrossReference_2_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3423:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3424:1: ruleQID
            {
             before(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeQIDParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__Relationship__TypeAssignment_26872);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeQIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TypeAssignment_2"


    // $ANTLR start "rule__Relationship__RightAssignment_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3435:1: rule__Relationship__RightAssignment_3 : ( ( ruleQID ) ) ;
    public final void rule__Relationship__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3439:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3440:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3440:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3441:1: ( ruleQID )
            {
             before(grammarAccess.getRelationshipAccess().getRightEntityCrossReference_3_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3442:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3443:1: ruleQID
            {
             before(grammarAccess.getRelationshipAccess().getRightEntityQIDParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__Relationship__RightAssignment_36911);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getRightEntityQIDParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getRightEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__RightAssignment_3"


    // $ANTLR start "rule__FunctionApplication__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3454:1: rule__FunctionApplication__AnnotationsAssignment_0 : ( rulePrefixAnnotation ) ;
    public final void rule__FunctionApplication__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3458:1: ( ( rulePrefixAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3459:1: ( rulePrefixAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3459:1: ( rulePrefixAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3460:1: rulePrefixAnnotation
            {
             before(grammarAccess.getFunctionApplicationAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrefixAnnotation_in_rule__FunctionApplication__AnnotationsAssignment_06946);
            rulePrefixAnnotation();

            state._fsp--;

             after(grammarAccess.getFunctionApplicationAccess().getAnnotationsPrefixAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__AnnotationsAssignment_0"


    // $ANTLR start "rule__FunctionApplication__FunctionAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3469:1: rule__FunctionApplication__FunctionAssignment_1 : ( ( ruleQID ) ) ;
    public final void rule__FunctionApplication__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3473:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3474:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3474:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3475:1: ( ruleQID )
            {
             before(grammarAccess.getFunctionApplicationAccess().getFunctionEntityCrossReference_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3476:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3477:1: ruleQID
            {
             before(grammarAccess.getFunctionApplicationAccess().getFunctionEntityQIDParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__FunctionApplication__FunctionAssignment_16981);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getFunctionApplicationAccess().getFunctionEntityQIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFunctionApplicationAccess().getFunctionEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__FunctionAssignment_1"


    // $ANTLR start "rule__FunctionApplication__InputAssignment_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3488:1: rule__FunctionApplication__InputAssignment_3 : ( ( ruleQID ) ) ;
    public final void rule__FunctionApplication__InputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3492:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3493:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3493:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3494:1: ( ruleQID )
            {
             before(grammarAccess.getFunctionApplicationAccess().getInputEntityCrossReference_3_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3495:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3496:1: ruleQID
            {
             before(grammarAccess.getFunctionApplicationAccess().getInputEntityQIDParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__FunctionApplication__InputAssignment_37020);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getFunctionApplicationAccess().getInputEntityQIDParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFunctionApplicationAccess().getInputEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__InputAssignment_3"


    // $ANTLR start "rule__FunctionApplication__OutputAssignment_7"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3507:1: rule__FunctionApplication__OutputAssignment_7 : ( ( ruleQID ) ) ;
    public final void rule__FunctionApplication__OutputAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3511:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3512:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3512:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3513:1: ( ruleQID )
            {
             before(grammarAccess.getFunctionApplicationAccess().getOutputEntityCrossReference_7_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3514:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3515:1: ruleQID
            {
             before(grammarAccess.getFunctionApplicationAccess().getOutputEntityQIDParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__FunctionApplication__OutputAssignment_77059);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getFunctionApplicationAccess().getOutputEntityQIDParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getFunctionApplicationAccess().getOutputEntityCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__OutputAssignment_7"


    // $ANTLR start "rule__FunctionTypeReference__DefinitionAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3526:1: rule__FunctionTypeReference__DefinitionAssignment_0 : ( ( ruleQID ) ) ;
    public final void rule__FunctionTypeReference__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3530:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3531:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3531:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3532:1: ( ruleQID )
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getDefinitionEntityTypeCrossReference_0_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3533:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3534:1: ruleQID
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getDefinitionEntityTypeQIDParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__FunctionTypeReference__DefinitionAssignment_07098);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getFunctionTypeReferenceAccess().getDefinitionEntityTypeQIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFunctionTypeReferenceAccess().getDefinitionEntityTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__DefinitionAssignment_0"


    // $ANTLR start "rule__FunctionTypeReference__DomainAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3545:1: rule__FunctionTypeReference__DomainAssignment_2 : ( ( ruleQID ) ) ;
    public final void rule__FunctionTypeReference__DomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3549:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3550:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3550:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3551:1: ( ruleQID )
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getDomainEntityCrossReference_2_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3552:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3553:1: ruleQID
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getDomainEntityQIDParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__FunctionTypeReference__DomainAssignment_27137);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getFunctionTypeReferenceAccess().getDomainEntityQIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFunctionTypeReferenceAccess().getDomainEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__DomainAssignment_2"


    // $ANTLR start "rule__FunctionTypeReference__CodomainAssignment_4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3564:1: rule__FunctionTypeReference__CodomainAssignment_4 : ( ( ruleQID ) ) ;
    public final void rule__FunctionTypeReference__CodomainAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3568:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3569:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3569:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3570:1: ( ruleQID )
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getCodomainEntityCrossReference_4_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3571:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3572:1: ruleQID
            {
             before(grammarAccess.getFunctionTypeReferenceAccess().getCodomainEntityQIDParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__FunctionTypeReference__CodomainAssignment_47176);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getFunctionTypeReferenceAccess().getCodomainEntityQIDParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFunctionTypeReferenceAccess().getCodomainEntityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionTypeReference__CodomainAssignment_4"


    // $ANTLR start "rule__EntityTypeReference__DefinitionAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3583:1: rule__EntityTypeReference__DefinitionAssignment_0 : ( ( ruleQID ) ) ;
    public final void rule__EntityTypeReference__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3587:1: ( ( ( ruleQID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3588:1: ( ( ruleQID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3588:1: ( ( ruleQID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3589:1: ( ruleQID )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getDefinitionEntityTypeCrossReference_0_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3590:1: ( ruleQID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3591:1: ruleQID
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getDefinitionEntityTypeQIDParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQID_in_rule__EntityTypeReference__DefinitionAssignment_07215);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getEntityTypeReferenceAccess().getDefinitionEntityTypeQIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEntityTypeReferenceAccess().getDefinitionEntityTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityTypeReference__DefinitionAssignment_0"


    // $ANTLR start "rule__EntityTypeReference__ManyAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3602:1: rule__EntityTypeReference__ManyAssignment_1 : ( ( '+' ) ) ;
    public final void rule__EntityTypeReference__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3606:1: ( ( ( '+' ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3607:1: ( ( '+' ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3607:1: ( ( '+' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3608:1: ( '+' )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getManyPlusSignKeyword_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3609:1: ( '+' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3610:1: '+'
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getManyPlusSignKeyword_1_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EntityTypeReference__ManyAssignment_17255); 
             after(grammarAccess.getEntityTypeReferenceAccess().getManyPlusSignKeyword_1_0()); 

            }

             after(grammarAccess.getEntityTypeReferenceAccess().getManyPlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityTypeReference__ManyAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA1_eotS =
        "\66\uffff";
    static final String DFA1_eofS =
        "\53\uffff\2\5\2\uffff\4\5\1\uffff\2\5";
    static final String DFA1_minS =
        "\1\4\1\uffff\3\4\1\uffff\5\4\1\uffff\7\4\2\22\7\4\1\23\3\4\4\22\1\24\4\4\2\22\13\4";
    static final String DFA1_maxS =
        "\1\35\1\uffff\1\5\2\33\1\uffff\2\35\3\5\1\uffff\2\5\1\35\6\33\4\35\3\5\1\23\1\5\6\33\1\24\2\35\2\5\2\33\2\35\2\5\4\35\1\5\2\35";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\5\uffff\1\3\52\uffff";
    static final String DFA1_specialS =
        "\66\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\1\4\6\uffff\1\1\1\2\16\uffff\2\5",
            "",
            "\1\6\1\7",
            "\2\5\10\uffff\1\5\1\uffff\1\13\1\12\3\uffff\2\5\2\uffff\1\5\1\11\1\10",
            "\2\5\10\uffff\1\5\1\uffff\1\13\1\12\3\uffff\2\5\2\uffff\1\5\1\11\1\10",
            "",
            "\1\3\1\4\1\16\6\uffff\1\2\14\uffff\1\15\1\14\2\5",
            "\1\3\1\4\1\16\6\uffff\1\2\14\uffff\1\15\1\14\2\5",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "",
            "\1\25\1\26",
            "\1\27\1\30",
            "\1\3\1\4\7\uffff\1\2\16\uffff\2\5",
            "\2\5\10\uffff\1\5\1\uffff\1\13\1\12\3\uffff\2\5\2\uffff\1\5\1\11\1\10",
            "\2\5\10\uffff\1\5\1\uffff\1\13\1\12\3\uffff\2\5\2\uffff\1\5\1\11\1\10",
            "\2\5\10\uffff\1\5\1\uffff\1\13\1\12\3\uffff\2\5\2\uffff\1\5\1\11\1\31",
            "\2\5\10\uffff\1\5\1\uffff\1\13\1\12\3\uffff\2\5\2\uffff\1\5\1\11\1\31",
            "\1\34\7\uffff\1\33\1\32",
            "\1\34\7\uffff\1\33\1\32",
            "\1\3\1\4\1\16\6\uffff\1\2\14\uffff\1\15\1\14\2\5",
            "\1\3\1\4\1\16\6\uffff\1\2\14\uffff\1\15\1\14\2\5",
            "\1\3\1\4\1\16\6\uffff\1\2\14\uffff\1\15\1\35\2\5",
            "\1\3\1\4\1\16\6\uffff\1\2\14\uffff\1\15\1\35\2\5",
            "\1\36\1\37",
            "\1\40\1\41",
            "\1\42\1\43",
            "\1\44",
            "\1\45\1\46",
            "\2\5\10\uffff\1\5\1\uffff\1\13\1\12\3\uffff\2\5\2\uffff\1\5\1\11\1\31",
            "\2\5\10\uffff\1\5\1\uffff\1\13\1\12\3\uffff\2\5\2\uffff\1\5\1\11\1\31",
            "\1\34\7\uffff\1\33\1\32",
            "\1\34\7\uffff\1\33\1\32",
            "\1\34\7\uffff\1\33\1\47",
            "\1\34\7\uffff\1\33\1\47",
            "\1\50",
            "\1\3\1\4\1\16\6\uffff\1\2\14\uffff\1\15\1\35\2\5",
            "\1\3\1\4\1\16\6\uffff\1\2\14\uffff\1\15\1\35\2\5",
            "\1\51\1\52",
            "\1\53\1\54",
            "\1\34\7\uffff\1\33\1\47",
            "\1\34\7\uffff\1\33\1\47",
            "\2\5\6\uffff\2\5\2\uffff\1\13\11\uffff\1\56\1\55\2\5",
            "\2\5\6\uffff\2\5\2\uffff\1\13\11\uffff\1\56\1\55\2\5",
            "\1\57\1\60",
            "\1\61\1\62",
            "\2\5\6\uffff\2\5\2\uffff\1\13\11\uffff\1\56\1\55\2\5",
            "\2\5\6\uffff\2\5\2\uffff\1\13\11\uffff\1\56\1\55\2\5",
            "\2\5\6\uffff\2\5\2\uffff\1\13\11\uffff\1\56\1\63\2\5",
            "\2\5\6\uffff\2\5\2\uffff\1\13\11\uffff\1\56\1\63\2\5",
            "\1\64\1\65",
            "\2\5\6\uffff\2\5\2\uffff\1\13\11\uffff\1\56\1\63\2\5",
            "\2\5\6\uffff\2\5\2\uffff\1\13\11\uffff\1\56\1\63\2\5"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "508:1: rule__Megamodel__Alternatives_3 : ( ( ( rule__Megamodel__Group_3_0__0 ) ) | ( ( rule__Megamodel__DeclarationsAssignment_3_1 ) ) | ( ( rule__Megamodel__BindingsAssignment_3_2 ) ) );";
        }
    }
    static final String DFA2_eotS =
        "\107\uffff";
    static final String DFA2_eofS =
        "\26\uffff\2\14\11\uffff\1\14\4\uffff\4\14\10\uffff\2\14\11\uffff\1\14\11\uffff";
    static final String DFA2_minS =
        "\4\4\1\uffff\4\4\1\uffff\1\6\1\4\2\uffff\7\4\1\17\7\4\1\25\4\4\1\uffff\7\4\2\24\10\4\4\24\2\17\4\4\2\24\4\17\1\4\2\17";
    static final String DFA2_maxS =
        "\1\35\1\5\2\33\1\uffff\2\35\2\5\1\uffff\1\6\1\5\2\uffff\2\5\1\35\4\33\1\17\2\36\4\35\1\5\1\31\3\5\1\35\1\uffff\1\5\2\33\4\36\2\33\2\35\4\5\2\36\6\33\3\5\1\35\6\33\1\5\2\33";
    static final String DFA2_acceptS =
        "\4\uffff\1\3\4\uffff\1\4\2\uffff\1\1\1\5\24\uffff\1\2\44\uffff";
    static final String DFA2_specialS =
        "\107\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\3\7\uffff\1\1\16\uffff\2\4",
            "\1\5\1\6",
            "\2\11\10\uffff\1\12\2\uffff\1\15\3\uffff\1\13\1\14\2\uffff\1\4\1\10\1\7",
            "\2\11\10\uffff\1\12\2\uffff\1\15\3\uffff\1\13\1\14\2\uffff\1\4\1\10\1\7",
            "",
            "\1\2\1\3\1\20\6\uffff\1\1\14\uffff\1\17\1\16\2\4",
            "\1\2\1\3\1\20\6\uffff\1\1\14\uffff\1\17\1\16\2\4",
            "\1\21\1\22",
            "\1\23\1\24",
            "",
            "\1\25",
            "\1\26\1\27",
            "",
            "",
            "\1\30\1\31",
            "\1\32\1\33",
            "\1\2\1\3\7\uffff\1\1\16\uffff\2\4",
            "\2\11\10\uffff\1\12\2\uffff\1\15\3\uffff\1\13\1\14\2\uffff\1\4\1\10\1\7",
            "\2\11\10\uffff\1\12\2\uffff\1\15\3\uffff\1\13\1\14\2\uffff\1\4\1\10\1\7",
            "\2\11\10\uffff\1\12\2\uffff\1\15\3\uffff\1\13\1\14\2\uffff\1\4\1\10\1\34",
            "\2\11\10\uffff\1\12\2\uffff\1\15\3\uffff\1\13\1\14\2\uffff\1\4\1\10\1\34",
            "\1\35",
            "\2\14\6\uffff\2\14\1\40\11\uffff\1\42\1\uffff\1\37\1\36\2\14\1\41",
            "\2\14\6\uffff\2\14\1\40\11\uffff\1\42\1\uffff\1\37\1\36\2\14\1\41",
            "\1\2\1\3\1\20\6\uffff\1\1\14\uffff\1\17\1\16\2\4",
            "\1\2\1\3\1\20\6\uffff\1\1\14\uffff\1\17\1\16\2\4",
            "\1\2\1\3\1\20\6\uffff\1\1\14\uffff\1\17\1\43\2\4",
            "\1\2\1\3\1\20\6\uffff\1\1\14\uffff\1\17\1\43\2\4",
            "\1\44\1\45",
            "\1\13\1\14\2\uffff\1\4",
            "\1\46\1\47",
            "\1\50\1\51",
            "\1\52\1\53",
            "\2\14\6\uffff\2\14\12\uffff\1\42\3\uffff\2\14",
            "",
            "\1\54\1\55",
            "\2\11\10\uffff\1\12\2\uffff\1\15\3\uffff\1\13\1\14\2\uffff\1\4\1\10\1\34",
            "\2\11\10\uffff\1\12\2\uffff\1\15\3\uffff\1\13\1\14\2\uffff\1\4\1\10\1\34",
            "\2\14\6\uffff\2\14\1\40\11\uffff\1\42\1\uffff\1\37\1\36\2\14\1\41",
            "\2\14\6\uffff\2\14\1\40\11\uffff\1\42\1\uffff\1\37\1\36\2\14\1\41",
            "\2\14\6\uffff\2\14\1\40\11\uffff\1\42\1\uffff\1\37\1\56\2\14\1\41",
            "\2\14\6\uffff\2\14\1\40\11\uffff\1\42\1\uffff\1\37\1\56\2\14\1\41",
            "\1\61\5\uffff\1\60\1\57",
            "\1\61\5\uffff\1\60\1\57",
            "\1\2\1\3\1\20\6\uffff\1\1\14\uffff\1\17\1\43\2\4",
            "\1\2\1\3\1\20\6\uffff\1\1\14\uffff\1\17\1\43\2\4",
            "\1\62\1\63",
            "\1\64\1\65",
            "\1\66\1\67",
            "\1\70\1\71",
            "\2\14\6\uffff\2\14\1\40\11\uffff\1\42\1\uffff\1\37\1\56\2\14\1\41",
            "\2\14\6\uffff\2\14\1\40\11\uffff\1\42\1\uffff\1\37\1\56\2\14\1\41",
            "\1\61\5\uffff\1\60\1\57",
            "\1\61\5\uffff\1\60\1\57",
            "\1\61\5\uffff\1\60\1\72",
            "\1\61\5\uffff\1\60\1\72",
            "\1\75\12\uffff\1\74\1\73",
            "\1\75\12\uffff\1\74\1\73",
            "\1\76\1\77",
            "\1\100\1\101",
            "\1\102\1\103",
            "\2\14\6\uffff\2\14\12\uffff\1\42\3\uffff\2\14",
            "\1\61\5\uffff\1\60\1\72",
            "\1\61\5\uffff\1\60\1\72",
            "\1\75\12\uffff\1\74\1\73",
            "\1\75\12\uffff\1\74\1\73",
            "\1\75\12\uffff\1\74\1\104",
            "\1\75\12\uffff\1\74\1\104",
            "\1\105\1\106",
            "\1\75\12\uffff\1\74\1\104",
            "\1\75\12\uffff\1\74\1\104"
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
            return "536:1: rule__Declaration__Alternatives : ( ( ruleEntityType ) | ( ruleRelationshipType ) | ( ruleEntity ) | ( ruleRelationship ) | ( ruleFunctionApplication ) );";
        }
    }
    static final String DFA5_eotS =
        "\16\uffff";
    static final String DFA5_eofS =
        "\1\uffff\2\6\4\uffff\4\6\1\uffff\2\6";
    static final String DFA5_minS =
        "\5\4\2\uffff\7\4";
    static final String DFA5_maxS =
        "\1\5\2\36\2\5\2\uffff\4\36\1\5\2\36";
    static final String DFA5_acceptS =
        "\5\uffff\1\1\1\2\7\uffff";
    static final String DFA5_specialS =
        "\16\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2",
            "\2\6\6\uffff\2\6\1\5\11\uffff\1\6\1\uffff\1\4\1\3\3\6",
            "\2\6\6\uffff\2\6\1\5\11\uffff\1\6\1\uffff\1\4\1\3\3\6",
            "\1\7\1\10",
            "\1\11\1\12",
            "",
            "",
            "\2\6\6\uffff\2\6\1\5\11\uffff\1\6\1\uffff\1\4\1\3\3\6",
            "\2\6\6\uffff\2\6\1\5\11\uffff\1\6\1\uffff\1\4\1\3\3\6",
            "\2\6\6\uffff\2\6\1\5\11\uffff\1\6\1\uffff\1\4\1\13\3\6",
            "\2\6\6\uffff\2\6\1\5\11\uffff\1\6\1\uffff\1\4\1\13\3\6",
            "\1\14\1\15",
            "\2\6\6\uffff\2\6\1\5\11\uffff\1\6\1\uffff\1\4\1\13\3\6",
            "\2\6\6\uffff\2\6\1\5\11\uffff\1\6\1\uffff\1\4\1\13\3\6"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "620:1: rule__TypeReference__Alternatives : ( ( ruleFunctionTypeReference ) | ( ruleEntityTypeReference ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMegamodel_in_entryRuleMegamodel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegamodel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__Group__0_in_ruleMegamodel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_entryRulePrefixAnnotation181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixAnnotation188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrefixAnnotation__Group__0_in_rulePrefixAnnotation214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShowNameAnnotation_in_entryRuleShowNameAnnotation241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShowNameAnnotation248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ShowNameAnnotation__Group__0_in_ruleShowNameAnnotation274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityType368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group__0_in_ruleEntityType394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipType_in_entryRuleRelationshipType421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipType428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__0_in_ruleRelationshipType454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionApplication_in_entryRuleFunctionApplication601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionApplication608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__0_in_ruleFunctionApplication634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypeReference__Alternatives_in_ruleTypeReference694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionTypeReference_in_entryRuleFunctionTypeReference721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTypeReference728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__0_in_ruleFunctionTypeReference754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityTypeReference_in_entryRuleEntityTypeReference781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityTypeReference788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityTypeReference__Group__0_in_ruleEntityTypeReference814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_entryRuleQID841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQID848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QID__Group__0_in_ruleQID874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNAME_in_entryRuleNAME901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNAME908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NAME__Group__0_in_ruleNAME934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ID__Alternatives_in_ruleID994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__Group_3_0__0_in_rule__Megamodel__Alternatives_31030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__DeclarationsAssignment_3_1_in_rule__Megamodel__Alternatives_31048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__BindingsAssignment_3_2_in_rule__Megamodel__Alternatives_31066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityType_in_rule__Declaration__Alternatives1099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipType_in_rule__Declaration__Alternatives1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Declaration__Alternatives1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_rule__Declaration__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionApplication_in_rule__Declaration__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group_3_0__0_in_rule__EntityType__Alternatives_31199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group_3_1__0_in_rule__EntityType__Alternatives_31217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__DependentAssignment_1_0_in_rule__Entity__Alternatives_11250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__ParameterAssignment_1_1_in_rule__Entity__Alternatives_11268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionTypeReference_in_rule__TypeReference__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityTypeReference_in_rule__TypeReference__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_UCID_in_rule__ID__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LCID_in_rule__ID__Alternatives1367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__Group__0__Impl_in_rule__Megamodel__Group__01397 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Megamodel__Group__1_in_rule__Megamodel__Group__01400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__AnnotationsAssignment_0_in_rule__Megamodel__Group__0__Impl1427 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Megamodel__Group__1__Impl_in_rule__Megamodel__Group__11458 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Megamodel__Group__2_in_rule__Megamodel__Group__11461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Megamodel__Group__1__Impl1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__Group__2__Impl_in_rule__Megamodel__Group__21520 = new BitSet(new long[]{0x0000000030003030L});
        public static final BitSet FOLLOW_rule__Megamodel__Group__3_in_rule__Megamodel__Group__21523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__NameAssignment_2_in_rule__Megamodel__Group__2__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__Group__3__Impl_in_rule__Megamodel__Group__31580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__Alternatives_3_in_rule__Megamodel__Group__3__Impl1607 = new BitSet(new long[]{0x0000000030003032L});
        public static final BitSet FOLLOW_rule__Megamodel__Group_3_0__0__Impl_in_rule__Megamodel__Group_3_0__01646 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Megamodel__Group_3_0__1_in_rule__Megamodel__Group_3_0__01649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Megamodel__Group_3_0__0__Impl1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__Group_3_0__1__Impl_in_rule__Megamodel__Group_3_0__11708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Megamodel__ImportsAssignment_3_0_1_in_rule__Megamodel__Group_3_0__1__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrefixAnnotation__Group__0__Impl_in_rule__PrefixAnnotation__Group__01769 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PrefixAnnotation__Group__1_in_rule__PrefixAnnotation__Group__01772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__PrefixAnnotation__Group__0__Impl1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrefixAnnotation__Group__1__Impl_in_rule__PrefixAnnotation__Group__11831 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PrefixAnnotation__Group__2_in_rule__PrefixAnnotation__Group__11834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrefixAnnotation__KeyAssignment_1_in_rule__PrefixAnnotation__Group__1__Impl1861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrefixAnnotation__Group__2__Impl_in_rule__PrefixAnnotation__Group__21891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrefixAnnotation__ValueAssignment_2_in_rule__PrefixAnnotation__Group__2__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ShowNameAnnotation__Group__0__Impl_in_rule__ShowNameAnnotation__Group__01955 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ShowNameAnnotation__Group__1_in_rule__ShowNameAnnotation__Group__01958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ShowNameAnnotation__Group__0__Impl1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ShowNameAnnotation__Group__1__Impl_in_rule__ShowNameAnnotation__Group__12017 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__ShowNameAnnotation__Group__2_in_rule__ShowNameAnnotation__Group__12020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ShowNameAnnotation__ValueAssignment_1_in_rule__ShowNameAnnotation__Group__1__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ShowNameAnnotation__Group__2__Impl_in_rule__ShowNameAnnotation__Group__22077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ShowNameAnnotation__Group__2__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__02142 = new BitSet(new long[]{0x0000000030003030L});
        public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__02145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__AnnotationsAssignment_0_in_rule__Link__Group__0__Impl2172 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__12203 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__12206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__LinkAssignment_1_in_rule__Link__Group__1__Impl2233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__22263 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__22266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group_2__0_in_rule__Link__Group__2__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__32324 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__32327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Link__Group__3__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__42386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__ToAssignment_4_in_rule__Link__Group__4__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group_2__0__Impl_in_rule__Link__Group_2__02453 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Link__Group_2__1_in_rule__Link__Group_2__02456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Link__Group_2__0__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group_2__1__Impl_in_rule__Link__Group_2__12515 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Link__Group_2__2_in_rule__Link__Group_2__12518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__InputAssignment_2_1_in_rule__Link__Group_2__1__Impl2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group_2__2__Impl_in_rule__Link__Group_2__22575 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Link__Group_2__3_in_rule__Link__Group_2__22578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Link__Group_2__2__Impl2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group_2__3__Impl_in_rule__Link__Group_2__32637 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Link__Group_2__4_in_rule__Link__Group_2__32640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Link__Group_2__3__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group_2__4__Impl_in_rule__Link__Group_2__42699 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Link__Group_2__5_in_rule__Link__Group_2__42702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Link__Group_2__4__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group_2__5__Impl_in_rule__Link__Group_2__52761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__OutputAssignment_2_5_in_rule__Link__Group_2__5__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group__0__Impl_in_rule__EntityType__Group__02830 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_rule__EntityType__Group__1_in_rule__EntityType__Group__02833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__AnnotationsAssignment_0_in_rule__EntityType__Group__0__Impl2860 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__EntityType__Group__1__Impl_in_rule__EntityType__Group__12891 = new BitSet(new long[]{0x0000000000604000L});
        public static final BitSet FOLLOW_rule__EntityType__Group__2_in_rule__EntityType__Group__12894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__NameAssignment_1_in_rule__EntityType__Group__1__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group__2__Impl_in_rule__EntityType__Group__22951 = new BitSet(new long[]{0x0000000000604000L});
        public static final BitSet FOLLOW_rule__EntityType__Group__3_in_rule__EntityType__Group__22954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__AnnotationsAssignment_2_in_rule__EntityType__Group__2__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group__3__Impl_in_rule__EntityType__Group__33012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Alternatives_3_in_rule__EntityType__Group__3__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group_3_0__0__Impl_in_rule__EntityType__Group_3_0__03077 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EntityType__Group_3_0__1_in_rule__EntityType__Group_3_0__03080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EntityType__Group_3_0__0__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group_3_0__1__Impl_in_rule__EntityType__Group_3_0__13139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__SupertypeAssignment_3_0_1_in_rule__EntityType__Group_3_0__1__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group_3_1__0__Impl_in_rule__EntityType__Group_3_1__03200 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__EntityType__Group_3_1__1_in_rule__EntityType__Group_3_1__03203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EntityType__Group_3_1__0__Impl3231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityType__Group_3_1__1__Impl_in_rule__EntityType__Group_3_1__13262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EntityType__Group_3_1__1__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__0__Impl_in_rule__RelationshipType__Group__03325 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__1_in_rule__RelationshipType__Group__03328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__AnnotationsAssignment_0_in_rule__RelationshipType__Group__0__Impl3355 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__1__Impl_in_rule__RelationshipType__Group__13386 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__2_in_rule__RelationshipType__Group__13389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__NameAssignment_1_in_rule__RelationshipType__Group__1__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__2__Impl_in_rule__RelationshipType__Group__23446 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__3_in_rule__RelationshipType__Group__23449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__AnnotationsAssignment_2_in_rule__RelationshipType__Group__2__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__3__Impl_in_rule__RelationshipType__Group__33507 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__4_in_rule__RelationshipType__Group__33510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__RelationshipType__Group__3__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__4__Impl_in_rule__RelationshipType__Group__43569 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__5_in_rule__RelationshipType__Group__43572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__LeftAssignment_4_in_rule__RelationshipType__Group__4__Impl3599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__5__Impl_in_rule__RelationshipType__Group__53629 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__6_in_rule__RelationshipType__Group__53632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__RelationshipType__Group__5__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__Group__6__Impl_in_rule__RelationshipType__Group__63691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipType__RightAssignment_6_in_rule__RelationshipType__Group__6__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03762 = new BitSet(new long[]{0x0000000030002030L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_0_in_rule__Entity__Group__0__Impl3792 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13823 = new BitSet(new long[]{0x0000000030002030L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Alternatives_1_in_rule__Entity__Group__1__Impl3853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23884 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33944 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_3_in_rule__Entity__Group__3__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Entity__Group__4__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__TypeAssignment_5_in_rule__Entity__Group__5__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04136 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__AnnotationsAssignment_0_in_rule__Relationship__Group__0__Impl4166 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__14197 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__14200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__LeftAssignment_1_in_rule__Relationship__Group__1__Impl4227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__24257 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__24260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__TypeAssignment_2_in_rule__Relationship__Group__2__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__34317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__RightAssignment_3_in_rule__Relationship__Group__3__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__0__Impl_in_rule__FunctionApplication__Group__04382 = new BitSet(new long[]{0x0000000030002030L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__1_in_rule__FunctionApplication__Group__04385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__AnnotationsAssignment_0_in_rule__FunctionApplication__Group__0__Impl4412 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__1__Impl_in_rule__FunctionApplication__Group__14443 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__2_in_rule__FunctionApplication__Group__14446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__FunctionAssignment_1_in_rule__FunctionApplication__Group__1__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__2__Impl_in_rule__FunctionApplication__Group__24503 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__3_in_rule__FunctionApplication__Group__24506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__FunctionApplication__Group__2__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__3__Impl_in_rule__FunctionApplication__Group__34565 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__4_in_rule__FunctionApplication__Group__34568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__InputAssignment_3_in_rule__FunctionApplication__Group__3__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__4__Impl_in_rule__FunctionApplication__Group__44625 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__5_in_rule__FunctionApplication__Group__44628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__FunctionApplication__Group__4__Impl4656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__5__Impl_in_rule__FunctionApplication__Group__54687 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__6_in_rule__FunctionApplication__Group__54690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__FunctionApplication__Group__5__Impl4718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__6__Impl_in_rule__FunctionApplication__Group__64749 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__7_in_rule__FunctionApplication__Group__64752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FunctionApplication__Group__6__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__Group__7__Impl_in_rule__FunctionApplication__Group__74811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionApplication__OutputAssignment_7_in_rule__FunctionApplication__Group__7__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__0__Impl_in_rule__FunctionTypeReference__Group__04884 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__1_in_rule__FunctionTypeReference__Group__04887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__DefinitionAssignment_0_in_rule__FunctionTypeReference__Group__0__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__1__Impl_in_rule__FunctionTypeReference__Group__14944 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__2_in_rule__FunctionTypeReference__Group__14947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FunctionTypeReference__Group__1__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__2__Impl_in_rule__FunctionTypeReference__Group__25006 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__3_in_rule__FunctionTypeReference__Group__25009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__DomainAssignment_2_in_rule__FunctionTypeReference__Group__2__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__3__Impl_in_rule__FunctionTypeReference__Group__35066 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__4_in_rule__FunctionTypeReference__Group__35069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FunctionTypeReference__Group__3__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__4__Impl_in_rule__FunctionTypeReference__Group__45128 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__5_in_rule__FunctionTypeReference__Group__45131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__CodomainAssignment_4_in_rule__FunctionTypeReference__Group__4__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionTypeReference__Group__5__Impl_in_rule__FunctionTypeReference__Group__55188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FunctionTypeReference__Group__5__Impl5216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityTypeReference__Group__0__Impl_in_rule__EntityTypeReference__Group__05259 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EntityTypeReference__Group__1_in_rule__EntityTypeReference__Group__05262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityTypeReference__DefinitionAssignment_0_in_rule__EntityTypeReference__Group__0__Impl5289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityTypeReference__Group__1__Impl_in_rule__EntityTypeReference__Group__15319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityTypeReference__ManyAssignment_1_in_rule__EntityTypeReference__Group__1__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__05381 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__QID__Group__1_in_rule__QID__Group__05384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNAME_in_rule__QID__Group__0__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__15440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl5467 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__05502 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__05505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__QID__Group_1__0__Impl5533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__15564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNAME_in_rule__QID__Group_1__1__Impl5591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NAME__Group__0__Impl_in_rule__NAME__Group__05624 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__NAME__Group__1_in_rule__NAME__Group__05627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_rule__NAME__Group__0__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NAME__Group__1__Impl_in_rule__NAME__Group__15683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NAME__Group_1__0_in_rule__NAME__Group__1__Impl5710 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__NAME__Group_1__0__Impl_in_rule__NAME__Group_1__05745 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__NAME__Group_1__1_in_rule__NAME__Group_1__05748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__NAME__Group_1__0__Impl5776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NAME__Group_1__1__Impl_in_rule__NAME__Group_1__15807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_rule__NAME__Group_1__1__Impl5834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_rule__Megamodel__AnnotationsAssignment_05872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__Megamodel__NameAssignment_25903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__Megamodel__ImportsAssignment_3_0_15938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_rule__Megamodel__DeclarationsAssignment_3_15973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_rule__Megamodel__BindingsAssignment_3_26004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__PrefixAnnotation__KeyAssignment_16035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__PrefixAnnotation__ValueAssignment_26066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ShowNameAnnotation__ValueAssignment_16097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_rule__Link__AnnotationsAssignment_06128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__Link__LinkAssignment_16163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__Link__InputAssignment_2_16202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__Link__OutputAssignment_2_56241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__ToAssignment_46276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_rule__EntityType__AnnotationsAssignment_06307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__EntityType__NameAssignment_16338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShowNameAnnotation_in_rule__EntityType__AnnotationsAssignment_26369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_rule__EntityType__SupertypeAssignment_3_0_16400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_rule__RelationshipType__AnnotationsAssignment_06431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__RelationshipType__NameAssignment_16462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShowNameAnnotation_in_rule__RelationshipType__AnnotationsAssignment_26493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_rule__RelationshipType__LeftAssignment_46524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_rule__RelationshipType__RightAssignment_66555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_rule__Entity__AnnotationsAssignment_06586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Entity__DependentAssignment_1_06622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Entity__ParameterAssignment_1_16666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__Entity__NameAssignment_26705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShowNameAnnotation_in_rule__Entity__AnnotationsAssignment_36736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_rule__Entity__TypeAssignment_56767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_rule__Relationship__AnnotationsAssignment_06798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__Relationship__LeftAssignment_16833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__Relationship__TypeAssignment_26872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__Relationship__RightAssignment_36911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixAnnotation_in_rule__FunctionApplication__AnnotationsAssignment_06946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__FunctionApplication__FunctionAssignment_16981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__FunctionApplication__InputAssignment_37020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__FunctionApplication__OutputAssignment_77059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__FunctionTypeReference__DefinitionAssignment_07098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__FunctionTypeReference__DomainAssignment_27137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__FunctionTypeReference__CodomainAssignment_47176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQID_in_rule__EntityTypeReference__DefinitionAssignment_07215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EntityTypeReference__ManyAssignment_17255 = new BitSet(new long[]{0x0000000000000002L});
    }


}