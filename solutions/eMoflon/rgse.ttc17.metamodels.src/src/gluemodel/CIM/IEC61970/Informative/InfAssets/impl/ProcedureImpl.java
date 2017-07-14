/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureKind;

import gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import gluemodel.CIM.IEC61970.Meas.Limit;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;

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
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl#getProcedureValues <em>Procedure Values</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends DocumentImpl implements Procedure {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ProcedureKind KIND_EDEFAULT = ProcedureKind.MAINTENANCE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ProcedureKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<Limit> limits;

	/**
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * The cached value of the '{@link #getProcedureDataSets() <em>Procedure Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureDataSet> procedureDataSets;

	/**
	 * The cached value of the '{@link #getProcedureValues() <em>Procedure Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureValues()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> procedureValues;

	/**
	 * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPORATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected String corporateCode = CORPORATE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected String instruction = INSTRUCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ProcedureKind newKind) {
		ProcedureKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.PROCEDURE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(String newSequenceNumber) {
		String oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.PROCEDURE__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Limit> getLimits() {
		if (limits == null) {
			limits = new EObjectWithInverseResolvingEList.ManyInverse<Limit>(Limit.class, this, InfAssetsPackage.PROCEDURE__LIMITS, MeasPackage.LIMIT__PROCEDURES);
		}
		return limits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new EObjectWithInverseResolvingEList.ManyInverse<CompatibleUnit>(CompatibleUnit.class, this, InfAssetsPackage.PROCEDURE__COMPATIBLE_UNITS, InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES);
		}
		return compatibleUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureDataSet> getProcedureDataSets() {
		if (procedureDataSets == null) {
			procedureDataSets = new EObjectWithInverseResolvingEList<ProcedureDataSet>(ProcedureDataSet.class, this, InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS, InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE);
		}
		return procedureDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getProcedureValues() {
		if (procedureValues == null) {
			procedureValues = new EObjectWithInverseResolvingEList<UserAttribute>(UserAttribute.class, this, InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES, CommonPackage.USER_ATTRIBUTE__PROCEDURE);
		}
		return procedureValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorporateCode() {
		return corporateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorporateCode(String newCorporateCode) {
		String oldCorporateCode = corporateCode;
		corporateCode = newCorporateCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.PROCEDURE__CORPORATE_CODE, oldCorporateCode, corporateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(String newInstruction) {
		String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.PROCEDURE__INSTRUCTION, oldInstruction, instruction));
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
			case InfAssetsPackage.PROCEDURE__LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLimits()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedureDataSets()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedureValues()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.PROCEDURE__LIMITS:
				return ((InternalEList<?>)getLimits()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS:
				return ((InternalEList<?>)getProcedureDataSets()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES:
				return ((InternalEList<?>)getProcedureValues()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.PROCEDURE__KIND:
				return getKind();
			case InfAssetsPackage.PROCEDURE__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case InfAssetsPackage.PROCEDURE__LIMITS:
				return getLimits();
			case InfAssetsPackage.PROCEDURE__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS:
				return getProcedureDataSets();
			case InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES:
				return getProcedureValues();
			case InfAssetsPackage.PROCEDURE__CORPORATE_CODE:
				return getCorporateCode();
			case InfAssetsPackage.PROCEDURE__INSTRUCTION:
				return getInstruction();
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
			case InfAssetsPackage.PROCEDURE__KIND:
				setKind((ProcedureKind)newValue);
				return;
			case InfAssetsPackage.PROCEDURE__SEQUENCE_NUMBER:
				setSequenceNumber((String)newValue);
				return;
			case InfAssetsPackage.PROCEDURE__LIMITS:
				getLimits().clear();
				getLimits().addAll((Collection<? extends Limit>)newValue);
				return;
			case InfAssetsPackage.PROCEDURE__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				getProcedureDataSets().addAll((Collection<? extends ProcedureDataSet>)newValue);
				return;
			case InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES:
				getProcedureValues().clear();
				getProcedureValues().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfAssetsPackage.PROCEDURE__CORPORATE_CODE:
				setCorporateCode((String)newValue);
				return;
			case InfAssetsPackage.PROCEDURE__INSTRUCTION:
				setInstruction((String)newValue);
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
			case InfAssetsPackage.PROCEDURE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfAssetsPackage.PROCEDURE__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case InfAssetsPackage.PROCEDURE__LIMITS:
				getLimits().clear();
				return;
			case InfAssetsPackage.PROCEDURE__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				return;
			case InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES:
				getProcedureValues().clear();
				return;
			case InfAssetsPackage.PROCEDURE__CORPORATE_CODE:
				setCorporateCode(CORPORATE_CODE_EDEFAULT);
				return;
			case InfAssetsPackage.PROCEDURE__INSTRUCTION:
				setInstruction(INSTRUCTION_EDEFAULT);
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
			case InfAssetsPackage.PROCEDURE__KIND:
				return kind != KIND_EDEFAULT;
			case InfAssetsPackage.PROCEDURE__SEQUENCE_NUMBER:
				return SEQUENCE_NUMBER_EDEFAULT == null ? sequenceNumber != null : !SEQUENCE_NUMBER_EDEFAULT.equals(sequenceNumber);
			case InfAssetsPackage.PROCEDURE__LIMITS:
				return limits != null && !limits.isEmpty();
			case InfAssetsPackage.PROCEDURE__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS:
				return procedureDataSets != null && !procedureDataSets.isEmpty();
			case InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES:
				return procedureValues != null && !procedureValues.isEmpty();
			case InfAssetsPackage.PROCEDURE__CORPORATE_CODE:
				return CORPORATE_CODE_EDEFAULT == null ? corporateCode != null : !CORPORATE_CODE_EDEFAULT.equals(corporateCode);
			case InfAssetsPackage.PROCEDURE__INSTRUCTION:
				return INSTRUCTION_EDEFAULT == null ? instruction != null : !INSTRUCTION_EDEFAULT.equals(instruction);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", corporateCode: ");
		result.append(corporateCode);
		result.append(", instruction: ");
		result.append(instruction);
		result.append(')');
		return result.toString();
	}

} //ProcedureImpl
