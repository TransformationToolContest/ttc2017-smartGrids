/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo;

import CIM.IEC61970.Informative.InfWork.Crew;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.Usage;

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
 * An implementation of the model object '<em><b>Work Equipment Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.WorkEquipmentInfoImpl#getCrew <em>Crew</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.WorkEquipmentInfoImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEquipmentInfoImpl extends AssetInfoImpl implements WorkEquipmentInfo {
	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected Crew crew;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<Usage> usages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEquipmentInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getWorkEquipmentInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew getCrew() {
		if (crew != null && crew.eIsProxy()) {
			InternalEObject oldCrew = (InternalEObject)crew;
			crew = (Crew)eResolveProxy(oldCrew);
			if (crew != oldCrew) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW, oldCrew, crew));
			}
		}
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew basicGetCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(Crew newCrew, NotificationChain msgs) {
		Crew oldCrew = crew;
		crew = newCrew;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW, oldCrew, newCrew);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrew(Crew newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS, Crew.class, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject)newCrew).eInverseAdd(this, InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS, Crew.class, msgs);
			msgs = basicSetCrew(newCrew, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW, newCrew, newCrew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Usage> getUsages() {
		if (usages == null) {
			usages = new EObjectWithInverseResolvingEList<Usage>(Usage.class, this, InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES, InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET);
		}
		return usages;
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
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW:
				if (crew != null)
					msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS, Crew.class, msgs);
				return basicSetCrew((Crew)otherEnd, msgs);
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsages()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW:
				return basicSetCrew(null, msgs);
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES:
				return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW:
				if (resolve) return getCrew();
				return basicGetCrew();
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES:
				return getUsages();
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
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW:
				setCrew((Crew)newValue);
				return;
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends Usage>)newValue);
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
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW:
				setCrew((Crew)null);
				return;
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES:
				getUsages().clear();
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
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW:
				return crew != null;
			case InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES:
				return usages != null && !usages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkEquipmentInfoImpl
