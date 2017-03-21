/**
 */
package CIM.IEC61970.StateVariables.impl;

import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvStatusImpl#isInService <em>In Service</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvStatusImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvStatusImpl extends StateVariableImpl implements SvStatus {
	/**
	 * The default value of the '{@link #isInService() <em>In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInService() <em>In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInService()
	 * @generated
	 * @ordered
	 */
	protected boolean inService = IN_SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected ConductingEquipment conductingEquipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInService() {
		return inService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInService(boolean newInService) {
		boolean oldInService = inService;
		inService = newInService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_STATUS__IN_SERVICE, oldInService, inService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment getConductingEquipment() {
		if (conductingEquipment != null && conductingEquipment.eIsProxy()) {
			InternalEObject oldConductingEquipment = (InternalEObject)conductingEquipment;
			conductingEquipment = (ConductingEquipment)eResolveProxy(oldConductingEquipment);
			if (conductingEquipment != oldConductingEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT, oldConductingEquipment, conductingEquipment));
			}
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment basicGetConductingEquipment() {
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductingEquipment(ConductingEquipment newConductingEquipment, NotificationChain msgs) {
		ConductingEquipment oldConductingEquipment = conductingEquipment;
		conductingEquipment = newConductingEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT, oldConductingEquipment, newConductingEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductingEquipment(ConductingEquipment newConductingEquipment) {
		if (newConductingEquipment != conductingEquipment) {
			NotificationChain msgs = null;
			if (conductingEquipment != null)
				msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS, ConductingEquipment.class, msgs);
			if (newConductingEquipment != null)
				msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS, ConductingEquipment.class, msgs);
			msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT, newConductingEquipment, newConductingEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
				if (conductingEquipment != null)
					msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS, ConductingEquipment.class, msgs);
				return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
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
			case StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
				return basicSetConductingEquipment(null, msgs);
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
			case StateVariablesPackage.SV_STATUS__IN_SERVICE:
				return isInService();
			case StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
				if (resolve) return getConductingEquipment();
				return basicGetConductingEquipment();
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
			case StateVariablesPackage.SV_STATUS__IN_SERVICE:
				setInService((Boolean)newValue);
				return;
			case StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)newValue);
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
			case StateVariablesPackage.SV_STATUS__IN_SERVICE:
				setInService(IN_SERVICE_EDEFAULT);
				return;
			case StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)null);
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
			case StateVariablesPackage.SV_STATUS__IN_SERVICE:
				return inService != IN_SERVICE_EDEFAULT;
			case StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null;
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
		result.append(" (inService: ");
		result.append(inService);
		result.append(')');
		return result.toString();
	}

} //SvStatusImpl
