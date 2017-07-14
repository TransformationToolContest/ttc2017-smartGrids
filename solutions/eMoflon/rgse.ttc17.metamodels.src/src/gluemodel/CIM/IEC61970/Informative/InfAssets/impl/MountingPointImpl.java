/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo;

import gluemodel.CIM.IEC61970.Core.PhaseCode;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection;
import gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint;

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
 * An implementation of the model object '<em><b>Mounting Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MountingPointImpl#getXCoord <em>XCoord</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MountingPointImpl#getOverheadConductors <em>Overhead Conductors</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MountingPointImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MountingPointImpl#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.MountingPointImpl#getYCoord <em>YCoord</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MountingPointImpl extends IdentifiedObjectImpl implements MountingPoint {
	/**
	 * The default value of the '{@link #getXCoord() <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoord()
	 * @generated
	 * @ordered
	 */
	protected static final int XCOORD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXCoord() <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoord()
	 * @generated
	 * @ordered
	 */
	protected int xCoord = XCOORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOverheadConductors() <em>Overhead Conductors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverheadConductors()
	 * @generated
	 * @ordered
	 */
	protected EList<OverheadConductorInfo> overheadConductors;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<MountingConnection> connections;

	/**
	 * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.ABC;

	/**
	 * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCoord() <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoord()
	 * @generated
	 * @ordered
	 */
	protected static final int YCOORD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYCoord() <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoord()
	 * @generated
	 * @ordered
	 */
	protected int yCoord = YCOORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MountingPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getMountingPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXCoord() {
		return xCoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXCoord(int newXCoord) {
		int oldXCoord = xCoord;
		xCoord = newXCoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.MOUNTING_POINT__XCOORD, oldXCoord, xCoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverheadConductorInfo> getOverheadConductors() {
		if (overheadConductors == null) {
			overheadConductors = new EObjectWithInverseResolvingEList<OverheadConductorInfo>(OverheadConductorInfo.class, this, InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS, AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT);
		}
		return overheadConductors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MountingConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectWithInverseResolvingEList.ManyInverse<MountingConnection>(MountingConnection.class, this, InfAssetsPackage.MOUNTING_POINT__CONNECTIONS, InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode getPhaseCode() {
		return phaseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCode(PhaseCode newPhaseCode) {
		PhaseCode oldPhaseCode = phaseCode;
		phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.MOUNTING_POINT__PHASE_CODE, oldPhaseCode, phaseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYCoord() {
		return yCoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCoord(int newYCoord) {
		int oldYCoord = yCoord;
		yCoord = newYCoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.MOUNTING_POINT__YCOORD, oldYCoord, yCoord));
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
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOverheadConductors()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnections()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				return ((InternalEList<?>)getOverheadConductors()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.MOUNTING_POINT__XCOORD:
				return getXCoord();
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				return getOverheadConductors();
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				return getConnections();
			case InfAssetsPackage.MOUNTING_POINT__PHASE_CODE:
				return getPhaseCode();
			case InfAssetsPackage.MOUNTING_POINT__YCOORD:
				return getYCoord();
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
			case InfAssetsPackage.MOUNTING_POINT__XCOORD:
				setXCoord((Integer)newValue);
				return;
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				getOverheadConductors().clear();
				getOverheadConductors().addAll((Collection<? extends OverheadConductorInfo>)newValue);
				return;
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends MountingConnection>)newValue);
				return;
			case InfAssetsPackage.MOUNTING_POINT__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case InfAssetsPackage.MOUNTING_POINT__YCOORD:
				setYCoord((Integer)newValue);
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
			case InfAssetsPackage.MOUNTING_POINT__XCOORD:
				setXCoord(XCOORD_EDEFAULT);
				return;
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				getOverheadConductors().clear();
				return;
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				getConnections().clear();
				return;
			case InfAssetsPackage.MOUNTING_POINT__PHASE_CODE:
				setPhaseCode(PHASE_CODE_EDEFAULT);
				return;
			case InfAssetsPackage.MOUNTING_POINT__YCOORD:
				setYCoord(YCOORD_EDEFAULT);
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
			case InfAssetsPackage.MOUNTING_POINT__XCOORD:
				return xCoord != XCOORD_EDEFAULT;
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				return overheadConductors != null && !overheadConductors.isEmpty();
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case InfAssetsPackage.MOUNTING_POINT__PHASE_CODE:
				return phaseCode != PHASE_CODE_EDEFAULT;
			case InfAssetsPackage.MOUNTING_POINT__YCOORD:
				return yCoord != YCOORD_EDEFAULT;
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
		result.append(" (xCoord: ");
		result.append(xCoord);
		result.append(", phaseCode: ");
		result.append(phaseCode);
		result.append(", yCoord: ");
		result.append(yCoord);
		result.append(')');
		return result.toString();
	}

} //MountingPointImpl
