/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.INS#getStVal <em>St Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.INS#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.INS#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.INS#getSubVal <em>Sub Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.INS#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.INS#getSubID <em>Sub ID</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getINS()
 * @model
 * @generated
 */
public interface INS extends EObject {
	/**
	 * Returns the value of the '<em><b>St Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>St Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>St Val</em>' attribute.
	 * @see #setStVal(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getINS_StVal()
	 * @model
	 * @generated
	 */
	int getStVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.INS#getStVal <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>St Val</em>' attribute.
	 * @see #getStVal()
	 * @generated
	 */
	void setStVal(int value);

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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getINS_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.INS#getQ <em>Q</em>}' reference.
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getINS_SubEna()
	 * @model
	 * @generated
	 */
	boolean isSubEna();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.INS#isSubEna <em>Sub Ena</em>}' attribute.
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
	 * @see #setSubVal(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getINS_SubVal()
	 * @model
	 * @generated
	 */
	int getSubVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.INS#getSubVal <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Val</em>' attribute.
	 * @see #getSubVal()
	 * @generated
	 */
	void setSubVal(int value);

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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getINS_SubQ()
	 * @model required="true"
	 * @generated
	 */
	Quality getSubQ();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.INS#getSubQ <em>Sub Q</em>}' reference.
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getINS_SubID()
	 * @model
	 * @generated
	 */
	String getSubID();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.INS#getSubID <em>Sub ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub ID</em>' attribute.
	 * @see #getSubID()
	 * @generated
	 */
	void setSubID(String value);

} // INS
