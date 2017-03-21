/**
 */
package CIM.IEC61968.WiresExt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61968.WiresExt.WiresExtPackage
 * @generated
 */
public interface WiresExtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiresExtFactory eINSTANCE = CIM.IEC61968.WiresExt.impl.WiresExtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Distribution Transformer Winding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribution Transformer Winding</em>'.
	 * @generated
	 */
	DistributionTransformerWinding createDistributionTransformerWinding();

	/**
	 * Returns a new object of class '<em>Per Length Phase Impedance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Per Length Phase Impedance</em>'.
	 * @generated
	 */
	PerLengthPhaseImpedance createPerLengthPhaseImpedance();

	/**
	 * Returns a new object of class '<em>Distribution Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribution Tap Changer</em>'.
	 * @generated
	 */
	DistributionTapChanger createDistributionTapChanger();

	/**
	 * Returns a new object of class '<em>Per Length Sequence Impedance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Per Length Sequence Impedance</em>'.
	 * @generated
	 */
	PerLengthSequenceImpedance createPerLengthSequenceImpedance();

	/**
	 * Returns a new object of class '<em>Transformer Bank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformer Bank</em>'.
	 * @generated
	 */
	TransformerBank createTransformerBank();

	/**
	 * Returns a new object of class '<em>Distribution Line Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribution Line Segment</em>'.
	 * @generated
	 */
	DistributionLineSegment createDistributionLineSegment();

	/**
	 * Returns a new object of class '<em>Phase Impedance Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase Impedance Data</em>'.
	 * @generated
	 */
	PhaseImpedanceData createPhaseImpedanceData();

	/**
	 * Returns a new object of class '<em>Winding Pi Impedance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Winding Pi Impedance</em>'.
	 * @generated
	 */
	WindingPiImpedance createWindingPiImpedance();

	/**
	 * Returns a new object of class '<em>Distribution Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribution Transformer</em>'.
	 * @generated
	 */
	DistributionTransformer createDistributionTransformer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WiresExtPackage getWiresExtPackage();

} //WiresExtFactory
