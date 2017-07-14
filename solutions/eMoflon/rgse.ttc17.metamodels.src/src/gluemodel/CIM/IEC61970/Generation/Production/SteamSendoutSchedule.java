/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steam Sendout Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getSteamSendoutSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The cogeneration plant\'s steam sendout schedule in volume per time unit.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The cogeneration plant\'s steam sendout schedule in volume per time unit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The cogeneration plant\'s steam sendout schedule in volume per time unit.' Profile\040documentation='The cogeneration plant\'s steam sendout schedule in volume per time unit.'"
 * @generated
 */
public interface SteamSendoutSchedule extends RegularIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Cogeneration Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogeneration Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogeneration Plant</em>' reference.
	 * @see #setCogenerationPlant(CogenerationPlant)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getSteamSendoutSchedule_CogenerationPlant()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule
	 * @model opposite="SteamSendoutSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A cogeneration plant has a steam sendout schedule'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A cogeneration plant has a steam sendout schedule'"
	 * @generated
	 */
	CogenerationPlant getCogenerationPlant();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogeneration Plant</em>' reference.
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	void setCogenerationPlant(CogenerationPlant value);

} // SteamSendoutSchedule
