/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

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
 * An implementation of the model object '<em><b>Gml Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSymbolImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSymbolImpl#getGmlFeatureStyles <em>Gml Feature Styles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSymbolImpl#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSymbolImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSymbolImpl#getGmlBaseSymbol <em>Gml Base Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlSymbolImpl extends IdentifiedObjectImpl implements GmlSymbol {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlFeatureStyles() <em>Gml Feature Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFeatureStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFeatureStyle> gmlFeatureStyles;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlBaseSymbol() <em>Gml Base Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlBaseSymbol()
	 * @generated
	 * @ordered
	 */
	protected GmlBaseSymbol gmlBaseSymbol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_SYMBOL__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlFeatureStyle> getGmlFeatureStyles() {
		if (gmlFeatureStyles == null) {
			gmlFeatureStyles = new EObjectWithInverseResolvingEList.ManyInverse<GmlFeatureStyle>(GmlFeatureStyle.class, this, InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS);
		}
		return gmlFeatureStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_SYMBOL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_SYMBOL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlBaseSymbol getGmlBaseSymbol() {
		if (gmlBaseSymbol != null && gmlBaseSymbol.eIsProxy()) {
			InternalEObject oldGmlBaseSymbol = (InternalEObject)gmlBaseSymbol;
			gmlBaseSymbol = (GmlBaseSymbol)eResolveProxy(oldGmlBaseSymbol);
			if (gmlBaseSymbol != oldGmlBaseSymbol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL, oldGmlBaseSymbol, gmlBaseSymbol));
			}
		}
		return gmlBaseSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlBaseSymbol basicGetGmlBaseSymbol() {
		return gmlBaseSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlBaseSymbol(GmlBaseSymbol newGmlBaseSymbol, NotificationChain msgs) {
		GmlBaseSymbol oldGmlBaseSymbol = gmlBaseSymbol;
		gmlBaseSymbol = newGmlBaseSymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL, oldGmlBaseSymbol, newGmlBaseSymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlBaseSymbol(GmlBaseSymbol newGmlBaseSymbol) {
		if (newGmlBaseSymbol != gmlBaseSymbol) {
			NotificationChain msgs = null;
			if (gmlBaseSymbol != null)
				msgs = ((InternalEObject)gmlBaseSymbol).eInverseRemove(this, InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS, GmlBaseSymbol.class, msgs);
			if (newGmlBaseSymbol != null)
				msgs = ((InternalEObject)newGmlBaseSymbol).eInverseAdd(this, InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS, GmlBaseSymbol.class, msgs);
			msgs = basicSetGmlBaseSymbol(newGmlBaseSymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL, newGmlBaseSymbol, newGmlBaseSymbol));
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
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFeatureStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				if (gmlBaseSymbol != null)
					msgs = ((InternalEObject)gmlBaseSymbol).eInverseRemove(this, InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS, GmlBaseSymbol.class, msgs);
				return basicSetGmlBaseSymbol((GmlBaseSymbol)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				return ((InternalEList<?>)getGmlFeatureStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				return basicSetGmlBaseSymbol(null, msgs);
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
			case InfGMLSupportPackage.GML_SYMBOL__LEVEL:
				return getLevel();
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				return getGmlFeatureStyles();
			case InfGMLSupportPackage.GML_SYMBOL__TYPE:
				return getType();
			case InfGMLSupportPackage.GML_SYMBOL__VERSION:
				return getVersion();
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				if (resolve) return getGmlBaseSymbol();
				return basicGetGmlBaseSymbol();
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
			case InfGMLSupportPackage.GML_SYMBOL__LEVEL:
				setLevel((String)newValue);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				getGmlFeatureStyles().clear();
				getGmlFeatureStyles().addAll((Collection<? extends GmlFeatureStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__TYPE:
				setType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__VERSION:
				setVersion((String)newValue);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				setGmlBaseSymbol((GmlBaseSymbol)newValue);
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
			case InfGMLSupportPackage.GML_SYMBOL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				getGmlFeatureStyles().clear();
				return;
			case InfGMLSupportPackage.GML_SYMBOL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				setGmlBaseSymbol((GmlBaseSymbol)null);
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
			case InfGMLSupportPackage.GML_SYMBOL__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				return gmlFeatureStyles != null && !gmlFeatureStyles.isEmpty();
			case InfGMLSupportPackage.GML_SYMBOL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case InfGMLSupportPackage.GML_SYMBOL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				return gmlBaseSymbol != null;
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
		result.append(" (level: ");
		result.append(level);
		result.append(", type: ");
		result.append(type);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //GmlSymbolImpl
