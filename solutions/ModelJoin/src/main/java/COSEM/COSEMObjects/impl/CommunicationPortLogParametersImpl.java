/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.CommunicationPortLogParameters;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Port Log Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.CommunicationPortLogParametersImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.CommunicationPortLogParametersImpl#getNumber_connections <em>Number connections</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.CommunicationPortLogParametersImpl#getCommunication_port_parameter <em>Communication port parameter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.CommunicationPortLogParametersImpl#getGSM_field_strength <em>GSM field strength</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.CommunicationPortLogParametersImpl#getCommunicationaddress <em>Communicationaddress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationPortLogParametersImpl extends DataImpl implements CommunicationPortLogParameters {
	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected String reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber_connections() <em>Number connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_connections()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber_connections() <em>Number connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_connections()
	 * @generated
	 * @ordered
	 */
	protected String number_connections = NUMBER_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunication_port_parameter() <em>Communication port parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_port_parameter()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_PORT_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunication_port_parameter() <em>Communication port parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_port_parameter()
	 * @generated
	 * @ordered
	 */
	protected String communication_port_parameter = COMMUNICATION_PORT_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGSM_field_strength() <em>GSM field strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSM_field_strength()
	 * @generated
	 * @ordered
	 */
	protected static final String GSM_FIELD_STRENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGSM_field_strength() <em>GSM field strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSM_field_strength()
	 * @generated
	 * @ordered
	 */
	protected String gsM_field_strength = GSM_FIELD_STRENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationaddress() <em>Communicationaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationaddress()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATIONADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationaddress() <em>Communicationaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationaddress()
	 * @generated
	 * @ordered
	 */
	protected String communicationaddress = COMMUNICATIONADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationPortLogParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getCommunicationPortLogParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(String newReserved) {
		String oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber_connections() {
		return number_connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_connections(String newNumber_connections) {
		String oldNumber_connections = number_connections;
		number_connections = newNumber_connections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__NUMBER_CONNECTIONS, oldNumber_connections, number_connections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommunication_port_parameter() {
		return communication_port_parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication_port_parameter(String newCommunication_port_parameter) {
		String oldCommunication_port_parameter = communication_port_parameter;
		communication_port_parameter = newCommunication_port_parameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATION_PORT_PARAMETER, oldCommunication_port_parameter, communication_port_parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGSM_field_strength() {
		return gsM_field_strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGSM_field_strength(String newGSM_field_strength) {
		String oldGSM_field_strength = gsM_field_strength;
		gsM_field_strength = newGSM_field_strength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__GSM_FIELD_STRENGTH, oldGSM_field_strength, gsM_field_strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommunicationaddress() {
		return communicationaddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationaddress(String newCommunicationaddress) {
		String oldCommunicationaddress = communicationaddress;
		communicationaddress = newCommunicationaddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATIONADDRESS, oldCommunicationaddress, communicationaddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__RESERVED:
				return getReserved();
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__NUMBER_CONNECTIONS:
				return getNumber_connections();
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATION_PORT_PARAMETER:
				return getCommunication_port_parameter();
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__GSM_FIELD_STRENGTH:
				return getGSM_field_strength();
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATIONADDRESS:
				return getCommunicationaddress();
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
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__RESERVED:
				setReserved((String)newValue);
				return;
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__NUMBER_CONNECTIONS:
				setNumber_connections((String)newValue);
				return;
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATION_PORT_PARAMETER:
				setCommunication_port_parameter((String)newValue);
				return;
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__GSM_FIELD_STRENGTH:
				setGSM_field_strength((String)newValue);
				return;
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATIONADDRESS:
				setCommunicationaddress((String)newValue);
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
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__NUMBER_CONNECTIONS:
				setNumber_connections(NUMBER_CONNECTIONS_EDEFAULT);
				return;
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATION_PORT_PARAMETER:
				setCommunication_port_parameter(COMMUNICATION_PORT_PARAMETER_EDEFAULT);
				return;
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__GSM_FIELD_STRENGTH:
				setGSM_field_strength(GSM_FIELD_STRENGTH_EDEFAULT);
				return;
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATIONADDRESS:
				setCommunicationaddress(COMMUNICATIONADDRESS_EDEFAULT);
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
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__NUMBER_CONNECTIONS:
				return NUMBER_CONNECTIONS_EDEFAULT == null ? number_connections != null : !NUMBER_CONNECTIONS_EDEFAULT.equals(number_connections);
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATION_PORT_PARAMETER:
				return COMMUNICATION_PORT_PARAMETER_EDEFAULT == null ? communication_port_parameter != null : !COMMUNICATION_PORT_PARAMETER_EDEFAULT.equals(communication_port_parameter);
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__GSM_FIELD_STRENGTH:
				return GSM_FIELD_STRENGTH_EDEFAULT == null ? gsM_field_strength != null : !GSM_FIELD_STRENGTH_EDEFAULT.equals(gsM_field_strength);
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATIONADDRESS:
				return COMMUNICATIONADDRESS_EDEFAULT == null ? communicationaddress != null : !COMMUNICATIONADDRESS_EDEFAULT.equals(communicationaddress);
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
		result.append(" (Reserved: ");
		result.append(reserved);
		result.append(", Number_connections: ");
		result.append(number_connections);
		result.append(", Communication_port_parameter: ");
		result.append(communication_port_parameter);
		result.append(", GSM_field_strength: ");
		result.append(gsM_field_strength);
		result.append(", Communicationaddress: ");
		result.append(communicationaddress);
		result.append(')');
		return result.toString();
	}

} //CommunicationPortLogParametersImpl
