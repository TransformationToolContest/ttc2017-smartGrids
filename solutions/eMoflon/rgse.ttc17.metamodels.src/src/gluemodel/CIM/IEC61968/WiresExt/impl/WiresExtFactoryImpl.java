/**
 */
package gluemodel.CIM.IEC61968.WiresExt.impl;

import gluemodel.CIM.IEC61968.WiresExt.*;

import org.eclipse.emf.ecore.EClass;
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
public class WiresExtFactoryImpl extends EFactoryImpl implements WiresExtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WiresExtFactory init() {
		try {
			WiresExtFactory theWiresExtFactory = (WiresExtFactory)EPackage.Registry.INSTANCE.getEFactory(WiresExtPackage.eNS_URI);
			if (theWiresExtFactory != null) {
				return theWiresExtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WiresExtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresExtFactoryImpl() {
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING: return createDistributionTransformerWinding();
			case WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE: return createPerLengthPhaseImpedance();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER: return createDistributionTapChanger();
			case WiresExtPackage.PER_LENGTH_SEQUENCE_IMPEDANCE: return createPerLengthSequenceImpedance();
			case WiresExtPackage.TRANSFORMER_BANK: return createTransformerBank();
			case WiresExtPackage.DISTRIBUTION_LINE_SEGMENT: return createDistributionLineSegment();
			case WiresExtPackage.PHASE_IMPEDANCE_DATA: return createPhaseImpedanceData();
			case WiresExtPackage.WINDING_PI_IMPEDANCE: return createWindingPiImpedance();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER: return createDistributionTransformer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformerWinding createDistributionTransformerWinding() {
		DistributionTransformerWindingImpl distributionTransformerWinding = new DistributionTransformerWindingImpl();
		return distributionTransformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthPhaseImpedance createPerLengthPhaseImpedance() {
		PerLengthPhaseImpedanceImpl perLengthPhaseImpedance = new PerLengthPhaseImpedanceImpl();
		return perLengthPhaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTapChanger createDistributionTapChanger() {
		DistributionTapChangerImpl distributionTapChanger = new DistributionTapChangerImpl();
		return distributionTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthSequenceImpedance createPerLengthSequenceImpedance() {
		PerLengthSequenceImpedanceImpl perLengthSequenceImpedance = new PerLengthSequenceImpedanceImpl();
		return perLengthSequenceImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerBank createTransformerBank() {
		TransformerBankImpl transformerBank = new TransformerBankImpl();
		return transformerBank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionLineSegment createDistributionLineSegment() {
		DistributionLineSegmentImpl distributionLineSegment = new DistributionLineSegmentImpl();
		return distributionLineSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseImpedanceData createPhaseImpedanceData() {
		PhaseImpedanceDataImpl phaseImpedanceData = new PhaseImpedanceDataImpl();
		return phaseImpedanceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingPiImpedance createWindingPiImpedance() {
		WindingPiImpedanceImpl windingPiImpedance = new WindingPiImpedanceImpl();
		return windingPiImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformer createDistributionTransformer() {
		DistributionTransformerImpl distributionTransformer = new DistributionTransformerImpl();
		return distributionTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresExtPackage getWiresExtPackage() {
		return (WiresExtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WiresExtPackage getPackage() {
		return WiresExtPackage.eINSTANCE;
	}

} //WiresExtFactoryImpl
