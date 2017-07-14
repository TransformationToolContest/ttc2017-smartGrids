/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedger;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Ledger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerImpl#getErpLedgerEntries <em>Erp Ledger Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpLedgerImpl extends DocumentImpl implements ErpLedger {
	/**
	 * The cached value of the '{@link #getErpLedgerEntries() <em>Erp Ledger Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpLedgerEntry> erpLedgerEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpLedgerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_LEDGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpLedgerEntry> getErpLedgerEntries() {
		if (erpLedgerEntries == null) {
			erpLedgerEntries = new EObjectWithInverseResolvingEList<ErpLedgerEntry>(ErpLedgerEntry.class, this, InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER);
		}
		return erpLedgerEntries;
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
			case InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpLedgerEntries()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES:
				return ((InternalEList<?>)getErpLedgerEntries()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES:
				return getErpLedgerEntries();
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
			case InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES:
				getErpLedgerEntries().clear();
				getErpLedgerEntries().addAll((Collection<? extends ErpLedgerEntry>)newValue);
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
			case InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES:
				getErpLedgerEntries().clear();
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
			case InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES:
				return erpLedgerEntries != null && !erpLedgerEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpLedgerImpl
