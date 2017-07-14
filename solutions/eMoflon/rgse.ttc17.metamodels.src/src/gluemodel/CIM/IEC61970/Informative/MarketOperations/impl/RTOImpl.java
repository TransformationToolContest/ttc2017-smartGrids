/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Market;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RTOImpl#getMarkets <em>Markets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RTOImpl#getSecurityConstraints <em>Security Constraints</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RTOImpl#getResourceGroupReqs <em>Resource Group Reqs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RTOImpl#getSecurityConstraintsLinear <em>Security Constraints Linear</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RTOImpl#getPnodes <em>Pnodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RTOImpl extends ErpOrganisationImpl implements RTO {
	/**
	 * The cached value of the '{@link #getMarkets() <em>Markets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkets()
	 * @generated
	 * @ordered
	 */
	protected EList<Market> markets;

	/**
	 * The cached value of the '{@link #getSecurityConstraints() <em>Security Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityConstraints> securityConstraints;

	/**
	 * The cached value of the '{@link #getResourceGroupReqs() <em>Resource Group Reqs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroupReqs()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroupReq> resourceGroupReqs;

	/**
	 * The cached value of the '{@link #getSecurityConstraintsLinear() <em>Security Constraints Linear</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityConstraintsLinear()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityConstraintSum> securityConstraintsLinear;

	/**
	 * The cached value of the '{@link #getPnodes() <em>Pnodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pnode> pnodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.RTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Market> getMarkets() {
		if (markets == null) {
			markets = new EObjectWithInverseResolvingEList<Market>(Market.class, this, MarketOperationsPackage.RTO__MARKETS, MarketOperationsPackage.MARKET__RTO);
		}
		return markets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityConstraints> getSecurityConstraints() {
		if (securityConstraints == null) {
			securityConstraints = new EObjectWithInverseResolvingEList<SecurityConstraints>(SecurityConstraints.class, this, MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS, MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO);
		}
		return securityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceGroupReq> getResourceGroupReqs() {
		if (resourceGroupReqs == null) {
			resourceGroupReqs = new EObjectWithInverseResolvingEList.ManyInverse<ResourceGroupReq>(ResourceGroupReq.class, this, MarketOperationsPackage.RTO__RESOURCE_GROUP_REQS, MarketOperationsPackage.RESOURCE_GROUP_REQ__RT_OS);
		}
		return resourceGroupReqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityConstraintSum> getSecurityConstraintsLinear() {
		if (securityConstraintsLinear == null) {
			securityConstraintsLinear = new EObjectWithInverseResolvingEList<SecurityConstraintSum>(SecurityConstraintSum.class, this, MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO);
		}
		return securityConstraintsLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pnode> getPnodes() {
		if (pnodes == null) {
			pnodes = new EObjectWithInverseResolvingEList<Pnode>(Pnode.class, this, MarketOperationsPackage.RTO__PNODES, MarketOperationsPackage.PNODE__RTO);
		}
		return pnodes;
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
			case MarketOperationsPackage.RTO__MARKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarkets()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecurityConstraints()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.RTO__RESOURCE_GROUP_REQS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceGroupReqs()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecurityConstraintsLinear()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.RTO__PNODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPnodes()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.RTO__MARKETS:
				return ((InternalEList<?>)getMarkets()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS:
				return ((InternalEList<?>)getSecurityConstraints()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.RTO__RESOURCE_GROUP_REQS:
				return ((InternalEList<?>)getResourceGroupReqs()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR:
				return ((InternalEList<?>)getSecurityConstraintsLinear()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.RTO__PNODES:
				return ((InternalEList<?>)getPnodes()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.RTO__MARKETS:
				return getMarkets();
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS:
				return getSecurityConstraints();
			case MarketOperationsPackage.RTO__RESOURCE_GROUP_REQS:
				return getResourceGroupReqs();
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR:
				return getSecurityConstraintsLinear();
			case MarketOperationsPackage.RTO__PNODES:
				return getPnodes();
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
			case MarketOperationsPackage.RTO__MARKETS:
				getMarkets().clear();
				getMarkets().addAll((Collection<? extends Market>)newValue);
				return;
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS:
				getSecurityConstraints().clear();
				getSecurityConstraints().addAll((Collection<? extends SecurityConstraints>)newValue);
				return;
			case MarketOperationsPackage.RTO__RESOURCE_GROUP_REQS:
				getResourceGroupReqs().clear();
				getResourceGroupReqs().addAll((Collection<? extends ResourceGroupReq>)newValue);
				return;
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR:
				getSecurityConstraintsLinear().clear();
				getSecurityConstraintsLinear().addAll((Collection<? extends SecurityConstraintSum>)newValue);
				return;
			case MarketOperationsPackage.RTO__PNODES:
				getPnodes().clear();
				getPnodes().addAll((Collection<? extends Pnode>)newValue);
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
			case MarketOperationsPackage.RTO__MARKETS:
				getMarkets().clear();
				return;
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS:
				getSecurityConstraints().clear();
				return;
			case MarketOperationsPackage.RTO__RESOURCE_GROUP_REQS:
				getResourceGroupReqs().clear();
				return;
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR:
				getSecurityConstraintsLinear().clear();
				return;
			case MarketOperationsPackage.RTO__PNODES:
				getPnodes().clear();
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
			case MarketOperationsPackage.RTO__MARKETS:
				return markets != null && !markets.isEmpty();
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS:
				return securityConstraints != null && !securityConstraints.isEmpty();
			case MarketOperationsPackage.RTO__RESOURCE_GROUP_REQS:
				return resourceGroupReqs != null && !resourceGroupReqs.isEmpty();
			case MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR:
				return securityConstraintsLinear != null && !securityConstraintsLinear.isEmpty();
			case MarketOperationsPackage.RTO__PNODES:
				return pnodes != null && !pnodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RTOImpl
