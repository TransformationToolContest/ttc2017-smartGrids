/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Core.impl.ConductingEquipmentImpl;

import CIM.IEC61970.Meas.Control;
import CIM.IEC61970.Meas.MeasPackage;

import CIM.IEC61970.Wires.RegulatingCondEq;
import CIM.IEC61970.Wires.RegulatingControl;
import CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Regulating Cond Eq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingCondEqImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingCondEqImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatingCondEqImpl extends ConductingEquipmentImpl implements RegulatingCondEq {
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingControl()
	 * @generated
	 * @ordered
	 */
	protected RegulatingControl regulatingControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatingCondEqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.REGULATING_COND_EQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectWithInverseResolvingEList<Control>(Control.class, this, WiresPackage.REGULATING_COND_EQ__CONTROLS, MeasPackage.CONTROL__REGULATING_COND_EQ);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl getRegulatingControl() {
		if (regulatingControl != null && regulatingControl.eIsProxy()) {
			InternalEObject oldRegulatingControl = (InternalEObject)regulatingControl;
			regulatingControl = (RegulatingControl)eResolveProxy(oldRegulatingControl);
			if (regulatingControl != oldRegulatingControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL, oldRegulatingControl, regulatingControl));
			}
		}
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl basicGetRegulatingControl() {
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatingControl(RegulatingControl newRegulatingControl, NotificationChain msgs) {
		RegulatingControl oldRegulatingControl = regulatingControl;
		regulatingControl = newRegulatingControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL, oldRegulatingControl, newRegulatingControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulatingControl(RegulatingControl newRegulatingControl) {
		if (newRegulatingControl != regulatingControl) {
			NotificationChain msgs = null;
			if (regulatingControl != null)
				msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs);
			if (newRegulatingControl != null)
				msgs = ((InternalEObject)newRegulatingControl).eInverseAdd(this, WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs);
			msgs = basicSetRegulatingControl(newRegulatingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL, newRegulatingControl, newRegulatingControl));
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
			case WiresPackage.REGULATING_COND_EQ__CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControls()).basicAdd(otherEnd, msgs);
			case WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				if (regulatingControl != null)
					msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs);
				return basicSetRegulatingControl((RegulatingControl)otherEnd, msgs);
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
			case WiresPackage.REGULATING_COND_EQ__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				return basicSetRegulatingControl(null, msgs);
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
			case WiresPackage.REGULATING_COND_EQ__CONTROLS:
				return getControls();
			case WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				if (resolve) return getRegulatingControl();
				return basicGetRegulatingControl();
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
			case WiresPackage.REGULATING_COND_EQ__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)newValue);
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
			case WiresPackage.REGULATING_COND_EQ__CONTROLS:
				getControls().clear();
				return;
			case WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)null);
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
			case WiresPackage.REGULATING_COND_EQ__CONTROLS:
				return controls != null && !controls.isEmpty();
			case WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				return regulatingControl != null;
		}
		return super.eIsSet(featureID);
	}

} //RegulatingCondEqImpl
