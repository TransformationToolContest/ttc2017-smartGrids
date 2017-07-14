/**
 */
package gluemodel.COSEM.COSEMObjects.impl;

import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;
import gluemodel.COSEM.COSEMObjects.StandardReadout;

import gluemodel.COSEM.InterfaceClasses.impl.ProfilegenericImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Readout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.StandardReadoutImpl#getGeneralLocalPortReadout <em>General Local Port Readout</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.StandardReadoutImpl#getGeneralDisplayReadout <em>General Display Readout</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.StandardReadoutImpl#getAlternateDisplayReadout <em>Alternate Display Readout</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.StandardReadoutImpl#getServiceDisplayReadout <em>Service Display Readout</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.StandardReadoutImpl#getListConfigMeterData <em>List Config Meter Data</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.StandardReadoutImpl#getAdditionalReadout <em>Additional Readout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardReadoutImpl extends ProfilegenericImpl implements StandardReadout {
	/**
	 * The default value of the '{@link #getGeneralLocalPortReadout() <em>General Local Port Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralLocalPortReadout()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERAL_LOCAL_PORT_READOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneralLocalPortReadout() <em>General Local Port Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralLocalPortReadout()
	 * @generated
	 * @ordered
	 */
	protected String generalLocalPortReadout = GENERAL_LOCAL_PORT_READOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneralDisplayReadout() <em>General Display Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralDisplayReadout()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERAL_DISPLAY_READOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneralDisplayReadout() <em>General Display Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralDisplayReadout()
	 * @generated
	 * @ordered
	 */
	protected String generalDisplayReadout = GENERAL_DISPLAY_READOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternateDisplayReadout() <em>Alternate Display Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateDisplayReadout()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATE_DISPLAY_READOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternateDisplayReadout() <em>Alternate Display Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateDisplayReadout()
	 * @generated
	 * @ordered
	 */
	protected String alternateDisplayReadout = ALTERNATE_DISPLAY_READOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDisplayReadout() <em>Service Display Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDisplayReadout()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DISPLAY_READOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDisplayReadout() <em>Service Display Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDisplayReadout()
	 * @generated
	 * @ordered
	 */
	protected String serviceDisplayReadout = SERVICE_DISPLAY_READOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getListConfigMeterData() <em>List Config Meter Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListConfigMeterData()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_CONFIG_METER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListConfigMeterData() <em>List Config Meter Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListConfigMeterData()
	 * @generated
	 * @ordered
	 */
	protected String listConfigMeterData = LIST_CONFIG_METER_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalReadout() <em>Additional Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalReadout()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_READOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalReadout() <em>Additional Readout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalReadout()
	 * @generated
	 * @ordered
	 */
	protected String additionalReadout = ADDITIONAL_READOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardReadoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getStandardReadout();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneralLocalPortReadout() {
		return generalLocalPortReadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralLocalPortReadout(String newGeneralLocalPortReadout) {
		String oldGeneralLocalPortReadout = generalLocalPortReadout;
		generalLocalPortReadout = newGeneralLocalPortReadout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.STANDARD_READOUT__GENERAL_LOCAL_PORT_READOUT, oldGeneralLocalPortReadout, generalLocalPortReadout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneralDisplayReadout() {
		return generalDisplayReadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralDisplayReadout(String newGeneralDisplayReadout) {
		String oldGeneralDisplayReadout = generalDisplayReadout;
		generalDisplayReadout = newGeneralDisplayReadout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.STANDARD_READOUT__GENERAL_DISPLAY_READOUT, oldGeneralDisplayReadout, generalDisplayReadout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternateDisplayReadout() {
		return alternateDisplayReadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternateDisplayReadout(String newAlternateDisplayReadout) {
		String oldAlternateDisplayReadout = alternateDisplayReadout;
		alternateDisplayReadout = newAlternateDisplayReadout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.STANDARD_READOUT__ALTERNATE_DISPLAY_READOUT, oldAlternateDisplayReadout, alternateDisplayReadout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDisplayReadout() {
		return serviceDisplayReadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDisplayReadout(String newServiceDisplayReadout) {
		String oldServiceDisplayReadout = serviceDisplayReadout;
		serviceDisplayReadout = newServiceDisplayReadout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.STANDARD_READOUT__SERVICE_DISPLAY_READOUT, oldServiceDisplayReadout, serviceDisplayReadout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListConfigMeterData() {
		return listConfigMeterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListConfigMeterData(String newListConfigMeterData) {
		String oldListConfigMeterData = listConfigMeterData;
		listConfigMeterData = newListConfigMeterData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.STANDARD_READOUT__LIST_CONFIG_METER_DATA, oldListConfigMeterData, listConfigMeterData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalReadout() {
		return additionalReadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalReadout(String newAdditionalReadout) {
		String oldAdditionalReadout = additionalReadout;
		additionalReadout = newAdditionalReadout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.STANDARD_READOUT__ADDITIONAL_READOUT, oldAdditionalReadout, additionalReadout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.STANDARD_READOUT__GENERAL_LOCAL_PORT_READOUT:
				return getGeneralLocalPortReadout();
			case COSEMObjectsPackage.STANDARD_READOUT__GENERAL_DISPLAY_READOUT:
				return getGeneralDisplayReadout();
			case COSEMObjectsPackage.STANDARD_READOUT__ALTERNATE_DISPLAY_READOUT:
				return getAlternateDisplayReadout();
			case COSEMObjectsPackage.STANDARD_READOUT__SERVICE_DISPLAY_READOUT:
				return getServiceDisplayReadout();
			case COSEMObjectsPackage.STANDARD_READOUT__LIST_CONFIG_METER_DATA:
				return getListConfigMeterData();
			case COSEMObjectsPackage.STANDARD_READOUT__ADDITIONAL_READOUT:
				return getAdditionalReadout();
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
			case COSEMObjectsPackage.STANDARD_READOUT__GENERAL_LOCAL_PORT_READOUT:
				setGeneralLocalPortReadout((String)newValue);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__GENERAL_DISPLAY_READOUT:
				setGeneralDisplayReadout((String)newValue);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__ALTERNATE_DISPLAY_READOUT:
				setAlternateDisplayReadout((String)newValue);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__SERVICE_DISPLAY_READOUT:
				setServiceDisplayReadout((String)newValue);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__LIST_CONFIG_METER_DATA:
				setListConfigMeterData((String)newValue);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__ADDITIONAL_READOUT:
				setAdditionalReadout((String)newValue);
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
			case COSEMObjectsPackage.STANDARD_READOUT__GENERAL_LOCAL_PORT_READOUT:
				setGeneralLocalPortReadout(GENERAL_LOCAL_PORT_READOUT_EDEFAULT);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__GENERAL_DISPLAY_READOUT:
				setGeneralDisplayReadout(GENERAL_DISPLAY_READOUT_EDEFAULT);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__ALTERNATE_DISPLAY_READOUT:
				setAlternateDisplayReadout(ALTERNATE_DISPLAY_READOUT_EDEFAULT);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__SERVICE_DISPLAY_READOUT:
				setServiceDisplayReadout(SERVICE_DISPLAY_READOUT_EDEFAULT);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__LIST_CONFIG_METER_DATA:
				setListConfigMeterData(LIST_CONFIG_METER_DATA_EDEFAULT);
				return;
			case COSEMObjectsPackage.STANDARD_READOUT__ADDITIONAL_READOUT:
				setAdditionalReadout(ADDITIONAL_READOUT_EDEFAULT);
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
			case COSEMObjectsPackage.STANDARD_READOUT__GENERAL_LOCAL_PORT_READOUT:
				return GENERAL_LOCAL_PORT_READOUT_EDEFAULT == null ? generalLocalPortReadout != null : !GENERAL_LOCAL_PORT_READOUT_EDEFAULT.equals(generalLocalPortReadout);
			case COSEMObjectsPackage.STANDARD_READOUT__GENERAL_DISPLAY_READOUT:
				return GENERAL_DISPLAY_READOUT_EDEFAULT == null ? generalDisplayReadout != null : !GENERAL_DISPLAY_READOUT_EDEFAULT.equals(generalDisplayReadout);
			case COSEMObjectsPackage.STANDARD_READOUT__ALTERNATE_DISPLAY_READOUT:
				return ALTERNATE_DISPLAY_READOUT_EDEFAULT == null ? alternateDisplayReadout != null : !ALTERNATE_DISPLAY_READOUT_EDEFAULT.equals(alternateDisplayReadout);
			case COSEMObjectsPackage.STANDARD_READOUT__SERVICE_DISPLAY_READOUT:
				return SERVICE_DISPLAY_READOUT_EDEFAULT == null ? serviceDisplayReadout != null : !SERVICE_DISPLAY_READOUT_EDEFAULT.equals(serviceDisplayReadout);
			case COSEMObjectsPackage.STANDARD_READOUT__LIST_CONFIG_METER_DATA:
				return LIST_CONFIG_METER_DATA_EDEFAULT == null ? listConfigMeterData != null : !LIST_CONFIG_METER_DATA_EDEFAULT.equals(listConfigMeterData);
			case COSEMObjectsPackage.STANDARD_READOUT__ADDITIONAL_READOUT:
				return ADDITIONAL_READOUT_EDEFAULT == null ? additionalReadout != null : !ADDITIONAL_READOUT_EDEFAULT.equals(additionalReadout);
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
		result.append(" (GeneralLocalPortReadout: ");
		result.append(generalLocalPortReadout);
		result.append(", GeneralDisplayReadout: ");
		result.append(generalDisplayReadout);
		result.append(", AlternateDisplayReadout: ");
		result.append(alternateDisplayReadout);
		result.append(", ServiceDisplayReadout: ");
		result.append(serviceDisplayReadout);
		result.append(", ListConfigMeterData: ");
		result.append(listConfigMeterData);
		result.append(", AdditionalReadout: ");
		result.append(additionalReadout);
		result.append(')');
		return result.toString();
	}

} //StandardReadoutImpl
