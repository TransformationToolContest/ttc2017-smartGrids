/**
 */
package gluemodel.CIM.IEC61970.Wires;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Break Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.LoadBreakSwitch#getRatedCurrent <em>Rated Current</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getLoadBreakSwitch()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A mechanical switching device capable of making, carrying, and breaking currents under normal operating conditions.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A mechanical switching device capable of making, carrying, and breaking currents under normal operating conditions.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A mechanical switching device capable of making, carrying, and breaking currents under normal operating conditions.' Profile\040documentation='A mechanical switching device capable of making, carrying, and breaking currents under normal operating conditions.'"
 * @generated
 */
public interface LoadBreakSwitch extends ProtectedSwitch {
	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #setRatedCurrent(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getLoadBreakSwitch_RatedCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current carrying capacity of a wire or cable under stated thermal conditions.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current carrying capacity of a wire or cable under stated thermal conditions.'"
	 * @generated
	 */
	float getRatedCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.LoadBreakSwitch#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #getRatedCurrent()
	 * @generated
	 */
	void setRatedCurrent(float value);

} // LoadBreakSwitch
