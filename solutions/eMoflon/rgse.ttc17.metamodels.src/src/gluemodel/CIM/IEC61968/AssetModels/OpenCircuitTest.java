/**
 */
package gluemodel.CIM.IEC61968.AssetModels;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getNoLoadLoss <em>No Load Loss</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getExcitingCurrent <em>Exciting Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getMeasuredWindingSpecs <em>Measured Winding Specs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getNoLoadLossZero <em>No Load Loss Zero</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOpenCircuitTest()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Open-circuit test results may include no-load losses, exciting current, phase shifts, and induced voltage. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence.\nFor induced voltage and phase shifts, use the associated ToWindingSpec class.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Open-circuit test results may include no-load losses, exciting current, phase shifts, and induced voltage. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence.\nFor induced voltage and phase shifts, use the associated ToWindingSpec class.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Open-circuit test results may include no-load losses, exciting current, phase shifts, and induced voltage. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence.\nFor induced voltage and phase shifts, use the associated ToWindingSpec class.' Profile\040documentation='Open-circuit test results may include no-load losses, exciting current, phase shifts, and induced voltage. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence.\nFor induced voltage and phase shifts, use the associated ToWindingSpec class.'"
 * @generated
 */
public interface OpenCircuitTest extends DistributionWindingTest {
	/**
	 * Returns the value of the '<em><b>No Load Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Load Loss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Load Loss</em>' attribute.
	 * @see #setNoLoadLoss(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOpenCircuitTest_NoLoadLoss()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.KWActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Losses measured from a positive-sequence or single-phase open-circuit (excitation) test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Losses measured from a positive-sequence or single-phase open-circuit (excitation) test.'"
	 * @generated
	 */
	float getNoLoadLoss();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getNoLoadLoss <em>No Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Load Loss</em>' attribute.
	 * @see #getNoLoadLoss()
	 * @generated
	 */
	void setNoLoadLoss(float value);

	/**
	 * Returns the value of the '<em><b>Exciting Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exciting Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exciting Current</em>' attribute.
	 * @see #setExcitingCurrent(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOpenCircuitTest_ExcitingCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Exciting current measured from a positive-sequence or single-phase open-circuit (excitation) test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exciting current measured from a positive-sequence or single-phase open-circuit (excitation) test.'"
	 * @generated
	 */
	float getExcitingCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getExcitingCurrent <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exciting Current</em>' attribute.
	 * @see #getExcitingCurrent()
	 * @generated
	 */
	void setExcitingCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Exciting Current Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exciting Current Zero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exciting Current Zero</em>' attribute.
	 * @see #setExcitingCurrentZero(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOpenCircuitTest_ExcitingCurrentZero()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Exciting current measured from a zero-sequence open-circuit (excitation) test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exciting current measured from a zero-sequence open-circuit (excitation) test.'"
	 * @generated
	 */
	float getExcitingCurrentZero();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exciting Current Zero</em>' attribute.
	 * @see #getExcitingCurrentZero()
	 * @generated
	 */
	void setExcitingCurrentZero(float value);

	/**
	 * Returns the value of the '<em><b>Measured Winding Specs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getOpenCircuitTests <em>Open Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured Winding Specs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured Winding Specs</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOpenCircuitTest_MeasuredWindingSpecs()
	 * @see gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getOpenCircuitTests
	 * @model opposite="OpenCircuitTests"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All other windings measured during this test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All other windings measured during this test.'"
	 * @generated
	 */
	EList<ToWindingSpec> getMeasuredWindingSpecs();

	/**
	 * Returns the value of the '<em><b>No Load Loss Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Load Loss Zero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Load Loss Zero</em>' attribute.
	 * @see #setNoLoadLossZero(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOpenCircuitTest_NoLoadLossZero()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.KWActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Losses measured from a zero-sequence open-circuit (excitation) test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Losses measured from a zero-sequence open-circuit (excitation) test.'"
	 * @generated
	 */
	float getNoLoadLossZero();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getNoLoadLossZero <em>No Load Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Load Loss Zero</em>' attribute.
	 * @see #getNoLoadLossZero()
	 * @generated
	 */
	void setNoLoadLossZero(float value);

} // OpenCircuitTest
