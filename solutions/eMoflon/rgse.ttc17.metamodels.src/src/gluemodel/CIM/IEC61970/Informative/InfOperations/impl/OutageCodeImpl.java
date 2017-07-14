/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep;

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
 * An implementation of the model object '<em><b>Outage Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageCodeImpl#getSubCode <em>Sub Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageCodeImpl#getOutageRecords <em>Outage Records</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageCodeImpl#getOutageSteps <em>Outage Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageCodeImpl extends IdentifiedObjectImpl implements OutageCode {
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
	 * The cached value of the '{@link #getOutageRecords() <em>Outage Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageRecord> outageRecords;

	/**
	 * The cached value of the '{@link #getOutageSteps() <em>Outage Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStep> outageSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_CODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_CODE__SUB_CODE, oldSubCode, subCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageRecord> getOutageRecords() {
		if (outageRecords == null) {
			outageRecords = new EObjectWithInverseResolvingEList.ManyInverse<OutageRecord>(OutageRecord.class, this, InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES);
		}
		return outageRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageStep> getOutageSteps() {
		if (outageSteps == null) {
			outageSteps = new EObjectWithInverseResolvingEList.ManyInverse<OutageStep>(OutageStep.class, this, InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS, InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES);
		}
		return outageSteps;
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
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageRecords()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageSteps()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				return ((InternalEList<?>)getOutageRecords()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				return ((InternalEList<?>)getOutageSteps()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_CODE__SUB_CODE:
				return getSubCode();
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				return getOutageRecords();
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				return getOutageSteps();
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
			case InfOperationsPackage.OUTAGE_CODE__SUB_CODE:
				setSubCode((String)newValue);
				return;
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				getOutageRecords().clear();
				getOutageRecords().addAll((Collection<? extends OutageRecord>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				getOutageSteps().clear();
				getOutageSteps().addAll((Collection<? extends OutageStep>)newValue);
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
			case InfOperationsPackage.OUTAGE_CODE__SUB_CODE:
				setSubCode(SUB_CODE_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				getOutageRecords().clear();
				return;
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				getOutageSteps().clear();
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
			case InfOperationsPackage.OUTAGE_CODE__SUB_CODE:
				return SUB_CODE_EDEFAULT == null ? subCode != null : !SUB_CODE_EDEFAULT.equals(subCode);
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				return outageRecords != null && !outageRecords.isEmpty();
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				return outageSteps != null && !outageSteps.isEmpty();
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

} //OutageCodeImpl
