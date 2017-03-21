/**
 */
package substationStandard.LNNodes.LNGroupC.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import substationStandard.LNNodes.LNGroupC.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LNGroupCFactoryImpl extends EFactoryImpl implements LNGroupCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LNGroupCFactory init() {
		try {
			LNGroupCFactory theLNGroupCFactory = (LNGroupCFactory)EPackage.Registry.INSTANCE.getEFactory(LNGroupCPackage.eNS_URI);
			if (theLNGroupCFactory != null) {
				return theLNGroupCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LNGroupCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupCFactoryImpl() {
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
			case LNGroupCPackage.GROUP_C: return createGroupC();
			case LNGroupCPackage.CALH: return createCALH();
			case LNGroupCPackage.CILO: return createCILO();
			case LNGroupCPackage.CCGR: return createCCGR();
			case LNGroupCPackage.CPOW: return createCPOW();
			case LNGroupCPackage.CSWI: return createCSWI();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupC createGroupC() {
		GroupCImpl groupC = new GroupCImpl();
		return groupC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CALH createCALH() {
		CALHImpl calh = new CALHImpl();
		return calh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CILO createCILO() {
		CILOImpl cilo = new CILOImpl();
		return cilo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCGR createCCGR() {
		CCGRImpl ccgr = new CCGRImpl();
		return ccgr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPOW createCPOW() {
		CPOWImpl cpow = new CPOWImpl();
		return cpow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSWI createCSWI() {
		CSWIImpl cswi = new CSWIImpl();
		return cswi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupCPackage getLNGroupCPackage() {
		return (LNGroupCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LNGroupCPackage getPackage() {
		return LNGroupCPackage.eINSTANCE;
	}

} //LNGroupCFactoryImpl
