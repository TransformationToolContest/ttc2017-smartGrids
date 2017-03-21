/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Case Clearing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getAncillaryServiceClearing <em>Ancillary Service Clearing</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getCaseType <em>Case Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getModifiedDate <em>Modified Date</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketCaseClearing()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Market case clearing results are posted for a given settlement period.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Market case clearing results are posted for a given settlement period.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Market case clearing results are posted for a given settlement period.' Profile\040documentation='Market case clearing results are posted for a given settlement period.'"
 * @generated
 */
public interface MarketCaseClearing extends MarketFactors {
	/**
	 * Returns the value of the '<em><b>Ancillary Service Clearing</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMarketCaseClearing <em>Market Case Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancillary Service Clearing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancillary Service Clearing</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketCaseClearing_AncillaryServiceClearing()
	 * @see CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMarketCaseClearing
	 * @model opposite="MarketCaseClearing"
	 * @generated
	 */
	EList<AncillaryServiceClearing> getAncillaryServiceClearing();

	/**
	 * Returns the value of the '<em><b>Posted Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Date</em>' attribute.
	 * @see #setPostedDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketCaseClearing_PostedDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bid clearing results posted time and date.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bid clearing results posted time and date.'"
	 * @generated
	 */
	Date getPostedDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getPostedDate <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date</em>' attribute.
	 * @see #getPostedDate()
	 * @generated
	 */
	void setPostedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Case Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Type</em>' attribute.
	 * @see #setCaseType(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketCaseClearing_CaseType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Settlement period:\n \'DA - Bid-in\'\n \'DA - Reliability\'\n \'DA - Amp1\'\n \'DA - Amp2\'\n \'RT - Ex-Ante\'\n \'RT - Ex-Post\'\n \'RT - Amp1\'\n \'RT - Amp2\''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Settlement period:\n \'DA - Bid-in\'\n \'DA - Reliability\'\n \'DA - Amp1\'\n \'DA - Amp2\'\n \'RT - Ex-Ante\'\n \'RT - Ex-Post\'\n \'RT - Amp1\'\n \'RT - Amp2\''"
	 * @generated
	 */
	String getCaseType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getCaseType <em>Case Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Type</em>' attribute.
	 * @see #getCaseType()
	 * @generated
	 */
	void setCaseType(String value);

	/**
	 * Returns the value of the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Date</em>' attribute.
	 * @see #setModifiedDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketCaseClearing_ModifiedDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Last time and date clearing results were manually modified.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Last time and date clearing results were manually modified.'"
	 * @generated
	 */
	Date getModifiedDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getModifiedDate <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Date</em>' attribute.
	 * @see #getModifiedDate()
	 * @generated
	 */
	void setModifiedDate(Date value);

} // MarketCaseClearing
