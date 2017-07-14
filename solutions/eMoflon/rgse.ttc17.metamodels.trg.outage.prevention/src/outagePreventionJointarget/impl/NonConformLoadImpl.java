/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import outagePreventionJointarget.NonConformLoad;
import outagePreventionJointarget.NonConformLoadGroup;
import outagePreventionJointarget.OutagePreventionJointargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Conform Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.NonConformLoadImpl#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonConformLoadImpl extends EnergyConsumerImpl implements NonConformLoad {
	/**
	 * The cached value of the '{@link #getLoadGroup() <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected NonConformLoadGroup loadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonConformLoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.NON_CONFORM_LOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup getLoadGroup() {
		if (loadGroup != null && loadGroup.eIsProxy()) {
			InternalEObject oldLoadGroup = (InternalEObject)loadGroup;
			loadGroup = (NonConformLoadGroup)eResolveProxy(oldLoadGroup);
			if (loadGroup != oldLoadGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionJointargetPackage.NON_CONFORM_LOAD__LOAD_GROUP, oldLoadGroup, loadGroup));
			}
		}
		return loadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup basicGetLoadGroup() {
		return loadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadGroup(NonConformLoadGroup newLoadGroup) {
		NonConformLoadGroup oldLoadGroup = loadGroup;
		loadGroup = newLoadGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.NON_CONFORM_LOAD__LOAD_GROUP, oldLoadGroup, loadGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.NON_CONFORM_LOAD__LOAD_GROUP:
				if (resolve) return getLoadGroup();
				return basicGetLoadGroup();
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
			case OutagePreventionJointargetPackage.NON_CONFORM_LOAD__LOAD_GROUP:
				setLoadGroup((NonConformLoadGroup)newValue);
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
			case OutagePreventionJointargetPackage.NON_CONFORM_LOAD__LOAD_GROUP:
				setLoadGroup((NonConformLoadGroup)null);
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
			case OutagePreventionJointargetPackage.NON_CONFORM_LOAD__LOAD_GROUP:
				return loadGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //NonConformLoadImpl
