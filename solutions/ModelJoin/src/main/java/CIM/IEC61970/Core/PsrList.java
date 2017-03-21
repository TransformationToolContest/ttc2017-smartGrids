/**
 */
package CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Psr List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.PsrList#getTypePSRList <em>Type PSR List</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.PsrList#getPowerSystemResources <em>Power System Resources</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getPsrList()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Arbitrary list of PowerSystemResources. Can be used for various purposes, including grouping for report generation.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Arbitrary list of PowerSystemResources. Can be used for various purposes, including grouping for report generation.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Arbitrary list of PowerSystemResources. Can be used for various purposes, including grouping for report generation.' Profile\040documentation='Arbitrary list of PowerSystemResources. Can be used for various purposes, including grouping for report generation.'"
 * @generated
 */
public interface PsrList extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Type PSR List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type PSR List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type PSR List</em>' attribute.
	 * @see #setTypePSRList(String)
	 * @see CIM.IEC61970.Core.CorePackage#getPsrList_TypePSRList()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of power system resources in this list.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of power system resources in this list.'"
	 * @generated
	 */
	String getTypePSRList();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.PsrList#getTypePSRList <em>Type PSR List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type PSR List</em>' attribute.
	 * @see #getTypePSRList()
	 * @generated
	 */
	void setTypePSRList(String value);

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PowerSystemResource#getPsrLists <em>Psr Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getPsrList_PowerSystemResources()
	 * @see CIM.IEC61970.Core.PowerSystemResource#getPsrLists
	 * @model opposite="PsrLists"
	 * @generated
	 */
	EList<PowerSystemResource> getPowerSystemResources();

} // PsrList
