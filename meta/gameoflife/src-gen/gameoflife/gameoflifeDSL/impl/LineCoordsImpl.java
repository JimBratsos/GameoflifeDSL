/**
 * generated by Xtext 2.25.0
 */
package gameoflife.gameoflifeDSL.impl;

import gameoflife.gameoflifeDSL.GameoflifeDSLPackage;
import gameoflife.gameoflifeDSL.LineCoords;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Coords</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gameoflife.gameoflifeDSL.impl.LineCoordsImpl#getXbeg <em>Xbeg</em>}</li>
 *   <li>{@link gameoflife.gameoflifeDSL.impl.LineCoordsImpl#getXend <em>Xend</em>}</li>
 *   <li>{@link gameoflife.gameoflifeDSL.impl.LineCoordsImpl#getYbeg <em>Ybeg</em>}</li>
 *   <li>{@link gameoflife.gameoflifeDSL.impl.LineCoordsImpl#getYend <em>Yend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineCoordsImpl extends MinimalEObjectImpl.Container implements LineCoords
{
  /**
   * The default value of the '{@link #getXbeg() <em>Xbeg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXbeg()
   * @generated
   * @ordered
   */
  protected static final int XBEG_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXbeg() <em>Xbeg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXbeg()
   * @generated
   * @ordered
   */
  protected int xbeg = XBEG_EDEFAULT;

  /**
   * The default value of the '{@link #getXend() <em>Xend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXend()
   * @generated
   * @ordered
   */
  protected static final int XEND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXend() <em>Xend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXend()
   * @generated
   * @ordered
   */
  protected int xend = XEND_EDEFAULT;

  /**
   * The default value of the '{@link #getYbeg() <em>Ybeg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYbeg()
   * @generated
   * @ordered
   */
  protected static final int YBEG_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYbeg() <em>Ybeg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYbeg()
   * @generated
   * @ordered
   */
  protected int ybeg = YBEG_EDEFAULT;

  /**
   * The default value of the '{@link #getYend() <em>Yend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYend()
   * @generated
   * @ordered
   */
  protected static final int YEND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYend() <em>Yend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYend()
   * @generated
   * @ordered
   */
  protected int yend = YEND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LineCoordsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GameoflifeDSLPackage.Literals.LINE_COORDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXbeg()
  {
    return xbeg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXbeg(int newXbeg)
  {
    int oldXbeg = xbeg;
    xbeg = newXbeg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameoflifeDSLPackage.LINE_COORDS__XBEG, oldXbeg, xbeg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXend()
  {
    return xend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXend(int newXend)
  {
    int oldXend = xend;
    xend = newXend;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameoflifeDSLPackage.LINE_COORDS__XEND, oldXend, xend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYbeg()
  {
    return ybeg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYbeg(int newYbeg)
  {
    int oldYbeg = ybeg;
    ybeg = newYbeg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameoflifeDSLPackage.LINE_COORDS__YBEG, oldYbeg, ybeg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYend()
  {
    return yend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYend(int newYend)
  {
    int oldYend = yend;
    yend = newYend;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameoflifeDSLPackage.LINE_COORDS__YEND, oldYend, yend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GameoflifeDSLPackage.LINE_COORDS__XBEG:
        return getXbeg();
      case GameoflifeDSLPackage.LINE_COORDS__XEND:
        return getXend();
      case GameoflifeDSLPackage.LINE_COORDS__YBEG:
        return getYbeg();
      case GameoflifeDSLPackage.LINE_COORDS__YEND:
        return getYend();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GameoflifeDSLPackage.LINE_COORDS__XBEG:
        setXbeg((Integer)newValue);
        return;
      case GameoflifeDSLPackage.LINE_COORDS__XEND:
        setXend((Integer)newValue);
        return;
      case GameoflifeDSLPackage.LINE_COORDS__YBEG:
        setYbeg((Integer)newValue);
        return;
      case GameoflifeDSLPackage.LINE_COORDS__YEND:
        setYend((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GameoflifeDSLPackage.LINE_COORDS__XBEG:
        setXbeg(XBEG_EDEFAULT);
        return;
      case GameoflifeDSLPackage.LINE_COORDS__XEND:
        setXend(XEND_EDEFAULT);
        return;
      case GameoflifeDSLPackage.LINE_COORDS__YBEG:
        setYbeg(YBEG_EDEFAULT);
        return;
      case GameoflifeDSLPackage.LINE_COORDS__YEND:
        setYend(YEND_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GameoflifeDSLPackage.LINE_COORDS__XBEG:
        return xbeg != XBEG_EDEFAULT;
      case GameoflifeDSLPackage.LINE_COORDS__XEND:
        return xend != XEND_EDEFAULT;
      case GameoflifeDSLPackage.LINE_COORDS__YBEG:
        return ybeg != YBEG_EDEFAULT;
      case GameoflifeDSLPackage.LINE_COORDS__YEND:
        return yend != YEND_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (xbeg: ");
    result.append(xbeg);
    result.append(", xend: ");
    result.append(xend);
    result.append(", ybeg: ");
    result.append(ybeg);
    result.append(", yend: ");
    result.append(yend);
    result.append(')');
    return result.toString();
  }

} //LineCoordsImpl
