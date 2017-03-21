/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Work Equipment Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode <em>Equip Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate <em>Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUWorkEquipmentItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Compatible unit for various types of WorkEquipmentAssets, including vehicles.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Compatible unit for various types of WorkEquipmentAssets, including vehicles.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Compatible unit for various types of WorkEquipmentAssets, including vehicles.' Profile\040documentation='Compatible unit for various types of WorkEquipmentAssets, including vehicles.'"
 * @generated
 */
public interface CUWorkEquipmentItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Equip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equip Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equip Code</em>' attribute.
	 * @see #setEquipCode(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUWorkEquipmentItem_EquipCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The equipment type code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equipment type code.'"
	 * @generated
	 */
	String getEquipCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode <em>Equip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equip Code</em>' attribute.
	 * @see #getEquipCode()
	 * @generated
	 */
	void setEquipCode(String value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUWorkEquipmentItem_Rate()
	 * @model dataType="CIM.IEC61970.Domain.CostRate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Standard usage rate for the type of vehicle.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Standard usage rate for the type of vehicle.'"
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUWorkEquipmentAsset <em>CU Work Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(TypeAsset)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUWorkEquipmentItem_TypeAsset()
	 * @see CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUWorkEquipmentAsset
	 * @model opposite="CUWorkEquipmentAsset"
	 * @generated
	 */
	TypeAsset getTypeAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset</em>' reference.
	 * @see #getTypeAsset()
	 * @generated
	 */
	void setTypeAsset(TypeAsset value);

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems <em>CU Work Equipment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUWorkEquipmentItem_CompatibleUnits()
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems
	 * @model opposite="CUWorkEquipmentItems"
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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUWorkEquipmentItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // CUWorkEquipmentItem
