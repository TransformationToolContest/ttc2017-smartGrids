/**
 */
package CIM.IEC61970.Outage.impl;

import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.SafetyDocument;

import CIM.IEC61970.Outage.ClearanceTag;
import CIM.IEC61970.Outage.ClearanceTagType;
import CIM.IEC61970.Outage.OutagePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clearance Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#isGroundReqFlag <em>Ground Req Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#getSafetyDocument <em>Safety Document</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#getTagIssueTime <em>Tag Issue Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#getClearanceTagType <em>Clearance Tag Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#getWorkEndTime <em>Work End Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#getAuthorityName <em>Authority Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#isPhaseCheckReqFlag <em>Phase Check Req Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#isDeenergizeReqFlag <em>Deenergize Req Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#getWorkStartTime <em>Work Start Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.ClearanceTagImpl#getWorkDescription <em>Work Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearanceTagImpl extends IdentifiedObjectImpl implements ClearanceTag {
	/**
	 * The default value of the '{@link #isGroundReqFlag() <em>Ground Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundReqFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUND_REQ_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroundReqFlag() <em>Ground Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundReqFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean groundReqFlag = GROUND_REQ_FLAG_EDEFAULT;

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
	 * The default value of the '{@link #getTagIssueTime() <em>Tag Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagIssueTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TAG_ISSUE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagIssueTime() <em>Tag Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagIssueTime()
	 * @generated
	 * @ordered
	 */
	protected Date tagIssueTime = TAG_ISSUE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClearanceTagType() <em>Clearance Tag Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearanceTagType()
	 * @generated
	 * @ordered
	 */
	protected ClearanceTagType clearanceTagType;

	/**
	 * The default value of the '{@link #getWorkEndTime() <em>Work End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date WORK_END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEndTime() <em>Work End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date workEndTime = WORK_END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorityName() <em>Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorityName() <em>Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected String authorityName = AUTHORITY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected ConductingEquipment conductingEquipment;

	/**
	 * The default value of the '{@link #isPhaseCheckReqFlag() <em>Phase Check Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhaseCheckReqFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PHASE_CHECK_REQ_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPhaseCheckReqFlag() <em>Phase Check Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhaseCheckReqFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCheckReqFlag = PHASE_CHECK_REQ_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeenergizeReqFlag() <em>Deenergize Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeenergizeReqFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEENERGIZE_REQ_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeenergizeReqFlag() <em>Deenergize Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeenergizeReqFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean deenergizeReqFlag = DEENERGIZE_REQ_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkStartTime() <em>Work Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date WORK_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkStartTime() <em>Work Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date workStartTime = WORK_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkDescription() <em>Work Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkDescription() <em>Work Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDescription()
	 * @generated
	 * @ordered
	 */
	protected String workDescription = WORK_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearanceTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePackage.Literals.CLEARANCE_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGroundReqFlag() {
		return groundReqFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundReqFlag(boolean newGroundReqFlag) {
		boolean oldGroundReqFlag = groundReqFlag;
		groundReqFlag = newGroundReqFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__GROUND_REQ_FLAG, oldGroundReqFlag, groundReqFlag));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT, oldSafetyDocument, safetyDocument));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT, oldSafetyDocument, newSafetyDocument);
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
				msgs = ((InternalEObject)safetyDocument).eInverseRemove(this, InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS, SafetyDocument.class, msgs);
			if (newSafetyDocument != null)
				msgs = ((InternalEObject)newSafetyDocument).eInverseAdd(this, InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS, SafetyDocument.class, msgs);
			msgs = basicSetSafetyDocument(newSafetyDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT, newSafetyDocument, newSafetyDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTagIssueTime() {
		return tagIssueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagIssueTime(Date newTagIssueTime) {
		Date oldTagIssueTime = tagIssueTime;
		tagIssueTime = newTagIssueTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__TAG_ISSUE_TIME, oldTagIssueTime, tagIssueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearanceTagType getClearanceTagType() {
		if (clearanceTagType != null && clearanceTagType.eIsProxy()) {
			InternalEObject oldClearanceTagType = (InternalEObject)clearanceTagType;
			clearanceTagType = (ClearanceTagType)eResolveProxy(oldClearanceTagType);
			if (clearanceTagType != oldClearanceTagType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE, oldClearanceTagType, clearanceTagType));
			}
		}
		return clearanceTagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearanceTagType basicGetClearanceTagType() {
		return clearanceTagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearanceTagType(ClearanceTagType newClearanceTagType, NotificationChain msgs) {
		ClearanceTagType oldClearanceTagType = clearanceTagType;
		clearanceTagType = newClearanceTagType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE, oldClearanceTagType, newClearanceTagType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearanceTagType(ClearanceTagType newClearanceTagType) {
		if (newClearanceTagType != clearanceTagType) {
			NotificationChain msgs = null;
			if (clearanceTagType != null)
				msgs = ((InternalEObject)clearanceTagType).eInverseRemove(this, OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS, ClearanceTagType.class, msgs);
			if (newClearanceTagType != null)
				msgs = ((InternalEObject)newClearanceTagType).eInverseAdd(this, OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS, ClearanceTagType.class, msgs);
			msgs = basicSetClearanceTagType(newClearanceTagType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE, newClearanceTagType, newClearanceTagType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWorkEndTime() {
		return workEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkEndTime(Date newWorkEndTime) {
		Date oldWorkEndTime = workEndTime;
		workEndTime = newWorkEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__WORK_END_TIME, oldWorkEndTime, workEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorityName() {
		return authorityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorityName(String newAuthorityName) {
		String oldAuthorityName = authorityName;
		authorityName = newAuthorityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__AUTHORITY_NAME, oldAuthorityName, authorityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment getConductingEquipment() {
		if (conductingEquipment != null && conductingEquipment.eIsProxy()) {
			InternalEObject oldConductingEquipment = (InternalEObject)conductingEquipment;
			conductingEquipment = (ConductingEquipment)eResolveProxy(oldConductingEquipment);
			if (conductingEquipment != oldConductingEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT, oldConductingEquipment, conductingEquipment));
			}
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment basicGetConductingEquipment() {
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductingEquipment(ConductingEquipment newConductingEquipment, NotificationChain msgs) {
		ConductingEquipment oldConductingEquipment = conductingEquipment;
		conductingEquipment = newConductingEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT, oldConductingEquipment, newConductingEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductingEquipment(ConductingEquipment newConductingEquipment) {
		if (newConductingEquipment != conductingEquipment) {
			NotificationChain msgs = null;
			if (conductingEquipment != null)
				msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS, ConductingEquipment.class, msgs);
			if (newConductingEquipment != null)
				msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS, ConductingEquipment.class, msgs);
			msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT, newConductingEquipment, newConductingEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPhaseCheckReqFlag() {
		return phaseCheckReqFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCheckReqFlag(boolean newPhaseCheckReqFlag) {
		boolean oldPhaseCheckReqFlag = phaseCheckReqFlag;
		phaseCheckReqFlag = newPhaseCheckReqFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG, oldPhaseCheckReqFlag, phaseCheckReqFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeenergizeReqFlag() {
		return deenergizeReqFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeenergizeReqFlag(boolean newDeenergizeReqFlag) {
		boolean oldDeenergizeReqFlag = deenergizeReqFlag;
		deenergizeReqFlag = newDeenergizeReqFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__DEENERGIZE_REQ_FLAG, oldDeenergizeReqFlag, deenergizeReqFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWorkStartTime() {
		return workStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkStartTime(Date newWorkStartTime) {
		Date oldWorkStartTime = workStartTime;
		workStartTime = newWorkStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__WORK_START_TIME, oldWorkStartTime, workStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkDescription() {
		return workDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkDescription(String newWorkDescription) {
		String oldWorkDescription = workDescription;
		workDescription = newWorkDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.CLEARANCE_TAG__WORK_DESCRIPTION, oldWorkDescription, workDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				if (safetyDocument != null)
					msgs = ((InternalEObject)safetyDocument).eInverseRemove(this, InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS, SafetyDocument.class, msgs);
				return basicSetSafetyDocument((SafetyDocument)otherEnd, msgs);
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				if (clearanceTagType != null)
					msgs = ((InternalEObject)clearanceTagType).eInverseRemove(this, OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS, ClearanceTagType.class, msgs);
				return basicSetClearanceTagType((ClearanceTagType)otherEnd, msgs);
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				if (conductingEquipment != null)
					msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS, ConductingEquipment.class, msgs);
				return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
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
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				return basicSetSafetyDocument(null, msgs);
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				return basicSetClearanceTagType(null, msgs);
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				return basicSetConductingEquipment(null, msgs);
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
			case OutagePackage.CLEARANCE_TAG__GROUND_REQ_FLAG:
				return isGroundReqFlag();
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				if (resolve) return getSafetyDocument();
				return basicGetSafetyDocument();
			case OutagePackage.CLEARANCE_TAG__TAG_ISSUE_TIME:
				return getTagIssueTime();
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				if (resolve) return getClearanceTagType();
				return basicGetClearanceTagType();
			case OutagePackage.CLEARANCE_TAG__WORK_END_TIME:
				return getWorkEndTime();
			case OutagePackage.CLEARANCE_TAG__AUTHORITY_NAME:
				return getAuthorityName();
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				if (resolve) return getConductingEquipment();
				return basicGetConductingEquipment();
			case OutagePackage.CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG:
				return isPhaseCheckReqFlag();
			case OutagePackage.CLEARANCE_TAG__DEENERGIZE_REQ_FLAG:
				return isDeenergizeReqFlag();
			case OutagePackage.CLEARANCE_TAG__WORK_START_TIME:
				return getWorkStartTime();
			case OutagePackage.CLEARANCE_TAG__WORK_DESCRIPTION:
				return getWorkDescription();
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
			case OutagePackage.CLEARANCE_TAG__GROUND_REQ_FLAG:
				setGroundReqFlag((Boolean)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				setSafetyDocument((SafetyDocument)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__TAG_ISSUE_TIME:
				setTagIssueTime((Date)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				setClearanceTagType((ClearanceTagType)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_END_TIME:
				setWorkEndTime((Date)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__AUTHORITY_NAME:
				setAuthorityName((String)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG:
				setPhaseCheckReqFlag((Boolean)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__DEENERGIZE_REQ_FLAG:
				setDeenergizeReqFlag((Boolean)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_START_TIME:
				setWorkStartTime((Date)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_DESCRIPTION:
				setWorkDescription((String)newValue);
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
			case OutagePackage.CLEARANCE_TAG__GROUND_REQ_FLAG:
				setGroundReqFlag(GROUND_REQ_FLAG_EDEFAULT);
				return;
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				setSafetyDocument((SafetyDocument)null);
				return;
			case OutagePackage.CLEARANCE_TAG__TAG_ISSUE_TIME:
				setTagIssueTime(TAG_ISSUE_TIME_EDEFAULT);
				return;
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				setClearanceTagType((ClearanceTagType)null);
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_END_TIME:
				setWorkEndTime(WORK_END_TIME_EDEFAULT);
				return;
			case OutagePackage.CLEARANCE_TAG__AUTHORITY_NAME:
				setAuthorityName(AUTHORITY_NAME_EDEFAULT);
				return;
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)null);
				return;
			case OutagePackage.CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG:
				setPhaseCheckReqFlag(PHASE_CHECK_REQ_FLAG_EDEFAULT);
				return;
			case OutagePackage.CLEARANCE_TAG__DEENERGIZE_REQ_FLAG:
				setDeenergizeReqFlag(DEENERGIZE_REQ_FLAG_EDEFAULT);
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_START_TIME:
				setWorkStartTime(WORK_START_TIME_EDEFAULT);
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_DESCRIPTION:
				setWorkDescription(WORK_DESCRIPTION_EDEFAULT);
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
			case OutagePackage.CLEARANCE_TAG__GROUND_REQ_FLAG:
				return groundReqFlag != GROUND_REQ_FLAG_EDEFAULT;
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				return safetyDocument != null;
			case OutagePackage.CLEARANCE_TAG__TAG_ISSUE_TIME:
				return TAG_ISSUE_TIME_EDEFAULT == null ? tagIssueTime != null : !TAG_ISSUE_TIME_EDEFAULT.equals(tagIssueTime);
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				return clearanceTagType != null;
			case OutagePackage.CLEARANCE_TAG__WORK_END_TIME:
				return WORK_END_TIME_EDEFAULT == null ? workEndTime != null : !WORK_END_TIME_EDEFAULT.equals(workEndTime);
			case OutagePackage.CLEARANCE_TAG__AUTHORITY_NAME:
				return AUTHORITY_NAME_EDEFAULT == null ? authorityName != null : !AUTHORITY_NAME_EDEFAULT.equals(authorityName);
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null;
			case OutagePackage.CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG:
				return phaseCheckReqFlag != PHASE_CHECK_REQ_FLAG_EDEFAULT;
			case OutagePackage.CLEARANCE_TAG__DEENERGIZE_REQ_FLAG:
				return deenergizeReqFlag != DEENERGIZE_REQ_FLAG_EDEFAULT;
			case OutagePackage.CLEARANCE_TAG__WORK_START_TIME:
				return WORK_START_TIME_EDEFAULT == null ? workStartTime != null : !WORK_START_TIME_EDEFAULT.equals(workStartTime);
			case OutagePackage.CLEARANCE_TAG__WORK_DESCRIPTION:
				return WORK_DESCRIPTION_EDEFAULT == null ? workDescription != null : !WORK_DESCRIPTION_EDEFAULT.equals(workDescription);
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
		result.append(" (groundReqFlag: ");
		result.append(groundReqFlag);
		result.append(", tagIssueTime: ");
		result.append(tagIssueTime);
		result.append(", workEndTime: ");
		result.append(workEndTime);
		result.append(", authorityName: ");
		result.append(authorityName);
		result.append(", phaseCheckReqFlag: ");
		result.append(phaseCheckReqFlag);
		result.append(", deenergizeReqFlag: ");
		result.append(deenergizeReqFlag);
		result.append(", workStartTime: ");
		result.append(workStartTime);
		result.append(", workDescription: ");
		result.append(workDescription);
		result.append(')');
		return result.toString();
	}

} //ClearanceTagImpl
