/**
 */
package CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVC Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.SVCInfo#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.SVCInfo#getInductiveRating <em>Inductive Rating</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSVCInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of SVC assets. Allows the capacitive and inductive ratings for each phase to be specified individually if required.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of SVC assets. Allows the capacitive and inductive ratings for each phase to be specified individually if required.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of SVC assets. Allows the capacitive and inductive ratings for each phase to be specified individually if required.' Profile\040documentation='Properties of SVC assets. Allows the capacitive and inductive ratings for each phase to be specified individually if required.'"
 * @generated
 */
public interface SVCInfo extends FACTSDeviceInfo {
	/**
	 * Returns the value of the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacitive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #setCapacitiveRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSVCInfo_CapacitiveRating()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum capacitive reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum capacitive reactive power'"
	 * @generated
	 */
	float getCapacitiveRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.SVCInfo#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #getCapacitiveRating()
	 * @generated
	 */
	void setCapacitiveRating(float value);

	/**
	 * Returns the value of the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inductive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inductive Rating</em>' attribute.
	 * @see #setInductiveRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSVCInfo_InductiveRating()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum inductive reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum inductive reactive power'"
	 * @generated
	 */
	float getInductiveRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.SVCInfo#getInductiveRating <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inductive Rating</em>' attribute.
	 * @see #getInductiveRating()
	 * @generated
	 */
	void setInductiveRating(float value);

} // SVCInfo
