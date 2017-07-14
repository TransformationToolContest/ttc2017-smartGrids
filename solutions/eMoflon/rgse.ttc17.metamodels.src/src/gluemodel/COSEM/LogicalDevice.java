/**
 */
package gluemodel.COSEM;

import gluemodel.COSEM.COSEMObjects.AutoConnectObject;
import gluemodel.COSEM.COSEMObjects.BillingPeriodValues;
import gluemodel.COSEM.COSEMObjects.CurrentAssociation;
import gluemodel.COSEM.COSEMObjects.CurrentlyActiveTariff;
import gluemodel.COSEM.COSEMObjects.ElectricityHarmonics;
import gluemodel.COSEM.COSEMObjects.ElectricityID;
import gluemodel.COSEM.COSEMObjects.ElectricityNominalValues;
import gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries;
import gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData;
import gluemodel.COSEM.COSEMObjects.ElectricityValues;
import gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement;
import gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants;
import gluemodel.COSEM.COSEMObjects.MeasurementMethods;
import gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration;
import gluemodel.COSEM.COSEMObjects.MeasurementValues;
import gluemodel.COSEM.COSEMObjects.MeteringPointID;
import gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants;
import gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio;
import gluemodel.COSEM.COSEMObjects.RegisterMonitorObject;
import gluemodel.COSEM.COSEMObjects.TimeEntries;
import gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getAA <em>AA</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getName <em>Name</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getAutoConnect <em>Auto Connect</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getBillingPeriodValues <em>Billing Period Values</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getElectricityID <em>Electricity ID</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getProgramEntries <em>Program Entries</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getOutputPulse <em>Output Pulse</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getReadingFactor <em>Reading Factor</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getNominalValues <em>Nominal Values</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getInputPulse <em>Input Pulse</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getMeasurementPeriod <em>Measurement Period</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getTimeEntries <em>Time Entries</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getTransformerLineLosses <em>Transformer Line Losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getMeasurementAlgorithm <em>Measurement Algorithm</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getMeteringPoint <em>Metering Point</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getElectricityRelatedStatus <em>Electricity Related Status</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getRegisterMonitor <em>Register Monitor</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getElectricityValues <em>Electricity Values</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getMeasurementValueTypes <em>Measurement Value Types</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getHarmonics <em>Harmonics</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getPhaseangles <em>Phaseangles</em>}</li>
 *   <li>{@link gluemodel.COSEM.LogicalDevice#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice()
 * @model
 * @generated
 */
public interface LogicalDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>AA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AA</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AA</em>' containment reference.
	 * @see #setAA(CurrentAssociation)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_AA()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CurrentAssociation getAA();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getAA <em>AA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AA</em>' containment reference.
	 * @see #getAA()
	 * @generated
	 */
	void setAA(CurrentAssociation value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(LogicalDeviceName)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_Name()
	 * @model containment="true"
	 * @generated
	 */
	LogicalDeviceName getName();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(LogicalDeviceName value);

	/**
	 * Returns the value of the '<em><b>Auto Connect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Connect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Connect</em>' containment reference.
	 * @see #setAutoConnect(AutoConnectObject)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_AutoConnect()
	 * @model containment="true"
	 * @generated
	 */
	AutoConnectObject getAutoConnect();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getAutoConnect <em>Auto Connect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Connect</em>' containment reference.
	 * @see #getAutoConnect()
	 * @generated
	 */
	void setAutoConnect(AutoConnectObject value);

	/**
	 * Returns the value of the '<em><b>Billing Period Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Period Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Period Values</em>' containment reference.
	 * @see #setBillingPeriodValues(BillingPeriodValues)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_BillingPeriodValues()
	 * @model containment="true"
	 * @generated
	 */
	BillingPeriodValues getBillingPeriodValues();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getBillingPeriodValues <em>Billing Period Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Period Values</em>' containment reference.
	 * @see #getBillingPeriodValues()
	 * @generated
	 */
	void setBillingPeriodValues(BillingPeriodValues value);

	/**
	 * Returns the value of the '<em><b>Electricity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electricity ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electricity ID</em>' containment reference.
	 * @see #setElectricityID(ElectricityID)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_ElectricityID()
	 * @model containment="true"
	 * @generated
	 */
	ElectricityID getElectricityID();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getElectricityID <em>Electricity ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electricity ID</em>' containment reference.
	 * @see #getElectricityID()
	 * @generated
	 */
	void setElectricityID(ElectricityID value);

	/**
	 * Returns the value of the '<em><b>Program Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Entries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Entries</em>' containment reference.
	 * @see #setProgramEntries(ElectricityProgramEntries)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_ProgramEntries()
	 * @model containment="true"
	 * @generated
	 */
	ElectricityProgramEntries getProgramEntries();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getProgramEntries <em>Program Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Entries</em>' containment reference.
	 * @see #getProgramEntries()
	 * @generated
	 */
	void setProgramEntries(ElectricityProgramEntries value);

	/**
	 * Returns the value of the '<em><b>Output Pulse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Pulse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Pulse</em>' containment reference.
	 * @see #setOutputPulse(OutputPulseValues_constants)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_OutputPulse()
	 * @model containment="true"
	 * @generated
	 */
	OutputPulseValues_constants getOutputPulse();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getOutputPulse <em>Output Pulse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Pulse</em>' containment reference.
	 * @see #getOutputPulse()
	 * @generated
	 */
	void setOutputPulse(OutputPulseValues_constants value);

	/**
	 * Returns the value of the '<em><b>Reading Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Factor</em>' containment reference.
	 * @see #setReadingFactor(ReadingFactorAndCT_VTratio)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_ReadingFactor()
	 * @model containment="true"
	 * @generated
	 */
	ReadingFactorAndCT_VTratio getReadingFactor();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getReadingFactor <em>Reading Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Factor</em>' containment reference.
	 * @see #getReadingFactor()
	 * @generated
	 */
	void setReadingFactor(ReadingFactorAndCT_VTratio value);

	/**
	 * Returns the value of the '<em><b>Nominal Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Values</em>' containment reference.
	 * @see #setNominalValues(ElectricityNominalValues)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_NominalValues()
	 * @model containment="true"
	 * @generated
	 */
	ElectricityNominalValues getNominalValues();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getNominalValues <em>Nominal Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Values</em>' containment reference.
	 * @see #getNominalValues()
	 * @generated
	 */
	void setNominalValues(ElectricityNominalValues value);

	/**
	 * Returns the value of the '<em><b>Input Pulse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Pulse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Pulse</em>' containment reference.
	 * @see #setInputPulse(InputPulseValuesOrConstants)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_InputPulse()
	 * @model containment="true"
	 * @generated
	 */
	InputPulseValuesOrConstants getInputPulse();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getInputPulse <em>Input Pulse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Pulse</em>' containment reference.
	 * @see #getInputPulse()
	 * @generated
	 */
	void setInputPulse(InputPulseValuesOrConstants value);

	/**
	 * Returns the value of the '<em><b>Measurement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Period</em>' containment reference.
	 * @see #setMeasurementPeriod(MeasurementPeriod_recordingInterval_billingPeriodDuration)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_MeasurementPeriod()
	 * @model containment="true"
	 * @generated
	 */
	MeasurementPeriod_recordingInterval_billingPeriodDuration getMeasurementPeriod();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getMeasurementPeriod <em>Measurement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Period</em>' containment reference.
	 * @see #getMeasurementPeriod()
	 * @generated
	 */
	void setMeasurementPeriod(MeasurementPeriod_recordingInterval_billingPeriodDuration value);

	/**
	 * Returns the value of the '<em><b>Time Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Entries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Entries</em>' containment reference.
	 * @see #setTimeEntries(TimeEntries)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_TimeEntries()
	 * @model containment="true"
	 * @generated
	 */
	TimeEntries getTimeEntries();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getTimeEntries <em>Time Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Entries</em>' containment reference.
	 * @see #getTimeEntries()
	 * @generated
	 */
	void setTimeEntries(TimeEntries value);

	/**
	 * Returns the value of the '<em><b>Transformer Line Losses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Line Losses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Line Losses</em>' containment reference.
	 * @see #setTransformerLineLosses(TransformerAndLineLosses)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_TransformerLineLosses()
	 * @model containment="true"
	 * @generated
	 */
	TransformerAndLineLosses getTransformerLineLosses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getTransformerLineLosses <em>Transformer Line Losses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Line Losses</em>' containment reference.
	 * @see #getTransformerLineLosses()
	 * @generated
	 */
	void setTransformerLineLosses(TransformerAndLineLosses value);

	/**
	 * Returns the value of the '<em><b>Measurement Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Algorithm</em>' containment reference.
	 * @see #setMeasurementAlgorithm(MeasurementMethods)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_MeasurementAlgorithm()
	 * @model containment="true"
	 * @generated
	 */
	MeasurementMethods getMeasurementAlgorithm();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getMeasurementAlgorithm <em>Measurement Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Algorithm</em>' containment reference.
	 * @see #getMeasurementAlgorithm()
	 * @generated
	 */
	void setMeasurementAlgorithm(MeasurementMethods value);

	/**
	 * Returns the value of the '<em><b>Metering Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metering Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metering Point</em>' containment reference.
	 * @see #setMeteringPoint(MeteringPointID)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_MeteringPoint()
	 * @model containment="true"
	 * @generated
	 */
	MeteringPointID getMeteringPoint();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getMeteringPoint <em>Metering Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metering Point</em>' containment reference.
	 * @see #getMeteringPoint()
	 * @generated
	 */
	void setMeteringPoint(MeteringPointID value);

	/**
	 * Returns the value of the '<em><b>Electricity Related Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electricity Related Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electricity Related Status</em>' containment reference.
	 * @see #setElectricityRelatedStatus(ElectricityRelatedStatusData)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_ElectricityRelatedStatus()
	 * @model containment="true"
	 * @generated
	 */
	ElectricityRelatedStatusData getElectricityRelatedStatus();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getElectricityRelatedStatus <em>Electricity Related Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electricity Related Status</em>' containment reference.
	 * @see #getElectricityRelatedStatus()
	 * @generated
	 */
	void setElectricityRelatedStatus(ElectricityRelatedStatusData value);

	/**
	 * Returns the value of the '<em><b>Register Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Monitor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Monitor</em>' containment reference.
	 * @see #setRegisterMonitor(RegisterMonitorObject)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_RegisterMonitor()
	 * @model containment="true"
	 * @generated
	 */
	RegisterMonitorObject getRegisterMonitor();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getRegisterMonitor <em>Register Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Monitor</em>' containment reference.
	 * @see #getRegisterMonitor()
	 * @generated
	 */
	void setRegisterMonitor(RegisterMonitorObject value);

	/**
	 * Returns the value of the '<em><b>Electricity Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electricity Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electricity Values</em>' containment reference.
	 * @see #setElectricityValues(ElectricityValues)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_ElectricityValues()
	 * @model containment="true"
	 * @generated
	 */
	ElectricityValues getElectricityValues();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getElectricityValues <em>Electricity Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electricity Values</em>' containment reference.
	 * @see #getElectricityValues()
	 * @generated
	 */
	void setElectricityValues(ElectricityValues value);

	/**
	 * Returns the value of the '<em><b>Measurement Value Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value Types</em>' containment reference.
	 * @see #setMeasurementValueTypes(MeasurementValues)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_MeasurementValueTypes()
	 * @model containment="true"
	 * @generated
	 */
	MeasurementValues getMeasurementValueTypes();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getMeasurementValueTypes <em>Measurement Value Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value Types</em>' containment reference.
	 * @see #getMeasurementValueTypes()
	 * @generated
	 */
	void setMeasurementValueTypes(MeasurementValues value);

	/**
	 * Returns the value of the '<em><b>Harmonics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Harmonics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Harmonics</em>' containment reference.
	 * @see #setHarmonics(ElectricityHarmonics)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_Harmonics()
	 * @model containment="true"
	 * @generated
	 */
	ElectricityHarmonics getHarmonics();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getHarmonics <em>Harmonics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Harmonics</em>' containment reference.
	 * @see #getHarmonics()
	 * @generated
	 */
	void setHarmonics(ElectricityHarmonics value);

	/**
	 * Returns the value of the '<em><b>Tariffs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariffs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariffs</em>' containment reference.
	 * @see #setTariffs(CurrentlyActiveTariff)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_Tariffs()
	 * @model containment="true"
	 * @generated
	 */
	CurrentlyActiveTariff getTariffs();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getTariffs <em>Tariffs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariffs</em>' containment reference.
	 * @see #getTariffs()
	 * @generated
	 */
	void setTariffs(CurrentlyActiveTariff value);

	/**
	 * Returns the value of the '<em><b>Phaseangles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phaseangles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phaseangles</em>' containment reference.
	 * @see #setPhaseangles(ExtendedPhaseAngleMeasurement)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_Phaseangles()
	 * @model containment="true"
	 * @generated
	 */
	ExtendedPhaseAngleMeasurement getPhaseangles();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getPhaseangles <em>Phaseangles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phaseangles</em>' containment reference.
	 * @see #getPhaseangles()
	 * @generated
	 */
	void setPhaseangles(ExtendedPhaseAngleMeasurement value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see gluemodel.COSEM.COSEMPackage#getLogicalDevice_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.LogicalDevice#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // LogicalDevice
