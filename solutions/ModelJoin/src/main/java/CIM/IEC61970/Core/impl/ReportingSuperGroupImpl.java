/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.ReportingGroup;
import CIM.IEC61970.Core.ReportingSuperGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reporting Super Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.ReportingSuperGroupImpl#getReportingGroup <em>Reporting Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportingSuperGroupImpl extends IdentifiedObjectImpl implements ReportingSuperGroup {
	/**
	 * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportingGroup> reportingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportingSuperGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REPORTING_SUPER_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportingGroup> getReportingGroup() {
		if (reportingGroup == null) {
			reportingGroup = new EObjectWithInverseResolvingEList<ReportingGroup>(ReportingGroup.class, this, CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP);
		}
		return reportingGroup;
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReportingGroup()).basicAdd(otherEnd, msgs);
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				return ((InternalEList<?>)getReportingGroup()).basicRemove(otherEnd, msgs);
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				return getReportingGroup();
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				getReportingGroup().clear();
				getReportingGroup().addAll((Collection<? extends ReportingGroup>)newValue);
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				getReportingGroup().clear();
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				return reportingGroup != null && !reportingGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReportingSuperGroupImpl
