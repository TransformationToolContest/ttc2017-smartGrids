/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.ToolInfo;

import CIM.IEC61970.Informative.InfWork.Crew;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ToolInfoImpl#getCrew <em>Crew</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ToolInfoImpl#getLastCalibrationDate <em>Last Calibration Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolInfoImpl extends AssetInfoImpl implements ToolInfo {
	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected Crew crew;

	/**
	 * The default value of the '{@link #getLastCalibrationDate() <em>Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCalibrationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_CALIBRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastCalibrationDate() <em>Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCalibrationDate()
	 * @generated
	 * @ordered
	 */
	protected String lastCalibrationDate = LAST_CALIBRATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getToolInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew getCrew() {
		if (crew != null && crew.eIsProxy()) {
			InternalEObject oldCrew = (InternalEObject)crew;
			crew = (Crew)eResolveProxy(oldCrew);
			if (crew != oldCrew) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.TOOL_INFO__CREW, oldCrew, crew));
			}
		}
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew basicGetCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(Crew newCrew, NotificationChain msgs) {
		Crew oldCrew = crew;
		crew = newCrew;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TOOL_INFO__CREW, oldCrew, newCrew);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrew(Crew newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__TOOLS, Crew.class, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject)newCrew).eInverseAdd(this, InfWorkPackage.CREW__TOOLS, Crew.class, msgs);
			msgs = basicSetCrew(newCrew, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TOOL_INFO__CREW, newCrew, newCrew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastCalibrationDate() {
		return lastCalibrationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCalibrationDate(String newLastCalibrationDate) {
		String oldLastCalibrationDate = lastCalibrationDate;
		lastCalibrationDate = newLastCalibrationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TOOL_INFO__LAST_CALIBRATION_DATE, oldLastCalibrationDate, lastCalibrationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.TOOL_INFO__CREW:
				if (crew != null)
					msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__TOOLS, Crew.class, msgs);
				return basicSetCrew((Crew)otherEnd, msgs);
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
			case InfAssetsPackage.TOOL_INFO__CREW:
				return basicSetCrew(null, msgs);
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
			case InfAssetsPackage.TOOL_INFO__CREW:
				if (resolve) return getCrew();
				return basicGetCrew();
			case InfAssetsPackage.TOOL_INFO__LAST_CALIBRATION_DATE:
				return getLastCalibrationDate();
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
			case InfAssetsPackage.TOOL_INFO__CREW:
				setCrew((Crew)newValue);
				return;
			case InfAssetsPackage.TOOL_INFO__LAST_CALIBRATION_DATE:
				setLastCalibrationDate((String)newValue);
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
			case InfAssetsPackage.TOOL_INFO__CREW:
				setCrew((Crew)null);
				return;
			case InfAssetsPackage.TOOL_INFO__LAST_CALIBRATION_DATE:
				setLastCalibrationDate(LAST_CALIBRATION_DATE_EDEFAULT);
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
			case InfAssetsPackage.TOOL_INFO__CREW:
				return crew != null;
			case InfAssetsPackage.TOOL_INFO__LAST_CALIBRATION_DATE:
				return LAST_CALIBRATION_DATE_EDEFAULT == null ? lastCalibrationDate != null : !LAST_CALIBRATION_DATE_EDEFAULT.equals(lastCalibrationDate);
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
		result.append(" (lastCalibrationDate: ");
		result.append(lastCalibrationDate);
		result.append(')');
		return result.toString();
	}

} //ToolInfoImpl
