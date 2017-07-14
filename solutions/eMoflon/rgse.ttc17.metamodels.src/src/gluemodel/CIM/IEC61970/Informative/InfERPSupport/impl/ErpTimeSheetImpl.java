/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeSheet;
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
 * An implementation of the model object '<em><b>Erp Time Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeSheetImpl#getErpTimeEntries <em>Erp Time Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpTimeSheetImpl extends DocumentImpl implements ErpTimeSheet {
	/**
	 * The cached value of the '{@link #getErpTimeEntries() <em>Erp Time Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpTimeEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpTimeEntry> erpTimeEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpTimeSheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_TIME_SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpTimeEntry> getErpTimeEntries() {
		if (erpTimeEntries == null) {
			erpTimeEntries = new EObjectWithInverseResolvingEList<ErpTimeEntry>(ErpTimeEntry.class, this, InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES, InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET);
		}
		return erpTimeEntries;
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
			case InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpTimeEntries()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES:
				return ((InternalEList<?>)getErpTimeEntries()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES:
				return getErpTimeEntries();
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
			case InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES:
				getErpTimeEntries().clear();
				getErpTimeEntries().addAll((Collection<? extends ErpTimeEntry>)newValue);
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
			case InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES:
				getErpTimeEntries().clear();
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
			case InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES:
				return erpTimeEntries != null && !erpTimeEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpTimeSheetImpl
