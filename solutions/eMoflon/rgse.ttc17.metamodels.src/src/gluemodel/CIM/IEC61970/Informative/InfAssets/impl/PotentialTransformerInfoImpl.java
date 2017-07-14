/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Ratio;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potential Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PotentialTransformerInfoImpl#getSecondaryRatio <em>Secondary Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PotentialTransformerInfoImpl#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PotentialTransformerInfoImpl#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PotentialTransformerInfoImpl#getPrimaryRatio <em>Primary Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PotentialTransformerInfoImpl#getPtClass <em>Pt Class</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PotentialTransformerInfoImpl#getTertiaryRatio <em>Tertiary Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PotentialTransformerInfoImpl extends ElectricalInfoImpl implements PotentialTransformerInfo {
	/**
	 * The cached value of the '{@link #getSecondaryRatio() <em>Secondary Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio secondaryRatio;

	/**
	 * The cached value of the '{@link #getNominalRatio() <em>Nominal Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio nominalRatio;

	/**
	 * The default value of the '{@link #getAccuracyClass() <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCURACY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccuracyClass() <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyClass()
	 * @generated
	 * @ordered
	 */
	protected String accuracyClass = ACCURACY_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimaryRatio() <em>Primary Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio primaryRatio;

	/**
	 * The default value of the '{@link #getPtClass() <em>Pt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPtClass() <em>Pt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtClass()
	 * @generated
	 * @ordered
	 */
	protected String ptClass = PT_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTertiaryRatio() <em>Tertiary Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTertiaryRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio tertiaryRatio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotentialTransformerInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getPotentialTransformerInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getSecondaryRatio() {
		if (secondaryRatio != null && secondaryRatio.eIsProxy()) {
			InternalEObject oldSecondaryRatio = (InternalEObject)secondaryRatio;
			secondaryRatio = (Ratio)eResolveProxy(oldSecondaryRatio);
			if (secondaryRatio != oldSecondaryRatio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO, oldSecondaryRatio, secondaryRatio));
			}
		}
		return secondaryRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio basicGetSecondaryRatio() {
		return secondaryRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryRatio(Ratio newSecondaryRatio) {
		Ratio oldSecondaryRatio = secondaryRatio;
		secondaryRatio = newSecondaryRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO, oldSecondaryRatio, secondaryRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getNominalRatio() {
		if (nominalRatio != null && nominalRatio.eIsProxy()) {
			InternalEObject oldNominalRatio = (InternalEObject)nominalRatio;
			nominalRatio = (Ratio)eResolveProxy(oldNominalRatio);
			if (nominalRatio != oldNominalRatio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO, oldNominalRatio, nominalRatio));
			}
		}
		return nominalRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio basicGetNominalRatio() {
		return nominalRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalRatio(Ratio newNominalRatio) {
		Ratio oldNominalRatio = nominalRatio;
		nominalRatio = newNominalRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO, oldNominalRatio, nominalRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccuracyClass() {
		return accuracyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracyClass(String newAccuracyClass) {
		String oldAccuracyClass = accuracyClass;
		accuracyClass = newAccuracyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS, oldAccuracyClass, accuracyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getPrimaryRatio() {
		if (primaryRatio != null && primaryRatio.eIsProxy()) {
			InternalEObject oldPrimaryRatio = (InternalEObject)primaryRatio;
			primaryRatio = (Ratio)eResolveProxy(oldPrimaryRatio);
			if (primaryRatio != oldPrimaryRatio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO, oldPrimaryRatio, primaryRatio));
			}
		}
		return primaryRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio basicGetPrimaryRatio() {
		return primaryRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryRatio(Ratio newPrimaryRatio) {
		Ratio oldPrimaryRatio = primaryRatio;
		primaryRatio = newPrimaryRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO, oldPrimaryRatio, primaryRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPtClass() {
		return ptClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtClass(String newPtClass) {
		String oldPtClass = ptClass;
		ptClass = newPtClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PT_CLASS, oldPtClass, ptClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getTertiaryRatio() {
		if (tertiaryRatio != null && tertiaryRatio.eIsProxy()) {
			InternalEObject oldTertiaryRatio = (InternalEObject)tertiaryRatio;
			tertiaryRatio = (Ratio)eResolveProxy(oldTertiaryRatio);
			if (tertiaryRatio != oldTertiaryRatio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO, oldTertiaryRatio, tertiaryRatio));
			}
		}
		return tertiaryRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio basicGetTertiaryRatio() {
		return tertiaryRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTertiaryRatio(Ratio newTertiaryRatio) {
		Ratio oldTertiaryRatio = tertiaryRatio;
		tertiaryRatio = newTertiaryRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO, oldTertiaryRatio, tertiaryRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO:
				if (resolve) return getSecondaryRatio();
				return basicGetSecondaryRatio();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO:
				if (resolve) return getNominalRatio();
				return basicGetNominalRatio();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS:
				return getAccuracyClass();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO:
				if (resolve) return getPrimaryRatio();
				return basicGetPrimaryRatio();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PT_CLASS:
				return getPtClass();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO:
				if (resolve) return getTertiaryRatio();
				return basicGetTertiaryRatio();
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
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO:
				setSecondaryRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO:
				setNominalRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS:
				setAccuracyClass((String)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO:
				setPrimaryRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PT_CLASS:
				setPtClass((String)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO:
				setTertiaryRatio((Ratio)newValue);
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
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO:
				setSecondaryRatio((Ratio)null);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO:
				setNominalRatio((Ratio)null);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS:
				setAccuracyClass(ACCURACY_CLASS_EDEFAULT);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO:
				setPrimaryRatio((Ratio)null);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PT_CLASS:
				setPtClass(PT_CLASS_EDEFAULT);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO:
				setTertiaryRatio((Ratio)null);
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
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO:
				return secondaryRatio != null;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO:
				return nominalRatio != null;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS:
				return ACCURACY_CLASS_EDEFAULT == null ? accuracyClass != null : !ACCURACY_CLASS_EDEFAULT.equals(accuracyClass);
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO:
				return primaryRatio != null;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PT_CLASS:
				return PT_CLASS_EDEFAULT == null ? ptClass != null : !PT_CLASS_EDEFAULT.equals(ptClass);
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO:
				return tertiaryRatio != null;
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
		result.append(" (accuracyClass: ");
		result.append(accuracyClass);
		result.append(", ptClass: ");
		result.append(ptClass);
		result.append(')');
		return result.toString();
	}

} //PotentialTransformerInfoImpl
