/**
 */
package gluemodel.COSEM.InterfaceClasses;

import gluemodel.COSEM.Datatypes.DisconnectControlState;
import gluemodel.COSEM.Datatypes.DisconnectControlTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disconnect Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.DisconnectControl#getState <em>State</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.DisconnectControl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage#getDisconnectControl()
 * @model
 * @generated
 */
public interface DisconnectControl extends Base {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.COSEM.Datatypes.DisconnectControlState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see gluemodel.COSEM.Datatypes.DisconnectControlState
	 * @see #setState(DisconnectControlState)
	 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage#getDisconnectControl_State()
	 * @model
	 * @generated
	 */
	DisconnectControlState getState();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.InterfaceClasses.DisconnectControl#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see gluemodel.COSEM.Datatypes.DisconnectControlState
	 * @see #getState()
	 * @generated
	 */
	void setState(DisconnectControlState value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.COSEM.Datatypes.DisconnectControlTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' attribute.
	 * @see gluemodel.COSEM.Datatypes.DisconnectControlTransition
	 * @see #setTransition(DisconnectControlTransition)
	 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage#getDisconnectControl_Transition()
	 * @model
	 * @generated
	 */
	DisconnectControlTransition getTransition();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.InterfaceClasses.DisconnectControl#getTransition <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' attribute.
	 * @see gluemodel.COSEM.Datatypes.DisconnectControlTransition
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(DisconnectControlTransition value);

} // DisconnectControl
