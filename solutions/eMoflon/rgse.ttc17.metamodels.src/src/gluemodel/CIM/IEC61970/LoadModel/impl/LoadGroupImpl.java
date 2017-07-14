/**
 */
package gluemodel.CIM.IEC61970.LoadModel.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad;

import gluemodel.CIM.IEC61970.LoadModel.LoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;
import gluemodel.CIM.IEC61970.LoadModel.SubLoadArea;

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
 * An implementation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadGroupImpl#getRegisteredLoads <em>Registered Loads</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadGroupImpl#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadGroupImpl extends IdentifiedObjectImpl implements LoadGroup {
	/**
	 * The cached value of the '{@link #getRegisteredLoads() <em>Registered Loads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredLoads()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisteredLoad> registeredLoads;

	/**
	 * The cached value of the '{@link #getSubLoadArea() <em>Sub Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLoadArea()
	 * @generated
	 * @ordered
	 */
	protected SubLoadArea subLoadArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.LOAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredLoad> getRegisteredLoads() {
		if (registeredLoads == null) {
			registeredLoads = new EObjectWithInverseResolvingEList<RegisteredLoad>(RegisteredLoad.class, this, LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS, MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA);
		}
		return registeredLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea getSubLoadArea() {
		if (subLoadArea != null && subLoadArea.eIsProxy()) {
			InternalEObject oldSubLoadArea = (InternalEObject)subLoadArea;
			subLoadArea = (SubLoadArea)eResolveProxy(oldSubLoadArea);
			if (subLoadArea != oldSubLoadArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA, oldSubLoadArea, subLoadArea));
			}
		}
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea basicGetSubLoadArea() {
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubLoadArea(SubLoadArea newSubLoadArea, NotificationChain msgs) {
		SubLoadArea oldSubLoadArea = subLoadArea;
		subLoadArea = newSubLoadArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA, oldSubLoadArea, newSubLoadArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubLoadArea(SubLoadArea newSubLoadArea) {
		if (newSubLoadArea != subLoadArea) {
			NotificationChain msgs = null;
			if (subLoadArea != null)
				msgs = ((InternalEObject)subLoadArea).eInverseRemove(this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs);
			if (newSubLoadArea != null)
				msgs = ((InternalEObject)newSubLoadArea).eInverseAdd(this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs);
			msgs = basicSetSubLoadArea(newSubLoadArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA, newSubLoadArea, newSubLoadArea));
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
			case LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegisteredLoads()).basicAdd(otherEnd, msgs);
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				if (subLoadArea != null)
					msgs = ((InternalEObject)subLoadArea).eInverseRemove(this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs);
				return basicSetSubLoadArea((SubLoadArea)otherEnd, msgs);
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
			case LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS:
				return ((InternalEList<?>)getRegisteredLoads()).basicRemove(otherEnd, msgs);
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				return basicSetSubLoadArea(null, msgs);
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
			case LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS:
				return getRegisteredLoads();
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				if (resolve) return getSubLoadArea();
				return basicGetSubLoadArea();
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
			case LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS:
				getRegisteredLoads().clear();
				getRegisteredLoads().addAll((Collection<? extends RegisteredLoad>)newValue);
				return;
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				setSubLoadArea((SubLoadArea)newValue);
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
			case LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS:
				getRegisteredLoads().clear();
				return;
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				setSubLoadArea((SubLoadArea)null);
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
			case LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS:
				return registeredLoads != null && !registeredLoads.isEmpty();
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				return subLoadArea != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadGroupImpl
