/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.IEC61970.ControlArea.TieFlow;

import gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm;

import gluemodel.CIM.IEC61970.Meas.Measurement;

import gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal;
import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet;

import gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow;

import gluemodel.CIM.IEC61970.Topology.TopologicalNode;

import gluemodel.CIM.IEC61970.Wires.MutualCoupling;
import gluemodel.CIM.IEC61970.Wires.RegulatingControl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getHasFirst_MutualCoupling <em>Has First Mutual Coupling</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getTerminalConstraints <em>Terminal Constraints</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#isConnected <em>Connected</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getBushingInfo <em>Bushing Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getHasSecond_MutualCoupling <em>Has Second Mutual Coupling</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Terminal#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called \"connectivity nodes\".'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called \"connectivity nodes\".'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called \"connectivity nodes\".' Profile\040documentation='An electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called \"connectivity nodes\".'"
 * @generated
 */
public interface Terminal extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Connectivity Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node</em>' reference.
	 * @see #setConnectivityNode(ConnectivityNode)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_ConnectivityNode()
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getTerminals
	 * @model opposite="Terminals"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals.'"
	 * @generated
	 */
	ConnectivityNode getConnectivityNode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Node</em>' reference.
	 * @see #getConnectivityNode()
	 * @generated
	 */
	void setConnectivityNode(ConnectivityNode value);

	/**
	 * Returns the value of the '<em><b>Sv Power Flow</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Power Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Power Flow</em>' reference.
	 * @see #setSvPowerFlow(SvPowerFlow)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_SvPowerFlow()
	 * @see gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getTerminal
	 * @model opposite="Terminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The power flow state associated with the terminal.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The power flow state associated with the terminal.'"
	 * @generated
	 */
	SvPowerFlow getSvPowerFlow();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Power Flow</em>' reference.
	 * @see #getSvPowerFlow()
	 * @generated
	 */
	void setSvPowerFlow(SvPowerFlow value);

	/**
	 * Returns the value of the '<em><b>Has First Mutual Coupling</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.MutualCoupling}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has First Mutual Coupling</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has First Mutual Coupling</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_HasFirst_MutualCoupling()
	 * @see gluemodel.CIM.IEC61970.Wires.MutualCoupling#getFirst_Terminal
	 * @model opposite="First_Terminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Mutual couplings associated with the branch as the first branch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Mutual couplings associated with the branch as the first branch.'"
	 * @generated
	 */
	EList<MutualCoupling> getHasFirst_MutualCoupling();

	/**
	 * Returns the value of the '<em><b>Terminal Constraints</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Constraints</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_TerminalConstraints()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm#getTerminal
	 * @model opposite="Terminal"
	 * @generated
	 */
	EList<TerminalConstraintTerm> getTerminalConstraints();

	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.RegulatingControl}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.RegulatingControl#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_RegulatingControl()
	 * @see gluemodel.CIM.IEC61970.Wires.RegulatingControl#getTerminal
	 * @model opposite="Terminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The terminal is regulated by a control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The terminal is regulated by a control.'"
	 * @generated
	 */
	EList<RegulatingControl> getRegulatingControl();

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_Connected()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The connected status is related to a bus-branch model and the TopologicalNode-Terminal relation.  True implies the Terminal is connected to the related TopologicalNode and false implies it is not. \nIn a bus-branch model the connected status is used to tell if equipment is disconnected without having to change the connectivity described by the TopologicalNode-Terminal relation. A valid case is that ConductingEquipment can be connected in one end and open in the other. In particular for an ACLineSegment where the charging can be significant this is a relevant case.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The connected status is related to a bus-branch model and the TopologicalNode-Terminal relation.  True implies the Terminal is connected to the related TopologicalNode and false implies it is not. \nIn a bus-branch model the connected status is used to tell if equipment is disconnected without having to change the connectivity described by the TopologicalNode-Terminal relation. A valid case is that ConductingEquipment can be connected in one end and open in the other. In particular for an ACLineSegment where the charging can be significant this is a relevant case.'"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Terminal#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_Measurements()
	 * @see gluemodel.CIM.IEC61970.Meas.Measurement#getTerminal
	 * @model opposite="Terminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='One or more measurements may be associated with a terminal in the network. Measurement-Terminal defines where the measurement is placed in the network topology.\nSome Measurements represent quantities related to a particular sensor position, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is captured by the Measurement - Terminal association that makes it possible to place the sensing position at a  well defined place. The place is defined by the connection of the Terminal to ConductingEquipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='One or more measurements may be associated with a terminal in the network. Measurement-Terminal defines where the measurement is placed in the network topology.\nSome Measurements represent quantities related to a particular sensor position, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is captured by the Measurement - Terminal association that makes it possible to place the sensing position at a  well defined place. The place is defined by the connection of the Terminal to ConductingEquipment.'"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The orientation of the terminal connections for a multiple terminal conducting equipment.  The sequence numbering starts with 1 and additional terminals should follow in increasing order.   The first terminal is the \"starting point\" for a two terminal branch.   In the case of class TransformerWinding only one terminal is used so its sequenceNumber must be 1.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The orientation of the terminal connections for a multiple terminal conducting equipment.  The sequence numbering starts with 1 and additional terminals should follow in increasing order.   The first terminal is the \"starting point\" for a two terminal branch.   In the case of class TransformerWinding only one terminal is used so its sequenceNumber must be 1.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Terminal#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Tie Flow</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.ControlArea.TieFlow}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.ControlArea.TieFlow#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Flow</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_TieFlow()
	 * @see gluemodel.CIM.IEC61970.ControlArea.TieFlow#getTerminal
	 * @model opposite="Terminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The control area tie flows to which this terminal associates.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control area tie flows to which this terminal associates.'"
	 * @generated
	 */
	EList<TieFlow> getTieFlow();

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_TopologicalNode()
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTerminal
	 * @model opposite="Terminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The topological node associated with the terminal.   This can be used as an alternative to the connectivity node path to topological node, thus making it unneccesary to model connedtivity nodes in some cases.   Note that the if connectivity nodes are in the model, this association would proably not be used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The topological node associated with the terminal.   This can be used as an alternative to the connectivity node path to topological node, thus making it unneccesary to model connedtivity nodes in some cases.   Note that the if connectivity nodes are in the model, this association would proably not be used.'"
	 * @generated
	 */
	TopologicalNode getTopologicalNode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Terminal#getTopologicalNode <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topological Node</em>' reference.
	 * @see #getTopologicalNode()
	 * @generated
	 */
	void setTopologicalNode(TopologicalNode value);

	/**
	 * Returns the value of the '<em><b>Branch Group Terminal</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Group Terminal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Group Terminal</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_BranchGroupTerminal()
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal
	 * @model opposite="Terminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The directed branch group terminals for which the terminal is monitored.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The directed branch group terminals for which the terminal is monitored.'"
	 * @generated
	 */
	EList<BranchGroupTerminal> getBranchGroupTerminal();

	/**
	 * Returns the value of the '<em><b>Bushing Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Info</em>' reference.
	 * @see #setBushingInfo(BushingInfo)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_BushingInfo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo#getTerminal
	 * @model opposite="Terminal"
	 * @generated
	 */
	BushingInfo getBushingInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Terminal#getBushingInfo <em>Bushing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bushing Info</em>' reference.
	 * @see #getBushingInfo()
	 * @generated
	 */
	void setBushingInfo(BushingInfo value);

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference.
	 * @see #setConductingEquipment(ConductingEquipment)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_ConductingEquipment()
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getTerminals
	 * @model opposite="Terminals"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes'"
	 * @generated
	 */
	ConductingEquipment getConductingEquipment();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Terminal#getConductingEquipment <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conducting Equipment</em>' reference.
	 * @see #getConductingEquipment()
	 * @generated
	 */
	void setConductingEquipment(ConductingEquipment value);

	/**
	 * Returns the value of the '<em><b>Has Second Mutual Coupling</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.MutualCoupling}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Second Mutual Coupling</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Second Mutual Coupling</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_HasSecond_MutualCoupling()
	 * @see gluemodel.CIM.IEC61970.Wires.MutualCoupling#getSecond_Terminal
	 * @model opposite="Second_Terminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Mutual couplings with the branch associated as the first branch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Mutual couplings with the branch associated as the first branch.'"
	 * @generated
	 */
	EList<MutualCoupling> getHasSecond_MutualCoupling();

	/**
	 * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Set</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getTerminal_OperationalLimitSet()
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal
	 * @model opposite="Terminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The operatinal limits sets that applie specifically to this terminal.  Other operational limits sets may apply to this terminal through the association to Equipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The operatinal limits sets that applie specifically to this terminal.  Other operational limits sets may apply to this terminal through the association to Equipment.'"
	 * @generated
	 */
	EList<OperationalLimitSet> getOperationalLimitSet();

} // Terminal
