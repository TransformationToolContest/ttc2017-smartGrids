/**
 */
package CIM.IEC61970.Equivalents.impl;

import CIM.IEC61970.Equivalents.*;

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
public class EquivalentsFactoryImpl extends EFactoryImpl implements EquivalentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EquivalentsFactory init() {
		try {
			EquivalentsFactory theEquivalentsFactory = (EquivalentsFactory)EPackage.Registry.INSTANCE.getEFactory(EquivalentsPackage.eNS_URI);
			if (theEquivalentsFactory != null) {
				return theEquivalentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EquivalentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentsFactoryImpl() {
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT: return createEquivalentEquipment();
			case EquivalentsPackage.EQUIVALENT_INJECTION: return createEquivalentInjection();
			case EquivalentsPackage.EQUIVALENT_NETWORK: return createEquivalentNetwork();
			case EquivalentsPackage.EQUIVALENT_SHUNT: return createEquivalentShunt();
			case EquivalentsPackage.EQUIVALENT_BRANCH: return createEquivalentBranch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentEquipment createEquivalentEquipment() {
		EquivalentEquipmentImpl equivalentEquipment = new EquivalentEquipmentImpl();
		return equivalentEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentInjection createEquivalentInjection() {
		EquivalentInjectionImpl equivalentInjection = new EquivalentInjectionImpl();
		return equivalentInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentNetwork createEquivalentNetwork() {
		EquivalentNetworkImpl equivalentNetwork = new EquivalentNetworkImpl();
		return equivalentNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentShunt createEquivalentShunt() {
		EquivalentShuntImpl equivalentShunt = new EquivalentShuntImpl();
		return equivalentShunt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentBranch createEquivalentBranch() {
		EquivalentBranchImpl equivalentBranch = new EquivalentBranchImpl();
		return equivalentBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentsPackage getEquivalentsPackage() {
		return (EquivalentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EquivalentsPackage getPackage() {
		return EquivalentsPackage.eINSTANCE;
	}

} //EquivalentsFactoryImpl
