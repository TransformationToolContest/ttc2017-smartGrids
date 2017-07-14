/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupC;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.DPL;
import gluemodel.substationStandard.Dataclasses.INC;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SPC;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CCGR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEEName <em>EE Name</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEnvTmp <em>Env Tmp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpIn <em>Oil Tmp In</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpOut <em>Oil Tmp Out</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilMotA <em>Oil Mot A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanFlw <em>Fan Flw</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanA <em>Fan A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getCECtl <em>CE Ctl</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpCtlGen <em>Pmp Ctl Gen</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpCtl <em>Pmp Ctl</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanCtlGen <em>Fan Ctl Gen</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanCtl <em>Fan Ctl</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getAuto <em>Auto</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanOvCur <em>Fan Ov Cur</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpOvCur <em>Pmp Ov Cur</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpAlm <em>Pmp Alm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpSet <em>Oil Tmp Set</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR()
 * @model
 * @generated
 */
public interface CCGR extends GroupC {
	/**
	 * Returns the value of the '<em><b>EE Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Health</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Health</em>' reference.
	 * @see #setEEHealth(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_EEHealth()
	 * @model required="true"
	 * @generated
	 */
	ING getEEHealth();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEEHealth <em>EE Health</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' reference.
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(ING value);

	/**
	 * Returns the value of the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Name</em>' reference.
	 * @see #setEEName(DPL)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEEName <em>EE Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Name</em>' reference.
	 * @see #getEEName()
	 * @generated
	 */
	void setEEName(DPL value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>Env Tmp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Tmp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Tmp</em>' reference.
	 * @see #setEnvTmp(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_EnvTmp()
	 * @model required="true"
	 * @generated
	 */
	MV getEnvTmp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEnvTmp <em>Env Tmp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Tmp</em>' reference.
	 * @see #getEnvTmp()
	 * @generated
	 */
	void setEnvTmp(MV value);

	/**
	 * Returns the value of the '<em><b>Oil Tmp In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Tmp In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Tmp In</em>' reference.
	 * @see #setOilTmpIn(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_OilTmpIn()
	 * @model required="true"
	 * @generated
	 */
	MV getOilTmpIn();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpIn <em>Oil Tmp In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Tmp In</em>' reference.
	 * @see #getOilTmpIn()
	 * @generated
	 */
	void setOilTmpIn(MV value);

	/**
	 * Returns the value of the '<em><b>Oil Tmp Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Tmp Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Tmp Out</em>' reference.
	 * @see #setOilTmpOut(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_OilTmpOut()
	 * @model required="true"
	 * @generated
	 */
	MV getOilTmpOut();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpOut <em>Oil Tmp Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Tmp Out</em>' reference.
	 * @see #getOilTmpOut()
	 * @generated
	 */
	void setOilTmpOut(MV value);

	/**
	 * Returns the value of the '<em><b>Oil Mot A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Mot A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Mot A</em>' reference.
	 * @see #setOilMotA(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_OilMotA()
	 * @model required="true"
	 * @generated
	 */
	MV getOilMotA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilMotA <em>Oil Mot A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Mot A</em>' reference.
	 * @see #getOilMotA()
	 * @generated
	 */
	void setOilMotA(MV value);

	/**
	 * Returns the value of the '<em><b>Fan Flw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan Flw</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan Flw</em>' reference.
	 * @see #setFanFlw(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_FanFlw()
	 * @model required="true"
	 * @generated
	 */
	MV getFanFlw();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanFlw <em>Fan Flw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan Flw</em>' reference.
	 * @see #getFanFlw()
	 * @generated
	 */
	void setFanFlw(MV value);

	/**
	 * Returns the value of the '<em><b>Fan A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan A</em>' reference.
	 * @see #setFanA(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_FanA()
	 * @model required="true"
	 * @generated
	 */
	MV getFanA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanA <em>Fan A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan A</em>' reference.
	 * @see #getFanA()
	 * @generated
	 */
	void setFanA(MV value);

	/**
	 * Returns the value of the '<em><b>CE Ctl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE Ctl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE Ctl</em>' reference.
	 * @see #setCECtl(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_CECtl()
	 * @model required="true"
	 * @generated
	 */
	SPC getCECtl();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getCECtl <em>CE Ctl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE Ctl</em>' reference.
	 * @see #getCECtl()
	 * @generated
	 */
	void setCECtl(SPC value);

	/**
	 * Returns the value of the '<em><b>Pmp Ctl Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pmp Ctl Gen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmp Ctl Gen</em>' reference.
	 * @see #setPmpCtlGen(INC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_PmpCtlGen()
	 * @model required="true"
	 * @generated
	 */
	INC getPmpCtlGen();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpCtlGen <em>Pmp Ctl Gen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pmp Ctl Gen</em>' reference.
	 * @see #getPmpCtlGen()
	 * @generated
	 */
	void setPmpCtlGen(INC value);

	/**
	 * Returns the value of the '<em><b>Pmp Ctl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pmp Ctl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmp Ctl</em>' reference.
	 * @see #setPmpCtl(INC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_PmpCtl()
	 * @model required="true"
	 * @generated
	 */
	INC getPmpCtl();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpCtl <em>Pmp Ctl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pmp Ctl</em>' reference.
	 * @see #getPmpCtl()
	 * @generated
	 */
	void setPmpCtl(INC value);

	/**
	 * Returns the value of the '<em><b>Fan Ctl Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan Ctl Gen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan Ctl Gen</em>' reference.
	 * @see #setFanCtlGen(INC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_FanCtlGen()
	 * @model required="true"
	 * @generated
	 */
	INC getFanCtlGen();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanCtlGen <em>Fan Ctl Gen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan Ctl Gen</em>' reference.
	 * @see #getFanCtlGen()
	 * @generated
	 */
	void setFanCtlGen(INC value);

	/**
	 * Returns the value of the '<em><b>Fan Ctl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan Ctl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan Ctl</em>' reference.
	 * @see #setFanCtl(INC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_FanCtl()
	 * @model required="true"
	 * @generated
	 */
	INC getFanCtl();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanCtl <em>Fan Ctl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan Ctl</em>' reference.
	 * @see #getFanCtl()
	 * @generated
	 */
	void setFanCtl(INC value);

	/**
	 * Returns the value of the '<em><b>Auto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto</em>' reference.
	 * @see #setAuto(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_Auto()
	 * @model required="true"
	 * @generated
	 */
	SPS getAuto();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getAuto <em>Auto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto</em>' reference.
	 * @see #getAuto()
	 * @generated
	 */
	void setAuto(SPS value);

	/**
	 * Returns the value of the '<em><b>Fan Ov Cur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan Ov Cur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan Ov Cur</em>' reference.
	 * @see #setFanOvCur(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_FanOvCur()
	 * @model required="true"
	 * @generated
	 */
	SPS getFanOvCur();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanOvCur <em>Fan Ov Cur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan Ov Cur</em>' reference.
	 * @see #getFanOvCur()
	 * @generated
	 */
	void setFanOvCur(SPS value);

	/**
	 * Returns the value of the '<em><b>Pmp Ov Cur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pmp Ov Cur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmp Ov Cur</em>' reference.
	 * @see #setPmpOvCur(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_PmpOvCur()
	 * @model required="true"
	 * @generated
	 */
	SPS getPmpOvCur();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpOvCur <em>Pmp Ov Cur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pmp Ov Cur</em>' reference.
	 * @see #getPmpOvCur()
	 * @generated
	 */
	void setPmpOvCur(SPS value);

	/**
	 * Returns the value of the '<em><b>Pmp Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pmp Alm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmp Alm</em>' reference.
	 * @see #setPmpAlm(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_PmpAlm()
	 * @model required="true"
	 * @generated
	 */
	SPS getPmpAlm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpAlm <em>Pmp Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pmp Alm</em>' reference.
	 * @see #getPmpAlm()
	 * @generated
	 */
	void setPmpAlm(SPS value);

	/**
	 * Returns the value of the '<em><b>Oil Tmp Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Tmp Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Tmp Set</em>' reference.
	 * @see #setOilTmpSet(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCCGR_OilTmpSet()
	 * @model required="true"
	 * @generated
	 */
	ASG getOilTmpSet();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpSet <em>Oil Tmp Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Tmp Set</em>' reference.
	 * @see #getOilTmpSet()
	 * @generated
	 */
	void setOilTmpSet(ASG value);

} // CCGR
