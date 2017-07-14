/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compatible Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost <em>Est Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit <em>Property Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems <em>CU Labor Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems <em>CU Material Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup <em>CU Group</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems <em>CU Work Equipment Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets <em>CU Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction <em>CU Allowable Action</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUContractorItems <em>CU Contractor Items</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A pre-planned job model containing labor, material, and accounting requirements for standardized job planning.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A pre-planned job model containing labor, material, and accounting requirements for standardized job planning.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A pre-planned job model containing labor, material, and accounting requirements for standardized job planning.' Profile\040documentation='A pre-planned job model containing labor, material, and accounting requirements for standardized job planning.'"
 * @generated
 */
public interface CompatibleUnit extends Document {
	/**
	 * Returns the value of the '<em><b>Design Location CUs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location CUs</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_DesignLocationCUs()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	EList<DesignLocationCU> getDesignLocationCUs();

	/**
	 * Returns the value of the '<em><b>Est Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Cost</em>' attribute.
	 * @see #setEstCost(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_EstCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated total cost for perfoming CU.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated total cost for perfoming CU.'"
	 * @generated
	 */
	float getEstCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost <em>Est Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Cost</em>' attribute.
	 * @see #getEstCost()
	 * @generated
	 */
	void setEstCost(float value);

	/**
	 * Returns the value of the '<em><b>Property Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Unit</em>' reference.
	 * @see #setPropertyUnit(PropertyUnit)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_PropertyUnit()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	PropertyUnit getPropertyUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit <em>Property Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Unit</em>' reference.
	 * @see #getPropertyUnit()
	 * @generated
	 */
	void setPropertyUnit(PropertyUnit value);

	/**
	 * Returns the value of the '<em><b>CU Labor Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Labor Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_CULaborItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	EList<CULaborItem> getCULaborItems();

	/**
	 * Returns the value of the '<em><b>CU Material Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Material Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_CUMaterialItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	EList<CUMaterialItem> getCUMaterialItems();

	/**
	 * Returns the value of the '<em><b>CU Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Group</em>' reference.
	 * @see #setCUGroup(CUGroup)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_CUGroup()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	CUGroup getCUGroup();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup <em>CU Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Group</em>' reference.
	 * @see #getCUGroup()
	 * @generated
	 */
	void setCUGroup(CUGroup value);

	/**
	 * Returns the value of the '<em><b>CU Work Equipment Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Work Equipment Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Work Equipment Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_CUWorkEquipmentItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	EList<CUWorkEquipmentItem> getCUWorkEquipmentItems();

	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CostType#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' reference.
	 * @see #setCostType(CostType)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_CostType()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CostType#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	CostType getCostType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCostType <em>Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' reference.
	 * @see #getCostType()
	 * @generated
	 */
	void setCostType(CostType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_Quantity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The quantity, unit of measure, and multiplier at the CU level that applies to the materials.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The quantity, unit of measure, and multiplier at the CU level that applies to the materials.'"
	 * @generated
	 */
	String getQuantity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(String value);

	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_Procedures()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	EList<Procedure> getProcedures();

	/**
	 * Returns the value of the '<em><b>CU Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CUAsset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_CUAssets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	EList<CUAsset> getCUAssets();

	/**
	 * Returns the value of the '<em><b>CU Allowable Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CUAllowableAction#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Allowable Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Allowable Action</em>' reference.
	 * @see #setCUAllowableAction(CUAllowableAction)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_CUAllowableAction()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CUAllowableAction#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	CUAllowableAction getCUAllowableAction();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction <em>CU Allowable Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Allowable Action</em>' reference.
	 * @see #getCUAllowableAction()
	 * @generated
	 */
	void setCUAllowableAction(CUAllowableAction value);

	/**
	 * Returns the value of the '<em><b>CU Contractor Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CUContractorItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CUContractorItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Contractor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Contractor Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit_CUContractorItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CUContractorItem#getCompatibleUnits
	 * @model opposite="CompatibleUnits"
	 * @generated
	 */
	EList<CUContractorItem> getCUContractorItems();

} // CompatibleUnit
