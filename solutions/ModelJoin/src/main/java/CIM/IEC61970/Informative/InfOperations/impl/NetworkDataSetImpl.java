/**
 */
package CIM.IEC61970.Informative.InfOperations.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.ChangeSet;
import CIM.IEC61970.Informative.InfOperations.CircuitSection;
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
 * An implementation of the model object '<em><b>Network Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl#getCircuitSections <em>Circuit Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl#getChangeSets <em>Change Sets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl#getLandBases <em>Land Bases</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.NetworkDataSetImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkDataSetImpl extends IdentifiedObjectImpl implements NetworkDataSet {
	/**
	 * The cached value of the '{@link #getCircuitSections() <em>Circuit Sections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitSections()
	 * @generated
	 * @ordered
	 */
	protected EList<CircuitSection> circuitSections;

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
	 * The cached value of the '{@link #getChangeSets() <em>Change Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeSet> changeSets;

	/**
	 * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResources;

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
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

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
	protected NetworkDataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.NETWORK_DATA_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircuitSection> getCircuitSections() {
		if (circuitSections == null) {
			circuitSections = new EObjectWithInverseResolvingEList.ManyInverse<CircuitSection>(CircuitSection.class, this, InfOperationsPackage.NETWORK_DATA_SET__CIRCUIT_SECTIONS, InfOperationsPackage.CIRCUIT_SECTION__NETWORK_DATA_SETS);
		}
		return circuitSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__NETWORK_DATA_SET);
		}
		return changeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeSet> getChangeSets() {
		if (changeSets == null) {
			changeSets = new EObjectWithInverseResolvingEList.ManyInverse<ChangeSet>(ChangeSet.class, this, InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS, InfOperationsPackage.CHANGE_SET__NETWORK_DATA_SETS);
		}
		return changeSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new EObjectWithInverseResolvingEList.ManyInverse<PowerSystemResource>(PowerSystemResource.class, this, InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES, CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS);
		}
		return powerSystemResources;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.NETWORK_DATA_SET__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.NETWORK_DATA_SET__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LandBase> getLandBases() {
		if (landBases == null) {
			landBases = new EObjectResolvingEList<LandBase>(LandBase.class, this, InfOperationsPackage.NETWORK_DATA_SET__LAND_BASES);
		}
		return landBases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new EObjectWithInverseResolvingEList.ManyInverse<Document>(Document.class, this, InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS, CommonPackage.DOCUMENT__NETWORK_DATA_SETS);
		}
		return documents;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.NETWORK_DATA_SET__CATEGORY, oldCategory, category));
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
			case InfOperationsPackage.NETWORK_DATA_SET__CIRCUIT_SECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCircuitSections()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeSets()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
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
			case InfOperationsPackage.NETWORK_DATA_SET__CIRCUIT_SECTIONS:
				return ((InternalEList<?>)getCircuitSections()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				return ((InternalEList<?>)getChangeSets()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
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
			case InfOperationsPackage.NETWORK_DATA_SET__CIRCUIT_SECTIONS:
				return getCircuitSections();
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				return getChangeItems();
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				return getChangeSets();
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
			case InfOperationsPackage.NETWORK_DATA_SET__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfOperationsPackage.NETWORK_DATA_SET__LAND_BASES:
				return getLandBases();
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				return getDocuments();
			case InfOperationsPackage.NETWORK_DATA_SET__CATEGORY:
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
			case InfOperationsPackage.NETWORK_DATA_SET__CIRCUIT_SECTIONS:
				getCircuitSections().clear();
				getCircuitSections().addAll((Collection<? extends CircuitSection>)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				getChangeSets().clear();
				getChangeSets().addAll((Collection<? extends ChangeSet>)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__STATUS:
				setStatus((Status)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__LAND_BASES:
				getLandBases().clear();
				getLandBases().addAll((Collection<? extends LandBase>)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends Document>)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CATEGORY:
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
			case InfOperationsPackage.NETWORK_DATA_SET__CIRCUIT_SECTIONS:
				getCircuitSections().clear();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				getChangeSets().clear();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__STATUS:
				setStatus((Status)null);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__LAND_BASES:
				getLandBases().clear();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				getDocuments().clear();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CATEGORY:
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
			case InfOperationsPackage.NETWORK_DATA_SET__CIRCUIT_SECTIONS:
				return circuitSections != null && !circuitSections.isEmpty();
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				return changeSets != null && !changeSets.isEmpty();
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
			case InfOperationsPackage.NETWORK_DATA_SET__STATUS:
				return status != null;
			case InfOperationsPackage.NETWORK_DATA_SET__LAND_BASES:
				return landBases != null && !landBases.isEmpty();
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case InfOperationsPackage.NETWORK_DATA_SET__CATEGORY:
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

} //NetworkDataSetImpl
