/**
 */
package gluemodel.CIM.IEC61970.Meas;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;
import gluemodel.CIM.IEC61970.Core.Terminal;
import gluemodel.CIM.IEC61970.Core.Unit;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit;

import gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getBy_TiePoint <em>By Tie Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getDynamicSchedules <em>Dynamic Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getLocations <em>Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getAsset <em>Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getViolationLimits <em>Violation Limits</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getDocuments <em>Documents</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getPnode <em>Pnode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getUnit <em>Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getMeasurementType <em>Measurement Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Measurement#getFor_TiePoint <em>For Tie Point</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of power flow measurements and a Breaker may contain a switch status measurement. \nThe PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement.\nSome Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment. \nTwo possible paths exist:\n1) Measurement-Terminal- ConnectivityNode-Terminal-ConductingEquipment\n2) Measurement-Terminal-ConductingEquipment\nAlternative 2 is the only allowed use. \nWhen the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of power flow measurements and a Breaker may contain a switch status measurement. \nThe PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement.\nSome Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment. \nTwo possible paths exist:\n1) Measurement-Terminal- ConnectivityNode-Terminal-ConductingEquipment\n2) Measurement-Terminal-ConductingEquipment\nAlternative 2 is the only allowed use. \nWhen the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of power flow measurements and a Breaker may contain a switch status measurement. \nThe PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement.\nSome Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment. \nTwo possible paths exist:\n1) Measurement-Terminal- ConnectivityNode-Terminal-ConductingEquipment\n2) Measurement-Terminal-ConductingEquipment\nAlternative 2 is the only allowed use. \nWhen the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.' Profile\040documentation='A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of power flow measurements and a Breaker may contain a switch status measurement. \nThe PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement.\nSome Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment. \nTwo possible paths exist:\n1) Measurement-Terminal- ConnectivityNode-Terminal-ConductingEquipment\n2) Measurement-Terminal-ConductingEquipment\nAlternative 2 is the only allowed use. \nWhen the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.'"
 * @generated
 */
public interface Measurement extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>By Tie Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getBy_Measurements <em>By Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Tie Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Tie Point</em>' reference.
	 * @see #setBy_TiePoint(TiePoint)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_By_TiePoint()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getBy_Measurements
	 * @model opposite="By_Measurements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A measurement is made on the B side of a tie point'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A measurement is made on the B side of a tie point'"
	 * @generated
	 */
	TiePoint getBy_TiePoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getBy_TiePoint <em>By Tie Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Tie Point</em>' reference.
	 * @see #getBy_TiePoint()
	 * @generated
	 */
	void setBy_TiePoint(TiePoint value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Terminal#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_Terminal()
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getMeasurements
	 * @model opposite="Measurements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='One or more measurements may be associated with a terminal in the network'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='One or more measurements may be associated with a terminal in the network'"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Dynamic Schedules</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Schedules</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_DynamicSchedules()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getMeasurement
	 * @model opposite="Measurement"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A measurement is a data source for dynamic interchange schedules'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A measurement is a data source for dynamic interchange schedules'"
	 * @generated
	 */
	EList<DynamicSchedule> getDynamicSchedules();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Location#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_Locations()
	 * @see gluemodel.CIM.IEC61968.Common.Location#getMeasurements
	 * @model opposite="Measurements"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_Asset()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getMeasurements
	 * @model opposite="Measurements"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Violation Limits</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Violation Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violation Limits</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_ViolationLimits()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getMeasurement
	 * @model opposite="Measurement"
	 * @generated
	 */
	EList<ViolationLimit> getViolationLimits();

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Document}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Document#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_Documents()
	 * @see gluemodel.CIM.IEC61968.Common.Document#getMeasurements
	 * @model opposite="Measurements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurements are specified in types of documents, such as procedures.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurements are specified in types of documents, such as procedures.'"
	 * @generated
	 */
	EList<Document> getDocuments();

	/**
	 * Returns the value of the '<em><b>Pnode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pnode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnode</em>' reference.
	 * @see #setPnode(Pnode)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_Pnode()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getMeasurements
	 * @model opposite="Measurements"
	 * @generated
	 */
	Pnode getPnode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getPnode <em>Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pnode</em>' reference.
	 * @see #getPnode()
	 * @generated
	 */
	void setPnode(Pnode value);

	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_PowerSystemResource()
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getMeasurements
	 * @model opposite="Measurements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The PowerSystemResource that contains the Measurement in the naming hierarchy'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The PowerSystemResource that contains the Measurement in the naming hierarchy'"
	 * @generated
	 */
	PowerSystemResource getPowerSystemResource();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	void setPowerSystemResource(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Unit#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_Unit()
	 * @see gluemodel.CIM.IEC61970.Core.Unit#getMeasurements
	 * @model opposite="Measurements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Unit for the Measurement'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Unit for the Measurement'"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Type</em>' attribute.
	 * @see #setMeasurementType(String)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_MeasurementType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the type of Measurement, e.g. IndoorTemperature, OutDoorTemperature, BusVoltage, GeneratorVoltage, LineFlow etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the type of Measurement, e.g. IndoorTemperature, OutDoorTemperature, BusVoltage, GeneratorVoltage, LineFlow etc.'"
	 * @generated
	 */
	String getMeasurementType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getMeasurementType <em>Measurement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Type</em>' attribute.
	 * @see #getMeasurementType()
	 * @generated
	 */
	void setMeasurementType(String value);

	/**
	 * Returns the value of the '<em><b>For Tie Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getFor_Measurements <em>For Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Tie Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Tie Point</em>' reference.
	 * @see #setFor_TiePoint(TiePoint)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurement_For_TiePoint()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getFor_Measurements
	 * @model opposite="For_Measurements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A measurement is made on the A side of a tie point'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A measurement is made on the A side of a tie point'"
	 * @generated
	 */
	TiePoint getFor_TiePoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getFor_TiePoint <em>For Tie Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Tie Point</em>' reference.
	 * @see #getFor_TiePoint()
	 * @generated
	 */
	void setFor_TiePoint(TiePoint value);

} // Measurement
