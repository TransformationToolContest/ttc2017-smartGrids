/**
 */
package substationStandard.LNNodes.LNGroupC;

import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPOW</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CPOW#getTmExc <em>Tm Exc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CPOW#getStrPOW <em>Str POW</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CPOW#getOpOpn <em>Op Opn</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CPOW#getOpCls <em>Op Cls</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CPOW#getMaxDlTmms <em>Max Dl Tmms</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCPOW()
 * @model
 * @generated
 */
public interface CPOW extends GroupC {
	/**
	 * Returns the value of the '<em><b>Tm Exc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Exc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Exc</em>' reference.
	 * @see #setTmExc(SPS)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCPOW_TmExc()
	 * @model required="true"
	 * @generated
	 */
	SPS getTmExc();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CPOW#getTmExc <em>Tm Exc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Exc</em>' reference.
	 * @see #getTmExc()
	 * @generated
	 */
	void setTmExc(SPS value);

	/**
	 * Returns the value of the '<em><b>Str POW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str POW</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str POW</em>' reference.
	 * @see #setStrPOW(SPS)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCPOW_StrPOW()
	 * @model required="true"
	 * @generated
	 */
	SPS getStrPOW();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CPOW#getStrPOW <em>Str POW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str POW</em>' reference.
	 * @see #getStrPOW()
	 * @generated
	 */
	void setStrPOW(SPS value);

	/**
	 * Returns the value of the '<em><b>Op Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Opn</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Opn</em>' reference.
	 * @see #setOpOpn(ACT)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCPOW_OpOpn()
	 * @model required="true"
	 * @generated
	 */
	ACT getOpOpn();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CPOW#getOpOpn <em>Op Opn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Opn</em>' reference.
	 * @see #getOpOpn()
	 * @generated
	 */
	void setOpOpn(ACT value);

	/**
	 * Returns the value of the '<em><b>Op Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Cls</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Cls</em>' reference.
	 * @see #setOpCls(ACT)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCPOW_OpCls()
	 * @model required="true"
	 * @generated
	 */
	ACT getOpCls();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CPOW#getOpCls <em>Op Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cls</em>' reference.
	 * @see #getOpCls()
	 * @generated
	 */
	void setOpCls(ACT value);

	/**
	 * Returns the value of the '<em><b>Max Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dl Tmms</em>' reference.
	 * @see #setMaxDlTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCPOW_MaxDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CPOW#getMaxDlTmms <em>Max Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dl Tmms</em>' reference.
	 * @see #getMaxDlTmms()
	 * @generated
	 */
	void setMaxDlTmms(ING value);

} // CPOW
