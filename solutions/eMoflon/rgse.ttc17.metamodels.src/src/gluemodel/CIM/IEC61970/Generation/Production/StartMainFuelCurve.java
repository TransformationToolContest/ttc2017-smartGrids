/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Main Fuel Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartMainFuelCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The quantity of main fuel (Y-axis) used to restart and repay the auxiliary power consumed versus the number of hours (X-axis) the unit was off line'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The quantity of main fuel (Y-axis) used to restart and repay the auxiliary power consumed versus the number of hours (X-axis) the unit was off line'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The quantity of main fuel (Y-axis) used to restart and repay the auxiliary power consumed versus the number of hours (X-axis) the unit was off line' Profile\040documentation='The quantity of main fuel (Y-axis) used to restart and repay the auxiliary power consumed versus the number of hours (X-axis) the unit was off line'"
 * @generated
 */
public interface StartMainFuelCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Main Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.FuelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Fuel Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.FuelType
	 * @see #setMainFuelType(FuelType)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartMainFuelCurve_MainFuelType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of main fuel'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of main fuel'"
	 * @generated
	 */
	FuelType getMainFuelType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Fuel Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.FuelType
	 * @see #getMainFuelType()
	 * @generated
	 */
	void setMainFuelType(FuelType value);

	/**
	 * Returns the value of the '<em><b>Startup Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Model</em>' reference.
	 * @see #setStartupModel(StartupModel)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartMainFuelCurve_StartupModel()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve
	 * @model opposite="StartMainFuelCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit\'s startup model may have a startup main fuel curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit\'s startup model may have a startup main fuel curve'"
	 * @generated
	 */
	StartupModel getStartupModel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Model</em>' reference.
	 * @see #getStartupModel()
	 * @generated
	 */
	void setStartupModel(StartupModel value);

} // StartMainFuelCurve
