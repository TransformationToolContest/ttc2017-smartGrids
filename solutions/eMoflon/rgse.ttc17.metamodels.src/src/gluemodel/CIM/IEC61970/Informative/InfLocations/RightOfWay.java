/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLocations;

import gluemodel.CIM.IEC61968.Common.Agreement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Of Way</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay#getPropertyData <em>Property Data</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay#getLandProperties <em>Land Properties</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRightOfWay()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A right-of-way (ROW) is for land where it is lawful to use for a public road, an electric power line, etc. Note that the association to Location, Asset, Organisation, etc. for the Grant is inherited from Agreement, a type of Document.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A right-of-way (ROW) is for land where it is lawful to use for a public road, an electric power line, etc. Note that the association to Location, Asset, Organisation, etc. for the Grant is inherited from Agreement, a type of Document.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A right-of-way (ROW) is for land where it is lawful to use for a public road, an electric power line, etc. Note that the association to Location, Asset, Organisation, etc. for the Grant is inherited from Agreement, a type of Document.' Profile\040documentation='A right-of-way (ROW) is for land where it is lawful to use for a public road, an electric power line, etc. Note that the association to Location, Asset, Organisation, etc. for the Grant is inherited from Agreement, a type of Document.'"
 * @generated
 */
public interface RightOfWay extends Agreement {
	/**
	 * Returns the value of the '<em><b>Property Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Data</em>' attribute.
	 * @see #setPropertyData(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRightOfWay_PropertyData()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Property related information that describes the ROW\'s land parcel. For example, it may be a deed book number, deed book page number, and parcel number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Property related information that describes the ROW\'s land parcel. For example, it may be a deed book number, deed book page number, and parcel number.'"
	 * @generated
	 */
	String getPropertyData();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay#getPropertyData <em>Property Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Data</em>' attribute.
	 * @see #getPropertyData()
	 * @generated
	 */
	void setPropertyData(String value);

	/**
	 * Returns the value of the '<em><b>Land Properties</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getRightOfWays <em>Right Of Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Properties</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRightOfWay_LandProperties()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getRightOfWays
	 * @model opposite="RightOfWays"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All land properties this right of way applies to.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All land properties this right of way applies to.'"
	 * @generated
	 */
	EList<LandProperty> getLandProperties();

} // RightOfWay
