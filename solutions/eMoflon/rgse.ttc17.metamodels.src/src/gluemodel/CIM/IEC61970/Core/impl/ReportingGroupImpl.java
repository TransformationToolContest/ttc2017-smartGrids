/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;
import gluemodel.CIM.IEC61970.Core.ReportingGroup;
import gluemodel.CIM.IEC61970.Core.ReportingSuperGroup;

import gluemodel.CIM.IEC61970.Topology.BusNameMarker;
import gluemodel.CIM.IEC61970.Topology.TopologicalNode;
import gluemodel.CIM.IEC61970.Topology.TopologyPackage;

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
 * An implementation of the model object '<em><b>Reporting Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.ReportingGroupImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.ReportingGroupImpl#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.ReportingGroupImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.ReportingGroupImpl#getReportingSuperGroup <em>Reporting Super Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportingGroupImpl extends IdentifiedObjectImpl implements ReportingGroup {
	/**
	 * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResource()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResource;

	/**
	 * The cached value of the '{@link #getBusNameMarker() <em>Bus Name Marker</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusNameMarker()
	 * @generated
	 * @ordered
	 */
	protected EList<BusNameMarker> busNameMarker;

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
	 * The cached value of the '{@link #getReportingSuperGroup() <em>Reporting Super Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingSuperGroup()
	 * @generated
	 * @ordered
	 */
	protected ReportingSuperGroup reportingSuperGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportingGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REPORTING_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResource() {
		if (powerSystemResource == null) {
			powerSystemResource = new EObjectWithInverseResolvingEList.ManyInverse<PowerSystemResource>(PowerSystemResource.class, this, CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE, CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP);
		}
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusNameMarker> getBusNameMarker() {
		if (busNameMarker == null) {
			busNameMarker = new EObjectWithInverseResolvingEList<BusNameMarker>(BusNameMarker.class, this, CorePackage.REPORTING_GROUP__BUS_NAME_MARKER, TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP);
		}
		return busNameMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopologicalNode> getTopologicalNode() {
		if (topologicalNode == null) {
			topologicalNode = new EObjectWithInverseResolvingEList<TopologicalNode>(TopologicalNode.class, this, CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE, TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP);
		}
		return topologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingSuperGroup getReportingSuperGroup() {
		if (reportingSuperGroup != null && reportingSuperGroup.eIsProxy()) {
			InternalEObject oldReportingSuperGroup = (InternalEObject)reportingSuperGroup;
			reportingSuperGroup = (ReportingSuperGroup)eResolveProxy(oldReportingSuperGroup);
			if (reportingSuperGroup != oldReportingSuperGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP, oldReportingSuperGroup, reportingSuperGroup));
			}
		}
		return reportingSuperGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingSuperGroup basicGetReportingSuperGroup() {
		return reportingSuperGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportingSuperGroup(ReportingSuperGroup newReportingSuperGroup, NotificationChain msgs) {
		ReportingSuperGroup oldReportingSuperGroup = reportingSuperGroup;
		reportingSuperGroup = newReportingSuperGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP, oldReportingSuperGroup, newReportingSuperGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportingSuperGroup(ReportingSuperGroup newReportingSuperGroup) {
		if (newReportingSuperGroup != reportingSuperGroup) {
			NotificationChain msgs = null;
			if (reportingSuperGroup != null)
				msgs = ((InternalEObject)reportingSuperGroup).eInverseRemove(this, CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs);
			if (newReportingSuperGroup != null)
				msgs = ((InternalEObject)newReportingSuperGroup).eInverseAdd(this, CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs);
			msgs = basicSetReportingSuperGroup(newReportingSuperGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP, newReportingSuperGroup, newReportingSuperGroup));
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
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResource()).basicAdd(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusNameMarker()).basicAdd(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologicalNode()).basicAdd(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				if (reportingSuperGroup != null)
					msgs = ((InternalEObject)reportingSuperGroup).eInverseRemove(this, CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs);
				return basicSetReportingSuperGroup((ReportingSuperGroup)otherEnd, msgs);
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
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				return ((InternalEList<?>)getPowerSystemResource()).basicRemove(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				return ((InternalEList<?>)getBusNameMarker()).basicRemove(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				return ((InternalEList<?>)getTopologicalNode()).basicRemove(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				return basicSetReportingSuperGroup(null, msgs);
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
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				return getPowerSystemResource();
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				return getBusNameMarker();
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				return getTopologicalNode();
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				if (resolve) return getReportingSuperGroup();
				return basicGetReportingSuperGroup();
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
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				getPowerSystemResource().clear();
				getPowerSystemResource().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				getBusNameMarker().clear();
				getBusNameMarker().addAll((Collection<? extends BusNameMarker>)newValue);
				return;
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				getTopologicalNode().addAll((Collection<? extends TopologicalNode>)newValue);
				return;
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				setReportingSuperGroup((ReportingSuperGroup)newValue);
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
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				getPowerSystemResource().clear();
				return;
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				getBusNameMarker().clear();
				return;
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				return;
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				setReportingSuperGroup((ReportingSuperGroup)null);
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
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null && !powerSystemResource.isEmpty();
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				return busNameMarker != null && !busNameMarker.isEmpty();
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				return topologicalNode != null && !topologicalNode.isEmpty();
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				return reportingSuperGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ReportingGroupImpl
