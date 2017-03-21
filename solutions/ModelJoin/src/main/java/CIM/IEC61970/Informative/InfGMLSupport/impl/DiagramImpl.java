/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.CoordinateSystem;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfGMLSupport.Diagram;
import CIM.IEC61970.Informative.InfGMLSupport.DiagramKind;
import CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import CIM.IEC61970.Informative.InfWork.DesignLocation;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.DiagramImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.DiagramImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.DiagramImpl#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.DiagramImpl#getDesignLocations <em>Design Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramImpl extends DocumentImpl implements Diagram {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DiagramKind KIND_EDEFAULT = DiagramKind.DESIGN_SKETCH;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DiagramKind kind = KIND_EDEFAULT;

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
	 * The cached value of the '{@link #getDesignLocations() <em>Design Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocation> designLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.DIAGRAM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM, oldCoordinateSystem, coordinateSystem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM, oldCoordinateSystem, newCoordinateSystem);
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
				msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, CommonPackage.COORDINATE_SYSTEM__DIAGRAMS, CoordinateSystem.class, msgs);
			if (newCoordinateSystem != null)
				msgs = ((InternalEObject)newCoordinateSystem).eInverseAdd(this, CommonPackage.COORDINATE_SYSTEM__DIAGRAMS, CoordinateSystem.class, msgs);
			msgs = basicSetCoordinateSystem(newCoordinateSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM, newCoordinateSystem, newCoordinateSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DiagramKind newKind) {
		DiagramKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.DIAGRAM__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlDiagramObject> getGmlDiagramObjects() {
		if (gmlDiagramObjects == null) {
			gmlDiagramObjects = new EObjectWithInverseResolvingEList.ManyInverse<GmlDiagramObject>(GmlDiagramObject.class, this, InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS);
		}
		return gmlDiagramObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocation> getDesignLocations() {
		if (designLocations == null) {
			designLocations = new EObjectWithInverseResolvingEList.ManyInverse<DesignLocation>(DesignLocation.class, this, InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS, InfWorkPackage.DESIGN_LOCATION__DIAGRAMS);
		}
		return designLocations;
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
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				if (coordinateSystem != null)
					msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, CommonPackage.COORDINATE_SYSTEM__DIAGRAMS, CoordinateSystem.class, msgs);
				return basicSetCoordinateSystem((CoordinateSystem)otherEnd, msgs);
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlDiagramObjects()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocations()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getGmlDiagramObjects()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				return ((InternalEList<?>)getDesignLocations()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				if (resolve) return getCoordinateSystem();
				return basicGetCoordinateSystem();
			case InfGMLSupportPackage.DIAGRAM__KIND:
				return getKind();
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				return getGmlDiagramObjects();
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				return getDesignLocations();
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
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__KIND:
				setKind((DiagramKind)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				getGmlDiagramObjects().addAll((Collection<? extends GmlDiagramObject>)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				getDesignLocations().addAll((Collection<? extends DesignLocation>)newValue);
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
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)null);
				return;
			case InfGMLSupportPackage.DIAGRAM__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				return;
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				getDesignLocations().clear();
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
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				return coordinateSystem != null;
			case InfGMLSupportPackage.DIAGRAM__KIND:
				return kind != KIND_EDEFAULT;
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				return gmlDiagramObjects != null && !gmlDiagramObjects.isEmpty();
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				return designLocations != null && !designLocations.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
