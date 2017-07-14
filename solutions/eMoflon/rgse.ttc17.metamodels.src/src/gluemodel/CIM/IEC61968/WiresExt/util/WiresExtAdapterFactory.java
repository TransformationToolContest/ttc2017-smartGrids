/**
 */
package gluemodel.CIM.IEC61968.WiresExt.util;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61968.WiresExt.*;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;
import gluemodel.CIM.IEC61970.Core.Equipment;
import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Wires.ACLineSegment;
import gluemodel.CIM.IEC61970.Wires.Conductor;
import gluemodel.CIM.IEC61970.Wires.RatioTapChanger;
import gluemodel.CIM.IEC61970.Wires.TapChanger;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage
 * @generated
 */
public class WiresExtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WiresExtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresExtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WiresExtPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiresExtSwitch<Adapter> modelSwitch =
		new WiresExtSwitch<Adapter>() {
			@Override
			public Adapter caseDistributionTransformerWinding(DistributionTransformerWinding object) {
				return createDistributionTransformerWindingAdapter();
			}
			@Override
			public Adapter casePerLengthPhaseImpedance(PerLengthPhaseImpedance object) {
				return createPerLengthPhaseImpedanceAdapter();
			}
			@Override
			public Adapter caseDistributionTapChanger(DistributionTapChanger object) {
				return createDistributionTapChangerAdapter();
			}
			@Override
			public Adapter casePerLengthSequenceImpedance(PerLengthSequenceImpedance object) {
				return createPerLengthSequenceImpedanceAdapter();
			}
			@Override
			public Adapter caseTransformerBank(TransformerBank object) {
				return createTransformerBankAdapter();
			}
			@Override
			public Adapter caseDistributionLineSegment(DistributionLineSegment object) {
				return createDistributionLineSegmentAdapter();
			}
			@Override
			public Adapter casePhaseImpedanceData(PhaseImpedanceData object) {
				return createPhaseImpedanceDataAdapter();
			}
			@Override
			public Adapter caseWindingPiImpedance(WindingPiImpedance object) {
				return createWindingPiImpedanceAdapter();
			}
			@Override
			public Adapter caseDistributionTransformer(DistributionTransformer object) {
				return createDistributionTransformerAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter casePowerSystemResource(PowerSystemResource object) {
				return createPowerSystemResourceAdapter();
			}
			@Override
			public Adapter caseEquipment(Equipment object) {
				return createEquipmentAdapter();
			}
			@Override
			public Adapter caseConductingEquipment(ConductingEquipment object) {
				return createConductingEquipmentAdapter();
			}
			@Override
			public Adapter caseTapChanger(TapChanger object) {
				return createTapChangerAdapter();
			}
			@Override
			public Adapter caseRatioTapChanger(RatioTapChanger object) {
				return createRatioTapChangerAdapter();
			}
			@Override
			public Adapter caseConductor(Conductor object) {
				return createConductorAdapter();
			}
			@Override
			public Adapter caseACLineSegment(ACLineSegment object) {
				return createACLineSegmentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding <em>Distribution Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding
	 * @generated
	 */
	public Adapter createDistributionTransformerWindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance <em>Per Length Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance
	 * @generated
	 */
	public Adapter createPerLengthPhaseImpedanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger <em>Distribution Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger
	 * @generated
	 */
	public Adapter createDistributionTapChangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance <em>Per Length Sequence Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance
	 * @generated
	 */
	public Adapter createPerLengthSequenceImpedanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.WiresExt.TransformerBank <em>Transformer Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.WiresExt.TransformerBank
	 * @generated
	 */
	public Adapter createTransformerBankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment <em>Distribution Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment
	 * @generated
	 */
	public Adapter createDistributionLineSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData <em>Phase Impedance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData
	 * @generated
	 */
	public Adapter createPhaseImpedanceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance <em>Winding Pi Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WindingPiImpedance
	 * @generated
	 */
	public Adapter createWindingPiImpedanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer <em>Distribution Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer
	 * @generated
	 */
	public Adapter createDistributionTransformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource
	 * @generated
	 */
	public Adapter createPowerSystemResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Core.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Core.Equipment
	 * @generated
	 */
	public Adapter createEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment
	 * @generated
	 */
	public Adapter createConductingEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Wires.TapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Wires.TapChanger
	 * @generated
	 */
	public Adapter createTapChangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Wires.RatioTapChanger
	 * @generated
	 */
	public Adapter createRatioTapChangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Wires.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Wires.Conductor
	 * @generated
	 */
	public Adapter createConductorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Wires.ACLineSegment <em>AC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Wires.ACLineSegment
	 * @generated
	 */
	public Adapter createACLineSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WiresExtAdapterFactory
