/**
 */
package CIM.IEC61970.Informative.Financial.impl;

import CIM.IEC61968.Common.impl.AgreementImpl;

import CIM.IEC61970.Informative.Financial.FinancialPackage;
import CIM.IEC61970.Informative.Financial.IntSchedAgreement;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

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
 * An implementation of the model object '<em><b>Int Sched Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.IntSchedAgreementImpl#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.IntSchedAgreementImpl#getDefaultIntegrationMethod <em>Default Integration Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntSchedAgreementImpl extends AgreementImpl implements IntSchedAgreement {
	/**
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpOrganisation> organisations;

	/**
	 * The default value of the '{@link #getDefaultIntegrationMethod() <em>Default Integration Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIntegrationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEFAULT_INTEGRATION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultIntegrationMethod() <em>Default Integration Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIntegrationMethod()
	 * @generated
	 * @ordered
	 */
	protected Object defaultIntegrationMethod = DEFAULT_INTEGRATION_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntSchedAgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancialPackage.Literals.INT_SCHED_AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpOrganisation> getOrganisations() {
		if (organisations == null) {
			organisations = new EObjectWithInverseResolvingEList.ManyInverse<ErpOrganisation>(ErpOrganisation.class, this, FinancialPackage.INT_SCHED_AGREEMENT__ORGANISATIONS, InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT);
		}
		return organisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDefaultIntegrationMethod() {
		return defaultIntegrationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultIntegrationMethod(Object newDefaultIntegrationMethod) {
		Object oldDefaultIntegrationMethod = defaultIntegrationMethod;
		defaultIntegrationMethod = newDefaultIntegrationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancialPackage.INT_SCHED_AGREEMENT__DEFAULT_INTEGRATION_METHOD, oldDefaultIntegrationMethod, defaultIntegrationMethod));
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
			case FinancialPackage.INT_SCHED_AGREEMENT__ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganisations()).basicAdd(otherEnd, msgs);
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
			case FinancialPackage.INT_SCHED_AGREEMENT__ORGANISATIONS:
				return ((InternalEList<?>)getOrganisations()).basicRemove(otherEnd, msgs);
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
			case FinancialPackage.INT_SCHED_AGREEMENT__ORGANISATIONS:
				return getOrganisations();
			case FinancialPackage.INT_SCHED_AGREEMENT__DEFAULT_INTEGRATION_METHOD:
				return getDefaultIntegrationMethod();
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
			case FinancialPackage.INT_SCHED_AGREEMENT__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends ErpOrganisation>)newValue);
				return;
			case FinancialPackage.INT_SCHED_AGREEMENT__DEFAULT_INTEGRATION_METHOD:
				setDefaultIntegrationMethod(newValue);
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
			case FinancialPackage.INT_SCHED_AGREEMENT__ORGANISATIONS:
				getOrganisations().clear();
				return;
			case FinancialPackage.INT_SCHED_AGREEMENT__DEFAULT_INTEGRATION_METHOD:
				setDefaultIntegrationMethod(DEFAULT_INTEGRATION_METHOD_EDEFAULT);
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
			case FinancialPackage.INT_SCHED_AGREEMENT__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
			case FinancialPackage.INT_SCHED_AGREEMENT__DEFAULT_INTEGRATION_METHOD:
				return DEFAULT_INTEGRATION_METHOD_EDEFAULT == null ? defaultIntegrationMethod != null : !DEFAULT_INTEGRATION_METHOD_EDEFAULT.equals(defaultIntegrationMethod);
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
		result.append(" (defaultIntegrationMethod: ");
		result.append(defaultIntegrationMethod);
		result.append(')');
		return result.toString();
	}

} //IntSchedAgreementImpl
