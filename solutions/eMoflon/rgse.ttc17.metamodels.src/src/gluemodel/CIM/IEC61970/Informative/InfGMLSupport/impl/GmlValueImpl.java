/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlObservation;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlValue;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.MeasurementValue;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlValueImpl#getGmlObservation <em>Gml Observation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlValueImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlValueImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlValueImpl#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlValueImpl extends IdentifiedObjectImpl implements GmlValue {
	/**
	 * The cached value of the '{@link #getGmlObservation() <em>Gml Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlObservation()
	 * @generated
	 * @ordered
	 */
	protected GmlObservation gmlObservation;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected String timePeriod = TIME_PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValue()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValue measurementValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlObservation getGmlObservation() {
		if (gmlObservation != null && gmlObservation.eIsProxy()) {
			InternalEObject oldGmlObservation = (InternalEObject)gmlObservation;
			gmlObservation = (GmlObservation)eResolveProxy(oldGmlObservation);
			if (gmlObservation != oldGmlObservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION, oldGmlObservation, gmlObservation));
			}
		}
		return gmlObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlObservation basicGetGmlObservation() {
		return gmlObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlObservation(GmlObservation newGmlObservation, NotificationChain msgs) {
		GmlObservation oldGmlObservation = gmlObservation;
		gmlObservation = newGmlObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION, oldGmlObservation, newGmlObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlObservation(GmlObservation newGmlObservation) {
		if (newGmlObservation != gmlObservation) {
			NotificationChain msgs = null;
			if (gmlObservation != null)
				msgs = ((InternalEObject)gmlObservation).eInverseRemove(this, InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES, GmlObservation.class, msgs);
			if (newGmlObservation != null)
				msgs = ((InternalEObject)newGmlObservation).eInverseAdd(this, InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES, GmlObservation.class, msgs);
			msgs = basicSetGmlObservation(newGmlObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION, newGmlObservation, newGmlObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_VALUE__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePeriod(String newTimePeriod) {
		String oldTimePeriod = timePeriod;
		timePeriod = newTimePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_VALUE__TIME_PERIOD, oldTimePeriod, timePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue getMeasurementValue() {
		if (measurementValue != null && measurementValue.eIsProxy()) {
			InternalEObject oldMeasurementValue = (InternalEObject)measurementValue;
			measurementValue = (MeasurementValue)eResolveProxy(oldMeasurementValue);
			if (measurementValue != oldMeasurementValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE, oldMeasurementValue, measurementValue));
			}
		}
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue basicGetMeasurementValue() {
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValue(MeasurementValue newMeasurementValue, NotificationChain msgs) {
		MeasurementValue oldMeasurementValue = measurementValue;
		measurementValue = newMeasurementValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE, oldMeasurementValue, newMeasurementValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementValue(MeasurementValue newMeasurementValue) {
		if (newMeasurementValue != measurementValue) {
			NotificationChain msgs = null;
			if (measurementValue != null)
				msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__GML_VALUES, MeasurementValue.class, msgs);
			if (newMeasurementValue != null)
				msgs = ((InternalEObject)newMeasurementValue).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE__GML_VALUES, MeasurementValue.class, msgs);
			msgs = basicSetMeasurementValue(newMeasurementValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE, newMeasurementValue, newMeasurementValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				if (gmlObservation != null)
					msgs = ((InternalEObject)gmlObservation).eInverseRemove(this, InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES, GmlObservation.class, msgs);
				return basicSetGmlObservation((GmlObservation)otherEnd, msgs);
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				if (measurementValue != null)
					msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__GML_VALUES, MeasurementValue.class, msgs);
				return basicSetMeasurementValue((MeasurementValue)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				return basicSetGmlObservation(null, msgs);
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				return basicSetMeasurementValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				if (resolve) return getGmlObservation();
				return basicGetGmlObservation();
			case InfGMLSupportPackage.GML_VALUE__DATE_TIME:
				return getDateTime();
			case InfGMLSupportPackage.GML_VALUE__VALUE:
				return getValue();
			case InfGMLSupportPackage.GML_VALUE__TIME_PERIOD:
				return getTimePeriod();
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				if (resolve) return getMeasurementValue();
				return basicGetMeasurementValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				setGmlObservation((GmlObservation)newValue);
				return;
			case InfGMLSupportPackage.GML_VALUE__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case InfGMLSupportPackage.GML_VALUE__VALUE:
				setValue((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_VALUE__TIME_PERIOD:
				setTimePeriod((String)newValue);
				return;
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				setGmlObservation((GmlObservation)null);
				return;
			case InfGMLSupportPackage.GML_VALUE__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_VALUE__TIME_PERIOD:
				setTimePeriod(TIME_PERIOD_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				return gmlObservation != null;
			case InfGMLSupportPackage.GML_VALUE__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
			case InfGMLSupportPackage.GML_VALUE__VALUE:
				return value != VALUE_EDEFAULT;
			case InfGMLSupportPackage.GML_VALUE__TIME_PERIOD:
				return TIME_PERIOD_EDEFAULT == null ? timePeriod != null : !TIME_PERIOD_EDEFAULT.equals(timePeriod);
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				return measurementValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dateTime: ");
		result.append(dateTime);
		result.append(", value: ");
		result.append(value);
		result.append(", timePeriod: ");
		result.append(timePeriod);
		result.append(')');
		return result.toString();
	}

} //GmlValueImpl
