/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.Location;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import CIM.IEC61970.Informative.InfGMLSupport.GmlObservation;
import CIM.IEC61970.Informative.InfGMLSupport.GmlSelector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet <em>Change Set</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getAsset <em>Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet <em>Network Data Set</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector <em>Gml Selector</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation <em>Gml Observation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getDocument <em>Document</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson <em>Erp Person</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Description for a single change within an ordered list of changes.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Description for a single change within an ordered list of changes.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Description for a single change within an ordered list of changes.' Profile\040documentation='Description for a single change within an ordered list of changes.'"
 * @generated
 */
public interface ChangeItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Change Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ChangeSet#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set</em>' reference.
	 * @see #setChangeSet(ChangeSet)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_ChangeSet()
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeSet#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	ChangeSet getChangeSet();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet <em>Change Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Set</em>' reference.
	 * @see #getChangeSet()
	 * @generated
	 */
	void setChangeSet(ChangeSet value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_Asset()
	 * @see CIM.IEC61968.Assets.Asset#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

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
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Network Data Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Data Set</em>' reference.
	 * @see #setNetworkDataSet(NetworkDataSet)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_NetworkDataSet()
	 * @see CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	NetworkDataSet getNetworkDataSet();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet <em>Network Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Data Set</em>' reference.
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	void setNetworkDataSet(NetworkDataSet value);

	/**
	 * Returns the value of the '<em><b>Gml Selector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Selector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Selector</em>' reference.
	 * @see #setGmlSelector(GmlSelector)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_GmlSelector()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	GmlSelector getGmlSelector();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector <em>Gml Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Selector</em>' reference.
	 * @see #getGmlSelector()
	 * @generated
	 */
	void setGmlSelector(GmlSelector value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' reference.
	 * @see #setOrganisation(ErpOrganisation)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_Organisation()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	ErpOrganisation getOrganisation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(ErpOrganisation value);

	/**
	 * Returns the value of the '<em><b>Gml Observation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Observation</em>' reference.
	 * @see #setGmlObservation(GmlObservation)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_GmlObservation()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	GmlObservation getGmlObservation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation <em>Gml Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Observation</em>' reference.
	 * @see #getGmlObservation()
	 * @generated
	 */
	void setGmlObservation(GmlObservation value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Location#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_Location()
	 * @see CIM.IEC61968.Common.Location#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PowerSystemResource#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_PowerSystemResource()
	 * @see CIM.IEC61970.Core.PowerSystemResource#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	PowerSystemResource getPowerSystemResource();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	void setPowerSystemResource(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Document#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_Document()
	 * @see CIM.IEC61968.Common.Document#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfOperations.ChangeItemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeItemKind
	 * @see #setKind(ChangeItemKind)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of change for the associated object.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of change for the associated object.'"
	 * @generated
	 */
	ChangeItemKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeItemKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ChangeItemKind value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relative order of this ChangeItem in an ordered sequence of changes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relative order of this ChangeItem in an ordered sequence of changes.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem_ErpPerson()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems
	 * @model opposite="ChangeItems"
	 * @generated
	 */
	ErpPerson getErpPerson();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	void setErpPerson(ErpPerson value);

} // ChangeItem
