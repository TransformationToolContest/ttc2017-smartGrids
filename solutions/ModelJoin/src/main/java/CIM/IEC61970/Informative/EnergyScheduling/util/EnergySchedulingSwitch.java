/**
 */
package CIM.IEC61970.Informative.EnergyScheduling.util;

import CIM.Element;

import CIM.IEC61968.Common.Agreement;
import CIM.IEC61968.Common.Document;

import CIM.IEC61970.ControlArea.ControlArea;

import CIM.IEC61970.Core.BasicIntervalSchedule;
import CIM.IEC61970.Core.Curve;
import CIM.IEC61970.Core.IdentifiedObject;
import CIM.IEC61970.Core.PowerSystemResource;
import CIM.IEC61970.Core.RegularIntervalSchedule;

import CIM.IEC61970.Informative.EnergyScheduling.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage
 * @generated
 */
public class EnergySchedulingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EnergySchedulingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergySchedulingSwitch() {
		if (modelPackage == null) {
			modelPackage = EnergySchedulingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EnergySchedulingPackage.LOSS_PROFILE: {
				LossProfile lossProfile = (LossProfile)theEObject;
				T result = caseLossProfile(lossProfile);
				if (result == null) result = caseProfile(lossProfile);
				if (result == null) result = caseIdentifiedObject(lossProfile);
				if (result == null) result = caseElement(lossProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.SUB_CONTROL_AREA: {
				SubControlArea subControlArea = (SubControlArea)theEObject;
				T result = caseSubControlArea(subControlArea);
				if (result == null) result = caseControlArea(subControlArea);
				if (result == null) result = casePowerSystemResource(subControlArea);
				if (result == null) result = caseIdentifiedObject(subControlArea);
				if (result == null) result = caseElement(subControlArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.RESERVE: {
				Reserve reserve = (Reserve)theEObject;
				T result = caseReserve(reserve);
				if (result == null) result = caseEnergyTransaction(reserve);
				if (result == null) result = caseDocument(reserve);
				if (result == null) result = caseIdentifiedObject(reserve);
				if (result == null) result = caseElement(reserve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.ENERGY_TRANSACTION: {
				EnergyTransaction energyTransaction = (EnergyTransaction)theEObject;
				T result = caseEnergyTransaction(energyTransaction);
				if (result == null) result = caseDocument(energyTransaction);
				if (result == null) result = caseIdentifiedObject(energyTransaction);
				if (result == null) result = caseElement(energyTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.PROFILE: {
				Profile profile = (Profile)theEObject;
				T result = caseProfile(profile);
				if (result == null) result = caseIdentifiedObject(profile);
				if (result == null) result = caseElement(profile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY: {
				TransmissionRightOfWay transmissionRightOfWay = (TransmissionRightOfWay)theEObject;
				T result = caseTransmissionRightOfWay(transmissionRightOfWay);
				if (result == null) result = casePowerSystemResource(transmissionRightOfWay);
				if (result == null) result = caseIdentifiedObject(transmissionRightOfWay);
				if (result == null) result = caseElement(transmissionRightOfWay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.DYNAMIC: {
				Dynamic dynamic = (Dynamic)theEObject;
				T result = caseDynamic(dynamic);
				if (result == null) result = caseEnergyTransaction(dynamic);
				if (result == null) result = caseDocument(dynamic);
				if (result == null) result = caseIdentifiedObject(dynamic);
				if (result == null) result = caseElement(dynamic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.ENERGY_SCHEDULING_VERSION: {
				EnergySchedulingVersion energySchedulingVersion = (EnergySchedulingVersion)theEObject;
				T result = caseEnergySchedulingVersion(energySchedulingVersion);
				if (result == null) result = caseElement(energySchedulingVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE: {
				DynamicSchedule dynamicSchedule = (DynamicSchedule)theEObject;
				T result = caseDynamicSchedule(dynamicSchedule);
				if (result == null) result = caseRegularIntervalSchedule(dynamicSchedule);
				if (result == null) result = caseBasicIntervalSchedule(dynamicSchedule);
				if (result == null) result = caseIdentifiedObject(dynamicSchedule);
				if (result == null) result = caseElement(dynamicSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.AREA_RESERVE_SPEC: {
				AreaReserveSpec areaReserveSpec = (AreaReserveSpec)theEObject;
				T result = caseAreaReserveSpec(areaReserveSpec);
				if (result == null) result = caseElement(areaReserveSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.PROFILE_DATA: {
				ProfileData profileData = (ProfileData)theEObject;
				T result = caseProfileData(profileData);
				if (result == null) result = caseElement(profileData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.ENERGY_PRODUCT: {
				EnergyProduct energyProduct = (EnergyProduct)theEObject;
				T result = caseEnergyProduct(energyProduct);
				if (result == null) result = caseAgreement(energyProduct);
				if (result == null) result = caseDocument(energyProduct);
				if (result == null) result = caseIdentifiedObject(energyProduct);
				if (result == null) result = caseElement(energyProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.TRANSMISSION_CORRIDOR: {
				TransmissionCorridor transmissionCorridor = (TransmissionCorridor)theEObject;
				T result = caseTransmissionCorridor(transmissionCorridor);
				if (result == null) result = casePowerSystemResource(transmissionCorridor);
				if (result == null) result = caseIdentifiedObject(transmissionCorridor);
				if (result == null) result = caseElement(transmissionCorridor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.INADVERTENT_ACCOUNT: {
				InadvertentAccount inadvertentAccount = (InadvertentAccount)theEObject;
				T result = caseInadvertentAccount(inadvertentAccount);
				if (result == null) result = caseCurve(inadvertentAccount);
				if (result == null) result = caseIdentifiedObject(inadvertentAccount);
				if (result == null) result = caseElement(inadvertentAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.AVAILABLE_TRANSMISSION_CAPACITY: {
				AvailableTransmissionCapacity availableTransmissionCapacity = (AvailableTransmissionCapacity)theEObject;
				T result = caseAvailableTransmissionCapacity(availableTransmissionCapacity);
				if (result == null) result = caseCurve(availableTransmissionCapacity);
				if (result == null) result = caseIdentifiedObject(availableTransmissionCapacity);
				if (result == null) result = caseElement(availableTransmissionCapacity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.TIE_LINE: {
				TieLine tieLine = (TieLine)theEObject;
				T result = caseTieLine(tieLine);
				if (result == null) result = caseElement(tieLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.ENERGY_PROFILE: {
				EnergyProfile energyProfile = (EnergyProfile)theEObject;
				T result = caseEnergyProfile(energyProfile);
				if (result == null) result = caseProfile(energyProfile);
				if (result == null) result = caseIdentifiedObject(energyProfile);
				if (result == null) result = caseElement(energyProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseEnergyTransaction(block);
				if (result == null) result = caseDocument(block);
				if (result == null) result = caseIdentifiedObject(block);
				if (result == null) result = caseElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.CURTAILMENT_PROFILE: {
				CurtailmentProfile curtailmentProfile = (CurtailmentProfile)theEObject;
				T result = caseCurtailmentProfile(curtailmentProfile);
				if (result == null) result = caseProfile(curtailmentProfile);
				if (result == null) result = caseIdentifiedObject(curtailmentProfile);
				if (result == null) result = caseElement(curtailmentProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnergySchedulingPackage.HOST_CONTROL_AREA: {
				HostControlArea hostControlArea = (HostControlArea)theEObject;
				T result = caseHostControlArea(hostControlArea);
				if (result == null) result = caseIdentifiedObject(hostControlArea);
				if (result == null) result = caseElement(hostControlArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loss Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loss Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLossProfile(LossProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Control Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubControlArea(SubControlArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserve(Reserve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyTransaction(EnergyTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfile(Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Right Of Way</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Right Of Way</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionRightOfWay(TransmissionRightOfWay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamic(Dynamic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergySchedulingVersion(EnergySchedulingVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicSchedule(DynamicSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Reserve Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Reserve Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaReserveSpec(AreaReserveSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileData(ProfileData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyProduct(EnergyProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Corridor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Corridor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionCorridor(TransmissionCorridor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inadvertent Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inadvertent Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInadvertentAccount(InadvertentAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Available Transmission Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Available Transmission Capacity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailableTransmissionCapacity(AvailableTransmissionCapacity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tie Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tie Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTieLine(TieLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyProfile(EnergyProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curtailment Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curtailment Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurtailmentProfile(CurtailmentProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Control Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostControlArea(HostControlArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystemResource(PowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlArea(ControlArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicIntervalSchedule(BasicIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularIntervalSchedule(RegularIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreement(Agreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurve(Curve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EnergySchedulingSwitch
