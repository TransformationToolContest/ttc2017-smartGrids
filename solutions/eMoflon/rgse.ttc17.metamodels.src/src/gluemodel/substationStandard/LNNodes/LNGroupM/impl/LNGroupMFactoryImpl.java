/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM.impl;

import gluemodel.substationStandard.LNNodes.LNGroupM.*;

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
public class LNGroupMFactoryImpl extends EFactoryImpl implements LNGroupMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LNGroupMFactory init() {
		try {
			LNGroupMFactory theLNGroupMFactory = (LNGroupMFactory)EPackage.Registry.INSTANCE.getEFactory(LNGroupMPackage.eNS_URI);
			if (theLNGroupMFactory != null) {
				return theLNGroupMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LNGroupMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupMFactoryImpl() {
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
			case LNGroupMPackage.GROUP_M: return createGroupM();
			case LNGroupMPackage.MDIF: return createMDIF();
			case LNGroupMPackage.MHAI: return createMHAI();
			case LNGroupMPackage.MHAN: return createMHAN();
			case LNGroupMPackage.MMXU: return createMMXU();
			case LNGroupMPackage.MSQI: return createMSQI();
			case LNGroupMPackage.MMTR: return createMMTR();
			case LNGroupMPackage.MMXN: return createMMXN();
			case LNGroupMPackage.MSTA: return createMSTA();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupM createGroupM() {
		GroupMImpl groupM = new GroupMImpl();
		return groupM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDIF createMDIF() {
		MDIFImpl mdif = new MDIFImpl();
		return mdif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MHAI createMHAI() {
		MHAIImpl mhai = new MHAIImpl();
		return mhai;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MHAN createMHAN() {
		MHANImpl mhan = new MHANImpl();
		return mhan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMXU createMMXU() {
		MMXUImpl mmxu = new MMXUImpl();
		return mmxu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSQI createMSQI() {
		MSQIImpl msqi = new MSQIImpl();
		return msqi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMTR createMMTR() {
		MMTRImpl mmtr = new MMTRImpl();
		return mmtr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMXN createMMXN() {
		MMXNImpl mmxn = new MMXNImpl();
		return mmxn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSTA createMSTA() {
		MSTAImpl msta = new MSTAImpl();
		return msta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupMPackage getLNGroupMPackage() {
		return (LNGroupMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LNGroupMPackage getPackage() {
		return LNGroupMPackage.eINSTANCE;
	}

} //LNGroupMFactoryImpl
