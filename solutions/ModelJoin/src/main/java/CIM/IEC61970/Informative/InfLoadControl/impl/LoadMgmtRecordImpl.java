/**
 */
package CIM.IEC61970.Informative.InfLoadControl.impl;

import CIM.IEC61968.Common.impl.ActivityRecordImpl;

import CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage;
import CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction;
import CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Mgmt Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtRecordImpl#getLoadReduction <em>Load Reduction</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtRecordImpl#getLoadMgmtFunction <em>Load Mgmt Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadMgmtRecordImpl extends ActivityRecordImpl implements LoadMgmtRecord {
	/**
	 * The default value of the '{@link #getLoadReduction() <em>Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadReduction()
	 * @generated
	 * @ordered
	 */
	protected static final float LOAD_REDUCTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoadReduction() <em>Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadReduction()
	 * @generated
	 * @ordered
	 */
	protected float loadReduction = LOAD_REDUCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoadMgmtFunction() <em>Load Mgmt Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmtFunction()
	 * @generated
	 * @ordered
	 */
	protected LoadMgmtFunction loadMgmtFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadMgmtRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLoadControlPackage.Literals.LOAD_MGMT_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoadReduction() {
		return loadReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadReduction(float newLoadReduction) {
		float oldLoadReduction = loadReduction;
		loadReduction = newLoadReduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_REDUCTION, oldLoadReduction, loadReduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadMgmtFunction getLoadMgmtFunction() {
		if (loadMgmtFunction != null && loadMgmtFunction.eIsProxy()) {
			InternalEObject oldLoadMgmtFunction = (InternalEObject)loadMgmtFunction;
			loadMgmtFunction = (LoadMgmtFunction)eResolveProxy(oldLoadMgmtFunction);
			if (loadMgmtFunction != oldLoadMgmtFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION, oldLoadMgmtFunction, loadMgmtFunction));
			}
		}
		return loadMgmtFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadMgmtFunction basicGetLoadMgmtFunction() {
		return loadMgmtFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadMgmtFunction(LoadMgmtFunction newLoadMgmtFunction, NotificationChain msgs) {
		LoadMgmtFunction oldLoadMgmtFunction = loadMgmtFunction;
		loadMgmtFunction = newLoadMgmtFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION, oldLoadMgmtFunction, newLoadMgmtFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadMgmtFunction(LoadMgmtFunction newLoadMgmtFunction) {
		if (newLoadMgmtFunction != loadMgmtFunction) {
			NotificationChain msgs = null;
			if (loadMgmtFunction != null)
				msgs = ((InternalEObject)loadMgmtFunction).eInverseRemove(this, InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS, LoadMgmtFunction.class, msgs);
			if (newLoadMgmtFunction != null)
				msgs = ((InternalEObject)newLoadMgmtFunction).eInverseAdd(this, InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS, LoadMgmtFunction.class, msgs);
			msgs = basicSetLoadMgmtFunction(newLoadMgmtFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION, newLoadMgmtFunction, newLoadMgmtFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				if (loadMgmtFunction != null)
					msgs = ((InternalEObject)loadMgmtFunction).eInverseRemove(this, InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS, LoadMgmtFunction.class, msgs);
				return basicSetLoadMgmtFunction((LoadMgmtFunction)otherEnd, msgs);
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				return basicSetLoadMgmtFunction(null, msgs);
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_REDUCTION:
				return getLoadReduction();
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				if (resolve) return getLoadMgmtFunction();
				return basicGetLoadMgmtFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_REDUCTION:
				setLoadReduction((Float)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				setLoadMgmtFunction((LoadMgmtFunction)newValue);
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_REDUCTION:
				setLoadReduction(LOAD_REDUCTION_EDEFAULT);
				return;
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				setLoadMgmtFunction((LoadMgmtFunction)null);
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_REDUCTION:
				return loadReduction != LOAD_REDUCTION_EDEFAULT;
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				return loadMgmtFunction != null;
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
		result.append(" (loadReduction: ");
		result.append(loadReduction);
		result.append(')');
		return result.toString();
	}

} //LoadMgmtRecordImpl
