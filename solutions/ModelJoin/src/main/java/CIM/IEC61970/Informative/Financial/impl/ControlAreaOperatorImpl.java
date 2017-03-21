/**
 */
package CIM.IEC61970.Informative.Financial.impl;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.HostControlArea;
import CIM.IEC61970.Informative.EnergyScheduling.TieLine;

import CIM.IEC61970.Informative.Financial.ControlAreaOperator;
import CIM.IEC61970.Informative.Financial.FinancialPackage;

import CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl;

import CIM.IEC61970.Informative.Reservation.AncillaryService;
import CIM.IEC61970.Informative.Reservation.ReservationPackage;

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
 * An implementation of the model object '<em><b>Control Area Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.ControlAreaOperatorImpl#getAncillaryService <em>Ancillary Service</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.ControlAreaOperatorImpl#getTieLines <em>Tie Lines</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.ControlAreaOperatorImpl#getControlledBy <em>Controlled By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlAreaOperatorImpl extends ErpOrganisationImpl implements ControlAreaOperator {
	/**
	 * The cached value of the '{@link #getAncillaryService() <em>Ancillary Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncillaryService()
	 * @generated
	 * @ordered
	 */
	protected EList<AncillaryService> ancillaryService;

	/**
	 * The cached value of the '{@link #getTieLines() <em>Tie Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TieLine> tieLines;

	/**
	 * The cached value of the '{@link #getControlledBy() <em>Controlled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledBy()
	 * @generated
	 * @ordered
	 */
	protected HostControlArea controlledBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlAreaOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancialPackage.Literals.CONTROL_AREA_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AncillaryService> getAncillaryService() {
		if (ancillaryService == null) {
			ancillaryService = new EObjectWithInverseResolvingEList<AncillaryService>(AncillaryService.class, this, FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE, ReservationPackage.ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR);
		}
		return ancillaryService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TieLine> getTieLines() {
		if (tieLines == null) {
			tieLines = new EObjectWithInverseResolvingEList.ManyInverse<TieLine>(TieLine.class, this, FinancialPackage.CONTROL_AREA_OPERATOR__TIE_LINES, EnergySchedulingPackage.TIE_LINE__CONTROL_AREA_OPERATORS);
		}
		return tieLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea getControlledBy() {
		if (controlledBy != null && controlledBy.eIsProxy()) {
			InternalEObject oldControlledBy = (InternalEObject)controlledBy;
			controlledBy = (HostControlArea)eResolveProxy(oldControlledBy);
			if (controlledBy != oldControlledBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY, oldControlledBy, controlledBy));
			}
		}
		return controlledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea basicGetControlledBy() {
		return controlledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledBy(HostControlArea newControlledBy, NotificationChain msgs) {
		HostControlArea oldControlledBy = controlledBy;
		controlledBy = newControlledBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY, oldControlledBy, newControlledBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlledBy(HostControlArea newControlledBy) {
		if (newControlledBy != controlledBy) {
			NotificationChain msgs = null;
			if (controlledBy != null)
				msgs = ((InternalEObject)controlledBy).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS, HostControlArea.class, msgs);
			if (newControlledBy != null)
				msgs = ((InternalEObject)newControlledBy).eInverseAdd(this, EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS, HostControlArea.class, msgs);
			msgs = basicSetControlledBy(newControlledBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY, newControlledBy, newControlledBy));
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
			case FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAncillaryService()).basicAdd(otherEnd, msgs);
			case FinancialPackage.CONTROL_AREA_OPERATOR__TIE_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTieLines()).basicAdd(otherEnd, msgs);
			case FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY:
				if (controlledBy != null)
					msgs = ((InternalEObject)controlledBy).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS, HostControlArea.class, msgs);
				return basicSetControlledBy((HostControlArea)otherEnd, msgs);
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
			case FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE:
				return ((InternalEList<?>)getAncillaryService()).basicRemove(otherEnd, msgs);
			case FinancialPackage.CONTROL_AREA_OPERATOR__TIE_LINES:
				return ((InternalEList<?>)getTieLines()).basicRemove(otherEnd, msgs);
			case FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY:
				return basicSetControlledBy(null, msgs);
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
			case FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE:
				return getAncillaryService();
			case FinancialPackage.CONTROL_AREA_OPERATOR__TIE_LINES:
				return getTieLines();
			case FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY:
				if (resolve) return getControlledBy();
				return basicGetControlledBy();
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
			case FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE:
				getAncillaryService().clear();
				getAncillaryService().addAll((Collection<? extends AncillaryService>)newValue);
				return;
			case FinancialPackage.CONTROL_AREA_OPERATOR__TIE_LINES:
				getTieLines().clear();
				getTieLines().addAll((Collection<? extends TieLine>)newValue);
				return;
			case FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY:
				setControlledBy((HostControlArea)newValue);
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
			case FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE:
				getAncillaryService().clear();
				return;
			case FinancialPackage.CONTROL_AREA_OPERATOR__TIE_LINES:
				getTieLines().clear();
				return;
			case FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY:
				setControlledBy((HostControlArea)null);
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
			case FinancialPackage.CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE:
				return ancillaryService != null && !ancillaryService.isEmpty();
			case FinancialPackage.CONTROL_AREA_OPERATOR__TIE_LINES:
				return tieLines != null && !tieLines.isEmpty();
			case FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY:
				return controlledBy != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlAreaOperatorImpl
