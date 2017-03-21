/**
 */
package CIM.IEC61968.Common;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfAssets.DocAssetRole;

import CIM.IEC61970.Informative.InfCommon.DocDocRole;
import CIM.IEC61970.Informative.InfCommon.DocPsrRole;
import CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo;
import CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole;
import CIM.IEC61970.Informative.InfERPSupport.DocOrgRole;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.ChangeSet;
import CIM.IEC61970.Informative.InfOperations.NetworkDataSet;

import CIM.IEC61970.Meas.Measurement;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.Document#getSubject <em>Subject</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getCreatedDateTime <em>Created Date Time</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getToDocumentRoles <em>To Document Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getAssetRoles <em>Asset Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getErpPersonRoles <em>Erp Person Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getFromDocumentRoles <em>From Document Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getLastModifiedDateTime <em>Last Modified Date Time</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getChangeSets <em>Change Sets</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getScheduleParameterInfos <em>Schedule Parameter Infos</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Document#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Common.CommonPackage#getDocument()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Parent class for different groupings of information collected and managed as a part of a business process. It will frequently contain references to other objects, such as assets, people and power system resources.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Parent class for different groupings of information collected and managed as a part of a business process. It will frequently contain references to other objects, such as assets, people and power system resources.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Parent class for different groupings of information collected and managed as a part of a business process. It will frequently contain references to other objects, such as assets, people and power system resources.' Profile\040documentation='Parent class for different groupings of information collected and managed as a part of a business process. It will frequently contain references to other objects, such as assets, people and power system resources.'"
 * @generated
 */
public interface Document extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_Subject()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Document subject.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Document subject.'"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Document#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.ScheduledEvent}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Events</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_ScheduledEvents()
	 * @see CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getDocument
	 * @model opposite="Document"
	 * @generated
	 */
	EList<ScheduledEvent> getScheduledEvents();

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.DocOrgRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_ErpOrganisationRoles()
	 * @see CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument
	 * @model opposite="Document"
	 * @generated
	 */
	EList<DocOrgRole> getErpOrganisationRoles();

	/**
	 * Returns the value of the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date Time</em>' attribute.
	 * @see #setCreatedDateTime(Date)
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_CreatedDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time that this document was created.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time that this document was created.'"
	 * @generated
	 */
	Date getCreatedDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Document#getCreatedDateTime <em>Created Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date Time</em>' attribute.
	 * @see #getCreatedDateTime()
	 * @generated
	 */
	void setCreatedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>To Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.DocDocRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.DocDocRole#getFromDocument <em>From Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Document Roles</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_ToDocumentRoles()
	 * @see CIM.IEC61970.Informative.InfCommon.DocDocRole#getFromDocument
	 * @model opposite="FromDocument"
	 * @generated
	 */
	EList<DocDocRole> getToDocumentRoles();

	/**
	 * Returns the value of the '<em><b>Asset Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.DocAssetRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.DocAssetRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Roles</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_AssetRoles()
	 * @see CIM.IEC61970.Informative.InfAssets.DocAssetRole#getDocument
	 * @model opposite="Document"
	 * @generated
	 */
	EList<DocAssetRole> getAssetRoles();

	/**
	 * Returns the value of the '<em><b>Erp Person Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person Roles</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_ErpPersonRoles()
	 * @see CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getDocument
	 * @model opposite="Document"
	 * @generated
	 */
	EList<DocErpPersonRole> getErpPersonRoles();

	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #setRevisionNumber(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_RevisionNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Revision number for this document.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Revision number for this document.'"
	 * @generated
	 */
	String getRevisionNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Document#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(String value);

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
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_ElectronicAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electronic address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electronic address.'"
	 * @generated
	 */
	ElectronicAddress getElectronicAddress();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Document#getElectronicAddress <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	void setElectronicAddress(ElectronicAddress value);

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
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_Status()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of subject matter (e.g., Agreement, Work) this document represents. For status of the document itself, use \'docStatus\' attribute.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of subject matter (e.g., Agreement, Work) this document represents. For status of the document itself, use \'docStatus\' attribute.'"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Document#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Network Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.NetworkDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Data Sets</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_NetworkDataSets()
	 * @see CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments
	 * @model opposite="Documents"
	 * @generated
	 */
	EList<NetworkDataSet> getNetworkDataSets();

	/**
	 * Returns the value of the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.DocPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.DocPsrRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource Roles</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_PowerSystemResourceRoles()
	 * @see CIM.IEC61970.Informative.InfCommon.DocPsrRole#getDocument
	 * @model opposite="Document"
	 * @generated
	 */
	EList<DocPsrRole> getPowerSystemResourceRoles();

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
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Utility-specific categorisation of this document, according to their corporate standards, practices, and existing IT systems (e.g., for management of assets, maintenance, work, outage, customers, etc.).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Utility-specific categorisation of this document, according to their corporate standards, practices, and existing IT systems (e.g., for management of assets, maintenance, work, outage, customers, etc.).'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Document#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Activity Records</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.ActivityRecord}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.ActivityRecord#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Records</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_ActivityRecords()
	 * @see CIM.IEC61968.Common.ActivityRecord#getDocuments
	 * @model opposite="Documents"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All activity records created for this document.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All activity records created for this document.'"
	 * @generated
	 */
	EList<ActivityRecord> getActivityRecords();

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Measurement#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_Measurements()
	 * @see CIM.IEC61970.Meas.Measurement#getDocuments
	 * @model opposite="Documents"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurements are specified in types of documents, such as procedures.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurements are specified in types of documents, such as procedures.'"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * Returns the value of the '<em><b>From Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.DocDocRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.DocDocRole#getToDocument <em>To Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Document Roles</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_FromDocumentRoles()
	 * @see CIM.IEC61970.Informative.InfCommon.DocDocRole#getToDocument
	 * @model opposite="ToDocument"
	 * @generated
	 */
	EList<DocDocRole> getFromDocumentRoles();

	/**
	 * Returns the value of the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date Time</em>' attribute.
	 * @see #setLastModifiedDateTime(Date)
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_LastModifiedDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time this document was last modified. Documents may potentially be modified many times during their lifetime.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time this document was last modified. Documents may potentially be modified many times during their lifetime.'"
	 * @generated
	 */
	Date getLastModifiedDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Document#getLastModifiedDateTime <em>Last Modified Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date Time</em>' attribute.
	 * @see #getLastModifiedDateTime()
	 * @generated
	 */
	void setLastModifiedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Change Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.ChangeSet}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ChangeSet#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Sets</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_ChangeSets()
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeSet#getDocuments
	 * @model opposite="Documents"
	 * @generated
	 */
	EList<ChangeSet> getChangeSets();

	/**
	 * Returns the value of the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Status</em>' reference.
	 * @see #setDocStatus(Status)
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_DocStatus()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of this document. For status of subject matter this document represents (e.g., Agreement, Work), use \'status\' attribute.\nExample values for \'docStatus.status\' are draft, approved, cancelled, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of this document. For status of subject matter this document represents (e.g., Agreement, Work), use \'status\' attribute.\nExample values for \'docStatus.status\' are draft, approved, cancelled, etc.'"
	 * @generated
	 */
	Status getDocStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Document#getDocStatus <em>Doc Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Status</em>' reference.
	 * @see #getDocStatus()
	 * @generated
	 */
	void setDocStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_ChangeItems()
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeItem#getDocument
	 * @model opposite="Document"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

	/**
	 * Returns the value of the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Parameter Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Parameter Infos</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_ScheduleParameterInfos()
	 * @see CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getDocuments
	 * @model opposite="Documents"
	 * @generated
	 */
	EList<ScheduleParameterInfo> getScheduleParameterInfos();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getDocument_Title()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Document title.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Document title.'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Document#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Document
