/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionJointarget.ControlArea;
import outagePreventionJointarget.OutagePreventionJointargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.ControlAreaImpl#getMRID <em>MRID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlAreaImpl extends MinimalEObjectImpl.Container implements ControlArea {
	/**
	 * The default value of the '{@link #getMRID() <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRID()
	 * @generated
	 * @ordered
	 */
	protected static final String MRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMRID() <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRID()
	 * @generated
	 * @ordered
	 */
	protected String mRID = MRID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.CONTROL_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMRID() {
		return mRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMRID(String newMRID) {
		String oldMRID = mRID;
		mRID = newMRID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.CONTROL_AREA__MRID, oldMRID, mRID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.CONTROL_AREA__MRID:
				return getMRID();
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
			case OutagePreventionJointargetPackage.CONTROL_AREA__MRID:
				setMRID((String)newValue);
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
			case OutagePreventionJointargetPackage.CONTROL_AREA__MRID:
				setMRID(MRID_EDEFAULT);
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
			case OutagePreventionJointargetPackage.CONTROL_AREA__MRID:
				return MRID_EDEFAULT == null ? mRID != null : !MRID_EDEFAULT.equals(mRID);
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
		result.append(" (mRID: ");
		result.append(mRID);
		result.append(')');
		return result.toString();
	}

} //ControlAreaImpl
