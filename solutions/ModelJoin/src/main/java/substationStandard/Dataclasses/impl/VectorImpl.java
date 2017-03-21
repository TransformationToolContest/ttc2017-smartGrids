/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.AnalogueValue;
import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.Vector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.VectorImpl#getMag <em>Mag</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.VectorImpl#getAng <em>Ang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorImpl extends MinimalEObjectImpl.Container implements Vector {
	/**
	 * The cached value of the '{@link #getMag() <em>Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMag()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue mag;

	/**
	 * The cached value of the '{@link #getAng() <em>Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAng()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue ang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getMag() {
		if (mag != null && mag.eIsProxy()) {
			InternalEObject oldMag = (InternalEObject)mag;
			mag = (AnalogueValue)eResolveProxy(oldMag);
			if (mag != oldMag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.VECTOR__MAG, oldMag, mag));
			}
		}
		return mag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetMag() {
		return mag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMag(AnalogueValue newMag) {
		AnalogueValue oldMag = mag;
		mag = newMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.VECTOR__MAG, oldMag, mag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getAng() {
		if (ang != null && ang.eIsProxy()) {
			InternalEObject oldAng = (InternalEObject)ang;
			ang = (AnalogueValue)eResolveProxy(oldAng);
			if (ang != oldAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.VECTOR__ANG, oldAng, ang));
			}
		}
		return ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetAng() {
		return ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAng(AnalogueValue newAng) {
		AnalogueValue oldAng = ang;
		ang = newAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.VECTOR__ANG, oldAng, ang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.VECTOR__MAG:
				if (resolve) return getMag();
				return basicGetMag();
			case DataclassesPackage.VECTOR__ANG:
				if (resolve) return getAng();
				return basicGetAng();
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
			case DataclassesPackage.VECTOR__MAG:
				setMag((AnalogueValue)newValue);
				return;
			case DataclassesPackage.VECTOR__ANG:
				setAng((AnalogueValue)newValue);
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
			case DataclassesPackage.VECTOR__MAG:
				setMag((AnalogueValue)null);
				return;
			case DataclassesPackage.VECTOR__ANG:
				setAng((AnalogueValue)null);
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
			case DataclassesPackage.VECTOR__MAG:
				return mag != null;
			case DataclassesPackage.VECTOR__ANG:
				return ang != null;
		}
		return super.eIsSet(featureID);
	}

} //VectorImpl
