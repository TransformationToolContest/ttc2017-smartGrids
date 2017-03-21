/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.Core.ConductingEquipment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Winding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getG0 <em>G0</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getTo_WindingTest <em>To Winding Test</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getRground <em>Rground</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#isGrounded <em>Grounded</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getShortTermS <em>Short Term S</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getG <em>G</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getB <em>B</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getX <em>X</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getR <em>R</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getB0 <em>B0</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getWindingType <em>Winding Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getFrom_WindingTest <em>From Winding Test</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getInsulationU <em>Insulation U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getEmergencyS <em>Emergency S</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TransformerWinding#getXground <em>Xground</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A winding is associated with each defined terminal of a transformer (or phase shifter).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A winding is associated with each defined terminal of a transformer (or phase shifter).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A winding is associated with each defined terminal of a transformer (or phase shifter).' Profile\040documentation='A winding is associated with each defined terminal of a transformer (or phase shifter).'"
 * @generated
 */
public interface TransformerWinding extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0</em>' attribute.
	 * @see #setG0(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_G0()
	 * @model dataType="CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence magnetizing branch conductance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence magnetizing branch conductance.'"
	 * @generated
	 */
	float getG0();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0</em>' attribute.
	 * @see #getG0()
	 * @generated
	 */
	void setG0(float value);

	/**
	 * Returns the value of the '<em><b>To Winding Test</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.WindingTest}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.WindingTest#getTo_TransformerWinding <em>To Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Winding Test</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Winding Test</em>' reference list.
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_To_WindingTest()
	 * @see CIM.IEC61970.Wires.WindingTest#getTo_TransformerWinding
	 * @model opposite="To_TransformerWinding"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The winding winding tests for which the transformer winding (terminal) participates as the \"to\" end of the test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The winding winding tests for which the transformer winding (terminal) participates as the \"to\" end of the test.'"
	 * @generated
	 */
	EList<WindingTest> getTo_WindingTest();

	/**
	 * Returns the value of the '<em><b>Rground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rground</em>' attribute.
	 * @see #setRground(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_Rground()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ground resistance path through connected grounding transformer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ground resistance path through connected grounding transformer.'"
	 * @generated
	 */
	float getRground();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getRground <em>Rground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rground</em>' attribute.
	 * @see #getRground()
	 * @generated
	 */
	void setRground(float value);

	/**
	 * Returns the value of the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded</em>' attribute.
	 * @see #setGrounded(boolean)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_Grounded()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set if the winding is grounded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set if the winding is grounded.'"
	 * @generated
	 */
	boolean isGrounded();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#isGrounded <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grounded</em>' attribute.
	 * @see #isGrounded()
	 * @generated
	 */
	void setGrounded(boolean value);

	/**
	 * Returns the value of the '<em><b>Short Term S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Term S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Term S</em>' attribute.
	 * @see #setShortTermS(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_ShortTermS()
	 * @model dataType="CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Apparent power that the winding can carry for a short period of time.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Apparent power that the winding can carry for a short period of time.'"
	 * @generated
	 */
	float getShortTermS();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getShortTermS <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Term S</em>' attribute.
	 * @see #getShortTermS()
	 * @generated
	 */
	void setShortTermS(float value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #setG(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_G()
	 * @model dataType="CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Magnetizing branch conductance (G mag).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Magnetizing branch conductance (G mag).'"
	 * @generated
	 */
	float getG();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #getG()
	 * @generated
	 */
	void setG(float value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_B()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Magnetizing branch susceptance (B mag).  The value can be positive or negative.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Magnetizing branch susceptance (B mag).  The value can be positive or negative.'"
	 * @generated
	 */
	float getB();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(float value);

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
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_X()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series reactance of the winding.  For a two winding transformer, the full reactance of the transformer should be entered on the primary (high voltage) winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series reactance of the winding.  For a two winding transformer, the full reactance of the transformer should be entered on the primary (high voltage) winding.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Phase Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.PhaseTapChanger#getTransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Tap Changer</em>' reference.
	 * @see #setPhaseTapChanger(PhaseTapChanger)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_PhaseTapChanger()
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getTransformerWinding
	 * @model opposite="TransformerWinding"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The phase tap changer associated with the transformer winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The phase tap changer associated with the transformer winding.'"
	 * @generated
	 */
	PhaseTapChanger getPhaseTapChanger();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Tap Changer</em>' reference.
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	void setPhaseTapChanger(PhaseTapChanger value);

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
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_R()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series resistance of the winding.  For a two winding transformer, the full resistance of the transformer should be entered on the primary (high voltage) winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series resistance of the winding.  For a two winding transformer, the full resistance of the transformer should be entered on the primary (high voltage) winding.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

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
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_R0()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series resistance of the winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series resistance of the winding.'"
	 * @generated
	 */
	float getR0();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #getR0()
	 * @generated
	 */
	void setR0(float value);

	/**
	 * Returns the value of the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0</em>' attribute.
	 * @see #setB0(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_B0()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence magnetizing branch susceptance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence magnetizing branch susceptance.'"
	 * @generated
	 */
	float getB0();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0</em>' attribute.
	 * @see #getB0()
	 * @generated
	 */
	void setB0(float value);

	/**
	 * Returns the value of the '<em><b>Power Transformer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.PowerTransformer#getTransformerWindings <em>Transformer Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transformer</em>' reference.
	 * @see #setPowerTransformer(PowerTransformer)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_PowerTransformer()
	 * @see CIM.IEC61970.Wires.PowerTransformer#getTransformerWindings
	 * @model opposite="TransformerWindings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transformer has windings'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transformer has windings'"
	 * @generated
	 */
	PowerTransformer getPowerTransformer();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getPowerTransformer <em>Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Transformer</em>' reference.
	 * @see #getPowerTransformer()
	 * @generated
	 */
	void setPowerTransformer(PowerTransformer value);

	/**
	 * Returns the value of the '<em><b>Winding Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Wires.WindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Type</em>' attribute.
	 * @see CIM.IEC61970.Wires.WindingType
	 * @see #setWindingType(WindingType)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_WindingType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of winding.'"
	 * @generated
	 */
	WindingType getWindingType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getWindingType <em>Winding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding Type</em>' attribute.
	 * @see CIM.IEC61970.Wires.WindingType
	 * @see #getWindingType()
	 * @generated
	 */
	void setWindingType(WindingType value);

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
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_X0()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series reactance of the winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series reactance of the winding.'"
	 * @generated
	 */
	float getX0();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(float value);

	/**
	 * Returns the value of the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated S</em>' attribute.
	 * @see #setRatedS(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_RatedS()
	 * @model dataType="CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The normal apparent power rating for the winding'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The normal apparent power rating for the winding'"
	 * @generated
	 */
	float getRatedS();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getRatedS <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated S</em>' attribute.
	 * @see #getRatedS()
	 * @generated
	 */
	void setRatedS(float value);

	/**
	 * Returns the value of the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated U</em>' attribute.
	 * @see #setRatedU(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_RatedU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The rated voltage (phase-to-phase) of the winding, usually the same as the neutral voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The rated voltage (phase-to-phase) of the winding, usually the same as the neutral voltage.'"
	 * @generated
	 */
	float getRatedU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated U</em>' attribute.
	 * @see #getRatedU()
	 * @generated
	 */
	void setRatedU(float value);

	/**
	 * Returns the value of the '<em><b>From Winding Test</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.WindingTest}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.WindingTest#getFrom_TransformerWinding <em>From Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Winding Test</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Winding Test</em>' reference list.
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_From_WindingTest()
	 * @see CIM.IEC61970.Wires.WindingTest#getFrom_TransformerWinding
	 * @model opposite="From_TransformerWinding"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The transformer winding tests for which the transformer winding (terminal) participates as the \"from\" part of the test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The transformer winding tests for which the transformer winding (terminal) participates as the \"from\" part of the test.'"
	 * @generated
	 */
	EList<WindingTest> getFrom_WindingTest();

	/**
	 * Returns the value of the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.RatioTapChanger#getTransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Tap Changer</em>' reference.
	 * @see #setRatioTapChanger(RatioTapChanger)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_RatioTapChanger()
	 * @see CIM.IEC61970.Wires.RatioTapChanger#getTransformerWinding
	 * @model opposite="TransformerWinding"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ratio tap changer associated with the transformer winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ratio tap changer associated with the transformer winding.'"
	 * @generated
	 */
	RatioTapChanger getRatioTapChanger();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Tap Changer</em>' reference.
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	void setRatioTapChanger(RatioTapChanger value);

	/**
	 * Returns the value of the '<em><b>Insulation U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation U</em>' attribute.
	 * @see #setInsulationU(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_InsulationU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Basic insulation level voltage rating'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Basic insulation level voltage rating'"
	 * @generated
	 */
	float getInsulationU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getInsulationU <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation U</em>' attribute.
	 * @see #getInsulationU()
	 * @generated
	 */
	void setInsulationU(float value);

	/**
	 * Returns the value of the '<em><b>Emergency S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emergency S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency S</em>' attribute.
	 * @see #setEmergencyS(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_EmergencyS()
	 * @model dataType="CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The apparent power that the winding can carry  under emergency conditions.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The apparent power that the winding can carry  under emergency conditions.'"
	 * @generated
	 */
	float getEmergencyS();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getEmergencyS <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency S</em>' attribute.
	 * @see #getEmergencyS()
	 * @generated
	 */
	void setEmergencyS(float value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Wires.WindingConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see CIM.IEC61970.Wires.WindingConnection
	 * @see #setConnectionType(WindingConnection)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_ConnectionType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of connection of the winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of connection of the winding.'"
	 * @generated
	 */
	WindingConnection getConnectionType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see CIM.IEC61970.Wires.WindingConnection
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(WindingConnection value);

	/**
	 * Returns the value of the '<em><b>Xground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xground</em>' attribute.
	 * @see #setXground(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTransformerWinding_Xground()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ground reactance path through connected grounding transformer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ground reactance path through connected grounding transformer.'"
	 * @generated
	 */
	float getXground();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TransformerWinding#getXground <em>Xground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xground</em>' attribute.
	 * @see #getXground()
	 * @generated
	 */
	void setXground(float value);

} // TransformerWinding
