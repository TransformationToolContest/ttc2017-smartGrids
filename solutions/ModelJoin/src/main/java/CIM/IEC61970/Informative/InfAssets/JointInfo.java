/**
 */
package CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.JointInfo#getFillKind <em>Fill Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.JointInfo#getConfigurationKind <em>Configuration Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.JointInfo#getInsulation <em>Insulation</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getJointInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of joint asset that connects two or more cables. It includes the portion of cable under wipes, welds, or other seals.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of joint asset that connects two or more cables. It includes the portion of cable under wipes, welds, or other seals.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of joint asset that connects two or more cables. It includes the portion of cable under wipes, welds, or other seals.' Profile\040documentation='Properties of joint asset that connects two or more cables. It includes the portion of cable under wipes, welds, or other seals.'"
 * @generated
 */
public interface JointInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Fill Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.JointFillKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.JointFillKind
	 * @see #setFillKind(JointFillKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getJointInfo_FillKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Material used to fill the joint.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Material used to fill the joint.'"
	 * @generated
	 */
	JointFillKind getFillKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.JointInfo#getFillKind <em>Fill Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.JointFillKind
	 * @see #getFillKind()
	 * @generated
	 */
	void setFillKind(JointFillKind value);

	/**
	 * Returns the value of the '<em><b>Configuration Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.JointConfigurationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.JointConfigurationKind
	 * @see #setConfigurationKind(JointConfigurationKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getJointInfo_ConfigurationKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Configuration of joint.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Configuration of joint.'"
	 * @generated
	 */
	JointConfigurationKind getConfigurationKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.JointInfo#getConfigurationKind <em>Configuration Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.JointConfigurationKind
	 * @see #getConfigurationKind()
	 * @generated
	 */
	void setConfigurationKind(JointConfigurationKind value);

	/**
	 * Returns the value of the '<em><b>Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation</em>' attribute.
	 * @see #setInsulation(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getJointInfo_Insulation()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of insulation around the joint, classified according to the utility\'s asset management standards and practices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of insulation around the joint, classified according to the utility\'s asset management standards and practices.'"
	 * @generated
	 */
	String getInsulation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.JointInfo#getInsulation <em>Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation</em>' attribute.
	 * @see #getInsulation()
	 * @generated
	 */
	void setInsulation(String value);

} // JointInfo
