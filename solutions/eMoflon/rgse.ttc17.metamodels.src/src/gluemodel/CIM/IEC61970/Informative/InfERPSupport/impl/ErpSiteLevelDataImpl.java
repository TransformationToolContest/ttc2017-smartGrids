/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Site Level Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSiteLevelDataImpl#getLandProperty <em>Land Property</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSiteLevelDataImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpSiteLevelDataImpl extends IdentifiedObjectImpl implements ErpSiteLevelData {
	/**
	 * The cached value of the '{@link #getLandProperty() <em>Land Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperty()
	 * @generated
	 * @ordered
	 */
	protected LandProperty landProperty;

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
	protected ErpSiteLevelDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_SITE_LEVEL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandProperty getLandProperty() {
		if (landProperty != null && landProperty.eIsProxy()) {
			InternalEObject oldLandProperty = (InternalEObject)landProperty;
			landProperty = (LandProperty)eResolveProxy(oldLandProperty);
			if (landProperty != oldLandProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY, oldLandProperty, landProperty));
			}
		}
		return landProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandProperty basicGetLandProperty() {
		return landProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandProperty(LandProperty newLandProperty, NotificationChain msgs) {
		LandProperty oldLandProperty = landProperty;
		landProperty = newLandProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY, oldLandProperty, newLandProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLandProperty(LandProperty newLandProperty) {
		if (newLandProperty != landProperty) {
			NotificationChain msgs = null;
			if (landProperty != null)
				msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS, LandProperty.class, msgs);
			if (newLandProperty != null)
				msgs = ((InternalEObject)newLandProperty).eInverseAdd(this, InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS, LandProperty.class, msgs);
			msgs = basicSetLandProperty(newLandProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY, newLandProperty, newLandProperty));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
				if (landProperty != null)
					msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS, LandProperty.class, msgs);
				return basicSetLandProperty((LandProperty)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
				return basicSetLandProperty(null, msgs);
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
				if (resolve) return getLandProperty();
				return basicGetLandProperty();
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
				setLandProperty((LandProperty)newValue);
				return;
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS:
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
				setLandProperty((LandProperty)null);
				return;
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS:
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
				return landProperty != null;
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //ErpSiteLevelDataImpl
