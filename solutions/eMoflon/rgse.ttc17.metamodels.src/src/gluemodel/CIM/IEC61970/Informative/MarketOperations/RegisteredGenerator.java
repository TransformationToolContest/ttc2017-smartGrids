/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowControlLImit <em>Low Control LImit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowerControlRate <em>Lower Control Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRampRateCurves <em>Ramp Rate Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getUnitInitialConditions <em>Unit Initial Conditions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getStartUpCostCurves <em>Start Up Cost Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRaiseRampRate <em>Raise Ramp Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRaiseControlRate <em>Raise Control Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMaximumOperatingMW <em>Maximum Operating MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getHighControlLimit <em>High Control Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMinimumOperatingMW <em>Minimum Operating MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowerRampRate <em>Lower Ramp Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingBids <em>Generating Bids</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getSpinReserveRamp <em>Spin Reserve Ramp</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator()
 * @model
 * @generated
 */
public interface RegisteredGenerator extends RegisteredResource {
	/**
	 * Returns the value of the '<em><b>Low Control LImit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Control LImit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Control LImit</em>' attribute.
	 * @see #setLowControlLImit(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_LowControlLImit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Low limit for secondary (AGC) control'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Low limit for secondary (AGC) control'"
	 * @generated
	 */
	float getLowControlLImit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowControlLImit <em>Low Control LImit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Control LImit</em>' attribute.
	 * @see #getLowControlLImit()
	 * @generated
	 */
	void setLowControlLImit(float value);

	/**
	 * Returns the value of the '<em><b>Lower Control Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Control Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Control Rate</em>' attribute.
	 * @see #setLowerControlRate(Object)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_LowerControlRate()
	 * @model dataType="gluemodel.CIM.PowerROCPerMin" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Regulation down response rate in MW per minute'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Regulation down response rate in MW per minute'"
	 * @generated
	 */
	Object getLowerControlRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowerControlRate <em>Lower Control Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Control Rate</em>' attribute.
	 * @see #getLowerControlRate()
	 * @generated
	 */
	void setLowerControlRate(Object value);

	/**
	 * Returns the value of the '<em><b>Ramp Rate Curves</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Rate Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Rate Curves</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_RampRateCurves()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 * @generated
	 */
	EList<RampRateCurve> getRampRateCurves();

	/**
	 * Returns the value of the '<em><b>Unit Initial Conditions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Initial Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Initial Conditions</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_UnitInitialConditions()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 * @generated
	 */
	EList<UnitInitialConditions> getUnitInitialConditions();

	/**
	 * Returns the value of the '<em><b>Start Up Cost Curves</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getRegisteredGenerators <em>Registered Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Up Cost Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Up Cost Curves</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_StartUpCostCurves()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getRegisteredGenerators
	 * @model opposite="RegisteredGenerators"
	 * @generated
	 */
	EList<StartUpCostCurve> getStartUpCostCurves();

	/**
	 * Returns the value of the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raise Ramp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raise Ramp Rate</em>' attribute.
	 * @see #setRaiseRampRate(Object)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_RaiseRampRate()
	 * @model dataType="gluemodel.CIM.PowerROCPerMin" required="true"
	 * @generated
	 */
	Object getRaiseRampRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRaiseRampRate <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raise Ramp Rate</em>' attribute.
	 * @see #getRaiseRampRate()
	 * @generated
	 */
	void setRaiseRampRate(Object value);

	/**
	 * Returns the value of the '<em><b>Raise Control Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raise Control Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raise Control Rate</em>' attribute.
	 * @see #setRaiseControlRate(Object)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_RaiseControlRate()
	 * @model dataType="gluemodel.CIM.PowerROCPerMin" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Regulation up response rate in MW per minute'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Regulation up response rate in MW per minute'"
	 * @generated
	 */
	Object getRaiseControlRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRaiseControlRate <em>Raise Control Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raise Control Rate</em>' attribute.
	 * @see #getRaiseControlRate()
	 * @generated
	 */
	void setRaiseControlRate(Object value);

	/**
	 * Returns the value of the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Allowable Spinning Reserve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
	 * @see #setMaximumAllowableSpinningReserve(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_MaximumAllowableSpinningReserve()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum allowable spinning reserve. Spinning reserve will never be considered greater than this value regardless of the current operating point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum allowable spinning reserve. Spinning reserve will never be considered greater than this value regardless of the current operating point.'"
	 * @generated
	 */
	float getMaximumAllowableSpinningReserve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
	 * @see #getMaximumAllowableSpinningReserve()
	 * @generated
	 */
	void setMaximumAllowableSpinningReserve(float value);

	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRegisteredGenerator <em>Registered Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(GeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_GeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRegisteredGenerator
	 * @model opposite="RegisteredGenerator"
	 * @generated
	 */
	GeneratingUnit getGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	void setGeneratingUnit(GeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Maximum Operating MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Operating MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Operating MW</em>' attribute.
	 * @see #setMaximumOperatingMW(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_MaximumOperatingMW()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is the maximum operating MW limit the dispatcher can enter for this unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the maximum operating MW limit the dispatcher can enter for this unit'"
	 * @generated
	 */
	float getMaximumOperatingMW();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMaximumOperatingMW <em>Maximum Operating MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Operating MW</em>' attribute.
	 * @see #getMaximumOperatingMW()
	 * @generated
	 */
	void setMaximumOperatingMW(float value);

	/**
	 * Returns the value of the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Control Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Control Limit</em>' attribute.
	 * @see #setHighControlLimit(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_HighControlLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='High limit for secondary (AGC) control'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='High limit for secondary (AGC) control'"
	 * @generated
	 */
	float getHighControlLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getHighControlLimit <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Control Limit</em>' attribute.
	 * @see #getHighControlLimit()
	 * @generated
	 */
	void setHighControlLimit(float value);

	/**
	 * Returns the value of the '<em><b>Minimum Operating MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Operating MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Operating MW</em>' attribute.
	 * @see #setMinimumOperatingMW(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_MinimumOperatingMW()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is the minimum operating MW limit the dispatcher can enter for this unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the minimum operating MW limit the dispatcher can enter for this unit.'"
	 * @generated
	 */
	float getMinimumOperatingMW();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMinimumOperatingMW <em>Minimum Operating MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Operating MW</em>' attribute.
	 * @see #getMinimumOperatingMW()
	 * @generated
	 */
	void setMinimumOperatingMW(float value);

	/**
	 * Returns the value of the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Ramp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Ramp Rate</em>' attribute.
	 * @see #setLowerRampRate(Object)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_LowerRampRate()
	 * @model dataType="gluemodel.CIM.PowerROCPerMin" required="true"
	 * @generated
	 */
	Object getLowerRampRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowerRampRate <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Ramp Rate</em>' attribute.
	 * @see #getLowerRampRate()
	 * @generated
	 */
	void setLowerRampRate(Object value);

	/**
	 * Returns the value of the '<em><b>Generating Bids</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getRegisteredGenerator <em>Registered Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Bids</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_GeneratingBids()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getRegisteredGenerator
	 * @model opposite="RegisteredGenerator"
	 * @generated
	 */
	EList<GeneratingBid> getGeneratingBids();

	/**
	 * Returns the value of the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spin Reserve Ramp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spin Reserve Ramp</em>' attribute.
	 * @see #setSpinReserveRamp(Object)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredGenerator_SpinReserveRamp()
	 * @model dataType="gluemodel.CIM.PowerROCPerMin" required="true"
	 * @generated
	 */
	Object getSpinReserveRamp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getSpinReserveRamp <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spin Reserve Ramp</em>' attribute.
	 * @see #getSpinReserveRamp()
	 * @generated
	 */
	void setSpinReserveRamp(Object value);

} // RegisteredGenerator
