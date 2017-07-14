/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP;

import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PMRI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getStrInh <em>Str Inh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getStrInhTmm <em>Str Inh Tmm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getSetA <em>Set A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getSetTms <em>Set Tms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxNumStr <em>Max Num Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxWrmStr <em>Max Wrm Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxStrTmm <em>Max Str Tmm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getEqTmm <em>Eq Tmm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getInhTmm <em>Inh Tmm</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI()
 * @model
 * @generated
 */
public interface PMRI extends GroupP {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(ACT)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Str Inh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Inh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Inh</em>' reference.
	 * @see #setStrInh(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_StrInh()
	 * @model required="true"
	 * @generated
	 */
	SPS getStrInh();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getStrInh <em>Str Inh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Inh</em>' reference.
	 * @see #getStrInh()
	 * @generated
	 */
	void setStrInh(SPS value);

	/**
	 * Returns the value of the '<em><b>Str Inh Tmm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Inh Tmm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Inh Tmm</em>' reference.
	 * @see #setStrInhTmm(INS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_StrInhTmm()
	 * @model required="true"
	 * @generated
	 */
	INS getStrInhTmm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getStrInhTmm <em>Str Inh Tmm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Inh Tmm</em>' reference.
	 * @see #getStrInhTmm()
	 * @generated
	 */
	void setStrInhTmm(INS value);

	/**
	 * Returns the value of the '<em><b>Set A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set A</em>' reference.
	 * @see #setSetA(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_SetA()
	 * @model required="true"
	 * @generated
	 */
	ASG getSetA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getSetA <em>Set A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set A</em>' reference.
	 * @see #getSetA()
	 * @generated
	 */
	void setSetA(ASG value);

	/**
	 * Returns the value of the '<em><b>Set Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Tms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Tms</em>' reference.
	 * @see #setSetTms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_SetTms()
	 * @model required="true"
	 * @generated
	 */
	ING getSetTms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getSetTms <em>Set Tms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Tms</em>' reference.
	 * @see #getSetTms()
	 * @generated
	 */
	void setSetTms(ING value);

	/**
	 * Returns the value of the '<em><b>Max Num Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Num Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Num Str</em>' reference.
	 * @see #setMaxNumStr(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_MaxNumStr()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxNumStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxNumStr <em>Max Num Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Str</em>' reference.
	 * @see #getMaxNumStr()
	 * @generated
	 */
	void setMaxNumStr(ING value);

	/**
	 * Returns the value of the '<em><b>Max Wrm Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Wrm Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Wrm Str</em>' reference.
	 * @see #setMaxWrmStr(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_MaxWrmStr()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxWrmStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxWrmStr <em>Max Wrm Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Wrm Str</em>' reference.
	 * @see #getMaxWrmStr()
	 * @generated
	 */
	void setMaxWrmStr(ING value);

	/**
	 * Returns the value of the '<em><b>Max Str Tmm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Str Tmm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Str Tmm</em>' reference.
	 * @see #setMaxStrTmm(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_MaxStrTmm()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxStrTmm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxStrTmm <em>Max Str Tmm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Str Tmm</em>' reference.
	 * @see #getMaxStrTmm()
	 * @generated
	 */
	void setMaxStrTmm(ING value);

	/**
	 * Returns the value of the '<em><b>Eq Tmm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Tmm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Tmm</em>' reference.
	 * @see #setEqTmm(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_EqTmm()
	 * @model required="true"
	 * @generated
	 */
	ING getEqTmm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getEqTmm <em>Eq Tmm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eq Tmm</em>' reference.
	 * @see #getEqTmm()
	 * @generated
	 */
	void setEqTmm(ING value);

	/**
	 * Returns the value of the '<em><b>Inh Tmm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inh Tmm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inh Tmm</em>' reference.
	 * @see #setInhTmm(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMRI_InhTmm()
	 * @model required="true"
	 * @generated
	 */
	ING getInhTmm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getInhTmm <em>Inh Tmm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inh Tmm</em>' reference.
	 * @see #getInhTmm()
	 * @generated
	 */
	void setInhTmm(ING value);

} // PMRI
