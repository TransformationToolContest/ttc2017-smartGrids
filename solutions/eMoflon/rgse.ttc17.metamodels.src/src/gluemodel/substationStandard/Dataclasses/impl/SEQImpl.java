/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.CMV;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.PhaseReference;
import gluemodel.substationStandard.Dataclasses.SEQ;
import gluemodel.substationStandard.Dataclasses.Sequence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SEQImpl#getC1 <em>C1</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SEQImpl#getC2 <em>C2</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SEQImpl#getC3 <em>C3</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SEQImpl#getSeqT <em>Seq T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SEQImpl#getPhsRef <em>Phs Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SEQImpl extends MinimalEObjectImpl.Container implements SEQ {
	/**
	 * The cached value of the '{@link #getC1() <em>C1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1()
	 * @generated
	 * @ordered
	 */
	protected CMV c1;

	/**
	 * The cached value of the '{@link #getC2() <em>C2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2()
	 * @generated
	 * @ordered
	 */
	protected CMV c2;

	/**
	 * The cached value of the '{@link #getC3() <em>C3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC3()
	 * @generated
	 * @ordered
	 */
	protected CMV c3;

	/**
	 * The cached value of the '{@link #getSeqT() <em>Seq T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqT()
	 * @generated
	 * @ordered
	 */
	protected Sequence seqT;

	/**
	 * The cached value of the '{@link #getPhsRef() <em>Phs Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsRef()
	 * @generated
	 * @ordered
	 */
	protected PhaseReference phsRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SEQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.SEQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getC1() {
		if (c1 != null && c1.eIsProxy()) {
			InternalEObject oldC1 = (InternalEObject)c1;
			c1 = (CMV)eResolveProxy(oldC1);
			if (c1 != oldC1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SEQ__C1, oldC1, c1));
			}
		}
		return c1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetC1() {
		return c1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC1(CMV newC1) {
		CMV oldC1 = c1;
		c1 = newC1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SEQ__C1, oldC1, c1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getC2() {
		if (c2 != null && c2.eIsProxy()) {
			InternalEObject oldC2 = (InternalEObject)c2;
			c2 = (CMV)eResolveProxy(oldC2);
			if (c2 != oldC2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SEQ__C2, oldC2, c2));
			}
		}
		return c2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetC2() {
		return c2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC2(CMV newC2) {
		CMV oldC2 = c2;
		c2 = newC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SEQ__C2, oldC2, c2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getC3() {
		if (c3 != null && c3.eIsProxy()) {
			InternalEObject oldC3 = (InternalEObject)c3;
			c3 = (CMV)eResolveProxy(oldC3);
			if (c3 != oldC3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SEQ__C3, oldC3, c3));
			}
		}
		return c3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetC3() {
		return c3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC3(CMV newC3) {
		CMV oldC3 = c3;
		c3 = newC3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SEQ__C3, oldC3, c3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getSeqT() {
		if (seqT != null && seqT.eIsProxy()) {
			InternalEObject oldSeqT = (InternalEObject)seqT;
			seqT = (Sequence)eResolveProxy(oldSeqT);
			if (seqT != oldSeqT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SEQ__SEQ_T, oldSeqT, seqT));
			}
		}
		return seqT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence basicGetSeqT() {
		return seqT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqT(Sequence newSeqT) {
		Sequence oldSeqT = seqT;
		seqT = newSeqT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SEQ__SEQ_T, oldSeqT, seqT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseReference getPhsRef() {
		if (phsRef != null && phsRef.eIsProxy()) {
			InternalEObject oldPhsRef = (InternalEObject)phsRef;
			phsRef = (PhaseReference)eResolveProxy(oldPhsRef);
			if (phsRef != oldPhsRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SEQ__PHS_REF, oldPhsRef, phsRef));
			}
		}
		return phsRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseReference basicGetPhsRef() {
		return phsRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsRef(PhaseReference newPhsRef) {
		PhaseReference oldPhsRef = phsRef;
		phsRef = newPhsRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SEQ__PHS_REF, oldPhsRef, phsRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.SEQ__C1:
				if (resolve) return getC1();
				return basicGetC1();
			case DataclassesPackage.SEQ__C2:
				if (resolve) return getC2();
				return basicGetC2();
			case DataclassesPackage.SEQ__C3:
				if (resolve) return getC3();
				return basicGetC3();
			case DataclassesPackage.SEQ__SEQ_T:
				if (resolve) return getSeqT();
				return basicGetSeqT();
			case DataclassesPackage.SEQ__PHS_REF:
				if (resolve) return getPhsRef();
				return basicGetPhsRef();
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
			case DataclassesPackage.SEQ__C1:
				setC1((CMV)newValue);
				return;
			case DataclassesPackage.SEQ__C2:
				setC2((CMV)newValue);
				return;
			case DataclassesPackage.SEQ__C3:
				setC3((CMV)newValue);
				return;
			case DataclassesPackage.SEQ__SEQ_T:
				setSeqT((Sequence)newValue);
				return;
			case DataclassesPackage.SEQ__PHS_REF:
				setPhsRef((PhaseReference)newValue);
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
			case DataclassesPackage.SEQ__C1:
				setC1((CMV)null);
				return;
			case DataclassesPackage.SEQ__C2:
				setC2((CMV)null);
				return;
			case DataclassesPackage.SEQ__C3:
				setC3((CMV)null);
				return;
			case DataclassesPackage.SEQ__SEQ_T:
				setSeqT((Sequence)null);
				return;
			case DataclassesPackage.SEQ__PHS_REF:
				setPhsRef((PhaseReference)null);
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
			case DataclassesPackage.SEQ__C1:
				return c1 != null;
			case DataclassesPackage.SEQ__C2:
				return c2 != null;
			case DataclassesPackage.SEQ__C3:
				return c3 != null;
			case DataclassesPackage.SEQ__SEQ_T:
				return seqT != null;
			case DataclassesPackage.SEQ__PHS_REF:
				return phsRef != null;
		}
		return super.eIsSet(featureID);
	}

} //SEQImpl
