/**
 */
package CIM.IEC61970.Generation.GenerationDynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Turbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineType <em>Turbine Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRating <em>Speed Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A water driven prime mover. Typical turbine types are: Francis, Kaplan, and Pelton.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A water driven prime mover. Typical turbine types are: Francis, Kaplan, and Pelton.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A water driven prime mover. Typical turbine types are: Francis, Kaplan, and Pelton.' Profile\040documentation='A water driven prime mover. Typical turbine types are: Francis, Kaplan, and Pelton.'"
 * @generated
 */
public interface HydroTurbine extends PrimeMover {
	/**
	 * Returns the value of the '<em><b>Max Head Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Head Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Head Max P</em>' attribute.
	 * @see #setMaxHeadMaxP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_MaxHeadMaxP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum efficiency active power at maximum head conditions'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum efficiency active power at maximum head conditions'"
	 * @generated
	 */
	float getMaxHeadMaxP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Head Max P</em>' attribute.
	 * @see #getMaxHeadMaxP()
	 * @generated
	 */
	void setMaxHeadMaxP(float value);

	/**
	 * Returns the value of the '<em><b>Transient Droop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Droop Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Droop Time</em>' attribute.
	 * @see #setTransientDroopTime(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_TransientDroopTime()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transient Droop Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transient Droop Time Constant'"
	 * @generated
	 */
	float getTransientDroopTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Droop Time</em>' attribute.
	 * @see #getTransientDroopTime()
	 * @generated
	 */
	void setTransientDroopTime(float value);

	/**
	 * Returns the value of the '<em><b>Gate Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate Upper Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate Upper Limit</em>' attribute.
	 * @see #setGateUpperLimit(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_GateUpperLimit()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Gate Upper Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Gate Upper Limit'"
	 * @generated
	 */
	float getGateUpperLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate Upper Limit</em>' attribute.
	 * @see #getGateUpperLimit()
	 * @generated
	 */
	void setGateUpperLimit(float value);

	/**
	 * Returns the value of the '<em><b>Min Head Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Head Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Head Max P</em>' attribute.
	 * @see #setMinHeadMaxP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_MinHeadMaxP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum efficiency active power at minimum head conditions'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum efficiency active power at minimum head conditions'"
	 * @generated
	 */
	float getMinHeadMaxP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Head Max P</em>' attribute.
	 * @see #getMinHeadMaxP()
	 * @generated
	 */
	void setMinHeadMaxP(float value);

	/**
	 * Returns the value of the '<em><b>Turbine Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turbine Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turbine Rating</em>' attribute.
	 * @see #setTurbineRating(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_TurbineRating()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated turbine active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated turbine active power'"
	 * @generated
	 */
	float getTurbineRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turbine Rating</em>' attribute.
	 * @see #getTurbineRating()
	 * @generated
	 */
	void setTurbineRating(float value);

	/**
	 * Returns the value of the '<em><b>Turbine Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Generation.GenerationDynamics.TurbineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turbine Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turbine Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.GenerationDynamics.TurbineType
	 * @see #setTurbineType(TurbineType)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_TurbineType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of turbine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of turbine.'"
	 * @generated
	 */
	TurbineType getTurbineType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineType <em>Turbine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turbine Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.GenerationDynamics.TurbineType
	 * @see #getTurbineType()
	 * @generated
	 */
	void setTurbineType(TurbineType value);

	/**
	 * Returns the value of the '<em><b>Speed Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Rating</em>' attribute.
	 * @see #setSpeedRating(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_SpeedRating()
	 * @model dataType="CIM.IEC61970.Domain.RotationSpeed" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated speed in number of revolutions.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated speed in number of revolutions.'"
	 * @generated
	 */
	float getSpeedRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRating <em>Speed Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Rating</em>' attribute.
	 * @see #getSpeedRating()
	 * @generated
	 */
	void setSpeedRating(float value);

	/**
	 * Returns the value of the '<em><b>Gate Rate Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate Rate Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate Rate Limit</em>' attribute.
	 * @see #setGateRateLimit(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_GateRateLimit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Gate Rate Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Gate Rate Limit'"
	 * @generated
	 */
	float getGateRateLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate Rate Limit</em>' attribute.
	 * @see #getGateRateLimit()
	 * @generated
	 */
	void setGateRateLimit(float value);

	/**
	 * Returns the value of the '<em><b>Water Starting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Starting Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Starting Time</em>' attribute.
	 * @see #setWaterStartingTime(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_WaterStartingTime()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Water Starting Time'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Water Starting Time'"
	 * @generated
	 */
	float getWaterStartingTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Starting Time</em>' attribute.
	 * @see #getWaterStartingTime()
	 * @generated
	 */
	void setWaterStartingTime(float value);

	/**
	 * Returns the value of the '<em><b>Transient Regulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Regulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Regulation</em>' attribute.
	 * @see #setTransientRegulation(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_TransientRegulation()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transient Regulation'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transient Regulation'"
	 * @generated
	 */
	float getTransientRegulation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Regulation</em>' attribute.
	 * @see #getTransientRegulation()
	 * @generated
	 */
	void setTransientRegulation(float value);

	/**
	 * Returns the value of the '<em><b>Speed Regulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Regulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Regulation</em>' attribute.
	 * @see #setSpeedRegulation(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHydroTurbine_SpeedRegulation()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Speed Regulation'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Speed Regulation'"
	 * @generated
	 */
	float getSpeedRegulation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Regulation</em>' attribute.
	 * @see #getSpeedRegulation()
	 * @generated
	 */
	void setSpeedRegulation(float value);

} // HydroTurbine
