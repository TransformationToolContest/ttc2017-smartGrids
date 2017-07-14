/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP.impl;

import gluemodel.substationStandard.LNNodes.LNGroupP.*;

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
public class LNGroupPFactoryImpl extends EFactoryImpl implements LNGroupPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LNGroupPFactory init() {
		try {
			LNGroupPFactory theLNGroupPFactory = (LNGroupPFactory)EPackage.Registry.INSTANCE.getEFactory(LNGroupPPackage.eNS_URI);
			if (theLNGroupPFactory != null) {
				return theLNGroupPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LNGroupPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupPFactoryImpl() {
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
			case LNGroupPPackage.GROUP_P: return createGroupP();
			case LNGroupPPackage.PDIF: return createPDIF();
			case LNGroupPPackage.PDIR: return createPDIR();
			case LNGroupPPackage.PFRC: return createPFRC();
			case LNGroupPPackage.PHAR: return createPHAR();
			case LNGroupPPackage.POPF: return createPOPF();
			case LNGroupPPackage.PPAM: return createPPAM();
			case LNGroupPPackage.PDIS: return createPDIS();
			case LNGroupPPackage.PDOP: return createPDOP();
			case LNGroupPPackage.PHIZ: return createPHIZ();
			case LNGroupPPackage.PIOC: return createPIOC();
			case LNGroupPPackage.PMRI: return createPMRI();
			case LNGroupPPackage.PMSS: return createPMSS();
			case LNGroupPPackage.PSCH: return createPSCH();
			case LNGroupPPackage.PSDE: return createPSDE();
			case LNGroupPPackage.PDUP: return createPDUP();
			case LNGroupPPackage.PTEF: return createPTEF();
			case LNGroupPPackage.PTOC: return createPTOC();
			case LNGroupPPackage.PTOF: return createPTOF();
			case LNGroupPPackage.PTOV: return createPTOV();
			case LNGroupPPackage.PTTR: return createPTTR();
			case LNGroupPPackage.PTUC: return createPTUC();
			case LNGroupPPackage.PTUF: return createPTUF();
			case LNGroupPPackage.PVOC: return createPVOC();
			case LNGroupPPackage.PVPH: return createPVPH();
			case LNGroupPPackage.PTRC: return createPTRC();
			case LNGroupPPackage.PTUV: return createPTUV();
			case LNGroupPPackage.PUPF: return createPUPF();
			case LNGroupPPackage.PZSU: return createPZSU();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupP createGroupP() {
		GroupPImpl groupP = new GroupPImpl();
		return groupP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDIF createPDIF() {
		PDIFImpl pdif = new PDIFImpl();
		return pdif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDIR createPDIR() {
		PDIRImpl pdir = new PDIRImpl();
		return pdir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFRC createPFRC() {
		PFRCImpl pfrc = new PFRCImpl();
		return pfrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHAR createPHAR() {
		PHARImpl phar = new PHARImpl();
		return phar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POPF createPOPF() {
		POPFImpl popf = new POPFImpl();
		return popf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPAM createPPAM() {
		PPAMImpl ppam = new PPAMImpl();
		return ppam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDIS createPDIS() {
		PDISImpl pdis = new PDISImpl();
		return pdis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDOP createPDOP() {
		PDOPImpl pdop = new PDOPImpl();
		return pdop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHIZ createPHIZ() {
		PHIZImpl phiz = new PHIZImpl();
		return phiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIOC createPIOC() {
		PIOCImpl pioc = new PIOCImpl();
		return pioc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PMRI createPMRI() {
		PMRIImpl pmri = new PMRIImpl();
		return pmri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PMSS createPMSS() {
		PMSSImpl pmss = new PMSSImpl();
		return pmss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSCH createPSCH() {
		PSCHImpl psch = new PSCHImpl();
		return psch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSDE createPSDE() {
		PSDEImpl psde = new PSDEImpl();
		return psde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDUP createPDUP() {
		PDUPImpl pdup = new PDUPImpl();
		return pdup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTEF createPTEF() {
		PTEFImpl ptef = new PTEFImpl();
		return ptef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTOC createPTOC() {
		PTOCImpl ptoc = new PTOCImpl();
		return ptoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTOF createPTOF() {
		PTOFImpl ptof = new PTOFImpl();
		return ptof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTOV createPTOV() {
		PTOVImpl ptov = new PTOVImpl();
		return ptov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTTR createPTTR() {
		PTTRImpl pttr = new PTTRImpl();
		return pttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUC createPTUC() {
		PTUCImpl ptuc = new PTUCImpl();
		return ptuc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUF createPTUF() {
		PTUFImpl ptuf = new PTUFImpl();
		return ptuf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PVOC createPVOC() {
		PVOCImpl pvoc = new PVOCImpl();
		return pvoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PVPH createPVPH() {
		PVPHImpl pvph = new PVPHImpl();
		return pvph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTRC createPTRC() {
		PTRCImpl ptrc = new PTRCImpl();
		return ptrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUV createPTUV() {
		PTUVImpl ptuv = new PTUVImpl();
		return ptuv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PUPF createPUPF() {
		PUPFImpl pupf = new PUPFImpl();
		return pupf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZSU createPZSU() {
		PZSUImpl pzsu = new PZSUImpl();
		return pzsu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupPPackage getLNGroupPPackage() {
		return (LNGroupPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LNGroupPPackage getPackage() {
		return LNGroupPPackage.eINSTANCE;
	}

} //LNGroupPFactoryImpl
