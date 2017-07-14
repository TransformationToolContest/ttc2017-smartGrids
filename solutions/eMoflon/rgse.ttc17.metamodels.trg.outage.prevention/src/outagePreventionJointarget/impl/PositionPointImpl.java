/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionJointarget.OutagePreventionJointargetPackage;
import outagePreventionJointarget.PositionPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.PositionPointImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PositionPointImpl#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PositionPointImpl#getZPosition <em>ZPosition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionPointImpl extends MinimalEObjectImpl.Container implements PositionPoint {
	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String XPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected String xPosition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String YPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected String yPosition = YPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String ZPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZPosition()
	 * @generated
	 * @ordered
	 */
	protected String zPosition = ZPOSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.POSITION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXPosition() {
		return xPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPosition(String newXPosition) {
		String oldXPosition = xPosition;
		xPosition = newXPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.POSITION_POINT__XPOSITION, oldXPosition, xPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYPosition() {
		return yPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPosition(String newYPosition) {
		String oldYPosition = yPosition;
		yPosition = newYPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.POSITION_POINT__YPOSITION, oldYPosition, yPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZPosition() {
		return zPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZPosition(String newZPosition) {
		String oldZPosition = zPosition;
		zPosition = newZPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.POSITION_POINT__ZPOSITION, oldZPosition, zPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.POSITION_POINT__XPOSITION:
				return getXPosition();
			case OutagePreventionJointargetPackage.POSITION_POINT__YPOSITION:
				return getYPosition();
			case OutagePreventionJointargetPackage.POSITION_POINT__ZPOSITION:
				return getZPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.POSITION_POINT__XPOSITION:
				setXPosition((String)newValue);
				return;
			case OutagePreventionJointargetPackage.POSITION_POINT__YPOSITION:
				setYPosition((String)newValue);
				return;
			case OutagePreventionJointargetPackage.POSITION_POINT__ZPOSITION:
				setZPosition((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.POSITION_POINT__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.POSITION_POINT__YPOSITION:
				setYPosition(YPOSITION_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.POSITION_POINT__ZPOSITION:
				setZPosition(ZPOSITION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.POSITION_POINT__XPOSITION:
				return XPOSITION_EDEFAULT == null ? xPosition != null : !XPOSITION_EDEFAULT.equals(xPosition);
			case OutagePreventionJointargetPackage.POSITION_POINT__YPOSITION:
				return YPOSITION_EDEFAULT == null ? yPosition != null : !YPOSITION_EDEFAULT.equals(yPosition);
			case OutagePreventionJointargetPackage.POSITION_POINT__ZPOSITION:
				return ZPOSITION_EDEFAULT == null ? zPosition != null : !ZPOSITION_EDEFAULT.equals(zPosition);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xPosition: ");
		result.append(xPosition);
		result.append(", yPosition: ");
		result.append(yPosition);
		result.append(", zPosition: ");
		result.append(zPosition);
		result.append(')');
		return result.toString();
	}

} //PositionPointImpl
