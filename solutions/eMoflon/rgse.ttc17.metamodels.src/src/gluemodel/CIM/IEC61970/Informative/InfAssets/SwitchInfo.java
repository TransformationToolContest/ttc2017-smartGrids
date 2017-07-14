/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isGang <em>Gang</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount <em>Pole Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength <em>Dielectric Strength</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak <em>Load Break</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent <em>Minimum Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent <em>Withstand Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity <em>Making Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isRemote <em>Remote</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of switch assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of switch assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of switch assets.' Profile\040documentation='Properties of switch assets.'"
 * @generated
 */
public interface SwitchInfo extends ElectricalInfo {
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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo_Gang()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if multi-phase switch controls all phases concurrently.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if multi-phase switch controls all phases concurrently.'"
	 * @generated
	 */
	boolean isGang();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isGang <em>Gang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gang</em>' attribute.
	 * @see #isGang()
	 * @generated
	 */
	void setGang(boolean value);

	/**
	 * Returns the value of the '<em><b>Pole Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pole Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pole Count</em>' attribute.
	 * @see #setPoleCount(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo_PoleCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of poles (i.e. of current carrying conductors that are switched).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of poles (i.e. of current carrying conductors that are switched).'"
	 * @generated
	 */
	int getPoleCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount <em>Pole Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pole Count</em>' attribute.
	 * @see #getPoleCount()
	 * @generated
	 */
	void setPoleCount(int value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo_InterruptingRating()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Breaking capacity, or short circuit rating, is the maximum rated current which the device can safely interrupt at the rated voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Breaking capacity, or short circuit rating, is the maximum rated current which the device can safely interrupt at the rated voltage.'"
	 * @generated
	 */
	float getInterruptingRating();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupting Rating</em>' attribute.
	 * @see #getInterruptingRating()
	 * @generated
	 */
	void setInterruptingRating(float value);

	/**
	 * Returns the value of the '<em><b>Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dielectric Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dielectric Strength</em>' attribute.
	 * @see #setDielectricStrength(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo_DielectricStrength()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum rms voltage that may be applied across an open contact without breaking down the dielectric properties of the switch in the open position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum rms voltage that may be applied across an open contact without breaking down the dielectric properties of the switch in the open position.'"
	 * @generated
	 */
	float getDielectricStrength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength <em>Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dielectric Strength</em>' attribute.
	 * @see #getDielectricStrength()
	 * @generated
	 */
	void setDielectricStrength(float value);

	/**
	 * Returns the value of the '<em><b>Load Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Break</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Break</em>' attribute.
	 * @see #setLoadBreak(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo_LoadBreak()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if switch has load breaking capabiity. Unless specified false, this is always assumed to be true for breakers and reclosers.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if switch has load breaking capabiity. Unless specified false, this is always assumed to be true for breakers and reclosers.'"
	 * @generated
	 */
	boolean isLoadBreak();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak <em>Load Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Break</em>' attribute.
	 * @see #isLoadBreak()
	 * @generated
	 */
	void setLoadBreak(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Current</em>' attribute.
	 * @see #setMinimumCurrent(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo_MinimumCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The lowest value of current that the switch can make, carry and break in uninterrupted duty at the rated voltage under specified operating conditions without suffering significant deterioration of its performance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The lowest value of current that the switch can make, carry and break in uninterrupted duty at the rated voltage under specified operating conditions without suffering significant deterioration of its performance.'"
	 * @generated
	 */
	float getMinimumCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent <em>Minimum Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Current</em>' attribute.
	 * @see #getMinimumCurrent()
	 * @generated
	 */
	void setMinimumCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Withstand Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Withstand Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Withstand Current</em>' attribute.
	 * @see #setWithstandCurrent(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo_WithstandCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The highest value of current the switch can carry in the closed position at the rated voltage under specified operating conditions without suffering significant deterioration of its performance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The highest value of current the switch can carry in the closed position at the rated voltage under specified operating conditions without suffering significant deterioration of its performance.'"
	 * @generated
	 */
	float getWithstandCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent <em>Withstand Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Withstand Current</em>' attribute.
	 * @see #getWithstandCurrent()
	 * @generated
	 */
	void setWithstandCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Making Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Making Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Making Capacity</em>' attribute.
	 * @see #setMakingCapacity(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo_MakingCapacity()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The highest value of current the switch can make at the rated voltage under specified operating conditions without suffering significant deterioration of its performance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The highest value of current the switch can make at the rated voltage under specified operating conditions without suffering significant deterioration of its performance.'"
	 * @generated
	 */
	float getMakingCapacity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity <em>Making Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Making Capacity</em>' attribute.
	 * @see #getMakingCapacity()
	 * @generated
	 */
	void setMakingCapacity(float value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo_Remote()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if device is capable of being operated by remote control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if device is capable of being operated by remote control.'"
	 * @generated
	 */
	boolean isRemote();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' attribute.
	 * @see #isRemote()
	 * @generated
	 */
	void setRemote(boolean value);

} // SwitchInfo
