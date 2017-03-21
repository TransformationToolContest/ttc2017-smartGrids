/**
 */
package CIM.IEC61970.Informative.InfOperations.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.ChangeSet;
import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.LandBase;
import CIM.IEC61970.Informative.InfOperations.NetworkDataSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.ChangeSetImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.ChangeSetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.ChangeSetImpl#getLandBases <em>Land Bases</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.ChangeSetImpl#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.ChangeSetImpl#getDocuments <em>Documents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeSetImpl extends IdentifiedObjectImpl implements ChangeSet {
	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeItem> changeItems;

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
	 * The cached value of the '{@link #getLandBases() <em>Land Bases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandBases()
	 * @generated
	 * @ordered
	 */
	protected EList<LandBase> landBases;

	/**
	 * The cached value of the '{@link #getNetworkDataSets() <em>Network Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkDataSet> networkDataSets;

	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.CHANGE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__CHANGE_SET);
		}
		return changeItems;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.CHANGE_SET__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.CHANGE_SET__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LandBase> getLandBases() {
		if (landBases == null) {
			landBases = new EObjectResolvingEList<LandBase>(LandBase.class, this, InfOperationsPackage.CHANGE_SET__LAND_BASES);
		}
		return landBases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkDataSet> getNetworkDataSets() {
		if (networkDataSets == null) {
			networkDataSets = new EObjectWithInverseResolvingEList.ManyInverse<NetworkDataSet>(NetworkDataSet.class, this, InfOperationsPackage.CHANGE_SET__NETWORK_DATA_SETS, InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS);
		}
		return networkDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new EObjectWithInverseResolvingEList.ManyInverse<Document>(Document.class, this, InfOperationsPackage.CHANGE_SET__DOCUMENTS, CommonPackage.DOCUMENT__CHANGE_SETS);
		}
		return documents;
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
			case InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.CHANGE_SET__NETWORK_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworkDataSets()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.CHANGE_SET__DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocuments()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CHANGE_SET__NETWORK_DATA_SETS:
				return ((InternalEList<?>)getNetworkDataSets()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CHANGE_SET__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS:
				return getChangeItems();
			case InfOperationsPackage.CHANGE_SET__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfOperationsPackage.CHANGE_SET__LAND_BASES:
				return getLandBases();
			case InfOperationsPackage.CHANGE_SET__NETWORK_DATA_SETS:
				return getNetworkDataSets();
			case InfOperationsPackage.CHANGE_SET__DOCUMENTS:
				return getDocuments();
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
			case InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case InfOperationsPackage.CHANGE_SET__STATUS:
				setStatus((Status)newValue);
				return;
			case InfOperationsPackage.CHANGE_SET__LAND_BASES:
				getLandBases().clear();
				getLandBases().addAll((Collection<? extends LandBase>)newValue);
				return;
			case InfOperationsPackage.CHANGE_SET__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				getNetworkDataSets().addAll((Collection<? extends NetworkDataSet>)newValue);
				return;
			case InfOperationsPackage.CHANGE_SET__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends Document>)newValue);
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
			case InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case InfOperationsPackage.CHANGE_SET__STATUS:
				setStatus((Status)null);
				return;
			case InfOperationsPackage.CHANGE_SET__LAND_BASES:
				getLandBases().clear();
				return;
			case InfOperationsPackage.CHANGE_SET__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				return;
			case InfOperationsPackage.CHANGE_SET__DOCUMENTS:
				getDocuments().clear();
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
			case InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case InfOperationsPackage.CHANGE_SET__STATUS:
				return status != null;
			case InfOperationsPackage.CHANGE_SET__LAND_BASES:
				return landBases != null && !landBases.isEmpty();
			case InfOperationsPackage.CHANGE_SET__NETWORK_DATA_SETS:
				return networkDataSets != null && !networkDataSets.isEmpty();
			case InfOperationsPackage.CHANGE_SET__DOCUMENTS:
				return documents != null && !documents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangeSetImpl
