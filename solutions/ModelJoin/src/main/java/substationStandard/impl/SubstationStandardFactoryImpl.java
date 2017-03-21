/**
 */
package substationStandard.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import substationStandard.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstationStandardFactoryImpl extends EFactoryImpl implements SubstationStandardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubstationStandardFactory init() {
		try {
			SubstationStandardFactory theSubstationStandardFactory = (SubstationStandardFactory)EPackage.Registry.INSTANCE.getEFactory(SubstationStandardPackage.eNS_URI);
			if (theSubstationStandardFactory != null) {
				return theSubstationStandardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SubstationStandardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstationStandardFactoryImpl() {
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
			case SubstationStandardPackage.SUBSTANDARD: return createSubstandard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substandard createSubstandard() {
		SubstandardImpl substandard = new SubstandardImpl();
		return substandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstationStandardPackage getSubstationStandardPackage() {
		return (SubstationStandardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SubstationStandardPackage getPackage() {
		return SubstationStandardPackage.eINSTANCE;
	}

} //SubstationStandardFactoryImpl
