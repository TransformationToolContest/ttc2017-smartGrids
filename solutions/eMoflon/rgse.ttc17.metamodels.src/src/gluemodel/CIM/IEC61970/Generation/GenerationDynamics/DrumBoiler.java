/**
 */
package gluemodel.CIM.IEC61970.Generation.GenerationDynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drum Boiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getDrumBoiler()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Drum boiler'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Drum boiler'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Drum boiler' Profile\040documentation='Drum boiler'"
 * @generated
 */
public interface DrumBoiler extends FossilSteamSupply {
	/**
	 * Returns the value of the '<em><b>Drum Boiler Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drum Boiler Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drum Boiler Rating</em>' attribute.
	 * @see #setDrumBoilerRating(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getDrumBoiler_DrumBoilerRating()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rating of drum boiler in steam units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rating of drum boiler in steam units'"
	 * @generated
	 */
	float getDrumBoilerRating();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drum Boiler Rating</em>' attribute.
	 * @see #getDrumBoilerRating()
	 * @generated
	 */
	void setDrumBoilerRating(float value);

} // DrumBoiler
