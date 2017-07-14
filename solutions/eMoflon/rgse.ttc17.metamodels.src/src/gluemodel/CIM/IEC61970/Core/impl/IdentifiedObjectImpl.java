/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfCore.InfCorePackage;
import gluemodel.CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identified Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl#getMRID <em>MRID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl#getPathName <em>Path Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl#getModelingAuthoritySet <em>Modeling Authority Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl#getAliasName <em>Alias Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiedObjectImpl extends ElementImpl implements IdentifiedObject {
	/**
	 * The default value of the '{@link #getMRID() <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRID()
	 * @generated
	 * @ordered
	 */
	protected static final String MRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMRID() <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRID()
	 * @generated
	 * @ordered
	 */
	protected String mRID = MRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathName()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathName()
	 * @generated
	 * @ordered
	 */
	protected String pathName = PATH_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelingAuthoritySet() <em>Modeling Authority Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAuthoritySet()
	 * @generated
	 * @ordered
	 */
	protected ModelingAuthoritySet modelingAuthoritySet;

	/**
	 * The default value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalName()
	 * @generated
	 * @ordered
	 */
	protected String localName = LOCAL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected String aliasName = ALIAS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IDENTIFIED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMRID() {
		return mRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMRID(String newMRID) {
		String oldMRID = mRID;
		mRID = newMRID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDENTIFIED_OBJECT__MRID, oldMRID, mRID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDENTIFIED_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDENTIFIED_OBJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathName() {
		return pathName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathName(String newPathName) {
		String oldPathName = pathName;
		pathName = newPathName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDENTIFIED_OBJECT__PATH_NAME, oldPathName, pathName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingAuthoritySet getModelingAuthoritySet() {
		if (modelingAuthoritySet != null && modelingAuthoritySet.eIsProxy()) {
			InternalEObject oldModelingAuthoritySet = (InternalEObject)modelingAuthoritySet;
			modelingAuthoritySet = (ModelingAuthoritySet)eResolveProxy(oldModelingAuthoritySet);
			if (modelingAuthoritySet != oldModelingAuthoritySet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET, oldModelingAuthoritySet, modelingAuthoritySet));
			}
		}
		return modelingAuthoritySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingAuthoritySet basicGetModelingAuthoritySet() {
		return modelingAuthoritySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelingAuthoritySet(ModelingAuthoritySet newModelingAuthoritySet, NotificationChain msgs) {
		ModelingAuthoritySet oldModelingAuthoritySet = modelingAuthoritySet;
		modelingAuthoritySet = newModelingAuthoritySet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET, oldModelingAuthoritySet, newModelingAuthoritySet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelingAuthoritySet(ModelingAuthoritySet newModelingAuthoritySet) {
		if (newModelingAuthoritySet != modelingAuthoritySet) {
			NotificationChain msgs = null;
			if (modelingAuthoritySet != null)
				msgs = ((InternalEObject)modelingAuthoritySet).eInverseRemove(this, InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS, ModelingAuthoritySet.class, msgs);
			if (newModelingAuthoritySet != null)
				msgs = ((InternalEObject)newModelingAuthoritySet).eInverseAdd(this, InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS, ModelingAuthoritySet.class, msgs);
			msgs = basicSetModelingAuthoritySet(newModelingAuthoritySet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET, newModelingAuthoritySet, newModelingAuthoritySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalName() {
		return localName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalName(String newLocalName) {
		String oldLocalName = localName;
		localName = newLocalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME, oldLocalName, localName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasName() {
		return aliasName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasName(String newAliasName) {
		String oldAliasName = aliasName;
		aliasName = newAliasName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME, oldAliasName, aliasName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				if (modelingAuthoritySet != null)
					msgs = ((InternalEObject)modelingAuthoritySet).eInverseRemove(this, InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS, ModelingAuthoritySet.class, msgs);
				return basicSetModelingAuthoritySet((ModelingAuthoritySet)otherEnd, msgs);
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
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				return basicSetModelingAuthoritySet(null, msgs);
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
			case CorePackage.IDENTIFIED_OBJECT__MRID:
				return getMRID();
			case CorePackage.IDENTIFIED_OBJECT__NAME:
				return getName();
			case CorePackage.IDENTIFIED_OBJECT__DESCRIPTION:
				return getDescription();
			case CorePackage.IDENTIFIED_OBJECT__PATH_NAME:
				return getPathName();
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				if (resolve) return getModelingAuthoritySet();
				return basicGetModelingAuthoritySet();
			case CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME:
				return getLocalName();
			case CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME:
				return getAliasName();
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
			case CorePackage.IDENTIFIED_OBJECT__MRID:
				setMRID((String)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__NAME:
				setName((String)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__PATH_NAME:
				setPathName((String)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				setModelingAuthoritySet((ModelingAuthoritySet)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME:
				setLocalName((String)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME:
				setAliasName((String)newValue);
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
			case CorePackage.IDENTIFIED_OBJECT__MRID:
				setMRID(MRID_EDEFAULT);
				return;
			case CorePackage.IDENTIFIED_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.IDENTIFIED_OBJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.IDENTIFIED_OBJECT__PATH_NAME:
				setPathName(PATH_NAME_EDEFAULT);
				return;
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				setModelingAuthoritySet((ModelingAuthoritySet)null);
				return;
			case CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME:
				setLocalName(LOCAL_NAME_EDEFAULT);
				return;
			case CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME:
				setAliasName(ALIAS_NAME_EDEFAULT);
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
			case CorePackage.IDENTIFIED_OBJECT__MRID:
				return MRID_EDEFAULT == null ? mRID != null : !MRID_EDEFAULT.equals(mRID);
			case CorePackage.IDENTIFIED_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.IDENTIFIED_OBJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.IDENTIFIED_OBJECT__PATH_NAME:
				return PATH_NAME_EDEFAULT == null ? pathName != null : !PATH_NAME_EDEFAULT.equals(pathName);
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				return modelingAuthoritySet != null;
			case CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME:
				return LOCAL_NAME_EDEFAULT == null ? localName != null : !LOCAL_NAME_EDEFAULT.equals(localName);
			case CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME:
				return ALIAS_NAME_EDEFAULT == null ? aliasName != null : !ALIAS_NAME_EDEFAULT.equals(aliasName);
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
		result.append(" (mRID: ");
		result.append(mRID);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", pathName: ");
		result.append(pathName);
		result.append(", localName: ");
		result.append(localName);
		result.append(", aliasName: ");
		result.append(aliasName);
		result.append(')');
		return result.toString();
	}

} //IdentifiedObjectImpl
