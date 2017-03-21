/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle;
import CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle;
import CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Topology Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTopologyStyleImpl#getGmlLableStyle <em>Gml Lable Style</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTopologyStyleImpl#getGmlFeatureStyle <em>Gml Feature Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlTopologyStyleImpl extends IdentifiedObjectImpl implements GmlTopologyStyle {
	/**
	 * The cached value of the '{@link #getGmlLableStyle() <em>Gml Lable Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLableStyle()
	 * @generated
	 * @ordered
	 */
	protected GmlLabelStyle gmlLableStyle;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlTopologyStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_TOPOLOGY_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelStyle getGmlLableStyle() {
		if (gmlLableStyle != null && gmlLableStyle.eIsProxy()) {
			InternalEObject oldGmlLableStyle = (InternalEObject)gmlLableStyle;
			gmlLableStyle = (GmlLabelStyle)eResolveProxy(oldGmlLableStyle);
			if (gmlLableStyle != oldGmlLableStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE, oldGmlLableStyle, gmlLableStyle));
			}
		}
		return gmlLableStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelStyle basicGetGmlLableStyle() {
		return gmlLableStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlLableStyle(GmlLabelStyle newGmlLableStyle, NotificationChain msgs) {
		GmlLabelStyle oldGmlLableStyle = gmlLableStyle;
		gmlLableStyle = newGmlLableStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE, oldGmlLableStyle, newGmlLableStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlLableStyle(GmlLabelStyle newGmlLableStyle) {
		if (newGmlLableStyle != gmlLableStyle) {
			NotificationChain msgs = null;
			if (gmlLableStyle != null)
				msgs = ((InternalEObject)gmlLableStyle).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES, GmlLabelStyle.class, msgs);
			if (newGmlLableStyle != null)
				msgs = ((InternalEObject)newGmlLableStyle).eInverseAdd(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES, GmlLabelStyle.class, msgs);
			msgs = basicSetGmlLableStyle(newGmlLableStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE, newGmlLableStyle, newGmlLableStyle));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE, oldGmlFeatureStyle, gmlFeatureStyle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE, oldGmlFeatureStyle, newGmlFeatureStyle);
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
				msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES, GmlFeatureStyle.class, msgs);
			if (newGmlFeatureStyle != null)
				msgs = ((InternalEObject)newGmlFeatureStyle).eInverseAdd(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES, GmlFeatureStyle.class, msgs);
			msgs = basicSetGmlFeatureStyle(newGmlFeatureStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE, newGmlFeatureStyle, newGmlFeatureStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				if (gmlLableStyle != null)
					msgs = ((InternalEObject)gmlLableStyle).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES, GmlLabelStyle.class, msgs);
				return basicSetGmlLableStyle((GmlLabelStyle)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				if (gmlFeatureStyle != null)
					msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES, GmlFeatureStyle.class, msgs);
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				return basicSetGmlLableStyle(null, msgs);
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				if (resolve) return getGmlLableStyle();
				return basicGetGmlLableStyle();
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				if (resolve) return getGmlFeatureStyle();
				return basicGetGmlFeatureStyle();
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				setGmlLableStyle((GmlLabelStyle)newValue);
				return;
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)newValue);
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				setGmlLableStyle((GmlLabelStyle)null);
				return;
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)null);
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				return gmlLableStyle != null;
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				return gmlFeatureStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //GmlTopologyStyleImpl
