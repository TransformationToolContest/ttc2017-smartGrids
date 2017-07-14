/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Ramp Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartRampCurve#getStartupModel <em>Startup Model</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartRampCurve#getHotStandbyRamp <em>Hot Standby Ramp</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartRampCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rate in gross active power/minute (Y-axis) at which a unit can be loaded versus the number of hours (X-axis) the unit was off line'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Rate in gross active power/minute (Y-axis) at which a unit can be loaded versus the number of hours (X-axis) the unit was off line'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rate in gross active power/minute (Y-axis) at which a unit can be loaded versus the number of hours (X-axis) the unit was off line' Profile\040documentation='Rate in gross active power/minute (Y-axis) at which a unit can be loaded versus the number of hours (X-axis) the unit was off line'"
 * @generated
 */
public interface StartRampCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Startup Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Model</em>' reference.
	 * @see #setStartupModel(StartupModel)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartRampCurve_StartupModel()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartRampCurve
	 * @model opposite="StartRampCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit\'s startup model may have a startup ramp curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit\'s startup model may have a startup ramp curve'"
	 * @generated
	 */
	StartupModel getStartupModel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartRampCurve#getStartupModel <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Model</em>' reference.
	 * @see #getStartupModel()
	 * @generated
	 */
	void setStartupModel(StartupModel value);

	/**
	 * Returns the value of the '<em><b>Hot Standby Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Standby Ramp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Standby Ramp</em>' attribute.
	 * @see #setHotStandbyRamp(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartRampCurve_HotStandbyRamp()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePowerChangeRate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The startup ramp rate in gross for a unit that is on hot standby'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The startup ramp rate in gross for a unit that is on hot standby'"
	 * @generated
	 */
	float getHotStandbyRamp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartRampCurve#getHotStandbyRamp <em>Hot Standby Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Standby Ramp</em>' attribute.
	 * @see #getHotStandbyRamp()
	 * @generated
	 */
	void setHotStandbyRamp(float value);

} // StartRampCurve
