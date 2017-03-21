/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.AngleReference;
import substationStandard.Dataclasses.CMV;
import substationStandard.Dataclasses.DEL;
import substationStandard.Dataclasses.DataclassesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.DELImpl#getPhsAB <em>Phs AB</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DELImpl#getPhsBC <em>Phs BC</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DELImpl#getPhsCA <em>Phs CA</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DELImpl#getAngRef <em>Ang Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DELImpl extends MinimalEObjectImpl.Container implements DEL {
	/**
	 * The cached value of the '{@link #getPhsAB() <em>Phs AB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsAB()
	 * @generated
	 * @ordered
	 */
	protected CMV phsAB;

	/**
	 * The cached value of the '{@link #getPhsBC() <em>Phs BC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsBC()
	 * @generated
	 * @ordered
	 */
	protected CMV phsBC;

	/**
	 * The cached value of the '{@link #getPhsCA() <em>Phs CA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsCA()
	 * @generated
	 * @ordered
	 */
	protected CMV phsCA;

	/**
	 * The cached value of the '{@link #getAngRef() <em>Ang Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngRef()
	 * @generated
	 * @ordered
	 */
	protected AngleReference angRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DELImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.DEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getPhsAB() {
		if (phsAB != null && phsAB.eIsProxy()) {
			InternalEObject oldPhsAB = (InternalEObject)phsAB;
			phsAB = (CMV)eResolveProxy(oldPhsAB);
			if (phsAB != oldPhsAB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.DEL__PHS_AB, oldPhsAB, phsAB));
			}
		}
		return phsAB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetPhsAB() {
		return phsAB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsAB(CMV newPhsAB) {
		CMV oldPhsAB = phsAB;
		phsAB = newPhsAB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DEL__PHS_AB, oldPhsAB, phsAB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getPhsBC() {
		if (phsBC != null && phsBC.eIsProxy()) {
			InternalEObject oldPhsBC = (InternalEObject)phsBC;
			phsBC = (CMV)eResolveProxy(oldPhsBC);
			if (phsBC != oldPhsBC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.DEL__PHS_BC, oldPhsBC, phsBC));
			}
		}
		return phsBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetPhsBC() {
		return phsBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsBC(CMV newPhsBC) {
		CMV oldPhsBC = phsBC;
		phsBC = newPhsBC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DEL__PHS_BC, oldPhsBC, phsBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getPhsCA() {
		if (phsCA != null && phsCA.eIsProxy()) {
			InternalEObject oldPhsCA = (InternalEObject)phsCA;
			phsCA = (CMV)eResolveProxy(oldPhsCA);
			if (phsCA != oldPhsCA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.DEL__PHS_CA, oldPhsCA, phsCA));
			}
		}
		return phsCA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetPhsCA() {
		return phsCA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsCA(CMV newPhsCA) {
		CMV oldPhsCA = phsCA;
		phsCA = newPhsCA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DEL__PHS_CA, oldPhsCA, phsCA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleReference getAngRef() {
		if (angRef != null && angRef.eIsProxy()) {
			InternalEObject oldAngRef = (InternalEObject)angRef;
			angRef = (AngleReference)eResolveProxy(oldAngRef);
			if (angRef != oldAngRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.DEL__ANG_REF, oldAngRef, angRef));
			}
		}
		return angRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleReference basicGetAngRef() {
		return angRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngRef(AngleReference newAngRef) {
		AngleReference oldAngRef = angRef;
		angRef = newAngRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DEL__ANG_REF, oldAngRef, angRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.DEL__PHS_AB:
				if (resolve) return getPhsAB();
				return basicGetPhsAB();
			case DataclassesPackage.DEL__PHS_BC:
				if (resolve) return getPhsBC();
				return basicGetPhsBC();
			case DataclassesPackage.DEL__PHS_CA:
				if (resolve) return getPhsCA();
				return basicGetPhsCA();
			case DataclassesPackage.DEL__ANG_REF:
				if (resolve) return getAngRef();
				return basicGetAngRef();
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
			case DataclassesPackage.DEL__PHS_AB:
				setPhsAB((CMV)newValue);
				return;
			case DataclassesPackage.DEL__PHS_BC:
				setPhsBC((CMV)newValue);
				return;
			case DataclassesPackage.DEL__PHS_CA:
				setPhsCA((CMV)newValue);
				return;
			case DataclassesPackage.DEL__ANG_REF:
				setAngRef((AngleReference)newValue);
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
			case DataclassesPackage.DEL__PHS_AB:
				setPhsAB((CMV)null);
				return;
			case DataclassesPackage.DEL__PHS_BC:
				setPhsBC((CMV)null);
				return;
			case DataclassesPackage.DEL__PHS_CA:
				setPhsCA((CMV)null);
				return;
			case DataclassesPackage.DEL__ANG_REF:
				setAngRef((AngleReference)null);
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
			case DataclassesPackage.DEL__PHS_AB:
				return phsAB != null;
			case DataclassesPackage.DEL__PHS_BC:
				return phsBC != null;
			case DataclassesPackage.DEL__PHS_CA:
				return phsCA != null;
			case DataclassesPackage.DEL__ANG_REF:
				return angRef != null;
		}
		return super.eIsSet(featureID);
	}

} //DELImpl
