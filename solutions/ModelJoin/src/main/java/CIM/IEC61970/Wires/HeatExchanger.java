/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.Core.Equipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heat Exchanger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.HeatExchanger#getPowerTransformer <em>Power Transformer</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getHeatExchanger()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Equipment for the cooling of electrical equipment and the extraction of heat'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Equipment for the cooling of electrical equipment and the extraction of heat'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Equipment for the cooling of electrical equipment and the extraction of heat' Profile\040documentation='Equipment for the cooling of electrical equipment and the extraction of heat'"
 * @generated
 */
public interface HeatExchanger extends Equipment {
	/**
	 * Returns the value of the '<em><b>Power Transformer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.PowerTransformer#getHeatExchanger <em>Heat Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transformer</em>' reference.
	 * @see #setPowerTransformer(PowerTransformer)
	 * @see CIM.IEC61970.Wires.WiresPackage#getHeatExchanger_PowerTransformer()
	 * @see CIM.IEC61970.Wires.PowerTransformer#getHeatExchanger
	 * @model opposite="HeatExchanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transformer may have a heat exchanger'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transformer may have a heat exchanger'"
	 * @generated
	 */
	PowerTransformer getPowerTransformer();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.HeatExchanger#getPowerTransformer <em>Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Transformer</em>' reference.
	 * @see #getPowerTransformer()
	 * @generated
	 */
	void setPowerTransformer(PowerTransformer value);

} // HeatExchanger
