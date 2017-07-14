/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupZ;

import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZSAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR#getOpCnt <em>Op Cnt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR#getOPSA <em>OPSA</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZSAR()
 * @model
 * @generated
 */
public interface ZSAR extends GroupZ {
	/**
	 * Returns the value of the '<em><b>Op Cnt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Cnt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Cnt</em>' reference.
	 * @see #setOpCnt(INS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZSAR_OpCnt()
	 * @model required="true"
	 * @generated
	 */
	INS getOpCnt();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR#getOpCnt <em>Op Cnt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt</em>' reference.
	 * @see #getOpCnt()
	 * @generated
	 */
	void setOpCnt(INS value);

	/**
	 * Returns the value of the '<em><b>OPSA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OPSA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OPSA</em>' reference.
	 * @see #setOPSA(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZSAR_OPSA()
	 * @model required="true"
	 * @generated
	 */
	SPS getOPSA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR#getOPSA <em>OPSA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OPSA</em>' reference.
	 * @see #getOPSA()
	 * @generated
	 */
	void setOPSA(SPS value);

} // ZSAR
