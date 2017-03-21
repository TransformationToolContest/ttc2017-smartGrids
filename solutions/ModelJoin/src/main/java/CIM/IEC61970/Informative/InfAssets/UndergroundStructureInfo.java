/**
 */
package CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Underground Structure Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getMaterial <em>Material</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#isHasVentilation <em>Has Ventilation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getSealingWarrantyExpiresDate <em>Sealing Warranty Expires Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getUndergroundStructureInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Underground structure.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Underground structure.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Underground structure.' Profile\040documentation='Underground structure.'"
 * @generated
 */
public interface UndergroundStructureInfo extends StructureInfo {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' attribute.
	 * @see #setMaterial(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getUndergroundStructureInfo_Material()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Primary material of underground structure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Primary material of underground structure.'"
	 * @generated
	 */
	String getMaterial();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getMaterial <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' attribute.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(String value);

	/**
	 * Returns the value of the '<em><b>Has Ventilation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ventilation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ventilation</em>' attribute.
	 * @see #setHasVentilation(boolean)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getUndergroundStructureInfo_HasVentilation()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if vault is ventilating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if vault is ventilating.'"
	 * @generated
	 */
	boolean isHasVentilation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#isHasVentilation <em>Has Ventilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Ventilation</em>' attribute.
	 * @see #isHasVentilation()
	 * @generated
	 */
	void setHasVentilation(boolean value);

	/**
	 * Returns the value of the '<em><b>Sealing Warranty Expires Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sealing Warranty Expires Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sealing Warranty Expires Date</em>' attribute.
	 * @see #setSealingWarrantyExpiresDate(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getUndergroundStructureInfo_SealingWarrantyExpiresDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date sealing warranty expires.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date sealing warranty expires.'"
	 * @generated
	 */
	String getSealingWarrantyExpiresDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getSealingWarrantyExpiresDate <em>Sealing Warranty Expires Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sealing Warranty Expires Date</em>' attribute.
	 * @see #getSealingWarrantyExpiresDate()
	 * @generated
	 */
	void setSealingWarrantyExpiresDate(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.UndergroundStructureKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.UndergroundStructureKind
	 * @see #setKind(UndergroundStructureKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getUndergroundStructureInfo_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if vault is ventilating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if vault is ventilating.'"
	 * @generated
	 */
	UndergroundStructureKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.UndergroundStructureKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UndergroundStructureKind value);

} // UndergroundStructureInfo
