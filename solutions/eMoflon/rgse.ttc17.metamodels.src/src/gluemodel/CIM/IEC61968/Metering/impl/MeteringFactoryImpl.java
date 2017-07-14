/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Metering.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class MeteringFactoryImpl extends EFactoryImpl implements MeteringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeteringFactory init() {
		try {
			MeteringFactory theMeteringFactory = (MeteringFactory)EPackage.Registry.INSTANCE.getEFactory(MeteringPackage.eNS_URI);
			if (theMeteringFactory != null) {
				return theMeteringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeteringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringFactoryImpl() {
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
			case MeteringPackage.END_DEVICE_EVENT: return createEndDeviceEvent();
			case MeteringPackage.READING_TYPE: return createReadingType();
			case MeteringPackage.METER_SERVICE_WORK: return createMeterServiceWork();
			case MeteringPackage.DEVICE_FUNCTION: return createDeviceFunction();
			case MeteringPackage.END_DEVICE_GROUP: return createEndDeviceGroup();
			case MeteringPackage.DYNAMIC_DEMAND: return createDynamicDemand();
			case MeteringPackage.INTERVAL_READING: return createIntervalReading();
			case MeteringPackage.SDP_LOCATION: return createSDPLocation();
			case MeteringPackage.END_DEVICE_ASSET: return createEndDeviceAsset();
			case MeteringPackage.INTERVAL_BLOCK: return createIntervalBlock();
			case MeteringPackage.READING_QUALITY: return createReadingQuality();
			case MeteringPackage.METER_ASSET: return createMeterAsset();
			case MeteringPackage.METER_READING: return createMeterReading();
			case MeteringPackage.READING: return createReading();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM: return createDemandResponseProgram();
			case MeteringPackage.COM_FUNCTION: return createComFunction();
			case MeteringPackage.SERVICE_DELIVERY_POINT: return createServiceDeliveryPoint();
			case MeteringPackage.REGISTER: return createRegister();
			case MeteringPackage.END_DEVICE_CONTROL: return createEndDeviceControl();
			case MeteringPackage.PENDING: return createPending();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION: return createElectricMeteringFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MeteringPackage.READING_KIND:
				return createReadingKindFromString(eDataType, initialValue);
			case MeteringPackage.DEMAND_KIND:
				return createDemandKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MeteringPackage.READING_KIND:
				return convertReadingKindToString(eDataType, instanceValue);
			case MeteringPackage.DEMAND_KIND:
				return convertDemandKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceEvent createEndDeviceEvent() {
		EndDeviceEventImpl endDeviceEvent = new EndDeviceEventImpl();
		return endDeviceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType createReadingType() {
		ReadingTypeImpl readingType = new ReadingTypeImpl();
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterServiceWork createMeterServiceWork() {
		MeterServiceWorkImpl meterServiceWork = new MeterServiceWorkImpl();
		return meterServiceWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFunction createDeviceFunction() {
		DeviceFunctionImpl deviceFunction = new DeviceFunctionImpl();
		return deviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceGroup createEndDeviceGroup() {
		EndDeviceGroupImpl endDeviceGroup = new EndDeviceGroupImpl();
		return endDeviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicDemand createDynamicDemand() {
		DynamicDemandImpl dynamicDemand = new DynamicDemandImpl();
		return dynamicDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalReading createIntervalReading() {
		IntervalReadingImpl intervalReading = new IntervalReadingImpl();
		return intervalReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDPLocation createSDPLocation() {
		SDPLocationImpl sdpLocation = new SDPLocationImpl();
		return sdpLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceAsset createEndDeviceAsset() {
		EndDeviceAssetImpl endDeviceAsset = new EndDeviceAssetImpl();
		return endDeviceAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalBlock createIntervalBlock() {
		IntervalBlockImpl intervalBlock = new IntervalBlockImpl();
		return intervalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingQuality createReadingQuality() {
		ReadingQualityImpl readingQuality = new ReadingQualityImpl();
		return readingQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset createMeterAsset() {
		MeterAssetImpl meterAsset = new MeterAssetImpl();
		return meterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterReading createMeterReading() {
		MeterReadingImpl meterReading = new MeterReadingImpl();
		return meterReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reading createReading() {
		ReadingImpl reading = new ReadingImpl();
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram createDemandResponseProgram() {
		DemandResponseProgramImpl demandResponseProgram = new DemandResponseProgramImpl();
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComFunction createComFunction() {
		ComFunctionImpl comFunction = new ComFunctionImpl();
		return comFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint createServiceDeliveryPoint() {
		ServiceDeliveryPointImpl serviceDeliveryPoint = new ServiceDeliveryPointImpl();
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register createRegister() {
		RegisterImpl register = new RegisterImpl();
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceControl createEndDeviceControl() {
		EndDeviceControlImpl endDeviceControl = new EndDeviceControlImpl();
		return endDeviceControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pending createPending() {
		PendingImpl pending = new PendingImpl();
		return pending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricMeteringFunction createElectricMeteringFunction() {
		ElectricMeteringFunctionImpl electricMeteringFunction = new ElectricMeteringFunctionImpl();
		return electricMeteringFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingKind createReadingKindFromString(EDataType eDataType, String initialValue) {
		ReadingKind result = ReadingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandKind createDemandKindFromString(EDataType eDataType, String initialValue) {
		DemandKind result = DemandKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDemandKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringPackage getMeteringPackage() {
		return (MeteringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeteringPackage getPackage() {
		return MeteringPackage.eINSTANCE;
	}

} //MeteringFactoryImpl
