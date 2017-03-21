/**
 */
package CIM.IEC61968.Metering;

import CIM.IEC61968.Common.DateTimeInterval;

import CIM.IEC61968.Customers.CustomerAgreement;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory <em>Dr Program Mandatory</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceControl#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceAsset <em>End Device Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceControl#getType <em>Type</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceControl#getPriceSignal <em>Price Signal</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup <em>End Device Group</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram <em>Demand Response Program</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Instructs an EndDeviceAsset (or EndDeviceGroup) to perform a specified action.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Instructs an EndDeviceAsset (or EndDeviceGroup) to perform a specified action.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Instructs an EndDeviceAsset (or EndDeviceGroup) to perform a specified action.' Profile\040documentation='Instructs an EndDeviceAsset (or EndDeviceGroup) to perform a specified action.'"
 * @generated
 */
public interface EndDeviceControl extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Scheduled Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Interval</em>' reference.
	 * @see #setScheduledInterval(DateTimeInterval)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl_ScheduledInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if control has scheduled duration) Date and time interval the control has been scheduled to execute within.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if control has scheduled duration) Date and time interval the control has been scheduled to execute within.'"
	 * @generated
	 */
	DateTimeInterval getScheduledInterval();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Interval</em>' reference.
	 * @see #getScheduledInterval()
	 * @generated
	 */
	void setScheduledInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Dr Program Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dr Program Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dr Program Mandatory</em>' attribute.
	 * @see #setDrProgramMandatory(boolean)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl_DrProgramMandatory()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Whether a demand response program request is mandatory. Note: Attribute is not defined on DemandResponseProgram as it is not its inherent property (it serves to control it).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Whether a demand response program request is mandatory. Note: Attribute is not defined on DemandResponseProgram as it is not its inherent property (it serves to control it).'"
	 * @generated
	 */
	boolean isDrProgramMandatory();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory <em>Dr Program Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dr Program Mandatory</em>' attribute.
	 * @see #isDrProgramMandatory()
	 * @generated
	 */
	void setDrProgramMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Dr Program Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dr Program Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dr Program Level</em>' attribute.
	 * @see #setDrProgramLevel(int)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl_DrProgramLevel()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Level of a demand response program request, where 0=emergency. Note: Attribute is not defined on DemandResponseProgram as it is not its inherent property (it serves to control it).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Level of a demand response program request, where 0=emergency. Note: Attribute is not defined on DemandResponseProgram as it is not its inherent property (it serves to control it).'"
	 * @generated
	 */
	int getDrProgramLevel();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dr Program Level</em>' attribute.
	 * @see #getDrProgramLevel()
	 * @generated
	 */
	void setDrProgramLevel(int value);

	/**
	 * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.CustomerAgreement#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreement</em>' reference.
	 * @see #setCustomerAgreement(CustomerAgreement)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl_CustomerAgreement()
	 * @see CIM.IEC61968.Customers.CustomerAgreement#getEndDeviceControls
	 * @model opposite="EndDeviceControls"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Could be deprecated in the future.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Could be deprecated in the future.'"
	 * @generated
	 */
	CustomerAgreement getCustomerAgreement();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceControl#getCustomerAgreement <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Agreement</em>' reference.
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	void setCustomerAgreement(CustomerAgreement value);

	/**
	 * Returns the value of the '<em><b>End Device Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Asset</em>' reference.
	 * @see #setEndDeviceAsset(EndDeviceAsset)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl_EndDeviceAsset()
	 * @see CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceControls
	 * @model opposite="EndDeviceControls"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='End device asset receiving commands from this end device control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='End device asset receiving commands from this end device control.'"
	 * @generated
	 */
	EndDeviceAsset getEndDeviceAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceAsset <em>End Device Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Asset</em>' reference.
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	void setEndDeviceAsset(EndDeviceAsset value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of control.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Price Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Signal</em>' attribute.
	 * @see #setPriceSignal(float)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl_PriceSignal()
	 * @model dataType="CIM.IEC61970.Domain.FloatQuantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Price signal used as parameter for this end device control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Price signal used as parameter for this end device control.'"
	 * @generated
	 */
	float getPriceSignal();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceControl#getPriceSignal <em>Price Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Signal</em>' attribute.
	 * @see #getPriceSignal()
	 * @generated
	 */
	void setPriceSignal(float value);

	/**
	 * Returns the value of the '<em><b>End Device Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Group</em>' reference.
	 * @see #setEndDeviceGroup(EndDeviceGroup)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl_EndDeviceGroup()
	 * @see CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls
	 * @model opposite="EndDeviceControls"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='End device group receiving commands from this end device control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='End device group receiving commands from this end device control.'"
	 * @generated
	 */
	EndDeviceGroup getEndDeviceGroup();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup <em>End Device Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Group</em>' reference.
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	void setEndDeviceGroup(EndDeviceGroup value);

	/**
	 * Returns the value of the '<em><b>Demand Response Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Response Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Response Program</em>' reference.
	 * @see #setDemandResponseProgram(DemandResponseProgram)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceControl_DemandResponseProgram()
	 * @see CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls
	 * @model opposite="EndDeviceControls"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Demand response program for this end device control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Demand response program for this end device control.'"
	 * @generated
	 */
	DemandResponseProgram getDemandResponseProgram();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Response Program</em>' reference.
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	void setDemandResponseProgram(DemandResponseProgram value);

} // EndDeviceControl
