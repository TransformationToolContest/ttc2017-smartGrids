/**
 */
package substationStandard.LNNodes.LNGroupM;

import substationStandard.Dataclasses.SAV;
import substationStandard.Dataclasses.WYE;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDIF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MDIF#getOpARem <em>Op ARem</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MDIF#getAmp1 <em>Amp1</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MDIF#getAmp2 <em>Amp2</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MDIF#getAmp3 <em>Amp3</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMDIF()
 * @model
 * @generated
 */
public interface MDIF extends GroupM {
	/**
	 * Returns the value of the '<em><b>Op ARem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op ARem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op ARem</em>' reference.
	 * @see #setOpARem(WYE)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMDIF_OpARem()
	 * @model required="true"
	 * @generated
	 */
	WYE getOpARem();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MDIF#getOpARem <em>Op ARem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op ARem</em>' reference.
	 * @see #getOpARem()
	 * @generated
	 */
	void setOpARem(WYE value);

	/**
	 * Returns the value of the '<em><b>Amp1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amp1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amp1</em>' reference.
	 * @see #setAmp1(SAV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMDIF_Amp1()
	 * @model required="true"
	 * @generated
	 */
	SAV getAmp1();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MDIF#getAmp1 <em>Amp1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amp1</em>' reference.
	 * @see #getAmp1()
	 * @generated
	 */
	void setAmp1(SAV value);

	/**
	 * Returns the value of the '<em><b>Amp2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amp2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amp2</em>' reference.
	 * @see #setAmp2(SAV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMDIF_Amp2()
	 * @model required="true"
	 * @generated
	 */
	SAV getAmp2();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MDIF#getAmp2 <em>Amp2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amp2</em>' reference.
	 * @see #getAmp2()
	 * @generated
	 */
	void setAmp2(SAV value);

	/**
	 * Returns the value of the '<em><b>Amp3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amp3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amp3</em>' reference.
	 * @see #setAmp3(SAV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMDIF_Amp3()
	 * @model required="true"
	 * @generated
	 */
	SAV getAmp3();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MDIF#getAmp3 <em>Amp3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amp3</em>' reference.
	 * @see #getAmp3()
	 * @generated
	 */
	void setAmp3(SAV value);

} // MDIF
