/**
 */
package CIM.IEC61968.AssetModels.util;

import CIM.Element;

import CIM.IEC61968.AssetModels.*;

import CIM.IEC61970.Core.IdentifiedObject;

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
 * @see CIM.IEC61968.AssetModels.AssetModelsPackage
 * @generated
 */
public class AssetModelsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssetModelsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelsSwitch() {
		if (modelPackage == null) {
			modelPackage = AssetModelsPackage.eINSTANCE;
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
			case AssetModelsPackage.CONDUCTOR_INFO: {
				ConductorInfo conductorInfo = (ConductorInfo)theEObject;
				T result = caseConductorInfo(conductorInfo);
				if (result == null) result = caseIdentifiedObject(conductorInfo);
				if (result == null) result = caseElement(conductorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.WIRE_TYPE: {
				WireType wireType = (WireType)theEObject;
				T result = caseWireType(wireType);
				if (result == null) result = caseIdentifiedObject(wireType);
				if (result == null) result = caseElement(wireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO: {
				ConcentricNeutralCableInfo concentricNeutralCableInfo = (ConcentricNeutralCableInfo)theEObject;
				T result = caseConcentricNeutralCableInfo(concentricNeutralCableInfo);
				if (result == null) result = caseCableInfo(concentricNeutralCableInfo);
				if (result == null) result = caseConductorInfo(concentricNeutralCableInfo);
				if (result == null) result = caseIdentifiedObject(concentricNeutralCableInfo);
				if (result == null) result = caseElement(concentricNeutralCableInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.WINDING_INFO: {
				WindingInfo windingInfo = (WindingInfo)theEObject;
				T result = caseWindingInfo(windingInfo);
				if (result == null) result = caseIdentifiedObject(windingInfo);
				if (result == null) result = caseElement(windingInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO: {
				OverheadConductorInfo overheadConductorInfo = (OverheadConductorInfo)theEObject;
				T result = caseOverheadConductorInfo(overheadConductorInfo);
				if (result == null) result = caseConductorInfo(overheadConductorInfo);
				if (result == null) result = caseIdentifiedObject(overheadConductorInfo);
				if (result == null) result = caseElement(overheadConductorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.TO_WINDING_SPEC: {
				ToWindingSpec toWindingSpec = (ToWindingSpec)theEObject;
				T result = caseToWindingSpec(toWindingSpec);
				if (result == null) result = caseIdentifiedObject(toWindingSpec);
				if (result == null) result = caseElement(toWindingSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.ASSET_MODEL: {
				AssetModel assetModel = (AssetModel)theEObject;
				T result = caseAssetModel(assetModel);
				if (result == null) result = caseIdentifiedObject(assetModel);
				if (result == null) result = caseElement(assetModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.CABLE_INFO: {
				CableInfo cableInfo = (CableInfo)theEObject;
				T result = caseCableInfo(cableInfo);
				if (result == null) result = caseConductorInfo(cableInfo);
				if (result == null) result = caseIdentifiedObject(cableInfo);
				if (result == null) result = caseElement(cableInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.OPEN_CIRCUIT_TEST: {
				OpenCircuitTest openCircuitTest = (OpenCircuitTest)theEObject;
				T result = caseOpenCircuitTest(openCircuitTest);
				if (result == null) result = caseDistributionWindingTest(openCircuitTest);
				if (result == null) result = caseIdentifiedObject(openCircuitTest);
				if (result == null) result = caseElement(openCircuitTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST: {
				DistributionWindingTest distributionWindingTest = (DistributionWindingTest)theEObject;
				T result = caseDistributionWindingTest(distributionWindingTest);
				if (result == null) result = caseIdentifiedObject(distributionWindingTest);
				if (result == null) result = caseElement(distributionWindingTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.SHORT_CIRCUIT_TEST: {
				ShortCircuitTest shortCircuitTest = (ShortCircuitTest)theEObject;
				T result = caseShortCircuitTest(shortCircuitTest);
				if (result == null) result = caseDistributionWindingTest(shortCircuitTest);
				if (result == null) result = caseIdentifiedObject(shortCircuitTest);
				if (result == null) result = caseElement(shortCircuitTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.END_DEVICE_MODEL: {
				EndDeviceModel endDeviceModel = (EndDeviceModel)theEObject;
				T result = caseEndDeviceModel(endDeviceModel);
				if (result == null) result = caseAssetModel(endDeviceModel);
				if (result == null) result = caseIdentifiedObject(endDeviceModel);
				if (result == null) result = caseElement(endDeviceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.TRANSFORMER_INFO: {
				TransformerInfo transformerInfo = (TransformerInfo)theEObject;
				T result = caseTransformerInfo(transformerInfo);
				if (result == null) result = caseIdentifiedObject(transformerInfo);
				if (result == null) result = caseElement(transformerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.WIRE_ARRANGEMENT: {
				WireArrangement wireArrangement = (WireArrangement)theEObject;
				T result = caseWireArrangement(wireArrangement);
				if (result == null) result = caseIdentifiedObject(wireArrangement);
				if (result == null) result = caseElement(wireArrangement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO: {
				TapeShieldCableInfo tapeShieldCableInfo = (TapeShieldCableInfo)theEObject;
				T result = caseTapeShieldCableInfo(tapeShieldCableInfo);
				if (result == null) result = caseCableInfo(tapeShieldCableInfo);
				if (result == null) result = caseConductorInfo(tapeShieldCableInfo);
				if (result == null) result = caseIdentifiedObject(tapeShieldCableInfo);
				if (result == null) result = caseElement(tapeShieldCableInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conductor Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conductor Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductorInfo(ConductorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireType(WireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concentric Neutral Cable Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concentric Neutral Cable Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcentricNeutralCableInfo(ConcentricNeutralCableInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Winding Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Winding Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindingInfo(WindingInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overhead Conductor Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overhead Conductor Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverheadConductorInfo(OverheadConductorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Winding Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Winding Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToWindingSpec(ToWindingSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetModel(AssetModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCableInfo(CableInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Circuit Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Circuit Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenCircuitTest(OpenCircuitTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Winding Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Winding Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionWindingTest(DistributionWindingTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Circuit Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Circuit Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortCircuitTest(ShortCircuitTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Device Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDeviceModel(EndDeviceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerInfo(TransformerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Arrangement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Arrangement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireArrangement(WireArrangement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tape Shield Cable Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tape Shield Cable Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapeShieldCableInfo(TapeShieldCableInfo object) {
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

} //AssetModelsSwitch
