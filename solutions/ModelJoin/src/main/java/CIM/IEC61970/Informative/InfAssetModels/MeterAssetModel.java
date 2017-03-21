/**
 */
package CIM.IEC61970.Informative.InfAssetModels;

import CIM.IEC61968.Metering.MeterAsset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getKH <em>KH</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isIntervalDataMeter <em>Interval Data Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getMaxRegisterCount <em>Max Register Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getMeterAssets <em>Meter Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isKVAhMeter <em>KV Ah Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getWireCount <em>Wire Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isTimeOfUseMeter <em>Time Of Use Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isDemandMeter <em>Demand Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isReactiveMeter <em>Reactive Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getForm <em>Form</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getRegisterRatio <em>Register Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isKwhMeter <em>Kwh Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isQMeter <em>QMeter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isLoadProfileMeter <em>Load Profile Meter</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documentation for a type of a meter asset of a particular product model made by a manufacturer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documentation for a type of a meter asset of a particular product model made by a manufacturer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documentation for a type of a meter asset of a particular product model made by a manufacturer.' Profile\040documentation='Documentation for a type of a meter asset of a particular product model made by a manufacturer.'"
 * @generated
 */
public interface MeterAssetModel extends ElectricalAssetModel {
	/**
	 * Returns the value of the '<em><b>KH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KH</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KH</em>' attribute.
	 * @see #setKH(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_KH()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter kh (watthour) constant. This constant is the number of watthours that must be applied to the meter to cause one disk revolution for an electromechanical meter or the number of watthours represented by one increment pulse for an electronic meter.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter kh (watthour) constant. This constant is the number of watthours that must be applied to the meter to cause one disk revolution for an electromechanical meter or the number of watthours represented by one increment pulse for an electronic meter.'"
	 * @generated
	 */
	float getKH();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getKH <em>KH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KH</em>' attribute.
	 * @see #getKH()
	 * @generated
	 */
	void setKH(float value);

	/**
	 * Returns the value of the '<em><b>Interval Data Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Data Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Data Meter</em>' attribute.
	 * @see #setIntervalDataMeter(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_IntervalDataMeter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when the meter or the installed AMR option is capable of capturing interval data for a user selectable measurement (kWh, Volts, or some other billing or engineering quantity).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when the meter or the installed AMR option is capable of capturing interval data for a user selectable measurement (kWh, Volts, or some other billing or engineering quantity).'"
	 * @generated
	 */
	boolean isIntervalDataMeter();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isIntervalDataMeter <em>Interval Data Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Data Meter</em>' attribute.
	 * @see #isIntervalDataMeter()
	 * @generated
	 */
	void setIntervalDataMeter(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Register Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Register Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Register Count</em>' attribute.
	 * @see #setMaxRegisterCount(int)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_MaxRegisterCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum number of registers this meter model can support. The actual number in use is based on the number of Registers associated with a given MeterAsset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum number of registers this meter model can support. The actual number in use is based on the number of Registers associated with a given MeterAsset.'"
	 * @generated
	 */
	int getMaxRegisterCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getMaxRegisterCount <em>Max Register Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Register Count</em>' attribute.
	 * @see #getMaxRegisterCount()
	 * @generated
	 */
	void setMaxRegisterCount(int value);

	/**
	 * Returns the value of the '<em><b>Meter Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.MeterAsset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.MeterAsset#getMeterAssetModel <em>Meter Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Assets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_MeterAssets()
	 * @see CIM.IEC61968.Metering.MeterAsset#getMeterAssetModel
	 * @model opposite="MeterAssetModel"
	 * @generated
	 */
	EList<MeterAsset> getMeterAssets();

	/**
	 * Returns the value of the '<em><b>KV Ah Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KV Ah Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KV Ah Meter</em>' attribute.
	 * @see #setKVAhMeter(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_KVAhMeter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when the meter is capable of metering apparent energy in kVAh.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when the meter is capable of metering apparent energy in kVAh.'"
	 * @generated
	 */
	boolean isKVAhMeter();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isKVAhMeter <em>KV Ah Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KV Ah Meter</em>' attribute.
	 * @see #isKVAhMeter()
	 * @generated
	 */
	void setKVAhMeter(boolean value);

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
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_WireCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of wires.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of wires.'"
	 * @generated
	 */
	int getWireCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getWireCount <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wire Count</em>' attribute.
	 * @see #getWireCount()
	 * @generated
	 */
	void setWireCount(int value);

	/**
	 * Returns the value of the '<em><b>Time Of Use Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Of Use Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Use Meter</em>' attribute.
	 * @see #setTimeOfUseMeter(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_TimeOfUseMeter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when the meter or meter+AMR module are capable of offering TOU data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when the meter or meter+AMR module are capable of offering TOU data.'"
	 * @generated
	 */
	boolean isTimeOfUseMeter();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isTimeOfUseMeter <em>Time Of Use Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Use Meter</em>' attribute.
	 * @see #isTimeOfUseMeter()
	 * @generated
	 */
	void setTimeOfUseMeter(boolean value);

	/**
	 * Returns the value of the '<em><b>Demand Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Meter</em>' attribute.
	 * @see #setDemandMeter(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_DemandMeter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when the meter or installed AMR option is capable of capturing demand data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when the meter or installed AMR option is capable of capturing demand data.'"
	 * @generated
	 */
	boolean isDemandMeter();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isDemandMeter <em>Demand Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Meter</em>' attribute.
	 * @see #isDemandMeter()
	 * @generated
	 */
	void setDemandMeter(boolean value);

	/**
	 * Returns the value of the '<em><b>Reactive Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive Meter</em>' attribute.
	 * @see #setReactiveMeter(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_ReactiveMeter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when the meter is capable of metering reactive energy in kVArh.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when the meter is capable of metering reactive energy in kVArh.'"
	 * @generated
	 */
	boolean isReactiveMeter();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isReactiveMeter <em>Reactive Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive Meter</em>' attribute.
	 * @see #isReactiveMeter()
	 * @generated
	 */
	void setReactiveMeter(boolean value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute.
	 * @see #setForm(String)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_Form()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter form number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter form number.'"
	 * @generated
	 */
	String getForm();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getForm <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' attribute.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(String value);

	/**
	 * Returns the value of the '<em><b>Register Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Ratio</em>' attribute.
	 * @see #setRegisterRatio(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_RegisterRatio()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter register ratio.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter register ratio.'"
	 * @generated
	 */
	float getRegisterRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getRegisterRatio <em>Register Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Ratio</em>' attribute.
	 * @see #getRegisterRatio()
	 * @generated
	 */
	void setRegisterRatio(float value);

	/**
	 * Returns the value of the '<em><b>Kwh Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kwh Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kwh Meter</em>' attribute.
	 * @see #setKwhMeter(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_KwhMeter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when the meter is capable of metering real energy in kWh.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when the meter is capable of metering real energy in kWh.'"
	 * @generated
	 */
	boolean isKwhMeter();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isKwhMeter <em>Kwh Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kwh Meter</em>' attribute.
	 * @see #isKwhMeter()
	 * @generated
	 */
	void setKwhMeter(boolean value);

	/**
	 * Returns the value of the '<em><b>QMeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QMeter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QMeter</em>' attribute.
	 * @see #setQMeter(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_QMeter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when the meter is capable of metering reactive energy in kQh.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when the meter is capable of metering reactive energy in kQh.'"
	 * @generated
	 */
	boolean isQMeter();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isQMeter <em>QMeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QMeter</em>' attribute.
	 * @see #isQMeter()
	 * @generated
	 */
	void setQMeter(boolean value);

	/**
	 * Returns the value of the '<em><b>Load Profile Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Profile Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Profile Meter</em>' attribute.
	 * @see #setLoadProfileMeter(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getMeterAssetModel_LoadProfileMeter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when the meter or the installed AMR option is capable of capturing kWh interval data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when the meter or the installed AMR option is capable of capturing kWh interval data.'"
	 * @generated
	 */
	boolean isLoadProfileMeter();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#isLoadProfileMeter <em>Load Profile Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Profile Meter</em>' attribute.
	 * @see #isLoadProfileMeter()
	 * @generated
	 */
	void setLoadProfileMeter(boolean value);

} // MeterAssetModel
