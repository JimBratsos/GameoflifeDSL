/*
 * generated by Xtext 2.25.0
 */
package gameoflife.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gameoflife.ide.contentassist.antlr.internal.InternalGameoflifeDSLParser;
import gameoflife.services.GameoflifeDSLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class GameoflifeDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GameoflifeDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GameoflifeDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getComparisonAccess().getAlternatives(), "rule__Comparison__Alternatives");
			builder.put(grammarAccess.getOperatorsAccess().getAlternatives(), "rule__Operators__Alternatives");
			builder.put(grammarAccess.getGameStartAccess().getGroup(), "rule__GameStart__Group__0");
			builder.put(grammarAccess.getInitialGridAccess().getGroup(), "rule__InitialGrid__Group__0");
			builder.put(grammarAccess.getInitialGridAccess().getGroup_1(), "rule__InitialGrid__Group_1__0");
			builder.put(grammarAccess.getInitialGridAccess().getGroup_2(), "rule__InitialGrid__Group_2__0");
			builder.put(grammarAccess.getLineCoordsAccess().getGroup(), "rule__LineCoords__Group__0");
			builder.put(grammarAccess.getCellStatusAccess().getGroup(), "rule__CellStatus__Group__0");
			builder.put(grammarAccess.getCoordinatesAccess().getGroup(), "rule__Coordinates__Group__0");
			builder.put(grammarAccess.getEvolutionRulesAccess().getGroup(), "rule__EvolutionRules__Group__0");
			builder.put(grammarAccess.getLiveRulesAccess().getGroup(), "rule__LiveRules__Group__0");
			builder.put(grammarAccess.getDieRulesAccess().getGroup(), "rule__DieRules__Group__0");
			builder.put(grammarAccess.getBecomeAliveRulesAccess().getGroup(), "rule__BecomeAliveRules__Group__0");
			builder.put(grammarAccess.getSurroundingCheckAccess().getGroup(), "rule__SurroundingCheck__Group__0");
			builder.put(grammarAccess.getCheckAccess().getGroup(), "rule__Check__Group__0");
			builder.put(grammarAccess.getExtraCheckAccess().getGroup(), "rule__ExtraCheck__Group__0");
			builder.put(grammarAccess.getGameStartAccess().getInitialGridAssignment_2(), "rule__GameStart__InitialGridAssignment_2");
			builder.put(grammarAccess.getGameStartAccess().getEvolutionRulesAssignment_3(), "rule__GameStart__EvolutionRulesAssignment_3");
			builder.put(grammarAccess.getInitialGridAccess().getCellsAssignment_1_1(), "rule__InitialGrid__CellsAssignment_1_1");
			builder.put(grammarAccess.getInitialGridAccess().getLinesAssignment_2_1(), "rule__InitialGrid__LinesAssignment_2_1");
			builder.put(grammarAccess.getLineStatusAccess().getCoordinatesAssignment(), "rule__LineStatus__CoordinatesAssignment");
			builder.put(grammarAccess.getLineCoordsAccess().getXbegAssignment_2(), "rule__LineCoords__XbegAssignment_2");
			builder.put(grammarAccess.getLineCoordsAccess().getXendAssignment_4(), "rule__LineCoords__XendAssignment_4");
			builder.put(grammarAccess.getLineCoordsAccess().getYbegAssignment_8(), "rule__LineCoords__YbegAssignment_8");
			builder.put(grammarAccess.getLineCoordsAccess().getYendAssignment_10(), "rule__LineCoords__YendAssignment_10");
			builder.put(grammarAccess.getCellStatusAccess().getCoordinatesAssignment_1(), "rule__CellStatus__CoordinatesAssignment_1");
			builder.put(grammarAccess.getCoordinatesAccess().getXAssignment_1(), "rule__Coordinates__XAssignment_1");
			builder.put(grammarAccess.getCoordinatesAccess().getYAssignment_3(), "rule__Coordinates__YAssignment_3");
			builder.put(grammarAccess.getEvolutionRulesAccess().getLiveRulesAssignment_1(), "rule__EvolutionRules__LiveRulesAssignment_1");
			builder.put(grammarAccess.getEvolutionRulesAccess().getDeadRulesAssignment_2(), "rule__EvolutionRules__DeadRulesAssignment_2");
			builder.put(grammarAccess.getEvolutionRulesAccess().getBecomeAliveRulesAssignment_3(), "rule__EvolutionRules__BecomeAliveRulesAssignment_3");
			builder.put(grammarAccess.getLiveRulesAccess().getSurroundingCheckAssignment_1(), "rule__LiveRules__SurroundingCheckAssignment_1");
			builder.put(grammarAccess.getDieRulesAccess().getSurroundingCheckAssignment_1(), "rule__DieRules__SurroundingCheckAssignment_1");
			builder.put(grammarAccess.getBecomeAliveRulesAccess().getSurroundingCheckAssignment_1(), "rule__BecomeAliveRules__SurroundingCheckAssignment_1");
			builder.put(grammarAccess.getSurroundingCheckAccess().getChecksAssignment_0(), "rule__SurroundingCheck__ChecksAssignment_0");
			builder.put(grammarAccess.getSurroundingCheckAccess().getExtracheckAssignment_1(), "rule__SurroundingCheck__ExtracheckAssignment_1");
			builder.put(grammarAccess.getCheckAccess().getCompareAssignment_1(), "rule__Check__CompareAssignment_1");
			builder.put(grammarAccess.getCheckAccess().getIntegerAssignment_2(), "rule__Check__IntegerAssignment_2");
			builder.put(grammarAccess.getExtraCheckAccess().getOperatorAssignment_0(), "rule__ExtraCheck__OperatorAssignment_0");
			builder.put(grammarAccess.getExtraCheckAccess().getCheckAssignment_1(), "rule__ExtraCheck__CheckAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GameoflifeDSLGrammarAccess grammarAccess;

	@Override
	protected InternalGameoflifeDSLParser createParser() {
		InternalGameoflifeDSLParser result = new InternalGameoflifeDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GameoflifeDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GameoflifeDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}