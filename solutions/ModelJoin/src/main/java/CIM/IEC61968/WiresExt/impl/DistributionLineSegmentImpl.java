/**
 */
package CIM.IEC61968.WiresExt.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.ConductorInfo;

import CIM.IEC61968.WiresExt.DistributionLineSegment;
import CIM.IEC61968.WiresExt.PerLengthPhaseImpedance;
import CIM.IEC61968.WiresExt.PerLengthSequenceImpedance;
import CIM.IEC61968.WiresExt.WiresExtPackage;

import CIM.IEC61970.Informative.InfAssets.ConductorAsset;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Wires.impl.ACLineSegmentImpl;

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
 * An implementation of the model object '<em><b>Distribution Line Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionLineSegmentImpl#getPhaseImpedance <em>Phase Impedance</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionLineSegmentImpl#getConductorAssets <em>Conductor Assets</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionLineSegmentImpl#getSequenceImpedance <em>Sequence Impedance</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionLineSegmentImpl#getConductorInfo <em>Conductor Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionLineSegmentImpl extends ACLineSegmentImpl implements DistributionLineSegment {
	/**
	 * The cached value of the '{@link #getPhaseImpedance() <em>Phase Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseImpedance()
	 * @generated
	 * @ordered
	 */
	protected PerLengthPhaseImpedance phaseImpedance;

	/**
	 * The cached value of the '{@link #getConductorAssets() <em>Conductor Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<ConductorAsset> conductorAssets;

	/**
	 * The cached value of the '{@link #getSequenceImpedance() <em>Sequence Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceImpedance()
	 * @generated
	 * @ordered
	 */
	protected PerLengthSequenceImpedance sequenceImpedance;

	/**
	 * The cached value of the '{@link #getConductorInfo() <em>Conductor Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorInfo()
	 * @generated
	 * @ordered
	 */
	protected ConductorInfo conductorInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionLineSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresExtPackage.Literals.DISTRIBUTION_LINE_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthPhaseImpedance getPhaseImpedance() {
		if (phaseImpedance != null && phaseImpedance.eIsProxy()) {
			InternalEObject oldPhaseImpedance = (InternalEObject)phaseImpedance;
			phaseImpedance = (PerLengthPhaseImpedance)eResolveProxy(oldPhaseImpedance);
			if (phaseImpedance != oldPhaseImpedance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE, oldPhaseImpedance, phaseImpedance));
			}
		}
		return phaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthPhaseImpedance basicGetPhaseImpedance() {
		return phaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseImpedance(PerLengthPhaseImpedance newPhaseImpedance, NotificationChain msgs) {
		PerLengthPhaseImpedance oldPhaseImpedance = phaseImpedance;
		phaseImpedance = newPhaseImpedance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE, oldPhaseImpedance, newPhaseImpedance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseImpedance(PerLengthPhaseImpedance newPhaseImpedance) {
		if (newPhaseImpedance != phaseImpedance) {
			NotificationChain msgs = null;
			if (phaseImpedance != null)
				msgs = ((InternalEObject)phaseImpedance).eInverseRemove(this, WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS, PerLengthPhaseImpedance.class, msgs);
			if (newPhaseImpedance != null)
				msgs = ((InternalEObject)newPhaseImpedance).eInverseAdd(this, WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS, PerLengthPhaseImpedance.class, msgs);
			msgs = basicSetPhaseImpedance(newPhaseImpedance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE, newPhaseImpedance, newPhaseImpedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConductorAsset> getConductorAssets() {
		if (conductorAssets == null) {
			conductorAssets = new EObjectWithInverseResolvingEList<ConductorAsset>(ConductorAsset.class, this, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS, InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT);
		}
		return conductorAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthSequenceImpedance getSequenceImpedance() {
		if (sequenceImpedance != null && sequenceImpedance.eIsProxy()) {
			InternalEObject oldSequenceImpedance = (InternalEObject)sequenceImpedance;
			sequenceImpedance = (PerLengthSequenceImpedance)eResolveProxy(oldSequenceImpedance);
			if (sequenceImpedance != oldSequenceImpedance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE, oldSequenceImpedance, sequenceImpedance));
			}
		}
		return sequenceImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthSequenceImpedance basicGetSequenceImpedance() {
		return sequenceImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceImpedance(PerLengthSequenceImpedance newSequenceImpedance, NotificationChain msgs) {
		PerLengthSequenceImpedance oldSequenceImpedance = sequenceImpedance;
		sequenceImpedance = newSequenceImpedance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE, oldSequenceImpedance, newSequenceImpedance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceImpedance(PerLengthSequenceImpedance newSequenceImpedance) {
		if (newSequenceImpedance != sequenceImpedance) {
			NotificationChain msgs = null;
			if (sequenceImpedance != null)
				msgs = ((InternalEObject)sequenceImpedance).eInverseRemove(this, WiresExtPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__CONDUCTOR_SEGMENTS, PerLengthSequenceImpedance.class, msgs);
			if (newSequenceImpedance != null)
				msgs = ((InternalEObject)newSequenceImpedance).eInverseAdd(this, WiresExtPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__CONDUCTOR_SEGMENTS, PerLengthSequenceImpedance.class, msgs);
			msgs = basicSetSequenceImpedance(newSequenceImpedance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE, newSequenceImpedance, newSequenceImpedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInfo getConductorInfo() {
		if (conductorInfo != null && conductorInfo.eIsProxy()) {
			InternalEObject oldConductorInfo = (InternalEObject)conductorInfo;
			conductorInfo = (ConductorInfo)eResolveProxy(oldConductorInfo);
			if (conductorInfo != oldConductorInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO, oldConductorInfo, conductorInfo));
			}
		}
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInfo basicGetConductorInfo() {
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductorInfo(ConductorInfo newConductorInfo, NotificationChain msgs) {
		ConductorInfo oldConductorInfo = conductorInfo;
		conductorInfo = newConductorInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO, oldConductorInfo, newConductorInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductorInfo(ConductorInfo newConductorInfo) {
		if (newConductorInfo != conductorInfo) {
			NotificationChain msgs = null;
			if (conductorInfo != null)
				msgs = ((InternalEObject)conductorInfo).eInverseRemove(this, AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS, ConductorInfo.class, msgs);
			if (newConductorInfo != null)
				msgs = ((InternalEObject)newConductorInfo).eInverseAdd(this, AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS, ConductorInfo.class, msgs);
			msgs = basicSetConductorInfo(newConductorInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO, newConductorInfo, newConductorInfo));
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
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE:
				if (phaseImpedance != null)
					msgs = ((InternalEObject)phaseImpedance).eInverseRemove(this, WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_SEGMENTS, PerLengthPhaseImpedance.class, msgs);
				return basicSetPhaseImpedance((PerLengthPhaseImpedance)otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductorAssets()).basicAdd(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				if (sequenceImpedance != null)
					msgs = ((InternalEObject)sequenceImpedance).eInverseRemove(this, WiresExtPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__CONDUCTOR_SEGMENTS, PerLengthSequenceImpedance.class, msgs);
				return basicSetSequenceImpedance((PerLengthSequenceImpedance)otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO:
				if (conductorInfo != null)
					msgs = ((InternalEObject)conductorInfo).eInverseRemove(this, AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS, ConductorInfo.class, msgs);
				return basicSetConductorInfo((ConductorInfo)otherEnd, msgs);
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
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE:
				return basicSetPhaseImpedance(null, msgs);
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS:
				return ((InternalEList<?>)getConductorAssets()).basicRemove(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				return basicSetSequenceImpedance(null, msgs);
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO:
				return basicSetConductorInfo(null, msgs);
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
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE:
				if (resolve) return getPhaseImpedance();
				return basicGetPhaseImpedance();
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS:
				return getConductorAssets();
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				if (resolve) return getSequenceImpedance();
				return basicGetSequenceImpedance();
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO:
				if (resolve) return getConductorInfo();
				return basicGetConductorInfo();
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
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE:
				setPhaseImpedance((PerLengthPhaseImpedance)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS:
				getConductorAssets().clear();
				getConductorAssets().addAll((Collection<? extends ConductorAsset>)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				setSequenceImpedance((PerLengthSequenceImpedance)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO:
				setConductorInfo((ConductorInfo)newValue);
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
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE:
				setPhaseImpedance((PerLengthPhaseImpedance)null);
				return;
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS:
				getConductorAssets().clear();
				return;
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				setSequenceImpedance((PerLengthSequenceImpedance)null);
				return;
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO:
				setConductorInfo((ConductorInfo)null);
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
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__PHASE_IMPEDANCE:
				return phaseImpedance != null;
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS:
				return conductorAssets != null && !conductorAssets.isEmpty();
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				return sequenceImpedance != null;
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO:
				return conductorInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //DistributionLineSegmentImpl
