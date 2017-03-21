/**
 */
package CIM.IEC61970.LoadModel.impl;

import CIM.IEC61970.LoadModel.LoadArea;
import CIM.IEC61970.LoadModel.LoadModelPackage;
import CIM.IEC61970.LoadModel.SubLoadArea;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.LoadAreaImpl#getSubLoadAreas <em>Sub Load Areas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadAreaImpl extends EnergyAreaImpl implements LoadArea {
	/**
	 * The cached value of the '{@link #getSubLoadAreas() <em>Sub Load Areas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLoadAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<SubLoadArea> subLoadAreas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.LOAD_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubLoadArea> getSubLoadAreas() {
		if (subLoadAreas == null) {
			subLoadAreas = new EObjectWithInverseResolvingEList<SubLoadArea>(SubLoadArea.class, this, LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA);
		}
		return subLoadAreas;
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubLoadAreas()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				return ((InternalEList<?>)getSubLoadAreas()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				return getSubLoadAreas();
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				getSubLoadAreas().clear();
				getSubLoadAreas().addAll((Collection<? extends SubLoadArea>)newValue);
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				getSubLoadAreas().clear();
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				return subLoadAreas != null && !subLoadAreas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadAreaImpl
