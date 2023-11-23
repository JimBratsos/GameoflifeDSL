/**
 * generated by Xtext 2.25.0
 */
package gameoflife.gameoflifeDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameoflife.gameoflifeDSL.InitialGrid#getCells <em>Cells</em>}</li>
 *   <li>{@link gameoflife.gameoflifeDSL.InitialGrid#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see gameoflife.gameoflifeDSL.GameoflifeDSLPackage#getInitialGrid()
 * @model
 * @generated
 */
public interface InitialGrid extends EObject
{
  /**
   * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
   * The list contents are of type {@link gameoflife.gameoflifeDSL.CellStatus}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' containment reference list.
   * @see gameoflife.gameoflifeDSL.GameoflifeDSLPackage#getInitialGrid_Cells()
   * @model containment="true"
   * @generated
   */
  EList<CellStatus> getCells();

  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link gameoflife.gameoflifeDSL.LineStatus}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see gameoflife.gameoflifeDSL.GameoflifeDSLPackage#getInitialGrid_Lines()
   * @model containment="true"
   * @generated
   */
  EList<LineStatus> getLines();

} // InitialGrid