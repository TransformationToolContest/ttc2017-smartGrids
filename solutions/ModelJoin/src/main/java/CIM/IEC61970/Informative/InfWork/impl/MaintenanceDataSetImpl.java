/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl;

import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.MaintenanceDataSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaintenanceDataSetImpl#getMaintCode <em>Maint Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaintenanceDataSetImpl#getConditionBefore <em>Condition Before</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaintenanceDataSetImpl#getConditionAfter <em>Condition After</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceDataSetImpl extends ProcedureDataSetImpl implements MaintenanceDataSet {
	/**
	 * The default value of the '{@link #getMaintCode() <em>Maint Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintCode()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintCode() <em>Maint Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintCode()
	 * @generated
	 * @ordered
	 */
	protected String maintCode = MAINT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionBefore() <em>Condition Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionBefore()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_BEFORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionBefore() <em>Condition Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionBefore()
	 * @generated
	 * @ordered
	 */
	protected String conditionBefore = CONDITION_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionAfter() <em>Condition After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionAfter()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_AFTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionAfter() <em>Condition After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionAfter()
	 * @generated
	 * @ordered
	 */
	protected String conditionAfter = CONDITION_AFTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintenanceDataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.MAINTENANCE_DATA_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintCode() {
		return maintCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintCode(String newMaintCode) {
		String oldMaintCode = maintCode;
		maintCode = newMaintCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MAINTENANCE_DATA_SET__MAINT_CODE, oldMaintCode, maintCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionBefore() {
		return conditionBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionBefore(String newConditionBefore) {
		String oldConditionBefore = conditionBefore;
		conditionBefore = newConditionBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE, oldConditionBefore, conditionBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionAfter() {
		return conditionAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionAfter(String newConditionAfter) {
		String oldConditionAfter = conditionAfter;
		conditionAfter = newConditionAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER, oldConditionAfter, conditionAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfWorkPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
				return getMaintCode();
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
				return getConditionBefore();
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
				return getConditionAfter();
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
			case InfWorkPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
				setMaintCode((String)newValue);
				return;
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
				setConditionBefore((String)newValue);
				return;
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
				setConditionAfter((String)newValue);
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
			case InfWorkPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
				setMaintCode(MAINT_CODE_EDEFAULT);
				return;
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
				setConditionBefore(CONDITION_BEFORE_EDEFAULT);
				return;
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
				setConditionAfter(CONDITION_AFTER_EDEFAULT);
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
			case InfWorkPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
				return MAINT_CODE_EDEFAULT == null ? maintCode != null : !MAINT_CODE_EDEFAULT.equals(maintCode);
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
				return CONDITION_BEFORE_EDEFAULT == null ? conditionBefore != null : !CONDITION_BEFORE_EDEFAULT.equals(conditionBefore);
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
				return CONDITION_AFTER_EDEFAULT == null ? conditionAfter != null : !CONDITION_AFTER_EDEFAULT.equals(conditionAfter);
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
		result.append(" (maintCode: ");
		result.append(maintCode);
		result.append(", conditionBefore: ");
		result.append(conditionBefore);
		result.append(", conditionAfter: ");
		result.append(conditionAfter);
		result.append(')');
		return result.toString();
	}

} //MaintenanceDataSetImpl
