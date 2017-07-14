/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM;

import gluemodel.substationStandard.Dataclasses.DEL;
import gluemodel.substationStandard.Dataclasses.DPL;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SEQ;
import gluemodel.substationStandard.Dataclasses.WYE;

import gluemodel.substationStandard.Enumerations.HealthStateKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSQI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getEEName <em>EE Name</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getSeqA <em>Seq A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getSeqV <em>Seq V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getDQ0Seq <em>DQ0 Seq</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbA <em>Imb A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbNgA <em>Imb Ng A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbNgV <em>Imb Ng V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbPPV <em>Imb PPV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbV <em>Imb V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbZroA <em>Imb Zro A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbZroV <em>Imb Zro V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbA <em>Max Imb A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbPPV <em>Max Imb PPV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbV <em>Max Imb V</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI()
 * @model
 * @generated
 */
public interface MSQI extends GroupM {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getEEName <em>EE Name</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

	/**
	 * Returns the value of the '<em><b>Seq A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq A</em>' reference.
	 * @see #setSeqA(SEQ)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_SeqA()
	 * @model required="true"
	 * @generated
	 */
	SEQ getSeqA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getSeqA <em>Seq A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq A</em>' reference.
	 * @see #getSeqA()
	 * @generated
	 */
	void setSeqA(SEQ value);

	/**
	 * Returns the value of the '<em><b>Seq V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq V</em>' reference.
	 * @see #setSeqV(SEQ)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_SeqV()
	 * @model required="true"
	 * @generated
	 */
	SEQ getSeqV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getSeqV <em>Seq V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq V</em>' reference.
	 * @see #getSeqV()
	 * @generated
	 */
	void setSeqV(SEQ value);

	/**
	 * Returns the value of the '<em><b>DQ0 Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DQ0 Seq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ0 Seq</em>' reference.
	 * @see #setDQ0Seq(SEQ)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_DQ0Seq()
	 * @model required="true"
	 * @generated
	 */
	SEQ getDQ0Seq();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getDQ0Seq <em>DQ0 Seq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ0 Seq</em>' reference.
	 * @see #getDQ0Seq()
	 * @generated
	 */
	void setDQ0Seq(SEQ value);

	/**
	 * Returns the value of the '<em><b>Imb A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imb A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imb A</em>' reference.
	 * @see #setImbA(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_ImbA()
	 * @model required="true"
	 * @generated
	 */
	WYE getImbA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbA <em>Imb A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imb A</em>' reference.
	 * @see #getImbA()
	 * @generated
	 */
	void setImbA(WYE value);

	/**
	 * Returns the value of the '<em><b>Imb Ng A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imb Ng A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imb Ng A</em>' reference.
	 * @see #setImbNgA(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_ImbNgA()
	 * @model required="true"
	 * @generated
	 */
	MV getImbNgA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbNgA <em>Imb Ng A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imb Ng A</em>' reference.
	 * @see #getImbNgA()
	 * @generated
	 */
	void setImbNgA(MV value);

	/**
	 * Returns the value of the '<em><b>Imb Ng V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imb Ng V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imb Ng V</em>' reference.
	 * @see #setImbNgV(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_ImbNgV()
	 * @model required="true"
	 * @generated
	 */
	MV getImbNgV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbNgV <em>Imb Ng V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imb Ng V</em>' reference.
	 * @see #getImbNgV()
	 * @generated
	 */
	void setImbNgV(MV value);

	/**
	 * Returns the value of the '<em><b>Imb PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imb PPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imb PPV</em>' reference.
	 * @see #setImbPPV(DEL)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_ImbPPV()
	 * @model required="true"
	 * @generated
	 */
	DEL getImbPPV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbPPV <em>Imb PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imb PPV</em>' reference.
	 * @see #getImbPPV()
	 * @generated
	 */
	void setImbPPV(DEL value);

	/**
	 * Returns the value of the '<em><b>Imb V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imb V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imb V</em>' reference.
	 * @see #setImbV(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_ImbV()
	 * @model required="true"
	 * @generated
	 */
	MV getImbV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbV <em>Imb V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imb V</em>' reference.
	 * @see #getImbV()
	 * @generated
	 */
	void setImbV(MV value);

	/**
	 * Returns the value of the '<em><b>Imb Zro A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imb Zro A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imb Zro A</em>' reference.
	 * @see #setImbZroA(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_ImbZroA()
	 * @model required="true"
	 * @generated
	 */
	MV getImbZroA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbZroA <em>Imb Zro A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imb Zro A</em>' reference.
	 * @see #getImbZroA()
	 * @generated
	 */
	void setImbZroA(MV value);

	/**
	 * Returns the value of the '<em><b>Imb Zro V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imb Zro V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imb Zro V</em>' reference.
	 * @see #setImbZroV(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_ImbZroV()
	 * @model required="true"
	 * @generated
	 */
	MV getImbZroV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getImbZroV <em>Imb Zro V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imb Zro V</em>' reference.
	 * @see #getImbZroV()
	 * @generated
	 */
	void setImbZroV(MV value);

	/**
	 * Returns the value of the '<em><b>Max Imb A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Imb A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Imb A</em>' reference.
	 * @see #setMaxImbA(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_MaxImbA()
	 * @model required="true"
	 * @generated
	 */
	WYE getMaxImbA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbA <em>Max Imb A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Imb A</em>' reference.
	 * @see #getMaxImbA()
	 * @generated
	 */
	void setMaxImbA(WYE value);

	/**
	 * Returns the value of the '<em><b>Max Imb PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Imb PPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Imb PPV</em>' reference.
	 * @see #setMaxImbPPV(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_MaxImbPPV()
	 * @model required="true"
	 * @generated
	 */
	WYE getMaxImbPPV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbPPV <em>Max Imb PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Imb PPV</em>' reference.
	 * @see #getMaxImbPPV()
	 * @generated
	 */
	void setMaxImbPPV(WYE value);

	/**
	 * Returns the value of the '<em><b>Max Imb V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Imb V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Imb V</em>' reference.
	 * @see #setMaxImbV(WYE)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage#getMSQI_MaxImbV()
	 * @model required="true"
	 * @generated
	 */
	WYE getMaxImbV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbV <em>Max Imb V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Imb V</em>' reference.
	 * @see #getMaxImbV()
	 * @generated
	 */
	void setMaxImbV(WYE value);

} // MSQI
