/**
 */
package CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substation Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.SubstationInfo#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSubstationInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of substation asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of substation asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of substation asset.' Profile\040documentation='Properties of substation asset.'"
 * @generated
 */
public interface SubstationInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.SubstationFunctionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.SubstationFunctionKind
	 * @see #setFunction(SubstationFunctionKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSubstationInfo_Function()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Function of this substation asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Function of this substation asset.'"
	 * @generated
	 */
	SubstationFunctionKind getFunction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.SubstationInfo#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.SubstationFunctionKind
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(SubstationFunctionKind value);

} // SubstationInfo
