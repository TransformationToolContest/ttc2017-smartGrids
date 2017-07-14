/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM.impl;

import gluemodel.substationStandard.Dataclasses.SAV;
import gluemodel.substationStandard.Dataclasses.WYE;

import gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage;
import gluemodel.substationStandard.LNNodes.LNGroupM.MDIF;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MDIF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MDIFImpl#getOpARem <em>Op ARem</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MDIFImpl#getAmp1 <em>Amp1</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MDIFImpl#getAmp2 <em>Amp2</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MDIFImpl#getAmp3 <em>Amp3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDIFImpl extends GroupMImpl implements MDIF {
	/**
	 * The cached value of the '{@link #getOpARem() <em>Op ARem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpARem()
	 * @generated
	 * @ordered
	 */
	protected WYE opARem;

	/**
	 * The cached value of the '{@link #getAmp1() <em>Amp1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmp1()
	 * @generated
	 * @ordered
	 */
	protected SAV amp1;

	/**
	 * The cached value of the '{@link #getAmp2() <em>Amp2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmp2()
	 * @generated
	 * @ordered
	 */
	protected SAV amp2;

	/**
	 * The cached value of the '{@link #getAmp3() <em>Amp3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmp3()
	 * @generated
	 * @ordered
	 */
	protected SAV amp3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDIFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupMPackage.Literals.MDIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getOpARem() {
		if (opARem != null && opARem.eIsProxy()) {
			InternalEObject oldOpARem = (InternalEObject)opARem;
			opARem = (WYE)eResolveProxy(oldOpARem);
			if (opARem != oldOpARem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MDIF__OP_AREM, oldOpARem, opARem));
			}
		}
		return opARem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetOpARem() {
		return opARem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpARem(WYE newOpARem) {
		WYE oldOpARem = opARem;
		opARem = newOpARem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MDIF__OP_AREM, oldOpARem, opARem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV getAmp1() {
		if (amp1 != null && amp1.eIsProxy()) {
			InternalEObject oldAmp1 = (InternalEObject)amp1;
			amp1 = (SAV)eResolveProxy(oldAmp1);
			if (amp1 != oldAmp1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MDIF__AMP1, oldAmp1, amp1));
			}
		}
		return amp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV basicGetAmp1() {
		return amp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmp1(SAV newAmp1) {
		SAV oldAmp1 = amp1;
		amp1 = newAmp1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MDIF__AMP1, oldAmp1, amp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV getAmp2() {
		if (amp2 != null && amp2.eIsProxy()) {
			InternalEObject oldAmp2 = (InternalEObject)amp2;
			amp2 = (SAV)eResolveProxy(oldAmp2);
			if (amp2 != oldAmp2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MDIF__AMP2, oldAmp2, amp2));
			}
		}
		return amp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV basicGetAmp2() {
		return amp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmp2(SAV newAmp2) {
		SAV oldAmp2 = amp2;
		amp2 = newAmp2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MDIF__AMP2, oldAmp2, amp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV getAmp3() {
		if (amp3 != null && amp3.eIsProxy()) {
			InternalEObject oldAmp3 = (InternalEObject)amp3;
			amp3 = (SAV)eResolveProxy(oldAmp3);
			if (amp3 != oldAmp3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MDIF__AMP3, oldAmp3, amp3));
			}
		}
		return amp3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV basicGetAmp3() {
		return amp3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmp3(SAV newAmp3) {
		SAV oldAmp3 = amp3;
		amp3 = newAmp3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MDIF__AMP3, oldAmp3, amp3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupMPackage.MDIF__OP_AREM:
				if (resolve) return getOpARem();
				return basicGetOpARem();
			case LNGroupMPackage.MDIF__AMP1:
				if (resolve) return getAmp1();
				return basicGetAmp1();
			case LNGroupMPackage.MDIF__AMP2:
				if (resolve) return getAmp2();
				return basicGetAmp2();
			case LNGroupMPackage.MDIF__AMP3:
				if (resolve) return getAmp3();
				return basicGetAmp3();
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
			case LNGroupMPackage.MDIF__OP_AREM:
				setOpARem((WYE)newValue);
				return;
			case LNGroupMPackage.MDIF__AMP1:
				setAmp1((SAV)newValue);
				return;
			case LNGroupMPackage.MDIF__AMP2:
				setAmp2((SAV)newValue);
				return;
			case LNGroupMPackage.MDIF__AMP3:
				setAmp3((SAV)newValue);
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
			case LNGroupMPackage.MDIF__OP_AREM:
				setOpARem((WYE)null);
				return;
			case LNGroupMPackage.MDIF__AMP1:
				setAmp1((SAV)null);
				return;
			case LNGroupMPackage.MDIF__AMP2:
				setAmp2((SAV)null);
				return;
			case LNGroupMPackage.MDIF__AMP3:
				setAmp3((SAV)null);
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
			case LNGroupMPackage.MDIF__OP_AREM:
				return opARem != null;
			case LNGroupMPackage.MDIF__AMP1:
				return amp1 != null;
			case LNGroupMPackage.MDIF__AMP2:
				return amp2 != null;
			case LNGroupMPackage.MDIF__AMP3:
				return amp3 != null;
		}
		return super.eIsSet(featureID);
	}

} //MDIFImpl
