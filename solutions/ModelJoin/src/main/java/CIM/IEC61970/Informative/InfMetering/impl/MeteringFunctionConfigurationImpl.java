/**
 */
package CIM.IEC61970.Informative.InfMetering.impl;

import CIM.IEC61968.Metering.ElectricMeteringFunction;
import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfMetering.InfMeteringPackage;
import CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metering Function Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfMetering.impl.MeteringFunctionConfigurationImpl#getElectricMeteringFunctions <em>Electric Metering Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeteringFunctionConfigurationImpl extends IdentifiedObjectImpl implements MeteringFunctionConfiguration {
	/**
	 * The cached value of the '{@link #getElectricMeteringFunctions() <em>Electric Metering Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricMeteringFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectricMeteringFunction> electricMeteringFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeteringFunctionConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfMeteringPackage.Literals.METERING_FUNCTION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricMeteringFunction> getElectricMeteringFunctions() {
		if (electricMeteringFunctions == null) {
			electricMeteringFunctions = new EObjectWithInverseResolvingEList<ElectricMeteringFunction>(ElectricMeteringFunction.class, this, InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS, MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION);
		}
		return electricMeteringFunctions;
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
			case InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectricMeteringFunctions()).basicAdd(otherEnd, msgs);
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
			case InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS:
				return ((InternalEList<?>)getElectricMeteringFunctions()).basicRemove(otherEnd, msgs);
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
			case InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS:
				return getElectricMeteringFunctions();
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
			case InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS:
				getElectricMeteringFunctions().clear();
				getElectricMeteringFunctions().addAll((Collection<? extends ElectricMeteringFunction>)newValue);
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
			case InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS:
				getElectricMeteringFunctions().clear();
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
			case InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS:
				return electricMeteringFunctions != null && !electricMeteringFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeteringFunctionConfigurationImpl
