/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getCertificationPeriod <em>Certification Period</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getCrafts <em>Crafts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getLevel <em>Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getSkill()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Proficiency level of a craft, which is required to operate or maintain a particular type of asset and/or perform certain types of work.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Proficiency level of a craft, which is required to operate or maintain a particular type of asset and/or perform certain types of work.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Proficiency level of a craft, which is required to operate or maintain a particular type of asset and/or perform certain types of work.' Profile\040documentation='Proficiency level of a craft, which is required to operate or maintain a particular type of asset and/or perform certain types of work.'"
 * @generated
 */
public interface Skill extends Document {
	/**
	 * Returns the value of the '<em><b>Certification Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certification Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certification Period</em>' reference.
	 * @see #setCertificationPeriod(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getSkill_CertificationPeriod()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval between the certification and its expiry.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval between the certification and its expiry.'"
	 * @generated
	 */
	DateTimeInterval getCertificationPeriod();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getCertificationPeriod <em>Certification Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certification Period</em>' reference.
	 * @see #getCertificationPeriod()
	 * @generated
	 */
	void setCertificationPeriod(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getSkill_ErpPerson()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills
	 * @model opposite="Skills"
	 * @generated
	 */
	ErpPerson getErpPerson();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	void setErpPerson(ErpPerson value);

	/**
	 * Returns the value of the '<em><b>Crafts</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crafts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crafts</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getSkill_Crafts()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getSkills
	 * @model opposite="Skills"
	 * @generated
	 */
	EList<Craft> getCrafts();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfCommon.SkillLevelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.SkillLevelKind
	 * @see #setLevel(SkillLevelKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getSkill_Level()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Level of skill for a Craft.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Level of skill for a Craft.'"
	 * @generated
	 */
	SkillLevelKind getLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.SkillLevelKind
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(SkillLevelKind value);

	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' attribute.
	 * @see #setEffectiveDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getSkill_EffectiveDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time the skill became effective.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time the skill became effective.'"
	 * @generated
	 */
	Date getEffectiveDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getEffectiveDateTime <em>Effective Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' attribute.
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	void setEffectiveDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Qualification Requirements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Requirements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getSkill_QualificationRequirements()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSkills
	 * @model opposite="Skills"
	 * @generated
	 */
	EList<QualificationRequirement> getQualificationRequirements();

} // Skill
