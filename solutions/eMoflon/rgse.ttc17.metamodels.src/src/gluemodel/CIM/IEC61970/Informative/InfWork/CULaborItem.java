/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Labor Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode <em>CU Labor Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getActivityCode <em>Activity Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration <em>Labor Duration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getLaborRate <em>Labor Rate</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Compatible unit labor item.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Compatible unit labor item.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Compatible unit labor item.' Profile\040documentation='Compatible unit labor item.'"
 * @generated
 */
public interface CULaborItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Qualification Requirements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Requirements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem_QualificationRequirements()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems
	 * @model opposite="CULaborItems"
	 * @generated
	 */
	EList<QualificationRequirement> getQualificationRequirements();

	/**
	 * Returns the value of the '<em><b>CU Labor Code</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborCode#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Labor Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Labor Code</em>' reference.
	 * @see #setCULaborCode(CULaborCode)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem_CULaborCode()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CULaborCode#getCULaborItems
	 * @model opposite="CULaborItems"
	 * @generated
	 */
	CULaborCode getCULaborCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode <em>CU Labor Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Labor Code</em>' reference.
	 * @see #getCULaborCode()
	 * @generated
	 */
	void setCULaborCode(CULaborCode value);

	/**
	 * Returns the value of the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Code</em>' attribute.
	 * @see #setActivityCode(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem_ActivityCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Activity code identifies a specific and distinguishable unit of work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Activity code identifies a specific and distinguishable unit of work.'"
	 * @generated
	 */
	String getActivityCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Code</em>' attribute.
	 * @see #getActivityCode()
	 * @generated
	 */
	void setActivityCode(String value);

	/**
	 * Returns the value of the '<em><b>Labor Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Duration</em>' attribute.
	 * @see #setLaborDuration(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem_LaborDuration()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Hours" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated time to perform work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated time to perform work.'"
	 * @generated
	 */
	float getLaborDuration();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration <em>Labor Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labor Duration</em>' attribute.
	 * @see #getLaborDuration()
	 * @generated
	 */
	void setLaborDuration(float value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem_CompatibleUnits()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems
	 * @model opposite="CULaborItems"
	 * @generated
	 */
	EList<CompatibleUnit> getCompatibleUnits();

	/**
	 * Returns the value of the '<em><b>Labor Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Rate</em>' attribute.
	 * @see #setLaborRate(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem_LaborRate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CostRate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The labor rate applied for work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The labor rate applied for work.'"
	 * @generated
	 */
	float getLaborRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getLaborRate <em>Labor Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labor Rate</em>' attribute.
	 * @see #getLaborRate()
	 * @generated
	 */
	void setLaborRate(float value);

} // CULaborItem
