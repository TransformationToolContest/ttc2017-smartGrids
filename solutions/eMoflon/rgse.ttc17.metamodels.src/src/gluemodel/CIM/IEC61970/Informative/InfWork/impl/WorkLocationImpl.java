/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.impl.LocationImpl;

import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.OneCallRequest;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation;

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
 * An implementation of the model object '<em><b>Work Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl#getSubdivision <em>Subdivision</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl#getDesignLocations <em>Design Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl#getOneCallRequest <em>One Call Request</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl#getLot <em>Lot</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl#getNearestIntersection <em>Nearest Intersection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkLocationImpl extends LocationImpl implements WorkLocation {
	/**
	 * The default value of the '{@link #getSubdivision() <em>Subdivision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdivision()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBDIVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubdivision() <em>Subdivision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdivision()
	 * @generated
	 * @ordered
	 */
	protected String subdivision = SUBDIVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected String block = BLOCK_EDEFAULT;

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
	 * The cached value of the '{@link #getOneCallRequest() <em>One Call Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneCallRequest()
	 * @generated
	 * @ordered
	 */
	protected OneCallRequest oneCallRequest;

	/**
	 * The default value of the '{@link #getLot() <em>Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLot()
	 * @generated
	 * @ordered
	 */
	protected static final String LOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLot() <em>Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLot()
	 * @generated
	 * @ordered
	 */
	protected String lot = LOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNearestIntersection() <em>Nearest Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNearestIntersection()
	 * @generated
	 * @ordered
	 */
	protected static final String NEAREST_INTERSECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNearestIntersection() <em>Nearest Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNearestIntersection()
	 * @generated
	 * @ordered
	 */
	protected String nearestIntersection = NEAREST_INTERSECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.WORK_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubdivision() {
		return subdivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubdivision(String newSubdivision) {
		String oldSubdivision = subdivision;
		subdivision = newSubdivision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_LOCATION__SUBDIVISION, oldSubdivision, subdivision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(String newBlock) {
		String oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_LOCATION__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocation> getDesignLocations() {
		if (designLocations == null) {
			designLocations = new EObjectWithInverseResolvingEList.ManyInverse<DesignLocation>(DesignLocation.class, this, InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS, InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS);
		}
		return designLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneCallRequest getOneCallRequest() {
		if (oneCallRequest != null && oneCallRequest.eIsProxy()) {
			InternalEObject oldOneCallRequest = (InternalEObject)oneCallRequest;
			oneCallRequest = (OneCallRequest)eResolveProxy(oldOneCallRequest);
			if (oneCallRequest != oldOneCallRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST, oldOneCallRequest, oneCallRequest));
			}
		}
		return oneCallRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneCallRequest basicGetOneCallRequest() {
		return oneCallRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneCallRequest(OneCallRequest newOneCallRequest, NotificationChain msgs) {
		OneCallRequest oldOneCallRequest = oneCallRequest;
		oneCallRequest = newOneCallRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST, oldOneCallRequest, newOneCallRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneCallRequest(OneCallRequest newOneCallRequest) {
		if (newOneCallRequest != oneCallRequest) {
			NotificationChain msgs = null;
			if (oneCallRequest != null)
				msgs = ((InternalEObject)oneCallRequest).eInverseRemove(this, InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS, OneCallRequest.class, msgs);
			if (newOneCallRequest != null)
				msgs = ((InternalEObject)newOneCallRequest).eInverseAdd(this, InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS, OneCallRequest.class, msgs);
			msgs = basicSetOneCallRequest(newOneCallRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST, newOneCallRequest, newOneCallRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLot() {
		return lot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLot(String newLot) {
		String oldLot = lot;
		lot = newLot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_LOCATION__LOT, oldLot, lot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNearestIntersection() {
		return nearestIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNearestIntersection(String newNearestIntersection) {
		String oldNearestIntersection = nearestIntersection;
		nearestIntersection = newNearestIntersection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_LOCATION__NEAREST_INTERSECTION, oldNearestIntersection, nearestIntersection));
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
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				if (oneCallRequest != null)
					msgs = ((InternalEObject)oneCallRequest).eInverseRemove(this, InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS, OneCallRequest.class, msgs);
				return basicSetOneCallRequest((OneCallRequest)otherEnd, msgs);
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
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				return ((InternalEList<?>)getDesignLocations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				return basicSetOneCallRequest(null, msgs);
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
			case InfWorkPackage.WORK_LOCATION__SUBDIVISION:
				return getSubdivision();
			case InfWorkPackage.WORK_LOCATION__BLOCK:
				return getBlock();
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				return getDesignLocations();
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				if (resolve) return getOneCallRequest();
				return basicGetOneCallRequest();
			case InfWorkPackage.WORK_LOCATION__LOT:
				return getLot();
			case InfWorkPackage.WORK_LOCATION__NEAREST_INTERSECTION:
				return getNearestIntersection();
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
			case InfWorkPackage.WORK_LOCATION__SUBDIVISION:
				setSubdivision((String)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__BLOCK:
				setBlock((String)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				getDesignLocations().addAll((Collection<? extends DesignLocation>)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				setOneCallRequest((OneCallRequest)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__LOT:
				setLot((String)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__NEAREST_INTERSECTION:
				setNearestIntersection((String)newValue);
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
			case InfWorkPackage.WORK_LOCATION__SUBDIVISION:
				setSubdivision(SUBDIVISION_EDEFAULT);
				return;
			case InfWorkPackage.WORK_LOCATION__BLOCK:
				setBlock(BLOCK_EDEFAULT);
				return;
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				return;
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				setOneCallRequest((OneCallRequest)null);
				return;
			case InfWorkPackage.WORK_LOCATION__LOT:
				setLot(LOT_EDEFAULT);
				return;
			case InfWorkPackage.WORK_LOCATION__NEAREST_INTERSECTION:
				setNearestIntersection(NEAREST_INTERSECTION_EDEFAULT);
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
			case InfWorkPackage.WORK_LOCATION__SUBDIVISION:
				return SUBDIVISION_EDEFAULT == null ? subdivision != null : !SUBDIVISION_EDEFAULT.equals(subdivision);
			case InfWorkPackage.WORK_LOCATION__BLOCK:
				return BLOCK_EDEFAULT == null ? block != null : !BLOCK_EDEFAULT.equals(block);
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				return designLocations != null && !designLocations.isEmpty();
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				return oneCallRequest != null;
			case InfWorkPackage.WORK_LOCATION__LOT:
				return LOT_EDEFAULT == null ? lot != null : !LOT_EDEFAULT.equals(lot);
			case InfWorkPackage.WORK_LOCATION__NEAREST_INTERSECTION:
				return NEAREST_INTERSECTION_EDEFAULT == null ? nearestIntersection != null : !NEAREST_INTERSECTION_EDEFAULT.equals(nearestIntersection);
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
		result.append(" (subdivision: ");
		result.append(subdivision);
		result.append(", block: ");
		result.append(block);
		result.append(", lot: ");
		result.append(lot);
		result.append(", nearestIntersection: ");
		result.append(nearestIntersection);
		result.append(')');
		return result.toString();
	}

} //WorkLocationImpl
