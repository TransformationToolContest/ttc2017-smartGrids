/**
 */
package gluemodel.CIM.IEC61970.Generation.GenerationDynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PWR Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegToColdLegGain <em>Hot Leg To Cold Leg Gain</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getPressureCG <em>Pressure CG</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegLagTC <em>Hot Leg Lag TC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureDropLagTC <em>Steam Pressure Drop Lag TC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC2 <em>Cold Leg FB Lead TC2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC1 <em>Cold Leg FB Lead TC1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegLagTC <em>Cold Leg Lag TC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamFlowFG <em>Steam Flow FG</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC2 <em>Core HT Lag TC2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC1 <em>Core HT Lag TC1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsEffTC <em>Core Neutronics Eff TC</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureFG <em>Steam Pressure FG</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getFeedbackFactor <em>Feedback Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegSteamGain <em>Hot Leg Steam Gain</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsHT <em>Core Neutronics HT</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG1 <em>Cold Leg FG1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG2 <em>Cold Leg FG2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureFactor <em>Throttle Pressure Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLagTC <em>Cold Leg FB Lag TC</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressurized water reactor used as a steam supply to a steam turbine'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Pressurized water reactor used as a steam supply to a steam turbine'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressurized water reactor used as a steam supply to a steam turbine' Profile\040documentation='Pressurized water reactor used as a steam supply to a steam turbine'"
 * @generated
 */
public interface PWRSteamSupply extends SteamSupply {
	/**
	 * Returns the value of the '<em><b>Hot Leg To Cold Leg Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Leg To Cold Leg Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Leg To Cold Leg Gain</em>' attribute.
	 * @see #setHotLegToColdLegGain(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_HotLegToColdLegGain()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Hot Leg To Cold Leg Gain'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Hot Leg To Cold Leg Gain'"
	 * @generated
	 */
	float getHotLegToColdLegGain();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegToColdLegGain <em>Hot Leg To Cold Leg Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Leg To Cold Leg Gain</em>' attribute.
	 * @see #getHotLegToColdLegGain()
	 * @generated
	 */
	void setHotLegToColdLegGain(float value);

	/**
	 * Returns the value of the '<em><b>Pressure CG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure CG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure CG</em>' attribute.
	 * @see #setPressureCG(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_PressureCG()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Control Gain'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Control Gain'"
	 * @generated
	 */
	float getPressureCG();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getPressureCG <em>Pressure CG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure CG</em>' attribute.
	 * @see #getPressureCG()
	 * @generated
	 */
	void setPressureCG(float value);

	/**
	 * Returns the value of the '<em><b>Hot Leg Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Leg Lag TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Leg Lag TC</em>' attribute.
	 * @see #setHotLegLagTC(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_HotLegLagTC()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Hot Leg Lag Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Hot Leg Lag Time Constant'"
	 * @generated
	 */
	float getHotLegLagTC();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegLagTC <em>Hot Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Leg Lag TC</em>' attribute.
	 * @see #getHotLegLagTC()
	 * @generated
	 */
	void setHotLegLagTC(float value);

	/**
	 * Returns the value of the '<em><b>Steam Pressure Drop Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Pressure Drop Lag TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Pressure Drop Lag TC</em>' attribute.
	 * @see #setSteamPressureDropLagTC(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_SteamPressureDropLagTC()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Steam Pressure Drop Lag Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Steam Pressure Drop Lag Time Constant'"
	 * @generated
	 */
	float getSteamPressureDropLagTC();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureDropLagTC <em>Steam Pressure Drop Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Pressure Drop Lag TC</em>' attribute.
	 * @see #getSteamPressureDropLagTC()
	 * @generated
	 */
	void setSteamPressureDropLagTC(float value);

	/**
	 * Returns the value of the '<em><b>Throttle Pressure SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle Pressure SP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle Pressure SP</em>' attribute.
	 * @see #setThrottlePressureSP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_ThrottlePressureSP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Throttle Pressure Setpoint'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Throttle Pressure Setpoint'"
	 * @generated
	 */
	float getThrottlePressureSP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttle Pressure SP</em>' attribute.
	 * @see #getThrottlePressureSP()
	 * @generated
	 */
	void setThrottlePressureSP(float value);

	/**
	 * Returns the value of the '<em><b>Cold Leg FB Lead TC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FB Lead TC2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FB Lead TC2</em>' attribute.
	 * @see #setColdLegFBLeadTC2(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_ColdLegFBLeadTC2()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cold Leg Feedback Lead Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cold Leg Feedback Lead Time Constant'"
	 * @generated
	 */
	float getColdLegFBLeadTC2();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC2 <em>Cold Leg FB Lead TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FB Lead TC2</em>' attribute.
	 * @see #getColdLegFBLeadTC2()
	 * @generated
	 */
	void setColdLegFBLeadTC2(float value);

	/**
	 * Returns the value of the '<em><b>Cold Leg FB Lead TC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FB Lead TC1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FB Lead TC1</em>' attribute.
	 * @see #setColdLegFBLeadTC1(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_ColdLegFBLeadTC1()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cold Leg Feedback Lead Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cold Leg Feedback Lead Time Constant'"
	 * @generated
	 */
	float getColdLegFBLeadTC1();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC1 <em>Cold Leg FB Lead TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FB Lead TC1</em>' attribute.
	 * @see #getColdLegFBLeadTC1()
	 * @generated
	 */
	void setColdLegFBLeadTC1(float value);

	/**
	 * Returns the value of the '<em><b>Cold Leg Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg Lag TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg Lag TC</em>' attribute.
	 * @see #setColdLegLagTC(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_ColdLegLagTC()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cold Leg Lag Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cold Leg Lag Time Constant'"
	 * @generated
	 */
	float getColdLegLagTC();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegLagTC <em>Cold Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg Lag TC</em>' attribute.
	 * @see #getColdLegLagTC()
	 * @generated
	 */
	void setColdLegLagTC(float value);

	/**
	 * Returns the value of the '<em><b>Steam Flow FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Flow FG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Flow FG</em>' attribute.
	 * @see #setSteamFlowFG(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_SteamFlowFG()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Steam Flow Feedback Gain'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Steam Flow Feedback Gain'"
	 * @generated
	 */
	float getSteamFlowFG();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamFlowFG <em>Steam Flow FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Flow FG</em>' attribute.
	 * @see #getSteamFlowFG()
	 * @generated
	 */
	void setSteamFlowFG(float value);

	/**
	 * Returns the value of the '<em><b>Core HT Lag TC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core HT Lag TC2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core HT Lag TC2</em>' attribute.
	 * @see #setCoreHTLagTC2(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_CoreHTLagTC2()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Core Heat Transfer Lag Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Core Heat Transfer Lag Time Constant'"
	 * @generated
	 */
	float getCoreHTLagTC2();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC2 <em>Core HT Lag TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core HT Lag TC2</em>' attribute.
	 * @see #getCoreHTLagTC2()
	 * @generated
	 */
	void setCoreHTLagTC2(float value);

	/**
	 * Returns the value of the '<em><b>Core HT Lag TC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core HT Lag TC1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core HT Lag TC1</em>' attribute.
	 * @see #setCoreHTLagTC1(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_CoreHTLagTC1()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Core Heat Transfer Lag Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Core Heat Transfer Lag Time Constant'"
	 * @generated
	 */
	float getCoreHTLagTC1();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC1 <em>Core HT Lag TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core HT Lag TC1</em>' attribute.
	 * @see #getCoreHTLagTC1()
	 * @generated
	 */
	void setCoreHTLagTC1(float value);

	/**
	 * Returns the value of the '<em><b>Core Neutronics Eff TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Neutronics Eff TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Neutronics Eff TC</em>' attribute.
	 * @see #setCoreNeutronicsEffTC(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_CoreNeutronicsEffTC()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Core Neutronics Effective Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Core Neutronics Effective Time Constant'"
	 * @generated
	 */
	float getCoreNeutronicsEffTC();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsEffTC <em>Core Neutronics Eff TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Neutronics Eff TC</em>' attribute.
	 * @see #getCoreNeutronicsEffTC()
	 * @generated
	 */
	void setCoreNeutronicsEffTC(float value);

	/**
	 * Returns the value of the '<em><b>Steam Pressure FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Pressure FG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Pressure FG</em>' attribute.
	 * @see #setSteamPressureFG(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_SteamPressureFG()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Steam Pressure Feedback Gain'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Steam Pressure Feedback Gain'"
	 * @generated
	 */
	float getSteamPressureFG();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureFG <em>Steam Pressure FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Pressure FG</em>' attribute.
	 * @see #getSteamPressureFG()
	 * @generated
	 */
	void setSteamPressureFG(float value);

	/**
	 * Returns the value of the '<em><b>Feedback Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Factor</em>' attribute.
	 * @see #setFeedbackFactor(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_FeedbackFactor()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Feedback Factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Feedback Factor'"
	 * @generated
	 */
	float getFeedbackFactor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getFeedbackFactor <em>Feedback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Factor</em>' attribute.
	 * @see #getFeedbackFactor()
	 * @generated
	 */
	void setFeedbackFactor(float value);

	/**
	 * Returns the value of the '<em><b>Hot Leg Steam Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Leg Steam Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Leg Steam Gain</em>' attribute.
	 * @see #setHotLegSteamGain(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_HotLegSteamGain()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Hot Leg Steam Gain'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Hot Leg Steam Gain'"
	 * @generated
	 */
	float getHotLegSteamGain();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegSteamGain <em>Hot Leg Steam Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Leg Steam Gain</em>' attribute.
	 * @see #getHotLegSteamGain()
	 * @generated
	 */
	void setHotLegSteamGain(float value);

	/**
	 * Returns the value of the '<em><b>Core Neutronics HT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Neutronics HT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Neutronics HT</em>' attribute.
	 * @see #setCoreNeutronicsHT(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_CoreNeutronicsHT()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Core Neutronics And Heat Transfer'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Core Neutronics And Heat Transfer'"
	 * @generated
	 */
	float getCoreNeutronicsHT();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsHT <em>Core Neutronics HT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Neutronics HT</em>' attribute.
	 * @see #getCoreNeutronicsHT()
	 * @generated
	 */
	void setCoreNeutronicsHT(float value);

	/**
	 * Returns the value of the '<em><b>Cold Leg FG1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FG1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FG1</em>' attribute.
	 * @see #setColdLegFG1(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_ColdLegFG1()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cold Leg Feedback Gain 1'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cold Leg Feedback Gain 1'"
	 * @generated
	 */
	float getColdLegFG1();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG1 <em>Cold Leg FG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FG1</em>' attribute.
	 * @see #getColdLegFG1()
	 * @generated
	 */
	void setColdLegFG1(float value);

	/**
	 * Returns the value of the '<em><b>Cold Leg FG2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FG2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FG2</em>' attribute.
	 * @see #setColdLegFG2(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_ColdLegFG2()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cold Leg Feedback Gain 2'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cold Leg Feedback Gain 2'"
	 * @generated
	 */
	float getColdLegFG2();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG2 <em>Cold Leg FG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FG2</em>' attribute.
	 * @see #getColdLegFG2()
	 * @generated
	 */
	void setColdLegFG2(float value);

	/**
	 * Returns the value of the '<em><b>Throttle Pressure Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle Pressure Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle Pressure Factor</em>' attribute.
	 * @see #setThrottlePressureFactor(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_ThrottlePressureFactor()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Throttle Pressure Factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Throttle Pressure Factor'"
	 * @generated
	 */
	float getThrottlePressureFactor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureFactor <em>Throttle Pressure Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttle Pressure Factor</em>' attribute.
	 * @see #getThrottlePressureFactor()
	 * @generated
	 */
	void setThrottlePressureFactor(float value);

	/**
	 * Returns the value of the '<em><b>Cold Leg FB Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FB Lag TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FB Lag TC</em>' attribute.
	 * @see #setColdLegFBLagTC(float)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPWRSteamSupply_ColdLegFBLagTC()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cold Leg Feedback Lag Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cold Leg Feedback Lag Time Constant'"
	 * @generated
	 */
	float getColdLegFBLagTC();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLagTC <em>Cold Leg FB Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FB Lag TC</em>' attribute.
	 * @see #getColdLegFBLagTC()
	 * @generated
	 */
	void setColdLegFBLagTC(float value);

} // PWRSteamSupply
