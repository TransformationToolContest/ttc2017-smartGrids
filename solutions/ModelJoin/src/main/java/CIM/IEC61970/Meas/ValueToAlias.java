/**
 */
package CIM.IEC61970.Meas;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value To Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.ValueToAlias#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.ValueToAlias#getValueAliasSet <em>Value Alias Set</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getValueToAlias()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Describes the translation of one particular value into a name, e.g. 1->\"Open\"'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Describes the translation of one particular value into a name, e.g. 1->\"Open\"'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Describes the translation of one particular value into a name, e.g. 1->\"Open\"' Profile\040documentation='Describes the translation of one particular value into a name, e.g. 1->\"Open\"'"
 * @generated
 */
public interface ValueToAlias extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see CIM.IEC61970.Meas.MeasPackage#getValueToAlias_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value that is mapped'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value that is mapped'"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.ValueToAlias#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Value Alias Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.ValueAliasSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Alias Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Alias Set</em>' reference.
	 * @see #setValueAliasSet(ValueAliasSet)
	 * @see CIM.IEC61970.Meas.MeasPackage#getValueToAlias_ValueAliasSet()
	 * @see CIM.IEC61970.Meas.ValueAliasSet#getValues
	 * @model opposite="Values"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ValueAliasSet having the ValueToAlias mappings'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ValueAliasSet having the ValueToAlias mappings'"
	 * @generated
	 */
	ValueAliasSet getValueAliasSet();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.ValueToAlias#getValueAliasSet <em>Value Alias Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Alias Set</em>' reference.
	 * @see #getValueAliasSet()
	 * @generated
	 */
	void setValueAliasSet(ValueAliasSet value);

} // ValueToAlias
