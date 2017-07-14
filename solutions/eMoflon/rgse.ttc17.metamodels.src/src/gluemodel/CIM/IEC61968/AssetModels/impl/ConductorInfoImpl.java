/**
 */
package gluemodel.CIM.IEC61968.AssetModels.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.ConductorInfo;
import gluemodel.CIM.IEC61968.AssetModels.ConductorInsulationKind;
import gluemodel.CIM.IEC61968.AssetModels.ConductorUsageKind;
import gluemodel.CIM.IEC61968.AssetModels.WireArrangement;

import gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment;
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
 * An implementation of the model object '<em><b>Conductor Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl#getConductorSegments <em>Conductor Segments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl#isInsulated <em>Insulated</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl#getInsulationThickness <em>Insulation Thickness</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl#getWireArrangements <em>Wire Arrangements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ConductorInfoImpl#getInsulationMaterial <em>Insulation Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductorInfoImpl extends IdentifiedObjectImpl implements ConductorInfo {
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
	 * The default value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected int phaseCount = PHASE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInsulated() <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsulated() <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean insulated = INSULATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsulationThickness() <em>Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationThickness()
	 * @generated
	 * @ordered
	 */
	protected static final float INSULATION_THICKNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInsulationThickness() <em>Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationThickness()
	 * @generated
	 * @ordered
	 */
	protected float insulationThickness = INSULATION_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final ConductorUsageKind USAGE_EDEFAULT = ConductorUsageKind.SECONDARY;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected ConductorUsageKind usage = USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWireArrangements() <em>Wire Arrangements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireArrangements()
	 * @generated
	 * @ordered
	 */
	protected EList<WireArrangement> wireArrangements;

	/**
	 * The default value of the '{@link #getInsulationMaterial() <em>Insulation Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final ConductorInsulationKind INSULATION_MATERIAL_EDEFAULT = ConductorInsulationKind.CROSSLINKED_POLYETHYLENE;

	/**
	 * The cached value of the '{@link #getInsulationMaterial() <em>Insulation Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationMaterial()
	 * @generated
	 * @ordered
	 */
	protected ConductorInsulationKind insulationMaterial = INSULATION_MATERIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductorInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.CONDUCTOR_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionLineSegment> getConductorSegments() {
		if (conductorSegments == null) {
			conductorSegments = new EObjectWithInverseResolvingEList<DistributionLineSegment>(DistributionLineSegment.class, this, AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_INFO);
		}
		return conductorSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhaseCount() {
		return phaseCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCount(int newPhaseCount) {
		int oldPhaseCount = phaseCount;
		phaseCount = newPhaseCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CONDUCTOR_INFO__PHASE_COUNT, oldPhaseCount, phaseCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsulated() {
		return insulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulated(boolean newInsulated) {
		boolean oldInsulated = insulated;
		insulated = newInsulated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CONDUCTOR_INFO__INSULATED, oldInsulated, insulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInsulationThickness() {
		return insulationThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulationThickness(float newInsulationThickness) {
		float oldInsulationThickness = insulationThickness;
		insulationThickness = newInsulationThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CONDUCTOR_INFO__INSULATION_THICKNESS, oldInsulationThickness, insulationThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorUsageKind getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(ConductorUsageKind newUsage) {
		ConductorUsageKind oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CONDUCTOR_INFO__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireArrangement> getWireArrangements() {
		if (wireArrangements == null) {
			wireArrangements = new EObjectWithInverseResolvingEList<WireArrangement>(WireArrangement.class, this, AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS, AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO);
		}
		return wireArrangements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInsulationKind getInsulationMaterial() {
		return insulationMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulationMaterial(ConductorInsulationKind newInsulationMaterial) {
		ConductorInsulationKind oldInsulationMaterial = insulationMaterial;
		insulationMaterial = newInsulationMaterial == null ? INSULATION_MATERIAL_EDEFAULT : newInsulationMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CONDUCTOR_INFO__INSULATION_MATERIAL, oldInsulationMaterial, insulationMaterial));
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
			case AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductorSegments()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWireArrangements()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS:
				return ((InternalEList<?>)getConductorSegments()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				return ((InternalEList<?>)getWireArrangements()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS:
				return getConductorSegments();
			case AssetModelsPackage.CONDUCTOR_INFO__PHASE_COUNT:
				return getPhaseCount();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATED:
				return isInsulated();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_THICKNESS:
				return getInsulationThickness();
			case AssetModelsPackage.CONDUCTOR_INFO__USAGE:
				return getUsage();
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				return getWireArrangements();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_MATERIAL:
				return getInsulationMaterial();
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
			case AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS:
				getConductorSegments().clear();
				getConductorSegments().addAll((Collection<? extends DistributionLineSegment>)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__PHASE_COUNT:
				setPhaseCount((Integer)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATED:
				setInsulated((Boolean)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_THICKNESS:
				setInsulationThickness((Float)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__USAGE:
				setUsage((ConductorUsageKind)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				getWireArrangements().clear();
				getWireArrangements().addAll((Collection<? extends WireArrangement>)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_MATERIAL:
				setInsulationMaterial((ConductorInsulationKind)newValue);
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
			case AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS:
				getConductorSegments().clear();
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__PHASE_COUNT:
				setPhaseCount(PHASE_COUNT_EDEFAULT);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATED:
				setInsulated(INSULATED_EDEFAULT);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_THICKNESS:
				setInsulationThickness(INSULATION_THICKNESS_EDEFAULT);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				getWireArrangements().clear();
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_MATERIAL:
				setInsulationMaterial(INSULATION_MATERIAL_EDEFAULT);
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
			case AssetModelsPackage.CONDUCTOR_INFO__CONDUCTOR_SEGMENTS:
				return conductorSegments != null && !conductorSegments.isEmpty();
			case AssetModelsPackage.CONDUCTOR_INFO__PHASE_COUNT:
				return phaseCount != PHASE_COUNT_EDEFAULT;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATED:
				return insulated != INSULATED_EDEFAULT;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_THICKNESS:
				return insulationThickness != INSULATION_THICKNESS_EDEFAULT;
			case AssetModelsPackage.CONDUCTOR_INFO__USAGE:
				return usage != USAGE_EDEFAULT;
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				return wireArrangements != null && !wireArrangements.isEmpty();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_MATERIAL:
				return insulationMaterial != INSULATION_MATERIAL_EDEFAULT;
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
		result.append(" (phaseCount: ");
		result.append(phaseCount);
		result.append(", insulated: ");
		result.append(insulated);
		result.append(", insulationThickness: ");
		result.append(insulationThickness);
		result.append(", usage: ");
		result.append(usage);
		result.append(", insulationMaterial: ");
		result.append(insulationMaterial);
		result.append(')');
		return result.toString();
	}

} //ConductorInfoImpl
