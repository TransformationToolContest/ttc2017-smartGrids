/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Material Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial <em>Type Material</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits <em>Property Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode <em>Corporate Code</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUMaterialItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Compatible unit of a consumable supply item. For example, nuts, bolts, brackets, glue, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Compatible unit of a consumable supply item. For example, nuts, bolts, brackets, glue, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Compatible unit of a consumable supply item. For example, nuts, bolts, brackets, glue, etc.' Profile\040documentation='Compatible unit of a consumable supply item. For example, nuts, bolts, brackets, glue, etc.'"
 * @generated
 */
public interface CUMaterialItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUMaterialItem_CompatibleUnits()
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems
	 * @model opposite="CUMaterialItems"
	 * @generated
	 */
	EList<CompatibleUnit> getCompatibleUnits();

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUMaterialItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Type Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Material</em>' reference.
	 * @see #setTypeMaterial(TypeMaterial)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUMaterialItem_TypeMaterial()
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems
	 * @model opposite="CUMaterialItems"
	 * @generated
	 */
	TypeMaterial getTypeMaterial();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Material</em>' reference.
	 * @see #getTypeMaterial()
	 * @generated
	 */
	void setTypeMaterial(TypeMaterial value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigInteger)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUMaterialItem_Quantity()
	 * @model dataType="CIM.IEC61970.Domain.IntegerQuantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quantity of the TypeMaterial for this CU, used to determine estimated costs based on a per unit cost or a cost per unit length specified in the TypeMaterial.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity of the TypeMaterial for this CU, used to determine estimated costs based on a per unit cost or a cost per unit length specified in the TypeMaterial.'"
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Property Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.PropertyUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUMaterialItem_PropertyUnits()
	 * @see CIM.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems
	 * @model opposite="CUMaterialItems"
	 * @generated
	 */
	EList<PropertyUnit> getPropertyUnits();

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUMaterialItem_CorporateCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Code for material.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Code for material.'"
	 * @generated
	 */
	String getCorporateCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #getCorporateCode()
	 * @generated
	 */
	void setCorporateCode(String value);

} // CUMaterialItem
