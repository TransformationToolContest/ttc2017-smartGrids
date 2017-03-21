/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.Common.Status;

import CIM.IEC61968.WiresExt.DistributionTransformerWinding;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Wires.Ground;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Winding Insulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance <em>Insulation Resistance</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding <em>To Winding</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getGround <em>Ground</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation <em>Transformer Observation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance <em>Leakage Reactance</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding <em>From Winding</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus <em>Insulation PF Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Winding insulation condition as a result of a test.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Winding insulation condition as a result of a test.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Winding insulation condition as a result of a test.' Profile\040documentation='Winding insulation condition as a result of a test.'"
 * @generated
 */
public interface WindingInsulation extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Insulation Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation Resistance</em>' attribute.
	 * @see #setInsulationResistance(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation_InsulationResistance()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For testType, status of Winding Insulation Resistance as of statusDate. Typical values are: Acceptable, Questionable, Failed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For testType, status of Winding Insulation Resistance as of statusDate. Typical values are: Acceptable, Questionable, Failed.'"
	 * @generated
	 */
	String getInsulationResistance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance <em>Insulation Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation Resistance</em>' attribute.
	 * @see #getInsulationResistance()
	 * @generated
	 */
	void setInsulationResistance(String value);

	/**
	 * Returns the value of the '<em><b>To Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getToWindingInsulations <em>To Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Winding</em>' reference.
	 * @see #setToWinding(DistributionTransformerWinding)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation_ToWinding()
	 * @see CIM.IEC61968.WiresExt.DistributionTransformerWinding#getToWindingInsulations
	 * @model opposite="ToWindingInsulations"
	 * @generated
	 */
	DistributionTransformerWinding getToWinding();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding <em>To Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Winding</em>' reference.
	 * @see #getToWinding()
	 * @generated
	 */
	void setToWinding(DistributionTransformerWinding value);

	/**
	 * Returns the value of the '<em><b>Ground</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.Ground#getWindingInsulations <em>Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground</em>' reference.
	 * @see #setGround(Ground)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation_Ground()
	 * @see CIM.IEC61970.Wires.Ground#getWindingInsulations
	 * @model opposite="WindingInsulations"
	 * @generated
	 */
	Ground getGround();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getGround <em>Ground</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground</em>' reference.
	 * @see #getGround()
	 * @generated
	 */
	void setGround(Ground value);

	/**
	 * Returns the value of the '<em><b>Transformer Observation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs <em>Winding Insulation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observation</em>' reference.
	 * @see #setTransformerObservation(TransformerObservation)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation_TransformerObservation()
	 * @see CIM.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs
	 * @model opposite="WindingInsulationPFs"
	 * @generated
	 */
	TransformerObservation getTransformerObservation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation <em>Transformer Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Observation</em>' reference.
	 * @see #getTransformerObservation()
	 * @generated
	 */
	void setTransformerObservation(TransformerObservation value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Leakage Reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leakage Reactance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leakage Reactance</em>' attribute.
	 * @see #setLeakageReactance(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation_LeakageReactance()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='As of statusDate, the leakage reactance measured at the \"from\" winding with the \"to\" winding short-circuited and all other windings open-circuited.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='As of statusDate, the leakage reactance measured at the \"from\" winding with the \"to\" winding short-circuited and all other windings open-circuited.'"
	 * @generated
	 */
	float getLeakageReactance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance <em>Leakage Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leakage Reactance</em>' attribute.
	 * @see #getLeakageReactance()
	 * @generated
	 */
	void setLeakageReactance(float value);

	/**
	 * Returns the value of the '<em><b>From Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getFromWindingInsulations <em>From Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Winding</em>' reference.
	 * @see #setFromWinding(DistributionTransformerWinding)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation_FromWinding()
	 * @see CIM.IEC61968.WiresExt.DistributionTransformerWinding#getFromWindingInsulations
	 * @model opposite="FromWindingInsulations"
	 * @generated
	 */
	DistributionTransformerWinding getFromWinding();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding <em>From Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Winding</em>' reference.
	 * @see #getFromWinding()
	 * @generated
	 */
	void setFromWinding(DistributionTransformerWinding value);

	/**
	 * Returns the value of the '<em><b>Insulation PF Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation PF Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation PF Status</em>' attribute.
	 * @see #setInsulationPFStatus(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation_InsulationPFStatus()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of Winding Insulation Power Factor as of statusDate: Acceptable, Minor Deterioration or Moisture Absorption, Major Deterioration or Moisture Absorption, Failed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of Winding Insulation Power Factor as of statusDate: Acceptable, Minor Deterioration or Moisture Absorption, Major Deterioration or Moisture Absorption, Failed.'"
	 * @generated
	 */
	String getInsulationPFStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus <em>Insulation PF Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation PF Status</em>' attribute.
	 * @see #getInsulationPFStatus()
	 * @generated
	 */
	void setInsulationPFStatus(String value);

} // WindingInsulation
