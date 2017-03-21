/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlColour;
import CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol;
import CIM.IEC61970.Informative.InfGMLSupport.GmlMark;
import CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol;
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
 * An implementation of the model object '<em><b>Gml Stroke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getLineCap <em>Line Cap</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getGmlColour <em>Gml Colour</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getGmlSvgParameters <em>Gml Svg Parameters</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getGmlLineSymbols <em>Gml Line Symbols</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getDashArray <em>Dash Array</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getDashOffset <em>Dash Offset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getGmlMarks <em>Gml Marks</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl#getLinejoin <em>Linejoin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlStrokeImpl extends IdentifiedObjectImpl implements GmlStroke {
	/**
	 * The default value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCap()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_CAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCap()
	 * @generated
	 * @ordered
	 */
	protected String lineCap = LINE_CAP_EDEFAULT;

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
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final float OPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected float opacity = OPACITY_EDEFAULT;

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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlPolygonSymbols() <em>Gml Polygon Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlPolygonSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlPolygonSymbol> gmlPolygonSymbols;

	/**
	 * The cached value of the '{@link #getGmlLineSymbols() <em>Gml Line Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLineSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlLineSymbol> gmlLineSymbols;

	/**
	 * The default value of the '{@link #getDashArray() <em>Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashArray()
	 * @generated
	 * @ordered
	 */
	protected static final String DASH_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDashArray() <em>Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashArray()
	 * @generated
	 * @ordered
	 */
	protected String dashArray = DASH_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected String lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDashOffset() <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String DASH_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDashOffset() <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashOffset()
	 * @generated
	 * @ordered
	 */
	protected String dashOffset = DASH_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlMarks() <em>Gml Marks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlMarks()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlMark> gmlMarks;

	/**
	 * The default value of the '{@link #getLinejoin() <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinejoin()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEJOIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinejoin() <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinejoin()
	 * @generated
	 * @ordered
	 */
	protected String linejoin = LINEJOIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlStrokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_STROKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineCap() {
		return lineCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineCap(String newLineCap) {
		String oldLineCap = lineCap;
		lineCap = newLineCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_STROKE__LINE_CAP, oldLineCap, lineCap));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_STROKE__GML_COLOUR, oldGmlColour, gmlColour));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_STROKE__GML_COLOUR, oldGmlColour, newGmlColour);
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
				msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_STROKES, GmlColour.class, msgs);
			if (newGmlColour != null)
				msgs = ((InternalEObject)newGmlColour).eInverseAdd(this, InfGMLSupportPackage.GML_COLOUR__GML_STROKES, GmlColour.class, msgs);
			msgs = basicSetGmlColour(newGmlColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_STROKE__GML_COLOUR, newGmlColour, newGmlColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(float newOpacity) {
		float oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_STROKE__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlSvgParameter> getGmlSvgParameters() {
		if (gmlSvgParameters == null) {
			gmlSvgParameters = new EObjectWithInverseResolvingEList.ManyInverse<GmlSvgParameter>(GmlSvgParameter.class, this, InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS, InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES);
		}
		return gmlSvgParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_STROKE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlPolygonSymbol> getGmlPolygonSymbols() {
		if (gmlPolygonSymbols == null) {
			gmlPolygonSymbols = new EObjectWithInverseResolvingEList<GmlPolygonSymbol>(GmlPolygonSymbol.class, this, InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS, InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_STROKE);
		}
		return gmlPolygonSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlLineSymbol> getGmlLineSymbols() {
		if (gmlLineSymbols == null) {
			gmlLineSymbols = new EObjectWithInverseResolvingEList<GmlLineSymbol>(GmlLineSymbol.class, this, InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS, InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE);
		}
		return gmlLineSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDashArray() {
		return dashArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDashArray(String newDashArray) {
		String oldDashArray = dashArray;
		dashArray = newDashArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_STROKE__DASH_ARRAY, oldDashArray, dashArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(String newLineStyle) {
		String oldLineStyle = lineStyle;
		lineStyle = newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_STROKE__LINE_STYLE, oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDashOffset() {
		return dashOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDashOffset(String newDashOffset) {
		String oldDashOffset = dashOffset;
		dashOffset = newDashOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_STROKE__DASH_OFFSET, oldDashOffset, dashOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlMark> getGmlMarks() {
		if (gmlMarks == null) {
			gmlMarks = new EObjectWithInverseResolvingEList.ManyInverse<GmlMark>(GmlMark.class, this, InfGMLSupportPackage.GML_STROKE__GML_MARKS, InfGMLSupportPackage.GML_MARK__GML_STROKES);
		}
		return gmlMarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinejoin() {
		return linejoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinejoin(String newLinejoin) {
		String oldLinejoin = linejoin;
		linejoin = newLinejoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_STROKE__LINEJOIN, oldLinejoin, linejoin));
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
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				if (gmlColour != null)
					msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_STROKES, GmlColour.class, msgs);
				return basicSetGmlColour((GmlColour)otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSvgParameters()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPolygonSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlLineSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlMarks()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				return basicSetGmlColour(null, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				return ((InternalEList<?>)getGmlSvgParameters()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				return ((InternalEList<?>)getGmlPolygonSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				return ((InternalEList<?>)getGmlLineSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				return ((InternalEList<?>)getGmlMarks()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_STROKE__LINE_CAP:
				return getLineCap();
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				if (resolve) return getGmlColour();
				return basicGetGmlColour();
			case InfGMLSupportPackage.GML_STROKE__OPACITY:
				return getOpacity();
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				return getGmlSvgParameters();
			case InfGMLSupportPackage.GML_STROKE__WIDTH:
				return getWidth();
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				return getGmlPolygonSymbols();
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				return getGmlLineSymbols();
			case InfGMLSupportPackage.GML_STROKE__DASH_ARRAY:
				return getDashArray();
			case InfGMLSupportPackage.GML_STROKE__LINE_STYLE:
				return getLineStyle();
			case InfGMLSupportPackage.GML_STROKE__DASH_OFFSET:
				return getDashOffset();
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				return getGmlMarks();
			case InfGMLSupportPackage.GML_STROKE__LINEJOIN:
				return getLinejoin();
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
			case InfGMLSupportPackage.GML_STROKE__LINE_CAP:
				setLineCap((String)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				setGmlColour((GmlColour)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__OPACITY:
				setOpacity((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				getGmlSvgParameters().addAll((Collection<? extends GmlSvgParameter>)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__WIDTH:
				setWidth((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				getGmlPolygonSymbols().addAll((Collection<? extends GmlPolygonSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				getGmlLineSymbols().clear();
				getGmlLineSymbols().addAll((Collection<? extends GmlLineSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__DASH_ARRAY:
				setDashArray((String)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__LINE_STYLE:
				setLineStyle((String)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__DASH_OFFSET:
				setDashOffset((String)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				getGmlMarks().clear();
				getGmlMarks().addAll((Collection<? extends GmlMark>)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__LINEJOIN:
				setLinejoin((String)newValue);
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
			case InfGMLSupportPackage.GML_STROKE__LINE_CAP:
				setLineCap(LINE_CAP_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				setGmlColour((GmlColour)null);
				return;
			case InfGMLSupportPackage.GML_STROKE__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				return;
			case InfGMLSupportPackage.GML_STROKE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				getGmlLineSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_STROKE__DASH_ARRAY:
				setDashArray(DASH_ARRAY_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_STROKE__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_STROKE__DASH_OFFSET:
				setDashOffset(DASH_OFFSET_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				getGmlMarks().clear();
				return;
			case InfGMLSupportPackage.GML_STROKE__LINEJOIN:
				setLinejoin(LINEJOIN_EDEFAULT);
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
			case InfGMLSupportPackage.GML_STROKE__LINE_CAP:
				return LINE_CAP_EDEFAULT == null ? lineCap != null : !LINE_CAP_EDEFAULT.equals(lineCap);
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				return gmlColour != null;
			case InfGMLSupportPackage.GML_STROKE__OPACITY:
				return opacity != OPACITY_EDEFAULT;
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				return gmlSvgParameters != null && !gmlSvgParameters.isEmpty();
			case InfGMLSupportPackage.GML_STROKE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				return gmlPolygonSymbols != null && !gmlPolygonSymbols.isEmpty();
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				return gmlLineSymbols != null && !gmlLineSymbols.isEmpty();
			case InfGMLSupportPackage.GML_STROKE__DASH_ARRAY:
				return DASH_ARRAY_EDEFAULT == null ? dashArray != null : !DASH_ARRAY_EDEFAULT.equals(dashArray);
			case InfGMLSupportPackage.GML_STROKE__LINE_STYLE:
				return LINE_STYLE_EDEFAULT == null ? lineStyle != null : !LINE_STYLE_EDEFAULT.equals(lineStyle);
			case InfGMLSupportPackage.GML_STROKE__DASH_OFFSET:
				return DASH_OFFSET_EDEFAULT == null ? dashOffset != null : !DASH_OFFSET_EDEFAULT.equals(dashOffset);
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				return gmlMarks != null && !gmlMarks.isEmpty();
			case InfGMLSupportPackage.GML_STROKE__LINEJOIN:
				return LINEJOIN_EDEFAULT == null ? linejoin != null : !LINEJOIN_EDEFAULT.equals(linejoin);
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
		result.append(" (lineCap: ");
		result.append(lineCap);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", width: ");
		result.append(width);
		result.append(", dashArray: ");
		result.append(dashArray);
		result.append(", lineStyle: ");
		result.append(lineStyle);
		result.append(", dashOffset: ");
		result.append(dashOffset);
		result.append(", linejoin: ");
		result.append(linejoin);
		result.append(')');
		return result.toString();
	}

} //GmlStrokeImpl
