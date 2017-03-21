/**
 */
package CIM.IEC61968.AssetModels;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Winding Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.DistributionWindingTest#getFromWinding <em>From Winding</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.DistributionWindingTest#getFromTapStep <em>From Tap Step</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getDistributionWindingTest()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Test results for one or more transformer windings. These may include short-circuit or open-circuit (excitation) tests. Short-circuit test results include load losses and leakage impedances. Open-circuit test results may include no-load losses, exciting current, phase shifts, and induced voltage. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Test results for one or more transformer windings. These may include short-circuit or open-circuit (excitation) tests. Short-circuit test results include load losses and leakage impedances. Open-circuit test results may include no-load losses, exciting current, phase shifts, and induced voltage. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Test results for one or more transformer windings. These may include short-circuit or open-circuit (excitation) tests. Short-circuit test results include load losses and leakage impedances. Open-circuit test results may include no-load losses, exciting current, phase shifts, and induced voltage. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence.' Profile\040documentation='Test results for one or more transformer windings. These may include short-circuit or open-circuit (excitation) tests. Short-circuit test results include load losses and leakage impedances. Open-circuit test results may include no-load losses, exciting current, phase shifts, and induced voltage. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence.'"
 * @generated
 */
public interface DistributionWindingTest extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>From Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.WindingInfo#getWindingTests <em>Winding Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Winding</em>' reference.
	 * @see #setFromWinding(WindingInfo)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getDistributionWindingTest_FromWinding()
	 * @see CIM.IEC61968.AssetModels.WindingInfo#getWindingTests
	 * @model opposite="WindingTests"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Winding that voltage or current is applied to during the test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Winding that voltage or current is applied to during the test.'"
	 * @generated
	 */
	WindingInfo getFromWinding();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.DistributionWindingTest#getFromWinding <em>From Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Winding</em>' reference.
	 * @see #getFromWinding()
	 * @generated
	 */
	void setFromWinding(WindingInfo value);

	/**
	 * Returns the value of the '<em><b>From Tap Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Tap Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Tap Step</em>' attribute.
	 * @see #setFromTapStep(int)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getDistributionWindingTest_FromTapStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tap step number for the \"from\" winding of the test pair.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tap step number for the \"from\" winding of the test pair.'"
	 * @generated
	 */
	int getFromTapStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.DistributionWindingTest#getFromTapStep <em>From Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Tap Step</em>' attribute.
	 * @see #getFromTapStep()
	 * @generated
	 */
	void setFromTapStep(int value);

} // DistributionWindingTest
