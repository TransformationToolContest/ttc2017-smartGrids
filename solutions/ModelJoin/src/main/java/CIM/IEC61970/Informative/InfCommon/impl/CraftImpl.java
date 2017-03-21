/**
 */
package CIM.IEC61970.Informative.InfCommon.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfCommon.Craft;
import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import CIM.IEC61970.Informative.InfCommon.Skill;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.Capability;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>Craft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.CraftImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.CraftImpl#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.CraftImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.CraftImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.CraftImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CraftImpl extends IdentifiedObjectImpl implements Craft {
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
	 * The cached value of the '{@link #getErpPersons() <em>Erp Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPerson> erpPersons;

	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<Skill> skills;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CraftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.CRAFT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.CRAFT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.CRAFT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new EObjectWithInverseResolvingEList.ManyInverse<ErpPerson>(ErpPerson.class, this, InfCommonPackage.CRAFT__ERP_PERSONS, InfERPSupportPackage.ERP_PERSON__CRAFTS);
		}
		return erpPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Skill> getSkills() {
		if (skills == null) {
			skills = new EObjectWithInverseResolvingEList.ManyInverse<Skill>(Skill.class, this, InfCommonPackage.CRAFT__SKILLS, InfCommonPackage.SKILL__CRAFTS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, InfCommonPackage.CRAFT__CAPABILITIES, InfWorkPackage.CAPABILITY__CRAFTS);
		}
		return capabilities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.CRAFT__CATEGORY, oldCategory, category));
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
			case InfCommonPackage.CRAFT__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
			case InfCommonPackage.CRAFT__SKILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSkills()).basicAdd(otherEnd, msgs);
			case InfCommonPackage.CRAFT__CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilities()).basicAdd(otherEnd, msgs);
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
			case InfCommonPackage.CRAFT__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
			case InfCommonPackage.CRAFT__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case InfCommonPackage.CRAFT__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case InfCommonPackage.CRAFT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfCommonPackage.CRAFT__ERP_PERSONS:
				return getErpPersons();
			case InfCommonPackage.CRAFT__SKILLS:
				return getSkills();
			case InfCommonPackage.CRAFT__CAPABILITIES:
				return getCapabilities();
			case InfCommonPackage.CRAFT__CATEGORY:
				return getCategory();
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
			case InfCommonPackage.CRAFT__STATUS:
				setStatus((Status)newValue);
				return;
			case InfCommonPackage.CRAFT__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case InfCommonPackage.CRAFT__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case InfCommonPackage.CRAFT__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case InfCommonPackage.CRAFT__CATEGORY:
				setCategory((String)newValue);
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
			case InfCommonPackage.CRAFT__STATUS:
				setStatus((Status)null);
				return;
			case InfCommonPackage.CRAFT__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case InfCommonPackage.CRAFT__SKILLS:
				getSkills().clear();
				return;
			case InfCommonPackage.CRAFT__CAPABILITIES:
				getCapabilities().clear();
				return;
			case InfCommonPackage.CRAFT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
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
			case InfCommonPackage.CRAFT__STATUS:
				return status != null;
			case InfCommonPackage.CRAFT__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case InfCommonPackage.CRAFT__SKILLS:
				return skills != null && !skills.isEmpty();
			case InfCommonPackage.CRAFT__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case InfCommonPackage.CRAFT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
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
		result.append(" (category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //CraftImpl
