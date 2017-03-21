/**
 */
package substationStandard.LNNodes.LNGroupM;

import substationStandard.Dataclasses.DEL;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.WYE;

import substationStandard.Enumerations.HealthStateKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMXU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotW <em>Tot W</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotVAr <em>Tot VAr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotVA <em>Tot VA</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotPF <em>Tot PF</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getHz <em>Hz</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getPPV <em>PPV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getPhV <em>Ph V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getA <em>A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getW <em>W</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getVAr <em>VAr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getVA <em>VA</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getPF <em>PF</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.MMXU#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU()
 * @model
 * @generated
 */
public interface MMXU extends GroupM {
	/**
	 * Returns the value of the '<em><b>Tot W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tot W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tot W</em>' reference.
	 * @see #setTotW(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_TotW()
	 * @model required="true"
	 * @generated
	 */
	MV getTotW();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotW <em>Tot W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tot W</em>' reference.
	 * @see #getTotW()
	 * @generated
	 */
	void setTotW(MV value);

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
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

	/**
	 * Returns the value of the '<em><b>Tot VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tot VAr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tot VAr</em>' reference.
	 * @see #setTotVAr(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_TotVAr()
	 * @model required="true"
	 * @generated
	 */
	MV getTotVAr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotVAr <em>Tot VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tot VAr</em>' reference.
	 * @see #getTotVAr()
	 * @generated
	 */
	void setTotVAr(MV value);

	/**
	 * Returns the value of the '<em><b>Tot VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tot VA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tot VA</em>' reference.
	 * @see #setTotVA(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_TotVA()
	 * @model required="true"
	 * @generated
	 */
	MV getTotVA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotVA <em>Tot VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tot VA</em>' reference.
	 * @see #getTotVA()
	 * @generated
	 */
	void setTotVA(MV value);

	/**
	 * Returns the value of the '<em><b>Tot PF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tot PF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tot PF</em>' reference.
	 * @see #setTotPF(MV)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_TotPF()
	 * @model required="true"
	 * @generated
	 */
	MV getTotPF();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotPF <em>Tot PF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tot PF</em>' reference.
	 * @see #getTotPF()
	 * @generated
	 */
	void setTotPF(MV value);

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
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_Hz()
	 * @model required="true"
	 * @generated
	 */
	MV getHz();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getHz <em>Hz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hz</em>' reference.
	 * @see #getHz()
	 * @generated
	 */
	void setHz(MV value);

	/**
	 * Returns the value of the '<em><b>PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PPV</em>' reference.
	 * @see #setPPV(DEL)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_PPV()
	 * @model required="true"
	 * @generated
	 */
	DEL getPPV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getPPV <em>PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PPV</em>' reference.
	 * @see #getPPV()
	 * @generated
	 */
	void setPPV(DEL value);

	/**
	 * Returns the value of the '<em><b>Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ph V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ph V</em>' reference.
	 * @see #setPhV(WYE)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_PhV()
	 * @model required="true"
	 * @generated
	 */
	WYE getPhV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getPhV <em>Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph V</em>' reference.
	 * @see #getPhV()
	 * @generated
	 */
	void setPhV(WYE value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference.
	 * @see #setA(WYE)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_A()
	 * @model required="true"
	 * @generated
	 */
	WYE getA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getA <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(WYE value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' reference.
	 * @see #setW(WYE)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_W()
	 * @model required="true"
	 * @generated
	 */
	WYE getW();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getW <em>W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' reference.
	 * @see #getW()
	 * @generated
	 */
	void setW(WYE value);

	/**
	 * Returns the value of the '<em><b>VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAr</em>' reference.
	 * @see #setVAr(WYE)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_VAr()
	 * @model required="true"
	 * @generated
	 */
	WYE getVAr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getVAr <em>VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAr</em>' reference.
	 * @see #getVAr()
	 * @generated
	 */
	void setVAr(WYE value);

	/**
	 * Returns the value of the '<em><b>VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VA</em>' reference.
	 * @see #setVA(WYE)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_VA()
	 * @model required="true"
	 * @generated
	 */
	WYE getVA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getVA <em>VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VA</em>' reference.
	 * @see #getVA()
	 * @generated
	 */
	void setVA(WYE value);

	/**
	 * Returns the value of the '<em><b>PF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PF</em>' reference.
	 * @see #setPF(WYE)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_PF()
	 * @model required="true"
	 * @generated
	 */
	WYE getPF();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getPF <em>PF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PF</em>' reference.
	 * @see #getPF()
	 * @generated
	 */
	void setPF(WYE value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' reference.
	 * @see #setZ(WYE)
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMMXU_Z()
	 * @model required="true"
	 * @generated
	 */
	WYE getZ();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupM.MMXU#getZ <em>Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(WYE value);

} // MMXU
