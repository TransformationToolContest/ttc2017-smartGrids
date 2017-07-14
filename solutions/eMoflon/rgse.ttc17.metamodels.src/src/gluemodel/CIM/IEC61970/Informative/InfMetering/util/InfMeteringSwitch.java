/**
 */
package gluemodel.CIM.IEC61970.Informative.InfMetering.util;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61968.Assets.AssetFunction;

import gluemodel.CIM.IEC61968.Metering.DeviceFunction;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfMetering.*;

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
 * @see gluemodel.CIM.IEC61970.Informative.InfMetering.InfMeteringPackage
 * @generated
 */
public class InfMeteringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfMeteringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfMeteringSwitch() {
		if (modelPackage == null) {
			modelPackage = InfMeteringPackage.eINSTANCE;
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
			case InfMeteringPackage.WATER_METERING_FUNCTION: {
				WaterMeteringFunction waterMeteringFunction = (WaterMeteringFunction)theEObject;
				T result = caseWaterMeteringFunction(waterMeteringFunction);
				if (result == null) result = caseDeviceFunction(waterMeteringFunction);
				if (result == null) result = caseAssetFunction(waterMeteringFunction);
				if (result == null) result = caseIdentifiedObject(waterMeteringFunction);
				if (result == null) result = caseElement(waterMeteringFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfMeteringPackage.GAS_METERING_FUNCTION: {
				GasMeteringFunction gasMeteringFunction = (GasMeteringFunction)theEObject;
				T result = caseGasMeteringFunction(gasMeteringFunction);
				if (result == null) result = caseDeviceFunction(gasMeteringFunction);
				if (result == null) result = caseAssetFunction(gasMeteringFunction);
				if (result == null) result = caseIdentifiedObject(gasMeteringFunction);
				if (result == null) result = caseElement(gasMeteringFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfMeteringPackage.METERING_FUNCTION_CONFIGURATION: {
				MeteringFunctionConfiguration meteringFunctionConfiguration = (MeteringFunctionConfiguration)theEObject;
				T result = caseMeteringFunctionConfiguration(meteringFunctionConfiguration);
				if (result == null) result = caseIdentifiedObject(meteringFunctionConfiguration);
				if (result == null) result = caseElement(meteringFunctionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfMeteringPackage.COM_PORT: {
				ComPort comPort = (ComPort)theEObject;
				T result = caseComPort(comPort);
				if (result == null) result = caseIdentifiedObject(comPort);
				if (result == null) result = caseElement(comPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Metering Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Metering Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterMeteringFunction(WaterMeteringFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gas Metering Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gas Metering Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGasMeteringFunction(GasMeteringFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metering Function Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metering Function Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeteringFunctionConfiguration(MeteringFunctionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComPort(ComPort object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Asset Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetFunction(AssetFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceFunction(DeviceFunction object) {
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

} //InfMeteringSwitch
