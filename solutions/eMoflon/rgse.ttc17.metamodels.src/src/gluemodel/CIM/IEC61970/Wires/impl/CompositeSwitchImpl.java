/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl;

import gluemodel.CIM.IEC61970.Wires.CompositeSwitch;
import gluemodel.CIM.IEC61970.Wires.Switch;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.CompositeSwitchImpl#getCompositeSwitchType <em>Composite Switch Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.CompositeSwitchImpl#getSwitches <em>Switches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeSwitchImpl extends EquipmentImpl implements CompositeSwitch {
	/**
	 * The default value of the '{@link #getCompositeSwitchType() <em>Composite Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSwitchType()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPOSITE_SWITCH_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompositeSwitchType() <em>Composite Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSwitchType()
	 * @generated
	 * @ordered
	 */
	protected String compositeSwitchType = COMPOSITE_SWITCH_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.COMPOSITE_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompositeSwitchType() {
		return compositeSwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeSwitchType(String newCompositeSwitchType) {
		String oldCompositeSwitchType = compositeSwitchType;
		compositeSwitchType = newCompositeSwitchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE, oldCompositeSwitchType, compositeSwitchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new EObjectWithInverseResolvingEList<Switch>(Switch.class, this, WiresPackage.COMPOSITE_SWITCH__SWITCHES, WiresPackage.SWITCH__COMPOSITE_SWITCH);
		}
		return switches;
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
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitches()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
				return getCompositeSwitchType();
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				return getSwitches();
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
			case WiresPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
				setCompositeSwitchType((String)newValue);
				return;
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
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
			case WiresPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
				setCompositeSwitchType(COMPOSITE_SWITCH_TYPE_EDEFAULT);
				return;
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				getSwitches().clear();
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
			case WiresPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
				return COMPOSITE_SWITCH_TYPE_EDEFAULT == null ? compositeSwitchType != null : !COMPOSITE_SWITCH_TYPE_EDEFAULT.equals(compositeSwitchType);
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				return switches != null && !switches.isEmpty();
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
		result.append(" (compositeSwitchType: ");
		result.append(compositeSwitchType);
		result.append(')');
		return result.toString();
	}

} //CompositeSwitchImpl
