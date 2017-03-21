/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controllable Status Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getOperTm <em>Oper Tm</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getOrigin <em>Origin</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getCtlNum <em>Ctl Num</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#isStSeld <em>St Seld</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getSubID <em>Sub ID</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getCtlModel <em>Ctl Model</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getSboTimeout <em>Sbo Timeout</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getSboClass <em>Sbo Class</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getD <em>D</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableStatusInfo#getDU <em>DU</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo()
 * @model
 * @generated
 */
public interface ControllableStatusInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Oper Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oper Tm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oper Tm</em>' reference.
	 * @see #setOperTm(TimeStamp)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_OperTm()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getOperTm();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getOperTm <em>Oper Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oper Tm</em>' reference.
	 * @see #getOperTm()
	 * @generated
	 */
	void setOperTm(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Originator)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_Origin()
	 * @model required="true"
	 * @generated
	 */
	Originator getOrigin();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Originator value);

	/**
	 * Returns the value of the '<em><b>Ctl Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctl Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctl Num</em>' attribute.
	 * @see #setCtlNum(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_CtlNum()
	 * @model
	 * @generated
	 */
	int getCtlNum();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getCtlNum <em>Ctl Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl Num</em>' attribute.
	 * @see #getCtlNum()
	 * @generated
	 */
	void setCtlNum(int value);

	/**
	 * Returns the value of the '<em><b>St Seld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>St Seld</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>St Seld</em>' attribute.
	 * @see #setStSeld(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_StSeld()
	 * @model
	 * @generated
	 */
	boolean isStSeld();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#isStSeld <em>St Seld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>St Seld</em>' attribute.
	 * @see #isStSeld()
	 * @generated
	 */
	void setStSeld(boolean value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_SubEna()
	 * @model
	 * @generated
	 */
	boolean isSubEna();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#isSubEna <em>Sub Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Ena</em>' attribute.
	 * @see #isSubEna()
	 * @generated
	 */
	void setSubEna(boolean value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_SubQ()
	 * @model required="true"
	 * @generated
	 */
	Quality getSubQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getSubQ <em>Sub Q</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_SubID()
	 * @model
	 * @generated
	 */
	String getSubID();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getSubID <em>Sub ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub ID</em>' attribute.
	 * @see #getSubID()
	 * @generated
	 */
	void setSubID(String value);

	/**
	 * Returns the value of the '<em><b>Ctl Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctl Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctl Model</em>' reference.
	 * @see #setCtlModel(CtlModels)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_CtlModel()
	 * @model required="true"
	 * @generated
	 */
	CtlModels getCtlModel();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getCtlModel <em>Ctl Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl Model</em>' reference.
	 * @see #getCtlModel()
	 * @generated
	 */
	void setCtlModel(CtlModels value);

	/**
	 * Returns the value of the '<em><b>Sbo Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sbo Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sbo Timeout</em>' attribute.
	 * @see #setSboTimeout(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_SboTimeout()
	 * @model
	 * @generated
	 */
	int getSboTimeout();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getSboTimeout <em>Sbo Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sbo Timeout</em>' attribute.
	 * @see #getSboTimeout()
	 * @generated
	 */
	void setSboTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Sbo Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sbo Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sbo Class</em>' reference.
	 * @see #setSboClass(SboClasses)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_SboClass()
	 * @model required="true"
	 * @generated
	 */
	SboClasses getSboClass();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getSboClass <em>Sbo Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sbo Class</em>' reference.
	 * @see #getSboClass()
	 * @generated
	 */
	void setSboClass(SboClasses value);

	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(String)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_D()
	 * @model
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(String value);

	/**
	 * Returns the value of the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DU</em>' attribute.
	 * @see #setDU(String)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableStatusInfo_DU()
	 * @model
	 * @generated
	 */
	String getDU();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ControllableStatusInfo#getDU <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DU</em>' attribute.
	 * @see #getDU()
	 * @generated
	 */
	void setDU(String value);

} // ControllableStatusInfo
