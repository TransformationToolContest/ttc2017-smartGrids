/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.IEC61968.Work.Work;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Service Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.MeterServiceWork#getOldMeterAsset <em>Old Meter Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.MeterServiceWork#getMeterAsset <em>Meter Asset</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterServiceWork()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Work involving meters.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Work involving meters.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Work involving meters.' Profile\040documentation='Work involving meters.'"
 * @generated
 */
public interface MeterServiceWork extends Work {
	/**
	 * Returns the value of the '<em><b>Old Meter Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterReplacementWorks <em>Meter Replacement Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Meter Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Meter Asset</em>' reference.
	 * @see #setOldMeterAsset(MeterAsset)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterServiceWork_OldMeterAsset()
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterReplacementWorks
	 * @model opposite="MeterReplacementWorks"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Old meter asset replaced by this work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Old meter asset replaced by this work.'"
	 * @generated
	 */
	MeterAsset getOldMeterAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.MeterServiceWork#getOldMeterAsset <em>Old Meter Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Meter Asset</em>' reference.
	 * @see #getOldMeterAsset()
	 * @generated
	 */
	void setOldMeterAsset(MeterAsset value);

	/**
	 * Returns the value of the '<em><b>Meter Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterServiceWorks <em>Meter Service Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Asset</em>' reference.
	 * @see #setMeterAsset(MeterAsset)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterServiceWork_MeterAsset()
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterServiceWorks
	 * @model opposite="MeterServiceWorks"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter asset on which this non-replacement work is performed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter asset on which this non-replacement work is performed.'"
	 * @generated
	 */
	MeterAsset getMeterAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.MeterServiceWork#getMeterAsset <em>Meter Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Asset</em>' reference.
	 * @see #getMeterAsset()
	 * @generated
	 */
	void setMeterAsset(MeterAsset value);

} // MeterServiceWork
