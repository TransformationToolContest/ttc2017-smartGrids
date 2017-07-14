/**
 */
package gluemodel.COSEM.InterfaceClasses.impl;

import gluemodel.COSEM.InterfaceClasses.Compactdata;
import gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compactdata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.CompactdataImpl#getCompact_buffer <em>Compact buffer</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.CompactdataImpl#getTemplate_id <em>Template id</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.CompactdataImpl#getTemplate_description <em>Template description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompactdataImpl extends BaseImpl implements Compactdata {
	/**
	 * The default value of the '{@link #getCompact_buffer() <em>Compact buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompact_buffer()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPACT_BUFFER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompact_buffer() <em>Compact buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompact_buffer()
	 * @generated
	 * @ordered
	 */
	protected String compact_buffer = COMPACT_BUFFER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplate_id() <em>Template id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplate_id() <em>Template id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate_id()
	 * @generated
	 * @ordered
	 */
	protected String template_id = TEMPLATE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplate_description() <em>Template description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate_description()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplate_description() <em>Template description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate_description()
	 * @generated
	 * @ordered
	 */
	protected String template_description = TEMPLATE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompactdataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceClassesPackage.Literals.COMPACTDATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompact_buffer() {
		return compact_buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompact_buffer(String newCompact_buffer) {
		String oldCompact_buffer = compact_buffer;
		compact_buffer = newCompact_buffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.COMPACTDATA__COMPACT_BUFFER, oldCompact_buffer, compact_buffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplate_id() {
		return template_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate_id(String newTemplate_id) {
		String oldTemplate_id = template_id;
		template_id = newTemplate_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.COMPACTDATA__TEMPLATE_ID, oldTemplate_id, template_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplate_description() {
		return template_description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate_description(String newTemplate_description) {
		String oldTemplate_description = template_description;
		template_description = newTemplate_description;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.COMPACTDATA__TEMPLATE_DESCRIPTION, oldTemplate_description, template_description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterfaceClassesPackage.COMPACTDATA__COMPACT_BUFFER:
				return getCompact_buffer();
			case InterfaceClassesPackage.COMPACTDATA__TEMPLATE_ID:
				return getTemplate_id();
			case InterfaceClassesPackage.COMPACTDATA__TEMPLATE_DESCRIPTION:
				return getTemplate_description();
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
			case InterfaceClassesPackage.COMPACTDATA__COMPACT_BUFFER:
				setCompact_buffer((String)newValue);
				return;
			case InterfaceClassesPackage.COMPACTDATA__TEMPLATE_ID:
				setTemplate_id((String)newValue);
				return;
			case InterfaceClassesPackage.COMPACTDATA__TEMPLATE_DESCRIPTION:
				setTemplate_description((String)newValue);
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
			case InterfaceClassesPackage.COMPACTDATA__COMPACT_BUFFER:
				setCompact_buffer(COMPACT_BUFFER_EDEFAULT);
				return;
			case InterfaceClassesPackage.COMPACTDATA__TEMPLATE_ID:
				setTemplate_id(TEMPLATE_ID_EDEFAULT);
				return;
			case InterfaceClassesPackage.COMPACTDATA__TEMPLATE_DESCRIPTION:
				setTemplate_description(TEMPLATE_DESCRIPTION_EDEFAULT);
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
			case InterfaceClassesPackage.COMPACTDATA__COMPACT_BUFFER:
				return COMPACT_BUFFER_EDEFAULT == null ? compact_buffer != null : !COMPACT_BUFFER_EDEFAULT.equals(compact_buffer);
			case InterfaceClassesPackage.COMPACTDATA__TEMPLATE_ID:
				return TEMPLATE_ID_EDEFAULT == null ? template_id != null : !TEMPLATE_ID_EDEFAULT.equals(template_id);
			case InterfaceClassesPackage.COMPACTDATA__TEMPLATE_DESCRIPTION:
				return TEMPLATE_DESCRIPTION_EDEFAULT == null ? template_description != null : !TEMPLATE_DESCRIPTION_EDEFAULT.equals(template_description);
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
		result.append(" (compact_buffer: ");
		result.append(compact_buffer);
		result.append(", template_id: ");
		result.append(template_id);
		result.append(", template_description: ");
		result.append(template_description);
		result.append(')');
		return result.toString();
	}

} //CompactdataImpl
