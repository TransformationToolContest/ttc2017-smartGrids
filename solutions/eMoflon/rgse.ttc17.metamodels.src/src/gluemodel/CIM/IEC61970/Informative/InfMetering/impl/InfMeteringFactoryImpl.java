/**
 */
package gluemodel.CIM.IEC61970.Informative.InfMetering.impl;

import gluemodel.CIM.IEC61970.Informative.InfMetering.*;

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
public class InfMeteringFactoryImpl extends EFactoryImpl implements InfMeteringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfMeteringFactory init() {
		try {
			InfMeteringFactory theInfMeteringFactory = (InfMeteringFactory)EPackage.Registry.INSTANCE.getEFactory(InfMeteringPackage.eNS_URI);
			if (theInfMeteringFactory != null) {
				return theInfMeteringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfMeteringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfMeteringFactoryImpl() {
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
			case InfMeteringPackage.WATER_METERING_FUNCTION: return createWaterMeteringFunction();
			case InfMeteringPackage.GAS_METERING_FUNCTION: return createGasMeteringFunction();
			case InfMeteringPackage.METERING_FUNCTION_CONFIGURATION: return createMeteringFunctionConfiguration();
			case InfMeteringPackage.COM_PORT: return createComPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterMeteringFunction createWaterMeteringFunction() {
		WaterMeteringFunctionImpl waterMeteringFunction = new WaterMeteringFunctionImpl();
		return waterMeteringFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GasMeteringFunction createGasMeteringFunction() {
		GasMeteringFunctionImpl gasMeteringFunction = new GasMeteringFunctionImpl();
		return gasMeteringFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringFunctionConfiguration createMeteringFunctionConfiguration() {
		MeteringFunctionConfigurationImpl meteringFunctionConfiguration = new MeteringFunctionConfigurationImpl();
		return meteringFunctionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComPort createComPort() {
		ComPortImpl comPort = new ComPortImpl();
		return comPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfMeteringPackage getInfMeteringPackage() {
		return (InfMeteringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfMeteringPackage getPackage() {
		return InfMeteringPackage.eINSTANCE;
	}

} //InfMeteringFactoryImpl
