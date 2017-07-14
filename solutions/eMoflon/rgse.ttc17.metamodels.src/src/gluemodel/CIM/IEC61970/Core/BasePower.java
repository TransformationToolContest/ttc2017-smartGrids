/**
 */
package gluemodel.CIM.IEC61970.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.BasePower#getBasePower <em>Base Power</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getBasePower()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The BasePower class defines the base power used in the per unit calculations.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The BasePower class defines the base power used in the per unit calculations.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The BasePower class defines the base power used in the per unit calculations.' Profile\040documentation='The BasePower class defines the base power used in the per unit calculations.'"
 * @generated
 */
public interface BasePower extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Base Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Power</em>' attribute.
	 * @see #setBasePower(float)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getBasePower_BasePower()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Definition of base power.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Definition of base power.'"
	 * @generated
	 */
	float getBasePower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.BasePower#getBasePower <em>Base Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Power</em>' attribute.
	 * @see #getBasePower()
	 * @generated
	 */
	void setBasePower(float value);

} // BasePower
