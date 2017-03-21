/**
 */
package substationStandard.LNNodes.LNGroupT.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import substationStandard.LNNodes.LNGroupT.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LNGroupTFactoryImpl extends EFactoryImpl implements LNGroupTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LNGroupTFactory init() {
		try {
			LNGroupTFactory theLNGroupTFactory = (LNGroupTFactory)EPackage.Registry.INSTANCE.getEFactory(LNGroupTPackage.eNS_URI);
			if (theLNGroupTFactory != null) {
				return theLNGroupTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LNGroupTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupTFactoryImpl() {
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
			case LNGroupTPackage.GROUP_T: return createGroupT();
			case LNGroupTPackage.TCTR: return createTCTR();
			case LNGroupTPackage.TVTR: return createTVTR();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupT createGroupT() {
		GroupTImpl groupT = new GroupTImpl();
		return groupT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCTR createTCTR() {
		TCTRImpl tctr = new TCTRImpl();
		return tctr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVTR createTVTR() {
		TVTRImpl tvtr = new TVTRImpl();
		return tvtr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupTPackage getLNGroupTPackage() {
		return (LNGroupTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LNGroupTPackage getPackage() {
		return LNGroupTPackage.eINSTANCE;
	}

} //LNGroupTFactoryImpl
