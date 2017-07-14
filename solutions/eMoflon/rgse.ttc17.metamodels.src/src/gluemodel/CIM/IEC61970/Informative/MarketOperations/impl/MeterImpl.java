/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Meter;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MeterImpl#getRegisteredResource <em>Registered Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterImpl extends IdentifiedObjectImpl implements Meter {
	/**
	 * The cached value of the '{@link #getRegisteredResource() <em>Registered Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredResource()
	 * @generated
	 * @ordered
	 */
	protected RegisteredResource registeredResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredResource getRegisteredResource() {
		if (registeredResource != null && registeredResource.eIsProxy()) {
			InternalEObject oldRegisteredResource = (InternalEObject)registeredResource;
			registeredResource = (RegisteredResource)eResolveProxy(oldRegisteredResource);
			if (registeredResource != oldRegisteredResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.METER__REGISTERED_RESOURCE, oldRegisteredResource, registeredResource));
			}
		}
		return registeredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredResource basicGetRegisteredResource() {
		return registeredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisteredResource(RegisteredResource newRegisteredResource, NotificationChain msgs) {
		RegisteredResource oldRegisteredResource = registeredResource;
		registeredResource = newRegisteredResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.METER__REGISTERED_RESOURCE, oldRegisteredResource, newRegisteredResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredResource(RegisteredResource newRegisteredResource) {
		if (newRegisteredResource != registeredResource) {
			NotificationChain msgs = null;
			if (registeredResource != null)
				msgs = ((InternalEObject)registeredResource).eInverseRemove(this, MarketOperationsPackage.REGISTERED_RESOURCE__METERS, RegisteredResource.class, msgs);
			if (newRegisteredResource != null)
				msgs = ((InternalEObject)newRegisteredResource).eInverseAdd(this, MarketOperationsPackage.REGISTERED_RESOURCE__METERS, RegisteredResource.class, msgs);
			msgs = basicSetRegisteredResource(newRegisteredResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.METER__REGISTERED_RESOURCE, newRegisteredResource, newRegisteredResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.METER__REGISTERED_RESOURCE:
				if (registeredResource != null)
					msgs = ((InternalEObject)registeredResource).eInverseRemove(this, MarketOperationsPackage.REGISTERED_RESOURCE__METERS, RegisteredResource.class, msgs);
				return basicSetRegisteredResource((RegisteredResource)otherEnd, msgs);
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
			case MarketOperationsPackage.METER__REGISTERED_RESOURCE:
				return basicSetRegisteredResource(null, msgs);
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
			case MarketOperationsPackage.METER__REGISTERED_RESOURCE:
				if (resolve) return getRegisteredResource();
				return basicGetRegisteredResource();
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
			case MarketOperationsPackage.METER__REGISTERED_RESOURCE:
				setRegisteredResource((RegisteredResource)newValue);
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
			case MarketOperationsPackage.METER__REGISTERED_RESOURCE:
				setRegisteredResource((RegisteredResource)null);
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
			case MarketOperationsPackage.METER__REGISTERED_RESOURCE:
				return registeredResource != null;
		}
		return super.eIsSet(featureID);
	}

} //MeterImpl
