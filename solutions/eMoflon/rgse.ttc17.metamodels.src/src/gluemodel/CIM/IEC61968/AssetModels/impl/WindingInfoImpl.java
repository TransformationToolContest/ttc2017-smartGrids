/**
 */
package gluemodel.CIM.IEC61968.AssetModels.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest;
import gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec;
import gluemodel.CIM.IEC61968.AssetModels.TransformerInfo;
import gluemodel.CIM.IEC61968.AssetModels.WindingInfo;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Wires.WindingConnection;

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
 * An implementation of the model object '<em><b>Winding Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getEmergencyS <em>Emergency S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getPhaseAngle <em>Phase Angle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getWindingTests <em>Winding Tests</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getWindings <em>Windings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getShortTermS <em>Short Term S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getToWindingSpecs <em>To Winding Specs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getInsulationU <em>Insulation U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.WindingInfoImpl#getTransformerInfo <em>Transformer Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindingInfoImpl extends IdentifiedObjectImpl implements WindingInfo {
	/**
	 * The default value of the '{@link #getEmergencyS() <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyS()
	 * @generated
	 * @ordered
	 */
	protected static final float EMERGENCY_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEmergencyS() <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyS()
	 * @generated
	 * @ordered
	 */
	protected float emergencyS = EMERGENCY_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseAngle() <em>Phase Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseAngle()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_ANGLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseAngle() <em>Phase Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseAngle()
	 * @generated
	 * @ordered
	 */
	protected int phaseAngle = PHASE_ANGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWindingTests() <em>Winding Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingTests()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionWindingTest> windingTests;

	/**
	 * The cached value of the '{@link #getWindings() <em>Windings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindings()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionTransformerWinding> windings;

	/**
	 * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected float ratedS = RATED_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected float ratedU = RATED_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortTermS() <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTermS()
	 * @generated
	 * @ordered
	 */
	protected static final float SHORT_TERM_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShortTermS() <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTermS()
	 * @generated
	 * @ordered
	 */
	protected float shortTermS = SHORT_TERM_S_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToWindingSpecs() <em>To Winding Specs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToWindingSpecs()
	 * @generated
	 * @ordered
	 */
	protected EList<ToWindingSpec> toWindingSpecs;

	/**
	 * The default value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected static final WindingConnection CONNECTION_KIND_EDEFAULT = WindingConnection.I;

	/**
	 * The cached value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected WindingConnection connectionKind = CONNECTION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsulationU() <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationU()
	 * @generated
	 * @ordered
	 */
	protected static final float INSULATION_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInsulationU() <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationU()
	 * @generated
	 * @ordered
	 */
	protected float insulationU = INSULATION_U_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformerInfo() <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerInfo transformerInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindingInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.WINDING_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEmergencyS() {
		return emergencyS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmergencyS(float newEmergencyS) {
		float oldEmergencyS = emergencyS;
		emergencyS = newEmergencyS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__EMERGENCY_S, oldEmergencyS, emergencyS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhaseAngle() {
		return phaseAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseAngle(int newPhaseAngle) {
		int oldPhaseAngle = phaseAngle;
		phaseAngle = newPhaseAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__PHASE_ANGLE, oldPhaseAngle, phaseAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionWindingTest> getWindingTests() {
		if (windingTests == null) {
			windingTests = new EObjectWithInverseResolvingEList<DistributionWindingTest>(DistributionWindingTest.class, this, AssetModelsPackage.WINDING_INFO__WINDING_TESTS, AssetModelsPackage.DISTRIBUTION_WINDING_TEST__FROM_WINDING);
		}
		return windingTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionTransformerWinding> getWindings() {
		if (windings == null) {
			windings = new EObjectWithInverseResolvingEList<DistributionTransformerWinding>(DistributionTransformerWinding.class, this, AssetModelsPackage.WINDING_INFO__WINDINGS, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO);
		}
		return windings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedS() {
		return ratedS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedS(float newRatedS) {
		float oldRatedS = ratedS;
		ratedS = newRatedS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__RATED_S, oldRatedS, ratedS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedU() {
		return ratedU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedU(float newRatedU) {
		float oldRatedU = ratedU;
		ratedU = newRatedU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__RATED_U, oldRatedU, ratedU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(float newR) {
		float oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShortTermS() {
		return shortTermS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortTermS(float newShortTermS) {
		float oldShortTermS = shortTermS;
		shortTermS = newShortTermS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__SHORT_TERM_S, oldShortTermS, shortTermS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToWindingSpec> getToWindingSpecs() {
		if (toWindingSpecs == null) {
			toWindingSpecs = new EObjectWithInverseResolvingEList<ToWindingSpec>(ToWindingSpec.class, this, AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS, AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING);
		}
		return toWindingSpecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingConnection getConnectionKind() {
		return connectionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionKind(WindingConnection newConnectionKind) {
		WindingConnection oldConnectionKind = connectionKind;
		connectionKind = newConnectionKind == null ? CONNECTION_KIND_EDEFAULT : newConnectionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__CONNECTION_KIND, oldConnectionKind, connectionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInsulationU() {
		return insulationU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulationU(float newInsulationU) {
		float oldInsulationU = insulationU;
		insulationU = newInsulationU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__INSULATION_U, oldInsulationU, insulationU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerInfo getTransformerInfo() {
		if (transformerInfo != null && transformerInfo.eIsProxy()) {
			InternalEObject oldTransformerInfo = (InternalEObject)transformerInfo;
			transformerInfo = (TransformerInfo)eResolveProxy(oldTransformerInfo);
			if (transformerInfo != oldTransformerInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO, oldTransformerInfo, transformerInfo));
			}
		}
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerInfo basicGetTransformerInfo() {
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerInfo(TransformerInfo newTransformerInfo, NotificationChain msgs) {
		TransformerInfo oldTransformerInfo = transformerInfo;
		transformerInfo = newTransformerInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO, oldTransformerInfo, newTransformerInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerInfo(TransformerInfo newTransformerInfo) {
		if (newTransformerInfo != transformerInfo) {
			NotificationChain msgs = null;
			if (transformerInfo != null)
				msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS, TransformerInfo.class, msgs);
			if (newTransformerInfo != null)
				msgs = ((InternalEObject)newTransformerInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS, TransformerInfo.class, msgs);
			msgs = basicSetTransformerInfo(newTransformerInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO, newTransformerInfo, newTransformerInfo));
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
			case AssetModelsPackage.WINDING_INFO__WINDING_TESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindingTests()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.WINDING_INFO__WINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindings()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToWindingSpecs()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO:
				if (transformerInfo != null)
					msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS, TransformerInfo.class, msgs);
				return basicSetTransformerInfo((TransformerInfo)otherEnd, msgs);
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
			case AssetModelsPackage.WINDING_INFO__WINDING_TESTS:
				return ((InternalEList<?>)getWindingTests()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.WINDING_INFO__WINDINGS:
				return ((InternalEList<?>)getWindings()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS:
				return ((InternalEList<?>)getToWindingSpecs()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO:
				return basicSetTransformerInfo(null, msgs);
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
			case AssetModelsPackage.WINDING_INFO__EMERGENCY_S:
				return getEmergencyS();
			case AssetModelsPackage.WINDING_INFO__PHASE_ANGLE:
				return getPhaseAngle();
			case AssetModelsPackage.WINDING_INFO__WINDING_TESTS:
				return getWindingTests();
			case AssetModelsPackage.WINDING_INFO__WINDINGS:
				return getWindings();
			case AssetModelsPackage.WINDING_INFO__RATED_S:
				return getRatedS();
			case AssetModelsPackage.WINDING_INFO__RATED_U:
				return getRatedU();
			case AssetModelsPackage.WINDING_INFO__R:
				return getR();
			case AssetModelsPackage.WINDING_INFO__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case AssetModelsPackage.WINDING_INFO__SHORT_TERM_S:
				return getShortTermS();
			case AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS:
				return getToWindingSpecs();
			case AssetModelsPackage.WINDING_INFO__CONNECTION_KIND:
				return getConnectionKind();
			case AssetModelsPackage.WINDING_INFO__INSULATION_U:
				return getInsulationU();
			case AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO:
				if (resolve) return getTransformerInfo();
				return basicGetTransformerInfo();
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
			case AssetModelsPackage.WINDING_INFO__EMERGENCY_S:
				setEmergencyS((Float)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__PHASE_ANGLE:
				setPhaseAngle((Integer)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__WINDING_TESTS:
				getWindingTests().clear();
				getWindingTests().addAll((Collection<? extends DistributionWindingTest>)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__WINDINGS:
				getWindings().clear();
				getWindings().addAll((Collection<? extends DistributionTransformerWinding>)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__RATED_S:
				setRatedS((Float)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__RATED_U:
				setRatedU((Float)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__R:
				setR((Float)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__SHORT_TERM_S:
				setShortTermS((Float)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS:
				getToWindingSpecs().clear();
				getToWindingSpecs().addAll((Collection<? extends ToWindingSpec>)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__CONNECTION_KIND:
				setConnectionKind((WindingConnection)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__INSULATION_U:
				setInsulationU((Float)newValue);
				return;
			case AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO:
				setTransformerInfo((TransformerInfo)newValue);
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
			case AssetModelsPackage.WINDING_INFO__EMERGENCY_S:
				setEmergencyS(EMERGENCY_S_EDEFAULT);
				return;
			case AssetModelsPackage.WINDING_INFO__PHASE_ANGLE:
				setPhaseAngle(PHASE_ANGLE_EDEFAULT);
				return;
			case AssetModelsPackage.WINDING_INFO__WINDING_TESTS:
				getWindingTests().clear();
				return;
			case AssetModelsPackage.WINDING_INFO__WINDINGS:
				getWindings().clear();
				return;
			case AssetModelsPackage.WINDING_INFO__RATED_S:
				setRatedS(RATED_S_EDEFAULT);
				return;
			case AssetModelsPackage.WINDING_INFO__RATED_U:
				setRatedU(RATED_U_EDEFAULT);
				return;
			case AssetModelsPackage.WINDING_INFO__R:
				setR(R_EDEFAULT);
				return;
			case AssetModelsPackage.WINDING_INFO__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case AssetModelsPackage.WINDING_INFO__SHORT_TERM_S:
				setShortTermS(SHORT_TERM_S_EDEFAULT);
				return;
			case AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS:
				getToWindingSpecs().clear();
				return;
			case AssetModelsPackage.WINDING_INFO__CONNECTION_KIND:
				setConnectionKind(CONNECTION_KIND_EDEFAULT);
				return;
			case AssetModelsPackage.WINDING_INFO__INSULATION_U:
				setInsulationU(INSULATION_U_EDEFAULT);
				return;
			case AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO:
				setTransformerInfo((TransformerInfo)null);
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
			case AssetModelsPackage.WINDING_INFO__EMERGENCY_S:
				return emergencyS != EMERGENCY_S_EDEFAULT;
			case AssetModelsPackage.WINDING_INFO__PHASE_ANGLE:
				return phaseAngle != PHASE_ANGLE_EDEFAULT;
			case AssetModelsPackage.WINDING_INFO__WINDING_TESTS:
				return windingTests != null && !windingTests.isEmpty();
			case AssetModelsPackage.WINDING_INFO__WINDINGS:
				return windings != null && !windings.isEmpty();
			case AssetModelsPackage.WINDING_INFO__RATED_S:
				return ratedS != RATED_S_EDEFAULT;
			case AssetModelsPackage.WINDING_INFO__RATED_U:
				return ratedU != RATED_U_EDEFAULT;
			case AssetModelsPackage.WINDING_INFO__R:
				return r != R_EDEFAULT;
			case AssetModelsPackage.WINDING_INFO__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case AssetModelsPackage.WINDING_INFO__SHORT_TERM_S:
				return shortTermS != SHORT_TERM_S_EDEFAULT;
			case AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS:
				return toWindingSpecs != null && !toWindingSpecs.isEmpty();
			case AssetModelsPackage.WINDING_INFO__CONNECTION_KIND:
				return connectionKind != CONNECTION_KIND_EDEFAULT;
			case AssetModelsPackage.WINDING_INFO__INSULATION_U:
				return insulationU != INSULATION_U_EDEFAULT;
			case AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO:
				return transformerInfo != null;
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
		result.append(" (emergencyS: ");
		result.append(emergencyS);
		result.append(", phaseAngle: ");
		result.append(phaseAngle);
		result.append(", ratedS: ");
		result.append(ratedS);
		result.append(", ratedU: ");
		result.append(ratedU);
		result.append(", r: ");
		result.append(r);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", shortTermS: ");
		result.append(shortTermS);
		result.append(", connectionKind: ");
		result.append(connectionKind);
		result.append(", insulationU: ");
		result.append(insulationU);
		result.append(')');
		return result.toString();
	}

} //WindingInfoImpl
