/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.Dynamic#getTieLines <em>Tie Lines</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getDynamic()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A dynamic energy transaction has more complex relationships than a simple block type. It behaves like a pseudo tie line.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A dynamic energy transaction has more complex relationships than a simple block type. It behaves like a pseudo tie line.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A dynamic energy transaction has more complex relationships than a simple block type. It behaves like a pseudo tie line.' Profile\040documentation='A dynamic energy transaction has more complex relationships than a simple block type. It behaves like a pseudo tie line.'"
 * @generated
 */
public interface Dynamic extends EnergyTransaction {
	/**
	 * Returns the value of the '<em><b>Tie Lines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.TieLine}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getDynamicEnergyTransaction <em>Dynamic Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Lines</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getDynamic_TieLines()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getDynamicEnergyTransaction
	 * @model opposite="DynamicEnergyTransaction"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A dynamic energy transaction can act as a pseudo tie line.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A dynamic energy transaction can act as a pseudo tie line.'"
	 * @generated
	 */
	EList<TieLine> getTieLines();

} // Dynamic
