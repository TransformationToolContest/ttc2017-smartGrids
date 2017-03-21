/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.CoordinateSystem;
import CIM.IEC61968.Common.Location;
import CIM.IEC61968.Common.PositionPoint;

import CIM.IEC61970.Informative.InfGMLSupport.Diagram;
import CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.CoordinateSystemImpl#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.CoordinateSystemImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.CoordinateSystemImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.CoordinateSystemImpl#getPositionPoints <em>Position Points</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.CoordinateSystemImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinateSystemImpl extends ElementImpl implements CoordinateSystem {
	/**
	 * The cached value of the '{@link #getGmlDiagramObjects() <em>Gml Diagram Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlDiagramObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlDiagramObject> gmlDiagramObjects;

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Diagram> diagrams;

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
	 * The cached value of the '{@link #getPositionPoints() <em>Position Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionPoint> positionPoints;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.COORDINATE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlDiagramObject> getGmlDiagramObjects() {
		if (gmlDiagramObjects == null) {
			gmlDiagramObjects = new EObjectWithInverseResolvingEList.ManyInverse<GmlDiagramObject>(GmlDiagramObject.class, this, CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS);
		}
		return gmlDiagramObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new EObjectWithInverseResolvingEList<Diagram>(Diagram.class, this, CommonPackage.COORDINATE_SYSTEM__DIAGRAMS, InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM);
		}
		return diagrams;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.COORDINATE_SYSTEM__LOCATION, oldLocation, location));
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
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.COORDINATE_SYSTEM__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__COORDINATE_SYSTEMS, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CommonPackage.LOCATION__COORDINATE_SYSTEMS, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.COORDINATE_SYSTEM__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositionPoint> getPositionPoints() {
		if (positionPoints == null) {
			positionPoints = new EObjectWithInverseResolvingEList<PositionPoint>(PositionPoint.class, this, CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS, CommonPackage.POSITION_POINT__COORDINATE_SYSTEM);
		}
		return positionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.COORDINATE_SYSTEM__NAME, oldName, name));
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
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlDiagramObjects()).basicAdd(otherEnd, msgs);
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagrams()).basicAdd(otherEnd, msgs);
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__COORDINATE_SYSTEMS, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPositionPoints()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getGmlDiagramObjects()).basicRemove(otherEnd, msgs);
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				return basicSetLocation(null, msgs);
			case CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS:
				return ((InternalEList<?>)getPositionPoints()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				return getGmlDiagramObjects();
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				return getDiagrams();
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS:
				return getPositionPoints();
			case CommonPackage.COORDINATE_SYSTEM__NAME:
				return getName();
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
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				getGmlDiagramObjects().addAll((Collection<? extends GmlDiagramObject>)newValue);
				return;
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends Diagram>)newValue);
				return;
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				setLocation((Location)newValue);
				return;
			case CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS:
				getPositionPoints().clear();
				getPositionPoints().addAll((Collection<? extends PositionPoint>)newValue);
				return;
			case CommonPackage.COORDINATE_SYSTEM__NAME:
				setName((String)newValue);
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
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				return;
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				getDiagrams().clear();
				return;
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				setLocation((Location)null);
				return;
			case CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS:
				getPositionPoints().clear();
				return;
			case CommonPackage.COORDINATE_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
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
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				return gmlDiagramObjects != null && !gmlDiagramObjects.isEmpty();
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				return location != null;
			case CommonPackage.COORDINATE_SYSTEM__POSITION_POINTS:
				return positionPoints != null && !positionPoints.isEmpty();
			case CommonPackage.COORDINATE_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CoordinateSystemImpl
