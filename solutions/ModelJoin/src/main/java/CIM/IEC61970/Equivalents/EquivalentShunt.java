/**
 */
package CIM.IEC61970.Equivalents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Shunt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentShunt#getB <em>B</em>}</li>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentShunt#getG <em>G</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentShunt()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The class represents equivalent shunts.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The class represents equivalent shunts.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class represents equivalent shunts.' Profile\040documentation='The class represents equivalent shunts.'"
 * @generated
 */
public interface EquivalentShunt extends EquivalentEquipment {
	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(float)
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentShunt_B()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence shunt susceptance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt susceptance.'"
	 * @generated
	 */
	float getB();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentShunt#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(float value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #setG(float)
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentShunt_G()
	 * @model dataType="CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence shunt conductance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt conductance.'"
	 * @generated
	 */
	float getG();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentShunt#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #getG()
	 * @generated
	 */
	void setG(float value);

} // EquivalentShunt
