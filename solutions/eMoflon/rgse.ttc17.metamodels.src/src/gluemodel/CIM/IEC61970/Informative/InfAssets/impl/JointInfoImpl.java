/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.JointConfigurationKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.JointFillKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.JointInfoImpl#getFillKind <em>Fill Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.JointInfoImpl#getConfigurationKind <em>Configuration Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.JointInfoImpl#getInsulation <em>Insulation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointInfoImpl extends ElectricalInfoImpl implements JointInfo {
	/**
	 * The default value of the '{@link #getFillKind() <em>Fill Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillKind()
	 * @generated
	 * @ordered
	 */
	protected static final JointFillKind FILL_KIND_EDEFAULT = JointFillKind.INSOLUSEAL;

	/**
	 * The cached value of the '{@link #getFillKind() <em>Fill Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillKind()
	 * @generated
	 * @ordered
	 */
	protected JointFillKind fillKind = FILL_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationKind() <em>Configuration Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKind()
	 * @generated
	 * @ordered
	 */
	protected static final JointConfigurationKind CONFIGURATION_KIND_EDEFAULT = JointConfigurationKind.WIRES1TO1;

	/**
	 * The cached value of the '{@link #getConfigurationKind() <em>Configuration Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKind()
	 * @generated
	 * @ordered
	 */
	protected JointConfigurationKind configurationKind = CONFIGURATION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsulation() <em>Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulation()
	 * @generated
	 * @ordered
	 */
	protected static final String INSULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsulation() <em>Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulation()
	 * @generated
	 * @ordered
	 */
	protected String insulation = INSULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getJointInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointFillKind getFillKind() {
		return fillKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillKind(JointFillKind newFillKind) {
		JointFillKind oldFillKind = fillKind;
		fillKind = newFillKind == null ? FILL_KIND_EDEFAULT : newFillKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.JOINT_INFO__FILL_KIND, oldFillKind, fillKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointConfigurationKind getConfigurationKind() {
		return configurationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationKind(JointConfigurationKind newConfigurationKind) {
		JointConfigurationKind oldConfigurationKind = configurationKind;
		configurationKind = newConfigurationKind == null ? CONFIGURATION_KIND_EDEFAULT : newConfigurationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.JOINT_INFO__CONFIGURATION_KIND, oldConfigurationKind, configurationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsulation() {
		return insulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulation(String newInsulation) {
		String oldInsulation = insulation;
		insulation = newInsulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.JOINT_INFO__INSULATION, oldInsulation, insulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.JOINT_INFO__FILL_KIND:
				return getFillKind();
			case InfAssetsPackage.JOINT_INFO__CONFIGURATION_KIND:
				return getConfigurationKind();
			case InfAssetsPackage.JOINT_INFO__INSULATION:
				return getInsulation();
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
			case InfAssetsPackage.JOINT_INFO__FILL_KIND:
				setFillKind((JointFillKind)newValue);
				return;
			case InfAssetsPackage.JOINT_INFO__CONFIGURATION_KIND:
				setConfigurationKind((JointConfigurationKind)newValue);
				return;
			case InfAssetsPackage.JOINT_INFO__INSULATION:
				setInsulation((String)newValue);
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
			case InfAssetsPackage.JOINT_INFO__FILL_KIND:
				setFillKind(FILL_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.JOINT_INFO__CONFIGURATION_KIND:
				setConfigurationKind(CONFIGURATION_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.JOINT_INFO__INSULATION:
				setInsulation(INSULATION_EDEFAULT);
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
			case InfAssetsPackage.JOINT_INFO__FILL_KIND:
				return fillKind != FILL_KIND_EDEFAULT;
			case InfAssetsPackage.JOINT_INFO__CONFIGURATION_KIND:
				return configurationKind != CONFIGURATION_KIND_EDEFAULT;
			case InfAssetsPackage.JOINT_INFO__INSULATION:
				return INSULATION_EDEFAULT == null ? insulation != null : !INSULATION_EDEFAULT.equals(insulation);
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
		result.append(" (fillKind: ");
		result.append(fillKind);
		result.append(", configurationKind: ");
		result.append(configurationKind);
		result.append(", insulation: ");
		result.append(insulation);
		result.append(')');
		return result.toString();
	}

} //JointInfoImpl
