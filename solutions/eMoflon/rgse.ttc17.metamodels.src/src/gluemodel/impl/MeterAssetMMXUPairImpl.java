/**
 */
package gluemodel.impl;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.GluemodelPackage;
import gluemodel.MeterAssetMMXUPair;

import gluemodel.substationStandard.LNNodes.LNGroupM.MMXU;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter Asset MMXU Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getA <em>A</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getB <em>B</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getName <em>Name</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getAMag <em>AMag</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getAAng <em>AAng</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getBMag <em>BMag</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getBAng <em>BAng</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getCMag <em>CMag</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getCAng <em>CAng</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getNeutMag <em>Neut Mag</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getNeutAng <em>Neut Ang</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getNetMag <em>Net Mag</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getNetAng <em>Net Ang</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getResMag <em>Res Mag</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetMMXUPairImpl#getResAng <em>Res Ang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterAssetMMXUPairImpl extends MinimalEObjectImpl.Container implements MeterAssetMMXUPair {
	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected MeterAsset a;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected MMXU b;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAMag() <em>AMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAMag()
	 * @generated
	 * @ordered
	 */
	protected static final double AMAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAMag() <em>AMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAMag()
	 * @generated
	 * @ordered
	 */
	protected double aMag = AMAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAAng() <em>AAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAng()
	 * @generated
	 * @ordered
	 */
	protected static final double AANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAAng() <em>AAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAng()
	 * @generated
	 * @ordered
	 */
	protected double aAng = AANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getBMag() <em>BMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBMag()
	 * @generated
	 * @ordered
	 */
	protected static final double BMAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBMag() <em>BMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBMag()
	 * @generated
	 * @ordered
	 */
	protected double bMag = BMAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getBAng() <em>BAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBAng()
	 * @generated
	 * @ordered
	 */
	protected static final double BANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBAng() <em>BAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBAng()
	 * @generated
	 * @ordered
	 */
	protected double bAng = BANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCMag() <em>CMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMag()
	 * @generated
	 * @ordered
	 */
	protected static final double CMAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCMag() <em>CMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMag()
	 * @generated
	 * @ordered
	 */
	protected double cMag = CMAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCAng() <em>CAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAng()
	 * @generated
	 * @ordered
	 */
	protected static final double CANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCAng() <em>CAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAng()
	 * @generated
	 * @ordered
	 */
	protected double cAng = CANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutMag() <em>Neut Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutMag()
	 * @generated
	 * @ordered
	 */
	protected static final double NEUT_MAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNeutMag() <em>Neut Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutMag()
	 * @generated
	 * @ordered
	 */
	protected double neutMag = NEUT_MAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutAng() <em>Neut Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutAng()
	 * @generated
	 * @ordered
	 */
	protected static final double NEUT_ANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNeutAng() <em>Neut Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutAng()
	 * @generated
	 * @ordered
	 */
	protected double neutAng = NEUT_ANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetMag() <em>Net Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetMag()
	 * @generated
	 * @ordered
	 */
	protected static final double NET_MAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNetMag() <em>Net Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetMag()
	 * @generated
	 * @ordered
	 */
	protected double netMag = NET_MAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetAng() <em>Net Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAng()
	 * @generated
	 * @ordered
	 */
	protected static final double NET_ANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNetAng() <em>Net Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAng()
	 * @generated
	 * @ordered
	 */
	protected double netAng = NET_ANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getResMag() <em>Res Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMag()
	 * @generated
	 * @ordered
	 */
	protected static final double RES_MAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getResMag() <em>Res Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMag()
	 * @generated
	 * @ordered
	 */
	protected double resMag = RES_MAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getResAng() <em>Res Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResAng()
	 * @generated
	 * @ordered
	 */
	protected static final double RES_ANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getResAng() <em>Res Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResAng()
	 * @generated
	 * @ordered
	 */
	protected double resAng = RES_ANG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterAssetMMXUPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GluemodelPackage.Literals.METER_ASSET_MMXU_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset getA() {
		if (a != null && a.eIsProxy()) {
			InternalEObject oldA = (InternalEObject)a;
			a = (MeterAsset)eResolveProxy(oldA);
			if (a != oldA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GluemodelPackage.METER_ASSET_MMXU_PAIR__A, oldA, a));
			}
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset basicGetA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(MeterAsset newA) {
		MeterAsset oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMXU getB() {
		if (b != null && b.eIsProxy()) {
			InternalEObject oldB = (InternalEObject)b;
			b = (MMXU)eResolveProxy(oldB);
			if (b != oldB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GluemodelPackage.METER_ASSET_MMXU_PAIR__B, oldB, b));
			}
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMXU basicGetB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(MMXU newB) {
		MMXU oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAMag() {
		return aMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAMag(double newAMag) {
		double oldAMag = aMag;
		aMag = newAMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__AMAG, oldAMag, aMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAAng() {
		return aAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAAng(double newAAng) {
		double oldAAng = aAng;
		aAng = newAAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__AANG, oldAAng, aAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBMag() {
		return bMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBMag(double newBMag) {
		double oldBMag = bMag;
		bMag = newBMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__BMAG, oldBMag, bMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBAng() {
		return bAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBAng(double newBAng) {
		double oldBAng = bAng;
		bAng = newBAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__BANG, oldBAng, bAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCMag() {
		return cMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCMag(double newCMag) {
		double oldCMag = cMag;
		cMag = newCMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__CMAG, oldCMag, cMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCAng() {
		return cAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCAng(double newCAng) {
		double oldCAng = cAng;
		cAng = newCAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__CANG, oldCAng, cAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNeutMag() {
		return neutMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutMag(double newNeutMag) {
		double oldNeutMag = neutMag;
		neutMag = newNeutMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_MAG, oldNeutMag, neutMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNeutAng() {
		return neutAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutAng(double newNeutAng) {
		double oldNeutAng = neutAng;
		neutAng = newNeutAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_ANG, oldNeutAng, neutAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNetMag() {
		return netMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetMag(double newNetMag) {
		double oldNetMag = netMag;
		netMag = newNetMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_MAG, oldNetMag, netMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNetAng() {
		return netAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetAng(double newNetAng) {
		double oldNetAng = netAng;
		netAng = newNetAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_ANG, oldNetAng, netAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getResMag() {
		return resMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResMag(double newResMag) {
		double oldResMag = resMag;
		resMag = newResMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_MAG, oldResMag, resMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getResAng() {
		return resAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResAng(double newResAng) {
		double oldResAng = resAng;
		resAng = newResAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_ANG, oldResAng, resAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__A:
				if (resolve) return getA();
				return basicGetA();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__B:
				if (resolve) return getB();
				return basicGetB();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NAME:
				return getName();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__AMAG:
				return getAMag();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__AANG:
				return getAAng();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__BMAG:
				return getBMag();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__BANG:
				return getBAng();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__CMAG:
				return getCMag();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__CANG:
				return getCAng();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_MAG:
				return getNeutMag();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_ANG:
				return getNeutAng();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_MAG:
				return getNetMag();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_ANG:
				return getNetAng();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_MAG:
				return getResMag();
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_ANG:
				return getResAng();
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
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__A:
				setA((MeterAsset)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__B:
				setB((MMXU)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NAME:
				setName((String)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__AMAG:
				setAMag((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__AANG:
				setAAng((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__BMAG:
				setBMag((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__BANG:
				setBAng((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__CMAG:
				setCMag((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__CANG:
				setCAng((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_MAG:
				setNeutMag((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_ANG:
				setNeutAng((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_MAG:
				setNetMag((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_ANG:
				setNetAng((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_MAG:
				setResMag((Double)newValue);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_ANG:
				setResAng((Double)newValue);
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
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__A:
				setA((MeterAsset)null);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__B:
				setB((MMXU)null);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__AMAG:
				setAMag(AMAG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__AANG:
				setAAng(AANG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__BMAG:
				setBMag(BMAG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__BANG:
				setBAng(BANG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__CMAG:
				setCMag(CMAG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__CANG:
				setCAng(CANG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_MAG:
				setNeutMag(NEUT_MAG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_ANG:
				setNeutAng(NEUT_ANG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_MAG:
				setNetMag(NET_MAG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_ANG:
				setNetAng(NET_ANG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_MAG:
				setResMag(RES_MAG_EDEFAULT);
				return;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_ANG:
				setResAng(RES_ANG_EDEFAULT);
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
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__A:
				return a != null;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__B:
				return b != null;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__AMAG:
				return aMag != AMAG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__AANG:
				return aAng != AANG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__BMAG:
				return bMag != BMAG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__BANG:
				return bAng != BANG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__CMAG:
				return cMag != CMAG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__CANG:
				return cAng != CANG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_MAG:
				return neutMag != NEUT_MAG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NEUT_ANG:
				return neutAng != NEUT_ANG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_MAG:
				return netMag != NET_MAG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__NET_ANG:
				return netAng != NET_ANG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_MAG:
				return resMag != RES_MAG_EDEFAULT;
			case GluemodelPackage.METER_ASSET_MMXU_PAIR__RES_ANG:
				return resAng != RES_ANG_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", AMag: ");
		result.append(aMag);
		result.append(", AAng: ");
		result.append(aAng);
		result.append(", BMag: ");
		result.append(bMag);
		result.append(", BAng: ");
		result.append(bAng);
		result.append(", CMag: ");
		result.append(cMag);
		result.append(", CAng: ");
		result.append(cAng);
		result.append(", NeutMag: ");
		result.append(neutMag);
		result.append(", NeutAng: ");
		result.append(neutAng);
		result.append(", NetMag: ");
		result.append(netMag);
		result.append(", NetAng: ");
		result.append(netAng);
		result.append(", ResMag: ");
		result.append(resMag);
		result.append(", ResAng: ");
		result.append(resAng);
		result.append(')');
		return result.toString();
	}

} //MeterAssetMMXUPairImpl
