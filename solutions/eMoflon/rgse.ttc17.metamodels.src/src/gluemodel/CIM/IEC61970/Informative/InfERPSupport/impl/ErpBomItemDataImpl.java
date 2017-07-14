/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBOM;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;
import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Bom Item Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBomItemDataImpl#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBomItemDataImpl#getErpBOM <em>Erp BOM</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBomItemDataImpl#getTypeAsset <em>Type Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpBomItemDataImpl extends IdentifiedObjectImpl implements ErpBomItemData {
	/**
	 * The cached value of the '{@link #getDesignLocation() <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocation()
	 * @generated
	 * @ordered
	 */
	protected DesignLocation designLocation;

	/**
	 * The cached value of the '{@link #getErpBOM() <em>Erp BOM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpBOM()
	 * @generated
	 * @ordered
	 */
	protected ErpBOM erpBOM;

	/**
	 * The cached value of the '{@link #getTypeAsset() <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsset()
	 * @generated
	 * @ordered
	 */
	protected TypeAsset typeAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpBomItemDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_BOM_ITEM_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation getDesignLocation() {
		if (designLocation != null && designLocation.eIsProxy()) {
			InternalEObject oldDesignLocation = (InternalEObject)designLocation;
			designLocation = (DesignLocation)eResolveProxy(oldDesignLocation);
			if (designLocation != oldDesignLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION, oldDesignLocation, designLocation));
			}
		}
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation basicGetDesignLocation() {
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignLocation(DesignLocation newDesignLocation, NotificationChain msgs) {
		DesignLocation oldDesignLocation = designLocation;
		designLocation = newDesignLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION, oldDesignLocation, newDesignLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignLocation(DesignLocation newDesignLocation) {
		if (newDesignLocation != designLocation) {
			NotificationChain msgs = null;
			if (designLocation != null)
				msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS, DesignLocation.class, msgs);
			if (newDesignLocation != null)
				msgs = ((InternalEObject)newDesignLocation).eInverseAdd(this, InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS, DesignLocation.class, msgs);
			msgs = basicSetDesignLocation(newDesignLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION, newDesignLocation, newDesignLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpBOM getErpBOM() {
		if (erpBOM != null && erpBOM.eIsProxy()) {
			InternalEObject oldErpBOM = (InternalEObject)erpBOM;
			erpBOM = (ErpBOM)eResolveProxy(oldErpBOM);
			if (erpBOM != oldErpBOM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM, oldErpBOM, erpBOM));
			}
		}
		return erpBOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpBOM basicGetErpBOM() {
		return erpBOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpBOM(ErpBOM newErpBOM, NotificationChain msgs) {
		ErpBOM oldErpBOM = erpBOM;
		erpBOM = newErpBOM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM, oldErpBOM, newErpBOM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpBOM(ErpBOM newErpBOM) {
		if (newErpBOM != erpBOM) {
			NotificationChain msgs = null;
			if (erpBOM != null)
				msgs = ((InternalEObject)erpBOM).eInverseRemove(this, InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS, ErpBOM.class, msgs);
			if (newErpBOM != null)
				msgs = ((InternalEObject)newErpBOM).eInverseAdd(this, InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS, ErpBOM.class, msgs);
			msgs = basicSetErpBOM(newErpBOM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM, newErpBOM, newErpBOM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAsset getTypeAsset() {
		if (typeAsset != null && typeAsset.eIsProxy()) {
			InternalEObject oldTypeAsset = (InternalEObject)typeAsset;
			typeAsset = (TypeAsset)eResolveProxy(oldTypeAsset);
			if (typeAsset != oldTypeAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET, oldTypeAsset, typeAsset));
			}
		}
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAsset basicGetTypeAsset() {
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAsset(TypeAsset newTypeAsset, NotificationChain msgs) {
		TypeAsset oldTypeAsset = typeAsset;
		typeAsset = newTypeAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET, oldTypeAsset, newTypeAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAsset(TypeAsset newTypeAsset) {
		if (newTypeAsset != typeAsset) {
			NotificationChain msgs = null;
			if (typeAsset != null)
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS, TypeAsset.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS, TypeAsset.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET, newTypeAsset, newTypeAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				if (designLocation != null)
					msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS, DesignLocation.class, msgs);
				return basicSetDesignLocation((DesignLocation)otherEnd, msgs);
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				if (erpBOM != null)
					msgs = ((InternalEObject)erpBOM).eInverseRemove(this, InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS, ErpBOM.class, msgs);
				return basicSetErpBOM((ErpBOM)otherEnd, msgs);
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS, TypeAsset.class, msgs);
				return basicSetTypeAsset((TypeAsset)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				return basicSetDesignLocation(null, msgs);
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				return basicSetErpBOM(null, msgs);
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				if (resolve) return getDesignLocation();
				return basicGetDesignLocation();
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				if (resolve) return getErpBOM();
				return basicGetErpBOM();
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)newValue);
				return;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				setErpBOM((ErpBOM)newValue);
				return;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				setTypeAsset((TypeAsset)newValue);
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)null);
				return;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				setErpBOM((ErpBOM)null);
				return;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				setTypeAsset((TypeAsset)null);
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				return designLocation != null;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				return erpBOM != null;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				return typeAsset != null;
		}
		return super.eIsSet(featureID);
	}

} //ErpBomItemDataImpl
