/**
 */
package CIM.IEC61970.impl;

import CIM.IEC61970.*;

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
public class IEC61970FactoryImpl extends EFactoryImpl implements IEC61970Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IEC61970Factory init() {
		try {
			IEC61970Factory theIEC61970Factory = (IEC61970Factory)EPackage.Registry.INSTANCE.getEFactory(IEC61970Package.eNS_URI);
			if (theIEC61970Factory != null) {
				return theIEC61970Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IEC61970FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61970FactoryImpl() {
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
			case IEC61970Package.IEC61970_CIM_VERSION: return createIEC61970CIMVersion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61970CIMVersion createIEC61970CIMVersion() {
		IEC61970CIMVersionImpl iec61970CIMVersion = new IEC61970CIMVersionImpl();
		return iec61970CIMVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61970Package getIEC61970Package() {
		return (IEC61970Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IEC61970Package getPackage() {
		return IEC61970Package.eINSTANCE;
	}

} //IEC61970FactoryImpl
