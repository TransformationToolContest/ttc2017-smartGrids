/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bushing Insulation PF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo <em>Bushing Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind <em>Test Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation <em>Transformer Observation</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInsulationPF()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bushing insulation power factor condition as a result of a test.\nTypical status values are: Acceptable, Minor Deterioration or Moisture Absorption, Major Deterioration or Moisture Absorption, Failed.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Bushing insulation power factor condition as a result of a test.\nTypical status values are: Acceptable, Minor Deterioration or Moisture Absorption, Major Deterioration or Moisture Absorption, Failed.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bushing insulation power factor condition as a result of a test.\nTypical status values are: Acceptable, Minor Deterioration or Moisture Absorption, Major Deterioration or Moisture Absorption, Failed.' Profile\040documentation='Bushing insulation power factor condition as a result of a test.\nTypical status values are: Acceptable, Minor Deterioration or Moisture Absorption, Major Deterioration or Moisture Absorption, Failed.'"
 * @generated
 */
public interface BushingInsulationPF extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Bushing Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getBushingInsulationPFs <em>Bushing Insulation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Info</em>' reference.
	 * @see #setBushingInfo(BushingInfo)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInsulationPF_BushingInfo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getBushingInsulationPFs
	 * @model opposite="BushingInsulationPFs"
	 * @generated
	 */
	BushingInfo getBushingInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo <em>Bushing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bushing Info</em>' reference.
	 * @see #getBushingInfo()
	 * @generated
	 */
	void setBushingInfo(BushingInfo value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInsulationPF_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Test Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind
	 * @see #setTestKind(BushingInsulationPfTestKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInsulationPF_TestKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of test for this bushing.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of test for this bushing.'"
	 * @generated
	 */
	BushingInsulationPfTestKind getTestKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind <em>Test Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind
	 * @see #getTestKind()
	 * @generated
	 */
	void setTestKind(BushingInsulationPfTestKind value);

	/**
	 * Returns the value of the '<em><b>Transformer Observation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs <em>Bushing Insultation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observation</em>' reference.
	 * @see #setTransformerObservation(TransformerObservation)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInsulationPF_TransformerObservation()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs
	 * @model opposite="BushingInsultationPFs"
	 * @generated
	 */
	TransformerObservation getTransformerObservation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation <em>Transformer Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Observation</em>' reference.
	 * @see #getTransformerObservation()
	 * @generated
	 */
	void setTransformerObservation(TransformerObservation value);

} // BushingInsulationPF
