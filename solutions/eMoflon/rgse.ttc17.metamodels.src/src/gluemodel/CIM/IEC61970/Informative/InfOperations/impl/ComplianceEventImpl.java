/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.ComplianceEvent;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compliance Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ComplianceEventImpl#getComplianceType <em>Compliance Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.ComplianceEventImpl#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplianceEventImpl extends ActivityRecordImpl implements ComplianceEvent {
	/**
	 * The default value of the '{@link #getComplianceType() <em>Compliance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceType()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLIANCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplianceType() <em>Compliance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceType()
	 * @generated
	 * @ordered
	 */
	protected String complianceType = COMPLIANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected Date deadline = DEADLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.COMPLIANCE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplianceType() {
		return complianceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplianceType(String newComplianceType) {
		String oldComplianceType = complianceType;
		complianceType = newComplianceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.COMPLIANCE_EVENT__COMPLIANCE_TYPE, oldComplianceType, complianceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(Date newDeadline) {
		Date oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.COMPLIANCE_EVENT__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfOperationsPackage.COMPLIANCE_EVENT__COMPLIANCE_TYPE:
				return getComplianceType();
			case InfOperationsPackage.COMPLIANCE_EVENT__DEADLINE:
				return getDeadline();
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
			case InfOperationsPackage.COMPLIANCE_EVENT__COMPLIANCE_TYPE:
				setComplianceType((String)newValue);
				return;
			case InfOperationsPackage.COMPLIANCE_EVENT__DEADLINE:
				setDeadline((Date)newValue);
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
			case InfOperationsPackage.COMPLIANCE_EVENT__COMPLIANCE_TYPE:
				setComplianceType(COMPLIANCE_TYPE_EDEFAULT);
				return;
			case InfOperationsPackage.COMPLIANCE_EVENT__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
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
			case InfOperationsPackage.COMPLIANCE_EVENT__COMPLIANCE_TYPE:
				return COMPLIANCE_TYPE_EDEFAULT == null ? complianceType != null : !COMPLIANCE_TYPE_EDEFAULT.equals(complianceType);
			case InfOperationsPackage.COMPLIANCE_EVENT__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
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
		result.append(" (complianceType: ");
		result.append(complianceType);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(')');
		return result.toString();
	}

} //ComplianceEventImpl
