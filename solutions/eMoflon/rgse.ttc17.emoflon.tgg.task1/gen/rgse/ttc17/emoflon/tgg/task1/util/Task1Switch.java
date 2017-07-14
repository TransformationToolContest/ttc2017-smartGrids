/**
 */
package rgse.ttc17.emoflon.tgg.task1.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import rgse.ttc17.emoflon.tgg.task1.*;

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
 * @see rgse.ttc17.emoflon.tgg.task1.Task1Package
 * @generated
 */
public class Task1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Task1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task1Switch() {
		if (modelPackage == null) {
			modelPackage = Task1Package.eINSTANCE;
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
		case Task1Package.CONTROL_AREA_TO_ENERGY_CONSUMER: {
			ControlAreaToEnergyConsumer controlAreaToEnergyConsumer = (ControlAreaToEnergyConsumer) theEObject;
			T result = caseControlAreaToEnergyConsumer(controlAreaToEnergyConsumer);
			if (result == null)
				result = caseAbstractCorrespondence(controlAreaToEnergyConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task1Package.LOCATION_TO_LOCATION: {
			LocationToLocation locationToLocation = (LocationToLocation) theEObject;
			T result = caseLocationToLocation(locationToLocation);
			if (result == null)
				result = caseAbstractCorrespondence(locationToLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER: {
			PhysicalDeviceToEnergyConsumer physicalDeviceToEnergyConsumer = (PhysicalDeviceToEnergyConsumer) theEObject;
			T result = casePhysicalDeviceToEnergyConsumer(physicalDeviceToEnergyConsumer);
			if (result == null)
				result = caseAbstractCorrespondence(physicalDeviceToEnergyConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task1Package.POSITION_POINT_TO_POSITION_POINT: {
			PositionPointToPositionPoint positionPointToPositionPoint = (PositionPointToPositionPoint) theEObject;
			T result = casePositionPointToPositionPoint(positionPointToPositionPoint);
			if (result == null)
				result = caseAbstractCorrespondence(positionPointToPositionPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task1Package.METER_ASSET_TO_ENERGY_CONSUMER: {
			MeterAssetToEnergyConsumer meterAssetToEnergyConsumer = (MeterAssetToEnergyConsumer) theEObject;
			T result = caseMeterAssetToEnergyConsumer(meterAssetToEnergyConsumer);
			if (result == null)
				result = caseAbstractCorrespondence(meterAssetToEnergyConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Area To Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Area To Energy Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlAreaToEnergyConsumer(ControlAreaToEnergyConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location To Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location To Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationToLocation(LocationToLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Device To Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Device To Energy Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalDeviceToEnergyConsumer(PhysicalDeviceToEnergyConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Point To Position Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Point To Position Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionPointToPositionPoint(PositionPointToPositionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Asset To Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Asset To Energy Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterAssetToEnergyConsumer(MeterAssetToEnergyConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
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

} //Task1Switch
