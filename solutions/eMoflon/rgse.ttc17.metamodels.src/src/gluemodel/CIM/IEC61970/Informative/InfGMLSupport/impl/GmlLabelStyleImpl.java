/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle;
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
 * An implementation of the model object '<em><b>Gml Label Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl#getGmlFeatureStyle <em>Gml Feature Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl#getGmlGeometryStyles <em>Gml Geometry Styles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl#getGmlTopologyStyles <em>Gml Topology Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlLabelStyleImpl extends IdentifiedObjectImpl implements GmlLabelStyle {
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

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
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected String transform = TRANSFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelExpression = LABEL_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlGeometryStyles() <em>Gml Geometry Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlGeometryStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlGeometryStyle> gmlGeometryStyles;

	/**
	 * The cached value of the '{@link #getGmlTopologyStyles() <em>Gml Topology Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlTopologyStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlTopologyStyle> gmlTopologyStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlLabelStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_LABEL_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_STYLE__STYLE, oldStyle, style));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE, oldGmlFeatureStyle, gmlFeatureStyle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE, oldGmlFeatureStyle, newGmlFeatureStyle);
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
				msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES, GmlFeatureStyle.class, msgs);
			if (newGmlFeatureStyle != null)
				msgs = ((InternalEObject)newGmlFeatureStyle).eInverseAdd(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES, GmlFeatureStyle.class, msgs);
			msgs = basicSetGmlFeatureStyle(newGmlFeatureStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE, newGmlFeatureStyle, newGmlFeatureStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(String newTransform) {
		String oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_STYLE__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelExpression() {
		return labelExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelExpression(String newLabelExpression) {
		String oldLabelExpression = labelExpression;
		labelExpression = newLabelExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_STYLE__LABEL_EXPRESSION, oldLabelExpression, labelExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlGeometryStyle> getGmlGeometryStyles() {
		if (gmlGeometryStyles == null) {
			gmlGeometryStyles = new EObjectWithInverseResolvingEList<GmlGeometryStyle>(GmlGeometryStyle.class, this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE);
		}
		return gmlGeometryStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlTopologyStyle> getGmlTopologyStyles() {
		if (gmlTopologyStyles == null) {
			gmlTopologyStyles = new EObjectWithInverseResolvingEList<GmlTopologyStyle>(GmlTopologyStyle.class, this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES, InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE);
		}
		return gmlTopologyStyles;
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				if (gmlFeatureStyle != null)
					msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES, GmlFeatureStyle.class, msgs);
				return basicSetGmlFeatureStyle((GmlFeatureStyle)otherEnd, msgs);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlGeometryStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTopologyStyles()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				return basicSetGmlFeatureStyle(null, msgs);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				return ((InternalEList<?>)getGmlGeometryStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				return ((InternalEList<?>)getGmlTopologyStyles()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__STYLE:
				return getStyle();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				if (resolve) return getGmlFeatureStyle();
				return basicGetGmlFeatureStyle();
			case InfGMLSupportPackage.GML_LABEL_STYLE__TRANSFORM:
				return getTransform();
			case InfGMLSupportPackage.GML_LABEL_STYLE__LABEL_EXPRESSION:
				return getLabelExpression();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				return getGmlGeometryStyles();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				return getGmlTopologyStyles();
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__STYLE:
				setStyle((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__TRANSFORM:
				setTransform((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__LABEL_EXPRESSION:
				setLabelExpression((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				getGmlGeometryStyles().clear();
				getGmlGeometryStyles().addAll((Collection<? extends GmlGeometryStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				getGmlTopologyStyles().clear();
				getGmlTopologyStyles().addAll((Collection<? extends GmlTopologyStyle>)newValue);
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)null);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__TRANSFORM:
				setTransform(TRANSFORM_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__LABEL_EXPRESSION:
				setLabelExpression(LABEL_EXPRESSION_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				getGmlGeometryStyles().clear();
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				getGmlTopologyStyles().clear();
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				return gmlFeatureStyle != null;
			case InfGMLSupportPackage.GML_LABEL_STYLE__TRANSFORM:
				return TRANSFORM_EDEFAULT == null ? transform != null : !TRANSFORM_EDEFAULT.equals(transform);
			case InfGMLSupportPackage.GML_LABEL_STYLE__LABEL_EXPRESSION:
				return LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null : !LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				return gmlGeometryStyles != null && !gmlGeometryStyles.isEmpty();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				return gmlTopologyStyles != null && !gmlTopologyStyles.isEmpty();
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
		result.append(" (style: ");
		result.append(style);
		result.append(", transform: ");
		result.append(transform);
		result.append(", labelExpression: ");
		result.append(labelExpression);
		result.append(')');
		return result.toString();
	}

} //GmlLabelStyleImpl
