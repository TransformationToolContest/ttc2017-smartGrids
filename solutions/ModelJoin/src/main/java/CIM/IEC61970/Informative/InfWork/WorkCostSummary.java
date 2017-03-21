/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Cost Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostSummary()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A roll up by cost category for the entire cost of a work order. For example, total labor.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A roll up by cost category for the entire cost of a work order. For example, total labor.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A roll up by cost category for the entire cost of a work order. For example, total labor.' Profile\040documentation='A roll up by cost category for the entire cost of a work order. For example, total labor.'"
 * @generated
 */
public interface WorkCostSummary extends Document {
	/**
	 * Returns the value of the '<em><b>Work Cost Detail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary <em>Work Cost Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Detail</em>' reference.
	 * @see #setWorkCostDetail(WorkCostDetail)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostSummary_WorkCostDetail()
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary
	 * @model opposite="WorkCostSummary"
	 * @generated
	 */
	WorkCostDetail getWorkCostDetail();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Detail</em>' reference.
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	void setWorkCostDetail(WorkCostDetail value);

} // WorkCostSummary
