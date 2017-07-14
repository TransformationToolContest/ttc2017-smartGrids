/**
 */
package gluemodel.CIM.IEC61970.Meas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getValue <em>Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getAnalog <em>Analog</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getSetPoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A SetPoint is an analog control used for supervisory control.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A SetPoint is an analog control used for supervisory control.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A SetPoint is an analog control used for supervisory control.' Profile\040documentation='A SetPoint is an analog control used for supervisory control.'"
 * @generated
 */
public interface SetPoint extends Control {
	/**
	 * Returns the value of the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Value</em>' attribute.
	 * @see #setNormalValue(float)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getSetPoint_NormalValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal value for Control.value e.g. used for percentage scaling'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal value for Control.value e.g. used for percentage scaling'"
	 * @generated
	 */
	float getNormalValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Value</em>' attribute.
	 * @see #getNormalValue()
	 * @generated
	 */
	void setNormalValue(float value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getSetPoint_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value representing the actuator output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value representing the actuator output'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Analog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Analog#getSetPoint <em>Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog</em>' reference.
	 * @see #setAnalog(Analog)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getSetPoint_Analog()
	 * @see gluemodel.CIM.IEC61970.Meas.Analog#getSetPoint
	 * @model opposite="SetPoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Measurement variable used for control'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Measurement variable used for control'"
	 * @generated
	 */
	Analog getAnalog();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getAnalog <em>Analog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analog</em>' reference.
	 * @see #getAnalog()
	 * @generated
	 */
	void setAnalog(Analog value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(float)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getSetPoint_MaxValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal value range maximum for any of the Control.value. Used for scaling, e.g. in bar graphs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal value range maximum for any of the Control.value. Used for scaling, e.g. in bar graphs.'"
	 * @generated
	 */
	float getMaxValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(float value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(float)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getSetPoint_MinValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal value range minimum for any of the Control.value. Used for scaling, e.g. in bar graphs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal value range minimum for any of the Control.value. Used for scaling, e.g. in bar graphs.'"
	 * @generated
	 */
	float getMinValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.SetPoint#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(float value);

} // SetPoint
