/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupA;

import gluemodel.substationStandard.Dataclasses.BSC;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARCO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getVOvSt <em>VOv St</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getNeutAlm <em>Neut Alm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getDschBlk <em>Dsch Blk</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getARCO()
 * @model
 * @generated
 */
public interface ARCO extends GroupA {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getARCO_TapChg()
	 * @model required="true"
	 * @generated
	 */
	BSC getTapChg();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getTapChg <em>Tap Chg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Chg</em>' reference.
	 * @see #getTapChg()
	 * @generated
	 */
	void setTapChg(BSC value);

	/**
	 * Returns the value of the '<em><b>VOv St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VOv St</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VOv St</em>' reference.
	 * @see #setVOvSt(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getARCO_VOvSt()
	 * @model required="true"
	 * @generated
	 */
	SPS getVOvSt();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getVOvSt <em>VOv St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VOv St</em>' reference.
	 * @see #getVOvSt()
	 * @generated
	 */
	void setVOvSt(SPS value);

	/**
	 * Returns the value of the '<em><b>Neut Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neut Alm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neut Alm</em>' reference.
	 * @see #setNeutAlm(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getARCO_NeutAlm()
	 * @model required="true"
	 * @generated
	 */
	SPS getNeutAlm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getNeutAlm <em>Neut Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neut Alm</em>' reference.
	 * @see #getNeutAlm()
	 * @generated
	 */
	void setNeutAlm(SPS value);

	/**
	 * Returns the value of the '<em><b>Dsch Blk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsch Blk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsch Blk</em>' reference.
	 * @see #setDschBlk(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getARCO_DschBlk()
	 * @model required="true"
	 * @generated
	 */
	SPS getDschBlk();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getDschBlk <em>Dsch Blk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsch Blk</em>' reference.
	 * @see #getDschBlk()
	 * @generated
	 */
	void setDschBlk(SPS value);

} // ARCO
