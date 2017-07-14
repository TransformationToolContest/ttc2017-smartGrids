/**
 */
package gluemodel.CIM.PackageDependencies.impl;

import gluemodel.CIM.PackageDependencies.PackageDependenciesCIMVeresion;
import gluemodel.CIM.PackageDependencies.PackageDependenciesPackage;

import gluemodel.CIM.impl.ElementImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Veresion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.PackageDependencies.impl.PackageDependenciesCIMVeresionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link gluemodel.CIM.PackageDependencies.impl.PackageDependenciesCIMVeresionImpl#getVesion <em>Vesion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageDependenciesCIMVeresionImpl extends ElementImpl implements PackageDependenciesCIMVeresion {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVesion() <em>Vesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesion()
	 * @generated
	 * @ordered
	 */
	protected static final String VESION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVesion() <em>Vesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesion()
	 * @generated
	 * @ordered
	 */
	protected String vesion = VESION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageDependenciesCIMVeresionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageDependenciesPackage.Literals.PACKAGE_DEPENDENCIES_CIM_VERESION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVesion() {
		return vesion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVesion(String newVesion) {
		String oldVesion = vesion;
		vesion = newVesion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__VESION, oldVesion, vesion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__DATE:
				return getDate();
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__VESION:
				return getVesion();
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
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__DATE:
				setDate((Date)newValue);
				return;
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__VESION:
				setVesion((String)newValue);
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
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__VESION:
				setVesion(VESION_EDEFAULT);
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
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__VESION:
				return VESION_EDEFAULT == null ? vesion != null : !VESION_EDEFAULT.equals(vesion);
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
		result.append(" (date: ");
		result.append(date);
		result.append(", vesion: ");
		result.append(vesion);
		result.append(')');
		return result.toString();
	}

} //PackageDependenciesCIMVeresionImpl
