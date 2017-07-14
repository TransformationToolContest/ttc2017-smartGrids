/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Pump Op Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPumpOpSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydro pump\'s Operator-approved current operating schedule (or plan), typically produced with the aid of unit commitment type analyses.The unit\'s operating schedule status is typically given as: (0=unavailable)  (1=avilable to startup or shutdown)  (2=must pump)'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The hydro pump\'s Operator-approved current operating schedule (or plan), typically produced with the aid of unit commitment type analyses.The unit\'s operating schedule status is typically given as: (0=unavailable)  (1=avilable to startup or shutdown)  (2=must pump)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydro pump\'s Operator-approved current operating schedule (or plan), typically produced with the aid of unit commitment type analyses.The unit\'s operating schedule status is typically given as: (0=unavailable)  (1=avilable to startup or shutdown)  (2=must pump)' Profile\040documentation='The hydro pump\'s Operator-approved current operating schedule (or plan), typically produced with the aid of unit commitment type analyses.The unit\'s operating schedule status is typically given as: (0=unavailable)  (1=avilable to startup or shutdown)  (2=must pump)'"
 * @generated
 */
public interface HydroPumpOpSchedule extends RegularIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Hydro Pump</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Pump</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Pump</em>' reference.
	 * @see #setHydroPump(HydroPump)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPumpOpSchedule_HydroPump()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule
	 * @model opposite="HydroPumpOpSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydro pump has a pumping schedule over time, indicating when pumping is to occur.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydro pump has a pumping schedule over time, indicating when pumping is to occur.'"
	 * @generated
	 */
	HydroPump getHydroPump();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Pump</em>' reference.
	 * @see #getHydroPump()
	 * @generated
	 */
	void setHydroPump(HydroPump value);

} // HydroPumpOpSchedule
