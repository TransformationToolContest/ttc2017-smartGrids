/**
 */
package CIM.IEC61970.Outage;

import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfOperations.SafetyDocument;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clearance Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#isGroundReqFlag <em>Ground Req Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#getSafetyDocument <em>Safety Document</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#getTagIssueTime <em>Tag Issue Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#getClearanceTagType <em>Clearance Tag Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#getWorkEndTime <em>Work End Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#getAuthorityName <em>Authority Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#isPhaseCheckReqFlag <em>Phase Check Req Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#isDeenergizeReqFlag <em>Deenergize Req Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#getWorkStartTime <em>Work Start Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.ClearanceTag#getWorkDescription <em>Work Description</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A clearance tag that is used to authorize and schedule work on conducting equipment in the field. Tagged equipment is not available for commercial service.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A clearance tag that is used to authorize and schedule work on conducting equipment in the field. Tagged equipment is not available for commercial service.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A clearance tag that is used to authorize and schedule work on conducting equipment in the field. Tagged equipment is not available for commercial service.' Profile\040documentation='A clearance tag that is used to authorize and schedule work on conducting equipment in the field. Tagged equipment is not available for commercial service.'"
 * @generated
 */
public interface ClearanceTag extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Ground Req Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Req Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Req Flag</em>' attribute.
	 * @see #setGroundReqFlag(boolean)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_GroundReqFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set true if equipment must be grounded'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set true if equipment must be grounded'"
	 * @generated
	 */
	boolean isGroundReqFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#isGroundReqFlag <em>Ground Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Req Flag</em>' attribute.
	 * @see #isGroundReqFlag()
	 * @generated
	 */
	void setGroundReqFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Safety Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.SafetyDocument#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Document</em>' reference.
	 * @see #setSafetyDocument(SafetyDocument)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_SafetyDocument()
	 * @see CIM.IEC61970.Informative.InfOperations.SafetyDocument#getClearanceTags
	 * @model opposite="ClearanceTags"
	 * @generated
	 */
	SafetyDocument getSafetyDocument();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#getSafetyDocument <em>Safety Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Document</em>' reference.
	 * @see #getSafetyDocument()
	 * @generated
	 */
	void setSafetyDocument(SafetyDocument value);

	/**
	 * Returns the value of the '<em><b>Tag Issue Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Issue Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Issue Time</em>' attribute.
	 * @see #setTagIssueTime(Date)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_TagIssueTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time at which the clearance tag was issued'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time at which the clearance tag was issued'"
	 * @generated
	 */
	Date getTagIssueTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#getTagIssueTime <em>Tag Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Issue Time</em>' attribute.
	 * @see #getTagIssueTime()
	 * @generated
	 */
	void setTagIssueTime(Date value);

	/**
	 * Returns the value of the '<em><b>Clearance Tag Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Outage.ClearanceTagType#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearance Tag Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearance Tag Type</em>' reference.
	 * @see #setClearanceTagType(ClearanceTagType)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_ClearanceTagType()
	 * @see CIM.IEC61970.Outage.ClearanceTagType#getClearanceTags
	 * @model opposite="ClearanceTags"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of tag, depending on the purpose of the work to be performed and/or the type of supervisory control allowed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of tag, depending on the purpose of the work to be performed and/or the type of supervisory control allowed.'"
	 * @generated
	 */
	ClearanceTagType getClearanceTagType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#getClearanceTagType <em>Clearance Tag Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearance Tag Type</em>' reference.
	 * @see #getClearanceTagType()
	 * @generated
	 */
	void setClearanceTagType(ClearanceTagType value);

	/**
	 * Returns the value of the '<em><b>Work End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work End Time</em>' attribute.
	 * @see #setWorkEndTime(Date)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_WorkEndTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time at which the clearance tag is scheduled to be removed'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time at which the clearance tag is scheduled to be removed'"
	 * @generated
	 */
	Date getWorkEndTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#getWorkEndTime <em>Work End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work End Time</em>' attribute.
	 * @see #getWorkEndTime()
	 * @generated
	 */
	void setWorkEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority Name</em>' attribute.
	 * @see #setAuthorityName(String)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_AuthorityName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The name of the person who is authorized to issue the tag'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The name of the person who is authorized to issue the tag'"
	 * @generated
	 */
	String getAuthorityName();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#getAuthorityName <em>Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority Name</em>' attribute.
	 * @see #getAuthorityName()
	 * @generated
	 */
	void setAuthorityName(String value);

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ConductingEquipment#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference.
	 * @see #setConductingEquipment(ConductingEquipment)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_ConductingEquipment()
	 * @see CIM.IEC61970.Core.ConductingEquipment#getClearanceTags
	 * @model opposite="ClearanceTags"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Conducting equipment may have multiple clearance tags for authorized field work'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conducting equipment may have multiple clearance tags for authorized field work'"
	 * @generated
	 */
	ConductingEquipment getConductingEquipment();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#getConductingEquipment <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conducting Equipment</em>' reference.
	 * @see #getConductingEquipment()
	 * @generated
	 */
	void setConductingEquipment(ConductingEquipment value);

	/**
	 * Returns the value of the '<em><b>Phase Check Req Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Check Req Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Check Req Flag</em>' attribute.
	 * @see #setPhaseCheckReqFlag(boolean)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_PhaseCheckReqFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set true if equipment phasing must be checked'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set true if equipment phasing must be checked'"
	 * @generated
	 */
	boolean isPhaseCheckReqFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#isPhaseCheckReqFlag <em>Phase Check Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Check Req Flag</em>' attribute.
	 * @see #isPhaseCheckReqFlag()
	 * @generated
	 */
	void setPhaseCheckReqFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Deenergize Req Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deenergize Req Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deenergize Req Flag</em>' attribute.
	 * @see #setDeenergizeReqFlag(boolean)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_DeenergizeReqFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set true if equipment must be deenergized'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set true if equipment must be deenergized'"
	 * @generated
	 */
	boolean isDeenergizeReqFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#isDeenergizeReqFlag <em>Deenergize Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deenergize Req Flag</em>' attribute.
	 * @see #isDeenergizeReqFlag()
	 * @generated
	 */
	void setDeenergizeReqFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Work Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Start Time</em>' attribute.
	 * @see #setWorkStartTime(Date)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_WorkStartTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time at which the clearance tag is scheduled to be set.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time at which the clearance tag is scheduled to be set.'"
	 * @generated
	 */
	Date getWorkStartTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#getWorkStartTime <em>Work Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Start Time</em>' attribute.
	 * @see #getWorkStartTime()
	 * @generated
	 */
	void setWorkStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Work Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Description</em>' attribute.
	 * @see #setWorkDescription(String)
	 * @see CIM.IEC61970.Outage.OutagePackage#getClearanceTag_WorkDescription()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Description of the work to be performed'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Description of the work to be performed'"
	 * @generated
	 */
	String getWorkDescription();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.ClearanceTag#getWorkDescription <em>Work Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Description</em>' attribute.
	 * @see #getWorkDescription()
	 * @generated
	 */
	void setWorkDescription(String value);

} // ClearanceTag
