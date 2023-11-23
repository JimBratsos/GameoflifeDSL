/**
 * generated by Xtext 2.25.0
 */
package gameoflife.gameoflifeDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surrounding Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameoflife.gameoflifeDSL.SurroundingCheck#getChecks <em>Checks</em>}</li>
 *   <li>{@link gameoflife.gameoflifeDSL.SurroundingCheck#getExtracheck <em>Extracheck</em>}</li>
 * </ul>
 *
 * @see gameoflife.gameoflifeDSL.GameoflifeDSLPackage#getSurroundingCheck()
 * @model
 * @generated
 */
public interface SurroundingCheck extends EObject
{
  /**
   * Returns the value of the '<em><b>Checks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checks</em>' containment reference.
   * @see #setChecks(Check)
   * @see gameoflife.gameoflifeDSL.GameoflifeDSLPackage#getSurroundingCheck_Checks()
   * @model containment="true"
   * @generated
   */
  Check getChecks();

  /**
   * Sets the value of the '{@link gameoflife.gameoflifeDSL.SurroundingCheck#getChecks <em>Checks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Checks</em>' containment reference.
   * @see #getChecks()
   * @generated
   */
  void setChecks(Check value);

  /**
   * Returns the value of the '<em><b>Extracheck</b></em>' containment reference list.
   * The list contents are of type {@link gameoflife.gameoflifeDSL.ExtraCheck}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extracheck</em>' containment reference list.
   * @see gameoflife.gameoflifeDSL.GameoflifeDSLPackage#getSurroundingCheck_Extracheck()
   * @model containment="true"
   * @generated
   */
  EList<ExtraCheck> getExtracheck();

} // SurroundingCheck
