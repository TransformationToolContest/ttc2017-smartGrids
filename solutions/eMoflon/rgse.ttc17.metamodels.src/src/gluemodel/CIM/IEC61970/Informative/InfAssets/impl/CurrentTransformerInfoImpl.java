/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Ratio;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getCtClass <em>Ct Class</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getMaxRatio <em>Max Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getPrimaryRatio <em>Primary Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getCoreBurden <em>Core Burden</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getPrimaryFlsRating <em>Primary Fls Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getAccuracyLimit <em>Accuracy Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getKneePointCurrent <em>Knee Point Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getTertiaryRatio <em>Tertiary Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getSecondaryFlsRating <em>Secondary Fls Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getTertiaryFlsRating <em>Tertiary Fls Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getCoreCount <em>Core Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getKneePointVoltage <em>Knee Point Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.CurrentTransformerInfoImpl#getSecondaryRatio <em>Secondary Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentTransformerInfoImpl extends ElectricalInfoImpl implements CurrentTransformerInfo {
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
	 * The default value of the '{@link #getCtClass() <em>Ct Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCtClass() <em>Ct Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtClass()
	 * @generated
	 * @ordered
	 */
	protected String ctClass = CT_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaxRatio() <em>Max Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio maxRatio;

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
	 * The default value of the '{@link #getCoreBurden() <em>Core Burden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreBurden()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_BURDEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreBurden() <em>Core Burden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreBurden()
	 * @generated
	 * @ordered
	 */
	protected float coreBurden = CORE_BURDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryFlsRating() <em>Primary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected static final float PRIMARY_FLS_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrimaryFlsRating() <em>Primary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected float primaryFlsRating = PRIMARY_FLS_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float ACCURACY_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyLimit()
	 * @generated
	 * @ordered
	 */
	protected float accuracyLimit = ACCURACY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKneePointCurrent() <em>Knee Point Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKneePointCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float KNEE_POINT_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKneePointCurrent() <em>Knee Point Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKneePointCurrent()
	 * @generated
	 * @ordered
	 */
	protected float kneePointCurrent = KNEE_POINT_CURRENT_EDEFAULT;

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
	 * The cached value of the '{@link #getNominalRatio() <em>Nominal Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio nominalRatio;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryFlsRating() <em>Secondary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected static final float SECONDARY_FLS_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSecondaryFlsRating() <em>Secondary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected float secondaryFlsRating = SECONDARY_FLS_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTertiaryFlsRating() <em>Tertiary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTertiaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected static final float TERTIARY_FLS_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTertiaryFlsRating() <em>Tertiary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTertiaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected float tertiaryFlsRating = TERTIARY_FLS_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreCount() <em>Core Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoreCount() <em>Core Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCount()
	 * @generated
	 * @ordered
	 */
	protected int coreCount = CORE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKneePointVoltage() <em>Knee Point Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKneePointVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float KNEE_POINT_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKneePointVoltage() <em>Knee Point Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKneePointVoltage()
	 * @generated
	 * @ordered
	 */
	protected float kneePointVoltage = KNEE_POINT_VOLTAGE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentTransformerInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getCurrentTransformerInfo();
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS, oldAccuracyClass, accuracyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCtClass() {
		return ctClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtClass(String newCtClass) {
		String oldCtClass = ctClass;
		ctClass = newCtClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CT_CLASS, oldCtClass, ctClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getMaxRatio() {
		if (maxRatio != null && maxRatio.eIsProxy()) {
			InternalEObject oldMaxRatio = (InternalEObject)maxRatio;
			maxRatio = (Ratio)eResolveProxy(oldMaxRatio);
			if (maxRatio != oldMaxRatio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO, oldMaxRatio, maxRatio));
			}
		}
		return maxRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio basicGetMaxRatio() {
		return maxRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRatio(Ratio newMaxRatio) {
		Ratio oldMaxRatio = maxRatio;
		maxRatio = newMaxRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO, oldMaxRatio, maxRatio));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO, oldPrimaryRatio, primaryRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO, oldPrimaryRatio, primaryRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoreBurden() {
		return coreBurden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreBurden(float newCoreBurden) {
		float oldCoreBurden = coreBurden;
		coreBurden = newCoreBurden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_BURDEN, oldCoreBurden, coreBurden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrimaryFlsRating() {
		return primaryFlsRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryFlsRating(float newPrimaryFlsRating) {
		float oldPrimaryFlsRating = primaryFlsRating;
		primaryFlsRating = newPrimaryFlsRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING, oldPrimaryFlsRating, primaryFlsRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAccuracyLimit() {
		return accuracyLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracyLimit(float newAccuracyLimit) {
		float oldAccuracyLimit = accuracyLimit;
		accuracyLimit = newAccuracyLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT, oldAccuracyLimit, accuracyLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getKneePointCurrent() {
		return kneePointCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKneePointCurrent(float newKneePointCurrent) {
		float oldKneePointCurrent = kneePointCurrent;
		kneePointCurrent = newKneePointCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT, oldKneePointCurrent, kneePointCurrent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO, oldTertiaryRatio, tertiaryRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO, oldTertiaryRatio, tertiaryRatio));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO, oldNominalRatio, nominalRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO, oldNominalRatio, nominalRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(String newUsage) {
		String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSecondaryFlsRating() {
		return secondaryFlsRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryFlsRating(float newSecondaryFlsRating) {
		float oldSecondaryFlsRating = secondaryFlsRating;
		secondaryFlsRating = newSecondaryFlsRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING, oldSecondaryFlsRating, secondaryFlsRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTertiaryFlsRating() {
		return tertiaryFlsRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTertiaryFlsRating(float newTertiaryFlsRating) {
		float oldTertiaryFlsRating = tertiaryFlsRating;
		tertiaryFlsRating = newTertiaryFlsRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING, oldTertiaryFlsRating, tertiaryFlsRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoreCount() {
		return coreCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreCount(int newCoreCount) {
		int oldCoreCount = coreCount;
		coreCount = newCoreCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_COUNT, oldCoreCount, coreCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getKneePointVoltage() {
		return kneePointVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKneePointVoltage(float newKneePointVoltage) {
		float oldKneePointVoltage = kneePointVoltage;
		kneePointVoltage = newKneePointVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE, oldKneePointVoltage, kneePointVoltage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO, oldSecondaryRatio, secondaryRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO, oldSecondaryRatio, secondaryRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS:
				return getAccuracyClass();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CT_CLASS:
				return getCtClass();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO:
				if (resolve) return getMaxRatio();
				return basicGetMaxRatio();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO:
				if (resolve) return getPrimaryRatio();
				return basicGetPrimaryRatio();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_BURDEN:
				return getCoreBurden();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING:
				return getPrimaryFlsRating();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT:
				return getAccuracyLimit();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT:
				return getKneePointCurrent();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO:
				if (resolve) return getTertiaryRatio();
				return basicGetTertiaryRatio();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO:
				if (resolve) return getNominalRatio();
				return basicGetNominalRatio();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__USAGE:
				return getUsage();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING:
				return getSecondaryFlsRating();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING:
				return getTertiaryFlsRating();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_COUNT:
				return getCoreCount();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE:
				return getKneePointVoltage();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO:
				if (resolve) return getSecondaryRatio();
				return basicGetSecondaryRatio();
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
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS:
				setAccuracyClass((String)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CT_CLASS:
				setCtClass((String)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO:
				setMaxRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO:
				setPrimaryRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_BURDEN:
				setCoreBurden((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING:
				setPrimaryFlsRating((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT:
				setAccuracyLimit((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT:
				setKneePointCurrent((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO:
				setTertiaryRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO:
				setNominalRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__USAGE:
				setUsage((String)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING:
				setSecondaryFlsRating((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING:
				setTertiaryFlsRating((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_COUNT:
				setCoreCount((Integer)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE:
				setKneePointVoltage((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO:
				setSecondaryRatio((Ratio)newValue);
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
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS:
				setAccuracyClass(ACCURACY_CLASS_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CT_CLASS:
				setCtClass(CT_CLASS_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO:
				setMaxRatio((Ratio)null);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO:
				setPrimaryRatio((Ratio)null);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_BURDEN:
				setCoreBurden(CORE_BURDEN_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING:
				setPrimaryFlsRating(PRIMARY_FLS_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT:
				setAccuracyLimit(ACCURACY_LIMIT_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT:
				setKneePointCurrent(KNEE_POINT_CURRENT_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO:
				setTertiaryRatio((Ratio)null);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO:
				setNominalRatio((Ratio)null);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING:
				setSecondaryFlsRating(SECONDARY_FLS_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING:
				setTertiaryFlsRating(TERTIARY_FLS_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_COUNT:
				setCoreCount(CORE_COUNT_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE:
				setKneePointVoltage(KNEE_POINT_VOLTAGE_EDEFAULT);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO:
				setSecondaryRatio((Ratio)null);
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
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS:
				return ACCURACY_CLASS_EDEFAULT == null ? accuracyClass != null : !ACCURACY_CLASS_EDEFAULT.equals(accuracyClass);
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CT_CLASS:
				return CT_CLASS_EDEFAULT == null ? ctClass != null : !CT_CLASS_EDEFAULT.equals(ctClass);
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO:
				return maxRatio != null;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO:
				return primaryRatio != null;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_BURDEN:
				return coreBurden != CORE_BURDEN_EDEFAULT;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING:
				return primaryFlsRating != PRIMARY_FLS_RATING_EDEFAULT;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT:
				return accuracyLimit != ACCURACY_LIMIT_EDEFAULT;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT:
				return kneePointCurrent != KNEE_POINT_CURRENT_EDEFAULT;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO:
				return tertiaryRatio != null;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO:
				return nominalRatio != null;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING:
				return secondaryFlsRating != SECONDARY_FLS_RATING_EDEFAULT;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING:
				return tertiaryFlsRating != TERTIARY_FLS_RATING_EDEFAULT;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_COUNT:
				return coreCount != CORE_COUNT_EDEFAULT;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE:
				return kneePointVoltage != KNEE_POINT_VOLTAGE_EDEFAULT;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO:
				return secondaryRatio != null;
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
		result.append(", ctClass: ");
		result.append(ctClass);
		result.append(", coreBurden: ");
		result.append(coreBurden);
		result.append(", primaryFlsRating: ");
		result.append(primaryFlsRating);
		result.append(", accuracyLimit: ");
		result.append(accuracyLimit);
		result.append(", kneePointCurrent: ");
		result.append(kneePointCurrent);
		result.append(", usage: ");
		result.append(usage);
		result.append(", secondaryFlsRating: ");
		result.append(secondaryFlsRating);
		result.append(", tertiaryFlsRating: ");
		result.append(tertiaryFlsRating);
		result.append(", coreCount: ");
		result.append(coreCount);
		result.append(", kneePointVoltage: ");
		result.append(kneePointVoltage);
		result.append(')');
		return result.toString();
	}

} //CurrentTransformerInfoImpl
