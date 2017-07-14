/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.Specification;

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
 * An implementation of the model object '<em><b>Reliability Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ReliabilityInfoImpl#getMomFailureRate <em>Mom Failure Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ReliabilityInfoImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ReliabilityInfoImpl#getMTTR <em>MTTR</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ReliabilityInfoImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReliabilityInfoImpl extends IdentifiedObjectImpl implements ReliabilityInfo {
	/**
	 * The default value of the '{@link #getMomFailureRate() <em>Mom Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomFailureRate()
	 * @generated
	 * @ordered
	 */
	protected static final float MOM_FAILURE_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMomFailureRate() <em>Mom Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomFailureRate()
	 * @generated
	 * @ordered
	 */
	protected float momFailureRate = MOM_FAILURE_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The default value of the '{@link #getMTTR() <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTR()
	 * @generated
	 * @ordered
	 */
	protected static final float MTTR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMTTR() <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTR()
	 * @generated
	 * @ordered
	 */
	protected float mTTR = MTTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification specification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getReliabilityInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMomFailureRate() {
		return momFailureRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomFailureRate(float newMomFailureRate) {
		float oldMomFailureRate = momFailureRate;
		momFailureRate = newMomFailureRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.RELIABILITY_INFO__MOM_FAILURE_RATE, oldMomFailureRate, momFailureRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectWithInverseResolvingEList.ManyInverse<Asset>(Asset.class, this, InfAssetsPackage.RELIABILITY_INFO__ASSETS, AssetsPackage.ASSET__RELIABILITY_INFOS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMTTR() {
		return mTTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMTTR(float newMTTR) {
		float oldMTTR = mTTR;
		mTTR = newMTTR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.RELIABILITY_INFO__MTTR, oldMTTR, mTTR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (Specification)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(Specification newSpecification, NotificationChain msgs) {
		Specification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(Specification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS, Specification.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS, Specification.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION, newSpecification, newSpecification));
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
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS, Specification.class, msgs);
				return basicSetSpecification((Specification)otherEnd, msgs);
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
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				return basicSetSpecification(null, msgs);
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
			case InfAssetsPackage.RELIABILITY_INFO__MOM_FAILURE_RATE:
				return getMomFailureRate();
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				return getAssets();
			case InfAssetsPackage.RELIABILITY_INFO__MTTR:
				return getMTTR();
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
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
			case InfAssetsPackage.RELIABILITY_INFO__MOM_FAILURE_RATE:
				setMomFailureRate((Float)newValue);
				return;
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case InfAssetsPackage.RELIABILITY_INFO__MTTR:
				setMTTR((Float)newValue);
				return;
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				setSpecification((Specification)newValue);
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
			case InfAssetsPackage.RELIABILITY_INFO__MOM_FAILURE_RATE:
				setMomFailureRate(MOM_FAILURE_RATE_EDEFAULT);
				return;
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				getAssets().clear();
				return;
			case InfAssetsPackage.RELIABILITY_INFO__MTTR:
				setMTTR(MTTR_EDEFAULT);
				return;
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				setSpecification((Specification)null);
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
			case InfAssetsPackage.RELIABILITY_INFO__MOM_FAILURE_RATE:
				return momFailureRate != MOM_FAILURE_RATE_EDEFAULT;
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				return assets != null && !assets.isEmpty();
			case InfAssetsPackage.RELIABILITY_INFO__MTTR:
				return mTTR != MTTR_EDEFAULT;
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				return specification != null;
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
		result.append(" (momFailureRate: ");
		result.append(momFailureRate);
		result.append(", mTTR: ");
		result.append(mTTR);
		result.append(')');
		return result.toString();
	}

} //ReliabilityInfoImpl
