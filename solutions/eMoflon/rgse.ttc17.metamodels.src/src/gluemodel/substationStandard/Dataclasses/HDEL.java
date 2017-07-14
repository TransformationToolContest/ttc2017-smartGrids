/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDEL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getPhsABHar <em>Phs AB Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getPhsBCHar <em>Phs BC Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getPhsCAHar <em>Phs CA Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getNumHar <em>Num Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getEvalTm <em>Eval Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getAngRef <em>Ang Ref</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getHvRef <em>Hv Ref</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.HDEL#getRmsCyc <em>Rms Cyc</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL()
 * @model
 * @generated
 */
public interface HDEL extends EObject {
	/**
	 * Returns the value of the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' reference.
	 * @see #setQ(Quality)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getQ <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Quality value);

	/**
	 * Returns the value of the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' reference.
	 * @see #setT(TimeStamp)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Phs AB Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs AB Har</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs AB Har</em>' reference.
	 * @see #setPhsABHar(VectorArray)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_PhsABHar()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getPhsABHar();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getPhsABHar <em>Phs AB Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs AB Har</em>' reference.
	 * @see #getPhsABHar()
	 * @generated
	 */
	void setPhsABHar(VectorArray value);

	/**
	 * Returns the value of the '<em><b>Phs BC Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs BC Har</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs BC Har</em>' reference.
	 * @see #setPhsBCHar(VectorArray)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_PhsBCHar()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getPhsBCHar();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getPhsBCHar <em>Phs BC Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs BC Har</em>' reference.
	 * @see #getPhsBCHar()
	 * @generated
	 */
	void setPhsBCHar(VectorArray value);

	/**
	 * Returns the value of the '<em><b>Phs CA Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs CA Har</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs CA Har</em>' reference.
	 * @see #setPhsCAHar(VectorArray)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_PhsCAHar()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getPhsCAHar();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getPhsCAHar <em>Phs CA Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs CA Har</em>' reference.
	 * @see #getPhsCAHar()
	 * @generated
	 */
	void setPhsCAHar(VectorArray value);

	/**
	 * Returns the value of the '<em><b>Num Har</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Har</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Har</em>' attribute.
	 * @see #setNumHar(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_NumHar()
	 * @model
	 * @generated
	 */
	int getNumHar();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getNumHar <em>Num Har</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Har</em>' attribute.
	 * @see #getNumHar()
	 * @generated
	 */
	void setNumHar(int value);

	/**
	 * Returns the value of the '<em><b>Num Cyc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Cyc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cyc</em>' attribute.
	 * @see #setNumCyc(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_NumCyc()
	 * @model
	 * @generated
	 */
	int getNumCyc();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getNumCyc <em>Num Cyc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cyc</em>' attribute.
	 * @see #getNumCyc()
	 * @generated
	 */
	void setNumCyc(int value);

	/**
	 * Returns the value of the '<em><b>Eval Tm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eval Tm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eval Tm</em>' attribute.
	 * @see #setEvalTm(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_EvalTm()
	 * @model
	 * @generated
	 */
	int getEvalTm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getEvalTm <em>Eval Tm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eval Tm</em>' attribute.
	 * @see #getEvalTm()
	 * @generated
	 */
	void setEvalTm(int value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' reference.
	 * @see #setUnits(Units)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_Units()
	 * @model required="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getUnits <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

	/**
	 * Returns the value of the '<em><b>Ang Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ang Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ang Ref</em>' reference.
	 * @see #setAngRef(AngleReference)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_AngRef()
	 * @model required="true"
	 * @generated
	 */
	AngleReference getAngRef();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getAngRef <em>Ang Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ang Ref</em>' reference.
	 * @see #getAngRef()
	 * @generated
	 */
	void setAngRef(AngleReference value);

	/**
	 * Returns the value of the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smp Rate</em>' attribute.
	 * @see #setSmpRate(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_SmpRate()
	 * @model
	 * @generated
	 */
	int getSmpRate();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getSmpRate <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smp Rate</em>' attribute.
	 * @see #getSmpRate()
	 * @generated
	 */
	void setSmpRate(int value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(float)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_Frequency()
	 * @model
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Hv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hv Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hv Ref</em>' reference.
	 * @see #setHvRef(MagReference)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_HvRef()
	 * @model required="true"
	 * @generated
	 */
	MagReference getHvRef();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getHvRef <em>Hv Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hv Ref</em>' reference.
	 * @see #getHvRef()
	 * @generated
	 */
	void setHvRef(MagReference value);

	/**
	 * Returns the value of the '<em><b>Rms Cyc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rms Cyc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rms Cyc</em>' attribute.
	 * @see #setRmsCyc(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getHDEL_RmsCyc()
	 * @model
	 * @generated
	 */
	int getRmsCyc();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.HDEL#getRmsCyc <em>Rms Cyc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rms Cyc</em>' attribute.
	 * @see #getRmsCyc()
	 * @generated
	 */
	void setRmsCyc(int value);

} // HDEL
