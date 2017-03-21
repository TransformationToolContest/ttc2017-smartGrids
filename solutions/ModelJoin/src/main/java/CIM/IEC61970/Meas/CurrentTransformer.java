/**
 */
package CIM.IEC61970.Meas;

import CIM.IEC61970.Core.Equipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.CurrentTransformer#getMaxRatio <em>Max Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.CurrentTransformer#getCoreCount <em>Core Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.CurrentTransformer#getCtClass <em>Ct Class</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.CurrentTransformer#getUsage <em>Usage</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getCurrentTransformer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Instrument transformer used to measure electrical qualities of the circuit that is being protected and/or monitored. Typically used as current transducer for the purpose of metering or protection. A typical secondary current rating would be 5A.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Instrument transformer used to measure electrical qualities of the circuit that is being protected and/or monitored. Typically used as current transducer for the purpose of metering or protection. A typical secondary current rating would be 5A.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Instrument transformer used to measure electrical qualities of the circuit that is being protected and/or monitored. Typically used as current transducer for the purpose of metering or protection. A typical secondary current rating would be 5A.' Profile\040documentation='Instrument transformer used to measure electrical qualities of the circuit that is being protected and/or monitored. Typically used as current transducer for the purpose of metering or protection. A typical secondary current rating would be 5A.'"
 * @generated
 */
public interface CurrentTransformer extends Equipment {
	/**
	 * Returns the value of the '<em><b>Max Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ratio</em>' attribute.
	 * @see #setMaxRatio(float)
	 * @see CIM.IEC61970.Meas.MeasPackage#getCurrentTransformer_MaxRatio()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For multi-ratio CT\'s, the maximum permissable ratio attainable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For multi-ratio CT\'s, the maximum permissable ratio attainable.'"
	 * @generated
	 */
	float getMaxRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.CurrentTransformer#getMaxRatio <em>Max Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ratio</em>' attribute.
	 * @see #getMaxRatio()
	 * @generated
	 */
	void setMaxRatio(float value);

	/**
	 * Returns the value of the '<em><b>Core Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Count</em>' attribute.
	 * @see #setCoreCount(int)
	 * @see CIM.IEC61970.Meas.MeasPackage#getCurrentTransformer_CoreCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of cores.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of cores.'"
	 * @generated
	 */
	int getCoreCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.CurrentTransformer#getCoreCount <em>Core Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Count</em>' attribute.
	 * @see #getCoreCount()
	 * @generated
	 */
	void setCoreCount(int value);

	/**
	 * Returns the value of the '<em><b>Ct Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ct Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct Class</em>' attribute.
	 * @see #setCtClass(String)
	 * @see CIM.IEC61970.Meas.MeasPackage#getCurrentTransformer_CtClass()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='CT classification; i.e. class 10P.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='CT classification; i.e. class 10P.'"
	 * @generated
	 */
	String getCtClass();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.CurrentTransformer#getCtClass <em>Ct Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct Class</em>' attribute.
	 * @see #getCtClass()
	 * @generated
	 */
	void setCtClass(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(String)
	 * @see CIM.IEC61970.Meas.MeasPackage#getCurrentTransformer_Usage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Intended usage of the CT; i.e. metering, protection.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Intended usage of the CT; i.e. metering, protection.'"
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.CurrentTransformer#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

	/**
	 * Returns the value of the '<em><b>Accuracy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy Limit</em>' attribute.
	 * @see #setAccuracyLimit(String)
	 * @see CIM.IEC61970.Meas.MeasPackage#getCurrentTransformer_AccuracyLimit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Percent of rated current for which the CT remains accurate within specified limits.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Percent of rated current for which the CT remains accurate within specified limits.'"
	 * @generated
	 */
	String getAccuracyLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy Limit</em>' attribute.
	 * @see #getAccuracyLimit()
	 * @generated
	 */
	void setAccuracyLimit(String value);

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
	 * @see CIM.IEC61970.Meas.MeasPackage#getCurrentTransformer_AccuracyClass()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='CT accuracy classification.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='CT accuracy classification.'"
	 * @generated
	 */
	String getAccuracyClass();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy Class</em>' attribute.
	 * @see #getAccuracyClass()
	 * @generated
	 */
	void setAccuracyClass(String value);

} // CurrentTransformer
