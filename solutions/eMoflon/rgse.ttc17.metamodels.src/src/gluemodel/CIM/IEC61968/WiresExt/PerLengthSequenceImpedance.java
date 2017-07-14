/**
 */
package gluemodel.CIM.IEC61968.WiresExt;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Per Length Sequence Impedance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getX0 <em>X0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getBch <em>Bch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getConductorSegments <em>Conductor Segments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getX <em>X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getGch <em>Gch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getB0ch <em>B0ch</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sequence impedance and admittance parameters per unit length, for transposed lines of 1, 2, or 3 phases. For 1-phase lines, define x=x0=xself. For 2-phase lines, define x=xs-xm and x0=xs+xm.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Sequence impedance and admittance parameters per unit length, for transposed lines of 1, 2, or 3 phases. For 1-phase lines, define x=x0=xself. For 2-phase lines, define x=xs-xm and x0=xs+xm.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sequence impedance and admittance parameters per unit length, for transposed lines of 1, 2, or 3 phases. For 1-phase lines, define x=x0=xself. For 2-phase lines, define x=xs-xm and x0=xs+xm.' Profile\040documentation='Sequence impedance and admittance parameters per unit length, for transposed lines of 1, 2, or 3 phases. For 1-phase lines, define x=x0=xself. For 2-phase lines, define x=xs-xm and x0=xs+xm.'"
 * @generated
 */
public interface PerLengthSequenceImpedance extends IdentifiedObject {
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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance_X0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series reactance, per unit of length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series reactance, per unit of length.'"
	 * @generated
	 */
	float getX0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getX0 <em>X0</em>}' attribute.
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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance_Bch()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence shunt (charging) susceptance, per unit of length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt (charging) susceptance, per unit of length.'"
	 * @generated
	 */
	float getBch();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getBch <em>Bch</em>}' attribute.
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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance_R0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series resistance, per unit of length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series resistance, per unit of length.'"
	 * @generated
	 */
	float getR0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #getR0()
	 * @generated
	 */
	void setR0(float value);

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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance_G0ch()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence shunt (charging) conductance, per unit of length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence shunt (charging) conductance, per unit of length.'"
	 * @generated
	 */
	float getG0ch();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getG0ch <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0ch</em>' attribute.
	 * @see #getG0ch()
	 * @generated
	 */
	void setG0ch(float value);

	/**
	 * Returns the value of the '<em><b>Conductor Segments</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getSequenceImpedance <em>Sequence Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Segments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Segments</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance_ConductorSegments()
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getSequenceImpedance
	 * @model opposite="SequenceImpedance"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All conductor segments described by this sequence impedance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All conductor segments described by this sequence impedance.'"
	 * @generated
	 */
	EList<DistributionLineSegment> getConductorSegments();

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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance_R()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series resistance, per unit of length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series resistance, per unit of length.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance_X()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series reactance, per unit of length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series reactance, per unit of length.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getX <em>X</em>}' attribute.
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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance_Gch()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence shunt (charging) conductance, per unit of length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt (charging) conductance, per unit of length.'"
	 * @generated
	 */
	float getGch();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getGch <em>Gch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gch</em>' attribute.
	 * @see #getGch()
	 * @generated
	 */
	void setGch(float value);

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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthSequenceImpedance_B0ch()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence shunt (charging) susceptance, per unit of length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence shunt (charging) susceptance, per unit of length.'"
	 * @generated
	 */
	float getB0ch();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getB0ch <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0ch</em>' attribute.
	 * @see #getB0ch()
	 * @generated
	 */
	void setB0ch(float value);

} // PerLengthSequenceImpedance
