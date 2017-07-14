/**
 */
package gluemodel.CIM.IEC61968.AssetModels.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest;
import gluemodel.CIM.IEC61968.AssetModels.WindingInfo;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution Winding Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.DistributionWindingTestImpl#getFromWinding <em>From Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.DistributionWindingTestImpl#getFromTapStep <em>From Tap Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionWindingTestImpl extends IdentifiedObjectImpl implements DistributionWindingTest {
	/**
	 * The cached value of the '{@link #getFromWinding() <em>From Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromWinding()
	 * @generated
	 * @ordered
	 */
	protected WindingInfo fromWinding;

	/**
	 * The default value of the '{@link #getFromTapStep() <em>From Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTapStep()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_TAP_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFromTapStep() <em>From Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTapStep()
	 * @generated
	 * @ordered
	 */
	protected int fromTapStep = FROM_TAP_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionWindingTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.DISTRIBUTION_WINDING_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInfo getFromWinding() {
		if (fromWinding != null && fromWinding.eIsProxy()) {
			InternalEObject oldFromWinding = (InternalEObject)fromWinding;
			fromWinding = (WindingInfo)eResolveProxy(oldFromWinding);
			if (fromWinding != oldFromWinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING, oldFromWinding, fromWinding));
			}
		}
		return fromWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInfo basicGetFromWinding() {
		return fromWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromWinding(WindingInfo newFromWinding, NotificationChain msgs) {
		WindingInfo oldFromWinding = fromWinding;
		fromWinding = newFromWinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING, oldFromWinding, newFromWinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromWinding(WindingInfo newFromWinding) {
		if (newFromWinding != fromWinding) {
			NotificationChain msgs = null;
			if (fromWinding != null)
				msgs = ((InternalEObject)fromWinding).eInverseRemove(this, AssetModelsPackage.WINDING_INFO__WINDING_TESTS, WindingInfo.class, msgs);
			if (newFromWinding != null)
				msgs = ((InternalEObject)newFromWinding).eInverseAdd(this, AssetModelsPackage.WINDING_INFO__WINDING_TESTS, WindingInfo.class, msgs);
			msgs = basicSetFromWinding(newFromWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING, newFromWinding, newFromWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFromTapStep() {
		return fromTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTapStep(int newFromTapStep) {
		int oldFromTapStep = fromTapStep;
		fromTapStep = newFromTapStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_TAP_STEP, oldFromTapStep, fromTapStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING:
				if (fromWinding != null)
					msgs = ((InternalEObject)fromWinding).eInverseRemove(this, AssetModelsPackage.WINDING_INFO__WINDING_TESTS, WindingInfo.class, msgs);
				return basicSetFromWinding((WindingInfo)otherEnd, msgs);
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
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING:
				return basicSetFromWinding(null, msgs);
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
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING:
				if (resolve) return getFromWinding();
				return basicGetFromWinding();
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_TAP_STEP:
				return getFromTapStep();
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
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING:
				setFromWinding((WindingInfo)newValue);
				return;
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_TAP_STEP:
				setFromTapStep((Integer)newValue);
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
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING:
				setFromWinding((WindingInfo)null);
				return;
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_TAP_STEP:
				setFromTapStep(FROM_TAP_STEP_EDEFAULT);
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
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING:
				return fromWinding != null;
			case AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_TAP_STEP:
				return fromTapStep != FROM_TAP_STEP_EDEFAULT;
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
		result.append(" (fromTapStep: ");
		result.append(fromTapStep);
		result.append(')');
		return result.toString();
	}

} //DistributionWindingTestImpl
