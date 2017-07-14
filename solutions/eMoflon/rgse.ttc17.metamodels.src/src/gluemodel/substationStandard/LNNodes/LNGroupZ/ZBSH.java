/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupZ;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.MV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZBSH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getReact <em>React</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getLosFact <em>Los Fact</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getVol <em>Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefReact <em>Ref React</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefPF <em>Ref PF</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefV <em>Ref V</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBSH()
 * @model
 * @generated
 */
public interface ZBSH extends GroupZ {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBSH_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>React</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>React</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>React</em>' reference.
	 * @see #setReact(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBSH_React()
	 * @model required="true"
	 * @generated
	 */
	MV getReact();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getReact <em>React</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>React</em>' reference.
	 * @see #getReact()
	 * @generated
	 */
	void setReact(MV value);

	/**
	 * Returns the value of the '<em><b>Los Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Los Fact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Los Fact</em>' reference.
	 * @see #setLosFact(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBSH_LosFact()
	 * @model required="true"
	 * @generated
	 */
	MV getLosFact();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getLosFact <em>Los Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Los Fact</em>' reference.
	 * @see #getLosFact()
	 * @generated
	 */
	void setLosFact(MV value);

	/**
	 * Returns the value of the '<em><b>Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vol</em>' reference.
	 * @see #setVol(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBSH_Vol()
	 * @model required="true"
	 * @generated
	 */
	MV getVol();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getVol <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vol</em>' reference.
	 * @see #getVol()
	 * @generated
	 */
	void setVol(MV value);

	/**
	 * Returns the value of the '<em><b>Ref React</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref React</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref React</em>' reference.
	 * @see #setRefReact(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBSH_RefReact()
	 * @model required="true"
	 * @generated
	 */
	ASG getRefReact();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefReact <em>Ref React</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref React</em>' reference.
	 * @see #getRefReact()
	 * @generated
	 */
	void setRefReact(ASG value);

	/**
	 * Returns the value of the '<em><b>Ref PF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref PF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref PF</em>' reference.
	 * @see #setRefPF(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBSH_RefPF()
	 * @model required="true"
	 * @generated
	 */
	ASG getRefPF();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefPF <em>Ref PF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref PF</em>' reference.
	 * @see #getRefPF()
	 * @generated
	 */
	void setRefPF(ASG value);

	/**
	 * Returns the value of the '<em><b>Ref V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref V</em>' reference.
	 * @see #setRefV(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBSH_RefV()
	 * @model required="true"
	 * @generated
	 */
	ASG getRefV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefV <em>Ref V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref V</em>' reference.
	 * @see #getRefV()
	 * @generated
	 */
	void setRefV(ASG value);

} // ZBSH
