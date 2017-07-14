/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon;

import gluemodel.CIM.IEC61968.Common.Organisation;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRole#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRole#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRole#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getMarketRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Role an organisation plays in a market. Examples include one or more of values defined in MarketRoleKind.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Role an organisation plays in a market. Examples include one or more of values defined in MarketRoleKind.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Role an organisation plays in a market. Examples include one or more of values defined in MarketRoleKind.' Profile\040documentation='Role an organisation plays in a market. Examples include one or more of values defined in MarketRoleKind.'"
 * @generated
 */
public interface MarketRole extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Organisation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Organisation#getMarketRoles <em>Market Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getMarketRole_Organisations()
	 * @see gluemodel.CIM.IEC61968.Common.Organisation#getMarketRoles
	 * @model opposite="MarketRoles"
	 * @generated
	 */
	EList<Organisation> getOrganisations();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getMarketRole_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRole#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRoleKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRoleKind
	 * @see #setKind(MarketRoleKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getMarketRole_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of role an organisation plays in a market.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of role an organisation plays in a market.'"
	 * @generated
	 */
	MarketRoleKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRole#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.MarketRoleKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MarketRoleKind value);

} // MarketRole
