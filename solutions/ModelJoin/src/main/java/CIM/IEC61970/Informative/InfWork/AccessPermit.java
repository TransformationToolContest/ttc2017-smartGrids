/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Permit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber <em>Application Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getPermitID <em>Permit ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAccessPermit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A permit is sometimes needed to provide legal access to land or equipment. For example, local authority permission for road works.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A permit is sometimes needed to provide legal access to land or equipment. For example, local authority permission for road works.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A permit is sometimes needed to provide legal access to land or equipment. For example, local authority permission for road works.' Profile\040documentation='A permit is sometimes needed to provide legal access to land or equipment. For example, local authority permission for road works.'"
 * @generated
 */
public interface AccessPermit extends Document {
	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAccessPermit_ExpirationDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Permit expiration date.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Permit expiration date.'"
	 * @generated
	 */
	String getExpirationDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(String value);

	/**
	 * Returns the value of the '<em><b>Application Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Number</em>' attribute.
	 * @see #setApplicationNumber(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAccessPermit_ApplicationNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Permit application number that is used by municipality, state, province, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Permit application number that is used by municipality, state, province, etc.'"
	 * @generated
	 */
	String getApplicationNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber <em>Application Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Number</em>' attribute.
	 * @see #getApplicationNumber()
	 * @generated
	 */
	void setApplicationNumber(String value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAccessPermit_EffectiveDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date that permit became official.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date that permit became official.'"
	 * @generated
	 */
	String getEffectiveDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(String value);

	/**
	 * Returns the value of the '<em><b>Permit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permit ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permit ID</em>' attribute.
	 * @see #setPermitID(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAccessPermit_PermitID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Permit identifier.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Permit identifier.'"
	 * @generated
	 */
	String getPermitID();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getPermitID <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit ID</em>' attribute.
	 * @see #getPermitID()
	 * @generated
	 */
	void setPermitID(String value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' attribute.
	 * @see #setPayment(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAccessPermit_Payment()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total cost of permit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total cost of permit.'"
	 * @generated
	 */
	float getPayment();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getPayment <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' attribute.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(float value);

} // AccessPermit
