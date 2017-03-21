/**
 */
package substationStandard.LNNodes.LNGroupR.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import substationStandard.LNNodes.LNGroupR.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LNGroupRFactoryImpl extends EFactoryImpl implements LNGroupRFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LNGroupRFactory init() {
		try {
			LNGroupRFactory theLNGroupRFactory = (LNGroupRFactory)EPackage.Registry.INSTANCE.getEFactory(LNGroupRPackage.eNS_URI);
			if (theLNGroupRFactory != null) {
				return theLNGroupRFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LNGroupRFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupRFactoryImpl() {
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
			case LNGroupRPackage.GROUP_R: return createGroupR();
			case LNGroupRPackage.RDRE: return createRDRE();
			case LNGroupRPackage.RDRS: return createRDRS();
			case LNGroupRPackage.RPSB: return createRPSB();
			case LNGroupRPackage.RBRF: return createRBRF();
			case LNGroupRPackage.RADR: return createRADR();
			case LNGroupRPackage.RBDR: return createRBDR();
			case LNGroupRPackage.RDIR: return createRDIR();
			case LNGroupRPackage.RFLO: return createRFLO();
			case LNGroupRPackage.RREC: return createRREC();
			case LNGroupRPackage.RSYN: return createRSYN();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupR createGroupR() {
		GroupRImpl groupR = new GroupRImpl();
		return groupR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDRE createRDRE() {
		RDREImpl rdre = new RDREImpl();
		return rdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDRS createRDRS() {
		RDRSImpl rdrs = new RDRSImpl();
		return rdrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPSB createRPSB() {
		RPSBImpl rpsb = new RPSBImpl();
		return rpsb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBRF createRBRF() {
		RBRFImpl rbrf = new RBRFImpl();
		return rbrf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RADR createRADR() {
		RADRImpl radr = new RADRImpl();
		return radr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBDR createRBDR() {
		RBDRImpl rbdr = new RBDRImpl();
		return rbdr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDIR createRDIR() {
		RDIRImpl rdir = new RDIRImpl();
		return rdir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFLO createRFLO() {
		RFLOImpl rflo = new RFLOImpl();
		return rflo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RREC createRREC() {
		RRECImpl rrec = new RRECImpl();
		return rrec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSYN createRSYN() {
		RSYNImpl rsyn = new RSYNImpl();
		return rsyn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupRPackage getLNGroupRPackage() {
		return (LNGroupRPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LNGroupRPackage getPackage() {
		return LNGroupRPackage.eINSTANCE;
	}

} //LNGroupRFactoryImpl
