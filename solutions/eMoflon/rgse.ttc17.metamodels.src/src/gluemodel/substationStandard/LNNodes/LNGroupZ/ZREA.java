/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupZ;

import gluemodel.substationStandard.Dataclasses.INS;

import gluemodel.substationStandard.LNNodes.LNGroupA.ARCO;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZREA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA#getReactorControl <em>Reactor Control</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZREA()
 * @model
 * @generated
 */
public interface ZREA extends GroupZ {
	/**
	 * Returns the value of the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Tmh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Tmh</em>' reference.
	 * @see #setOpTmh(INS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZREA_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>Reactor Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactor Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactor Control</em>' reference.
	 * @see #setReactorControl(ARCO)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZREA_ReactorControl()
	 * @model
	 * @generated
	 */
	ARCO getReactorControl();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA#getReactorControl <em>Reactor Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactor Control</em>' reference.
	 * @see #getReactorControl()
	 * @generated
	 */
	void setReactorControl(ARCO value);

} // ZREA
