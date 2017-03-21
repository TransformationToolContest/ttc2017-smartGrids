/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.Core.ConductingEquipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Series Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.SeriesCompensator#getR <em>R</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.SeriesCompensator#getX <em>X</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getSeriesCompensator()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance.  It is a two terminal device.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance.  It is a two terminal device.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance.  It is a two terminal device.' Profile\040documentation='A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance.  It is a two terminal device.'"
 * @generated
 */
public interface SeriesCompensator extends ConductingEquipment {
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
	 * @see CIM.IEC61970.Wires.WiresPackage#getSeriesCompensator_R()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence resistance.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.SeriesCompensator#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

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
	 * @see CIM.IEC61970.Wires.WiresPackage#getSeriesCompensator_X()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence reactance.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.SeriesCompensator#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

} // SeriesCompensator
