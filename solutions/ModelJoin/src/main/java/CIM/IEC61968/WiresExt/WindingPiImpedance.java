/**
 */
package CIM.IEC61968.WiresExt;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Winding Pi Impedance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getX <em>X</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getR <em>R</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getG <em>G</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getB <em>B</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getWindings <em>Windings</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getG0 <em>G0</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getB0 <em>B0</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transformer Pi-model impedance that accurately reflects impedance for transformers with 2 or 3 windings. For transformers with 4 or more windings, you must use TransformerInfo.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Transformer Pi-model impedance that accurately reflects impedance for transformers with 2 or 3 windings. For transformers with 4 or more windings, you must use TransformerInfo.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transformer Pi-model impedance that accurately reflects impedance for transformers with 2 or 3 windings. For transformers with 4 or more windings, you must use TransformerInfo.' Profile\040documentation='Transformer Pi-model impedance that accurately reflects impedance for transformers with 2 or 3 windings. For transformers with 4 or more windings, you must use TransformerInfo.'"
 * @generated
 */
public interface WindingPiImpedance extends IdentifiedObject {
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
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance_X()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series reactance of the winding.  For a two winding transformer, the full reactance of the transformer should be entered on the primary (high voltage) winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series reactance of the winding.  For a two winding transformer, the full reactance of the transformer should be entered on the primary (high voltage) winding.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

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
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance_R()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='DC resistance of the winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='DC resistance of the winding.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

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
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance_G()
	 * @model dataType="CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Magnetizing branch conductance (G mag).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Magnetizing branch conductance (G mag).'"
	 * @generated
	 */
	float getG();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #getG()
	 * @generated
	 */
	void setG(float value);

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
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance_R0()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series resistance of the winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series resistance of the winding.'"
	 * @generated
	 */
	float getR0();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #getR0()
	 * @generated
	 */
	void setR0(float value);

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
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance_B()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Magnetizing branch susceptance (B mag).  The value can be positive or negative.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Magnetizing branch susceptance (B mag).  The value can be positive or negative.'"
	 * @generated
	 */
	float getB();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(float value);

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
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance_X0()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series reactance of the winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series reactance of the winding.'"
	 * @generated
	 */
	float getX0();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(float value);

	/**
	 * Returns the value of the '<em><b>Windings</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.WiresExt.DistributionTransformerWinding}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPiImpedance <em>Pi Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windings</em>' reference list.
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance_Windings()
	 * @see CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPiImpedance
	 * @model opposite="PiImpedance"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All windings having this Pi impedance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All windings having this Pi impedance.'"
	 * @generated
	 */
	EList<DistributionTransformerWinding> getWindings();

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
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance_G0()
	 * @model dataType="CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence magnetizing branch conductance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence magnetizing branch conductance.'"
	 * @generated
	 */
	float getG0();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0</em>' attribute.
	 * @see #getG0()
	 * @generated
	 */
	void setG0(float value);

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
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getWindingPiImpedance_B0()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence magnetizing branch susceptance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence magnetizing branch susceptance.'"
	 * @generated
	 */
	float getB0();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0</em>' attribute.
	 * @see #getB0()
	 * @generated
	 */
	void setB0(float value);

} // WindingPiImpedance
