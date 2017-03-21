/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData;

import CIM.IEC61970.Informative.InfGMLSupport.Diagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getSpanLength <em>Span Length</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getConditionFactors <em>Condition Factors</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations <em>Work Locations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getDesigns <em>Designs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas <em>Erp Bom Item Datas</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems <em>Misc Cost Items</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A logical part of the design (e.g., pole and all equipment on a pole). This includes points and spans.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A logical part of the design (e.g., pole and all equipment on a pole). This includes points and spans.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A logical part of the design (e.g., pole and all equipment on a pole). This includes points and spans.' Profile\040documentation='A logical part of the design (e.g., pole and all equipment on a pole). This includes points and spans.'"
 * @generated
 */
public interface DesignLocation extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Span Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span Length</em>' attribute.
	 * @see #setSpanLength(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_SpanLength()
	 * @model dataType="CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The legth of the span from the previous pole to this pole.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The legth of the span from the previous pole to this pole.'"
	 * @generated
	 */
	float getSpanLength();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getSpanLength <em>Span Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span Length</em>' attribute.
	 * @see #getSpanLength()
	 * @generated
	 */
	void setSpanLength(float value);

	/**
	 * Returns the value of the '<em><b>Condition Factors</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.ConditionFactor}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Factors</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_ConditionFactors()
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocations
	 * @model opposite="DesignLocations"
	 * @generated
	 */
	EList<ConditionFactor> getConditionFactors();

	/**
	 * Returns the value of the '<em><b>Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.MaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_MaterialItems()
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation
	 * @model opposite="DesignLocation"
	 * @generated
	 */
	EList<MaterialItem> getMaterialItems();

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.Diagram}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_Diagrams()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations
	 * @model opposite="DesignLocations"
	 * @generated
	 */
	EList<Diagram> getDiagrams();

	/**
	 * Returns the value of the '<em><b>Work Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkLocation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Locations</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_WorkLocations()
	 * @see CIM.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations
	 * @model opposite="DesignLocations"
	 * @generated
	 */
	EList<WorkLocation> getWorkLocations();

	/**
	 * Returns the value of the '<em><b>Design Location CUs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location CUs</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_DesignLocationCUs()
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation
	 * @model opposite="DesignLocation"
	 * @generated
	 */
	EList<DesignLocationCU> getDesignLocationCUs();

	/**
	 * Returns the value of the '<em><b>Designs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Design}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Design#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designs</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_Designs()
	 * @see CIM.IEC61970.Informative.InfWork.Design#getDesignLocations
	 * @model opposite="DesignLocations"
	 * @generated
	 */
	EList<Design> getDesigns();

	/**
	 * Returns the value of the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Bom Item Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Bom Item Datas</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_ErpBomItemDatas()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation
	 * @model opposite="DesignLocation"
	 * @generated
	 */
	EList<ErpBomItemData> getErpBomItemDatas();

	/**
	 * Returns the value of the '<em><b>Misc Cost Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.MiscCostItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Cost Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Cost Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation_MiscCostItems()
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation
	 * @model opposite="DesignLocation"
	 * @generated
	 */
	EList<MiscCostItem> getMiscCostItems();

} // DesignLocation
