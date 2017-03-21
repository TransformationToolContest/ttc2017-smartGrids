/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.EnvironmentRelatedParameters;

import COSEM.InterfaceClasses.impl.RegisterImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Related Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.EnvironmentRelatedParametersImpl#getAmbient_temperature <em>Ambient temperature</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.EnvironmentRelatedParametersImpl#getAmbient_pressure <em>Ambient pressure</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.EnvironmentRelatedParametersImpl#getRelative_humidity <em>Relative humidity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentRelatedParametersImpl extends RegisterImpl implements EnvironmentRelatedParameters {
	/**
	 * The default value of the '{@link #getAmbient_temperature() <em>Ambient temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbient_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final double AMBIENT_TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmbient_temperature() <em>Ambient temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbient_temperature()
	 * @generated
	 * @ordered
	 */
	protected double ambient_temperature = AMBIENT_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmbient_pressure() <em>Ambient pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbient_pressure()
	 * @generated
	 * @ordered
	 */
	protected static final double AMBIENT_PRESSURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmbient_pressure() <em>Ambient pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbient_pressure()
	 * @generated
	 * @ordered
	 */
	protected double ambient_pressure = AMBIENT_PRESSURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelative_humidity() <em>Relative humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative_humidity()
	 * @generated
	 * @ordered
	 */
	protected static final double RELATIVE_HUMIDITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRelative_humidity() <em>Relative humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative_humidity()
	 * @generated
	 * @ordered
	 */
	protected double relative_humidity = RELATIVE_HUMIDITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentRelatedParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getEnvironmentRelatedParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmbient_temperature() {
		return ambient_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbient_temperature(double newAmbient_temperature) {
		double oldAmbient_temperature = ambient_temperature;
		ambient_temperature = newAmbient_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_TEMPERATURE, oldAmbient_temperature, ambient_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmbient_pressure() {
		return ambient_pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbient_pressure(double newAmbient_pressure) {
		double oldAmbient_pressure = ambient_pressure;
		ambient_pressure = newAmbient_pressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_PRESSURE, oldAmbient_pressure, ambient_pressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelative_humidity() {
		return relative_humidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelative_humidity(double newRelative_humidity) {
		double oldRelative_humidity = relative_humidity;
		relative_humidity = newRelative_humidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__RELATIVE_HUMIDITY, oldRelative_humidity, relative_humidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_TEMPERATURE:
				return getAmbient_temperature();
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_PRESSURE:
				return getAmbient_pressure();
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__RELATIVE_HUMIDITY:
				return getRelative_humidity();
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
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_TEMPERATURE:
				setAmbient_temperature((Double)newValue);
				return;
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_PRESSURE:
				setAmbient_pressure((Double)newValue);
				return;
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__RELATIVE_HUMIDITY:
				setRelative_humidity((Double)newValue);
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
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_TEMPERATURE:
				setAmbient_temperature(AMBIENT_TEMPERATURE_EDEFAULT);
				return;
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_PRESSURE:
				setAmbient_pressure(AMBIENT_PRESSURE_EDEFAULT);
				return;
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__RELATIVE_HUMIDITY:
				setRelative_humidity(RELATIVE_HUMIDITY_EDEFAULT);
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
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_TEMPERATURE:
				return ambient_temperature != AMBIENT_TEMPERATURE_EDEFAULT;
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_PRESSURE:
				return ambient_pressure != AMBIENT_PRESSURE_EDEFAULT;
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS__RELATIVE_HUMIDITY:
				return relative_humidity != RELATIVE_HUMIDITY_EDEFAULT;
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
		result.append(" (ambient_temperature: ");
		result.append(ambient_temperature);
		result.append(", Ambient_pressure: ");
		result.append(ambient_pressure);
		result.append(", Relative_humidity: ");
		result.append(relative_humidity);
		result.append(')');
		return result.toString();
	}

} //EnvironmentRelatedParametersImpl
