/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupT;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.DPL;
import gluemodel.substationStandard.Dataclasses.INS;

import gluemodel.substationStandard.Enumerations.HealthStateKind;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getEEName <em>EE Name</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getHzRtg <em>Hz Rtg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getRat <em>Rat</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getCor <em>Cor</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getAngCor <em>Ang Cor</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getGroupT()
 * @model
 * @generated
 */
public interface GroupT extends DomainLN {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getGroupT_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getEEName <em>EE Name</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getGroupT_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

	/**
	 * Returns the value of the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Tmh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Tmh</em>' reference.
	 * @see #setOpTmh(INS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getGroupT_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>Hz Rtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hz Rtg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hz Rtg</em>' reference.
	 * @see #setHzRtg(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getGroupT_HzRtg()
	 * @model required="true"
	 * @generated
	 */
	ASG getHzRtg();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getHzRtg <em>Hz Rtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hz Rtg</em>' reference.
	 * @see #getHzRtg()
	 * @generated
	 */
	void setHzRtg(ASG value);

	/**
	 * Returns the value of the '<em><b>Rat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rat</em>' reference.
	 * @see #setRat(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getGroupT_Rat()
	 * @model required="true"
	 * @generated
	 */
	ASG getRat();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getRat <em>Rat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rat</em>' reference.
	 * @see #getRat()
	 * @generated
	 */
	void setRat(ASG value);

	/**
	 * Returns the value of the '<em><b>Cor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cor</em>' reference.
	 * @see #setCor(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getGroupT_Cor()
	 * @model required="true"
	 * @generated
	 */
	ASG getCor();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getCor <em>Cor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cor</em>' reference.
	 * @see #getCor()
	 * @generated
	 */
	void setCor(ASG value);

	/**
	 * Returns the value of the '<em><b>Ang Cor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ang Cor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ang Cor</em>' reference.
	 * @see #setAngCor(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage#getGroupT_AngCor()
	 * @model required="true"
	 * @generated
	 */
	ASG getAngCor();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getAngCor <em>Ang Cor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ang Cor</em>' reference.
	 * @see #getAngCor()
	 * @generated
	 */
	void setAngCor(ASG value);

} // GroupT
