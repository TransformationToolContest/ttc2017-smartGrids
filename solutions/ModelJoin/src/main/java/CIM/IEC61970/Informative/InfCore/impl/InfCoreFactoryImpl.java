/**
 */
package CIM.IEC61970.Informative.InfCore.impl;

import CIM.IEC61970.Informative.InfCore.*;

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
public class InfCoreFactoryImpl extends EFactoryImpl implements InfCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfCoreFactory init() {
		try {
			InfCoreFactory theInfCoreFactory = (InfCoreFactory)EPackage.Registry.INSTANCE.getEFactory(InfCorePackage.eNS_URI);
			if (theInfCoreFactory != null) {
				return theInfCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCoreFactoryImpl() {
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
			case InfCorePackage.MODELING_AUTHORITY_SET: return createModelingAuthoritySet();
			case InfCorePackage.MODELING_AUTHORITY: return createModelingAuthority();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingAuthoritySet createModelingAuthoritySet() {
		ModelingAuthoritySetImpl modelingAuthoritySet = new ModelingAuthoritySetImpl();
		return modelingAuthoritySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingAuthority createModelingAuthority() {
		ModelingAuthorityImpl modelingAuthority = new ModelingAuthorityImpl();
		return modelingAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCorePackage getInfCorePackage() {
		return (InfCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfCorePackage getPackage() {
		return InfCorePackage.eINSTANCE;
	}

} //InfCoreFactoryImpl
