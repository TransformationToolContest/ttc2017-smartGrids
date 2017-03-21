/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.EventCode;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.EventCodeImpl#getEvent_code_object <em>Event code object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventCodeImpl extends DataImpl implements EventCode {
	/**
	 * The default value of the '{@link #getEvent_code_object() <em>Event code object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_code_object()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_CODE_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent_code_object() <em>Event code object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_code_object()
	 * @generated
	 * @ordered
	 */
	protected String event_code_object = EVENT_CODE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getEventCode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent_code_object() {
		return event_code_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent_code_object(String newEvent_code_object) {
		String oldEvent_code_object = event_code_object;
		event_code_object = newEvent_code_object;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EVENT_CODE__EVENT_CODE_OBJECT, oldEvent_code_object, event_code_object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.EVENT_CODE__EVENT_CODE_OBJECT:
				return getEvent_code_object();
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
			case COSEMObjectsPackage.EVENT_CODE__EVENT_CODE_OBJECT:
				setEvent_code_object((String)newValue);
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
			case COSEMObjectsPackage.EVENT_CODE__EVENT_CODE_OBJECT:
				setEvent_code_object(EVENT_CODE_OBJECT_EDEFAULT);
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
			case COSEMObjectsPackage.EVENT_CODE__EVENT_CODE_OBJECT:
				return EVENT_CODE_OBJECT_EDEFAULT == null ? event_code_object != null : !EVENT_CODE_OBJECT_EDEFAULT.equals(event_code_object);
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
		result.append(" (event_code_object: ");
		result.append(event_code_object);
		result.append(')');
		return result.toString();
	}

} //EventCodeImpl
