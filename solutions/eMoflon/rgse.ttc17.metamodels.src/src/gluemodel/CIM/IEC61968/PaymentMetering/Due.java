/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Due</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getInterest <em>Interest</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getPrinciple <em>Principle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getCurrent <em>Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getArrears <em>Arrears</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getCharges <em>Charges</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getDue()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details on amounts due for an account.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Details on amounts due for an account.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details on amounts due for an account.' Profile\040documentation='Details on amounts due for an account.'"
 * @generated
 */
public interface Due extends Element {
	/**
	 * Returns the value of the '<em><b>Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interest</em>' attribute.
	 * @see #setInterest(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getDue_Interest()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Part of \'current\' that constitutes the interest portion.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Part of \'current\' that constitutes the interest portion.'"
	 * @generated
	 */
	float getInterest();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getInterest <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interest</em>' attribute.
	 * @see #getInterest()
	 * @generated
	 */
	void setInterest(float value);

	/**
	 * Returns the value of the '<em><b>Principle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principle</em>' attribute.
	 * @see #setPrinciple(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getDue_Principle()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Part of \'current\' that constitutes the portion of the principle amount currently due.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Part of \'current\' that constitutes the portion of the principle amount currently due.'"
	 * @generated
	 */
	float getPrinciple();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getPrinciple <em>Principle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principle</em>' attribute.
	 * @see #getPrinciple()
	 * @generated
	 */
	void setPrinciple(float value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getDue_Current()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current total amount now due: current = principle + arrears + interest + charges. Typically the rule for settlement priority is: interest dues, then arrears dues, then current dues, then charge dues.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current total amount now due: current = principle + arrears + interest + charges. Typically the rule for settlement priority is: interest dues, then arrears dues, then current dues, then charge dues.'"
	 * @generated
	 */
	float getCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Arrears</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrears</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrears</em>' attribute.
	 * @see #setArrears(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getDue_Arrears()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Part of \'current\' that constitutes the arrears portion.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Part of \'current\' that constitutes the arrears portion.'"
	 * @generated
	 */
	float getArrears();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getArrears <em>Arrears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrears</em>' attribute.
	 * @see #getArrears()
	 * @generated
	 */
	void setArrears(float value);

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' attribute.
	 * @see #setCharges(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getDue_Charges()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Part of \'current\' that constitutes the charge portion: \'charges\' = \'Charge.fixedPortion\' + \'Charge.variablePortion\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Part of \'current\' that constitutes the charge portion: \'charges\' = \'Charge.fixedPortion\' + \'Charge.variablePortion\'.'"
	 * @generated
	 */
	float getCharges();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Due#getCharges <em>Charges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charges</em>' attribute.
	 * @see #getCharges()
	 * @generated
	 */
	void setCharges(float value);

} // Due
