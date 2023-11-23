/**
 * generated by Xtext 2.25.0
 */
package gameoflife.gameoflifeDSL.impl;

import gameoflife.gameoflifeDSL.BecomeAliveRules;
import gameoflife.gameoflifeDSL.CellStatus;
import gameoflife.gameoflifeDSL.Check;
import gameoflife.gameoflifeDSL.Coordinates;
import gameoflife.gameoflifeDSL.DieRules;
import gameoflife.gameoflifeDSL.EvolutionRules;
import gameoflife.gameoflifeDSL.ExtraCheck;
import gameoflife.gameoflifeDSL.GameStart;
import gameoflife.gameoflifeDSL.GameoflifeDSLFactory;
import gameoflife.gameoflifeDSL.GameoflifeDSLPackage;
import gameoflife.gameoflifeDSL.InitialGrid;
import gameoflife.gameoflifeDSL.LineCoords;
import gameoflife.gameoflifeDSL.LineStatus;
import gameoflife.gameoflifeDSL.LiveRules;
import gameoflife.gameoflifeDSL.SurroundingCheck;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameoflifeDSLPackageImpl extends EPackageImpl implements GameoflifeDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialGridEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineStatusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineCoordsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellStatusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coordinatesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evolutionRulesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass liveRulesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dieRulesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass becomeAliveRulesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass surroundingCheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extraCheckEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see gameoflife.gameoflifeDSL.GameoflifeDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GameoflifeDSLPackageImpl()
  {
    super(eNS_URI, GameoflifeDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link GameoflifeDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GameoflifeDSLPackage init()
  {
    if (isInited) return (GameoflifeDSLPackage)EPackage.Registry.INSTANCE.getEPackage(GameoflifeDSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredGameoflifeDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    GameoflifeDSLPackageImpl theGameoflifeDSLPackage = registeredGameoflifeDSLPackage instanceof GameoflifeDSLPackageImpl ? (GameoflifeDSLPackageImpl)registeredGameoflifeDSLPackage : new GameoflifeDSLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theGameoflifeDSLPackage.createPackageContents();

    // Initialize created meta-data
    theGameoflifeDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGameoflifeDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GameoflifeDSLPackage.eNS_URI, theGameoflifeDSLPackage);
    return theGameoflifeDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGameStart()
  {
    return gameStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGameStart_InitialGrid()
  {
    return (EReference)gameStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGameStart_EvolutionRules()
  {
    return (EReference)gameStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInitialGrid()
  {
    return initialGridEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialGrid_Cells()
  {
    return (EReference)initialGridEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialGrid_Lines()
  {
    return (EReference)initialGridEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLineStatus()
  {
    return lineStatusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLineStatus_Coordinates()
  {
    return (EReference)lineStatusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLineCoords()
  {
    return lineCoordsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLineCoords_Xbeg()
  {
    return (EAttribute)lineCoordsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLineCoords_Xend()
  {
    return (EAttribute)lineCoordsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLineCoords_Ybeg()
  {
    return (EAttribute)lineCoordsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLineCoords_Yend()
  {
    return (EAttribute)lineCoordsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCellStatus()
  {
    return cellStatusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCellStatus_Coordinates()
  {
    return (EReference)cellStatusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCoordinates()
  {
    return coordinatesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCoordinates_X()
  {
    return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCoordinates_Y()
  {
    return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEvolutionRules()
  {
    return evolutionRulesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEvolutionRules_LiveRules()
  {
    return (EReference)evolutionRulesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEvolutionRules_DeadRules()
  {
    return (EReference)evolutionRulesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEvolutionRules_BecomeAliveRules()
  {
    return (EReference)evolutionRulesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLiveRules()
  {
    return liveRulesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLiveRules_SurroundingCheck()
  {
    return (EReference)liveRulesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDieRules()
  {
    return dieRulesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDieRules_SurroundingCheck()
  {
    return (EReference)dieRulesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBecomeAliveRules()
  {
    return becomeAliveRulesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBecomeAliveRules_SurroundingCheck()
  {
    return (EReference)becomeAliveRulesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSurroundingCheck()
  {
    return surroundingCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSurroundingCheck_Checks()
  {
    return (EReference)surroundingCheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSurroundingCheck_Extracheck()
  {
    return (EReference)surroundingCheckEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCheck()
  {
    return checkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCheck_Compare()
  {
    return (EAttribute)checkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCheck_Integer()
  {
    return (EAttribute)checkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExtraCheck()
  {
    return extraCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExtraCheck_Operator()
  {
    return (EAttribute)extraCheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExtraCheck_Check()
  {
    return (EReference)extraCheckEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GameoflifeDSLFactory getGameoflifeDSLFactory()
  {
    return (GameoflifeDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    gameStartEClass = createEClass(GAME_START);
    createEReference(gameStartEClass, GAME_START__INITIAL_GRID);
    createEReference(gameStartEClass, GAME_START__EVOLUTION_RULES);

    initialGridEClass = createEClass(INITIAL_GRID);
    createEReference(initialGridEClass, INITIAL_GRID__CELLS);
    createEReference(initialGridEClass, INITIAL_GRID__LINES);

    lineStatusEClass = createEClass(LINE_STATUS);
    createEReference(lineStatusEClass, LINE_STATUS__COORDINATES);

    lineCoordsEClass = createEClass(LINE_COORDS);
    createEAttribute(lineCoordsEClass, LINE_COORDS__XBEG);
    createEAttribute(lineCoordsEClass, LINE_COORDS__XEND);
    createEAttribute(lineCoordsEClass, LINE_COORDS__YBEG);
    createEAttribute(lineCoordsEClass, LINE_COORDS__YEND);

    cellStatusEClass = createEClass(CELL_STATUS);
    createEReference(cellStatusEClass, CELL_STATUS__COORDINATES);

    coordinatesEClass = createEClass(COORDINATES);
    createEAttribute(coordinatesEClass, COORDINATES__X);
    createEAttribute(coordinatesEClass, COORDINATES__Y);

    evolutionRulesEClass = createEClass(EVOLUTION_RULES);
    createEReference(evolutionRulesEClass, EVOLUTION_RULES__LIVE_RULES);
    createEReference(evolutionRulesEClass, EVOLUTION_RULES__DEAD_RULES);
    createEReference(evolutionRulesEClass, EVOLUTION_RULES__BECOME_ALIVE_RULES);

    liveRulesEClass = createEClass(LIVE_RULES);
    createEReference(liveRulesEClass, LIVE_RULES__SURROUNDING_CHECK);

    dieRulesEClass = createEClass(DIE_RULES);
    createEReference(dieRulesEClass, DIE_RULES__SURROUNDING_CHECK);

    becomeAliveRulesEClass = createEClass(BECOME_ALIVE_RULES);
    createEReference(becomeAliveRulesEClass, BECOME_ALIVE_RULES__SURROUNDING_CHECK);

    surroundingCheckEClass = createEClass(SURROUNDING_CHECK);
    createEReference(surroundingCheckEClass, SURROUNDING_CHECK__CHECKS);
    createEReference(surroundingCheckEClass, SURROUNDING_CHECK__EXTRACHECK);

    checkEClass = createEClass(CHECK);
    createEAttribute(checkEClass, CHECK__COMPARE);
    createEAttribute(checkEClass, CHECK__INTEGER);

    extraCheckEClass = createEClass(EXTRA_CHECK);
    createEAttribute(extraCheckEClass, EXTRA_CHECK__OPERATOR);
    createEReference(extraCheckEClass, EXTRA_CHECK__CHECK);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(gameStartEClass, GameStart.class, "GameStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGameStart_InitialGrid(), this.getInitialGrid(), null, "initialGrid", null, 0, 1, GameStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGameStart_EvolutionRules(), this.getEvolutionRules(), null, "evolutionRules", null, 0, -1, GameStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initialGridEClass, InitialGrid.class, "InitialGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitialGrid_Cells(), this.getCellStatus(), null, "cells", null, 0, -1, InitialGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialGrid_Lines(), this.getLineStatus(), null, "lines", null, 0, -1, InitialGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineStatusEClass, LineStatus.class, "LineStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLineStatus_Coordinates(), this.getLineCoords(), null, "coordinates", null, 0, 1, LineStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineCoordsEClass, LineCoords.class, "LineCoords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLineCoords_Xbeg(), ecorePackage.getEInt(), "xbeg", null, 0, 1, LineCoords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLineCoords_Xend(), ecorePackage.getEInt(), "xend", null, 0, 1, LineCoords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLineCoords_Ybeg(), ecorePackage.getEInt(), "ybeg", null, 0, 1, LineCoords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLineCoords_Yend(), ecorePackage.getEInt(), "yend", null, 0, 1, LineCoords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellStatusEClass, CellStatus.class, "CellStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCellStatus_Coordinates(), this.getCoordinates(), null, "coordinates", null, 0, 1, CellStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coordinatesEClass, Coordinates.class, "Coordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoordinates_X(), ecorePackage.getEInt(), "x", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoordinates_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evolutionRulesEClass, EvolutionRules.class, "EvolutionRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvolutionRules_LiveRules(), this.getLiveRules(), null, "liveRules", null, 0, -1, EvolutionRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvolutionRules_DeadRules(), this.getDieRules(), null, "deadRules", null, 0, -1, EvolutionRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvolutionRules_BecomeAliveRules(), this.getBecomeAliveRules(), null, "becomeAliveRules", null, 0, -1, EvolutionRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(liveRulesEClass, LiveRules.class, "LiveRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiveRules_SurroundingCheck(), this.getSurroundingCheck(), null, "surroundingCheck", null, 0, 1, LiveRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dieRulesEClass, DieRules.class, "DieRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDieRules_SurroundingCheck(), this.getSurroundingCheck(), null, "surroundingCheck", null, 0, 1, DieRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(becomeAliveRulesEClass, BecomeAliveRules.class, "BecomeAliveRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBecomeAliveRules_SurroundingCheck(), this.getSurroundingCheck(), null, "surroundingCheck", null, 0, 1, BecomeAliveRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(surroundingCheckEClass, SurroundingCheck.class, "SurroundingCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSurroundingCheck_Checks(), this.getCheck(), null, "checks", null, 0, 1, SurroundingCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSurroundingCheck_Extracheck(), this.getExtraCheck(), null, "extracheck", null, 0, -1, SurroundingCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCheck_Compare(), ecorePackage.getEString(), "compare", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCheck_Integer(), ecorePackage.getEInt(), "integer", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extraCheckEClass, ExtraCheck.class, "ExtraCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtraCheck_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, ExtraCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtraCheck_Check(), this.getCheck(), null, "check", null, 0, 1, ExtraCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GameoflifeDSLPackageImpl