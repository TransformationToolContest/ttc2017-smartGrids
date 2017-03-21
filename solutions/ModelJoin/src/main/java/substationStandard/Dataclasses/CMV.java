/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.CMV#getInstCVal <em>Inst CVal</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getCVal <em>CVal</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getRange <em>Range</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getSubCVal <em>Sub CVal</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getSubID <em>Sub ID</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getUnits <em>Units</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getDb <em>Db</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getZeroDb <em>Zero Db</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getRangeC <em>Range C</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getMagSVC <em>Mag SVC</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getAngSVC <em>Ang SVC</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getAngRef <em>Ang Ref</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CMV#getSmpRate <em>Smp Rate</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV()
 * @model
 * @generated
 */
public interface CMV extends EObject {
	/**
	 * Returns the value of the '<em><b>Inst CVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst CVal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst CVal</em>' reference.
	 * @see #setInstCVal(Vector)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_InstCVal()
	 * @model required="true"
	 * @generated
	 */
	Vector getInstCVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getInstCVal <em>Inst CVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst CVal</em>' reference.
	 * @see #getInstCVal()
	 * @generated
	 */
	void setInstCVal(Vector value);

	/**
	 * Returns the value of the '<em><b>CVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CVal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CVal</em>' reference.
	 * @see #setCVal(Vector)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_CVal()
	 * @model required="true"
	 * @generated
	 */
	Vector getCVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getCVal <em>CVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CVal</em>' reference.
	 * @see #getCVal()
	 * @generated
	 */
	void setCVal(Vector value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(Range)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_Range()
	 * @model required="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getQ <em>Q</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Sub Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Ena</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Ena</em>' attribute.
	 * @see #setSubEna(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_SubEna()
	 * @model
	 * @generated
	 */
	boolean isSubEna();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#isSubEna <em>Sub Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Ena</em>' attribute.
	 * @see #isSubEna()
	 * @generated
	 */
	void setSubEna(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub CVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub CVal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub CVal</em>' reference.
	 * @see #setSubCVal(Vector)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_SubCVal()
	 * @model
	 * @generated
	 */
	Vector getSubCVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getSubCVal <em>Sub CVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub CVal</em>' reference.
	 * @see #getSubCVal()
	 * @generated
	 */
	void setSubCVal(Vector value);

	/**
	 * Returns the value of the '<em><b>Sub Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Q</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Q</em>' reference.
	 * @see #setSubQ(Quality)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_SubQ()
	 * @model required="true"
	 * @generated
	 */
	Quality getSubQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getSubQ <em>Sub Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Q</em>' reference.
	 * @see #getSubQ()
	 * @generated
	 */
	void setSubQ(Quality value);

	/**
	 * Returns the value of the '<em><b>Sub ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub ID</em>' attribute.
	 * @see #setSubID(String)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_SubID()
	 * @model
	 * @generated
	 */
	String getSubID();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getSubID <em>Sub ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub ID</em>' attribute.
	 * @see #getSubID()
	 * @generated
	 */
	void setSubID(String value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_Units()
	 * @model required="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getUnits <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

	/**
	 * Returns the value of the '<em><b>Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db</em>' attribute.
	 * @see #setDb(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_Db()
	 * @model
	 * @generated
	 */
	int getDb();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getDb <em>Db</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db</em>' attribute.
	 * @see #getDb()
	 * @generated
	 */
	void setDb(int value);

	/**
	 * Returns the value of the '<em><b>Zero Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zero Db</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zero Db</em>' attribute.
	 * @see #setZeroDb(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_ZeroDb()
	 * @model
	 * @generated
	 */
	int getZeroDb();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getZeroDb <em>Zero Db</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zero Db</em>' attribute.
	 * @see #getZeroDb()
	 * @generated
	 */
	void setZeroDb(int value);

	/**
	 * Returns the value of the '<em><b>Range C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range C</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range C</em>' reference.
	 * @see #setRangeC(RangeConfig)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_RangeC()
	 * @model required="true"
	 * @generated
	 */
	RangeConfig getRangeC();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getRangeC <em>Range C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range C</em>' reference.
	 * @see #getRangeC()
	 * @generated
	 */
	void setRangeC(RangeConfig value);

	/**
	 * Returns the value of the '<em><b>Mag SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mag SVC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mag SVC</em>' reference.
	 * @see #setMagSVC(ScaledValueConfig)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_MagSVC()
	 * @model required="true"
	 * @generated
	 */
	ScaledValueConfig getMagSVC();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getMagSVC <em>Mag SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mag SVC</em>' reference.
	 * @see #getMagSVC()
	 * @generated
	 */
	void setMagSVC(ScaledValueConfig value);

	/**
	 * Returns the value of the '<em><b>Ang SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ang SVC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ang SVC</em>' reference.
	 * @see #setAngSVC(ScaledValueConfig)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_AngSVC()
	 * @model required="true"
	 * @generated
	 */
	ScaledValueConfig getAngSVC();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getAngSVC <em>Ang SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ang SVC</em>' reference.
	 * @see #getAngSVC()
	 * @generated
	 */
	void setAngSVC(ScaledValueConfig value);

	/**
	 * Returns the value of the '<em><b>Ang Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ang Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ang Ref</em>' reference.
	 * @see #setAngRef(CMVAngleReference)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_AngRef()
	 * @model required="true"
	 * @generated
	 */
	CMVAngleReference getAngRef();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getAngRef <em>Ang Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ang Ref</em>' reference.
	 * @see #getAngRef()
	 * @generated
	 */
	void setAngRef(CMVAngleReference value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCMV_SmpRate()
	 * @model
	 * @generated
	 */
	int getSmpRate();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CMV#getSmpRate <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smp Rate</em>' attribute.
	 * @see #getSmpRate()
	 * @generated
	 */
	void setSmpRate(int value);

} // CMV
