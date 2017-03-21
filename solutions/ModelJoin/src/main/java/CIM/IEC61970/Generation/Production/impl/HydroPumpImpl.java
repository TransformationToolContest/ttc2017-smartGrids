/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.Generation.Production.HydroPowerPlant;
import CIM.IEC61970.Generation.Production.HydroPump;
import CIM.IEC61970.Generation.Production.HydroPumpOpSchedule;
import CIM.IEC61970.Generation.Production.ProductionPackage;

import CIM.IEC61970.Wires.SynchronousMachine;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Pump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPumpImpl#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPumpImpl#getSynchronousMachine <em>Synchronous Machine</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPumpImpl#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPumpImpl#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPumpImpl#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPumpImpl#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPumpImpl#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroPumpImpl extends PowerSystemResourceImpl implements HydroPump {
	/**
	 * The cached value of the '{@link #getHydroPowerPlant() <em>Hydro Power Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPowerPlant()
	 * @generated
	 * @ordered
	 */
	protected HydroPowerPlant hydroPowerPlant;

	/**
	 * The cached value of the '{@link #getSynchronousMachine() <em>Synchronous Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMachine()
	 * @generated
	 * @ordered
	 */
	protected SynchronousMachine synchronousMachine;

	/**
	 * The default value of the '{@link #getPumpDischAtMinHead() <em>Pump Disch At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpDischAtMinHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_DISCH_AT_MIN_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpDischAtMinHead() <em>Pump Disch At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpDischAtMinHead()
	 * @generated
	 * @ordered
	 */
	protected float pumpDischAtMinHead = PUMP_DISCH_AT_MIN_HEAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPumpPowerAtMinHead() <em>Pump Power At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpPowerAtMinHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_POWER_AT_MIN_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpPowerAtMinHead() <em>Pump Power At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpPowerAtMinHead()
	 * @generated
	 * @ordered
	 */
	protected float pumpPowerAtMinHead = PUMP_POWER_AT_MIN_HEAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPumpPowerAtMaxHead() <em>Pump Power At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpPowerAtMaxHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_POWER_AT_MAX_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpPowerAtMaxHead() <em>Pump Power At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpPowerAtMaxHead()
	 * @generated
	 * @ordered
	 */
	protected float pumpPowerAtMaxHead = PUMP_POWER_AT_MAX_HEAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHydroPumpOpSchedule() <em>Hydro Pump Op Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPumpOpSchedule()
	 * @generated
	 * @ordered
	 */
	protected HydroPumpOpSchedule hydroPumpOpSchedule;

	/**
	 * The default value of the '{@link #getPumpDischAtMaxHead() <em>Pump Disch At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpDischAtMaxHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_DISCH_AT_MAX_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpDischAtMaxHead() <em>Pump Disch At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpDischAtMaxHead()
	 * @generated
	 * @ordered
	 */
	protected float pumpDischAtMaxHead = PUMP_DISCH_AT_MAX_HEAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroPumpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HYDRO_PUMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPowerPlant getHydroPowerPlant() {
		if (hydroPowerPlant != null && hydroPowerPlant.eIsProxy()) {
			InternalEObject oldHydroPowerPlant = (InternalEObject)hydroPowerPlant;
			hydroPowerPlant = (HydroPowerPlant)eResolveProxy(oldHydroPowerPlant);
			if (hydroPowerPlant != oldHydroPowerPlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT, oldHydroPowerPlant, hydroPowerPlant));
			}
		}
		return hydroPowerPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPowerPlant basicGetHydroPowerPlant() {
		return hydroPowerPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPowerPlant(HydroPowerPlant newHydroPowerPlant, NotificationChain msgs) {
		HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
		hydroPowerPlant = newHydroPowerPlant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT, oldHydroPowerPlant, newHydroPowerPlant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroPowerPlant(HydroPowerPlant newHydroPowerPlant) {
		if (newHydroPowerPlant != hydroPowerPlant) {
			NotificationChain msgs = null;
			if (hydroPowerPlant != null)
				msgs = ((InternalEObject)hydroPowerPlant).eInverseRemove(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs);
			if (newHydroPowerPlant != null)
				msgs = ((InternalEObject)newHydroPowerPlant).eInverseAdd(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs);
			msgs = basicSetHydroPowerPlant(newHydroPowerPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT, newHydroPowerPlant, newHydroPowerPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachine getSynchronousMachine() {
		if (synchronousMachine != null && synchronousMachine.eIsProxy()) {
			InternalEObject oldSynchronousMachine = (InternalEObject)synchronousMachine;
			synchronousMachine = (SynchronousMachine)eResolveProxy(oldSynchronousMachine);
			if (synchronousMachine != oldSynchronousMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE, oldSynchronousMachine, synchronousMachine));
			}
		}
		return synchronousMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachine basicGetSynchronousMachine() {
		return synchronousMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronousMachine(SynchronousMachine newSynchronousMachine, NotificationChain msgs) {
		SynchronousMachine oldSynchronousMachine = synchronousMachine;
		synchronousMachine = newSynchronousMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE, oldSynchronousMachine, newSynchronousMachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronousMachine(SynchronousMachine newSynchronousMachine) {
		if (newSynchronousMachine != synchronousMachine) {
			NotificationChain msgs = null;
			if (synchronousMachine != null)
				msgs = ((InternalEObject)synchronousMachine).eInverseRemove(this, WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP, SynchronousMachine.class, msgs);
			if (newSynchronousMachine != null)
				msgs = ((InternalEObject)newSynchronousMachine).eInverseAdd(this, WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP, SynchronousMachine.class, msgs);
			msgs = basicSetSynchronousMachine(newSynchronousMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE, newSynchronousMachine, newSynchronousMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPumpDischAtMinHead() {
		return pumpDischAtMinHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPumpDischAtMinHead(float newPumpDischAtMinHead) {
		float oldPumpDischAtMinHead = pumpDischAtMinHead;
		pumpDischAtMinHead = newPumpDischAtMinHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD, oldPumpDischAtMinHead, pumpDischAtMinHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPumpPowerAtMinHead() {
		return pumpPowerAtMinHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPumpPowerAtMinHead(float newPumpPowerAtMinHead) {
		float oldPumpPowerAtMinHead = pumpPowerAtMinHead;
		pumpPowerAtMinHead = newPumpPowerAtMinHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD, oldPumpPowerAtMinHead, pumpPowerAtMinHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPumpPowerAtMaxHead() {
		return pumpPowerAtMaxHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPumpPowerAtMaxHead(float newPumpPowerAtMaxHead) {
		float oldPumpPowerAtMaxHead = pumpPowerAtMaxHead;
		pumpPowerAtMaxHead = newPumpPowerAtMaxHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD, oldPumpPowerAtMaxHead, pumpPowerAtMaxHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPumpOpSchedule getHydroPumpOpSchedule() {
		if (hydroPumpOpSchedule != null && hydroPumpOpSchedule.eIsProxy()) {
			InternalEObject oldHydroPumpOpSchedule = (InternalEObject)hydroPumpOpSchedule;
			hydroPumpOpSchedule = (HydroPumpOpSchedule)eResolveProxy(oldHydroPumpOpSchedule);
			if (hydroPumpOpSchedule != oldHydroPumpOpSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, oldHydroPumpOpSchedule, hydroPumpOpSchedule));
			}
		}
		return hydroPumpOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPumpOpSchedule basicGetHydroPumpOpSchedule() {
		return hydroPumpOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPumpOpSchedule(HydroPumpOpSchedule newHydroPumpOpSchedule, NotificationChain msgs) {
		HydroPumpOpSchedule oldHydroPumpOpSchedule = hydroPumpOpSchedule;
		hydroPumpOpSchedule = newHydroPumpOpSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, oldHydroPumpOpSchedule, newHydroPumpOpSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroPumpOpSchedule(HydroPumpOpSchedule newHydroPumpOpSchedule) {
		if (newHydroPumpOpSchedule != hydroPumpOpSchedule) {
			NotificationChain msgs = null;
			if (hydroPumpOpSchedule != null)
				msgs = ((InternalEObject)hydroPumpOpSchedule).eInverseRemove(this, ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs);
			if (newHydroPumpOpSchedule != null)
				msgs = ((InternalEObject)newHydroPumpOpSchedule).eInverseAdd(this, ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs);
			msgs = basicSetHydroPumpOpSchedule(newHydroPumpOpSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, newHydroPumpOpSchedule, newHydroPumpOpSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPumpDischAtMaxHead() {
		return pumpDischAtMaxHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPumpDischAtMaxHead(float newPumpDischAtMaxHead) {
		float oldPumpDischAtMaxHead = pumpDischAtMaxHead;
		pumpDischAtMaxHead = newPumpDischAtMaxHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD, oldPumpDischAtMaxHead, pumpDischAtMaxHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				if (hydroPowerPlant != null)
					msgs = ((InternalEObject)hydroPowerPlant).eInverseRemove(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs);
				return basicSetHydroPowerPlant((HydroPowerPlant)otherEnd, msgs);
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				if (synchronousMachine != null)
					msgs = ((InternalEObject)synchronousMachine).eInverseRemove(this, WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP, SynchronousMachine.class, msgs);
				return basicSetSynchronousMachine((SynchronousMachine)otherEnd, msgs);
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				if (hydroPumpOpSchedule != null)
					msgs = ((InternalEObject)hydroPumpOpSchedule).eInverseRemove(this, ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs);
				return basicSetHydroPumpOpSchedule((HydroPumpOpSchedule)otherEnd, msgs);
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
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				return basicSetHydroPowerPlant(null, msgs);
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				return basicSetSynchronousMachine(null, msgs);
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				return basicSetHydroPumpOpSchedule(null, msgs);
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
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				if (resolve) return getHydroPowerPlant();
				return basicGetHydroPowerPlant();
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				if (resolve) return getSynchronousMachine();
				return basicGetSynchronousMachine();
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
				return getPumpDischAtMinHead();
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
				return getPumpPowerAtMinHead();
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
				return getPumpPowerAtMaxHead();
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				if (resolve) return getHydroPumpOpSchedule();
				return basicGetHydroPumpOpSchedule();
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
				return getPumpDischAtMaxHead();
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
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				setHydroPowerPlant((HydroPowerPlant)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				setSynchronousMachine((SynchronousMachine)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
				setPumpDischAtMinHead((Float)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
				setPumpPowerAtMinHead((Float)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
				setPumpPowerAtMaxHead((Float)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				setHydroPumpOpSchedule((HydroPumpOpSchedule)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
				setPumpDischAtMaxHead((Float)newValue);
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
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				setHydroPowerPlant((HydroPowerPlant)null);
				return;
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				setSynchronousMachine((SynchronousMachine)null);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
				setPumpDischAtMinHead(PUMP_DISCH_AT_MIN_HEAD_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
				setPumpPowerAtMinHead(PUMP_POWER_AT_MIN_HEAD_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
				setPumpPowerAtMaxHead(PUMP_POWER_AT_MAX_HEAD_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				setHydroPumpOpSchedule((HydroPumpOpSchedule)null);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
				setPumpDischAtMaxHead(PUMP_DISCH_AT_MAX_HEAD_EDEFAULT);
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
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				return hydroPowerPlant != null;
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				return synchronousMachine != null;
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
				return pumpDischAtMinHead != PUMP_DISCH_AT_MIN_HEAD_EDEFAULT;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
				return pumpPowerAtMinHead != PUMP_POWER_AT_MIN_HEAD_EDEFAULT;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
				return pumpPowerAtMaxHead != PUMP_POWER_AT_MAX_HEAD_EDEFAULT;
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				return hydroPumpOpSchedule != null;
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
				return pumpDischAtMaxHead != PUMP_DISCH_AT_MAX_HEAD_EDEFAULT;
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
		result.append(" (pumpDischAtMinHead: ");
		result.append(pumpDischAtMinHead);
		result.append(", pumpPowerAtMinHead: ");
		result.append(pumpPowerAtMinHead);
		result.append(", pumpPowerAtMaxHead: ");
		result.append(pumpPowerAtMaxHead);
		result.append(", pumpDischAtMaxHead: ");
		result.append(pumpDischAtMaxHead);
		result.append(')');
		return result.toString();
	}

} //HydroPumpImpl
