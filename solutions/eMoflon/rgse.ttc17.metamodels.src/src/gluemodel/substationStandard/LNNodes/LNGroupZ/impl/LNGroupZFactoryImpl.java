/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupZ.impl;

import gluemodel.substationStandard.LNNodes.LNGroupZ.*;

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
public class LNGroupZFactoryImpl extends EFactoryImpl implements LNGroupZFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LNGroupZFactory init() {
		try {
			LNGroupZFactory theLNGroupZFactory = (LNGroupZFactory)EPackage.Registry.INSTANCE.getEFactory(LNGroupZPackage.eNS_URI);
			if (theLNGroupZFactory != null) {
				return theLNGroupZFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LNGroupZFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupZFactoryImpl() {
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
			case LNGroupZPackage.GROUP_Z: return createGroupZ();
			case LNGroupZPackage.ZAXN: return createZAXN();
			case LNGroupZPackage.ZGIL: return createZGIL();
			case LNGroupZPackage.ZBAT: return createZBAT();
			case LNGroupZPackage.ZLIN: return createZLIN();
			case LNGroupZPackage.ZMOT: return createZMOT();
			case LNGroupZPackage.ZREA: return createZREA();
			case LNGroupZPackage.ZBSH: return createZBSH();
			case LNGroupZPackage.ZRRC: return createZRRC();
			case LNGroupZPackage.ZSAR: return createZSAR();
			case LNGroupZPackage.ZTCF: return createZTCF();
			case LNGroupZPackage.ZTCR: return createZTCR();
			case LNGroupZPackage.ZCAB: return createZCAB();
			case LNGroupZPackage.ZCAP: return createZCAP();
			case LNGroupZPackage.ZCON: return createZCON();
			case LNGroupZPackage.ZGEN: return createZGEN();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupZ createGroupZ() {
		GroupZImpl groupZ = new GroupZImpl();
		return groupZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZAXN createZAXN() {
		ZAXNImpl zaxn = new ZAXNImpl();
		return zaxn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZGIL createZGIL() {
		ZGILImpl zgil = new ZGILImpl();
		return zgil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZBAT createZBAT() {
		ZBATImpl zbat = new ZBATImpl();
		return zbat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZLIN createZLIN() {
		ZLINImpl zlin = new ZLINImpl();
		return zlin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZMOT createZMOT() {
		ZMOTImpl zmot = new ZMOTImpl();
		return zmot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZREA createZREA() {
		ZREAImpl zrea = new ZREAImpl();
		return zrea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZBSH createZBSH() {
		ZBSHImpl zbsh = new ZBSHImpl();
		return zbsh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZRRC createZRRC() {
		ZRRCImpl zrrc = new ZRRCImpl();
		return zrrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZSAR createZSAR() {
		ZSARImpl zsar = new ZSARImpl();
		return zsar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZTCF createZTCF() {
		ZTCFImpl ztcf = new ZTCFImpl();
		return ztcf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZTCR createZTCR() {
		ZTCRImpl ztcr = new ZTCRImpl();
		return ztcr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZCAB createZCAB() {
		ZCABImpl zcab = new ZCABImpl();
		return zcab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZCAP createZCAP() {
		ZCAPImpl zcap = new ZCAPImpl();
		return zcap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZCON createZCON() {
		ZCONImpl zcon = new ZCONImpl();
		return zcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZGEN createZGEN() {
		ZGENImpl zgen = new ZGENImpl();
		return zgen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupZPackage getLNGroupZPackage() {
		return (LNGroupZPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LNGroupZPackage getPackage() {
		return LNGroupZPackage.eINSTANCE;
	}

} //LNGroupZFactoryImpl
