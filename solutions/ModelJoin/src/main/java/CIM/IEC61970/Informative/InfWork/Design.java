/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.Work.Work;

import CIM.IEC61970.Informative.InfERPSupport.ErpBOM;
import CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getCostEstimate <em>Cost Estimate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getDesignLocations <em>Design Locations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs <em>Design Locations CUs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getWork <em>Work</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getErpBOMs <em>Erp BO Ms</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getConditionFactors <em>Condition Factors</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getPrice <em>Price</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Design#getWorkTasks <em>Work Tasks</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A design for consideration by customers, potential customers, or internal work.\nNote that the Version of design is the revision attribute that is inherited from Document.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A design for consideration by customers, potential customers, or internal work.\nNote that the Version of design is the revision attribute that is inherited from Document.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A design for consideration by customers, potential customers, or internal work.\nNote that the Version of design is the revision attribute that is inherited from Document.' Profile\040documentation='A design for consideration by customers, potential customers, or internal work.\nNote that the Version of design is the revision attribute that is inherited from Document.'"
 * @generated
 */
public interface Design extends Document {
	/**
	 * Returns the value of the '<em><b>Cost Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Estimate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Estimate</em>' attribute.
	 * @see #setCostEstimate(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_CostEstimate()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated cost (not price) of design.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated cost (not price) of design.'"
	 * @generated
	 */
	float getCostEstimate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Design#getCostEstimate <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Estimate</em>' attribute.
	 * @see #getCostEstimate()
	 * @generated
	 */
	void setCostEstimate(float value);

	/**
	 * Returns the value of the '<em><b>Design Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.DesignLocation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Locations</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_DesignLocations()
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getDesigns
	 * @model opposite="Designs"
	 * @generated
	 */
	EList<DesignLocation> getDesignLocations();

	/**
	 * Returns the value of the '<em><b>Design Locations CUs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Locations CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Locations CUs</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_DesignLocationsCUs()
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns
	 * @model opposite="Designs"
	 * @generated
	 */
	EList<DesignLocationCU> getDesignLocationsCUs();

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Work.Work#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference.
	 * @see #setWork(Work)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_Work()
	 * @see CIM.IEC61968.Work.Work#getDesigns
	 * @model opposite="Designs"
	 * @generated
	 */
	Work getWork();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Design#getWork <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' reference.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Work value);

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_WorkCostDetails()
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getDesign
	 * @model opposite="Design"
	 * @generated
	 */
	EList<WorkCostDetail> getWorkCostDetails();

	/**
	 * Returns the value of the '<em><b>Erp BO Ms</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpBOM}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp BO Ms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp BO Ms</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_ErpBOMs()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign
	 * @model opposite="Design"
	 * @generated
	 */
	EList<ErpBOM> getErpBOMs();

	/**
	 * Returns the value of the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #setErpQuoteLineItem(ErpQuoteLineItem)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_ErpQuoteLineItem()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign
	 * @model opposite="Design"
	 * @generated
	 */
	ErpQuoteLineItem getErpQuoteLineItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	void setErpQuoteLineItem(ErpQuoteLineItem value);

	/**
	 * Returns the value of the '<em><b>Condition Factors</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.ConditionFactor}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Factors</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_ConditionFactors()
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesigns
	 * @model opposite="Designs"
	 * @generated
	 */
	EList<ConditionFactor> getConditionFactors();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfWork.DesignKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfWork.DesignKind
	 * @see #setKind(DesignKind)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of this design.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of this design.'"
	 * @generated
	 */
	DesignKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Design#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfWork.DesignKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DesignKind value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_Price()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Price to customer for implementing design.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Price to customer for implementing design.'"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Design#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesign_WorkTasks()
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getDesign
	 * @model opposite="Design"
	 * @generated
	 */
	EList<WorkTask> getWorkTasks();

} // Design
