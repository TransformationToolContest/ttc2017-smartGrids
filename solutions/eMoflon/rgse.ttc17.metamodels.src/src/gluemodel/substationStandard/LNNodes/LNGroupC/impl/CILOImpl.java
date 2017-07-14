/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupC.impl;

import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupC.CILO;
import gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CILO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CILOImpl#getEnaOpn <em>Ena Opn</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CILOImpl#getEnaCls <em>Ena Cls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CILOImpl extends GroupCImpl implements CILO {
	/**
	 * The cached value of the '{@link #getEnaOpn() <em>Ena Opn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnaOpn()
	 * @generated
	 * @ordered
	 */
	protected SPS enaOpn;

	/**
	 * The cached value of the '{@link #getEnaCls() <em>Ena Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnaCls()
	 * @generated
	 * @ordered
	 */
	protected SPS enaCls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CILOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupCPackage.Literals.CILO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getEnaOpn() {
		if (enaOpn != null && enaOpn.eIsProxy()) {
			InternalEObject oldEnaOpn = (InternalEObject)enaOpn;
			enaOpn = (SPS)eResolveProxy(oldEnaOpn);
			if (enaOpn != oldEnaOpn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CILO__ENA_OPN, oldEnaOpn, enaOpn));
			}
		}
		return enaOpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetEnaOpn() {
		return enaOpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnaOpn(SPS newEnaOpn) {
		SPS oldEnaOpn = enaOpn;
		enaOpn = newEnaOpn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CILO__ENA_OPN, oldEnaOpn, enaOpn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getEnaCls() {
		if (enaCls != null && enaCls.eIsProxy()) {
			InternalEObject oldEnaCls = (InternalEObject)enaCls;
			enaCls = (SPS)eResolveProxy(oldEnaCls);
			if (enaCls != oldEnaCls) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CILO__ENA_CLS, oldEnaCls, enaCls));
			}
		}
		return enaCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetEnaCls() {
		return enaCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnaCls(SPS newEnaCls) {
		SPS oldEnaCls = enaCls;
		enaCls = newEnaCls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CILO__ENA_CLS, oldEnaCls, enaCls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupCPackage.CILO__ENA_OPN:
				if (resolve) return getEnaOpn();
				return basicGetEnaOpn();
			case LNGroupCPackage.CILO__ENA_CLS:
				if (resolve) return getEnaCls();
				return basicGetEnaCls();
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
			case LNGroupCPackage.CILO__ENA_OPN:
				setEnaOpn((SPS)newValue);
				return;
			case LNGroupCPackage.CILO__ENA_CLS:
				setEnaCls((SPS)newValue);
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
			case LNGroupCPackage.CILO__ENA_OPN:
				setEnaOpn((SPS)null);
				return;
			case LNGroupCPackage.CILO__ENA_CLS:
				setEnaCls((SPS)null);
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
			case LNGroupCPackage.CILO__ENA_OPN:
				return enaOpn != null;
			case LNGroupCPackage.CILO__ENA_CLS:
				return enaCls != null;
		}
		return super.eIsSet(featureID);
	}

} //CILOImpl
