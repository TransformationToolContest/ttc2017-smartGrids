/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import gluemodel.CIM.IEC61970.LoadModel.Season;

import gluemodel.CIM.IEC61970.Meas.Limit;
import gluemodel.CIM.IEC61970.Meas.Measurement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Violation Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getSeason <em>Season</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getFlowgate <em>Flowgate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#isEnforced <em>Enforced</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getViolationLimit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of limit that indicates if it is enforced and, through association, the organisation responsible for setting the limit.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A type of limit that indicates if it is enforced and, through association, the organisation responsible for setting the limit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of limit that indicates if it is enforced and, through association, the organisation responsible for setting the limit.' Profile\040documentation='A type of limit that indicates if it is enforced and, through association, the organisation responsible for setting the limit.'"
 * @generated
 */
public interface ViolationLimit extends Limit {
	/**
	 * Returns the value of the '<em><b>Season</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.Season#getViolationLimits <em>Violation Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' reference.
	 * @see #setSeason(Season)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getViolationLimit_Season()
	 * @see gluemodel.CIM.IEC61970.LoadModel.Season#getViolationLimits
	 * @model opposite="ViolationLimits"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Limits may differ based on the season'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limits may differ based on the season'"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getSeason <em>Season</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Measurement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getViolationLimits <em>Violation Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' reference.
	 * @see #setMeasurement(Measurement)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getViolationLimit_Measurement()
	 * @see gluemodel.CIM.IEC61970.Meas.Measurement#getViolationLimits
	 * @model opposite="ViolationLimits"
	 * @generated
	 */
	Measurement getMeasurement();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getMeasurement <em>Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement</em>' reference.
	 * @see #getMeasurement()
	 * @generated
	 */
	void setMeasurement(Measurement value);

	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getViolationLimits <em>Violation Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getViolationLimit_Organisations()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getViolationLimits
	 * @model opposite="ViolationLimits"
	 * @generated
	 */
	EList<ErpOrganisation> getOrganisations();

	/**
	 * Returns the value of the '<em><b>Flowgate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getViolationLimits <em>Violation Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowgate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowgate</em>' reference.
	 * @see #setFlowgate(Flowgate)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getViolationLimit_Flowgate()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getViolationLimits
	 * @model opposite="ViolationLimits"
	 * @generated
	 */
	Flowgate getFlowgate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getFlowgate <em>Flowgate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowgate</em>' reference.
	 * @see #getFlowgate()
	 * @generated
	 */
	void setFlowgate(Flowgate value);

	/**
	 * Returns the value of the '<em><b>Enforced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enforced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enforced</em>' attribute.
	 * @see #setEnforced(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getViolationLimit_Enforced()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if limit is enforced.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if limit is enforced.'"
	 * @generated
	 */
	boolean isEnforced();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#isEnforced <em>Enforced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enforced</em>' attribute.
	 * @see #isEnforced()
	 * @generated
	 */
	void setEnforced(boolean value);

} // ViolationLimit
