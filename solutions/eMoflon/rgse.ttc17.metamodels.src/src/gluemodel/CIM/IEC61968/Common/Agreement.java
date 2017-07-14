/**
 */
package gluemodel.CIM.IEC61968.Common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.Agreement#getSignDate <em>Sign Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.Agreement#getValidityInterval <em>Validity Interval</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getAgreement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Formal agreement between two parties defining the terms and conditions for a set of services. The specifics of the services are, in turn, defined via one or more service agreements.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Formal agreement between two parties defining the terms and conditions for a set of services. The specifics of the services are, in turn, defined via one or more service agreements.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Formal agreement between two parties defining the terms and conditions for a set of services. The specifics of the services are, in turn, defined via one or more service agreements.' Profile\040documentation='Formal agreement between two parties defining the terms and conditions for a set of services. The specifics of the services are, in turn, defined via one or more service agreements.'"
 * @generated
 */
public interface Agreement extends Document {
	/**
	 * Returns the value of the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Date</em>' attribute.
	 * @see #setSignDate(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getAgreement_SignDate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date this agreement was consummated among associated persons and/or organisations.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date this agreement was consummated among associated persons and/or organisations.'"
	 * @generated
	 */
	String getSignDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.Agreement#getSignDate <em>Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Date</em>' attribute.
	 * @see #getSignDate()
	 * @generated
	 */
	void setSignDate(String value);

	/**
	 * Returns the value of the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Interval</em>' reference.
	 * @see #setValidityInterval(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getAgreement_ValidityInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time interval this agreement is valid (from going into effect to termination).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time interval this agreement is valid (from going into effect to termination).'"
	 * @generated
	 */
	DateTimeInterval getValidityInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.Agreement#getValidityInterval <em>Validity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Interval</em>' reference.
	 * @see #getValidityInterval()
	 * @generated
	 */
	void setValidityInterval(DateTimeInterval value);

} // Agreement
