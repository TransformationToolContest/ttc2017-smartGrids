/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.BaseVoltage;
import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.VoltageLevel;

import CIM.IEC61970.Topology.TopologicalNode;
import CIM.IEC61970.Topology.TopologyPackage;

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
 * An implementation of the model object '<em><b>Base Voltage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.BaseVoltageImpl#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.BaseVoltageImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.BaseVoltageImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.BaseVoltageImpl#isIsDC <em>Is DC</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.BaseVoltageImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseVoltageImpl extends IdentifiedObjectImpl implements BaseVoltage {
	/**
	 * The default value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected float nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologicalNode> topologicalNode;

	/**
	 * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageLevel> voltageLevel;

	/**
	 * The default value of the '{@link #isIsDC() <em>Is DC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDC()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDC() <em>Is DC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDC()
	 * @generated
	 * @ordered
	 */
	protected boolean isDC = IS_DC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<ConductingEquipment> conductingEquipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseVoltageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BASE_VOLTAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNominalVoltage() {
		return nominalVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalVoltage(float newNominalVoltage) {
		float oldNominalVoltage = nominalVoltage;
		nominalVoltage = newNominalVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_VOLTAGE__NOMINAL_VOLTAGE, oldNominalVoltage, nominalVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopologicalNode> getTopologicalNode() {
		if (topologicalNode == null) {
			topologicalNode = new EObjectWithInverseResolvingEList<TopologicalNode>(TopologicalNode.class, this, CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE);
		}
		return topologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VoltageLevel> getVoltageLevel() {
		if (voltageLevel == null) {
			voltageLevel = new EObjectWithInverseResolvingEList<VoltageLevel>(VoltageLevel.class, this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE);
		}
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDC() {
		return isDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDC(boolean newIsDC) {
		boolean oldIsDC = isDC;
		isDC = newIsDC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_VOLTAGE__IS_DC, oldIsDC, isDC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConductingEquipment> getConductingEquipment() {
		if (conductingEquipment == null) {
			conductingEquipment = new EObjectWithInverseResolvingEList<ConductingEquipment>(ConductingEquipment.class, this, CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE);
		}
		return conductingEquipment;
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
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologicalNode()).basicAdd(otherEnd, msgs);
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVoltageLevel()).basicAdd(otherEnd, msgs);
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipment()).basicAdd(otherEnd, msgs);
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
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				return ((InternalEList<?>)getTopologicalNode()).basicRemove(otherEnd, msgs);
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return ((InternalEList<?>)getVoltageLevel()).basicRemove(otherEnd, msgs);
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return ((InternalEList<?>)getConductingEquipment()).basicRemove(otherEnd, msgs);
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
			case CorePackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				return getNominalVoltage();
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				return getTopologicalNode();
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return getVoltageLevel();
			case CorePackage.BASE_VOLTAGE__IS_DC:
				return isIsDC();
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return getConductingEquipment();
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
			case CorePackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				setNominalVoltage((Float)newValue);
				return;
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				getTopologicalNode().addAll((Collection<? extends TopologicalNode>)newValue);
				return;
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				getVoltageLevel().clear();
				getVoltageLevel().addAll((Collection<? extends VoltageLevel>)newValue);
				return;
			case CorePackage.BASE_VOLTAGE__IS_DC:
				setIsDC((Boolean)newValue);
				return;
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
				getConductingEquipment().addAll((Collection<? extends ConductingEquipment>)newValue);
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
			case CorePackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				setNominalVoltage(NOMINAL_VOLTAGE_EDEFAULT);
				return;
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				return;
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				getVoltageLevel().clear();
				return;
			case CorePackage.BASE_VOLTAGE__IS_DC:
				setIsDC(IS_DC_EDEFAULT);
				return;
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
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
			case CorePackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				return nominalVoltage != NOMINAL_VOLTAGE_EDEFAULT;
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				return topologicalNode != null && !topologicalNode.isEmpty();
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return voltageLevel != null && !voltageLevel.isEmpty();
			case CorePackage.BASE_VOLTAGE__IS_DC:
				return isDC != IS_DC_EDEFAULT;
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null && !conductingEquipment.isEmpty();
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
		result.append(" (nominalVoltage: ");
		result.append(nominalVoltage);
		result.append(", isDC: ");
		result.append(isDC);
		result.append(')');
		return result.toString();
	}

} //BaseVoltageImpl
