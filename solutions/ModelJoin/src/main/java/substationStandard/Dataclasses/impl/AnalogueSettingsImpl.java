/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.AnalogueSettings;
import substationStandard.Dataclasses.DataclassesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analogue Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.AnalogueSettingsImpl#getD <em>D</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.AnalogueSettingsImpl#getDU <em>DU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogueSettingsImpl extends MinimalEObjectImpl.Container implements AnalogueSettings {
	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final String D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected String d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getDU() <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDU()
	 * @generated
	 * @ordered
	 */
	protected static final String DU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDU() <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDU()
	 * @generated
	 * @ordered
	 */
	protected String dU = DU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogueSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.ANALOGUE_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(String newD) {
		String oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ANALOGUE_SETTINGS__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDU() {
		return dU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDU(String newDU) {
		String oldDU = dU;
		dU = newDU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ANALOGUE_SETTINGS__DU, oldDU, dU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.ANALOGUE_SETTINGS__D:
				return getD();
			case DataclassesPackage.ANALOGUE_SETTINGS__DU:
				return getDU();
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
			case DataclassesPackage.ANALOGUE_SETTINGS__D:
				setD((String)newValue);
				return;
			case DataclassesPackage.ANALOGUE_SETTINGS__DU:
				setDU((String)newValue);
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
			case DataclassesPackage.ANALOGUE_SETTINGS__D:
				setD(D_EDEFAULT);
				return;
			case DataclassesPackage.ANALOGUE_SETTINGS__DU:
				setDU(DU_EDEFAULT);
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
			case DataclassesPackage.ANALOGUE_SETTINGS__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case DataclassesPackage.ANALOGUE_SETTINGS__DU:
				return DU_EDEFAULT == null ? dU != null : !DU_EDEFAULT.equals(dU);
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
		result.append(" (d: ");
		result.append(d);
		result.append(", dU: ");
		result.append(dU);
		result.append(')');
		return result.toString();
	}

} //AnalogueSettingsImpl
