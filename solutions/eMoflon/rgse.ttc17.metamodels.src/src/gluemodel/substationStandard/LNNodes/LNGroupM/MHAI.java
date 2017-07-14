/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.DEL;
import gluemodel.substationStandard.Dataclasses.DPL;
import gluemodel.substationStandard.Dataclasses.HDEL;
import gluemodel.substationStandard.Dataclasses.HYWE;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.WYE;

import gluemodel.substationStandard.Enumerations.HealthStateKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MHAI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getEEName <em>EE Name</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHz <em>Hz</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHA <em>HA</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHPhV <em>HPh V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHPPV <em>HPPV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHW <em>HW</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHVAr <em>HV Ar</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHVA <em>HVA</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHRmsA <em>HRms A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHRmsPhV <em>HRms Ph V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHRmsPPV <em>HRms PPV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHTuW <em>HTu W</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHTsW <em>HTs W</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHATm <em>HA Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHKf <em>HKf</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHTdf <em>HTdf</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdA <em>Thd A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdOddA <em>Thd Odd A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnA <em>Thd Evn A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdPhV <em>Thd Ph V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdOddPhV <em>Thd Odd Ph V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnV <em>Thd Evn V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdPPV <em>Thd PPV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdOddPPV <em>Thd Odd PPV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnPPV <em>Thd Evn PPV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHCfPhV <em>HCf Ph V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHCfPPV <em>HCf PPV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHCfA <em>HCf A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHTif <em>HTif</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHzSet <em>Hz Set</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getEvTmms <em>Ev Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdAVal <em>Thd AVal</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdVVal <em>Thd VVal</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdATmms <em>Thd ATmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdVTmms <em>Thd VTmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getNomA <em>Nom A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getEEHealth <em>EE Health</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI()
 * @model
 * @generated
 */
public interface MHAI extends GroupM {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getEEName <em>EE Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Name</em>' reference.
	 * @see #getEEName()
	 * @generated
	 */
	void setEEName(DPL value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_Hz()
	 * @model required="true"
	 * @generated
	 */
	MV getHz();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHz <em>Hz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hz</em>' reference.
	 * @see #getHz()
	 * @generated
	 */
	void setHz(MV value);

	/**
	 * Returns the value of the '<em><b>HA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HA</em>' reference.
	 * @see #setHA(HYWE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HA()
	 * @model required="true"
	 * @generated
	 */
	HYWE getHA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHA <em>HA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HA</em>' reference.
	 * @see #getHA()
	 * @generated
	 */
	void setHA(HYWE value);

	/**
	 * Returns the value of the '<em><b>HPh V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HPh V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HPh V</em>' reference.
	 * @see #setHPhV(HYWE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HPhV()
	 * @model required="true"
	 * @generated
	 */
	HYWE getHPhV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHPhV <em>HPh V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HPh V</em>' reference.
	 * @see #getHPhV()
	 * @generated
	 */
	void setHPhV(HYWE value);

	/**
	 * Returns the value of the '<em><b>HPPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HPPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HPPV</em>' reference.
	 * @see #setHPPV(HDEL)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HPPV()
	 * @model required="true"
	 * @generated
	 */
	HDEL getHPPV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHPPV <em>HPPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HPPV</em>' reference.
	 * @see #getHPPV()
	 * @generated
	 */
	void setHPPV(HDEL value);

	/**
	 * Returns the value of the '<em><b>HW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HW</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HW</em>' reference.
	 * @see #setHW(HYWE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HW()
	 * @model required="true"
	 * @generated
	 */
	HYWE getHW();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHW <em>HW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HW</em>' reference.
	 * @see #getHW()
	 * @generated
	 */
	void setHW(HYWE value);

	/**
	 * Returns the value of the '<em><b>HV Ar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HV Ar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HV Ar</em>' reference.
	 * @see #setHVAr(HYWE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HVAr()
	 * @model required="true"
	 * @generated
	 */
	HYWE getHVAr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHVAr <em>HV Ar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HV Ar</em>' reference.
	 * @see #getHVAr()
	 * @generated
	 */
	void setHVAr(HYWE value);

	/**
	 * Returns the value of the '<em><b>HVA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HVA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HVA</em>' reference.
	 * @see #setHVA(HYWE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HVA()
	 * @model required="true"
	 * @generated
	 */
	HYWE getHVA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHVA <em>HVA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HVA</em>' reference.
	 * @see #getHVA()
	 * @generated
	 */
	void setHVA(HYWE value);

	/**
	 * Returns the value of the '<em><b>HRms A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HRms A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HRms A</em>' reference.
	 * @see #setHRmsA(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HRmsA()
	 * @model required="true"
	 * @generated
	 */
	WYE getHRmsA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHRmsA <em>HRms A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HRms A</em>' reference.
	 * @see #getHRmsA()
	 * @generated
	 */
	void setHRmsA(WYE value);

	/**
	 * Returns the value of the '<em><b>HRms Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HRms Ph V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HRms Ph V</em>' reference.
	 * @see #setHRmsPhV(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HRmsPhV()
	 * @model required="true"
	 * @generated
	 */
	WYE getHRmsPhV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHRmsPhV <em>HRms Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HRms Ph V</em>' reference.
	 * @see #getHRmsPhV()
	 * @generated
	 */
	void setHRmsPhV(WYE value);

	/**
	 * Returns the value of the '<em><b>HRms PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HRms PPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HRms PPV</em>' reference.
	 * @see #setHRmsPPV(DEL)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HRmsPPV()
	 * @model required="true"
	 * @generated
	 */
	DEL getHRmsPPV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHRmsPPV <em>HRms PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HRms PPV</em>' reference.
	 * @see #getHRmsPPV()
	 * @generated
	 */
	void setHRmsPPV(DEL value);

	/**
	 * Returns the value of the '<em><b>HTu W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTu W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTu W</em>' reference.
	 * @see #setHTuW(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HTuW()
	 * @model required="true"
	 * @generated
	 */
	WYE getHTuW();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHTuW <em>HTu W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTu W</em>' reference.
	 * @see #getHTuW()
	 * @generated
	 */
	void setHTuW(WYE value);

	/**
	 * Returns the value of the '<em><b>HTs W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTs W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTs W</em>' reference.
	 * @see #setHTsW(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HTsW()
	 * @model required="true"
	 * @generated
	 */
	WYE getHTsW();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHTsW <em>HTs W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTs W</em>' reference.
	 * @see #getHTsW()
	 * @generated
	 */
	void setHTsW(WYE value);

	/**
	 * Returns the value of the '<em><b>HA Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HA Tm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HA Tm</em>' reference.
	 * @see #setHATm(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HATm()
	 * @model required="true"
	 * @generated
	 */
	WYE getHATm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHATm <em>HA Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HA Tm</em>' reference.
	 * @see #getHATm()
	 * @generated
	 */
	void setHATm(WYE value);

	/**
	 * Returns the value of the '<em><b>HKf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HKf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HKf</em>' reference.
	 * @see #setHKf(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HKf()
	 * @model required="true"
	 * @generated
	 */
	WYE getHKf();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHKf <em>HKf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HKf</em>' reference.
	 * @see #getHKf()
	 * @generated
	 */
	void setHKf(WYE value);

	/**
	 * Returns the value of the '<em><b>HTdf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTdf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTdf</em>' reference.
	 * @see #setHTdf(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HTdf()
	 * @model required="true"
	 * @generated
	 */
	WYE getHTdf();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHTdf <em>HTdf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTdf</em>' reference.
	 * @see #getHTdf()
	 * @generated
	 */
	void setHTdf(WYE value);

	/**
	 * Returns the value of the '<em><b>Thd A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd A</em>' reference.
	 * @see #setThdA(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdA()
	 * @model required="true"
	 * @generated
	 */
	WYE getThdA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdA <em>Thd A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd A</em>' reference.
	 * @see #getThdA()
	 * @generated
	 */
	void setThdA(WYE value);

	/**
	 * Returns the value of the '<em><b>Thd Odd A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Odd A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Odd A</em>' reference.
	 * @see #setThdOddA(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdOddA()
	 * @model required="true"
	 * @generated
	 */
	WYE getThdOddA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdOddA <em>Thd Odd A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Odd A</em>' reference.
	 * @see #getThdOddA()
	 * @generated
	 */
	void setThdOddA(WYE value);

	/**
	 * Returns the value of the '<em><b>Thd Evn A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Evn A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Evn A</em>' reference.
	 * @see #setThdEvnA(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdEvnA()
	 * @model required="true"
	 * @generated
	 */
	WYE getThdEvnA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnA <em>Thd Evn A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Evn A</em>' reference.
	 * @see #getThdEvnA()
	 * @generated
	 */
	void setThdEvnA(WYE value);

	/**
	 * Returns the value of the '<em><b>Thd Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Ph V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Ph V</em>' reference.
	 * @see #setThdPhV(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdPhV()
	 * @model required="true"
	 * @generated
	 */
	WYE getThdPhV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdPhV <em>Thd Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Ph V</em>' reference.
	 * @see #getThdPhV()
	 * @generated
	 */
	void setThdPhV(WYE value);

	/**
	 * Returns the value of the '<em><b>Thd Odd Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Odd Ph V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Odd Ph V</em>' reference.
	 * @see #setThdOddPhV(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdOddPhV()
	 * @model required="true"
	 * @generated
	 */
	WYE getThdOddPhV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdOddPhV <em>Thd Odd Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Odd Ph V</em>' reference.
	 * @see #getThdOddPhV()
	 * @generated
	 */
	void setThdOddPhV(WYE value);

	/**
	 * Returns the value of the '<em><b>Thd Evn V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Evn V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Evn V</em>' reference.
	 * @see #setThdEvnV(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdEvnV()
	 * @model required="true"
	 * @generated
	 */
	WYE getThdEvnV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnV <em>Thd Evn V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Evn V</em>' reference.
	 * @see #getThdEvnV()
	 * @generated
	 */
	void setThdEvnV(WYE value);

	/**
	 * Returns the value of the '<em><b>Thd PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd PPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd PPV</em>' reference.
	 * @see #setThdPPV(DEL)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdPPV()
	 * @model required="true"
	 * @generated
	 */
	DEL getThdPPV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdPPV <em>Thd PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd PPV</em>' reference.
	 * @see #getThdPPV()
	 * @generated
	 */
	void setThdPPV(DEL value);

	/**
	 * Returns the value of the '<em><b>Thd Odd PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Odd PPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Odd PPV</em>' reference.
	 * @see #setThdOddPPV(DEL)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdOddPPV()
	 * @model required="true"
	 * @generated
	 */
	DEL getThdOddPPV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdOddPPV <em>Thd Odd PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Odd PPV</em>' reference.
	 * @see #getThdOddPPV()
	 * @generated
	 */
	void setThdOddPPV(DEL value);

	/**
	 * Returns the value of the '<em><b>Thd Evn PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thd Evn PPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thd Evn PPV</em>' reference.
	 * @see #setThdEvnPPV(DEL)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdEvnPPV()
	 * @model required="true"
	 * @generated
	 */
	DEL getThdEvnPPV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnPPV <em>Thd Evn PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thd Evn PPV</em>' reference.
	 * @see #getThdEvnPPV()
	 * @generated
	 */
	void setThdEvnPPV(DEL value);

	/**
	 * Returns the value of the '<em><b>HCf Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HCf Ph V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HCf Ph V</em>' reference.
	 * @see #setHCfPhV(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HCfPhV()
	 * @model required="true"
	 * @generated
	 */
	WYE getHCfPhV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHCfPhV <em>HCf Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HCf Ph V</em>' reference.
	 * @see #getHCfPhV()
	 * @generated
	 */
	void setHCfPhV(WYE value);

	/**
	 * Returns the value of the '<em><b>HCf PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HCf PPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HCf PPV</em>' reference.
	 * @see #setHCfPPV(DEL)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HCfPPV()
	 * @model required="true"
	 * @generated
	 */
	DEL getHCfPPV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHCfPPV <em>HCf PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HCf PPV</em>' reference.
	 * @see #getHCfPPV()
	 * @generated
	 */
	void setHCfPPV(DEL value);

	/**
	 * Returns the value of the '<em><b>HCf A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HCf A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HCf A</em>' reference.
	 * @see #setHCfA(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HCfA()
	 * @model required="true"
	 * @generated
	 */
	WYE getHCfA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHCfA <em>HCf A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HCf A</em>' reference.
	 * @see #getHCfA()
	 * @generated
	 */
	void setHCfA(WYE value);

	/**
	 * Returns the value of the '<em><b>HTif</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTif</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTif</em>' reference.
	 * @see #setHTif(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HTif()
	 * @model required="true"
	 * @generated
	 */
	WYE getHTif();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHTif <em>HTif</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTif</em>' reference.
	 * @see #getHTif()
	 * @generated
	 */
	void setHTif(WYE value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_HzSet()
	 * @model required="true"
	 * @generated
	 */
	ASG getHzSet();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getHzSet <em>Hz Set</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_EvTmms()
	 * @model required="true"
	 * @generated
	 */
	ASG getEvTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getEvTmms <em>Ev Tmms</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_NumCyc()
	 * @model required="true"
	 * @generated
	 */
	ING getNumCyc();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getNumCyc <em>Num Cyc</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdAVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getThdAVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdAVal <em>Thd AVal</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdVVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getThdVVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdVVal <em>Thd VVal</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdATmms()
	 * @model required="true"
	 * @generated
	 */
	ING getThdATmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdATmms <em>Thd ATmms</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_ThdVTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getThdVTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getThdVTmms <em>Thd VTmms</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_NomA()
	 * @model required="true"
	 * @generated
	 */
	ASG getNomA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getNomA <em>Nom A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom A</em>' reference.
	 * @see #getNomA()
	 * @generated
	 */
	void setNomA(ASG value);

	/**
	 * Returns the value of the '<em><b>EE Health</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.HealthStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Health</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Health</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.HealthStateKind
	 * @see #setEEHealth(HealthStateKind)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMHAI_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MHAI#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

} // MHAI
