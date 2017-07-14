/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupT;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.SAV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCTR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.TCTR#getAmp <em>Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.TCTR#getARtg <em>ARtg</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getTCTR()
 * @model
 * @generated
 */
public interface TCTR extends GroupT {
	/**
	 * Returns the value of the '<em><b>Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amp</em>' reference.
	 * @see #setAmp(SAV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getTCTR_Amp()
	 * @model required="true"
	 * @generated
	 */
	SAV getAmp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TCTR#getAmp <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amp</em>' reference.
	 * @see #getAmp()
	 * @generated
	 */
	void setAmp(SAV value);

	/**
	 * Returns the value of the '<em><b>ARtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ARtg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ARtg</em>' reference.
	 * @see #setARtg(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getTCTR_ARtg()
	 * @model required="true"
	 * @generated
	 */
	ASG getARtg();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TCTR#getARtg <em>ARtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ARtg</em>' reference.
	 * @see #getARtg()
	 * @generated
	 */
	void setARtg(ASG value);

} // TCTR
