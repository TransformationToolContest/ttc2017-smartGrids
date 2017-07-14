/**
 */
package gluemodel.CIM.IEC61970.Meas;

import gluemodel.CIM.IEC61970.Core.Equipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potential Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.PotentialTransformer#getPtClass <em>Pt Class</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getPotentialTransformer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Instrument transformer (also known as Voltage Transformer) used to measure electrical qualities of the circuit that is being protected and/or monitored. Typically used as voltage transducer for the purpose of metering, protection, or sometimes auxiliary substation supply. A typical secondary voltage rating would be 120V.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Instrument transformer (also known as Voltage Transformer) used to measure electrical qualities of the circuit that is being protected and/or monitored. Typically used as voltage transducer for the purpose of metering, protection, or sometimes auxiliary substation supply. A typical secondary voltage rating would be 120V.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Instrument transformer (also known as Voltage Transformer) used to measure electrical qualities of the circuit that is being protected and/or monitored. Typically used as voltage transducer for the purpose of metering, protection, or sometimes auxiliary substation supply. A typical secondary voltage rating would be 120V.' Profile\040documentation='Instrument transformer (also known as Voltage Transformer) used to measure electrical qualities of the circuit that is being protected and/or monitored. Typically used as voltage transducer for the purpose of metering, protection, or sometimes auxiliary substation supply. A typical secondary voltage rating would be 120V.'"
 * @generated
 */
public interface PotentialTransformer extends Equipment {
	/**
	 * Returns the value of the '<em><b>Nominal Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Ratio</em>' attribute.
	 * @see #setNominalRatio(float)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getPotentialTransformer_NominalRatio()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Nominal ratio between the primary and secondary voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Nominal ratio between the primary and secondary voltage.'"
	 * @generated
	 */
	float getNominalRatio();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Ratio</em>' attribute.
	 * @see #getNominalRatio()
	 * @generated
	 */
	void setNominalRatio(float value);

	/**
	 * Returns the value of the '<em><b>Pt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt Class</em>' attribute.
	 * @see #setPtClass(String)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getPotentialTransformer_PtClass()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='PT classification.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='PT classification.'"
	 * @generated
	 */
	String getPtClass();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.PotentialTransformer#getPtClass <em>Pt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt Class</em>' attribute.
	 * @see #getPtClass()
	 * @generated
	 */
	void setPtClass(String value);

	/**
	 * Returns the value of the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy Class</em>' attribute.
	 * @see #setAccuracyClass(String)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getPotentialTransformer_AccuracyClass()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='PT accuracy classification.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='PT accuracy classification.'"
	 * @generated
	 */
	String getAccuracyClass();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy Class</em>' attribute.
	 * @see #getAccuracyClass()
	 * @generated
	 */
	void setAccuracyClass(String value);

} // PotentialTransformer
