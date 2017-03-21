/**
 */
package CIM.IEC61968.AssetModels;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.ShortCircuitTest#getLoadLoss <em>Load Loss</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ShortCircuitTest#getLoadLossZero <em>Load Loss Zero</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ShortCircuitTest#getShortedWindingSpecs <em>Shorted Winding Specs</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getShortCircuitTest()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Short-circuit test results include load losses and leakage impedances. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence. There must be at least one short-circuited (\"to\") winding.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Short-circuit test results include load losses and leakage impedances. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence. There must be at least one short-circuited (\"to\") winding.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Short-circuit test results include load losses and leakage impedances. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence. There must be at least one short-circuited (\"to\") winding.' Profile\040documentation='Short-circuit test results include load losses and leakage impedances. For three-phase windings, the excitation can be positive sequence (the default) or zero sequence. There must be at least one short-circuited (\"to\") winding.'"
 * @generated
 */
public interface ShortCircuitTest extends DistributionWindingTest {
	/**
	 * Returns the value of the '<em><b>Load Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Loss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Loss</em>' attribute.
	 * @see #setLoadLoss(float)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getShortCircuitTest_LoadLoss()
	 * @model dataType="CIM.IEC61970.Domain.KWActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Load losses from a positive-sequence or single-phase short-circuit test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Load losses from a positive-sequence or single-phase short-circuit test.'"
	 * @generated
	 */
	float getLoadLoss();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.ShortCircuitTest#getLoadLoss <em>Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Loss</em>' attribute.
	 * @see #getLoadLoss()
	 * @generated
	 */
	void setLoadLoss(float value);

	/**
	 * Returns the value of the '<em><b>Load Loss Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Loss Zero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Loss Zero</em>' attribute.
	 * @see #setLoadLossZero(float)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getShortCircuitTest_LoadLossZero()
	 * @model dataType="CIM.IEC61970.Domain.KWActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Load losses from a zero-sequence short-circuit test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Load losses from a zero-sequence short-circuit test.'"
	 * @generated
	 */
	float getLoadLossZero();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.ShortCircuitTest#getLoadLossZero <em>Load Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Loss Zero</em>' attribute.
	 * @see #getLoadLossZero()
	 * @generated
	 */
	void setLoadLossZero(float value);

	/**
	 * Returns the value of the '<em><b>Leakage Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leakage Impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leakage Impedance</em>' attribute.
	 * @see #setLeakageImpedance(float)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getShortCircuitTest_LeakageImpedance()
	 * @model dataType="CIM.IEC61970.Domain.Impedance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Leakage impedance measured from a positive-sequence or single-phase short-circuit test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Leakage impedance measured from a positive-sequence or single-phase short-circuit test.'"
	 * @generated
	 */
	float getLeakageImpedance();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leakage Impedance</em>' attribute.
	 * @see #getLeakageImpedance()
	 * @generated
	 */
	void setLeakageImpedance(float value);

	/**
	 * Returns the value of the '<em><b>Shorted Winding Specs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.AssetModels.ToWindingSpec}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.ToWindingSpec#getShortCircuitTests <em>Short Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shorted Winding Specs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shorted Winding Specs</em>' reference list.
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getShortCircuitTest_ShortedWindingSpecs()
	 * @see CIM.IEC61968.AssetModels.ToWindingSpec#getShortCircuitTests
	 * @model opposite="ShortCircuitTests"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All windings short-circuited during this test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All windings short-circuited during this test.'"
	 * @generated
	 */
	EList<ToWindingSpec> getShortedWindingSpecs();

	/**
	 * Returns the value of the '<em><b>Leakage Impedance Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leakage Impedance Zero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leakage Impedance Zero</em>' attribute.
	 * @see #setLeakageImpedanceZero(float)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getShortCircuitTest_LeakageImpedanceZero()
	 * @model dataType="CIM.IEC61970.Domain.Impedance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Leakage impedance measured from a zero-sequence short-circuit test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Leakage impedance measured from a zero-sequence short-circuit test.'"
	 * @generated
	 */
	float getLeakageImpedanceZero();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leakage Impedance Zero</em>' attribute.
	 * @see #getLeakageImpedanceZero()
	 * @generated
	 */
	void setLeakageImpedanceZero(float value);

} // ShortCircuitTest
