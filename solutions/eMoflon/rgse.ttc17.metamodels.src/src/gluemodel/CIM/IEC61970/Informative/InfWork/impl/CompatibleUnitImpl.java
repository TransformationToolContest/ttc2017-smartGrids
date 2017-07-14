/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure;

import gluemodel.CIM.IEC61970.Informative.InfWork.CUAllowableAction;
import gluemodel.CIM.IEC61970.Informative.InfWork.CUAsset;
import gluemodel.CIM.IEC61970.Informative.InfWork.CUContractorItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.CUGroup;
import gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import gluemodel.CIM.IEC61970.Informative.InfWork.CostType;
import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit;

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
 * An implementation of the model object '<em><b>Compatible Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getEstCost <em>Est Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getPropertyUnit <em>Property Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getCULaborItems <em>CU Labor Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getCUMaterialItems <em>CU Material Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getCUGroup <em>CU Group</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getCUWorkEquipmentItems <em>CU Work Equipment Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getCUAssets <em>CU Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getCUAllowableAction <em>CU Allowable Action</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl#getCUContractorItems <em>CU Contractor Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompatibleUnitImpl extends DocumentImpl implements CompatibleUnit {
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
	 * The default value of the '{@link #getEstCost() <em>Est Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCost()
	 * @generated
	 * @ordered
	 */
	protected static final float EST_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstCost() <em>Est Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCost()
	 * @generated
	 * @ordered
	 */
	protected float estCost = EST_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertyUnit() <em>Property Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyUnit()
	 * @generated
	 * @ordered
	 */
	protected PropertyUnit propertyUnit;

	/**
	 * The cached value of the '{@link #getCULaborItems() <em>CU Labor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCULaborItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CULaborItem> cuLaborItems;

	/**
	 * The cached value of the '{@link #getCUMaterialItems() <em>CU Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUMaterialItem> cuMaterialItems;

	/**
	 * The cached value of the '{@link #getCUGroup() <em>CU Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUGroup()
	 * @generated
	 * @ordered
	 */
	protected CUGroup cuGroup;

	/**
	 * The cached value of the '{@link #getCUWorkEquipmentItems() <em>CU Work Equipment Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUWorkEquipmentItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUWorkEquipmentItem> cuWorkEquipmentItems;

	/**
	 * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected CostType costType;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected String quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedure> procedures;

	/**
	 * The cached value of the '{@link #getCUAssets() <em>CU Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<CUAsset> cuAssets;

	/**
	 * The cached value of the '{@link #getCUAllowableAction() <em>CU Allowable Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUAllowableAction()
	 * @generated
	 * @ordered
	 */
	protected CUAllowableAction cuAllowableAction;

	/**
	 * The cached value of the '{@link #getCUContractorItems() <em>CU Contractor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUContractorItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUContractorItem> cuContractorItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompatibleUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.COMPATIBLE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationCUs() {
		if (designLocationCUs == null) {
			designLocationCUs = new EObjectWithInverseResolvingEList.ManyInverse<DesignLocationCU>(DesignLocationCU.class, this, InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS, InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS);
		}
		return designLocationCUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEstCost() {
		return estCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstCost(float newEstCost) {
		float oldEstCost = estCost;
		estCost = newEstCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__EST_COST, oldEstCost, estCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyUnit getPropertyUnit() {
		if (propertyUnit != null && propertyUnit.eIsProxy()) {
			InternalEObject oldPropertyUnit = (InternalEObject)propertyUnit;
			propertyUnit = (PropertyUnit)eResolveProxy(oldPropertyUnit);
			if (propertyUnit != oldPropertyUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT, oldPropertyUnit, propertyUnit));
			}
		}
		return propertyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyUnit basicGetPropertyUnit() {
		return propertyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyUnit(PropertyUnit newPropertyUnit, NotificationChain msgs) {
		PropertyUnit oldPropertyUnit = propertyUnit;
		propertyUnit = newPropertyUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT, oldPropertyUnit, newPropertyUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyUnit(PropertyUnit newPropertyUnit) {
		if (newPropertyUnit != propertyUnit) {
			NotificationChain msgs = null;
			if (propertyUnit != null)
				msgs = ((InternalEObject)propertyUnit).eInverseRemove(this, InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS, PropertyUnit.class, msgs);
			if (newPropertyUnit != null)
				msgs = ((InternalEObject)newPropertyUnit).eInverseAdd(this, InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS, PropertyUnit.class, msgs);
			msgs = basicSetPropertyUnit(newPropertyUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT, newPropertyUnit, newPropertyUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CULaborItem> getCULaborItems() {
		if (cuLaborItems == null) {
			cuLaborItems = new EObjectWithInverseResolvingEList.ManyInverse<CULaborItem>(CULaborItem.class, this, InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS, InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS);
		}
		return cuLaborItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CUMaterialItem> getCUMaterialItems() {
		if (cuMaterialItems == null) {
			cuMaterialItems = new EObjectWithInverseResolvingEList.ManyInverse<CUMaterialItem>(CUMaterialItem.class, this, InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS, InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS);
		}
		return cuMaterialItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUGroup getCUGroup() {
		if (cuGroup != null && cuGroup.eIsProxy()) {
			InternalEObject oldCUGroup = (InternalEObject)cuGroup;
			cuGroup = (CUGroup)eResolveProxy(oldCUGroup);
			if (cuGroup != oldCUGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP, oldCUGroup, cuGroup));
			}
		}
		return cuGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUGroup basicGetCUGroup() {
		return cuGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCUGroup(CUGroup newCUGroup, NotificationChain msgs) {
		CUGroup oldCUGroup = cuGroup;
		cuGroup = newCUGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP, oldCUGroup, newCUGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCUGroup(CUGroup newCUGroup) {
		if (newCUGroup != cuGroup) {
			NotificationChain msgs = null;
			if (cuGroup != null)
				msgs = ((InternalEObject)cuGroup).eInverseRemove(this, InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS, CUGroup.class, msgs);
			if (newCUGroup != null)
				msgs = ((InternalEObject)newCUGroup).eInverseAdd(this, InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS, CUGroup.class, msgs);
			msgs = basicSetCUGroup(newCUGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP, newCUGroup, newCUGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CUWorkEquipmentItem> getCUWorkEquipmentItems() {
		if (cuWorkEquipmentItems == null) {
			cuWorkEquipmentItems = new EObjectWithInverseResolvingEList.ManyInverse<CUWorkEquipmentItem>(CUWorkEquipmentItem.class, this, InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS, InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS);
		}
		return cuWorkEquipmentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType getCostType() {
		if (costType != null && costType.eIsProxy()) {
			InternalEObject oldCostType = (InternalEObject)costType;
			costType = (CostType)eResolveProxy(oldCostType);
			if (costType != oldCostType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE, oldCostType, costType));
			}
		}
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType basicGetCostType() {
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostType(CostType newCostType, NotificationChain msgs) {
		CostType oldCostType = costType;
		costType = newCostType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE, oldCostType, newCostType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostType(CostType newCostType) {
		if (newCostType != costType) {
			NotificationChain msgs = null;
			if (costType != null)
				msgs = ((InternalEObject)costType).eInverseRemove(this, InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS, CostType.class, msgs);
			if (newCostType != null)
				msgs = ((InternalEObject)newCostType).eInverseAdd(this, InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS, CostType.class, msgs);
			msgs = basicSetCostType(newCostType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE, newCostType, newCostType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(String newQuantity) {
		String oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedures() {
		if (procedures == null) {
			procedures = new EObjectWithInverseResolvingEList.ManyInverse<Procedure>(Procedure.class, this, InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES, InfAssetsPackage.PROCEDURE__COMPATIBLE_UNITS);
		}
		return procedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CUAsset> getCUAssets() {
		if (cuAssets == null) {
			cuAssets = new EObjectWithInverseResolvingEList.ManyInverse<CUAsset>(CUAsset.class, this, InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS, InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS);
		}
		return cuAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAllowableAction getCUAllowableAction() {
		if (cuAllowableAction != null && cuAllowableAction.eIsProxy()) {
			InternalEObject oldCUAllowableAction = (InternalEObject)cuAllowableAction;
			cuAllowableAction = (CUAllowableAction)eResolveProxy(oldCUAllowableAction);
			if (cuAllowableAction != oldCUAllowableAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION, oldCUAllowableAction, cuAllowableAction));
			}
		}
		return cuAllowableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAllowableAction basicGetCUAllowableAction() {
		return cuAllowableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCUAllowableAction(CUAllowableAction newCUAllowableAction, NotificationChain msgs) {
		CUAllowableAction oldCUAllowableAction = cuAllowableAction;
		cuAllowableAction = newCUAllowableAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION, oldCUAllowableAction, newCUAllowableAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCUAllowableAction(CUAllowableAction newCUAllowableAction) {
		if (newCUAllowableAction != cuAllowableAction) {
			NotificationChain msgs = null;
			if (cuAllowableAction != null)
				msgs = ((InternalEObject)cuAllowableAction).eInverseRemove(this, InfWorkPackage.CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS, CUAllowableAction.class, msgs);
			if (newCUAllowableAction != null)
				msgs = ((InternalEObject)newCUAllowableAction).eInverseAdd(this, InfWorkPackage.CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS, CUAllowableAction.class, msgs);
			msgs = basicSetCUAllowableAction(newCUAllowableAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION, newCUAllowableAction, newCUAllowableAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CUContractorItem> getCUContractorItems() {
		if (cuContractorItems == null) {
			cuContractorItems = new EObjectWithInverseResolvingEList.ManyInverse<CUContractorItem>(CUContractorItem.class, this, InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS, InfWorkPackage.CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS);
		}
		return cuContractorItems;
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
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				if (propertyUnit != null)
					msgs = ((InternalEObject)propertyUnit).eInverseRemove(this, InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS, PropertyUnit.class, msgs);
				return basicSetPropertyUnit((PropertyUnit)otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCULaborItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				if (cuGroup != null)
					msgs = ((InternalEObject)cuGroup).eInverseRemove(this, InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS, CUGroup.class, msgs);
				return basicSetCUGroup((CUGroup)otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUWorkEquipmentItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				if (costType != null)
					msgs = ((InternalEObject)costType).eInverseRemove(this, InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS, CostType.class, msgs);
				return basicSetCostType((CostType)otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedures()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUAssets()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				if (cuAllowableAction != null)
					msgs = ((InternalEObject)cuAllowableAction).eInverseRemove(this, InfWorkPackage.CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS, CUAllowableAction.class, msgs);
				return basicSetCUAllowableAction((CUAllowableAction)otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUContractorItems()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				return ((InternalEList<?>)getDesignLocationCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				return basicSetPropertyUnit(null, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				return ((InternalEList<?>)getCULaborItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				return ((InternalEList<?>)getCUMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				return basicSetCUGroup(null, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				return ((InternalEList<?>)getCUWorkEquipmentItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				return basicSetCostType(null, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				return ((InternalEList<?>)getCUAssets()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				return basicSetCUAllowableAction(null, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				return ((InternalEList<?>)getCUContractorItems()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				return getDesignLocationCUs();
			case InfWorkPackage.COMPATIBLE_UNIT__EST_COST:
				return getEstCost();
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				if (resolve) return getPropertyUnit();
				return basicGetPropertyUnit();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				return getCULaborItems();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				return getCUMaterialItems();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				if (resolve) return getCUGroup();
				return basicGetCUGroup();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				return getCUWorkEquipmentItems();
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				if (resolve) return getCostType();
				return basicGetCostType();
			case InfWorkPackage.COMPATIBLE_UNIT__QUANTITY:
				return getQuantity();
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				return getProcedures();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				return getCUAssets();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				if (resolve) return getCUAllowableAction();
				return basicGetCUAllowableAction();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				return getCUContractorItems();
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
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				getDesignLocationCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__EST_COST:
				setEstCost((Float)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				setPropertyUnit((PropertyUnit)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				getCULaborItems().clear();
				getCULaborItems().addAll((Collection<? extends CULaborItem>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				getCUMaterialItems().addAll((Collection<? extends CUMaterialItem>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				setCUGroup((CUGroup)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				getCUWorkEquipmentItems().clear();
				getCUWorkEquipmentItems().addAll((Collection<? extends CUWorkEquipmentItem>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				setCostType((CostType)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__QUANTITY:
				setQuantity((String)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				getProcedures().clear();
				getProcedures().addAll((Collection<? extends Procedure>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				getCUAssets().clear();
				getCUAssets().addAll((Collection<? extends CUAsset>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				setCUAllowableAction((CUAllowableAction)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				getCUContractorItems().clear();
				getCUContractorItems().addAll((Collection<? extends CUContractorItem>)newValue);
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
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__EST_COST:
				setEstCost(EST_COST_EDEFAULT);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				setPropertyUnit((PropertyUnit)null);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				getCULaborItems().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				setCUGroup((CUGroup)null);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				getCUWorkEquipmentItems().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				setCostType((CostType)null);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				getProcedures().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				getCUAssets().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				setCUAllowableAction((CUAllowableAction)null);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				getCUContractorItems().clear();
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
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				return designLocationCUs != null && !designLocationCUs.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__EST_COST:
				return estCost != EST_COST_EDEFAULT;
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				return propertyUnit != null;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				return cuLaborItems != null && !cuLaborItems.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				return cuMaterialItems != null && !cuMaterialItems.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				return cuGroup != null;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				return cuWorkEquipmentItems != null && !cuWorkEquipmentItems.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				return costType != null;
			case InfWorkPackage.COMPATIBLE_UNIT__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				return procedures != null && !procedures.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				return cuAssets != null && !cuAssets.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				return cuAllowableAction != null;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				return cuContractorItems != null && !cuContractorItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (estCost: ");
		result.append(estCost);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //CompatibleUnitImpl
