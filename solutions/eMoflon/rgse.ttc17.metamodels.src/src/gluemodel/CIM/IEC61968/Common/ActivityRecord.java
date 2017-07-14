/**
 */
package gluemodel.CIM.IEC61968.Common;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getMarketFactors <em>Market Factors</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getSeverity <em>Severity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getScheduledEvent <em>Scheduled Event</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getReason <em>Reason</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getDocuments <em>Documents</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getCreatedDateTime <em>Created Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getErpPersons <em>Erp Persons</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Records activity for an entity at a point in time; activity may be for an event that has already occurred or for a planned activity.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Records activity for an entity at a point in time; activity may be for an event that has already occurred or for a planned activity.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Records activity for an entity at a point in time; activity may be for an event that has already occurred or for a planned activity.' Profile\040documentation='Records activity for an entity at a point in time; activity may be for an event that has already occurred or for a planned activity.'"
 * @generated
 */
public interface ActivityRecord extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Market Factors</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Factors</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_MarketFactors()
	 * @model
	 * @generated
	 */
	EList<MarketFactors> getMarketFactors();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_Assets()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getActivityRecords
	 * @model opposite="ActivityRecords"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All assets for which this activity record has been created.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All assets for which this activity record has been created.'"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_Severity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Severity level of event resulting in this activity record.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Severity level of event resulting in this activity record.'"
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>Scheduled Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getActivityRecord <em>Activity Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Event</em>' reference.
	 * @see #setScheduledEvent(ScheduledEvent)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_ScheduledEvent()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getActivityRecord
	 * @model opposite="ActivityRecord"
	 * @generated
	 */
	ScheduledEvent getScheduledEvent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getScheduledEvent <em>Scheduled Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Event</em>' reference.
	 * @see #getScheduledEvent()
	 * @generated
	 */
	void setScheduledEvent(ScheduledEvent value);

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
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category of event resulting in this activity record.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category of event resulting in this activity record.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_Reason()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reason for event resulting in this activity record, typically supplied when user initiated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reason for event resulting in this activity record, typically supplied when user initiated.'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

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
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_Status()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information on consequence of event resulting in this activity record.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information on consequence of event resulting in this activity record.'"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Document}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Document#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_Documents()
	 * @see gluemodel.CIM.IEC61968.Common.Document#getActivityRecords
	 * @model opposite="ActivityRecords"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All documents for which this activity record has been created.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All documents for which this activity record has been created.'"
	 * @generated
	 */
	EList<Document> getDocuments();

	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_Organisations()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords
	 * @model opposite="ActivityRecords"
	 * @generated
	 */
	EList<ErpOrganisation> getOrganisations();

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
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_CreatedDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time this activity record has been created (different from the \'status.dateTime\', which is the time of a status change of the associated object, if applicable).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time this activity record has been created (different from the \'status.dateTime\', which is the time of a status change of the associated object, if applicable).'"
	 * @generated
	 */
	Date getCreatedDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getCreatedDateTime <em>Created Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date Time</em>' attribute.
	 * @see #getCreatedDateTime()
	 * @generated
	 */
	void setCreatedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getActivityRecord_ErpPersons()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords
	 * @model opposite="ActivityRecords"
	 * @generated
	 */
	EList<ErpPerson> getErpPersons();

} // ActivityRecord
