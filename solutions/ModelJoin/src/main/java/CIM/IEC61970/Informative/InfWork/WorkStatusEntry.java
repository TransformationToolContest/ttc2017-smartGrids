/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.ActivityRecord;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Status Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete <em>Percent Complete</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkStatusEntry()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of ActivityRecord that records information about the status of an item, such as a Work or WorkTask, at a point in time.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A type of ActivityRecord that records information about the status of an item, such as a Work or WorkTask, at a point in time.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of ActivityRecord that records information about the status of an item, such as a Work or WorkTask, at a point in time.' Profile\040documentation='A type of ActivityRecord that records information about the status of an item, such as a Work or WorkTask, at a point in time.'"
 * @generated
 */
public interface WorkStatusEntry extends ActivityRecord {
	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #setPercentComplete(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkStatusEntry_PercentComplete()
	 * @model dataType="CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated percentage of completion of this individual work task or overall work order.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated percentage of completion of this individual work task or overall work order.'"
	 * @generated
	 */
	float getPercentComplete();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(float value);

} // WorkStatusEntry
