/**
 */
package CIM.IEC61970.Wires;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.ACLineSegment#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ACLineSegment#getX <em>X</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ACLineSegment#getGch <em>Gch</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ACLineSegment#getR <em>R</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ACLineSegment#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ACLineSegment#getBch <em>Bch</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ACLineSegment#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ACLineSegment#getB0ch <em>B0ch</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getACLineSegment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A wire or combination of wires, with consistent electrical characteristics, building a single electrical system, used to carry alternating current between points in the power system.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A wire or combination of wires, with consistent electrical characteristics, building a single electrical system, used to carry alternating current between points in the power system.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A wire or combination of wires, with consistent electrical characteristics, building a single electrical system, used to carry alternating current between points in the power system.' Profile\040documentation='A wire or combination of wires, with consistent electrical characteristics, building a single electrical system, used to carry alternating current between points in the power system.'"
 * @generated
 */
public interface ACLineSegment extends Conductor {
	/**
	 * Returns the value of the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0ch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0ch</em>' attribute.
	 * @see #setG0ch(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getACLineSegment_G0ch()
	 * @model dataType="CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence shunt (charging) conductance, uniformly distributed, of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence shunt (charging) conductance, uniformly distributed, of the entire line section.'"
	 * @generated
	 */
	float getG0ch();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ACLineSegment#getG0ch <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0ch</em>' attribute.
	 * @see #getG0ch()
	 * @generated
	 */
	void setG0ch(float value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getACLineSegment_X()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series reactance of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series reactance of the entire line section.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ACLineSegment#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Gch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gch</em>' attribute.
	 * @see #setGch(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getACLineSegment_Gch()
	 * @model dataType="CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence shunt (charging) conductance, uniformly distributed, of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt (charging) conductance, uniformly distributed, of the entire line section.'"
	 * @generated
	 */
	float getGch();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ACLineSegment#getGch <em>Gch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gch</em>' attribute.
	 * @see #getGch()
	 * @generated
	 */
	void setGch(float value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getACLineSegment_R()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series resistance of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series resistance of the entire line section.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ACLineSegment#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

	/**
	 * Returns the value of the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0</em>' attribute.
	 * @see #setX0(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getACLineSegment_X0()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series reactance of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series reactance of the entire line section.'"
	 * @generated
	 */
	float getX0();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ACLineSegment#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(float value);

	/**
	 * Returns the value of the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bch</em>' attribute.
	 * @see #setBch(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getACLineSegment_Bch()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.  This value represents the full charging over the full length of the line.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.  This value represents the full charging over the full length of the line.'"
	 * @generated
	 */
	float getBch();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ACLineSegment#getBch <em>Bch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bch</em>' attribute.
	 * @see #getBch()
	 * @generated
	 */
	void setBch(float value);

	/**
	 * Returns the value of the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0</em>' attribute.
	 * @see #setR0(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getACLineSegment_R0()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series resistance of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series resistance of the entire line section.'"
	 * @generated
	 */
	float getR0();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ACLineSegment#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #getR0()
	 * @generated
	 */
	void setR0(float value);

	/**
	 * Returns the value of the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0ch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0ch</em>' attribute.
	 * @see #setB0ch(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getACLineSegment_B0ch()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.'"
	 * @generated
	 */
	float getB0ch();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ACLineSegment#getB0ch <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0ch</em>' attribute.
	 * @see #getB0ch()
	 * @generated
	 */
	void setB0ch(float value);

} // ACLineSegment
