/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.UtilitiesTableObject;

import COSEM.InterfaceClasses.impl.UtilitytablesImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utilities Table Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.UtilitiesTableObjectImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.UtilitiesTableObjectImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.UtilitiesTableObjectImpl#getStdPending <em>Std Pending</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.UtilitiesTableObjectImpl#getMfgPending <em>Mfg Pending</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilitiesTableObjectImpl extends UtilitytablesImpl implements UtilitiesTableObject {
	/**
	 * The default value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected String standard = STANDARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStdPending() <em>Std Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdPending()
	 * @generated
	 * @ordered
	 */
	protected static final String STD_PENDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdPending() <em>Std Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdPending()
	 * @generated
	 * @ordered
	 */
	protected String stdPending = STD_PENDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMfgPending() <em>Mfg Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfgPending()
	 * @generated
	 * @ordered
	 */
	protected static final String MFG_PENDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMfgPending() <em>Mfg Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfgPending()
	 * @generated
	 * @ordered
	 */
	protected String mfgPending = MFG_PENDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilitiesTableObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getUtilitiesTableObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandard(String newStandard) {
		String oldStandard = standard;
		standard = newStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STANDARD, oldStandard, standard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStdPending() {
		return stdPending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdPending(String newStdPending) {
		String oldStdPending = stdPending;
		stdPending = newStdPending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STD_PENDING, oldStdPending, stdPending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMfgPending() {
		return mfgPending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMfgPending(String newMfgPending) {
		String oldMfgPending = mfgPending;
		mfgPending = newMfgPending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MFG_PENDING, oldMfgPending, mfgPending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STANDARD:
				return getStandard();
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MANUFACTURER:
				return getManufacturer();
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STD_PENDING:
				return getStdPending();
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MFG_PENDING:
				return getMfgPending();
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
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STANDARD:
				setStandard((String)newValue);
				return;
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STD_PENDING:
				setStdPending((String)newValue);
				return;
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MFG_PENDING:
				setMfgPending((String)newValue);
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
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STANDARD:
				setStandard(STANDARD_EDEFAULT);
				return;
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STD_PENDING:
				setStdPending(STD_PENDING_EDEFAULT);
				return;
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MFG_PENDING:
				setMfgPending(MFG_PENDING_EDEFAULT);
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
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STANDARD:
				return STANDARD_EDEFAULT == null ? standard != null : !STANDARD_EDEFAULT.equals(standard);
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__STD_PENDING:
				return STD_PENDING_EDEFAULT == null ? stdPending != null : !STD_PENDING_EDEFAULT.equals(stdPending);
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT__MFG_PENDING:
				return MFG_PENDING_EDEFAULT == null ? mfgPending != null : !MFG_PENDING_EDEFAULT.equals(mfgPending);
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
		result.append(" (Standard: ");
		result.append(standard);
		result.append(", Manufacturer: ");
		result.append(manufacturer);
		result.append(", StdPending: ");
		result.append(stdPending);
		result.append(", MfgPending: ");
		result.append(mfgPending);
		result.append(')');
		return result.toString();
	}

} //UtilitiesTableObjectImpl
