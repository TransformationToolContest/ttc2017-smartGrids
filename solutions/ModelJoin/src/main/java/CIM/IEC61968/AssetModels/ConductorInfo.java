/**
 */
package CIM.IEC61968.AssetModels;

import CIM.IEC61968.WiresExt.DistributionLineSegment;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.ConductorInfo#getConductorSegments <em>Conductor Segments</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ConductorInfo#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ConductorInfo#isInsulated <em>Insulated</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ConductorInfo#getInsulationThickness <em>Insulation Thickness</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ConductorInfo#getUsage <em>Usage</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ConductorInfo#getWireArrangements <em>Wire Arrangements</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial <em>Insulation Material</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Conductor data.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Conductor data.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conductor data.' Profile\040documentation='Conductor data.'"
 * @generated
 */
public interface ConductorInfo extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Conductor Segments</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.WiresExt.DistributionLineSegment}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Segments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Segments</em>' reference list.
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo_ConductorSegments()
	 * @see CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorInfo
	 * @model opposite="ConductorInfo"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All conductor segments described by this conductor data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All conductor segments described by this conductor data.'"
	 * @generated
	 */
	EList<DistributionLineSegment> getConductorSegments();

	/**
	 * Returns the value of the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Count</em>' attribute.
	 * @see #setPhaseCount(int)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo_PhaseCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of phases (including neutral) to be retained. Any wires beyond this number should be reduced into the earth return.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of phases (including neutral) to be retained. Any wires beyond this number should be reduced into the earth return.'"
	 * @generated
	 */
	int getPhaseCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.ConductorInfo#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Count</em>' attribute.
	 * @see #getPhaseCount()
	 * @generated
	 */
	void setPhaseCount(int value);

	/**
	 * Returns the value of the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulated</em>' attribute.
	 * @see #setInsulated(boolean)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo_Insulated()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if conductor is insulated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if conductor is insulated.'"
	 * @generated
	 */
	boolean isInsulated();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.ConductorInfo#isInsulated <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulated</em>' attribute.
	 * @see #isInsulated()
	 * @generated
	 */
	void setInsulated(boolean value);

	/**
	 * Returns the value of the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation Thickness</em>' attribute.
	 * @see #setInsulationThickness(float)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo_InsulationThickness()
	 * @model dataType="CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if insulated conductor) Thickness of the insulation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if insulated conductor) Thickness of the insulation.'"
	 * @generated
	 */
	float getInsulationThickness();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.ConductorInfo#getInsulationThickness <em>Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation Thickness</em>' attribute.
	 * @see #getInsulationThickness()
	 * @generated
	 */
	void setInsulationThickness(float value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.AssetModels.ConductorUsageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see CIM.IEC61968.AssetModels.ConductorUsageKind
	 * @see #setUsage(ConductorUsageKind)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo_Usage()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Usage of this conductor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Usage of this conductor.'"
	 * @generated
	 */
	ConductorUsageKind getUsage();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.ConductorInfo#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see CIM.IEC61968.AssetModels.ConductorUsageKind
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(ConductorUsageKind value);

	/**
	 * Returns the value of the '<em><b>Wire Arrangements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.AssetModels.WireArrangement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.WireArrangement#getConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Arrangements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Arrangements</em>' reference list.
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo_WireArrangements()
	 * @see CIM.IEC61968.AssetModels.WireArrangement#getConductorInfo
	 * @model opposite="ConductorInfo"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All wire arrangements (single wires) that make this conductor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All wire arrangements (single wires) that make this conductor.'"
	 * @generated
	 */
	EList<WireArrangement> getWireArrangements();

	/**
	 * Returns the value of the '<em><b>Insulation Material</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.AssetModels.ConductorInsulationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation Material</em>' attribute.
	 * @see CIM.IEC61968.AssetModels.ConductorInsulationKind
	 * @see #setInsulationMaterial(ConductorInsulationKind)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo_InsulationMaterial()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if insulated conductor) Material used for insulation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if insulated conductor) Material used for insulation.'"
	 * @generated
	 */
	ConductorInsulationKind getInsulationMaterial();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial <em>Insulation Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation Material</em>' attribute.
	 * @see CIM.IEC61968.AssetModels.ConductorInsulationKind
	 * @see #getInsulationMaterial()
	 * @generated
	 */
	void setInsulationMaterial(ConductorInsulationKind value);

} // ConductorInfo
