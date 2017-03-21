/**
 */
package CIM.IEC61970.Informative.InfCore.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfCore.InfCorePackage;
import CIM.IEC61970.Informative.InfCore.ModelingAuthority;
import CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Authority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCore.impl.ModelingAuthorityImpl#getModelingAuthoritySets <em>Modeling Authority Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelingAuthorityImpl extends IdentifiedObjectImpl implements ModelingAuthority {
	/**
	 * The cached value of the '{@link #getModelingAuthoritySets() <em>Modeling Authority Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAuthoritySets()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingAuthoritySet> modelingAuthoritySets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingAuthorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCorePackage.Literals.MODELING_AUTHORITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelingAuthoritySet> getModelingAuthoritySets() {
		if (modelingAuthoritySets == null) {
			modelingAuthoritySets = new EObjectWithInverseResolvingEList<ModelingAuthoritySet>(ModelingAuthoritySet.class, this, InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS, InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY);
		}
		return modelingAuthoritySets;
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelingAuthoritySets()).basicAdd(otherEnd, msgs);
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				return ((InternalEList<?>)getModelingAuthoritySets()).basicRemove(otherEnd, msgs);
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				return getModelingAuthoritySets();
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				getModelingAuthoritySets().clear();
				getModelingAuthoritySets().addAll((Collection<? extends ModelingAuthoritySet>)newValue);
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				getModelingAuthoritySets().clear();
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				return modelingAuthoritySets != null && !modelingAuthoritySets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelingAuthorityImpl
