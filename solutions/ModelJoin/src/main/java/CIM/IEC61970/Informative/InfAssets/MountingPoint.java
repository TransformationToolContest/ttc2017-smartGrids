/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.AssetModels.OverheadConductorInfo;

import CIM.IEC61970.Core.IdentifiedObject;
import CIM.IEC61970.Core.PhaseCode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mounting Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.MountingPoint#getXCoord <em>XCoord</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors <em>Overhead Conductors</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.MountingPoint#getConnections <em>Connections</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.MountingPoint#getYCoord <em>YCoord</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingPoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Point on a structure that a connection may have a conductor connected to. Defined with an x and y coordinate plus a phase. A connection may have multiple mounting points, one for each phase.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Point on a structure that a connection may have a conductor connected to. Defined with an x and y coordinate plus a phase. A connection may have multiple mounting points, one for each phase.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Point on a structure that a connection may have a conductor connected to. Defined with an x and y coordinate plus a phase. A connection may have multiple mounting points, one for each phase.' Profile\040documentation='Point on a structure that a connection may have a conductor connected to. Defined with an x and y coordinate plus a phase. A connection may have multiple mounting points, one for each phase.'"
 * @generated
 */
public interface MountingPoint extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>XCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XCoord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCoord</em>' attribute.
	 * @see #setXCoord(int)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingPoint_XCoord()
	 * @model required="true"
	 * @generated
	 */
	int getXCoord();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.MountingPoint#getXCoord <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCoord</em>' attribute.
	 * @see #getXCoord()
	 * @generated
	 */
	void setXCoord(int value);

	/**
	 * Returns the value of the '<em><b>Overhead Conductors</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.AssetModels.OverheadConductorInfo}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint <em>Mounting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead Conductors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead Conductors</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingPoint_OverheadConductors()
	 * @see CIM.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint
	 * @model opposite="MountingPoint"
	 * @generated
	 */
	EList<OverheadConductorInfo> getOverheadConductors();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.MountingConnection}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints <em>Mounting Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingPoint_Connections()
	 * @see CIM.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints
	 * @model opposite="MountingPoints"
	 * @generated
	 */
	EList<MountingConnection> getConnections();

	/**
	 * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Code</em>' attribute.
	 * @see CIM.IEC61970.Core.PhaseCode
	 * @see #setPhaseCode(PhaseCode)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingPoint_PhaseCode()
	 * @model
	 * @generated
	 */
	PhaseCode getPhaseCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Code</em>' attribute.
	 * @see CIM.IEC61970.Core.PhaseCode
	 * @see #getPhaseCode()
	 * @generated
	 */
	void setPhaseCode(PhaseCode value);

	/**
	 * Returns the value of the '<em><b>YCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCoord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCoord</em>' attribute.
	 * @see #setYCoord(int)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingPoint_YCoord()
	 * @model required="true"
	 * @generated
	 */
	int getYCoord();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.MountingPoint#getYCoord <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCoord</em>' attribute.
	 * @see #getYCoord()
	 * @generated
	 */
	void setYCoord(int value);

} // MountingPoint
