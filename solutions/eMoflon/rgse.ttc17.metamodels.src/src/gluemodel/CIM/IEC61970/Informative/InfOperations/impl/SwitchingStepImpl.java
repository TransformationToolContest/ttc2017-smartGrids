/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind;

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
 * An implementation of the model object '<em><b>Switching Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl#getStatusKind <em>Status Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl#getErpPersonRole <em>Erp Person Role</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl#getSwitchingSchedule <em>Switching Schedule</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl#getSafetyDocument <em>Safety Document</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl#getRequiredControlAction <em>Required Control Action</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl#getText <em>Text</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl#getRequiredControlActionInterval <em>Required Control Action Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingStepImpl#getDesiredEndState <em>Desired End State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchingStepImpl extends IdentifiedObjectImpl implements SwitchingStep {
	/**
	 * The default value of the '{@link #getStatusKind() <em>Status Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusKind()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchingStepStatusKind STATUS_KIND_EDEFAULT = SwitchingStepStatusKind.SKIPPED;

	/**
	 * The cached value of the '{@link #getStatusKind() <em>Status Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusKind()
	 * @generated
	 * @ordered
	 */
	protected SwitchingStepStatusKind statusKind = STATUS_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpPersonRole() <em>Erp Person Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonRole()
	 * @generated
	 * @ordered
	 */
	protected ErpPersonScheduleStepRole erpPersonRole;

	/**
	 * The cached value of the '{@link #getSwitchingSchedule() <em>Switching Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingSchedule()
	 * @generated
	 * @ordered
	 */
	protected SwitchingSchedule switchingSchedule;

	/**
	 * The cached value of the '{@link #getSafetyDocument() <em>Safety Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyDocument()
	 * @generated
	 * @ordered
	 */
	protected SafetyDocument safetyDocument;

	/**
	 * The default value of the '{@link #getRequiredControlAction() <em>Required Control Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredControlAction()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_CONTROL_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredControlAction() <em>Required Control Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredControlAction()
	 * @generated
	 * @ordered
	 */
	protected String requiredControlAction = REQUIRED_CONTROL_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResources;

	/**
	 * The cached value of the '{@link #getRequiredControlActionInterval() <em>Required Control Action Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredControlActionInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval requiredControlActionInterval;

	/**
	 * The default value of the '{@link #getDesiredEndState() <em>Desired End State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredEndState()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIRED_END_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredEndState() <em>Desired End State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredEndState()
	 * @generated
	 * @ordered
	 */
	protected String desiredEndState = DESIRED_END_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchingStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.SWITCHING_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingStepStatusKind getStatusKind() {
		return statusKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusKind(SwitchingStepStatusKind newStatusKind) {
		SwitchingStepStatusKind oldStatusKind = statusKind;
		statusKind = newStatusKind == null ? STATUS_KIND_EDEFAULT : newStatusKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__STATUS_KIND, oldStatusKind, statusKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonScheduleStepRole getErpPersonRole() {
		if (erpPersonRole != null && erpPersonRole.eIsProxy()) {
			InternalEObject oldErpPersonRole = (InternalEObject)erpPersonRole;
			erpPersonRole = (ErpPersonScheduleStepRole)eResolveProxy(oldErpPersonRole);
			if (erpPersonRole != oldErpPersonRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE, oldErpPersonRole, erpPersonRole));
			}
		}
		return erpPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonScheduleStepRole basicGetErpPersonRole() {
		return erpPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPersonRole(ErpPersonScheduleStepRole newErpPersonRole, NotificationChain msgs) {
		ErpPersonScheduleStepRole oldErpPersonRole = erpPersonRole;
		erpPersonRole = newErpPersonRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE, oldErpPersonRole, newErpPersonRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpPersonRole(ErpPersonScheduleStepRole newErpPersonRole) {
		if (newErpPersonRole != erpPersonRole) {
			NotificationChain msgs = null;
			if (erpPersonRole != null)
				msgs = ((InternalEObject)erpPersonRole).eInverseRemove(this, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP, ErpPersonScheduleStepRole.class, msgs);
			if (newErpPersonRole != null)
				msgs = ((InternalEObject)newErpPersonRole).eInverseAdd(this, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP, ErpPersonScheduleStepRole.class, msgs);
			msgs = basicSetErpPersonRole(newErpPersonRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE, newErpPersonRole, newErpPersonRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingSchedule getSwitchingSchedule() {
		if (switchingSchedule != null && switchingSchedule.eIsProxy()) {
			InternalEObject oldSwitchingSchedule = (InternalEObject)switchingSchedule;
			switchingSchedule = (SwitchingSchedule)eResolveProxy(oldSwitchingSchedule);
			if (switchingSchedule != oldSwitchingSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE, oldSwitchingSchedule, switchingSchedule));
			}
		}
		return switchingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingSchedule basicGetSwitchingSchedule() {
		return switchingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchingSchedule(SwitchingSchedule newSwitchingSchedule, NotificationChain msgs) {
		SwitchingSchedule oldSwitchingSchedule = switchingSchedule;
		switchingSchedule = newSwitchingSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE, oldSwitchingSchedule, newSwitchingSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchingSchedule(SwitchingSchedule newSwitchingSchedule) {
		if (newSwitchingSchedule != switchingSchedule) {
			NotificationChain msgs = null;
			if (switchingSchedule != null)
				msgs = ((InternalEObject)switchingSchedule).eInverseRemove(this, InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS, SwitchingSchedule.class, msgs);
			if (newSwitchingSchedule != null)
				msgs = ((InternalEObject)newSwitchingSchedule).eInverseAdd(this, InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS, SwitchingSchedule.class, msgs);
			msgs = basicSetSwitchingSchedule(newSwitchingSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE, newSwitchingSchedule, newSwitchingSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyDocument getSafetyDocument() {
		if (safetyDocument != null && safetyDocument.eIsProxy()) {
			InternalEObject oldSafetyDocument = (InternalEObject)safetyDocument;
			safetyDocument = (SafetyDocument)eResolveProxy(oldSafetyDocument);
			if (safetyDocument != oldSafetyDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT, oldSafetyDocument, safetyDocument));
			}
		}
		return safetyDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyDocument basicGetSafetyDocument() {
		return safetyDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSafetyDocument(SafetyDocument newSafetyDocument, NotificationChain msgs) {
		SafetyDocument oldSafetyDocument = safetyDocument;
		safetyDocument = newSafetyDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT, oldSafetyDocument, newSafetyDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafetyDocument(SafetyDocument newSafetyDocument) {
		if (newSafetyDocument != safetyDocument) {
			NotificationChain msgs = null;
			if (safetyDocument != null)
				msgs = ((InternalEObject)safetyDocument).eInverseRemove(this, InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS, SafetyDocument.class, msgs);
			if (newSafetyDocument != null)
				msgs = ((InternalEObject)newSafetyDocument).eInverseAdd(this, InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS, SafetyDocument.class, msgs);
			msgs = basicSetSafetyDocument(newSafetyDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT, newSafetyDocument, newSafetyDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredControlAction() {
		return requiredControlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredControlAction(String newRequiredControlAction) {
		String oldRequiredControlAction = requiredControlAction;
		requiredControlAction = newRequiredControlAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION, oldRequiredControlAction, requiredControlAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new EObjectWithInverseResolvingEList.ManyInverse<PowerSystemResource>(PowerSystemResource.class, this, InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES, CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS);
		}
		return powerSystemResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getRequiredControlActionInterval() {
		if (requiredControlActionInterval != null && requiredControlActionInterval.eIsProxy()) {
			InternalEObject oldRequiredControlActionInterval = (InternalEObject)requiredControlActionInterval;
			requiredControlActionInterval = (DateTimeInterval)eResolveProxy(oldRequiredControlActionInterval);
			if (requiredControlActionInterval != oldRequiredControlActionInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL, oldRequiredControlActionInterval, requiredControlActionInterval));
			}
		}
		return requiredControlActionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetRequiredControlActionInterval() {
		return requiredControlActionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredControlActionInterval(DateTimeInterval newRequiredControlActionInterval) {
		DateTimeInterval oldRequiredControlActionInterval = requiredControlActionInterval;
		requiredControlActionInterval = newRequiredControlActionInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL, oldRequiredControlActionInterval, requiredControlActionInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesiredEndState() {
		return desiredEndState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesiredEndState(String newDesiredEndState) {
		String oldDesiredEndState = desiredEndState;
		desiredEndState = newDesiredEndState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_STEP__DESIRED_END_STATE, oldDesiredEndState, desiredEndState));
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
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				if (erpPersonRole != null)
					msgs = ((InternalEObject)erpPersonRole).eInverseRemove(this, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP, ErpPersonScheduleStepRole.class, msgs);
				return basicSetErpPersonRole((ErpPersonScheduleStepRole)otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				if (switchingSchedule != null)
					msgs = ((InternalEObject)switchingSchedule).eInverseRemove(this, InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS, SwitchingSchedule.class, msgs);
				return basicSetSwitchingSchedule((SwitchingSchedule)otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				if (safetyDocument != null)
					msgs = ((InternalEObject)safetyDocument).eInverseRemove(this, InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS, SafetyDocument.class, msgs);
				return basicSetSafetyDocument((SafetyDocument)otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				return basicSetErpPersonRole(null, msgs);
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				return basicSetSwitchingSchedule(null, msgs);
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				return basicSetSafetyDocument(null, msgs);
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.SWITCHING_STEP__STATUS_KIND:
				return getStatusKind();
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				if (resolve) return getErpPersonRole();
				return basicGetErpPersonRole();
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				if (resolve) return getSwitchingSchedule();
				return basicGetSwitchingSchedule();
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				if (resolve) return getSafetyDocument();
				return basicGetSafetyDocument();
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION:
				return getRequiredControlAction();
			case InfOperationsPackage.SWITCHING_STEP__TEXT:
				return getText();
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL:
				if (resolve) return getRequiredControlActionInterval();
				return basicGetRequiredControlActionInterval();
			case InfOperationsPackage.SWITCHING_STEP__DESIRED_END_STATE:
				return getDesiredEndState();
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
			case InfOperationsPackage.SWITCHING_STEP__STATUS_KIND:
				setStatusKind((SwitchingStepStatusKind)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				setErpPersonRole((ErpPersonScheduleStepRole)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				setSwitchingSchedule((SwitchingSchedule)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				setSafetyDocument((SafetyDocument)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION:
				setRequiredControlAction((String)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__TEXT:
				setText((String)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL:
				setRequiredControlActionInterval((DateTimeInterval)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__DESIRED_END_STATE:
				setDesiredEndState((String)newValue);
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
			case InfOperationsPackage.SWITCHING_STEP__STATUS_KIND:
				setStatusKind(STATUS_KIND_EDEFAULT);
				return;
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				setErpPersonRole((ErpPersonScheduleStepRole)null);
				return;
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				setSwitchingSchedule((SwitchingSchedule)null);
				return;
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				setSafetyDocument((SafetyDocument)null);
				return;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION:
				setRequiredControlAction(REQUIRED_CONTROL_ACTION_EDEFAULT);
				return;
			case InfOperationsPackage.SWITCHING_STEP__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				return;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL:
				setRequiredControlActionInterval((DateTimeInterval)null);
				return;
			case InfOperationsPackage.SWITCHING_STEP__DESIRED_END_STATE:
				setDesiredEndState(DESIRED_END_STATE_EDEFAULT);
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
			case InfOperationsPackage.SWITCHING_STEP__STATUS_KIND:
				return statusKind != STATUS_KIND_EDEFAULT;
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				return erpPersonRole != null;
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				return switchingSchedule != null;
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				return safetyDocument != null;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION:
				return REQUIRED_CONTROL_ACTION_EDEFAULT == null ? requiredControlAction != null : !REQUIRED_CONTROL_ACTION_EDEFAULT.equals(requiredControlAction);
			case InfOperationsPackage.SWITCHING_STEP__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL:
				return requiredControlActionInterval != null;
			case InfOperationsPackage.SWITCHING_STEP__DESIRED_END_STATE:
				return DESIRED_END_STATE_EDEFAULT == null ? desiredEndState != null : !DESIRED_END_STATE_EDEFAULT.equals(desiredEndState);
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
		result.append(" (statusKind: ");
		result.append(statusKind);
		result.append(", requiredControlAction: ");
		result.append(requiredControlAction);
		result.append(", text: ");
		result.append(text);
		result.append(", desiredEndState: ");
		result.append(desiredEndState);
		result.append(')');
		return result.toString();
	}

} //SwitchingStepImpl
