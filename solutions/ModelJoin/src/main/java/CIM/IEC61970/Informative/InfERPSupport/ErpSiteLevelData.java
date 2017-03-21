/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfLocations.LandProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Site Level Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty <em>Land Property</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpSiteLevelData()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For a utility, general information that describes physical locations of organizations or the location codes and their meanings. This enables ERP applications to ensure that the physical location identifiers are synchronized between the business applications.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='For a utility, general information that describes physical locations of organizations or the location codes and their meanings. This enables ERP applications to ensure that the physical location identifiers are synchronized between the business applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For a utility, general information that describes physical locations of organizations or the location codes and their meanings. This enables ERP applications to ensure that the physical location identifiers are synchronized between the business applications.' Profile\040documentation='For a utility, general information that describes physical locations of organizations or the location codes and their meanings. This enables ERP applications to ensure that the physical location identifiers are synchronized between the business applications.'"
 * @generated
 */
public interface ErpSiteLevelData extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Land Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.LandProperty#getErpSiteLevelDatas <em>Erp Site Level Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property</em>' reference.
	 * @see #setLandProperty(LandProperty)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpSiteLevelData_LandProperty()
	 * @see CIM.IEC61970.Informative.InfLocations.LandProperty#getErpSiteLevelDatas
	 * @model opposite="ErpSiteLevelDatas"
	 * @generated
	 */
	LandProperty getLandProperty();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty <em>Land Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land Property</em>' reference.
	 * @see #getLandProperty()
	 * @generated
	 */
	void setLandProperty(LandProperty value);

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
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpSiteLevelData_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // ErpSiteLevelData
