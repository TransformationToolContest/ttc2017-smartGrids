/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine;
import CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;

import CIM.IEC61970.Generation.Production.AirCompressor;
import CIM.IEC61970.Generation.Production.CAESPlant;
import CIM.IEC61970.Generation.Production.ProductionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Air Compressor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.AirCompressorImpl#getCombustionTurbine <em>Combustion Turbine</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.AirCompressorImpl#getCAESPlant <em>CAES Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.AirCompressorImpl#getAirCompressorRating <em>Air Compressor Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirCompressorImpl extends PowerSystemResourceImpl implements AirCompressor {
	/**
	 * The cached value of the '{@link #getCombustionTurbine() <em>Combustion Turbine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTurbine()
	 * @generated
	 * @ordered
	 */
	protected CombustionTurbine combustionTurbine;

	/**
	 * The cached value of the '{@link #getCAESPlant() <em>CAES Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAESPlant()
	 * @generated
	 * @ordered
	 */
	protected CAESPlant caesPlant;

	/**
	 * The default value of the '{@link #getAirCompressorRating() <em>Air Compressor Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCompressorRating()
	 * @generated
	 * @ordered
	 */
	protected static final float AIR_COMPRESSOR_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAirCompressorRating() <em>Air Compressor Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCompressorRating()
	 * @generated
	 * @ordered
	 */
	protected float airCompressorRating = AIR_COMPRESSOR_RATING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirCompressorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.AIR_COMPRESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombustionTurbine getCombustionTurbine() {
		if (combustionTurbine != null && combustionTurbine.eIsProxy()) {
			InternalEObject oldCombustionTurbine = (InternalEObject)combustionTurbine;
			combustionTurbine = (CombustionTurbine)eResolveProxy(oldCombustionTurbine);
			if (combustionTurbine != oldCombustionTurbine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, oldCombustionTurbine, combustionTurbine));
			}
		}
		return combustionTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombustionTurbine basicGetCombustionTurbine() {
		return combustionTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombustionTurbine(CombustionTurbine newCombustionTurbine, NotificationChain msgs) {
		CombustionTurbine oldCombustionTurbine = combustionTurbine;
		combustionTurbine = newCombustionTurbine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, oldCombustionTurbine, newCombustionTurbine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombustionTurbine(CombustionTurbine newCombustionTurbine) {
		if (newCombustionTurbine != combustionTurbine) {
			NotificationChain msgs = null;
			if (combustionTurbine != null)
				msgs = ((InternalEObject)combustionTurbine).eInverseRemove(this, GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs);
			if (newCombustionTurbine != null)
				msgs = ((InternalEObject)newCombustionTurbine).eInverseAdd(this, GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs);
			msgs = basicSetCombustionTurbine(newCombustionTurbine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, newCombustionTurbine, newCombustionTurbine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAESPlant getCAESPlant() {
		if (caesPlant != null && caesPlant.eIsProxy()) {
			InternalEObject oldCAESPlant = (InternalEObject)caesPlant;
			caesPlant = (CAESPlant)eResolveProxy(oldCAESPlant);
			if (caesPlant != oldCAESPlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.AIR_COMPRESSOR__CAES_PLANT, oldCAESPlant, caesPlant));
			}
		}
		return caesPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAESPlant basicGetCAESPlant() {
		return caesPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCAESPlant(CAESPlant newCAESPlant, NotificationChain msgs) {
		CAESPlant oldCAESPlant = caesPlant;
		caesPlant = newCAESPlant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.AIR_COMPRESSOR__CAES_PLANT, oldCAESPlant, newCAESPlant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCAESPlant(CAESPlant newCAESPlant) {
		if (newCAESPlant != caesPlant) {
			NotificationChain msgs = null;
			if (caesPlant != null)
				msgs = ((InternalEObject)caesPlant).eInverseRemove(this, ProductionPackage.CAES_PLANT__AIR_COMPRESSOR, CAESPlant.class, msgs);
			if (newCAESPlant != null)
				msgs = ((InternalEObject)newCAESPlant).eInverseAdd(this, ProductionPackage.CAES_PLANT__AIR_COMPRESSOR, CAESPlant.class, msgs);
			msgs = basicSetCAESPlant(newCAESPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.AIR_COMPRESSOR__CAES_PLANT, newCAESPlant, newCAESPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAirCompressorRating() {
		return airCompressorRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAirCompressorRating(float newAirCompressorRating) {
		float oldAirCompressorRating = airCompressorRating;
		airCompressorRating = newAirCompressorRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING, oldAirCompressorRating, airCompressorRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				if (combustionTurbine != null)
					msgs = ((InternalEObject)combustionTurbine).eInverseRemove(this, GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs);
				return basicSetCombustionTurbine((CombustionTurbine)otherEnd, msgs);
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				if (caesPlant != null)
					msgs = ((InternalEObject)caesPlant).eInverseRemove(this, ProductionPackage.CAES_PLANT__AIR_COMPRESSOR, CAESPlant.class, msgs);
				return basicSetCAESPlant((CAESPlant)otherEnd, msgs);
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
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				return basicSetCombustionTurbine(null, msgs);
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				return basicSetCAESPlant(null, msgs);
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
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				if (resolve) return getCombustionTurbine();
				return basicGetCombustionTurbine();
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				if (resolve) return getCAESPlant();
				return basicGetCAESPlant();
			case ProductionPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
				return getAirCompressorRating();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				setCombustionTurbine((CombustionTurbine)newValue);
				return;
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				setCAESPlant((CAESPlant)newValue);
				return;
			case ProductionPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
				setAirCompressorRating((Float)newValue);
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
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				setCombustionTurbine((CombustionTurbine)null);
				return;
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				setCAESPlant((CAESPlant)null);
				return;
			case ProductionPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
				setAirCompressorRating(AIR_COMPRESSOR_RATING_EDEFAULT);
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
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				return combustionTurbine != null;
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				return caesPlant != null;
			case ProductionPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
				return airCompressorRating != AIR_COMPRESSOR_RATING_EDEFAULT;
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
		result.append(" (airCompressorRating: ");
		result.append(airCompressorRating);
		result.append(')');
		return result.toString();
	}

} //AirCompressorImpl
