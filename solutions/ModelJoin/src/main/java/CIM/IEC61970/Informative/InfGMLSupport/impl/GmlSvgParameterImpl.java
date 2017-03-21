/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlFill;
import CIM.IEC61970.Informative.InfGMLSupport.GmlFont;
import CIM.IEC61970.Informative.InfGMLSupport.GmlStroke;
import CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

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
 * An implementation of the model object '<em><b>Gml Svg Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSvgParameterImpl#getGmlStokes <em>Gml Stokes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSvgParameterImpl#getGmlFills <em>Gml Fills</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSvgParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSvgParameterImpl#getGmlFonts <em>Gml Fonts</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSvgParameterImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlSvgParameterImpl extends IdentifiedObjectImpl implements GmlSvgParameter {
	/**
	 * The cached value of the '{@link #getGmlStokes() <em>Gml Stokes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlStokes()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlStroke> gmlStokes;

	/**
	 * The cached value of the '{@link #getGmlFills() <em>Gml Fills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFills()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFill> gmlFills;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlFonts() <em>Gml Fonts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFonts()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFont> gmlFonts;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlSvgParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_SVG_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlStroke> getGmlStokes() {
		if (gmlStokes == null) {
			gmlStokes = new EObjectWithInverseResolvingEList.ManyInverse<GmlStroke>(GmlStroke.class, this, InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES, InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS);
		}
		return gmlStokes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlFill> getGmlFills() {
		if (gmlFills == null) {
			gmlFills = new EObjectWithInverseResolvingEList.ManyInverse<GmlFill>(GmlFill.class, this, InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS, InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS);
		}
		return gmlFills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_SVG_PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlFont> getGmlFonts() {
		if (gmlFonts == null) {
			gmlFonts = new EObjectWithInverseResolvingEList.ManyInverse<GmlFont>(GmlFont.class, this, InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS, InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS);
		}
		return gmlFonts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_SVG_PARAMETER__ATTRIBUTE, oldAttribute, attribute));
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlStokes()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFills()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFonts()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				return ((InternalEList<?>)getGmlStokes()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				return ((InternalEList<?>)getGmlFills()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				return ((InternalEList<?>)getGmlFonts()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				return getGmlStokes();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				return getGmlFills();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__VALUE:
				return getValue();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				return getGmlFonts();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__ATTRIBUTE:
				return getAttribute();
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				getGmlStokes().clear();
				getGmlStokes().addAll((Collection<? extends GmlStroke>)newValue);
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				getGmlFills().clear();
				getGmlFills().addAll((Collection<? extends GmlFill>)newValue);
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__VALUE:
				setValue((String)newValue);
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				getGmlFonts().clear();
				getGmlFonts().addAll((Collection<? extends GmlFont>)newValue);
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__ATTRIBUTE:
				setAttribute((String)newValue);
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				getGmlStokes().clear();
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				getGmlFills().clear();
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				getGmlFonts().clear();
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				return gmlStokes != null && !gmlStokes.isEmpty();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				return gmlFills != null && !gmlFills.isEmpty();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				return gmlFonts != null && !gmlFonts.isEmpty();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(')');
		return result.toString();
	}

} //GmlSvgParameterImpl
