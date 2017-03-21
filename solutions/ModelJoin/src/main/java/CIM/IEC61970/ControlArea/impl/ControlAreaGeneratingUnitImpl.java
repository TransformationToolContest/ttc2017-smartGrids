/**
 */
package CIM.IEC61970.ControlArea.impl;

import CIM.IEC61970.ControlArea.AltGeneratingUnitMeas;
import CIM.IEC61970.ControlArea.ControlArea;
import CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit;
import CIM.IEC61970.ControlArea.ControlAreaPackage;

import CIM.IEC61970.Generation.Production.GeneratingUnit;
import CIM.IEC61970.Generation.Production.ProductionPackage;

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
 * An implementation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.ControlArea.impl.ControlAreaGeneratingUnitImpl#getControlArea <em>Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.impl.ControlAreaGeneratingUnitImpl#getAltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.impl.ControlAreaGeneratingUnitImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlAreaGeneratingUnitImpl extends ElementImpl implements ControlAreaGeneratingUnit {
	/**
	 * The cached value of the '{@link #getControlArea() <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlArea()
	 * @generated
	 * @ordered
	 */
	protected ControlArea controlArea;

	/**
	 * The cached value of the '{@link #getAltGeneratingUnitMeas() <em>Alt Generating Unit Meas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltGeneratingUnitMeas()
	 * @generated
	 * @ordered
	 */
	protected EList<AltGeneratingUnitMeas> altGeneratingUnitMeas;

	/**
	 * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected GeneratingUnit generatingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlAreaGeneratingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.CONTROL_AREA_GENERATING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea getControlArea() {
		if (controlArea != null && controlArea.eIsProxy()) {
			InternalEObject oldControlArea = (InternalEObject)controlArea;
			controlArea = (ControlArea)eResolveProxy(oldControlArea);
			if (controlArea != oldControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, oldControlArea, controlArea));
			}
		}
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea basicGetControlArea() {
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlArea(ControlArea newControlArea, NotificationChain msgs) {
		ControlArea oldControlArea = controlArea;
		controlArea = newControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, oldControlArea, newControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlArea(ControlArea newControlArea) {
		if (newControlArea != controlArea) {
			NotificationChain msgs = null;
			if (controlArea != null)
				msgs = ((InternalEObject)controlArea).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs);
			if (newControlArea != null)
				msgs = ((InternalEObject)newControlArea).eInverseAdd(this, ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs);
			msgs = basicSetControlArea(newControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, newControlArea, newControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AltGeneratingUnitMeas> getAltGeneratingUnitMeas() {
		if (altGeneratingUnitMeas == null) {
			altGeneratingUnitMeas = new EObjectWithInverseResolvingEList<AltGeneratingUnitMeas>(AltGeneratingUnitMeas.class, this, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS, ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT);
		}
		return altGeneratingUnitMeas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit getGeneratingUnit() {
		if (generatingUnit != null && generatingUnit.eIsProxy()) {
			InternalEObject oldGeneratingUnit = (InternalEObject)generatingUnit;
			generatingUnit = (GeneratingUnit)eResolveProxy(oldGeneratingUnit);
			if (generatingUnit != oldGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, oldGeneratingUnit, generatingUnit));
			}
		}
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit basicGetGeneratingUnit() {
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratingUnit(GeneratingUnit newGeneratingUnit, NotificationChain msgs) {
		GeneratingUnit oldGeneratingUnit = generatingUnit;
		generatingUnit = newGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, oldGeneratingUnit, newGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratingUnit(GeneratingUnit newGeneratingUnit) {
		if (newGeneratingUnit != generatingUnit) {
			NotificationChain msgs = null;
			if (generatingUnit != null)
				msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs);
			if (newGeneratingUnit != null)
				msgs = ((InternalEObject)newGeneratingUnit).eInverseAdd(this, ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs);
			msgs = basicSetGeneratingUnit(newGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, newGeneratingUnit, newGeneratingUnit));
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				if (controlArea != null)
					msgs = ((InternalEObject)controlArea).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs);
				return basicSetControlArea((ControlArea)otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAltGeneratingUnitMeas()).basicAdd(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				if (generatingUnit != null)
					msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs);
				return basicSetGeneratingUnit((GeneratingUnit)otherEnd, msgs);
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				return basicSetControlArea(null, msgs);
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				return ((InternalEList<?>)getAltGeneratingUnitMeas()).basicRemove(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				return basicSetGeneratingUnit(null, msgs);
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				if (resolve) return getControlArea();
				return basicGetControlArea();
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				return getAltGeneratingUnitMeas();
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				if (resolve) return getGeneratingUnit();
				return basicGetGeneratingUnit();
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				setControlArea((ControlArea)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				getAltGeneratingUnitMeas().clear();
				getAltGeneratingUnitMeas().addAll((Collection<? extends AltGeneratingUnitMeas>)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)newValue);
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				setControlArea((ControlArea)null);
				return;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				getAltGeneratingUnitMeas().clear();
				return;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)null);
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				return controlArea != null;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				return altGeneratingUnitMeas != null && !altGeneratingUnitMeas.isEmpty();
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				return generatingUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlAreaGeneratingUnitImpl
