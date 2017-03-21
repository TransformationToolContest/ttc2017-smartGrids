/**
 */
package CIM.IEC61970.Informative.Financial;

import CIM.IEC61968.Common.Agreement;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Sched Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.IntSchedAgreement#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.IntSchedAgreement#getDefaultIntegrationMethod <em>Default Integration Method</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getIntSchedAgreement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of agreement that provides the default method by which interchange schedules are to be integrated to obtain hourly energy schedules for accounting.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A type of agreement that provides the default method by which interchange schedules are to be integrated to obtain hourly energy schedules for accounting.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of agreement that provides the default method by which interchange schedules are to be integrated to obtain hourly energy schedules for accounting.' Profile\040documentation='A type of agreement that provides the default method by which interchange schedules are to be integrated to obtain hourly energy schedules for accounting.'"
 * @generated
 */
public interface IntSchedAgreement extends Agreement {
	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIntSchedAgreement <em>Int Sched Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getIntSchedAgreement_Organisations()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIntSchedAgreement
	 * @model opposite="IntSchedAgreement"
	 * @generated
	 */
	EList<ErpOrganisation> getOrganisations();

	/**
	 * Returns the value of the '<em><b>Default Integration Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Integration Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Integration Method</em>' attribute.
	 * @see #setDefaultIntegrationMethod(Object)
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getIntSchedAgreement_DefaultIntegrationMethod()
	 * @model dataType="CIM.EnumeratedType" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The default method by which interchange schedules are to be integrated to obtain hourly energy schedules for accounting. Method #1 is to integrate the instantaneous schedule between the hourly boundaries. Method #2 compensates for any up/down ramping that occurs across the hourly boundary (this is called block accounting).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The default method by which interchange schedules are to be integrated to obtain hourly energy schedules for accounting. Method #1 is to integrate the instantaneous schedule between the hourly boundaries. Method #2 compensates for any up/down ramping that occurs across the hourly boundary (this is called block accounting).'"
	 * @generated
	 */
	Object getDefaultIntegrationMethod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.Financial.IntSchedAgreement#getDefaultIntegrationMethod <em>Default Integration Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Integration Method</em>' attribute.
	 * @see #getDefaultIntegrationMethod()
	 * @generated
	 */
	void setDefaultIntegrationMethod(Object value);

} // IntSchedAgreement
