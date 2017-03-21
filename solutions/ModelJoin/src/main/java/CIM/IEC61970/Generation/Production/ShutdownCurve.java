/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.Curve;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shutdown Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost <em>Shutdown Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate <em>Shutdown Date</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getShutdownCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between the rate in gross active power/minute (Y-axis) at which a unit should be shutdown and its present gross MW output (X-axis)'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between the rate in gross active power/minute (Y-axis) at which a unit should be shutdown and its present gross MW output (X-axis)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between the rate in gross active power/minute (Y-axis) at which a unit should be shutdown and its present gross MW output (X-axis)' Profile\040documentation='Relationship between the rate in gross active power/minute (Y-axis) at which a unit should be shutdown and its present gross MW output (X-axis)'"
 * @generated
 */
public interface ShutdownCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Shutdown Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shutdown Cost</em>' attribute.
	 * @see #setShutdownCost(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getShutdownCurve_ShutdownCost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fixed shutdown cost'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fixed shutdown cost'"
	 * @generated
	 */
	float getShutdownCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost <em>Shutdown Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Cost</em>' attribute.
	 * @see #getShutdownCost()
	 * @generated
	 */
	void setShutdownCost(float value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getShutdownCurve_ThermalGeneratingUnit()
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve
	 * @model opposite="ShutdownCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have a shutdown curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have a shutdown curve'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Shutdown Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shutdown Date</em>' attribute.
	 * @see #setShutdownDate(Date)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getShutdownCurve_ShutdownDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date and time of the most recent generating unit shutdown'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date and time of the most recent generating unit shutdown'"
	 * @generated
	 */
	Date getShutdownDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate <em>Shutdown Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Date</em>' attribute.
	 * @see #getShutdownDate()
	 * @generated
	 */
	void setShutdownDate(Date value);

} // ShutdownCurve
