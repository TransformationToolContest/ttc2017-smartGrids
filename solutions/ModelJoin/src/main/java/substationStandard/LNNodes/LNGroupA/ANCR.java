/**
 */
package substationStandard.LNNodes.LNGroupA;

import substationStandard.Dataclasses.BSC;
import substationStandard.Dataclasses.SPC;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ANCR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ANCR#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ANCR#getRCol <em>RCol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ANCR#getLCol <em>LCol</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getANCR()
 * @model
 * @generated
 */
public interface ANCR extends GroupA {
	/**
	 * Returns the value of the '<em><b>Tap Chg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Chg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Chg</em>' reference.
	 * @see #setTapChg(BSC)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getANCR_TapChg()
	 * @model required="true"
	 * @generated
	 */
	BSC getTapChg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ANCR#getTapChg <em>Tap Chg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Chg</em>' reference.
	 * @see #getTapChg()
	 * @generated
	 */
	void setTapChg(BSC value);

	/**
	 * Returns the value of the '<em><b>RCol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RCol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RCol</em>' reference.
	 * @see #setRCol(SPC)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getANCR_RCol()
	 * @model required="true"
	 * @generated
	 */
	SPC getRCol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ANCR#getRCol <em>RCol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RCol</em>' reference.
	 * @see #getRCol()
	 * @generated
	 */
	void setRCol(SPC value);

	/**
	 * Returns the value of the '<em><b>LCol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCol</em>' reference.
	 * @see #setLCol(SPC)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getANCR_LCol()
	 * @model required="true"
	 * @generated
	 */
	SPC getLCol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ANCR#getLCol <em>LCol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LCol</em>' reference.
	 * @see #getLCol()
	 * @generated
	 */
	void setLCol(SPC value);

} // ANCR
