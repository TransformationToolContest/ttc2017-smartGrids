/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.Work.Work;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.BusinessCase#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.BusinessCase#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getBusinessCase()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Business justification for capital expenditures, usually addressing operations and maintenance costs as well.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Business justification for capital expenditures, usually addressing operations and maintenance costs as well.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Business justification for capital expenditures, usually addressing operations and maintenance costs as well.' Profile\040documentation='Business justification for capital expenditures, usually addressing operations and maintenance costs as well.'"
 * @generated
 */
public interface BusinessCase extends Document {
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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getBusinessCase_CorporateCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A codified representation of the business case (i.e., codes for highway relocation, replace substation transformers, etc.).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A codified representation of the business case (i.e., codes for highway relocation, replace substation transformers, etc.).'"
	 * @generated
	 */
	String getCorporateCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #getCorporateCode()
	 * @generated
	 */
	void setCorporateCode(String value);

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Work.Work#getBusinessCase <em>Business Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getBusinessCase_Works()
	 * @see CIM.IEC61968.Work.Work#getBusinessCase
	 * @model opposite="BusinessCase"
	 * @generated
	 */
	EList<Work> getWorks();

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Project}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Project#getBusinessCase <em>Business Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getBusinessCase_Projects()
	 * @see CIM.IEC61970.Informative.InfWork.Project#getBusinessCase
	 * @model opposite="BusinessCase"
	 * @generated
	 */
	EList<Project> getProjects();

} // BusinessCase
