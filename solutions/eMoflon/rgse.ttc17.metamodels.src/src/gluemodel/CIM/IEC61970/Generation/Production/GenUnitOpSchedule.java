/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Op Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGenUnitOpSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The generating unit\'s Operator-approved current operating schedule (or plan), typically produced with the aid of unit commitment type analyses. The X-axis represents absolute time. The Y1-axis represents the status (0=off-line and unavailable: 1=available: 2=must run: 3=must run at fixed power value: etc.). The Y2-axis represents the must run fixed power value where required.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The generating unit\'s Operator-approved current operating schedule (or plan), typically produced with the aid of unit commitment type analyses. The X-axis represents absolute time. The Y1-axis represents the status (0=off-line and unavailable: 1=available: 2=must run: 3=must run at fixed power value: etc.). The Y2-axis represents the must run fixed power value where required.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The generating unit\'s Operator-approved current operating schedule (or plan), typically produced with the aid of unit commitment type analyses. The X-axis represents absolute time. The Y1-axis represents the status (0=off-line and unavailable: 1=available: 2=must run: 3=must run at fixed power value: etc.). The Y2-axis represents the must run fixed power value where required.' Profile\040documentation='The generating unit\'s Operator-approved current operating schedule (or plan), typically produced with the aid of unit commitment type analyses. The X-axis represents absolute time. The Y1-axis represents the status (0=off-line and unavailable: 1=available: 2=must run: 3=must run at fixed power value: etc.). The Y2-axis represents the must run fixed power value where required.'"
 * @generated
 */
public interface GenUnitOpSchedule extends RegularIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(GeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGenUnitOpSchedule_GeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule
	 * @model opposite="GenUnitOpSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A generating unit may have an operating schedule, indicating the planned operation of the unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generating unit may have an operating schedule, indicating the planned operation of the unit'"
	 * @generated
	 */
	GeneratingUnit getGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	void setGeneratingUnit(GeneratingUnit value);

} // GenUnitOpSchedule
