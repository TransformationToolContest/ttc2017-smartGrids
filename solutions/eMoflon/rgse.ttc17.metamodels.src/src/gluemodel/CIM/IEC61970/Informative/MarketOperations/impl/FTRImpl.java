/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.AgreementImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode;

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
 * An implementation of the model object '<em><b>FTR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl#getBaseEnergy <em>Base Energy</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl#getAction <em>Action</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl#getEnergyPriceCurve <em>Energy Price Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl#getOptimized <em>Optimized</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl#getPnodes <em>Pnodes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl#getFtrType <em>Ftr Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl#getFlowgate <em>Flowgate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTRImpl extends AgreementImpl implements FTR {
	/**
	 * The default value of the '{@link #getBaseEnergy() <em>Base Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final float BASE_ENERGY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBaseEnergy() <em>Base Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseEnergy()
	 * @generated
	 * @ordered
	 */
	protected float baseEnergy = BASE_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnergyPriceCurve() <em>Energy Price Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyPriceCurve()
	 * @generated
	 * @ordered
	 */
	protected EnergyPriceCurve energyPriceCurve;

	/**
	 * The default value of the '{@link #getOptimized() <em>Optimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimized()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIMIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptimized() <em>Optimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimized()
	 * @generated
	 * @ordered
	 */
	protected String optimized = OPTIMIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPnodes() <em>Pnodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pnode> pnodes;

	/**
	 * The default value of the '{@link #getFtrType() <em>Ftr Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtrType()
	 * @generated
	 * @ordered
	 */
	protected static final String FTR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtrType() <em>Ftr Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtrType()
	 * @generated
	 * @ordered
	 */
	protected String ftrType = FTR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlowgate() <em>Flowgate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowgate()
	 * @generated
	 * @ordered
	 */
	protected Flowgate flowgate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.FTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBaseEnergy() {
		return baseEnergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseEnergy(float newBaseEnergy) {
		float oldBaseEnergy = baseEnergy;
		baseEnergy = newBaseEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FTR__BASE_ENERGY, oldBaseEnergy, baseEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FTR__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyPriceCurve getEnergyPriceCurve() {
		if (energyPriceCurve != null && energyPriceCurve.eIsProxy()) {
			InternalEObject oldEnergyPriceCurve = (InternalEObject)energyPriceCurve;
			energyPriceCurve = (EnergyPriceCurve)eResolveProxy(oldEnergyPriceCurve);
			if (energyPriceCurve != oldEnergyPriceCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE, oldEnergyPriceCurve, energyPriceCurve));
			}
		}
		return energyPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyPriceCurve basicGetEnergyPriceCurve() {
		return energyPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergyPriceCurve(EnergyPriceCurve newEnergyPriceCurve, NotificationChain msgs) {
		EnergyPriceCurve oldEnergyPriceCurve = energyPriceCurve;
		energyPriceCurve = newEnergyPriceCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE, oldEnergyPriceCurve, newEnergyPriceCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyPriceCurve(EnergyPriceCurve newEnergyPriceCurve) {
		if (newEnergyPriceCurve != energyPriceCurve) {
			NotificationChain msgs = null;
			if (energyPriceCurve != null)
				msgs = ((InternalEObject)energyPriceCurve).eInverseRemove(this, MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS, EnergyPriceCurve.class, msgs);
			if (newEnergyPriceCurve != null)
				msgs = ((InternalEObject)newEnergyPriceCurve).eInverseAdd(this, MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS, EnergyPriceCurve.class, msgs);
			msgs = basicSetEnergyPriceCurve(newEnergyPriceCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE, newEnergyPriceCurve, newEnergyPriceCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptimized() {
		return optimized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimized(String newOptimized) {
		String oldOptimized = optimized;
		optimized = newOptimized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FTR__OPTIMIZED, oldOptimized, optimized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FTR__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pnode> getPnodes() {
		if (pnodes == null) {
			pnodes = new EObjectWithInverseResolvingEList.ManyInverse<Pnode>(Pnode.class, this, MarketOperationsPackage.FTR__PNODES, MarketOperationsPackage.PNODE__FT_RS);
		}
		return pnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFtrType() {
		return ftrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtrType(String newFtrType) {
		String oldFtrType = ftrType;
		ftrType = newFtrType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FTR__FTR_TYPE, oldFtrType, ftrType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flowgate getFlowgate() {
		if (flowgate != null && flowgate.eIsProxy()) {
			InternalEObject oldFlowgate = (InternalEObject)flowgate;
			flowgate = (Flowgate)eResolveProxy(oldFlowgate);
			if (flowgate != oldFlowgate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.FTR__FLOWGATE, oldFlowgate, flowgate));
			}
		}
		return flowgate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flowgate basicGetFlowgate() {
		return flowgate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowgate(Flowgate newFlowgate, NotificationChain msgs) {
		Flowgate oldFlowgate = flowgate;
		flowgate = newFlowgate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FTR__FLOWGATE, oldFlowgate, newFlowgate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowgate(Flowgate newFlowgate) {
		if (newFlowgate != flowgate) {
			NotificationChain msgs = null;
			if (flowgate != null)
				msgs = ((InternalEObject)flowgate).eInverseRemove(this, MarketOperationsPackage.FLOWGATE__FT_RS, Flowgate.class, msgs);
			if (newFlowgate != null)
				msgs = ((InternalEObject)newFlowgate).eInverseAdd(this, MarketOperationsPackage.FLOWGATE__FT_RS, Flowgate.class, msgs);
			msgs = basicSetFlowgate(newFlowgate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FTR__FLOWGATE, newFlowgate, newFlowgate));
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
			case MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE:
				if (energyPriceCurve != null)
					msgs = ((InternalEObject)energyPriceCurve).eInverseRemove(this, MarketOperationsPackage.ENERGY_PRICE_CURVE__FT_RS, EnergyPriceCurve.class, msgs);
				return basicSetEnergyPriceCurve((EnergyPriceCurve)otherEnd, msgs);
			case MarketOperationsPackage.FTR__PNODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPnodes()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.FTR__FLOWGATE:
				if (flowgate != null)
					msgs = ((InternalEObject)flowgate).eInverseRemove(this, MarketOperationsPackage.FLOWGATE__FT_RS, Flowgate.class, msgs);
				return basicSetFlowgate((Flowgate)otherEnd, msgs);
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
			case MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE:
				return basicSetEnergyPriceCurve(null, msgs);
			case MarketOperationsPackage.FTR__PNODES:
				return ((InternalEList<?>)getPnodes()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.FTR__FLOWGATE:
				return basicSetFlowgate(null, msgs);
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
			case MarketOperationsPackage.FTR__BASE_ENERGY:
				return getBaseEnergy();
			case MarketOperationsPackage.FTR__ACTION:
				return getAction();
			case MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE:
				if (resolve) return getEnergyPriceCurve();
				return basicGetEnergyPriceCurve();
			case MarketOperationsPackage.FTR__OPTIMIZED:
				return getOptimized();
			case MarketOperationsPackage.FTR__CLASS:
				return getClass_();
			case MarketOperationsPackage.FTR__PNODES:
				return getPnodes();
			case MarketOperationsPackage.FTR__FTR_TYPE:
				return getFtrType();
			case MarketOperationsPackage.FTR__FLOWGATE:
				if (resolve) return getFlowgate();
				return basicGetFlowgate();
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
			case MarketOperationsPackage.FTR__BASE_ENERGY:
				setBaseEnergy((Float)newValue);
				return;
			case MarketOperationsPackage.FTR__ACTION:
				setAction((String)newValue);
				return;
			case MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE:
				setEnergyPriceCurve((EnergyPriceCurve)newValue);
				return;
			case MarketOperationsPackage.FTR__OPTIMIZED:
				setOptimized((String)newValue);
				return;
			case MarketOperationsPackage.FTR__CLASS:
				setClass((String)newValue);
				return;
			case MarketOperationsPackage.FTR__PNODES:
				getPnodes().clear();
				getPnodes().addAll((Collection<? extends Pnode>)newValue);
				return;
			case MarketOperationsPackage.FTR__FTR_TYPE:
				setFtrType((String)newValue);
				return;
			case MarketOperationsPackage.FTR__FLOWGATE:
				setFlowgate((Flowgate)newValue);
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
			case MarketOperationsPackage.FTR__BASE_ENERGY:
				setBaseEnergy(BASE_ENERGY_EDEFAULT);
				return;
			case MarketOperationsPackage.FTR__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE:
				setEnergyPriceCurve((EnergyPriceCurve)null);
				return;
			case MarketOperationsPackage.FTR__OPTIMIZED:
				setOptimized(OPTIMIZED_EDEFAULT);
				return;
			case MarketOperationsPackage.FTR__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MarketOperationsPackage.FTR__PNODES:
				getPnodes().clear();
				return;
			case MarketOperationsPackage.FTR__FTR_TYPE:
				setFtrType(FTR_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.FTR__FLOWGATE:
				setFlowgate((Flowgate)null);
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
			case MarketOperationsPackage.FTR__BASE_ENERGY:
				return baseEnergy != BASE_ENERGY_EDEFAULT;
			case MarketOperationsPackage.FTR__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case MarketOperationsPackage.FTR__ENERGY_PRICE_CURVE:
				return energyPriceCurve != null;
			case MarketOperationsPackage.FTR__OPTIMIZED:
				return OPTIMIZED_EDEFAULT == null ? optimized != null : !OPTIMIZED_EDEFAULT.equals(optimized);
			case MarketOperationsPackage.FTR__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MarketOperationsPackage.FTR__PNODES:
				return pnodes != null && !pnodes.isEmpty();
			case MarketOperationsPackage.FTR__FTR_TYPE:
				return FTR_TYPE_EDEFAULT == null ? ftrType != null : !FTR_TYPE_EDEFAULT.equals(ftrType);
			case MarketOperationsPackage.FTR__FLOWGATE:
				return flowgate != null;
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
		result.append(" (baseEnergy: ");
		result.append(baseEnergy);
		result.append(", action: ");
		result.append(action);
		result.append(", optimized: ");
		result.append(optimized);
		result.append(", class: ");
		result.append(class_);
		result.append(", ftrType: ");
		result.append(ftrType);
		result.append(')');
		return result.toString();
	}

} //FTRImpl
