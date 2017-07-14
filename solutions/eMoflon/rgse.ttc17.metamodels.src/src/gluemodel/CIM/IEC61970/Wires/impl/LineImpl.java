/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.SubGeographicalRegion;

import gluemodel.CIM.IEC61970.Core.impl.EquipmentContainerImpl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import gluemodel.CIM.IEC61970.Wires.Line;
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
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.LineImpl#getTransmissionRightOfWay <em>Transmission Right Of Way</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.LineImpl#getFlowgates <em>Flowgates</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.LineImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineImpl extends EquipmentContainerImpl implements Line {
	/**
	 * The cached value of the '{@link #getTransmissionRightOfWay() <em>Transmission Right Of Way</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRightOfWay()
	 * @generated
	 * @ordered
	 */
	protected TransmissionRightOfWay transmissionRightOfWay;

	/**
	 * The cached value of the '{@link #getFlowgates() <em>Flowgates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowgates()
	 * @generated
	 * @ordered
	 */
	protected EList<Flowgate> flowgates;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected SubGeographicalRegion region;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionRightOfWay getTransmissionRightOfWay() {
		if (transmissionRightOfWay != null && transmissionRightOfWay.eIsProxy()) {
			InternalEObject oldTransmissionRightOfWay = (InternalEObject)transmissionRightOfWay;
			transmissionRightOfWay = (TransmissionRightOfWay)eResolveProxy(oldTransmissionRightOfWay);
			if (transmissionRightOfWay != oldTransmissionRightOfWay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY, oldTransmissionRightOfWay, transmissionRightOfWay));
			}
		}
		return transmissionRightOfWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionRightOfWay basicGetTransmissionRightOfWay() {
		return transmissionRightOfWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionRightOfWay(TransmissionRightOfWay newTransmissionRightOfWay, NotificationChain msgs) {
		TransmissionRightOfWay oldTransmissionRightOfWay = transmissionRightOfWay;
		transmissionRightOfWay = newTransmissionRightOfWay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY, oldTransmissionRightOfWay, newTransmissionRightOfWay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionRightOfWay(TransmissionRightOfWay newTransmissionRightOfWay) {
		if (newTransmissionRightOfWay != transmissionRightOfWay) {
			NotificationChain msgs = null;
			if (transmissionRightOfWay != null)
				msgs = ((InternalEObject)transmissionRightOfWay).eInverseRemove(this, EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES, TransmissionRightOfWay.class, msgs);
			if (newTransmissionRightOfWay != null)
				msgs = ((InternalEObject)newTransmissionRightOfWay).eInverseAdd(this, EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES, TransmissionRightOfWay.class, msgs);
			msgs = basicSetTransmissionRightOfWay(newTransmissionRightOfWay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY, newTransmissionRightOfWay, newTransmissionRightOfWay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flowgate> getFlowgates() {
		if (flowgates == null) {
			flowgates = new EObjectWithInverseResolvingEList.ManyInverse<Flowgate>(Flowgate.class, this, WiresPackage.LINE__FLOWGATES, MarketOperationsPackage.FLOWGATE__LINES);
		}
		return flowgates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (SubGeographicalRegion)eResolveProxy(oldRegion);
			if (region != oldRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.LINE__REGION, oldRegion, region));
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(SubGeographicalRegion newRegion, NotificationChain msgs) {
		SubGeographicalRegion oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.LINE__REGION, oldRegion, newRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(SubGeographicalRegion newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, CorePackage.SUB_GEOGRAPHICAL_REGION__LINES, SubGeographicalRegion.class, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, CorePackage.SUB_GEOGRAPHICAL_REGION__LINES, SubGeographicalRegion.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.LINE__REGION, newRegion, newRegion));
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
			case WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY:
				if (transmissionRightOfWay != null)
					msgs = ((InternalEObject)transmissionRightOfWay).eInverseRemove(this, EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES, TransmissionRightOfWay.class, msgs);
				return basicSetTransmissionRightOfWay((TransmissionRightOfWay)otherEnd, msgs);
			case WiresPackage.LINE__FLOWGATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowgates()).basicAdd(otherEnd, msgs);
			case WiresPackage.LINE__REGION:
				if (region != null)
					msgs = ((InternalEObject)region).eInverseRemove(this, CorePackage.SUB_GEOGRAPHICAL_REGION__LINES, SubGeographicalRegion.class, msgs);
				return basicSetRegion((SubGeographicalRegion)otherEnd, msgs);
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
			case WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY:
				return basicSetTransmissionRightOfWay(null, msgs);
			case WiresPackage.LINE__FLOWGATES:
				return ((InternalEList<?>)getFlowgates()).basicRemove(otherEnd, msgs);
			case WiresPackage.LINE__REGION:
				return basicSetRegion(null, msgs);
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
			case WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY:
				if (resolve) return getTransmissionRightOfWay();
				return basicGetTransmissionRightOfWay();
			case WiresPackage.LINE__FLOWGATES:
				return getFlowgates();
			case WiresPackage.LINE__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
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
			case WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY:
				setTransmissionRightOfWay((TransmissionRightOfWay)newValue);
				return;
			case WiresPackage.LINE__FLOWGATES:
				getFlowgates().clear();
				getFlowgates().addAll((Collection<? extends Flowgate>)newValue);
				return;
			case WiresPackage.LINE__REGION:
				setRegion((SubGeographicalRegion)newValue);
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
			case WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY:
				setTransmissionRightOfWay((TransmissionRightOfWay)null);
				return;
			case WiresPackage.LINE__FLOWGATES:
				getFlowgates().clear();
				return;
			case WiresPackage.LINE__REGION:
				setRegion((SubGeographicalRegion)null);
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
			case WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY:
				return transmissionRightOfWay != null;
			case WiresPackage.LINE__FLOWGATES:
				return flowgates != null && !flowgates.isEmpty();
			case WiresPackage.LINE__REGION:
				return region != null;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl
