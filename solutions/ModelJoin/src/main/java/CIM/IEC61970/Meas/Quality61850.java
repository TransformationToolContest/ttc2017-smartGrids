/**
 */
package CIM.IEC61970.Meas;

import CIM.Element;

import CIM.IEC61970.SCADA.Source;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality61850</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isSuspect <em>Suspect</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isEstimatorReplaced <em>Estimator Replaced</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#getValidity <em>Validity</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isBadReference <em>Bad Reference</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isOldData <em>Old Data</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isFailure <em>Failure</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isOverFlow <em>Over Flow</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#getSource <em>Source</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isOperatorBlocked <em>Operator Blocked</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isTest <em>Test</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isOscillatory <em>Oscillatory</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Quality61850#isOutOfRange <em>Out Of Range</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quality flags in this class are as defined in IEC 61850, except for estimatorReplaced, which has been included in this class for convenience.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Quality flags in this class are as defined in IEC 61850, except for estimatorReplaced, which has been included in this class for convenience.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quality flags in this class are as defined in IEC 61850, except for estimatorReplaced, which has been included in this class for convenience.' Profile\040documentation='Quality flags in this class are as defined in IEC 61850, except for estimatorReplaced, which has been included in this class for convenience.'"
 * @generated
 */
public interface Quality61850 extends Element {
	/**
	 * Returns the value of the '<em><b>Suspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspect</em>' attribute.
	 * @see #setSuspect(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_Suspect()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A correlation function has detected that the value is not consitent with other values. Typically set by a network State Estimator.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A correlation function has detected that the value is not consitent with other values. Typically set by a network State Estimator.'"
	 * @generated
	 */
	boolean isSuspect();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isSuspect <em>Suspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspect</em>' attribute.
	 * @see #isSuspect()
	 * @generated
	 */
	void setSuspect(boolean value);

	/**
	 * Returns the value of the '<em><b>Estimator Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimator Replaced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimator Replaced</em>' attribute.
	 * @see #setEstimatorReplaced(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_EstimatorReplaced()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value has been replaced by State Estimator. estimatorReplaced is not an IEC61850 quality bit but has been put in this class for convenience.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value has been replaced by State Estimator. estimatorReplaced is not an IEC61850 quality bit but has been put in this class for convenience.'"
	 * @generated
	 */
	boolean isEstimatorReplaced();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isEstimatorReplaced <em>Estimator Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimator Replaced</em>' attribute.
	 * @see #isEstimatorReplaced()
	 * @generated
	 */
	void setEstimatorReplaced(boolean value);

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Meas.Validity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see CIM.IEC61970.Meas.Validity
	 * @see #setValidity(Validity)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_Validity()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Validity of the measurement value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Validity of the measurement value.'"
	 * @generated
	 */
	Validity getValidity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see CIM.IEC61970.Meas.Validity
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(Validity value);

	/**
	 * Returns the value of the '<em><b>Bad Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bad Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bad Reference</em>' attribute.
	 * @see #setBadReference(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_BadReference()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement value may be incorrect due to a reference being out of calibration.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement value may be incorrect due to a reference being out of calibration.'"
	 * @generated
	 */
	boolean isBadReference();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isBadReference <em>Bad Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bad Reference</em>' attribute.
	 * @see #isBadReference()
	 * @generated
	 */
	void setBadReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Old Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Data</em>' attribute.
	 * @see #setOldData(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_OldData()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement value is old and possibly invalid, as it has not been successfully updated during a specified time interval.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement value is old and possibly invalid, as it has not been successfully updated during a specified time interval.'"
	 * @generated
	 */
	boolean isOldData();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isOldData <em>Old Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Data</em>' attribute.
	 * @see #isOldData()
	 * @generated
	 */
	void setOldData(boolean value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' attribute.
	 * @see #setFailure(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_Failure()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This identifier indicates that a supervision function has detected an internal or external failure, e.g. communication failure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This identifier indicates that a supervision function has detected an internal or external failure, e.g. communication failure.'"
	 * @generated
	 */
	boolean isFailure();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isFailure <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' attribute.
	 * @see #isFailure()
	 * @generated
	 */
	void setFailure(boolean value);

	/**
	 * Returns the value of the '<em><b>Over Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Over Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over Flow</em>' attribute.
	 * @see #setOverFlow(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_OverFlow()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement value is beyond the capability of being  represented properly. For example, a counter value overflows from maximum count back to a value of zero.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement value is beyond the capability of being  represented properly. For example, a counter value overflows from maximum count back to a value of zero.'"
	 * @generated
	 */
	boolean isOverFlow();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isOverFlow <em>Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over Flow</em>' attribute.
	 * @see #isOverFlow()
	 * @generated
	 */
	void setOverFlow(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.SCADA.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see CIM.IEC61970.SCADA.Source
	 * @see #setSource(Source)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_Source()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Source gives information related to the origin of a value. The value may be acquired from the process, defaulted or substituted.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Source gives information related to the origin of a value. The value may be acquired from the process, defaulted or substituted.'"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see CIM.IEC61970.SCADA.Source
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Operator Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Blocked</em>' attribute.
	 * @see #setOperatorBlocked(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_OperatorBlocked()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement value is blocked and hence unavailable for transmission.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement value is blocked and hence unavailable for transmission.'"
	 * @generated
	 */
	boolean isOperatorBlocked();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isOperatorBlocked <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Blocked</em>' attribute.
	 * @see #isOperatorBlocked()
	 * @generated
	 */
	void setOperatorBlocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_Test()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement value is transmitted for test purposes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement value is transmitted for test purposes.'"
	 * @generated
	 */
	boolean isTest();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #isTest()
	 * @generated
	 */
	void setTest(boolean value);

	/**
	 * Returns the value of the '<em><b>Oscillatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oscillatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscillatory</em>' attribute.
	 * @see #setOscillatory(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_Oscillatory()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='To prevent some overload of the communication it is sensible to detect and suppress oscillating (fast changing) binary inputs. If a signal changes in a defined time (tosc) twice in the same direction (from 0 to 1 or from 1 to 0) then oscillation is detected and the detail quality identifier \"oscillatory\" is set. If it is detected a configured numbers of transient changes could be passed by. In this time the validity status \"questionable\" is set. If after this defined numbers of changes the signal is still in the oscillating state the value shall be set either to the opposite state of the previous stable value or to a defined default value. In this case the validity status \"questionable\" is reset and \"invalid\" is set as long as the signal is oscillating. If it is configured such that no transient changes should be passed by then the validity status \"invalid\" is set immediately in addition to the detail quality identifier \"oscillatory\" (used for status information only).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='To prevent some overload of the communication it is sensible to detect and suppress oscillating (fast changing) binary inputs. If a signal changes in a defined time (tosc) twice in the same direction (from 0 to 1 or from 1 to 0) then oscillation is detected and the detail quality identifier \"oscillatory\" is set. If it is detected a configured numbers of transient changes could be passed by. In this time the validity status \"questionable\" is set. If after this defined numbers of changes the signal is still in the oscillating state the value shall be set either to the opposite state of the previous stable value or to a defined default value. In this case the validity status \"questionable\" is reset and \"invalid\" is set as long as the signal is oscillating. If it is configured such that no transient changes should be passed by then the validity status \"invalid\" is set immediately in addition to the detail quality identifier \"oscillatory\" (used for status information only).'"
	 * @generated
	 */
	boolean isOscillatory();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isOscillatory <em>Oscillatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscillatory</em>' attribute.
	 * @see #isOscillatory()
	 * @generated
	 */
	void setOscillatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Out Of Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Of Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Of Range</em>' attribute.
	 * @see #setOutOfRange(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getQuality61850_OutOfRange()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement value is beyond a predefined range of value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement value is beyond a predefined range of value.'"
	 * @generated
	 */
	boolean isOutOfRange();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Quality61850#isOutOfRange <em>Out Of Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Of Range</em>' attribute.
	 * @see #isOutOfRange()
	 * @generated
	 */
	void setOutOfRange(boolean value);

} // Quality61850
