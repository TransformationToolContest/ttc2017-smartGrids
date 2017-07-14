/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM;

import gluemodel.substationStandard.Dataclasses.CMV;
import gluemodel.substationStandard.Dataclasses.DPL;
import gluemodel.substationStandard.Dataclasses.MV;

import gluemodel.substationStandard.Enumerations.HealthStateKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMXN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getEEName <em>EE Name</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getAmp <em>Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getVol <em>Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getWatt <em>Watt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getVolAmpr <em>Vol Ampr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getVolAmp <em>Vol Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getPwrFact <em>Pwr Fact</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getImp <em>Imp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getHz <em>Hz</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN()
 * @model
 * @generated
 */
public interface MMXN extends GroupM {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getEEName <em>EE Name</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

	/**
	 * Returns the value of the '<em><b>Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amp</em>' reference.
	 * @see #setAmp(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_Amp()
	 * @model required="true"
	 * @generated
	 */
	MV getAmp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getAmp <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amp</em>' reference.
	 * @see #getAmp()
	 * @generated
	 */
	void setAmp(MV value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_Vol()
	 * @model required="true"
	 * @generated
	 */
	MV getVol();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getVol <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vol</em>' reference.
	 * @see #getVol()
	 * @generated
	 */
	void setVol(MV value);

	/**
	 * Returns the value of the '<em><b>Watt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Watt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watt</em>' reference.
	 * @see #setWatt(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_Watt()
	 * @model required="true"
	 * @generated
	 */
	MV getWatt();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getWatt <em>Watt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watt</em>' reference.
	 * @see #getWatt()
	 * @generated
	 */
	void setWatt(MV value);

	/**
	 * Returns the value of the '<em><b>Vol Ampr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vol Ampr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vol Ampr</em>' reference.
	 * @see #setVolAmpr(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_VolAmpr()
	 * @model required="true"
	 * @generated
	 */
	MV getVolAmpr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getVolAmpr <em>Vol Ampr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vol Ampr</em>' reference.
	 * @see #getVolAmpr()
	 * @generated
	 */
	void setVolAmpr(MV value);

	/**
	 * Returns the value of the '<em><b>Vol Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vol Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vol Amp</em>' reference.
	 * @see #setVolAmp(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_VolAmp()
	 * @model required="true"
	 * @generated
	 */
	MV getVolAmp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getVolAmp <em>Vol Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vol Amp</em>' reference.
	 * @see #getVolAmp()
	 * @generated
	 */
	void setVolAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Pwr Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwr Fact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwr Fact</em>' reference.
	 * @see #setPwrFact(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_PwrFact()
	 * @model required="true"
	 * @generated
	 */
	MV getPwrFact();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getPwrFact <em>Pwr Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwr Fact</em>' reference.
	 * @see #getPwrFact()
	 * @generated
	 */
	void setPwrFact(MV value);

	/**
	 * Returns the value of the '<em><b>Imp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imp</em>' reference.
	 * @see #setImp(CMV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_Imp()
	 * @model required="true"
	 * @generated
	 */
	CMV getImp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getImp <em>Imp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imp</em>' reference.
	 * @see #getImp()
	 * @generated
	 */
	void setImp(CMV value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXN_Hz()
	 * @model required="true"
	 * @generated
	 */
	MV getHz();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXN#getHz <em>Hz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hz</em>' reference.
	 * @see #getHz()
	 * @generated
	 */
	void setHz(MV value);

} // MMXN
