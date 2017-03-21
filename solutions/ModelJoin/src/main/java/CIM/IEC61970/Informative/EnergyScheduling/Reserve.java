/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.Reserve#getAreaReserveSpec <em>Area Reserve Spec</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getReserve()
 * @model
 * @generated
 */
public interface Reserve extends EnergyTransaction {
	/**
	 * Returns the value of the '<em><b>Area Reserve Spec</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getReserveEnergyTransaction <em>Reserve Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Reserve Spec</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Reserve Spec</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getReserve_AreaReserveSpec()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getReserveEnergyTransaction
	 * @model opposite="ReserveEnergyTransaction"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Reserve type of energy transaction can count towards an area reserve specification.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Reserve type of energy transaction can count towards an area reserve specification.'"
	 * @generated
	 */
	EList<AreaReserveSpec> getAreaReserveSpec();

} // Reserve
