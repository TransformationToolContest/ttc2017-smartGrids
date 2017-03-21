/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.SlUnits;

import substationStandard.Enumerations.SIUnitsKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sl Units</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.SlUnitsImpl#getSlUnitsKind <em>Sl Units Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlUnitsImpl extends MinimalEObjectImpl.Container implements SlUnits {
	/**
	 * The default value of the '{@link #getSlUnitsKind() <em>Sl Units Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlUnitsKind()
	 * @generated
	 * @ordered
	 */
	protected static final SIUnitsKind SL_UNITS_KIND_EDEFAULT = SIUnitsKind.DIMENSIONLESS;

	/**
	 * The cached value of the '{@link #getSlUnitsKind() <em>Sl Units Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlUnitsKind()
	 * @generated
	 * @ordered
	 */
	protected SIUnitsKind slUnitsKind = SL_UNITS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlUnitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.SL_UNITS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIUnitsKind getSlUnitsKind() {
		return slUnitsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlUnitsKind(SIUnitsKind newSlUnitsKind) {
		SIUnitsKind oldSlUnitsKind = slUnitsKind;
		slUnitsKind = newSlUnitsKind == null ? SL_UNITS_KIND_EDEFAULT : newSlUnitsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SL_UNITS__SL_UNITS_KIND, oldSlUnitsKind, slUnitsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.SL_UNITS__SL_UNITS_KIND:
				return getSlUnitsKind();
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
			case DataclassesPackage.SL_UNITS__SL_UNITS_KIND:
				setSlUnitsKind((SIUnitsKind)newValue);
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
			case DataclassesPackage.SL_UNITS__SL_UNITS_KIND:
				setSlUnitsKind(SL_UNITS_KIND_EDEFAULT);
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
			case DataclassesPackage.SL_UNITS__SL_UNITS_KIND:
				return slUnitsKind != SL_UNITS_KIND_EDEFAULT;
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
		result.append(" (SlUnitsKind: ");
		result.append(slUnitsKind);
		result.append(')');
		return result.toString();
	}

} //SlUnitsImpl
