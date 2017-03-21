/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ConsumerMessage;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ConsumerMessageImpl#getConsumer_message_via_local_consumer_information_port <em>Consumer message via local consumer information port</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ConsumerMessageImpl#getConsumer_message_via_meter_display <em>Consumer message via meter display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumerMessageImpl extends DataImpl implements ConsumerMessage {
	/**
	 * The default value of the '{@link #getConsumer_message_via_local_consumer_information_port() <em>Consumer message via local consumer information port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer_message_via_local_consumer_information_port()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumer_message_via_local_consumer_information_port() <em>Consumer message via local consumer information port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer_message_via_local_consumer_information_port()
	 * @generated
	 * @ordered
	 */
	protected String consumer_message_via_local_consumer_information_port = CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumer_message_via_meter_display() <em>Consumer message via meter display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer_message_via_meter_display()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_MESSAGE_VIA_METER_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumer_message_via_meter_display() <em>Consumer message via meter display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer_message_via_meter_display()
	 * @generated
	 * @ordered
	 */
	protected String consumer_message_via_meter_display = CONSUMER_MESSAGE_VIA_METER_DISPLAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumerMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getConsumerMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumer_message_via_local_consumer_information_port() {
		return consumer_message_via_local_consumer_information_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer_message_via_local_consumer_information_port(String newConsumer_message_via_local_consumer_information_port) {
		String oldConsumer_message_via_local_consumer_information_port = consumer_message_via_local_consumer_information_port;
		consumer_message_via_local_consumer_information_port = newConsumer_message_via_local_consumer_information_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT, oldConsumer_message_via_local_consumer_information_port, consumer_message_via_local_consumer_information_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumer_message_via_meter_display() {
		return consumer_message_via_meter_display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer_message_via_meter_display(String newConsumer_message_via_meter_display) {
		String oldConsumer_message_via_meter_display = consumer_message_via_meter_display;
		consumer_message_via_meter_display = newConsumer_message_via_meter_display;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_METER_DISPLAY, oldConsumer_message_via_meter_display, consumer_message_via_meter_display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT:
				return getConsumer_message_via_local_consumer_information_port();
			case COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_METER_DISPLAY:
				return getConsumer_message_via_meter_display();
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
			case COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT:
				setConsumer_message_via_local_consumer_information_port((String)newValue);
				return;
			case COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_METER_DISPLAY:
				setConsumer_message_via_meter_display((String)newValue);
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
			case COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT:
				setConsumer_message_via_local_consumer_information_port(CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT_EDEFAULT);
				return;
			case COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_METER_DISPLAY:
				setConsumer_message_via_meter_display(CONSUMER_MESSAGE_VIA_METER_DISPLAY_EDEFAULT);
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
			case COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT:
				return CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT_EDEFAULT == null ? consumer_message_via_local_consumer_information_port != null : !CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT_EDEFAULT.equals(consumer_message_via_local_consumer_information_port);
			case COSEMObjectsPackage.CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_METER_DISPLAY:
				return CONSUMER_MESSAGE_VIA_METER_DISPLAY_EDEFAULT == null ? consumer_message_via_meter_display != null : !CONSUMER_MESSAGE_VIA_METER_DISPLAY_EDEFAULT.equals(consumer_message_via_meter_display);
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
		result.append(" (Consumer_message_via_local_consumer_information_port: ");
		result.append(consumer_message_via_local_consumer_information_port);
		result.append(", Consumer_message_via_meter_display: ");
		result.append(consumer_message_via_meter_display);
		result.append(')');
		return result.toString();
	}

} //ConsumerMessageImpl
