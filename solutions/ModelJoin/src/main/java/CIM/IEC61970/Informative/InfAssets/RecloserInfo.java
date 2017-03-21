/**
 */
package CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recloser Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating <em>Phase Trip Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled <em>Ground Trip Normal Enabled</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating <em>Ground Trip Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount <em>Reclose Lockout Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable <em>Ground Trip Capable</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getRecloserInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of recloser assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of recloser assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of recloser assets.' Profile\040documentation='Properties of recloser assets.'"
 * @generated
 */
public interface RecloserInfo extends SwitchInfo {
	/**
	 * Returns the value of the '<em><b>Phase Trip Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Trip Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Trip Rating</em>' attribute.
	 * @see #setPhaseTripRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getRecloserInfo_PhaseTripRating()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase trip rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase trip rating.'"
	 * @generated
	 */
	float getPhaseTripRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating <em>Phase Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Trip Rating</em>' attribute.
	 * @see #getPhaseTripRating()
	 * @generated
	 */
	void setPhaseTripRating(float value);

	/**
	 * Returns the value of the '<em><b>Ground Trip Normal Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Trip Normal Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Trip Normal Enabled</em>' attribute.
	 * @see #setGroundTripNormalEnabled(boolean)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getRecloserInfo_GroundTripNormalEnabled()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if normal status of ground trip is enabled.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if normal status of ground trip is enabled.'"
	 * @generated
	 */
	boolean isGroundTripNormalEnabled();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled <em>Ground Trip Normal Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Trip Normal Enabled</em>' attribute.
	 * @see #isGroundTripNormalEnabled()
	 * @generated
	 */
	void setGroundTripNormalEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Ground Trip Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Trip Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Trip Rating</em>' attribute.
	 * @see #setGroundTripRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getRecloserInfo_GroundTripRating()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ground trip rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ground trip rating.'"
	 * @generated
	 */
	float getGroundTripRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating <em>Ground Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Trip Rating</em>' attribute.
	 * @see #getGroundTripRating()
	 * @generated
	 */
	void setGroundTripRating(float value);

	/**
	 * Returns the value of the '<em><b>Reclose Lockout Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reclose Lockout Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reclose Lockout Count</em>' attribute.
	 * @see #setRecloseLockoutCount(int)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getRecloserInfo_RecloseLockoutCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total number of phase reclose operations.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total number of phase reclose operations.'"
	 * @generated
	 */
	int getRecloseLockoutCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount <em>Reclose Lockout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reclose Lockout Count</em>' attribute.
	 * @see #getRecloseLockoutCount()
	 * @generated
	 */
	void setRecloseLockoutCount(int value);

	/**
	 * Returns the value of the '<em><b>Ground Trip Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Trip Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Trip Capable</em>' attribute.
	 * @see #setGroundTripCapable(boolean)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getRecloserInfo_GroundTripCapable()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if device has ground trip capability.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if device has ground trip capability.'"
	 * @generated
	 */
	boolean isGroundTripCapable();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable <em>Ground Trip Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Trip Capable</em>' attribute.
	 * @see #isGroundTripCapable()
	 * @generated
	 */
	void setGroundTripCapable(boolean value);

} // RecloserInfo
