/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.DPL;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SPC;

import gluemodel.substationStandard.Enumerations.HealthStateKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSTA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getEEName <em>EE Name</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvAmps <em>Av Amps</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxAmps <em>Max Amps</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinAmps <em>Min Amps</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvVolts <em>Av Volts</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxVolts <em>Max Volts</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinVolts <em>Min Volts</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvVA <em>Av VA</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxVA <em>Max VA</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinVA <em>Min VA</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvW <em>Av W</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxW <em>Max W</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinW <em>Min W</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvVAr <em>Av VAr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxVAr <em>Max VAr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinVAr <em>Min VAr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getEvStr <em>Ev Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getEvTmms <em>Ev Tmms</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA()
 * @model
 * @generated
 */
public interface MSTA extends GroupM {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getEEName <em>EE Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Name</em>' reference.
	 * @see #getEEName()
	 * @generated
	 */
	void setEEName(DPL value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

	/**
	 * Returns the value of the '<em><b>Av Amps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Av Amps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Av Amps</em>' reference.
	 * @see #setAvAmps(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_AvAmps()
	 * @model required="true"
	 * @generated
	 */
	MV getAvAmps();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvAmps <em>Av Amps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Av Amps</em>' reference.
	 * @see #getAvAmps()
	 * @generated
	 */
	void setAvAmps(MV value);

	/**
	 * Returns the value of the '<em><b>Max Amps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Amps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Amps</em>' reference.
	 * @see #setMaxAmps(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MaxAmps()
	 * @model required="true"
	 * @generated
	 */
	MV getMaxAmps();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxAmps <em>Max Amps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Amps</em>' reference.
	 * @see #getMaxAmps()
	 * @generated
	 */
	void setMaxAmps(MV value);

	/**
	 * Returns the value of the '<em><b>Min Amps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Amps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Amps</em>' reference.
	 * @see #setMinAmps(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MinAmps()
	 * @model required="true"
	 * @generated
	 */
	MV getMinAmps();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinAmps <em>Min Amps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Amps</em>' reference.
	 * @see #getMinAmps()
	 * @generated
	 */
	void setMinAmps(MV value);

	/**
	 * Returns the value of the '<em><b>Av Volts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Av Volts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Av Volts</em>' reference.
	 * @see #setAvVolts(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_AvVolts()
	 * @model required="true"
	 * @generated
	 */
	MV getAvVolts();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvVolts <em>Av Volts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Av Volts</em>' reference.
	 * @see #getAvVolts()
	 * @generated
	 */
	void setAvVolts(MV value);

	/**
	 * Returns the value of the '<em><b>Max Volts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Volts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Volts</em>' reference.
	 * @see #setMaxVolts(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MaxVolts()
	 * @model required="true"
	 * @generated
	 */
	MV getMaxVolts();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxVolts <em>Max Volts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Volts</em>' reference.
	 * @see #getMaxVolts()
	 * @generated
	 */
	void setMaxVolts(MV value);

	/**
	 * Returns the value of the '<em><b>Min Volts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Volts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Volts</em>' reference.
	 * @see #setMinVolts(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MinVolts()
	 * @model required="true"
	 * @generated
	 */
	MV getMinVolts();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinVolts <em>Min Volts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Volts</em>' reference.
	 * @see #getMinVolts()
	 * @generated
	 */
	void setMinVolts(MV value);

	/**
	 * Returns the value of the '<em><b>Av VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Av VA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Av VA</em>' reference.
	 * @see #setAvVA(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_AvVA()
	 * @model required="true"
	 * @generated
	 */
	MV getAvVA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvVA <em>Av VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Av VA</em>' reference.
	 * @see #getAvVA()
	 * @generated
	 */
	void setAvVA(MV value);

	/**
	 * Returns the value of the '<em><b>Max VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max VA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max VA</em>' reference.
	 * @see #setMaxVA(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MaxVA()
	 * @model required="true"
	 * @generated
	 */
	MV getMaxVA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxVA <em>Max VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max VA</em>' reference.
	 * @see #getMaxVA()
	 * @generated
	 */
	void setMaxVA(MV value);

	/**
	 * Returns the value of the '<em><b>Min VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min VA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min VA</em>' reference.
	 * @see #setMinVA(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MinVA()
	 * @model required="true"
	 * @generated
	 */
	MV getMinVA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinVA <em>Min VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min VA</em>' reference.
	 * @see #getMinVA()
	 * @generated
	 */
	void setMinVA(MV value);

	/**
	 * Returns the value of the '<em><b>Av W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Av W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Av W</em>' reference.
	 * @see #setAvW(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_AvW()
	 * @model required="true"
	 * @generated
	 */
	MV getAvW();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvW <em>Av W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Av W</em>' reference.
	 * @see #getAvW()
	 * @generated
	 */
	void setAvW(MV value);

	/**
	 * Returns the value of the '<em><b>Max W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max W</em>' reference.
	 * @see #setMaxW(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MaxW()
	 * @model required="true"
	 * @generated
	 */
	MV getMaxW();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxW <em>Max W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max W</em>' reference.
	 * @see #getMaxW()
	 * @generated
	 */
	void setMaxW(MV value);

	/**
	 * Returns the value of the '<em><b>Min W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min W</em>' reference.
	 * @see #setMinW(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MinW()
	 * @model required="true"
	 * @generated
	 */
	MV getMinW();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinW <em>Min W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min W</em>' reference.
	 * @see #getMinW()
	 * @generated
	 */
	void setMinW(MV value);

	/**
	 * Returns the value of the '<em><b>Av VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Av VAr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Av VAr</em>' reference.
	 * @see #setAvVAr(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_AvVAr()
	 * @model required="true"
	 * @generated
	 */
	MV getAvVAr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getAvVAr <em>Av VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Av VAr</em>' reference.
	 * @see #getAvVAr()
	 * @generated
	 */
	void setAvVAr(MV value);

	/**
	 * Returns the value of the '<em><b>Max VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max VAr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max VAr</em>' reference.
	 * @see #setMaxVAr(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MaxVAr()
	 * @model required="true"
	 * @generated
	 */
	MV getMaxVAr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMaxVAr <em>Max VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max VAr</em>' reference.
	 * @see #getMaxVAr()
	 * @generated
	 */
	void setMaxVAr(MV value);

	/**
	 * Returns the value of the '<em><b>Min VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min VAr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min VAr</em>' reference.
	 * @see #setMinVAr(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_MinVAr()
	 * @model required="true"
	 * @generated
	 */
	MV getMinVAr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getMinVAr <em>Min VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min VAr</em>' reference.
	 * @see #getMinVAr()
	 * @generated
	 */
	void setMinVAr(MV value);

	/**
	 * Returns the value of the '<em><b>Ev Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ev Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ev Str</em>' reference.
	 * @see #setEvStr(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_EvStr()
	 * @model required="true"
	 * @generated
	 */
	SPC getEvStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getEvStr <em>Ev Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ev Str</em>' reference.
	 * @see #getEvStr()
	 * @generated
	 */
	void setEvStr(SPC value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSTA_EvTmms()
	 * @model required="true"
	 * @generated
	 */
	ASG getEvTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSTA#getEvTmms <em>Ev Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ev Tmms</em>' reference.
	 * @see #getEvTmms()
	 * @generated
	 */
	void setEvTmms(ASG value);

} // MSTA
