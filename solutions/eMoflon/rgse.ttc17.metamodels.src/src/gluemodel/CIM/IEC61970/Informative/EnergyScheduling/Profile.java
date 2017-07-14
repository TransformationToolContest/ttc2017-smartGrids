/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.Profile#getProfileDatas <em>Profile Datas</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getProfile()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A profile is a simpler curve type.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A profile is a simpler curve type.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A profile is a simpler curve type.' Profile\040documentation='A profile is a simpler curve type.'"
 * @generated
 */
public interface Profile extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Profile Datas</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Datas</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getProfile_ProfileDatas()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getProfile
	 * @model opposite="Profile"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A profile has profile data associated with it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A profile has profile data associated with it.'"
	 * @generated
	 */
	EList<ProfileData> getProfileDatas();

} // Profile
