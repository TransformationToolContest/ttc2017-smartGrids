/**
 */
package gluemodel.CIM.IEC61968.WiresExt.impl;

import gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment;
import gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance;
import gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>Per Length Phase Impedance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthPhaseImpedanceImpl#getConductorCount <em>Conductor Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthPhaseImpedanceImpl#getConductorSegments <em>Conductor Segments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.PerLengthPhaseImpedanceImpl#getPhaseImpedanceData <em>Phase Impedance Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerLengthPhaseImpedanceImpl extends IdentifiedObjectImpl implements PerLengthPhaseImpedance {
	/**
	 * The default value of the '{@link #getConductorCount() <em>Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CONDUCTOR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConductorCount() <em>Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorCount()
	 * @generated
	 * @ordered
	 */
	protected int conductorCount = CONDUCTOR_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConductorSegments() <em>Conductor Segments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionLineSegment> conductorSegments;

	/**
	 * The cached value of the '{@link #getPhaseImpedanceData() <em>Phase Impedance Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseImpedanceData()
	 * @generated
	 * @ordered
	 */
	protected EList<PhaseImpedanceData> phaseImpedanceData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerLengthPhaseImpedanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresExtPackage.Literals.PER_LENGTH_PHASE_IMPEDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConductorCount() {
		return conductorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductorCount(int newConductorCount) {
		int oldConductorCount = conductorCount;
		conductorCount = newConductorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT, oldConductorCount, conductorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionLineSegment> getConductorSegments() {
		if (conductorSegments == null) {
			conductorSegments = new EObjectWithInverseResolvingEList<DistributionLineSegment>(DistributionLineSegment.class, this, WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE);
		}
		return conductorSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhaseImpedanceData> getPhaseImpedanceData() {
		if (phaseImpedanceData == null) {
			phaseImpedanceData = new EObjectWithInverseResolvingEList<PhaseImpedanceData>(PhaseImpedanceData.class, this, WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE);
		}
		return phaseImpedanceData;
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
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductorSegments()).basicAdd(otherEnd, msgs);
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhaseImpedanceData()).basicAdd(otherEnd, msgs);
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
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS:
				return ((InternalEList<?>)getConductorSegments()).basicRemove(otherEnd, msgs);
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				return ((InternalEList<?>)getPhaseImpedanceData()).basicRemove(otherEnd, msgs);
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
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
				return getConductorCount();
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS:
				return getConductorSegments();
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				return getPhaseImpedanceData();
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
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
				setConductorCount((Integer)newValue);
				return;
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS:
				getConductorSegments().clear();
				getConductorSegments().addAll((Collection<? extends DistributionLineSegment>)newValue);
				return;
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				getPhaseImpedanceData().clear();
				getPhaseImpedanceData().addAll((Collection<? extends PhaseImpedanceData>)newValue);
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
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
				setConductorCount(CONDUCTOR_COUNT_EDEFAULT);
				return;
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS:
				getConductorSegments().clear();
				return;
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				getPhaseImpedanceData().clear();
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
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
				return conductorCount != CONDUCTOR_COUNT_EDEFAULT;
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS:
				return conductorSegments != null && !conductorSegments.isEmpty();
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				return phaseImpedanceData != null && !phaseImpedanceData.isEmpty();
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
		result.append(" (conductorCount: ");
		result.append(conductorCount);
		result.append(')');
		return result.toString();
	}

} //PerLengthPhaseImpedanceImpl
