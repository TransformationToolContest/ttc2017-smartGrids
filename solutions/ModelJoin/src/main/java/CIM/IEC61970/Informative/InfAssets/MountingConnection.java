/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mounting Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos <em>Structure Infos</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints <em>Mounting Points</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingConnection()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A structure can have multiple connection points for electrical connections (e.g. line) each with multiple mounting points, one for each phase. e.g. a Tower may have three Connections, two with three mounting points, one for each phase and a third with a single mounting point for the neutral line. A pole, on the other hand, may have a single Connection with one, two or three mounting points depending on whether it is carrying 1,2 or 3 phases.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A structure can have multiple connection points for electrical connections (e.g. line) each with multiple mounting points, one for each phase. e.g. a Tower may have three Connections, two with three mounting points, one for each phase and a third with a single mounting point for the neutral line. A pole, on the other hand, may have a single Connection with one, two or three mounting points depending on whether it is carrying 1,2 or 3 phases.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A structure can have multiple connection points for electrical connections (e.g. line) each with multiple mounting points, one for each phase. e.g. a Tower may have three Connections, two with three mounting points, one for each phase and a third with a single mounting point for the neutral line. A pole, on the other hand, may have a single Connection with one, two or three mounting points depending on whether it is carrying 1,2 or 3 phases.' Profile\040documentation='A structure can have multiple connection points for electrical connections (e.g. line) each with multiple mounting points, one for each phase. e.g. a Tower may have three Connections, two with three mounting points, one for each phase and a third with a single mounting point for the neutral line. A pole, on the other hand, may have a single Connection with one, two or three mounting points depending on whether it is carrying 1,2 or 3 phases.'"
 * @generated
 */
public interface MountingConnection extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Structure Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.StructureInfo}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.StructureInfo#getMountingConnections <em>Mounting Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Infos</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingConnection_StructureInfos()
	 * @see CIM.IEC61970.Informative.InfAssets.StructureInfo#getMountingConnections
	 * @model opposite="MountingConnections"
	 * @generated
	 */
	EList<StructureInfo> getStructureInfos();

	/**
	 * Returns the value of the '<em><b>Mounting Points</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.MountingPoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.MountingPoint#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Points</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingConnection_MountingPoints()
	 * @see CIM.IEC61970.Informative.InfAssets.MountingPoint#getConnections
	 * @model opposite="Connections"
	 * @generated
	 */
	EList<MountingPoint> getMountingPoints();

} // MountingConnection
