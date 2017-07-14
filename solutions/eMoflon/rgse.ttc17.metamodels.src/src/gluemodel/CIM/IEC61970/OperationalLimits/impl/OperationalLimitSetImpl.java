/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.Equipment;
import gluemodel.CIM.IEC61970.Core.Terminal;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit;
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
 * An implementation of the model object '<em><b>Operational Limit Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitSetImpl#getOperationalLimitValue <em>Operational Limit Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitSetImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitSetImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalLimitSetImpl extends IdentifiedObjectImpl implements OperationalLimitSet {
	/**
	 * The cached value of the '{@link #getOperationalLimitValue() <em>Operational Limit Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitValue()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalLimit> operationalLimitValue;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected Equipment equipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalLimitSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.OPERATIONAL_LIMIT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalLimit> getOperationalLimitValue() {
		if (operationalLimitValue == null) {
			operationalLimitValue = new EObjectWithInverseResolvingEList<OperationalLimit>(OperationalLimit.class, this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET);
		}
		return operationalLimitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL, oldTerminal, terminal));
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL, oldTerminal, newTerminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL, newTerminal, newTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment getEquipment() {
		if (equipment != null && equipment.eIsProxy()) {
			InternalEObject oldEquipment = (InternalEObject)equipment;
			equipment = (Equipment)eResolveProxy(oldEquipment);
			if (equipment != oldEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, oldEquipment, equipment));
			}
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment basicGetEquipment() {
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipment(Equipment newEquipment, NotificationChain msgs) {
		Equipment oldEquipment = equipment;
		equipment = newEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, oldEquipment, newEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipment(Equipment newEquipment) {
		if (newEquipment != equipment) {
			NotificationChain msgs = null;
			if (equipment != null)
				msgs = ((InternalEObject)equipment).eInverseRemove(this, CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, Equipment.class, msgs);
			if (newEquipment != null)
				msgs = ((InternalEObject)newEquipment).eInverseAdd(this, CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, Equipment.class, msgs);
			msgs = basicSetEquipment(newEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, newEquipment, newEquipment));
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalLimitValue()).basicAdd(otherEnd, msgs);
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				if (equipment != null)
					msgs = ((InternalEObject)equipment).eInverseRemove(this, CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, Equipment.class, msgs);
				return basicSetEquipment((Equipment)otherEnd, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				return ((InternalEList<?>)getOperationalLimitValue()).basicRemove(otherEnd, msgs);
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
				return basicSetTerminal(null, msgs);
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				return basicSetEquipment(null, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				return getOperationalLimitValue();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				if (resolve) return getEquipment();
				return basicGetEquipment();
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				getOperationalLimitValue().clear();
				getOperationalLimitValue().addAll((Collection<? extends OperationalLimit>)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				setEquipment((Equipment)newValue);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				getOperationalLimitValue().clear();
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				setEquipment((Equipment)null);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				return operationalLimitValue != null && !operationalLimitValue.isEmpty();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
				return terminal != null;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				return equipment != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationalLimitSetImpl
