/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl;

import CIM.IEC61970.Generation.Production.HydroPump;
import CIM.IEC61970.Generation.Production.HydroPumpOpSchedule;
import CIM.IEC61970.Generation.Production.ProductionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Pump Op Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPumpOpScheduleImpl#getHydroPump <em>Hydro Pump</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroPumpOpScheduleImpl extends RegularIntervalScheduleImpl implements HydroPumpOpSchedule {
	/**
	 * The cached value of the '{@link #getHydroPump() <em>Hydro Pump</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPump()
	 * @generated
	 * @ordered
	 */
	protected HydroPump hydroPump;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroPumpOpScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HYDRO_PUMP_OP_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPump getHydroPump() {
		if (hydroPump != null && hydroPump.eIsProxy()) {
			InternalEObject oldHydroPump = (InternalEObject)hydroPump;
			hydroPump = (HydroPump)eResolveProxy(oldHydroPump);
			if (hydroPump != oldHydroPump) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, oldHydroPump, hydroPump));
			}
		}
		return hydroPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPump basicGetHydroPump() {
		return hydroPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPump(HydroPump newHydroPump, NotificationChain msgs) {
		HydroPump oldHydroPump = hydroPump;
		hydroPump = newHydroPump;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, oldHydroPump, newHydroPump);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroPump(HydroPump newHydroPump) {
		if (newHydroPump != hydroPump) {
			NotificationChain msgs = null;
			if (hydroPump != null)
				msgs = ((InternalEObject)hydroPump).eInverseRemove(this, ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs);
			if (newHydroPump != null)
				msgs = ((InternalEObject)newHydroPump).eInverseAdd(this, ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs);
			msgs = basicSetHydroPump(newHydroPump, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, newHydroPump, newHydroPump));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				if (hydroPump != null)
					msgs = ((InternalEObject)hydroPump).eInverseRemove(this, ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs);
				return basicSetHydroPump((HydroPump)otherEnd, msgs);
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				return basicSetHydroPump(null, msgs);
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				if (resolve) return getHydroPump();
				return basicGetHydroPump();
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				setHydroPump((HydroPump)newValue);
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				setHydroPump((HydroPump)null);
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				return hydroPump != null;
		}
		return super.eIsSet(featureID);
	}

} //HydroPumpOpScheduleImpl
