/**
 */
package substationStandard.LNNodes.LNGroupZ;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;

import substationStandard.Enumerations.GeneratorStateKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZGEN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getGnCtl <em>Gn Ctl</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getDExt <em>DExt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getAuxSCO <em>Aux SCO</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getStopVlv <em>Stop Vlv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getReactPwrR <em>React Pwr R</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getReactPwrL <em>React Pwr L</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getGnSpd <em>Gn Spd</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getOANL <em>OANL</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getGnSt <em>Gn St</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getClkRot <em>Clk Rot</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getCntClkRot <em>Cnt Clk Rot</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getOpUnExt <em>Op Un Ext</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getOpOvExt <em>Op Ov Ext</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getLosOil <em>Los Oil</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getLosVac <em>Los Vac</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getPresAlm <em>Pres Alm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getDmdPwr <em>Dmd Pwr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getPwrRtg <em>Pwr Rtg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getVRtg <em>VRtg</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN()
 * @model
 * @generated
 */
public interface ZGEN extends GroupZ {
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
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>Gn Ctl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gn Ctl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gn Ctl</em>' reference.
	 * @see #setGnCtl(DPC)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_GnCtl()
	 * @model required="true"
	 * @generated
	 */
	DPC getGnCtl();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getGnCtl <em>Gn Ctl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gn Ctl</em>' reference.
	 * @see #getGnCtl()
	 * @generated
	 */
	void setGnCtl(DPC value);

	/**
	 * Returns the value of the '<em><b>DExt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DExt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DExt</em>' reference.
	 * @see #setDExt(SPC)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_DExt()
	 * @model required="true"
	 * @generated
	 */
	SPC getDExt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getDExt <em>DExt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DExt</em>' reference.
	 * @see #getDExt()
	 * @generated
	 */
	void setDExt(SPC value);

	/**
	 * Returns the value of the '<em><b>Aux SCO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux SCO</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux SCO</em>' reference.
	 * @see #setAuxSCO(SPC)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_AuxSCO()
	 * @model required="true"
	 * @generated
	 */
	SPC getAuxSCO();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getAuxSCO <em>Aux SCO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux SCO</em>' reference.
	 * @see #getAuxSCO()
	 * @generated
	 */
	void setAuxSCO(SPC value);

	/**
	 * Returns the value of the '<em><b>Stop Vlv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Vlv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Vlv</em>' reference.
	 * @see #setStopVlv(SPC)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_StopVlv()
	 * @model required="true"
	 * @generated
	 */
	SPC getStopVlv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getStopVlv <em>Stop Vlv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Vlv</em>' reference.
	 * @see #getStopVlv()
	 * @generated
	 */
	void setStopVlv(SPC value);

	/**
	 * Returns the value of the '<em><b>React Pwr R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>React Pwr R</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>React Pwr R</em>' reference.
	 * @see #setReactPwrR(SPC)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_ReactPwrR()
	 * @model required="true"
	 * @generated
	 */
	SPC getReactPwrR();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getReactPwrR <em>React Pwr R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>React Pwr R</em>' reference.
	 * @see #getReactPwrR()
	 * @generated
	 */
	void setReactPwrR(SPC value);

	/**
	 * Returns the value of the '<em><b>React Pwr L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>React Pwr L</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>React Pwr L</em>' reference.
	 * @see #setReactPwrL(SPC)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_ReactPwrL()
	 * @model required="true"
	 * @generated
	 */
	SPC getReactPwrL();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getReactPwrL <em>React Pwr L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>React Pwr L</em>' reference.
	 * @see #getReactPwrL()
	 * @generated
	 */
	void setReactPwrL(SPC value);

	/**
	 * Returns the value of the '<em><b>Gn Spd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gn Spd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gn Spd</em>' reference.
	 * @see #setGnSpd(MV)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_GnSpd()
	 * @model required="true"
	 * @generated
	 */
	MV getGnSpd();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getGnSpd <em>Gn Spd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gn Spd</em>' reference.
	 * @see #getGnSpd()
	 * @generated
	 */
	void setGnSpd(MV value);

	/**
	 * Returns the value of the '<em><b>OANL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OANL</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OANL</em>' reference.
	 * @see #setOANL(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_OANL()
	 * @model required="true"
	 * @generated
	 */
	SPS getOANL();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getOANL <em>OANL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OANL</em>' reference.
	 * @see #getOANL()
	 * @generated
	 */
	void setOANL(SPS value);

	/**
	 * Returns the value of the '<em><b>Gn St</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.GeneratorStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gn St</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gn St</em>' attribute.
	 * @see substationStandard.Enumerations.GeneratorStateKind
	 * @see #setGnSt(GeneratorStateKind)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_GnSt()
	 * @model
	 * @generated
	 */
	GeneratorStateKind getGnSt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getGnSt <em>Gn St</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gn St</em>' attribute.
	 * @see substationStandard.Enumerations.GeneratorStateKind
	 * @see #getGnSt()
	 * @generated
	 */
	void setGnSt(GeneratorStateKind value);

	/**
	 * Returns the value of the '<em><b>Clk Rot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clk Rot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clk Rot</em>' reference.
	 * @see #setClkRot(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_ClkRot()
	 * @model required="true"
	 * @generated
	 */
	SPS getClkRot();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getClkRot <em>Clk Rot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clk Rot</em>' reference.
	 * @see #getClkRot()
	 * @generated
	 */
	void setClkRot(SPS value);

	/**
	 * Returns the value of the '<em><b>Cnt Clk Rot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cnt Clk Rot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cnt Clk Rot</em>' reference.
	 * @see #setCntClkRot(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_CntClkRot()
	 * @model required="true"
	 * @generated
	 */
	SPS getCntClkRot();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getCntClkRot <em>Cnt Clk Rot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cnt Clk Rot</em>' reference.
	 * @see #getCntClkRot()
	 * @generated
	 */
	void setCntClkRot(SPS value);

	/**
	 * Returns the value of the '<em><b>Op Un Ext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Un Ext</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Un Ext</em>' reference.
	 * @see #setOpUnExt(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_OpUnExt()
	 * @model required="true"
	 * @generated
	 */
	SPS getOpUnExt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getOpUnExt <em>Op Un Ext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Un Ext</em>' reference.
	 * @see #getOpUnExt()
	 * @generated
	 */
	void setOpUnExt(SPS value);

	/**
	 * Returns the value of the '<em><b>Op Ov Ext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Ov Ext</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Ov Ext</em>' reference.
	 * @see #setOpOvExt(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_OpOvExt()
	 * @model required="true"
	 * @generated
	 */
	SPS getOpOvExt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getOpOvExt <em>Op Ov Ext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Ov Ext</em>' reference.
	 * @see #getOpOvExt()
	 * @generated
	 */
	void setOpOvExt(SPS value);

	/**
	 * Returns the value of the '<em><b>Los Oil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Los Oil</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Los Oil</em>' reference.
	 * @see #setLosOil(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_LosOil()
	 * @model required="true"
	 * @generated
	 */
	SPS getLosOil();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getLosOil <em>Los Oil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Los Oil</em>' reference.
	 * @see #getLosOil()
	 * @generated
	 */
	void setLosOil(SPS value);

	/**
	 * Returns the value of the '<em><b>Los Vac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Los Vac</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Los Vac</em>' reference.
	 * @see #setLosVac(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_LosVac()
	 * @model required="true"
	 * @generated
	 */
	SPS getLosVac();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getLosVac <em>Los Vac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Los Vac</em>' reference.
	 * @see #getLosVac()
	 * @generated
	 */
	void setLosVac(SPS value);

	/**
	 * Returns the value of the '<em><b>Pres Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pres Alm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pres Alm</em>' reference.
	 * @see #setPresAlm(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_PresAlm()
	 * @model required="true"
	 * @generated
	 */
	SPS getPresAlm();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getPresAlm <em>Pres Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pres Alm</em>' reference.
	 * @see #getPresAlm()
	 * @generated
	 */
	void setPresAlm(SPS value);

	/**
	 * Returns the value of the '<em><b>Dmd Pwr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmd Pwr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmd Pwr</em>' reference.
	 * @see #setDmdPwr(ASG)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_DmdPwr()
	 * @model required="true"
	 * @generated
	 */
	ASG getDmdPwr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getDmdPwr <em>Dmd Pwr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmd Pwr</em>' reference.
	 * @see #getDmdPwr()
	 * @generated
	 */
	void setDmdPwr(ASG value);

	/**
	 * Returns the value of the '<em><b>Pwr Rtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwr Rtg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwr Rtg</em>' reference.
	 * @see #setPwrRtg(ASG)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_PwrRtg()
	 * @model required="true"
	 * @generated
	 */
	ASG getPwrRtg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getPwrRtg <em>Pwr Rtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwr Rtg</em>' reference.
	 * @see #getPwrRtg()
	 * @generated
	 */
	void setPwrRtg(ASG value);

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
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZGEN_VRtg()
	 * @model required="true"
	 * @generated
	 */
	ASG getVRtg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZGEN#getVRtg <em>VRtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRtg</em>' reference.
	 * @see #getVRtg()
	 * @generated
	 */
	void setVRtg(ASG value);

} // ZGEN
