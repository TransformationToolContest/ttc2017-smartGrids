/**
 */
package CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Switch Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode <em>Init Op Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGang <em>Gang</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount <em>Switch State Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote <em>Remote</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of a composite switch.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of a composite switch.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of a composite switch.' Profile\040documentation='Properties of a composite switch.'"
 * @generated
 */
public interface CompositeSwitchInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.CompositeSwitchKind
	 * @see #setKind(CompositeSwitchKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchInfo_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of composite switch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of composite switch.'"
	 * @generated
	 */
	CompositeSwitchKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.CompositeSwitchKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CompositeSwitchKind value);

	/**
	 * Returns the value of the '<em><b>Init Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Op Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Op Mode</em>' attribute.
	 * @see #setInitOpMode(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchInfo_InitOpMode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Initial operating mode, with the following values: Automatic, Manual.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Initial operating mode, with the following values: Automatic, Manual.'"
	 * @generated
	 */
	String getInitOpMode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode <em>Init Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Op Mode</em>' attribute.
	 * @see #getInitOpMode()
	 * @generated
	 */
	void setInitOpMode(String value);

	/**
	 * Returns the value of the '<em><b>Gang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gang</em>' attribute.
	 * @see #setGang(boolean)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchInfo_Gang()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if multi-phase switch controls all phases concurrently.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if multi-phase switch controls all phases concurrently.'"
	 * @generated
	 */
	boolean isGang();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGang <em>Gang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gang</em>' attribute.
	 * @see #isGang()
	 * @generated
	 */
	void setGang(boolean value);

	/**
	 * Returns the value of the '<em><b>Switch State Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch State Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch State Count</em>' attribute.
	 * @see #setSwitchStateCount(int)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchInfo_SwitchStateCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of switch states represented by the composite switch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of switch states represented by the composite switch.'"
	 * @generated
	 */
	int getSwitchStateCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount <em>Switch State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch State Count</em>' attribute.
	 * @see #getSwitchStateCount()
	 * @generated
	 */
	void setSwitchStateCount(int value);

	/**
	 * Returns the value of the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupting Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupting Rating</em>' attribute.
	 * @see #setInterruptingRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchInfo_InterruptingRating()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Breaking capacity, or short circuit rating, is the maximum rated current which the device can safely interrupt at the rated voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Breaking capacity, or short circuit rating, is the maximum rated current which the device can safely interrupt at the rated voltage.'"
	 * @generated
	 */
	float getInterruptingRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupting Rating</em>' attribute.
	 * @see #getInterruptingRating()
	 * @generated
	 */
	void setInterruptingRating(float value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' attribute.
	 * @see #setRemote(boolean)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchInfo_Remote()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if device is capable of being operated by remote control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if device is capable of being operated by remote control.'"
	 * @generated
	 */
	boolean isRemote();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' attribute.
	 * @see #isRemote()
	 * @generated
	 */
	void setRemote(boolean value);

} // CompositeSwitchInfo
