/**
 */
package CIM.IEC61970.StateVariables.impl;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvShuntCompensatorSections;

import CIM.IEC61970.Wires.ShuntCompensator;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Shunt Compensator Sections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvShuntCompensatorSectionsImpl#getContinuousSections <em>Continuous Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvShuntCompensatorSectionsImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvShuntCompensatorSectionsImpl#getShuntCompensator <em>Shunt Compensator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvShuntCompensatorSectionsImpl extends StateVariableImpl implements SvShuntCompensatorSections {
	/**
	 * The default value of the '{@link #getContinuousSections() <em>Continuous Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuousSections()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTINUOUS_SECTIONS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getContinuousSections() <em>Continuous Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuousSections()
	 * @generated
	 * @ordered
	 */
	protected float continuousSections = CONTINUOUS_SECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSections() <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected static final int SECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected int sections = SECTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShuntCompensator() <em>Shunt Compensator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuntCompensator()
	 * @generated
	 * @ordered
	 */
	protected ShuntCompensator shuntCompensator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvShuntCompensatorSectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_SHUNT_COMPENSATOR_SECTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getContinuousSections() {
		return continuousSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuousSections(float newContinuousSections) {
		float oldContinuousSections = continuousSections;
		continuousSections = newContinuousSections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__CONTINUOUS_SECTIONS, oldContinuousSections, continuousSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSections() {
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSections(int newSections) {
		int oldSections = sections;
		sections = newSections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS, oldSections, sections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensator getShuntCompensator() {
		if (shuntCompensator != null && shuntCompensator.eIsProxy()) {
			InternalEObject oldShuntCompensator = (InternalEObject)shuntCompensator;
			shuntCompensator = (ShuntCompensator)eResolveProxy(oldShuntCompensator);
			if (shuntCompensator != oldShuntCompensator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, oldShuntCompensator, shuntCompensator));
			}
		}
		return shuntCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensator basicGetShuntCompensator() {
		return shuntCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShuntCompensator(ShuntCompensator newShuntCompensator, NotificationChain msgs) {
		ShuntCompensator oldShuntCompensator = shuntCompensator;
		shuntCompensator = newShuntCompensator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, oldShuntCompensator, newShuntCompensator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShuntCompensator(ShuntCompensator newShuntCompensator) {
		if (newShuntCompensator != shuntCompensator) {
			NotificationChain msgs = null;
			if (shuntCompensator != null)
				msgs = ((InternalEObject)shuntCompensator).eInverseRemove(this, WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs);
			if (newShuntCompensator != null)
				msgs = ((InternalEObject)newShuntCompensator).eInverseAdd(this, WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs);
			msgs = basicSetShuntCompensator(newShuntCompensator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, newShuntCompensator, newShuntCompensator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				if (shuntCompensator != null)
					msgs = ((InternalEObject)shuntCompensator).eInverseRemove(this, WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs);
				return basicSetShuntCompensator((ShuntCompensator)otherEnd, msgs);
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				return basicSetShuntCompensator(null, msgs);
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__CONTINUOUS_SECTIONS:
				return getContinuousSections();
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
				return getSections();
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				if (resolve) return getShuntCompensator();
				return basicGetShuntCompensator();
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__CONTINUOUS_SECTIONS:
				setContinuousSections((Float)newValue);
				return;
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
				setSections((Integer)newValue);
				return;
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				setShuntCompensator((ShuntCompensator)newValue);
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__CONTINUOUS_SECTIONS:
				setContinuousSections(CONTINUOUS_SECTIONS_EDEFAULT);
				return;
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
				setSections(SECTIONS_EDEFAULT);
				return;
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				setShuntCompensator((ShuntCompensator)null);
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__CONTINUOUS_SECTIONS:
				return continuousSections != CONTINUOUS_SECTIONS_EDEFAULT;
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
				return sections != SECTIONS_EDEFAULT;
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				return shuntCompensator != null;
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
		result.append(" (continuousSections: ");
		result.append(continuousSections);
		result.append(", sections: ");
		result.append(sections);
		result.append(')');
		return result.toString();
	}

} //SvShuntCompensatorSectionsImpl
