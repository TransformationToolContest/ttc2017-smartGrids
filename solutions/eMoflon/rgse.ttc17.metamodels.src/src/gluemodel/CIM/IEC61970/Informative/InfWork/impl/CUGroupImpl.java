/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfWork.CUGroup;
import gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>CU Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUGroupImpl#getChildCUGroups <em>Child CU Groups</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUGroupImpl#getParentCUGroups <em>Parent CU Groups</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUGroupImpl#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUGroupImpl#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUGroupImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CUGroupImpl extends IdentifiedObjectImpl implements CUGroup {
	/**
	 * The cached value of the '{@link #getChildCUGroups() <em>Child CU Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildCUGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CUGroup> childCUGroups;

	/**
	 * The cached value of the '{@link #getParentCUGroups() <em>Parent CU Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCUGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CUGroup> parentCUGroups;

	/**
	 * The cached value of the '{@link #getDesignLocationCUs() <em>Design Location CUs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocationCUs()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocationCU> designLocationCUs;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CUGroup> getChildCUGroups() {
		if (childCUGroups == null) {
			childCUGroups = new EObjectWithInverseResolvingEList.ManyInverse<CUGroup>(CUGroup.class, this, InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS, InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS);
		}
		return childCUGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CUGroup> getParentCUGroups() {
		if (parentCUGroups == null) {
			parentCUGroups = new EObjectWithInverseResolvingEList.ManyInverse<CUGroup>(CUGroup.class, this, InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS, InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS);
		}
		return parentCUGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationCUs() {
		if (designLocationCUs == null) {
			designLocationCUs = new EObjectWithInverseResolvingEList.ManyInverse<DesignLocationCU>(DesignLocationCU.class, this, InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS, InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS);
		}
		return designLocationCUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new EObjectWithInverseResolvingEList<CompatibleUnit>(CompatibleUnit.class, this, InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS, InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP);
		}
		return compatibleUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CU_GROUP__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_GROUP__STATUS, oldStatus, status));
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
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCUGroups()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentCUGroups()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				return ((InternalEList<?>)getChildCUGroups()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				return ((InternalEList<?>)getParentCUGroups()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				return ((InternalEList<?>)getDesignLocationCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				return getChildCUGroups();
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				return getParentCUGroups();
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				return getDesignLocationCUs();
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.CU_GROUP__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
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
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				getChildCUGroups().clear();
				getChildCUGroups().addAll((Collection<? extends CUGroup>)newValue);
				return;
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				getParentCUGroups().clear();
				getParentCUGroups().addAll((Collection<? extends CUGroup>)newValue);
				return;
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				getDesignLocationCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.CU_GROUP__STATUS:
				setStatus((Status)newValue);
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
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				getChildCUGroups().clear();
				return;
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				getParentCUGroups().clear();
				return;
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				return;
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.CU_GROUP__STATUS:
				setStatus((Status)null);
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
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				return childCUGroups != null && !childCUGroups.isEmpty();
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				return parentCUGroups != null && !parentCUGroups.isEmpty();
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				return designLocationCUs != null && !designLocationCUs.isEmpty();
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.CU_GROUP__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //CUGroupImpl
