/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.PotentialTransformer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potential Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.PotentialTransformerImpl#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.PotentialTransformerImpl#getPtClass <em>Pt Class</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.PotentialTransformerImpl#getAccuracyClass <em>Accuracy Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PotentialTransformerImpl extends EquipmentImpl implements PotentialTransformer {
	/**
	 * The default value of the '{@link #getNominalRatio() <em>Nominal Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalRatio() <em>Nominal Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalRatio()
	 * @generated
	 * @ordered
	 */
	protected float nominalRatio = NOMINAL_RATIO_EDEFAULT;

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
	protected PotentialTransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.POTENTIAL_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNominalRatio() {
		return nominalRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalRatio(float newNominalRatio) {
		float oldNominalRatio = nominalRatio;
		nominalRatio = newNominalRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO, oldNominalRatio, nominalRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.POTENTIAL_TRANSFORMER__PT_CLASS, oldPtClass, ptClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS, oldAccuracyClass, accuracyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
				return getNominalRatio();
			case MeasPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
				return getPtClass();
			case MeasPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
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
			case MeasPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
				setNominalRatio((Float)newValue);
				return;
			case MeasPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
				setPtClass((String)newValue);
				return;
			case MeasPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
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
			case MeasPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
				setNominalRatio(NOMINAL_RATIO_EDEFAULT);
				return;
			case MeasPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
				setPtClass(PT_CLASS_EDEFAULT);
				return;
			case MeasPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
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
			case MeasPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
				return nominalRatio != NOMINAL_RATIO_EDEFAULT;
			case MeasPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
				return PT_CLASS_EDEFAULT == null ? ptClass != null : !PT_CLASS_EDEFAULT.equals(ptClass);
			case MeasPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
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
		result.append(" (nominalRatio: ");
		result.append(nominalRatio);
		result.append(", ptClass: ");
		result.append(ptClass);
		result.append(", accuracyClass: ");
		result.append(accuracyClass);
		result.append(')');
		return result.toString();
	}

} //PotentialTransformerImpl
