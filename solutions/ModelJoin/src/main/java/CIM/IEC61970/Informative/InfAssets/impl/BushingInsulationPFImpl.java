/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.BushingInfo;
import CIM.IEC61970.Informative.InfAssets.BushingInsulationPF;
import CIM.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.TransformerObservation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bushing Insulation PF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInsulationPFImpl#getBushingInfo <em>Bushing Info</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInsulationPFImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInsulationPFImpl#getTestKind <em>Test Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInsulationPFImpl#getTransformerObservation <em>Transformer Observation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BushingInsulationPFImpl extends IdentifiedObjectImpl implements BushingInsulationPF {
	/**
	 * The cached value of the '{@link #getBushingInfo() <em>Bushing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingInfo()
	 * @generated
	 * @ordered
	 */
	protected BushingInfo bushingInfo;

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
	 * The default value of the '{@link #getTestKind() <em>Test Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestKind()
	 * @generated
	 * @ordered
	 */
	protected static final BushingInsulationPfTestKind TEST_KIND_EDEFAULT = BushingInsulationPfTestKind.C1;

	/**
	 * The cached value of the '{@link #getTestKind() <em>Test Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestKind()
	 * @generated
	 * @ordered
	 */
	protected BushingInsulationPfTestKind testKind = TEST_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformerObservation() <em>Transformer Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerObservation()
	 * @generated
	 * @ordered
	 */
	protected TransformerObservation transformerObservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BushingInsulationPFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getBushingInsulationPF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInfo getBushingInfo() {
		if (bushingInfo != null && bushingInfo.eIsProxy()) {
			InternalEObject oldBushingInfo = (InternalEObject)bushingInfo;
			bushingInfo = (BushingInfo)eResolveProxy(oldBushingInfo);
			if (bushingInfo != oldBushingInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO, oldBushingInfo, bushingInfo));
			}
		}
		return bushingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInfo basicGetBushingInfo() {
		return bushingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBushingInfo(BushingInfo newBushingInfo, NotificationChain msgs) {
		BushingInfo oldBushingInfo = bushingInfo;
		bushingInfo = newBushingInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO, oldBushingInfo, newBushingInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBushingInfo(BushingInfo newBushingInfo) {
		if (newBushingInfo != bushingInfo) {
			NotificationChain msgs = null;
			if (bushingInfo != null)
				msgs = ((InternalEObject)bushingInfo).eInverseRemove(this, InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS, BushingInfo.class, msgs);
			if (newBushingInfo != null)
				msgs = ((InternalEObject)newBushingInfo).eInverseAdd(this, InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS, BushingInfo.class, msgs);
			msgs = basicSetBushingInfo(newBushingInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO, newBushingInfo, newBushingInfo));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.BUSHING_INSULATION_PF__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INSULATION_PF__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInsulationPfTestKind getTestKind() {
		return testKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestKind(BushingInsulationPfTestKind newTestKind) {
		BushingInsulationPfTestKind oldTestKind = testKind;
		testKind = newTestKind == null ? TEST_KIND_EDEFAULT : newTestKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INSULATION_PF__TEST_KIND, oldTestKind, testKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerObservation getTransformerObservation() {
		if (transformerObservation != null && transformerObservation.eIsProxy()) {
			InternalEObject oldTransformerObservation = (InternalEObject)transformerObservation;
			transformerObservation = (TransformerObservation)eResolveProxy(oldTransformerObservation);
			if (transformerObservation != oldTransformerObservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION, oldTransformerObservation, transformerObservation));
			}
		}
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerObservation basicGetTransformerObservation() {
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerObservation(TransformerObservation newTransformerObservation, NotificationChain msgs) {
		TransformerObservation oldTransformerObservation = transformerObservation;
		transformerObservation = newTransformerObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION, oldTransformerObservation, newTransformerObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerObservation(TransformerObservation newTransformerObservation) {
		if (newTransformerObservation != transformerObservation) {
			NotificationChain msgs = null;
			if (transformerObservation != null)
				msgs = ((InternalEObject)transformerObservation).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS, TransformerObservation.class, msgs);
			if (newTransformerObservation != null)
				msgs = ((InternalEObject)newTransformerObservation).eInverseAdd(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS, TransformerObservation.class, msgs);
			msgs = basicSetTransformerObservation(newTransformerObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION, newTransformerObservation, newTransformerObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				if (bushingInfo != null)
					msgs = ((InternalEObject)bushingInfo).eInverseRemove(this, InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS, BushingInfo.class, msgs);
				return basicSetBushingInfo((BushingInfo)otherEnd, msgs);
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				if (transformerObservation != null)
					msgs = ((InternalEObject)transformerObservation).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS, TransformerObservation.class, msgs);
				return basicSetTransformerObservation((TransformerObservation)otherEnd, msgs);
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				return basicSetBushingInfo(null, msgs);
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				return basicSetTransformerObservation(null, msgs);
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				if (resolve) return getBushingInfo();
				return basicGetBushingInfo();
			case InfAssetsPackage.BUSHING_INSULATION_PF__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfAssetsPackage.BUSHING_INSULATION_PF__TEST_KIND:
				return getTestKind();
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				if (resolve) return getTransformerObservation();
				return basicGetTransformerObservation();
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				setBushingInfo((BushingInfo)newValue);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__STATUS:
				setStatus((Status)newValue);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TEST_KIND:
				setTestKind((BushingInsulationPfTestKind)newValue);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				setTransformerObservation((TransformerObservation)newValue);
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				setBushingInfo((BushingInfo)null);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__STATUS:
				setStatus((Status)null);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TEST_KIND:
				setTestKind(TEST_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				setTransformerObservation((TransformerObservation)null);
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				return bushingInfo != null;
			case InfAssetsPackage.BUSHING_INSULATION_PF__STATUS:
				return status != null;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TEST_KIND:
				return testKind != TEST_KIND_EDEFAULT;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				return transformerObservation != null;
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
		result.append(" (testKind: ");
		result.append(testKind);
		result.append(')');
		return result.toString();
	}

} //BushingInsulationPFImpl
