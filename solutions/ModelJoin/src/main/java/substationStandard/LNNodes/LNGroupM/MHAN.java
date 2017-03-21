/**
 */
package substationStandard.LNNodes.LNGroupM;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.HMV;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.MV;

import substationStandard.Enumerations.HealthStateKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MHAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHz <em>Hz</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaAmp <em>Ha Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaVol <em>Ha Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaWatt <em>Ha Watt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaVolAmpr <em>Ha Vol Ampr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaVolAmp <em>Ha Vol Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaRmsAmp <em>Ha Rms Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaRmsVol <em>Ha Rms Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTuWatt <em>Ha Tu Watt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTsWatt <em>Ha Ts Watt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaAmpTm <em>Ha Amp Tm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaKFact <em>Ha KFact</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTdFact <em>Ha Td Fact</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdAmp <em>Thd Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdOddAmp <em>Thd Odd Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdEvnAmp <em>Thd Evn Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getTddAmp <em>Tdd Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getTddOddAmp <em>Tdd Odd Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getTddEvnAmp <em>Tdd Evn Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdVol <em>Thd Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdOddVol <em>Thd Odd Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdEvnVol <em>Thd Evn Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaCfAmp <em>Ha Cf Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaCfVol <em>Ha Cf Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTiFact <em>Ha Ti Fact</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getHzSet <em>Hz Set</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getEvTmms <em>Ev Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdAVal <em>Thd AVal</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdVVal <em>Thd VVal</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdATmms <em>Thd ATmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdVTmms <em>Thd VTmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MHAN#getNomA <em>Nom A</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN()
 * @model
 * @generated
 */
public interface MHAN extends GroupM {
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
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getEEName <em>EE Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Name</em>' reference.
	 * @see #getEEName()
	 * @generated
	 */
	void setEEName(DPL value);

	/**
	 * Returns the value of the '<em><b>EE Health</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.HealthStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Health</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Health</em>' attribute.
	 * @see substationStandard.Enumerations.HealthStateKind
	 * @see #setEEHealth(HealthStateKind)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

	/**
	 * Returns the value of the '<em><b>Hz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hz</em>' reference.
	 * @see #setHz(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_Hz()
	 * @model required="true"
	 * @generated
	 */
	MV getHz();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHz <em>Hz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hz</em>' reference.
	 * @see #getHz()
	 * @generated
	 */
	void setHz(MV value);

	/**
	 * Returns the value of the '<em><b>Ha Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Amp</em>' reference.
	 * @see #setHaAmp(HMV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaAmp()
	 * @model required="true"
	 * @generated
	 */
	HMV getHaAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaAmp <em>Ha Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Amp</em>' reference.
	 * @see #getHaAmp()
	 * @generated
	 */
	void setHaAmp(HMV value);

	/**
	 * Returns the value of the '<em><b>Ha Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Vol</em>' reference.
	 * @see #setHaVol(HMV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaVol()
	 * @model required="true"
	 * @generated
	 */
	HMV getHaVol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaVol <em>Ha Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Vol</em>' reference.
	 * @see #getHaVol()
	 * @generated
	 */
	void setHaVol(HMV value);

	/**
	 * Returns the value of the '<em><b>Ha Watt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Watt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Watt</em>' reference.
	 * @see #setHaWatt(HMV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaWatt()
	 * @model required="true"
	 * @generated
	 */
	HMV getHaWatt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaWatt <em>Ha Watt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Watt</em>' reference.
	 * @see #getHaWatt()
	 * @generated
	 */
	void setHaWatt(HMV value);

	/**
	 * Returns the value of the '<em><b>Ha Vol Ampr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Vol Ampr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Vol Ampr</em>' reference.
	 * @see #setHaVolAmpr(HMV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaVolAmpr()
	 * @model required="true"
	 * @generated
	 */
	HMV getHaVolAmpr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaVolAmpr <em>Ha Vol Ampr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Vol Ampr</em>' reference.
	 * @see #getHaVolAmpr()
	 * @generated
	 */
	void setHaVolAmpr(HMV value);

	/**
	 * Returns the value of the '<em><b>Ha Vol Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Vol Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Vol Amp</em>' reference.
	 * @see #setHaVolAmp(HMV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaVolAmp()
	 * @model required="true"
	 * @generated
	 */
	HMV getHaVolAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaVolAmp <em>Ha Vol Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Vol Amp</em>' reference.
	 * @see #getHaVolAmp()
	 * @generated
	 */
	void setHaVolAmp(HMV value);

	/**
	 * Returns the value of the '<em><b>Ha Rms Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Rms Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Rms Amp</em>' reference.
	 * @see #setHaRmsAmp(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaRmsAmp()
	 * @model required="true"
	 * @generated
	 */
	MV getHaRmsAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaRmsAmp <em>Ha Rms Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Rms Amp</em>' reference.
	 * @see #getHaRmsAmp()
	 * @generated
	 */
	void setHaRmsAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Ha Rms Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Rms Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Rms Vol</em>' reference.
	 * @see #setHaRmsVol(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaRmsVol()
	 * @model required="true"
	 * @generated
	 */
	MV getHaRmsVol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaRmsVol <em>Ha Rms Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Rms Vol</em>' reference.
	 * @see #getHaRmsVol()
	 * @generated
	 */
	void setHaRmsVol(MV value);

	/**
	 * Returns the value of the '<em><b>Ha Tu Watt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Tu Watt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Tu Watt</em>' reference.
	 * @see #setHaTuWatt(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaTuWatt()
	 * @model required="true"
	 * @generated
	 */
	MV getHaTuWatt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTuWatt <em>Ha Tu Watt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Tu Watt</em>' reference.
	 * @see #getHaTuWatt()
	 * @generated
	 */
	void setHaTuWatt(MV value);

	/**
	 * Returns the value of the '<em><b>Ha Ts Watt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Ts Watt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Ts Watt</em>' reference.
	 * @see #setHaTsWatt(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaTsWatt()
	 * @model required="true"
	 * @generated
	 */
	MV getHaTsWatt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTsWatt <em>Ha Ts Watt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Ts Watt</em>' reference.
	 * @see #getHaTsWatt()
	 * @generated
	 */
	void setHaTsWatt(MV value);

	/**
	 * Returns the value of the '<em><b>Ha Amp Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Amp Tm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Amp Tm</em>' reference.
	 * @see #setHaAmpTm(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaAmpTm()
	 * @model required="true"
	 * @generated
	 */
	MV getHaAmpTm();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaAmpTm <em>Ha Amp Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Amp Tm</em>' reference.
	 * @see #getHaAmpTm()
	 * @generated
	 */
	void setHaAmpTm(MV value);

	/**
	 * Returns the value of the '<em><b>Ha KFact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha KFact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha KFact</em>' reference.
	 * @see #setHaKFact(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaKFact()
	 * @model required="true"
	 * @generated
	 */
	MV getHaKFact();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaKFact <em>Ha KFact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha KFact</em>' reference.
	 * @see #getHaKFact()
	 * @generated
	 */
	void setHaKFact(MV value);

	/**
	 * Returns the value of the '<em><b>Ha Td Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Td Fact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Td Fact</em>' reference.
	 * @see #setHaTdFact(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaTdFact()
	 * @model required="true"
	 * @generated
	 */
	MV getHaTdFact();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTdFact <em>Ha Td Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Td Fact</em>' reference.
	 * @see #getHaTdFact()
	 * @generated
	 */
	void setHaTdFact(MV value);

	/**
	 * Returns the value of the '<em><b>Thd Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Amp</em>' reference.
	 * @see #setThdAmp(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdAmp()
	 * @model required="true"
	 * @generated
	 */
	MV getThdAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdAmp <em>Thd Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Amp</em>' reference.
	 * @see #getThdAmp()
	 * @generated
	 */
	void setThdAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Thd Odd Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Odd Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Odd Amp</em>' reference.
	 * @see #setThdOddAmp(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdOddAmp()
	 * @model required="true"
	 * @generated
	 */
	MV getThdOddAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdOddAmp <em>Thd Odd Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Odd Amp</em>' reference.
	 * @see #getThdOddAmp()
	 * @generated
	 */
	void setThdOddAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Thd Evn Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Evn Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Evn Amp</em>' reference.
	 * @see #setThdEvnAmp(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdEvnAmp()
	 * @model required="true"
	 * @generated
	 */
	MV getThdEvnAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdEvnAmp <em>Thd Evn Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Evn Amp</em>' reference.
	 * @see #getThdEvnAmp()
	 * @generated
	 */
	void setThdEvnAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Tdd Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tdd Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tdd Amp</em>' reference.
	 * @see #setTddAmp(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_TddAmp()
	 * @model required="true"
	 * @generated
	 */
	MV getTddAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getTddAmp <em>Tdd Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tdd Amp</em>' reference.
	 * @see #getTddAmp()
	 * @generated
	 */
	void setTddAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Tdd Odd Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tdd Odd Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tdd Odd Amp</em>' reference.
	 * @see #setTddOddAmp(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_TddOddAmp()
	 * @model required="true"
	 * @generated
	 */
	MV getTddOddAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getTddOddAmp <em>Tdd Odd Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tdd Odd Amp</em>' reference.
	 * @see #getTddOddAmp()
	 * @generated
	 */
	void setTddOddAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Tdd Evn Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tdd Evn Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tdd Evn Amp</em>' reference.
	 * @see #setTddEvnAmp(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_TddEvnAmp()
	 * @model required="true"
	 * @generated
	 */
	MV getTddEvnAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getTddEvnAmp <em>Tdd Evn Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tdd Evn Amp</em>' reference.
	 * @see #getTddEvnAmp()
	 * @generated
	 */
	void setTddEvnAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Thd Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Vol</em>' reference.
	 * @see #setThdVol(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdVol()
	 * @model required="true"
	 * @generated
	 */
	MV getThdVol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdVol <em>Thd Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Vol</em>' reference.
	 * @see #getThdVol()
	 * @generated
	 */
	void setThdVol(MV value);

	/**
	 * Returns the value of the '<em><b>Thd Odd Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Odd Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Odd Vol</em>' reference.
	 * @see #setThdOddVol(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdOddVol()
	 * @model required="true"
	 * @generated
	 */
	MV getThdOddVol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdOddVol <em>Thd Odd Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Odd Vol</em>' reference.
	 * @see #getThdOddVol()
	 * @generated
	 */
	void setThdOddVol(MV value);

	/**
	 * Returns the value of the '<em><b>Thd Evn Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Evn Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Evn Vol</em>' reference.
	 * @see #setThdEvnVol(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdEvnVol()
	 * @model required="true"
	 * @generated
	 */
	MV getThdEvnVol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdEvnVol <em>Thd Evn Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Evn Vol</em>' reference.
	 * @see #getThdEvnVol()
	 * @generated
	 */
	void setThdEvnVol(MV value);

	/**
	 * Returns the value of the '<em><b>Ha Cf Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Cf Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Cf Amp</em>' reference.
	 * @see #setHaCfAmp(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaCfAmp()
	 * @model required="true"
	 * @generated
	 */
	MV getHaCfAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaCfAmp <em>Ha Cf Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Cf Amp</em>' reference.
	 * @see #getHaCfAmp()
	 * @generated
	 */
	void setHaCfAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Ha Cf Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Cf Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Cf Vol</em>' reference.
	 * @see #setHaCfVol(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaCfVol()
	 * @model required="true"
	 * @generated
	 */
	MV getHaCfVol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaCfVol <em>Ha Cf Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Cf Vol</em>' reference.
	 * @see #getHaCfVol()
	 * @generated
	 */
	void setHaCfVol(MV value);

	/**
	 * Returns the value of the '<em><b>Ha Ti Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Ti Fact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Ti Fact</em>' reference.
	 * @see #setHaTiFact(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HaTiFact()
	 * @model required="true"
	 * @generated
	 */
	MV getHaTiFact();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTiFact <em>Ha Ti Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Ti Fact</em>' reference.
	 * @see #getHaTiFact()
	 * @generated
	 */
	void setHaTiFact(MV value);

	/**
	 * Returns the value of the '<em><b>Hz Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hz Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hz Set</em>' reference.
	 * @see #setHzSet(ASG)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_HzSet()
	 * @model required="true"
	 * @generated
	 */
	ASG getHzSet();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHzSet <em>Hz Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hz Set</em>' reference.
	 * @see #getHzSet()
	 * @generated
	 */
	void setHzSet(ASG value);

	/**
	 * Returns the value of the '<em><b>Ev Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ev Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ev Tmms</em>' reference.
	 * @see #setEvTmms(ASG)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_EvTmms()
	 * @model required="true"
	 * @generated
	 */
	ASG getEvTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getEvTmms <em>Ev Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ev Tmms</em>' reference.
	 * @see #getEvTmms()
	 * @generated
	 */
	void setEvTmms(ASG value);

	/**
	 * Returns the value of the '<em><b>Num Cyc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Cyc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cyc</em>' reference.
	 * @see #setNumCyc(ING)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_NumCyc()
	 * @model required="true"
	 * @generated
	 */
	ING getNumCyc();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getNumCyc <em>Num Cyc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cyc</em>' reference.
	 * @see #getNumCyc()
	 * @generated
	 */
	void setNumCyc(ING value);

	/**
	 * Returns the value of the '<em><b>Thd AVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd AVal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd AVal</em>' reference.
	 * @see #setThdAVal(ASG)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdAVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getThdAVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdAVal <em>Thd AVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd AVal</em>' reference.
	 * @see #getThdAVal()
	 * @generated
	 */
	void setThdAVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Thd VVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd VVal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd VVal</em>' reference.
	 * @see #setThdVVal(ASG)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdVVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getThdVVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdVVal <em>Thd VVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd VVal</em>' reference.
	 * @see #getThdVVal()
	 * @generated
	 */
	void setThdVVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Thd ATmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd ATmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd ATmms</em>' reference.
	 * @see #setThdATmms(ING)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdATmms()
	 * @model required="true"
	 * @generated
	 */
	ING getThdATmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdATmms <em>Thd ATmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd ATmms</em>' reference.
	 * @see #getThdATmms()
	 * @generated
	 */
	void setThdATmms(ING value);

	/**
	 * Returns the value of the '<em><b>Thd VTmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd VTmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd VTmms</em>' reference.
	 * @see #setThdVTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_ThdVTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getThdVTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdVTmms <em>Thd VTmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd VTmms</em>' reference.
	 * @see #getThdVTmms()
	 * @generated
	 */
	void setThdVTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Nom A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom A</em>' reference.
	 * @see #setNomA(ASG)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAN_NomA()
	 * @model required="true"
	 * @generated
	 */
	ASG getNomA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MHAN#getNomA <em>Nom A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom A</em>' reference.
	 * @see #getNomA()
	 * @generated
	 */
	void setNomA(ASG value);

} // MHAN
