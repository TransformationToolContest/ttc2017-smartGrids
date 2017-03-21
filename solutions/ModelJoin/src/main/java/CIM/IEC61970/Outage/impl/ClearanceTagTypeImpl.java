/**
 */
package CIM.IEC61970.Outage.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Outage.ClearanceTag;
import CIM.IEC61970.Outage.ClearanceTagType;
import CIM.IEC61970.Outage.OutagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clearance Tag Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagTypeImpl#getClearanceTags <em>Clearance Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearanceTagTypeImpl extends IdentifiedObjectImpl implements ClearanceTagType {
	/**
	 * The cached value of the '{@link #getClearanceTags() <em>Clearance Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearanceTags()
	 * @generated
	 * @ordered
	 */
	protected EList<ClearanceTag> clearanceTags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearanceTagTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePackage.Literals.CLEARANCE_TAG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClearanceTag> getClearanceTags() {
		if (clearanceTags == null) {
			clearanceTags = new EObjectWithInverseResolvingEList<ClearanceTag>(ClearanceTag.class, this, OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS, OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE);
		}
		return clearanceTags;
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClearanceTags()).basicAdd(otherEnd, msgs);
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				return ((InternalEList<?>)getClearanceTags()).basicRemove(otherEnd, msgs);
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				return getClearanceTags();
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				getClearanceTags().clear();
				getClearanceTags().addAll((Collection<? extends ClearanceTag>)newValue);
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				getClearanceTags().clear();
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				return clearanceTags != null && !clearanceTags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClearanceTagTypeImpl
