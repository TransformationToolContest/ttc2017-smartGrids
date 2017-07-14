/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Work.Work;
import gluemodel.CIM.IEC61968.Work.WorkPackage;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBOM;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor;
import gluemodel.CIM.IEC61970.Informative.InfWork.Design;
import gluemodel.CIM.IEC61970.Informative.InfWork.DesignKind;
import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation;
import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask;

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
 * An implementation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getCostEstimate <em>Cost Estimate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getDesignLocations <em>Design Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getDesignLocationsCUs <em>Design Locations CUs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getWork <em>Work</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getErpBOMs <em>Erp BO Ms</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getConditionFactors <em>Condition Factors</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.DesignImpl#getWorkTasks <em>Work Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignImpl extends DocumentImpl implements Design {
	/**
	 * The default value of the '{@link #getCostEstimate() <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_ESTIMATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostEstimate() <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostEstimate()
	 * @generated
	 * @ordered
	 */
	protected float costEstimate = COST_ESTIMATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDesignLocations() <em>Design Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocation> designLocations;

	/**
	 * The cached value of the '{@link #getDesignLocationsCUs() <em>Design Locations CUs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocationsCUs()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocationCU> designLocationsCUs;

	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected Work work;

	/**
	 * The cached value of the '{@link #getWorkCostDetails() <em>Work Cost Details</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCostDetail> workCostDetails;

	/**
	 * The cached value of the '{@link #getErpBOMs() <em>Erp BO Ms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpBOMs()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpBOM> erpBOMs;

	/**
	 * The cached value of the '{@link #getErpQuoteLineItem() <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuoteLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpQuoteLineItem erpQuoteLineItem;

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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DesignKind KIND_EDEFAULT = DesignKind.ESTIMATED;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DesignKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkTask> workTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCostEstimate() {
		return costEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostEstimate(float newCostEstimate) {
		float oldCostEstimate = costEstimate;
		costEstimate = newCostEstimate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN__COST_ESTIMATE, oldCostEstimate, costEstimate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocation> getDesignLocations() {
		if (designLocations == null) {
			designLocations = new EObjectWithInverseResolvingEList.ManyInverse<DesignLocation>(DesignLocation.class, this, InfWorkPackage.DESIGN__DESIGN_LOCATIONS, InfWorkPackage.DESIGN_LOCATION__DESIGNS);
		}
		return designLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationsCUs() {
		if (designLocationsCUs == null) {
			designLocationsCUs = new EObjectWithInverseResolvingEList.ManyInverse<DesignLocationCU>(DesignLocationCU.class, this, InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS, InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS);
		}
		return designLocationsCUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work getWork() {
		if (work != null && work.eIsProxy()) {
			InternalEObject oldWork = (InternalEObject)work;
			work = (Work)eResolveProxy(oldWork);
			if (work != oldWork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.DESIGN__WORK, oldWork, work));
			}
		}
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work basicGetWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWork(Work newWork, NotificationChain msgs) {
		Work oldWork = work;
		work = newWork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN__WORK, oldWork, newWork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork(Work newWork) {
		if (newWork != work) {
			NotificationChain msgs = null;
			if (work != null)
				msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__DESIGNS, Work.class, msgs);
			if (newWork != null)
				msgs = ((InternalEObject)newWork).eInverseAdd(this, WorkPackage.WORK__DESIGNS, Work.class, msgs);
			msgs = basicSetWork(newWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN__WORK, newWork, newWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new EObjectWithInverseResolvingEList<WorkCostDetail>(WorkCostDetail.class, this, InfWorkPackage.DESIGN__WORK_COST_DETAILS, InfWorkPackage.WORK_COST_DETAIL__DESIGN);
		}
		return workCostDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpBOM> getErpBOMs() {
		if (erpBOMs == null) {
			erpBOMs = new EObjectWithInverseResolvingEList<ErpBOM>(ErpBOM.class, this, InfWorkPackage.DESIGN__ERP_BO_MS, InfERPSupportPackage.ERP_BOM__DESIGN);
		}
		return erpBOMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem getErpQuoteLineItem() {
		if (erpQuoteLineItem != null && erpQuoteLineItem.eIsProxy()) {
			InternalEObject oldErpQuoteLineItem = (InternalEObject)erpQuoteLineItem;
			erpQuoteLineItem = (ErpQuoteLineItem)eResolveProxy(oldErpQuoteLineItem);
			if (erpQuoteLineItem != oldErpQuoteLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM, oldErpQuoteLineItem, erpQuoteLineItem));
			}
		}
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem basicGetErpQuoteLineItem() {
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem, NotificationChain msgs) {
		ErpQuoteLineItem oldErpQuoteLineItem = erpQuoteLineItem;
		erpQuoteLineItem = newErpQuoteLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM, oldErpQuoteLineItem, newErpQuoteLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem) {
		if (newErpQuoteLineItem != erpQuoteLineItem) {
			NotificationChain msgs = null;
			if (erpQuoteLineItem != null)
				msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN, ErpQuoteLineItem.class, msgs);
			if (newErpQuoteLineItem != null)
				msgs = ((InternalEObject)newErpQuoteLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN, ErpQuoteLineItem.class, msgs);
			msgs = basicSetErpQuoteLineItem(newErpQuoteLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM, newErpQuoteLineItem, newErpQuoteLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionFactor> getConditionFactors() {
		if (conditionFactors == null) {
			conditionFactors = new EObjectWithInverseResolvingEList.ManyInverse<ConditionFactor>(ConditionFactor.class, this, InfWorkPackage.DESIGN__CONDITION_FACTORS, InfWorkPackage.CONDITION_FACTOR__DESIGNS);
		}
		return conditionFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DesignKind newKind) {
		DesignKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new EObjectWithInverseResolvingEList<WorkTask>(WorkTask.class, this, InfWorkPackage.DESIGN__WORK_TASKS, InfWorkPackage.WORK_TASK__DESIGN);
		}
		return workTasks;
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
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationsCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK:
				if (work != null)
					msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__DESIGNS, Work.class, msgs);
				return basicSetWork((Work)otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpBOMs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				if (erpQuoteLineItem != null)
					msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN, ErpQuoteLineItem.class, msgs);
				return basicSetErpQuoteLineItem((ErpQuoteLineItem)otherEnd, msgs);
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditionFactors()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				return ((InternalEList<?>)getDesignLocations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				return ((InternalEList<?>)getDesignLocationsCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK:
				return basicSetWork(null, msgs);
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				return ((InternalEList<?>)getErpBOMs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				return basicSetErpQuoteLineItem(null, msgs);
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				return ((InternalEList<?>)getConditionFactors()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.DESIGN__COST_ESTIMATE:
				return getCostEstimate();
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				return getDesignLocations();
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				return getDesignLocationsCUs();
			case InfWorkPackage.DESIGN__WORK:
				if (resolve) return getWork();
				return basicGetWork();
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				return getErpBOMs();
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				if (resolve) return getErpQuoteLineItem();
				return basicGetErpQuoteLineItem();
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				return getConditionFactors();
			case InfWorkPackage.DESIGN__KIND:
				return getKind();
			case InfWorkPackage.DESIGN__PRICE:
				return getPrice();
			case InfWorkPackage.DESIGN__WORK_TASKS:
				return getWorkTasks();
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
			case InfWorkPackage.DESIGN__COST_ESTIMATE:
				setCostEstimate((Float)newValue);
				return;
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				getDesignLocations().addAll((Collection<? extends DesignLocation>)newValue);
				return;
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				getDesignLocationsCUs().clear();
				getDesignLocationsCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.DESIGN__WORK:
				setWork((Work)newValue);
				return;
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				getErpBOMs().clear();
				getErpBOMs().addAll((Collection<? extends ErpBOM>)newValue);
				return;
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)newValue);
				return;
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				getConditionFactors().clear();
				getConditionFactors().addAll((Collection<? extends ConditionFactor>)newValue);
				return;
			case InfWorkPackage.DESIGN__KIND:
				setKind((DesignKind)newValue);
				return;
			case InfWorkPackage.DESIGN__PRICE:
				setPrice((Float)newValue);
				return;
			case InfWorkPackage.DESIGN__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
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
			case InfWorkPackage.DESIGN__COST_ESTIMATE:
				setCostEstimate(COST_ESTIMATE_EDEFAULT);
				return;
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				return;
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				getDesignLocationsCUs().clear();
				return;
			case InfWorkPackage.DESIGN__WORK:
				setWork((Work)null);
				return;
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				getErpBOMs().clear();
				return;
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)null);
				return;
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				getConditionFactors().clear();
				return;
			case InfWorkPackage.DESIGN__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfWorkPackage.DESIGN__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case InfWorkPackage.DESIGN__WORK_TASKS:
				getWorkTasks().clear();
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
			case InfWorkPackage.DESIGN__COST_ESTIMATE:
				return costEstimate != COST_ESTIMATE_EDEFAULT;
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				return designLocations != null && !designLocations.isEmpty();
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				return designLocationsCUs != null && !designLocationsCUs.isEmpty();
			case InfWorkPackage.DESIGN__WORK:
				return work != null;
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				return erpBOMs != null && !erpBOMs.isEmpty();
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				return erpQuoteLineItem != null;
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				return conditionFactors != null && !conditionFactors.isEmpty();
			case InfWorkPackage.DESIGN__KIND:
				return kind != KIND_EDEFAULT;
			case InfWorkPackage.DESIGN__PRICE:
				return price != PRICE_EDEFAULT;
			case InfWorkPackage.DESIGN__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
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
		result.append(" (costEstimate: ");
		result.append(costEstimate);
		result.append(", kind: ");
		result.append(kind);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //DesignImpl
