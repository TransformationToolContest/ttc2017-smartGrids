/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.SPG;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDIS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPoRch <em>Po Rch</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhStr <em>Ph Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndStr <em>Gnd Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getDirMod <em>Dir Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPctRch <em>Pct Rch</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOfs <em>Ofs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPctOfs <em>Pct Ofs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisLod <em>Ris Lod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getAngLod <em>Ang Lod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getTmDlMod <em>Tm Dl Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhDlMod <em>Ph Dl Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhDlTmms <em>Ph Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndDlMod <em>Gnd Dl Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndDlTmms <em>Gnd Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getX1 <em>X1</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getLinAng <em>Lin Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisGndRch <em>Ris Gnd Rch</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisPhRch <em>Ris Ph Rch</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getK0Fact <em>K0 Fact</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getK0FactAng <em>K0 Fact Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS()
 * @model
 * @generated
 */
public interface PDIS extends GroupP {
	/**
	 * Returns the value of the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str</em>' reference.
	 * @see #setStr(ACD)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getStr <em>Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str</em>' reference.
	 * @see #getStr()
	 * @generated
	 */
	void setStr(ACD value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Po Rch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Po Rch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Po Rch</em>' reference.
	 * @see #setPoRch(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_PoRch()
	 * @model required="true"
	 * @generated
	 */
	ASG getPoRch();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPoRch <em>Po Rch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Po Rch</em>' reference.
	 * @see #getPoRch()
	 * @generated
	 */
	void setPoRch(ASG value);

	/**
	 * Returns the value of the '<em><b>Ph Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ph Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ph Str</em>' reference.
	 * @see #setPhStr(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_PhStr()
	 * @model required="true"
	 * @generated
	 */
	ASG getPhStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhStr <em>Ph Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph Str</em>' reference.
	 * @see #getPhStr()
	 * @generated
	 */
	void setPhStr(ASG value);

	/**
	 * Returns the value of the '<em><b>Gnd Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gnd Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gnd Str</em>' reference.
	 * @see #setGndStr(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_GndStr()
	 * @model required="true"
	 * @generated
	 */
	ASG getGndStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndStr <em>Gnd Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gnd Str</em>' reference.
	 * @see #getGndStr()
	 * @generated
	 */
	void setGndStr(ASG value);

	/**
	 * Returns the value of the '<em><b>Dir Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Mod</em>' reference.
	 * @see #setDirMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_DirMod()
	 * @model required="true"
	 * @generated
	 */
	ING getDirMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getDirMod <em>Dir Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Mod</em>' reference.
	 * @see #getDirMod()
	 * @generated
	 */
	void setDirMod(ING value);

	/**
	 * Returns the value of the '<em><b>Pct Rch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pct Rch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pct Rch</em>' reference.
	 * @see #setPctRch(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_PctRch()
	 * @model required="true"
	 * @generated
	 */
	ASG getPctRch();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPctRch <em>Pct Rch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pct Rch</em>' reference.
	 * @see #getPctRch()
	 * @generated
	 */
	void setPctRch(ASG value);

	/**
	 * Returns the value of the '<em><b>Ofs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ofs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ofs</em>' reference.
	 * @see #setOfs(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_Ofs()
	 * @model required="true"
	 * @generated
	 */
	ASG getOfs();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOfs <em>Ofs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ofs</em>' reference.
	 * @see #getOfs()
	 * @generated
	 */
	void setOfs(ASG value);

	/**
	 * Returns the value of the '<em><b>Pct Ofs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pct Ofs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pct Ofs</em>' reference.
	 * @see #setPctOfs(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_PctOfs()
	 * @model required="true"
	 * @generated
	 */
	ASG getPctOfs();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPctOfs <em>Pct Ofs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pct Ofs</em>' reference.
	 * @see #getPctOfs()
	 * @generated
	 */
	void setPctOfs(ASG value);

	/**
	 * Returns the value of the '<em><b>Ris Lod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ris Lod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ris Lod</em>' reference.
	 * @see #setRisLod(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_RisLod()
	 * @model required="true"
	 * @generated
	 */
	ASG getRisLod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisLod <em>Ris Lod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ris Lod</em>' reference.
	 * @see #getRisLod()
	 * @generated
	 */
	void setRisLod(ASG value);

	/**
	 * Returns the value of the '<em><b>Ang Lod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ang Lod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ang Lod</em>' reference.
	 * @see #setAngLod(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_AngLod()
	 * @model required="true"
	 * @generated
	 */
	ASG getAngLod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getAngLod <em>Ang Lod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ang Lod</em>' reference.
	 * @see #getAngLod()
	 * @generated
	 */
	void setAngLod(ASG value);

	/**
	 * Returns the value of the '<em><b>Tm Dl Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Dl Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Dl Mod</em>' reference.
	 * @see #setTmDlMod(SPG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_TmDlMod()
	 * @model required="true"
	 * @generated
	 */
	SPG getTmDlMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getTmDlMod <em>Tm Dl Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Dl Mod</em>' reference.
	 * @see #getTmDlMod()
	 * @generated
	 */
	void setTmDlMod(SPG value);

	/**
	 * Returns the value of the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Dl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Dl Tmms</em>' reference.
	 * @see #setOpDlTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_OpDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDlTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOpDlTmms <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Dl Tmms</em>' reference.
	 * @see #getOpDlTmms()
	 * @generated
	 */
	void setOpDlTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Ph Dl Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ph Dl Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ph Dl Mod</em>' reference.
	 * @see #setPhDlMod(SPG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_PhDlMod()
	 * @model required="true"
	 * @generated
	 */
	SPG getPhDlMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhDlMod <em>Ph Dl Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph Dl Mod</em>' reference.
	 * @see #getPhDlMod()
	 * @generated
	 */
	void setPhDlMod(SPG value);

	/**
	 * Returns the value of the '<em><b>Ph Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ph Dl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ph Dl Tmms</em>' reference.
	 * @see #setPhDlTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_PhDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getPhDlTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhDlTmms <em>Ph Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph Dl Tmms</em>' reference.
	 * @see #getPhDlTmms()
	 * @generated
	 */
	void setPhDlTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Gnd Dl Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gnd Dl Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gnd Dl Mod</em>' reference.
	 * @see #setGndDlMod(SPG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_GndDlMod()
	 * @model required="true"
	 * @generated
	 */
	SPG getGndDlMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndDlMod <em>Gnd Dl Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gnd Dl Mod</em>' reference.
	 * @see #getGndDlMod()
	 * @generated
	 */
	void setGndDlMod(SPG value);

	/**
	 * Returns the value of the '<em><b>Gnd Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gnd Dl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gnd Dl Tmms</em>' reference.
	 * @see #setGndDlTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_GndDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getGndDlTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndDlTmms <em>Gnd Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gnd Dl Tmms</em>' reference.
	 * @see #getGndDlTmms()
	 * @generated
	 */
	void setGndDlTmms(ING value);

	/**
	 * Returns the value of the '<em><b>X1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' reference.
	 * @see #setX1(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_X1()
	 * @model required="true"
	 * @generated
	 */
	ASG getX1();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getX1 <em>X1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' reference.
	 * @see #getX1()
	 * @generated
	 */
	void setX1(ASG value);

	/**
	 * Returns the value of the '<em><b>Lin Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lin Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lin Ang</em>' reference.
	 * @see #setLinAng(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_LinAng()
	 * @model required="true"
	 * @generated
	 */
	ASG getLinAng();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getLinAng <em>Lin Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lin Ang</em>' reference.
	 * @see #getLinAng()
	 * @generated
	 */
	void setLinAng(ASG value);

	/**
	 * Returns the value of the '<em><b>Ris Gnd Rch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ris Gnd Rch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ris Gnd Rch</em>' reference.
	 * @see #setRisGndRch(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_RisGndRch()
	 * @model required="true"
	 * @generated
	 */
	ASG getRisGndRch();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisGndRch <em>Ris Gnd Rch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ris Gnd Rch</em>' reference.
	 * @see #getRisGndRch()
	 * @generated
	 */
	void setRisGndRch(ASG value);

	/**
	 * Returns the value of the '<em><b>Ris Ph Rch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ris Ph Rch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ris Ph Rch</em>' reference.
	 * @see #setRisPhRch(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_RisPhRch()
	 * @model required="true"
	 * @generated
	 */
	ASG getRisPhRch();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisPhRch <em>Ris Ph Rch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ris Ph Rch</em>' reference.
	 * @see #getRisPhRch()
	 * @generated
	 */
	void setRisPhRch(ASG value);

	/**
	 * Returns the value of the '<em><b>K0 Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K0 Fact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K0 Fact</em>' reference.
	 * @see #setK0Fact(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_K0Fact()
	 * @model required="true"
	 * @generated
	 */
	ASG getK0Fact();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getK0Fact <em>K0 Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K0 Fact</em>' reference.
	 * @see #getK0Fact()
	 * @generated
	 */
	void setK0Fact(ASG value);

	/**
	 * Returns the value of the '<em><b>K0 Fact Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K0 Fact Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K0 Fact Ang</em>' reference.
	 * @see #setK0FactAng(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_K0FactAng()
	 * @model required="true"
	 * @generated
	 */
	ASG getK0FactAng();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getK0FactAng <em>K0 Fact Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K0 Fact Ang</em>' reference.
	 * @see #getK0FactAng()
	 * @generated
	 */
	void setK0FactAng(ASG value);

	/**
	 * Returns the value of the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rs Dl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rs Dl Tmms</em>' reference.
	 * @see #setRsDlTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIS_RsDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDlTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRsDlTmms <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Dl Tmms</em>' reference.
	 * @see #getRsDlTmms()
	 * @generated
	 */
	void setRsDlTmms(ING value);

} // PDIS
