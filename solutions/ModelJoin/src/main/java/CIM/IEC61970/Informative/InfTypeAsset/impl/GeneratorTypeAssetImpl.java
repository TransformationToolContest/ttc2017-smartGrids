/**
 */
package CIM.IEC61970.Informative.InfTypeAsset.impl;

import CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset;
import CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Type Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getXDirectSync <em>XDirect Sync</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getRDirectSync <em>RDirect Sync</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getRQuadTrans <em>RQuad Trans</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getXQuadSync <em>XQuad Sync</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getXQuadSubtrans <em>XQuad Subtrans</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getMinP <em>Min P</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getMaxP <em>Max P</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getRQuadSync <em>RQuad Sync</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getXDirectSubtrans <em>XDirect Subtrans</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getXDirectTrans <em>XDirect Trans</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getRDirectTrans <em>RDirect Trans</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getRDirectSubtrans <em>RDirect Subtrans</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getXQuadTrans <em>XQuad Trans</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.GeneratorTypeAssetImpl#getRQuadSubtrans <em>RQuad Subtrans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorTypeAssetImpl extends ElectricalTypeAssetImpl implements GeneratorTypeAsset {
	/**
	 * The default value of the '{@link #getXDirectSync() <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSync()
	 * @generated
	 * @ordered
	 */
	protected static final float XDIRECT_SYNC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXDirectSync() <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSync()
	 * @generated
	 * @ordered
	 */
	protected float xDirectSync = XDIRECT_SYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRDirectSync() <em>RDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDirectSync()
	 * @generated
	 * @ordered
	 */
	protected static final float RDIRECT_SYNC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRDirectSync() <em>RDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDirectSync()
	 * @generated
	 * @ordered
	 */
	protected float rDirectSync = RDIRECT_SYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRQuadTrans() <em>RQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQuadTrans()
	 * @generated
	 * @ordered
	 */
	protected static final float RQUAD_TRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRQuadTrans() <em>RQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQuadTrans()
	 * @generated
	 * @ordered
	 */
	protected float rQuadTrans = RQUAD_TRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXQuadSync() <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSync()
	 * @generated
	 * @ordered
	 */
	protected static final float XQUAD_SYNC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXQuadSync() <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSync()
	 * @generated
	 * @ordered
	 */
	protected float xQuadSync = XQUAD_SYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getXQuadSubtrans() <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSubtrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XQUAD_SUBTRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXQuadSubtrans() <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSubtrans()
	 * @generated
	 * @ordered
	 */
	protected float xQuadSubtrans = XQUAD_SUBTRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected float minP = MIN_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQ()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQ()
	 * @generated
	 * @ordered
	 */
	protected float minQ = MIN_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQ()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQ()
	 * @generated
	 * @ordered
	 */
	protected float maxQ = MAX_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected float maxP = MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getRQuadSync() <em>RQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQuadSync()
	 * @generated
	 * @ordered
	 */
	protected static final float RQUAD_SYNC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRQuadSync() <em>RQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQuadSync()
	 * @generated
	 * @ordered
	 */
	protected float rQuadSync = RQUAD_SYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getXDirectSubtrans() <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSubtrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XDIRECT_SUBTRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXDirectSubtrans() <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSubtrans()
	 * @generated
	 * @ordered
	 */
	protected float xDirectSubtrans = XDIRECT_SUBTRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXDirectTrans() <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectTrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XDIRECT_TRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXDirectTrans() <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectTrans()
	 * @generated
	 * @ordered
	 */
	protected float xDirectTrans = XDIRECT_TRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRDirectTrans() <em>RDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDirectTrans()
	 * @generated
	 * @ordered
	 */
	protected static final float RDIRECT_TRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRDirectTrans() <em>RDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDirectTrans()
	 * @generated
	 * @ordered
	 */
	protected float rDirectTrans = RDIRECT_TRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRDirectSubtrans() <em>RDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDirectSubtrans()
	 * @generated
	 * @ordered
	 */
	protected static final float RDIRECT_SUBTRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRDirectSubtrans() <em>RDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDirectSubtrans()
	 * @generated
	 * @ordered
	 */
	protected float rDirectSubtrans = RDIRECT_SUBTRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXQuadTrans() <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadTrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XQUAD_TRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXQuadTrans() <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadTrans()
	 * @generated
	 * @ordered
	 */
	protected float xQuadTrans = XQUAD_TRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRQuadSubtrans() <em>RQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQuadSubtrans()
	 * @generated
	 * @ordered
	 */
	protected static final float RQUAD_SUBTRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRQuadSubtrans() <em>RQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQuadSubtrans()
	 * @generated
	 * @ordered
	 */
	protected float rQuadSubtrans = RQUAD_SUBTRANS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorTypeAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfTypeAssetPackage.Literals.GENERATOR_TYPE_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXDirectSync() {
		return xDirectSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDirectSync(float newXDirectSync) {
		float oldXDirectSync = xDirectSync;
		xDirectSync = newXDirectSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SYNC, oldXDirectSync, xDirectSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRDirectSync() {
		return rDirectSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDirectSync(float newRDirectSync) {
		float oldRDirectSync = rDirectSync;
		rDirectSync = newRDirectSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SYNC, oldRDirectSync, rDirectSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRQuadTrans() {
		return rQuadTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQuadTrans(float newRQuadTrans) {
		float oldRQuadTrans = rQuadTrans;
		rQuadTrans = newRQuadTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_TRANS, oldRQuadTrans, rQuadTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXQuadSync() {
		return xQuadSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXQuadSync(float newXQuadSync) {
		float oldXQuadSync = xQuadSync;
		xQuadSync = newXQuadSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SYNC, oldXQuadSync, xQuadSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXQuadSubtrans() {
		return xQuadSubtrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXQuadSubtrans(float newXQuadSubtrans) {
		float oldXQuadSubtrans = xQuadSubtrans;
		xQuadSubtrans = newXQuadSubtrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SUBTRANS, oldXQuadSubtrans, xQuadSubtrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinP() {
		return minP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinP(float newMinP) {
		float oldMinP = minP;
		minP = newMinP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_P, oldMinP, minP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinQ() {
		return minQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinQ(float newMinQ) {
		float oldMinQ = minQ;
		minQ = newMinQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_Q, oldMinQ, minQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxQ() {
		return maxQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxQ(float newMaxQ) {
		float oldMaxQ = maxQ;
		maxQ = newMaxQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_Q, oldMaxQ, maxQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxP() {
		return maxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxP(float newMaxP) {
		float oldMaxP = maxP;
		maxP = newMaxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_P, oldMaxP, maxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRQuadSync() {
		return rQuadSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQuadSync(float newRQuadSync) {
		float oldRQuadSync = rQuadSync;
		rQuadSync = newRQuadSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SYNC, oldRQuadSync, rQuadSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXDirectSubtrans() {
		return xDirectSubtrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDirectSubtrans(float newXDirectSubtrans) {
		float oldXDirectSubtrans = xDirectSubtrans;
		xDirectSubtrans = newXDirectSubtrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SUBTRANS, oldXDirectSubtrans, xDirectSubtrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXDirectTrans() {
		return xDirectTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDirectTrans(float newXDirectTrans) {
		float oldXDirectTrans = xDirectTrans;
		xDirectTrans = newXDirectTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_TRANS, oldXDirectTrans, xDirectTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRDirectTrans() {
		return rDirectTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDirectTrans(float newRDirectTrans) {
		float oldRDirectTrans = rDirectTrans;
		rDirectTrans = newRDirectTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_TRANS, oldRDirectTrans, rDirectTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRDirectSubtrans() {
		return rDirectSubtrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDirectSubtrans(float newRDirectSubtrans) {
		float oldRDirectSubtrans = rDirectSubtrans;
		rDirectSubtrans = newRDirectSubtrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SUBTRANS, oldRDirectSubtrans, rDirectSubtrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXQuadTrans() {
		return xQuadTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXQuadTrans(float newXQuadTrans) {
		float oldXQuadTrans = xQuadTrans;
		xQuadTrans = newXQuadTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_TRANS, oldXQuadTrans, xQuadTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRQuadSubtrans() {
		return rQuadSubtrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQuadSubtrans(float newRQuadSubtrans) {
		float oldRQuadSubtrans = rQuadSubtrans;
		rQuadSubtrans = newRQuadSubtrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SUBTRANS, oldRQuadSubtrans, rQuadSubtrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SYNC:
				return getXDirectSync();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SYNC:
				return getRDirectSync();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_TRANS:
				return getRQuadTrans();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SYNC:
				return getXQuadSync();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SUBTRANS:
				return getXQuadSubtrans();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_P:
				return getMinP();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_Q:
				return getMinQ();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_Q:
				return getMaxQ();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_P:
				return getMaxP();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SYNC:
				return getRQuadSync();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SUBTRANS:
				return getXDirectSubtrans();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_TRANS:
				return getXDirectTrans();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_TRANS:
				return getRDirectTrans();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SUBTRANS:
				return getRDirectSubtrans();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_TRANS:
				return getXQuadTrans();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SUBTRANS:
				return getRQuadSubtrans();
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
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SYNC:
				setXDirectSync((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SYNC:
				setRDirectSync((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_TRANS:
				setRQuadTrans((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SYNC:
				setXQuadSync((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SUBTRANS:
				setXQuadSubtrans((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_P:
				setMinP((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_Q:
				setMinQ((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_Q:
				setMaxQ((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_P:
				setMaxP((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SYNC:
				setRQuadSync((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SUBTRANS:
				setXDirectSubtrans((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_TRANS:
				setXDirectTrans((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_TRANS:
				setRDirectTrans((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SUBTRANS:
				setRDirectSubtrans((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_TRANS:
				setXQuadTrans((Float)newValue);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SUBTRANS:
				setRQuadSubtrans((Float)newValue);
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
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SYNC:
				setXDirectSync(XDIRECT_SYNC_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SYNC:
				setRDirectSync(RDIRECT_SYNC_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_TRANS:
				setRQuadTrans(RQUAD_TRANS_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SYNC:
				setXQuadSync(XQUAD_SYNC_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SUBTRANS:
				setXQuadSubtrans(XQUAD_SUBTRANS_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_P:
				setMinP(MIN_P_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_Q:
				setMinQ(MIN_Q_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_Q:
				setMaxQ(MAX_Q_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_P:
				setMaxP(MAX_P_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SYNC:
				setRQuadSync(RQUAD_SYNC_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SUBTRANS:
				setXDirectSubtrans(XDIRECT_SUBTRANS_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_TRANS:
				setXDirectTrans(XDIRECT_TRANS_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_TRANS:
				setRDirectTrans(RDIRECT_TRANS_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SUBTRANS:
				setRDirectSubtrans(RDIRECT_SUBTRANS_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_TRANS:
				setXQuadTrans(XQUAD_TRANS_EDEFAULT);
				return;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SUBTRANS:
				setRQuadSubtrans(RQUAD_SUBTRANS_EDEFAULT);
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
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SYNC:
				return xDirectSync != XDIRECT_SYNC_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SYNC:
				return rDirectSync != RDIRECT_SYNC_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_TRANS:
				return rQuadTrans != RQUAD_TRANS_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SYNC:
				return xQuadSync != XQUAD_SYNC_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_SUBTRANS:
				return xQuadSubtrans != XQUAD_SUBTRANS_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_P:
				return minP != MIN_P_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MIN_Q:
				return minQ != MIN_Q_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_Q:
				return maxQ != MAX_Q_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__MAX_P:
				return maxP != MAX_P_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SYNC:
				return rQuadSync != RQUAD_SYNC_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_SUBTRANS:
				return xDirectSubtrans != XDIRECT_SUBTRANS_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XDIRECT_TRANS:
				return xDirectTrans != XDIRECT_TRANS_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_TRANS:
				return rDirectTrans != RDIRECT_TRANS_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RDIRECT_SUBTRANS:
				return rDirectSubtrans != RDIRECT_SUBTRANS_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__XQUAD_TRANS:
				return xQuadTrans != XQUAD_TRANS_EDEFAULT;
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET__RQUAD_SUBTRANS:
				return rQuadSubtrans != RQUAD_SUBTRANS_EDEFAULT;
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
		result.append(" (xDirectSync: ");
		result.append(xDirectSync);
		result.append(", rDirectSync: ");
		result.append(rDirectSync);
		result.append(", rQuadTrans: ");
		result.append(rQuadTrans);
		result.append(", xQuadSync: ");
		result.append(xQuadSync);
		result.append(", xQuadSubtrans: ");
		result.append(xQuadSubtrans);
		result.append(", minP: ");
		result.append(minP);
		result.append(", minQ: ");
		result.append(minQ);
		result.append(", maxQ: ");
		result.append(maxQ);
		result.append(", maxP: ");
		result.append(maxP);
		result.append(", rQuadSync: ");
		result.append(rQuadSync);
		result.append(", xDirectSubtrans: ");
		result.append(xDirectSubtrans);
		result.append(", xDirectTrans: ");
		result.append(xDirectTrans);
		result.append(", rDirectTrans: ");
		result.append(rDirectTrans);
		result.append(", rDirectSubtrans: ");
		result.append(rDirectSubtrans);
		result.append(", xQuadTrans: ");
		result.append(xQuadTrans);
		result.append(", rQuadSubtrans: ");
		result.append(rQuadSubtrans);
		result.append(')');
		return result.toString();
	}

} //GeneratorTypeAssetImpl
