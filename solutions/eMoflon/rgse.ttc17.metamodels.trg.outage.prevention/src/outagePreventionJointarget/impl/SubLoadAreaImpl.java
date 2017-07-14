/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionJointarget.LoadArea;
import outagePreventionJointarget.OutagePreventionJointargetPackage;
import outagePreventionJointarget.SubLoadArea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.SubLoadAreaImpl#getLoadArea <em>Load Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubLoadAreaImpl extends MinimalEObjectImpl.Container implements SubLoadArea {
	/**
	 * The cached value of the '{@link #getLoadArea() <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadArea()
	 * @generated
	 * @ordered
	 */
	protected LoadArea loadArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubLoadAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.SUB_LOAD_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea getLoadArea() {
		if (loadArea != null && loadArea.eIsProxy()) {
			InternalEObject oldLoadArea = (InternalEObject)loadArea;
			loadArea = (LoadArea)eResolveProxy(oldLoadArea);
			if (loadArea != oldLoadArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionJointargetPackage.SUB_LOAD_AREA__LOAD_AREA, oldLoadArea, loadArea));
			}
		}
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea basicGetLoadArea() {
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadArea(LoadArea newLoadArea) {
		LoadArea oldLoadArea = loadArea;
		loadArea = newLoadArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.SUB_LOAD_AREA__LOAD_AREA, oldLoadArea, loadArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.SUB_LOAD_AREA__LOAD_AREA:
				if (resolve) return getLoadArea();
				return basicGetLoadArea();
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
			case OutagePreventionJointargetPackage.SUB_LOAD_AREA__LOAD_AREA:
				setLoadArea((LoadArea)newValue);
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
			case OutagePreventionJointargetPackage.SUB_LOAD_AREA__LOAD_AREA:
				setLoadArea((LoadArea)null);
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
			case OutagePreventionJointargetPackage.SUB_LOAD_AREA__LOAD_AREA:
				return loadArea != null;
		}
		return super.eIsSet(featureID);
	}

} //SubLoadAreaImpl
