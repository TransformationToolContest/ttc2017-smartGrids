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
import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.WYE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WYE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.WYEImpl#getPhsA <em>Phs A</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.WYEImpl#getPhsB <em>Phs B</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.WYEImpl#getPhsC <em>Phs C</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.WYEImpl#getNeut <em>Neut</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.WYEImpl#getNet <em>Net</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.WYEImpl#getRes <em>Res</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.WYEImpl#getAngRef <em>Ang Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WYEImpl extends MinimalEObjectImpl.Container implements WYE {
	/**
	 * The cached value of the '{@link #getPhsA() <em>Phs A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsA()
	 * @generated
	 * @ordered
	 */
	protected CMV phsA;

	/**
	 * The cached value of the '{@link #getPhsB() <em>Phs B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsB()
	 * @generated
	 * @ordered
	 */
	protected CMV phsB;

	/**
	 * The cached value of the '{@link #getPhsC() <em>Phs C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsC()
	 * @generated
	 * @ordered
	 */
	protected CMV phsC;

	/**
	 * The cached value of the '{@link #getNeut() <em>Neut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeut()
	 * @generated
	 * @ordered
	 */
	protected CMV neut;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected CMV net;

	/**
	 * The cached value of the '{@link #getRes() <em>Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected CMV res;

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
	protected WYEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.WYE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getPhsA() {
		if (phsA != null && phsA.eIsProxy()) {
			InternalEObject oldPhsA = (InternalEObject)phsA;
			phsA = (CMV)eResolveProxy(oldPhsA);
			if (phsA != oldPhsA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.WYE__PHS_A, oldPhsA, phsA));
			}
		}
		return phsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetPhsA() {
		return phsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsA(CMV newPhsA) {
		CMV oldPhsA = phsA;
		phsA = newPhsA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.WYE__PHS_A, oldPhsA, phsA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getPhsB() {
		if (phsB != null && phsB.eIsProxy()) {
			InternalEObject oldPhsB = (InternalEObject)phsB;
			phsB = (CMV)eResolveProxy(oldPhsB);
			if (phsB != oldPhsB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.WYE__PHS_B, oldPhsB, phsB));
			}
		}
		return phsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetPhsB() {
		return phsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsB(CMV newPhsB) {
		CMV oldPhsB = phsB;
		phsB = newPhsB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.WYE__PHS_B, oldPhsB, phsB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getPhsC() {
		if (phsC != null && phsC.eIsProxy()) {
			InternalEObject oldPhsC = (InternalEObject)phsC;
			phsC = (CMV)eResolveProxy(oldPhsC);
			if (phsC != oldPhsC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.WYE__PHS_C, oldPhsC, phsC));
			}
		}
		return phsC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetPhsC() {
		return phsC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsC(CMV newPhsC) {
		CMV oldPhsC = phsC;
		phsC = newPhsC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.WYE__PHS_C, oldPhsC, phsC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getNeut() {
		if (neut != null && neut.eIsProxy()) {
			InternalEObject oldNeut = (InternalEObject)neut;
			neut = (CMV)eResolveProxy(oldNeut);
			if (neut != oldNeut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.WYE__NEUT, oldNeut, neut));
			}
		}
		return neut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetNeut() {
		return neut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeut(CMV newNeut) {
		CMV oldNeut = neut;
		neut = newNeut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.WYE__NEUT, oldNeut, neut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getNet() {
		if (net != null && net.eIsProxy()) {
			InternalEObject oldNet = (InternalEObject)net;
			net = (CMV)eResolveProxy(oldNet);
			if (net != oldNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.WYE__NET, oldNet, net));
			}
		}
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(CMV newNet) {
		CMV oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.WYE__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getRes() {
		if (res != null && res.eIsProxy()) {
			InternalEObject oldRes = (InternalEObject)res;
			res = (CMV)eResolveProxy(oldRes);
			if (res != oldRes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.WYE__RES, oldRes, res));
			}
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetRes() {
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRes(CMV newRes) {
		CMV oldRes = res;
		res = newRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.WYE__RES, oldRes, res));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.WYE__ANG_REF, oldAngRef, angRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.WYE__ANG_REF, oldAngRef, angRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.WYE__PHS_A:
				if (resolve) return getPhsA();
				return basicGetPhsA();
			case DataclassesPackage.WYE__PHS_B:
				if (resolve) return getPhsB();
				return basicGetPhsB();
			case DataclassesPackage.WYE__PHS_C:
				if (resolve) return getPhsC();
				return basicGetPhsC();
			case DataclassesPackage.WYE__NEUT:
				if (resolve) return getNeut();
				return basicGetNeut();
			case DataclassesPackage.WYE__NET:
				if (resolve) return getNet();
				return basicGetNet();
			case DataclassesPackage.WYE__RES:
				if (resolve) return getRes();
				return basicGetRes();
			case DataclassesPackage.WYE__ANG_REF:
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
			case DataclassesPackage.WYE__PHS_A:
				setPhsA((CMV)newValue);
				return;
			case DataclassesPackage.WYE__PHS_B:
				setPhsB((CMV)newValue);
				return;
			case DataclassesPackage.WYE__PHS_C:
				setPhsC((CMV)newValue);
				return;
			case DataclassesPackage.WYE__NEUT:
				setNeut((CMV)newValue);
				return;
			case DataclassesPackage.WYE__NET:
				setNet((CMV)newValue);
				return;
			case DataclassesPackage.WYE__RES:
				setRes((CMV)newValue);
				return;
			case DataclassesPackage.WYE__ANG_REF:
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
			case DataclassesPackage.WYE__PHS_A:
				setPhsA((CMV)null);
				return;
			case DataclassesPackage.WYE__PHS_B:
				setPhsB((CMV)null);
				return;
			case DataclassesPackage.WYE__PHS_C:
				setPhsC((CMV)null);
				return;
			case DataclassesPackage.WYE__NEUT:
				setNeut((CMV)null);
				return;
			case DataclassesPackage.WYE__NET:
				setNet((CMV)null);
				return;
			case DataclassesPackage.WYE__RES:
				setRes((CMV)null);
				return;
			case DataclassesPackage.WYE__ANG_REF:
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
			case DataclassesPackage.WYE__PHS_A:
				return phsA != null;
			case DataclassesPackage.WYE__PHS_B:
				return phsB != null;
			case DataclassesPackage.WYE__PHS_C:
				return phsC != null;
			case DataclassesPackage.WYE__NEUT:
				return neut != null;
			case DataclassesPackage.WYE__NET:
				return net != null;
			case DataclassesPackage.WYE__RES:
				return res != null;
			case DataclassesPackage.WYE__ANG_REF:
				return angRef != null;
		}
		return super.eIsSet(featureID);
	}

} //WYEImpl
