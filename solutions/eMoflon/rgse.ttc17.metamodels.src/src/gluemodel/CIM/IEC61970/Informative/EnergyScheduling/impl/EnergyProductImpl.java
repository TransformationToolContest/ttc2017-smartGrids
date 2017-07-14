/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl;

import gluemodel.CIM.IEC61968.Common.impl.AgreementImpl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction;

import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;
import gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider;
import gluemodel.CIM.IEC61970.Informative.Financial.Marketer;

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
 * An implementation of the model object '<em><b>Energy Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProductImpl#getGenerationProvider <em>Generation Provider</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProductImpl#getTitleHeldBy_Marketer <em>Title Held By Marketer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProductImpl#getEnergyTransactions <em>Energy Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProductImpl#getResoldBy_Marketers <em>Resold By Marketers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyProductImpl#getServicePoint <em>Service Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyProductImpl extends AgreementImpl implements EnergyProduct {
	/**
	 * The cached value of the '{@link #getGenerationProvider() <em>Generation Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationProvider()
	 * @generated
	 * @ordered
	 */
	protected GenerationProvider generationProvider;

	/**
	 * The cached value of the '{@link #getTitleHeldBy_Marketer() <em>Title Held By Marketer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleHeldBy_Marketer()
	 * @generated
	 * @ordered
	 */
	protected Marketer titleHeldBy_Marketer;

	/**
	 * The cached value of the '{@link #getEnergyTransactions() <em>Energy Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyTransaction> energyTransactions;

	/**
	 * The cached value of the '{@link #getResoldBy_Marketers() <em>Resold By Marketers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResoldBy_Marketers()
	 * @generated
	 * @ordered
	 */
	protected EList<Marketer> resoldBy_Marketers;

	/**
	 * The cached value of the '{@link #getServicePoint() <em>Service Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ServicePoint> servicePoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.ENERGY_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationProvider getGenerationProvider() {
		if (generationProvider != null && generationProvider.eIsProxy()) {
			InternalEObject oldGenerationProvider = (InternalEObject)generationProvider;
			generationProvider = (GenerationProvider)eResolveProxy(oldGenerationProvider);
			if (generationProvider != oldGenerationProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER, oldGenerationProvider, generationProvider));
			}
		}
		return generationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationProvider basicGetGenerationProvider() {
		return generationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationProvider(GenerationProvider newGenerationProvider, NotificationChain msgs) {
		GenerationProvider oldGenerationProvider = generationProvider;
		generationProvider = newGenerationProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER, oldGenerationProvider, newGenerationProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationProvider(GenerationProvider newGenerationProvider) {
		if (newGenerationProvider != generationProvider) {
			NotificationChain msgs = null;
			if (generationProvider != null)
				msgs = ((InternalEObject)generationProvider).eInverseRemove(this, FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS, GenerationProvider.class, msgs);
			if (newGenerationProvider != null)
				msgs = ((InternalEObject)newGenerationProvider).eInverseAdd(this, FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS, GenerationProvider.class, msgs);
			msgs = basicSetGenerationProvider(newGenerationProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER, newGenerationProvider, newGenerationProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketer getTitleHeldBy_Marketer() {
		if (titleHeldBy_Marketer != null && titleHeldBy_Marketer.eIsProxy()) {
			InternalEObject oldTitleHeldBy_Marketer = (InternalEObject)titleHeldBy_Marketer;
			titleHeldBy_Marketer = (Marketer)eResolveProxy(oldTitleHeldBy_Marketer);
			if (titleHeldBy_Marketer != oldTitleHeldBy_Marketer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER, oldTitleHeldBy_Marketer, titleHeldBy_Marketer));
			}
		}
		return titleHeldBy_Marketer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketer basicGetTitleHeldBy_Marketer() {
		return titleHeldBy_Marketer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitleHeldBy_Marketer(Marketer newTitleHeldBy_Marketer, NotificationChain msgs) {
		Marketer oldTitleHeldBy_Marketer = titleHeldBy_Marketer;
		titleHeldBy_Marketer = newTitleHeldBy_Marketer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER, oldTitleHeldBy_Marketer, newTitleHeldBy_Marketer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleHeldBy_Marketer(Marketer newTitleHeldBy_Marketer) {
		if (newTitleHeldBy_Marketer != titleHeldBy_Marketer) {
			NotificationChain msgs = null;
			if (titleHeldBy_Marketer != null)
				msgs = ((InternalEObject)titleHeldBy_Marketer).eInverseRemove(this, FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS, Marketer.class, msgs);
			if (newTitleHeldBy_Marketer != null)
				msgs = ((InternalEObject)newTitleHeldBy_Marketer).eInverseAdd(this, FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS, Marketer.class, msgs);
			msgs = basicSetTitleHeldBy_Marketer(newTitleHeldBy_Marketer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER, newTitleHeldBy_Marketer, newTitleHeldBy_Marketer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyTransaction> getEnergyTransactions() {
		if (energyTransactions == null) {
			energyTransactions = new EObjectWithInverseResolvingEList<EnergyTransaction>(EnergyTransaction.class, this, EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS, EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT);
		}
		return energyTransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Marketer> getResoldBy_Marketers() {
		if (resoldBy_Marketers == null) {
			resoldBy_Marketers = new EObjectWithInverseResolvingEList.ManyInverse<Marketer>(Marketer.class, this, EnergySchedulingPackage.ENERGY_PRODUCT__RESOLD_BY_MARKETERS, FinancialPackage.MARKETER__RESELLS_ENERGY_PRODUCT);
		}
		return resoldBy_Marketers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServicePoint> getServicePoint() {
		if (servicePoint == null) {
			servicePoint = new EObjectWithInverseResolvingEList.ManyInverse<ServicePoint>(ServicePoint.class, this, EnergySchedulingPackage.ENERGY_PRODUCT__SERVICE_POINT, ReservationPackage.SERVICE_POINT__ENERGY_PRODUCTS);
		}
		return servicePoint;
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
			case EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER:
				if (generationProvider != null)
					msgs = ((InternalEObject)generationProvider).eInverseRemove(this, FinancialPackage.GENERATION_PROVIDER__ENERGY_PRODUCTS, GenerationProvider.class, msgs);
				return basicSetGenerationProvider((GenerationProvider)otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER:
				if (titleHeldBy_Marketer != null)
					msgs = ((InternalEObject)titleHeldBy_Marketer).eInverseRemove(this, FinancialPackage.MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS, Marketer.class, msgs);
				return basicSetTitleHeldBy_Marketer((Marketer)otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyTransactions()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_PRODUCT__RESOLD_BY_MARKETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResoldBy_Marketers()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_PRODUCT__SERVICE_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServicePoint()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER:
				return basicSetGenerationProvider(null, msgs);
			case EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER:
				return basicSetTitleHeldBy_Marketer(null, msgs);
			case EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS:
				return ((InternalEList<?>)getEnergyTransactions()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_PRODUCT__RESOLD_BY_MARKETERS:
				return ((InternalEList<?>)getResoldBy_Marketers()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_PRODUCT__SERVICE_POINT:
				return ((InternalEList<?>)getServicePoint()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER:
				if (resolve) return getGenerationProvider();
				return basicGetGenerationProvider();
			case EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER:
				if (resolve) return getTitleHeldBy_Marketer();
				return basicGetTitleHeldBy_Marketer();
			case EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS:
				return getEnergyTransactions();
			case EnergySchedulingPackage.ENERGY_PRODUCT__RESOLD_BY_MARKETERS:
				return getResoldBy_Marketers();
			case EnergySchedulingPackage.ENERGY_PRODUCT__SERVICE_POINT:
				return getServicePoint();
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
			case EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER:
				setGenerationProvider((GenerationProvider)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER:
				setTitleHeldBy_Marketer((Marketer)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS:
				getEnergyTransactions().clear();
				getEnergyTransactions().addAll((Collection<? extends EnergyTransaction>)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_PRODUCT__RESOLD_BY_MARKETERS:
				getResoldBy_Marketers().clear();
				getResoldBy_Marketers().addAll((Collection<? extends Marketer>)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_PRODUCT__SERVICE_POINT:
				getServicePoint().clear();
				getServicePoint().addAll((Collection<? extends ServicePoint>)newValue);
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
			case EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER:
				setGenerationProvider((GenerationProvider)null);
				return;
			case EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER:
				setTitleHeldBy_Marketer((Marketer)null);
				return;
			case EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS:
				getEnergyTransactions().clear();
				return;
			case EnergySchedulingPackage.ENERGY_PRODUCT__RESOLD_BY_MARKETERS:
				getResoldBy_Marketers().clear();
				return;
			case EnergySchedulingPackage.ENERGY_PRODUCT__SERVICE_POINT:
				getServicePoint().clear();
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
			case EnergySchedulingPackage.ENERGY_PRODUCT__GENERATION_PROVIDER:
				return generationProvider != null;
			case EnergySchedulingPackage.ENERGY_PRODUCT__TITLE_HELD_BY_MARKETER:
				return titleHeldBy_Marketer != null;
			case EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS:
				return energyTransactions != null && !energyTransactions.isEmpty();
			case EnergySchedulingPackage.ENERGY_PRODUCT__RESOLD_BY_MARKETERS:
				return resoldBy_Marketers != null && !resoldBy_Marketers.isEmpty();
			case EnergySchedulingPackage.ENERGY_PRODUCT__SERVICE_POINT:
				return servicePoint != null && !servicePoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnergyProductImpl
