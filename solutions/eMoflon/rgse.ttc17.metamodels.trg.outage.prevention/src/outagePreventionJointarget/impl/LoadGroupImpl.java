/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionJointarget.LoadGroup;
import outagePreventionJointarget.OutagePreventionJointargetPackage;
import outagePreventionJointarget.SubLoadArea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.LoadGroupImpl#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadGroupImpl extends MinimalEObjectImpl.Container implements LoadGroup {
	/**
	 * The cached value of the '{@link #getSubLoadArea() <em>Sub Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLoadArea()
	 * @generated
	 * @ordered
	 */
	protected SubLoadArea subLoadArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.LOAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea getSubLoadArea() {
		if (subLoadArea != null && subLoadArea.eIsProxy()) {
			InternalEObject oldSubLoadArea = (InternalEObject)subLoadArea;
			subLoadArea = (SubLoadArea)eResolveProxy(oldSubLoadArea);
			if (subLoadArea != oldSubLoadArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionJointargetPackage.LOAD_GROUP__SUB_LOAD_AREA, oldSubLoadArea, subLoadArea));
			}
		}
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea basicGetSubLoadArea() {
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubLoadArea(SubLoadArea newSubLoadArea) {
		SubLoadArea oldSubLoadArea = subLoadArea;
		subLoadArea = newSubLoadArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.LOAD_GROUP__SUB_LOAD_AREA, oldSubLoadArea, subLoadArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.LOAD_GROUP__SUB_LOAD_AREA:
				if (resolve) return getSubLoadArea();
				return basicGetSubLoadArea();
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
			case OutagePreventionJointargetPackage.LOAD_GROUP__SUB_LOAD_AREA:
				setSubLoadArea((SubLoadArea)newValue);
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
			case OutagePreventionJointargetPackage.LOAD_GROUP__SUB_LOAD_AREA:
				setSubLoadArea((SubLoadArea)null);
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
			case OutagePreventionJointargetPackage.LOAD_GROUP__SUB_LOAD_AREA:
				return subLoadArea != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadGroupImpl
