/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Geometry Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGeometryStyleImpl#getGmlLabelStyle <em>Gml Label Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGeometryStyleImpl#getGmlFeatureStyle <em>Gml Feature Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGeometryStyleImpl#getGeometryType <em>Geometry Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGeometryStyleImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGeometryStyleImpl#getGeometryProperty <em>Geometry Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlGeometryStyleImpl extends IdentifiedObjectImpl implements GmlGeometryStyle {
	/**
	 * The cached value of the '{@link #getGmlLabelStyle() <em>Gml Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLabelStyle()
	 * @generated
	 * @ordered
	 */
	protected GmlLabelStyle gmlLabelStyle;

	/**
	 * The cached value of the '{@link #getGmlFeatureStyle() <em>Gml Feature Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFeatureStyle()
	 * @generated
	 * @ordered
	 */
	protected GmlFeatureStyle gmlFeatureStyle;

	/**
	 * The default value of the '{@link #getGeometryType() <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryType()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometryType() <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryType()
	 * @generated
	 * @ordered
	 */
	protected String geometryType = GEOMETRY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeometryProperty() <em>Geometry Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometryProperty() <em>Geometry Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryProperty()
	 * @generated
	 * @ordered
	 */
	protected String geometryProperty = GEOMETRY_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlGeometryStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_GEOMETRY_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelStyle getGmlLabelStyle() {
		if (gmlLabelStyle != null && gmlLabelStyle.eIsProxy()) {
			InternalEObject oldGmlLabelStyle = (InternalEObject)gmlLabelStyle;
			gmlLabelStyle = (GmlLabelStyle)eResolveProxy(oldGmlLabelStyle);
			if (gmlLabelStyle != oldGmlLabelStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE, oldGmlLabelStyle, gmlLabelStyle));
			}
		}
		return gmlLabelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelStyle basicGetGmlLabelStyle() {
		return gmlLabelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlLabelStyle(GmlLabelStyle newGmlLabelStyle, NotificationChain msgs) {
		GmlLabelStyle oldGmlLabelStyle = gmlLabelStyle;
		gmlLabelStyle = newGmlLabelStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE, oldGmlLabelStyle, newGmlLabelStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlLabelStyle(GmlLabelStyle newGmlLabelStyle) {
		if (newGmlLabelStyle != gmlLabelStyle) {
			NotificationChain msgs = null;
			if (gmlLabelStyle != null)
				msgs = ((InternalEObject)gmlLabelStyle).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES, GmlLabelStyle.class, msgs);
			if (newGmlLabelStyle != null)
				msgs = ((InternalEObject)newGmlLabelStyle).eInverseAdd(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES, GmlLabelStyle.class, msgs);
			msgs = basicSetGmlLabelStyle(newGmlLabelStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE, newGmlLabelStyle, newGmlLabelStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFeatureStyle getGmlFeatureStyle() {
		if (gmlFeatureStyle != null && gmlFeatureStyle.eIsProxy()) {
			InternalEObject oldGmlFeatureStyle = (InternalEObject)gmlFeatureStyle;
			gmlFeatureStyle = (GmlFeatureStyle)eResolveProxy(oldGmlFeatureStyle);
			if (gmlFeatureStyle != oldGmlFeatureStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE, oldGmlFeatureStyle, gmlFeatureStyle));
			}
		}
		return gmlFeatureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFeatureStyle basicGetGmlFeatureStyle() {
		return gmlFeatureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlFeatureStyle(GmlFeatureStyle newGmlFeatureStyle, NotificationChain msgs) {
		GmlFeatureStyle oldGmlFeatureStyle = gmlFeatureStyle;
		gmlFeatureStyle = newGmlFeatureStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE, oldGmlFeatureStyle, newGmlFeatureStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlFeatureStyle(GmlFeatureStyle newGmlFeatureStyle) {
		if (newGmlFeatureStyle != gmlFeatureStyle) {
			NotificationChain msgs = null;
			if (gmlFeatureStyle != null)
				msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES, GmlFeatureStyle.class, msgs);
			if (newGmlFeatureStyle != null)
				msgs = ((InternalEObject)newGmlFeatureStyle).eInverseAdd(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES, GmlFeatureStyle.class, msgs);
			msgs = basicSetGmlFeatureStyle(newGmlFeatureStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE, newGmlFeatureStyle, newGmlFeatureStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometryType() {
		return geometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryType(String newGeometryType) {
		String oldGeometryType = geometryType;
		geometryType = newGeometryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_TYPE, oldGeometryType, geometryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GEOMETRY_STYLE__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometryProperty() {
		return geometryProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryProperty(String newGeometryProperty) {
		String oldGeometryProperty = geometryProperty;
		geometryProperty = newGeometryProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY, oldGeometryProperty, geometryProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				if (gmlLabelStyle != null)
					msgs = ((InternalEObject)gmlLabelStyle).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES, GmlLabelStyle.class, msgs);
				return basicSetGmlLabelStyle((GmlLabelStyle)otherEnd, msgs);
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				if (gmlFeatureStyle != null)
					msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES, GmlFeatureStyle.class, msgs);
				return basicSetGmlFeatureStyle((GmlFeatureStyle)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				return basicSetGmlLabelStyle(null, msgs);
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				return basicSetGmlFeatureStyle(null, msgs);
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				if (resolve) return getGmlLabelStyle();
				return basicGetGmlLabelStyle();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				if (resolve) return getGmlFeatureStyle();
				return basicGetGmlFeatureStyle();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_TYPE:
				return getGeometryType();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__SYMBOL:
				return getSymbol();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY:
				return getGeometryProperty();
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				setGmlLabelStyle((GmlLabelStyle)newValue);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)newValue);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_TYPE:
				setGeometryType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__SYMBOL:
				setSymbol((String)newValue);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY:
				setGeometryProperty((String)newValue);
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				setGmlLabelStyle((GmlLabelStyle)null);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)null);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_TYPE:
				setGeometryType(GEOMETRY_TYPE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY:
				setGeometryProperty(GEOMETRY_PROPERTY_EDEFAULT);
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				return gmlLabelStyle != null;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				return gmlFeatureStyle != null;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_TYPE:
				return GEOMETRY_TYPE_EDEFAULT == null ? geometryType != null : !GEOMETRY_TYPE_EDEFAULT.equals(geometryType);
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY:
				return GEOMETRY_PROPERTY_EDEFAULT == null ? geometryProperty != null : !GEOMETRY_PROPERTY_EDEFAULT.equals(geometryProperty);
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
		result.append(" (geometryType: ");
		result.append(geometryType);
		result.append(", symbol: ");
		result.append(symbol);
		result.append(", geometryProperty: ");
		result.append(geometryProperty);
		result.append(')');
		return result.toString();
	}

} //GmlGeometryStyleImpl
