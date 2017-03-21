/**
 */
package substationStandard.LNNodes.LNGroupT;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.SAV;
import substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TVTR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.TVTR#getVol <em>Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.TVTR#getFuFail <em>Fu Fail</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.TVTR#getVRtg <em>VRtg</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getTVTR()
 * @model
 * @generated
 */
public interface TVTR extends GroupT {
	/**
	 * Returns the value of the '<em><b>Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vol</em>' reference.
	 * @see #setVol(SAV)
	 * @see substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getTVTR_Vol()
	 * @model required="true"
	 * @generated
	 */
	SAV getVol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupT.TVTR#getVol <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vol</em>' reference.
	 * @see #getVol()
	 * @generated
	 */
	void setVol(SAV value);

	/**
	 * Returns the value of the '<em><b>Fu Fail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fu Fail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fu Fail</em>' reference.
	 * @see #setFuFail(SPS)
	 * @see substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getTVTR_FuFail()
	 * @model required="true"
	 * @generated
	 */
	SPS getFuFail();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupT.TVTR#getFuFail <em>Fu Fail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fu Fail</em>' reference.
	 * @see #getFuFail()
	 * @generated
	 */
	void setFuFail(SPS value);

	/**
	 * Returns the value of the '<em><b>VRtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VRtg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VRtg</em>' reference.
	 * @see #setVRtg(ASG)
	 * @see substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getTVTR_VRtg()
	 * @model required="true"
	 * @generated
	 */
	ASG getVRtg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupT.TVTR#getVRtg <em>VRtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRtg</em>' reference.
	 * @see #getVRtg()
	 * @generated
	 */
	void setVRtg(ASG value);

} // TVTR
