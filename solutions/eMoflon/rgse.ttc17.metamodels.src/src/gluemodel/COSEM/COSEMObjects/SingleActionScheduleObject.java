/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Singleactionschedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Action Schedule Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getBillingPeriodEnd <em>Billing Period End</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getImage <em>Image</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getOutput <em>Output</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getPush <em>Push</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getSingleActionScheduleObject()
 * @model
 * @generated
 */
public interface SingleActionScheduleObject extends Singleactionschedule {
	/**
	 * Returns the value of the '<em><b>Disconnect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disconnect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disconnect</em>' reference.
	 * @see #setDisconnect(DisconnectControlSchedule)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getSingleActionScheduleObject_Disconnect()
	 * @model
	 * @generated
	 */
	DisconnectControlSchedule getDisconnect();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getDisconnect <em>Disconnect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disconnect</em>' reference.
	 * @see #getDisconnect()
	 * @generated
	 */
	void setDisconnect(DisconnectControlSchedule value);

	/**
	 * Returns the value of the '<em><b>Billing Period End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Period End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Period End</em>' reference.
	 * @see #setBillingPeriodEnd(EndOfBillingPeriodSchedule)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getSingleActionScheduleObject_BillingPeriodEnd()
	 * @model
	 * @generated
	 */
	EndOfBillingPeriodSchedule getBillingPeriodEnd();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getBillingPeriodEnd <em>Billing Period End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Period End</em>' reference.
	 * @see #getBillingPeriodEnd()
	 * @generated
	 */
	void setBillingPeriodEnd(EndOfBillingPeriodSchedule value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(ImageActivationSchedule)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getSingleActionScheduleObject_Image()
	 * @model
	 * @generated
	 */
	ImageActivationSchedule getImage();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(ImageActivationSchedule value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(OutputControlSchedule)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getSingleActionScheduleObject_Output()
	 * @model
	 * @generated
	 */
	OutputControlSchedule getOutput();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(OutputControlSchedule value);

	/**
	 * Returns the value of the '<em><b>Push</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Push</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push</em>' reference.
	 * @see #setPush(PushSchedule)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getSingleActionScheduleObject_Push()
	 * @model
	 * @generated
	 */
	PushSchedule getPush();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getPush <em>Push</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push</em>' reference.
	 * @see #getPush()
	 * @generated
	 */
	void setPush(PushSchedule value);

} // SingleActionScheduleObject
