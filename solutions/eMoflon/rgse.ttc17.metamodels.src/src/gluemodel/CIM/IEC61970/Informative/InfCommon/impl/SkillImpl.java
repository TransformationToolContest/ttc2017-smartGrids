/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Craft;
import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import gluemodel.CIM.IEC61970.Informative.InfCommon.Skill;
import gluemodel.CIM.IEC61970.Informative.InfCommon.SkillLevelKind;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement;

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
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.SkillImpl#getCertificationPeriod <em>Certification Period</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.SkillImpl#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.SkillImpl#getCrafts <em>Crafts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.SkillImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.SkillImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.SkillImpl#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillImpl extends DocumentImpl implements Skill {
	/**
	 * The cached value of the '{@link #getCertificationPeriod() <em>Certification Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificationPeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval certificationPeriod;

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
	 * The cached value of the '{@link #getCrafts() <em>Crafts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrafts()
	 * @generated
	 * @ordered
	 */
	protected EList<Craft> crafts;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final SkillLevelKind LEVEL_EDEFAULT = SkillLevelKind.STANDARD;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected SkillLevelKind level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date EFFECTIVE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date effectiveDateTime = EFFECTIVE_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQualificationRequirements() <em>Qualification Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<QualificationRequirement> qualificationRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.SKILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getCertificationPeriod() {
		if (certificationPeriod != null && certificationPeriod.eIsProxy()) {
			InternalEObject oldCertificationPeriod = (InternalEObject)certificationPeriod;
			certificationPeriod = (DateTimeInterval)eResolveProxy(oldCertificationPeriod);
			if (certificationPeriod != oldCertificationPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SKILL__CERTIFICATION_PERIOD, oldCertificationPeriod, certificationPeriod));
			}
		}
		return certificationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetCertificationPeriod() {
		return certificationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificationPeriod(DateTimeInterval newCertificationPeriod) {
		DateTimeInterval oldCertificationPeriod = certificationPeriod;
		certificationPeriod = newCertificationPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SKILL__CERTIFICATION_PERIOD, oldCertificationPeriod, certificationPeriod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SKILL__ERP_PERSON, oldErpPerson, erpPerson));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.SKILL__ERP_PERSON, oldErpPerson, newErpPerson);
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
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__SKILLS, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__SKILLS, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SKILL__ERP_PERSON, newErpPerson, newErpPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Craft> getCrafts() {
		if (crafts == null) {
			crafts = new EObjectWithInverseResolvingEList.ManyInverse<Craft>(Craft.class, this, InfCommonPackage.SKILL__CRAFTS, InfCommonPackage.CRAFT__SKILLS);
		}
		return crafts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillLevelKind getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(SkillLevelKind newLevel) {
		SkillLevelKind oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SKILL__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDateTime(Date newEffectiveDateTime) {
		Date oldEffectiveDateTime = effectiveDateTime;
		effectiveDateTime = newEffectiveDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SKILL__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, effectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualificationRequirement> getQualificationRequirements() {
		if (qualificationRequirements == null) {
			qualificationRequirements = new EObjectWithInverseResolvingEList.ManyInverse<QualificationRequirement>(QualificationRequirement.class, this, InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS, InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS);
		}
		return qualificationRequirements;
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
			case InfCommonPackage.SKILL__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__SKILLS, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
			case InfCommonPackage.SKILL__CRAFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrafts()).basicAdd(otherEnd, msgs);
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualificationRequirements()).basicAdd(otherEnd, msgs);
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
			case InfCommonPackage.SKILL__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
			case InfCommonPackage.SKILL__CRAFTS:
				return ((InternalEList<?>)getCrafts()).basicRemove(otherEnd, msgs);
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<?>)getQualificationRequirements()).basicRemove(otherEnd, msgs);
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
			case InfCommonPackage.SKILL__CERTIFICATION_PERIOD:
				if (resolve) return getCertificationPeriod();
				return basicGetCertificationPeriod();
			case InfCommonPackage.SKILL__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
			case InfCommonPackage.SKILL__CRAFTS:
				return getCrafts();
			case InfCommonPackage.SKILL__LEVEL:
				return getLevel();
			case InfCommonPackage.SKILL__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				return getQualificationRequirements();
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
			case InfCommonPackage.SKILL__CERTIFICATION_PERIOD:
				setCertificationPeriod((DateTimeInterval)newValue);
				return;
			case InfCommonPackage.SKILL__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
				return;
			case InfCommonPackage.SKILL__CRAFTS:
				getCrafts().clear();
				getCrafts().addAll((Collection<? extends Craft>)newValue);
				return;
			case InfCommonPackage.SKILL__LEVEL:
				setLevel((SkillLevelKind)newValue);
				return;
			case InfCommonPackage.SKILL__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((Date)newValue);
				return;
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				getQualificationRequirements().addAll((Collection<? extends QualificationRequirement>)newValue);
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
			case InfCommonPackage.SKILL__CERTIFICATION_PERIOD:
				setCertificationPeriod((DateTimeInterval)null);
				return;
			case InfCommonPackage.SKILL__ERP_PERSON:
				setErpPerson((ErpPerson)null);
				return;
			case InfCommonPackage.SKILL__CRAFTS:
				getCrafts().clear();
				return;
			case InfCommonPackage.SKILL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case InfCommonPackage.SKILL__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime(EFFECTIVE_DATE_TIME_EDEFAULT);
				return;
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
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
			case InfCommonPackage.SKILL__CERTIFICATION_PERIOD:
				return certificationPeriod != null;
			case InfCommonPackage.SKILL__ERP_PERSON:
				return erpPerson != null;
			case InfCommonPackage.SKILL__CRAFTS:
				return crafts != null && !crafts.isEmpty();
			case InfCommonPackage.SKILL__LEVEL:
				return level != LEVEL_EDEFAULT;
			case InfCommonPackage.SKILL__EFFECTIVE_DATE_TIME:
				return EFFECTIVE_DATE_TIME_EDEFAULT == null ? effectiveDateTime != null : !EFFECTIVE_DATE_TIME_EDEFAULT.equals(effectiveDateTime);
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				return qualificationRequirements != null && !qualificationRequirements.isEmpty();
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
		result.append(" (level: ");
		result.append(level);
		result.append(", effectiveDateTime: ");
		result.append(effectiveDateTime);
		result.append(')');
		return result.toString();
	}

} //SkillImpl
