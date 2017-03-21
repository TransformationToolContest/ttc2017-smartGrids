/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.InfWork.Design;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp BOM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getErpBomItemDatas <em>Erp Bom Item Datas</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign <em>Design</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBOM()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information that generally describes the Bill of Material Structure and its contents for a utility.\n\nThis is used by ERP systems to transfer Bill of Material information between two business applications.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Information that generally describes the Bill of Material Structure and its contents for a utility.\n\nThis is used by ERP systems to transfer Bill of Material information between two business applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information that generally describes the Bill of Material Structure and its contents for a utility.\n\nThis is used by ERP systems to transfer Bill of Material information between two business applications.' Profile\040documentation='Information that generally describes the Bill of Material Structure and its contents for a utility.\n\nThis is used by ERP systems to transfer Bill of Material information between two business applications.'"
 * @generated
 */
public interface ErpBOM extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM <em>Erp BOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Bom Item Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Bom Item Datas</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBOM_ErpBomItemDatas()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM
	 * @model opposite="ErpBOM"
	 * @generated
	 */
	EList<ErpBomItemData> getErpBomItemDatas();

	/**
	 * Returns the value of the '<em><b>Design</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Design#getErpBOMs <em>Erp BO Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' reference.
	 * @see #setDesign(Design)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBOM_Design()
	 * @see CIM.IEC61970.Informative.InfWork.Design#getErpBOMs
	 * @model opposite="ErpBOMs"
	 * @generated
	 */
	Design getDesign();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(Design value);

} // ErpBOM
