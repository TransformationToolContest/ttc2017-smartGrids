/**
 */
package CIM.IEC61968.Assets;

import CIM.IEC61970.Core.IdentifiedObject;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Assets.Seal#getCondition <em>Condition</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.Seal#getSealNumber <em>Seal Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.Seal#getAppliedDateTime <em>Applied Date Time</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.Seal#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.Seal#getAssetContainer <em>Asset Container</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Assets.AssetsPackage#getSeal()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Physically controls access to AssetContainers.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Physically controls access to AssetContainers.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Physically controls access to AssetContainers.' Profile\040documentation='Physically controls access to AssetContainers.'"
 * @generated
 */
public interface Seal extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.Assets.SealConditionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see CIM.IEC61968.Assets.SealConditionKind
	 * @see #setCondition(SealConditionKind)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getSeal_Condition()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Condition of seal.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Condition of seal.'"
	 * @generated
	 */
	SealConditionKind getCondition();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.Seal#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see CIM.IEC61968.Assets.SealConditionKind
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(SealConditionKind value);

	/**
	 * Returns the value of the '<em><b>Seal Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seal Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seal Number</em>' attribute.
	 * @see #setSealNumber(String)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getSeal_SealNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(reserved word) Seal number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(reserved word) Seal number.'"
	 * @generated
	 */
	String getSealNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.Seal#getSealNumber <em>Seal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seal Number</em>' attribute.
	 * @see #getSealNumber()
	 * @generated
	 */
	void setSealNumber(String value);

	/**
	 * Returns the value of the '<em><b>Applied Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Date Time</em>' attribute.
	 * @see #setAppliedDateTime(Date)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getSeal_AppliedDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time this seal has been applied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time this seal has been applied.'"
	 * @generated
	 */
	Date getAppliedDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.Seal#getAppliedDateTime <em>Applied Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Date Time</em>' attribute.
	 * @see #getAppliedDateTime()
	 * @generated
	 */
	void setAppliedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.Assets.SealKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.Assets.SealKind
	 * @see #setKind(SealKind)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getSeal_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of seal.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of seal.'"
	 * @generated
	 */
	SealKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.Seal#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.Assets.SealKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SealKind value);

	/**
	 * Returns the value of the '<em><b>Asset Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.AssetContainer#getSeals <em>Seals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Container</em>' reference.
	 * @see #setAssetContainer(AssetContainer)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getSeal_AssetContainer()
	 * @see CIM.IEC61968.Assets.AssetContainer#getSeals
	 * @model opposite="Seals"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Asset container to which this seal is applied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Asset container to which this seal is applied.'"
	 * @generated
	 */
	AssetContainer getAssetContainer();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.Seal#getAssetContainer <em>Asset Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Container</em>' reference.
	 * @see #getAssetContainer()
	 * @generated
	 */
	void setAssetContainer(AssetContainer value);

} // Seal
