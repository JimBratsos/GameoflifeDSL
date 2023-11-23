/**
 * generated by Xtext 2.25.0
 */
package gameoflife.generator;

import com.google.common.base.Objects;
import gameoflife.gameoflifeDSL.BecomeAliveRules;
import gameoflife.gameoflifeDSL.CellStatus;
import gameoflife.gameoflifeDSL.DieRules;
import gameoflife.gameoflifeDSL.EvolutionRules;
import gameoflife.gameoflifeDSL.ExtraCheck;
import gameoflife.gameoflifeDSL.GameStart;
import gameoflife.gameoflifeDSL.LineStatus;
import gameoflife.gameoflifeDSL.LiveRules;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class GameoflifeDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _className = this.className(resource);
    String _plus = (_className + ".java");
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(_plus, this.toJavaCode(((GameStart) _head)));
  }
  
  protected String className(final Resource res) {
    String name = res.getURI().lastSegment();
    return StringExtensions.toFirstUpper(name.substring(0, name.indexOf(".")));
  }
  
  protected CharSequence toJavaCode(final GameStart gs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("// Iterate through the array, follow game of life rules");
    _builder.newLine();
    _builder.append("       \t\t");
    _builder.append("for (int i=1; i<gameBoard.length-1; i++) {");
    _builder.newLine();
    _builder.append("            \t");
    _builder.append("for (int j=1; j<gameBoard[0].length-1; j++) {");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("int surrounding = 0;");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("if (gameBoard[i-1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("if (gameBoard[i-1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("if (gameBoard[i-1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("if (gameBoard[i][j-1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("if (gameBoard[i][j+1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("if (gameBoard[i+1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("if (gameBoard[i+1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("if (gameBoard[i+1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.newLine();
    {
      EList<EvolutionRules> _evolutionRules = gs.getEvolutionRules();
      for(final EvolutionRules rule : _evolutionRules) {
        {
          EList<LiveRules> _liveRules = rule.getLiveRules();
          for(final LiveRules liveRule : _liveRules) {
            _builder.append("\t\t\t\t\t");
            String ruleCompare = liveRule.getSurroundingCheck().getChecks().getCompare();
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            int number = liveRule.getSurroundingCheck().getChecks().getInteger();
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("if((gameBoard[i][j]) && (surrounding");
            {
              boolean _equals = Objects.equal(ruleCompare, "=");
              if (_equals) {
                _builder.append(" == ");
              } else {
                _builder.append(" ");
                _builder.append(ruleCompare, "\t\t\t\t\t");
                _builder.append(" ");
              }
            }
            _builder.append(number, "\t\t\t\t\t");
            _builder.append(" ");
            {
              EList<ExtraCheck> _extracheck = liveRule.getSurroundingCheck().getExtracheck();
              for(final ExtraCheck extras : _extracheck) {
                String ruleCompareExtra = extras.getCheck().getCompare();
                int numberExtra = extras.getCheck().getInteger();
                {
                  String _operator = extras.getOperator();
                  boolean _equals_1 = Objects.equal(_operator, "and");
                  if (_equals_1) {
                    _builder.append(" && ");
                  } else {
                    String _operator_1 = extras.getOperator();
                    boolean _equals_2 = Objects.equal(_operator_1, "or");
                    if (_equals_2) {
                      _builder.append(" || ");
                    }
                  }
                }
                _builder.append("surrounding");
                {
                  boolean _equals_3 = Objects.equal(ruleCompareExtra, "=");
                  if (_equals_3) {
                    _builder.append(" == ");
                  } else {
                    _builder.append(" ");
                    _builder.append(ruleCompareExtra, "\t\t\t\t\t");
                    _builder.append(" ");
                  }
                }
                _builder.append(numberExtra, "\t\t\t\t\t");
              }
            }
            _builder.append(")){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("survivingCells.add(new Point(i-1,j-1));");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("}\t");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t\t\t");
        _builder.newLine();
        {
          EList<DieRules> _deadRules = rule.getDeadRules();
          for(final DieRules dieRule : _deadRules) {
            _builder.append("\t\t\t\t\t");
            String ruleCompare_1 = dieRule.getSurroundingCheck().getChecks().getCompare();
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            int number_1 = dieRule.getSurroundingCheck().getChecks().getInteger();
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("if((gameBoard[i][j]) && (surrounding");
            {
              boolean _equals_4 = Objects.equal(ruleCompare_1, "=");
              if (_equals_4) {
                _builder.append(" == ");
              } else {
                _builder.append(" ");
                _builder.append(ruleCompare_1, "\t\t\t\t\t");
                _builder.append(" ");
              }
            }
            _builder.append(number_1, "\t\t\t\t\t");
            _builder.append(" ");
            {
              EList<ExtraCheck> _extracheck_1 = dieRule.getSurroundingCheck().getExtracheck();
              for(final ExtraCheck extras_1 : _extracheck_1) {
                String ruleCompareExtra_1 = extras_1.getCheck().getCompare();
                int numberExtra_1 = extras_1.getCheck().getInteger();
                {
                  String _operator_2 = extras_1.getOperator();
                  boolean _equals_5 = Objects.equal(_operator_2, "and");
                  if (_equals_5) {
                    _builder.append(" && ");
                  } else {
                    String _operator_3 = extras_1.getOperator();
                    boolean _equals_6 = Objects.equal(_operator_3, "or");
                    if (_equals_6) {
                      _builder.append(" || ");
                    }
                  }
                }
                _builder.append("surrounding");
                {
                  boolean _equals_7 = Objects.equal(ruleCompareExtra_1, "=");
                  if (_equals_7) {
                    _builder.append(" == ");
                  } else {
                    _builder.append(" ");
                    _builder.append(ruleCompareExtra_1, "\t\t\t\t\t");
                    _builder.append(" ");
                  }
                }
                _builder.append(numberExtra_1, "\t\t\t\t\t");
              }
            }
            _builder.append(")){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("survivingCells.add(new Point(i-1,j-1));");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("}\t");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t\t\t");
        _builder.newLine();
        {
          EList<BecomeAliveRules> _becomeAliveRules = rule.getBecomeAliveRules();
          for(final BecomeAliveRules becomeAliveRule : _becomeAliveRules) {
            _builder.append("\t\t\t\t\t");
            String ruleCompare_2 = becomeAliveRule.getSurroundingCheck().getChecks().getCompare();
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            int number_2 = becomeAliveRule.getSurroundingCheck().getChecks().getInteger();
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("if((gameBoard[i][j]) && (surrounding");
            {
              boolean _equals_8 = Objects.equal(ruleCompare_2, "=");
              if (_equals_8) {
                _builder.append(" == ");
              } else {
                _builder.append(" ");
                _builder.append(ruleCompare_2, "\t\t\t\t\t");
                _builder.append(" ");
              }
            }
            _builder.append(number_2, "\t\t\t\t\t");
            _builder.append(" ");
            {
              EList<ExtraCheck> _extracheck_2 = becomeAliveRule.getSurroundingCheck().getExtracheck();
              for(final ExtraCheck extras_2 : _extracheck_2) {
                String ruleCompareExtra_2 = extras_2.getCheck().getCompare();
                int numberExtra_2 = extras_2.getCheck().getInteger();
                {
                  String _operator_4 = extras_2.getOperator();
                  boolean _equals_9 = Objects.equal(_operator_4, "and");
                  if (_equals_9) {
                    _builder.append(" && ");
                  } else {
                    String _operator_5 = extras_2.getOperator();
                    boolean _equals_10 = Objects.equal(_operator_5, "or");
                    if (_equals_10) {
                      _builder.append(" || ");
                    }
                  }
                }
                _builder.append("surrounding");
                {
                  boolean _equals_11 = Objects.equal(ruleCompareExtra_2, "=");
                  if (_equals_11) {
                    _builder.append(" == ");
                  } else {
                    _builder.append(" ");
                    _builder.append(ruleCompareExtra_2, "\t\t\t\t\t");
                    _builder.append(" ");
                  }
                }
                _builder.append(numberExtra_2, "\t\t\t\t\t");
              }
            }
            _builder.append(")){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("survivingCells.add(new Point(i-1,j-1));");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("}\t");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public static void addPointsToGrid(ArrayList<Point> cellsToAdd) {");
    _builder.newLine();
    {
      EList<CellStatus> _cells = gs.getInitialGrid().getCells();
      for(final CellStatus cell : _cells) {
        _builder.append("\t\t\t");
        _builder.append("cellsToAdd.add(new Point(");
        int _x = cell.getCoordinates().getX();
        _builder.append(_x, "\t\t\t");
        _builder.append(",");
        int _y = cell.getCoordinates().getY();
        _builder.append(_y, "\t\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<LineStatus> _lines = gs.getInitialGrid().getLines();
      for(final LineStatus line : _lines) {
        _builder.append("\t\t\t");
        _builder.append("for(int row = ");
        int _xbeg = line.getCoordinates().getXbeg();
        _builder.append(_xbeg, "\t\t\t");
        _builder.append("; row <= ");
        int _xend = line.getCoordinates().getXend();
        _builder.append(_xend, "\t\t\t");
        _builder.append("; row++) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("for(int col = ");
        int _ybeg = line.getCoordinates().getYbeg();
        _builder.append(_ybeg, "\t\t\t\t");
        _builder.append("; col <= ");
        int _yend = line.getCoordinates().getYend();
        _builder.append(_yend, "\t\t\t\t");
        _builder.append("; col++) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("cellsToAdd.add(new Point(row,col));");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}