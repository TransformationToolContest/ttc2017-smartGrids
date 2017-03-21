/**
 */
package substationStandard.LNNodes.LNGroupX;

import substationStandard.Dataclasses.BCR;
import substationStandard.Dataclasses.INS;

import substationStandard.Enumerations.SwitchingCapabilityKind;

import substationStandard.LNNodes.LNGroupC.CSWI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCBR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.XCBR#getSumSwARs <em>Sum Sw ARs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.XCBR#getCBOpCap <em>CB Op Cap</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.XCBR#getPOWCap <em>POW Cap</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.XCBR#getMaxOpCap <em>Max Op Cap</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.XCBR#getSwitchControl <em>Switch Control</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXCBR()
 * @model
 * @generated
 */
public interface XCBR extends GroupX {
	/**
	 * Returns the value of the '<em><b>Sum Sw ARs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sum Sw ARs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Sw ARs</em>' reference.
	 * @see #setSumSwARs(BCR)
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXCBR_SumSwARs()
	 * @model required="true"
	 * @generated
	 */
	BCR getSumSwARs();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.XCBR#getSumSwARs <em>Sum Sw ARs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sum Sw ARs</em>' reference.
	 * @see #getSumSwARs()
	 * @generated
	 */
	void setSumSwARs(BCR value);

	/**
	 * Returns the value of the '<em><b>CB Op Cap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CB Op Cap</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CB Op Cap</em>' reference.
	 * @see #setCBOpCap(INS)
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXCBR_CBOpCap()
	 * @model required="true"
	 * @generated
	 */
	INS getCBOpCap();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.XCBR#getCBOpCap <em>CB Op Cap</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CB Op Cap</em>' reference.
	 * @see #getCBOpCap()
	 * @generated
	 */
	void setCBOpCap(INS value);

	/**
	 * Returns the value of the '<em><b>POW Cap</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.SwitchingCapabilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>POW Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>POW Cap</em>' attribute.
	 * @see substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #setPOWCap(SwitchingCapabilityKind)
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXCBR_POWCap()
	 * @model
	 * @generated
	 */
	SwitchingCapabilityKind getPOWCap();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.XCBR#getPOWCap <em>POW Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>POW Cap</em>' attribute.
	 * @see substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #getPOWCap()
	 * @generated
	 */
	void setPOWCap(SwitchingCapabilityKind value);

	/**
	 * Returns the value of the '<em><b>Max Op Cap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Op Cap</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Op Cap</em>' reference.
	 * @see #setMaxOpCap(INS)
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXCBR_MaxOpCap()
	 * @model required="true"
	 * @generated
	 */
	INS getMaxOpCap();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.XCBR#getMaxOpCap <em>Max Op Cap</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Op Cap</em>' reference.
	 * @see #getMaxOpCap()
	 * @generated
	 */
	void setMaxOpCap(INS value);

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
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getXCBR_SwitchControl()
	 * @model
	 * @generated
	 */
	CSWI getSwitchControl();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.XCBR#getSwitchControl <em>Switch Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Control</em>' reference.
	 * @see #getSwitchControl()
	 * @generated
	 */
	void setSwitchControl(CSWI value);

} // XCBR
