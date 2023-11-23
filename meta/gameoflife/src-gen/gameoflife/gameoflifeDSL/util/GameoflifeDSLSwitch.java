/**
 * generated by Xtext 2.25.0
 */
package gameoflife.gameoflifeDSL.util;

import gameoflife.gameoflifeDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gameoflife.gameoflifeDSL.GameoflifeDSLPackage
 * @generated
 */
public class GameoflifeDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GameoflifeDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameoflifeDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GameoflifeDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GameoflifeDSLPackage.GAME_START:
      {
        GameStart gameStart = (GameStart)theEObject;
        T result = caseGameStart(gameStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.INITIAL_GRID:
      {
        InitialGrid initialGrid = (InitialGrid)theEObject;
        T result = caseInitialGrid(initialGrid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.LINE_STATUS:
      {
        LineStatus lineStatus = (LineStatus)theEObject;
        T result = caseLineStatus(lineStatus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.LINE_COORDS:
      {
        LineCoords lineCoords = (LineCoords)theEObject;
        T result = caseLineCoords(lineCoords);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.CELL_STATUS:
      {
        CellStatus cellStatus = (CellStatus)theEObject;
        T result = caseCellStatus(cellStatus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.COORDINATES:
      {
        Coordinates coordinates = (Coordinates)theEObject;
        T result = caseCoordinates(coordinates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.EVOLUTION_RULES:
      {
        EvolutionRules evolutionRules = (EvolutionRules)theEObject;
        T result = caseEvolutionRules(evolutionRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.LIVE_RULES:
      {
        LiveRules liveRules = (LiveRules)theEObject;
        T result = caseLiveRules(liveRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.DIE_RULES:
      {
        DieRules dieRules = (DieRules)theEObject;
        T result = caseDieRules(dieRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.BECOME_ALIVE_RULES:
      {
        BecomeAliveRules becomeAliveRules = (BecomeAliveRules)theEObject;
        T result = caseBecomeAliveRules(becomeAliveRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.SURROUNDING_CHECK:
      {
        SurroundingCheck surroundingCheck = (SurroundingCheck)theEObject;
        T result = caseSurroundingCheck(surroundingCheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.CHECK:
      {
        Check check = (Check)theEObject;
        T result = caseCheck(check);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GameoflifeDSLPackage.EXTRA_CHECK:
      {
        ExtraCheck extraCheck = (ExtraCheck)theEObject;
        T result = caseExtraCheck(extraCheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameStart(GameStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial Grid</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial Grid</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialGrid(InitialGrid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Status</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Status</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineStatus(LineStatus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Coords</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Coords</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineCoords(LineCoords object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Status</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Status</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellStatus(CellStatus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coordinates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coordinates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoordinates(Coordinates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evolution Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evolution Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvolutionRules(EvolutionRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Live Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Live Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiveRules(LiveRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Die Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Die Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDieRules(DieRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Become Alive Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Become Alive Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBecomeAliveRules(BecomeAliveRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Surrounding Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Surrounding Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSurroundingCheck(SurroundingCheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheck(Check object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extra Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extra Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtraCheck(ExtraCheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GameoflifeDSLSwitch