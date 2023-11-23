package gameoflife.ide.contentassist.antlr.internal;

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
import gameoflife.services.GameoflifeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameoflifeDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'='", "'>'", "'and'", "'or'", "'GameStart'", "'{'", "'}'", "'Draw'", "'Many'", "'('", "'to'", "')'", "':'", "'Cell'", "','", "'StayAliveRule'", "'DieRule'", "'BirthRule'", "'surrounding'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
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


        public InternalGameoflifeDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameoflifeDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameoflifeDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGameoflifeDSL.g"; }


    	private GameoflifeDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(GameoflifeDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGameStart"
    // InternalGameoflifeDSL.g:53:1: entryRuleGameStart : ruleGameStart EOF ;
    public final void entryRuleGameStart() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:54:1: ( ruleGameStart EOF )
            // InternalGameoflifeDSL.g:55:1: ruleGameStart EOF
            {
             before(grammarAccess.getGameStartRule()); 
            pushFollow(FOLLOW_1);
            ruleGameStart();

            state._fsp--;

             after(grammarAccess.getGameStartRule()); 
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
    // $ANTLR end "entryRuleGameStart"


    // $ANTLR start "ruleGameStart"
    // InternalGameoflifeDSL.g:62:1: ruleGameStart : ( ( rule__GameStart__Group__0 ) ) ;
    public final void ruleGameStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:66:2: ( ( ( rule__GameStart__Group__0 ) ) )
            // InternalGameoflifeDSL.g:67:2: ( ( rule__GameStart__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:67:2: ( ( rule__GameStart__Group__0 ) )
            // InternalGameoflifeDSL.g:68:3: ( rule__GameStart__Group__0 )
            {
             before(grammarAccess.getGameStartAccess().getGroup()); 
            // InternalGameoflifeDSL.g:69:3: ( rule__GameStart__Group__0 )
            // InternalGameoflifeDSL.g:69:4: rule__GameStart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameStart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameStartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameStart"


    // $ANTLR start "entryRuleInitialGrid"
    // InternalGameoflifeDSL.g:78:1: entryRuleInitialGrid : ruleInitialGrid EOF ;
    public final void entryRuleInitialGrid() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:79:1: ( ruleInitialGrid EOF )
            // InternalGameoflifeDSL.g:80:1: ruleInitialGrid EOF
            {
             before(grammarAccess.getInitialGridRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialGrid();

            state._fsp--;

             after(grammarAccess.getInitialGridRule()); 
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
    // $ANTLR end "entryRuleInitialGrid"


    // $ANTLR start "ruleInitialGrid"
    // InternalGameoflifeDSL.g:87:1: ruleInitialGrid : ( ( rule__InitialGrid__Group__0 ) ) ;
    public final void ruleInitialGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:91:2: ( ( ( rule__InitialGrid__Group__0 ) ) )
            // InternalGameoflifeDSL.g:92:2: ( ( rule__InitialGrid__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:92:2: ( ( rule__InitialGrid__Group__0 ) )
            // InternalGameoflifeDSL.g:93:3: ( rule__InitialGrid__Group__0 )
            {
             before(grammarAccess.getInitialGridAccess().getGroup()); 
            // InternalGameoflifeDSL.g:94:3: ( rule__InitialGrid__Group__0 )
            // InternalGameoflifeDSL.g:94:4: rule__InitialGrid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialGrid"


    // $ANTLR start "entryRuleLineStatus"
    // InternalGameoflifeDSL.g:103:1: entryRuleLineStatus : ruleLineStatus EOF ;
    public final void entryRuleLineStatus() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:104:1: ( ruleLineStatus EOF )
            // InternalGameoflifeDSL.g:105:1: ruleLineStatus EOF
            {
             before(grammarAccess.getLineStatusRule()); 
            pushFollow(FOLLOW_1);
            ruleLineStatus();

            state._fsp--;

             after(grammarAccess.getLineStatusRule()); 
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
    // $ANTLR end "entryRuleLineStatus"


    // $ANTLR start "ruleLineStatus"
    // InternalGameoflifeDSL.g:112:1: ruleLineStatus : ( ( rule__LineStatus__CoordinatesAssignment ) ) ;
    public final void ruleLineStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:116:2: ( ( ( rule__LineStatus__CoordinatesAssignment ) ) )
            // InternalGameoflifeDSL.g:117:2: ( ( rule__LineStatus__CoordinatesAssignment ) )
            {
            // InternalGameoflifeDSL.g:117:2: ( ( rule__LineStatus__CoordinatesAssignment ) )
            // InternalGameoflifeDSL.g:118:3: ( rule__LineStatus__CoordinatesAssignment )
            {
             before(grammarAccess.getLineStatusAccess().getCoordinatesAssignment()); 
            // InternalGameoflifeDSL.g:119:3: ( rule__LineStatus__CoordinatesAssignment )
            // InternalGameoflifeDSL.g:119:4: rule__LineStatus__CoordinatesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LineStatus__CoordinatesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLineStatusAccess().getCoordinatesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineStatus"


    // $ANTLR start "entryRuleLineCoords"
    // InternalGameoflifeDSL.g:128:1: entryRuleLineCoords : ruleLineCoords EOF ;
    public final void entryRuleLineCoords() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:129:1: ( ruleLineCoords EOF )
            // InternalGameoflifeDSL.g:130:1: ruleLineCoords EOF
            {
             before(grammarAccess.getLineCoordsRule()); 
            pushFollow(FOLLOW_1);
            ruleLineCoords();

            state._fsp--;

             after(grammarAccess.getLineCoordsRule()); 
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
    // $ANTLR end "entryRuleLineCoords"


    // $ANTLR start "ruleLineCoords"
    // InternalGameoflifeDSL.g:137:1: ruleLineCoords : ( ( rule__LineCoords__Group__0 ) ) ;
    public final void ruleLineCoords() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:141:2: ( ( ( rule__LineCoords__Group__0 ) ) )
            // InternalGameoflifeDSL.g:142:2: ( ( rule__LineCoords__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:142:2: ( ( rule__LineCoords__Group__0 ) )
            // InternalGameoflifeDSL.g:143:3: ( rule__LineCoords__Group__0 )
            {
             before(grammarAccess.getLineCoordsAccess().getGroup()); 
            // InternalGameoflifeDSL.g:144:3: ( rule__LineCoords__Group__0 )
            // InternalGameoflifeDSL.g:144:4: rule__LineCoords__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineCoordsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineCoords"


    // $ANTLR start "entryRuleCellStatus"
    // InternalGameoflifeDSL.g:153:1: entryRuleCellStatus : ruleCellStatus EOF ;
    public final void entryRuleCellStatus() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:154:1: ( ruleCellStatus EOF )
            // InternalGameoflifeDSL.g:155:1: ruleCellStatus EOF
            {
             before(grammarAccess.getCellStatusRule()); 
            pushFollow(FOLLOW_1);
            ruleCellStatus();

            state._fsp--;

             after(grammarAccess.getCellStatusRule()); 
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
    // $ANTLR end "entryRuleCellStatus"


    // $ANTLR start "ruleCellStatus"
    // InternalGameoflifeDSL.g:162:1: ruleCellStatus : ( ( rule__CellStatus__Group__0 ) ) ;
    public final void ruleCellStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:166:2: ( ( ( rule__CellStatus__Group__0 ) ) )
            // InternalGameoflifeDSL.g:167:2: ( ( rule__CellStatus__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:167:2: ( ( rule__CellStatus__Group__0 ) )
            // InternalGameoflifeDSL.g:168:3: ( rule__CellStatus__Group__0 )
            {
             before(grammarAccess.getCellStatusAccess().getGroup()); 
            // InternalGameoflifeDSL.g:169:3: ( rule__CellStatus__Group__0 )
            // InternalGameoflifeDSL.g:169:4: rule__CellStatus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellStatus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellStatusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellStatus"


    // $ANTLR start "entryRuleCoordinates"
    // InternalGameoflifeDSL.g:178:1: entryRuleCoordinates : ruleCoordinates EOF ;
    public final void entryRuleCoordinates() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:179:1: ( ruleCoordinates EOF )
            // InternalGameoflifeDSL.g:180:1: ruleCoordinates EOF
            {
             before(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getCoordinatesRule()); 
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
    // $ANTLR end "entryRuleCoordinates"


    // $ANTLR start "ruleCoordinates"
    // InternalGameoflifeDSL.g:187:1: ruleCoordinates : ( ( rule__Coordinates__Group__0 ) ) ;
    public final void ruleCoordinates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:191:2: ( ( ( rule__Coordinates__Group__0 ) ) )
            // InternalGameoflifeDSL.g:192:2: ( ( rule__Coordinates__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:192:2: ( ( rule__Coordinates__Group__0 ) )
            // InternalGameoflifeDSL.g:193:3: ( rule__Coordinates__Group__0 )
            {
             before(grammarAccess.getCoordinatesAccess().getGroup()); 
            // InternalGameoflifeDSL.g:194:3: ( rule__Coordinates__Group__0 )
            // InternalGameoflifeDSL.g:194:4: rule__Coordinates__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinates"


    // $ANTLR start "entryRuleEvolutionRules"
    // InternalGameoflifeDSL.g:203:1: entryRuleEvolutionRules : ruleEvolutionRules EOF ;
    public final void entryRuleEvolutionRules() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:204:1: ( ruleEvolutionRules EOF )
            // InternalGameoflifeDSL.g:205:1: ruleEvolutionRules EOF
            {
             before(grammarAccess.getEvolutionRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleEvolutionRules();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesRule()); 
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
    // $ANTLR end "entryRuleEvolutionRules"


    // $ANTLR start "ruleEvolutionRules"
    // InternalGameoflifeDSL.g:212:1: ruleEvolutionRules : ( ( rule__EvolutionRules__Group__0 ) ) ;
    public final void ruleEvolutionRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:216:2: ( ( ( rule__EvolutionRules__Group__0 ) ) )
            // InternalGameoflifeDSL.g:217:2: ( ( rule__EvolutionRules__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:217:2: ( ( rule__EvolutionRules__Group__0 ) )
            // InternalGameoflifeDSL.g:218:3: ( rule__EvolutionRules__Group__0 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getGroup()); 
            // InternalGameoflifeDSL.g:219:3: ( rule__EvolutionRules__Group__0 )
            // InternalGameoflifeDSL.g:219:4: rule__EvolutionRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvolutionRules"


    // $ANTLR start "entryRuleLiveRules"
    // InternalGameoflifeDSL.g:228:1: entryRuleLiveRules : ruleLiveRules EOF ;
    public final void entryRuleLiveRules() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:229:1: ( ruleLiveRules EOF )
            // InternalGameoflifeDSL.g:230:1: ruleLiveRules EOF
            {
             before(grammarAccess.getLiveRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleLiveRules();

            state._fsp--;

             after(grammarAccess.getLiveRulesRule()); 
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
    // $ANTLR end "entryRuleLiveRules"


    // $ANTLR start "ruleLiveRules"
    // InternalGameoflifeDSL.g:237:1: ruleLiveRules : ( ( rule__LiveRules__Group__0 ) ) ;
    public final void ruleLiveRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:241:2: ( ( ( rule__LiveRules__Group__0 ) ) )
            // InternalGameoflifeDSL.g:242:2: ( ( rule__LiveRules__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:242:2: ( ( rule__LiveRules__Group__0 ) )
            // InternalGameoflifeDSL.g:243:3: ( rule__LiveRules__Group__0 )
            {
             before(grammarAccess.getLiveRulesAccess().getGroup()); 
            // InternalGameoflifeDSL.g:244:3: ( rule__LiveRules__Group__0 )
            // InternalGameoflifeDSL.g:244:4: rule__LiveRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LiveRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiveRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiveRules"


    // $ANTLR start "entryRuleDieRules"
    // InternalGameoflifeDSL.g:253:1: entryRuleDieRules : ruleDieRules EOF ;
    public final void entryRuleDieRules() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:254:1: ( ruleDieRules EOF )
            // InternalGameoflifeDSL.g:255:1: ruleDieRules EOF
            {
             before(grammarAccess.getDieRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleDieRules();

            state._fsp--;

             after(grammarAccess.getDieRulesRule()); 
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
    // $ANTLR end "entryRuleDieRules"


    // $ANTLR start "ruleDieRules"
    // InternalGameoflifeDSL.g:262:1: ruleDieRules : ( ( rule__DieRules__Group__0 ) ) ;
    public final void ruleDieRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:266:2: ( ( ( rule__DieRules__Group__0 ) ) )
            // InternalGameoflifeDSL.g:267:2: ( ( rule__DieRules__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:267:2: ( ( rule__DieRules__Group__0 ) )
            // InternalGameoflifeDSL.g:268:3: ( rule__DieRules__Group__0 )
            {
             before(grammarAccess.getDieRulesAccess().getGroup()); 
            // InternalGameoflifeDSL.g:269:3: ( rule__DieRules__Group__0 )
            // InternalGameoflifeDSL.g:269:4: rule__DieRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DieRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDieRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDieRules"


    // $ANTLR start "entryRuleBecomeAliveRules"
    // InternalGameoflifeDSL.g:278:1: entryRuleBecomeAliveRules : ruleBecomeAliveRules EOF ;
    public final void entryRuleBecomeAliveRules() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:279:1: ( ruleBecomeAliveRules EOF )
            // InternalGameoflifeDSL.g:280:1: ruleBecomeAliveRules EOF
            {
             before(grammarAccess.getBecomeAliveRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleBecomeAliveRules();

            state._fsp--;

             after(grammarAccess.getBecomeAliveRulesRule()); 
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
    // $ANTLR end "entryRuleBecomeAliveRules"


    // $ANTLR start "ruleBecomeAliveRules"
    // InternalGameoflifeDSL.g:287:1: ruleBecomeAliveRules : ( ( rule__BecomeAliveRules__Group__0 ) ) ;
    public final void ruleBecomeAliveRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:291:2: ( ( ( rule__BecomeAliveRules__Group__0 ) ) )
            // InternalGameoflifeDSL.g:292:2: ( ( rule__BecomeAliveRules__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:292:2: ( ( rule__BecomeAliveRules__Group__0 ) )
            // InternalGameoflifeDSL.g:293:3: ( rule__BecomeAliveRules__Group__0 )
            {
             before(grammarAccess.getBecomeAliveRulesAccess().getGroup()); 
            // InternalGameoflifeDSL.g:294:3: ( rule__BecomeAliveRules__Group__0 )
            // InternalGameoflifeDSL.g:294:4: rule__BecomeAliveRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BecomeAliveRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBecomeAliveRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBecomeAliveRules"


    // $ANTLR start "entryRuleSurroundingCheck"
    // InternalGameoflifeDSL.g:303:1: entryRuleSurroundingCheck : ruleSurroundingCheck EOF ;
    public final void entryRuleSurroundingCheck() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:304:1: ( ruleSurroundingCheck EOF )
            // InternalGameoflifeDSL.g:305:1: ruleSurroundingCheck EOF
            {
             before(grammarAccess.getSurroundingCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleSurroundingCheck();

            state._fsp--;

             after(grammarAccess.getSurroundingCheckRule()); 
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
    // $ANTLR end "entryRuleSurroundingCheck"


    // $ANTLR start "ruleSurroundingCheck"
    // InternalGameoflifeDSL.g:312:1: ruleSurroundingCheck : ( ( rule__SurroundingCheck__Group__0 ) ) ;
    public final void ruleSurroundingCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:316:2: ( ( ( rule__SurroundingCheck__Group__0 ) ) )
            // InternalGameoflifeDSL.g:317:2: ( ( rule__SurroundingCheck__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:317:2: ( ( rule__SurroundingCheck__Group__0 ) )
            // InternalGameoflifeDSL.g:318:3: ( rule__SurroundingCheck__Group__0 )
            {
             before(grammarAccess.getSurroundingCheckAccess().getGroup()); 
            // InternalGameoflifeDSL.g:319:3: ( rule__SurroundingCheck__Group__0 )
            // InternalGameoflifeDSL.g:319:4: rule__SurroundingCheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SurroundingCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurroundingCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurroundingCheck"


    // $ANTLR start "entryRuleCheck"
    // InternalGameoflifeDSL.g:328:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:329:1: ( ruleCheck EOF )
            // InternalGameoflifeDSL.g:330:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalGameoflifeDSL.g:337:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:341:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalGameoflifeDSL.g:342:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:342:2: ( ( rule__Check__Group__0 ) )
            // InternalGameoflifeDSL.g:343:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalGameoflifeDSL.g:344:3: ( rule__Check__Group__0 )
            // InternalGameoflifeDSL.g:344:4: rule__Check__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleExtraCheck"
    // InternalGameoflifeDSL.g:353:1: entryRuleExtraCheck : ruleExtraCheck EOF ;
    public final void entryRuleExtraCheck() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:354:1: ( ruleExtraCheck EOF )
            // InternalGameoflifeDSL.g:355:1: ruleExtraCheck EOF
            {
             before(grammarAccess.getExtraCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleExtraCheck();

            state._fsp--;

             after(grammarAccess.getExtraCheckRule()); 
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
    // $ANTLR end "entryRuleExtraCheck"


    // $ANTLR start "ruleExtraCheck"
    // InternalGameoflifeDSL.g:362:1: ruleExtraCheck : ( ( rule__ExtraCheck__Group__0 ) ) ;
    public final void ruleExtraCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:366:2: ( ( ( rule__ExtraCheck__Group__0 ) ) )
            // InternalGameoflifeDSL.g:367:2: ( ( rule__ExtraCheck__Group__0 ) )
            {
            // InternalGameoflifeDSL.g:367:2: ( ( rule__ExtraCheck__Group__0 ) )
            // InternalGameoflifeDSL.g:368:3: ( rule__ExtraCheck__Group__0 )
            {
             before(grammarAccess.getExtraCheckAccess().getGroup()); 
            // InternalGameoflifeDSL.g:369:3: ( rule__ExtraCheck__Group__0 )
            // InternalGameoflifeDSL.g:369:4: rule__ExtraCheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtraCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtraCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtraCheck"


    // $ANTLR start "entryRuleComparison"
    // InternalGameoflifeDSL.g:378:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:379:1: ( ruleComparison EOF )
            // InternalGameoflifeDSL.g:380:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalGameoflifeDSL.g:387:1: ruleComparison : ( ( rule__Comparison__Alternatives ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:391:2: ( ( ( rule__Comparison__Alternatives ) ) )
            // InternalGameoflifeDSL.g:392:2: ( ( rule__Comparison__Alternatives ) )
            {
            // InternalGameoflifeDSL.g:392:2: ( ( rule__Comparison__Alternatives ) )
            // InternalGameoflifeDSL.g:393:3: ( rule__Comparison__Alternatives )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives()); 
            // InternalGameoflifeDSL.g:394:3: ( rule__Comparison__Alternatives )
            // InternalGameoflifeDSL.g:394:4: rule__Comparison__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOperators"
    // InternalGameoflifeDSL.g:403:1: entryRuleOperators : ruleOperators EOF ;
    public final void entryRuleOperators() throws RecognitionException {
        try {
            // InternalGameoflifeDSL.g:404:1: ( ruleOperators EOF )
            // InternalGameoflifeDSL.g:405:1: ruleOperators EOF
            {
             before(grammarAccess.getOperatorsRule()); 
            pushFollow(FOLLOW_1);
            ruleOperators();

            state._fsp--;

             after(grammarAccess.getOperatorsRule()); 
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
    // $ANTLR end "entryRuleOperators"


    // $ANTLR start "ruleOperators"
    // InternalGameoflifeDSL.g:412:1: ruleOperators : ( ( rule__Operators__Alternatives ) ) ;
    public final void ruleOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:416:2: ( ( ( rule__Operators__Alternatives ) ) )
            // InternalGameoflifeDSL.g:417:2: ( ( rule__Operators__Alternatives ) )
            {
            // InternalGameoflifeDSL.g:417:2: ( ( rule__Operators__Alternatives ) )
            // InternalGameoflifeDSL.g:418:3: ( rule__Operators__Alternatives )
            {
             before(grammarAccess.getOperatorsAccess().getAlternatives()); 
            // InternalGameoflifeDSL.g:419:3: ( rule__Operators__Alternatives )
            // InternalGameoflifeDSL.g:419:4: rule__Operators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperators"


    // $ANTLR start "rule__Comparison__Alternatives"
    // InternalGameoflifeDSL.g:427:1: rule__Comparison__Alternatives : ( ( '<' ) | ( '=' ) | ( '>' ) );
    public final void rule__Comparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:431:1: ( ( '<' ) | ( '=' ) | ( '>' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
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
                    // InternalGameoflifeDSL.g:432:2: ( '<' )
                    {
                    // InternalGameoflifeDSL.g:432:2: ( '<' )
                    // InternalGameoflifeDSL.g:433:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameoflifeDSL.g:438:2: ( '=' )
                    {
                    // InternalGameoflifeDSL.g:438:2: ( '=' )
                    // InternalGameoflifeDSL.g:439:3: '='
                    {
                     before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGameoflifeDSL.g:444:2: ( '>' )
                    {
                    // InternalGameoflifeDSL.g:444:2: ( '>' )
                    // InternalGameoflifeDSL.g:445:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Comparison__Alternatives"


    // $ANTLR start "rule__Operators__Alternatives"
    // InternalGameoflifeDSL.g:454:1: rule__Operators__Alternatives : ( ( 'and' ) | ( 'or' ) );
    public final void rule__Operators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:458:1: ( ( 'and' ) | ( 'or' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGameoflifeDSL.g:459:2: ( 'and' )
                    {
                    // InternalGameoflifeDSL.g:459:2: ( 'and' )
                    // InternalGameoflifeDSL.g:460:3: 'and'
                    {
                     before(grammarAccess.getOperatorsAccess().getAndKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOperatorsAccess().getAndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameoflifeDSL.g:465:2: ( 'or' )
                    {
                    // InternalGameoflifeDSL.g:465:2: ( 'or' )
                    // InternalGameoflifeDSL.g:466:3: 'or'
                    {
                     before(grammarAccess.getOperatorsAccess().getOrKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOperatorsAccess().getOrKeyword_1()); 

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
    // $ANTLR end "rule__Operators__Alternatives"


    // $ANTLR start "rule__GameStart__Group__0"
    // InternalGameoflifeDSL.g:475:1: rule__GameStart__Group__0 : rule__GameStart__Group__0__Impl rule__GameStart__Group__1 ;
    public final void rule__GameStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:479:1: ( rule__GameStart__Group__0__Impl rule__GameStart__Group__1 )
            // InternalGameoflifeDSL.g:480:2: rule__GameStart__Group__0__Impl rule__GameStart__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GameStart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__0"


    // $ANTLR start "rule__GameStart__Group__0__Impl"
    // InternalGameoflifeDSL.g:487:1: rule__GameStart__Group__0__Impl : ( 'GameStart' ) ;
    public final void rule__GameStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:491:1: ( ( 'GameStart' ) )
            // InternalGameoflifeDSL.g:492:1: ( 'GameStart' )
            {
            // InternalGameoflifeDSL.g:492:1: ( 'GameStart' )
            // InternalGameoflifeDSL.g:493:2: 'GameStart'
            {
             before(grammarAccess.getGameStartAccess().getGameStartKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGameStartAccess().getGameStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__0__Impl"


    // $ANTLR start "rule__GameStart__Group__1"
    // InternalGameoflifeDSL.g:502:1: rule__GameStart__Group__1 : rule__GameStart__Group__1__Impl rule__GameStart__Group__2 ;
    public final void rule__GameStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:506:1: ( rule__GameStart__Group__1__Impl rule__GameStart__Group__2 )
            // InternalGameoflifeDSL.g:507:2: rule__GameStart__Group__1__Impl rule__GameStart__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GameStart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__1"


    // $ANTLR start "rule__GameStart__Group__1__Impl"
    // InternalGameoflifeDSL.g:514:1: rule__GameStart__Group__1__Impl : ( '{' ) ;
    public final void rule__GameStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:518:1: ( ( '{' ) )
            // InternalGameoflifeDSL.g:519:1: ( '{' )
            {
            // InternalGameoflifeDSL.g:519:1: ( '{' )
            // InternalGameoflifeDSL.g:520:2: '{'
            {
             before(grammarAccess.getGameStartAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGameStartAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__1__Impl"


    // $ANTLR start "rule__GameStart__Group__2"
    // InternalGameoflifeDSL.g:529:1: rule__GameStart__Group__2 : rule__GameStart__Group__2__Impl rule__GameStart__Group__3 ;
    public final void rule__GameStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:533:1: ( rule__GameStart__Group__2__Impl rule__GameStart__Group__3 )
            // InternalGameoflifeDSL.g:534:2: rule__GameStart__Group__2__Impl rule__GameStart__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GameStart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__2"


    // $ANTLR start "rule__GameStart__Group__2__Impl"
    // InternalGameoflifeDSL.g:541:1: rule__GameStart__Group__2__Impl : ( ( rule__GameStart__InitialGridAssignment_2 ) ) ;
    public final void rule__GameStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:545:1: ( ( ( rule__GameStart__InitialGridAssignment_2 ) ) )
            // InternalGameoflifeDSL.g:546:1: ( ( rule__GameStart__InitialGridAssignment_2 ) )
            {
            // InternalGameoflifeDSL.g:546:1: ( ( rule__GameStart__InitialGridAssignment_2 ) )
            // InternalGameoflifeDSL.g:547:2: ( rule__GameStart__InitialGridAssignment_2 )
            {
             before(grammarAccess.getGameStartAccess().getInitialGridAssignment_2()); 
            // InternalGameoflifeDSL.g:548:2: ( rule__GameStart__InitialGridAssignment_2 )
            // InternalGameoflifeDSL.g:548:3: rule__GameStart__InitialGridAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GameStart__InitialGridAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGameStartAccess().getInitialGridAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__2__Impl"


    // $ANTLR start "rule__GameStart__Group__3"
    // InternalGameoflifeDSL.g:556:1: rule__GameStart__Group__3 : rule__GameStart__Group__3__Impl rule__GameStart__Group__4 ;
    public final void rule__GameStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:560:1: ( rule__GameStart__Group__3__Impl rule__GameStart__Group__4 )
            // InternalGameoflifeDSL.g:561:2: rule__GameStart__Group__3__Impl rule__GameStart__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__GameStart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__3"


    // $ANTLR start "rule__GameStart__Group__3__Impl"
    // InternalGameoflifeDSL.g:568:1: rule__GameStart__Group__3__Impl : ( ( rule__GameStart__EvolutionRulesAssignment_3 ) ) ;
    public final void rule__GameStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:572:1: ( ( ( rule__GameStart__EvolutionRulesAssignment_3 ) ) )
            // InternalGameoflifeDSL.g:573:1: ( ( rule__GameStart__EvolutionRulesAssignment_3 ) )
            {
            // InternalGameoflifeDSL.g:573:1: ( ( rule__GameStart__EvolutionRulesAssignment_3 ) )
            // InternalGameoflifeDSL.g:574:2: ( rule__GameStart__EvolutionRulesAssignment_3 )
            {
             before(grammarAccess.getGameStartAccess().getEvolutionRulesAssignment_3()); 
            // InternalGameoflifeDSL.g:575:2: ( rule__GameStart__EvolutionRulesAssignment_3 )
            // InternalGameoflifeDSL.g:575:3: rule__GameStart__EvolutionRulesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GameStart__EvolutionRulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGameStartAccess().getEvolutionRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__3__Impl"


    // $ANTLR start "rule__GameStart__Group__4"
    // InternalGameoflifeDSL.g:583:1: rule__GameStart__Group__4 : rule__GameStart__Group__4__Impl ;
    public final void rule__GameStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:587:1: ( rule__GameStart__Group__4__Impl )
            // InternalGameoflifeDSL.g:588:2: rule__GameStart__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameStart__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__4"


    // $ANTLR start "rule__GameStart__Group__4__Impl"
    // InternalGameoflifeDSL.g:594:1: rule__GameStart__Group__4__Impl : ( '}' ) ;
    public final void rule__GameStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:598:1: ( ( '}' ) )
            // InternalGameoflifeDSL.g:599:1: ( '}' )
            {
            // InternalGameoflifeDSL.g:599:1: ( '}' )
            // InternalGameoflifeDSL.g:600:2: '}'
            {
             before(grammarAccess.getGameStartAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGameStartAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__4__Impl"


    // $ANTLR start "rule__InitialGrid__Group__0"
    // InternalGameoflifeDSL.g:610:1: rule__InitialGrid__Group__0 : rule__InitialGrid__Group__0__Impl rule__InitialGrid__Group__1 ;
    public final void rule__InitialGrid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:614:1: ( rule__InitialGrid__Group__0__Impl rule__InitialGrid__Group__1 )
            // InternalGameoflifeDSL.g:615:2: rule__InitialGrid__Group__0__Impl rule__InitialGrid__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InitialGrid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__0"


    // $ANTLR start "rule__InitialGrid__Group__0__Impl"
    // InternalGameoflifeDSL.g:622:1: rule__InitialGrid__Group__0__Impl : ( () ) ;
    public final void rule__InitialGrid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:626:1: ( ( () ) )
            // InternalGameoflifeDSL.g:627:1: ( () )
            {
            // InternalGameoflifeDSL.g:627:1: ( () )
            // InternalGameoflifeDSL.g:628:2: ()
            {
             before(grammarAccess.getInitialGridAccess().getInitialGridAction_0()); 
            // InternalGameoflifeDSL.g:629:2: ()
            // InternalGameoflifeDSL.g:629:3: 
            {
            }

             after(grammarAccess.getInitialGridAccess().getInitialGridAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__0__Impl"


    // $ANTLR start "rule__InitialGrid__Group__1"
    // InternalGameoflifeDSL.g:637:1: rule__InitialGrid__Group__1 : rule__InitialGrid__Group__1__Impl rule__InitialGrid__Group__2 ;
    public final void rule__InitialGrid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:641:1: ( rule__InitialGrid__Group__1__Impl rule__InitialGrid__Group__2 )
            // InternalGameoflifeDSL.g:642:2: rule__InitialGrid__Group__1__Impl rule__InitialGrid__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InitialGrid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__1"


    // $ANTLR start "rule__InitialGrid__Group__1__Impl"
    // InternalGameoflifeDSL.g:649:1: rule__InitialGrid__Group__1__Impl : ( ( rule__InitialGrid__Group_1__0 )* ) ;
    public final void rule__InitialGrid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:653:1: ( ( ( rule__InitialGrid__Group_1__0 )* ) )
            // InternalGameoflifeDSL.g:654:1: ( ( rule__InitialGrid__Group_1__0 )* )
            {
            // InternalGameoflifeDSL.g:654:1: ( ( rule__InitialGrid__Group_1__0 )* )
            // InternalGameoflifeDSL.g:655:2: ( rule__InitialGrid__Group_1__0 )*
            {
             before(grammarAccess.getInitialGridAccess().getGroup_1()); 
            // InternalGameoflifeDSL.g:656:2: ( rule__InitialGrid__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==25) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:656:3: rule__InitialGrid__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InitialGrid__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getInitialGridAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__1__Impl"


    // $ANTLR start "rule__InitialGrid__Group__2"
    // InternalGameoflifeDSL.g:664:1: rule__InitialGrid__Group__2 : rule__InitialGrid__Group__2__Impl ;
    public final void rule__InitialGrid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:668:1: ( rule__InitialGrid__Group__2__Impl )
            // InternalGameoflifeDSL.g:669:2: rule__InitialGrid__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__2"


    // $ANTLR start "rule__InitialGrid__Group__2__Impl"
    // InternalGameoflifeDSL.g:675:1: rule__InitialGrid__Group__2__Impl : ( ( rule__InitialGrid__Group_2__0 )* ) ;
    public final void rule__InitialGrid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:679:1: ( ( ( rule__InitialGrid__Group_2__0 )* ) )
            // InternalGameoflifeDSL.g:680:1: ( ( rule__InitialGrid__Group_2__0 )* )
            {
            // InternalGameoflifeDSL.g:680:1: ( ( rule__InitialGrid__Group_2__0 )* )
            // InternalGameoflifeDSL.g:681:2: ( rule__InitialGrid__Group_2__0 )*
            {
             before(grammarAccess.getInitialGridAccess().getGroup_2()); 
            // InternalGameoflifeDSL.g:682:2: ( rule__InitialGrid__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:682:3: rule__InitialGrid__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InitialGrid__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getInitialGridAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__2__Impl"


    // $ANTLR start "rule__InitialGrid__Group_1__0"
    // InternalGameoflifeDSL.g:691:1: rule__InitialGrid__Group_1__0 : rule__InitialGrid__Group_1__0__Impl rule__InitialGrid__Group_1__1 ;
    public final void rule__InitialGrid__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:695:1: ( rule__InitialGrid__Group_1__0__Impl rule__InitialGrid__Group_1__1 )
            // InternalGameoflifeDSL.g:696:2: rule__InitialGrid__Group_1__0__Impl rule__InitialGrid__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__InitialGrid__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group_1__0"


    // $ANTLR start "rule__InitialGrid__Group_1__0__Impl"
    // InternalGameoflifeDSL.g:703:1: rule__InitialGrid__Group_1__0__Impl : ( 'Draw' ) ;
    public final void rule__InitialGrid__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:707:1: ( ( 'Draw' ) )
            // InternalGameoflifeDSL.g:708:1: ( 'Draw' )
            {
            // InternalGameoflifeDSL.g:708:1: ( 'Draw' )
            // InternalGameoflifeDSL.g:709:2: 'Draw'
            {
             before(grammarAccess.getInitialGridAccess().getDrawKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialGridAccess().getDrawKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group_1__0__Impl"


    // $ANTLR start "rule__InitialGrid__Group_1__1"
    // InternalGameoflifeDSL.g:718:1: rule__InitialGrid__Group_1__1 : rule__InitialGrid__Group_1__1__Impl ;
    public final void rule__InitialGrid__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:722:1: ( rule__InitialGrid__Group_1__1__Impl )
            // InternalGameoflifeDSL.g:723:2: rule__InitialGrid__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group_1__1"


    // $ANTLR start "rule__InitialGrid__Group_1__1__Impl"
    // InternalGameoflifeDSL.g:729:1: rule__InitialGrid__Group_1__1__Impl : ( ( rule__InitialGrid__CellsAssignment_1_1 ) ) ;
    public final void rule__InitialGrid__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:733:1: ( ( ( rule__InitialGrid__CellsAssignment_1_1 ) ) )
            // InternalGameoflifeDSL.g:734:1: ( ( rule__InitialGrid__CellsAssignment_1_1 ) )
            {
            // InternalGameoflifeDSL.g:734:1: ( ( rule__InitialGrid__CellsAssignment_1_1 ) )
            // InternalGameoflifeDSL.g:735:2: ( rule__InitialGrid__CellsAssignment_1_1 )
            {
             before(grammarAccess.getInitialGridAccess().getCellsAssignment_1_1()); 
            // InternalGameoflifeDSL.g:736:2: ( rule__InitialGrid__CellsAssignment_1_1 )
            // InternalGameoflifeDSL.g:736:3: rule__InitialGrid__CellsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__CellsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialGridAccess().getCellsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group_1__1__Impl"


    // $ANTLR start "rule__InitialGrid__Group_2__0"
    // InternalGameoflifeDSL.g:745:1: rule__InitialGrid__Group_2__0 : rule__InitialGrid__Group_2__0__Impl rule__InitialGrid__Group_2__1 ;
    public final void rule__InitialGrid__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:749:1: ( rule__InitialGrid__Group_2__0__Impl rule__InitialGrid__Group_2__1 )
            // InternalGameoflifeDSL.g:750:2: rule__InitialGrid__Group_2__0__Impl rule__InitialGrid__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__InitialGrid__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group_2__0"


    // $ANTLR start "rule__InitialGrid__Group_2__0__Impl"
    // InternalGameoflifeDSL.g:757:1: rule__InitialGrid__Group_2__0__Impl : ( 'Draw' ) ;
    public final void rule__InitialGrid__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:761:1: ( ( 'Draw' ) )
            // InternalGameoflifeDSL.g:762:1: ( 'Draw' )
            {
            // InternalGameoflifeDSL.g:762:1: ( 'Draw' )
            // InternalGameoflifeDSL.g:763:2: 'Draw'
            {
             before(grammarAccess.getInitialGridAccess().getDrawKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialGridAccess().getDrawKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group_2__0__Impl"


    // $ANTLR start "rule__InitialGrid__Group_2__1"
    // InternalGameoflifeDSL.g:772:1: rule__InitialGrid__Group_2__1 : rule__InitialGrid__Group_2__1__Impl ;
    public final void rule__InitialGrid__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:776:1: ( rule__InitialGrid__Group_2__1__Impl )
            // InternalGameoflifeDSL.g:777:2: rule__InitialGrid__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group_2__1"


    // $ANTLR start "rule__InitialGrid__Group_2__1__Impl"
    // InternalGameoflifeDSL.g:783:1: rule__InitialGrid__Group_2__1__Impl : ( ( rule__InitialGrid__LinesAssignment_2_1 ) ) ;
    public final void rule__InitialGrid__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:787:1: ( ( ( rule__InitialGrid__LinesAssignment_2_1 ) ) )
            // InternalGameoflifeDSL.g:788:1: ( ( rule__InitialGrid__LinesAssignment_2_1 ) )
            {
            // InternalGameoflifeDSL.g:788:1: ( ( rule__InitialGrid__LinesAssignment_2_1 ) )
            // InternalGameoflifeDSL.g:789:2: ( rule__InitialGrid__LinesAssignment_2_1 )
            {
             before(grammarAccess.getInitialGridAccess().getLinesAssignment_2_1()); 
            // InternalGameoflifeDSL.g:790:2: ( rule__InitialGrid__LinesAssignment_2_1 )
            // InternalGameoflifeDSL.g:790:3: rule__InitialGrid__LinesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__LinesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialGridAccess().getLinesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group_2__1__Impl"


    // $ANTLR start "rule__LineCoords__Group__0"
    // InternalGameoflifeDSL.g:799:1: rule__LineCoords__Group__0 : rule__LineCoords__Group__0__Impl rule__LineCoords__Group__1 ;
    public final void rule__LineCoords__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:803:1: ( rule__LineCoords__Group__0__Impl rule__LineCoords__Group__1 )
            // InternalGameoflifeDSL.g:804:2: rule__LineCoords__Group__0__Impl rule__LineCoords__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__LineCoords__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__0"


    // $ANTLR start "rule__LineCoords__Group__0__Impl"
    // InternalGameoflifeDSL.g:811:1: rule__LineCoords__Group__0__Impl : ( 'Many' ) ;
    public final void rule__LineCoords__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:815:1: ( ( 'Many' ) )
            // InternalGameoflifeDSL.g:816:1: ( 'Many' )
            {
            // InternalGameoflifeDSL.g:816:1: ( 'Many' )
            // InternalGameoflifeDSL.g:817:2: 'Many'
            {
             before(grammarAccess.getLineCoordsAccess().getManyKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getManyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__0__Impl"


    // $ANTLR start "rule__LineCoords__Group__1"
    // InternalGameoflifeDSL.g:826:1: rule__LineCoords__Group__1 : rule__LineCoords__Group__1__Impl rule__LineCoords__Group__2 ;
    public final void rule__LineCoords__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:830:1: ( rule__LineCoords__Group__1__Impl rule__LineCoords__Group__2 )
            // InternalGameoflifeDSL.g:831:2: rule__LineCoords__Group__1__Impl rule__LineCoords__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__LineCoords__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__1"


    // $ANTLR start "rule__LineCoords__Group__1__Impl"
    // InternalGameoflifeDSL.g:838:1: rule__LineCoords__Group__1__Impl : ( '(' ) ;
    public final void rule__LineCoords__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:842:1: ( ( '(' ) )
            // InternalGameoflifeDSL.g:843:1: ( '(' )
            {
            // InternalGameoflifeDSL.g:843:1: ( '(' )
            // InternalGameoflifeDSL.g:844:2: '('
            {
             before(grammarAccess.getLineCoordsAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__1__Impl"


    // $ANTLR start "rule__LineCoords__Group__2"
    // InternalGameoflifeDSL.g:853:1: rule__LineCoords__Group__2 : rule__LineCoords__Group__2__Impl rule__LineCoords__Group__3 ;
    public final void rule__LineCoords__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:857:1: ( rule__LineCoords__Group__2__Impl rule__LineCoords__Group__3 )
            // InternalGameoflifeDSL.g:858:2: rule__LineCoords__Group__2__Impl rule__LineCoords__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__LineCoords__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__2"


    // $ANTLR start "rule__LineCoords__Group__2__Impl"
    // InternalGameoflifeDSL.g:865:1: rule__LineCoords__Group__2__Impl : ( ( rule__LineCoords__XbegAssignment_2 ) ) ;
    public final void rule__LineCoords__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:869:1: ( ( ( rule__LineCoords__XbegAssignment_2 ) ) )
            // InternalGameoflifeDSL.g:870:1: ( ( rule__LineCoords__XbegAssignment_2 ) )
            {
            // InternalGameoflifeDSL.g:870:1: ( ( rule__LineCoords__XbegAssignment_2 ) )
            // InternalGameoflifeDSL.g:871:2: ( rule__LineCoords__XbegAssignment_2 )
            {
             before(grammarAccess.getLineCoordsAccess().getXbegAssignment_2()); 
            // InternalGameoflifeDSL.g:872:2: ( rule__LineCoords__XbegAssignment_2 )
            // InternalGameoflifeDSL.g:872:3: rule__LineCoords__XbegAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LineCoords__XbegAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineCoordsAccess().getXbegAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__2__Impl"


    // $ANTLR start "rule__LineCoords__Group__3"
    // InternalGameoflifeDSL.g:880:1: rule__LineCoords__Group__3 : rule__LineCoords__Group__3__Impl rule__LineCoords__Group__4 ;
    public final void rule__LineCoords__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:884:1: ( rule__LineCoords__Group__3__Impl rule__LineCoords__Group__4 )
            // InternalGameoflifeDSL.g:885:2: rule__LineCoords__Group__3__Impl rule__LineCoords__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__LineCoords__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__3"


    // $ANTLR start "rule__LineCoords__Group__3__Impl"
    // InternalGameoflifeDSL.g:892:1: rule__LineCoords__Group__3__Impl : ( 'to' ) ;
    public final void rule__LineCoords__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:896:1: ( ( 'to' ) )
            // InternalGameoflifeDSL.g:897:1: ( 'to' )
            {
            // InternalGameoflifeDSL.g:897:1: ( 'to' )
            // InternalGameoflifeDSL.g:898:2: 'to'
            {
             before(grammarAccess.getLineCoordsAccess().getToKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__3__Impl"


    // $ANTLR start "rule__LineCoords__Group__4"
    // InternalGameoflifeDSL.g:907:1: rule__LineCoords__Group__4 : rule__LineCoords__Group__4__Impl rule__LineCoords__Group__5 ;
    public final void rule__LineCoords__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:911:1: ( rule__LineCoords__Group__4__Impl rule__LineCoords__Group__5 )
            // InternalGameoflifeDSL.g:912:2: rule__LineCoords__Group__4__Impl rule__LineCoords__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__LineCoords__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__4"


    // $ANTLR start "rule__LineCoords__Group__4__Impl"
    // InternalGameoflifeDSL.g:919:1: rule__LineCoords__Group__4__Impl : ( ( rule__LineCoords__XendAssignment_4 ) ) ;
    public final void rule__LineCoords__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:923:1: ( ( ( rule__LineCoords__XendAssignment_4 ) ) )
            // InternalGameoflifeDSL.g:924:1: ( ( rule__LineCoords__XendAssignment_4 ) )
            {
            // InternalGameoflifeDSL.g:924:1: ( ( rule__LineCoords__XendAssignment_4 ) )
            // InternalGameoflifeDSL.g:925:2: ( rule__LineCoords__XendAssignment_4 )
            {
             before(grammarAccess.getLineCoordsAccess().getXendAssignment_4()); 
            // InternalGameoflifeDSL.g:926:2: ( rule__LineCoords__XendAssignment_4 )
            // InternalGameoflifeDSL.g:926:3: rule__LineCoords__XendAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LineCoords__XendAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLineCoordsAccess().getXendAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__4__Impl"


    // $ANTLR start "rule__LineCoords__Group__5"
    // InternalGameoflifeDSL.g:934:1: rule__LineCoords__Group__5 : rule__LineCoords__Group__5__Impl rule__LineCoords__Group__6 ;
    public final void rule__LineCoords__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:938:1: ( rule__LineCoords__Group__5__Impl rule__LineCoords__Group__6 )
            // InternalGameoflifeDSL.g:939:2: rule__LineCoords__Group__5__Impl rule__LineCoords__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__LineCoords__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__5"


    // $ANTLR start "rule__LineCoords__Group__5__Impl"
    // InternalGameoflifeDSL.g:946:1: rule__LineCoords__Group__5__Impl : ( ')' ) ;
    public final void rule__LineCoords__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:950:1: ( ( ')' ) )
            // InternalGameoflifeDSL.g:951:1: ( ')' )
            {
            // InternalGameoflifeDSL.g:951:1: ( ')' )
            // InternalGameoflifeDSL.g:952:2: ')'
            {
             before(grammarAccess.getLineCoordsAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__5__Impl"


    // $ANTLR start "rule__LineCoords__Group__6"
    // InternalGameoflifeDSL.g:961:1: rule__LineCoords__Group__6 : rule__LineCoords__Group__6__Impl rule__LineCoords__Group__7 ;
    public final void rule__LineCoords__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:965:1: ( rule__LineCoords__Group__6__Impl rule__LineCoords__Group__7 )
            // InternalGameoflifeDSL.g:966:2: rule__LineCoords__Group__6__Impl rule__LineCoords__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__LineCoords__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__6"


    // $ANTLR start "rule__LineCoords__Group__6__Impl"
    // InternalGameoflifeDSL.g:973:1: rule__LineCoords__Group__6__Impl : ( ':' ) ;
    public final void rule__LineCoords__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:977:1: ( ( ':' ) )
            // InternalGameoflifeDSL.g:978:1: ( ':' )
            {
            // InternalGameoflifeDSL.g:978:1: ( ':' )
            // InternalGameoflifeDSL.g:979:2: ':'
            {
             before(grammarAccess.getLineCoordsAccess().getColonKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__6__Impl"


    // $ANTLR start "rule__LineCoords__Group__7"
    // InternalGameoflifeDSL.g:988:1: rule__LineCoords__Group__7 : rule__LineCoords__Group__7__Impl rule__LineCoords__Group__8 ;
    public final void rule__LineCoords__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:992:1: ( rule__LineCoords__Group__7__Impl rule__LineCoords__Group__8 )
            // InternalGameoflifeDSL.g:993:2: rule__LineCoords__Group__7__Impl rule__LineCoords__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__LineCoords__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__7"


    // $ANTLR start "rule__LineCoords__Group__7__Impl"
    // InternalGameoflifeDSL.g:1000:1: rule__LineCoords__Group__7__Impl : ( '(' ) ;
    public final void rule__LineCoords__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1004:1: ( ( '(' ) )
            // InternalGameoflifeDSL.g:1005:1: ( '(' )
            {
            // InternalGameoflifeDSL.g:1005:1: ( '(' )
            // InternalGameoflifeDSL.g:1006:2: '('
            {
             before(grammarAccess.getLineCoordsAccess().getLeftParenthesisKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__7__Impl"


    // $ANTLR start "rule__LineCoords__Group__8"
    // InternalGameoflifeDSL.g:1015:1: rule__LineCoords__Group__8 : rule__LineCoords__Group__8__Impl rule__LineCoords__Group__9 ;
    public final void rule__LineCoords__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1019:1: ( rule__LineCoords__Group__8__Impl rule__LineCoords__Group__9 )
            // InternalGameoflifeDSL.g:1020:2: rule__LineCoords__Group__8__Impl rule__LineCoords__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__LineCoords__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__8"


    // $ANTLR start "rule__LineCoords__Group__8__Impl"
    // InternalGameoflifeDSL.g:1027:1: rule__LineCoords__Group__8__Impl : ( ( rule__LineCoords__YbegAssignment_8 ) ) ;
    public final void rule__LineCoords__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1031:1: ( ( ( rule__LineCoords__YbegAssignment_8 ) ) )
            // InternalGameoflifeDSL.g:1032:1: ( ( rule__LineCoords__YbegAssignment_8 ) )
            {
            // InternalGameoflifeDSL.g:1032:1: ( ( rule__LineCoords__YbegAssignment_8 ) )
            // InternalGameoflifeDSL.g:1033:2: ( rule__LineCoords__YbegAssignment_8 )
            {
             before(grammarAccess.getLineCoordsAccess().getYbegAssignment_8()); 
            // InternalGameoflifeDSL.g:1034:2: ( rule__LineCoords__YbegAssignment_8 )
            // InternalGameoflifeDSL.g:1034:3: rule__LineCoords__YbegAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__LineCoords__YbegAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLineCoordsAccess().getYbegAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__8__Impl"


    // $ANTLR start "rule__LineCoords__Group__9"
    // InternalGameoflifeDSL.g:1042:1: rule__LineCoords__Group__9 : rule__LineCoords__Group__9__Impl rule__LineCoords__Group__10 ;
    public final void rule__LineCoords__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1046:1: ( rule__LineCoords__Group__9__Impl rule__LineCoords__Group__10 )
            // InternalGameoflifeDSL.g:1047:2: rule__LineCoords__Group__9__Impl rule__LineCoords__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__LineCoords__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__9"


    // $ANTLR start "rule__LineCoords__Group__9__Impl"
    // InternalGameoflifeDSL.g:1054:1: rule__LineCoords__Group__9__Impl : ( 'to' ) ;
    public final void rule__LineCoords__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1058:1: ( ( 'to' ) )
            // InternalGameoflifeDSL.g:1059:1: ( 'to' )
            {
            // InternalGameoflifeDSL.g:1059:1: ( 'to' )
            // InternalGameoflifeDSL.g:1060:2: 'to'
            {
             before(grammarAccess.getLineCoordsAccess().getToKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getToKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__9__Impl"


    // $ANTLR start "rule__LineCoords__Group__10"
    // InternalGameoflifeDSL.g:1069:1: rule__LineCoords__Group__10 : rule__LineCoords__Group__10__Impl rule__LineCoords__Group__11 ;
    public final void rule__LineCoords__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1073:1: ( rule__LineCoords__Group__10__Impl rule__LineCoords__Group__11 )
            // InternalGameoflifeDSL.g:1074:2: rule__LineCoords__Group__10__Impl rule__LineCoords__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__LineCoords__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__10"


    // $ANTLR start "rule__LineCoords__Group__10__Impl"
    // InternalGameoflifeDSL.g:1081:1: rule__LineCoords__Group__10__Impl : ( ( rule__LineCoords__YendAssignment_10 ) ) ;
    public final void rule__LineCoords__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1085:1: ( ( ( rule__LineCoords__YendAssignment_10 ) ) )
            // InternalGameoflifeDSL.g:1086:1: ( ( rule__LineCoords__YendAssignment_10 ) )
            {
            // InternalGameoflifeDSL.g:1086:1: ( ( rule__LineCoords__YendAssignment_10 ) )
            // InternalGameoflifeDSL.g:1087:2: ( rule__LineCoords__YendAssignment_10 )
            {
             before(grammarAccess.getLineCoordsAccess().getYendAssignment_10()); 
            // InternalGameoflifeDSL.g:1088:2: ( rule__LineCoords__YendAssignment_10 )
            // InternalGameoflifeDSL.g:1088:3: rule__LineCoords__YendAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__LineCoords__YendAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getLineCoordsAccess().getYendAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__10__Impl"


    // $ANTLR start "rule__LineCoords__Group__11"
    // InternalGameoflifeDSL.g:1096:1: rule__LineCoords__Group__11 : rule__LineCoords__Group__11__Impl ;
    public final void rule__LineCoords__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1100:1: ( rule__LineCoords__Group__11__Impl )
            // InternalGameoflifeDSL.g:1101:2: rule__LineCoords__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineCoords__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__11"


    // $ANTLR start "rule__LineCoords__Group__11__Impl"
    // InternalGameoflifeDSL.g:1107:1: rule__LineCoords__Group__11__Impl : ( ')' ) ;
    public final void rule__LineCoords__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1111:1: ( ( ')' ) )
            // InternalGameoflifeDSL.g:1112:1: ( ')' )
            {
            // InternalGameoflifeDSL.g:1112:1: ( ')' )
            // InternalGameoflifeDSL.g:1113:2: ')'
            {
             before(grammarAccess.getLineCoordsAccess().getRightParenthesisKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__Group__11__Impl"


    // $ANTLR start "rule__CellStatus__Group__0"
    // InternalGameoflifeDSL.g:1123:1: rule__CellStatus__Group__0 : rule__CellStatus__Group__0__Impl rule__CellStatus__Group__1 ;
    public final void rule__CellStatus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1127:1: ( rule__CellStatus__Group__0__Impl rule__CellStatus__Group__1 )
            // InternalGameoflifeDSL.g:1128:2: rule__CellStatus__Group__0__Impl rule__CellStatus__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CellStatus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellStatus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStatus__Group__0"


    // $ANTLR start "rule__CellStatus__Group__0__Impl"
    // InternalGameoflifeDSL.g:1135:1: rule__CellStatus__Group__0__Impl : ( 'Cell' ) ;
    public final void rule__CellStatus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1139:1: ( ( 'Cell' ) )
            // InternalGameoflifeDSL.g:1140:1: ( 'Cell' )
            {
            // InternalGameoflifeDSL.g:1140:1: ( 'Cell' )
            // InternalGameoflifeDSL.g:1141:2: 'Cell'
            {
             before(grammarAccess.getCellStatusAccess().getCellKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCellStatusAccess().getCellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStatus__Group__0__Impl"


    // $ANTLR start "rule__CellStatus__Group__1"
    // InternalGameoflifeDSL.g:1150:1: rule__CellStatus__Group__1 : rule__CellStatus__Group__1__Impl ;
    public final void rule__CellStatus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1154:1: ( rule__CellStatus__Group__1__Impl )
            // InternalGameoflifeDSL.g:1155:2: rule__CellStatus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellStatus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStatus__Group__1"


    // $ANTLR start "rule__CellStatus__Group__1__Impl"
    // InternalGameoflifeDSL.g:1161:1: rule__CellStatus__Group__1__Impl : ( ( rule__CellStatus__CoordinatesAssignment_1 ) ) ;
    public final void rule__CellStatus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1165:1: ( ( ( rule__CellStatus__CoordinatesAssignment_1 ) ) )
            // InternalGameoflifeDSL.g:1166:1: ( ( rule__CellStatus__CoordinatesAssignment_1 ) )
            {
            // InternalGameoflifeDSL.g:1166:1: ( ( rule__CellStatus__CoordinatesAssignment_1 ) )
            // InternalGameoflifeDSL.g:1167:2: ( rule__CellStatus__CoordinatesAssignment_1 )
            {
             before(grammarAccess.getCellStatusAccess().getCoordinatesAssignment_1()); 
            // InternalGameoflifeDSL.g:1168:2: ( rule__CellStatus__CoordinatesAssignment_1 )
            // InternalGameoflifeDSL.g:1168:3: rule__CellStatus__CoordinatesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CellStatus__CoordinatesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellStatusAccess().getCoordinatesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStatus__Group__1__Impl"


    // $ANTLR start "rule__Coordinates__Group__0"
    // InternalGameoflifeDSL.g:1177:1: rule__Coordinates__Group__0 : rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 ;
    public final void rule__Coordinates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1181:1: ( rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 )
            // InternalGameoflifeDSL.g:1182:2: rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Coordinates__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__0"


    // $ANTLR start "rule__Coordinates__Group__0__Impl"
    // InternalGameoflifeDSL.g:1189:1: rule__Coordinates__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1193:1: ( ( '(' ) )
            // InternalGameoflifeDSL.g:1194:1: ( '(' )
            {
            // InternalGameoflifeDSL.g:1194:1: ( '(' )
            // InternalGameoflifeDSL.g:1195:2: '('
            {
             before(grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__0__Impl"


    // $ANTLR start "rule__Coordinates__Group__1"
    // InternalGameoflifeDSL.g:1204:1: rule__Coordinates__Group__1 : rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 ;
    public final void rule__Coordinates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1208:1: ( rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 )
            // InternalGameoflifeDSL.g:1209:2: rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Coordinates__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__1"


    // $ANTLR start "rule__Coordinates__Group__1__Impl"
    // InternalGameoflifeDSL.g:1216:1: rule__Coordinates__Group__1__Impl : ( ( rule__Coordinates__XAssignment_1 ) ) ;
    public final void rule__Coordinates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1220:1: ( ( ( rule__Coordinates__XAssignment_1 ) ) )
            // InternalGameoflifeDSL.g:1221:1: ( ( rule__Coordinates__XAssignment_1 ) )
            {
            // InternalGameoflifeDSL.g:1221:1: ( ( rule__Coordinates__XAssignment_1 ) )
            // InternalGameoflifeDSL.g:1222:2: ( rule__Coordinates__XAssignment_1 )
            {
             before(grammarAccess.getCoordinatesAccess().getXAssignment_1()); 
            // InternalGameoflifeDSL.g:1223:2: ( rule__Coordinates__XAssignment_1 )
            // InternalGameoflifeDSL.g:1223:3: rule__Coordinates__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__1__Impl"


    // $ANTLR start "rule__Coordinates__Group__2"
    // InternalGameoflifeDSL.g:1231:1: rule__Coordinates__Group__2 : rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 ;
    public final void rule__Coordinates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1235:1: ( rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 )
            // InternalGameoflifeDSL.g:1236:2: rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Coordinates__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__2"


    // $ANTLR start "rule__Coordinates__Group__2__Impl"
    // InternalGameoflifeDSL.g:1243:1: rule__Coordinates__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1247:1: ( ( ',' ) )
            // InternalGameoflifeDSL.g:1248:1: ( ',' )
            {
            // InternalGameoflifeDSL.g:1248:1: ( ',' )
            // InternalGameoflifeDSL.g:1249:2: ','
            {
             before(grammarAccess.getCoordinatesAccess().getCommaKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__2__Impl"


    // $ANTLR start "rule__Coordinates__Group__3"
    // InternalGameoflifeDSL.g:1258:1: rule__Coordinates__Group__3 : rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 ;
    public final void rule__Coordinates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1262:1: ( rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 )
            // InternalGameoflifeDSL.g:1263:2: rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Coordinates__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__3"


    // $ANTLR start "rule__Coordinates__Group__3__Impl"
    // InternalGameoflifeDSL.g:1270:1: rule__Coordinates__Group__3__Impl : ( ( rule__Coordinates__YAssignment_3 ) ) ;
    public final void rule__Coordinates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1274:1: ( ( ( rule__Coordinates__YAssignment_3 ) ) )
            // InternalGameoflifeDSL.g:1275:1: ( ( rule__Coordinates__YAssignment_3 ) )
            {
            // InternalGameoflifeDSL.g:1275:1: ( ( rule__Coordinates__YAssignment_3 ) )
            // InternalGameoflifeDSL.g:1276:2: ( rule__Coordinates__YAssignment_3 )
            {
             before(grammarAccess.getCoordinatesAccess().getYAssignment_3()); 
            // InternalGameoflifeDSL.g:1277:2: ( rule__Coordinates__YAssignment_3 )
            // InternalGameoflifeDSL.g:1277:3: rule__Coordinates__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__3__Impl"


    // $ANTLR start "rule__Coordinates__Group__4"
    // InternalGameoflifeDSL.g:1285:1: rule__Coordinates__Group__4 : rule__Coordinates__Group__4__Impl ;
    public final void rule__Coordinates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1289:1: ( rule__Coordinates__Group__4__Impl )
            // InternalGameoflifeDSL.g:1290:2: rule__Coordinates__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__4"


    // $ANTLR start "rule__Coordinates__Group__4__Impl"
    // InternalGameoflifeDSL.g:1296:1: rule__Coordinates__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1300:1: ( ( ')' ) )
            // InternalGameoflifeDSL.g:1301:1: ( ')' )
            {
            // InternalGameoflifeDSL.g:1301:1: ( ')' )
            // InternalGameoflifeDSL.g:1302:2: ')'
            {
             before(grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__4__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__0"
    // InternalGameoflifeDSL.g:1312:1: rule__EvolutionRules__Group__0 : rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1 ;
    public final void rule__EvolutionRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1316:1: ( rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1 )
            // InternalGameoflifeDSL.g:1317:2: rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvolutionRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__0"


    // $ANTLR start "rule__EvolutionRules__Group__0__Impl"
    // InternalGameoflifeDSL.g:1324:1: rule__EvolutionRules__Group__0__Impl : ( () ) ;
    public final void rule__EvolutionRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1328:1: ( ( () ) )
            // InternalGameoflifeDSL.g:1329:1: ( () )
            {
            // InternalGameoflifeDSL.g:1329:1: ( () )
            // InternalGameoflifeDSL.g:1330:2: ()
            {
             before(grammarAccess.getEvolutionRulesAccess().getEvolutionRulesAction_0()); 
            // InternalGameoflifeDSL.g:1331:2: ()
            // InternalGameoflifeDSL.g:1331:3: 
            {
            }

             after(grammarAccess.getEvolutionRulesAccess().getEvolutionRulesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__0__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__1"
    // InternalGameoflifeDSL.g:1339:1: rule__EvolutionRules__Group__1 : rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2 ;
    public final void rule__EvolutionRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1343:1: ( rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2 )
            // InternalGameoflifeDSL.g:1344:2: rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EvolutionRules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__1"


    // $ANTLR start "rule__EvolutionRules__Group__1__Impl"
    // InternalGameoflifeDSL.g:1351:1: rule__EvolutionRules__Group__1__Impl : ( ( rule__EvolutionRules__LiveRulesAssignment_1 )* ) ;
    public final void rule__EvolutionRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1355:1: ( ( ( rule__EvolutionRules__LiveRulesAssignment_1 )* ) )
            // InternalGameoflifeDSL.g:1356:1: ( ( rule__EvolutionRules__LiveRulesAssignment_1 )* )
            {
            // InternalGameoflifeDSL.g:1356:1: ( ( rule__EvolutionRules__LiveRulesAssignment_1 )* )
            // InternalGameoflifeDSL.g:1357:2: ( rule__EvolutionRules__LiveRulesAssignment_1 )*
            {
             before(grammarAccess.getEvolutionRulesAccess().getLiveRulesAssignment_1()); 
            // InternalGameoflifeDSL.g:1358:2: ( rule__EvolutionRules__LiveRulesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:1358:3: rule__EvolutionRules__LiveRulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__EvolutionRules__LiveRulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEvolutionRulesAccess().getLiveRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__1__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__2"
    // InternalGameoflifeDSL.g:1366:1: rule__EvolutionRules__Group__2 : rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3 ;
    public final void rule__EvolutionRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1370:1: ( rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3 )
            // InternalGameoflifeDSL.g:1371:2: rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__EvolutionRules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__2"


    // $ANTLR start "rule__EvolutionRules__Group__2__Impl"
    // InternalGameoflifeDSL.g:1378:1: rule__EvolutionRules__Group__2__Impl : ( ( rule__EvolutionRules__DeadRulesAssignment_2 )* ) ;
    public final void rule__EvolutionRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1382:1: ( ( ( rule__EvolutionRules__DeadRulesAssignment_2 )* ) )
            // InternalGameoflifeDSL.g:1383:1: ( ( rule__EvolutionRules__DeadRulesAssignment_2 )* )
            {
            // InternalGameoflifeDSL.g:1383:1: ( ( rule__EvolutionRules__DeadRulesAssignment_2 )* )
            // InternalGameoflifeDSL.g:1384:2: ( rule__EvolutionRules__DeadRulesAssignment_2 )*
            {
             before(grammarAccess.getEvolutionRulesAccess().getDeadRulesAssignment_2()); 
            // InternalGameoflifeDSL.g:1385:2: ( rule__EvolutionRules__DeadRulesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:1385:3: rule__EvolutionRules__DeadRulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__EvolutionRules__DeadRulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEvolutionRulesAccess().getDeadRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__2__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__3"
    // InternalGameoflifeDSL.g:1393:1: rule__EvolutionRules__Group__3 : rule__EvolutionRules__Group__3__Impl ;
    public final void rule__EvolutionRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1397:1: ( rule__EvolutionRules__Group__3__Impl )
            // InternalGameoflifeDSL.g:1398:2: rule__EvolutionRules__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__3"


    // $ANTLR start "rule__EvolutionRules__Group__3__Impl"
    // InternalGameoflifeDSL.g:1404:1: rule__EvolutionRules__Group__3__Impl : ( ( rule__EvolutionRules__BecomeAliveRulesAssignment_3 )* ) ;
    public final void rule__EvolutionRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1408:1: ( ( ( rule__EvolutionRules__BecomeAliveRulesAssignment_3 )* ) )
            // InternalGameoflifeDSL.g:1409:1: ( ( rule__EvolutionRules__BecomeAliveRulesAssignment_3 )* )
            {
            // InternalGameoflifeDSL.g:1409:1: ( ( rule__EvolutionRules__BecomeAliveRulesAssignment_3 )* )
            // InternalGameoflifeDSL.g:1410:2: ( rule__EvolutionRules__BecomeAliveRulesAssignment_3 )*
            {
             before(grammarAccess.getEvolutionRulesAccess().getBecomeAliveRulesAssignment_3()); 
            // InternalGameoflifeDSL.g:1411:2: ( rule__EvolutionRules__BecomeAliveRulesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:1411:3: rule__EvolutionRules__BecomeAliveRulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__EvolutionRules__BecomeAliveRulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEvolutionRulesAccess().getBecomeAliveRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__3__Impl"


    // $ANTLR start "rule__LiveRules__Group__0"
    // InternalGameoflifeDSL.g:1420:1: rule__LiveRules__Group__0 : rule__LiveRules__Group__0__Impl rule__LiveRules__Group__1 ;
    public final void rule__LiveRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1424:1: ( rule__LiveRules__Group__0__Impl rule__LiveRules__Group__1 )
            // InternalGameoflifeDSL.g:1425:2: rule__LiveRules__Group__0__Impl rule__LiveRules__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__LiveRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiveRules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiveRules__Group__0"


    // $ANTLR start "rule__LiveRules__Group__0__Impl"
    // InternalGameoflifeDSL.g:1432:1: rule__LiveRules__Group__0__Impl : ( 'StayAliveRule' ) ;
    public final void rule__LiveRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1436:1: ( ( 'StayAliveRule' ) )
            // InternalGameoflifeDSL.g:1437:1: ( 'StayAliveRule' )
            {
            // InternalGameoflifeDSL.g:1437:1: ( 'StayAliveRule' )
            // InternalGameoflifeDSL.g:1438:2: 'StayAliveRule'
            {
             before(grammarAccess.getLiveRulesAccess().getStayAliveRuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLiveRulesAccess().getStayAliveRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiveRules__Group__0__Impl"


    // $ANTLR start "rule__LiveRules__Group__1"
    // InternalGameoflifeDSL.g:1447:1: rule__LiveRules__Group__1 : rule__LiveRules__Group__1__Impl ;
    public final void rule__LiveRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1451:1: ( rule__LiveRules__Group__1__Impl )
            // InternalGameoflifeDSL.g:1452:2: rule__LiveRules__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiveRules__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiveRules__Group__1"


    // $ANTLR start "rule__LiveRules__Group__1__Impl"
    // InternalGameoflifeDSL.g:1458:1: rule__LiveRules__Group__1__Impl : ( ( rule__LiveRules__SurroundingCheckAssignment_1 ) ) ;
    public final void rule__LiveRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1462:1: ( ( ( rule__LiveRules__SurroundingCheckAssignment_1 ) ) )
            // InternalGameoflifeDSL.g:1463:1: ( ( rule__LiveRules__SurroundingCheckAssignment_1 ) )
            {
            // InternalGameoflifeDSL.g:1463:1: ( ( rule__LiveRules__SurroundingCheckAssignment_1 ) )
            // InternalGameoflifeDSL.g:1464:2: ( rule__LiveRules__SurroundingCheckAssignment_1 )
            {
             before(grammarAccess.getLiveRulesAccess().getSurroundingCheckAssignment_1()); 
            // InternalGameoflifeDSL.g:1465:2: ( rule__LiveRules__SurroundingCheckAssignment_1 )
            // InternalGameoflifeDSL.g:1465:3: rule__LiveRules__SurroundingCheckAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LiveRules__SurroundingCheckAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLiveRulesAccess().getSurroundingCheckAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiveRules__Group__1__Impl"


    // $ANTLR start "rule__DieRules__Group__0"
    // InternalGameoflifeDSL.g:1474:1: rule__DieRules__Group__0 : rule__DieRules__Group__0__Impl rule__DieRules__Group__1 ;
    public final void rule__DieRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1478:1: ( rule__DieRules__Group__0__Impl rule__DieRules__Group__1 )
            // InternalGameoflifeDSL.g:1479:2: rule__DieRules__Group__0__Impl rule__DieRules__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DieRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DieRules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DieRules__Group__0"


    // $ANTLR start "rule__DieRules__Group__0__Impl"
    // InternalGameoflifeDSL.g:1486:1: rule__DieRules__Group__0__Impl : ( 'DieRule' ) ;
    public final void rule__DieRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1490:1: ( ( 'DieRule' ) )
            // InternalGameoflifeDSL.g:1491:1: ( 'DieRule' )
            {
            // InternalGameoflifeDSL.g:1491:1: ( 'DieRule' )
            // InternalGameoflifeDSL.g:1492:2: 'DieRule'
            {
             before(grammarAccess.getDieRulesAccess().getDieRuleKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDieRulesAccess().getDieRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DieRules__Group__0__Impl"


    // $ANTLR start "rule__DieRules__Group__1"
    // InternalGameoflifeDSL.g:1501:1: rule__DieRules__Group__1 : rule__DieRules__Group__1__Impl ;
    public final void rule__DieRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1505:1: ( rule__DieRules__Group__1__Impl )
            // InternalGameoflifeDSL.g:1506:2: rule__DieRules__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DieRules__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DieRules__Group__1"


    // $ANTLR start "rule__DieRules__Group__1__Impl"
    // InternalGameoflifeDSL.g:1512:1: rule__DieRules__Group__1__Impl : ( ( rule__DieRules__SurroundingCheckAssignment_1 ) ) ;
    public final void rule__DieRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1516:1: ( ( ( rule__DieRules__SurroundingCheckAssignment_1 ) ) )
            // InternalGameoflifeDSL.g:1517:1: ( ( rule__DieRules__SurroundingCheckAssignment_1 ) )
            {
            // InternalGameoflifeDSL.g:1517:1: ( ( rule__DieRules__SurroundingCheckAssignment_1 ) )
            // InternalGameoflifeDSL.g:1518:2: ( rule__DieRules__SurroundingCheckAssignment_1 )
            {
             before(grammarAccess.getDieRulesAccess().getSurroundingCheckAssignment_1()); 
            // InternalGameoflifeDSL.g:1519:2: ( rule__DieRules__SurroundingCheckAssignment_1 )
            // InternalGameoflifeDSL.g:1519:3: rule__DieRules__SurroundingCheckAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DieRules__SurroundingCheckAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDieRulesAccess().getSurroundingCheckAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DieRules__Group__1__Impl"


    // $ANTLR start "rule__BecomeAliveRules__Group__0"
    // InternalGameoflifeDSL.g:1528:1: rule__BecomeAliveRules__Group__0 : rule__BecomeAliveRules__Group__0__Impl rule__BecomeAliveRules__Group__1 ;
    public final void rule__BecomeAliveRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1532:1: ( rule__BecomeAliveRules__Group__0__Impl rule__BecomeAliveRules__Group__1 )
            // InternalGameoflifeDSL.g:1533:2: rule__BecomeAliveRules__Group__0__Impl rule__BecomeAliveRules__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BecomeAliveRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BecomeAliveRules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomeAliveRules__Group__0"


    // $ANTLR start "rule__BecomeAliveRules__Group__0__Impl"
    // InternalGameoflifeDSL.g:1540:1: rule__BecomeAliveRules__Group__0__Impl : ( 'BirthRule' ) ;
    public final void rule__BecomeAliveRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1544:1: ( ( 'BirthRule' ) )
            // InternalGameoflifeDSL.g:1545:1: ( 'BirthRule' )
            {
            // InternalGameoflifeDSL.g:1545:1: ( 'BirthRule' )
            // InternalGameoflifeDSL.g:1546:2: 'BirthRule'
            {
             before(grammarAccess.getBecomeAliveRulesAccess().getBirthRuleKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBecomeAliveRulesAccess().getBirthRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomeAliveRules__Group__0__Impl"


    // $ANTLR start "rule__BecomeAliveRules__Group__1"
    // InternalGameoflifeDSL.g:1555:1: rule__BecomeAliveRules__Group__1 : rule__BecomeAliveRules__Group__1__Impl ;
    public final void rule__BecomeAliveRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1559:1: ( rule__BecomeAliveRules__Group__1__Impl )
            // InternalGameoflifeDSL.g:1560:2: rule__BecomeAliveRules__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BecomeAliveRules__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomeAliveRules__Group__1"


    // $ANTLR start "rule__BecomeAliveRules__Group__1__Impl"
    // InternalGameoflifeDSL.g:1566:1: rule__BecomeAliveRules__Group__1__Impl : ( ( rule__BecomeAliveRules__SurroundingCheckAssignment_1 ) ) ;
    public final void rule__BecomeAliveRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1570:1: ( ( ( rule__BecomeAliveRules__SurroundingCheckAssignment_1 ) ) )
            // InternalGameoflifeDSL.g:1571:1: ( ( rule__BecomeAliveRules__SurroundingCheckAssignment_1 ) )
            {
            // InternalGameoflifeDSL.g:1571:1: ( ( rule__BecomeAliveRules__SurroundingCheckAssignment_1 ) )
            // InternalGameoflifeDSL.g:1572:2: ( rule__BecomeAliveRules__SurroundingCheckAssignment_1 )
            {
             before(grammarAccess.getBecomeAliveRulesAccess().getSurroundingCheckAssignment_1()); 
            // InternalGameoflifeDSL.g:1573:2: ( rule__BecomeAliveRules__SurroundingCheckAssignment_1 )
            // InternalGameoflifeDSL.g:1573:3: rule__BecomeAliveRules__SurroundingCheckAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BecomeAliveRules__SurroundingCheckAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBecomeAliveRulesAccess().getSurroundingCheckAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomeAliveRules__Group__1__Impl"


    // $ANTLR start "rule__SurroundingCheck__Group__0"
    // InternalGameoflifeDSL.g:1582:1: rule__SurroundingCheck__Group__0 : rule__SurroundingCheck__Group__0__Impl rule__SurroundingCheck__Group__1 ;
    public final void rule__SurroundingCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1586:1: ( rule__SurroundingCheck__Group__0__Impl rule__SurroundingCheck__Group__1 )
            // InternalGameoflifeDSL.g:1587:2: rule__SurroundingCheck__Group__0__Impl rule__SurroundingCheck__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__SurroundingCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SurroundingCheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurroundingCheck__Group__0"


    // $ANTLR start "rule__SurroundingCheck__Group__0__Impl"
    // InternalGameoflifeDSL.g:1594:1: rule__SurroundingCheck__Group__0__Impl : ( ( rule__SurroundingCheck__ChecksAssignment_0 ) ) ;
    public final void rule__SurroundingCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1598:1: ( ( ( rule__SurroundingCheck__ChecksAssignment_0 ) ) )
            // InternalGameoflifeDSL.g:1599:1: ( ( rule__SurroundingCheck__ChecksAssignment_0 ) )
            {
            // InternalGameoflifeDSL.g:1599:1: ( ( rule__SurroundingCheck__ChecksAssignment_0 ) )
            // InternalGameoflifeDSL.g:1600:2: ( rule__SurroundingCheck__ChecksAssignment_0 )
            {
             before(grammarAccess.getSurroundingCheckAccess().getChecksAssignment_0()); 
            // InternalGameoflifeDSL.g:1601:2: ( rule__SurroundingCheck__ChecksAssignment_0 )
            // InternalGameoflifeDSL.g:1601:3: rule__SurroundingCheck__ChecksAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SurroundingCheck__ChecksAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSurroundingCheckAccess().getChecksAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurroundingCheck__Group__0__Impl"


    // $ANTLR start "rule__SurroundingCheck__Group__1"
    // InternalGameoflifeDSL.g:1609:1: rule__SurroundingCheck__Group__1 : rule__SurroundingCheck__Group__1__Impl ;
    public final void rule__SurroundingCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1613:1: ( rule__SurroundingCheck__Group__1__Impl )
            // InternalGameoflifeDSL.g:1614:2: rule__SurroundingCheck__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SurroundingCheck__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurroundingCheck__Group__1"


    // $ANTLR start "rule__SurroundingCheck__Group__1__Impl"
    // InternalGameoflifeDSL.g:1620:1: rule__SurroundingCheck__Group__1__Impl : ( ( rule__SurroundingCheck__ExtracheckAssignment_1 )* ) ;
    public final void rule__SurroundingCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1624:1: ( ( ( rule__SurroundingCheck__ExtracheckAssignment_1 )* ) )
            // InternalGameoflifeDSL.g:1625:1: ( ( rule__SurroundingCheck__ExtracheckAssignment_1 )* )
            {
            // InternalGameoflifeDSL.g:1625:1: ( ( rule__SurroundingCheck__ExtracheckAssignment_1 )* )
            // InternalGameoflifeDSL.g:1626:2: ( rule__SurroundingCheck__ExtracheckAssignment_1 )*
            {
             before(grammarAccess.getSurroundingCheckAccess().getExtracheckAssignment_1()); 
            // InternalGameoflifeDSL.g:1627:2: ( rule__SurroundingCheck__ExtracheckAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=14 && LA8_0<=15)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:1627:3: rule__SurroundingCheck__ExtracheckAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SurroundingCheck__ExtracheckAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSurroundingCheckAccess().getExtracheckAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurroundingCheck__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // InternalGameoflifeDSL.g:1636:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1640:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalGameoflifeDSL.g:1641:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // InternalGameoflifeDSL.g:1648:1: rule__Check__Group__0__Impl : ( 'surrounding' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1652:1: ( ( 'surrounding' ) )
            // InternalGameoflifeDSL.g:1653:1: ( 'surrounding' )
            {
            // InternalGameoflifeDSL.g:1653:1: ( 'surrounding' )
            // InternalGameoflifeDSL.g:1654:2: 'surrounding'
            {
             before(grammarAccess.getCheckAccess().getSurroundingKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getSurroundingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // InternalGameoflifeDSL.g:1663:1: rule__Check__Group__1 : rule__Check__Group__1__Impl rule__Check__Group__2 ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1667:1: ( rule__Check__Group__1__Impl rule__Check__Group__2 )
            // InternalGameoflifeDSL.g:1668:2: rule__Check__Group__1__Impl rule__Check__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Check__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // InternalGameoflifeDSL.g:1675:1: rule__Check__Group__1__Impl : ( ( rule__Check__CompareAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1679:1: ( ( ( rule__Check__CompareAssignment_1 ) ) )
            // InternalGameoflifeDSL.g:1680:1: ( ( rule__Check__CompareAssignment_1 ) )
            {
            // InternalGameoflifeDSL.g:1680:1: ( ( rule__Check__CompareAssignment_1 ) )
            // InternalGameoflifeDSL.g:1681:2: ( rule__Check__CompareAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getCompareAssignment_1()); 
            // InternalGameoflifeDSL.g:1682:2: ( rule__Check__CompareAssignment_1 )
            // InternalGameoflifeDSL.g:1682:3: rule__Check__CompareAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__CompareAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getCompareAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__2"
    // InternalGameoflifeDSL.g:1690:1: rule__Check__Group__2 : rule__Check__Group__2__Impl ;
    public final void rule__Check__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1694:1: ( rule__Check__Group__2__Impl )
            // InternalGameoflifeDSL.g:1695:2: rule__Check__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__2"


    // $ANTLR start "rule__Check__Group__2__Impl"
    // InternalGameoflifeDSL.g:1701:1: rule__Check__Group__2__Impl : ( ( rule__Check__IntegerAssignment_2 ) ) ;
    public final void rule__Check__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1705:1: ( ( ( rule__Check__IntegerAssignment_2 ) ) )
            // InternalGameoflifeDSL.g:1706:1: ( ( rule__Check__IntegerAssignment_2 ) )
            {
            // InternalGameoflifeDSL.g:1706:1: ( ( rule__Check__IntegerAssignment_2 ) )
            // InternalGameoflifeDSL.g:1707:2: ( rule__Check__IntegerAssignment_2 )
            {
             before(grammarAccess.getCheckAccess().getIntegerAssignment_2()); 
            // InternalGameoflifeDSL.g:1708:2: ( rule__Check__IntegerAssignment_2 )
            // InternalGameoflifeDSL.g:1708:3: rule__Check__IntegerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Check__IntegerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getIntegerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__2__Impl"


    // $ANTLR start "rule__ExtraCheck__Group__0"
    // InternalGameoflifeDSL.g:1717:1: rule__ExtraCheck__Group__0 : rule__ExtraCheck__Group__0__Impl rule__ExtraCheck__Group__1 ;
    public final void rule__ExtraCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1721:1: ( rule__ExtraCheck__Group__0__Impl rule__ExtraCheck__Group__1 )
            // InternalGameoflifeDSL.g:1722:2: rule__ExtraCheck__Group__0__Impl rule__ExtraCheck__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ExtraCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtraCheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraCheck__Group__0"


    // $ANTLR start "rule__ExtraCheck__Group__0__Impl"
    // InternalGameoflifeDSL.g:1729:1: rule__ExtraCheck__Group__0__Impl : ( ( rule__ExtraCheck__OperatorAssignment_0 ) ) ;
    public final void rule__ExtraCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1733:1: ( ( ( rule__ExtraCheck__OperatorAssignment_0 ) ) )
            // InternalGameoflifeDSL.g:1734:1: ( ( rule__ExtraCheck__OperatorAssignment_0 ) )
            {
            // InternalGameoflifeDSL.g:1734:1: ( ( rule__ExtraCheck__OperatorAssignment_0 ) )
            // InternalGameoflifeDSL.g:1735:2: ( rule__ExtraCheck__OperatorAssignment_0 )
            {
             before(grammarAccess.getExtraCheckAccess().getOperatorAssignment_0()); 
            // InternalGameoflifeDSL.g:1736:2: ( rule__ExtraCheck__OperatorAssignment_0 )
            // InternalGameoflifeDSL.g:1736:3: rule__ExtraCheck__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtraCheck__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtraCheckAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraCheck__Group__0__Impl"


    // $ANTLR start "rule__ExtraCheck__Group__1"
    // InternalGameoflifeDSL.g:1744:1: rule__ExtraCheck__Group__1 : rule__ExtraCheck__Group__1__Impl ;
    public final void rule__ExtraCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1748:1: ( rule__ExtraCheck__Group__1__Impl )
            // InternalGameoflifeDSL.g:1749:2: rule__ExtraCheck__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtraCheck__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraCheck__Group__1"


    // $ANTLR start "rule__ExtraCheck__Group__1__Impl"
    // InternalGameoflifeDSL.g:1755:1: rule__ExtraCheck__Group__1__Impl : ( ( rule__ExtraCheck__CheckAssignment_1 ) ) ;
    public final void rule__ExtraCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1759:1: ( ( ( rule__ExtraCheck__CheckAssignment_1 ) ) )
            // InternalGameoflifeDSL.g:1760:1: ( ( rule__ExtraCheck__CheckAssignment_1 ) )
            {
            // InternalGameoflifeDSL.g:1760:1: ( ( rule__ExtraCheck__CheckAssignment_1 ) )
            // InternalGameoflifeDSL.g:1761:2: ( rule__ExtraCheck__CheckAssignment_1 )
            {
             before(grammarAccess.getExtraCheckAccess().getCheckAssignment_1()); 
            // InternalGameoflifeDSL.g:1762:2: ( rule__ExtraCheck__CheckAssignment_1 )
            // InternalGameoflifeDSL.g:1762:3: rule__ExtraCheck__CheckAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtraCheck__CheckAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtraCheckAccess().getCheckAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraCheck__Group__1__Impl"


    // $ANTLR start "rule__GameStart__InitialGridAssignment_2"
    // InternalGameoflifeDSL.g:1771:1: rule__GameStart__InitialGridAssignment_2 : ( ruleInitialGrid ) ;
    public final void rule__GameStart__InitialGridAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1775:1: ( ( ruleInitialGrid ) )
            // InternalGameoflifeDSL.g:1776:2: ( ruleInitialGrid )
            {
            // InternalGameoflifeDSL.g:1776:2: ( ruleInitialGrid )
            // InternalGameoflifeDSL.g:1777:3: ruleInitialGrid
            {
             before(grammarAccess.getGameStartAccess().getInitialGridInitialGridParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialGrid();

            state._fsp--;

             after(grammarAccess.getGameStartAccess().getInitialGridInitialGridParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__InitialGridAssignment_2"


    // $ANTLR start "rule__GameStart__EvolutionRulesAssignment_3"
    // InternalGameoflifeDSL.g:1786:1: rule__GameStart__EvolutionRulesAssignment_3 : ( ruleEvolutionRules ) ;
    public final void rule__GameStart__EvolutionRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1790:1: ( ( ruleEvolutionRules ) )
            // InternalGameoflifeDSL.g:1791:2: ( ruleEvolutionRules )
            {
            // InternalGameoflifeDSL.g:1791:2: ( ruleEvolutionRules )
            // InternalGameoflifeDSL.g:1792:3: ruleEvolutionRules
            {
             before(grammarAccess.getGameStartAccess().getEvolutionRulesEvolutionRulesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEvolutionRules();

            state._fsp--;

             after(grammarAccess.getGameStartAccess().getEvolutionRulesEvolutionRulesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__EvolutionRulesAssignment_3"


    // $ANTLR start "rule__InitialGrid__CellsAssignment_1_1"
    // InternalGameoflifeDSL.g:1801:1: rule__InitialGrid__CellsAssignment_1_1 : ( ruleCellStatus ) ;
    public final void rule__InitialGrid__CellsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1805:1: ( ( ruleCellStatus ) )
            // InternalGameoflifeDSL.g:1806:2: ( ruleCellStatus )
            {
            // InternalGameoflifeDSL.g:1806:2: ( ruleCellStatus )
            // InternalGameoflifeDSL.g:1807:3: ruleCellStatus
            {
             before(grammarAccess.getInitialGridAccess().getCellsCellStatusParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellStatus();

            state._fsp--;

             after(grammarAccess.getInitialGridAccess().getCellsCellStatusParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__CellsAssignment_1_1"


    // $ANTLR start "rule__InitialGrid__LinesAssignment_2_1"
    // InternalGameoflifeDSL.g:1816:1: rule__InitialGrid__LinesAssignment_2_1 : ( ruleLineStatus ) ;
    public final void rule__InitialGrid__LinesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1820:1: ( ( ruleLineStatus ) )
            // InternalGameoflifeDSL.g:1821:2: ( ruleLineStatus )
            {
            // InternalGameoflifeDSL.g:1821:2: ( ruleLineStatus )
            // InternalGameoflifeDSL.g:1822:3: ruleLineStatus
            {
             before(grammarAccess.getInitialGridAccess().getLinesLineStatusParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLineStatus();

            state._fsp--;

             after(grammarAccess.getInitialGridAccess().getLinesLineStatusParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__LinesAssignment_2_1"


    // $ANTLR start "rule__LineStatus__CoordinatesAssignment"
    // InternalGameoflifeDSL.g:1831:1: rule__LineStatus__CoordinatesAssignment : ( ruleLineCoords ) ;
    public final void rule__LineStatus__CoordinatesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1835:1: ( ( ruleLineCoords ) )
            // InternalGameoflifeDSL.g:1836:2: ( ruleLineCoords )
            {
            // InternalGameoflifeDSL.g:1836:2: ( ruleLineCoords )
            // InternalGameoflifeDSL.g:1837:3: ruleLineCoords
            {
             before(grammarAccess.getLineStatusAccess().getCoordinatesLineCoordsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLineCoords();

            state._fsp--;

             after(grammarAccess.getLineStatusAccess().getCoordinatesLineCoordsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineStatus__CoordinatesAssignment"


    // $ANTLR start "rule__LineCoords__XbegAssignment_2"
    // InternalGameoflifeDSL.g:1846:1: rule__LineCoords__XbegAssignment_2 : ( RULE_INT ) ;
    public final void rule__LineCoords__XbegAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1850:1: ( ( RULE_INT ) )
            // InternalGameoflifeDSL.g:1851:2: ( RULE_INT )
            {
            // InternalGameoflifeDSL.g:1851:2: ( RULE_INT )
            // InternalGameoflifeDSL.g:1852:3: RULE_INT
            {
             before(grammarAccess.getLineCoordsAccess().getXbegINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getXbegINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__XbegAssignment_2"


    // $ANTLR start "rule__LineCoords__XendAssignment_4"
    // InternalGameoflifeDSL.g:1861:1: rule__LineCoords__XendAssignment_4 : ( RULE_INT ) ;
    public final void rule__LineCoords__XendAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1865:1: ( ( RULE_INT ) )
            // InternalGameoflifeDSL.g:1866:2: ( RULE_INT )
            {
            // InternalGameoflifeDSL.g:1866:2: ( RULE_INT )
            // InternalGameoflifeDSL.g:1867:3: RULE_INT
            {
             before(grammarAccess.getLineCoordsAccess().getXendINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getXendINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__XendAssignment_4"


    // $ANTLR start "rule__LineCoords__YbegAssignment_8"
    // InternalGameoflifeDSL.g:1876:1: rule__LineCoords__YbegAssignment_8 : ( RULE_INT ) ;
    public final void rule__LineCoords__YbegAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1880:1: ( ( RULE_INT ) )
            // InternalGameoflifeDSL.g:1881:2: ( RULE_INT )
            {
            // InternalGameoflifeDSL.g:1881:2: ( RULE_INT )
            // InternalGameoflifeDSL.g:1882:3: RULE_INT
            {
             before(grammarAccess.getLineCoordsAccess().getYbegINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getYbegINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__YbegAssignment_8"


    // $ANTLR start "rule__LineCoords__YendAssignment_10"
    // InternalGameoflifeDSL.g:1891:1: rule__LineCoords__YendAssignment_10 : ( RULE_INT ) ;
    public final void rule__LineCoords__YendAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1895:1: ( ( RULE_INT ) )
            // InternalGameoflifeDSL.g:1896:2: ( RULE_INT )
            {
            // InternalGameoflifeDSL.g:1896:2: ( RULE_INT )
            // InternalGameoflifeDSL.g:1897:3: RULE_INT
            {
             before(grammarAccess.getLineCoordsAccess().getYendINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineCoordsAccess().getYendINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineCoords__YendAssignment_10"


    // $ANTLR start "rule__CellStatus__CoordinatesAssignment_1"
    // InternalGameoflifeDSL.g:1906:1: rule__CellStatus__CoordinatesAssignment_1 : ( ruleCoordinates ) ;
    public final void rule__CellStatus__CoordinatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1910:1: ( ( ruleCoordinates ) )
            // InternalGameoflifeDSL.g:1911:2: ( ruleCoordinates )
            {
            // InternalGameoflifeDSL.g:1911:2: ( ruleCoordinates )
            // InternalGameoflifeDSL.g:1912:3: ruleCoordinates
            {
             before(grammarAccess.getCellStatusAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getCellStatusAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStatus__CoordinatesAssignment_1"


    // $ANTLR start "rule__Coordinates__XAssignment_1"
    // InternalGameoflifeDSL.g:1921:1: rule__Coordinates__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Coordinates__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1925:1: ( ( RULE_INT ) )
            // InternalGameoflifeDSL.g:1926:2: ( RULE_INT )
            {
            // InternalGameoflifeDSL.g:1926:2: ( RULE_INT )
            // InternalGameoflifeDSL.g:1927:3: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__XAssignment_1"


    // $ANTLR start "rule__Coordinates__YAssignment_3"
    // InternalGameoflifeDSL.g:1936:1: rule__Coordinates__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Coordinates__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1940:1: ( ( RULE_INT ) )
            // InternalGameoflifeDSL.g:1941:2: ( RULE_INT )
            {
            // InternalGameoflifeDSL.g:1941:2: ( RULE_INT )
            // InternalGameoflifeDSL.g:1942:3: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__YAssignment_3"


    // $ANTLR start "rule__EvolutionRules__LiveRulesAssignment_1"
    // InternalGameoflifeDSL.g:1951:1: rule__EvolutionRules__LiveRulesAssignment_1 : ( ruleLiveRules ) ;
    public final void rule__EvolutionRules__LiveRulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1955:1: ( ( ruleLiveRules ) )
            // InternalGameoflifeDSL.g:1956:2: ( ruleLiveRules )
            {
            // InternalGameoflifeDSL.g:1956:2: ( ruleLiveRules )
            // InternalGameoflifeDSL.g:1957:3: ruleLiveRules
            {
             before(grammarAccess.getEvolutionRulesAccess().getLiveRulesLiveRulesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiveRules();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesAccess().getLiveRulesLiveRulesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__LiveRulesAssignment_1"


    // $ANTLR start "rule__EvolutionRules__DeadRulesAssignment_2"
    // InternalGameoflifeDSL.g:1966:1: rule__EvolutionRules__DeadRulesAssignment_2 : ( ruleDieRules ) ;
    public final void rule__EvolutionRules__DeadRulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1970:1: ( ( ruleDieRules ) )
            // InternalGameoflifeDSL.g:1971:2: ( ruleDieRules )
            {
            // InternalGameoflifeDSL.g:1971:2: ( ruleDieRules )
            // InternalGameoflifeDSL.g:1972:3: ruleDieRules
            {
             before(grammarAccess.getEvolutionRulesAccess().getDeadRulesDieRulesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDieRules();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesAccess().getDeadRulesDieRulesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__DeadRulesAssignment_2"


    // $ANTLR start "rule__EvolutionRules__BecomeAliveRulesAssignment_3"
    // InternalGameoflifeDSL.g:1981:1: rule__EvolutionRules__BecomeAliveRulesAssignment_3 : ( ruleBecomeAliveRules ) ;
    public final void rule__EvolutionRules__BecomeAliveRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:1985:1: ( ( ruleBecomeAliveRules ) )
            // InternalGameoflifeDSL.g:1986:2: ( ruleBecomeAliveRules )
            {
            // InternalGameoflifeDSL.g:1986:2: ( ruleBecomeAliveRules )
            // InternalGameoflifeDSL.g:1987:3: ruleBecomeAliveRules
            {
             before(grammarAccess.getEvolutionRulesAccess().getBecomeAliveRulesBecomeAliveRulesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBecomeAliveRules();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesAccess().getBecomeAliveRulesBecomeAliveRulesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__BecomeAliveRulesAssignment_3"


    // $ANTLR start "rule__LiveRules__SurroundingCheckAssignment_1"
    // InternalGameoflifeDSL.g:1996:1: rule__LiveRules__SurroundingCheckAssignment_1 : ( ruleSurroundingCheck ) ;
    public final void rule__LiveRules__SurroundingCheckAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:2000:1: ( ( ruleSurroundingCheck ) )
            // InternalGameoflifeDSL.g:2001:2: ( ruleSurroundingCheck )
            {
            // InternalGameoflifeDSL.g:2001:2: ( ruleSurroundingCheck )
            // InternalGameoflifeDSL.g:2002:3: ruleSurroundingCheck
            {
             before(grammarAccess.getLiveRulesAccess().getSurroundingCheckSurroundingCheckParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSurroundingCheck();

            state._fsp--;

             after(grammarAccess.getLiveRulesAccess().getSurroundingCheckSurroundingCheckParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiveRules__SurroundingCheckAssignment_1"


    // $ANTLR start "rule__DieRules__SurroundingCheckAssignment_1"
    // InternalGameoflifeDSL.g:2011:1: rule__DieRules__SurroundingCheckAssignment_1 : ( ruleSurroundingCheck ) ;
    public final void rule__DieRules__SurroundingCheckAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:2015:1: ( ( ruleSurroundingCheck ) )
            // InternalGameoflifeDSL.g:2016:2: ( ruleSurroundingCheck )
            {
            // InternalGameoflifeDSL.g:2016:2: ( ruleSurroundingCheck )
            // InternalGameoflifeDSL.g:2017:3: ruleSurroundingCheck
            {
             before(grammarAccess.getDieRulesAccess().getSurroundingCheckSurroundingCheckParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSurroundingCheck();

            state._fsp--;

             after(grammarAccess.getDieRulesAccess().getSurroundingCheckSurroundingCheckParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DieRules__SurroundingCheckAssignment_1"


    // $ANTLR start "rule__BecomeAliveRules__SurroundingCheckAssignment_1"
    // InternalGameoflifeDSL.g:2026:1: rule__BecomeAliveRules__SurroundingCheckAssignment_1 : ( ruleSurroundingCheck ) ;
    public final void rule__BecomeAliveRules__SurroundingCheckAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:2030:1: ( ( ruleSurroundingCheck ) )
            // InternalGameoflifeDSL.g:2031:2: ( ruleSurroundingCheck )
            {
            // InternalGameoflifeDSL.g:2031:2: ( ruleSurroundingCheck )
            // InternalGameoflifeDSL.g:2032:3: ruleSurroundingCheck
            {
             before(grammarAccess.getBecomeAliveRulesAccess().getSurroundingCheckSurroundingCheckParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSurroundingCheck();

            state._fsp--;

             after(grammarAccess.getBecomeAliveRulesAccess().getSurroundingCheckSurroundingCheckParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomeAliveRules__SurroundingCheckAssignment_1"


    // $ANTLR start "rule__SurroundingCheck__ChecksAssignment_0"
    // InternalGameoflifeDSL.g:2041:1: rule__SurroundingCheck__ChecksAssignment_0 : ( ruleCheck ) ;
    public final void rule__SurroundingCheck__ChecksAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:2045:1: ( ( ruleCheck ) )
            // InternalGameoflifeDSL.g:2046:2: ( ruleCheck )
            {
            // InternalGameoflifeDSL.g:2046:2: ( ruleCheck )
            // InternalGameoflifeDSL.g:2047:3: ruleCheck
            {
             before(grammarAccess.getSurroundingCheckAccess().getChecksCheckParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getSurroundingCheckAccess().getChecksCheckParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurroundingCheck__ChecksAssignment_0"


    // $ANTLR start "rule__SurroundingCheck__ExtracheckAssignment_1"
    // InternalGameoflifeDSL.g:2056:1: rule__SurroundingCheck__ExtracheckAssignment_1 : ( ruleExtraCheck ) ;
    public final void rule__SurroundingCheck__ExtracheckAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:2060:1: ( ( ruleExtraCheck ) )
            // InternalGameoflifeDSL.g:2061:2: ( ruleExtraCheck )
            {
            // InternalGameoflifeDSL.g:2061:2: ( ruleExtraCheck )
            // InternalGameoflifeDSL.g:2062:3: ruleExtraCheck
            {
             before(grammarAccess.getSurroundingCheckAccess().getExtracheckExtraCheckParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExtraCheck();

            state._fsp--;

             after(grammarAccess.getSurroundingCheckAccess().getExtracheckExtraCheckParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurroundingCheck__ExtracheckAssignment_1"


    // $ANTLR start "rule__Check__CompareAssignment_1"
    // InternalGameoflifeDSL.g:2071:1: rule__Check__CompareAssignment_1 : ( ruleComparison ) ;
    public final void rule__Check__CompareAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:2075:1: ( ( ruleComparison ) )
            // InternalGameoflifeDSL.g:2076:2: ( ruleComparison )
            {
            // InternalGameoflifeDSL.g:2076:2: ( ruleComparison )
            // InternalGameoflifeDSL.g:2077:3: ruleComparison
            {
             before(grammarAccess.getCheckAccess().getCompareComparisonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getCompareComparisonParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__CompareAssignment_1"


    // $ANTLR start "rule__Check__IntegerAssignment_2"
    // InternalGameoflifeDSL.g:2086:1: rule__Check__IntegerAssignment_2 : ( RULE_INT ) ;
    public final void rule__Check__IntegerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:2090:1: ( ( RULE_INT ) )
            // InternalGameoflifeDSL.g:2091:2: ( RULE_INT )
            {
            // InternalGameoflifeDSL.g:2091:2: ( RULE_INT )
            // InternalGameoflifeDSL.g:2092:3: RULE_INT
            {
             before(grammarAccess.getCheckAccess().getIntegerINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getIntegerINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__IntegerAssignment_2"


    // $ANTLR start "rule__ExtraCheck__OperatorAssignment_0"
    // InternalGameoflifeDSL.g:2101:1: rule__ExtraCheck__OperatorAssignment_0 : ( ruleOperators ) ;
    public final void rule__ExtraCheck__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:2105:1: ( ( ruleOperators ) )
            // InternalGameoflifeDSL.g:2106:2: ( ruleOperators )
            {
            // InternalGameoflifeDSL.g:2106:2: ( ruleOperators )
            // InternalGameoflifeDSL.g:2107:3: ruleOperators
            {
             before(grammarAccess.getExtraCheckAccess().getOperatorOperatorsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperators();

            state._fsp--;

             after(grammarAccess.getExtraCheckAccess().getOperatorOperatorsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraCheck__OperatorAssignment_0"


    // $ANTLR start "rule__ExtraCheck__CheckAssignment_1"
    // InternalGameoflifeDSL.g:2116:1: rule__ExtraCheck__CheckAssignment_1 : ( ruleCheck ) ;
    public final void rule__ExtraCheck__CheckAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameoflifeDSL.g:2120:1: ( ( ruleCheck ) )
            // InternalGameoflifeDSL.g:2121:2: ( ruleCheck )
            {
            // InternalGameoflifeDSL.g:2121:2: ( ruleCheck )
            // InternalGameoflifeDSL.g:2122:3: ruleCheck
            {
             before(grammarAccess.getExtraCheckAccess().getCheckCheckParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getExtraCheckAccess().getCheckCheckParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraCheck__CheckAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003800L});

}