/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode <em>Type Asset Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUAsset#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUAsset#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits <em>Compatible Units</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Compatible unit for various types of assets such as transformers switches, substation fences, poles, etc..'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Compatible unit for various types of assets such as transformers switches, substation fences, poles, etc..'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Compatible unit for various types of assets such as transformers switches, substation fences, poles, etc..' Profile\040documentation='Compatible unit for various types of assets such as transformers switches, substation fences, poles, etc..'"
 * @generated
 */
public interface CUAsset extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Type Asset Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset Code</em>' attribute.
	 * @see #setTypeAssetCode(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUAsset_TypeAssetCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The code for this type of asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The code for this type of asset.'"
	 * @generated
	 */
	String getTypeAssetCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode <em>Type Asset Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset Code</em>' attribute.
	 * @see #getTypeAssetCode()
	 * @generated
	 */
	void setTypeAssetCode(String value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUAsset_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUAsset#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUAsset <em>CU Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(TypeAsset)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUAsset_TypeAsset()
	 * @see CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUAsset
	 * @model opposite="CUAsset"
	 * @generated
	 */
	TypeAsset getTypeAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAsset <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset</em>' reference.
	 * @see #getTypeAsset()
	 * @generated
	 */
	void setTypeAsset(TypeAsset value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUAsset_Quantity()
	 * @model dataType="CIM.IEC61970.Domain.IntegerQuantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quantity of the type asset within the CU.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity of the type asset within the CU.'"
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUAsset#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets <em>CU Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUAsset_CompatibleUnits()
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets
	 * @model opposite="CUAssets"
	 * @generated
	 */
	EList<CompatibleUnit> getCompatibleUnits();

} // CUAsset
