/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;

import gluemodel.CIM.IEC61970.Informative.Financial.CustomerConsumer;
import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;
import gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider;
import gluemodel.CIM.IEC61970.Informative.Financial.TransmissionProvider;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint;
import gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint;
import gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath;

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
 * An implementation of the model object '<em><b>Service Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl#getCustomerConsumer <em>Customer Consumer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl#getTransmissionProvider <em>Transmission Provider</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl#getHasAPOR_ <em>Has APOR </em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl#getGenerationProvider <em>Generation Provider</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl#getDeclare_TiePoint <em>Declare Tie Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl#getHasAPOD_ <em>Has APOD </em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl#getEnergyProducts <em>Energy Products</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl#getMemberOf <em>Member Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicePointImpl extends IdentifiedObjectImpl implements ServicePoint {
	/**
	 * The cached value of the '{@link #getCustomerConsumer() <em>Customer Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerConsumer()
	 * @generated
	 * @ordered
	 */
	protected CustomerConsumer customerConsumer;

	/**
	 * The cached value of the '{@link #getTransmissionProvider() <em>Transmission Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionProvider()
	 * @generated
	 * @ordered
	 */
	protected TransmissionProvider transmissionProvider;

	/**
	 * The cached value of the '{@link #getHasAPOR_() <em>Has APOR </em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAPOR_()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionPath> hasAPOR_;

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
	 * The cached value of the '{@link #getDeclare_TiePoint() <em>Declare Tie Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclare_TiePoint()
	 * @generated
	 * @ordered
	 */
	protected TiePoint declare_TiePoint;

	/**
	 * The cached value of the '{@link #getHasAPOD_() <em>Has APOD </em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAPOD_()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionPath> hasAPOD_;

	/**
	 * The cached value of the '{@link #getEnergyProducts() <em>Energy Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyProduct> energyProducts;

	/**
	 * The cached value of the '{@link #getMemberOf() <em>Member Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf()
	 * @generated
	 * @ordered
	 */
	protected SubControlArea memberOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.SERVICE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerConsumer getCustomerConsumer() {
		if (customerConsumer != null && customerConsumer.eIsProxy()) {
			InternalEObject oldCustomerConsumer = (InternalEObject)customerConsumer;
			customerConsumer = (CustomerConsumer)eResolveProxy(oldCustomerConsumer);
			if (customerConsumer != oldCustomerConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER, oldCustomerConsumer, customerConsumer));
			}
		}
		return customerConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerConsumer basicGetCustomerConsumer() {
		return customerConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerConsumer(CustomerConsumer newCustomerConsumer, NotificationChain msgs) {
		CustomerConsumer oldCustomerConsumer = customerConsumer;
		customerConsumer = newCustomerConsumer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER, oldCustomerConsumer, newCustomerConsumer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerConsumer(CustomerConsumer newCustomerConsumer) {
		if (newCustomerConsumer != customerConsumer) {
			NotificationChain msgs = null;
			if (customerConsumer != null)
				msgs = ((InternalEObject)customerConsumer).eInverseRemove(this, FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT, CustomerConsumer.class, msgs);
			if (newCustomerConsumer != null)
				msgs = ((InternalEObject)newCustomerConsumer).eInverseAdd(this, FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT, CustomerConsumer.class, msgs);
			msgs = basicSetCustomerConsumer(newCustomerConsumer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER, newCustomerConsumer, newCustomerConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProvider getTransmissionProvider() {
		if (transmissionProvider != null && transmissionProvider.eIsProxy()) {
			InternalEObject oldTransmissionProvider = (InternalEObject)transmissionProvider;
			transmissionProvider = (TransmissionProvider)eResolveProxy(oldTransmissionProvider);
			if (transmissionProvider != oldTransmissionProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER, oldTransmissionProvider, transmissionProvider));
			}
		}
		return transmissionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProvider basicGetTransmissionProvider() {
		return transmissionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionProvider(TransmissionProvider newTransmissionProvider, NotificationChain msgs) {
		TransmissionProvider oldTransmissionProvider = transmissionProvider;
		transmissionProvider = newTransmissionProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER, oldTransmissionProvider, newTransmissionProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionProvider(TransmissionProvider newTransmissionProvider) {
		if (newTransmissionProvider != transmissionProvider) {
			NotificationChain msgs = null;
			if (transmissionProvider != null)
				msgs = ((InternalEObject)transmissionProvider).eInverseRemove(this, FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT, TransmissionProvider.class, msgs);
			if (newTransmissionProvider != null)
				msgs = ((InternalEObject)newTransmissionProvider).eInverseAdd(this, FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT, TransmissionProvider.class, msgs);
			msgs = basicSetTransmissionProvider(newTransmissionProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER, newTransmissionProvider, newTransmissionProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionPath> getHasAPOR_() {
		if (hasAPOR_ == null) {
			hasAPOR_ = new EObjectWithInverseResolvingEList<TransmissionPath>(TransmissionPath.class, this, ReservationPackage.SERVICE_POINT__HAS_APOR_, ReservationPackage.TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR);
		}
		return hasAPOR_;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER, oldGenerationProvider, generationProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER, oldGenerationProvider, newGenerationProvider);
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
				msgs = ((InternalEObject)generationProvider).eInverseRemove(this, FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT, GenerationProvider.class, msgs);
			if (newGenerationProvider != null)
				msgs = ((InternalEObject)newGenerationProvider).eInverseAdd(this, FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT, GenerationProvider.class, msgs);
			msgs = basicSetGenerationProvider(newGenerationProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER, newGenerationProvider, newGenerationProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiePoint getDeclare_TiePoint() {
		if (declare_TiePoint != null && declare_TiePoint.eIsProxy()) {
			InternalEObject oldDeclare_TiePoint = (InternalEObject)declare_TiePoint;
			declare_TiePoint = (TiePoint)eResolveProxy(oldDeclare_TiePoint);
			if (declare_TiePoint != oldDeclare_TiePoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT, oldDeclare_TiePoint, declare_TiePoint));
			}
		}
		return declare_TiePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiePoint basicGetDeclare_TiePoint() {
		return declare_TiePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclare_TiePoint(TiePoint newDeclare_TiePoint, NotificationChain msgs) {
		TiePoint oldDeclare_TiePoint = declare_TiePoint;
		declare_TiePoint = newDeclare_TiePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT, oldDeclare_TiePoint, newDeclare_TiePoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclare_TiePoint(TiePoint newDeclare_TiePoint) {
		if (newDeclare_TiePoint != declare_TiePoint) {
			NotificationChain msgs = null;
			if (declare_TiePoint != null)
				msgs = ((InternalEObject)declare_TiePoint).eInverseRemove(this, ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT, TiePoint.class, msgs);
			if (newDeclare_TiePoint != null)
				msgs = ((InternalEObject)newDeclare_TiePoint).eInverseAdd(this, ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT, TiePoint.class, msgs);
			msgs = basicSetDeclare_TiePoint(newDeclare_TiePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT, newDeclare_TiePoint, newDeclare_TiePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionPath> getHasAPOD_() {
		if (hasAPOD_ == null) {
			hasAPOD_ = new EObjectWithInverseResolvingEList<TransmissionPath>(TransmissionPath.class, this, ReservationPackage.SERVICE_POINT__HAS_APOD_, ReservationPackage.TRANSMISSION_PATH__DELIVERY_POINT_FOR);
		}
		return hasAPOD_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyProduct> getEnergyProducts() {
		if (energyProducts == null) {
			energyProducts = new EObjectWithInverseResolvingEList.ManyInverse<EnergyProduct>(EnergyProduct.class, this, ReservationPackage.SERVICE_POINT__ENERGY_PRODUCTS, EnergySchedulingPackage.ENERGY_PRODUCT__SERVICE_POINT);
		}
		return energyProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea getMemberOf() {
		if (memberOf != null && memberOf.eIsProxy()) {
			InternalEObject oldMemberOf = (InternalEObject)memberOf;
			memberOf = (SubControlArea)eResolveProxy(oldMemberOf);
			if (memberOf != oldMemberOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.SERVICE_POINT__MEMBER_OF, oldMemberOf, memberOf));
			}
		}
		return memberOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea basicGetMemberOf() {
		return memberOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf(SubControlArea newMemberOf, NotificationChain msgs) {
		SubControlArea oldMemberOf = memberOf;
		memberOf = newMemberOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__MEMBER_OF, oldMemberOf, newMemberOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf(SubControlArea newMemberOf) {
		if (newMemberOf != memberOf) {
			NotificationChain msgs = null;
			if (memberOf != null)
				msgs = ((InternalEObject)memberOf).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF, SubControlArea.class, msgs);
			if (newMemberOf != null)
				msgs = ((InternalEObject)newMemberOf).eInverseAdd(this, EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF, SubControlArea.class, msgs);
			msgs = basicSetMemberOf(newMemberOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.SERVICE_POINT__MEMBER_OF, newMemberOf, newMemberOf));
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
			case ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER:
				if (customerConsumer != null)
					msgs = ((InternalEObject)customerConsumer).eInverseRemove(this, FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT, CustomerConsumer.class, msgs);
				return basicSetCustomerConsumer((CustomerConsumer)otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER:
				if (transmissionProvider != null)
					msgs = ((InternalEObject)transmissionProvider).eInverseRemove(this, FinancialPackage.TRANSMISSION_PROVIDER__SERVICE_POINT, TransmissionProvider.class, msgs);
				return basicSetTransmissionProvider((TransmissionProvider)otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__HAS_APOR_:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAPOR_()).basicAdd(otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER:
				if (generationProvider != null)
					msgs = ((InternalEObject)generationProvider).eInverseRemove(this, FinancialPackage.GENERATION_PROVIDER__SERVICE_POINT, GenerationProvider.class, msgs);
				return basicSetGenerationProvider((GenerationProvider)otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT:
				if (declare_TiePoint != null)
					msgs = ((InternalEObject)declare_TiePoint).eInverseRemove(this, ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT, TiePoint.class, msgs);
				return basicSetDeclare_TiePoint((TiePoint)otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__HAS_APOD_:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAPOD_()).basicAdd(otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__ENERGY_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyProducts()).basicAdd(otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__MEMBER_OF:
				if (memberOf != null)
					msgs = ((InternalEObject)memberOf).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__PART_OF, SubControlArea.class, msgs);
				return basicSetMemberOf((SubControlArea)otherEnd, msgs);
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
			case ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER:
				return basicSetCustomerConsumer(null, msgs);
			case ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER:
				return basicSetTransmissionProvider(null, msgs);
			case ReservationPackage.SERVICE_POINT__HAS_APOR_:
				return ((InternalEList<?>)getHasAPOR_()).basicRemove(otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER:
				return basicSetGenerationProvider(null, msgs);
			case ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT:
				return basicSetDeclare_TiePoint(null, msgs);
			case ReservationPackage.SERVICE_POINT__HAS_APOD_:
				return ((InternalEList<?>)getHasAPOD_()).basicRemove(otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__ENERGY_PRODUCTS:
				return ((InternalEList<?>)getEnergyProducts()).basicRemove(otherEnd, msgs);
			case ReservationPackage.SERVICE_POINT__MEMBER_OF:
				return basicSetMemberOf(null, msgs);
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
			case ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER:
				if (resolve) return getCustomerConsumer();
				return basicGetCustomerConsumer();
			case ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER:
				if (resolve) return getTransmissionProvider();
				return basicGetTransmissionProvider();
			case ReservationPackage.SERVICE_POINT__HAS_APOR_:
				return getHasAPOR_();
			case ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER:
				if (resolve) return getGenerationProvider();
				return basicGetGenerationProvider();
			case ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT:
				if (resolve) return getDeclare_TiePoint();
				return basicGetDeclare_TiePoint();
			case ReservationPackage.SERVICE_POINT__HAS_APOD_:
				return getHasAPOD_();
			case ReservationPackage.SERVICE_POINT__ENERGY_PRODUCTS:
				return getEnergyProducts();
			case ReservationPackage.SERVICE_POINT__MEMBER_OF:
				if (resolve) return getMemberOf();
				return basicGetMemberOf();
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
			case ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER:
				setCustomerConsumer((CustomerConsumer)newValue);
				return;
			case ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER:
				setTransmissionProvider((TransmissionProvider)newValue);
				return;
			case ReservationPackage.SERVICE_POINT__HAS_APOR_:
				getHasAPOR_().clear();
				getHasAPOR_().addAll((Collection<? extends TransmissionPath>)newValue);
				return;
			case ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER:
				setGenerationProvider((GenerationProvider)newValue);
				return;
			case ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT:
				setDeclare_TiePoint((TiePoint)newValue);
				return;
			case ReservationPackage.SERVICE_POINT__HAS_APOD_:
				getHasAPOD_().clear();
				getHasAPOD_().addAll((Collection<? extends TransmissionPath>)newValue);
				return;
			case ReservationPackage.SERVICE_POINT__ENERGY_PRODUCTS:
				getEnergyProducts().clear();
				getEnergyProducts().addAll((Collection<? extends EnergyProduct>)newValue);
				return;
			case ReservationPackage.SERVICE_POINT__MEMBER_OF:
				setMemberOf((SubControlArea)newValue);
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
			case ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER:
				setCustomerConsumer((CustomerConsumer)null);
				return;
			case ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER:
				setTransmissionProvider((TransmissionProvider)null);
				return;
			case ReservationPackage.SERVICE_POINT__HAS_APOR_:
				getHasAPOR_().clear();
				return;
			case ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER:
				setGenerationProvider((GenerationProvider)null);
				return;
			case ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT:
				setDeclare_TiePoint((TiePoint)null);
				return;
			case ReservationPackage.SERVICE_POINT__HAS_APOD_:
				getHasAPOD_().clear();
				return;
			case ReservationPackage.SERVICE_POINT__ENERGY_PRODUCTS:
				getEnergyProducts().clear();
				return;
			case ReservationPackage.SERVICE_POINT__MEMBER_OF:
				setMemberOf((SubControlArea)null);
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
			case ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER:
				return customerConsumer != null;
			case ReservationPackage.SERVICE_POINT__TRANSMISSION_PROVIDER:
				return transmissionProvider != null;
			case ReservationPackage.SERVICE_POINT__HAS_APOR_:
				return hasAPOR_ != null && !hasAPOR_.isEmpty();
			case ReservationPackage.SERVICE_POINT__GENERATION_PROVIDER:
				return generationProvider != null;
			case ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT:
				return declare_TiePoint != null;
			case ReservationPackage.SERVICE_POINT__HAS_APOD_:
				return hasAPOD_ != null && !hasAPOD_.isEmpty();
			case ReservationPackage.SERVICE_POINT__ENERGY_PRODUCTS:
				return energyProducts != null && !energyProducts.isEmpty();
			case ReservationPackage.SERVICE_POINT__MEMBER_OF:
				return memberOf != null;
		}
		return super.eIsSet(featureID);
	}

} //ServicePointImpl
