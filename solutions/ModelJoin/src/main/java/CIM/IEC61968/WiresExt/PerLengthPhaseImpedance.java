/**
 */
package CIM.IEC61968.WiresExt;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Per Length Phase Impedance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getConductorSegments <em>Conductor Segments</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getPhaseImpedanceData <em>Phase Impedance Data</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthPhaseImpedance()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Impedance and admittance parameters per unit length for n-wire unbalanced lines, in matrix form.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Impedance and admittance parameters per unit length for n-wire unbalanced lines, in matrix form.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Impedance and admittance parameters per unit length for n-wire unbalanced lines, in matrix form.' Profile\040documentation='Impedance and admittance parameters per unit length for n-wire unbalanced lines, in matrix form.'"
 * @generated
 */
public interface PerLengthPhaseImpedance extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Conductor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Count</em>' attribute.
	 * @see #setConductorCount(int)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthPhaseImpedance_ConductorCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of phase, neutral, and other wires retained. Constrains the number of matrix elements and the phase codes that can be used with this matrix.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of phase, neutral, and other wires retained. Constrains the number of matrix elements and the phase codes that can be used with this matrix.'"
	 * @generated
	 */
	int getConductorCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor Count</em>' attribute.
	 * @see #getConductorCount()
	 * @generated
	 */
	void setConductorCount(int value);

	/**
	 * Returns the value of the '<em><b>Conductor Segments</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.WiresExt.DistributionLineSegment}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionLineSegment#getPhaseImpedance <em>Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Segments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Segments</em>' reference list.
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthPhaseImpedance_ConductorSegments()
	 * @see CIM.IEC61968.WiresExt.DistributionLineSegment#getPhaseImpedance
	 * @model opposite="PhaseImpedance"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All conductor segments described by this phase impedance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All conductor segments described by this phase impedance.'"
	 * @generated
	 */
	EList<DistributionLineSegment> getConductorSegments();

	/**
	 * Returns the value of the '<em><b>Phase Impedance Data</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.WiresExt.PhaseImpedanceData}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getPhaseImpedance <em>Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Impedance Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Impedance Data</em>' reference list.
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPerLengthPhaseImpedance_PhaseImpedanceData()
	 * @see CIM.IEC61968.WiresExt.PhaseImpedanceData#getPhaseImpedance
	 * @model opposite="PhaseImpedance"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All data that belong to this conductor phase impedance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All data that belong to this conductor phase impedance.'"
	 * @generated
	 */
	EList<PhaseImpedanceData> getPhaseImpedanceData();

} // PerLengthPhaseImpedance
