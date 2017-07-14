/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.Equipment;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getFlowgates <em>Flowgates</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getHeatExchanger <em>Heat Exchanger</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getTransformerWindings <em>Transformer Windings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getMagBaseU <em>Mag Base U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getMagSatFlux <em>Mag Sat Flux</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getBmagSat <em>Bmag Sat</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getPowerTransformer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow).' Profile\040documentation='An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow).'"
 * @generated
 */
public interface PowerTransformer extends Equipment {
	/**
	 * Returns the value of the '<em><b>Flowgates</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getPowerTransormers <em>Power Transormers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowgates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowgates</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getPowerTransformer_Flowgates()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getPowerTransormers
	 * @model opposite="PowerTransormers"
	 * @generated
	 */
	EList<Flowgate> getFlowgates();

	/**
	 * Returns the value of the '<em><b>Heat Exchanger</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.HeatExchanger#getPowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Exchanger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Exchanger</em>' reference.
	 * @see #setHeatExchanger(HeatExchanger)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getPowerTransformer_HeatExchanger()
	 * @see gluemodel.CIM.IEC61970.Wires.HeatExchanger#getPowerTransformer
	 * @model opposite="PowerTransformer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transformer may have a heat exchanger'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transformer may have a heat exchanger'"
	 * @generated
	 */
	HeatExchanger getHeatExchanger();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getHeatExchanger <em>Heat Exchanger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Exchanger</em>' reference.
	 * @see #getHeatExchanger()
	 * @generated
	 */
	void setHeatExchanger(HeatExchanger value);

	/**
	 * Returns the value of the '<em><b>Transformer Windings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.TransformerWinding}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.TransformerWinding#getPowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Windings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Windings</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getPowerTransformer_TransformerWindings()
	 * @see gluemodel.CIM.IEC61970.Wires.TransformerWinding#getPowerTransformer
	 * @model opposite="PowerTransformer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transformer has windings'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transformer has windings'"
	 * @generated
	 */
	EList<TransformerWinding> getTransformerWindings();

	/**
	 * Returns the value of the '<em><b>Mag Base U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mag Base U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mag Base U</em>' attribute.
	 * @see #setMagBaseU(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getPowerTransformer_MagBaseU()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The reference voltage at which the magnetizing saturation measurements were made'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reference voltage at which the magnetizing saturation measurements were made'"
	 * @generated
	 */
	float getMagBaseU();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getMagBaseU <em>Mag Base U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mag Base U</em>' attribute.
	 * @see #getMagBaseU()
	 * @generated
	 */
	void setMagBaseU(float value);

	/**
	 * Returns the value of the '<em><b>Mag Sat Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mag Sat Flux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mag Sat Flux</em>' attribute.
	 * @see #setMagSatFlux(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getPowerTransformer_MagSatFlux()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Core magnetizing saturation curve knee flux level.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Core magnetizing saturation curve knee flux level.'"
	 * @generated
	 */
	float getMagSatFlux();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getMagSatFlux <em>Mag Sat Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mag Sat Flux</em>' attribute.
	 * @see #getMagSatFlux()
	 * @generated
	 */
	void setMagSatFlux(float value);

	/**
	 * Returns the value of the '<em><b>Bmag Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bmag Sat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bmag Sat</em>' attribute.
	 * @see #setBmagSat(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getPowerTransformer_BmagSat()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Core shunt magnetizing susceptance in the saturation region.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Core shunt magnetizing susceptance in the saturation region.'"
	 * @generated
	 */
	float getBmagSat();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.PowerTransformer#getBmagSat <em>Bmag Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bmag Sat</em>' attribute.
	 * @see #getBmagSat()
	 * @generated
	 */
	void setBmagSat(float value);

} // PowerTransformer
