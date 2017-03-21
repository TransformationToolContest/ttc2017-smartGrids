/**
 */
package COSEM.impl;

import COSEM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class COSEMFactoryImpl extends EFactoryImpl implements COSEMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COSEMFactory init() {
		try {
			COSEMFactory theCOSEMFactory = (COSEMFactory)EPackage.Registry.INSTANCE.getEFactory(COSEMPackage.eNS_URI);
			if (theCOSEMFactory != null) {
				return theCOSEMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new COSEMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case COSEMPackage.LOGICAL_DEVICE: return createLogicalDevice();
			case COSEMPackage.PHYSICAL_DEVICE: return createPhysicalDevice();
			case COSEMPackage.MANAGEMENT_LOGICAL_DEVICE: return createManagementLogicalDevice();
			case COSEMPackage.LOGICAL_DEVICE_NAME: return createLogicalDeviceName();
			case COSEMPackage.COSEM_ROOT: return createCOSEMRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDevice createLogicalDevice() {
		LogicalDeviceImpl logicalDevice = new LogicalDeviceImpl();
		return logicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDevice createPhysicalDevice() {
		PhysicalDeviceImpl physicalDevice = new PhysicalDeviceImpl();
		return physicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementLogicalDevice createManagementLogicalDevice() {
		ManagementLogicalDeviceImpl managementLogicalDevice = new ManagementLogicalDeviceImpl();
		return managementLogicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDeviceName createLogicalDeviceName() {
		LogicalDeviceNameImpl logicalDeviceName = new LogicalDeviceNameImpl();
		return logicalDeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMRoot createCOSEMRoot() {
		COSEMRootImpl cosemRoot = new COSEMRootImpl();
		return cosemRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMPackage getCOSEMPackage() {
		return (COSEMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static COSEMPackage getPackage() {
		return COSEMPackage.eINSTANCE;
	}

} //COSEMFactoryImpl
