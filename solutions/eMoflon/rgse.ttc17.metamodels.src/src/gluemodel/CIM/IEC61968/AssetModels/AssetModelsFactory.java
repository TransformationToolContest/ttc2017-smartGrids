/**
 */
package gluemodel.CIM.IEC61968.AssetModels;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage
 * @generated
 */
public interface AssetModelsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssetModelsFactory eINSTANCE = gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conductor Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conductor Info</em>'.
	 * @generated
	 */
	ConductorInfo createConductorInfo();

	/**
	 * Returns a new object of class '<em>Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire Type</em>'.
	 * @generated
	 */
	WireType createWireType();

	/**
	 * Returns a new object of class '<em>Concentric Neutral Cable Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concentric Neutral Cable Info</em>'.
	 * @generated
	 */
	ConcentricNeutralCableInfo createConcentricNeutralCableInfo();

	/**
	 * Returns a new object of class '<em>Winding Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Winding Info</em>'.
	 * @generated
	 */
	WindingInfo createWindingInfo();

	/**
	 * Returns a new object of class '<em>Overhead Conductor Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overhead Conductor Info</em>'.
	 * @generated
	 */
	OverheadConductorInfo createOverheadConductorInfo();

	/**
	 * Returns a new object of class '<em>To Winding Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Winding Spec</em>'.
	 * @generated
	 */
	ToWindingSpec createToWindingSpec();

	/**
	 * Returns a new object of class '<em>Asset Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Model</em>'.
	 * @generated
	 */
	AssetModel createAssetModel();

	/**
	 * Returns a new object of class '<em>Cable Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cable Info</em>'.
	 * @generated
	 */
	CableInfo createCableInfo();

	/**
	 * Returns a new object of class '<em>Open Circuit Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Circuit Test</em>'.
	 * @generated
	 */
	OpenCircuitTest createOpenCircuitTest();

	/**
	 * Returns a new object of class '<em>Distribution Winding Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribution Winding Test</em>'.
	 * @generated
	 */
	DistributionWindingTest createDistributionWindingTest();

	/**
	 * Returns a new object of class '<em>Short Circuit Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Circuit Test</em>'.
	 * @generated
	 */
	ShortCircuitTest createShortCircuitTest();

	/**
	 * Returns a new object of class '<em>End Device Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Device Model</em>'.
	 * @generated
	 */
	EndDeviceModel createEndDeviceModel();

	/**
	 * Returns a new object of class '<em>Transformer Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformer Info</em>'.
	 * @generated
	 */
	TransformerInfo createTransformerInfo();

	/**
	 * Returns a new object of class '<em>Wire Arrangement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire Arrangement</em>'.
	 * @generated
	 */
	WireArrangement createWireArrangement();

	/**
	 * Returns a new object of class '<em>Tape Shield Cable Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tape Shield Cable Info</em>'.
	 * @generated
	 */
	TapeShieldCableInfo createTapeShieldCableInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssetModelsPackage getAssetModelsPackage();

} //AssetModelsFactory
