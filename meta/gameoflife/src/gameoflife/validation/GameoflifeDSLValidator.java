/*
 * generated by Xtext 2.25.0
 */
package gameoflife.validation;

import java.util.HashSet;

import org.eclipse.xtext.validation.Check;

import gameoflife.gameoflifeDSL.BecomeAliveRules;
import gameoflife.gameoflifeDSL.Coordinates;
import gameoflife.gameoflifeDSL.DieRules;
import gameoflife.gameoflifeDSL.EvolutionRules;
import gameoflife.gameoflifeDSL.ExtraCheck;
import gameoflife.gameoflifeDSL.GameStart;
import gameoflife.gameoflifeDSL.GameoflifeDSLPackage;
import gameoflife.gameoflifeDSL.LineCoords;
import gameoflife.gameoflifeDSL.LiveRules;
import gameoflife.gameoflifeDSL.SurroundingCheck;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class GameoflifeDSLValidator extends AbstractGameoflifeDSLValidator {
		
	// Check if points are out of bounds
	@Check
	public void checkBoundsPoints(Coordinates coords) {
		if(coords.getX() > 49 || coords.getX() < 0) {
			error("Your coordinates are incorrect. Please, give values from 0 to 49 only", GameoflifeDSLPackage.Literals.COORDINATES__X,
					coords.getX());
		}
		
		if(coords.getY() > 49 || coords.getY() < 0) {
			error("Your coordinates are incorrect. Please, give values from 0 to 49 only", GameoflifeDSLPackage.Literals.COORDINATES__Y,
					coords.getY());
		}
		
	}
	
	// Check if lines are out of bounds
	@Check
	public void checkBoundsLists(LineCoords lines) {
		if(lines.getXbeg() > 49 || lines.getXbeg() < 0) {
			error("Your coordinates are incorrect. Please, give values from 0 to 49 only", GameoflifeDSLPackage.Literals.LINE_COORDS__XBEG,
					lines.getXbeg());
		}
		
		if(lines.getXend() > 49 || lines.getXend() < 0) {
			error("Your coordinates are incorrect. Please, give values from 0 to 49 only", GameoflifeDSLPackage.Literals.LINE_COORDS__XEND,
					lines.getXend());
		}
		
		if(lines.getYbeg() > 49 || lines.getYbeg() < 0) {
			error("Your coordinates are incorrect. Please, give values from 0 to 49 only", GameoflifeDSLPackage.Literals.LINE_COORDS__YBEG,
					lines.getYbeg());
		}
		
		if(lines.getYend() > 49 || lines.getYend() < 0) {
			error("Your coordinates are incorrect. Please, give values from 0 to 49 only", GameoflifeDSLPackage.Literals.LINE_COORDS__YEND,
					lines.getYend());
		}
	}
	
	// Check if list coordinates for X are incorrect (first bigger than the second)
	@Check
	public void checkListsNumbersX(LineCoords lines) {
		if(lines.getXbeg() > lines.getXend()) {
			error("Your first X coordinate was bigger than the second. Try changing the order.", GameoflifeDSLPackage.Literals.LINE_COORDS__XBEG,
					lines.getXbeg());
		}
	}
	
	// Similar check for the Y
	@Check
	public void checkListsNumbersY(LineCoords lines) {
		if(lines.getYbeg() > lines.getYend()) {
			error("Your first Y coordinate was bigger than the second. Try changing the order.", GameoflifeDSLPackage.Literals.LINE_COORDS__YBEG,
					lines.getYbeg());
		}
	}
	
	// Check to see if list should be written as a point
	@Check
	public void checkListToPoint(LineCoords lines) {
		if ((lines.getXbeg() == lines.getXend()) && (lines.getYbeg() == lines.getYend())) {
			warning("This seems like a point. Try adding a point instead?", GameoflifeDSLPackage.Literals.LINE_COORDS__YBEG,
					lines.getYbeg());
		}
	}

	// Check if neighbors are more than 8
	@Check
	public void checkNeighborsNum(SurroundingCheck surrounding) {
		int firstCheck = surrounding.getChecks().getInteger();
		
		
		if (firstCheck > 8 || (firstCheck == 8 && surrounding.getChecks().getCompare().equals(">"))) {
			error("The number of neighbors should be less than 8", GameoflifeDSLPackage.Literals.SURROUNDING_CHECK__CHECKS,
					firstCheck);
		} 
		
		
		for(ExtraCheck extraCheck : surrounding.getExtracheck()) {
			int extraCheckInt = extraCheck.getCheck().getInteger();
			if (extraCheckInt > 8 || extraCheckInt == 8 && extraCheck.getCheck().getCompare().equals(">")) {
				error("The number of neighbors should be less than 8", GameoflifeDSLPackage.Literals.SURROUNDING_CHECK__EXTRACHECK,
						extraCheckInt);
			}
		}
		
	}
	
	// Check if the user has specified the same neighbor state for different rules
	@Check
	public void checkSameRules(EvolutionRules evoRules) {
		
	    HashSet<String> allRules = new HashSet<>();
		
		for(BecomeAliveRules becomeAliveRule : evoRules.getBecomeAliveRules()) {
			
			String comparison = becomeAliveRule.getSurroundingCheck().getChecks().getCompare();
			String numberStr = Integer.toString(becomeAliveRule.getSurroundingCheck().getChecks().getInteger());
			if (!allRules.add(comparison+numberStr)) {
				warning("Duplicate rule found: " + comparison+numberStr, null);
			}
			
			for (ExtraCheck extraChecks : becomeAliveRule.getSurroundingCheck().getExtracheck()){
				String comparisonE = extraChecks.getCheck().getCompare();
				String numberStrE = Integer.toString(extraChecks.getCheck().getInteger());
				if (!allRules.add(comparisonE+numberStrE)) {
					warning("Duplicate rule found: " + comparison+numberStr, null);
				}
			}
		}
		
		for(LiveRules liveRule : evoRules.getLiveRules()) {
			
			String comparison = liveRule.getSurroundingCheck().getChecks().getCompare();
			String numberStr = Integer.toString(liveRule.getSurroundingCheck().getChecks().getInteger());
			if (!allRules.add(comparison+numberStr)) {
				warning("Duplicate rule found: " + comparison+numberStr, null);
			}
			
			for (ExtraCheck extraChecks : liveRule.getSurroundingCheck().getExtracheck()){
				String comparisonE = extraChecks.getCheck().getCompare();
				String numberStrE = Integer.toString(extraChecks.getCheck().getInteger());
				if (!allRules.add(comparisonE+numberStrE)) {
					warning("Duplicate rule found: " + comparison+numberStr, null);
				}
			}
		}
		
		for(DieRules deadRule : evoRules.getDeadRules()) {
			
			String comparison = deadRule.getSurroundingCheck().getChecks().getCompare();
			String numberStr = Integer.toString(deadRule.getSurroundingCheck().getChecks().getInteger());
			if (!allRules.add(comparison+numberStr)) {
				warning("Duplicate rule found: " + comparison+numberStr, null);
			}
			
			for (ExtraCheck extraChecks : deadRule.getSurroundingCheck().getExtracheck()){
				String comparisonE = extraChecks.getCheck().getCompare();
				String numberStrE = Integer.toString(extraChecks.getCheck().getInteger());
				if (!allRules.add(comparisonE+numberStrE)) {
					warning("Duplicate rule found: " + comparison+numberStr, null);
				}
			}
		}
	}
	
	// Check if specific rule has different intervals that will never be met (if you have and) OR overlaps in rules if not '='
	@Check
	public void checkComparisonSymbolsStayAlive(LiveRules liveRules) {
		HashSet<String> checkSymbolSetS = new HashSet<>();
		
		String checkSymbol = liveRules.getSurroundingCheck().getChecks().getCompare();
		checkSymbolSetS.add(checkSymbol);
		
		for(ExtraCheck extraCheck : liveRules.getSurroundingCheck().getExtracheck()) {
			String checkOperator = extraCheck.getOperator();
			if(checkOperator.equals("and")) {
				if (checkSymbolSetS.add(extraCheck.getCheck().getCompare())) {
					warning("The rule specified never be met due to intervals. Please, change it", null);
				} else if (!checkSymbolSetS.add(extraCheck.getCheck().getCompare())) {
					if (!extraCheck.getCheck().getCompare().equals("=")) {
						warning("You have overlapping rules. Please, change it", null);
					}
				}
			}	
			
		}
	}
	
	@Check
	public void checkComparisonSymbolsDie(DieRules dieRules) {
		HashSet<String> checkSymbolSetD = new HashSet<>();
		
		String checkSymbol = dieRules.getSurroundingCheck().getChecks().getCompare();
		checkSymbolSetD.add(checkSymbol);
		
		for(ExtraCheck extraCheck : dieRules.getSurroundingCheck().getExtracheck()) {
			String checkOperator = extraCheck.getOperator();
			if(checkOperator.equals("and")) {
				if (checkSymbolSetD.add(extraCheck.getCheck().getCompare())) {
					warning("You cannot have rules that have opposite intervals. Please, change them", null);
				} else if (!checkSymbolSetD.add(extraCheck.getCheck().getCompare())) {
					if (!extraCheck.getCheck().getCompare().equals("=")) {
						warning("You have overlapping rules. Please, change it", null);
					}
				}
				
			}
		}
	}
	
	@Check
	public void checkComparisonSymbolsBirth(BecomeAliveRules becomeAliveRules) {
		HashSet<String> checkSymbolSetB = new HashSet<>();
		
		String checkSymbol = becomeAliveRules.getSurroundingCheck().getChecks().getCompare();
		checkSymbolSetB.add(checkSymbol);
		
		for(ExtraCheck extraCheck : becomeAliveRules.getSurroundingCheck().getExtracheck()) {
			String checkOperator = extraCheck.getOperator();
			if(checkOperator.equals("and")) {
				if (checkSymbolSetB.add(extraCheck.getCheck().getCompare())) {
					warning("You cannot have rules that have opposite intervals. Please, change them", null);
				} else if (!checkSymbolSetB.add(extraCheck.getCheck().getCompare())) {
					if (!extraCheck.getCheck().getCompare().equals("=")) {
						warning("You have overlapping rules. Please, change it", null);
					}
				}
			}
			
		}
	}
	
	// Check if the game does not have a rule
	@Check
	public void checkEmptyGame(GameStart game) {
		EvolutionRules evoRule = game.getEvolutionRules().get(0);
		if (evoRule.getBecomeAliveRules().size() == 0 && evoRule.getDeadRules().size() == 0 && evoRule.getLiveRules().size() == 0) {
			error("Please specify a rule for your game", null);
		}
	}
}
