/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import CIM.IEC61970.ControlArea.ControlArea;

import CIM.IEC61970.Generation.Production.GeneratingUnit;

import CIM.IEC61970.Informative.MarketOperations.Flowgate;

import CIM.IEC61970.Informative.Reservation.ServicePoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideA_TieLines <em>Side ATie Lines</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getGeneratingUnits <em>Generating Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getExport_EnergyTransactions <em>Export Energy Transactions</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getImport_EnergyTransactions <em>Import Energy Transactions</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getHostControlArea <em>Host Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getFlowgate <em>Flowgate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideB_TieLines <em>Side BTie Lines</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getSubControlArea()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='SubControlArea replacement classed moved into EnergySchedulingPackage.\n\nAn area defined for the purpose of tracking interchange with surrounding areas via tie points; may or may not serve as a control area.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='SubControlArea replacement classed moved into EnergySchedulingPackage.\n\nAn area defined for the purpose of tracking interchange with surrounding areas via tie points; may or may not serve as a control area.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='SubControlArea replacement classed moved into EnergySchedulingPackage.\n\nAn area defined for the purpose of tracking interchange with surrounding areas via tie points; may or may not serve as a control area.' Profile\040documentation='SubControlArea replacement classed moved into EnergySchedulingPackage.\n\nAn area defined for the purpose of tracking interchange with surrounding areas via tie points; may or may not serve as a control area.'"
 * @generated
 */
public interface SubControlArea extends ControlArea {
	/**
	 * Returns the value of the '<em><b>Side ATie Lines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.TieLine}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_SubControlArea <em>Side ASub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side ATie Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side ATie Lines</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getSubControlArea_SideA_TieLines()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_SubControlArea
	 * @model opposite="SideA_SubControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The SubControlArea is on the A side of a collection of metered points which define the SubControlArea\'s boundary for a ControlAreaOperator or CustomerConsumer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SubControlArea is on the A side of a collection of metered points which define the SubControlArea\'s boundary for a ControlAreaOperator or CustomerConsumer.'"
	 * @generated
	 */
	EList<TieLine> getSideA_TieLines();

	/**
	 * Returns the value of the '<em><b>Generating Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.GeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getSubControlArea <em>Sub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getSubControlArea_GeneratingUnits()
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getSubControlArea
	 * @model opposite="SubControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A GeneratingUnit injects energy into a SubControlArea.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A GeneratingUnit injects energy into a SubControlArea.'"
	 * @generated
	 */
	EList<GeneratingUnit> getGeneratingUnits();

	/**
	 * Returns the value of the '<em><b>Export Energy Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getExport_SubControlArea <em>Export Sub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Energy Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Energy Transactions</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getSubControlArea_Export_EnergyTransactions()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getExport_SubControlArea
	 * @model opposite="Export_SubControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Energy is transferred between interchange areas'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Energy is transferred between interchange areas'"
	 * @generated
	 */
	EList<EnergyTransaction> getExport_EnergyTransactions();

	/**
	 * Returns the value of the '<em><b>Import Energy Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getImport_SubControlArea <em>Import Sub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Energy Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Energy Transactions</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getSubControlArea_Import_EnergyTransactions()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getImport_SubControlArea
	 * @model opposite="Import_SubControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Energy is transferred between interchange areas'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Energy is transferred between interchange areas'"
	 * @generated
	 */
	EList<EnergyTransaction> getImport_EnergyTransactions();

	/**
	 * Returns the value of the '<em><b>Host Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSubControlAreas <em>Sub Control Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Control Area</em>' reference.
	 * @see #setHostControlArea(HostControlArea)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getSubControlArea_HostControlArea()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSubControlAreas
	 * @model opposite="SubControlAreas"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The interchange area  may operate as a control area'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The interchange area  may operate as a control area'"
	 * @generated
	 */
	HostControlArea getHostControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getHostControlArea <em>Host Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Control Area</em>' reference.
	 * @see #getHostControlArea()
	 * @generated
	 */
	void setHostControlArea(HostControlArea value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.ServicePoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.ServicePoint#getMemberOf <em>Member Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getSubControlArea_PartOf()
	 * @see CIM.IEC61970.Informative.Reservation.ServicePoint#getMemberOf
	 * @model opposite="MemberOf"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission path\'s service point is part of an interchange area'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission path\'s service point is part of an interchange area'"
	 * @generated
	 */
	EList<ServicePoint> getPartOf();

	/**
	 * Returns the value of the '<em><b>Flowgate</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.Flowgate}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getSubControlArea <em>Sub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowgate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowgate</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getSubControlArea_Flowgate()
	 * @see CIM.IEC61970.Informative.MarketOperations.Flowgate#getSubControlArea
	 * @model opposite="SubControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area may own 0 to n flowgates\nA flowgate must be owned by exactly 1 control area'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area may own 0 to n flowgates\nA flowgate must be owned by exactly 1 control area'"
	 * @generated
	 */
	EList<Flowgate> getFlowgate();

	/**
	 * Returns the value of the '<em><b>Side BTie Lines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.TieLine}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_SubControlArea <em>Side BSub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side BTie Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side BTie Lines</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getSubControlArea_SideB_TieLines()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_SubControlArea
	 * @model opposite="SideB_SubControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The SubControlArea is on the B side of a collection of metered points which define the SubControlArea\'s boundary for a ControlAreaOperator or CustomerConsumer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SubControlArea is on the B side of a collection of metered points which define the SubControlArea\'s boundary for a ControlAreaOperator or CustomerConsumer.'"
	 * @generated
	 */
	EList<TieLine> getSideB_TieLines();

} // SubControlArea
