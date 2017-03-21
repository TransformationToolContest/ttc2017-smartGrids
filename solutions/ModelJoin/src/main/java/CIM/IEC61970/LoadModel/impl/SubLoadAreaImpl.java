/**
 */
package CIM.IEC61970.LoadModel.impl;

import CIM.IEC61970.LoadModel.LoadArea;
import CIM.IEC61970.LoadModel.LoadGroup;
import CIM.IEC61970.LoadModel.LoadModelPackage;
import CIM.IEC61970.LoadModel.SubLoadArea;

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
 * An implementation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SubLoadAreaImpl#getLoadArea <em>Load Area</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SubLoadAreaImpl#getLoadGroups <em>Load Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubLoadAreaImpl extends EnergyAreaImpl implements SubLoadArea {
	/**
	 * The cached value of the '{@link #getLoadArea() <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadArea()
	 * @generated
	 * @ordered
	 */
	protected LoadArea loadArea;

	/**
	 * The cached value of the '{@link #getLoadGroups() <em>Load Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadGroup> loadGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubLoadAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.SUB_LOAD_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea getLoadArea() {
		if (loadArea != null && loadArea.eIsProxy()) {
			InternalEObject oldLoadArea = (InternalEObject)loadArea;
			loadArea = (LoadArea)eResolveProxy(oldLoadArea);
			if (loadArea != oldLoadArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA, oldLoadArea, loadArea));
			}
		}
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea basicGetLoadArea() {
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadArea(LoadArea newLoadArea, NotificationChain msgs) {
		LoadArea oldLoadArea = loadArea;
		loadArea = newLoadArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA, oldLoadArea, newLoadArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadArea(LoadArea newLoadArea) {
		if (newLoadArea != loadArea) {
			NotificationChain msgs = null;
			if (loadArea != null)
				msgs = ((InternalEObject)loadArea).eInverseRemove(this, LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs);
			if (newLoadArea != null)
				msgs = ((InternalEObject)newLoadArea).eInverseAdd(this, LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs);
			msgs = basicSetLoadArea(newLoadArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA, newLoadArea, newLoadArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadGroup> getLoadGroups() {
		if (loadGroups == null) {
			loadGroups = new EObjectWithInverseResolvingEList<LoadGroup>(LoadGroup.class, this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA);
		}
		return loadGroups;
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				if (loadArea != null)
					msgs = ((InternalEObject)loadArea).eInverseRemove(this, LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs);
				return basicSetLoadArea((LoadArea)otherEnd, msgs);
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadGroups()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				return basicSetLoadArea(null, msgs);
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return ((InternalEList<?>)getLoadGroups()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				if (resolve) return getLoadArea();
				return basicGetLoadArea();
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return getLoadGroups();
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				setLoadArea((LoadArea)newValue);
				return;
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				getLoadGroups().clear();
				getLoadGroups().addAll((Collection<? extends LoadGroup>)newValue);
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				setLoadArea((LoadArea)null);
				return;
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				getLoadGroups().clear();
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				return loadArea != null;
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return loadGroups != null && !loadGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubLoadAreaImpl
