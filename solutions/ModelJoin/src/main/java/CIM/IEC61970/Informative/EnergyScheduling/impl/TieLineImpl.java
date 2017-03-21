/**
 */
package CIM.IEC61970.Informative.EnergyScheduling.impl;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.HostControlArea;
import CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;
import CIM.IEC61970.Informative.EnergyScheduling.TieLine;

import CIM.IEC61970.Informative.Financial.ControlAreaOperator;
import CIM.IEC61970.Informative.Financial.CustomerConsumer;
import CIM.IEC61970.Informative.Financial.FinancialPackage;

import CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Tie Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl#getDynamicEnergyTransaction <em>Dynamic Energy Transaction</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl#getCustomerConsumer <em>Customer Consumer</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl#getSideA_SubControlArea <em>Side ASub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl#getSideB_HostControlArea <em>Side BHost Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl#getSideB_SubControlArea <em>Side BSub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl#getSideA_HostControlArea <em>Side AHost Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.TieLineImpl#getControlAreaOperators <em>Control Area Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TieLineImpl extends ElementImpl implements TieLine {
	/**
	 * The cached value of the '{@link #getDynamicEnergyTransaction() <em>Dynamic Energy Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicEnergyTransaction()
	 * @generated
	 * @ordered
	 */
	protected CIM.IEC61970.Informative.EnergyScheduling.Dynamic dynamicEnergyTransaction;

	/**
	 * The cached value of the '{@link #getCustomerConsumer() <em>Customer Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerConsumer()
	 * @generated
	 * @ordered
	 */
	protected CustomerConsumer customerConsumer;

	/**
	 * The cached value of the '{@link #getSideA_SubControlArea() <em>Side ASub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideA_SubControlArea()
	 * @generated
	 * @ordered
	 */
	protected SubControlArea sideA_SubControlArea;

	/**
	 * The cached value of the '{@link #getSideB_HostControlArea() <em>Side BHost Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideB_HostControlArea()
	 * @generated
	 * @ordered
	 */
	protected HostControlArea sideB_HostControlArea;

	/**
	 * The cached value of the '{@link #getSideB_SubControlArea() <em>Side BSub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideB_SubControlArea()
	 * @generated
	 * @ordered
	 */
	protected SubControlArea sideB_SubControlArea;

	/**
	 * The cached value of the '{@link #getSideA_HostControlArea() <em>Side AHost Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideA_HostControlArea()
	 * @generated
	 * @ordered
	 */
	protected HostControlArea sideA_HostControlArea;

	/**
	 * The cached value of the '{@link #getControlAreaOperators() <em>Control Area Operators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAreaOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAreaOperator> controlAreaOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TieLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.TIE_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM.IEC61970.Informative.EnergyScheduling.Dynamic getDynamicEnergyTransaction() {
		if (dynamicEnergyTransaction != null && dynamicEnergyTransaction.eIsProxy()) {
			InternalEObject oldDynamicEnergyTransaction = (InternalEObject)dynamicEnergyTransaction;
			dynamicEnergyTransaction = (CIM.IEC61970.Informative.EnergyScheduling.Dynamic)eResolveProxy(oldDynamicEnergyTransaction);
			if (dynamicEnergyTransaction != oldDynamicEnergyTransaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION, oldDynamicEnergyTransaction, dynamicEnergyTransaction));
			}
		}
		return dynamicEnergyTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM.IEC61970.Informative.EnergyScheduling.Dynamic basicGetDynamicEnergyTransaction() {
		return dynamicEnergyTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicEnergyTransaction(CIM.IEC61970.Informative.EnergyScheduling.Dynamic newDynamicEnergyTransaction, NotificationChain msgs) {
		CIM.IEC61970.Informative.EnergyScheduling.Dynamic oldDynamicEnergyTransaction = dynamicEnergyTransaction;
		dynamicEnergyTransaction = newDynamicEnergyTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION, oldDynamicEnergyTransaction, newDynamicEnergyTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicEnergyTransaction(CIM.IEC61970.Informative.EnergyScheduling.Dynamic newDynamicEnergyTransaction) {
		if (newDynamicEnergyTransaction != dynamicEnergyTransaction) {
			NotificationChain msgs = null;
			if (dynamicEnergyTransaction != null)
				msgs = ((InternalEObject)dynamicEnergyTransaction).eInverseRemove(this, EnergySchedulingPackage.DYNAMIC__TIE_LINES, CIM.IEC61970.Informative.EnergyScheduling.Dynamic.class, msgs);
			if (newDynamicEnergyTransaction != null)
				msgs = ((InternalEObject)newDynamicEnergyTransaction).eInverseAdd(this, EnergySchedulingPackage.DYNAMIC__TIE_LINES, CIM.IEC61970.Informative.EnergyScheduling.Dynamic.class, msgs);
			msgs = basicSetDynamicEnergyTransaction(newDynamicEnergyTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION, newDynamicEnergyTransaction, newDynamicEnergyTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerConsumer getCustomerConsumer() {
		if (customerConsumer != null && customerConsumer.eIsProxy()) {
			InternalEObject oldCustomerConsumer = (InternalEObject)customerConsumer;
			customerConsumer = (CustomerConsumer)eResolveProxy(oldCustomerConsumer);
			if (customerConsumer != oldCustomerConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER, oldCustomerConsumer, customerConsumer));
			}
		}
		return customerConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerConsumer basicGetCustomerConsumer() {
		return customerConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerConsumer(CustomerConsumer newCustomerConsumer, NotificationChain msgs) {
		CustomerConsumer oldCustomerConsumer = customerConsumer;
		customerConsumer = newCustomerConsumer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER, oldCustomerConsumer, newCustomerConsumer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerConsumer(CustomerConsumer newCustomerConsumer) {
		if (newCustomerConsumer != customerConsumer) {
			NotificationChain msgs = null;
			if (customerConsumer != null)
				msgs = ((InternalEObject)customerConsumer).eInverseRemove(this, FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES, CustomerConsumer.class, msgs);
			if (newCustomerConsumer != null)
				msgs = ((InternalEObject)newCustomerConsumer).eInverseAdd(this, FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES, CustomerConsumer.class, msgs);
			msgs = basicSetCustomerConsumer(newCustomerConsumer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER, newCustomerConsumer, newCustomerConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea getSideA_SubControlArea() {
		if (sideA_SubControlArea != null && sideA_SubControlArea.eIsProxy()) {
			InternalEObject oldSideA_SubControlArea = (InternalEObject)sideA_SubControlArea;
			sideA_SubControlArea = (SubControlArea)eResolveProxy(oldSideA_SubControlArea);
			if (sideA_SubControlArea != oldSideA_SubControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA, oldSideA_SubControlArea, sideA_SubControlArea));
			}
		}
		return sideA_SubControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea basicGetSideA_SubControlArea() {
		return sideA_SubControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSideA_SubControlArea(SubControlArea newSideA_SubControlArea, NotificationChain msgs) {
		SubControlArea oldSideA_SubControlArea = sideA_SubControlArea;
		sideA_SubControlArea = newSideA_SubControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA, oldSideA_SubControlArea, newSideA_SubControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideA_SubControlArea(SubControlArea newSideA_SubControlArea) {
		if (newSideA_SubControlArea != sideA_SubControlArea) {
			NotificationChain msgs = null;
			if (sideA_SubControlArea != null)
				msgs = ((InternalEObject)sideA_SubControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES, SubControlArea.class, msgs);
			if (newSideA_SubControlArea != null)
				msgs = ((InternalEObject)newSideA_SubControlArea).eInverseAdd(this, EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES, SubControlArea.class, msgs);
			msgs = basicSetSideA_SubControlArea(newSideA_SubControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA, newSideA_SubControlArea, newSideA_SubControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea getSideB_HostControlArea() {
		if (sideB_HostControlArea != null && sideB_HostControlArea.eIsProxy()) {
			InternalEObject oldSideB_HostControlArea = (InternalEObject)sideB_HostControlArea;
			sideB_HostControlArea = (HostControlArea)eResolveProxy(oldSideB_HostControlArea);
			if (sideB_HostControlArea != oldSideB_HostControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA, oldSideB_HostControlArea, sideB_HostControlArea));
			}
		}
		return sideB_HostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea basicGetSideB_HostControlArea() {
		return sideB_HostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSideB_HostControlArea(HostControlArea newSideB_HostControlArea, NotificationChain msgs) {
		HostControlArea oldSideB_HostControlArea = sideB_HostControlArea;
		sideB_HostControlArea = newSideB_HostControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA, oldSideB_HostControlArea, newSideB_HostControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideB_HostControlArea(HostControlArea newSideB_HostControlArea) {
		if (newSideB_HostControlArea != sideB_HostControlArea) {
			NotificationChain msgs = null;
			if (sideB_HostControlArea != null)
				msgs = ((InternalEObject)sideB_HostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES, HostControlArea.class, msgs);
			if (newSideB_HostControlArea != null)
				msgs = ((InternalEObject)newSideB_HostControlArea).eInverseAdd(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES, HostControlArea.class, msgs);
			msgs = basicSetSideB_HostControlArea(newSideB_HostControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA, newSideB_HostControlArea, newSideB_HostControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea getSideB_SubControlArea() {
		if (sideB_SubControlArea != null && sideB_SubControlArea.eIsProxy()) {
			InternalEObject oldSideB_SubControlArea = (InternalEObject)sideB_SubControlArea;
			sideB_SubControlArea = (SubControlArea)eResolveProxy(oldSideB_SubControlArea);
			if (sideB_SubControlArea != oldSideB_SubControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA, oldSideB_SubControlArea, sideB_SubControlArea));
			}
		}
		return sideB_SubControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea basicGetSideB_SubControlArea() {
		return sideB_SubControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSideB_SubControlArea(SubControlArea newSideB_SubControlArea, NotificationChain msgs) {
		SubControlArea oldSideB_SubControlArea = sideB_SubControlArea;
		sideB_SubControlArea = newSideB_SubControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA, oldSideB_SubControlArea, newSideB_SubControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideB_SubControlArea(SubControlArea newSideB_SubControlArea) {
		if (newSideB_SubControlArea != sideB_SubControlArea) {
			NotificationChain msgs = null;
			if (sideB_SubControlArea != null)
				msgs = ((InternalEObject)sideB_SubControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES, SubControlArea.class, msgs);
			if (newSideB_SubControlArea != null)
				msgs = ((InternalEObject)newSideB_SubControlArea).eInverseAdd(this, EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES, SubControlArea.class, msgs);
			msgs = basicSetSideB_SubControlArea(newSideB_SubControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA, newSideB_SubControlArea, newSideB_SubControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea getSideA_HostControlArea() {
		if (sideA_HostControlArea != null && sideA_HostControlArea.eIsProxy()) {
			InternalEObject oldSideA_HostControlArea = (InternalEObject)sideA_HostControlArea;
			sideA_HostControlArea = (HostControlArea)eResolveProxy(oldSideA_HostControlArea);
			if (sideA_HostControlArea != oldSideA_HostControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA, oldSideA_HostControlArea, sideA_HostControlArea));
			}
		}
		return sideA_HostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea basicGetSideA_HostControlArea() {
		return sideA_HostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSideA_HostControlArea(HostControlArea newSideA_HostControlArea, NotificationChain msgs) {
		HostControlArea oldSideA_HostControlArea = sideA_HostControlArea;
		sideA_HostControlArea = newSideA_HostControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA, oldSideA_HostControlArea, newSideA_HostControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideA_HostControlArea(HostControlArea newSideA_HostControlArea) {
		if (newSideA_HostControlArea != sideA_HostControlArea) {
			NotificationChain msgs = null;
			if (sideA_HostControlArea != null)
				msgs = ((InternalEObject)sideA_HostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES, HostControlArea.class, msgs);
			if (newSideA_HostControlArea != null)
				msgs = ((InternalEObject)newSideA_HostControlArea).eInverseAdd(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES, HostControlArea.class, msgs);
			msgs = basicSetSideA_HostControlArea(newSideA_HostControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA, newSideA_HostControlArea, newSideA_HostControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAreaOperator> getControlAreaOperators() {
		if (controlAreaOperators == null) {
			controlAreaOperators = new EObjectWithInverseResolvingEList.ManyInverse<ControlAreaOperator>(ControlAreaOperator.class, this, EnergySchedulingPackage.TIE_LINE__CONTROL_AREA_OPERATORS, FinancialPackage.CONTROL_AREA_OPERATOR__TIE_LINES);
		}
		return controlAreaOperators;
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
			case EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION:
				if (dynamicEnergyTransaction != null)
					msgs = ((InternalEObject)dynamicEnergyTransaction).eInverseRemove(this, EnergySchedulingPackage.DYNAMIC__TIE_LINES, CIM.IEC61970.Informative.EnergyScheduling.Dynamic.class, msgs);
				return basicSetDynamicEnergyTransaction((CIM.IEC61970.Informative.EnergyScheduling.Dynamic)otherEnd, msgs);
			case EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER:
				if (customerConsumer != null)
					msgs = ((InternalEObject)customerConsumer).eInverseRemove(this, FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES, CustomerConsumer.class, msgs);
				return basicSetCustomerConsumer((CustomerConsumer)otherEnd, msgs);
			case EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA:
				if (sideA_SubControlArea != null)
					msgs = ((InternalEObject)sideA_SubControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES, SubControlArea.class, msgs);
				return basicSetSideA_SubControlArea((SubControlArea)otherEnd, msgs);
			case EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA:
				if (sideB_HostControlArea != null)
					msgs = ((InternalEObject)sideB_HostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES, HostControlArea.class, msgs);
				return basicSetSideB_HostControlArea((HostControlArea)otherEnd, msgs);
			case EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA:
				if (sideB_SubControlArea != null)
					msgs = ((InternalEObject)sideB_SubControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES, SubControlArea.class, msgs);
				return basicSetSideB_SubControlArea((SubControlArea)otherEnd, msgs);
			case EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA:
				if (sideA_HostControlArea != null)
					msgs = ((InternalEObject)sideA_HostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES, HostControlArea.class, msgs);
				return basicSetSideA_HostControlArea((HostControlArea)otherEnd, msgs);
			case EnergySchedulingPackage.TIE_LINE__CONTROL_AREA_OPERATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlAreaOperators()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION:
				return basicSetDynamicEnergyTransaction(null, msgs);
			case EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER:
				return basicSetCustomerConsumer(null, msgs);
			case EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA:
				return basicSetSideA_SubControlArea(null, msgs);
			case EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA:
				return basicSetSideB_HostControlArea(null, msgs);
			case EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA:
				return basicSetSideB_SubControlArea(null, msgs);
			case EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA:
				return basicSetSideA_HostControlArea(null, msgs);
			case EnergySchedulingPackage.TIE_LINE__CONTROL_AREA_OPERATORS:
				return ((InternalEList<?>)getControlAreaOperators()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION:
				if (resolve) return getDynamicEnergyTransaction();
				return basicGetDynamicEnergyTransaction();
			case EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER:
				if (resolve) return getCustomerConsumer();
				return basicGetCustomerConsumer();
			case EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA:
				if (resolve) return getSideA_SubControlArea();
				return basicGetSideA_SubControlArea();
			case EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA:
				if (resolve) return getSideB_HostControlArea();
				return basicGetSideB_HostControlArea();
			case EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA:
				if (resolve) return getSideB_SubControlArea();
				return basicGetSideB_SubControlArea();
			case EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA:
				if (resolve) return getSideA_HostControlArea();
				return basicGetSideA_HostControlArea();
			case EnergySchedulingPackage.TIE_LINE__CONTROL_AREA_OPERATORS:
				return getControlAreaOperators();
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
			case EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION:
				setDynamicEnergyTransaction((CIM.IEC61970.Informative.EnergyScheduling.Dynamic)newValue);
				return;
			case EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER:
				setCustomerConsumer((CustomerConsumer)newValue);
				return;
			case EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA:
				setSideA_SubControlArea((SubControlArea)newValue);
				return;
			case EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA:
				setSideB_HostControlArea((HostControlArea)newValue);
				return;
			case EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA:
				setSideB_SubControlArea((SubControlArea)newValue);
				return;
			case EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA:
				setSideA_HostControlArea((HostControlArea)newValue);
				return;
			case EnergySchedulingPackage.TIE_LINE__CONTROL_AREA_OPERATORS:
				getControlAreaOperators().clear();
				getControlAreaOperators().addAll((Collection<? extends ControlAreaOperator>)newValue);
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
			case EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION:
				setDynamicEnergyTransaction((CIM.IEC61970.Informative.EnergyScheduling.Dynamic)null);
				return;
			case EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER:
				setCustomerConsumer((CustomerConsumer)null);
				return;
			case EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA:
				setSideA_SubControlArea((SubControlArea)null);
				return;
			case EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA:
				setSideB_HostControlArea((HostControlArea)null);
				return;
			case EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA:
				setSideB_SubControlArea((SubControlArea)null);
				return;
			case EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA:
				setSideA_HostControlArea((HostControlArea)null);
				return;
			case EnergySchedulingPackage.TIE_LINE__CONTROL_AREA_OPERATORS:
				getControlAreaOperators().clear();
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
			case EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION:
				return dynamicEnergyTransaction != null;
			case EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER:
				return customerConsumer != null;
			case EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA:
				return sideA_SubControlArea != null;
			case EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA:
				return sideB_HostControlArea != null;
			case EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA:
				return sideB_SubControlArea != null;
			case EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA:
				return sideA_HostControlArea != null;
			case EnergySchedulingPackage.TIE_LINE__CONTROL_AREA_OPERATORS:
				return controlAreaOperators != null && !controlAreaOperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TieLineImpl
