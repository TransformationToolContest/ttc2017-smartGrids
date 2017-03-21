/**
 */
package CIM.IEC61970.Wires;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.DCLineSegment#getDcSegmentResistance <em>Dc Segment Resistance</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.DCLineSegment#getDcSegmentInductance <em>Dc Segment Inductance</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getDCLineSegment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A wire or combination of wires not insulated from one another, with consistent electrical characteristics, used to carry direct current between points in the DC region of the power system.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A wire or combination of wires not insulated from one another, with consistent electrical characteristics, used to carry direct current between points in the DC region of the power system.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A wire or combination of wires not insulated from one another, with consistent electrical characteristics, used to carry direct current between points in the DC region of the power system.' Profile\040documentation='A wire or combination of wires not insulated from one another, with consistent electrical characteristics, used to carry direct current between points in the DC region of the power system.'"
 * @generated
 */
public interface DCLineSegment extends Conductor {
	/**
	 * Returns the value of the '<em><b>Dc Segment Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dc Segment Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dc Segment Resistance</em>' attribute.
	 * @see #setDcSegmentResistance(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getDCLineSegment_DcSegmentResistance()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Resistance of the DC line segment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resistance of the DC line segment.'"
	 * @generated
	 */
	float getDcSegmentResistance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.DCLineSegment#getDcSegmentResistance <em>Dc Segment Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dc Segment Resistance</em>' attribute.
	 * @see #getDcSegmentResistance()
	 * @generated
	 */
	void setDcSegmentResistance(float value);

	/**
	 * Returns the value of the '<em><b>Dc Segment Inductance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dc Segment Inductance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dc Segment Inductance</em>' attribute.
	 * @see #setDcSegmentInductance(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getDCLineSegment_DcSegmentInductance()
	 * @model dataType="CIM.IEC61970.Domain.Inductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Inductance of the DC line segment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Inductance of the DC line segment.'"
	 * @generated
	 */
	float getDcSegmentInductance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.DCLineSegment#getDcSegmentInductance <em>Dc Segment Inductance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dc Segment Inductance</em>' attribute.
	 * @see #getDcSegmentInductance()
	 * @generated
	 */
	void setDcSegmentInductance(float value);

} // DCLineSegment
