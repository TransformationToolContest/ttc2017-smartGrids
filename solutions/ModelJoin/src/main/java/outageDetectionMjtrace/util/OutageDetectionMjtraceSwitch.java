/**
 */
package outageDetectionMjtrace.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import outageDetectionMjtrace.*;

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
 * @see outageDetectionMjtrace.OutageDetectionMjtracePackage
 * @generated
 */
public class OutageDetectionMjtraceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutageDetectionMjtracePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageDetectionMjtraceSwitch() {
		if (modelPackage == null) {
			modelPackage = OutageDetectionMjtracePackage.eINSTANCE;
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
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER: {
				join_MeterAsset_PhysicalDevice_EnergyConsumer join_MeterAsset_PhysicalDevice_EnergyConsumer = (join_MeterAsset_PhysicalDevice_EnergyConsumer)theEObject;
				T result = casejoin_MeterAsset_PhysicalDevice_EnergyConsumer(join_MeterAsset_PhysicalDevice_EnergyConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutageDetectionMjtracePackage.REF_LOCATION_LOCATION_LOCATION: {
				ref_Location_Location_Location ref_Location_Location_Location = (ref_Location_Location_Location)theEObject;
				T result = caseref_Location_Location_Location(ref_Location_Location_Location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION: {
				ref_PositionPoint_PositionPoint_Position ref_PositionPoint_PositionPoint_Position = (ref_PositionPoint_PositionPoint_Position)theEObject;
				T result = caseref_PositionPoint_PositionPoint_Position(ref_PositionPoint_PositionPoint_Position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>join Meter Asset Physical Device Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>join Meter Asset Physical Device Energy Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejoin_MeterAsset_PhysicalDevice_EnergyConsumer(join_MeterAsset_PhysicalDevice_EnergyConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Location Location Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Location Location Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_Location_Location_Location(ref_Location_Location_Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Position Point Position Point Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Position Point Position Point Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_PositionPoint_PositionPoint_Position(ref_PositionPoint_PositionPoint_Position object) {
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

} //OutageDetectionMjtraceSwitch
