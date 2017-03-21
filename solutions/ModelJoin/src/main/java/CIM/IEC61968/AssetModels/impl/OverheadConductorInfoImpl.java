/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.OverheadConductorInfo;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.MountingPoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overhead Conductor Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.OverheadConductorInfoImpl#getNeutralInsulationThickness <em>Neutral Insulation Thickness</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.OverheadConductorInfoImpl#getPhaseConductorSpacing <em>Phase Conductor Spacing</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.OverheadConductorInfoImpl#getPhaseConductorCount <em>Phase Conductor Count</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.OverheadConductorInfoImpl#getMountingPoint <em>Mounting Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverheadConductorInfoImpl extends ConductorInfoImpl implements OverheadConductorInfo {
	/**
	 * The default value of the '{@link #getNeutralInsulationThickness() <em>Neutral Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralInsulationThickness()
	 * @generated
	 * @ordered
	 */
	protected static final float NEUTRAL_INSULATION_THICKNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNeutralInsulationThickness() <em>Neutral Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralInsulationThickness()
	 * @generated
	 * @ordered
	 */
	protected float neutralInsulationThickness = NEUTRAL_INSULATION_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseConductorSpacing() <em>Phase Conductor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseConductorSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_CONDUCTOR_SPACING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhaseConductorSpacing() <em>Phase Conductor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseConductorSpacing()
	 * @generated
	 * @ordered
	 */
	protected float phaseConductorSpacing = PHASE_CONDUCTOR_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseConductorCount() <em>Phase Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseConductorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_CONDUCTOR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseConductorCount() <em>Phase Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseConductorCount()
	 * @generated
	 * @ordered
	 */
	protected int phaseConductorCount = PHASE_CONDUCTOR_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMountingPoint() <em>Mounting Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPoint()
	 * @generated
	 * @ordered
	 */
	protected MountingPoint mountingPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverheadConductorInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.OVERHEAD_CONDUCTOR_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNeutralInsulationThickness() {
		return neutralInsulationThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralInsulationThickness(float newNeutralInsulationThickness) {
		float oldNeutralInsulationThickness = neutralInsulationThickness;
		neutralInsulationThickness = newNeutralInsulationThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS, oldNeutralInsulationThickness, neutralInsulationThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPhaseConductorSpacing() {
		return phaseConductorSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseConductorSpacing(float newPhaseConductorSpacing) {
		float oldPhaseConductorSpacing = phaseConductorSpacing;
		phaseConductorSpacing = newPhaseConductorSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING, oldPhaseConductorSpacing, phaseConductorSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhaseConductorCount() {
		return phaseConductorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseConductorCount(int newPhaseConductorCount) {
		int oldPhaseConductorCount = phaseConductorCount;
		phaseConductorCount = newPhaseConductorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT, oldPhaseConductorCount, phaseConductorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountingPoint getMountingPoint() {
		if (mountingPoint != null && mountingPoint.eIsProxy()) {
			InternalEObject oldMountingPoint = (InternalEObject)mountingPoint;
			mountingPoint = (MountingPoint)eResolveProxy(oldMountingPoint);
			if (mountingPoint != oldMountingPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT, oldMountingPoint, mountingPoint));
			}
		}
		return mountingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountingPoint basicGetMountingPoint() {
		return mountingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMountingPoint(MountingPoint newMountingPoint, NotificationChain msgs) {
		MountingPoint oldMountingPoint = mountingPoint;
		mountingPoint = newMountingPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT, oldMountingPoint, newMountingPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountingPoint(MountingPoint newMountingPoint) {
		if (newMountingPoint != mountingPoint) {
			NotificationChain msgs = null;
			if (mountingPoint != null)
				msgs = ((InternalEObject)mountingPoint).eInverseRemove(this, InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS, MountingPoint.class, msgs);
			if (newMountingPoint != null)
				msgs = ((InternalEObject)newMountingPoint).eInverseAdd(this, InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS, MountingPoint.class, msgs);
			msgs = basicSetMountingPoint(newMountingPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT, newMountingPoint, newMountingPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				if (mountingPoint != null)
					msgs = ((InternalEObject)mountingPoint).eInverseRemove(this, InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS, MountingPoint.class, msgs);
				return basicSetMountingPoint((MountingPoint)otherEnd, msgs);
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				return basicSetMountingPoint(null, msgs);
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS:
				return getNeutralInsulationThickness();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING:
				return getPhaseConductorSpacing();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT:
				return getPhaseConductorCount();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				if (resolve) return getMountingPoint();
				return basicGetMountingPoint();
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS:
				setNeutralInsulationThickness((Float)newValue);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING:
				setPhaseConductorSpacing((Float)newValue);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT:
				setPhaseConductorCount((Integer)newValue);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				setMountingPoint((MountingPoint)newValue);
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS:
				setNeutralInsulationThickness(NEUTRAL_INSULATION_THICKNESS_EDEFAULT);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING:
				setPhaseConductorSpacing(PHASE_CONDUCTOR_SPACING_EDEFAULT);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT:
				setPhaseConductorCount(PHASE_CONDUCTOR_COUNT_EDEFAULT);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				setMountingPoint((MountingPoint)null);
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS:
				return neutralInsulationThickness != NEUTRAL_INSULATION_THICKNESS_EDEFAULT;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING:
				return phaseConductorSpacing != PHASE_CONDUCTOR_SPACING_EDEFAULT;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT:
				return phaseConductorCount != PHASE_CONDUCTOR_COUNT_EDEFAULT;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				return mountingPoint != null;
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
		result.append(" (neutralInsulationThickness: ");
		result.append(neutralInsulationThickness);
		result.append(", phaseConductorSpacing: ");
		result.append(phaseConductorSpacing);
		result.append(", phaseConductorCount: ");
		result.append(phaseConductorCount);
		result.append(')');
		return result.toString();
	}

} //OverheadConductorInfoImpl
