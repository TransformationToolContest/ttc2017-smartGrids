/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.Curve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reactive Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getReactiveCapabilityCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reactive power rating envelope versus the synchronous machine\'s active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Reactive power rating envelope versus the synchronous machine\'s active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reactive power rating envelope versus the synchronous machine\'s active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.' Profile\040documentation='Reactive power rating envelope versus the synchronous machine\'s active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.'"
 * @generated
 */
public interface ReactiveCapabilityCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Initially Used By Synchronous Machines</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initially Used By Synchronous Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initially Used By Synchronous Machines</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines()
	 * @see gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve
	 * @model opposite="InitialReactiveCapabilityCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Synchronous machines using this curve as default.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Synchronous machines using this curve as default.'"
	 * @generated
	 */
	EList<SynchronousMachine> getInitiallyUsedBySynchronousMachines();

	/**
	 * Returns the value of the '<em><b>Hydrogen Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydrogen Pressure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydrogen Pressure</em>' attribute.
	 * @see #setHydrogenPressure(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getReactiveCapabilityCurve_HydrogenPressure()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Pressure" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydrogen coolant pressure'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydrogen coolant pressure'"
	 * @generated
	 */
	float getHydrogenPressure();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydrogen Pressure</em>' attribute.
	 * @see #getHydrogenPressure()
	 * @generated
	 */
	void setHydrogenPressure(float value);

	/**
	 * Returns the value of the '<em><b>Synchronous Machines</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Machines</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getReactiveCapabilityCurve_SynchronousMachines()
	 * @see gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves
	 * @model opposite="ReactiveCapabilityCurves"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Synchronous machines using this curve.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Synchronous machines using this curve.'"
	 * @generated
	 */
	EList<SynchronousMachine> getSynchronousMachines();

	/**
	 * Returns the value of the '<em><b>Coolant Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coolant Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coolant Temperature</em>' attribute.
	 * @see #setCoolantTemperature(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getReactiveCapabilityCurve_CoolantTemperature()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Temperature" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The machine\'s coolant temperature (e.g., ambient air or stator circulating water).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The machine\'s coolant temperature (e.g., ambient air or stator circulating water).'"
	 * @generated
	 */
	float getCoolantTemperature();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coolant Temperature</em>' attribute.
	 * @see #getCoolantTemperature()
	 * @generated
	 */
	void setCoolantTemperature(float value);

} // ReactiveCapabilityCurve
