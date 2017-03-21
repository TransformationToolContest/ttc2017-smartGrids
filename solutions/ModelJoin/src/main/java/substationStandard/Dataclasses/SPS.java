/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.SPS#isStVal <em>St Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SPS#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SPS#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SPS#isSubVal <em>Sub Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SPS#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SPS#getSubID <em>Sub ID</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getSPS()
 * @model
 * @generated
 */
public interface SPS extends EObject {
	/**
	 * Returns the value of the '<em><b>St Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>St Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>St Val</em>' attribute.
	 * @see #setStVal(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSPS_StVal()
	 * @model
	 * @generated
	 */
	boolean isStVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SPS#isStVal <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>St Val</em>' attribute.
	 * @see #isStVal()
	 * @generated
	 */
	void setStVal(boolean value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSPS_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SPS#getQ <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Quality value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSPS_SubEna()
	 * @model
	 * @generated
	 */
	boolean isSubEna();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SPS#isSubEna <em>Sub Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Ena</em>' attribute.
	 * @see #isSubEna()
	 * @generated
	 */
	void setSubEna(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Val</em>' attribute.
	 * @see #setSubVal(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSPS_SubVal()
	 * @model
	 * @generated
	 */
	boolean isSubVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SPS#isSubVal <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Val</em>' attribute.
	 * @see #isSubVal()
	 * @generated
	 */
	void setSubVal(boolean value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSPS_SubQ()
	 * @model required="true"
	 * @generated
	 */
	Quality getSubQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SPS#getSubQ <em>Sub Q</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSPS_SubID()
	 * @model
	 * @generated
	 */
	String getSubID();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SPS#getSubID <em>Sub ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub ID</em>' attribute.
	 * @see #getSubID()
	 * @generated
	 */
	void setSubID(String value);

} // SPS
