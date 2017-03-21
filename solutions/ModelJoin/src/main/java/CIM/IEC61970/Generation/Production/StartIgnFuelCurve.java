/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Ign Fuel Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getStartIgnFuelCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The quantity of ignition fuel (Y-axis) used to restart and repay the auxiliary power consumed versus the number of hours (X-axis) the unit was off line'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The quantity of ignition fuel (Y-axis) used to restart and repay the auxiliary power consumed versus the number of hours (X-axis) the unit was off line'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The quantity of ignition fuel (Y-axis) used to restart and repay the auxiliary power consumed versus the number of hours (X-axis) the unit was off line' Profile\040documentation='The quantity of ignition fuel (Y-axis) used to restart and repay the auxiliary power consumed versus the number of hours (X-axis) the unit was off line'"
 * @generated
 */
public interface StartIgnFuelCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Ignition Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Generation.Production.FuelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignition Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignition Fuel Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.FuelType
	 * @see #setIgnitionFuelType(FuelType)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getStartIgnFuelCurve_IgnitionFuelType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of ignition fuel'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of ignition fuel'"
	 * @generated
	 */
	FuelType getIgnitionFuelType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignition Fuel Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.FuelType
	 * @see #getIgnitionFuelType()
	 * @generated
	 */
	void setIgnitionFuelType(FuelType value);

	/**
	 * Returns the value of the '<em><b>Startup Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Model</em>' reference.
	 * @see #setStartupModel(StartupModel)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getStartIgnFuelCurve_StartupModel()
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve
	 * @model opposite="StartIgnFuelCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit\'s startup model may have a startup ignition fuel curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit\'s startup model may have a startup ignition fuel curve'"
	 * @generated
	 */
	StartupModel getStartupModel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Model</em>' reference.
	 * @see #getStartupModel()
	 * @generated
	 */
	void setStartupModel(StartupModel value);

} // StartIgnFuelCurve
