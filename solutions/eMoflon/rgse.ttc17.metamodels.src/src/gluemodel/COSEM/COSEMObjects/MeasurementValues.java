/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getBilling_period_average <em>Billing period average</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCumulative_minimum <em>Cumulative minimum</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCumulative_maximum <em>Cumulative maximum</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCurrent_average <em>Current average</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getLast_average <em>Last average</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getInstantaneous_value <em>Instantaneous value</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_integral <em>Time integral</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_threshold <em>Under limit threshold</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_occurrence_counter <em>Under limit occurrence counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_duration <em>Under limit duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_magnitude <em>Under limit magnitude</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_threshold <em>Over limit threshold</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_occurrence_counter <em>Over limit occurrence counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_duration <em>Over limit duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_magnitude <em>Over limit magnitude</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_threshold <em>Missing threshold</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_occurrence_counter <em>Missing occurrence counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_duration <em>Missing duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_magnitude <em>Missing magnitude</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_under_limit <em>Time threshold for under limit</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_over_limit <em>Time threshold for over limit</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_missing_magnitude <em>Time threshold for missing magnitude</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getContracted_value <em>Contracted value</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMinimum_for_recording_interval <em>Minimum for recording interval</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMaximum_for_recording_interval <em>Maximum for recording interval</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTest_average <em>Test average</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCalculations <em>Calculations</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues()
 * @model
 * @generated
 */
public interface MeasurementValues extends Data {
	/**
	 * Returns the value of the '<em><b>Billing period average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing period average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing period average</em>' attribute.
	 * @see #setBilling_period_average(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Billing_period_average()
	 * @model
	 * @generated
	 */
	double getBilling_period_average();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getBilling_period_average <em>Billing period average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing period average</em>' attribute.
	 * @see #getBilling_period_average()
	 * @generated
	 */
	void setBilling_period_average(double value);

	/**
	 * Returns the value of the '<em><b>Cumulative minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cumulative minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cumulative minimum</em>' attribute.
	 * @see #setCumulative_minimum(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Cumulative_minimum()
	 * @model
	 * @generated
	 */
	double getCumulative_minimum();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCumulative_minimum <em>Cumulative minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cumulative minimum</em>' attribute.
	 * @see #getCumulative_minimum()
	 * @generated
	 */
	void setCumulative_minimum(double value);

	/**
	 * Returns the value of the '<em><b>Cumulative maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cumulative maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cumulative maximum</em>' attribute.
	 * @see #setCumulative_maximum(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Cumulative_maximum()
	 * @model
	 * @generated
	 */
	double getCumulative_maximum();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCumulative_maximum <em>Cumulative maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cumulative maximum</em>' attribute.
	 * @see #getCumulative_maximum()
	 * @generated
	 */
	void setCumulative_maximum(double value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Minimum()
	 * @model
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Returns the value of the '<em><b>Current average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current average</em>' attribute.
	 * @see #setCurrent_average(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Current_average()
	 * @model
	 * @generated
	 */
	double getCurrent_average();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCurrent_average <em>Current average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current average</em>' attribute.
	 * @see #getCurrent_average()
	 * @generated
	 */
	void setCurrent_average(double value);

	/**
	 * Returns the value of the '<em><b>Last average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last average</em>' attribute.
	 * @see #setLast_average(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Last_average()
	 * @model
	 * @generated
	 */
	double getLast_average();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getLast_average <em>Last average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last average</em>' attribute.
	 * @see #getLast_average()
	 * @generated
	 */
	void setLast_average(double value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Maximum()
	 * @model
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

	/**
	 * Returns the value of the '<em><b>Instantaneous value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantaneous value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantaneous value</em>' attribute.
	 * @see #setInstantaneous_value(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Instantaneous_value()
	 * @model
	 * @generated
	 */
	double getInstantaneous_value();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getInstantaneous_value <em>Instantaneous value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantaneous value</em>' attribute.
	 * @see #getInstantaneous_value()
	 * @generated
	 */
	void setInstantaneous_value(double value);

	/**
	 * Returns the value of the '<em><b>Time integral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time integral</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time integral</em>' attribute.
	 * @see #setTime_integral(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Time_integral()
	 * @model
	 * @generated
	 */
	double getTime_integral();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_integral <em>Time integral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time integral</em>' attribute.
	 * @see #getTime_integral()
	 * @generated
	 */
	void setTime_integral(double value);

	/**
	 * Returns the value of the '<em><b>Under limit threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under limit threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under limit threshold</em>' attribute.
	 * @see #setUnder_limit_threshold(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Under_limit_threshold()
	 * @model
	 * @generated
	 */
	double getUnder_limit_threshold();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_threshold <em>Under limit threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Under limit threshold</em>' attribute.
	 * @see #getUnder_limit_threshold()
	 * @generated
	 */
	void setUnder_limit_threshold(double value);

	/**
	 * Returns the value of the '<em><b>Under limit occurrence counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under limit occurrence counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under limit occurrence counter</em>' attribute.
	 * @see #setUnder_limit_occurrence_counter(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Under_limit_occurrence_counter()
	 * @model
	 * @generated
	 */
	double getUnder_limit_occurrence_counter();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_occurrence_counter <em>Under limit occurrence counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Under limit occurrence counter</em>' attribute.
	 * @see #getUnder_limit_occurrence_counter()
	 * @generated
	 */
	void setUnder_limit_occurrence_counter(double value);

	/**
	 * Returns the value of the '<em><b>Under limit duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under limit duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under limit duration</em>' attribute.
	 * @see #setUnder_limit_duration(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Under_limit_duration()
	 * @model
	 * @generated
	 */
	double getUnder_limit_duration();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_duration <em>Under limit duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Under limit duration</em>' attribute.
	 * @see #getUnder_limit_duration()
	 * @generated
	 */
	void setUnder_limit_duration(double value);

	/**
	 * Returns the value of the '<em><b>Under limit magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under limit magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under limit magnitude</em>' attribute.
	 * @see #setUnder_limit_magnitude(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Under_limit_magnitude()
	 * @model
	 * @generated
	 */
	double getUnder_limit_magnitude();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_magnitude <em>Under limit magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Under limit magnitude</em>' attribute.
	 * @see #getUnder_limit_magnitude()
	 * @generated
	 */
	void setUnder_limit_magnitude(double value);

	/**
	 * Returns the value of the '<em><b>Over limit threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Over limit threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over limit threshold</em>' attribute.
	 * @see #setOver_limit_threshold(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Over_limit_threshold()
	 * @model
	 * @generated
	 */
	double getOver_limit_threshold();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_threshold <em>Over limit threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over limit threshold</em>' attribute.
	 * @see #getOver_limit_threshold()
	 * @generated
	 */
	void setOver_limit_threshold(double value);

	/**
	 * Returns the value of the '<em><b>Over limit occurrence counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Over limit occurrence counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over limit occurrence counter</em>' attribute.
	 * @see #setOver_limit_occurrence_counter(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Over_limit_occurrence_counter()
	 * @model
	 * @generated
	 */
	double getOver_limit_occurrence_counter();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_occurrence_counter <em>Over limit occurrence counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over limit occurrence counter</em>' attribute.
	 * @see #getOver_limit_occurrence_counter()
	 * @generated
	 */
	void setOver_limit_occurrence_counter(double value);

	/**
	 * Returns the value of the '<em><b>Over limit duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Over limit duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over limit duration</em>' attribute.
	 * @see #setOver_limit_duration(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Over_limit_duration()
	 * @model
	 * @generated
	 */
	double getOver_limit_duration();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_duration <em>Over limit duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over limit duration</em>' attribute.
	 * @see #getOver_limit_duration()
	 * @generated
	 */
	void setOver_limit_duration(double value);

	/**
	 * Returns the value of the '<em><b>Over limit magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Over limit magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over limit magnitude</em>' attribute.
	 * @see #setOver_limit_magnitude(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Over_limit_magnitude()
	 * @model
	 * @generated
	 */
	double getOver_limit_magnitude();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_magnitude <em>Over limit magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over limit magnitude</em>' attribute.
	 * @see #getOver_limit_magnitude()
	 * @generated
	 */
	void setOver_limit_magnitude(double value);

	/**
	 * Returns the value of the '<em><b>Missing threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing threshold</em>' attribute.
	 * @see #setMissing_threshold(boolean)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Missing_threshold()
	 * @model
	 * @generated
	 */
	boolean isMissing_threshold();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_threshold <em>Missing threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing threshold</em>' attribute.
	 * @see #isMissing_threshold()
	 * @generated
	 */
	void setMissing_threshold(boolean value);

	/**
	 * Returns the value of the '<em><b>Missing occurrence counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing occurrence counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing occurrence counter</em>' attribute.
	 * @see #setMissing_occurrence_counter(boolean)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Missing_occurrence_counter()
	 * @model
	 * @generated
	 */
	boolean isMissing_occurrence_counter();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_occurrence_counter <em>Missing occurrence counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing occurrence counter</em>' attribute.
	 * @see #isMissing_occurrence_counter()
	 * @generated
	 */
	void setMissing_occurrence_counter(boolean value);

	/**
	 * Returns the value of the '<em><b>Missing duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing duration</em>' attribute.
	 * @see #setMissing_duration(boolean)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Missing_duration()
	 * @model
	 * @generated
	 */
	boolean isMissing_duration();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_duration <em>Missing duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing duration</em>' attribute.
	 * @see #isMissing_duration()
	 * @generated
	 */
	void setMissing_duration(boolean value);

	/**
	 * Returns the value of the '<em><b>Missing magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing magnitude</em>' attribute.
	 * @see #setMissing_magnitude(boolean)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Missing_magnitude()
	 * @model
	 * @generated
	 */
	boolean isMissing_magnitude();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_magnitude <em>Missing magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing magnitude</em>' attribute.
	 * @see #isMissing_magnitude()
	 * @generated
	 */
	void setMissing_magnitude(boolean value);

	/**
	 * Returns the value of the '<em><b>Time threshold for under limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time threshold for under limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time threshold for under limit</em>' attribute.
	 * @see #setTime_threshold_for_under_limit(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Time_threshold_for_under_limit()
	 * @model
	 * @generated
	 */
	String getTime_threshold_for_under_limit();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_under_limit <em>Time threshold for under limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time threshold for under limit</em>' attribute.
	 * @see #getTime_threshold_for_under_limit()
	 * @generated
	 */
	void setTime_threshold_for_under_limit(String value);

	/**
	 * Returns the value of the '<em><b>Time threshold for over limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time threshold for over limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time threshold for over limit</em>' attribute.
	 * @see #setTime_threshold_for_over_limit(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Time_threshold_for_over_limit()
	 * @model
	 * @generated
	 */
	String getTime_threshold_for_over_limit();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_over_limit <em>Time threshold for over limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time threshold for over limit</em>' attribute.
	 * @see #getTime_threshold_for_over_limit()
	 * @generated
	 */
	void setTime_threshold_for_over_limit(String value);

	/**
	 * Returns the value of the '<em><b>Time threshold for missing magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time threshold for missing magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time threshold for missing magnitude</em>' attribute.
	 * @see #setTime_threshold_for_missing_magnitude(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Time_threshold_for_missing_magnitude()
	 * @model
	 * @generated
	 */
	String getTime_threshold_for_missing_magnitude();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_missing_magnitude <em>Time threshold for missing magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time threshold for missing magnitude</em>' attribute.
	 * @see #getTime_threshold_for_missing_magnitude()
	 * @generated
	 */
	void setTime_threshold_for_missing_magnitude(String value);

	/**
	 * Returns the value of the '<em><b>Contracted value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contracted value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contracted value</em>' attribute.
	 * @see #setContracted_value(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Contracted_value()
	 * @model
	 * @generated
	 */
	double getContracted_value();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getContracted_value <em>Contracted value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contracted value</em>' attribute.
	 * @see #getContracted_value()
	 * @generated
	 */
	void setContracted_value(double value);

	/**
	 * Returns the value of the '<em><b>Minimum for recording interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum for recording interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum for recording interval</em>' attribute.
	 * @see #setMinimum_for_recording_interval(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Minimum_for_recording_interval()
	 * @model
	 * @generated
	 */
	double getMinimum_for_recording_interval();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMinimum_for_recording_interval <em>Minimum for recording interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum for recording interval</em>' attribute.
	 * @see #getMinimum_for_recording_interval()
	 * @generated
	 */
	void setMinimum_for_recording_interval(double value);

	/**
	 * Returns the value of the '<em><b>Maximum for recording interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum for recording interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum for recording interval</em>' attribute.
	 * @see #setMaximum_for_recording_interval(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Maximum_for_recording_interval()
	 * @model
	 * @generated
	 */
	double getMaximum_for_recording_interval();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMaximum_for_recording_interval <em>Maximum for recording interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum for recording interval</em>' attribute.
	 * @see #getMaximum_for_recording_interval()
	 * @generated
	 */
	void setMaximum_for_recording_interval(double value);

	/**
	 * Returns the value of the '<em><b>Test average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test average</em>' attribute.
	 * @see #setTest_average(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Test_average()
	 * @model
	 * @generated
	 */
	double getTest_average();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTest_average <em>Test average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test average</em>' attribute.
	 * @see #getTest_average()
	 * @generated
	 */
	void setTest_average(double value);

	/**
	 * Returns the value of the '<em><b>Calculations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculations</em>' reference.
	 * @see #setCalculations(ElectricityValues)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getMeasurementValues_Calculations()
	 * @model required="true"
	 * @generated
	 */
	ElectricityValues getCalculations();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCalculations <em>Calculations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculations</em>' reference.
	 * @see #getCalculations()
	 * @generated
	 */
	void setCalculations(ElectricityValues value);

} // MeasurementValues
