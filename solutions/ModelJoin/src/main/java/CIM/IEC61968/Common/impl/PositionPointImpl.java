/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.CoordinateSystem;
import CIM.IEC61968.Common.Location;
import CIM.IEC61968.Common.PositionPoint;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.PositionPointImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.PositionPointImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.PositionPointImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.PositionPointImpl#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.PositionPointImpl#getZPosition <em>ZPosition</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.PositionPointImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionPointImpl extends ElementImpl implements PositionPoint {
	/**
	 * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected CoordinateSystem coordinateSystem;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String XPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected String xPosition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String YPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected String yPosition = YPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String ZPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZPosition()
	 * @generated
	 * @ordered
	 */
	protected String zPosition = ZPOSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.POSITION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystem getCoordinateSystem() {
		if (coordinateSystem != null && coordinateSystem.eIsProxy()) {
			InternalEObject oldCoordinateSystem = (InternalEObject)coordinateSystem;
			coordinateSystem = (CoordinateSystem)eResolveProxy(oldCoordinateSystem);
			if (coordinateSystem != oldCoordinateSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.POSITION_POINT__COORDINATE_SYSTEM, oldCoordinateSystem, coordinateSystem));
			}
		}
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystem basicGetCoordinateSystem() {
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(CoordinateSystem newCoordinateSystem, NotificationChain msgs) {
		CoordinateSystem oldCoordinateSystem = coordinateSystem;
		coordinateSystem = newCoordinateSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.POSITION_POINT__COORDINATE_SYSTEM, oldCoordinateSystem, newCoordinateSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSystem(CoordinateSystem newCoordinateSystem) {
		if (newCoordinateSystem != coordinateSystem) {
			NotificationChain msgs = null;
			if (coordinateSystem != null)
				msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS, CoordinateSystem.class, msgs);
			if (newCoordinateSystem != null)
				msgs = ((InternalEObject)newCoordinateSystem).eInverseAdd(this, CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS, CoordinateSystem.class, msgs);
			msgs = basicSetCoordinateSystem(newCoordinateSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSITION_POINT__COORDINATE_SYSTEM, newCoordinateSystem, newCoordinateSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSITION_POINT__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXPosition() {
		return xPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPosition(String newXPosition) {
		String oldXPosition = xPosition;
		xPosition = newXPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSITION_POINT__XPOSITION, oldXPosition, xPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYPosition() {
		return yPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPosition(String newYPosition) {
		String oldYPosition = yPosition;
		yPosition = newYPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSITION_POINT__YPOSITION, oldYPosition, yPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZPosition() {
		return zPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZPosition(String newZPosition) {
		String oldZPosition = zPosition;
		zPosition = newZPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSITION_POINT__ZPOSITION, oldZPosition, zPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.POSITION_POINT__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSITION_POINT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.POSITION_POINT__COORDINATE_SYSTEM:
				if (coordinateSystem != null)
					msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS, CoordinateSystem.class, msgs);
				return basicSetCoordinateSystem((CoordinateSystem)otherEnd, msgs);
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
			case CommonPackage.POSITION_POINT__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
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
			case CommonPackage.POSITION_POINT__COORDINATE_SYSTEM:
				if (resolve) return getCoordinateSystem();
				return basicGetCoordinateSystem();
			case CommonPackage.POSITION_POINT__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case CommonPackage.POSITION_POINT__XPOSITION:
				return getXPosition();
			case CommonPackage.POSITION_POINT__YPOSITION:
				return getYPosition();
			case CommonPackage.POSITION_POINT__ZPOSITION:
				return getZPosition();
			case CommonPackage.POSITION_POINT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case CommonPackage.POSITION_POINT__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)newValue);
				return;
			case CommonPackage.POSITION_POINT__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case CommonPackage.POSITION_POINT__XPOSITION:
				setXPosition((String)newValue);
				return;
			case CommonPackage.POSITION_POINT__YPOSITION:
				setYPosition((String)newValue);
				return;
			case CommonPackage.POSITION_POINT__ZPOSITION:
				setZPosition((String)newValue);
				return;
			case CommonPackage.POSITION_POINT__LOCATION:
				setLocation((Location)newValue);
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
			case CommonPackage.POSITION_POINT__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)null);
				return;
			case CommonPackage.POSITION_POINT__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case CommonPackage.POSITION_POINT__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case CommonPackage.POSITION_POINT__YPOSITION:
				setYPosition(YPOSITION_EDEFAULT);
				return;
			case CommonPackage.POSITION_POINT__ZPOSITION:
				setZPosition(ZPOSITION_EDEFAULT);
				return;
			case CommonPackage.POSITION_POINT__LOCATION:
				setLocation((Location)null);
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
			case CommonPackage.POSITION_POINT__COORDINATE_SYSTEM:
				return coordinateSystem != null;
			case CommonPackage.POSITION_POINT__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case CommonPackage.POSITION_POINT__XPOSITION:
				return XPOSITION_EDEFAULT == null ? xPosition != null : !XPOSITION_EDEFAULT.equals(xPosition);
			case CommonPackage.POSITION_POINT__YPOSITION:
				return YPOSITION_EDEFAULT == null ? yPosition != null : !YPOSITION_EDEFAULT.equals(yPosition);
			case CommonPackage.POSITION_POINT__ZPOSITION:
				return ZPOSITION_EDEFAULT == null ? zPosition != null : !ZPOSITION_EDEFAULT.equals(zPosition);
			case CommonPackage.POSITION_POINT__LOCATION:
				return location != null;
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
		result.append(" (sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", xPosition: ");
		result.append(xPosition);
		result.append(", yPosition: ");
		result.append(yPosition);
		result.append(", zPosition: ");
		result.append(zPosition);
		result.append(')');
		return result.toString();
	}

} //PositionPointImpl
