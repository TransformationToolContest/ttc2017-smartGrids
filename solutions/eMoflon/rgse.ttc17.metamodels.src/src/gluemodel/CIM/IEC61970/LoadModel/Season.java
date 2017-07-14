/**
 */
package gluemodel.CIM.IEC61970.LoadModel;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.Season#getViolationLimits <em>Violation Limits</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.Season#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.Season#getName <em>Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.Season#getCapacityBenefitMargin <em>Capacity Benefit Margin</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.Season#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSeason()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A specified time period of the year, e.g., Spring, Summer, Fall, Winter'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A specified time period of the year, e.g., Spring, Summer, Fall, Winter'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A specified time period of the year, e.g., Spring, Summer, Fall, Winter' Profile\040documentation='A specified time period of the year, e.g., Spring, Summer, Fall, Winter'"
 * @generated
 */
public interface Season extends Element {
	/**
	 * Returns the value of the '<em><b>Violation Limits</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Violation Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violation Limits</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSeason_ViolationLimits()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getSeason
	 * @model opposite="Season"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Limits may differ based on the season'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limits may differ based on the season'"
	 * @generated
	 */
	EList<ViolationLimit> getViolationLimits();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSeason_StartDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date season starts'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date season starts'"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.Season#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season Day Type Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season Day Type Schedules</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSeason_SeasonDayTypeSchedules()
	 * @see gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason
	 * @model opposite="Season"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Schedules that use this Season.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Schedules that use this Season.'"
	 * @generated
	 */
	EList<SeasonDayTypeSchedule> getSeasonDayTypeSchedules();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.LoadModel.SeasonName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.LoadModel.SeasonName
	 * @see #setName(SeasonName)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSeason_Name()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of the Season'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of the Season'"
	 * @generated
	 */
	SeasonName getName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.Season#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.LoadModel.SeasonName
	 * @see #getName()
	 * @generated
	 */
	void setName(SeasonName value);

	/**
	 * Returns the value of the '<em><b>Capacity Benefit Margin</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Benefit Margin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Benefit Margin</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSeason_CapacityBenefitMargin()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getSeason
	 * @model opposite="Season"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Capacity Benefit Margin may differ based on the season'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Capacity Benefit Margin may differ based on the season'"
	 * @generated
	 */
	EList<CapacityBenefitMargin> getCapacityBenefitMargin();

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSeason_EndDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date season ends'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date season ends'"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.Season#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

} // Season
