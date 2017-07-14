/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inflow Forecast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.InflowForecast#getReservoir <em>Reservoir</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getInflowForecast()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Natural water inflow to a reservoir, usually forecasted from predicted rain and snowmelt. Typically in one hour increments for up to 10 days. The forecast is given in average cubic meters per second over the time increment.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Natural water inflow to a reservoir, usually forecasted from predicted rain and snowmelt. Typically in one hour increments for up to 10 days. The forecast is given in average cubic meters per second over the time increment.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Natural water inflow to a reservoir, usually forecasted from predicted rain and snowmelt. Typically in one hour increments for up to 10 days. The forecast is given in average cubic meters per second over the time increment.' Profile\040documentation='Natural water inflow to a reservoir, usually forecasted from predicted rain and snowmelt. Typically in one hour increments for up to 10 days. The forecast is given in average cubic meters per second over the time increment.'"
 * @generated
 */
public interface InflowForecast extends RegularIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getInflowForecasts <em>Inflow Forecasts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservoir</em>' reference.
	 * @see #setReservoir(Reservoir)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getInflowForecast_Reservoir()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getInflowForecasts
	 * @model opposite="InflowForecasts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reservoir may have a \"natural\" inflow forecast.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reservoir may have a \"natural\" inflow forecast.'"
	 * @generated
	 */
	Reservoir getReservoir();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.InflowForecast#getReservoir <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservoir</em>' reference.
	 * @see #getReservoir()
	 * @generated
	 */
	void setReservoir(Reservoir value);

} // InflowForecast
