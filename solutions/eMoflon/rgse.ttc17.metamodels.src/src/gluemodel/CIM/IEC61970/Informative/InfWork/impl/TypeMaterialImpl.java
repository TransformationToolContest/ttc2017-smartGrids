/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.TypeMaterial;

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
 * An implementation of the model object '<em><b>Type Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl#getErpIssueInventories <em>Erp Issue Inventories</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl#isStockItem <em>Stock Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl#getErpReqLineItems <em>Erp Req Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl#getEstUnitCost <em>Est Unit Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl#getCUMaterialItems <em>CU Material Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeMaterialImpl extends DocumentImpl implements TypeMaterial {
	/**
	 * The cached value of the '{@link #getErpIssueInventories() <em>Erp Issue Inventories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpIssueInventories()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpIssueInventory> erpIssueInventories;

	/**
	 * The default value of the '{@link #isStockItem() <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStockItem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOCK_ITEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStockItem() <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStockItem()
	 * @generated
	 * @ordered
	 */
	protected boolean stockItem = STOCK_ITEM_EDEFAULT;

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
	 * The cached value of the '{@link #getErpReqLineItems() <em>Erp Req Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReqLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpReqLineItem> erpReqLineItems;

	/**
	 * The cached value of the '{@link #getMaterialItems() <em>Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialItem> materialItems;

	/**
	 * The default value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected String costType = COST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstUnitCost() <em>Est Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstUnitCost()
	 * @generated
	 * @ordered
	 */
	protected static final float EST_UNIT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstUnitCost() <em>Est Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstUnitCost()
	 * @generated
	 * @ordered
	 */
	protected float estUnitCost = EST_UNIT_COST_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.TYPE_MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpIssueInventory> getErpIssueInventories() {
		if (erpIssueInventories == null) {
			erpIssueInventories = new EObjectWithInverseResolvingEList<ErpIssueInventory>(ErpIssueInventory.class, this, InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES, InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_MATERIAL);
		}
		return erpIssueInventories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStockItem() {
		return stockItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockItem(boolean newStockItem) {
		boolean oldStockItem = stockItem;
		stockItem = newStockItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.TYPE_MATERIAL__STOCK_ITEM, oldStockItem, stockItem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.TYPE_MATERIAL__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpReqLineItem> getErpReqLineItems() {
		if (erpReqLineItems == null) {
			erpReqLineItems = new EObjectWithInverseResolvingEList<ErpReqLineItem>(ErpReqLineItem.class, this, InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS, InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL);
		}
		return erpReqLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new EObjectWithInverseResolvingEList<MaterialItem>(MaterialItem.class, this, InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS, InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL);
		}
		return materialItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCostType() {
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostType(String newCostType) {
		String oldCostType = costType;
		costType = newCostType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.TYPE_MATERIAL__COST_TYPE, oldCostType, costType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEstUnitCost() {
		return estUnitCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstUnitCost(float newEstUnitCost) {
		float oldEstUnitCost = estUnitCost;
		estUnitCost = newEstUnitCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.TYPE_MATERIAL__EST_UNIT_COST, oldEstUnitCost, estUnitCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CUMaterialItem> getCUMaterialItems() {
		if (cuMaterialItems == null) {
			cuMaterialItems = new EObjectWithInverseResolvingEList<CUMaterialItem>(CUMaterialItem.class, this, InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS, InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL);
		}
		return cuMaterialItems;
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
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpIssueInventories()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpReqLineItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUMaterialItems()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				return ((InternalEList<?>)getErpIssueInventories()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<?>)getErpReqLineItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				return ((InternalEList<?>)getCUMaterialItems()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				return getErpIssueInventories();
			case InfWorkPackage.TYPE_MATERIAL__STOCK_ITEM:
				return isStockItem();
			case InfWorkPackage.TYPE_MATERIAL__QUANTITY:
				return getQuantity();
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				return getErpReqLineItems();
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				return getMaterialItems();
			case InfWorkPackage.TYPE_MATERIAL__COST_TYPE:
				return getCostType();
			case InfWorkPackage.TYPE_MATERIAL__EST_UNIT_COST:
				return getEstUnitCost();
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				return getCUMaterialItems();
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
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				getErpIssueInventories().clear();
				getErpIssueInventories().addAll((Collection<? extends ErpIssueInventory>)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__STOCK_ITEM:
				setStockItem((Boolean)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__QUANTITY:
				setQuantity((String)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
				getErpReqLineItems().addAll((Collection<? extends ErpReqLineItem>)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__COST_TYPE:
				setCostType((String)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__EST_UNIT_COST:
				setEstUnitCost((Float)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				getCUMaterialItems().addAll((Collection<? extends CUMaterialItem>)newValue);
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
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				getErpIssueInventories().clear();
				return;
			case InfWorkPackage.TYPE_MATERIAL__STOCK_ITEM:
				setStockItem(STOCK_ITEM_EDEFAULT);
				return;
			case InfWorkPackage.TYPE_MATERIAL__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
				return;
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				getMaterialItems().clear();
				return;
			case InfWorkPackage.TYPE_MATERIAL__COST_TYPE:
				setCostType(COST_TYPE_EDEFAULT);
				return;
			case InfWorkPackage.TYPE_MATERIAL__EST_UNIT_COST:
				setEstUnitCost(EST_UNIT_COST_EDEFAULT);
				return;
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
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
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				return erpIssueInventories != null && !erpIssueInventories.isEmpty();
			case InfWorkPackage.TYPE_MATERIAL__STOCK_ITEM:
				return stockItem != STOCK_ITEM_EDEFAULT;
			case InfWorkPackage.TYPE_MATERIAL__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				return erpReqLineItems != null && !erpReqLineItems.isEmpty();
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
			case InfWorkPackage.TYPE_MATERIAL__COST_TYPE:
				return COST_TYPE_EDEFAULT == null ? costType != null : !COST_TYPE_EDEFAULT.equals(costType);
			case InfWorkPackage.TYPE_MATERIAL__EST_UNIT_COST:
				return estUnitCost != EST_UNIT_COST_EDEFAULT;
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				return cuMaterialItems != null && !cuMaterialItems.isEmpty();
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
		result.append(" (stockItem: ");
		result.append(stockItem);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", costType: ");
		result.append(costType);
		result.append(", estUnitCost: ");
		result.append(estUnitCost);
		result.append(')');
		return result.toString();
	}

} //TypeMaterialImpl
