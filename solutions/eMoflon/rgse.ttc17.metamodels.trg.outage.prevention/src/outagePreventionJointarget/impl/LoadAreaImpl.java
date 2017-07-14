/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionJointarget.ControlArea;
import outagePreventionJointarget.LoadArea;
import outagePreventionJointarget.OutagePreventionJointargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.LoadAreaImpl#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadAreaImpl extends MinimalEObjectImpl.Container implements LoadArea {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.LOAD_AREA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionJointargetPackage.LOAD_AREA__CONTROL_AREA, oldControlArea, controlArea));
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
	public void setControlArea(ControlArea newControlArea) {
		ControlArea oldControlArea = controlArea;
		controlArea = newControlArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.LOAD_AREA__CONTROL_AREA, oldControlArea, controlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.LOAD_AREA__CONTROL_AREA:
				if (resolve) return getControlArea();
				return basicGetControlArea();
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
			case OutagePreventionJointargetPackage.LOAD_AREA__CONTROL_AREA:
				setControlArea((ControlArea)newValue);
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
			case OutagePreventionJointargetPackage.LOAD_AREA__CONTROL_AREA:
				setControlArea((ControlArea)null);
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
			case OutagePreventionJointargetPackage.LOAD_AREA__CONTROL_AREA:
				return controlArea != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadAreaImpl
