/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlColour;
import CIM.IEC61970.Informative.InfGMLSupport.GmlFont;
import CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter;
import CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol;
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
 * An implementation of the model object '<em><b>Gml Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl#isAbsoluteSize <em>Absolute Size</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl#getGmlColour <em>Gml Colour</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl#getSize <em>Size</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl#getGmlSvgParameters <em>Gml Svg Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlFontImpl extends IdentifiedObjectImpl implements GmlFont {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlTextSymbols() <em>Gml Text Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlTextSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlTextSymbol> gmlTextSymbols;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

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
	 * The default value of the '{@link #isAbsoluteSize() <em>Absolute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsoluteSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSOLUTE_SIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbsoluteSize() <em>Absolute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsoluteSize()
	 * @generated
	 * @ordered
	 */
	protected boolean absoluteSize = ABSOLUTE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlColour() <em>Gml Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlColour()
	 * @generated
	 * @ordered
	 */
	protected GmlColour gmlColour;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlSvgParameters() <em>Gml Svg Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSvgParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlSvgParameter> gmlSvgParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlFontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_FONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(String newWeight) {
		String oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FONT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlTextSymbol> getGmlTextSymbols() {
		if (gmlTextSymbols == null) {
			gmlTextSymbols = new EObjectWithInverseResolvingEList<GmlTextSymbol>(GmlTextSymbol.class, this, InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT);
		}
		return gmlTextSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FONT__FAMILY, oldFamily, family));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FONT__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbsoluteSize() {
		return absoluteSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteSize(boolean newAbsoluteSize) {
		boolean oldAbsoluteSize = absoluteSize;
		absoluteSize = newAbsoluteSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FONT__ABSOLUTE_SIZE, oldAbsoluteSize, absoluteSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlColour getGmlColour() {
		if (gmlColour != null && gmlColour.eIsProxy()) {
			InternalEObject oldGmlColour = (InternalEObject)gmlColour;
			gmlColour = (GmlColour)eResolveProxy(oldGmlColour);
			if (gmlColour != oldGmlColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_FONT__GML_COLOUR, oldGmlColour, gmlColour));
			}
		}
		return gmlColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlColour basicGetGmlColour() {
		return gmlColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlColour(GmlColour newGmlColour, NotificationChain msgs) {
		GmlColour oldGmlColour = gmlColour;
		gmlColour = newGmlColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FONT__GML_COLOUR, oldGmlColour, newGmlColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlColour(GmlColour newGmlColour) {
		if (newGmlColour != gmlColour) {
			NotificationChain msgs = null;
			if (gmlColour != null)
				msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_FONTS, GmlColour.class, msgs);
			if (newGmlColour != null)
				msgs = ((InternalEObject)newGmlColour).eInverseAdd(this, InfGMLSupportPackage.GML_COLOUR__GML_FONTS, GmlColour.class, msgs);
			msgs = basicSetGmlColour(newGmlColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FONT__GML_COLOUR, newGmlColour, newGmlColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FONT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlSvgParameter> getGmlSvgParameters() {
		if (gmlSvgParameters == null) {
			gmlSvgParameters = new EObjectWithInverseResolvingEList.ManyInverse<GmlSvgParameter>(GmlSvgParameter.class, this, InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS, InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS);
		}
		return gmlSvgParameters;
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
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTextSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				if (gmlColour != null)
					msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_FONTS, GmlColour.class, msgs);
				return basicSetGmlColour((GmlColour)otherEnd, msgs);
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSvgParameters()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				return ((InternalEList<?>)getGmlTextSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				return basicSetGmlColour(null, msgs);
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				return ((InternalEList<?>)getGmlSvgParameters()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FONT__WEIGHT:
				return getWeight();
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				return getGmlTextSymbols();
			case InfGMLSupportPackage.GML_FONT__FAMILY:
				return getFamily();
			case InfGMLSupportPackage.GML_FONT__STYLE:
				return getStyle();
			case InfGMLSupportPackage.GML_FONT__ABSOLUTE_SIZE:
				return isAbsoluteSize();
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				if (resolve) return getGmlColour();
				return basicGetGmlColour();
			case InfGMLSupportPackage.GML_FONT__SIZE:
				return getSize();
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				return getGmlSvgParameters();
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
			case InfGMLSupportPackage.GML_FONT__WEIGHT:
				setWeight((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				getGmlTextSymbols().addAll((Collection<? extends GmlTextSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__FAMILY:
				setFamily((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__STYLE:
				setStyle((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__ABSOLUTE_SIZE:
				setAbsoluteSize((Boolean)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				setGmlColour((GmlColour)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__SIZE:
				setSize((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				getGmlSvgParameters().addAll((Collection<? extends GmlSvgParameter>)newValue);
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
			case InfGMLSupportPackage.GML_FONT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_FONT__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FONT__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FONT__ABSOLUTE_SIZE:
				setAbsoluteSize(ABSOLUTE_SIZE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				setGmlColour((GmlColour)null);
				return;
			case InfGMLSupportPackage.GML_FONT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
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
			case InfGMLSupportPackage.GML_FONT__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				return gmlTextSymbols != null && !gmlTextSymbols.isEmpty();
			case InfGMLSupportPackage.GML_FONT__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case InfGMLSupportPackage.GML_FONT__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case InfGMLSupportPackage.GML_FONT__ABSOLUTE_SIZE:
				return absoluteSize != ABSOLUTE_SIZE_EDEFAULT;
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				return gmlColour != null;
			case InfGMLSupportPackage.GML_FONT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				return gmlSvgParameters != null && !gmlSvgParameters.isEmpty();
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(", family: ");
		result.append(family);
		result.append(", style: ");
		result.append(style);
		result.append(", absoluteSize: ");
		result.append(absoluteSize);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //GmlFontImpl
