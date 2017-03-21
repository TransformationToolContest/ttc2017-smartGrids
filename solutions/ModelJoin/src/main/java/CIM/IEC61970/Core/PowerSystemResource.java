/**
 */
package CIM.IEC61970.Core;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61968.Common.Location;

import CIM.IEC61970.Informative.InfCommon.DocPsrRole;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.CircuitSection;
import CIM.IEC61970.Informative.InfOperations.NetworkDataSet;
import CIM.IEC61970.Informative.InfOperations.OrgPsrRole;
import CIM.IEC61970.Informative.InfOperations.PSREvent;
import CIM.IEC61970.Informative.InfOperations.SafetyDocument;
import CIM.IEC61970.Informative.InfOperations.SwitchingStep;

import CIM.IEC61970.Meas.Measurement;

import CIM.IEC61970.Outage.OutageSchedule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getOutageSchedule <em>Outage Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getPSREvent <em>PSR Event</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getSafetyDocuments <em>Safety Documents</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getCircuitSections <em>Circuit Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getScheduleSteps <em>Schedule Steps</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getPSRType <em>PSR Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getPsrLists <em>Psr Lists</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getOperatingShare <em>Operating Share</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PowerSystemResource#getDocumentRoles <em>Document Roles</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A power system resource can be an item of equipment such as a Switch, an EquipmentContainer containing many individual items of equipment such as a \nSubstation, or an organisational entity such as Company or SubControlArea.  This provides for the nesting of collections of PowerSystemResources within other PowerSystemResources. For example, a Switch could be a member of a Substation and a Substation could be a member of a division of a Company.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A power system resource can be an item of equipment such as a Switch, an EquipmentContainer containing many individual items of equipment such as a \nSubstation, or an organisational entity such as Company or SubControlArea.  This provides for the nesting of collections of PowerSystemResources within other PowerSystemResources. For example, a Switch could be a member of a Substation and a Substation could be a member of a division of a Company.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A power system resource can be an item of equipment such as a Switch, an EquipmentContainer containing many individual items of equipment such as a \nSubstation, or an organisational entity such as Company or SubControlArea.  This provides for the nesting of collections of PowerSystemResources within other PowerSystemResources. For example, a Switch could be a member of a Substation and a Substation could be a member of a division of a Company.' Profile\040documentation='A power system resource can be an item of equipment such as a Switch, an EquipmentContainer containing many individual items of equipment such as a \nSubstation, or an organisational entity such as Company or SubControlArea.  This provides for the nesting of collections of PowerSystemResources within other PowerSystemResources. For example, a Switch could be a member of a Substation and a Substation could be a member of a division of a Company.'"
 * @generated
 */
public interface PowerSystemResource extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Reporting Group</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.ReportingGroup}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Group</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_ReportingGroup()
	 * @see CIM.IEC61970.Core.ReportingGroup#getPowerSystemResource
	 * @model opposite="PowerSystemResource"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reporting groups to which this PSR belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reporting groups to which this PSR belongs.'"
	 * @generated
	 */
	EList<ReportingGroup> getReportingGroup();

	/**
	 * Returns the value of the '<em><b>Network Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.NetworkDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Data Sets</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_NetworkDataSets()
	 * @see CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources
	 * @model opposite="PowerSystemResources"
	 * @generated
	 */
	EList<NetworkDataSet> getNetworkDataSets();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Location#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_Location()
	 * @see CIM.IEC61968.Common.Location#getPowerSystemResources
	 * @model opposite="PowerSystemResources"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Location of this power system resource.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Location of this power system resource.'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.PowerSystemResource#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Outage Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Outage.OutageSchedule#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Schedule</em>' reference.
	 * @see #setOutageSchedule(OutageSchedule)
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_OutageSchedule()
	 * @see CIM.IEC61970.Outage.OutageSchedule#getPowerSystemResource
	 * @model opposite="PowerSystemResource"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A power system resource may have an outage schedule'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A power system resource may have an outage schedule'"
	 * @generated
	 */
	OutageSchedule getOutageSchedule();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.PowerSystemResource#getOutageSchedule <em>Outage Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Schedule</em>' reference.
	 * @see #getOutageSchedule()
	 * @generated
	 */
	void setOutageSchedule(OutageSchedule value);

	/**
	 * Returns the value of the '<em><b>PSR Event</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.PSREvent}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PSR Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSR Event</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_PSREvent()
	 * @see CIM.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource
	 * @model opposite="PowerSystemResource"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All events associated with this power system resource.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All events associated with this power system resource.'"
	 * @generated
	 */
	EList<PSREvent> getPSREvent();

	/**
	 * Returns the value of the '<em><b>Safety Documents</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.SafetyDocument}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Documents</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_SafetyDocuments()
	 * @see CIM.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource
	 * @model opposite="PowerSystemResource"
	 * @generated
	 */
	EList<SafetyDocument> getSafetyDocuments();

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.OrgPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_ErpOrganisationRoles()
	 * @see CIM.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource
	 * @model opposite="PowerSystemResource"
	 * @generated
	 */
	EList<OrgPsrRole> getErpOrganisationRoles();

	/**
	 * Returns the value of the '<em><b>Circuit Sections</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.CircuitSection}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.CircuitSection#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Sections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Sections</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_CircuitSections()
	 * @see CIM.IEC61970.Informative.InfOperations.CircuitSection#getPowerSystemResources
	 * @model opposite="PowerSystemResources"
	 * @generated
	 */
	EList<CircuitSection> getCircuitSections();

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Measurement#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_Measurements()
	 * @see CIM.IEC61970.Meas.Measurement#getPowerSystemResource
	 * @model opposite="PowerSystemResource"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Measurements that are included in the naming hierarchy where the PSR is the containing object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Measurements that are included in the naming hierarchy where the PSR is the containing object'"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_Assets()
	 * @see CIM.IEC61968.Assets.Asset#getPowerSystemResources
	 * @model opposite="PowerSystemResources"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All assets represented by this power system resource. For example, multiple conductor assets are electrically modelled as a single AC line segment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All assets represented by this power system resource. For example, multiple conductor assets are electrically modelled as a single AC line segment.'"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Schedule Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.SwitchingStep}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Steps</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_ScheduleSteps()
	 * @see CIM.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources
	 * @model opposite="PowerSystemResources"
	 * @generated
	 */
	EList<SwitchingStep> getScheduleSteps();

	/**
	 * Returns the value of the '<em><b>PSR Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PSRType#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PSR Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSR Type</em>' reference.
	 * @see #setPSRType(PSRType)
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_PSRType()
	 * @see CIM.IEC61970.Core.PSRType#getPowerSystemResources
	 * @model opposite="PowerSystemResources"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='PSRType (custom classification) for this PowerSystemResource.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='PSRType (custom classification) for this PowerSystemResource.'"
	 * @generated
	 */
	PSRType getPSRType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.PowerSystemResource#getPSRType <em>PSR Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSR Type</em>' reference.
	 * @see #getPSRType()
	 * @generated
	 */
	void setPSRType(PSRType value);

	/**
	 * Returns the value of the '<em><b>Psr Lists</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.PsrList}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PsrList#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Psr Lists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psr Lists</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_PsrLists()
	 * @see CIM.IEC61970.Core.PsrList#getPowerSystemResources
	 * @model opposite="PowerSystemResources"
	 * @generated
	 */
	EList<PsrList> getPsrLists();

	/**
	 * Returns the value of the '<em><b>Operating Share</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.OperatingShare}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.OperatingShare#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Share</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Share</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_OperatingShare()
	 * @see CIM.IEC61970.Core.OperatingShare#getPowerSystemResource
	 * @model opposite="PowerSystemResource"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The linkage to any number of operating share objects.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The linkage to any number of operating share objects.'"
	 * @generated
	 */
	EList<OperatingShare> getOperatingShare();

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_ChangeItems()
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource
	 * @model opposite="PowerSystemResource"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

	/**
	 * Returns the value of the '<em><b>Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.DocPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.DocPsrRole#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Roles</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPowerSystemResource_DocumentRoles()
	 * @see CIM.IEC61970.Informative.InfCommon.DocPsrRole#getPowerSystemResource
	 * @model opposite="PowerSystemResource"
	 * @generated
	 */
	EList<DocPsrRole> getDocumentRoles();

} // PowerSystemResource
