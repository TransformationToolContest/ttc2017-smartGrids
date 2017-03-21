/**
 */
package substationStandard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.AnalogueValue;
import substationStandard.Dataclasses.BSC;
import substationStandard.Dataclasses.BSControl;
import substationStandard.Dataclasses.CMV;
import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.DPStatus;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.ISC;
import substationStandard.Dataclasses.LPL;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;
import substationStandard.Dataclasses.ValWithTrans;
import substationStandard.Dataclasses.Vector;
import substationStandard.Dataclasses.WYE;

import substationStandard.LNNodes.DomainLNs.DomainLN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substandard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Substandard#getLN <em>LN</em>}</li>
 *   <li>{@link substationStandard.Substandard#getNamePlt <em>Name Plt</em>}</li>
 *   <li>{@link substationStandard.Substandard#getLPL <em>LPL</em>}</li>
 *   <li>{@link substationStandard.Substandard#getDPC <em>DPC</em>}</li>
 *   <li>{@link substationStandard.Substandard#getACT <em>ACT</em>}</li>
 *   <li>{@link substationStandard.Substandard#getSPS <em>SPS</em>}</li>
 *   <li>{@link substationStandard.Substandard#getBSC <em>BSC</em>}</li>
 *   <li>{@link substationStandard.Substandard#getISC <em>ISC</em>}</li>
 *   <li>{@link substationStandard.Substandard#getSPC <em>SPC</em>}</li>
 *   <li>{@link substationStandard.Substandard#getMV <em>MV</em>}</li>
 *   <li>{@link substationStandard.Substandard#getINS <em>INS</em>}</li>
 *   <li>{@link substationStandard.Substandard#getASG <em>ASG</em>}</li>
 *   <li>{@link substationStandard.Substandard#getWYE <em>WYE</em>}</li>
 *   <li>{@link substationStandard.Substandard#getDPStatus <em>DP Status</em>}</li>
 *   <li>{@link substationStandard.Substandard#getAnalogueValue <em>Analogue Value</em>}</li>
 *   <li>{@link substationStandard.Substandard#getCMV <em>CMV</em>}</li>
 *   <li>{@link substationStandard.Substandard#getValWithTrans <em>Val With Trans</em>}</li>
 *   <li>{@link substationStandard.Substandard#getBSControl <em>BS Control</em>}</li>
 *   <li>{@link substationStandard.Substandard#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see substationStandard.SubstationStandardPackage#getSubstandard()
 * @model
 * @generated
 */
public interface Substandard extends EObject {
	/**
	 * Returns the value of the '<em><b>LN</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.LNNodes.DomainLNs.DomainLN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LN</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_LN()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainLN> getLN();

	/**
	 * Returns the value of the '<em><b>Name Plt</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.LPL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Plt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Plt</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_NamePlt()
	 * @model containment="true"
	 * @generated
	 */
	EList<LPL> getNamePlt();

	/**
	 * Returns the value of the '<em><b>LPL</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.LPL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LPL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LPL</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_LPL()
	 * @model containment="true"
	 * @generated
	 */
	EList<LPL> getLPL();

	/**
	 * Returns the value of the '<em><b>DPC</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.DPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DPC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DPC</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_DPC()
	 * @model containment="true"
	 * @generated
	 */
	EList<DPC> getDPC();

	/**
	 * Returns the value of the '<em><b>ACT</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.ACT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACT</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_ACT()
	 * @model containment="true"
	 * @generated
	 */
	EList<ACT> getACT();

	/**
	 * Returns the value of the '<em><b>SPS</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.SPS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPS</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_SPS()
	 * @model containment="true"
	 * @generated
	 */
	EList<SPS> getSPS();

	/**
	 * Returns the value of the '<em><b>BSC</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.BSC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BSC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BSC</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_BSC()
	 * @model containment="true"
	 * @generated
	 */
	EList<BSC> getBSC();

	/**
	 * Returns the value of the '<em><b>ISC</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.ISC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISC</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_ISC()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISC> getISC();

	/**
	 * Returns the value of the '<em><b>SPC</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.SPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPC</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_SPC()
	 * @model containment="true"
	 * @generated
	 */
	EList<SPC> getSPC();

	/**
	 * Returns the value of the '<em><b>MV</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.MV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MV</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MV</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_MV()
	 * @model containment="true"
	 * @generated
	 */
	EList<MV> getMV();

	/**
	 * Returns the value of the '<em><b>INS</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.INS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INS</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_INS()
	 * @model containment="true"
	 * @generated
	 */
	EList<INS> getINS();

	/**
	 * Returns the value of the '<em><b>ASG</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.ASG}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ASG</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ASG</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_ASG()
	 * @model containment="true"
	 * @generated
	 */
	EList<ASG> getASG();

	/**
	 * Returns the value of the '<em><b>WYE</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.WYE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WYE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WYE</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_WYE()
	 * @model containment="true"
	 * @generated
	 */
	EList<WYE> getWYE();

	/**
	 * Returns the value of the '<em><b>DP Status</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.DPStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DP Status</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Status</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_DPStatus()
	 * @model containment="true"
	 * @generated
	 */
	EList<DPStatus> getDPStatus();

	/**
	 * Returns the value of the '<em><b>Analogue Value</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.AnalogueValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analogue Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analogue Value</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_AnalogueValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalogueValue> getAnalogueValue();

	/**
	 * Returns the value of the '<em><b>CMV</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.CMV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CMV</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMV</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_CMV()
	 * @model containment="true"
	 * @generated
	 */
	EList<CMV> getCMV();

	/**
	 * Returns the value of the '<em><b>Val With Trans</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.ValWithTrans}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val With Trans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val With Trans</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_ValWithTrans()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValWithTrans> getValWithTrans();

	/**
	 * Returns the value of the '<em><b>BS Control</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.BSControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BS Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BS Control</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_BSControl()
	 * @model containment="true"
	 * @generated
	 */
	EList<BSControl> getBSControl();

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.Vector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference list.
	 * @see substationStandard.SubstationStandardPackage#getSubstandard_Vector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vector> getVector();

} // Substandard
