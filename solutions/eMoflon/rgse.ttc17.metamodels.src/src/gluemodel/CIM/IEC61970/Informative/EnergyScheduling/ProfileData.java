/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling;

import gluemodel.CIM.Element;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getCapacityLevel <em>Capacity Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getProfile <em>Profile</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getStopDateTime <em>Stop Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getEnergyLevel <em>Energy Level</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getProfileData()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Data for profile.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Data for profile.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Data for profile.' Profile\040documentation='Data for profile.'"
 * @generated
 */
public interface ProfileData extends Element {
	/**
	 * Returns the value of the '<em><b>Capacity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Level</em>' attribute.
	 * @see #setCapacityLevel(float)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getProfileData_CapacityLevel()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Active power capacity level for the profile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Active power capacity level for the profile.'"
	 * @generated
	 */
	float getCapacityLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getCapacityLevel <em>Capacity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Level</em>' attribute.
	 * @see #getCapacityLevel()
	 * @generated
	 */
	void setCapacityLevel(float value);

	/**
	 * Returns the value of the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date Time</em>' attribute.
	 * @see #setStartDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getProfileData_StartDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Start date/time for this profile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Start date/time for this profile.'"
	 * @generated
	 */
	Date getStartDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getStartDateTime <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Time</em>' attribute.
	 * @see #getStartDateTime()
	 * @generated
	 */
	void setStartDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getProfileData_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sequence to provide item numbering for the profile. { greater than or equal to 1 }'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sequence to provide item numbering for the profile. { greater than or equal to 1 }'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.Profile}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.Profile#getProfileDatas <em>Profile Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getProfileData_Profile()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.Profile#getProfileDatas
	 * @model opposite="ProfileDatas"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A profile has profile data associated with it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A profile has profile data associated with it.'"
	 * @generated
	 */
	EList<Profile> getProfile();

	/**
	 * Returns the value of the '<em><b>Stop Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Date Time</em>' attribute.
	 * @see #setStopDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getProfileData_StopDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Stop date/time for this profile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Stop date/time for this profile.'"
	 * @generated
	 */
	Date getStopDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getStopDateTime <em>Stop Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Date Time</em>' attribute.
	 * @see #getStopDateTime()
	 * @generated
	 */
	void setStopDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Energy Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Level</em>' attribute.
	 * @see #setEnergyLevel(float)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getProfileData_EnergyLevel()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.RealEnergy" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Energy level for the profile'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Energy level for the profile'"
	 * @generated
	 */
	float getEnergyLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData#getEnergyLevel <em>Energy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Level</em>' attribute.
	 * @see #getEnergyLevel()
	 * @generated
	 */
	void setEnergyLevel(float value);

} // ProfileData
