/**
 */
package CIM.IEC61968.WiresExt.util;

import CIM.Element;

import CIM.IEC61968.WiresExt.*;

import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.Equipment;
import CIM.IEC61970.Core.IdentifiedObject;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Wires.ACLineSegment;
import CIM.IEC61970.Wires.Conductor;
import CIM.IEC61970.Wires.RatioTapChanger;
import CIM.IEC61970.Wires.TapChanger;

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
 * @see CIM.IEC61968.WiresExt.WiresExtPackage
 * @generated
 */
public class WiresExtSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WiresExtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresExtSwitch() {
		if (modelPackage == null) {
			modelPackage = WiresExtPackage.eINSTANCE;
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING: {
				DistributionTransformerWinding distributionTransformerWinding = (DistributionTransformerWinding)theEObject;
				T result = caseDistributionTransformerWinding(distributionTransformerWinding);
				if (result == null) result = caseConductingEquipment(distributionTransformerWinding);
				if (result == null) result = caseEquipment(distributionTransformerWinding);
				if (result == null) result = casePowerSystemResource(distributionTransformerWinding);
				if (result == null) result = caseIdentifiedObject(distributionTransformerWinding);
				if (result == null) result = caseElement(distributionTransformerWinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE: {
				PerLengthPhaseImpedance perLengthPhaseImpedance = (PerLengthPhaseImpedance)theEObject;
				T result = casePerLengthPhaseImpedance(perLengthPhaseImpedance);
				if (result == null) result = caseIdentifiedObject(perLengthPhaseImpedance);
				if (result == null) result = caseElement(perLengthPhaseImpedance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER: {
				DistributionTapChanger distributionTapChanger = (DistributionTapChanger)theEObject;
				T result = caseDistributionTapChanger(distributionTapChanger);
				if (result == null) result = caseRatioTapChanger(distributionTapChanger);
				if (result == null) result = caseTapChanger(distributionTapChanger);
				if (result == null) result = casePowerSystemResource(distributionTapChanger);
				if (result == null) result = caseIdentifiedObject(distributionTapChanger);
				if (result == null) result = caseElement(distributionTapChanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresExtPackage.PER_LENGTH_SEQUENCE_IMPEDANCE: {
				PerLengthSequenceImpedance perLengthSequenceImpedance = (PerLengthSequenceImpedance)theEObject;
				T result = casePerLengthSequenceImpedance(perLengthSequenceImpedance);
				if (result == null) result = caseIdentifiedObject(perLengthSequenceImpedance);
				if (result == null) result = caseElement(perLengthSequenceImpedance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresExtPackage.TRANSFORMER_BANK: {
				TransformerBank transformerBank = (TransformerBank)theEObject;
				T result = caseTransformerBank(transformerBank);
				if (result == null) result = caseEquipment(transformerBank);
				if (result == null) result = casePowerSystemResource(transformerBank);
				if (result == null) result = caseIdentifiedObject(transformerBank);
				if (result == null) result = caseElement(transformerBank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT: {
				DistributionLineSegment distributionLineSegment = (DistributionLineSegment)theEObject;
				T result = caseDistributionLineSegment(distributionLineSegment);
				if (result == null) result = caseACLineSegment(distributionLineSegment);
				if (result == null) result = caseConductor(distributionLineSegment);
				if (result == null) result = caseConductingEquipment(distributionLineSegment);
				if (result == null) result = caseEquipment(distributionLineSegment);
				if (result == null) result = casePowerSystemResource(distributionLineSegment);
				if (result == null) result = caseIdentifiedObject(distributionLineSegment);
				if (result == null) result = caseElement(distributionLineSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresExtPackage.PHASE_IMPEDANCE_DATA: {
				PhaseImpedanceData phaseImpedanceData = (PhaseImpedanceData)theEObject;
				T result = casePhaseImpedanceData(phaseImpedanceData);
				if (result == null) result = caseElement(phaseImpedanceData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresExtPackage.WINDING_PI_IMPEDANCE: {
				WindingPiImpedance windingPiImpedance = (WindingPiImpedance)theEObject;
				T result = caseWindingPiImpedance(windingPiImpedance);
				if (result == null) result = caseIdentifiedObject(windingPiImpedance);
				if (result == null) result = caseElement(windingPiImpedance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER: {
				DistributionTransformer distributionTransformer = (DistributionTransformer)theEObject;
				T result = caseDistributionTransformer(distributionTransformer);
				if (result == null) result = caseEquipment(distributionTransformer);
				if (result == null) result = casePowerSystemResource(distributionTransformer);
				if (result == null) result = caseIdentifiedObject(distributionTransformer);
				if (result == null) result = caseElement(distributionTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Transformer Winding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Transformer Winding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionTransformerWinding(DistributionTransformerWinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Length Phase Impedance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Length Phase Impedance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerLengthPhaseImpedance(PerLengthPhaseImpedance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Tap Changer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionTapChanger(DistributionTapChanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Length Sequence Impedance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Length Sequence Impedance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerLengthSequenceImpedance(PerLengthSequenceImpedance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerBank(TransformerBank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Line Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Line Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionLineSegment(DistributionLineSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Impedance Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Impedance Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhaseImpedanceData(PhaseImpedanceData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Winding Pi Impedance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Winding Pi Impedance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindingPiImpedance(WindingPiImpedance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionTransformer(DistributionTransformer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipment(Equipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductingEquipment(ConductingEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapChanger(TapChanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio Tap Changer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatioTapChanger(RatioTapChanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conductor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conductor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductor(Conductor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACLineSegment(ACLineSegment object) {
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

} //WiresExtSwitch
