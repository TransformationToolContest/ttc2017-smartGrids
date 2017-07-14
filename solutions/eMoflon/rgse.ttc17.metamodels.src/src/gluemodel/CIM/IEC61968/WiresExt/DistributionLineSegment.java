/**
 */
package gluemodel.CIM.IEC61968.WiresExt;

import gluemodel.CIM.IEC61968.AssetModels.ConductorInfo;

import gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset;

import gluemodel.CIM.IEC61970.Wires.ACLineSegment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Line Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getPhaseImpedance <em>Phase Impedance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorAssets <em>Conductor Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getSequenceImpedance <em>Sequence Impedance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorInfo <em>Conductor Info</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionLineSegment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Extends ACLineSegment with references to a library of standard types from which electrical parameters can be calculated, as follows:\n- calculate electrical parameters from asset data, using associated ConductorInfo, with values then multiplied by Conductor.length to produce a matrix model.\n- calculate unbalanced electrical parameters from associated PerLengthPhaseImpedance, then multiplied by Conductor.length to produce a matrix model.\n- calculate transposed electrical parameters from associated PerLengthSequenceImpedance, then multiplied by Conductor.length to produce a sequence model.\nFor symmetrical, transposed 3ph lines, it is sufficient to use inherited ACLineSegment attributes, which describe sequence impedances and admittances for the entire length of the segment.\n\nKnown issue: Attributes expressing impedances and admittances in PerLengthSequenceImpedance and PhaseImpedanceData use Resistance, etc., which describe pre-calculated, full length of segment, while we should have a longitudinal unit, per length. Taking \'r\' as example, its \'unit\'=Ohm, but the value is effectively in Ohm/m, so the value needs to be multiplied by Conductor.length. This is against the whole idea of unit data types and is semantically wrong, but base CIM does not have the required data types at this moment. Until the revision of unit modelling in CIM, applications need to deduce and locally handle appending \"/m\" for units and ensure they multiply the values by Conductor.length.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Extends ACLineSegment with references to a library of standard types from which electrical parameters can be calculated, as follows:\n- calculate electrical parameters from asset data, using associated ConductorInfo, with values then multiplied by Conductor.length to produce a matrix model.\n- calculate unbalanced electrical parameters from associated PerLengthPhaseImpedance, then multiplied by Conductor.length to produce a matrix model.\n- calculate transposed electrical parameters from associated PerLengthSequenceImpedance, then multiplied by Conductor.length to produce a sequence model.\nFor symmetrical, transposed 3ph lines, it is sufficient to use inherited ACLineSegment attributes, which describe sequence impedances and admittances for the entire length of the segment.\n\nKnown issue: Attributes expressing impedances and admittances in PerLengthSequenceImpedance and PhaseImpedanceData use Resistance, etc., which describe pre-calculated, full length of segment, while we should have a longitudinal unit, per length. Taking \'r\' as example, its \'unit\'=Ohm, but the value is effectively in Ohm/m, so the value needs to be multiplied by Conductor.length. This is against the whole idea of unit data types and is semantically wrong, but base CIM does not have the required data types at this moment. Until the revision of unit modelling in CIM, applications need to deduce and locally handle appending \"/m\" for units and ensure they multiply the values by Conductor.length.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Extends ACLineSegment with references to a library of standard types from which electrical parameters can be calculated, as follows:\n- calculate electrical parameters from asset data, using associated ConductorInfo, with values then multiplied by Conductor.length to produce a matrix model.\n- calculate unbalanced electrical parameters from associated PerLengthPhaseImpedance, then multiplied by Conductor.length to produce a matrix model.\n- calculate transposed electrical parameters from associated PerLengthSequenceImpedance, then multiplied by Conductor.length to produce a sequence model.\nFor symmetrical, transposed 3ph lines, it is sufficient to use inherited ACLineSegment attributes, which describe sequence impedances and admittances for the entire length of the segment.\n\nKnown issue: Attributes expressing impedances and admittances in PerLengthSequenceImpedance and PhaseImpedanceData use Resistance, etc., which describe pre-calculated, full length of segment, while we should have a longitudinal unit, per length. Taking \'r\' as example, its \'unit\'=Ohm, but the value is effectively in Ohm/m, so the value needs to be multiplied by Conductor.length. This is against the whole idea of unit data types and is semantically wrong, but base CIM does not have the required data types at this moment. Until the revision of unit modelling in CIM, applications need to deduce and locally handle appending \"/m\" for units and ensure they multiply the values by Conductor.length.' Profile\040documentation='Extends ACLineSegment with references to a library of standard types from which electrical parameters can be calculated, as follows:\n- calculate electrical parameters from asset data, using associated ConductorInfo, with values then multiplied by Conductor.length to produce a matrix model.\n- calculate unbalanced electrical parameters from associated PerLengthPhaseImpedance, then multiplied by Conductor.length to produce a matrix model.\n- calculate transposed electrical parameters from associated PerLengthSequenceImpedance, then multiplied by Conductor.length to produce a sequence model.\nFor symmetrical, transposed 3ph lines, it is sufficient to use inherited ACLineSegment attributes, which describe sequence impedances and admittances for the entire length of the segment.\n\nKnown issue: Attributes expressing impedances and admittances in PerLengthSequenceImpedance and PhaseImpedanceData use Resistance, etc., which describe pre-calculated, full length of segment, while we should have a longitudinal unit, per length. Taking \'r\' as example, its \'unit\'=Ohm, but the value is effectively in Ohm/m, so the value needs to be multiplied by Conductor.length. This is against the whole idea of unit data types and is semantically wrong, but base CIM does not have the required data types at this moment. Until the revision of unit modelling in CIM, applications need to deduce and locally handle appending \"/m\" for units and ensure they multiply the values by Conductor.length.'"
 * @generated
 */
public interface DistributionLineSegment extends ACLineSegment {
	/**
	 * Returns the value of the '<em><b>Phase Impedance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getConductorSegments <em>Conductor Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Impedance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Impedance</em>' reference.
	 * @see #setPhaseImpedance(PerLengthPhaseImpedance)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionLineSegment_PhaseImpedance()
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getConductorSegments
	 * @model opposite="ConductorSegments"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase impedance of this conductor segment; used for unbalanced model.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase impedance of this conductor segment; used for unbalanced model.'"
	 * @generated
	 */
	PerLengthPhaseImpedance getPhaseImpedance();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getPhaseImpedance <em>Phase Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Impedance</em>' reference.
	 * @see #getPhaseImpedance()
	 * @generated
	 */
	void setPhaseImpedance(PerLengthPhaseImpedance value);

	/**
	 * Returns the value of the '<em><b>Conductor Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment <em>Conductor Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionLineSegment_ConductorAssets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment
	 * @model opposite="ConductorSegment"
	 * @generated
	 */
	EList<ConductorAsset> getConductorAssets();

	/**
	 * Returns the value of the '<em><b>Sequence Impedance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getConductorSegments <em>Conductor Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Impedance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Impedance</em>' reference.
	 * @see #setSequenceImpedance(PerLengthSequenceImpedance)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionLineSegment_SequenceImpedance()
	 * @see gluemodel.CIM.IEC61968.WiresExt.PerLengthSequenceImpedance#getConductorSegments
	 * @model opposite="ConductorSegments"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sequence impedance of this conductor segment; used for balanced model.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sequence impedance of this conductor segment; used for balanced model.'"
	 * @generated
	 */
	PerLengthSequenceImpedance getSequenceImpedance();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getSequenceImpedance <em>Sequence Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Impedance</em>' reference.
	 * @see #getSequenceImpedance()
	 * @generated
	 */
	void setSequenceImpedance(PerLengthSequenceImpedance value);

	/**
	 * Returns the value of the '<em><b>Conductor Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getConductorSegments <em>Conductor Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Info</em>' reference.
	 * @see #setConductorInfo(ConductorInfo)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionLineSegment_ConductorInfo()
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorInfo#getConductorSegments
	 * @model opposite="ConductorSegments"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Conductor data of this conductor segment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conductor data of this conductor segment.'"
	 * @generated
	 */
	ConductorInfo getConductorInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorInfo <em>Conductor Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor Info</em>' reference.
	 * @see #getConductorInfo()
	 * @generated
	 */
	void setConductorInfo(ConductorInfo value);

} // DistributionLineSegment
