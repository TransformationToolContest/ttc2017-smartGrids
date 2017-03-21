/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import CIM.IEC61970.Informative.InfWork.DesignLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Bom Item Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM <em>Erp BOM</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset <em>Type Asset</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBomItemData()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An individual item on a bill of materials.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An individual item on a bill of materials.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An individual item on a bill of materials.' Profile\040documentation='An individual item on a bill of materials.'"
 * @generated
 */
public interface ErpBomItemData extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Design Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location</em>' reference.
	 * @see #setDesignLocation(DesignLocation)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBomItemData_DesignLocation()
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas
	 * @model opposite="ErpBomItemDatas"
	 * @generated
	 */
	DesignLocation getDesignLocation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Location</em>' reference.
	 * @see #getDesignLocation()
	 * @generated
	 */
	void setDesignLocation(DesignLocation value);

	/**
	 * Returns the value of the '<em><b>Erp BOM</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp BOM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp BOM</em>' reference.
	 * @see #setErpBOM(ErpBOM)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBomItemData_ErpBOM()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getErpBomItemDatas
	 * @model opposite="ErpBomItemDatas"
	 * @generated
	 */
	ErpBOM getErpBOM();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM <em>Erp BOM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp BOM</em>' reference.
	 * @see #getErpBOM()
	 * @generated
	 */
	void setErpBOM(ErpBOM value);

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(TypeAsset)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBomItemData_TypeAsset()
	 * @see CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpBomItemDatas
	 * @model opposite="ErpBomItemDatas"
	 * @generated
	 */
	TypeAsset getTypeAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset</em>' reference.
	 * @see #getTypeAsset()
	 * @generated
	 */
	void setTypeAsset(TypeAsset value);

} // ErpBomItemData
