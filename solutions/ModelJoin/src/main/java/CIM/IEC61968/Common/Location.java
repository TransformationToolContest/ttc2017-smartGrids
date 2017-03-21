/**
 */
package CIM.IEC61968.Common;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61970.Core.IdentifiedObject;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Informative.InfAssets.DimensionsInfo;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import CIM.IEC61970.Informative.InfLocations.Direction;
import CIM.IEC61970.Informative.InfLocations.Hazard;
import CIM.IEC61970.Informative.InfLocations.LandProperty;
import CIM.IEC61970.Informative.InfLocations.RedLine;
import CIM.IEC61970.Informative.InfLocations.Route;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;

import CIM.IEC61970.Informative.InfWork.Crew;

import CIM.IEC61970.Meas.Measurement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.Location#getSecondaryAddress <em>Secondary Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getDirections <em>Directions</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getLandProperties <em>Land Properties</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getGeoInfoReference <em>Geo Info Reference</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getDimensionsInfo <em>Dimensions Info</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getErpOrganisations <em>Erp Organisations</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getCoordinateSystems <em>Coordinate Systems</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getRoutes <em>Routes</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getHazards <em>Hazards</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getMainAddress <em>Main Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getRedLines <em>Red Lines</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getDirection <em>Direction</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Location#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Common.CommonPackage#getLocation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The place, scene, or point of something where someone or something has been, is, and/or will be at a given moment in time. It is defined with one or more postition points (coordinates) in a given coordinate system.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The place, scene, or point of something where someone or something has been, is, and/or will be at a given moment in time. It is defined with one or more postition points (coordinates) in a given coordinate system.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The place, scene, or point of something where someone or something has been, is, and/or will be at a given moment in time. It is defined with one or more postition points (coordinates) in a given coordinate system.' Profile\040documentation='The place, scene, or point of something where someone or something has been, is, and/or will be at a given moment in time. It is defined with one or more postition points (coordinates) in a given coordinate system.'"
 * @generated
 */
public interface Location extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Secondary Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Address</em>' reference.
	 * @see #setSecondaryAddress(StreetAddress)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_SecondaryAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Secondary address of the location. For example, PO Box address may have different ZIP code than that in the \'mainAddress\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Secondary address of the location. For example, PO Box address may have different ZIP code than that in the \'mainAddress\'.'"
	 * @generated
	 */
	StreetAddress getSecondaryAddress();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getSecondaryAddress <em>Secondary Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Address</em>' reference.
	 * @see #getSecondaryAddress()
	 * @generated
	 */
	void setSecondaryAddress(StreetAddress value);

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Measurement#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Measurements()
	 * @see CIM.IEC61970.Meas.Measurement#getLocations
	 * @model opposite="Locations"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Directions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfLocations.Direction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.Direction#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directions</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Directions()
	 * @see CIM.IEC61970.Informative.InfLocations.Direction#getLocation
	 * @model opposite="Location"
	 * @generated
	 */
	EList<Direction> getDirections();

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PowerSystemResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_PowerSystemResources()
	 * @see CIM.IEC61970.Core.PowerSystemResource#getLocation
	 * @model opposite="Location"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All power system resources at this location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All power system resources at this location.'"
	 * @generated
	 */
	EList<PowerSystemResource> getPowerSystemResources();

	/**
	 * Returns the value of the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone2</em>' reference.
	 * @see #setPhone2(TelephoneNumber)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Phone2()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Additional phone number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Additional phone number.'"
	 * @generated
	 */
	TelephoneNumber getPhone2();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getPhone2 <em>Phone2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone2</em>' reference.
	 * @see #getPhone2()
	 * @generated
	 */
	void setPhone2(TelephoneNumber value);

	/**
	 * Returns the value of the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone1</em>' reference.
	 * @see #setPhone1(TelephoneNumber)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Phone1()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phone number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phone number.'"
	 * @generated
	 */
	TelephoneNumber getPhone1();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getPhone1 <em>Phone1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone1</em>' reference.
	 * @see #getPhone1()
	 * @generated
	 */
	void setPhone1(TelephoneNumber value);

	/**
	 * Returns the value of the '<em><b>Land Properties</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfLocations.LandProperty}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.LandProperty#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Properties</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_LandProperties()
	 * @see CIM.IEC61970.Informative.InfLocations.LandProperty#getLocations
	 * @model opposite="Locations"
	 * @generated
	 */
	EList<LandProperty> getLandProperties();

	/**
	 * Returns the value of the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Info Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Info Reference</em>' attribute.
	 * @see #setGeoInfoReference(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_GeoInfoReference()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Reference to geographical information source, often external to the utility.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Reference to geographical information source, often external to the utility.'"
	 * @generated
	 */
	String getGeoInfoReference();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getGeoInfoReference <em>Geo Info Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Info Reference</em>' attribute.
	 * @see #getGeoInfoReference()
	 * @generated
	 */
	void setGeoInfoReference(String value);

	/**
	 * Returns the value of the '<em><b>Dimensions Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions Info</em>' reference.
	 * @see #setDimensionsInfo(DimensionsInfo)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_DimensionsInfo()
	 * @see CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations
	 * @model opposite="Locations"
	 * @generated
	 */
	DimensionsInfo getDimensionsInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getDimensionsInfo <em>Dimensions Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions Info</em>' reference.
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	void setDimensionsInfo(DimensionsInfo value);

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_ChangeItems()
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeItem#getLocation
	 * @model opposite="Location"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

	/**
	 * Returns the value of the '<em><b>Erp Organisations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisations</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_ErpOrganisations()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations
	 * @model opposite="Locations"
	 * @generated
	 */
	EList<ErpOrganisation> getErpOrganisations();

	/**
	 * Returns the value of the '<em><b>Coordinate Systems</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.CoordinateSystem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.CoordinateSystem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Systems</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_CoordinateSystems()
	 * @see CIM.IEC61968.Common.CoordinateSystem#getLocation
	 * @model opposite="Location"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All coordinate systems used to describe position points of this location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All coordinate systems used to describe position points of this location.'"
	 * @generated
	 */
	EList<CoordinateSystem> getCoordinateSystems();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Assets()
	 * @see CIM.IEC61968.Assets.Asset#getLocation
	 * @model opposite="Location"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All assets at this location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All assets at this location.'"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfLocations.Route}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.Route#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Routes()
	 * @see CIM.IEC61970.Informative.InfLocations.Route#getLocations
	 * @model opposite="Locations"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfLocations.Hazard}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.Hazard#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazards</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Hazards()
	 * @see CIM.IEC61970.Informative.InfLocations.Hazard#getLocations
	 * @model opposite="Locations"
	 * @generated
	 */
	EList<Hazard> getHazards();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category by utility\'s corporate standards and practices, relative to the location itself (e.g., geographical, functional accounting, etc., not a given property that happens to exist at that location).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category by utility\'s corporate standards and practices, relative to the location itself (e.g., geographical, functional accounting, etc., not a given property that happens to exist at that location).'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Main Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Address</em>' reference.
	 * @see #setMainAddress(StreetAddress)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_MainAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Main address of the location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Main address of the location.'"
	 * @generated
	 */
	StreetAddress getMainAddress();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getMainAddress <em>Main Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Address</em>' reference.
	 * @see #getMainAddress()
	 * @generated
	 */
	void setMainAddress(StreetAddress value);

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_ElectronicAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electronic address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electronic address.'"
	 * @generated
	 */
	ElectronicAddress getElectronicAddress();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getElectronicAddress <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	void setElectronicAddress(ElectronicAddress value);

	/**
	 * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Code</em>' attribute.
	 * @see #setCorporateCode(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_CorporateCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Utility-specific code for the location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Utility-specific code for the location.'"
	 * @generated
	 */
	String getCorporateCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #getCorporateCode()
	 * @generated
	 */
	void setCorporateCode(String value);

	/**
	 * Returns the value of the '<em><b>Red Lines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfLocations.RedLine}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.RedLine#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Lines</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_RedLines()
	 * @see CIM.IEC61970.Informative.InfLocations.RedLine#getLocations
	 * @model opposite="Locations"
	 * @generated
	 */
	EList<RedLine> getRedLines();

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
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Status()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of this location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of this location.'"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Direction()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Direction that allows field crews to quickly find a given asset. For a given location, such as a street address, this is the relative direction in which to find the asset. For example, a Streetlight may be located at the \'NW\' (northwest) corner of the customer\'s site, or a ServiceDeliveryPoint may be located on the second floor of an apartment building.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Direction that allows field crews to quickly find a given asset. For a given location, such as a street address, this is the relative direction in which to find the asset. For example, a Streetlight may be located at the \'NW\' (northwest) corner of the customer\'s site, or a ServiceDeliveryPoint may be located on the second floor of an apartment building.'"
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Crew#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Crews()
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getLocations
	 * @model opposite="Locations"
	 * @generated
	 */
	EList<Crew> getCrews();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(PositionPoint)
	 * @see CIM.IEC61968.Common.CommonPackage#getLocation_Position()
	 * @model
	 * @generated
	 */
	PositionPoint getPosition();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Location#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionPoint value);

} // Location
