/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getCircuits <em>Circuits</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets <em>Conductor Assets</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitSection()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Section of circuit located between two sectionalizing devices. It may contain other circuit sections, for example, a lateral tapped off a primary.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Section of circuit located between two sectionalizing devices. It may contain other circuit sections, for example, a lateral tapped off a primary.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Section of circuit located between two sectionalizing devices. It may contain other circuit sections, for example, a lateral tapped off a primary.' Profile\040documentation='Section of circuit located between two sectionalizing devices. It may contain other circuit sections, for example, a lateral tapped off a primary.'"
 * @generated
 */
public interface CircuitSection extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Circuits</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.Circuit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuits</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitSection_Circuits()
	 * @model
	 * @generated
	 */
	EList<Circuit> getCircuits();

	/**
	 * Returns the value of the '<em><b>Network Data Sets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getCircuitSections <em>Circuit Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Data Sets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitSection_NetworkDataSets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getCircuitSections
	 * @model opposite="CircuitSections"
	 * @generated
	 */
	EList<NetworkDataSet> getNetworkDataSets();

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getCircuitSections <em>Circuit Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitSection_PowerSystemResources()
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getCircuitSections
	 * @model opposite="CircuitSections"
	 * @generated
	 */
	EList<PowerSystemResource> getPowerSystemResources();

	/**
	 * Returns the value of the '<em><b>Connection Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind
	 * @see #setConnectionKind(CircuitConnectionKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitSection_ConnectionKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of this circuit section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of this circuit section.'"
	 * @generated
	 */
	CircuitConnectionKind getConnectionKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind
	 * @see #getConnectionKind()
	 * @generated
	 */
	void setConnectionKind(CircuitConnectionKind value);

	/**
	 * Returns the value of the '<em><b>Conductor Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection <em>Circuit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitSection_ConductorAssets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection
	 * @model opposite="CircuitSection"
	 * @generated
	 */
	EList<ConductorAsset> getConductorAssets();

} // CircuitSection
