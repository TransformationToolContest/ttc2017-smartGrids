/**
 */
package CIM.IEC61968.impl;

import CIM.IEC61968.*;

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
public class IEC61968FactoryImpl extends EFactoryImpl implements IEC61968Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IEC61968Factory init() {
		try {
			IEC61968Factory theIEC61968Factory = (IEC61968Factory)EPackage.Registry.INSTANCE.getEFactory(IEC61968Package.eNS_URI);
			if (theIEC61968Factory != null) {
				return theIEC61968Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IEC61968FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61968FactoryImpl() {
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
			case IEC61968Package.IEC61968_CIM_VERSION: return createIEC61968CIMVersion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61968CIMVersion createIEC61968CIMVersion() {
		IEC61968CIMVersionImpl iec61968CIMVersion = new IEC61968CIMVersionImpl();
		return iec61968CIMVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61968Package getIEC61968Package() {
		return (IEC61968Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IEC61968Package getPackage() {
		return IEC61968Package.eINSTANCE;
	}

} //IEC61968FactoryImpl
