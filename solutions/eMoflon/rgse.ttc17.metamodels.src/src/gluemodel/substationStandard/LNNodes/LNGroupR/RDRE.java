/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR;

import gluemodel.substationStandard.Dataclasses.INC;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.SPC;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDRE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdTrg <em>Rcd Trg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemRs <em>Mem Rs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemClr <em>Mem Clr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdMade <em>Rcd Made</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getFltNum <em>Flt Num</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getGriFltNum <em>Gri Flt Num</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdStr <em>Rcd Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemUsed <em>Mem Used</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getTrgMod <em>Trg Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getLevMod <em>Lev Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPreTmms <em>Pre Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPstTmms <em>Pst Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemFull <em>Mem Full</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMaxNumRcd <em>Max Num Rcd</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getReTrgMod <em>Re Trg Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPerTrgTms <em>Per Trg Tms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getExclTmms <em>Excl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getOpMod <em>Op Mod</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE()
 * @model
 * @generated
 */
public interface RDRE extends GroupR {
	/**
	 * Returns the value of the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Cnt Rs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #setOpCntRs(INC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_OpCntRs()
	 * @model required="true"
	 * @generated
	 */
	INC getOpCntRs();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getOpCntRs <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #getOpCntRs()
	 * @generated
	 */
	void setOpCntRs(INC value);

	/**
	 * Returns the value of the '<em><b>Rcd Trg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcd Trg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcd Trg</em>' reference.
	 * @see #setRcdTrg(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_RcdTrg()
	 * @model required="true"
	 * @generated
	 */
	SPC getRcdTrg();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdTrg <em>Rcd Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcd Trg</em>' reference.
	 * @see #getRcdTrg()
	 * @generated
	 */
	void setRcdTrg(SPC value);

	/**
	 * Returns the value of the '<em><b>Mem Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Rs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Rs</em>' reference.
	 * @see #setMemRs(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_MemRs()
	 * @model required="true"
	 * @generated
	 */
	SPC getMemRs();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemRs <em>Mem Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Rs</em>' reference.
	 * @see #getMemRs()
	 * @generated
	 */
	void setMemRs(SPC value);

	/**
	 * Returns the value of the '<em><b>Mem Clr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Clr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Clr</em>' reference.
	 * @see #setMemClr(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_MemClr()
	 * @model required="true"
	 * @generated
	 */
	SPC getMemClr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemClr <em>Mem Clr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Clr</em>' reference.
	 * @see #getMemClr()
	 * @generated
	 */
	void setMemClr(SPC value);

	/**
	 * Returns the value of the '<em><b>Rcd Made</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcd Made</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcd Made</em>' reference.
	 * @see #setRcdMade(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_RcdMade()
	 * @model required="true"
	 * @generated
	 */
	SPS getRcdMade();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdMade <em>Rcd Made</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcd Made</em>' reference.
	 * @see #getRcdMade()
	 * @generated
	 */
	void setRcdMade(SPS value);

	/**
	 * Returns the value of the '<em><b>Flt Num</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flt Num</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flt Num</em>' reference.
	 * @see #setFltNum(INS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_FltNum()
	 * @model required="true"
	 * @generated
	 */
	INS getFltNum();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getFltNum <em>Flt Num</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flt Num</em>' reference.
	 * @see #getFltNum()
	 * @generated
	 */
	void setFltNum(INS value);

	/**
	 * Returns the value of the '<em><b>Gri Flt Num</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gri Flt Num</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gri Flt Num</em>' reference.
	 * @see #setGriFltNum(INS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_GriFltNum()
	 * @model required="true"
	 * @generated
	 */
	INS getGriFltNum();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getGriFltNum <em>Gri Flt Num</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gri Flt Num</em>' reference.
	 * @see #getGriFltNum()
	 * @generated
	 */
	void setGriFltNum(INS value);

	/**
	 * Returns the value of the '<em><b>Rcd Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcd Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcd Str</em>' reference.
	 * @see #setRcdStr(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_RcdStr()
	 * @model required="true"
	 * @generated
	 */
	SPS getRcdStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdStr <em>Rcd Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcd Str</em>' reference.
	 * @see #getRcdStr()
	 * @generated
	 */
	void setRcdStr(SPS value);

	/**
	 * Returns the value of the '<em><b>Mem Used</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Used</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Used</em>' reference.
	 * @see #setMemUsed(INS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_MemUsed()
	 * @model required="true"
	 * @generated
	 */
	INS getMemUsed();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemUsed <em>Mem Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Used</em>' reference.
	 * @see #getMemUsed()
	 * @generated
	 */
	void setMemUsed(INS value);

	/**
	 * Returns the value of the '<em><b>Trg Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trg Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg Mod</em>' reference.
	 * @see #setTrgMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_TrgMod()
	 * @model required="true"
	 * @generated
	 */
	ING getTrgMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getTrgMod <em>Trg Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg Mod</em>' reference.
	 * @see #getTrgMod()
	 * @generated
	 */
	void setTrgMod(ING value);

	/**
	 * Returns the value of the '<em><b>Lev Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lev Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lev Mod</em>' reference.
	 * @see #setLevMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_LevMod()
	 * @model required="true"
	 * @generated
	 */
	ING getLevMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getLevMod <em>Lev Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lev Mod</em>' reference.
	 * @see #getLevMod()
	 * @generated
	 */
	void setLevMod(ING value);

	/**
	 * Returns the value of the '<em><b>Pre Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Tmms</em>' reference.
	 * @see #setPreTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_PreTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getPreTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPreTmms <em>Pre Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Tmms</em>' reference.
	 * @see #getPreTmms()
	 * @generated
	 */
	void setPreTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Pst Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pst Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pst Tmms</em>' reference.
	 * @see #setPstTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_PstTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getPstTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPstTmms <em>Pst Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pst Tmms</em>' reference.
	 * @see #getPstTmms()
	 * @generated
	 */
	void setPstTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Mem Full</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Full</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Full</em>' reference.
	 * @see #setMemFull(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_MemFull()
	 * @model required="true"
	 * @generated
	 */
	ING getMemFull();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemFull <em>Mem Full</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Full</em>' reference.
	 * @see #getMemFull()
	 * @generated
	 */
	void setMemFull(ING value);

	/**
	 * Returns the value of the '<em><b>Max Num Rcd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Num Rcd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Num Rcd</em>' reference.
	 * @see #setMaxNumRcd(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_MaxNumRcd()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxNumRcd();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMaxNumRcd <em>Max Num Rcd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Rcd</em>' reference.
	 * @see #getMaxNumRcd()
	 * @generated
	 */
	void setMaxNumRcd(ING value);

	/**
	 * Returns the value of the '<em><b>Re Trg Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Re Trg Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Re Trg Mod</em>' reference.
	 * @see #setReTrgMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_ReTrgMod()
	 * @model required="true"
	 * @generated
	 */
	ING getReTrgMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getReTrgMod <em>Re Trg Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Re Trg Mod</em>' reference.
	 * @see #getReTrgMod()
	 * @generated
	 */
	void setReTrgMod(ING value);

	/**
	 * Returns the value of the '<em><b>Per Trg Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Per Trg Tms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Trg Tms</em>' reference.
	 * @see #setPerTrgTms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_PerTrgTms()
	 * @model required="true"
	 * @generated
	 */
	ING getPerTrgTms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPerTrgTms <em>Per Trg Tms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Trg Tms</em>' reference.
	 * @see #getPerTrgTms()
	 * @generated
	 */
	void setPerTrgTms(ING value);

	/**
	 * Returns the value of the '<em><b>Excl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excl Tmms</em>' reference.
	 * @see #setExclTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_ExclTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getExclTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getExclTmms <em>Excl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excl Tmms</em>' reference.
	 * @see #getExclTmms()
	 * @generated
	 */
	void setExclTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Op Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Mod</em>' reference.
	 * @see #setOpMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRE_OpMod()
	 * @model required="true"
	 * @generated
	 */
	ING getOpMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getOpMod <em>Op Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Mod</em>' reference.
	 * @see #getOpMod()
	 * @generated
	 */
	void setOpMod(ING value);

} // RDRE
