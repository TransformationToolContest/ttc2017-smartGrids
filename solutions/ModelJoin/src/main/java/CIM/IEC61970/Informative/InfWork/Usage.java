/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset <em>Work Equipment Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Usage#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Usage#getMaterialItem <em>Material Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Usage#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getUsage()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The way material and assets are used to perform a certain type of work task. The way is described in text in the inheritied description attribute.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The way material and assets are used to perform a certain type of work task. The way is described in text in the inheritied description attribute.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The way material and assets are used to perform a certain type of work task. The way is described in text in the inheritied description attribute.' Profile\040documentation='The way material and assets are used to perform a certain type of work task. The way is described in text in the inheritied description attribute.'"
 * @generated
 */
public interface Usage extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Work Equipment Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Equipment Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Equipment Asset</em>' reference.
	 * @see #setWorkEquipmentAsset(WorkEquipmentInfo)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getUsage_WorkEquipmentAsset()
	 * @see CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getUsages
	 * @model opposite="Usages"
	 * @generated
	 */
	WorkEquipmentInfo getWorkEquipmentAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset <em>Work Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Equipment Asset</em>' reference.
	 * @see #getWorkEquipmentAsset()
	 * @generated
	 */
	void setWorkEquipmentAsset(WorkEquipmentInfo value);

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getUsage_WorkTask()
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getUsages
	 * @model opposite="Usages"
	 * @generated
	 */
	WorkTask getWorkTask();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Usage#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	void setWorkTask(WorkTask value);

	/**
	 * Returns the value of the '<em><b>Material Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Item</em>' reference.
	 * @see #setMaterialItem(MaterialItem)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getUsage_MaterialItem()
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getUsages
	 * @model opposite="Usages"
	 * @generated
	 */
	MaterialItem getMaterialItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Usage#getMaterialItem <em>Material Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Item</em>' reference.
	 * @see #getMaterialItem()
	 * @generated
	 */
	void setMaterialItem(MaterialItem value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getUsage_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Usage#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // Usage
