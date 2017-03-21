/**
 */
package CIM.IEC61970.Informative.InfCore.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfCore.InfCorePackage;
import CIM.IEC61970.Informative.InfCore.ModelingAuthority;
import CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet;

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
 * An implementation of the model object '<em><b>Modeling Authority Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCore.impl.ModelingAuthoritySetImpl#getIdentifiedObjects <em>Identified Objects</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCore.impl.ModelingAuthoritySetImpl#getModelingAuthority <em>Modeling Authority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelingAuthoritySetImpl extends IdentifiedObjectImpl implements ModelingAuthoritySet {
	/**
	 * The cached value of the '{@link #getIdentifiedObjects() <em>Identified Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifiedObject> identifiedObjects;

	/**
	 * The cached value of the '{@link #getModelingAuthority() <em>Modeling Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAuthority()
	 * @generated
	 * @ordered
	 */
	protected ModelingAuthority modelingAuthority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingAuthoritySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCorePackage.Literals.MODELING_AUTHORITY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentifiedObject> getIdentifiedObjects() {
		if (identifiedObjects == null) {
			identifiedObjects = new EObjectWithInverseResolvingEList<IdentifiedObject>(IdentifiedObject.class, this, InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS, CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET);
		}
		return identifiedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingAuthority getModelingAuthority() {
		if (modelingAuthority != null && modelingAuthority.eIsProxy()) {
			InternalEObject oldModelingAuthority = (InternalEObject)modelingAuthority;
			modelingAuthority = (ModelingAuthority)eResolveProxy(oldModelingAuthority);
			if (modelingAuthority != oldModelingAuthority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY, oldModelingAuthority, modelingAuthority));
			}
		}
		return modelingAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingAuthority basicGetModelingAuthority() {
		return modelingAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelingAuthority(ModelingAuthority newModelingAuthority, NotificationChain msgs) {
		ModelingAuthority oldModelingAuthority = modelingAuthority;
		modelingAuthority = newModelingAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY, oldModelingAuthority, newModelingAuthority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelingAuthority(ModelingAuthority newModelingAuthority) {
		if (newModelingAuthority != modelingAuthority) {
			NotificationChain msgs = null;
			if (modelingAuthority != null)
				msgs = ((InternalEObject)modelingAuthority).eInverseRemove(this, InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS, ModelingAuthority.class, msgs);
			if (newModelingAuthority != null)
				msgs = ((InternalEObject)newModelingAuthority).eInverseAdd(this, InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS, ModelingAuthority.class, msgs);
			msgs = basicSetModelingAuthority(newModelingAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY, newModelingAuthority, newModelingAuthority));
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdentifiedObjects()).basicAdd(otherEnd, msgs);
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				if (modelingAuthority != null)
					msgs = ((InternalEObject)modelingAuthority).eInverseRemove(this, InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS, ModelingAuthority.class, msgs);
				return basicSetModelingAuthority((ModelingAuthority)otherEnd, msgs);
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				return ((InternalEList<?>)getIdentifiedObjects()).basicRemove(otherEnd, msgs);
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				return basicSetModelingAuthority(null, msgs);
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				return getIdentifiedObjects();
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				if (resolve) return getModelingAuthority();
				return basicGetModelingAuthority();
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				getIdentifiedObjects().clear();
				getIdentifiedObjects().addAll((Collection<? extends IdentifiedObject>)newValue);
				return;
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				setModelingAuthority((ModelingAuthority)newValue);
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				getIdentifiedObjects().clear();
				return;
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				setModelingAuthority((ModelingAuthority)null);
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				return identifiedObjects != null && !identifiedObjects.isEmpty();
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				return modelingAuthority != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelingAuthoritySetImpl
