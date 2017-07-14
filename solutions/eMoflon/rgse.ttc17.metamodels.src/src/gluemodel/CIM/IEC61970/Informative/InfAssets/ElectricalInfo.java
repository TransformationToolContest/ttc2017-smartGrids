/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61970.Core.PhaseCode;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount <em>Wire Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getB0 <em>B0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssetModels <em>Electrical Asset Models</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getBil <em>Bil</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getX0 <em>X0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getG0 <em>G0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssets <em>Electrical Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getX <em>X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower <em>Rated Apparent Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getG <em>G</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getB <em>B</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalTypeAssets <em>Electrical Type Assets</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electrical properties of an asset or of an asset model (product by a manufacturer). Can also be used to define electrical properties for each phase individually.\nNot every attribute will be required for each type of asset or asset model. For example, a transformer may only have requirements for \'ratedVoltage\', \'ratedApparentPower\' and \'phaseCount\' attributes, while a conductor will have \'r\', \'x\', \'b\' and \'g\' requirements per unit length on top of a \'ratedCurrent\' and \'ratedVoltage\'.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Electrical properties of an asset or of an asset model (product by a manufacturer). Can also be used to define electrical properties for each phase individually.\nNot every attribute will be required for each type of asset or asset model. For example, a transformer may only have requirements for \'ratedVoltage\', \'ratedApparentPower\' and \'phaseCount\' attributes, while a conductor will have \'r\', \'x\', \'b\' and \'g\' requirements per unit length on top of a \'ratedCurrent\' and \'ratedVoltage\'.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electrical properties of an asset or of an asset model (product by a manufacturer). Can also be used to define electrical properties for each phase individually.\nNot every attribute will be required for each type of asset or asset model. For example, a transformer may only have requirements for \'ratedVoltage\', \'ratedApparentPower\' and \'phaseCount\' attributes, while a conductor will have \'r\', \'x\', \'b\' and \'g\' requirements per unit length on top of a \'ratedCurrent\' and \'ratedVoltage\'.' Profile\040documentation='Electrical properties of an asset or of an asset model (product by a manufacturer). Can also be used to define electrical properties for each phase individually.\nNot every attribute will be required for each type of asset or asset model. For example, a transformer may only have requirements for \'ratedVoltage\', \'ratedApparentPower\' and \'phaseCount\' attributes, while a conductor will have \'r\', \'x\', \'b\' and \'g\' requirements per unit length on top of a \'ratedCurrent\' and \'ratedVoltage\'.'"
 * @generated
 */
public interface ElectricalInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Count</em>' attribute.
	 * @see #setWireCount(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_WireCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For an installed asset, this is the total number of electrical wires that are physically connected to it. For an AssetModel, this is the total number of wires that can potentially be connected to this asset type. This is particularly useful to understand overall electrical configurations for distribution secondary where the number of wires can not be derived from phase information alone. For example, 120v 2 Wires; 240v 2 Wires; 480v 1Ph 2 Wires; 120/240v 1Ph; 120/208v 3Ph Y; 120/208v 1Ph Y; 120/240v 3Ph D; 240/480v 1Ph 3 Wires; 480v 3Ph D; 240/480v 3Ph D; 277/480v 3Ph Y.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For an installed asset, this is the total number of electrical wires that are physically connected to it. For an AssetModel, this is the total number of wires that can potentially be connected to this asset type. This is particularly useful to understand overall electrical configurations for distribution secondary where the number of wires can not be derived from phase information alone. For example, 120v 2 Wires; 240v 2 Wires; 480v 1Ph 2 Wires; 120/240v 1Ph; 120/208v 3Ph Y; 120/208v 1Ph Y; 120/240v 3Ph D; 240/480v 1Ph 3 Wires; 480v 3Ph D; 240/480v 3Ph D; 277/480v 3Ph Y.'"
	 * @generated
	 */
	int getWireCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wire Count</em>' attribute.
	 * @see #getWireCount()
	 * @generated
	 */
	void setWireCount(int value);

	/**
	 * Returns the value of the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connected</em>' attribute.
	 * @see #setIsConnected(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_IsConnected()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the asset is physically connected to electrical network (as opposed to being in a warehouse, being refurbished, etc.). Note that this attribute is not intended to imply energization status and/or whether the asset is actually being used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the asset is physically connected to electrical network (as opposed to being in a warehouse, being refurbished, etc.). Note that this attribute is not intended to imply energization status and/or whether the asset is actually being used.'"
	 * @generated
	 */
	boolean isIsConnected();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Connected</em>' attribute.
	 * @see #isIsConnected()
	 * @generated
	 */
	void setIsConnected(boolean value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_Frequency()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Frequency" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Frequency at which stated device ratings apply, typically 50 Hz or 60 Hz.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Frequency at which stated device ratings apply, typically 50 Hz or 60 Hz.'"
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(float value);

	/**
	 * Returns the value of the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0</em>' attribute.
	 * @see #setB0(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_B0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence susceptance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence susceptance.'"
	 * @generated
	 */
	float getB0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0</em>' attribute.
	 * @see #getB0()
	 * @generated
	 */
	void setB0(float value);

	/**
	 * Returns the value of the '<em><b>Electrical Asset Models</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel#getElectricalInfos <em>Electrical Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electrical Asset Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Asset Models</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_ElectricalAssetModels()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel#getElectricalInfos
	 * @model opposite="ElectricalInfos"
	 * @generated
	 */
	EList<ElectricalAssetModel> getElectricalAssetModels();

	/**
	 * Returns the value of the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0</em>' attribute.
	 * @see #setR0(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_R0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series resistance.'"
	 * @generated
	 */
	float getR0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #getR0()
	 * @generated
	 */
	void setR0(float value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_Bil()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Basic Insulation Level (BIL) for switchgear, insulators, etc.\nA reference insulation level expressed as the impulse crest voltage of a nominal wave, typically 1,2 x 50 microsecond. This is a measure of the ability of the insulation to withstand very high voltage surges.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Basic Insulation Level (BIL) for switchgear, insulators, etc.\nA reference insulation level expressed as the impulse crest voltage of a nominal wave, typically 1,2 x 50 microsecond. This is a measure of the ability of the insulation to withstand very high voltage surges.'"
	 * @generated
	 */
	float getBil();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getBil <em>Bil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bil</em>' attribute.
	 * @see #getBil()
	 * @generated
	 */
	void setBil(float value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_PhaseCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of potential phases the asset supports, typically 0, 1 or 3. The actual phases connected are determined from \'ConductingEquipment.phases\' attribute in the ConductingEquipment subclass associated with the asset or from \'ElectricalAsset.phaseCode\' attribute.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of potential phases the asset supports, typically 0, 1 or 3. The actual phases connected are determined from \'ConductingEquipment.phases\' attribute in the ConductingEquipment subclass associated with the asset or from \'ElectricalAsset.phaseCode\' attribute.'"
	 * @generated
	 */
	int getPhaseCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Count</em>' attribute.
	 * @see #getPhaseCount()
	 * @generated
	 */
	void setPhaseCount(int value);

	/**
	 * Returns the value of the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0</em>' attribute.
	 * @see #setX0(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_X0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence series reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence series reactance.'"
	 * @generated
	 */
	float getX0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(float value);

	/**
	 * Returns the value of the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0</em>' attribute.
	 * @see #setG0(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_G0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence conductance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence conductance.'"
	 * @generated
	 */
	float getG0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0</em>' attribute.
	 * @see #getG0()
	 * @generated
	 */
	void setG0(float value);

	/**
	 * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #setPhaseCode(PhaseCode)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_PhaseCode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If \'isConnected\' is true, then this is the as-built phase(s) that the asset is associatied with.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If \'isConnected\' is true, then this is the as-built phase(s) that the asset is associatied with.'"
	 * @generated
	 */
	PhaseCode getPhaseCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #getPhaseCode()
	 * @generated
	 */
	void setPhaseCode(PhaseCode value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_RatedCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated current.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated current.'"
	 * @generated
	 */
	float getRatedCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #getRatedCurrent()
	 * @generated
	 */
	void setRatedCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Electrical Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getElectricalInfos <em>Electrical Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electrical Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_ElectricalAssets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getElectricalInfos
	 * @model opposite="ElectricalInfos"
	 * @generated
	 */
	EList<ElectricalAsset> getElectricalAssets();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_X()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series reactance.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_R()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series resistance.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_RatedApparentPower()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated apparent power.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated apparent power.'"
	 * @generated
	 */
	float getRatedApparentPower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Apparent Power</em>' attribute.
	 * @see #getRatedApparentPower()
	 * @generated
	 */
	void setRatedApparentPower(float value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #setG(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_G()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence conductance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence conductance.'"
	 * @generated
	 */
	float getG();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #getG()
	 * @generated
	 */
	void setG(float value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_B()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence susceptance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence susceptance.'"
	 * @generated
	 */
	float getB();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(float value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_RatedVoltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated voltage.'"
	 * @generated
	 */
	float getRatedVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Voltage</em>' attribute.
	 * @see #getRatedVoltage()
	 * @generated
	 */
	void setRatedVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Electrical Type Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset#getElectricalInfos <em>Electrical Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electrical Type Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Type Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo_ElectricalTypeAssets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset#getElectricalInfos
	 * @model opposite="ElectricalInfos"
	 * @generated
	 */
	EList<ElectricalTypeAsset> getElectricalTypeAssets();

} // ElectricalInfo
