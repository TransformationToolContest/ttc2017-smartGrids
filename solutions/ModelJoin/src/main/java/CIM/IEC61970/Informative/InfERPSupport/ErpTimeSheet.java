/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Time Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpTimeSheet#getErpTimeEntries <em>Erp Time Entries</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeSheet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time sheet for employees and contractors. Note that ErpTimeSheet inherits the relationship to ErpPerson from Document.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Time sheet for employees and contractors. Note that ErpTimeSheet inherits the relationship to ErpPerson from Document.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time sheet for employees and contractors. Note that ErpTimeSheet inherits the relationship to ErpPerson from Document.' Profile\040documentation='Time sheet for employees and contractors. Note that ErpTimeSheet inherits the relationship to ErpPerson from Document.'"
 * @generated
 */
public interface ErpTimeSheet extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Time Entries</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet <em>Erp Time Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Time Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Time Entries</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeSheet_ErpTimeEntries()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet
	 * @model opposite="ErpTimeSheet"
	 * @generated
	 */
	EList<ErpTimeEntry> getErpTimeEntries();

} // ErpTimeSheet
