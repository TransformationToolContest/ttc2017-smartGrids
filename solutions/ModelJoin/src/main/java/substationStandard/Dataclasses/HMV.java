/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.HMV#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getHar <em>Har</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getNumHar <em>Num Har</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getEvalTm <em>Eval Tm</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getUnits <em>Units</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getHvRef <em>Hv Ref</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.HMV#getRmsCyc <em>Rms Cyc</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV()
 * @model
 * @generated
 */
public interface HMV extends EObject {
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getQ <em>Q</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Har</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Har</em>' reference.
	 * @see #setHar(VectorArray)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_Har()
	 * @model required="true"
	 * @generated
	 */
	VectorArray getHar();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getHar <em>Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Har</em>' reference.
	 * @see #getHar()
	 * @generated
	 */
	void setHar(VectorArray value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_NumHar()
	 * @model
	 * @generated
	 */
	int getNumHar();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getNumHar <em>Num Har</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_NumCyc()
	 * @model
	 * @generated
	 */
	int getNumCyc();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getNumCyc <em>Num Cyc</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_EvalTm()
	 * @model
	 * @generated
	 */
	int getEvalTm();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getEvalTm <em>Eval Tm</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_Units()
	 * @model required="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getUnits <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_SmpRate()
	 * @model
	 * @generated
	 */
	int getSmpRate();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getSmpRate <em>Smp Rate</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_Frequency()
	 * @model
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getFrequency <em>Frequency</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_HvRef()
	 * @model required="true"
	 * @generated
	 */
	MagReference getHvRef();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getHvRef <em>Hv Ref</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getHMV_RmsCyc()
	 * @model
	 * @generated
	 */
	int getRmsCyc();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.HMV#getRmsCyc <em>Rms Cyc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rms Cyc</em>' attribute.
	 * @see #getRmsCyc()
	 * @generated
	 */
	void setRmsCyc(int value);

} // HMV
