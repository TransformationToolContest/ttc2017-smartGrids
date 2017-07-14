/**
 */
package gluemodel.CIM.IEC61968.Common;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Street Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.StreetAddress#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.StreetAddress#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.StreetAddress#getTownDetail <em>Town Detail</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getStreetAddress()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='General purpose street address information.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='General purpose street address information.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='General purpose street address information.' Profile\040documentation='General purpose street address information.'"
 * @generated
 */
public interface StreetAddress extends Element {
	/**
	 * Returns the value of the '<em><b>Street Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Detail</em>' reference.
	 * @see #setStreetDetail(StreetDetail)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getStreetAddress_StreetDetail()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Street detail.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Street detail.'"
	 * @generated
	 */
	StreetDetail getStreetDetail();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.StreetAddress#getStreetDetail <em>Street Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Detail</em>' reference.
	 * @see #getStreetDetail()
	 * @generated
	 */
	void setStreetDetail(StreetDetail value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getStreetAddress_Status()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of this address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of this address.'"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.StreetAddress#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Town Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Town Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Town Detail</em>' reference.
	 * @see #setTownDetail(TownDetail)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getStreetAddress_TownDetail()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Town detail.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Town detail.'"
	 * @generated
	 */
	TownDetail getTownDetail();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.StreetAddress#getTownDetail <em>Town Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Town Detail</em>' reference.
	 * @see #getTownDetail()
	 * @generated
	 */
	void setTownDetail(TownDetail value);

} // StreetAddress
