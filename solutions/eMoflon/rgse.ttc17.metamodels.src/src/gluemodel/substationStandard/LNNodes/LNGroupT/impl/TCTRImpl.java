/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupT.impl;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.SAV;

import gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage;
import gluemodel.substationStandard.LNNodes.LNGroupT.TCTR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCTR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.TCTRImpl#getAmp <em>Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.TCTRImpl#getARtg <em>ARtg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCTRImpl extends GroupTImpl implements TCTR {
	/**
	 * The cached value of the '{@link #getAmp() <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmp()
	 * @generated
	 * @ordered
	 */
	protected SAV amp;

	/**
	 * The cached value of the '{@link #getARtg() <em>ARtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARtg()
	 * @generated
	 * @ordered
	 */
	protected ASG aRtg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCTRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupTPackage.Literals.TCTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV getAmp() {
		if (amp != null && amp.eIsProxy()) {
			InternalEObject oldAmp = (InternalEObject)amp;
			amp = (SAV)eResolveProxy(oldAmp);
			if (amp != oldAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.TCTR__AMP, oldAmp, amp));
			}
		}
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV basicGetAmp() {
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmp(SAV newAmp) {
		SAV oldAmp = amp;
		amp = newAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.TCTR__AMP, oldAmp, amp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getARtg() {
		if (aRtg != null && aRtg.eIsProxy()) {
			InternalEObject oldARtg = (InternalEObject)aRtg;
			aRtg = (ASG)eResolveProxy(oldARtg);
			if (aRtg != oldARtg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.TCTR__ARTG, oldARtg, aRtg));
			}
		}
		return aRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetARtg() {
		return aRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARtg(ASG newARtg) {
		ASG oldARtg = aRtg;
		aRtg = newARtg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.TCTR__ARTG, oldARtg, aRtg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupTPackage.TCTR__AMP:
				if (resolve) return getAmp();
				return basicGetAmp();
			case LNGroupTPackage.TCTR__ARTG:
				if (resolve) return getARtg();
				return basicGetARtg();
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
			case LNGroupTPackage.TCTR__AMP:
				setAmp((SAV)newValue);
				return;
			case LNGroupTPackage.TCTR__ARTG:
				setARtg((ASG)newValue);
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
			case LNGroupTPackage.TCTR__AMP:
				setAmp((SAV)null);
				return;
			case LNGroupTPackage.TCTR__ARTG:
				setARtg((ASG)null);
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
			case LNGroupTPackage.TCTR__AMP:
				return amp != null;
			case LNGroupTPackage.TCTR__ARTG:
				return aRtg != null;
		}
		return super.eIsSet(featureID);
	}

} //TCTRImpl
