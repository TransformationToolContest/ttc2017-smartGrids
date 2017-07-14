/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover;

import gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit;
import gluemodel.CIM.IEC61970.Generation.Production.HydroPump;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXDirectSync <em>XDirect Sync</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXQuadTrans <em>XQuad Trans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans <em>XQuad Subtrans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getCoolantType <em>Coolant Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getCondenserP <em>Condenser P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getMaxU <em>Max U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getDamping <em>Damping</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getR2 <em>R2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getX0 <em>X0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getX2 <em>X2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans <em>XDirect Subtrans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getX <em>X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getQPercent <em>QPercent</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXQuadSync <em>XQuad Sync</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getInertia <em>Inertia</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getHydroPump <em>Hydro Pump</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getMinU <em>Min U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXDirectTrans <em>XDirect Trans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getBaseQ <em>Base Q</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An electromechanical device that operates synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An electromechanical device that operates synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An electromechanical device that operates synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.' Profile\040documentation='An electromechanical device that operates synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.'"
 * @generated
 */
public interface SynchronousMachine extends RegulatingCondEq {
	/**
	 * Returns the value of the '<em><b>XDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDirect Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDirect Sync</em>' attribute.
	 * @see #setXDirectSync(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_XDirectSync()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direct-axis synchronous reactance. The quotient of a sustained value of that AC component of armature voltage that is produced by the total direct-axis flux due to direct-axis armature current and the value of the AC component of this current, the machine running at rated speed. (Xd)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direct-axis synchronous reactance. The quotient of a sustained value of that AC component of armature voltage that is produced by the total direct-axis flux due to direct-axis armature current and the value of the AC component of this current, the machine running at rated speed. (Xd)'"
	 * @generated
	 */
	float getXDirectSync();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXDirectSync <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDirect Sync</em>' attribute.
	 * @see #getXDirectSync()
	 * @generated
	 */
	void setXDirectSync(float value);

	/**
	 * Returns the value of the '<em><b>XQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuad Trans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuad Trans</em>' attribute.
	 * @see #setXQuadTrans(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_XQuadTrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quadrature-axis transient reactance, also known as X\'q.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quadrature-axis transient reactance, also known as X\'q.'"
	 * @generated
	 */
	float getXQuadTrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXQuadTrans <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuad Trans</em>' attribute.
	 * @see #getXQuadTrans()
	 * @generated
	 */
	void setXQuadTrans(float value);

	/**
	 * Returns the value of the '<em><b>Coolant Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coolant Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coolant Condition</em>' attribute.
	 * @see #setCoolantCondition(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_CoolantCondition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Temperature or pressure of coolant medium'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Temperature or pressure of coolant medium'"
	 * @generated
	 */
	float getCoolantCondition();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coolant Condition</em>' attribute.
	 * @see #getCoolantCondition()
	 * @generated
	 */
	void setCoolantCondition(float value);

	/**
	 * Returns the value of the '<em><b>Reactive Capability Curves</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive Capability Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive Capability Curves</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_ReactiveCapabilityCurves()
	 * @see gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines
	 * @model opposite="SynchronousMachines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All available Reactive capability curves for this SynchronousMachine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All available Reactive capability curves for this SynchronousMachine.'"
	 * @generated
	 */
	EList<ReactiveCapabilityCurve> getReactiveCapabilityCurves();

	/**
	 * Returns the value of the '<em><b>XQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuad Subtrans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuad Subtrans</em>' attribute.
	 * @see #setXQuadSubtrans(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_XQuadSubtrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quadrature-axis subtransient reactance, also known as X\"q.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quadrature-axis subtransient reactance, also known as X\"q.'"
	 * @generated
	 */
	float getXQuadSubtrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuad Subtrans</em>' attribute.
	 * @see #getXQuadSubtrans()
	 * @generated
	 */
	void setXQuadSubtrans(float value);

	/**
	 * Returns the value of the '<em><b>Coolant Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Wires.CoolantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coolant Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coolant Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.CoolantType
	 * @see #setCoolantType(CoolantType)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_CoolantType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Method of cooling the machine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Method of cooling the machine.'"
	 * @generated
	 */
	CoolantType getCoolantType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getCoolantType <em>Coolant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coolant Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.CoolantType
	 * @see #getCoolantType()
	 * @generated
	 */
	void setCoolantType(CoolantType value);

	/**
	 * Returns the value of the '<em><b>Condenser P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condenser P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condenser P</em>' attribute.
	 * @see #setCondenserP(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_CondenserP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Active power consumed when in condenser mode operation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Active power consumed when in condenser mode operation.'"
	 * @generated
	 */
	float getCondenserP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getCondenserP <em>Condenser P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condenser P</em>' attribute.
	 * @see #getCondenserP()
	 * @generated
	 */
	void setCondenserP(float value);

	/**
	 * Returns the value of the '<em><b>AVR To Manual Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AVR To Manual Lag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AVR To Manual Lag</em>' attribute.
	 * @see #setAVRToManualLag(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_AVRToManualLag()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time delay required when switching from Automatic Voltage Regulation (AVR) to Manual for a lagging MVAr violation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time delay required when switching from Automatic Voltage Regulation (AVR) to Manual for a lagging MVAr violation.'"
	 * @generated
	 */
	float getAVRToManualLag();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AVR To Manual Lag</em>' attribute.
	 * @see #getAVRToManualLag()
	 * @generated
	 */
	void setAVRToManualLag(float value);

	/**
	 * Returns the value of the '<em><b>Min Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Q</em>' attribute.
	 * @see #setMinQ(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_MinQ()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum reactive power limit for the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum reactive power limit for the unit.'"
	 * @generated
	 */
	float getMinQ();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Q</em>' attribute.
	 * @see #getMinQ()
	 * @generated
	 */
	void setMinQ(float value);

	/**
	 * Returns the value of the '<em><b>AVR To Manual Lead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AVR To Manual Lead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AVR To Manual Lead</em>' attribute.
	 * @see #setAVRToManualLead(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_AVRToManualLead()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time delay required when switching from Automatic Voltage Regulation (AVR) to Manual for a leading MVAr violation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time delay required when switching from Automatic Voltage Regulation (AVR) to Manual for a leading MVAr violation.'"
	 * @generated
	 */
	float getAVRToManualLead();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AVR To Manual Lead</em>' attribute.
	 * @see #getAVRToManualLead()
	 * @generated
	 */
	void setAVRToManualLead(float value);

	/**
	 * Returns the value of the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max U</em>' attribute.
	 * @see #setMaxU(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_MaxU()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum voltage limit for the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum voltage limit for the unit.'"
	 * @generated
	 */
	float getMaxU();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getMaxU <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max U</em>' attribute.
	 * @see #getMaxU()
	 * @generated
	 */
	void setMaxU(float value);

	/**
	 * Returns the value of the '<em><b>Damping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damping</em>' attribute.
	 * @see #setDamping(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_Damping()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Damping" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Damping torque coefficient, a proportionality constant that, when multiplied by the angular velocity of the rotor poles with respect to the magnetic field (frequency), results in the damping torque.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Damping torque coefficient, a proportionality constant that, when multiplied by the angular velocity of the rotor poles with respect to the magnetic field (frequency), results in the damping torque.'"
	 * @generated
	 */
	float getDamping();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getDamping <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damping</em>' attribute.
	 * @see #getDamping()
	 * @generated
	 */
	void setDamping(float value);

	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(GeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_GeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines
	 * @model opposite="SynchronousMachines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A synchronous machine may operate as a generator and as such becomes a member of a generating unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A synchronous machine may operate as a generator and as such becomes a member of a generating unit'"
	 * @generated
	 */
	GeneratingUnit getGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	void setGeneratingUnit(GeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Max Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Q</em>' attribute.
	 * @see #setMaxQ(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_MaxQ()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum reactive power limit. This is the maximum (nameplate) limit for the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum reactive power limit. This is the maximum (nameplate) limit for the unit.'"
	 * @generated
	 */
	float getMaxQ();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Q</em>' attribute.
	 * @see #getMaxQ()
	 * @generated
	 */
	void setMaxQ(float value);

	/**
	 * Returns the value of the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0</em>' attribute.
	 * @see #setR0(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_R0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence resistance of the synchronous machine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence resistance of the synchronous machine.'"
	 * @generated
	 */
	float getR0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #getR0()
	 * @generated
	 */
	void setR0(float value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Wires.SynchronousMachineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.SynchronousMachineType
	 * @see #setType(SynchronousMachineType)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_Type()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Modes that this synchronous machine can operate in.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Modes that this synchronous machine can operate in.'"
	 * @generated
	 */
	SynchronousMachineType getType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.SynchronousMachineType
	 * @see #getType()
	 * @generated
	 */
	void setType(SynchronousMachineType value);

	/**
	 * Returns the value of the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R2</em>' attribute.
	 * @see #setR2(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_R2()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Negative sequence resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Negative sequence resistance.'"
	 * @generated
	 */
	float getR2();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getR2 <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R2</em>' attribute.
	 * @see #getR2()
	 * @generated
	 */
	void setR2(float value);

	/**
	 * Returns the value of the '<em><b>Reference Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Priority</em>' attribute.
	 * @see #setReferencePriority(int)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_ReferencePriority()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Priority of unit for reference bus selection. 0 = don t care (default) 1 = highest priority. 2 is less than 1 and so on.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Priority of unit for reference bus selection. 0 = don t care (default) 1 = highest priority. 2 is less than 1 and so on.'"
	 * @generated
	 */
	int getReferencePriority();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Priority</em>' attribute.
	 * @see #getReferencePriority()
	 * @generated
	 */
	void setReferencePriority(int value);

	/**
	 * Returns the value of the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0</em>' attribute.
	 * @see #setX0(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_X0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence reactance of the synchronous machine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence reactance of the synchronous machine.'"
	 * @generated
	 */
	float getX0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(float value);

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #setX2(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_X2()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Negative sequence reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Negative sequence reactance.'"
	 * @generated
	 */
	float getX2();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #getX2()
	 * @generated
	 */
	void setX2(float value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_R()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence resistance of the synchronous machine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence resistance of the synchronous machine.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

	/**
	 * Returns the value of the '<em><b>Initial Reactive Capability Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Reactive Capability Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Reactive Capability Curve</em>' reference.
	 * @see #setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_InitialReactiveCapabilityCurve()
	 * @see gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines
	 * @model opposite="InitiallyUsedBySynchronousMachines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The default ReactiveCapabilityCurve for use by a SynchronousMachine'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The default ReactiveCapabilityCurve for use by a SynchronousMachine'"
	 * @generated
	 */
	ReactiveCapabilityCurve getInitialReactiveCapabilityCurve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Reactive Capability Curve</em>' reference.
	 * @see #getInitialReactiveCapabilityCurve()
	 * @generated
	 */
	void setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve value);

	/**
	 * Returns the value of the '<em><b>XDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDirect Subtrans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDirect Subtrans</em>' attribute.
	 * @see #setXDirectSubtrans(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_XDirectSubtrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direct-axis subtransient reactance, also known as X\"d.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direct-axis subtransient reactance, also known as X\"d.'"
	 * @generated
	 */
	float getXDirectSubtrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDirect Subtrans</em>' attribute.
	 * @see #getXDirectSubtrans()
	 * @generated
	 */
	void setXDirectSubtrans(float value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_X()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence reactance of the synchronous machine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence reactance of the synchronous machine.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>QPercent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QPercent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QPercent</em>' attribute.
	 * @see #setQPercent(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_QPercent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Percent of the coordinated reactive control that comes from this machine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Percent of the coordinated reactive control that comes from this machine.'"
	 * @generated
	 */
	float getQPercent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QPercent</em>' attribute.
	 * @see #getQPercent()
	 * @generated
	 */
	void setQPercent(float value);

	/**
	 * Returns the value of the '<em><b>XQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuad Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuad Sync</em>' attribute.
	 * @see #setXQuadSync(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_XQuadSync()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quadrature-axis synchronous reactance (Xq) , the ratio of the component of reactive armature voltage, due to the quadrature-axis component of armature current, to this component of current, under steady state conditions and at rated frequency.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quadrature-axis synchronous reactance (Xq) , the ratio of the component of reactive armature voltage, due to the quadrature-axis component of armature current, to this component of current, under steady state conditions and at rated frequency.'"
	 * @generated
	 */
	float getXQuadSync();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXQuadSync <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuad Sync</em>' attribute.
	 * @see #getXQuadSync()
	 * @generated
	 */
	void setXQuadSync(float value);

	/**
	 * Returns the value of the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated S</em>' attribute.
	 * @see #setRatedS(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_RatedS()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Nameplate apparent power rating for the unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Nameplate apparent power rating for the unit'"
	 * @generated
	 */
	float getRatedS();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getRatedS <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated S</em>' attribute.
	 * @see #getRatedS()
	 * @generated
	 */
	void setRatedS(float value);

	/**
	 * Returns the value of the '<em><b>Manual To AVR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual To AVR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual To AVR</em>' attribute.
	 * @see #setManualToAVR(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_ManualToAVR()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time delay required when switching from Manual to Automatic Voltage Regulation. This value is used in the accelerating power reference frame for powerflow solutions'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time delay required when switching from Manual to Automatic Voltage Regulation. This value is used in the accelerating power reference frame for powerflow solutions'"
	 * @generated
	 */
	float getManualToAVR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual To AVR</em>' attribute.
	 * @see #getManualToAVR()
	 * @generated
	 */
	void setManualToAVR(float value);

	/**
	 * Returns the value of the '<em><b>Inertia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inertia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inertia</em>' attribute.
	 * @see #setInertia(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_Inertia()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The energy stored in the rotor when operating at rated speed. This value is used in the accelerating power reference frame for  operator training simulator solutions.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The energy stored in the rotor when operating at rated speed. This value is used in the accelerating power reference frame for  operator training simulator solutions.'"
	 * @generated
	 */
	float getInertia();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getInertia <em>Inertia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inertia</em>' attribute.
	 * @see #getInertia()
	 * @generated
	 */
	void setInertia(float value);

	/**
	 * Returns the value of the '<em><b>Hydro Pump</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroPump#getSynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Pump</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Pump</em>' reference.
	 * @see #setHydroPump(HydroPump)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_HydroPump()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroPump#getSynchronousMachine
	 * @model opposite="SynchronousMachine"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The synchronous machine drives the turbine which moves the water from a low elevation to a higher elevation. The direction of machine rotation for pumping may or may not be the same as for generating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The synchronous machine drives the turbine which moves the water from a low elevation to a higher elevation. The direction of machine rotation for pumping may or may not be the same as for generating.'"
	 * @generated
	 */
	HydroPump getHydroPump();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getHydroPump <em>Hydro Pump</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Pump</em>' reference.
	 * @see #getHydroPump()
	 * @generated
	 */
	void setHydroPump(HydroPump value);

	/**
	 * Returns the value of the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min U</em>' attribute.
	 * @see #setMinU(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_MinU()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum voltage  limit for the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum voltage  limit for the unit.'"
	 * @generated
	 */
	float getMinU();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getMinU <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min U</em>' attribute.
	 * @see #getMinU()
	 * @generated
	 */
	void setMinU(float value);

	/**
	 * Returns the value of the '<em><b>XDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDirect Trans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDirect Trans</em>' attribute.
	 * @see #setXDirectTrans(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_XDirectTrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direct-axis transient reactance, also known as X\'d.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direct-axis transient reactance, also known as X\'d.'"
	 * @generated
	 */
	float getXDirectTrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getXDirectTrans <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDirect Trans</em>' attribute.
	 * @see #getXDirectTrans()
	 * @generated
	 */
	void setXDirectTrans(float value);

	/**
	 * Returns the value of the '<em><b>Base Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Q</em>' attribute.
	 * @see #setBaseQ(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_BaseQ()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Default base reactive power value. This value represents the initial reactive power that can be used by any application function.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Default base reactive power value. This value represents the initial reactive power that can be used by any application function.'"
	 * @generated
	 */
	float getBaseQ();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getBaseQ <em>Base Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Q</em>' attribute.
	 * @see #getBaseQ()
	 * @generated
	 */
	void setBaseQ(float value);

	/**
	 * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Wires.SynchronousMachineOperatingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.SynchronousMachineOperatingMode
	 * @see #setOperatingMode(SynchronousMachineOperatingMode)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_OperatingMode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current mode of operation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current mode of operation.'"
	 * @generated
	 */
	SynchronousMachineOperatingMode getOperatingMode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.SynchronousMachineOperatingMode
	 * @see #getOperatingMode()
	 * @generated
	 */
	void setOperatingMode(SynchronousMachineOperatingMode value);

	/**
	 * Returns the value of the '<em><b>Prime Movers</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prime Movers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prime Movers</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSynchronousMachine_PrimeMovers()
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.PrimeMover#getSynchronousMachines
	 * @model opposite="SynchronousMachines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Prime movers that drive this SynchronousMachine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Prime movers that drive this SynchronousMachine.'"
	 * @generated
	 */
	EList<PrimeMover> getPrimeMovers();

} // SynchronousMachine
