/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#getActVal <em>Act Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#getFrVal <em>Fr Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#getFrTm <em>Fr Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#getPulsQty <em>Puls Qty</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#isFrEna <em>Fr Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#getStrTm <em>Str Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#getFrPd <em>Fr Pd</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.BCR#isFrRs <em>Fr Rs</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR()
 * @model
 * @generated
 */
public interface BCR extends EObject {
	/**
	 * Returns the value of the '<em><b>Act Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act Val</em>' attribute.
	 * @see #setActVal(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_ActVal()
	 * @model
	 * @generated
	 */
	int getActVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#getActVal <em>Act Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act Val</em>' attribute.
	 * @see #getActVal()
	 * @generated
	 */
	void setActVal(int value);

	/**
	 * Returns the value of the '<em><b>Fr Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fr Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fr Val</em>' attribute.
	 * @see #setFrVal(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_FrVal()
	 * @model
	 * @generated
	 */
	int getFrVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#getFrVal <em>Fr Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fr Val</em>' attribute.
	 * @see #getFrVal()
	 * @generated
	 */
	void setFrVal(int value);

	/**
	 * Returns the value of the '<em><b>Fr Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fr Tm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fr Tm</em>' reference.
	 * @see #setFrTm(TimeStamp)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_FrTm()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getFrTm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#getFrTm <em>Fr Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fr Tm</em>' reference.
	 * @see #getFrTm()
	 * @generated
	 */
	void setFrTm(TimeStamp value);

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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#getQ <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Quality value);

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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_Units()
	 * @model required="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#getUnits <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

	/**
	 * Returns the value of the '<em><b>Puls Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puls Qty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puls Qty</em>' attribute.
	 * @see #setPulsQty(float)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_PulsQty()
	 * @model
	 * @generated
	 */
	float getPulsQty();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#getPulsQty <em>Puls Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puls Qty</em>' attribute.
	 * @see #getPulsQty()
	 * @generated
	 */
	void setPulsQty(float value);

	/**
	 * Returns the value of the '<em><b>Fr Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fr Ena</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fr Ena</em>' attribute.
	 * @see #setFrEna(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_FrEna()
	 * @model
	 * @generated
	 */
	boolean isFrEna();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#isFrEna <em>Fr Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fr Ena</em>' attribute.
	 * @see #isFrEna()
	 * @generated
	 */
	void setFrEna(boolean value);

	/**
	 * Returns the value of the '<em><b>Str Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Tm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Tm</em>' reference.
	 * @see #setStrTm(TimeStamp)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_StrTm()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getStrTm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#getStrTm <em>Str Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Tm</em>' reference.
	 * @see #getStrTm()
	 * @generated
	 */
	void setStrTm(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Fr Pd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fr Pd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fr Pd</em>' attribute.
	 * @see #setFrPd(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_FrPd()
	 * @model
	 * @generated
	 */
	int getFrPd();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#getFrPd <em>Fr Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fr Pd</em>' attribute.
	 * @see #getFrPd()
	 * @generated
	 */
	void setFrPd(int value);

	/**
	 * Returns the value of the '<em><b>Fr Rs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fr Rs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fr Rs</em>' attribute.
	 * @see #setFrRs(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getBCR_FrRs()
	 * @model
	 * @generated
	 */
	boolean isFrRs();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.BCR#isFrRs <em>Fr Rs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fr Rs</em>' attribute.
	 * @see #isFrRs()
	 * @generated
	 */
	void setFrRs(boolean value);

} // BCR
