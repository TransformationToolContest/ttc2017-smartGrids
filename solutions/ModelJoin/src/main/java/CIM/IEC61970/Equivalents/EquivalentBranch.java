/**
 */
package CIM.IEC61970.Equivalents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentBranch#getR <em>R</em>}</li>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentBranch#getX <em>X</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentBranch()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The class represents equivalent branches.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The class represents equivalent branches.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class represents equivalent branches.' Profile\040documentation='The class represents equivalent branches.'"
 * @generated
 */
public interface EquivalentBranch extends EquivalentEquipment {
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
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentBranch_R()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series resistance of the reduced branch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series resistance of the reduced branch.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentBranch#getR <em>R</em>}' attribute.
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
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentBranch_X()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence series reactance of the reduced branch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series reactance of the reduced branch.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentBranch#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

} // EquivalentBranch
