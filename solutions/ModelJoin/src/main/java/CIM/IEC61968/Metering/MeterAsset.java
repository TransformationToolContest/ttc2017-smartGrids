/**
 */
package CIM.IEC61968.Metering;

import CIM.IEC61968.PaymentMetering.Transaction;

import CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.MeterAsset#getMeterAssetModel <em>Meter Asset Model</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.MeterAsset#getVendingTransactions <em>Vending Transactions</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.MeterAsset#getKR <em>KR</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.MeterAsset#getMeterServiceWorks <em>Meter Service Works</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.MeterAsset#getKH <em>KH</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.MeterAsset#getFormNumber <em>Form Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.MeterAsset#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.MeterAsset#getMeterReplacementWorks <em>Meter Replacement Works</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getMeterAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Physical asset that performs the metering role of the ServiceDeliveryPoint. Used for measuring consumption and detection of events.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Physical asset that performs the metering role of the ServiceDeliveryPoint. Used for measuring consumption and detection of events.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Physical asset that performs the metering role of the ServiceDeliveryPoint. Used for measuring consumption and detection of events.' Profile\040documentation='Physical asset that performs the metering role of the ServiceDeliveryPoint. Used for measuring consumption and detection of events.'"
 * @generated
 */
public interface MeterAsset extends EndDeviceAsset {
	/**
	 * Returns the value of the '<em><b>Meter Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getMeterAssets <em>Meter Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Asset Model</em>' reference.
	 * @see #setMeterAssetModel(MeterAssetModel)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getMeterAsset_MeterAssetModel()
	 * @see CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel#getMeterAssets
	 * @model opposite="MeterAssets"
	 * @generated
	 */
	MeterAssetModel getMeterAssetModel();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.MeterAsset#getMeterAssetModel <em>Meter Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Asset Model</em>' reference.
	 * @see #getMeterAssetModel()
	 * @generated
	 */
	void setMeterAssetModel(MeterAssetModel value);

	/**
	 * Returns the value of the '<em><b>Vending Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Transaction#getMeterAsset <em>Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vending Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vending Transactions</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getMeterAsset_VendingTransactions()
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getMeterAsset
	 * @model opposite="MeterAsset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All vending transactions on this meter asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All vending transactions on this meter asset.'"
	 * @generated
	 */
	EList<Transaction> getVendingTransactions();

	/**
	 * Returns the value of the '<em><b>KR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KR</em>' attribute.
	 * @see #setKR(float)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getMeterAsset_KR()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Display multiplier used to produce a displayed value from a register value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Display multiplier used to produce a displayed value from a register value.'"
	 * @generated
	 */
	float getKR();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.MeterAsset#getKR <em>KR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KR</em>' attribute.
	 * @see #getKR()
	 * @generated
	 */
	void setKR(float value);

	/**
	 * Returns the value of the '<em><b>Meter Service Works</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.MeterServiceWork}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.MeterServiceWork#getMeterAsset <em>Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Service Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Service Works</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getMeterAsset_MeterServiceWorks()
	 * @see CIM.IEC61968.Metering.MeterServiceWork#getMeterAsset
	 * @model opposite="MeterAsset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All non-replacement works on this meter asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All non-replacement works on this meter asset.'"
	 * @generated
	 */
	EList<MeterServiceWork> getMeterServiceWorks();

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
	 * @see CIM.IEC61968.Metering.MeteringPackage#getMeterAsset_KH()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter kh (watthour) constant. It is the number of watthours that must be applied to the meter to cause one disk revolution for an electromechanical meter or the number of watthours represented by one increment pulse for an electronic meter.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter kh (watthour) constant. It is the number of watthours that must be applied to the meter to cause one disk revolution for an electromechanical meter or the number of watthours represented by one increment pulse for an electronic meter.'"
	 * @generated
	 */
	float getKH();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.MeterAsset#getKH <em>KH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KH</em>' attribute.
	 * @see #getKH()
	 * @generated
	 */
	void setKH(float value);

	/**
	 * Returns the value of the '<em><b>Form Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Number</em>' attribute.
	 * @see #setFormNumber(String)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getMeterAsset_FormNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter form designation per ANSI C12.10 or other applicable standard. An alphanumeric designation denoting the circuit arrangement for which the meter is applicable and its specific terminal arrangement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter form designation per ANSI C12.10 or other applicable standard. An alphanumeric designation denoting the circuit arrangement for which the meter is applicable and its specific terminal arrangement.'"
	 * @generated
	 */
	String getFormNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.MeterAsset#getFormNumber <em>Form Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Number</em>' attribute.
	 * @see #getFormNumber()
	 * @generated
	 */
	void setFormNumber(String value);

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.MeterReading}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.MeterReading#getMeterAsset <em>Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getMeterAsset_MeterReadings()
	 * @see CIM.IEC61968.Metering.MeterReading#getMeterAsset
	 * @model opposite="MeterAsset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All meter readings provided by this meter asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All meter readings provided by this meter asset.'"
	 * @generated
	 */
	EList<MeterReading> getMeterReadings();

	/**
	 * Returns the value of the '<em><b>Meter Replacement Works</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.MeterServiceWork}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.MeterServiceWork#getOldMeterAsset <em>Old Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Replacement Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Replacement Works</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getMeterAsset_MeterReplacementWorks()
	 * @see CIM.IEC61968.Metering.MeterServiceWork#getOldMeterAsset
	 * @model opposite="OldMeterAsset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All works on replacement of this old meter asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All works on replacement of this old meter asset.'"
	 * @generated
	 */
	EList<MeterServiceWork> getMeterReplacementWorks();

} // MeterAsset
