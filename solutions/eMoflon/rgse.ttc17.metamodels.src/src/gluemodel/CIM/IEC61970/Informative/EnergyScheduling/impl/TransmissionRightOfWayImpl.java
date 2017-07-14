/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl;

import gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionCorridor;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TransmissionRightOfWay;

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
 * An implementation of the model object '<em><b>Transmission Right Of Way</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionRightOfWayImpl#getTransmissionCorridor <em>Transmission Corridor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.TransmissionRightOfWayImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionRightOfWayImpl extends PowerSystemResourceImpl implements TransmissionRightOfWay {
	/**
	 * The cached value of the '{@link #getTransmissionCorridor() <em>Transmission Corridor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionCorridor()
	 * @generated
	 * @ordered
	 */
	protected TransmissionCorridor transmissionCorridor;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionRightOfWayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.TRANSMISSION_RIGHT_OF_WAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionCorridor getTransmissionCorridor() {
		if (transmissionCorridor != null && transmissionCorridor.eIsProxy()) {
			InternalEObject oldTransmissionCorridor = (InternalEObject)transmissionCorridor;
			transmissionCorridor = (TransmissionCorridor)eResolveProxy(oldTransmissionCorridor);
			if (transmissionCorridor != oldTransmissionCorridor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR, oldTransmissionCorridor, transmissionCorridor));
			}
		}
		return transmissionCorridor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionCorridor basicGetTransmissionCorridor() {
		return transmissionCorridor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionCorridor(TransmissionCorridor newTransmissionCorridor, NotificationChain msgs) {
		TransmissionCorridor oldTransmissionCorridor = transmissionCorridor;
		transmissionCorridor = newTransmissionCorridor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR, oldTransmissionCorridor, newTransmissionCorridor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionCorridor(TransmissionCorridor newTransmissionCorridor) {
		if (newTransmissionCorridor != transmissionCorridor) {
			NotificationChain msgs = null;
			if (transmissionCorridor != null)
				msgs = ((InternalEObject)transmissionCorridor).eInverseRemove(this, EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS, TransmissionCorridor.class, msgs);
			if (newTransmissionCorridor != null)
				msgs = ((InternalEObject)newTransmissionCorridor).eInverseAdd(this, EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS, TransmissionCorridor.class, msgs);
			msgs = basicSetTransmissionCorridor(newTransmissionCorridor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR, newTransmissionCorridor, newTransmissionCorridor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectWithInverseResolvingEList<Line>(Line.class, this, EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES, WiresPackage.LINE__TRANSMISSION_RIGHT_OF_WAY);
		}
		return lines;
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
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR:
				if (transmissionCorridor != null)
					msgs = ((InternalEObject)transmissionCorridor).eInverseRemove(this, EnergySchedulingPackage.TRANSMISSION_CORRIDOR__TRANSMISSION_RIGHT_OF_WAYS, TransmissionCorridor.class, msgs);
				return basicSetTransmissionCorridor((TransmissionCorridor)otherEnd, msgs);
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLines()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR:
				return basicSetTransmissionCorridor(null, msgs);
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR:
				if (resolve) return getTransmissionCorridor();
				return basicGetTransmissionCorridor();
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES:
				return getLines();
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
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR:
				setTransmissionCorridor((TransmissionCorridor)newValue);
				return;
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
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
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR:
				setTransmissionCorridor((TransmissionCorridor)null);
				return;
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES:
				getLines().clear();
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
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__TRANSMISSION_CORRIDOR:
				return transmissionCorridor != null;
			case EnergySchedulingPackage.TRANSMISSION_RIGHT_OF_WAY__LINES:
				return lines != null && !lines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransmissionRightOfWayImpl
