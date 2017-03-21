/**
 */
package CIM.IEC61968.Assets;

import CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acceptance Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Assets.AcceptanceTest#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.AcceptanceTest#isSuccess <em>Success</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.AcceptanceTest#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Assets.AssetsPackage#getAcceptanceTest()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Acceptance test for assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Acceptance test for assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Acceptance test for assets.' Profile\040documentation='Acceptance test for assets.'"
 * @generated
 */
public interface AcceptanceTest extends Element {
	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getAcceptanceTest_DateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time the asset was last tested using the \'type\' of test and yielding the current status in \'success\' attribute.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time the asset was last tested using the \'type\' of test and yielding the current status in \'success\' attribute.'"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.AcceptanceTest#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success</em>' attribute.
	 * @see #setSuccess(boolean)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getAcceptanceTest_Success()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if asset has passed acceptance test and may be placed in or is in service. It is set to false if asset is removed from service and is required to be tested again before being placed back in service, possibly in a new location. Since asset may go through multiple tests during its life cycle, the date of each acceptance test may be recorded in Asset.ActivityRecord.status.dateTime.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if asset has passed acceptance test and may be placed in or is in service. It is set to false if asset is removed from service and is required to be tested again before being placed back in service, possibly in a new location. Since asset may go through multiple tests during its life cycle, the date of each acceptance test may be recorded in Asset.ActivityRecord.status.dateTime.'"
	 * @generated
	 */
	boolean isSuccess();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.AcceptanceTest#isSuccess <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success</em>' attribute.
	 * @see #isSuccess()
	 * @generated
	 */
	void setSuccess(boolean value);

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
	 * @see CIM.IEC61968.Assets.AssetsPackage#getAcceptanceTest_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of test or group of tests that was conducted on \'dateTime\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of test or group of tests that was conducted on \'dateTime\'.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.AcceptanceTest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // AcceptanceTest
