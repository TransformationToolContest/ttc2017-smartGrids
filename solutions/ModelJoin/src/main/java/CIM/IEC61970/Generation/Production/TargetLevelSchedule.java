/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Level Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir <em>Reservoir</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getTargetLevelSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reservoir water level targets from advanced studies or \"rule curves\". Typically in one hour increments for up to 10 days'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Reservoir water level targets from advanced studies or \"rule curves\". Typically in one hour increments for up to 10 days'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reservoir water level targets from advanced studies or \"rule curves\". Typically in one hour increments for up to 10 days' Profile\040documentation='Reservoir water level targets from advanced studies or \"rule curves\". Typically in one hour increments for up to 10 days'"
 * @generated
 */
public interface TargetLevelSchedule extends Curve {
	/**
	 * Returns the value of the '<em><b>Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservoir</em>' reference.
	 * @see #setReservoir(Reservoir)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getTargetLevelSchedule_Reservoir()
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule
	 * @model opposite="TargetLevelSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reservoir may have a water level target schedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reservoir may have a water level target schedule.'"
	 * @generated
	 */
	Reservoir getReservoir();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservoir</em>' reference.
	 * @see #getReservoir()
	 * @generated
	 */
	void setReservoir(Reservoir value);

	/**
	 * Returns the value of the '<em><b>High Level Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Level Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Level Limit</em>' attribute.
	 * @see #setHighLevelLimit(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getTargetLevelSchedule_HighLevelLimit()
	 * @model dataType="CIM.IEC61970.Domain.WaterLevel" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='High target level limit, above which the reservoir operation will be penalized'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='High target level limit, above which the reservoir operation will be penalized'"
	 * @generated
	 */
	float getHighLevelLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Level Limit</em>' attribute.
	 * @see #getHighLevelLimit()
	 * @generated
	 */
	void setHighLevelLimit(float value);

	/**
	 * Returns the value of the '<em><b>Low Level Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Level Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Level Limit</em>' attribute.
	 * @see #setLowLevelLimit(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getTargetLevelSchedule_LowLevelLimit()
	 * @model dataType="CIM.IEC61970.Domain.WaterLevel" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Low target level limit, below which the reservoir operation will be penalized'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Low target level limit, below which the reservoir operation will be penalized'"
	 * @generated
	 */
	float getLowLevelLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Level Limit</em>' attribute.
	 * @see #getLowLevelLimit()
	 * @generated
	 */
	void setLowLevelLimit(float value);

} // TargetLevelSchedule
