/**
 */
package CIM.IEC61970.Topology.impl;

import CIM.IEC61970.Core.ConnectivityNode;
import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.ReportingGroup;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Topology.BusNameMarker;
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
 * An implementation of the model object '<em><b>Bus Name Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Topology.impl.BusNameMarkerImpl#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link CIM.IEC61970.Topology.impl.BusNameMarkerImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusNameMarkerImpl extends IdentifiedObjectImpl implements BusNameMarker {
	/**
	 * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingGroup()
	 * @generated
	 * @ordered
	 */
	protected ReportingGroup reportingGroup;

	/**
	 * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectivityNode> connectivityNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusNameMarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.BUS_NAME_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingGroup getReportingGroup() {
		if (reportingGroup != null && reportingGroup.eIsProxy()) {
			InternalEObject oldReportingGroup = (InternalEObject)reportingGroup;
			reportingGroup = (ReportingGroup)eResolveProxy(oldReportingGroup);
			if (reportingGroup != oldReportingGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP, oldReportingGroup, reportingGroup));
			}
		}
		return reportingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingGroup basicGetReportingGroup() {
		return reportingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportingGroup(ReportingGroup newReportingGroup, NotificationChain msgs) {
		ReportingGroup oldReportingGroup = reportingGroup;
		reportingGroup = newReportingGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP, oldReportingGroup, newReportingGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportingGroup(ReportingGroup newReportingGroup) {
		if (newReportingGroup != reportingGroup) {
			NotificationChain msgs = null;
			if (reportingGroup != null)
				msgs = ((InternalEObject)reportingGroup).eInverseRemove(this, CorePackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs);
			if (newReportingGroup != null)
				msgs = ((InternalEObject)newReportingGroup).eInverseAdd(this, CorePackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs);
			msgs = basicSetReportingGroup(newReportingGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP, newReportingGroup, newReportingGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectivityNode> getConnectivityNode() {
		if (connectivityNode == null) {
			connectivityNode = new EObjectWithInverseResolvingEList<ConnectivityNode>(ConnectivityNode.class, this, TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE, CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER);
		}
		return connectivityNode;
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
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				if (reportingGroup != null)
					msgs = ((InternalEObject)reportingGroup).eInverseRemove(this, CorePackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs);
				return basicSetReportingGroup((ReportingGroup)otherEnd, msgs);
			case TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectivityNode()).basicAdd(otherEnd, msgs);
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
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				return basicSetReportingGroup(null, msgs);
			case TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE:
				return ((InternalEList<?>)getConnectivityNode()).basicRemove(otherEnd, msgs);
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
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				if (resolve) return getReportingGroup();
				return basicGetReportingGroup();
			case TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE:
				return getConnectivityNode();
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
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				setReportingGroup((ReportingGroup)newValue);
				return;
			case TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE:
				getConnectivityNode().clear();
				getConnectivityNode().addAll((Collection<? extends ConnectivityNode>)newValue);
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
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				setReportingGroup((ReportingGroup)null);
				return;
			case TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE:
				getConnectivityNode().clear();
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
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				return reportingGroup != null;
			case TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE:
				return connectivityNode != null && !connectivityNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusNameMarkerImpl
