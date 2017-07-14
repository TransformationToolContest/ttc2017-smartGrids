/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Ratio#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Ratio#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getRatio()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fraction specified explicitly with a numerator and denominator, which can be used to calculate the quotient.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Fraction specified explicitly with a numerator and denominator, which can be used to calculate the quotient.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fraction specified explicitly with a numerator and denominator, which can be used to calculate the quotient.' Profile\040documentation='Fraction specified explicitly with a numerator and denominator, which can be used to calculate the quotient.'"
 * @generated
 */
public interface Ratio extends Element {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' attribute.
	 * @see #setNumerator(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getRatio_Numerator()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The part of a fraction that is above the line and signifies the number to be divided by the denominator.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The part of a fraction that is above the line and signifies the number to be divided by the denominator.'"
	 * @generated
	 */
	float getNumerator();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Ratio#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' attribute.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(float value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' attribute.
	 * @see #setDenominator(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getRatio_Denominator()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The part of a fraction that is below the line and that functions as the divisor of the numerator.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The part of a fraction that is below the line and that functions as the divisor of the numerator.'"
	 * @generated
	 */
	float getDenominator();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Ratio#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' attribute.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(float value);

} // Ratio
