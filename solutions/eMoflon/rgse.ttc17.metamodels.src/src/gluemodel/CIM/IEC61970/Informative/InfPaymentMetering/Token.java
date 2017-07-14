/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering;

import gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token#getPointOfSale <em>Point Of Sale</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token#getComment <em>Comment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getToken()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The token that is transferred to the payment meter.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The token that is transferred to the payment meter.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The token that is transferred to the payment meter.' Profile\040documentation='The token that is transferred to the payment meter.'"
 * @generated
 */
public interface Token extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Point Of Sale</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Of Sale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of Sale</em>' reference.
	 * @see #setPointOfSale(PointOfSale)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getToken_PointOfSale()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getTokens
	 * @model opposite="Tokens"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='PointOfSale tha sold or dispensed this Token.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='PointOfSale tha sold or dispensed this Token.'"
	 * @generated
	 */
	PointOfSale getPointOfSale();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token#getPointOfSale <em>Point Of Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of Sale</em>' reference.
	 * @see #getPointOfSale()
	 * @generated
	 */
	void setPointOfSale(PointOfSale value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getToken_Comment()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Free-format note relevant to this token.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Free-format note relevant to this token.'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getToken_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coded representation of the token that is transferred to the payment meter.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coded representation of the token that is transferred to the payment meter.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Token
