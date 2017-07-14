/**
 */
package gluemodel.CIM.IEC61970.StateVariables;

import gluemodel.CIM.IEC61970.Wires.TapChanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Tap Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getContinuousPosition <em>Continuous Position</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvTapStep()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='State variable for transformer tap step.     This class is to be used for taps of LTC (load tap changing) transformers, not fixed tap transformers.  Normally a profile specifies only one of the attributes \"position\"or \"tapRatio\".'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='State variable for transformer tap step.     This class is to be used for taps of LTC (load tap changing) transformers, not fixed tap transformers.  Normally a profile specifies only one of the attributes \"position\"or \"tapRatio\".'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='State variable for transformer tap step.     This class is to be used for taps of LTC (load tap changing) transformers, not fixed tap transformers.  Normally a profile specifies only one of the attributes \"position\"or \"tapRatio\".' Profile\040documentation='State variable for transformer tap step.     This class is to be used for taps of LTC (load tap changing) transformers, not fixed tap transformers.  Normally a profile specifies only one of the attributes \"position\"or \"tapRatio\".'"
 * @generated
 */
public interface SvTapStep extends StateVariable {
	/**
	 * Returns the value of the '<em><b>Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.TapChanger#getSvTapStep <em>Sv Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer</em>' reference.
	 * @see #setTapChanger(TapChanger)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvTapStep_TapChanger()
	 * @see gluemodel.CIM.IEC61970.Wires.TapChanger#getSvTapStep
	 * @model opposite="SvTapStep"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The tap changer associated with the tap step state.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tap changer associated with the tap step state.'"
	 * @generated
	 */
	TapChanger getTapChanger();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getTapChanger <em>Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Changer</em>' reference.
	 * @see #getTapChanger()
	 * @generated
	 */
	void setTapChanger(TapChanger value);

	/**
	 * Returns the value of the '<em><b>Continuous Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continuous Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuous Position</em>' attribute.
	 * @see #setContinuousPosition(float)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvTapStep_ContinuousPosition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The floating point tap position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The floating point tap position.'"
	 * @generated
	 */
	float getContinuousPosition();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getContinuousPosition <em>Continuous Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuous Position</em>' attribute.
	 * @see #getContinuousPosition()
	 * @generated
	 */
	void setContinuousPosition(float value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvTapStep_Position()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The integer tap position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The integer tap position.'"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvTapStep#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // SvTapStep
