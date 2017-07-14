/**
 */
package gluemodel.COSEM.impl;

import gluemodel.COSEM.COSEMPackage;
import gluemodel.COSEM.COSEMRoot;
import gluemodel.COSEM.LogicalDevice;
import gluemodel.COSEM.PhysicalDevice;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.impl.COSEMRootImpl#getPhysicalDevice <em>Physical Device</em>}</li>
 *   <li>{@link gluemodel.COSEM.impl.COSEMRootImpl#getLogicalDevice <em>Logical Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COSEMRootImpl extends MinimalEObjectImpl.Container implements COSEMRoot {
	/**
	 * The cached value of the '{@link #getPhysicalDevice() <em>Physical Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalDevice> physicalDevice;

	/**
	 * The cached value of the '{@link #getLogicalDevice() <em>Logical Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalDevice> logicalDevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COSEMRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMPackage.Literals.COSEM_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalDevice> getPhysicalDevice() {
		if (physicalDevice == null) {
			physicalDevice = new EObjectContainmentEList<PhysicalDevice>(PhysicalDevice.class, this, COSEMPackage.COSEM_ROOT__PHYSICAL_DEVICE);
		}
		return physicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalDevice> getLogicalDevice() {
		if (logicalDevice == null) {
			logicalDevice = new EObjectContainmentEList<LogicalDevice>(LogicalDevice.class, this, COSEMPackage.COSEM_ROOT__LOGICAL_DEVICE);
		}
		return logicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSEMPackage.COSEM_ROOT__PHYSICAL_DEVICE:
				return ((InternalEList<?>)getPhysicalDevice()).basicRemove(otherEnd, msgs);
			case COSEMPackage.COSEM_ROOT__LOGICAL_DEVICE:
				return ((InternalEList<?>)getLogicalDevice()).basicRemove(otherEnd, msgs);
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
			case COSEMPackage.COSEM_ROOT__PHYSICAL_DEVICE:
				return getPhysicalDevice();
			case COSEMPackage.COSEM_ROOT__LOGICAL_DEVICE:
				return getLogicalDevice();
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
			case COSEMPackage.COSEM_ROOT__PHYSICAL_DEVICE:
				getPhysicalDevice().clear();
				getPhysicalDevice().addAll((Collection<? extends PhysicalDevice>)newValue);
				return;
			case COSEMPackage.COSEM_ROOT__LOGICAL_DEVICE:
				getLogicalDevice().clear();
				getLogicalDevice().addAll((Collection<? extends LogicalDevice>)newValue);
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
			case COSEMPackage.COSEM_ROOT__PHYSICAL_DEVICE:
				getPhysicalDevice().clear();
				return;
			case COSEMPackage.COSEM_ROOT__LOGICAL_DEVICE:
				getLogicalDevice().clear();
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
			case COSEMPackage.COSEM_ROOT__PHYSICAL_DEVICE:
				return physicalDevice != null && !physicalDevice.isEmpty();
			case COSEMPackage.COSEM_ROOT__LOGICAL_DEVICE:
				return logicalDevice != null && !logicalDevice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //COSEMRootImpl
