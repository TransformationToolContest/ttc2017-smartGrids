/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfGMLSupport.GmlValue;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.MeasurementValue;
import CIM.IEC61970.Meas.MeasurementValueQuality;
import CIM.IEC61970.Meas.MeasurementValueSource;

import CIM.IEC61970.SCADA.RemoteSource;
import CIM.IEC61970.SCADA.SCADAPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl#getGmlValues <em>Gml Values</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl#getSensorAccuracy <em>Sensor Accuracy</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl#getMeasurementValueQuality <em>Measurement Value Quality</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl#getMeasurementValueSource <em>Measurement Value Source</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.MeasurementValueImpl#getRemoteSource <em>Remote Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementValueImpl extends IdentifiedObjectImpl implements MeasurementValue {
	/**
	 * The cached value of the '{@link #getGmlValues() <em>Gml Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlValues()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlValue> gmlValues;

	/**
	 * The cached value of the '{@link #getProcedureDataSets() <em>Procedure Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureDataSet> procedureDataSets;

	/**
	 * The default value of the '{@link #getSensorAccuracy() <em>Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final float SENSOR_ACCURACY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSensorAccuracy() <em>Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorAccuracy()
	 * @generated
	 * @ordered
	 */
	protected float sensorAccuracy = SENSOR_ACCURACY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurementValueQuality() <em>Measurement Value Quality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValueQuality()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValueQuality measurementValueQuality;

	/**
	 * The cached value of the '{@link #getErpPerson() <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPerson()
	 * @generated
	 * @ordered
	 */
	protected ErpPerson erpPerson;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurementValueSource() <em>Measurement Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValueSource()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValueSource measurementValueSource;

	/**
	 * The cached value of the '{@link #getRemoteSource() <em>Remote Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSource()
	 * @generated
	 * @ordered
	 */
	protected RemoteSource remoteSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.MEASUREMENT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlValue> getGmlValues() {
		if (gmlValues == null) {
			gmlValues = new EObjectWithInverseResolvingEList<GmlValue>(GmlValue.class, this, MeasPackage.MEASUREMENT_VALUE__GML_VALUES, InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE);
		}
		return gmlValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureDataSet> getProcedureDataSets() {
		if (procedureDataSets == null) {
			procedureDataSets = new EObjectWithInverseResolvingEList.ManyInverse<ProcedureDataSet>(ProcedureDataSet.class, this, MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS, InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES);
		}
		return procedureDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSensorAccuracy() {
		return sensorAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorAccuracy(float newSensorAccuracy) {
		float oldSensorAccuracy = sensorAccuracy;
		sensorAccuracy = newSensorAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY, oldSensorAccuracy, sensorAccuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueQuality getMeasurementValueQuality() {
		if (measurementValueQuality != null && measurementValueQuality.eIsProxy()) {
			InternalEObject oldMeasurementValueQuality = (InternalEObject)measurementValueQuality;
			measurementValueQuality = (MeasurementValueQuality)eResolveProxy(oldMeasurementValueQuality);
			if (measurementValueQuality != oldMeasurementValueQuality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, oldMeasurementValueQuality, measurementValueQuality));
			}
		}
		return measurementValueQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueQuality basicGetMeasurementValueQuality() {
		return measurementValueQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValueQuality(MeasurementValueQuality newMeasurementValueQuality, NotificationChain msgs) {
		MeasurementValueQuality oldMeasurementValueQuality = measurementValueQuality;
		measurementValueQuality = newMeasurementValueQuality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, oldMeasurementValueQuality, newMeasurementValueQuality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementValueQuality(MeasurementValueQuality newMeasurementValueQuality) {
		if (newMeasurementValueQuality != measurementValueQuality) {
			NotificationChain msgs = null;
			if (measurementValueQuality != null)
				msgs = ((InternalEObject)measurementValueQuality).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs);
			if (newMeasurementValueQuality != null)
				msgs = ((InternalEObject)newMeasurementValueQuality).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs);
			msgs = basicSetMeasurementValueQuality(newMeasurementValueQuality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, newMeasurementValueQuality, newMeasurementValueQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson getErpPerson() {
		if (erpPerson != null && erpPerson.eIsProxy()) {
			InternalEObject oldErpPerson = (InternalEObject)erpPerson;
			erpPerson = (ErpPerson)eResolveProxy(oldErpPerson);
			if (erpPerson != oldErpPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT_VALUE__ERP_PERSON, oldErpPerson, erpPerson));
			}
		}
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson basicGetErpPerson() {
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPerson(ErpPerson newErpPerson, NotificationChain msgs) {
		ErpPerson oldErpPerson = erpPerson;
		erpPerson = newErpPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__ERP_PERSON, oldErpPerson, newErpPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpPerson(ErpPerson newErpPerson) {
		if (newErpPerson != erpPerson) {
			NotificationChain msgs = null;
			if (erpPerson != null)
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__ERP_PERSON, newErpPerson, newErpPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		Date oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueSource getMeasurementValueSource() {
		if (measurementValueSource != null && measurementValueSource.eIsProxy()) {
			InternalEObject oldMeasurementValueSource = (InternalEObject)measurementValueSource;
			measurementValueSource = (MeasurementValueSource)eResolveProxy(oldMeasurementValueSource);
			if (measurementValueSource != oldMeasurementValueSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, oldMeasurementValueSource, measurementValueSource));
			}
		}
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueSource basicGetMeasurementValueSource() {
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValueSource(MeasurementValueSource newMeasurementValueSource, NotificationChain msgs) {
		MeasurementValueSource oldMeasurementValueSource = measurementValueSource;
		measurementValueSource = newMeasurementValueSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, oldMeasurementValueSource, newMeasurementValueSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementValueSource(MeasurementValueSource newMeasurementValueSource) {
		if (newMeasurementValueSource != measurementValueSource) {
			NotificationChain msgs = null;
			if (measurementValueSource != null)
				msgs = ((InternalEObject)measurementValueSource).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs);
			if (newMeasurementValueSource != null)
				msgs = ((InternalEObject)newMeasurementValueSource).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs);
			msgs = basicSetMeasurementValueSource(newMeasurementValueSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, newMeasurementValueSource, newMeasurementValueSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteSource getRemoteSource() {
		if (remoteSource != null && remoteSource.eIsProxy()) {
			InternalEObject oldRemoteSource = (InternalEObject)remoteSource;
			remoteSource = (RemoteSource)eResolveProxy(oldRemoteSource);
			if (remoteSource != oldRemoteSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, oldRemoteSource, remoteSource));
			}
		}
		return remoteSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteSource basicGetRemoteSource() {
		return remoteSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteSource(RemoteSource newRemoteSource, NotificationChain msgs) {
		RemoteSource oldRemoteSource = remoteSource;
		remoteSource = newRemoteSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, oldRemoteSource, newRemoteSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteSource(RemoteSource newRemoteSource) {
		if (newRemoteSource != remoteSource) {
			NotificationChain msgs = null;
			if (remoteSource != null)
				msgs = ((InternalEObject)remoteSource).eInverseRemove(this, SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs);
			if (newRemoteSource != null)
				msgs = ((InternalEObject)newRemoteSource).eInverseAdd(this, SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs);
			msgs = basicSetRemoteSource(newRemoteSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, newRemoteSource, newRemoteSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlValues()).basicAdd(otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedureDataSets()).basicAdd(otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				if (measurementValueQuality != null)
					msgs = ((InternalEObject)measurementValueQuality).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs);
				return basicSetMeasurementValueQuality((MeasurementValueQuality)otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				if (measurementValueSource != null)
					msgs = ((InternalEObject)measurementValueSource).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs);
				return basicSetMeasurementValueSource((MeasurementValueSource)otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				if (remoteSource != null)
					msgs = ((InternalEObject)remoteSource).eInverseRemove(this, SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs);
				return basicSetRemoteSource((RemoteSource)otherEnd, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				return ((InternalEList<?>)getGmlValues()).basicRemove(otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				return ((InternalEList<?>)getProcedureDataSets()).basicRemove(otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				return basicSetMeasurementValueQuality(null, msgs);
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				return basicSetMeasurementValueSource(null, msgs);
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				return basicSetRemoteSource(null, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				return getGmlValues();
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				return getProcedureDataSets();
			case MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
				return getSensorAccuracy();
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				if (resolve) return getMeasurementValueQuality();
				return basicGetMeasurementValueQuality();
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
			case MeasPackage.MEASUREMENT_VALUE__TIME_STAMP:
				return getTimeStamp();
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				if (resolve) return getMeasurementValueSource();
				return basicGetMeasurementValueSource();
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				if (resolve) return getRemoteSource();
				return basicGetRemoteSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				getGmlValues().clear();
				getGmlValues().addAll((Collection<? extends GmlValue>)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				getProcedureDataSets().addAll((Collection<? extends ProcedureDataSet>)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
				setSensorAccuracy((Float)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				setMeasurementValueQuality((MeasurementValueQuality)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__TIME_STAMP:
				setTimeStamp((Date)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				setMeasurementValueSource((MeasurementValueSource)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				setRemoteSource((RemoteSource)newValue);
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				getGmlValues().clear();
				return;
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				return;
			case MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
				setSensorAccuracy(SENSOR_ACCURACY_EDEFAULT);
				return;
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				setMeasurementValueQuality((MeasurementValueQuality)null);
				return;
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				setErpPerson((ErpPerson)null);
				return;
			case MeasPackage.MEASUREMENT_VALUE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				setMeasurementValueSource((MeasurementValueSource)null);
				return;
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				setRemoteSource((RemoteSource)null);
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				return gmlValues != null && !gmlValues.isEmpty();
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				return procedureDataSets != null && !procedureDataSets.isEmpty();
			case MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
				return sensorAccuracy != SENSOR_ACCURACY_EDEFAULT;
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				return measurementValueQuality != null;
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				return erpPerson != null;
			case MeasPackage.MEASUREMENT_VALUE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				return measurementValueSource != null;
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				return remoteSource != null;
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
		result.append(" (sensorAccuracy: ");
		result.append(sensorAccuracy);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //MeasurementValueImpl
