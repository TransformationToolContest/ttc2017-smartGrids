/**
 */
package gluemodel.CIM.IEC61968.Common;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PostalAddress#getTownDetail <em>Town Detail</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PostalAddress#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PostalAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PostalAddress#getPoBox <em>Po Box</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPostalAddress()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='General purpose postal address information.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='General purpose postal address information.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='General purpose postal address information.' Profile\040documentation='General purpose postal address information.'"
 * @generated
 */
public interface PostalAddress extends Element {
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
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPostalAddress_TownDetail()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Town detail.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Town detail.'"
	 * @generated
	 */
	TownDetail getTownDetail();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PostalAddress#getTownDetail <em>Town Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Town Detail</em>' reference.
	 * @see #getTownDetail()
	 * @generated
	 */
	void setTownDetail(TownDetail value);

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
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPostalAddress_StreetDetail()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Street detail.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Street detail.'"
	 * @generated
	 */
	StreetDetail getStreetDetail();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PostalAddress#getStreetDetail <em>Street Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Detail</em>' reference.
	 * @see #getStreetDetail()
	 * @generated
	 */
	void setStreetDetail(StreetDetail value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPostalAddress_PostalCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Postal code for the address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Postal code for the address.'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Po Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Po Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Po Box</em>' attribute.
	 * @see #setPoBox(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPostalAddress_PoBox()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Post office box.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Post office box.'"
	 * @generated
	 */
	String getPoBox();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PostalAddress#getPoBox <em>Po Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Po Box</em>' attribute.
	 * @see #getPoBox()
	 * @generated
	 */
	void setPoBox(String value);

} // PostalAddress
