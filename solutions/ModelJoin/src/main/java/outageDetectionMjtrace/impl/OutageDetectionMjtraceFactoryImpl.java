/**
 */
package outageDetectionMjtrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import outageDetectionMjtrace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutageDetectionMjtraceFactoryImpl extends EFactoryImpl implements OutageDetectionMjtraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutageDetectionMjtraceFactory init() {
		try {
			OutageDetectionMjtraceFactory theOutageDetectionMjtraceFactory = (OutageDetectionMjtraceFactory)EPackage.Registry.INSTANCE.getEFactory(OutageDetectionMjtracePackage.eNS_URI);
			if (theOutageDetectionMjtraceFactory != null) {
				return theOutageDetectionMjtraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OutageDetectionMjtraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageDetectionMjtraceFactoryImpl() {
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
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER: return createjoin_MeterAsset_PhysicalDevice_EnergyConsumer();
			case OutageDetectionMjtracePackage.REF_LOCATION_LOCATION_LOCATION: return createref_Location_Location_Location();
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION: return createref_PositionPoint_PositionPoint_Position();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public join_MeterAsset_PhysicalDevice_EnergyConsumer createjoin_MeterAsset_PhysicalDevice_EnergyConsumer() {
		join_MeterAsset_PhysicalDevice_EnergyConsumerImpl join_MeterAsset_PhysicalDevice_EnergyConsumer = new join_MeterAsset_PhysicalDevice_EnergyConsumerImpl();
		return join_MeterAsset_PhysicalDevice_EnergyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_Location_Location_Location createref_Location_Location_Location() {
		ref_Location_Location_LocationImpl ref_Location_Location_Location = new ref_Location_Location_LocationImpl();
		return ref_Location_Location_Location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_PositionPoint_PositionPoint_Position createref_PositionPoint_PositionPoint_Position() {
		ref_PositionPoint_PositionPoint_PositionImpl ref_PositionPoint_PositionPoint_Position = new ref_PositionPoint_PositionPoint_PositionImpl();
		return ref_PositionPoint_PositionPoint_Position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageDetectionMjtracePackage getOutageDetectionMjtracePackage() {
		return (OutageDetectionMjtracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OutageDetectionMjtracePackage getPackage() {
		return OutageDetectionMjtracePackage.eINSTANCE;
	}

} //OutageDetectionMjtraceFactoryImpl
