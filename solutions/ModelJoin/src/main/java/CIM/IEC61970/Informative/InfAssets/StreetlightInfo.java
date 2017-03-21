/**
 */
package CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streetlight Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getLightRating <em>Light Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getArmLength <em>Arm Length</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getPole <em>Pole</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getLampKind <em>Lamp Kind</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStreetlightInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of streetlight asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of streetlight asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of streetlight asset.' Profile\040documentation='Properties of streetlight asset.'"
 * @generated
 */
public interface StreetlightInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Light Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Rating</em>' attribute.
	 * @see #setLightRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStreetlightInfo_LightRating()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Power rating of light.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Power rating of light.'"
	 * @generated
	 */
	float getLightRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getLightRating <em>Light Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Rating</em>' attribute.
	 * @see #getLightRating()
	 * @generated
	 */
	void setLightRating(float value);

	/**
	 * Returns the value of the '<em><b>Arm Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arm Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arm Length</em>' attribute.
	 * @see #setArmLength(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStreetlightInfo_ArmLength()
	 * @model dataType="CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Length of arm. Note that a new light may be placed on an existing arm.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Length of arm. Note that a new light may be placed on an existing arm.'"
	 * @generated
	 */
	float getArmLength();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getArmLength <em>Arm Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arm Length</em>' attribute.
	 * @see #getArmLength()
	 * @generated
	 */
	void setArmLength(float value);

	/**
	 * Returns the value of the '<em><b>Pole</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.PoleInfo#getStreetlights <em>Streetlights</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pole</em>' reference.
	 * @see #setPole(PoleInfo)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStreetlightInfo_Pole()
	 * @see CIM.IEC61970.Informative.InfAssets.PoleInfo#getStreetlights
	 * @model opposite="Streetlights"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Streetlight(s) may be attached to a pole.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Streetlight(s) may be attached to a pole.'"
	 * @generated
	 */
	PoleInfo getPole();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getPole <em>Pole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pole</em>' reference.
	 * @see #getPole()
	 * @generated
	 */
	void setPole(PoleInfo value);

	/**
	 * Returns the value of the '<em><b>Lamp Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.StreetlightLampKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lamp Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lamp Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.StreetlightLampKind
	 * @see #setLampKind(StreetlightLampKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStreetlightInfo_LampKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Lamp kind.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Lamp kind.'"
	 * @generated
	 */
	StreetlightLampKind getLampKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getLampKind <em>Lamp Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lamp Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.StreetlightLampKind
	 * @see #getLampKind()
	 * @generated
	 */
	void setLampKind(StreetlightLampKind value);

} // StreetlightInfo
