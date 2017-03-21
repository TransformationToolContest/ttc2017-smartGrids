/**
 */
package substationStandard.LNNodes.LNGroupA;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.BSC;
import substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVCO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.AVCO#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.AVCO#getBlkEF <em>Blk EF</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.AVCO#getBlkAOv <em>Blk AOv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.AVCO#getBlkVOv <em>Blk VOv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.AVCO#getLimAOv <em>Lim AOv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.AVCO#getLimVOv <em>Lim VOv</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getAVCO()
 * @model
 * @generated
 */
public interface AVCO extends GroupA {
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
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getAVCO_TapChg()
	 * @model required="true"
	 * @generated
	 */
	BSC getTapChg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.AVCO#getTapChg <em>Tap Chg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Chg</em>' reference.
	 * @see #getTapChg()
	 * @generated
	 */
	void setTapChg(BSC value);

	/**
	 * Returns the value of the '<em><b>Blk EF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk EF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk EF</em>' reference.
	 * @see #setBlkEF(SPS)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getAVCO_BlkEF()
	 * @model required="true"
	 * @generated
	 */
	SPS getBlkEF();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.AVCO#getBlkEF <em>Blk EF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk EF</em>' reference.
	 * @see #getBlkEF()
	 * @generated
	 */
	void setBlkEF(SPS value);

	/**
	 * Returns the value of the '<em><b>Blk AOv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk AOv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk AOv</em>' reference.
	 * @see #setBlkAOv(SPS)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getAVCO_BlkAOv()
	 * @model required="true"
	 * @generated
	 */
	SPS getBlkAOv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.AVCO#getBlkAOv <em>Blk AOv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk AOv</em>' reference.
	 * @see #getBlkAOv()
	 * @generated
	 */
	void setBlkAOv(SPS value);

	/**
	 * Returns the value of the '<em><b>Blk VOv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk VOv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk VOv</em>' reference.
	 * @see #setBlkVOv(SPS)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getAVCO_BlkVOv()
	 * @model required="true"
	 * @generated
	 */
	SPS getBlkVOv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.AVCO#getBlkVOv <em>Blk VOv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk VOv</em>' reference.
	 * @see #getBlkVOv()
	 * @generated
	 */
	void setBlkVOv(SPS value);

	/**
	 * Returns the value of the '<em><b>Lim AOv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lim AOv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lim AOv</em>' reference.
	 * @see #setLimAOv(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getAVCO_LimAOv()
	 * @model required="true"
	 * @generated
	 */
	ASG getLimAOv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.AVCO#getLimAOv <em>Lim AOv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lim AOv</em>' reference.
	 * @see #getLimAOv()
	 * @generated
	 */
	void setLimAOv(ASG value);

	/**
	 * Returns the value of the '<em><b>Lim VOv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lim VOv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lim VOv</em>' reference.
	 * @see #setLimVOv(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getAVCO_LimVOv()
	 * @model required="true"
	 * @generated
	 */
	ASG getLimVOv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.AVCO#getLimVOv <em>Lim VOv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lim VOv</em>' reference.
	 * @see #getLimVOv()
	 * @generated
	 */
	void setLimVOv(ASG value);

} // AVCO
