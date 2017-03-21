/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HYWE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getPhsAHar <em>Phs AHar</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getPhsBHar <em>Phs BHar</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getPhsCHar <em>Phs CHar</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getNeutHar <em>Neut Har</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getNetHar <em>Net Har</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getResHar <em>Res Har</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getNumHar <em>Num Har</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getEvalTm <em>Eval Tm</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getUnits <em>Units</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getAngRef <em>Ang Ref</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getHvRef <em>Hv Ref</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HYWE#getRmsCyc <em>Rms Cyc</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE()
 * @model
 * @generated
 */
public interface HYWE extends EObject {
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getQ <em>Q</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Phs AHar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs AHar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs AHar</em>' reference.
	 * @see #setPhsAHar(VectorArray)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_PhsAHar()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getPhsAHar();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getPhsAHar <em>Phs AHar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs AHar</em>' reference.
	 * @see #getPhsAHar()
	 * @generated
	 */
	void setPhsAHar(VectorArray value);

	/**
	 * Returns the value of the '<em><b>Phs BHar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs BHar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs BHar</em>' reference.
	 * @see #setPhsBHar(VectorArray)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_PhsBHar()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getPhsBHar();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getPhsBHar <em>Phs BHar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs BHar</em>' reference.
	 * @see #getPhsBHar()
	 * @generated
	 */
	void setPhsBHar(VectorArray value);

	/**
	 * Returns the value of the '<em><b>Phs CHar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs CHar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs CHar</em>' reference.
	 * @see #setPhsCHar(VectorArray)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_PhsCHar()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getPhsCHar();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getPhsCHar <em>Phs CHar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs CHar</em>' reference.
	 * @see #getPhsCHar()
	 * @generated
	 */
	void setPhsCHar(VectorArray value);

	/**
	 * Returns the value of the '<em><b>Neut Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neut Har</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neut Har</em>' reference.
	 * @see #setNeutHar(VectorArray)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_NeutHar()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getNeutHar();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getNeutHar <em>Neut Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neut Har</em>' reference.
	 * @see #getNeutHar()
	 * @generated
	 */
	void setNeutHar(VectorArray value);

	/**
	 * Returns the value of the '<em><b>Net Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Har</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Har</em>' reference.
	 * @see #setNetHar(VectorArray)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_NetHar()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getNetHar();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getNetHar <em>Net Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Har</em>' reference.
	 * @see #getNetHar()
	 * @generated
	 */
	void setNetHar(VectorArray value);

	/**
	 * Returns the value of the '<em><b>Res Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Har</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Har</em>' reference.
	 * @see #setResHar(VectorArray)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_ResHar()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getResHar();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getResHar <em>Res Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Har</em>' reference.
	 * @see #getResHar()
	 * @generated
	 */
	void setResHar(VectorArray value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_NumHar()
	 * @model
	 * @generated
	 */
	int getNumHar();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getNumHar <em>Num Har</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_NumCyc()
	 * @model
	 * @generated
	 */
	int getNumCyc();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getNumCyc <em>Num Cyc</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_EvalTm()
	 * @model
	 * @generated
	 */
	int getEvalTm();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getEvalTm <em>Eval Tm</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_Units()
	 * @model required="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getUnits <em>Units</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_AngRef()
	 * @model required="true"
	 * @generated
	 */
	AngleReference getAngRef();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getAngRef <em>Ang Ref</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_SmpRate()
	 * @model
	 * @generated
	 */
	int getSmpRate();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getSmpRate <em>Smp Rate</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_Frequency()
	 * @model
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getFrequency <em>Frequency</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_HvRef()
	 * @model required="true"
	 * @generated
	 */
	MagReference getHvRef();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getHvRef <em>Hv Ref</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHYWE_RmsCyc()
	 * @model
	 * @generated
	 */
	int getRmsCyc();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HYWE#getRmsCyc <em>Rms Cyc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rms Cyc</em>' attribute.
	 * @see #getRmsCyc()
	 * @generated
	 */
	void setRmsCyc(int value);

} // HYWE
