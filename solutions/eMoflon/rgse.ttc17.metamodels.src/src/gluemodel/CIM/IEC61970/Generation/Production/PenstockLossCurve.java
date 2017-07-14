/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Penstock Loss Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getPenstockLossCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between penstock head loss (in meters) and  total discharge through the penstock (in cubic meters per second). One or more turbines may be connected to the same penstock.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between penstock head loss (in meters) and  total discharge through the penstock (in cubic meters per second). One or more turbines may be connected to the same penstock.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between penstock head loss (in meters) and  total discharge through the penstock (in cubic meters per second). One or more turbines may be connected to the same penstock.' Profile\040documentation='Relationship between penstock head loss (in meters) and  total discharge through the penstock (in cubic meters per second). One or more turbines may be connected to the same penstock.'"
 * @generated
 */
public interface PenstockLossCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Generating Unit</em>' reference.
	 * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getPenstockLossCurve_HydroGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve
	 * @model opposite="PenstockLossCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A hydro generating unit has a penstock loss curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A hydro generating unit has a penstock loss curve'"
	 * @generated
	 */
	HydroGeneratingUnit getHydroGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Generating Unit</em>' reference.
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	void setHydroGeneratingUnit(HydroGeneratingUnit value);

} // PenstockLossCurve
