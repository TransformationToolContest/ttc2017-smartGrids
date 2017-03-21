/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Informative.EnergyScheduling.Profile;

import CIM.IEC61970.LoadModel.Season;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity Benefit Margin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getSeason <em>Season</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getFlowgate <em>Flowgate</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getCapacityBenefitMargin()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Capacity Benefit Margin (CBM) is defined as that amount of transmission transfer capability reserved by load serving entities to ensure access to generation from interconnected systems to meet generation reliability requirements. Reservation fo CBM by a load serving entity allows that entity to reduce its installed generating capacity below that which may otherwise have been necessary without interconnections to meet its generation reliability requirements.\n\nCBM is modeled as a profile with values in different time periods which are represented by the profile data.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Capacity Benefit Margin (CBM) is defined as that amount of transmission transfer capability reserved by load serving entities to ensure access to generation from interconnected systems to meet generation reliability requirements. Reservation fo CBM by a load serving entity allows that entity to reduce its installed generating capacity below that which may otherwise have been necessary without interconnections to meet its generation reliability requirements.\n\nCBM is modeled as a profile with values in different time periods which are represented by the profile data.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Capacity Benefit Margin (CBM) is defined as that amount of transmission transfer capability reserved by load serving entities to ensure access to generation from interconnected systems to meet generation reliability requirements. Reservation fo CBM by a load serving entity allows that entity to reduce its installed generating capacity below that which may otherwise have been necessary without interconnections to meet its generation reliability requirements.\n\nCBM is modeled as a profile with values in different time periods which are represented by the profile data.' Profile\040documentation='Capacity Benefit Margin (CBM) is defined as that amount of transmission transfer capability reserved by load serving entities to ensure access to generation from interconnected systems to meet generation reliability requirements. Reservation fo CBM by a load serving entity allows that entity to reduce its installed generating capacity below that which may otherwise have been necessary without interconnections to meet its generation reliability requirements.\n\nCBM is modeled as a profile with values in different time periods which are represented by the profile data.'"
 * @generated
 */
public interface CapacityBenefitMargin extends Profile {
	/**
	 * Returns the value of the '<em><b>Season</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.LoadModel.Season#getCapacityBenefitMargin <em>Capacity Benefit Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' reference.
	 * @see #setSeason(Season)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getCapacityBenefitMargin_Season()
	 * @see CIM.IEC61970.LoadModel.Season#getCapacityBenefitMargin
	 * @model opposite="CapacityBenefitMargin"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Capacity Benefit Margin may differ based on the season'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Capacity Benefit Margin may differ based on the season'"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getSeason <em>Season</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Flowgate</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.Flowgate}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getCapacityBenefitMargin <em>Capacity Benefit Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowgate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowgate</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getCapacityBenefitMargin_Flowgate()
	 * @see CIM.IEC61970.Informative.MarketOperations.Flowgate#getCapacityBenefitMargin
	 * @model opposite="CapacityBenefitMargin"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A flowgate may have 0 to n CBM profile\nEach season may be a CBM which contains a set of profile data'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A flowgate may have 0 to n CBM profile\nEach season may be a CBM which contains a set of profile data'"
	 * @generated
	 */
	EList<Flowgate> getFlowgate();

} // CapacityBenefitMargin
