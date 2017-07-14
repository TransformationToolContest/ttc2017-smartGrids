/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor;
import gluemodel.CIM.IEC61970.Informative.InfWork.Design;
import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation;
import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation;

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
 * An implementation of the model object '<em><b>Design Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getSpanLength <em>Span Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getConditionFactors <em>Condition Factors</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getWorkLocations <em>Work Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getDesigns <em>Designs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getErpBomItemDatas <em>Erp Bom Item Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl#getMiscCostItems <em>Misc Cost Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignLocationImpl extends IdentifiedObjectImpl implements DesignLocation {
	/**
	 * The default value of the '{@link #getSpanLength() <em>Span Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanLength()
	 * @generated
	 * @ordered
	 */
	protected static final float SPAN_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpanLength() <em>Span Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanLength()
	 * @generated
	 * @ordered
	 */
	protected float spanLength = SPAN_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionFactors() <em>Condition Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionFactor> conditionFactors;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Diagram> diagrams;

	/**
	 * The cached value of the '{@link #getWorkLocations() <em>Work Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkLocation> workLocations;

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
	 * The cached value of the '{@link #getDesigns() <em>Designs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Design> designs;

	/**
	 * The cached value of the '{@link #getErpBomItemDatas() <em>Erp Bom Item Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpBomItemDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpBomItemData> erpBomItemDatas;

	/**
	 * The cached value of the '{@link #getMiscCostItems() <em>Misc Cost Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscCostItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MiscCostItem> miscCostItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.DESIGN_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpanLength() {
		return spanLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanLength(float newSpanLength) {
		float oldSpanLength = spanLength;
		spanLength = newSpanLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION__SPAN_LENGTH, oldSpanLength, spanLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionFactor> getConditionFactors() {
		if (conditionFactors == null) {
			conditionFactors = new EObjectWithInverseResolvingEList.ManyInverse<ConditionFactor>(ConditionFactor.class, this, InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS, InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATIONS);
		}
		return conditionFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new EObjectWithInverseResolvingEList<MaterialItem>(MaterialItem.class, this, InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS, InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION);
		}
		return materialItems;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.DESIGN_LOCATION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new EObjectWithInverseResolvingEList.ManyInverse<Diagram>(Diagram.class, this, InfWorkPackage.DESIGN_LOCATION__DIAGRAMS, InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS);
		}
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkLocation> getWorkLocations() {
		if (workLocations == null) {
			workLocations = new EObjectWithInverseResolvingEList.ManyInverse<WorkLocation>(WorkLocation.class, this, InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS, InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS);
		}
		return workLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationCUs() {
		if (designLocationCUs == null) {
			designLocationCUs = new EObjectWithInverseResolvingEList<DesignLocationCU>(DesignLocationCU.class, this, InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS, InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION);
		}
		return designLocationCUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Design> getDesigns() {
		if (designs == null) {
			designs = new EObjectWithInverseResolvingEList.ManyInverse<Design>(Design.class, this, InfWorkPackage.DESIGN_LOCATION__DESIGNS, InfWorkPackage.DESIGN__DESIGN_LOCATIONS);
		}
		return designs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpBomItemData> getErpBomItemDatas() {
		if (erpBomItemDatas == null) {
			erpBomItemDatas = new EObjectWithInverseResolvingEList<ErpBomItemData>(ErpBomItemData.class, this, InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS, InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION);
		}
		return erpBomItemDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiscCostItem> getMiscCostItems() {
		if (miscCostItems == null) {
			miscCostItems = new EObjectWithInverseResolvingEList<MiscCostItem>(MiscCostItem.class, this, InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS, InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION);
		}
		return miscCostItems;
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
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditionFactors()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagrams()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkLocations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesigns()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpBomItemDatas()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMiscCostItems()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				return ((InternalEList<?>)getConditionFactors()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				return ((InternalEList<?>)getWorkLocations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				return ((InternalEList<?>)getDesignLocationCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				return ((InternalEList<?>)getDesigns()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<?>)getErpBomItemDatas()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				return ((InternalEList<?>)getMiscCostItems()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.DESIGN_LOCATION__SPAN_LENGTH:
				return getSpanLength();
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				return getConditionFactors();
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				return getMaterialItems();
			case InfWorkPackage.DESIGN_LOCATION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				return getDiagrams();
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				return getWorkLocations();
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				return getDesignLocationCUs();
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				return getDesigns();
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				return getErpBomItemDatas();
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				return getMiscCostItems();
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
			case InfWorkPackage.DESIGN_LOCATION__SPAN_LENGTH:
				setSpanLength((Float)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				getConditionFactors().clear();
				getConditionFactors().addAll((Collection<? extends ConditionFactor>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends Diagram>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				getWorkLocations().clear();
				getWorkLocations().addAll((Collection<? extends WorkLocation>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				getDesignLocationCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				getDesigns().clear();
				getDesigns().addAll((Collection<? extends Design>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				getErpBomItemDatas().addAll((Collection<? extends ErpBomItemData>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				getMiscCostItems().addAll((Collection<? extends MiscCostItem>)newValue);
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
			case InfWorkPackage.DESIGN_LOCATION__SPAN_LENGTH:
				setSpanLength(SPAN_LENGTH_EDEFAULT);
				return;
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				getConditionFactors().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				getMaterialItems().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				getDiagrams().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				getWorkLocations().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				getDesigns().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				getMiscCostItems().clear();
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
			case InfWorkPackage.DESIGN_LOCATION__SPAN_LENGTH:
				return spanLength != SPAN_LENGTH_EDEFAULT;
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				return conditionFactors != null && !conditionFactors.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__STATUS:
				return status != null;
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				return workLocations != null && !workLocations.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				return designLocationCUs != null && !designLocationCUs.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				return designs != null && !designs.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				return erpBomItemDatas != null && !erpBomItemDatas.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				return miscCostItems != null && !miscCostItems.isEmpty();
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
		result.append(" (spanLength: ");
		result.append(spanLength);
		result.append(')');
		return result.toString();
	}

} //DesignLocationImpl
