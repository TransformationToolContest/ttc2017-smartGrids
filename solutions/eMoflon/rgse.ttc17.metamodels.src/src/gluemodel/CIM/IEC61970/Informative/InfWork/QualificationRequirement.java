/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfAssets.Specification;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Skill;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems <em>CU Labor Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSkills <em>Skills</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID <em>Qualification ID</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getQualificationRequirement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Certain skills are required and must be certified in order for a person (typically a member of a crew) to be qualified to work on types of equipment.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Certain skills are required and must be certified in order for a person (typically a member of a crew) to be qualified to work on types of equipment.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Certain skills are required and must be certified in order for a person (typically a member of a crew) to be qualified to work on types of equipment.' Profile\040documentation='Certain skills are required and must be certified in order for a person (typically a member of a crew) to be qualified to work on types of equipment.'"
 * @generated
 */
public interface QualificationRequirement extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getQualificationRequirement_Specifications()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements
	 * @model opposite="QualificationRequirements"
	 * @generated
	 */
	EList<Specification> getSpecifications();

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getQualificationRequirement_WorkTasks()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements
	 * @model opposite="QualificationRequirements"
	 * @generated
	 */
	EList<WorkTask> getWorkTasks();

	/**
	 * Returns the value of the '<em><b>CU Labor Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Labor Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getQualificationRequirement_CULaborItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements
	 * @model opposite="QualificationRequirements"
	 * @generated
	 */
	EList<CULaborItem> getCULaborItems();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getQualificationRequirement_Skills()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getQualificationRequirements
	 * @model opposite="QualificationRequirements"
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Qualification ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification ID</em>' attribute.
	 * @see #setQualificationID(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getQualificationRequirement_QualificationID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Qualification identifier.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Qualification identifier.'"
	 * @generated
	 */
	String getQualificationID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID <em>Qualification ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification ID</em>' attribute.
	 * @see #getQualificationID()
	 * @generated
	 */
	void setQualificationID(String value);

} // QualificationRequirement
