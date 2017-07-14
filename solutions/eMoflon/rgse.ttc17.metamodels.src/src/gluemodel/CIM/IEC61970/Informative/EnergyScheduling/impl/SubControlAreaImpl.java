/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl;

import gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaImpl;

import gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit;
import gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint;

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
 * An implementation of the model object '<em><b>Sub Control Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl#getSideA_TieLines <em>Side ATie Lines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl#getGeneratingUnits <em>Generating Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl#getExport_EnergyTransactions <em>Export Energy Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl#getImport_EnergyTransactions <em>Import Energy Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl#getHostControlArea <em>Host Control Area</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl#getFlowgate <em>Flowgate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.SubControlAreaImpl#getSideB_TieLines <em>Side BTie Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubControlAreaImpl extends ControlAreaImpl implements SubControlArea {
	/**
	 * The cached value of the '{@link #getSideA_TieLines() <em>Side ATie Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideA_TieLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TieLine> sideA_TieLines;

	/**
	 * The cached value of the '{@link #getGeneratingUnits() <em>Generating Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratingUnit> generatingUnits;

	/**
	 * The cached value of the '{@link #getExport_EnergyTransactions() <em>Export Energy Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport_EnergyTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyTransaction> export_EnergyTransactions;

	/**
	 * The cached value of the '{@link #getImport_EnergyTransactions() <em>Import Energy Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport_EnergyTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyTransaction> import_EnergyTransactions;

	/**
	 * The cached value of the '{@link #getHostControlArea() <em>Host Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostControlArea()
	 * @generated
	 * @ordered
	 */
	protected HostControlArea hostControlArea;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ServicePoint> partOf;

	/**
	 * The cached value of the '{@link #getFlowgate() <em>Flowgate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowgate()
	 * @generated
	 * @ordered
	 */
	protected EList<Flowgate> flowgate;

	/**
	 * The cached value of the '{@link #getSideB_TieLines() <em>Side BTie Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideB_TieLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TieLine> sideB_TieLines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubControlAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.SUB_CONTROL_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TieLine> getSideA_TieLines() {
		if (sideA_TieLines == null) {
			sideA_TieLines = new EObjectWithInverseResolvingEList<TieLine>(TieLine.class, this, EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES, EnergySchedulingPackage.TIE_LINE__SIDE_ASUB_CONTROL_AREA);
		}
		return sideA_TieLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratingUnit> getGeneratingUnits() {
		if (generatingUnits == null) {
			generatingUnits = new EObjectWithInverseResolvingEList<GeneratingUnit>(GeneratingUnit.class, this, EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS, ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA);
		}
		return generatingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyTransaction> getExport_EnergyTransactions() {
		if (export_EnergyTransactions == null) {
			export_EnergyTransactions = new EObjectWithInverseResolvingEList<EnergyTransaction>(EnergyTransaction.class, this, EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS, EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA);
		}
		return export_EnergyTransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyTransaction> getImport_EnergyTransactions() {
		if (import_EnergyTransactions == null) {
			import_EnergyTransactions = new EObjectWithInverseResolvingEList<EnergyTransaction>(EnergyTransaction.class, this, EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS, EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA);
		}
		return import_EnergyTransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea getHostControlArea() {
		if (hostControlArea != null && hostControlArea.eIsProxy()) {
			InternalEObject oldHostControlArea = (InternalEObject)hostControlArea;
			hostControlArea = (HostControlArea)eResolveProxy(oldHostControlArea);
			if (hostControlArea != oldHostControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA, oldHostControlArea, hostControlArea));
			}
		}
		return hostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea basicGetHostControlArea() {
		return hostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostControlArea(HostControlArea newHostControlArea, NotificationChain msgs) {
		HostControlArea oldHostControlArea = hostControlArea;
		hostControlArea = newHostControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA, oldHostControlArea, newHostControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostControlArea(HostControlArea newHostControlArea) {
		if (newHostControlArea != hostControlArea) {
			NotificationChain msgs = null;
			if (hostControlArea != null)
				msgs = ((InternalEObject)hostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS, HostControlArea.class, msgs);
			if (newHostControlArea != null)
				msgs = ((InternalEObject)newHostControlArea).eInverseAdd(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS, HostControlArea.class, msgs);
			msgs = basicSetHostControlArea(newHostControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA, newHostControlArea, newHostControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServicePoint> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectWithInverseResolvingEList<ServicePoint>(ServicePoint.class, this, EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF, ReservationPackage.SERVICE_POINT__MEMBER_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flowgate> getFlowgate() {
		if (flowgate == null) {
			flowgate = new EObjectWithInverseResolvingEList<Flowgate>(Flowgate.class, this, EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE, MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA);
		}
		return flowgate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TieLine> getSideB_TieLines() {
		if (sideB_TieLines == null) {
			sideB_TieLines = new EObjectWithInverseResolvingEList<TieLine>(TieLine.class, this, EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES, EnergySchedulingPackage.TIE_LINE__SIDE_BSUB_CONTROL_AREA);
		}
		return sideB_TieLines;
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
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSideA_TieLines()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratingUnits()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExport_EnergyTransactions()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImport_EnergyTransactions()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA:
				if (hostControlArea != null)
					msgs = ((InternalEObject)hostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS, HostControlArea.class, msgs);
				return basicSetHostControlArea((HostControlArea)otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOf()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowgate()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSideB_TieLines()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES:
				return ((InternalEList<?>)getSideA_TieLines()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS:
				return ((InternalEList<?>)getGeneratingUnits()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS:
				return ((InternalEList<?>)getExport_EnergyTransactions()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS:
				return ((InternalEList<?>)getImport_EnergyTransactions()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA:
				return basicSetHostControlArea(null, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE:
				return ((InternalEList<?>)getFlowgate()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES:
				return ((InternalEList<?>)getSideB_TieLines()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES:
				return getSideA_TieLines();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS:
				return getGeneratingUnits();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS:
				return getExport_EnergyTransactions();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS:
				return getImport_EnergyTransactions();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA:
				if (resolve) return getHostControlArea();
				return basicGetHostControlArea();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF:
				return getPartOf();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE:
				return getFlowgate();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES:
				return getSideB_TieLines();
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
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES:
				getSideA_TieLines().clear();
				getSideA_TieLines().addAll((Collection<? extends TieLine>)newValue);
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS:
				getGeneratingUnits().clear();
				getGeneratingUnits().addAll((Collection<? extends GeneratingUnit>)newValue);
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS:
				getExport_EnergyTransactions().clear();
				getExport_EnergyTransactions().addAll((Collection<? extends EnergyTransaction>)newValue);
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS:
				getImport_EnergyTransactions().clear();
				getImport_EnergyTransactions().addAll((Collection<? extends EnergyTransaction>)newValue);
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA:
				setHostControlArea((HostControlArea)newValue);
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends ServicePoint>)newValue);
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE:
				getFlowgate().clear();
				getFlowgate().addAll((Collection<? extends Flowgate>)newValue);
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES:
				getSideB_TieLines().clear();
				getSideB_TieLines().addAll((Collection<? extends TieLine>)newValue);
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
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES:
				getSideA_TieLines().clear();
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS:
				getGeneratingUnits().clear();
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS:
				getExport_EnergyTransactions().clear();
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS:
				getImport_EnergyTransactions().clear();
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA:
				setHostControlArea((HostControlArea)null);
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF:
				getPartOf().clear();
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE:
				getFlowgate().clear();
				return;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES:
				getSideB_TieLines().clear();
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
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_ATIE_LINES:
				return sideA_TieLines != null && !sideA_TieLines.isEmpty();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS:
				return generatingUnits != null && !generatingUnits.isEmpty();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS:
				return export_EnergyTransactions != null && !export_EnergyTransactions.isEmpty();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS:
				return import_EnergyTransactions != null && !import_EnergyTransactions.isEmpty();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA:
				return hostControlArea != null;
			case EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE:
				return flowgate != null && !flowgate.isEmpty();
			case EnergySchedulingPackage.SUB_CONTROL_AREA__SIDE_BTIE_LINES:
				return sideB_TieLines != null && !sideB_TieLines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubControlAreaImpl
