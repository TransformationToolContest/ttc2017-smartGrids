/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssetModels;

import gluemodel.CIM.IEC61968.AssetModels.AssetModel;

import gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getHighStep <em>High Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getTapCount <em>Tap Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getTapChangerAssets <em>Tap Changer Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedApparentPower <em>Rated Apparent Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getSwitchingKind <em>Switching Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getSubsequentDelay <em>Subsequent Delay</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getStepPhaseIncrement <em>Step Phase Increment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getBil <em>Bil</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documentation for a type of a tap changer of a particular product model made by a manufacturer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documentation for a type of a tap changer of a particular product model made by a manufacturer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documentation for a type of a tap changer of a particular product model made by a manufacturer.' Profile\040documentation='Documentation for a type of a tap changer of a particular product model made by a manufacturer.'"
 * @generated
 */
public interface TapChangerAssetModel extends AssetModel {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_Frequency()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Frequency" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Frequency at which stated device ratings apply, typically 50Hz or 60Hz.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Frequency at which stated device ratings apply, typically 50Hz or 60Hz.'"
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Voltage</em>' attribute.
	 * @see #setRatedVoltage(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_RatedVoltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated voltage.'"
	 * @generated
	 */
	float getRatedVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Voltage</em>' attribute.
	 * @see #getRatedVoltage()
	 * @generated
	 */
	void setRatedVoltage(float value);

	/**
	 * Returns the value of the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Step</em>' attribute.
	 * @see #setHighStep(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_HighStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Highest possible tap step position, advance from neutral'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Highest possible tap step position, advance from neutral'"
	 * @generated
	 */
	int getHighStep();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getHighStep <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Step</em>' attribute.
	 * @see #getHighStep()
	 * @generated
	 */
	void setHighStep(int value);

	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #setRatedCurrent(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_RatedCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated current.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated current.'"
	 * @generated
	 */
	float getRatedCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #getRatedCurrent()
	 * @generated
	 */
	void setRatedCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Count</em>' attribute.
	 * @see #setPhaseCount(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_PhaseCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of potential phases the asset supports, typically 0, 1 or 3. The actual phases connected are determined from \'ConductingEquipment.phases\' attribute in the ConductingEquipment subclass associated with the asset or from \'ElectricalAsset.phaseCode\' attribute.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of potential phases the asset supports, typically 0, 1 or 3. The actual phases connected are determined from \'ConductingEquipment.phases\' attribute in the ConductingEquipment subclass associated with the asset or from \'ElectricalAsset.phaseCode\' attribute.'"
	 * @generated
	 */
	int getPhaseCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Count</em>' attribute.
	 * @see #getPhaseCount()
	 * @generated
	 */
	void setPhaseCount(int value);

	/**
	 * Returns the value of the '<em><b>Tap Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Count</em>' attribute.
	 * @see #setTapCount(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_TapCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of taps.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of taps.'"
	 * @generated
	 */
	int getTapCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getTapCount <em>Tap Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Count</em>' attribute.
	 * @see #getTapCount()
	 * @generated
	 */
	void setTapCount(int value);

	/**
	 * Returns the value of the '<em><b>Tap Changer Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset#getTapChangerAssetModel <em>Tap Changer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_TapChangerAssets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset#getTapChangerAssetModel
	 * @model opposite="TapChangerAssetModel"
	 * @generated
	 */
	EList<TapChangerAsset> getTapChangerAssets();

	/**
	 * Returns the value of the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Apparent Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Apparent Power</em>' attribute.
	 * @see #setRatedApparentPower(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_RatedApparentPower()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated apparent power.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated apparent power.'"
	 * @generated
	 */
	float getRatedApparentPower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Apparent Power</em>' attribute.
	 * @see #getRatedApparentPower()
	 * @generated
	 */
	void setRatedApparentPower(float value);

	/**
	 * Returns the value of the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral Step</em>' attribute.
	 * @see #setNeutralStep(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_NeutralStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The neutral tap step position for this type of winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The neutral tap step position for this type of winding.'"
	 * @generated
	 */
	int getNeutralStep();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getNeutralStep <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Step</em>' attribute.
	 * @see #getNeutralStep()
	 * @generated
	 */
	void setNeutralStep(int value);

	/**
	 * Returns the value of the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Step</em>' attribute.
	 * @see #setLowStep(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_LowStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Lowest possible tap step position, retard from neutral'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Lowest possible tap step position, retard from neutral'"
	 * @generated
	 */
	int getLowStep();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getLowStep <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Step</em>' attribute.
	 * @see #getLowStep()
	 * @generated
	 */
	void setLowStep(int value);

	/**
	 * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Delay</em>' attribute.
	 * @see #setInitialDelay(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_InitialDelay()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum allowed delay for initial tap changer operation (first step change)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum allowed delay for initial tap changer operation (first step change)'"
	 * @generated
	 */
	float getInitialDelay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getInitialDelay <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Delay</em>' attribute.
	 * @see #getInitialDelay()
	 * @generated
	 */
	void setInitialDelay(float value);

	/**
	 * Returns the value of the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Voltage Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #setStepVoltageIncrement(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_StepVoltageIncrement()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tap step increment, in per cent of nominal voltage, per step position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tap step increment, in per cent of nominal voltage, per step position.'"
	 * @generated
	 */
	float getStepVoltageIncrement();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #getStepVoltageIncrement()
	 * @generated
	 */
	void setStepVoltageIncrement(float value);

	/**
	 * Returns the value of the '<em><b>Switching Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind
	 * @see #setSwitchingKind(TapChangerSwitchingKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_SwitchingKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Switching kind of tap changer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Switching kind of tap changer.'"
	 * @generated
	 */
	TapChangerSwitchingKind getSwitchingKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getSwitchingKind <em>Switching Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switching Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind
	 * @see #getSwitchingKind()
	 * @generated
	 */
	void setSwitchingKind(TapChangerSwitchingKind value);

	/**
	 * Returns the value of the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsequent Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsequent Delay</em>' attribute.
	 * @see #setSubsequentDelay(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_SubsequentDelay()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum allowed delay for isubsequent tap changer operations'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum allowed delay for isubsequent tap changer operations'"
	 * @generated
	 */
	float getSubsequentDelay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getSubsequentDelay <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsequent Delay</em>' attribute.
	 * @see #getSubsequentDelay()
	 * @generated
	 */
	void setSubsequentDelay(float value);

	/**
	 * Returns the value of the '<em><b>Step Phase Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Phase Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Phase Increment</em>' attribute.
	 * @see #setStepPhaseIncrement(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_StepPhaseIncrement()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AngleDegrees" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase shift, in degrees, per step position'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase shift, in degrees, per step position'"
	 * @generated
	 */
	float getStepPhaseIncrement();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getStepPhaseIncrement <em>Step Phase Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Phase Increment</em>' attribute.
	 * @see #getStepPhaseIncrement()
	 * @generated
	 */
	void setStepPhaseIncrement(float value);

	/**
	 * Returns the value of the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bil</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bil</em>' attribute.
	 * @see #setBil(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTapChangerAssetModel_Bil()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Basic Insulation Level (BIL) for switchgear, insulators, etc.\nA reference insulation level expressed as the impulse crest voltage of a nominal wave, typically 1.2 X 50 microsecond. This is a measure of the ability of the insulation to withstand very high voltage surges.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Basic Insulation Level (BIL) for switchgear, insulators, etc.\nA reference insulation level expressed as the impulse crest voltage of a nominal wave, typically 1.2 X 50 microsecond. This is a measure of the ability of the insulation to withstand very high voltage surges.'"
	 * @generated
	 */
	float getBil();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getBil <em>Bil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bil</em>' attribute.
	 * @see #getBil()
	 * @generated
	 */
	void setBil(float value);

} // TapChangerAssetModel
