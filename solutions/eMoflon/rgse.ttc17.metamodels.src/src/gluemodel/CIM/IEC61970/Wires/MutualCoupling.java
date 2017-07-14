/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.Terminal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mutual Coupling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getDistance11 <em>Distance11</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getDistance12 <em>Distance12</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getX0 <em>X0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getDistance22 <em>Distance22</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getDistance21 <em>Distance21</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This class represents the zero sequence line mutual coupling.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This class represents the zero sequence line mutual coupling.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This class represents the zero sequence line mutual coupling.' Profile\040documentation='This class represents the zero sequence line mutual coupling.'"
 * @generated
 */
public interface MutualCoupling extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Distance11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance11</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance11</em>' attribute.
	 * @see #setDistance11(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_Distance11()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Distance from the first line\'s specified terminal to start of coupled region'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Distance from the first line\'s specified terminal to start of coupled region'"
	 * @generated
	 */
	float getDistance11();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance11</em>' attribute.
	 * @see #getDistance11()
	 * @generated
	 */
	void setDistance11(float value);

	/**
	 * Returns the value of the '<em><b>Distance12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance12</em>' attribute.
	 * @see #setDistance12(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_Distance12()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Distance from the first line\'s from specified terminal to end of coupled region'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Distance from the first line\'s from specified terminal to end of coupled region'"
	 * @generated
	 */
	float getDistance12();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance12</em>' attribute.
	 * @see #getDistance12()
	 * @generated
	 */
	void setDistance12(float value);

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
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_B0ch()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence mutual coupling shunt (charging) susceptance, uniformly distributed, of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence mutual coupling shunt (charging) susceptance, uniformly distributed, of the entire line section.'"
	 * @generated
	 */
	float getB0ch();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getB0ch <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0ch</em>' attribute.
	 * @see #getB0ch()
	 * @generated
	 */
	void setB0ch(float value);

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
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_G0ch()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence mutual coupling shunt (charging) conductance, uniformly distributed, of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence mutual coupling shunt (charging) conductance, uniformly distributed, of the entire line section.'"
	 * @generated
	 */
	float getG0ch();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getG0ch <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0ch</em>' attribute.
	 * @see #getG0ch()
	 * @generated
	 */
	void setG0ch(float value);

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
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_X0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence branch-to-branch mutual impedance coupling, reactance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence branch-to-branch mutual impedance coupling, reactance'"
	 * @generated
	 */
	float getX0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(float value);

	/**
	 * Returns the value of the '<em><b>Second Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Terminal#getHasSecond_MutualCoupling <em>Has Second Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Terminal</em>' reference.
	 * @see #setSecond_Terminal(Terminal)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_Second_Terminal()
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getHasSecond_MutualCoupling
	 * @model opposite="HasSecond_MutualCoupling"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The starting terminal for the calculation of distances along the second branch of the mutual coupling.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The starting terminal for the calculation of distances along the second branch of the mutual coupling.'"
	 * @generated
	 */
	Terminal getSecond_Terminal();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Terminal</em>' reference.
	 * @see #getSecond_Terminal()
	 * @generated
	 */
	void setSecond_Terminal(Terminal value);

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
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_R0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence branch-to-branch mutual impedance coupling, resistance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence branch-to-branch mutual impedance coupling, resistance'"
	 * @generated
	 */
	float getR0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #getR0()
	 * @generated
	 */
	void setR0(float value);

	/**
	 * Returns the value of the '<em><b>First Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Terminal#getHasFirst_MutualCoupling <em>Has First Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Terminal</em>' reference.
	 * @see #setFirst_Terminal(Terminal)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_First_Terminal()
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getHasFirst_MutualCoupling
	 * @model opposite="HasFirst_MutualCoupling"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The starting terminal for the calculation of distances along the first branch of the mutual coupling.  Normally MutualCoupling would only be used for terminals of AC line segments.  The first and second terminals of a mutual coupling should point to different AC line segments.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The starting terminal for the calculation of distances along the first branch of the mutual coupling.  Normally MutualCoupling would only be used for terminals of AC line segments.  The first and second terminals of a mutual coupling should point to different AC line segments.'"
	 * @generated
	 */
	Terminal getFirst_Terminal();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Terminal</em>' reference.
	 * @see #getFirst_Terminal()
	 * @generated
	 */
	void setFirst_Terminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Distance22</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance22</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance22</em>' attribute.
	 * @see #setDistance22(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_Distance22()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Distance from the second line\'s specified terminal to end of coupled region'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Distance from the second line\'s specified terminal to end of coupled region'"
	 * @generated
	 */
	float getDistance22();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance22</em>' attribute.
	 * @see #getDistance22()
	 * @generated
	 */
	void setDistance22(float value);

	/**
	 * Returns the value of the '<em><b>Distance21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance21</em>' attribute.
	 * @see #setDistance21(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getMutualCoupling_Distance21()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Distance from the second line\'s specified terminal to start of coupled region'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Distance from the second line\'s specified terminal to start of coupled region'"
	 * @generated
	 */
	float getDistance21();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance21</em>' attribute.
	 * @see #getDistance21()
	 * @generated
	 */
	void setDistance21(float value);

} // MutualCoupling
