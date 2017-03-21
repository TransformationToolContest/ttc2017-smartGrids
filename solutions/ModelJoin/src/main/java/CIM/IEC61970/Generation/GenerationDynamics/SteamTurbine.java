/**
 */
package CIM.IEC61970.Generation.GenerationDynamics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steam Turbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamSupplys <em>Steam Supplys</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Steam turbine'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Steam turbine'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Steam turbine' Profile\040documentation='Steam turbine'"
 * @generated
 */
public interface SteamTurbine extends PrimeMover {
	/**
	 * Returns the value of the '<em><b>Shaft2 Power LP1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft2 Power LP1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft2 Power LP1</em>' attribute.
	 * @see #setShaft2PowerLP1(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Shaft2PowerLP1()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fraction Of Power From Shaft 2 First Low Pressure Turbine output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fraction Of Power From Shaft 2 First Low Pressure Turbine output'"
	 * @generated
	 */
	float getShaft2PowerLP1();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft2 Power LP1</em>' attribute.
	 * @see #getShaft2PowerLP1()
	 * @generated
	 */
	void setShaft2PowerLP1(float value);

	/**
	 * Returns the value of the '<em><b>Shaft2 Power LP2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft2 Power LP2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft2 Power LP2</em>' attribute.
	 * @see #setShaft2PowerLP2(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Shaft2PowerLP2()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fraction Of Power From Shaft 2 Second Low Pressure Turbine output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fraction Of Power From Shaft 2 Second Low Pressure Turbine output'"
	 * @generated
	 */
	float getShaft2PowerLP2();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft2 Power LP2</em>' attribute.
	 * @see #getShaft2PowerLP2()
	 * @generated
	 */
	void setShaft2PowerLP2(float value);

	/**
	 * Returns the value of the '<em><b>Steam Supplys</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.GenerationDynamics.SteamSupply}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamTurbines <em>Steam Turbines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Supplys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Supplys</em>' reference list.
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_SteamSupplys()
	 * @see CIM.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamTurbines
	 * @model opposite="SteamTurbines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Steam turbines may have steam supplied by a steam supply'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Steam turbines may have steam supplied by a steam supply'"
	 * @generated
	 */
	EList<SteamSupply> getSteamSupplys();

	/**
	 * Returns the value of the '<em><b>Shaft2 Power HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft2 Power HP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft2 Power HP</em>' attribute.
	 * @see #setShaft2PowerHP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Shaft2PowerHP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fraction Of Power From Shaft 2 High Pressure Turbine output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fraction Of Power From Shaft 2 High Pressure Turbine output'"
	 * @generated
	 */
	float getShaft2PowerHP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft2 Power HP</em>' attribute.
	 * @see #getShaft2PowerHP()
	 * @generated
	 */
	void setShaft2PowerHP(float value);

	/**
	 * Returns the value of the '<em><b>Shaft1 Power IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft1 Power IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft1 Power IP</em>' attribute.
	 * @see #setShaft1PowerIP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Shaft1PowerIP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fraction Of Power From Shaft 1 Intermediate Pressure Turbine output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fraction Of Power From Shaft 1 Intermediate Pressure Turbine output'"
	 * @generated
	 */
	float getShaft1PowerIP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft1 Power IP</em>' attribute.
	 * @see #getShaft1PowerIP()
	 * @generated
	 */
	void setShaft1PowerIP(float value);

	/**
	 * Returns the value of the '<em><b>Reheater1 TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reheater1 TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reheater1 TC</em>' attribute.
	 * @see #setReheater1TC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Reheater1TC()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='First Reheater Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='First Reheater Time Constant'"
	 * @generated
	 */
	float getReheater1TC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reheater1 TC</em>' attribute.
	 * @see #getReheater1TC()
	 * @generated
	 */
	void setReheater1TC(float value);

	/**
	 * Returns the value of the '<em><b>Shaft1 Power LP2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft1 Power LP2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft1 Power LP2</em>' attribute.
	 * @see #setShaft1PowerLP2(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Shaft1PowerLP2()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fraction Of Power From Shaft 1 Second Low Pressure Turbine output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fraction Of Power From Shaft 1 Second Low Pressure Turbine output'"
	 * @generated
	 */
	float getShaft1PowerLP2();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft1 Power LP2</em>' attribute.
	 * @see #getShaft1PowerLP2()
	 * @generated
	 */
	void setShaft1PowerLP2(float value);

	/**
	 * Returns the value of the '<em><b>Shaft1 Power LP1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft1 Power LP1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft1 Power LP1</em>' attribute.
	 * @see #setShaft1PowerLP1(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Shaft1PowerLP1()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fraction Of Power From Shaft 1 First Low Pressure Turbine output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fraction Of Power From Shaft 1 First Low Pressure Turbine output'"
	 * @generated
	 */
	float getShaft1PowerLP1();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft1 Power LP1</em>' attribute.
	 * @see #getShaft1PowerLP1()
	 * @generated
	 */
	void setShaft1PowerLP1(float value);

	/**
	 * Returns the value of the '<em><b>Crossover TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crossover TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossover TC</em>' attribute.
	 * @see #setCrossoverTC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_CrossoverTC()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Crossover Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Crossover Time Constant'"
	 * @generated
	 */
	float getCrossoverTC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossover TC</em>' attribute.
	 * @see #getCrossoverTC()
	 * @generated
	 */
	void setCrossoverTC(float value);

	/**
	 * Returns the value of the '<em><b>Steam Chest TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Chest TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Chest TC</em>' attribute.
	 * @see #setSteamChestTC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_SteamChestTC()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Steam Chest Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Steam Chest Time Constant'"
	 * @generated
	 */
	float getSteamChestTC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Chest TC</em>' attribute.
	 * @see #getSteamChestTC()
	 * @generated
	 */
	void setSteamChestTC(float value);

	/**
	 * Returns the value of the '<em><b>Shaft1 Power HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft1 Power HP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft1 Power HP</em>' attribute.
	 * @see #setShaft1PowerHP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Shaft1PowerHP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fraction Of Power From Shaft 1 High Pressure Turbine output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fraction Of Power From Shaft 1 High Pressure Turbine output'"
	 * @generated
	 */
	float getShaft1PowerHP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft1 Power HP</em>' attribute.
	 * @see #getShaft1PowerHP()
	 * @generated
	 */
	void setShaft1PowerHP(float value);

	/**
	 * Returns the value of the '<em><b>Shaft2 Power IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft2 Power IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft2 Power IP</em>' attribute.
	 * @see #setShaft2PowerIP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Shaft2PowerIP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fraction Of Power From Shaft 2 Intermediate Pressure Turbine output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fraction Of Power From Shaft 2 Intermediate Pressure Turbine output'"
	 * @generated
	 */
	float getShaft2PowerIP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft2 Power IP</em>' attribute.
	 * @see #getShaft2PowerIP()
	 * @generated
	 */
	void setShaft2PowerIP(float value);

	/**
	 * Returns the value of the '<em><b>Reheater2 TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reheater2 TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reheater2 TC</em>' attribute.
	 * @see #setReheater2TC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamTurbine_Reheater2TC()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Second Reheater Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Second Reheater Time Constant'"
	 * @generated
	 */
	float getReheater2TC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reheater2 TC</em>' attribute.
	 * @see #getReheater2TC()
	 * @generated
	 */
	void setReheater2TC(float value);

} // SteamTurbine
