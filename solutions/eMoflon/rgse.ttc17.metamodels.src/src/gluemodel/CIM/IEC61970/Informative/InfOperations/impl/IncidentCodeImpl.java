/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentCode;
import gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incident Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentCodeImpl#getSubCode <em>Sub Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentCodeImpl#getIncidentRecords <em>Incident Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncidentCodeImpl extends IdentifiedObjectImpl implements IncidentCode {
	/**
	 * The default value of the '{@link #getSubCode() <em>Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubCode() <em>Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCode()
	 * @generated
	 * @ordered
	 */
	protected String subCode = SUB_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncidentRecords() <em>Incident Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<IncidentRecord> incidentRecords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncidentCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.INCIDENT_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubCode() {
		return subCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubCode(String newSubCode) {
		String oldSubCode = subCode;
		subCode = newSubCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.INCIDENT_CODE__SUB_CODE, oldSubCode, subCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncidentRecord> getIncidentRecords() {
		if (incidentRecords == null) {
			incidentRecords = new EObjectWithInverseResolvingEList.ManyInverse<IncidentRecord>(IncidentRecord.class, this, InfOperationsPackage.INCIDENT_CODE__INCIDENT_RECORDS, InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES);
		}
		return incidentRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.INCIDENT_CODE__INCIDENT_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncidentRecords()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.INCIDENT_CODE__INCIDENT_RECORDS:
				return ((InternalEList<?>)getIncidentRecords()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfOperationsPackage.INCIDENT_CODE__SUB_CODE:
				return getSubCode();
			case InfOperationsPackage.INCIDENT_CODE__INCIDENT_RECORDS:
				return getIncidentRecords();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfOperationsPackage.INCIDENT_CODE__SUB_CODE:
				setSubCode((String)newValue);
				return;
			case InfOperationsPackage.INCIDENT_CODE__INCIDENT_RECORDS:
				getIncidentRecords().clear();
				getIncidentRecords().addAll((Collection<? extends IncidentRecord>)newValue);
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
			case InfOperationsPackage.INCIDENT_CODE__SUB_CODE:
				setSubCode(SUB_CODE_EDEFAULT);
				return;
			case InfOperationsPackage.INCIDENT_CODE__INCIDENT_RECORDS:
				getIncidentRecords().clear();
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
			case InfOperationsPackage.INCIDENT_CODE__SUB_CODE:
				return SUB_CODE_EDEFAULT == null ? subCode != null : !SUB_CODE_EDEFAULT.equals(subCode);
			case InfOperationsPackage.INCIDENT_CODE__INCIDENT_RECORDS:
				return incidentRecords != null && !incidentRecords.isEmpty();
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
		result.append(" (subCode: ");
		result.append(subCode);
		result.append(')');
		return result.toString();
	}

} //IncidentCodeImpl
