/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

import gluemodel.CIM.IEC61970.Contingency.ContingencyEquipment;
import gluemodel.CIM.IEC61970.Contingency.ContingencyPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.Equipment;
import gluemodel.CIM.IEC61970.Core.EquipmentContainer;

import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet;
import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage;

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
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl#getContingencyEquipment <em>Contingency Equipment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl#isNormaIlyInService <em>Norma Ily In Service</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl#isAggregate <em>Aggregate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl#getEquipmentContainer <em>Equipment Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentImpl extends PowerSystemResourceImpl implements Equipment {
	/**
	 * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitSet()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalLimitSet> operationalLimitSet;

	/**
	 * The cached value of the '{@link #getContingencyEquipment() <em>Contingency Equipment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingencyEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<ContingencyEquipment> contingencyEquipment;

	/**
	 * The default value of the '{@link #isNormaIlyInService() <em>Norma Ily In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormaIlyInService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMA_ILY_IN_SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNormaIlyInService() <em>Norma Ily In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormaIlyInService()
	 * @generated
	 * @ordered
	 */
	protected boolean normaIlyInService = NORMA_ILY_IN_SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerAgreement> customerAgreements;

	/**
	 * The default value of the '{@link #isAggregate() <em>Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAggregate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AGGREGATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAggregate() <em>Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAggregate()
	 * @generated
	 * @ordered
	 */
	protected boolean aggregate = AGGREGATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquipmentContainer() <em>Equipment Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentContainer()
	 * @generated
	 * @ordered
	 */
	protected EquipmentContainer equipmentContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalLimitSet> getOperationalLimitSet() {
		if (operationalLimitSet == null) {
			operationalLimitSet = new EObjectWithInverseResolvingEList<OperationalLimitSet>(OperationalLimitSet.class, this, CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT);
		}
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContingencyEquipment> getContingencyEquipment() {
		if (contingencyEquipment == null) {
			contingencyEquipment = new EObjectWithInverseResolvingEList<ContingencyEquipment>(ContingencyEquipment.class, this, CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT);
		}
		return contingencyEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNormaIlyInService() {
		return normaIlyInService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormaIlyInService(boolean newNormaIlyInService) {
		boolean oldNormaIlyInService = normaIlyInService;
		normaIlyInService = newNormaIlyInService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE, oldNormaIlyInService, normaIlyInService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new EObjectWithInverseResolvingEList.ManyInverse<CustomerAgreement>(CustomerAgreement.class, this, CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS, CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS);
		}
		return customerAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAggregate() {
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregate(boolean newAggregate) {
		boolean oldAggregate = aggregate;
		aggregate = newAggregate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EQUIPMENT__AGGREGATE, oldAggregate, aggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentContainer getEquipmentContainer() {
		if (equipmentContainer != null && equipmentContainer.eIsProxy()) {
			InternalEObject oldEquipmentContainer = (InternalEObject)equipmentContainer;
			equipmentContainer = (EquipmentContainer)eResolveProxy(oldEquipmentContainer);
			if (equipmentContainer != oldEquipmentContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER, oldEquipmentContainer, equipmentContainer));
			}
		}
		return equipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentContainer basicGetEquipmentContainer() {
		return equipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipmentContainer(EquipmentContainer newEquipmentContainer, NotificationChain msgs) {
		EquipmentContainer oldEquipmentContainer = equipmentContainer;
		equipmentContainer = newEquipmentContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER, oldEquipmentContainer, newEquipmentContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipmentContainer(EquipmentContainer newEquipmentContainer) {
		if (newEquipmentContainer != equipmentContainer) {
			NotificationChain msgs = null;
			if (equipmentContainer != null)
				msgs = ((InternalEObject)equipmentContainer).eInverseRemove(this, CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs);
			if (newEquipmentContainer != null)
				msgs = ((InternalEObject)newEquipmentContainer).eInverseAdd(this, CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs);
			msgs = basicSetEquipmentContainer(newEquipmentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER, newEquipmentContainer, newEquipmentContainer));
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
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalLimitSet()).basicAdd(otherEnd, msgs);
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContingencyEquipment()).basicAdd(otherEnd, msgs);
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				if (equipmentContainer != null)
					msgs = ((InternalEObject)equipmentContainer).eInverseRemove(this, CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs);
				return basicSetEquipmentContainer((EquipmentContainer)otherEnd, msgs);
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
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				return ((InternalEList<?>)getOperationalLimitSet()).basicRemove(otherEnd, msgs);
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				return ((InternalEList<?>)getContingencyEquipment()).basicRemove(otherEnd, msgs);
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				return basicSetEquipmentContainer(null, msgs);
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
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				return getOperationalLimitSet();
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				return getContingencyEquipment();
			case CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE:
				return isNormaIlyInService();
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CorePackage.EQUIPMENT__AGGREGATE:
				return isAggregate();
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				if (resolve) return getEquipmentContainer();
				return basicGetEquipmentContainer();
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
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				getOperationalLimitSet().clear();
				getOperationalLimitSet().addAll((Collection<? extends OperationalLimitSet>)newValue);
				return;
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				getContingencyEquipment().clear();
				getContingencyEquipment().addAll((Collection<? extends ContingencyEquipment>)newValue);
				return;
			case CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE:
				setNormaIlyInService((Boolean)newValue);
				return;
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CorePackage.EQUIPMENT__AGGREGATE:
				setAggregate((Boolean)newValue);
				return;
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				setEquipmentContainer((EquipmentContainer)newValue);
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
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				getOperationalLimitSet().clear();
				return;
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				getContingencyEquipment().clear();
				return;
			case CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE:
				setNormaIlyInService(NORMA_ILY_IN_SERVICE_EDEFAULT);
				return;
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CorePackage.EQUIPMENT__AGGREGATE:
				setAggregate(AGGREGATE_EDEFAULT);
				return;
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				setEquipmentContainer((EquipmentContainer)null);
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
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				return operationalLimitSet != null && !operationalLimitSet.isEmpty();
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				return contingencyEquipment != null && !contingencyEquipment.isEmpty();
			case CorePackage.EQUIPMENT__NORMA_ILY_IN_SERVICE:
				return normaIlyInService != NORMA_ILY_IN_SERVICE_EDEFAULT;
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CorePackage.EQUIPMENT__AGGREGATE:
				return aggregate != AGGREGATE_EDEFAULT;
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				return equipmentContainer != null;
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
		result.append(" (normaIlyInService: ");
		result.append(normaIlyInService);
		result.append(", aggregate: ");
		result.append(aggregate);
		result.append(')');
		return result.toString();
	}

} //EquipmentImpl
