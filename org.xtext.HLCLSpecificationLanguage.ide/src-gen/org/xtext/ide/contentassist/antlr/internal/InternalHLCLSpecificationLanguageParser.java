package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.HLCLSpecificationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHLCLSpecificationLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'selected'", "'unselected'", "'boolean'", "'numeric'", "'requires'", "'excludes'", "'optional'", "'mandatory'", "'model'", "'variables:'", "'constraints:'", "'variants:'", "'::'", "'['", "']'", "':'", "'('", "')'", "'is'", "'in'", "'variants'", "','", "'-->'", "'parent:'", "'group:'", "'card:'", "'instantiable'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


        public InternalHLCLSpecificationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHLCLSpecificationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHLCLSpecificationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHLCLSpecificationLanguage.g"; }


    	private HLCLSpecificationLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(HLCLSpecificationLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalHLCLSpecificationLanguage.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:54:1: ( ruleModel EOF )
            // InternalHLCLSpecificationLanguage.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHLCLSpecificationLanguage.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:69:3: ( rule__Model__Group__0 )
            // InternalHLCLSpecificationLanguage.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalHLCLSpecificationLanguage.g:78:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:79:1: ( ruleVarDeclaration EOF )
            // InternalHLCLSpecificationLanguage.g:80:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalHLCLSpecificationLanguage.g:87:1: ruleVarDeclaration : ( ( rule__VarDeclaration__UnorderedGroup ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:91:2: ( ( ( rule__VarDeclaration__UnorderedGroup ) ) )
            // InternalHLCLSpecificationLanguage.g:92:2: ( ( rule__VarDeclaration__UnorderedGroup ) )
            {
            // InternalHLCLSpecificationLanguage.g:92:2: ( ( rule__VarDeclaration__UnorderedGroup ) )
            // InternalHLCLSpecificationLanguage.g:93:3: ( rule__VarDeclaration__UnorderedGroup )
            {
             before(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()); 
            // InternalHLCLSpecificationLanguage.g:94:3: ( rule__VarDeclaration__UnorderedGroup )
            // InternalHLCLSpecificationLanguage.g:94:4: rule__VarDeclaration__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVariantDeclaration"
    // InternalHLCLSpecificationLanguage.g:103:1: entryRuleVariantDeclaration : ruleVariantDeclaration EOF ;
    public final void entryRuleVariantDeclaration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:104:1: ( ruleVariantDeclaration EOF )
            // InternalHLCLSpecificationLanguage.g:105:1: ruleVariantDeclaration EOF
            {
             before(grammarAccess.getVariantDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVariantDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariantDeclaration"


    // $ANTLR start "ruleVariantDeclaration"
    // InternalHLCLSpecificationLanguage.g:112:1: ruleVariantDeclaration : ( ( rule__VariantDeclaration__Alternatives ) ) ;
    public final void ruleVariantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:116:2: ( ( ( rule__VariantDeclaration__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:117:2: ( ( rule__VariantDeclaration__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:117:2: ( ( rule__VariantDeclaration__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:118:3: ( rule__VariantDeclaration__Alternatives )
            {
             before(grammarAccess.getVariantDeclarationAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:119:3: ( rule__VariantDeclaration__Alternatives )
            // InternalHLCLSpecificationLanguage.g:119:4: rule__VariantDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariantDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariantDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariantDeclaration"


    // $ANTLR start "entryRulevariantsInterval"
    // InternalHLCLSpecificationLanguage.g:128:1: entryRulevariantsInterval : rulevariantsInterval EOF ;
    public final void entryRulevariantsInterval() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:129:1: ( rulevariantsInterval EOF )
            // InternalHLCLSpecificationLanguage.g:130:1: rulevariantsInterval EOF
            {
             before(grammarAccess.getVariantsIntervalRule()); 
            pushFollow(FOLLOW_1);
            rulevariantsInterval();

            state._fsp--;

             after(grammarAccess.getVariantsIntervalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariantsInterval"


    // $ANTLR start "rulevariantsInterval"
    // InternalHLCLSpecificationLanguage.g:137:1: rulevariantsInterval : ( ( rule__VariantsInterval__Group__0 ) ) ;
    public final void rulevariantsInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:141:2: ( ( ( rule__VariantsInterval__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:142:2: ( ( rule__VariantsInterval__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:142:2: ( ( rule__VariantsInterval__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:143:3: ( rule__VariantsInterval__Group__0 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:144:3: ( rule__VariantsInterval__Group__0 )
            // InternalHLCLSpecificationLanguage.g:144:4: rule__VariantsInterval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantsIntervalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariantsInterval"


    // $ANTLR start "entryRulevariantsEnumeration"
    // InternalHLCLSpecificationLanguage.g:153:1: entryRulevariantsEnumeration : rulevariantsEnumeration EOF ;
    public final void entryRulevariantsEnumeration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:154:1: ( rulevariantsEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:155:1: rulevariantsEnumeration EOF
            {
             before(grammarAccess.getVariantsEnumerationRule()); 
            pushFollow(FOLLOW_1);
            rulevariantsEnumeration();

            state._fsp--;

             after(grammarAccess.getVariantsEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariantsEnumeration"


    // $ANTLR start "rulevariantsEnumeration"
    // InternalHLCLSpecificationLanguage.g:162:1: rulevariantsEnumeration : ( ( rule__VariantsEnumeration__Group__0 ) ) ;
    public final void rulevariantsEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:166:2: ( ( ( rule__VariantsEnumeration__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:167:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:167:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:168:3: ( rule__VariantsEnumeration__Group__0 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:169:3: ( rule__VariantsEnumeration__Group__0 )
            // InternalHLCLSpecificationLanguage.g:169:4: rule__VariantsEnumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantsEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariantsEnumeration"


    // $ANTLR start "entryRuleEnumeration"
    // InternalHLCLSpecificationLanguage.g:178:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:179:1: ( ruleEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:180:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalHLCLSpecificationLanguage.g:187:1: ruleEnumeration : ( ( rule__Enumeration__Alternatives ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:191:2: ( ( ( rule__Enumeration__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:192:2: ( ( rule__Enumeration__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:192:2: ( ( rule__Enumeration__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:193:3: ( rule__Enumeration__Alternatives )
            {
             before(grammarAccess.getEnumerationAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:194:3: ( rule__Enumeration__Alternatives )
            // InternalHLCLSpecificationLanguage.g:194:4: rule__Enumeration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleConstraint"
    // InternalHLCLSpecificationLanguage.g:203:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:204:1: ( ruleConstraint EOF )
            // InternalHLCLSpecificationLanguage.g:205:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalHLCLSpecificationLanguage.g:212:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:216:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:217:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:217:2: ( ( rule__Constraint__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:218:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:219:3: ( rule__Constraint__Group__0 )
            // InternalHLCLSpecificationLanguage.g:219:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleConsExpression"
    // InternalHLCLSpecificationLanguage.g:228:1: entryRuleConsExpression : ruleConsExpression EOF ;
    public final void entryRuleConsExpression() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:229:1: ( ruleConsExpression EOF )
            // InternalHLCLSpecificationLanguage.g:230:1: ruleConsExpression EOF
            {
             before(grammarAccess.getConsExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleConsExpression();

            state._fsp--;

             after(grammarAccess.getConsExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConsExpression"


    // $ANTLR start "ruleConsExpression"
    // InternalHLCLSpecificationLanguage.g:237:1: ruleConsExpression : ( ( rule__ConsExpression__Alternatives ) ) ;
    public final void ruleConsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:241:2: ( ( ( rule__ConsExpression__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:242:2: ( ( rule__ConsExpression__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:242:2: ( ( rule__ConsExpression__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:243:3: ( rule__ConsExpression__Alternatives )
            {
             before(grammarAccess.getConsExpressionAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:244:3: ( rule__ConsExpression__Alternatives )
            // InternalHLCLSpecificationLanguage.g:244:4: rule__ConsExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConsExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConsExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConsExpression"


    // $ANTLR start "entryRuleTerminalExp"
    // InternalHLCLSpecificationLanguage.g:253:1: entryRuleTerminalExp : ruleTerminalExp EOF ;
    public final void entryRuleTerminalExp() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:254:1: ( ruleTerminalExp EOF )
            // InternalHLCLSpecificationLanguage.g:255:1: ruleTerminalExp EOF
            {
             before(grammarAccess.getTerminalExpRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminalExp();

            state._fsp--;

             after(grammarAccess.getTerminalExpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalExp"


    // $ANTLR start "ruleTerminalExp"
    // InternalHLCLSpecificationLanguage.g:262:1: ruleTerminalExp : ( ( rule__TerminalExp__Alternatives ) ) ;
    public final void ruleTerminalExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:266:2: ( ( ( rule__TerminalExp__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:267:2: ( ( rule__TerminalExp__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:267:2: ( ( rule__TerminalExp__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:268:3: ( rule__TerminalExp__Alternatives )
            {
             before(grammarAccess.getTerminalExpAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:269:3: ( rule__TerminalExp__Alternatives )
            // InternalHLCLSpecificationLanguage.g:269:4: rule__TerminalExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExp"


    // $ANTLR start "entryRuleIDCons"
    // InternalHLCLSpecificationLanguage.g:278:1: entryRuleIDCons : ruleIDCons EOF ;
    public final void entryRuleIDCons() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:279:1: ( ruleIDCons EOF )
            // InternalHLCLSpecificationLanguage.g:280:1: ruleIDCons EOF
            {
             before(grammarAccess.getIDConsRule()); 
            pushFollow(FOLLOW_1);
            ruleIDCons();

            state._fsp--;

             after(grammarAccess.getIDConsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIDCons"


    // $ANTLR start "ruleIDCons"
    // InternalHLCLSpecificationLanguage.g:287:1: ruleIDCons : ( ( rule__IDCons__NameAssignment ) ) ;
    public final void ruleIDCons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:291:2: ( ( ( rule__IDCons__NameAssignment ) ) )
            // InternalHLCLSpecificationLanguage.g:292:2: ( ( rule__IDCons__NameAssignment ) )
            {
            // InternalHLCLSpecificationLanguage.g:292:2: ( ( rule__IDCons__NameAssignment ) )
            // InternalHLCLSpecificationLanguage.g:293:3: ( rule__IDCons__NameAssignment )
            {
             before(grammarAccess.getIDConsAccess().getNameAssignment()); 
            // InternalHLCLSpecificationLanguage.g:294:3: ( rule__IDCons__NameAssignment )
            // InternalHLCLSpecificationLanguage.g:294:4: rule__IDCons__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IDCons__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIDConsAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDCons"


    // $ANTLR start "entryRuleRefinement"
    // InternalHLCLSpecificationLanguage.g:303:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:304:1: ( ruleRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:305:1: ruleRefinement EOF
            {
             before(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalHLCLSpecificationLanguage.g:312:1: ruleRefinement : ( ( rule__Refinement__Alternatives ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:316:2: ( ( ( rule__Refinement__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:317:2: ( ( rule__Refinement__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:317:2: ( ( rule__Refinement__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:318:3: ( rule__Refinement__Alternatives )
            {
             before(grammarAccess.getRefinementAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:319:3: ( rule__Refinement__Alternatives )
            // InternalHLCLSpecificationLanguage.g:319:4: rule__Refinement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Refinement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleAssignment"
    // InternalHLCLSpecificationLanguage.g:328:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:329:1: ( ruleAssignment EOF )
            // InternalHLCLSpecificationLanguage.g:330:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalHLCLSpecificationLanguage.g:337:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:341:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:342:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:342:2: ( ( rule__Assignment__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:343:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:344:3: ( rule__Assignment__Group__0 )
            // InternalHLCLSpecificationLanguage.g:344:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleVarRefinement"
    // InternalHLCLSpecificationLanguage.g:353:1: entryRuleVarRefinement : ruleVarRefinement EOF ;
    public final void entryRuleVarRefinement() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:354:1: ( ruleVarRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:355:1: ruleVarRefinement EOF
            {
             before(grammarAccess.getVarRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleVarRefinement();

            state._fsp--;

             after(grammarAccess.getVarRefinementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarRefinement"


    // $ANTLR start "ruleVarRefinement"
    // InternalHLCLSpecificationLanguage.g:362:1: ruleVarRefinement : ( ( rule__VarRefinement__Group__0 ) ) ;
    public final void ruleVarRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:366:2: ( ( ( rule__VarRefinement__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:367:2: ( ( rule__VarRefinement__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:367:2: ( ( rule__VarRefinement__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:368:3: ( rule__VarRefinement__Group__0 )
            {
             before(grammarAccess.getVarRefinementAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:369:3: ( rule__VarRefinement__Group__0 )
            // InternalHLCLSpecificationLanguage.g:369:4: rule__VarRefinement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarRefinement"


    // $ANTLR start "entryRuleSetRefinement"
    // InternalHLCLSpecificationLanguage.g:378:1: entryRuleSetRefinement : ruleSetRefinement EOF ;
    public final void entryRuleSetRefinement() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:379:1: ( ruleSetRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:380:1: ruleSetRefinement EOF
            {
             before(grammarAccess.getSetRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleSetRefinement();

            state._fsp--;

             after(grammarAccess.getSetRefinementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetRefinement"


    // $ANTLR start "ruleSetRefinement"
    // InternalHLCLSpecificationLanguage.g:387:1: ruleSetRefinement : ( ( rule__SetRefinement__Group__0 ) ) ;
    public final void ruleSetRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:391:2: ( ( ( rule__SetRefinement__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:392:2: ( ( rule__SetRefinement__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:392:2: ( ( rule__SetRefinement__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:393:3: ( rule__SetRefinement__Group__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:394:3: ( rule__SetRefinement__Group__0 )
            // InternalHLCLSpecificationLanguage.g:394:4: rule__SetRefinement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetRefinement"


    // $ANTLR start "entryRuleRule"
    // InternalHLCLSpecificationLanguage.g:403:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:404:1: ( ruleRule EOF )
            // InternalHLCLSpecificationLanguage.g:405:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalHLCLSpecificationLanguage.g:412:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:416:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:417:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:417:2: ( ( rule__Rule__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:418:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:419:3: ( rule__Rule__Group__0 )
            // InternalHLCLSpecificationLanguage.g:419:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFodaUN"
    // InternalHLCLSpecificationLanguage.g:428:1: entryRuleFodaUN : ruleFodaUN EOF ;
    public final void entryRuleFodaUN() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:429:1: ( ruleFodaUN EOF )
            // InternalHLCLSpecificationLanguage.g:430:1: ruleFodaUN EOF
            {
             before(grammarAccess.getFodaUNRule()); 
            pushFollow(FOLLOW_1);
            ruleFodaUN();

            state._fsp--;

             after(grammarAccess.getFodaUNRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFodaUN"


    // $ANTLR start "ruleFodaUN"
    // InternalHLCLSpecificationLanguage.g:437:1: ruleFodaUN : ( ( rule__FodaUN__Group__0 ) ) ;
    public final void ruleFodaUN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:441:2: ( ( ( rule__FodaUN__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:442:2: ( ( rule__FodaUN__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:442:2: ( ( rule__FodaUN__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:443:3: ( rule__FodaUN__Group__0 )
            {
             before(grammarAccess.getFodaUNAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:444:3: ( rule__FodaUN__Group__0 )
            // InternalHLCLSpecificationLanguage.g:444:4: rule__FodaUN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FodaUN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFodaUNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFodaUN"


    // $ANTLR start "entryRuleFodaBin"
    // InternalHLCLSpecificationLanguage.g:453:1: entryRuleFodaBin : ruleFodaBin EOF ;
    public final void entryRuleFodaBin() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:454:1: ( ruleFodaBin EOF )
            // InternalHLCLSpecificationLanguage.g:455:1: ruleFodaBin EOF
            {
             before(grammarAccess.getFodaBinRule()); 
            pushFollow(FOLLOW_1);
            ruleFodaBin();

            state._fsp--;

             after(grammarAccess.getFodaBinRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFodaBin"


    // $ANTLR start "ruleFodaBin"
    // InternalHLCLSpecificationLanguage.g:462:1: ruleFodaBin : ( ( rule__FodaBin__Group__0 ) ) ;
    public final void ruleFodaBin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:466:2: ( ( ( rule__FodaBin__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:467:2: ( ( rule__FodaBin__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:467:2: ( ( rule__FodaBin__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:468:3: ( rule__FodaBin__Group__0 )
            {
             before(grammarAccess.getFodaBinAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:469:3: ( rule__FodaBin__Group__0 )
            // InternalHLCLSpecificationLanguage.g:469:4: rule__FodaBin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFodaBinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFodaBin"


    // $ANTLR start "entryRuleFodaNary"
    // InternalHLCLSpecificationLanguage.g:478:1: entryRuleFodaNary : ruleFodaNary EOF ;
    public final void entryRuleFodaNary() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:479:1: ( ruleFodaNary EOF )
            // InternalHLCLSpecificationLanguage.g:480:1: ruleFodaNary EOF
            {
             before(grammarAccess.getFodaNaryRule()); 
            pushFollow(FOLLOW_1);
            ruleFodaNary();

            state._fsp--;

             after(grammarAccess.getFodaNaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFodaNary"


    // $ANTLR start "ruleFodaNary"
    // InternalHLCLSpecificationLanguage.g:487:1: ruleFodaNary : ( ( rule__FodaNary__Group__0 ) ) ;
    public final void ruleFodaNary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:491:2: ( ( ( rule__FodaNary__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:492:2: ( ( rule__FodaNary__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:492:2: ( ( rule__FodaNary__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:493:3: ( rule__FodaNary__Group__0 )
            {
             before(grammarAccess.getFodaNaryAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:494:3: ( rule__FodaNary__Group__0 )
            // InternalHLCLSpecificationLanguage.g:494:4: rule__FodaNary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFodaNary"


    // $ANTLR start "entryRuleValue"
    // InternalHLCLSpecificationLanguage.g:503:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:504:1: ( ruleValue EOF )
            // InternalHLCLSpecificationLanguage.g:505:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHLCLSpecificationLanguage.g:512:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:516:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( rule__Value__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:518:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:519:3: ( rule__Value__Alternatives )
            // InternalHLCLSpecificationLanguage.g:519:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleVarType"
    // InternalHLCLSpecificationLanguage.g:528:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:529:1: ( ruleVarType EOF )
            // InternalHLCLSpecificationLanguage.g:530:1: ruleVarType EOF
            {
             before(grammarAccess.getVarTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getVarTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalHLCLSpecificationLanguage.g:537:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:541:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:542:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:542:2: ( ( rule__VarType__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:543:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:544:3: ( rule__VarType__Alternatives )
            // InternalHLCLSpecificationLanguage.g:544:4: rule__VarType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VarType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVarTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleListOfValues"
    // InternalHLCLSpecificationLanguage.g:553:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:554:1: ( ruleListOfValues EOF )
            // InternalHLCLSpecificationLanguage.g:555:1: ruleListOfValues EOF
            {
             before(grammarAccess.getListOfValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getListOfValuesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListOfValues"


    // $ANTLR start "ruleListOfValues"
    // InternalHLCLSpecificationLanguage.g:562:1: ruleListOfValues : ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:566:2: ( ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) ) )
            // InternalHLCLSpecificationLanguage.g:567:2: ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:567:2: ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) )
            // InternalHLCLSpecificationLanguage.g:568:3: ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* )
            {
            // InternalHLCLSpecificationLanguage.g:568:3: ( ( rule__ListOfValues__ValuesAssignment ) )
            // InternalHLCLSpecificationLanguage.g:569:4: ( rule__ListOfValues__ValuesAssignment )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 
            // InternalHLCLSpecificationLanguage.g:570:4: ( rule__ListOfValues__ValuesAssignment )
            // InternalHLCLSpecificationLanguage.g:570:5: rule__ListOfValues__ValuesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ListOfValues__ValuesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 

            }

            // InternalHLCLSpecificationLanguage.g:573:3: ( ( rule__ListOfValues__ValuesAssignment )* )
            // InternalHLCLSpecificationLanguage.g:574:4: ( rule__ListOfValues__ValuesAssignment )*
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 
            // InternalHLCLSpecificationLanguage.g:575:4: ( rule__ListOfValues__ValuesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||(LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:575:5: rule__ListOfValues__ValuesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ListOfValues__ValuesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOfValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalHLCLSpecificationLanguage.g:585:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:586:1: ( ruleListOfIDs EOF )
            // InternalHLCLSpecificationLanguage.g:587:1: ruleListOfIDs EOF
            {
             before(grammarAccess.getListOfIDsRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getListOfIDsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListOfIDs"


    // $ANTLR start "ruleListOfIDs"
    // InternalHLCLSpecificationLanguage.g:594:1: ruleListOfIDs : ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:598:2: ( ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) )
            // InternalHLCLSpecificationLanguage.g:599:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:599:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            // InternalHLCLSpecificationLanguage.g:600:3: ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* )
            {
            // InternalHLCLSpecificationLanguage.g:600:3: ( ( rule__ListOfIDs__IdsAssignment ) )
            // InternalHLCLSpecificationLanguage.g:601:4: ( rule__ListOfIDs__IdsAssignment )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            // InternalHLCLSpecificationLanguage.g:602:4: ( rule__ListOfIDs__IdsAssignment )
            // InternalHLCLSpecificationLanguage.g:602:5: rule__ListOfIDs__IdsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__ListOfIDs__IdsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 

            }

            // InternalHLCLSpecificationLanguage.g:605:3: ( ( rule__ListOfIDs__IdsAssignment )* )
            // InternalHLCLSpecificationLanguage.g:606:4: ( rule__ListOfIDs__IdsAssignment )*
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            // InternalHLCLSpecificationLanguage.g:607:4: ( rule__ListOfIDs__IdsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:607:5: rule__ListOfIDs__IdsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ListOfIDs__IdsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOfIDs"


    // $ANTLR start "entryRuleBinOp"
    // InternalHLCLSpecificationLanguage.g:617:1: entryRuleBinOp : ruleBinOp EOF ;
    public final void entryRuleBinOp() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:618:1: ( ruleBinOp EOF )
            // InternalHLCLSpecificationLanguage.g:619:1: ruleBinOp EOF
            {
             before(grammarAccess.getBinOpRule()); 
            pushFollow(FOLLOW_1);
            ruleBinOp();

            state._fsp--;

             after(grammarAccess.getBinOpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinOp"


    // $ANTLR start "ruleBinOp"
    // InternalHLCLSpecificationLanguage.g:626:1: ruleBinOp : ( ( rule__BinOp__Alternatives ) ) ;
    public final void ruleBinOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:630:2: ( ( ( rule__BinOp__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:631:2: ( ( rule__BinOp__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:631:2: ( ( rule__BinOp__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:632:3: ( rule__BinOp__Alternatives )
            {
             before(grammarAccess.getBinOpAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:633:3: ( rule__BinOp__Alternatives )
            // InternalHLCLSpecificationLanguage.g:633:4: rule__BinOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinOp"


    // $ANTLR start "entryRuleUnaryOp"
    // InternalHLCLSpecificationLanguage.g:642:1: entryRuleUnaryOp : ruleUnaryOp EOF ;
    public final void entryRuleUnaryOp() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:643:1: ( ruleUnaryOp EOF )
            // InternalHLCLSpecificationLanguage.g:644:1: ruleUnaryOp EOF
            {
             before(grammarAccess.getUnaryOpRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryOp();

            state._fsp--;

             after(grammarAccess.getUnaryOpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnaryOp"


    // $ANTLR start "ruleUnaryOp"
    // InternalHLCLSpecificationLanguage.g:651:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:655:2: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:656:2: ( ( rule__UnaryOp__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:656:2: ( ( rule__UnaryOp__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:657:3: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:658:3: ( rule__UnaryOp__Alternatives )
            // InternalHLCLSpecificationLanguage.g:658:4: rule__UnaryOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "rule__VariantDeclaration__Alternatives"
    // InternalHLCLSpecificationLanguage.g:666:1: rule__VariantDeclaration__Alternatives : ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) );
    public final void rule__VariantDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:670:1: ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||(LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:671:2: ( rulevariantsInterval )
                    {
                    // InternalHLCLSpecificationLanguage.g:671:2: ( rulevariantsInterval )
                    // InternalHLCLSpecificationLanguage.g:672:3: rulevariantsInterval
                    {
                     before(grammarAccess.getVariantDeclarationAccess().getVariantsIntervalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulevariantsInterval();

                    state._fsp--;

                     after(grammarAccess.getVariantDeclarationAccess().getVariantsIntervalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:677:2: ( rulevariantsEnumeration )
                    {
                    // InternalHLCLSpecificationLanguage.g:677:2: ( rulevariantsEnumeration )
                    // InternalHLCLSpecificationLanguage.g:678:3: rulevariantsEnumeration
                    {
                     before(grammarAccess.getVariantDeclarationAccess().getVariantsEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulevariantsEnumeration();

                    state._fsp--;

                     after(grammarAccess.getVariantDeclarationAccess().getVariantsEnumerationParserRuleCall_1()); 

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
    // $ANTLR end "rule__VariantDeclaration__Alternatives"


    // $ANTLR start "rule__Enumeration__Alternatives"
    // InternalHLCLSpecificationLanguage.g:687:1: rule__Enumeration__Alternatives : ( ( ( rule__Enumeration__ValuesAssignment_0 ) ) | ( ruleListOfIDs ) );
    public final void rule__Enumeration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:691:1: ( ( ( rule__Enumeration__ValuesAssignment_0 ) ) | ( ruleListOfIDs ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||(LA4_0>=11 && LA4_0<=12)) ) {
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
                    // InternalHLCLSpecificationLanguage.g:692:2: ( ( rule__Enumeration__ValuesAssignment_0 ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:692:2: ( ( rule__Enumeration__ValuesAssignment_0 ) )
                    // InternalHLCLSpecificationLanguage.g:693:3: ( rule__Enumeration__ValuesAssignment_0 )
                    {
                     before(grammarAccess.getEnumerationAccess().getValuesAssignment_0()); 
                    // InternalHLCLSpecificationLanguage.g:694:3: ( rule__Enumeration__ValuesAssignment_0 )
                    // InternalHLCLSpecificationLanguage.g:694:4: rule__Enumeration__ValuesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enumeration__ValuesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumerationAccess().getValuesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:698:2: ( ruleListOfIDs )
                    {
                    // InternalHLCLSpecificationLanguage.g:698:2: ( ruleListOfIDs )
                    // InternalHLCLSpecificationLanguage.g:699:3: ruleListOfIDs
                    {
                     before(grammarAccess.getEnumerationAccess().getListOfIDsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListOfIDs();

                    state._fsp--;

                     after(grammarAccess.getEnumerationAccess().getListOfIDsParserRuleCall_1()); 

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
    // $ANTLR end "rule__Enumeration__Alternatives"


    // $ANTLR start "rule__ConsExpression__Alternatives"
    // InternalHLCLSpecificationLanguage.g:708:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleFodaNary ) | ( ruleFodaUN ) );
    public final void rule__ConsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:712:1: ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleFodaNary ) | ( ruleFodaUN ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:713:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:713:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:714:3: ruleIDCons
                    {
                     before(grammarAccess.getConsExpressionAccess().getIDConsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIDCons();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getIDConsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:719:2: ( ruleRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:719:2: ( ruleRefinement )
                    // InternalHLCLSpecificationLanguage.g:720:3: ruleRefinement
                    {
                     before(grammarAccess.getConsExpressionAccess().getRefinementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefinement();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getRefinementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:725:2: ( ruleRule )
                    {
                    // InternalHLCLSpecificationLanguage.g:725:2: ( ruleRule )
                    // InternalHLCLSpecificationLanguage.g:726:3: ruleRule
                    {
                     before(grammarAccess.getConsExpressionAccess().getRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getRuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHLCLSpecificationLanguage.g:731:2: ( ruleFodaBin )
                    {
                    // InternalHLCLSpecificationLanguage.g:731:2: ( ruleFodaBin )
                    // InternalHLCLSpecificationLanguage.g:732:3: ruleFodaBin
                    {
                     before(grammarAccess.getConsExpressionAccess().getFodaBinParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFodaBin();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getFodaBinParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHLCLSpecificationLanguage.g:737:2: ( ruleFodaNary )
                    {
                    // InternalHLCLSpecificationLanguage.g:737:2: ( ruleFodaNary )
                    // InternalHLCLSpecificationLanguage.g:738:3: ruleFodaNary
                    {
                     before(grammarAccess.getConsExpressionAccess().getFodaNaryParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFodaNary();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getFodaNaryParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHLCLSpecificationLanguage.g:743:2: ( ruleFodaUN )
                    {
                    // InternalHLCLSpecificationLanguage.g:743:2: ( ruleFodaUN )
                    // InternalHLCLSpecificationLanguage.g:744:3: ruleFodaUN
                    {
                     before(grammarAccess.getConsExpressionAccess().getFodaUNParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleFodaUN();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getFodaUNParserRuleCall_5()); 

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
    // $ANTLR end "rule__ConsExpression__Alternatives"


    // $ANTLR start "rule__TerminalExp__Alternatives"
    // InternalHLCLSpecificationLanguage.g:753:1: rule__TerminalExp__Alternatives : ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) );
    public final void rule__TerminalExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:757:1: ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:758:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:758:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    // InternalHLCLSpecificationLanguage.g:759:3: ( rule__TerminalExp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpAccess().getGroup_0()); 
                    // InternalHLCLSpecificationLanguage.g:760:3: ( rule__TerminalExp__Group_0__0 )
                    // InternalHLCLSpecificationLanguage.g:760:4: rule__TerminalExp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:764:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:764:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:765:3: ruleIDCons
                    {
                     before(grammarAccess.getTerminalExpAccess().getIDConsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIDCons();

                    state._fsp--;

                     after(grammarAccess.getTerminalExpAccess().getIDConsParserRuleCall_1()); 

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
    // $ANTLR end "rule__TerminalExp__Alternatives"


    // $ANTLR start "rule__Refinement__Alternatives"
    // InternalHLCLSpecificationLanguage.g:774:1: rule__Refinement__Alternatives : ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) );
    public final void rule__Refinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:778:1: ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==30) ) {
                    alt7=2;
                }
                else if ( (LA7_1==29) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==27) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:779:2: ( ruleAssignment )
                    {
                    // InternalHLCLSpecificationLanguage.g:779:2: ( ruleAssignment )
                    // InternalHLCLSpecificationLanguage.g:780:3: ruleAssignment
                    {
                     before(grammarAccess.getRefinementAccess().getAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getRefinementAccess().getAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:785:2: ( ruleVarRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:785:2: ( ruleVarRefinement )
                    // InternalHLCLSpecificationLanguage.g:786:3: ruleVarRefinement
                    {
                     before(grammarAccess.getRefinementAccess().getVarRefinementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVarRefinement();

                    state._fsp--;

                     after(grammarAccess.getRefinementAccess().getVarRefinementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:791:2: ( ruleSetRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:791:2: ( ruleSetRefinement )
                    // InternalHLCLSpecificationLanguage.g:792:3: ruleSetRefinement
                    {
                     before(grammarAccess.getRefinementAccess().getSetRefinementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSetRefinement();

                    state._fsp--;

                     after(grammarAccess.getRefinementAccess().getSetRefinementParserRuleCall_2()); 

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
    // $ANTLR end "rule__Refinement__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalHLCLSpecificationLanguage.g:801:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:805:1: ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 11:
                {
                alt8=2;
                }
                break;
            case 12:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:806:2: ( RULE_INT )
                    {
                    // InternalHLCLSpecificationLanguage.g:806:2: ( RULE_INT )
                    // InternalHLCLSpecificationLanguage.g:807:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:812:2: ( 'selected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:812:2: ( 'selected' )
                    // InternalHLCLSpecificationLanguage.g:813:3: 'selected'
                    {
                     before(grammarAccess.getValueAccess().getSelectedKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSelectedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:818:2: ( 'unselected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:818:2: ( 'unselected' )
                    // InternalHLCLSpecificationLanguage.g:819:3: 'unselected'
                    {
                     before(grammarAccess.getValueAccess().getUnselectedKeyword_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getUnselectedKeyword_2()); 

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


    // $ANTLR start "rule__VarType__Alternatives"
    // InternalHLCLSpecificationLanguage.g:828:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'numeric' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:832:1: ( ( 'boolean' ) | ( 'numeric' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:833:2: ( 'boolean' )
                    {
                    // InternalHLCLSpecificationLanguage.g:833:2: ( 'boolean' )
                    // InternalHLCLSpecificationLanguage.g:834:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:839:2: ( 'numeric' )
                    {
                    // InternalHLCLSpecificationLanguage.g:839:2: ( 'numeric' )
                    // InternalHLCLSpecificationLanguage.g:840:3: 'numeric'
                    {
                     before(grammarAccess.getVarTypeAccess().getNumericKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getNumericKeyword_1()); 

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
    // $ANTLR end "rule__VarType__Alternatives"


    // $ANTLR start "rule__BinOp__Alternatives"
    // InternalHLCLSpecificationLanguage.g:849:1: rule__BinOp__Alternatives : ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__BinOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:853:1: ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt10=1;
                }
                break;
            case 16:
                {
                alt10=2;
                }
                break;
            case 17:
                {
                alt10=3;
                }
                break;
            case 18:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:854:2: ( 'requires' )
                    {
                    // InternalHLCLSpecificationLanguage.g:854:2: ( 'requires' )
                    // InternalHLCLSpecificationLanguage.g:855:3: 'requires'
                    {
                     before(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:860:2: ( 'excludes' )
                    {
                    // InternalHLCLSpecificationLanguage.g:860:2: ( 'excludes' )
                    // InternalHLCLSpecificationLanguage.g:861:3: 'excludes'
                    {
                     before(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:866:2: ( 'optional' )
                    {
                    // InternalHLCLSpecificationLanguage.g:866:2: ( 'optional' )
                    // InternalHLCLSpecificationLanguage.g:867:3: 'optional'
                    {
                     before(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHLCLSpecificationLanguage.g:872:2: ( 'mandatory' )
                    {
                    // InternalHLCLSpecificationLanguage.g:872:2: ( 'mandatory' )
                    // InternalHLCLSpecificationLanguage.g:873:3: 'mandatory'
                    {
                     before(grammarAccess.getBinOpAccess().getMandatoryKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getMandatoryKeyword_3()); 

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
    // $ANTLR end "rule__BinOp__Alternatives"


    // $ANTLR start "rule__UnaryOp__Alternatives"
    // InternalHLCLSpecificationLanguage.g:882:1: rule__UnaryOp__Alternatives : ( ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:886:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( (LA11_0==18) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:887:2: ( 'optional' )
                    {
                    // InternalHLCLSpecificationLanguage.g:887:2: ( 'optional' )
                    // InternalHLCLSpecificationLanguage.g:888:3: 'optional'
                    {
                     before(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:893:2: ( 'mandatory' )
                    {
                    // InternalHLCLSpecificationLanguage.g:893:2: ( 'mandatory' )
                    // InternalHLCLSpecificationLanguage.g:894:3: 'mandatory'
                    {
                     before(grammarAccess.getUnaryOpAccess().getMandatoryKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getMandatoryKeyword_1()); 

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
    // $ANTLR end "rule__UnaryOp__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalHLCLSpecificationLanguage.g:903:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:907:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHLCLSpecificationLanguage.g:908:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:915:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:919:1: ( ( 'model' ) )
            // InternalHLCLSpecificationLanguage.g:920:1: ( 'model' )
            {
            // InternalHLCLSpecificationLanguage.g:920:1: ( 'model' )
            // InternalHLCLSpecificationLanguage.g:921:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalHLCLSpecificationLanguage.g:930:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:934:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalHLCLSpecificationLanguage.g:935:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:942:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:946:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:947:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:947:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:948:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:949:2: ( rule__Model__NameAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:949:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalHLCLSpecificationLanguage.g:957:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:961:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalHLCLSpecificationLanguage.g:962:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:969:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:973:1: ( ( 'variables:' ) )
            // InternalHLCLSpecificationLanguage.g:974:1: ( 'variables:' )
            {
            // InternalHLCLSpecificationLanguage.g:974:1: ( 'variables:' )
            // InternalHLCLSpecificationLanguage.g:975:2: 'variables:'
            {
             before(grammarAccess.getModelAccess().getVariablesKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVariablesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalHLCLSpecificationLanguage.g:984:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:988:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalHLCLSpecificationLanguage.g:989:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalHLCLSpecificationLanguage.g:996:1: rule__Model__Group__3__Impl : ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1000:1: ( ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:1001:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:1001:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalHLCLSpecificationLanguage.g:1002:2: ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalHLCLSpecificationLanguage.g:1002:2: ( ( rule__Model__VarsAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:1003:3: ( rule__Model__VarsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:1004:3: ( rule__Model__VarsAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:1004:4: rule__Model__VarsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Model__VarsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

            }

            // InternalHLCLSpecificationLanguage.g:1007:2: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalHLCLSpecificationLanguage.g:1008:3: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:1009:3: ( rule__Model__VarsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)||LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1009:4: rule__Model__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__VarsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalHLCLSpecificationLanguage.g:1018:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1022:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalHLCLSpecificationLanguage.g:1023:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalHLCLSpecificationLanguage.g:1030:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1034:1: ( ( 'constraints:' ) )
            // InternalHLCLSpecificationLanguage.g:1035:1: ( 'constraints:' )
            {
            // InternalHLCLSpecificationLanguage.g:1035:1: ( 'constraints:' )
            // InternalHLCLSpecificationLanguage.g:1036:2: 'constraints:'
            {
             before(grammarAccess.getModelAccess().getConstraintsKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getConstraintsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalHLCLSpecificationLanguage.g:1045:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1049:1: ( rule__Model__Group__5__Impl )
            // InternalHLCLSpecificationLanguage.g:1050:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalHLCLSpecificationLanguage.g:1056:1: rule__Model__Group__5__Impl : ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1060:1: ( ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:1061:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:1061:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalHLCLSpecificationLanguage.g:1062:2: ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalHLCLSpecificationLanguage.g:1062:2: ( ( rule__Model__ConstraintsAssignment_5 ) )
            // InternalHLCLSpecificationLanguage.g:1063:3: ( rule__Model__ConstraintsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:1064:3: ( rule__Model__ConstraintsAssignment_5 )
            // InternalHLCLSpecificationLanguage.g:1064:4: rule__Model__ConstraintsAssignment_5
            {
            pushFollow(FOLLOW_4);
            rule__Model__ConstraintsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 

            }

            // InternalHLCLSpecificationLanguage.g:1067:2: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalHLCLSpecificationLanguage.g:1068:3: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:1069:3: ( rule__Model__ConstraintsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1069:4: rule__Model__ConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ConstraintsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_1__0"
    // InternalHLCLSpecificationLanguage.g:1079:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1083:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalHLCLSpecificationLanguage.g:1084:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__VarDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__0"


    // $ANTLR start "rule__VarDeclaration__Group_1__0__Impl"
    // InternalHLCLSpecificationLanguage.g:1091:1: rule__VarDeclaration__Group_1__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_1_0 ) ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1095:1: ( ( ( rule__VarDeclaration__TypeAssignment_1_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1096:1: ( ( rule__VarDeclaration__TypeAssignment_1_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1096:1: ( ( rule__VarDeclaration__TypeAssignment_1_0 ) )
            // InternalHLCLSpecificationLanguage.g:1097:2: ( rule__VarDeclaration__TypeAssignment_1_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1_0()); 
            // InternalHLCLSpecificationLanguage.g:1098:2: ( rule__VarDeclaration__TypeAssignment_1_0 )
            // InternalHLCLSpecificationLanguage.g:1098:3: rule__VarDeclaration__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_1__1"
    // InternalHLCLSpecificationLanguage.g:1106:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2 ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1110:1: ( rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2 )
            // InternalHLCLSpecificationLanguage.g:1111:2: rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__VarDeclaration__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__1"


    // $ANTLR start "rule__VarDeclaration__Group_1__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1118:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1122:1: ( ( ( rule__VarDeclaration__NameAssignment_1_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1123:1: ( ( rule__VarDeclaration__NameAssignment_1_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1123:1: ( ( rule__VarDeclaration__NameAssignment_1_1 ) )
            // InternalHLCLSpecificationLanguage.g:1124:2: ( rule__VarDeclaration__NameAssignment_1_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1_1()); 
            // InternalHLCLSpecificationLanguage.g:1125:2: ( rule__VarDeclaration__NameAssignment_1_1 )
            // InternalHLCLSpecificationLanguage.g:1125:3: rule__VarDeclaration__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_1__2"
    // InternalHLCLSpecificationLanguage.g:1133:1: rule__VarDeclaration__Group_1__2 : rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3 ;
    public final void rule__VarDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1137:1: ( rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3 )
            // InternalHLCLSpecificationLanguage.g:1138:2: rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__VarDeclaration__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__2"


    // $ANTLR start "rule__VarDeclaration__Group_1__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1145:1: rule__VarDeclaration__Group_1__2__Impl : ( 'variants:' ) ;
    public final void rule__VarDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1149:1: ( ( 'variants:' ) )
            // InternalHLCLSpecificationLanguage.g:1150:1: ( 'variants:' )
            {
            // InternalHLCLSpecificationLanguage.g:1150:1: ( 'variants:' )
            // InternalHLCLSpecificationLanguage.g:1151:2: 'variants:'
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getVariantsKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_1__3"
    // InternalHLCLSpecificationLanguage.g:1160:1: rule__VarDeclaration__Group_1__3 : rule__VarDeclaration__Group_1__3__Impl ;
    public final void rule__VarDeclaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1164:1: ( rule__VarDeclaration__Group_1__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1165:2: rule__VarDeclaration__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__3"


    // $ANTLR start "rule__VarDeclaration__Group_1__3__Impl"
    // InternalHLCLSpecificationLanguage.g:1171:1: rule__VarDeclaration__Group_1__3__Impl : ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) ) ;
    public final void rule__VarDeclaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1175:1: ( ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1176:1: ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1176:1: ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) )
            // InternalHLCLSpecificationLanguage.g:1177:2: ( rule__VarDeclaration__VariantsAssignment_1_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_1_3()); 
            // InternalHLCLSpecificationLanguage.g:1178:2: ( rule__VarDeclaration__VariantsAssignment_1_3 )
            // InternalHLCLSpecificationLanguage.g:1178:3: rule__VarDeclaration__VariantsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VariantsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__3__Impl"


    // $ANTLR start "rule__VariantsInterval__Group__0"
    // InternalHLCLSpecificationLanguage.g:1187:1: rule__VariantsInterval__Group__0 : rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 ;
    public final void rule__VariantsInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1191:1: ( rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1192:2: rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__VariantsInterval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__0"


    // $ANTLR start "rule__VariantsInterval__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:1199:1: rule__VariantsInterval__Group__0__Impl : ( () ) ;
    public final void rule__VariantsInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1203:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1204:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1204:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1205:2: ()
            {
             before(grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1206:2: ()
            // InternalHLCLSpecificationLanguage.g:1206:3: 
            {
            }

             after(grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__0__Impl"


    // $ANTLR start "rule__VariantsInterval__Group__1"
    // InternalHLCLSpecificationLanguage.g:1214:1: rule__VariantsInterval__Group__1 : rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 ;
    public final void rule__VariantsInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1218:1: ( rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1219:2: rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__VariantsInterval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__1"


    // $ANTLR start "rule__VariantsInterval__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1226:1: rule__VariantsInterval__Group__1__Impl : ( ( rule__VariantsInterval__StartAssignment_1 ) ) ;
    public final void rule__VariantsInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1230:1: ( ( ( rule__VariantsInterval__StartAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1231:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1231:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1232:2: ( rule__VariantsInterval__StartAssignment_1 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1233:2: ( rule__VariantsInterval__StartAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1233:3: rule__VariantsInterval__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariantsIntervalAccess().getStartAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__1__Impl"


    // $ANTLR start "rule__VariantsInterval__Group__2"
    // InternalHLCLSpecificationLanguage.g:1241:1: rule__VariantsInterval__Group__2 : rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 ;
    public final void rule__VariantsInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1245:1: ( rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1246:2: rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__VariantsInterval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__2"


    // $ANTLR start "rule__VariantsInterval__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1253:1: rule__VariantsInterval__Group__2__Impl : ( '::' ) ;
    public final void rule__VariantsInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1257:1: ( ( '::' ) )
            // InternalHLCLSpecificationLanguage.g:1258:1: ( '::' )
            {
            // InternalHLCLSpecificationLanguage.g:1258:1: ( '::' )
            // InternalHLCLSpecificationLanguage.g:1259:2: '::'
            {
             before(grammarAccess.getVariantsIntervalAccess().getColonColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVariantsIntervalAccess().getColonColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__2__Impl"


    // $ANTLR start "rule__VariantsInterval__Group__3"
    // InternalHLCLSpecificationLanguage.g:1268:1: rule__VariantsInterval__Group__3 : rule__VariantsInterval__Group__3__Impl ;
    public final void rule__VariantsInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1272:1: ( rule__VariantsInterval__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1273:2: rule__VariantsInterval__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__3"


    // $ANTLR start "rule__VariantsInterval__Group__3__Impl"
    // InternalHLCLSpecificationLanguage.g:1279:1: rule__VariantsInterval__Group__3__Impl : ( ( rule__VariantsInterval__EndAssignment_3 ) ) ;
    public final void rule__VariantsInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1283:1: ( ( ( rule__VariantsInterval__EndAssignment_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1284:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1284:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:1285:2: ( rule__VariantsInterval__EndAssignment_3 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:1286:2: ( rule__VariantsInterval__EndAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:1286:3: rule__VariantsInterval__EndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__EndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariantsIntervalAccess().getEndAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__3__Impl"


    // $ANTLR start "rule__VariantsEnumeration__Group__0"
    // InternalHLCLSpecificationLanguage.g:1295:1: rule__VariantsEnumeration__Group__0 : rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 ;
    public final void rule__VariantsEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1299:1: ( rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1300:2: rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__VariantsEnumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__0"


    // $ANTLR start "rule__VariantsEnumeration__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:1307:1: rule__VariantsEnumeration__Group__0__Impl : ( () ) ;
    public final void rule__VariantsEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1311:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1312:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1312:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1313:2: ()
            {
             before(grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1314:2: ()
            // InternalHLCLSpecificationLanguage.g:1314:3: 
            {
            }

             after(grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__0__Impl"


    // $ANTLR start "rule__VariantsEnumeration__Group__1"
    // InternalHLCLSpecificationLanguage.g:1322:1: rule__VariantsEnumeration__Group__1 : rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 ;
    public final void rule__VariantsEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1326:1: ( rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1327:2: rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__VariantsEnumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__1"


    // $ANTLR start "rule__VariantsEnumeration__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1334:1: rule__VariantsEnumeration__Group__1__Impl : ( '[' ) ;
    public final void rule__VariantsEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1338:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1339:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1339:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1340:2: '['
            {
             before(grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__1__Impl"


    // $ANTLR start "rule__VariantsEnumeration__Group__2"
    // InternalHLCLSpecificationLanguage.g:1349:1: rule__VariantsEnumeration__Group__2 : rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 ;
    public final void rule__VariantsEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1353:1: ( rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1354:2: rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__VariantsEnumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__2"


    // $ANTLR start "rule__VariantsEnumeration__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1361:1: rule__VariantsEnumeration__Group__2__Impl : ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) ;
    public final void rule__VariantsEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1365:1: ( ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1366:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1366:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1367:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1368:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1368:3: rule__VariantsEnumeration__ListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariantsEnumerationAccess().getListAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__2__Impl"


    // $ANTLR start "rule__VariantsEnumeration__Group__3"
    // InternalHLCLSpecificationLanguage.g:1376:1: rule__VariantsEnumeration__Group__3 : rule__VariantsEnumeration__Group__3__Impl ;
    public final void rule__VariantsEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1380:1: ( rule__VariantsEnumeration__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1381:2: rule__VariantsEnumeration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__3"


    // $ANTLR start "rule__VariantsEnumeration__Group__3__Impl"
    // InternalHLCLSpecificationLanguage.g:1387:1: rule__VariantsEnumeration__Group__3__Impl : ( ']' ) ;
    public final void rule__VariantsEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1391:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1392:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1392:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1393:2: ']'
            {
             before(grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalHLCLSpecificationLanguage.g:1403:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1407:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1408:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:1415:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1419:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1420:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1420:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1421:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1422:2: ( rule__Constraint__NameAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1422:3: rule__Constraint__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalHLCLSpecificationLanguage.g:1430:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1434:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1435:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1442:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1446:1: ( ( ':' ) )
            // InternalHLCLSpecificationLanguage.g:1447:1: ( ':' )
            {
            // InternalHLCLSpecificationLanguage.g:1447:1: ( ':' )
            // InternalHLCLSpecificationLanguage.g:1448:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalHLCLSpecificationLanguage.g:1457:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1461:1: ( rule__Constraint__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1462:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1468:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1472:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1473:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1473:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1474:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1475:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1475:3: rule__Constraint__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__TerminalExp__Group_0__0"
    // InternalHLCLSpecificationLanguage.g:1484:1: rule__TerminalExp__Group_0__0 : rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 ;
    public final void rule__TerminalExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1488:1: ( rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 )
            // InternalHLCLSpecificationLanguage.g:1489:2: rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__TerminalExp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExp__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExp__Group_0__0"


    // $ANTLR start "rule__TerminalExp__Group_0__0__Impl"
    // InternalHLCLSpecificationLanguage.g:1496:1: rule__TerminalExp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1500:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1501:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1501:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1502:2: '('
            {
             before(grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExp__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExp__Group_0__1"
    // InternalHLCLSpecificationLanguage.g:1511:1: rule__TerminalExp__Group_0__1 : rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 ;
    public final void rule__TerminalExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1515:1: ( rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 )
            // InternalHLCLSpecificationLanguage.g:1516:2: rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__TerminalExp__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExp__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExp__Group_0__1"


    // $ANTLR start "rule__TerminalExp__Group_0__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1523:1: rule__TerminalExp__Group_0__1__Impl : ( ruleConsExpression ) ;
    public final void rule__TerminalExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1527:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:1528:1: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:1528:1: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:1529:2: ruleConsExpression
            {
             before(grammarAccess.getTerminalExpAccess().getConsExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleConsExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpAccess().getConsExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExp__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExp__Group_0__2"
    // InternalHLCLSpecificationLanguage.g:1538:1: rule__TerminalExp__Group_0__2 : rule__TerminalExp__Group_0__2__Impl ;
    public final void rule__TerminalExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1542:1: ( rule__TerminalExp__Group_0__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1543:2: rule__TerminalExp__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExp__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExp__Group_0__2"


    // $ANTLR start "rule__TerminalExp__Group_0__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1549:1: rule__TerminalExp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1553:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1554:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1554:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1555:2: ')'
            {
             before(grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExp__Group_0__2__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalHLCLSpecificationLanguage.g:1565:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1569:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1570:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:1577:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1581:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1582:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1582:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1583:2: ( rule__Assignment__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1584:2: ( rule__Assignment__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1584:3: rule__Assignment__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalHLCLSpecificationLanguage.g:1592:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1596:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1597:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1604:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1608:1: ( ( 'is' ) )
            // InternalHLCLSpecificationLanguage.g:1609:1: ( 'is' )
            {
            // InternalHLCLSpecificationLanguage.g:1609:1: ( 'is' )
            // InternalHLCLSpecificationLanguage.g:1610:2: 'is'
            {
             before(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalHLCLSpecificationLanguage.g:1619:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1623:1: ( rule__Assignment__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1624:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1630:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1634:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1635:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1635:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1636:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1637:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1637:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__VarRefinement__Group__0"
    // InternalHLCLSpecificationLanguage.g:1646:1: rule__VarRefinement__Group__0 : rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 ;
    public final void rule__VarRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1650:1: ( rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1651:2: rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__VarRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__Group__0"


    // $ANTLR start "rule__VarRefinement__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:1658:1: rule__VarRefinement__Group__0__Impl : ( ( rule__VarRefinement__VarAssignment_0 ) ) ;
    public final void rule__VarRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1662:1: ( ( ( rule__VarRefinement__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1663:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1663:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1664:2: ( rule__VarRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1665:2: ( rule__VarRefinement__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1665:3: rule__VarRefinement__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarRefinement__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__Group__0__Impl"


    // $ANTLR start "rule__VarRefinement__Group__1"
    // InternalHLCLSpecificationLanguage.g:1673:1: rule__VarRefinement__Group__1 : rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 ;
    public final void rule__VarRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1677:1: ( rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1678:2: rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VarRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__Group__1"


    // $ANTLR start "rule__VarRefinement__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1685:1: rule__VarRefinement__Group__1__Impl : ( 'in' ) ;
    public final void rule__VarRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1689:1: ( ( 'in' ) )
            // InternalHLCLSpecificationLanguage.g:1690:1: ( 'in' )
            {
            // InternalHLCLSpecificationLanguage.g:1690:1: ( 'in' )
            // InternalHLCLSpecificationLanguage.g:1691:2: 'in'
            {
             before(grammarAccess.getVarRefinementAccess().getInKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVarRefinementAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__Group__1__Impl"


    // $ANTLR start "rule__VarRefinement__Group__2"
    // InternalHLCLSpecificationLanguage.g:1700:1: rule__VarRefinement__Group__2 : rule__VarRefinement__Group__2__Impl ;
    public final void rule__VarRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1704:1: ( rule__VarRefinement__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1705:2: rule__VarRefinement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarRefinement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__Group__2"


    // $ANTLR start "rule__VarRefinement__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1711:1: rule__VarRefinement__Group__2__Impl : ( ( rule__VarRefinement__VariantsAssignment_2 ) ) ;
    public final void rule__VarRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1715:1: ( ( ( rule__VarRefinement__VariantsAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1716:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1716:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1717:2: ( rule__VarRefinement__VariantsAssignment_2 )
            {
             before(grammarAccess.getVarRefinementAccess().getVariantsAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1718:2: ( rule__VarRefinement__VariantsAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1718:3: rule__VarRefinement__VariantsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarRefinement__VariantsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarRefinementAccess().getVariantsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__Group__2__Impl"


    // $ANTLR start "rule__SetRefinement__Group__0"
    // InternalHLCLSpecificationLanguage.g:1727:1: rule__SetRefinement__Group__0 : rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 ;
    public final void rule__SetRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1731:1: ( rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1732:2: rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SetRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__0"


    // $ANTLR start "rule__SetRefinement__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:1739:1: rule__SetRefinement__Group__0__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1743:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1744:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1744:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1745:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__0__Impl"


    // $ANTLR start "rule__SetRefinement__Group__1"
    // InternalHLCLSpecificationLanguage.g:1754:1: rule__SetRefinement__Group__1 : rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 ;
    public final void rule__SetRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1758:1: ( rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1759:2: rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SetRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__1"


    // $ANTLR start "rule__SetRefinement__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1766:1: rule__SetRefinement__Group__1__Impl : ( ( rule__SetRefinement__VarsAssignment_1 ) ) ;
    public final void rule__SetRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1770:1: ( ( ( rule__SetRefinement__VarsAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1771:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1771:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1772:2: ( rule__SetRefinement__VarsAssignment_1 )
            {
             before(grammarAccess.getSetRefinementAccess().getVarsAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1773:2: ( rule__SetRefinement__VarsAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1773:3: rule__SetRefinement__VarsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__VarsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getVarsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__1__Impl"


    // $ANTLR start "rule__SetRefinement__Group__2"
    // InternalHLCLSpecificationLanguage.g:1781:1: rule__SetRefinement__Group__2 : rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 ;
    public final void rule__SetRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1785:1: ( rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1786:2: rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__SetRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__2"


    // $ANTLR start "rule__SetRefinement__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1793:1: rule__SetRefinement__Group__2__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1797:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1798:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1798:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1799:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__2__Impl"


    // $ANTLR start "rule__SetRefinement__Group__3"
    // InternalHLCLSpecificationLanguage.g:1808:1: rule__SetRefinement__Group__3 : rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 ;
    public final void rule__SetRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1812:1: ( rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 )
            // InternalHLCLSpecificationLanguage.g:1813:2: rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__SetRefinement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__3"


    // $ANTLR start "rule__SetRefinement__Group__3__Impl"
    // InternalHLCLSpecificationLanguage.g:1820:1: rule__SetRefinement__Group__3__Impl : ( 'variants' ) ;
    public final void rule__SetRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1824:1: ( ( 'variants' ) )
            // InternalHLCLSpecificationLanguage.g:1825:1: ( 'variants' )
            {
            // InternalHLCLSpecificationLanguage.g:1825:1: ( 'variants' )
            // InternalHLCLSpecificationLanguage.g:1826:2: 'variants'
            {
             before(grammarAccess.getSetRefinementAccess().getVariantsKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getVariantsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__3__Impl"


    // $ANTLR start "rule__SetRefinement__Group__4"
    // InternalHLCLSpecificationLanguage.g:1835:1: rule__SetRefinement__Group__4 : rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 ;
    public final void rule__SetRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1839:1: ( rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 )
            // InternalHLCLSpecificationLanguage.g:1840:2: rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__SetRefinement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__4"


    // $ANTLR start "rule__SetRefinement__Group__4__Impl"
    // InternalHLCLSpecificationLanguage.g:1847:1: rule__SetRefinement__Group__4__Impl : ( '[' ) ;
    public final void rule__SetRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1851:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1852:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1852:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1853:2: '['
            {
             before(grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__4__Impl"


    // $ANTLR start "rule__SetRefinement__Group__5"
    // InternalHLCLSpecificationLanguage.g:1862:1: rule__SetRefinement__Group__5 : rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 ;
    public final void rule__SetRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1866:1: ( rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 )
            // InternalHLCLSpecificationLanguage.g:1867:2: rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__SetRefinement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__5"


    // $ANTLR start "rule__SetRefinement__Group__5__Impl"
    // InternalHLCLSpecificationLanguage.g:1874:1: rule__SetRefinement__Group__5__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1878:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1879:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1879:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1880:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__5__Impl"


    // $ANTLR start "rule__SetRefinement__Group__6"
    // InternalHLCLSpecificationLanguage.g:1889:1: rule__SetRefinement__Group__6 : rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 ;
    public final void rule__SetRefinement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1893:1: ( rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 )
            // InternalHLCLSpecificationLanguage.g:1894:2: rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__SetRefinement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__6"


    // $ANTLR start "rule__SetRefinement__Group__6__Impl"
    // InternalHLCLSpecificationLanguage.g:1901:1: rule__SetRefinement__Group__6__Impl : ( ( rule__SetRefinement__HeadAssignment_6 ) ) ;
    public final void rule__SetRefinement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1905:1: ( ( ( rule__SetRefinement__HeadAssignment_6 ) ) )
            // InternalHLCLSpecificationLanguage.g:1906:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1906:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            // InternalHLCLSpecificationLanguage.g:1907:2: ( rule__SetRefinement__HeadAssignment_6 )
            {
             before(grammarAccess.getSetRefinementAccess().getHeadAssignment_6()); 
            // InternalHLCLSpecificationLanguage.g:1908:2: ( rule__SetRefinement__HeadAssignment_6 )
            // InternalHLCLSpecificationLanguage.g:1908:3: rule__SetRefinement__HeadAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__HeadAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getHeadAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__6__Impl"


    // $ANTLR start "rule__SetRefinement__Group__7"
    // InternalHLCLSpecificationLanguage.g:1916:1: rule__SetRefinement__Group__7 : rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 ;
    public final void rule__SetRefinement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1920:1: ( rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 )
            // InternalHLCLSpecificationLanguage.g:1921:2: rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__SetRefinement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__7"


    // $ANTLR start "rule__SetRefinement__Group__7__Impl"
    // InternalHLCLSpecificationLanguage.g:1928:1: rule__SetRefinement__Group__7__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1932:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1933:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1933:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1934:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__7__Impl"


    // $ANTLR start "rule__SetRefinement__Group__8"
    // InternalHLCLSpecificationLanguage.g:1943:1: rule__SetRefinement__Group__8 : rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 ;
    public final void rule__SetRefinement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1947:1: ( rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 )
            // InternalHLCLSpecificationLanguage.g:1948:2: rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__SetRefinement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__8"


    // $ANTLR start "rule__SetRefinement__Group__8__Impl"
    // InternalHLCLSpecificationLanguage.g:1955:1: rule__SetRefinement__Group__8__Impl : ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) ;
    public final void rule__SetRefinement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1959:1: ( ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:1960:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:1960:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:1961:2: ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:1961:2: ( ( rule__SetRefinement__Group_8__0 ) )
            // InternalHLCLSpecificationLanguage.g:1962:3: ( rule__SetRefinement__Group_8__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1963:3: ( rule__SetRefinement__Group_8__0 )
            // InternalHLCLSpecificationLanguage.g:1963:4: rule__SetRefinement__Group_8__0
            {
            pushFollow(FOLLOW_25);
            rule__SetRefinement__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup_8()); 

            }

            // InternalHLCLSpecificationLanguage.g:1966:2: ( ( rule__SetRefinement__Group_8__0 )* )
            // InternalHLCLSpecificationLanguage.g:1967:3: ( rule__SetRefinement__Group_8__0 )*
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1968:3: ( rule__SetRefinement__Group_8__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1968:4: rule__SetRefinement__Group_8__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SetRefinement__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSetRefinementAccess().getGroup_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__8__Impl"


    // $ANTLR start "rule__SetRefinement__Group__9"
    // InternalHLCLSpecificationLanguage.g:1977:1: rule__SetRefinement__Group__9 : rule__SetRefinement__Group__9__Impl ;
    public final void rule__SetRefinement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1981:1: ( rule__SetRefinement__Group__9__Impl )
            // InternalHLCLSpecificationLanguage.g:1982:2: rule__SetRefinement__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__9"


    // $ANTLR start "rule__SetRefinement__Group__9__Impl"
    // InternalHLCLSpecificationLanguage.g:1988:1: rule__SetRefinement__Group__9__Impl : ( ']' ) ;
    public final void rule__SetRefinement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1992:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1993:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1993:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1994:2: ']'
            {
             before(grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__9__Impl"


    // $ANTLR start "rule__SetRefinement__Group_8__0"
    // InternalHLCLSpecificationLanguage.g:2004:1: rule__SetRefinement__Group_8__0 : rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 ;
    public final void rule__SetRefinement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2008:1: ( rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 )
            // InternalHLCLSpecificationLanguage.g:2009:2: rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1
            {
            pushFollow(FOLLOW_23);
            rule__SetRefinement__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__0"


    // $ANTLR start "rule__SetRefinement__Group_8__0__Impl"
    // InternalHLCLSpecificationLanguage.g:2016:1: rule__SetRefinement__Group_8__0__Impl : ( ',' ) ;
    public final void rule__SetRefinement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2020:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:2021:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:2021:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:2022:2: ','
            {
             before(grammarAccess.getSetRefinementAccess().getCommaKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__0__Impl"


    // $ANTLR start "rule__SetRefinement__Group_8__1"
    // InternalHLCLSpecificationLanguage.g:2031:1: rule__SetRefinement__Group_8__1 : rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 ;
    public final void rule__SetRefinement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2035:1: ( rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 )
            // InternalHLCLSpecificationLanguage.g:2036:2: rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__SetRefinement__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__1"


    // $ANTLR start "rule__SetRefinement__Group_8__1__Impl"
    // InternalHLCLSpecificationLanguage.g:2043:1: rule__SetRefinement__Group_8__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2047:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:2048:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:2048:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:2049:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__1__Impl"


    // $ANTLR start "rule__SetRefinement__Group_8__2"
    // InternalHLCLSpecificationLanguage.g:2058:1: rule__SetRefinement__Group_8__2 : rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 ;
    public final void rule__SetRefinement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2062:1: ( rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 )
            // InternalHLCLSpecificationLanguage.g:2063:2: rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3
            {
            pushFollow(FOLLOW_18);
            rule__SetRefinement__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__2"


    // $ANTLR start "rule__SetRefinement__Group_8__2__Impl"
    // InternalHLCLSpecificationLanguage.g:2070:1: rule__SetRefinement__Group_8__2__Impl : ( ( rule__SetRefinement__TailAssignment_8_2 ) ) ;
    public final void rule__SetRefinement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2074:1: ( ( ( rule__SetRefinement__TailAssignment_8_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2075:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2075:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            // InternalHLCLSpecificationLanguage.g:2076:2: ( rule__SetRefinement__TailAssignment_8_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getTailAssignment_8_2()); 
            // InternalHLCLSpecificationLanguage.g:2077:2: ( rule__SetRefinement__TailAssignment_8_2 )
            // InternalHLCLSpecificationLanguage.g:2077:3: rule__SetRefinement__TailAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__TailAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getTailAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__2__Impl"


    // $ANTLR start "rule__SetRefinement__Group_8__3"
    // InternalHLCLSpecificationLanguage.g:2085:1: rule__SetRefinement__Group_8__3 : rule__SetRefinement__Group_8__3__Impl ;
    public final void rule__SetRefinement__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2089:1: ( rule__SetRefinement__Group_8__3__Impl )
            // InternalHLCLSpecificationLanguage.g:2090:2: rule__SetRefinement__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__3"


    // $ANTLR start "rule__SetRefinement__Group_8__3__Impl"
    // InternalHLCLSpecificationLanguage.g:2096:1: rule__SetRefinement__Group_8__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2100:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:2101:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:2101:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:2102:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalHLCLSpecificationLanguage.g:2112:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2116:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2117:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:2124:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2128:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2129:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2129:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2130:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2131:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:2131:3: rule__Rule__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalHLCLSpecificationLanguage.g:2139:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2143:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2144:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:2151:1: rule__Rule__Group__1__Impl : ( '-->' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2155:1: ( ( '-->' ) )
            // InternalHLCLSpecificationLanguage.g:2156:1: ( '-->' )
            {
            // InternalHLCLSpecificationLanguage.g:2156:1: ( '-->' )
            // InternalHLCLSpecificationLanguage.g:2157:2: '-->'
            {
             before(grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalHLCLSpecificationLanguage.g:2166:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2170:1: ( rule__Rule__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2171:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:2177:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConsequenceAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2181:1: ( ( ( rule__Rule__ConsequenceAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2182:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2182:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2183:2: ( rule__Rule__ConsequenceAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2184:2: ( rule__Rule__ConsequenceAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:2184:3: rule__Rule__ConsequenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConsequenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__FodaUN__Group__0"
    // InternalHLCLSpecificationLanguage.g:2193:1: rule__FodaUN__Group__0 : rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 ;
    public final void rule__FodaUN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2197:1: ( rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2198:2: rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FodaUN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaUN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Group__0"


    // $ANTLR start "rule__FodaUN__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:2205:1: rule__FodaUN__Group__0__Impl : ( ( rule__FodaUN__VarAssignment_0 ) ) ;
    public final void rule__FodaUN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2209:1: ( ( ( rule__FodaUN__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2210:1: ( ( rule__FodaUN__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2210:1: ( ( rule__FodaUN__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2211:2: ( rule__FodaUN__VarAssignment_0 )
            {
             before(grammarAccess.getFodaUNAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2212:2: ( rule__FodaUN__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:2212:3: rule__FodaUN__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FodaUN__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFodaUNAccess().getVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Group__0__Impl"


    // $ANTLR start "rule__FodaUN__Group__1"
    // InternalHLCLSpecificationLanguage.g:2220:1: rule__FodaUN__Group__1 : rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 ;
    public final void rule__FodaUN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2224:1: ( rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2225:2: rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__FodaUN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaUN__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Group__1"


    // $ANTLR start "rule__FodaUN__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:2232:1: rule__FodaUN__Group__1__Impl : ( 'is' ) ;
    public final void rule__FodaUN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2236:1: ( ( 'is' ) )
            // InternalHLCLSpecificationLanguage.g:2237:1: ( 'is' )
            {
            // InternalHLCLSpecificationLanguage.g:2237:1: ( 'is' )
            // InternalHLCLSpecificationLanguage.g:2238:2: 'is'
            {
             before(grammarAccess.getFodaUNAccess().getIsKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFodaUNAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Group__1__Impl"


    // $ANTLR start "rule__FodaUN__Group__2"
    // InternalHLCLSpecificationLanguage.g:2247:1: rule__FodaUN__Group__2 : rule__FodaUN__Group__2__Impl ;
    public final void rule__FodaUN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2251:1: ( rule__FodaUN__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2252:2: rule__FodaUN__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FodaUN__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Group__2"


    // $ANTLR start "rule__FodaUN__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:2258:1: rule__FodaUN__Group__2__Impl : ( ( rule__FodaUN__OpAssignment_2 ) ) ;
    public final void rule__FodaUN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2262:1: ( ( ( rule__FodaUN__OpAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2263:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2263:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2264:2: ( rule__FodaUN__OpAssignment_2 )
            {
             before(grammarAccess.getFodaUNAccess().getOpAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2265:2: ( rule__FodaUN__OpAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:2265:3: rule__FodaUN__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FodaUN__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFodaUNAccess().getOpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Group__2__Impl"


    // $ANTLR start "rule__FodaBin__Group__0"
    // InternalHLCLSpecificationLanguage.g:2274:1: rule__FodaBin__Group__0 : rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 ;
    public final void rule__FodaBin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2278:1: ( rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2279:2: rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__FodaBin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaBin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Group__0"


    // $ANTLR start "rule__FodaBin__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:2286:1: rule__FodaBin__Group__0__Impl : ( ( rule__FodaBin__Var1Assignment_0 ) ) ;
    public final void rule__FodaBin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2290:1: ( ( ( rule__FodaBin__Var1Assignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2291:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2291:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2292:2: ( rule__FodaBin__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaBinAccess().getVar1Assignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2293:2: ( rule__FodaBin__Var1Assignment_0 )
            // InternalHLCLSpecificationLanguage.g:2293:3: rule__FodaBin__Var1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__Var1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFodaBinAccess().getVar1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Group__0__Impl"


    // $ANTLR start "rule__FodaBin__Group__1"
    // InternalHLCLSpecificationLanguage.g:2301:1: rule__FodaBin__Group__1 : rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 ;
    public final void rule__FodaBin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2305:1: ( rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2306:2: rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FodaBin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaBin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Group__1"


    // $ANTLR start "rule__FodaBin__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:2313:1: rule__FodaBin__Group__1__Impl : ( ( rule__FodaBin__OpAssignment_1 ) ) ;
    public final void rule__FodaBin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2317:1: ( ( ( rule__FodaBin__OpAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:2318:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2318:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:2319:2: ( rule__FodaBin__OpAssignment_1 )
            {
             before(grammarAccess.getFodaBinAccess().getOpAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:2320:2: ( rule__FodaBin__OpAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:2320:3: rule__FodaBin__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFodaBinAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Group__1__Impl"


    // $ANTLR start "rule__FodaBin__Group__2"
    // InternalHLCLSpecificationLanguage.g:2328:1: rule__FodaBin__Group__2 : rule__FodaBin__Group__2__Impl ;
    public final void rule__FodaBin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2332:1: ( rule__FodaBin__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2333:2: rule__FodaBin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Group__2"


    // $ANTLR start "rule__FodaBin__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:2339:1: rule__FodaBin__Group__2__Impl : ( ( rule__FodaBin__Var2Assignment_2 ) ) ;
    public final void rule__FodaBin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2343:1: ( ( ( rule__FodaBin__Var2Assignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2344:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2344:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2345:2: ( rule__FodaBin__Var2Assignment_2 )
            {
             before(grammarAccess.getFodaBinAccess().getVar2Assignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2346:2: ( rule__FodaBin__Var2Assignment_2 )
            // InternalHLCLSpecificationLanguage.g:2346:3: rule__FodaBin__Var2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__Var2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFodaBinAccess().getVar2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Group__2__Impl"


    // $ANTLR start "rule__FodaNary__Group__0"
    // InternalHLCLSpecificationLanguage.g:2355:1: rule__FodaNary__Group__0 : rule__FodaNary__Group__0__Impl rule__FodaNary__Group__1 ;
    public final void rule__FodaNary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2359:1: ( rule__FodaNary__Group__0__Impl rule__FodaNary__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2360:2: rule__FodaNary__Group__0__Impl rule__FodaNary__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FodaNary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__0"


    // $ANTLR start "rule__FodaNary__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:2367:1: rule__FodaNary__Group__0__Impl : ( 'parent:' ) ;
    public final void rule__FodaNary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2371:1: ( ( 'parent:' ) )
            // InternalHLCLSpecificationLanguage.g:2372:1: ( 'parent:' )
            {
            // InternalHLCLSpecificationLanguage.g:2372:1: ( 'parent:' )
            // InternalHLCLSpecificationLanguage.g:2373:2: 'parent:'
            {
             before(grammarAccess.getFodaNaryAccess().getParentKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getParentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__0__Impl"


    // $ANTLR start "rule__FodaNary__Group__1"
    // InternalHLCLSpecificationLanguage.g:2382:1: rule__FodaNary__Group__1 : rule__FodaNary__Group__1__Impl rule__FodaNary__Group__2 ;
    public final void rule__FodaNary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2386:1: ( rule__FodaNary__Group__1__Impl rule__FodaNary__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2387:2: rule__FodaNary__Group__1__Impl rule__FodaNary__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__FodaNary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__1"


    // $ANTLR start "rule__FodaNary__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:2394:1: rule__FodaNary__Group__1__Impl : ( ( rule__FodaNary__ParentAssignment_1 ) ) ;
    public final void rule__FodaNary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2398:1: ( ( ( rule__FodaNary__ParentAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:2399:1: ( ( rule__FodaNary__ParentAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2399:1: ( ( rule__FodaNary__ParentAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:2400:2: ( rule__FodaNary__ParentAssignment_1 )
            {
             before(grammarAccess.getFodaNaryAccess().getParentAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:2401:2: ( rule__FodaNary__ParentAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:2401:3: rule__FodaNary__ParentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__ParentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getParentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__1__Impl"


    // $ANTLR start "rule__FodaNary__Group__2"
    // InternalHLCLSpecificationLanguage.g:2409:1: rule__FodaNary__Group__2 : rule__FodaNary__Group__2__Impl rule__FodaNary__Group__3 ;
    public final void rule__FodaNary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2413:1: ( rule__FodaNary__Group__2__Impl rule__FodaNary__Group__3 )
            // InternalHLCLSpecificationLanguage.g:2414:2: rule__FodaNary__Group__2__Impl rule__FodaNary__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__FodaNary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__2"


    // $ANTLR start "rule__FodaNary__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:2421:1: rule__FodaNary__Group__2__Impl : ( 'group:' ) ;
    public final void rule__FodaNary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2425:1: ( ( 'group:' ) )
            // InternalHLCLSpecificationLanguage.g:2426:1: ( 'group:' )
            {
            // InternalHLCLSpecificationLanguage.g:2426:1: ( 'group:' )
            // InternalHLCLSpecificationLanguage.g:2427:2: 'group:'
            {
             before(grammarAccess.getFodaNaryAccess().getGroupKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getGroupKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__2__Impl"


    // $ANTLR start "rule__FodaNary__Group__3"
    // InternalHLCLSpecificationLanguage.g:2436:1: rule__FodaNary__Group__3 : rule__FodaNary__Group__3__Impl rule__FodaNary__Group__4 ;
    public final void rule__FodaNary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2440:1: ( rule__FodaNary__Group__3__Impl rule__FodaNary__Group__4 )
            // InternalHLCLSpecificationLanguage.g:2441:2: rule__FodaNary__Group__3__Impl rule__FodaNary__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__FodaNary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__3"


    // $ANTLR start "rule__FodaNary__Group__3__Impl"
    // InternalHLCLSpecificationLanguage.g:2448:1: rule__FodaNary__Group__3__Impl : ( ( rule__FodaNary__GroupAssignment_3 ) ) ;
    public final void rule__FodaNary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2452:1: ( ( ( rule__FodaNary__GroupAssignment_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:2453:1: ( ( rule__FodaNary__GroupAssignment_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2453:1: ( ( rule__FodaNary__GroupAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:2454:2: ( rule__FodaNary__GroupAssignment_3 )
            {
             before(grammarAccess.getFodaNaryAccess().getGroupAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:2455:2: ( rule__FodaNary__GroupAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:2455:3: rule__FodaNary__GroupAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__GroupAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getGroupAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__3__Impl"


    // $ANTLR start "rule__FodaNary__Group__4"
    // InternalHLCLSpecificationLanguage.g:2463:1: rule__FodaNary__Group__4 : rule__FodaNary__Group__4__Impl rule__FodaNary__Group__5 ;
    public final void rule__FodaNary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2467:1: ( rule__FodaNary__Group__4__Impl rule__FodaNary__Group__5 )
            // InternalHLCLSpecificationLanguage.g:2468:2: rule__FodaNary__Group__4__Impl rule__FodaNary__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__FodaNary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__4"


    // $ANTLR start "rule__FodaNary__Group__4__Impl"
    // InternalHLCLSpecificationLanguage.g:2475:1: rule__FodaNary__Group__4__Impl : ( 'card:' ) ;
    public final void rule__FodaNary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2479:1: ( ( 'card:' ) )
            // InternalHLCLSpecificationLanguage.g:2480:1: ( 'card:' )
            {
            // InternalHLCLSpecificationLanguage.g:2480:1: ( 'card:' )
            // InternalHLCLSpecificationLanguage.g:2481:2: 'card:'
            {
             before(grammarAccess.getFodaNaryAccess().getCardKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getCardKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__4__Impl"


    // $ANTLR start "rule__FodaNary__Group__5"
    // InternalHLCLSpecificationLanguage.g:2490:1: rule__FodaNary__Group__5 : rule__FodaNary__Group__5__Impl rule__FodaNary__Group__6 ;
    public final void rule__FodaNary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2494:1: ( rule__FodaNary__Group__5__Impl rule__FodaNary__Group__6 )
            // InternalHLCLSpecificationLanguage.g:2495:2: rule__FodaNary__Group__5__Impl rule__FodaNary__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__FodaNary__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__5"


    // $ANTLR start "rule__FodaNary__Group__5__Impl"
    // InternalHLCLSpecificationLanguage.g:2502:1: rule__FodaNary__Group__5__Impl : ( '[' ) ;
    public final void rule__FodaNary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2506:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:2507:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:2507:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:2508:2: '['
            {
             before(grammarAccess.getFodaNaryAccess().getLeftSquareBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__5__Impl"


    // $ANTLR start "rule__FodaNary__Group__6"
    // InternalHLCLSpecificationLanguage.g:2517:1: rule__FodaNary__Group__6 : rule__FodaNary__Group__6__Impl rule__FodaNary__Group__7 ;
    public final void rule__FodaNary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2521:1: ( rule__FodaNary__Group__6__Impl rule__FodaNary__Group__7 )
            // InternalHLCLSpecificationLanguage.g:2522:2: rule__FodaNary__Group__6__Impl rule__FodaNary__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__FodaNary__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__6"


    // $ANTLR start "rule__FodaNary__Group__6__Impl"
    // InternalHLCLSpecificationLanguage.g:2529:1: rule__FodaNary__Group__6__Impl : ( ( rule__FodaNary__MinAssignment_6 ) ) ;
    public final void rule__FodaNary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2533:1: ( ( ( rule__FodaNary__MinAssignment_6 ) ) )
            // InternalHLCLSpecificationLanguage.g:2534:1: ( ( rule__FodaNary__MinAssignment_6 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2534:1: ( ( rule__FodaNary__MinAssignment_6 ) )
            // InternalHLCLSpecificationLanguage.g:2535:2: ( rule__FodaNary__MinAssignment_6 )
            {
             before(grammarAccess.getFodaNaryAccess().getMinAssignment_6()); 
            // InternalHLCLSpecificationLanguage.g:2536:2: ( rule__FodaNary__MinAssignment_6 )
            // InternalHLCLSpecificationLanguage.g:2536:3: rule__FodaNary__MinAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__MinAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getMinAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__6__Impl"


    // $ANTLR start "rule__FodaNary__Group__7"
    // InternalHLCLSpecificationLanguage.g:2544:1: rule__FodaNary__Group__7 : rule__FodaNary__Group__7__Impl rule__FodaNary__Group__8 ;
    public final void rule__FodaNary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2548:1: ( rule__FodaNary__Group__7__Impl rule__FodaNary__Group__8 )
            // InternalHLCLSpecificationLanguage.g:2549:2: rule__FodaNary__Group__7__Impl rule__FodaNary__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__FodaNary__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__7"


    // $ANTLR start "rule__FodaNary__Group__7__Impl"
    // InternalHLCLSpecificationLanguage.g:2556:1: rule__FodaNary__Group__7__Impl : ( ',' ) ;
    public final void rule__FodaNary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2560:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:2561:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:2561:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:2562:2: ','
            {
             before(grammarAccess.getFodaNaryAccess().getCommaKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__7__Impl"


    // $ANTLR start "rule__FodaNary__Group__8"
    // InternalHLCLSpecificationLanguage.g:2571:1: rule__FodaNary__Group__8 : rule__FodaNary__Group__8__Impl rule__FodaNary__Group__9 ;
    public final void rule__FodaNary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2575:1: ( rule__FodaNary__Group__8__Impl rule__FodaNary__Group__9 )
            // InternalHLCLSpecificationLanguage.g:2576:2: rule__FodaNary__Group__8__Impl rule__FodaNary__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__FodaNary__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__8"


    // $ANTLR start "rule__FodaNary__Group__8__Impl"
    // InternalHLCLSpecificationLanguage.g:2583:1: rule__FodaNary__Group__8__Impl : ( ( rule__FodaNary__MaxAssignment_8 ) ) ;
    public final void rule__FodaNary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2587:1: ( ( ( rule__FodaNary__MaxAssignment_8 ) ) )
            // InternalHLCLSpecificationLanguage.g:2588:1: ( ( rule__FodaNary__MaxAssignment_8 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2588:1: ( ( rule__FodaNary__MaxAssignment_8 ) )
            // InternalHLCLSpecificationLanguage.g:2589:2: ( rule__FodaNary__MaxAssignment_8 )
            {
             before(grammarAccess.getFodaNaryAccess().getMaxAssignment_8()); 
            // InternalHLCLSpecificationLanguage.g:2590:2: ( rule__FodaNary__MaxAssignment_8 )
            // InternalHLCLSpecificationLanguage.g:2590:3: rule__FodaNary__MaxAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__MaxAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getMaxAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__8__Impl"


    // $ANTLR start "rule__FodaNary__Group__9"
    // InternalHLCLSpecificationLanguage.g:2598:1: rule__FodaNary__Group__9 : rule__FodaNary__Group__9__Impl ;
    public final void rule__FodaNary__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2602:1: ( rule__FodaNary__Group__9__Impl )
            // InternalHLCLSpecificationLanguage.g:2603:2: rule__FodaNary__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__9"


    // $ANTLR start "rule__FodaNary__Group__9__Impl"
    // InternalHLCLSpecificationLanguage.g:2609:1: rule__FodaNary__Group__9__Impl : ( ']' ) ;
    public final void rule__FodaNary__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2613:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:2614:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:2614:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:2615:2: ']'
            {
             before(grammarAccess.getFodaNaryAccess().getRightSquareBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__9__Impl"


    // $ANTLR start "rule__VarDeclaration__UnorderedGroup"
    // InternalHLCLSpecificationLanguage.g:2625:1: rule__VarDeclaration__UnorderedGroup : rule__VarDeclaration__UnorderedGroup__0 {...}?;
    public final void rule__VarDeclaration__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2630:1: ( rule__VarDeclaration__UnorderedGroup__0 {...}?)
            // InternalHLCLSpecificationLanguage.g:2631:2: rule__VarDeclaration__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__UnorderedGroup"


    // $ANTLR start "rule__VarDeclaration__UnorderedGroup__Impl"
    // InternalHLCLSpecificationLanguage.g:2639:1: rule__VarDeclaration__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) ) ;
    public final void rule__VarDeclaration__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2644:1: ( ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) ) )
            // InternalHLCLSpecificationLanguage.g:2645:3: ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:2645:3: ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 >= 13 && LA15_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:2646:3: ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2646:3: ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2647:4: {...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2647:108: ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2648:5: ( ( rule__VarDeclaration__InstantiableAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2654:5: ( ( rule__VarDeclaration__InstantiableAssignment_0 ) )
                    // InternalHLCLSpecificationLanguage.g:2655:6: ( rule__VarDeclaration__InstantiableAssignment_0 )
                    {
                     before(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0()); 
                    // InternalHLCLSpecificationLanguage.g:2656:6: ( rule__VarDeclaration__InstantiableAssignment_0 )
                    // InternalHLCLSpecificationLanguage.g:2656:7: rule__VarDeclaration__InstantiableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__InstantiableAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:2661:3: ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2661:3: ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2662:4: {...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2662:108: ( ( ( rule__VarDeclaration__Group_1__0 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2663:5: ( ( rule__VarDeclaration__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2669:5: ( ( rule__VarDeclaration__Group_1__0 ) )
                    // InternalHLCLSpecificationLanguage.g:2670:6: ( rule__VarDeclaration__Group_1__0 )
                    {
                     before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
                    // InternalHLCLSpecificationLanguage.g:2671:6: ( rule__VarDeclaration__Group_1__0 )
                    // InternalHLCLSpecificationLanguage.g:2671:7: rule__VarDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDeclarationAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__UnorderedGroup__Impl"


    // $ANTLR start "rule__VarDeclaration__UnorderedGroup__0"
    // InternalHLCLSpecificationLanguage.g:2684:1: rule__VarDeclaration__UnorderedGroup__0 : rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )? ;
    public final void rule__VarDeclaration__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2688:1: ( rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )? )
            // InternalHLCLSpecificationLanguage.g:2689:2: rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_9);
            rule__VarDeclaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalHLCLSpecificationLanguage.g:2690:2: ( rule__VarDeclaration__UnorderedGroup__1 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:2690:2: rule__VarDeclaration__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__UnorderedGroup__0"


    // $ANTLR start "rule__VarDeclaration__UnorderedGroup__1"
    // InternalHLCLSpecificationLanguage.g:2696:1: rule__VarDeclaration__UnorderedGroup__1 : rule__VarDeclaration__UnorderedGroup__Impl ;
    public final void rule__VarDeclaration__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2700:1: ( rule__VarDeclaration__UnorderedGroup__Impl )
            // InternalHLCLSpecificationLanguage.g:2701:2: rule__VarDeclaration__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__UnorderedGroup__1"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2708:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2712:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2713:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2713:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2714:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__VarsAssignment_3"
    // InternalHLCLSpecificationLanguage.g:2723:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2727:1: ( ( ruleVarDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2728:2: ( ruleVarDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2728:2: ( ruleVarDeclaration )
            // InternalHLCLSpecificationLanguage.g:2729:3: ruleVarDeclaration
            {
             before(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VarsAssignment_3"


    // $ANTLR start "rule__Model__ConstraintsAssignment_5"
    // InternalHLCLSpecificationLanguage.g:2738:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2742:1: ( ( ruleConstraint ) )
            // InternalHLCLSpecificationLanguage.g:2743:2: ( ruleConstraint )
            {
            // InternalHLCLSpecificationLanguage.g:2743:2: ( ruleConstraint )
            // InternalHLCLSpecificationLanguage.g:2744:3: ruleConstraint
            {
             before(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConstraintsAssignment_5"


    // $ANTLR start "rule__VarDeclaration__InstantiableAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2753:1: rule__VarDeclaration__InstantiableAssignment_0 : ( ( 'instantiable' ) ) ;
    public final void rule__VarDeclaration__InstantiableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2757:1: ( ( ( 'instantiable' ) ) )
            // InternalHLCLSpecificationLanguage.g:2758:2: ( ( 'instantiable' ) )
            {
            // InternalHLCLSpecificationLanguage.g:2758:2: ( ( 'instantiable' ) )
            // InternalHLCLSpecificationLanguage.g:2759:3: ( 'instantiable' )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 
            // InternalHLCLSpecificationLanguage.g:2760:3: ( 'instantiable' )
            // InternalHLCLSpecificationLanguage.g:2761:4: 'instantiable'
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 

            }

             after(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__InstantiableAssignment_0"


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_1_0"
    // InternalHLCLSpecificationLanguage.g:2772:1: rule__VarDeclaration__TypeAssignment_1_0 : ( ruleVarType ) ;
    public final void rule__VarDeclaration__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2776:1: ( ( ruleVarType ) )
            // InternalHLCLSpecificationLanguage.g:2777:2: ( ruleVarType )
            {
            // InternalHLCLSpecificationLanguage.g:2777:2: ( ruleVarType )
            // InternalHLCLSpecificationLanguage.g:2778:3: ruleVarType
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__TypeAssignment_1_0"


    // $ANTLR start "rule__VarDeclaration__NameAssignment_1_1"
    // InternalHLCLSpecificationLanguage.g:2787:1: rule__VarDeclaration__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2791:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2792:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2792:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2793:3: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__NameAssignment_1_1"


    // $ANTLR start "rule__VarDeclaration__VariantsAssignment_1_3"
    // InternalHLCLSpecificationLanguage.g:2802:1: rule__VarDeclaration__VariantsAssignment_1_3 : ( ruleVariantDeclaration ) ;
    public final void rule__VarDeclaration__VariantsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2806:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2807:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2807:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2808:3: ruleVariantDeclaration
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__VariantsAssignment_1_3"


    // $ANTLR start "rule__VariantsInterval__StartAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2817:1: rule__VariantsInterval__StartAssignment_1 : ( ruleValue ) ;
    public final void rule__VariantsInterval__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2821:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2822:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2822:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2823:3: ruleValue
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getVariantsIntervalAccess().getStartValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__StartAssignment_1"


    // $ANTLR start "rule__VariantsInterval__EndAssignment_3"
    // InternalHLCLSpecificationLanguage.g:2832:1: rule__VariantsInterval__EndAssignment_3 : ( ruleValue ) ;
    public final void rule__VariantsInterval__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2836:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2837:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2837:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2838:3: ruleValue
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getVariantsIntervalAccess().getEndValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__EndAssignment_3"


    // $ANTLR start "rule__VariantsEnumeration__ListAssignment_2"
    // InternalHLCLSpecificationLanguage.g:2847:1: rule__VariantsEnumeration__ListAssignment_2 : ( ruleEnumeration ) ;
    public final void rule__VariantsEnumeration__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2851:1: ( ( ruleEnumeration ) )
            // InternalHLCLSpecificationLanguage.g:2852:2: ( ruleEnumeration )
            {
            // InternalHLCLSpecificationLanguage.g:2852:2: ( ruleEnumeration )
            // InternalHLCLSpecificationLanguage.g:2853:3: ruleEnumeration
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListEnumerationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getVariantsEnumerationAccess().getListEnumerationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__ListAssignment_2"


    // $ANTLR start "rule__Enumeration__ValuesAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2862:1: rule__Enumeration__ValuesAssignment_0 : ( ruleListOfValues ) ;
    public final void rule__Enumeration__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2866:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2867:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2867:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2868:3: ruleListOfValues
            {
             before(grammarAccess.getEnumerationAccess().getValuesListOfValuesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValuesListOfValuesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValuesAssignment_0"


    // $ANTLR start "rule__Constraint__NameAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2877:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2881:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2882:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2882:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2883:3: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_0"


    // $ANTLR start "rule__Constraint__ExpAssignment_2"
    // InternalHLCLSpecificationLanguage.g:2892:1: rule__Constraint__ExpAssignment_2 : ( ruleConsExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2896:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:2897:2: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:2897:2: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:2898:3: ruleConsExpression
            {
             before(grammarAccess.getConstraintAccess().getExpConsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConsExpression();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getExpConsExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ExpAssignment_2"


    // $ANTLR start "rule__IDCons__NameAssignment"
    // InternalHLCLSpecificationLanguage.g:2907:1: rule__IDCons__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDCons__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2911:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2912:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2912:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2913:3: RULE_ID
            {
             before(grammarAccess.getIDConsAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIDConsAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDCons__NameAssignment"


    // $ANTLR start "rule__Assignment__VarAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2922:1: rule__Assignment__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2926:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2927:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2927:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2928:3: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VarAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalHLCLSpecificationLanguage.g:2937:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2941:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2942:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2942:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2943:3: ruleValue
            {
             before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__VarRefinement__VarAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2952:1: rule__VarRefinement__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2956:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2957:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2957:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2958:3: RULE_ID
            {
             before(grammarAccess.getVarRefinementAccess().getVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarRefinementAccess().getVarIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__VarAssignment_0"


    // $ANTLR start "rule__VarRefinement__VariantsAssignment_2"
    // InternalHLCLSpecificationLanguage.g:2967:1: rule__VarRefinement__VariantsAssignment_2 : ( ruleVariantDeclaration ) ;
    public final void rule__VarRefinement__VariantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2971:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2972:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2972:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2973:3: ruleVariantDeclaration
            {
             before(grammarAccess.getVarRefinementAccess().getVariantsVariantDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVarRefinementAccess().getVariantsVariantDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__VariantsAssignment_2"


    // $ANTLR start "rule__SetRefinement__VarsAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2982:1: rule__SetRefinement__VarsAssignment_1 : ( ruleListOfIDs ) ;
    public final void rule__SetRefinement__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2986:1: ( ( ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:2987:2: ( ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:2987:2: ( ruleListOfIDs )
            // InternalHLCLSpecificationLanguage.g:2988:3: ruleListOfIDs
            {
             before(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__VarsAssignment_1"


    // $ANTLR start "rule__SetRefinement__HeadAssignment_6"
    // InternalHLCLSpecificationLanguage.g:2997:1: rule__SetRefinement__HeadAssignment_6 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__HeadAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3001:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:3002:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:3002:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:3003:3: ruleListOfValues
            {
             before(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__HeadAssignment_6"


    // $ANTLR start "rule__SetRefinement__TailAssignment_8_2"
    // InternalHLCLSpecificationLanguage.g:3012:1: rule__SetRefinement__TailAssignment_8_2 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__TailAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3016:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:3017:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:3017:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:3018:3: ruleListOfValues
            {
             before(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__TailAssignment_8_2"


    // $ANTLR start "rule__Rule__ConditionAssignment_0"
    // InternalHLCLSpecificationLanguage.g:3027:1: rule__Rule__ConditionAssignment_0 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3031:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:3032:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:3032:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:3033:3: ruleTerminalExp
            {
             before(grammarAccess.getRuleAccess().getConditionTerminalExpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExp();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionTerminalExpParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_0"


    // $ANTLR start "rule__Rule__ConsequenceAssignment_2"
    // InternalHLCLSpecificationLanguage.g:3042:1: rule__Rule__ConsequenceAssignment_2 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConsequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3046:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:3047:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:3047:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:3048:3: ruleTerminalExp
            {
             before(grammarAccess.getRuleAccess().getConsequenceTerminalExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExp();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConsequenceTerminalExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConsequenceAssignment_2"


    // $ANTLR start "rule__FodaUN__VarAssignment_0"
    // InternalHLCLSpecificationLanguage.g:3057:1: rule__FodaUN__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__FodaUN__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3061:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3062:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3062:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3063:3: RULE_ID
            {
             before(grammarAccess.getFodaUNAccess().getVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaUNAccess().getVarIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__VarAssignment_0"


    // $ANTLR start "rule__FodaUN__OpAssignment_2"
    // InternalHLCLSpecificationLanguage.g:3072:1: rule__FodaUN__OpAssignment_2 : ( ruleUnaryOp ) ;
    public final void rule__FodaUN__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3076:1: ( ( ruleUnaryOp ) )
            // InternalHLCLSpecificationLanguage.g:3077:2: ( ruleUnaryOp )
            {
            // InternalHLCLSpecificationLanguage.g:3077:2: ( ruleUnaryOp )
            // InternalHLCLSpecificationLanguage.g:3078:3: ruleUnaryOp
            {
             before(grammarAccess.getFodaUNAccess().getOpUnaryOpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOp();

            state._fsp--;

             after(grammarAccess.getFodaUNAccess().getOpUnaryOpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__OpAssignment_2"


    // $ANTLR start "rule__FodaBin__Var1Assignment_0"
    // InternalHLCLSpecificationLanguage.g:3087:1: rule__FodaBin__Var1Assignment_0 : ( RULE_ID ) ;
    public final void rule__FodaBin__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3091:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3092:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3092:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3093:3: RULE_ID
            {
             before(grammarAccess.getFodaBinAccess().getVar1IDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaBinAccess().getVar1IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Var1Assignment_0"


    // $ANTLR start "rule__FodaBin__OpAssignment_1"
    // InternalHLCLSpecificationLanguage.g:3102:1: rule__FodaBin__OpAssignment_1 : ( ruleBinOp ) ;
    public final void rule__FodaBin__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3106:1: ( ( ruleBinOp ) )
            // InternalHLCLSpecificationLanguage.g:3107:2: ( ruleBinOp )
            {
            // InternalHLCLSpecificationLanguage.g:3107:2: ( ruleBinOp )
            // InternalHLCLSpecificationLanguage.g:3108:3: ruleBinOp
            {
             before(grammarAccess.getFodaBinAccess().getOpBinOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinOp();

            state._fsp--;

             after(grammarAccess.getFodaBinAccess().getOpBinOpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__OpAssignment_1"


    // $ANTLR start "rule__FodaBin__Var2Assignment_2"
    // InternalHLCLSpecificationLanguage.g:3117:1: rule__FodaBin__Var2Assignment_2 : ( RULE_ID ) ;
    public final void rule__FodaBin__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3121:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3122:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3122:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3123:3: RULE_ID
            {
             before(grammarAccess.getFodaBinAccess().getVar2IDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaBinAccess().getVar2IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Var2Assignment_2"


    // $ANTLR start "rule__FodaNary__ParentAssignment_1"
    // InternalHLCLSpecificationLanguage.g:3132:1: rule__FodaNary__ParentAssignment_1 : ( RULE_ID ) ;
    public final void rule__FodaNary__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3136:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3137:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3137:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3138:3: RULE_ID
            {
             before(grammarAccess.getFodaNaryAccess().getParentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getParentIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__ParentAssignment_1"


    // $ANTLR start "rule__FodaNary__GroupAssignment_3"
    // InternalHLCLSpecificationLanguage.g:3147:1: rule__FodaNary__GroupAssignment_3 : ( ruleListOfIDs ) ;
    public final void rule__FodaNary__GroupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3151:1: ( ( ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:3152:2: ( ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:3152:2: ( ruleListOfIDs )
            // InternalHLCLSpecificationLanguage.g:3153:3: ruleListOfIDs
            {
             before(grammarAccess.getFodaNaryAccess().getGroupListOfIDsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getFodaNaryAccess().getGroupListOfIDsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__GroupAssignment_3"


    // $ANTLR start "rule__FodaNary__MinAssignment_6"
    // InternalHLCLSpecificationLanguage.g:3162:1: rule__FodaNary__MinAssignment_6 : ( RULE_INT ) ;
    public final void rule__FodaNary__MinAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3166:1: ( ( RULE_INT ) )
            // InternalHLCLSpecificationLanguage.g:3167:2: ( RULE_INT )
            {
            // InternalHLCLSpecificationLanguage.g:3167:2: ( RULE_INT )
            // InternalHLCLSpecificationLanguage.g:3168:3: RULE_INT
            {
             before(grammarAccess.getFodaNaryAccess().getMinINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getMinINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__MinAssignment_6"


    // $ANTLR start "rule__FodaNary__MaxAssignment_8"
    // InternalHLCLSpecificationLanguage.g:3177:1: rule__FodaNary__MaxAssignment_8 : ( RULE_INT ) ;
    public final void rule__FodaNary__MaxAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3181:1: ( ( RULE_INT ) )
            // InternalHLCLSpecificationLanguage.g:3182:2: ( RULE_INT )
            {
            // InternalHLCLSpecificationLanguage.g:3182:2: ( RULE_INT )
            // InternalHLCLSpecificationLanguage.g:3183:3: RULE_INT
            {
             before(grammarAccess.getFodaNaryAccess().getMaxINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getMaxINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__MaxAssignment_8"


    // $ANTLR start "rule__ListOfValues__ValuesAssignment"
    // InternalHLCLSpecificationLanguage.g:3192:1: rule__ListOfValues__ValuesAssignment : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3196:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:3197:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:3197:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:3198:3: ruleValue
            {
             before(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__ValuesAssignment"


    // $ANTLR start "rule__ListOfIDs__IdsAssignment"
    // InternalHLCLSpecificationLanguage.g:3207:1: rule__ListOfIDs__IdsAssignment : ( RULE_ID ) ;
    public final void rule__ListOfIDs__IdsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3211:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3212:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3212:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3213:3: RULE_ID
            {
             before(grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfIDs__IdsAssignment"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\6\12\uffff";
    static final String dfa_3s = "\3\5\2\uffff\1\4\3\uffff\1\5\1\uffff\1\37";
    static final String dfa_4s = "\1\42\1\41\1\42\2\uffff\1\22\3\uffff\1\41\1\uffff\1\41";
    static final String dfa_5s = "\3\uffff\1\5\1\4\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\25\uffff\1\2\6\uffff\1\3",
            "\1\6\11\uffff\4\4\11\uffff\1\6\1\5\1\7\2\uffff\1\10",
            "\1\11\25\uffff\1\10\6\uffff\1\10",
            "",
            "",
            "\1\7\6\uffff\2\7\4\uffff\2\12",
            "",
            "",
            "",
            "\1\7\11\uffff\4\10\11\uffff\1\13\2\10\2\uffff\1\10",
            "",
            "\1\7\1\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "708:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleFodaNary ) | ( ruleFodaUN ) );";
        }
    }
    static final String dfa_8s = "\31\uffff";
    static final String dfa_9s = "\1\4\30\uffff";
    static final String dfa_10s = "\1\15\1\0\2\5\2\uffff\1\26\1\4\3\27\5\4\1\5\3\0\3\4\1\0\1\5";
    static final String dfa_11s = "\1\45\1\0\2\5\2\uffff\1\26\1\30\3\27\2\14\4\31\3\0\3\31\1\0\1\31";
    static final String dfa_12s = "\4\uffff\1\2\1\1\23\uffff";
    static final String dfa_13s = "\1\uffff\1\3\17\uffff\1\1\1\2\1\0\3\uffff\1\4\1\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\3\6\uffff\1\4\17\uffff\1\1",
            "\1\uffff",
            "\1\6",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\10\6\uffff\1\11\1\12\13\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\15\1\20\5\uffff\1\16\1\17",
            "\1\21\6\uffff\1\22\1\23",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\30\23\uffff\1\27",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\uffff",
            "\1\30\23\uffff\1\27"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2690:2: ( rule__VarDeclaration__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_19 = input.LA(1);

                         
                        int index16_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_17 = input.LA(1);

                         
                        int index16_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_18 = input.LA(1);

                         
                        int index16_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_23 = input.LA(1);

                         
                        int index16_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_23);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000006002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001001810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000408000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L});

}