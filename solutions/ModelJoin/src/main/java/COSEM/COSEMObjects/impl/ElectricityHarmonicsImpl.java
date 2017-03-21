/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ElectricityHarmonics;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electricity Harmonics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityHarmonicsImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityHarmonicsImpl#getFundamental_harmonic <em>Fundamental harmonic</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityHarmonicsImpl#getHarmonic <em>Harmonic</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityHarmonicsImpl#getTotal_Harmoni_Distortion <em>Total Harmoni Distortion</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityHarmonicsImpl#getTotal_Demand_Distortion <em>Total Demand Distortion</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityHarmonicsImpl#getAll_harmonics <em>All harmonics</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityHarmonicsImpl#getAll_harmonics_to_nominal_value_ratio <em>All harmonics to nominal value ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricityHarmonicsImpl extends DataImpl implements ElectricityHarmonics {
	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected double total = TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFundamental_harmonic() <em>Fundamental harmonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundamental_harmonic()
	 * @generated
	 * @ordered
	 */
	protected static final double FUNDAMENTAL_HARMONIC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFundamental_harmonic() <em>Fundamental harmonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundamental_harmonic()
	 * @generated
	 * @ordered
	 */
	protected double fundamental_harmonic = FUNDAMENTAL_HARMONIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getHarmonic() <em>Harmonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarmonic()
	 * @generated
	 * @ordered
	 */
	protected static final double HARMONIC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHarmonic() <em>Harmonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarmonic()
	 * @generated
	 * @ordered
	 */
	protected double harmonic = HARMONIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_Harmoni_Distortion() <em>Total Harmoni Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_Harmoni_Distortion()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_HARMONI_DISTORTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_Harmoni_Distortion() <em>Total Harmoni Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_Harmoni_Distortion()
	 * @generated
	 * @ordered
	 */
	protected double total_Harmoni_Distortion = TOTAL_HARMONI_DISTORTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_Demand_Distortion() <em>Total Demand Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_Demand_Distortion()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_DEMAND_DISTORTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_Demand_Distortion() <em>Total Demand Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_Demand_Distortion()
	 * @generated
	 * @ordered
	 */
	protected double total_Demand_Distortion = TOTAL_DEMAND_DISTORTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAll_harmonics() <em>All harmonics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAll_harmonics()
	 * @generated
	 * @ordered
	 */
	protected static final double ALL_HARMONICS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAll_harmonics() <em>All harmonics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAll_harmonics()
	 * @generated
	 * @ordered
	 */
	protected double all_harmonics = ALL_HARMONICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAll_harmonics_to_nominal_value_ratio() <em>All harmonics to nominal value ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAll_harmonics_to_nominal_value_ratio()
	 * @generated
	 * @ordered
	 */
	protected static final double ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAll_harmonics_to_nominal_value_ratio() <em>All harmonics to nominal value ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAll_harmonics_to_nominal_value_ratio()
	 * @generated
	 * @ordered
	 */
	protected double all_harmonics_to_nominal_value_ratio = ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricityHarmonicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getElectricityHarmonics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(double newTotal) {
		double oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFundamental_harmonic() {
		return fundamental_harmonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundamental_harmonic(double newFundamental_harmonic) {
		double oldFundamental_harmonic = fundamental_harmonic;
		fundamental_harmonic = newFundamental_harmonic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_HARMONICS__FUNDAMENTAL_HARMONIC, oldFundamental_harmonic, fundamental_harmonic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHarmonic() {
		return harmonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHarmonic(double newHarmonic) {
		double oldHarmonic = harmonic;
		harmonic = newHarmonic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_HARMONICS__HARMONIC, oldHarmonic, harmonic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotal_Harmoni_Distortion() {
		return total_Harmoni_Distortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_Harmoni_Distortion(double newTotal_Harmoni_Distortion) {
		double oldTotal_Harmoni_Distortion = total_Harmoni_Distortion;
		total_Harmoni_Distortion = newTotal_Harmoni_Distortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_HARMONI_DISTORTION, oldTotal_Harmoni_Distortion, total_Harmoni_Distortion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotal_Demand_Distortion() {
		return total_Demand_Distortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_Demand_Distortion(double newTotal_Demand_Distortion) {
		double oldTotal_Demand_Distortion = total_Demand_Distortion;
		total_Demand_Distortion = newTotal_Demand_Distortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_DEMAND_DISTORTION, oldTotal_Demand_Distortion, total_Demand_Distortion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAll_harmonics() {
		return all_harmonics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll_harmonics(double newAll_harmonics) {
		double oldAll_harmonics = all_harmonics;
		all_harmonics = newAll_harmonics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS, oldAll_harmonics, all_harmonics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAll_harmonics_to_nominal_value_ratio() {
		return all_harmonics_to_nominal_value_ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll_harmonics_to_nominal_value_ratio(double newAll_harmonics_to_nominal_value_ratio) {
		double oldAll_harmonics_to_nominal_value_ratio = all_harmonics_to_nominal_value_ratio;
		all_harmonics_to_nominal_value_ratio = newAll_harmonics_to_nominal_value_ratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO, oldAll_harmonics_to_nominal_value_ratio, all_harmonics_to_nominal_value_ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL:
				return getTotal();
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__FUNDAMENTAL_HARMONIC:
				return getFundamental_harmonic();
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__HARMONIC:
				return getHarmonic();
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_HARMONI_DISTORTION:
				return getTotal_Harmoni_Distortion();
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_DEMAND_DISTORTION:
				return getTotal_Demand_Distortion();
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS:
				return getAll_harmonics();
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO:
				return getAll_harmonics_to_nominal_value_ratio();
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
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL:
				setTotal((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__FUNDAMENTAL_HARMONIC:
				setFundamental_harmonic((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__HARMONIC:
				setHarmonic((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_HARMONI_DISTORTION:
				setTotal_Harmoni_Distortion((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_DEMAND_DISTORTION:
				setTotal_Demand_Distortion((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS:
				setAll_harmonics((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO:
				setAll_harmonics_to_nominal_value_ratio((Double)newValue);
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
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__FUNDAMENTAL_HARMONIC:
				setFundamental_harmonic(FUNDAMENTAL_HARMONIC_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__HARMONIC:
				setHarmonic(HARMONIC_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_HARMONI_DISTORTION:
				setTotal_Harmoni_Distortion(TOTAL_HARMONI_DISTORTION_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_DEMAND_DISTORTION:
				setTotal_Demand_Distortion(TOTAL_DEMAND_DISTORTION_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS:
				setAll_harmonics(ALL_HARMONICS_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO:
				setAll_harmonics_to_nominal_value_ratio(ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO_EDEFAULT);
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
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL:
				return total != TOTAL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__FUNDAMENTAL_HARMONIC:
				return fundamental_harmonic != FUNDAMENTAL_HARMONIC_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__HARMONIC:
				return harmonic != HARMONIC_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_HARMONI_DISTORTION:
				return total_Harmoni_Distortion != TOTAL_HARMONI_DISTORTION_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__TOTAL_DEMAND_DISTORTION:
				return total_Demand_Distortion != TOTAL_DEMAND_DISTORTION_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS:
				return all_harmonics != ALL_HARMONICS_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS__ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO:
				return all_harmonics_to_nominal_value_ratio != ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO_EDEFAULT;
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
		result.append(" (total: ");
		result.append(total);
		result.append(", fundamental_harmonic: ");
		result.append(fundamental_harmonic);
		result.append(", harmonic: ");
		result.append(harmonic);
		result.append(", Total_Harmoni_Distortion: ");
		result.append(total_Harmoni_Distortion);
		result.append(", Total_Demand_Distortion: ");
		result.append(total_Demand_Distortion);
		result.append(", All_harmonics: ");
		result.append(all_harmonics);
		result.append(", All_harmonics_to_nominal_value_ratio: ");
		result.append(all_harmonics_to_nominal_value_ratio);
		result.append(')');
		return result.toString();
	}

} //ElectricityHarmonicsImpl
