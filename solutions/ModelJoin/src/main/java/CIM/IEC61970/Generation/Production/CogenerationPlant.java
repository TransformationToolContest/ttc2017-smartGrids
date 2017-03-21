/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cogeneration Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getRatedP <em>Rated P</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A set of thermal generating units for the production of electrical energy and process steam (usually from the output of the steam turbines). The steam sendout is typically used for industrial purposes or for municipal heating and cooling.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A set of thermal generating units for the production of electrical energy and process steam (usually from the output of the steam turbines). The steam sendout is typically used for industrial purposes or for municipal heating and cooling.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A set of thermal generating units for the production of electrical energy and process steam (usually from the output of the steam turbines). The steam sendout is typically used for industrial purposes or for municipal heating and cooling.' Profile\040documentation='A set of thermal generating units for the production of electrical energy and process steam (usually from the output of the steam turbines). The steam sendout is typically used for industrial purposes or for municipal heating and cooling.'"
 * @generated
 */
public interface CogenerationPlant extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Cogen LP Steam Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogen LP Steam Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogen LP Steam Rating</em>' attribute.
	 * @see #setCogenLPSteamRating(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant_CogenLPSteamRating()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The low pressure steam rating'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The low pressure steam rating'"
	 * @generated
	 */
	float getCogenLPSteamRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogen LP Steam Rating</em>' attribute.
	 * @see #getCogenLPSteamRating()
	 * @generated
	 */
	void setCogenLPSteamRating(float value);

	/**
	 * Returns the value of the '<em><b>Cogen HP Steam Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogen HP Steam Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogen HP Steam Rating</em>' attribute.
	 * @see #setCogenHPSteamRating(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant_CogenHPSteamRating()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The high pressure steam rating'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The high pressure steam rating'"
	 * @generated
	 */
	float getCogenHPSteamRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogen HP Steam Rating</em>' attribute.
	 * @see #getCogenHPSteamRating()
	 * @generated
	 */
	void setCogenHPSteamRating(float value);

	/**
	 * Returns the value of the '<em><b>Steam Sendout Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Sendout Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Sendout Schedule</em>' reference.
	 * @see #setSteamSendoutSchedule(SteamSendoutSchedule)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant_SteamSendoutSchedule()
	 * @see CIM.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant
	 * @model opposite="CogenerationPlant"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A cogeneration plant has a steam sendout schedule'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A cogeneration plant has a steam sendout schedule'"
	 * @generated
	 */
	SteamSendoutSchedule getSteamSendoutSchedule();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Sendout Schedule</em>' reference.
	 * @see #getSteamSendoutSchedule()
	 * @generated
	 */
	void setSteamSendoutSchedule(SteamSendoutSchedule value);

	/**
	 * Returns the value of the '<em><b>Cogen HP Sendout Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogen HP Sendout Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogen HP Sendout Rating</em>' attribute.
	 * @see #setCogenHPSendoutRating(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant_CogenHPSendoutRating()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The high pressure steam sendout'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The high pressure steam sendout'"
	 * @generated
	 */
	float getCogenHPSendoutRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogen HP Sendout Rating</em>' attribute.
	 * @see #getCogenHPSendoutRating()
	 * @generated
	 */
	void setCogenHPSendoutRating(float value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Units</em>' reference list.
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant_ThermalGeneratingUnits()
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant
	 * @model opposite="CogenerationPlant"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may be a member of a cogeneration plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may be a member of a cogeneration plant'"
	 * @generated
	 */
	EList<ThermalGeneratingUnit> getThermalGeneratingUnits();

	/**
	 * Returns the value of the '<em><b>Cogen LP Sendout Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogen LP Sendout Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogen LP Sendout Rating</em>' attribute.
	 * @see #setCogenLPSendoutRating(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant_CogenLPSendoutRating()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The low pressure steam sendout'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The low pressure steam sendout'"
	 * @generated
	 */
	float getCogenLPSendoutRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogen LP Sendout Rating</em>' attribute.
	 * @see #getCogenLPSendoutRating()
	 * @generated
	 */
	void setCogenLPSendoutRating(float value);

	/**
	 * Returns the value of the '<em><b>Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated P</em>' attribute.
	 * @see #setRatedP(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant_RatedP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The rated output active power of the cogeneration plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The rated output active power of the cogeneration plant'"
	 * @generated
	 */
	float getRatedP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getRatedP <em>Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated P</em>' attribute.
	 * @see #getRatedP()
	 * @generated
	 */
	void setRatedP(float value);

} // CogenerationPlant
