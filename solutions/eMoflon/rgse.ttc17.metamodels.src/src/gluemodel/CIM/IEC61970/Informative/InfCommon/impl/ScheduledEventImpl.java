/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;
import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.Status;
import gluemodel.CIM.IEC61968.Common.TimePoint;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo;
import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Scheduled Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduledEventImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduledEventImpl#getTimePoint <em>Time Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduledEventImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduledEventImpl#getScheduleParameterInfo <em>Schedule Parameter Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduledEventImpl#getActivityRecord <em>Activity Record</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduledEventImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduledEventImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduledEventImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduledEventImpl extends IdentifiedObjectImpl implements ScheduledEvent {
	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Document document;

	/**
	 * The cached value of the '{@link #getTimePoint() <em>Time Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePoint()
	 * @generated
	 * @ordered
	 */
	protected TimePoint timePoint;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScheduleParameterInfo() <em>Schedule Parameter Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleParameterInfo()
	 * @generated
	 * @ordered
	 */
	protected ScheduleParameterInfo scheduleParameterInfo;

	/**
	 * The cached value of the '{@link #getActivityRecord() <em>Activity Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRecord()
	 * @generated
	 * @ordered
	 */
	protected ActivityRecord activityRecord;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduledEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.SCHEDULED_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocument() {
		if (document != null && document.eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (Document)eResolveProxy(oldDocument);
			if (document != oldDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SCHEDULED_EVENT__DOCUMENT, oldDocument, document));
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Document newDocument, NotificationChain msgs) {
		Document oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Document newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__SCHEDULED_EVENTS, Document.class, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, CommonPackage.DOCUMENT__SCHEDULED_EVENTS, Document.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint getTimePoint() {
		if (timePoint != null && timePoint.eIsProxy()) {
			InternalEObject oldTimePoint = (InternalEObject)timePoint;
			timePoint = (TimePoint)eResolveProxy(oldTimePoint);
			if (timePoint != oldTimePoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SCHEDULED_EVENT__TIME_POINT, oldTimePoint, timePoint));
			}
		}
		return timePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint basicGetTimePoint() {
		return timePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePoint(TimePoint newTimePoint, NotificationChain msgs) {
		TimePoint oldTimePoint = timePoint;
		timePoint = newTimePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__TIME_POINT, oldTimePoint, newTimePoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePoint(TimePoint newTimePoint) {
		if (newTimePoint != timePoint) {
			NotificationChain msgs = null;
			if (timePoint != null)
				msgs = ((InternalEObject)timePoint).eInverseRemove(this, CommonPackage.TIME_POINT__SCHEDULED_EVENTS, TimePoint.class, msgs);
			if (newTimePoint != null)
				msgs = ((InternalEObject)newTimePoint).eInverseAdd(this, CommonPackage.TIME_POINT__SCHEDULED_EVENTS, TimePoint.class, msgs);
			msgs = basicSetTimePoint(newTimePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__TIME_POINT, newTimePoint, newTimePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(float newDuration) {
		float oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleParameterInfo getScheduleParameterInfo() {
		if (scheduleParameterInfo != null && scheduleParameterInfo.eIsProxy()) {
			InternalEObject oldScheduleParameterInfo = (InternalEObject)scheduleParameterInfo;
			scheduleParameterInfo = (ScheduleParameterInfo)eResolveProxy(oldScheduleParameterInfo);
			if (scheduleParameterInfo != oldScheduleParameterInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO, oldScheduleParameterInfo, scheduleParameterInfo));
			}
		}
		return scheduleParameterInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleParameterInfo basicGetScheduleParameterInfo() {
		return scheduleParameterInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleParameterInfo(ScheduleParameterInfo newScheduleParameterInfo, NotificationChain msgs) {
		ScheduleParameterInfo oldScheduleParameterInfo = scheduleParameterInfo;
		scheduleParameterInfo = newScheduleParameterInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO, oldScheduleParameterInfo, newScheduleParameterInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleParameterInfo(ScheduleParameterInfo newScheduleParameterInfo) {
		if (newScheduleParameterInfo != scheduleParameterInfo) {
			NotificationChain msgs = null;
			if (scheduleParameterInfo != null)
				msgs = ((InternalEObject)scheduleParameterInfo).eInverseRemove(this, InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS, ScheduleParameterInfo.class, msgs);
			if (newScheduleParameterInfo != null)
				msgs = ((InternalEObject)newScheduleParameterInfo).eInverseAdd(this, InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS, ScheduleParameterInfo.class, msgs);
			msgs = basicSetScheduleParameterInfo(newScheduleParameterInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO, newScheduleParameterInfo, newScheduleParameterInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityRecord getActivityRecord() {
		if (activityRecord != null && activityRecord.eIsProxy()) {
			InternalEObject oldActivityRecord = (InternalEObject)activityRecord;
			activityRecord = (ActivityRecord)eResolveProxy(oldActivityRecord);
			if (activityRecord != oldActivityRecord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD, oldActivityRecord, activityRecord));
			}
		}
		return activityRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityRecord basicGetActivityRecord() {
		return activityRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityRecord(ActivityRecord newActivityRecord, NotificationChain msgs) {
		ActivityRecord oldActivityRecord = activityRecord;
		activityRecord = newActivityRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD, oldActivityRecord, newActivityRecord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityRecord(ActivityRecord newActivityRecord) {
		if (newActivityRecord != activityRecord) {
			NotificationChain msgs = null;
			if (activityRecord != null)
				msgs = ((InternalEObject)activityRecord).eInverseRemove(this, CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT, ActivityRecord.class, msgs);
			if (newActivityRecord != null)
				msgs = ((InternalEObject)newActivityRecord).eInverseAdd(this, CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT, ActivityRecord.class, msgs);
			msgs = basicSetActivityRecord(newActivityRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD, newActivityRecord, newActivityRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectWithInverseResolvingEList.ManyInverse<Asset>(Asset.class, this, InfCommonPackage.SCHEDULED_EVENT__ASSETS, AssetsPackage.ASSET__SCHEDULED_EVENTS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SCHEDULED_EVENT__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULED_EVENT__STATUS, oldStatus, status));
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				if (document != null)
					msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__SCHEDULED_EVENTS, Document.class, msgs);
				return basicSetDocument((Document)otherEnd, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				if (timePoint != null)
					msgs = ((InternalEObject)timePoint).eInverseRemove(this, CommonPackage.TIME_POINT__SCHEDULED_EVENTS, TimePoint.class, msgs);
				return basicSetTimePoint((TimePoint)otherEnd, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				if (scheduleParameterInfo != null)
					msgs = ((InternalEObject)scheduleParameterInfo).eInverseRemove(this, InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS, ScheduleParameterInfo.class, msgs);
				return basicSetScheduleParameterInfo((ScheduleParameterInfo)otherEnd, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				if (activityRecord != null)
					msgs = ((InternalEObject)activityRecord).eInverseRemove(this, CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT, ActivityRecord.class, msgs);
				return basicSetActivityRecord((ActivityRecord)otherEnd, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				return basicSetDocument(null, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				return basicSetTimePoint(null, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				return basicSetScheduleParameterInfo(null, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				return basicSetActivityRecord(null, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				if (resolve) return getTimePoint();
				return basicGetTimePoint();
			case InfCommonPackage.SCHEDULED_EVENT__DURATION:
				return getDuration();
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				if (resolve) return getScheduleParameterInfo();
				return basicGetScheduleParameterInfo();
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				if (resolve) return getActivityRecord();
				return basicGetActivityRecord();
			case InfCommonPackage.SCHEDULED_EVENT__CATEGORY:
				return getCategory();
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				return getAssets();
			case InfCommonPackage.SCHEDULED_EVENT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				setTimePoint((TimePoint)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__DURATION:
				setDuration((Float)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				setScheduleParameterInfo((ScheduleParameterInfo)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				setActivityRecord((ActivityRecord)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__STATUS:
				setStatus((Status)newValue);
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				setDocument((Document)null);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				setTimePoint((TimePoint)null);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				setScheduleParameterInfo((ScheduleParameterInfo)null);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				setActivityRecord((ActivityRecord)null);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				getAssets().clear();
				return;
			case InfCommonPackage.SCHEDULED_EVENT__STATUS:
				setStatus((Status)null);
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				return document != null;
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				return timePoint != null;
			case InfCommonPackage.SCHEDULED_EVENT__DURATION:
				return duration != DURATION_EDEFAULT;
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				return scheduleParameterInfo != null;
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				return activityRecord != null;
			case InfCommonPackage.SCHEDULED_EVENT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				return assets != null && !assets.isEmpty();
			case InfCommonPackage.SCHEDULED_EVENT__STATUS:
				return status != null;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //ScheduledEventImpl
