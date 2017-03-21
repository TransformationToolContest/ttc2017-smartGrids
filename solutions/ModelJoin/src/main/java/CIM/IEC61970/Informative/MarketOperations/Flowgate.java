/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;

import CIM.IEC61970.Informative.Financial.TransmissionProvider;

import CIM.IEC61970.Wires.Line;
import CIM.IEC61970.Wires.PowerTransformer;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flowgate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionReliabilityMargin <em>Transmission Reliability Margin</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getAfcUseCode <em>Afc Use Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcOperationalName <em>Idc Operational Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getInServiceDate <em>In Service Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getViolationLimits <em>Violation Limits</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getOutOfServiceDate <em>Out Of Service Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getCapacityBenefitMargin <em>Capacity Benefit Margin</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#isCoordinatedFlag <em>Coordinated Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#isAtcFlag <em>Atc Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getDeletionDate <em>Deletion Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#isReciprocalFlag <em>Reciprocal Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcAssignedId <em>Idc Assigned Id</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getPowerTransormers <em>Power Transormers</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getPositiveImpactValue <em>Positive Impact Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getFTRs <em>FT Rs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getLines <em>Lines</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getCounterFlowValue <em>Counter Flow Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getCoordinationStudyDate <em>Coordination Study Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getSubControlArea <em>Sub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcType <em>Idc Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#isManagingEntityFlag <em>Managing Entity Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionProvider <em>Transmission Provider</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A flowgate, is single or group of transmission elements intended to model MW flow impact relating to transmission limitations and transmission service usage.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A flowgate, is single or group of transmission elements intended to model MW flow impact relating to transmission limitations and transmission service usage.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A flowgate, is single or group of transmission elements intended to model MW flow impact relating to transmission limitations and transmission service usage.' Profile\040documentation='A flowgate, is single or group of transmission elements intended to model MW flow impact relating to transmission limitations and transmission service usage.'"
 * @generated
 */
public interface Flowgate extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Transmission Reliability Margin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Reliability Margin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Reliability Margin</em>' reference.
	 * @see #setTransmissionReliabilityMargin(TransmissionReliabilityMargin)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_TransmissionReliabilityMargin()
	 * @see CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getFlowgate
	 * @model opposite="Flowgate"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A fowgate may have 0 to 1 TRM'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A fowgate may have 0 to 1 TRM'"
	 * @generated
	 */
	TransmissionReliabilityMargin getTransmissionReliabilityMargin();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionReliabilityMargin <em>Transmission Reliability Margin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Reliability Margin</em>' reference.
	 * @see #getTransmissionReliabilityMargin()
	 * @generated
	 */
	void setTransmissionReliabilityMargin(TransmissionReliabilityMargin value);

	/**
	 * Returns the value of the '<em><b>Afc Use Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Afc Use Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Afc Use Code</em>' attribute.
	 * @see #setAfcUseCode(Object)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_AfcUseCode()
	 * @model dataType="CIM.FlowgateAfcUseCode" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used to indicate if FG should be used only for certain types of AFC Calculations.  Values are \"FIRM,\"  \"NONFIRM,\" and \"BOTH.\"'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to indicate if FG should be used only for certain types of AFC Calculations.  Values are \"FIRM,\"  \"NONFIRM,\" and \"BOTH.\"'"
	 * @generated
	 */
	Object getAfcUseCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getAfcUseCode <em>Afc Use Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Afc Use Code</em>' attribute.
	 * @see #getAfcUseCode()
	 * @generated
	 */
	void setAfcUseCode(Object value);

	/**
	 * Returns the value of the '<em><b>Idc Operational Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idc Operational Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idc Operational Name</em>' attribute.
	 * @see #setIdcOperationalName(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_IdcOperationalName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Registered Name utilized in the IDC and/or Book of Flowgates'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Registered Name utilized in the IDC and/or Book of Flowgates'"
	 * @generated
	 */
	String getIdcOperationalName();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcOperationalName <em>Idc Operational Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idc Operational Name</em>' attribute.
	 * @see #getIdcOperationalName()
	 * @generated
	 */
	void setIdcOperationalName(String value);

	/**
	 * Returns the value of the '<em><b>In Service Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Service Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Service Date</em>' attribute.
	 * @see #setInServiceDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_InServiceDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date at which point Flowgate becomes active.  Used to insert future Flowgates or Flowgates returning from an outage condition.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date at which point Flowgate becomes active.  Used to insert future Flowgates or Flowgates returning from an outage condition.'"
	 * @generated
	 */
	Date getInServiceDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getInServiceDate <em>In Service Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Service Date</em>' attribute.
	 * @see #getInServiceDate()
	 * @generated
	 */
	void setInServiceDate(Date value);

	/**
	 * Returns the value of the '<em><b>Violation Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ViolationLimit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Violation Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violation Limits</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_ViolationLimits()
	 * @see CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getFlowgate
	 * @model opposite="Flowgate"
	 * @generated
	 */
	EList<ViolationLimit> getViolationLimits();

	/**
	 * Returns the value of the '<em><b>Out Of Service Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Of Service Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Of Service Date</em>' attribute.
	 * @see #setOutOfServiceDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_OutOfServiceDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date at which point Flowgate becomes inactive. Used to insert outage condition.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date at which point Flowgate becomes inactive. Used to insert outage condition.'"
	 * @generated
	 */
	Date getOutOfServiceDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getOutOfServiceDate <em>Out Of Service Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Of Service Date</em>' attribute.
	 * @see #getOutOfServiceDate()
	 * @generated
	 */
	void setOutOfServiceDate(Date value);

	/**
	 * Returns the value of the '<em><b>Capacity Benefit Margin</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Benefit Margin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Benefit Margin</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_CapacityBenefitMargin()
	 * @see CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getFlowgate
	 * @model opposite="Flowgate"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A flowgate may have 0 to n CBM profile\nEach season may be a CBM which contains a set of profile data'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A flowgate may have 0 to n CBM profile\nEach season may be a CBM which contains a set of profile data'"
	 * @generated
	 */
	EList<CapacityBenefitMargin> getCapacityBenefitMargin();

	/**
	 * Returns the value of the '<em><b>Coordinated Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinated Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinated Flag</em>' attribute.
	 * @see #setCoordinatedFlag(boolean)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_CoordinatedFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag to indicate if Flowgate qualified as coordinated Flowgate'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag to indicate if Flowgate qualified as coordinated Flowgate'"
	 * @generated
	 */
	boolean isCoordinatedFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#isCoordinatedFlag <em>Coordinated Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinated Flag</em>' attribute.
	 * @see #isCoordinatedFlag()
	 * @generated
	 */
	void setCoordinatedFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Atc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atc Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atc Flag</em>' attribute.
	 * @see #setAtcFlag(boolean)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_AtcFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag to indicate if Flowgate is utilized for coordination of ATC.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag to indicate if Flowgate is utilized for coordination of ATC.'"
	 * @generated
	 */
	boolean isAtcFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#isAtcFlag <em>Atc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atc Flag</em>' attribute.
	 * @see #isAtcFlag()
	 * @generated
	 */
	void setAtcFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Deletion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletion Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletion Date</em>' attribute.
	 * @see #setDeletionDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_DeletionDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date at which point Flowgate should be removed from the Interchange Distribution Calculatin (IDC).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date at which point Flowgate should be removed from the Interchange Distribution Calculatin (IDC).'"
	 * @generated
	 */
	Date getDeletionDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getDeletionDate <em>Deletion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletion Date</em>' attribute.
	 * @see #getDeletionDate()
	 * @generated
	 */
	void setDeletionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Reciprocal Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reciprocal Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reciprocal Flag</em>' attribute.
	 * @see #setReciprocalFlag(boolean)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_ReciprocalFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag to indicate if Flowgate qualified as reciprocal Flowgate'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag to indicate if Flowgate qualified as reciprocal Flowgate'"
	 * @generated
	 */
	boolean isReciprocalFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#isReciprocalFlag <em>Reciprocal Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reciprocal Flag</em>' attribute.
	 * @see #isReciprocalFlag()
	 * @generated
	 */
	void setReciprocalFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Idc Assigned Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idc Assigned Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idc Assigned Id</em>' attribute.
	 * @see #setIdcAssignedId(int)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_IdcAssignedId()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The registered Flowgate ID Assigned by the IDC and/or Book of Flowgate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The registered Flowgate ID Assigned by the IDC and/or Book of Flowgate.'"
	 * @generated
	 */
	int getIdcAssignedId();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcAssignedId <em>Idc Assigned Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idc Assigned Id</em>' attribute.
	 * @see #getIdcAssignedId()
	 * @generated
	 */
	void setIdcAssignedId(int value);

	/**
	 * Returns the value of the '<em><b>Power Transormers</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.PowerTransformer}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.PowerTransformer#getFlowgates <em>Flowgates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Transormers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transormers</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_PowerTransormers()
	 * @see CIM.IEC61970.Wires.PowerTransformer#getFlowgates
	 * @model opposite="Flowgates"
	 * @generated
	 */
	EList<PowerTransformer> getPowerTransormers();

	/**
	 * Returns the value of the '<em><b>Positive Impact Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Impact Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Impact Value</em>' attribute.
	 * @see #setPositiveImpactValue(int)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_PositiveImpactValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Percentage of positive impact to include in the AFC calculation.  Integer.  Must be 100 or less.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Percentage of positive impact to include in the AFC calculation.  Integer.  Must be 100 or less.'"
	 * @generated
	 */
	int getPositiveImpactValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getPositiveImpactValue <em>Positive Impact Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Impact Value</em>' attribute.
	 * @see #getPositiveImpactValue()
	 * @generated
	 */
	void setPositiveImpactValue(int value);

	/**
	 * Returns the value of the '<em><b>FT Rs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.FTR}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FT Rs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FT Rs</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_FTRs()
	 * @see CIM.IEC61970.Informative.MarketOperations.FTR#getFlowgate
	 * @model opposite="Flowgate"
	 * @generated
	 */
	EList<FTR> getFTRs();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.Line}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.Line#getFlowgates <em>Flowgates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_Lines()
	 * @see CIM.IEC61970.Wires.Line#getFlowgates
	 * @model opposite="Flowgates"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Counter Flow Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Flow Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Flow Value</em>' attribute.
	 * @see #setCounterFlowValue(int)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_CounterFlowValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Percentage of counterflow to remove/exclude from the AFC calculation.  Integer.  Must be 100 or less.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Percentage of counterflow to remove/exclude from the AFC calculation.  Integer.  Must be 100 or less.'"
	 * @generated
	 */
	int getCounterFlowValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getCounterFlowValue <em>Counter Flow Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Flow Value</em>' attribute.
	 * @see #getCounterFlowValue()
	 * @generated
	 */
	void setCounterFlowValue(int value);

	/**
	 * Returns the value of the '<em><b>Coordination Study Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Study Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Study Date</em>' attribute.
	 * @see #setCoordinationStudyDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_CoordinationStudyDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date upon which study of Flowgate to determine coordinated status was performed.  May be null is no study undertaken yet.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date upon which study of Flowgate to determine coordinated status was performed.  May be null is no study undertaken yet.'"
	 * @generated
	 */
	Date getCoordinationStudyDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getCoordinationStudyDate <em>Coordination Study Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Study Date</em>' attribute.
	 * @see #getCoordinationStudyDate()
	 * @generated
	 */
	void setCoordinationStudyDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sub Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Control Area</em>' reference.
	 * @see #setSubControlArea(SubControlArea)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_SubControlArea()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getFlowgate
	 * @model opposite="Flowgate"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area may own 0 to n flowgates\nA flowgate must be owned by exactly 1 control area'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area may own 0 to n flowgates\nA flowgate must be owned by exactly 1 control area'"
	 * @generated
	 */
	SubControlArea getSubControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getSubControlArea <em>Sub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Control Area</em>' reference.
	 * @see #getSubControlArea()
	 * @generated
	 */
	void setSubControlArea(SubControlArea value);

	/**
	 * Returns the value of the '<em><b>Idc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idc Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idc Type</em>' attribute.
	 * @see #setIdcType(Object)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_IdcType()
	 * @model dataType="CIM.FlowgateIdcType" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of Flowgate.  Values are \"PERMANENT\" (in Book of Flowgates) or \"TEMPORARY\".'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of Flowgate.  Values are \"PERMANENT\" (in Book of Flowgates) or \"TEMPORARY\".'"
	 * @generated
	 */
	Object getIdcType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcType <em>Idc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idc Type</em>' attribute.
	 * @see #getIdcType()
	 * @generated
	 */
	void setIdcType(Object value);

	/**
	 * Returns the value of the '<em><b>Managing Entity Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managing Entity Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managing Entity Flag</em>' attribute.
	 * @see #setManagingEntityFlag(boolean)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_ManagingEntityFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Standard Reliabilty Entity (e.g. in North America NERC) that has agreed per a reciprocal agreement to manage coordination on the Flowgate.  Will always be either True or False - if not a reciprocal Flowgate, will be false.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Standard Reliabilty Entity (e.g. in North America NERC) that has agreed per a reciprocal agreement to manage coordination on the Flowgate.  Will always be either True or False - if not a reciprocal Flowgate, will be false.'"
	 * @generated
	 */
	boolean isManagingEntityFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#isManagingEntityFlag <em>Managing Entity Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Entity Flag</em>' attribute.
	 * @see #isManagingEntityFlag()
	 * @generated
	 */
	void setManagingEntityFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Transmission Provider</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Financial.TransmissionProvider}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Provider</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Provider</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFlowgate_TransmissionProvider()
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getFlowgate
	 * @model opposite="Flowgate"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A flowgate can be reciprocal flowgate for 0 to n transmission providers. A transmission provider may be a reciprocal entity for 0 to n flowgates.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A flowgate can be reciprocal flowgate for 0 to n transmission providers. A transmission provider may be a reciprocal entity for 0 to n flowgates.'"
	 * @generated
	 */
	EList<TransmissionProvider> getTransmissionProvider();

} // Flowgate
