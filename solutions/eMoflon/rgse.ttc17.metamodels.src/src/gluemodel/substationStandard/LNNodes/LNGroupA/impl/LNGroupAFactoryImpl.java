/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupA.impl;

import gluemodel.substationStandard.LNNodes.LNGroupA.*;

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
public class LNGroupAFactoryImpl extends EFactoryImpl implements LNGroupAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LNGroupAFactory init() {
		try {
			LNGroupAFactory theLNGroupAFactory = (LNGroupAFactory)EPackage.Registry.INSTANCE.getEFactory(LNGroupAPackage.eNS_URI);
			if (theLNGroupAFactory != null) {
				return theLNGroupAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LNGroupAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupAFactoryImpl() {
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
			case LNGroupAPackage.GROUP_A: return createGroupA();
			case LNGroupAPackage.ANCR: return createANCR();
			case LNGroupAPackage.ARCO: return createARCO();
			case LNGroupAPackage.ATCC: return createATCC();
			case LNGroupAPackage.AVCO: return createAVCO();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupA createGroupA() {
		GroupAImpl groupA = new GroupAImpl();
		return groupA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANCR createANCR() {
		ANCRImpl ancr = new ANCRImpl();
		return ancr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARCO createARCO() {
		ARCOImpl arco = new ARCOImpl();
		return arco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATCC createATCC() {
		ATCCImpl atcc = new ATCCImpl();
		return atcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVCO createAVCO() {
		AVCOImpl avco = new AVCOImpl();
		return avco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupAPackage getLNGroupAPackage() {
		return (LNGroupAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LNGroupAPackage getPackage() {
		return LNGroupAPackage.eINSTANCE;
	}

} //LNGroupAFactoryImpl
