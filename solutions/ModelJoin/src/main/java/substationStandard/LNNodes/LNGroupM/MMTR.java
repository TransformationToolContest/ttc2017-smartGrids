/**
 */
package substationStandard.LNNodes.LNGroupM;

import substationStandard.Dataclasses.BCR;
import substationStandard.Dataclasses.DPL;

import substationStandard.Enumerations.HealthStateKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMTR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMTR#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMTR#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMTR#getTotVAh <em>Tot VAh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMTR#getTotWh <em>Tot Wh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMTR#getTotVArh <em>Tot VArh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMTR#getSupWh <em>Sup Wh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMTR#getSupVArh <em>Sup VArh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMTR#getDmdWh <em>Dmd Wh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMTR#getDmdVArh <em>Dmd VArh</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR()
 * @model
 * @generated
 */
public interface MMTR extends GroupM {
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
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMTR#getEEName <em>EE Name</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMTR#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

	/**
	 * Returns the value of the '<em><b>Tot VAh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tot VAh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tot VAh</em>' reference.
	 * @see #setTotVAh(BCR)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR_TotVAh()
	 * @model required="true"
	 * @generated
	 */
	BCR getTotVAh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMTR#getTotVAh <em>Tot VAh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tot VAh</em>' reference.
	 * @see #getTotVAh()
	 * @generated
	 */
	void setTotVAh(BCR value);

	/**
	 * Returns the value of the '<em><b>Tot Wh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tot Wh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tot Wh</em>' reference.
	 * @see #setTotWh(BCR)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR_TotWh()
	 * @model required="true"
	 * @generated
	 */
	BCR getTotWh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMTR#getTotWh <em>Tot Wh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tot Wh</em>' reference.
	 * @see #getTotWh()
	 * @generated
	 */
	void setTotWh(BCR value);

	/**
	 * Returns the value of the '<em><b>Tot VArh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tot VArh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tot VArh</em>' reference.
	 * @see #setTotVArh(BCR)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR_TotVArh()
	 * @model required="true"
	 * @generated
	 */
	BCR getTotVArh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMTR#getTotVArh <em>Tot VArh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tot VArh</em>' reference.
	 * @see #getTotVArh()
	 * @generated
	 */
	void setTotVArh(BCR value);

	/**
	 * Returns the value of the '<em><b>Sup Wh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sup Wh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup Wh</em>' reference.
	 * @see #setSupWh(BCR)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR_SupWh()
	 * @model required="true"
	 * @generated
	 */
	BCR getSupWh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMTR#getSupWh <em>Sup Wh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sup Wh</em>' reference.
	 * @see #getSupWh()
	 * @generated
	 */
	void setSupWh(BCR value);

	/**
	 * Returns the value of the '<em><b>Sup VArh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sup VArh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup VArh</em>' reference.
	 * @see #setSupVArh(BCR)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR_SupVArh()
	 * @model required="true"
	 * @generated
	 */
	BCR getSupVArh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMTR#getSupVArh <em>Sup VArh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sup VArh</em>' reference.
	 * @see #getSupVArh()
	 * @generated
	 */
	void setSupVArh(BCR value);

	/**
	 * Returns the value of the '<em><b>Dmd Wh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmd Wh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmd Wh</em>' reference.
	 * @see #setDmdWh(BCR)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR_DmdWh()
	 * @model required="true"
	 * @generated
	 */
	BCR getDmdWh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMTR#getDmdWh <em>Dmd Wh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmd Wh</em>' reference.
	 * @see #getDmdWh()
	 * @generated
	 */
	void setDmdWh(BCR value);

	/**
	 * Returns the value of the '<em><b>Dmd VArh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmd VArh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmd VArh</em>' reference.
	 * @see #setDmdVArh(BCR)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMTR_DmdVArh()
	 * @model required="true"
	 * @generated
	 */
	BCR getDmdVArh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMTR#getDmdVArh <em>Dmd VArh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmd VArh</em>' reference.
	 * @see #getDmdVArh()
	 * @generated
	 */
	void setDmdVArh(BCR value);

} // MMTR
