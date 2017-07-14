/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor;
import gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactorKind;
import gluemodel.CIM.IEC61970.Informative.InfWork.Design;
import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation;
import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>Condition Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl#getCfValue <em>Cf Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl#getDesignLocations <em>Design Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl#getDesigns <em>Designs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionFactorImpl extends IdentifiedObjectImpl implements ConditionFactor {
	/**
	 * The default value of the '{@link #getCfValue() <em>Cf Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CF_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCfValue() <em>Cf Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfValue()
	 * @generated
	 * @ordered
	 */
	protected String cfValue = CF_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDesignLocations() <em>Design Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocation> designLocations;

	/**
	 * The cached value of the '{@link #getDesignLocationCUs() <em>Design Location CUs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocationCUs()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocationCU> designLocationCUs;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionFactorKind KIND_EDEFAULT = ConditionFactorKind.LABOR;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConditionFactorKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDesigns() <em>Designs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Design> designs;

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
	protected ConditionFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CONDITION_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCfValue() {
		return cfValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCfValue(String newCfValue) {
		String oldCfValue = cfValue;
		cfValue = newCfValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONDITION_FACTOR__CF_VALUE, oldCfValue, cfValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocation> getDesignLocations() {
		if (designLocations == null) {
			designLocations = new EObjectWithInverseResolvingEList.ManyInverse<DesignLocation>(DesignLocation.class, this, InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATIONS, InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS);
		}
		return designLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationCUs() {
		if (designLocationCUs == null) {
			designLocationCUs = new EObjectWithInverseResolvingEList.ManyInverse<DesignLocationCU>(DesignLocationCU.class, this, InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATION_CUS, InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS);
		}
		return designLocationCUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionFactorKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConditionFactorKind newKind) {
		ConditionFactorKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONDITION_FACTOR__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Design> getDesigns() {
		if (designs == null) {
			designs = new EObjectWithInverseResolvingEList.ManyInverse<Design>(Design.class, this, InfWorkPackage.CONDITION_FACTOR__DESIGNS, InfWorkPackage.DESIGN__CONDITION_FACTORS);
		}
		return designs;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CONDITION_FACTOR__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONDITION_FACTOR__STATUS, oldStatus, status));
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
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATION_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CONDITION_FACTOR__DESIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesigns()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATIONS:
				return ((InternalEList<?>)getDesignLocations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATION_CUS:
				return ((InternalEList<?>)getDesignLocationCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CONDITION_FACTOR__DESIGNS:
				return ((InternalEList<?>)getDesigns()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CONDITION_FACTOR__CF_VALUE:
				return getCfValue();
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATIONS:
				return getDesignLocations();
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATION_CUS:
				return getDesignLocationCUs();
			case InfWorkPackage.CONDITION_FACTOR__KIND:
				return getKind();
			case InfWorkPackage.CONDITION_FACTOR__DESIGNS:
				return getDesigns();
			case InfWorkPackage.CONDITION_FACTOR__STATUS:
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
			case InfWorkPackage.CONDITION_FACTOR__CF_VALUE:
				setCfValue((String)newValue);
				return;
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				getDesignLocations().addAll((Collection<? extends DesignLocation>)newValue);
				return;
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				getDesignLocationCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.CONDITION_FACTOR__KIND:
				setKind((ConditionFactorKind)newValue);
				return;
			case InfWorkPackage.CONDITION_FACTOR__DESIGNS:
				getDesigns().clear();
				getDesigns().addAll((Collection<? extends Design>)newValue);
				return;
			case InfWorkPackage.CONDITION_FACTOR__STATUS:
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
			case InfWorkPackage.CONDITION_FACTOR__CF_VALUE:
				setCfValue(CF_VALUE_EDEFAULT);
				return;
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				return;
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				return;
			case InfWorkPackage.CONDITION_FACTOR__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfWorkPackage.CONDITION_FACTOR__DESIGNS:
				getDesigns().clear();
				return;
			case InfWorkPackage.CONDITION_FACTOR__STATUS:
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
			case InfWorkPackage.CONDITION_FACTOR__CF_VALUE:
				return CF_VALUE_EDEFAULT == null ? cfValue != null : !CF_VALUE_EDEFAULT.equals(cfValue);
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATIONS:
				return designLocations != null && !designLocations.isEmpty();
			case InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATION_CUS:
				return designLocationCUs != null && !designLocationCUs.isEmpty();
			case InfWorkPackage.CONDITION_FACTOR__KIND:
				return kind != KIND_EDEFAULT;
			case InfWorkPackage.CONDITION_FACTOR__DESIGNS:
				return designs != null && !designs.isEmpty();
			case InfWorkPackage.CONDITION_FACTOR__STATUS:
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
		result.append(" (cfValue: ");
		result.append(cfValue);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ConditionFactorImpl
