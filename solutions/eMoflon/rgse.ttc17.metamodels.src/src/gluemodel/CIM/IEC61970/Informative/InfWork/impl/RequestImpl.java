/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Work.Work;
import gluemodel.CIM.IEC61968.Work.WorkPackage;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.Project;
import gluemodel.CIM.IEC61970.Informative.InfWork.Request;

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
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.RequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.RequestImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.RequestImpl#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.RequestImpl#getWorks <em>Works</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.RequestImpl#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.RequestImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.RequestImpl#getActionNeeded <em>Action Needed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends DocumentImpl implements Request {
	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation organisation;

	/**
	 * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPORATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected String corporateCode = CORPORATE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

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
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The default value of the '{@link #getActionNeeded() <em>Action Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NEEDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionNeeded() <em>Action Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionNeeded()
	 * @generated
	 * @ordered
	 */
	protected String actionNeeded = ACTION_NEEDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.REQUEST__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation getOrganisation() {
		if (organisation != null && organisation.eIsProxy()) {
			InternalEObject oldOrganisation = (InternalEObject)organisation;
			organisation = (ErpOrganisation)eResolveProxy(oldOrganisation);
			if (organisation != oldOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.REQUEST__ORGANISATION, oldOrganisation, organisation));
			}
		}
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetOrganisation() {
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisation(ErpOrganisation newOrganisation, NotificationChain msgs) {
		ErpOrganisation oldOrganisation = organisation;
		organisation = newOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.REQUEST__ORGANISATION, oldOrganisation, newOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisation(ErpOrganisation newOrganisation) {
		if (newOrganisation != organisation) {
			NotificationChain msgs = null;
			if (organisation != null)
				msgs = ((InternalEObject)organisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__REQUESTS, ErpOrganisation.class, msgs);
			if (newOrganisation != null)
				msgs = ((InternalEObject)newOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__REQUESTS, ErpOrganisation.class, msgs);
			msgs = basicSetOrganisation(newOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.REQUEST__ORGANISATION, newOrganisation, newOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorporateCode() {
		return corporateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorporateCode(String newCorporateCode) {
		String oldCorporateCode = corporateCode;
		corporateCode = newCorporateCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.REQUEST__CORPORATE_CODE, oldCorporateCode, corporateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new EObjectWithInverseResolvingEList<Work>(Work.class, this, InfWorkPackage.REQUEST__WORKS, WorkPackage.WORK__REQUEST);
		}
		return works;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM, oldErpQuoteLineItem, erpQuoteLineItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM, oldErpQuoteLineItem, newErpQuoteLineItem);
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
				msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST, ErpQuoteLineItem.class, msgs);
			if (newErpQuoteLineItem != null)
				msgs = ((InternalEObject)newErpQuoteLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST, ErpQuoteLineItem.class, msgs);
			msgs = basicSetErpQuoteLineItem(newErpQuoteLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM, newErpQuoteLineItem, newErpQuoteLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectWithInverseResolvingEList.ManyInverse<Project>(Project.class, this, InfWorkPackage.REQUEST__PROJECTS, InfWorkPackage.PROJECT__REQUESTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionNeeded() {
		return actionNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionNeeded(String newActionNeeded) {
		String oldActionNeeded = actionNeeded;
		actionNeeded = newActionNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.REQUEST__ACTION_NEEDED, oldActionNeeded, actionNeeded));
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
			case InfWorkPackage.REQUEST__ORGANISATION:
				if (organisation != null)
					msgs = ((InternalEObject)organisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__REQUESTS, ErpOrganisation.class, msgs);
				return basicSetOrganisation((ErpOrganisation)otherEnd, msgs);
			case InfWorkPackage.REQUEST__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM:
				if (erpQuoteLineItem != null)
					msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST, ErpQuoteLineItem.class, msgs);
				return basicSetErpQuoteLineItem((ErpQuoteLineItem)otherEnd, msgs);
			case InfWorkPackage.REQUEST__PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.REQUEST__ORGANISATION:
				return basicSetOrganisation(null, msgs);
			case InfWorkPackage.REQUEST__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM:
				return basicSetErpQuoteLineItem(null, msgs);
			case InfWorkPackage.REQUEST__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.REQUEST__PRIORITY:
				return getPriority();
			case InfWorkPackage.REQUEST__ORGANISATION:
				if (resolve) return getOrganisation();
				return basicGetOrganisation();
			case InfWorkPackage.REQUEST__CORPORATE_CODE:
				return getCorporateCode();
			case InfWorkPackage.REQUEST__WORKS:
				return getWorks();
			case InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM:
				if (resolve) return getErpQuoteLineItem();
				return basicGetErpQuoteLineItem();
			case InfWorkPackage.REQUEST__PROJECTS:
				return getProjects();
			case InfWorkPackage.REQUEST__ACTION_NEEDED:
				return getActionNeeded();
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
			case InfWorkPackage.REQUEST__PRIORITY:
				setPriority((String)newValue);
				return;
			case InfWorkPackage.REQUEST__ORGANISATION:
				setOrganisation((ErpOrganisation)newValue);
				return;
			case InfWorkPackage.REQUEST__CORPORATE_CODE:
				setCorporateCode((String)newValue);
				return;
			case InfWorkPackage.REQUEST__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)newValue);
				return;
			case InfWorkPackage.REQUEST__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case InfWorkPackage.REQUEST__ACTION_NEEDED:
				setActionNeeded((String)newValue);
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
			case InfWorkPackage.REQUEST__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case InfWorkPackage.REQUEST__ORGANISATION:
				setOrganisation((ErpOrganisation)null);
				return;
			case InfWorkPackage.REQUEST__CORPORATE_CODE:
				setCorporateCode(CORPORATE_CODE_EDEFAULT);
				return;
			case InfWorkPackage.REQUEST__WORKS:
				getWorks().clear();
				return;
			case InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)null);
				return;
			case InfWorkPackage.REQUEST__PROJECTS:
				getProjects().clear();
				return;
			case InfWorkPackage.REQUEST__ACTION_NEEDED:
				setActionNeeded(ACTION_NEEDED_EDEFAULT);
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
			case InfWorkPackage.REQUEST__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case InfWorkPackage.REQUEST__ORGANISATION:
				return organisation != null;
			case InfWorkPackage.REQUEST__CORPORATE_CODE:
				return CORPORATE_CODE_EDEFAULT == null ? corporateCode != null : !CORPORATE_CODE_EDEFAULT.equals(corporateCode);
			case InfWorkPackage.REQUEST__WORKS:
				return works != null && !works.isEmpty();
			case InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM:
				return erpQuoteLineItem != null;
			case InfWorkPackage.REQUEST__PROJECTS:
				return projects != null && !projects.isEmpty();
			case InfWorkPackage.REQUEST__ACTION_NEEDED:
				return ACTION_NEEDED_EDEFAULT == null ? actionNeeded != null : !ACTION_NEEDED_EDEFAULT.equals(actionNeeded);
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", corporateCode: ");
		result.append(corporateCode);
		result.append(", actionNeeded: ");
		result.append(actionNeeded);
		result.append(')');
		return result.toString();
	}

} //RequestImpl
