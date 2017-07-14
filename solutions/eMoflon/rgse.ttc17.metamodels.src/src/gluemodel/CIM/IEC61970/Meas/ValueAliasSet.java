/**
 */
package gluemodel.CIM.IEC61970.Meas;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Alias Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.ValueAliasSet#getValues <em>Values</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.ValueAliasSet#getCommands <em>Commands</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.ValueAliasSet#getDiscretes <em>Discretes</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getValueAliasSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Describes the translation of a set of values into a name and is intendend to facilitate cusom translations. Each ValueAliasSet has a name, description etc. A specific Measurement may represent a discrete state like Open, Closed, Intermediate etc. This requires a translation from the MeasurementValue.value number to a string, e.g. 0->\"Invalid\", 1->\"Open\", 2->\"Closed\", 3->\"Intermediate\". Each ValueToAlias member in ValueAliasSet.Value describe a mapping for one particular value to a name.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Describes the translation of a set of values into a name and is intendend to facilitate cusom translations. Each ValueAliasSet has a name, description etc. A specific Measurement may represent a discrete state like Open, Closed, Intermediate etc. This requires a translation from the MeasurementValue.value number to a string, e.g. 0->\"Invalid\", 1->\"Open\", 2->\"Closed\", 3->\"Intermediate\". Each ValueToAlias member in ValueAliasSet.Value describe a mapping for one particular value to a name.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Describes the translation of a set of values into a name and is intendend to facilitate cusom translations. Each ValueAliasSet has a name, description etc. A specific Measurement may represent a discrete state like Open, Closed, Intermediate etc. This requires a translation from the MeasurementValue.value number to a string, e.g. 0->\"Invalid\", 1->\"Open\", 2->\"Closed\", 3->\"Intermediate\". Each ValueToAlias member in ValueAliasSet.Value describe a mapping for one particular value to a name.' Profile\040documentation='Describes the translation of a set of values into a name and is intendend to facilitate cusom translations. Each ValueAliasSet has a name, description etc. A specific Measurement may represent a discrete state like Open, Closed, Intermediate etc. This requires a translation from the MeasurementValue.value number to a string, e.g. 0->\"Invalid\", 1->\"Open\", 2->\"Closed\", 3->\"Intermediate\". Each ValueToAlias member in ValueAliasSet.Value describe a mapping for one particular value to a name.'"
 * @generated
 */
public interface ValueAliasSet extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.ValueToAlias}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.ValueToAlias#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getValueAliasSet_Values()
	 * @see gluemodel.CIM.IEC61970.Meas.ValueToAlias#getValueAliasSet
	 * @model opposite="ValueAliasSet"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ValueToAlias mappings included in the set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ValueToAlias mappings included in the set'"
	 * @generated
	 */
	EList<ValueToAlias> getValues();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.Command}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Command#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getValueAliasSet_Commands()
	 * @see gluemodel.CIM.IEC61970.Meas.Command#getValueAliasSet
	 * @model opposite="ValueAliasSet"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ValueAliasSet used for translation of a Control value to a name.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ValueAliasSet used for translation of a Control value to a name.'"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Discretes</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.Discrete}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Discrete#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discretes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discretes</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getValueAliasSet_Discretes()
	 * @see gluemodel.CIM.IEC61970.Meas.Discrete#getValueAliasSet
	 * @model opposite="ValueAliasSet"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Measurements using the set for translation'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Measurements using the set for translation'"
	 * @generated
	 */
	EList<Discrete> getDiscretes();

} // ValueAliasSet
