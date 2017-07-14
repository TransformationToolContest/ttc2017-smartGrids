/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLocations.impl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty;
import gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole;

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
 * An implementation of the model object '<em><b>Org Property Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.OrgPropertyRoleImpl#getErpOrganisation <em>Erp Organisation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.OrgPropertyRoleImpl#getLandProperty <em>Land Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrgPropertyRoleImpl extends RoleImpl implements OrgPropertyRole {
	/**
	 * The cached value of the '{@link #getErpOrganisation() <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation erpOrganisation;

	/**
	 * The cached value of the '{@link #getLandProperty() <em>Land Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<LandProperty> landProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrgPropertyRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.ORG_PROPERTY_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation getErpOrganisation() {
		if (erpOrganisation != null && erpOrganisation.eIsProxy()) {
			InternalEObject oldErpOrganisation = (InternalEObject)erpOrganisation;
			erpOrganisation = (ErpOrganisation)eResolveProxy(oldErpOrganisation);
			if (erpOrganisation != oldErpOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION, oldErpOrganisation, erpOrganisation));
			}
		}
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetErpOrganisation() {
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpOrganisation(ErpOrganisation newErpOrganisation, NotificationChain msgs) {
		ErpOrganisation oldErpOrganisation = erpOrganisation;
		erpOrganisation = newErpOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION, oldErpOrganisation, newErpOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpOrganisation(ErpOrganisation newErpOrganisation) {
		if (newErpOrganisation != erpOrganisation) {
			NotificationChain msgs = null;
			if (erpOrganisation != null)
				msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES, ErpOrganisation.class, msgs);
			if (newErpOrganisation != null)
				msgs = ((InternalEObject)newErpOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetErpOrganisation(newErpOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION, newErpOrganisation, newErpOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LandProperty> getLandProperty() {
		if (landProperty == null) {
			landProperty = new EObjectWithInverseResolvingEList.ManyInverse<LandProperty>(LandProperty.class, this, InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY, InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES);
		}
		return landProperty;
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				if (erpOrganisation != null)
					msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES, ErpOrganisation.class, msgs);
				return basicSetErpOrganisation((ErpOrganisation)otherEnd, msgs);
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandProperty()).basicAdd(otherEnd, msgs);
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				return basicSetErpOrganisation(null, msgs);
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				return ((InternalEList<?>)getLandProperty()).basicRemove(otherEnd, msgs);
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				if (resolve) return getErpOrganisation();
				return basicGetErpOrganisation();
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				return getLandProperty();
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)newValue);
				return;
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				getLandProperty().clear();
				getLandProperty().addAll((Collection<? extends LandProperty>)newValue);
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)null);
				return;
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				getLandProperty().clear();
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				return erpOrganisation != null;
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				return landProperty != null && !landProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrgPropertyRoleImpl
