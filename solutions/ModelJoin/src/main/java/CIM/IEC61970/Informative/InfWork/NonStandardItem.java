/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Standard Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.NonStandardItem#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.NonStandardItem#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getNonStandardItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This document provides information for non-standard items like customer contributions (e.g., customer digs trench), vouchers (e.g., credit), and contractor bids.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This document provides information for non-standard items like customer contributions (e.g., customer digs trench), vouchers (e.g., credit), and contractor bids.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This document provides information for non-standard items like customer contributions (e.g., customer digs trench), vouchers (e.g., credit), and contractor bids.' Profile\040documentation='This document provides information for non-standard items like customer contributions (e.g., customer digs trench), vouchers (e.g., credit), and contractor bids.'"
 * @generated
 */
public interface NonStandardItem extends Document {
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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getNonStandardItem_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The category of non-standard work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The category of non-standard work.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.NonStandardItem#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getNonStandardItem_Amount()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The projected cost for this item.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The projected cost for this item.'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.NonStandardItem#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

} // NonStandardItem
