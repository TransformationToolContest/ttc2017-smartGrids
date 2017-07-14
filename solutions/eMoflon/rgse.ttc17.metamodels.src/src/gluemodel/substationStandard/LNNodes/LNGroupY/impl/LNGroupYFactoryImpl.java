/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupY.impl;

import gluemodel.substationStandard.LNNodes.LNGroupY.*;

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
public class LNGroupYFactoryImpl extends EFactoryImpl implements LNGroupYFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LNGroupYFactory init() {
		try {
			LNGroupYFactory theLNGroupYFactory = (LNGroupYFactory)EPackage.Registry.INSTANCE.getEFactory(LNGroupYPackage.eNS_URI);
			if (theLNGroupYFactory != null) {
				return theLNGroupYFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LNGroupYFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupYFactoryImpl() {
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
			case LNGroupYPackage.GROUP_Y: return createGroupY();
			case LNGroupYPackage.YEFN: return createYEFN();
			case LNGroupYPackage.YLTC: return createYLTC();
			case LNGroupYPackage.YPSH: return createYPSH();
			case LNGroupYPackage.YPTR: return createYPTR();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupY createGroupY() {
		GroupYImpl groupY = new GroupYImpl();
		return groupY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEFN createYEFN() {
		YEFNImpl yefn = new YEFNImpl();
		return yefn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YLTC createYLTC() {
		YLTCImpl yltc = new YLTCImpl();
		return yltc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPSH createYPSH() {
		YPSHImpl ypsh = new YPSHImpl();
		return ypsh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPTR createYPTR() {
		YPTRImpl yptr = new YPTRImpl();
		return yptr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupYPackage getLNGroupYPackage() {
		return (LNGroupYPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LNGroupYPackage getPackage() {
		return LNGroupYPackage.eINSTANCE;
	}

} //LNGroupYFactoryImpl
