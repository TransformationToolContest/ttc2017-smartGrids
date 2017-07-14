/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupX.impl;

import gluemodel.substationStandard.LNNodes.LNGroupX.*;

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
public class LNGroupXFactoryImpl extends EFactoryImpl implements LNGroupXFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LNGroupXFactory init() {
		try {
			LNGroupXFactory theLNGroupXFactory = (LNGroupXFactory)EPackage.Registry.INSTANCE.getEFactory(LNGroupXPackage.eNS_URI);
			if (theLNGroupXFactory != null) {
				return theLNGroupXFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LNGroupXFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupXFactoryImpl() {
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
			case LNGroupXPackage.GROUP_X: return createGroupX();
			case LNGroupXPackage.XCBR: return createXCBR();
			case LNGroupXPackage.XSWI: return createXSWI();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupX createGroupX() {
		GroupXImpl groupX = new GroupXImpl();
		return groupX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCBR createXCBR() {
		XCBRImpl xcbr = new XCBRImpl();
		return xcbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSWI createXSWI() {
		XSWIImpl xswi = new XSWIImpl();
		return xswi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupXPackage getLNGroupXPackage() {
		return (LNGroupXPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LNGroupXPackage getPackage() {
		return LNGroupXPackage.eINSTANCE;
	}

} //LNGroupXFactoryImpl
