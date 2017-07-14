/**
 */
package gluemodel.CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSR Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.PSRType#getPowerSystemResources <em>Power System Resources</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getPSRType()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Classifying instances of the same class, e.g. overhead and underground ACLineSegments. This classification mechanism is intended to provide flexibility outside the scope of this standard, i.e. provide customisation that is non standard.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Classifying instances of the same class, e.g. overhead and underground ACLineSegments. This classification mechanism is intended to provide flexibility outside the scope of this standard, i.e. provide customisation that is non standard.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Classifying instances of the same class, e.g. overhead and underground ACLineSegments. This classification mechanism is intended to provide flexibility outside the scope of this standard, i.e. provide customisation that is non standard.' Profile\040documentation='Classifying instances of the same class, e.g. overhead and underground ACLineSegments. This classification mechanism is intended to provide flexibility outside the scope of this standard, i.e. provide customisation that is non standard.'"
 * @generated
 */
public interface PSRType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPSRType <em>PSR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getPSRType_PowerSystemResources()
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPSRType
	 * @model opposite="PSRType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Power system resources classified with this PSRType.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Power system resources classified with this PSRType.'"
	 * @generated
	 */
	EList<PowerSystemResource> getPowerSystemResources();

} // PSRType
