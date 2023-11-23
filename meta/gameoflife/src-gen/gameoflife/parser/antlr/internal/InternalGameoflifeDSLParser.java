package gameoflife.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gameoflife.services.GameoflifeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameoflifeDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GameStart'", "'{'", "'}'", "'Draw'", "'Many'", "'('", "'to'", "')'", "':'", "'Cell'", "','", "'StayAliveRule'", "'DieRule'", "'BirthRule'", "'surrounding'", "'<'", "'='", "'>'", "'and'", "'or'"
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

        public InternalGameoflifeDSLParser(TokenStream input, GameoflifeDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GameStart";
       	}

       	@Override
       	protected GameoflifeDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGameStart"
    // InternalGameoflifeDSL.g:64:1: entryRuleGameStart returns [EObject current=null] : iv_ruleGameStart= ruleGameStart EOF ;
    public final EObject entryRuleGameStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameStart = null;


        try {
            // InternalGameoflifeDSL.g:64:50: (iv_ruleGameStart= ruleGameStart EOF )
            // InternalGameoflifeDSL.g:65:2: iv_ruleGameStart= ruleGameStart EOF
            {
             newCompositeNode(grammarAccess.getGameStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameStart=ruleGameStart();

            state._fsp--;

             current =iv_ruleGameStart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGameStart"


    // $ANTLR start "ruleGameStart"
    // InternalGameoflifeDSL.g:71:1: ruleGameStart returns [EObject current=null] : (otherlv_0= 'GameStart' otherlv_1= '{' ( (lv_initialGrid_2_0= ruleInitialGrid ) ) ( (lv_evolutionRules_3_0= ruleEvolutionRules ) ) otherlv_4= '}' ) ;
    public final EObject ruleGameStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_initialGrid_2_0 = null;

        EObject lv_evolutionRules_3_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:77:2: ( (otherlv_0= 'GameStart' otherlv_1= '{' ( (lv_initialGrid_2_0= ruleInitialGrid ) ) ( (lv_evolutionRules_3_0= ruleEvolutionRules ) ) otherlv_4= '}' ) )
            // InternalGameoflifeDSL.g:78:2: (otherlv_0= 'GameStart' otherlv_1= '{' ( (lv_initialGrid_2_0= ruleInitialGrid ) ) ( (lv_evolutionRules_3_0= ruleEvolutionRules ) ) otherlv_4= '}' )
            {
            // InternalGameoflifeDSL.g:78:2: (otherlv_0= 'GameStart' otherlv_1= '{' ( (lv_initialGrid_2_0= ruleInitialGrid ) ) ( (lv_evolutionRules_3_0= ruleEvolutionRules ) ) otherlv_4= '}' )
            // InternalGameoflifeDSL.g:79:3: otherlv_0= 'GameStart' otherlv_1= '{' ( (lv_initialGrid_2_0= ruleInitialGrid ) ) ( (lv_evolutionRules_3_0= ruleEvolutionRules ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameStartAccess().getGameStartKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGameStartAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGameoflifeDSL.g:87:3: ( (lv_initialGrid_2_0= ruleInitialGrid ) )
            // InternalGameoflifeDSL.g:88:4: (lv_initialGrid_2_0= ruleInitialGrid )
            {
            // InternalGameoflifeDSL.g:88:4: (lv_initialGrid_2_0= ruleInitialGrid )
            // InternalGameoflifeDSL.g:89:5: lv_initialGrid_2_0= ruleInitialGrid
            {

            					newCompositeNode(grammarAccess.getGameStartAccess().getInitialGridInitialGridParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_initialGrid_2_0=ruleInitialGrid();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameStartRule());
            					}
            					set(
            						current,
            						"initialGrid",
            						lv_initialGrid_2_0,
            						"gameoflife.GameoflifeDSL.InitialGrid");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGameoflifeDSL.g:106:3: ( (lv_evolutionRules_3_0= ruleEvolutionRules ) )
            // InternalGameoflifeDSL.g:107:4: (lv_evolutionRules_3_0= ruleEvolutionRules )
            {
            // InternalGameoflifeDSL.g:107:4: (lv_evolutionRules_3_0= ruleEvolutionRules )
            // InternalGameoflifeDSL.g:108:5: lv_evolutionRules_3_0= ruleEvolutionRules
            {

            					newCompositeNode(grammarAccess.getGameStartAccess().getEvolutionRulesEvolutionRulesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_evolutionRules_3_0=ruleEvolutionRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameStartRule());
            					}
            					add(
            						current,
            						"evolutionRules",
            						lv_evolutionRules_3_0,
            						"gameoflife.GameoflifeDSL.EvolutionRules");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGameStartAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGameStart"


    // $ANTLR start "entryRuleInitialGrid"
    // InternalGameoflifeDSL.g:133:1: entryRuleInitialGrid returns [EObject current=null] : iv_ruleInitialGrid= ruleInitialGrid EOF ;
    public final EObject entryRuleInitialGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialGrid = null;


        try {
            // InternalGameoflifeDSL.g:133:52: (iv_ruleInitialGrid= ruleInitialGrid EOF )
            // InternalGameoflifeDSL.g:134:2: iv_ruleInitialGrid= ruleInitialGrid EOF
            {
             newCompositeNode(grammarAccess.getInitialGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialGrid=ruleInitialGrid();

            state._fsp--;

             current =iv_ruleInitialGrid; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitialGrid"


    // $ANTLR start "ruleInitialGrid"
    // InternalGameoflifeDSL.g:140:1: ruleInitialGrid returns [EObject current=null] : ( () (otherlv_1= 'Draw' ( (lv_cells_2_0= ruleCellStatus ) ) )* (otherlv_3= 'Draw' ( (lv_lines_4_0= ruleLineStatus ) ) )* ) ;
    public final EObject ruleInitialGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cells_2_0 = null;

        EObject lv_lines_4_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:146:2: ( ( () (otherlv_1= 'Draw' ( (lv_cells_2_0= ruleCellStatus ) ) )* (otherlv_3= 'Draw' ( (lv_lines_4_0= ruleLineStatus ) ) )* ) )
            // InternalGameoflifeDSL.g:147:2: ( () (otherlv_1= 'Draw' ( (lv_cells_2_0= ruleCellStatus ) ) )* (otherlv_3= 'Draw' ( (lv_lines_4_0= ruleLineStatus ) ) )* )
            {
            // InternalGameoflifeDSL.g:147:2: ( () (otherlv_1= 'Draw' ( (lv_cells_2_0= ruleCellStatus ) ) )* (otherlv_3= 'Draw' ( (lv_lines_4_0= ruleLineStatus ) ) )* )
            // InternalGameoflifeDSL.g:148:3: () (otherlv_1= 'Draw' ( (lv_cells_2_0= ruleCellStatus ) ) )* (otherlv_3= 'Draw' ( (lv_lines_4_0= ruleLineStatus ) ) )*
            {
            // InternalGameoflifeDSL.g:148:3: ()
            // InternalGameoflifeDSL.g:149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialGridAccess().getInitialGridAction_0(),
            					current);
            			

            }

            // InternalGameoflifeDSL.g:155:3: (otherlv_1= 'Draw' ( (lv_cells_2_0= ruleCellStatus ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==20) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:156:4: otherlv_1= 'Draw' ( (lv_cells_2_0= ruleCellStatus ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInitialGridAccess().getDrawKeyword_1_0());
            	    			
            	    // InternalGameoflifeDSL.g:160:4: ( (lv_cells_2_0= ruleCellStatus ) )
            	    // InternalGameoflifeDSL.g:161:5: (lv_cells_2_0= ruleCellStatus )
            	    {
            	    // InternalGameoflifeDSL.g:161:5: (lv_cells_2_0= ruleCellStatus )
            	    // InternalGameoflifeDSL.g:162:6: lv_cells_2_0= ruleCellStatus
            	    {

            	    						newCompositeNode(grammarAccess.getInitialGridAccess().getCellsCellStatusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_cells_2_0=ruleCellStatus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInitialGridRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cells",
            	    							lv_cells_2_0,
            	    							"gameoflife.GameoflifeDSL.CellStatus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGameoflifeDSL.g:180:3: (otherlv_3= 'Draw' ( (lv_lines_4_0= ruleLineStatus ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:181:4: otherlv_3= 'Draw' ( (lv_lines_4_0= ruleLineStatus ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getInitialGridAccess().getDrawKeyword_2_0());
            	    			
            	    // InternalGameoflifeDSL.g:185:4: ( (lv_lines_4_0= ruleLineStatus ) )
            	    // InternalGameoflifeDSL.g:186:5: (lv_lines_4_0= ruleLineStatus )
            	    {
            	    // InternalGameoflifeDSL.g:186:5: (lv_lines_4_0= ruleLineStatus )
            	    // InternalGameoflifeDSL.g:187:6: lv_lines_4_0= ruleLineStatus
            	    {

            	    						newCompositeNode(grammarAccess.getInitialGridAccess().getLinesLineStatusParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_lines_4_0=ruleLineStatus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInitialGridRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lines",
            	    							lv_lines_4_0,
            	    							"gameoflife.GameoflifeDSL.LineStatus");
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
    // $ANTLR end "ruleInitialGrid"


    // $ANTLR start "entryRuleLineStatus"
    // InternalGameoflifeDSL.g:209:1: entryRuleLineStatus returns [EObject current=null] : iv_ruleLineStatus= ruleLineStatus EOF ;
    public final EObject entryRuleLineStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStatus = null;


        try {
            // InternalGameoflifeDSL.g:209:51: (iv_ruleLineStatus= ruleLineStatus EOF )
            // InternalGameoflifeDSL.g:210:2: iv_ruleLineStatus= ruleLineStatus EOF
            {
             newCompositeNode(grammarAccess.getLineStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineStatus=ruleLineStatus();

            state._fsp--;

             current =iv_ruleLineStatus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineStatus"


    // $ANTLR start "ruleLineStatus"
    // InternalGameoflifeDSL.g:216:1: ruleLineStatus returns [EObject current=null] : ( (lv_coordinates_0_0= ruleLineCoords ) ) ;
    public final EObject ruleLineStatus() throws RecognitionException {
        EObject current = null;

        EObject lv_coordinates_0_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:222:2: ( ( (lv_coordinates_0_0= ruleLineCoords ) ) )
            // InternalGameoflifeDSL.g:223:2: ( (lv_coordinates_0_0= ruleLineCoords ) )
            {
            // InternalGameoflifeDSL.g:223:2: ( (lv_coordinates_0_0= ruleLineCoords ) )
            // InternalGameoflifeDSL.g:224:3: (lv_coordinates_0_0= ruleLineCoords )
            {
            // InternalGameoflifeDSL.g:224:3: (lv_coordinates_0_0= ruleLineCoords )
            // InternalGameoflifeDSL.g:225:4: lv_coordinates_0_0= ruleLineCoords
            {

            				newCompositeNode(grammarAccess.getLineStatusAccess().getCoordinatesLineCoordsParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_coordinates_0_0=ruleLineCoords();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLineStatusRule());
            				}
            				set(
            					current,
            					"coordinates",
            					lv_coordinates_0_0,
            					"gameoflife.GameoflifeDSL.LineCoords");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleLineStatus"


    // $ANTLR start "entryRuleLineCoords"
    // InternalGameoflifeDSL.g:245:1: entryRuleLineCoords returns [EObject current=null] : iv_ruleLineCoords= ruleLineCoords EOF ;
    public final EObject entryRuleLineCoords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineCoords = null;


        try {
            // InternalGameoflifeDSL.g:245:51: (iv_ruleLineCoords= ruleLineCoords EOF )
            // InternalGameoflifeDSL.g:246:2: iv_ruleLineCoords= ruleLineCoords EOF
            {
             newCompositeNode(grammarAccess.getLineCoordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineCoords=ruleLineCoords();

            state._fsp--;

             current =iv_ruleLineCoords; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineCoords"


    // $ANTLR start "ruleLineCoords"
    // InternalGameoflifeDSL.g:252:1: ruleLineCoords returns [EObject current=null] : (otherlv_0= 'Many' otherlv_1= '(' ( (lv_xbeg_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_xend_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '(' ( (lv_ybeg_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_yend_10_0= RULE_INT ) ) otherlv_11= ')' ) ;
    public final EObject ruleLineCoords() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_xbeg_2_0=null;
        Token otherlv_3=null;
        Token lv_xend_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_ybeg_8_0=null;
        Token otherlv_9=null;
        Token lv_yend_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalGameoflifeDSL.g:258:2: ( (otherlv_0= 'Many' otherlv_1= '(' ( (lv_xbeg_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_xend_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '(' ( (lv_ybeg_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_yend_10_0= RULE_INT ) ) otherlv_11= ')' ) )
            // InternalGameoflifeDSL.g:259:2: (otherlv_0= 'Many' otherlv_1= '(' ( (lv_xbeg_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_xend_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '(' ( (lv_ybeg_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_yend_10_0= RULE_INT ) ) otherlv_11= ')' )
            {
            // InternalGameoflifeDSL.g:259:2: (otherlv_0= 'Many' otherlv_1= '(' ( (lv_xbeg_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_xend_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '(' ( (lv_ybeg_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_yend_10_0= RULE_INT ) ) otherlv_11= ')' )
            // InternalGameoflifeDSL.g:260:3: otherlv_0= 'Many' otherlv_1= '(' ( (lv_xbeg_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_xend_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '(' ( (lv_ybeg_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_yend_10_0= RULE_INT ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLineCoordsAccess().getManyKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLineCoordsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGameoflifeDSL.g:268:3: ( (lv_xbeg_2_0= RULE_INT ) )
            // InternalGameoflifeDSL.g:269:4: (lv_xbeg_2_0= RULE_INT )
            {
            // InternalGameoflifeDSL.g:269:4: (lv_xbeg_2_0= RULE_INT )
            // InternalGameoflifeDSL.g:270:5: lv_xbeg_2_0= RULE_INT
            {
            lv_xbeg_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_xbeg_2_0, grammarAccess.getLineCoordsAccess().getXbegINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineCoordsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xbeg",
            						lv_xbeg_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getLineCoordsAccess().getToKeyword_3());
            		
            // InternalGameoflifeDSL.g:290:3: ( (lv_xend_4_0= RULE_INT ) )
            // InternalGameoflifeDSL.g:291:4: (lv_xend_4_0= RULE_INT )
            {
            // InternalGameoflifeDSL.g:291:4: (lv_xend_4_0= RULE_INT )
            // InternalGameoflifeDSL.g:292:5: lv_xend_4_0= RULE_INT
            {
            lv_xend_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_xend_4_0, grammarAccess.getLineCoordsAccess().getXendINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineCoordsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xend",
            						lv_xend_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getLineCoordsAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getLineCoordsAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getLineCoordsAccess().getLeftParenthesisKeyword_7());
            		
            // InternalGameoflifeDSL.g:320:3: ( (lv_ybeg_8_0= RULE_INT ) )
            // InternalGameoflifeDSL.g:321:4: (lv_ybeg_8_0= RULE_INT )
            {
            // InternalGameoflifeDSL.g:321:4: (lv_ybeg_8_0= RULE_INT )
            // InternalGameoflifeDSL.g:322:5: lv_ybeg_8_0= RULE_INT
            {
            lv_ybeg_8_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_ybeg_8_0, grammarAccess.getLineCoordsAccess().getYbegINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineCoordsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ybeg",
            						lv_ybeg_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getLineCoordsAccess().getToKeyword_9());
            		
            // InternalGameoflifeDSL.g:342:3: ( (lv_yend_10_0= RULE_INT ) )
            // InternalGameoflifeDSL.g:343:4: (lv_yend_10_0= RULE_INT )
            {
            // InternalGameoflifeDSL.g:343:4: (lv_yend_10_0= RULE_INT )
            // InternalGameoflifeDSL.g:344:5: lv_yend_10_0= RULE_INT
            {
            lv_yend_10_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_yend_10_0, grammarAccess.getLineCoordsAccess().getYendINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineCoordsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"yend",
            						lv_yend_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLineCoordsAccess().getRightParenthesisKeyword_11());
            		

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
    // $ANTLR end "ruleLineCoords"


    // $ANTLR start "entryRuleCellStatus"
    // InternalGameoflifeDSL.g:368:1: entryRuleCellStatus returns [EObject current=null] : iv_ruleCellStatus= ruleCellStatus EOF ;
    public final EObject entryRuleCellStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellStatus = null;


        try {
            // InternalGameoflifeDSL.g:368:51: (iv_ruleCellStatus= ruleCellStatus EOF )
            // InternalGameoflifeDSL.g:369:2: iv_ruleCellStatus= ruleCellStatus EOF
            {
             newCompositeNode(grammarAccess.getCellStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellStatus=ruleCellStatus();

            state._fsp--;

             current =iv_ruleCellStatus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCellStatus"


    // $ANTLR start "ruleCellStatus"
    // InternalGameoflifeDSL.g:375:1: ruleCellStatus returns [EObject current=null] : (otherlv_0= 'Cell' ( (lv_coordinates_1_0= ruleCoordinates ) ) ) ;
    public final EObject ruleCellStatus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_coordinates_1_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:381:2: ( (otherlv_0= 'Cell' ( (lv_coordinates_1_0= ruleCoordinates ) ) ) )
            // InternalGameoflifeDSL.g:382:2: (otherlv_0= 'Cell' ( (lv_coordinates_1_0= ruleCoordinates ) ) )
            {
            // InternalGameoflifeDSL.g:382:2: (otherlv_0= 'Cell' ( (lv_coordinates_1_0= ruleCoordinates ) ) )
            // InternalGameoflifeDSL.g:383:3: otherlv_0= 'Cell' ( (lv_coordinates_1_0= ruleCoordinates ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCellStatusAccess().getCellKeyword_0());
            		
            // InternalGameoflifeDSL.g:387:3: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // InternalGameoflifeDSL.g:388:4: (lv_coordinates_1_0= ruleCoordinates )
            {
            // InternalGameoflifeDSL.g:388:4: (lv_coordinates_1_0= ruleCoordinates )
            // InternalGameoflifeDSL.g:389:5: lv_coordinates_1_0= ruleCoordinates
            {

            					newCompositeNode(grammarAccess.getCellStatusAccess().getCoordinatesCoordinatesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_coordinates_1_0=ruleCoordinates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellStatusRule());
            					}
            					set(
            						current,
            						"coordinates",
            						lv_coordinates_1_0,
            						"gameoflife.GameoflifeDSL.Coordinates");
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
    // $ANTLR end "ruleCellStatus"


    // $ANTLR start "entryRuleCoordinates"
    // InternalGameoflifeDSL.g:410:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // InternalGameoflifeDSL.g:410:52: (iv_ruleCoordinates= ruleCoordinates EOF )
            // InternalGameoflifeDSL.g:411:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
             newCompositeNode(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinates=ruleCoordinates();

            state._fsp--;

             current =iv_ruleCoordinates; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCoordinates"


    // $ANTLR start "ruleCoordinates"
    // InternalGameoflifeDSL.g:417:1: ruleCoordinates returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGameoflifeDSL.g:423:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalGameoflifeDSL.g:424:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalGameoflifeDSL.g:424:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalGameoflifeDSL.g:425:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGameoflifeDSL.g:429:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalGameoflifeDSL.g:430:4: (lv_x_1_0= RULE_INT )
            {
            // InternalGameoflifeDSL.g:430:4: (lv_x_1_0= RULE_INT )
            // InternalGameoflifeDSL.g:431:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_x_1_0, grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinatesAccess().getCommaKeyword_2());
            		
            // InternalGameoflifeDSL.g:451:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalGameoflifeDSL.g:452:4: (lv_y_3_0= RULE_INT )
            {
            // InternalGameoflifeDSL.g:452:4: (lv_y_3_0= RULE_INT )
            // InternalGameoflifeDSL.g:453:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_y_3_0, grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCoordinates"


    // $ANTLR start "entryRuleEvolutionRules"
    // InternalGameoflifeDSL.g:477:1: entryRuleEvolutionRules returns [EObject current=null] : iv_ruleEvolutionRules= ruleEvolutionRules EOF ;
    public final EObject entryRuleEvolutionRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvolutionRules = null;


        try {
            // InternalGameoflifeDSL.g:477:55: (iv_ruleEvolutionRules= ruleEvolutionRules EOF )
            // InternalGameoflifeDSL.g:478:2: iv_ruleEvolutionRules= ruleEvolutionRules EOF
            {
             newCompositeNode(grammarAccess.getEvolutionRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvolutionRules=ruleEvolutionRules();

            state._fsp--;

             current =iv_ruleEvolutionRules; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvolutionRules"


    // $ANTLR start "ruleEvolutionRules"
    // InternalGameoflifeDSL.g:484:1: ruleEvolutionRules returns [EObject current=null] : ( () ( (lv_liveRules_1_0= ruleLiveRules ) )* ( (lv_deadRules_2_0= ruleDieRules ) )* ( (lv_becomeAliveRules_3_0= ruleBecomeAliveRules ) )* ) ;
    public final EObject ruleEvolutionRules() throws RecognitionException {
        EObject current = null;

        EObject lv_liveRules_1_0 = null;

        EObject lv_deadRules_2_0 = null;

        EObject lv_becomeAliveRules_3_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:490:2: ( ( () ( (lv_liveRules_1_0= ruleLiveRules ) )* ( (lv_deadRules_2_0= ruleDieRules ) )* ( (lv_becomeAliveRules_3_0= ruleBecomeAliveRules ) )* ) )
            // InternalGameoflifeDSL.g:491:2: ( () ( (lv_liveRules_1_0= ruleLiveRules ) )* ( (lv_deadRules_2_0= ruleDieRules ) )* ( (lv_becomeAliveRules_3_0= ruleBecomeAliveRules ) )* )
            {
            // InternalGameoflifeDSL.g:491:2: ( () ( (lv_liveRules_1_0= ruleLiveRules ) )* ( (lv_deadRules_2_0= ruleDieRules ) )* ( (lv_becomeAliveRules_3_0= ruleBecomeAliveRules ) )* )
            // InternalGameoflifeDSL.g:492:3: () ( (lv_liveRules_1_0= ruleLiveRules ) )* ( (lv_deadRules_2_0= ruleDieRules ) )* ( (lv_becomeAliveRules_3_0= ruleBecomeAliveRules ) )*
            {
            // InternalGameoflifeDSL.g:492:3: ()
            // InternalGameoflifeDSL.g:493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvolutionRulesAccess().getEvolutionRulesAction_0(),
            					current);
            			

            }

            // InternalGameoflifeDSL.g:499:3: ( (lv_liveRules_1_0= ruleLiveRules ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:500:4: (lv_liveRules_1_0= ruleLiveRules )
            	    {
            	    // InternalGameoflifeDSL.g:500:4: (lv_liveRules_1_0= ruleLiveRules )
            	    // InternalGameoflifeDSL.g:501:5: lv_liveRules_1_0= ruleLiveRules
            	    {

            	    					newCompositeNode(grammarAccess.getEvolutionRulesAccess().getLiveRulesLiveRulesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_liveRules_1_0=ruleLiveRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEvolutionRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"liveRules",
            	    						lv_liveRules_1_0,
            	    						"gameoflife.GameoflifeDSL.LiveRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalGameoflifeDSL.g:518:3: ( (lv_deadRules_2_0= ruleDieRules ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:519:4: (lv_deadRules_2_0= ruleDieRules )
            	    {
            	    // InternalGameoflifeDSL.g:519:4: (lv_deadRules_2_0= ruleDieRules )
            	    // InternalGameoflifeDSL.g:520:5: lv_deadRules_2_0= ruleDieRules
            	    {

            	    					newCompositeNode(grammarAccess.getEvolutionRulesAccess().getDeadRulesDieRulesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_deadRules_2_0=ruleDieRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEvolutionRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deadRules",
            	    						lv_deadRules_2_0,
            	    						"gameoflife.GameoflifeDSL.DieRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGameoflifeDSL.g:537:3: ( (lv_becomeAliveRules_3_0= ruleBecomeAliveRules ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:538:4: (lv_becomeAliveRules_3_0= ruleBecomeAliveRules )
            	    {
            	    // InternalGameoflifeDSL.g:538:4: (lv_becomeAliveRules_3_0= ruleBecomeAliveRules )
            	    // InternalGameoflifeDSL.g:539:5: lv_becomeAliveRules_3_0= ruleBecomeAliveRules
            	    {

            	    					newCompositeNode(grammarAccess.getEvolutionRulesAccess().getBecomeAliveRulesBecomeAliveRulesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_becomeAliveRules_3_0=ruleBecomeAliveRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEvolutionRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"becomeAliveRules",
            	    						lv_becomeAliveRules_3_0,
            	    						"gameoflife.GameoflifeDSL.BecomeAliveRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleEvolutionRules"


    // $ANTLR start "entryRuleLiveRules"
    // InternalGameoflifeDSL.g:560:1: entryRuleLiveRules returns [EObject current=null] : iv_ruleLiveRules= ruleLiveRules EOF ;
    public final EObject entryRuleLiveRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiveRules = null;


        try {
            // InternalGameoflifeDSL.g:560:50: (iv_ruleLiveRules= ruleLiveRules EOF )
            // InternalGameoflifeDSL.g:561:2: iv_ruleLiveRules= ruleLiveRules EOF
            {
             newCompositeNode(grammarAccess.getLiveRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiveRules=ruleLiveRules();

            state._fsp--;

             current =iv_ruleLiveRules; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiveRules"


    // $ANTLR start "ruleLiveRules"
    // InternalGameoflifeDSL.g:567:1: ruleLiveRules returns [EObject current=null] : (otherlv_0= 'StayAliveRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) ) ;
    public final EObject ruleLiveRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_surroundingCheck_1_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:573:2: ( (otherlv_0= 'StayAliveRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) ) )
            // InternalGameoflifeDSL.g:574:2: (otherlv_0= 'StayAliveRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) )
            {
            // InternalGameoflifeDSL.g:574:2: (otherlv_0= 'StayAliveRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) )
            // InternalGameoflifeDSL.g:575:3: otherlv_0= 'StayAliveRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getLiveRulesAccess().getStayAliveRuleKeyword_0());
            		
            // InternalGameoflifeDSL.g:579:3: ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) )
            // InternalGameoflifeDSL.g:580:4: (lv_surroundingCheck_1_0= ruleSurroundingCheck )
            {
            // InternalGameoflifeDSL.g:580:4: (lv_surroundingCheck_1_0= ruleSurroundingCheck )
            // InternalGameoflifeDSL.g:581:5: lv_surroundingCheck_1_0= ruleSurroundingCheck
            {

            					newCompositeNode(grammarAccess.getLiveRulesAccess().getSurroundingCheckSurroundingCheckParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_surroundingCheck_1_0=ruleSurroundingCheck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLiveRulesRule());
            					}
            					set(
            						current,
            						"surroundingCheck",
            						lv_surroundingCheck_1_0,
            						"gameoflife.GameoflifeDSL.SurroundingCheck");
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
    // $ANTLR end "ruleLiveRules"


    // $ANTLR start "entryRuleDieRules"
    // InternalGameoflifeDSL.g:602:1: entryRuleDieRules returns [EObject current=null] : iv_ruleDieRules= ruleDieRules EOF ;
    public final EObject entryRuleDieRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDieRules = null;


        try {
            // InternalGameoflifeDSL.g:602:49: (iv_ruleDieRules= ruleDieRules EOF )
            // InternalGameoflifeDSL.g:603:2: iv_ruleDieRules= ruleDieRules EOF
            {
             newCompositeNode(grammarAccess.getDieRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDieRules=ruleDieRules();

            state._fsp--;

             current =iv_ruleDieRules; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDieRules"


    // $ANTLR start "ruleDieRules"
    // InternalGameoflifeDSL.g:609:1: ruleDieRules returns [EObject current=null] : (otherlv_0= 'DieRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) ) ;
    public final EObject ruleDieRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_surroundingCheck_1_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:615:2: ( (otherlv_0= 'DieRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) ) )
            // InternalGameoflifeDSL.g:616:2: (otherlv_0= 'DieRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) )
            {
            // InternalGameoflifeDSL.g:616:2: (otherlv_0= 'DieRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) )
            // InternalGameoflifeDSL.g:617:3: otherlv_0= 'DieRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDieRulesAccess().getDieRuleKeyword_0());
            		
            // InternalGameoflifeDSL.g:621:3: ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) )
            // InternalGameoflifeDSL.g:622:4: (lv_surroundingCheck_1_0= ruleSurroundingCheck )
            {
            // InternalGameoflifeDSL.g:622:4: (lv_surroundingCheck_1_0= ruleSurroundingCheck )
            // InternalGameoflifeDSL.g:623:5: lv_surroundingCheck_1_0= ruleSurroundingCheck
            {

            					newCompositeNode(grammarAccess.getDieRulesAccess().getSurroundingCheckSurroundingCheckParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_surroundingCheck_1_0=ruleSurroundingCheck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDieRulesRule());
            					}
            					set(
            						current,
            						"surroundingCheck",
            						lv_surroundingCheck_1_0,
            						"gameoflife.GameoflifeDSL.SurroundingCheck");
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
    // $ANTLR end "ruleDieRules"


    // $ANTLR start "entryRuleBecomeAliveRules"
    // InternalGameoflifeDSL.g:644:1: entryRuleBecomeAliveRules returns [EObject current=null] : iv_ruleBecomeAliveRules= ruleBecomeAliveRules EOF ;
    public final EObject entryRuleBecomeAliveRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBecomeAliveRules = null;


        try {
            // InternalGameoflifeDSL.g:644:57: (iv_ruleBecomeAliveRules= ruleBecomeAliveRules EOF )
            // InternalGameoflifeDSL.g:645:2: iv_ruleBecomeAliveRules= ruleBecomeAliveRules EOF
            {
             newCompositeNode(grammarAccess.getBecomeAliveRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBecomeAliveRules=ruleBecomeAliveRules();

            state._fsp--;

             current =iv_ruleBecomeAliveRules; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBecomeAliveRules"


    // $ANTLR start "ruleBecomeAliveRules"
    // InternalGameoflifeDSL.g:651:1: ruleBecomeAliveRules returns [EObject current=null] : (otherlv_0= 'BirthRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) ) ;
    public final EObject ruleBecomeAliveRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_surroundingCheck_1_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:657:2: ( (otherlv_0= 'BirthRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) ) )
            // InternalGameoflifeDSL.g:658:2: (otherlv_0= 'BirthRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) )
            {
            // InternalGameoflifeDSL.g:658:2: (otherlv_0= 'BirthRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) ) )
            // InternalGameoflifeDSL.g:659:3: otherlv_0= 'BirthRule' ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getBecomeAliveRulesAccess().getBirthRuleKeyword_0());
            		
            // InternalGameoflifeDSL.g:663:3: ( (lv_surroundingCheck_1_0= ruleSurroundingCheck ) )
            // InternalGameoflifeDSL.g:664:4: (lv_surroundingCheck_1_0= ruleSurroundingCheck )
            {
            // InternalGameoflifeDSL.g:664:4: (lv_surroundingCheck_1_0= ruleSurroundingCheck )
            // InternalGameoflifeDSL.g:665:5: lv_surroundingCheck_1_0= ruleSurroundingCheck
            {

            					newCompositeNode(grammarAccess.getBecomeAliveRulesAccess().getSurroundingCheckSurroundingCheckParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_surroundingCheck_1_0=ruleSurroundingCheck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBecomeAliveRulesRule());
            					}
            					set(
            						current,
            						"surroundingCheck",
            						lv_surroundingCheck_1_0,
            						"gameoflife.GameoflifeDSL.SurroundingCheck");
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
    // $ANTLR end "ruleBecomeAliveRules"


    // $ANTLR start "entryRuleSurroundingCheck"
    // InternalGameoflifeDSL.g:686:1: entryRuleSurroundingCheck returns [EObject current=null] : iv_ruleSurroundingCheck= ruleSurroundingCheck EOF ;
    public final EObject entryRuleSurroundingCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurroundingCheck = null;


        try {
            // InternalGameoflifeDSL.g:686:57: (iv_ruleSurroundingCheck= ruleSurroundingCheck EOF )
            // InternalGameoflifeDSL.g:687:2: iv_ruleSurroundingCheck= ruleSurroundingCheck EOF
            {
             newCompositeNode(grammarAccess.getSurroundingCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSurroundingCheck=ruleSurroundingCheck();

            state._fsp--;

             current =iv_ruleSurroundingCheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSurroundingCheck"


    // $ANTLR start "ruleSurroundingCheck"
    // InternalGameoflifeDSL.g:693:1: ruleSurroundingCheck returns [EObject current=null] : ( ( (lv_checks_0_0= ruleCheck ) ) ( (lv_extracheck_1_0= ruleExtraCheck ) )* ) ;
    public final EObject ruleSurroundingCheck() throws RecognitionException {
        EObject current = null;

        EObject lv_checks_0_0 = null;

        EObject lv_extracheck_1_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:699:2: ( ( ( (lv_checks_0_0= ruleCheck ) ) ( (lv_extracheck_1_0= ruleExtraCheck ) )* ) )
            // InternalGameoflifeDSL.g:700:2: ( ( (lv_checks_0_0= ruleCheck ) ) ( (lv_extracheck_1_0= ruleExtraCheck ) )* )
            {
            // InternalGameoflifeDSL.g:700:2: ( ( (lv_checks_0_0= ruleCheck ) ) ( (lv_extracheck_1_0= ruleExtraCheck ) )* )
            // InternalGameoflifeDSL.g:701:3: ( (lv_checks_0_0= ruleCheck ) ) ( (lv_extracheck_1_0= ruleExtraCheck ) )*
            {
            // InternalGameoflifeDSL.g:701:3: ( (lv_checks_0_0= ruleCheck ) )
            // InternalGameoflifeDSL.g:702:4: (lv_checks_0_0= ruleCheck )
            {
            // InternalGameoflifeDSL.g:702:4: (lv_checks_0_0= ruleCheck )
            // InternalGameoflifeDSL.g:703:5: lv_checks_0_0= ruleCheck
            {

            					newCompositeNode(grammarAccess.getSurroundingCheckAccess().getChecksCheckParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_checks_0_0=ruleCheck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSurroundingCheckRule());
            					}
            					set(
            						current,
            						"checks",
            						lv_checks_0_0,
            						"gameoflife.GameoflifeDSL.Check");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGameoflifeDSL.g:720:3: ( (lv_extracheck_1_0= ruleExtraCheck ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=29 && LA6_0<=30)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGameoflifeDSL.g:721:4: (lv_extracheck_1_0= ruleExtraCheck )
            	    {
            	    // InternalGameoflifeDSL.g:721:4: (lv_extracheck_1_0= ruleExtraCheck )
            	    // InternalGameoflifeDSL.g:722:5: lv_extracheck_1_0= ruleExtraCheck
            	    {

            	    					newCompositeNode(grammarAccess.getSurroundingCheckAccess().getExtracheckExtraCheckParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_extracheck_1_0=ruleExtraCheck();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSurroundingCheckRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extracheck",
            	    						lv_extracheck_1_0,
            	    						"gameoflife.GameoflifeDSL.ExtraCheck");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleSurroundingCheck"


    // $ANTLR start "entryRuleCheck"
    // InternalGameoflifeDSL.g:743:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalGameoflifeDSL.g:743:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalGameoflifeDSL.g:744:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalGameoflifeDSL.g:750:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'surrounding' ( (lv_compare_1_0= ruleComparison ) ) ( (lv_integer_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_integer_2_0=null;
        AntlrDatatypeRuleToken lv_compare_1_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:756:2: ( (otherlv_0= 'surrounding' ( (lv_compare_1_0= ruleComparison ) ) ( (lv_integer_2_0= RULE_INT ) ) ) )
            // InternalGameoflifeDSL.g:757:2: (otherlv_0= 'surrounding' ( (lv_compare_1_0= ruleComparison ) ) ( (lv_integer_2_0= RULE_INT ) ) )
            {
            // InternalGameoflifeDSL.g:757:2: (otherlv_0= 'surrounding' ( (lv_compare_1_0= ruleComparison ) ) ( (lv_integer_2_0= RULE_INT ) ) )
            // InternalGameoflifeDSL.g:758:3: otherlv_0= 'surrounding' ( (lv_compare_1_0= ruleComparison ) ) ( (lv_integer_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getSurroundingKeyword_0());
            		
            // InternalGameoflifeDSL.g:762:3: ( (lv_compare_1_0= ruleComparison ) )
            // InternalGameoflifeDSL.g:763:4: (lv_compare_1_0= ruleComparison )
            {
            // InternalGameoflifeDSL.g:763:4: (lv_compare_1_0= ruleComparison )
            // InternalGameoflifeDSL.g:764:5: lv_compare_1_0= ruleComparison
            {

            					newCompositeNode(grammarAccess.getCheckAccess().getCompareComparisonParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_compare_1_0=ruleComparison();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckRule());
            					}
            					set(
            						current,
            						"compare",
            						lv_compare_1_0,
            						"gameoflife.GameoflifeDSL.Comparison");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGameoflifeDSL.g:781:3: ( (lv_integer_2_0= RULE_INT ) )
            // InternalGameoflifeDSL.g:782:4: (lv_integer_2_0= RULE_INT )
            {
            // InternalGameoflifeDSL.g:782:4: (lv_integer_2_0= RULE_INT )
            // InternalGameoflifeDSL.g:783:5: lv_integer_2_0= RULE_INT
            {
            lv_integer_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_integer_2_0, grammarAccess.getCheckAccess().getIntegerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integer",
            						lv_integer_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleExtraCheck"
    // InternalGameoflifeDSL.g:803:1: entryRuleExtraCheck returns [EObject current=null] : iv_ruleExtraCheck= ruleExtraCheck EOF ;
    public final EObject entryRuleExtraCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraCheck = null;


        try {
            // InternalGameoflifeDSL.g:803:51: (iv_ruleExtraCheck= ruleExtraCheck EOF )
            // InternalGameoflifeDSL.g:804:2: iv_ruleExtraCheck= ruleExtraCheck EOF
            {
             newCompositeNode(grammarAccess.getExtraCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtraCheck=ruleExtraCheck();

            state._fsp--;

             current =iv_ruleExtraCheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExtraCheck"


    // $ANTLR start "ruleExtraCheck"
    // InternalGameoflifeDSL.g:810:1: ruleExtraCheck returns [EObject current=null] : ( ( (lv_operator_0_0= ruleOperators ) ) ( (lv_check_1_0= ruleCheck ) ) ) ;
    public final EObject ruleExtraCheck() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_check_1_0 = null;



        	enterRule();

        try {
            // InternalGameoflifeDSL.g:816:2: ( ( ( (lv_operator_0_0= ruleOperators ) ) ( (lv_check_1_0= ruleCheck ) ) ) )
            // InternalGameoflifeDSL.g:817:2: ( ( (lv_operator_0_0= ruleOperators ) ) ( (lv_check_1_0= ruleCheck ) ) )
            {
            // InternalGameoflifeDSL.g:817:2: ( ( (lv_operator_0_0= ruleOperators ) ) ( (lv_check_1_0= ruleCheck ) ) )
            // InternalGameoflifeDSL.g:818:3: ( (lv_operator_0_0= ruleOperators ) ) ( (lv_check_1_0= ruleCheck ) )
            {
            // InternalGameoflifeDSL.g:818:3: ( (lv_operator_0_0= ruleOperators ) )
            // InternalGameoflifeDSL.g:819:4: (lv_operator_0_0= ruleOperators )
            {
            // InternalGameoflifeDSL.g:819:4: (lv_operator_0_0= ruleOperators )
            // InternalGameoflifeDSL.g:820:5: lv_operator_0_0= ruleOperators
            {

            					newCompositeNode(grammarAccess.getExtraCheckAccess().getOperatorOperatorsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_operator_0_0=ruleOperators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtraCheckRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"gameoflife.GameoflifeDSL.Operators");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGameoflifeDSL.g:837:3: ( (lv_check_1_0= ruleCheck ) )
            // InternalGameoflifeDSL.g:838:4: (lv_check_1_0= ruleCheck )
            {
            // InternalGameoflifeDSL.g:838:4: (lv_check_1_0= ruleCheck )
            // InternalGameoflifeDSL.g:839:5: lv_check_1_0= ruleCheck
            {

            					newCompositeNode(grammarAccess.getExtraCheckAccess().getCheckCheckParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_check_1_0=ruleCheck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtraCheckRule());
            					}
            					set(
            						current,
            						"check",
            						lv_check_1_0,
            						"gameoflife.GameoflifeDSL.Check");
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
    // $ANTLR end "ruleExtraCheck"


    // $ANTLR start "entryRuleComparison"
    // InternalGameoflifeDSL.g:860:1: entryRuleComparison returns [String current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final String entryRuleComparison() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparison = null;


        try {
            // InternalGameoflifeDSL.g:860:50: (iv_ruleComparison= ruleComparison EOF )
            // InternalGameoflifeDSL.g:861:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalGameoflifeDSL.g:867:1: ruleComparison returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '=' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleComparison() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGameoflifeDSL.g:873:2: ( (kw= '<' | kw= '=' | kw= '>' ) )
            // InternalGameoflifeDSL.g:874:2: (kw= '<' | kw= '=' | kw= '>' )
            {
            // InternalGameoflifeDSL.g:874:2: (kw= '<' | kw= '=' | kw= '>' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGameoflifeDSL.g:875:3: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGameoflifeDSL.g:881:3: kw= '='
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonAccess().getEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGameoflifeDSL.g:887:3: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_2());
                    		

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOperators"
    // InternalGameoflifeDSL.g:896:1: entryRuleOperators returns [String current=null] : iv_ruleOperators= ruleOperators EOF ;
    public final String entryRuleOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperators = null;


        try {
            // InternalGameoflifeDSL.g:896:49: (iv_ruleOperators= ruleOperators EOF )
            // InternalGameoflifeDSL.g:897:2: iv_ruleOperators= ruleOperators EOF
            {
             newCompositeNode(grammarAccess.getOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperators=ruleOperators();

            state._fsp--;

             current =iv_ruleOperators.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperators"


    // $ANTLR start "ruleOperators"
    // InternalGameoflifeDSL.g:903:1: ruleOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGameoflifeDSL.g:909:2: ( (kw= 'and' | kw= 'or' ) )
            // InternalGameoflifeDSL.g:910:2: (kw= 'and' | kw= 'or' )
            {
            // InternalGameoflifeDSL.g:910:2: (kw= 'and' | kw= 'or' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGameoflifeDSL.g:911:3: kw= 'and'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorsAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGameoflifeDSL.g:917:3: kw= 'or'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorsAccess().getOrKeyword_1());
                    		

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
    // $ANTLR end "ruleOperators"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001C06000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001C02000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001C000000L});

}