/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demand Response Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getValidityInterval <em>Validity Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups <em>End Device Groups</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDemandResponseProgram()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Demand response program.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Demand response program.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Demand response program.' Profile\040documentation='Demand response program.'"
 * @generated
 */
public interface DemandResponseProgram extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDemandResponseProgram_CustomerAgreements()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram
	 * @model opposite="DemandResponseProgram"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All customer agreements with this demand response program.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All customer agreements with this demand response program.'"
	 * @generated
	 */
	EList<CustomerAgreement> getCustomerAgreements();

	/**
	 * Returns the value of the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Interval</em>' reference.
	 * @see #setValidityInterval(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDemandResponseProgram_ValidityInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval within which the program is valid.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval within which the program is valid.'"
	 * @generated
	 */
	DateTimeInterval getValidityInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getValidityInterval <em>Validity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Interval</em>' reference.
	 * @see #getValidityInterval()
	 * @generated
	 */
	void setValidityInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>End Device Groups</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.EndDeviceGroup}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Groups</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDemandResponseProgram_EndDeviceGroups()
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram
	 * @model opposite="DemandResponseProgram"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All groups of end devices with this demand response program.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All groups of end devices with this demand response program.'"
	 * @generated
	 */
	EList<EndDeviceGroup> getEndDeviceGroups();

	/**
	 * Returns the value of the '<em><b>End Device Controls</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Controls</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDemandResponseProgram_EndDeviceControls()
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram
	 * @model opposite="DemandResponseProgram"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device controls with this demand response program.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device controls with this demand response program.'"
	 * @generated
	 */
	EList<EndDeviceControl> getEndDeviceControls();

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
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDemandResponseProgram_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of demand response program; examples are CPP (critical-peak pricing), RTP (real-time pricing), DLC (direct load control), DBP (demand bidding program), BIP (base interruptible program). Note that possible types change a lot and it would be impossible to enumerate them all.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of demand response program; examples are CPP (critical-peak pricing), RTP (real-time pricing), DLC (direct load control), DBP (demand bidding program), BIP (base interruptible program). Note that possible types change a lot and it would be impossible to enumerate them all.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // DemandResponseProgram
