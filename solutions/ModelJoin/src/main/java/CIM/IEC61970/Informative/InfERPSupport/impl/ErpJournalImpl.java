/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpJournal;
import CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Journal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalImpl#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpJournalImpl extends DocumentImpl implements ErpJournal {
	/**
	 * The cached value of the '{@link #getErpJournalEntries() <em>Erp Journal Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJournalEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpJournalEntry> erpJournalEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpJournalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_JOURNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpJournalEntry> getErpJournalEntries() {
		if (erpJournalEntries == null) {
			erpJournalEntries = new EObjectWithInverseResolvingEList<ErpJournalEntry>(ErpJournalEntry.class, this, InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL);
		}
		return erpJournalEntries;
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
			case InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpJournalEntries()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<?>)getErpJournalEntries()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES:
				return getErpJournalEntries();
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
			case InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
				getErpJournalEntries().addAll((Collection<? extends ErpJournalEntry>)newValue);
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
			case InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
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
			case InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES:
				return erpJournalEntries != null && !erpJournalEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpJournalImpl
