/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl;

import gluemodel.CIM.IEC61970.Meas.CurrentTransformer;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.CurrentTransformerImpl#getMaxRatio <em>Max Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.CurrentTransformerImpl#getCoreCount <em>Core Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.CurrentTransformerImpl#getCtClass <em>Ct Class</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.CurrentTransformerImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.CurrentTransformerImpl#getAccuracyLimit <em>Accuracy Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.CurrentTransformerImpl#getAccuracyClass <em>Accuracy Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentTransformerImpl extends EquipmentImpl implements CurrentTransformer {
	/**
	 * The default value of the '{@link #getMaxRatio() <em>Max Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxRatio() <em>Max Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRatio()
	 * @generated
	 * @ordered
	 */
	protected float maxRatio = MAX_RATIO_EDEFAULT;

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
	 * The default value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCURACY_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyLimit()
	 * @generated
	 * @ordered
	 */
	protected String accuracyLimit = ACCURACY_LIMIT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentTransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.CURRENT_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxRatio() {
		return maxRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRatio(float newMaxRatio) {
		float oldMaxRatio = maxRatio;
		maxRatio = newMaxRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CURRENT_TRANSFORMER__MAX_RATIO, oldMaxRatio, maxRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CURRENT_TRANSFORMER__CORE_COUNT, oldCoreCount, coreCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CURRENT_TRANSFORMER__CT_CLASS, oldCtClass, ctClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CURRENT_TRANSFORMER__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccuracyLimit() {
		return accuracyLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracyLimit(String newAccuracyLimit) {
		String oldAccuracyLimit = accuracyLimit;
		accuracyLimit = newAccuracyLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT, oldAccuracyLimit, accuracyLimit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS, oldAccuracyClass, accuracyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasPackage.CURRENT_TRANSFORMER__MAX_RATIO:
				return getMaxRatio();
			case MeasPackage.CURRENT_TRANSFORMER__CORE_COUNT:
				return getCoreCount();
			case MeasPackage.CURRENT_TRANSFORMER__CT_CLASS:
				return getCtClass();
			case MeasPackage.CURRENT_TRANSFORMER__USAGE:
				return getUsage();
			case MeasPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
				return getAccuracyLimit();
			case MeasPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
				return getAccuracyClass();
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
			case MeasPackage.CURRENT_TRANSFORMER__MAX_RATIO:
				setMaxRatio((Float)newValue);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__CORE_COUNT:
				setCoreCount((Integer)newValue);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__CT_CLASS:
				setCtClass((String)newValue);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__USAGE:
				setUsage((String)newValue);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
				setAccuracyLimit((String)newValue);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
				setAccuracyClass((String)newValue);
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
			case MeasPackage.CURRENT_TRANSFORMER__MAX_RATIO:
				setMaxRatio(MAX_RATIO_EDEFAULT);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__CORE_COUNT:
				setCoreCount(CORE_COUNT_EDEFAULT);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__CT_CLASS:
				setCtClass(CT_CLASS_EDEFAULT);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
				setAccuracyLimit(ACCURACY_LIMIT_EDEFAULT);
				return;
			case MeasPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
				setAccuracyClass(ACCURACY_CLASS_EDEFAULT);
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
			case MeasPackage.CURRENT_TRANSFORMER__MAX_RATIO:
				return maxRatio != MAX_RATIO_EDEFAULT;
			case MeasPackage.CURRENT_TRANSFORMER__CORE_COUNT:
				return coreCount != CORE_COUNT_EDEFAULT;
			case MeasPackage.CURRENT_TRANSFORMER__CT_CLASS:
				return CT_CLASS_EDEFAULT == null ? ctClass != null : !CT_CLASS_EDEFAULT.equals(ctClass);
			case MeasPackage.CURRENT_TRANSFORMER__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
			case MeasPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
				return ACCURACY_LIMIT_EDEFAULT == null ? accuracyLimit != null : !ACCURACY_LIMIT_EDEFAULT.equals(accuracyLimit);
			case MeasPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
				return ACCURACY_CLASS_EDEFAULT == null ? accuracyClass != null : !ACCURACY_CLASS_EDEFAULT.equals(accuracyClass);
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
		result.append(" (maxRatio: ");
		result.append(maxRatio);
		result.append(", coreCount: ");
		result.append(coreCount);
		result.append(", ctClass: ");
		result.append(ctClass);
		result.append(", usage: ");
		result.append(usage);
		result.append(", accuracyLimit: ");
		result.append(accuracyLimit);
		result.append(", accuracyClass: ");
		result.append(accuracyClass);
		result.append(')');
		return result.toString();
	}

} //CurrentTransformerImpl
