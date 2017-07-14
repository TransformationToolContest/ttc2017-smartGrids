/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupX;

import gluemodel.substationStandard.Enumerations.SwitchTypeKind;
import gluemodel.substationStandard.Enumerations.SwitchingCapabilityKind;

import gluemodel.substationStandard.LNNodes.LNGroupC.CSWI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSWI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.XSWI#getSwOpCap <em>Sw Op Cap</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.XSWI#getMaxOpCap <em>Max Op Cap</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.XSWI#getSwTyp <em>Sw Typ</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.XSWI#getSwitchControl <em>Switch Control</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXSWI()
 * @model
 * @generated
 */
public interface XSWI extends GroupX {
	/**
	 * Returns the value of the '<em><b>Sw Op Cap</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.SwitchingCapabilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Op Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Op Cap</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #setSwOpCap(SwitchingCapabilityKind)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXSWI_SwOpCap()
	 * @model
	 * @generated
	 */
	SwitchingCapabilityKind getSwOpCap();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupX.XSWI#getSwOpCap <em>Sw Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Op Cap</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #getSwOpCap()
	 * @generated
	 */
	void setSwOpCap(SwitchingCapabilityKind value);

	/**
	 * Returns the value of the '<em><b>Max Op Cap</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.SwitchingCapabilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Op Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Op Cap</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #setMaxOpCap(SwitchingCapabilityKind)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXSWI_MaxOpCap()
	 * @model
	 * @generated
	 */
	SwitchingCapabilityKind getMaxOpCap();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupX.XSWI#getMaxOpCap <em>Max Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Op Cap</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #getMaxOpCap()
	 * @generated
	 */
	void setMaxOpCap(SwitchingCapabilityKind value);

	/**
	 * Returns the value of the '<em><b>Sw Typ</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.SwitchTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Typ</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.SwitchTypeKind
	 * @see #setSwTyp(SwitchTypeKind)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXSWI_SwTyp()
	 * @model
	 * @generated
	 */
	SwitchTypeKind getSwTyp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupX.XSWI#getSwTyp <em>Sw Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Typ</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.SwitchTypeKind
	 * @see #getSwTyp()
	 * @generated
	 */
	void setSwTyp(SwitchTypeKind value);

	/**
	 * Returns the value of the '<em><b>Switch Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Control</em>' reference.
	 * @see #setSwitchControl(CSWI)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXSWI_SwitchControl()
	 * @model
	 * @generated
	 */
	CSWI getSwitchControl();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupX.XSWI#getSwitchControl <em>Switch Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Control</em>' reference.
	 * @see #getSwitchControl()
	 * @generated
	 */
	void setSwitchControl(CSWI value);

} // XSWI
