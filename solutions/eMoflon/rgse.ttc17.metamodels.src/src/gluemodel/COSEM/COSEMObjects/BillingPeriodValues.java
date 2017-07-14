/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billing Period Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getBillingPeriodCounter <em>Billing Period Counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getNumberAvailableBillingPeriods <em>Number Available Billing Periods</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getTimestampRecentBillingPeriod <em>Timestamp Recent Billing Period</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBillingPeriodValues()
 * @model
 * @generated
 */
public interface BillingPeriodValues extends Data {
	/**
	 * Returns the value of the '<em><b>Billing Period Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Period Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Period Counter</em>' attribute.
	 * @see #setBillingPeriodCounter(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBillingPeriodValues_BillingPeriodCounter()
	 * @model
	 * @generated
	 */
	int getBillingPeriodCounter();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getBillingPeriodCounter <em>Billing Period Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Period Counter</em>' attribute.
	 * @see #getBillingPeriodCounter()
	 * @generated
	 */
	void setBillingPeriodCounter(int value);

	/**
	 * Returns the value of the '<em><b>Number Available Billing Periods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Available Billing Periods</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Available Billing Periods</em>' attribute.
	 * @see #setNumberAvailableBillingPeriods(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBillingPeriodValues_NumberAvailableBillingPeriods()
	 * @model
	 * @generated
	 */
	int getNumberAvailableBillingPeriods();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getNumberAvailableBillingPeriods <em>Number Available Billing Periods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Available Billing Periods</em>' attribute.
	 * @see #getNumberAvailableBillingPeriods()
	 * @generated
	 */
	void setNumberAvailableBillingPeriods(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp Recent Billing Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp Recent Billing Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp Recent Billing Period</em>' attribute.
	 * @see #setTimestampRecentBillingPeriod(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBillingPeriodValues_TimestampRecentBillingPeriod()
	 * @model
	 * @generated
	 */
	String getTimestampRecentBillingPeriod();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getTimestampRecentBillingPeriod <em>Timestamp Recent Billing Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp Recent Billing Period</em>' attribute.
	 * @see #getTimestampRecentBillingPeriod()
	 * @generated
	 */
	void setTimestampRecentBillingPeriod(String value);

} // BillingPeriodValues
