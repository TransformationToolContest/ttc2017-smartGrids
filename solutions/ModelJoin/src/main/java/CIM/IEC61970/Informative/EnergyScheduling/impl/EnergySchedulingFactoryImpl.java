/**
 */
package CIM.IEC61970.Informative.EnergyScheduling.impl;

import CIM.IEC61970.Informative.EnergyScheduling.*;

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
public class EnergySchedulingFactoryImpl extends EFactoryImpl implements EnergySchedulingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnergySchedulingFactory init() {
		try {
			EnergySchedulingFactory theEnergySchedulingFactory = (EnergySchedulingFactory)EPackage.Registry.INSTANCE.getEFactory(EnergySchedulingPackage.eNS_URI);
			if (theEnergySchedulingFactory != null) {
				return theEnergySchedulingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnergySchedulingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergySchedulingFactoryImpl() {
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
			case EnergySchedulingPackage.LOSS_PROFILE: return createLossProfile();
			case EnergySchedulingPackage.SUB_CONTROL_AREA: return createSubControlArea();
			case EnergySchedulingPackage.RESERVE: return createReserve();
			case EnergySchedulingPackage.ENERGY_TRANSACTION: return createEnergyTransaction();
			case EnergySchedulingPackage.PROFILE: return createProfile();
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY: return createTransmissionRightOfWay();
			case EnergySchedulingPackage.DYNAMIC: return createDynamic();
			case EnergySchedulingPackage.ENERGY_SCHEDULING_VERSION: return createEnergySchedulingVersion();
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE: return createDynamicSchedule();
			case EnergySchedulingPackage.AREA_RESERVE_SPEC: return createAreaReserveSpec();
			case EnergySchedulingPackage.PROFILE_DATA: return createProfileData();
			case EnergySchedulingPackage.ENERGY_PRODUCT: return createEnergyProduct();
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR: return createTransmissionCorridor();
			case EnergySchedulingPackage.INADVERTENT_ACCOUNT: return createInadvertentAccount();
			case EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY: return createAvailableTransmissionCapacity();
			case EnergySchedulingPackage.TIE_LINE: return createTieLine();
			case EnergySchedulingPackage.ENERGY_PROFILE: return createEnergyProfile();
			case EnergySchedulingPackage.BLOCK: return createBlock();
			case EnergySchedulingPackage.CURTAILMENT_PROFILE: return createCurtailmentProfile();
			case EnergySchedulingPackage.HOST_CONTROL_AREA: return createHostControlArea();
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
			case EnergySchedulingPackage.AREA_CONTROL_MODE:
				return createAreaControlModeFromString(eDataType, initialValue);
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
			case EnergySchedulingPackage.AREA_CONTROL_MODE:
				return convertAreaControlModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LossProfile createLossProfile() {
		LossProfileImpl lossProfile = new LossProfileImpl();
		return lossProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea createSubControlArea() {
		SubControlAreaImpl subControlArea = new SubControlAreaImpl();
		return subControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserve createReserve() {
		ReserveImpl reserve = new ReserveImpl();
		return reserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyTransaction createEnergyTransaction() {
		EnergyTransactionImpl energyTransaction = new EnergyTransactionImpl();
		return energyTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionRightOfWay createTransmissionRightOfWay() {
		TransmissionRightOfWayImpl transmissionRightOfWay = new TransmissionRightOfWayImpl();
		return transmissionRightOfWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM.IEC61970.Informative.EnergyScheduling.Dynamic createDynamic() {
		DynamicImpl dynamic = new DynamicImpl();
		return dynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergySchedulingVersion createEnergySchedulingVersion() {
		EnergySchedulingVersionImpl energySchedulingVersion = new EnergySchedulingVersionImpl();
		return energySchedulingVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicSchedule createDynamicSchedule() {
		DynamicScheduleImpl dynamicSchedule = new DynamicScheduleImpl();
		return dynamicSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaReserveSpec createAreaReserveSpec() {
		AreaReserveSpecImpl areaReserveSpec = new AreaReserveSpecImpl();
		return areaReserveSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileData createProfileData() {
		ProfileDataImpl profileData = new ProfileDataImpl();
		return profileData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyProduct createEnergyProduct() {
		EnergyProductImpl energyProduct = new EnergyProductImpl();
		return energyProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionCorridor createTransmissionCorridor() {
		TransmissionCorridorImpl transmissionCorridor = new TransmissionCorridorImpl();
		return transmissionCorridor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InadvertentAccount createInadvertentAccount() {
		InadvertentAccountImpl inadvertentAccount = new InadvertentAccountImpl();
		return inadvertentAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailableTransmissionCapacity createAvailableTransmissionCapacity() {
		AvailableTransmissionCapacityImpl availableTransmissionCapacity = new AvailableTransmissionCapacityImpl();
		return availableTransmissionCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TieLine createTieLine() {
		TieLineImpl tieLine = new TieLineImpl();
		return tieLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyProfile createEnergyProfile() {
		EnergyProfileImpl energyProfile = new EnergyProfileImpl();
		return energyProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurtailmentProfile createCurtailmentProfile() {
		CurtailmentProfileImpl curtailmentProfile = new CurtailmentProfileImpl();
		return curtailmentProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea createHostControlArea() {
		HostControlAreaImpl hostControlArea = new HostControlAreaImpl();
		return hostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaControlMode createAreaControlModeFromString(EDataType eDataType, String initialValue) {
		AreaControlMode result = AreaControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAreaControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergySchedulingPackage getEnergySchedulingPackage() {
		return (EnergySchedulingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnergySchedulingPackage getPackage() {
		return EnergySchedulingPackage.eINSTANCE;
	}

} //EnergySchedulingFactoryImpl
