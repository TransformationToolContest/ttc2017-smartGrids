/**
 */
package outageDetectionJointarget.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import outageDetectionJointarget.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutageDetectionJointargetFactoryImpl extends EFactoryImpl implements OutageDetectionJointargetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutageDetectionJointargetFactory init() {
		try {
			OutageDetectionJointargetFactory theOutageDetectionJointargetFactory = (OutageDetectionJointargetFactory)EPackage.Registry.INSTANCE.getEFactory(OutageDetectionJointargetPackage.eNS_URI);
			if (theOutageDetectionJointargetFactory != null) {
				return theOutageDetectionJointargetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OutageDetectionJointargetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageDetectionJointargetFactoryImpl() {
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
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER: return createEnergyConsumer();
			case OutageDetectionJointargetPackage.LOCATION: return createLocation();
			case OutageDetectionJointargetPackage.POSITION_POINT: return createPositionPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer createEnergyConsumer() {
		EnergyConsumerImpl energyConsumer = new EnergyConsumerImpl();
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPoint createPositionPoint() {
		PositionPointImpl positionPoint = new PositionPointImpl();
		return positionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageDetectionJointargetPackage getOutageDetectionJointargetPackage() {
		return (OutageDetectionJointargetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OutageDetectionJointargetPackage getPackage() {
		return OutageDetectionJointargetPackage.eINSTANCE;
	}

} //OutageDetectionJointargetFactoryImpl
