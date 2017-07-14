/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlColour;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFill;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol;
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
 * An implementation of the model object '<em><b>Gml Fill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl#getGmlSvgParameters <em>Gml Svg Parameters</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl#getGmlMarks <em>Gml Marks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl#getGmlColour <em>Gml Colour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlFillImpl extends IdentifiedObjectImpl implements GmlFill {
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
	 * The cached value of the '{@link #getGmlSvgParameters() <em>Gml Svg Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSvgParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlSvgParameter> gmlSvgParameters;

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
	 * The cached value of the '{@link #getGmlTextSymbols() <em>Gml Text Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlTextSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlTextSymbol> gmlTextSymbols;

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
	 * The cached value of the '{@link #getGmlColour() <em>Gml Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlColour()
	 * @generated
	 * @ordered
	 */
	protected GmlColour gmlColour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlFillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_FILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlPolygonSymbol> getGmlPolygonSymbols() {
		if (gmlPolygonSymbols == null) {
			gmlPolygonSymbols = new EObjectWithInverseResolvingEList<GmlPolygonSymbol>(GmlPolygonSymbol.class, this, InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS, InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_FILL);
		}
		return gmlPolygonSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlSvgParameter> getGmlSvgParameters() {
		if (gmlSvgParameters == null) {
			gmlSvgParameters = new EObjectWithInverseResolvingEList.ManyInverse<GmlSvgParameter>(GmlSvgParameter.class, this, InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS, InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS);
		}
		return gmlSvgParameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FILL__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlTextSymbol> getGmlTextSymbols() {
		if (gmlTextSymbols == null) {
			gmlTextSymbols = new EObjectWithInverseResolvingEList<GmlTextSymbol>(GmlTextSymbol.class, this, InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL);
		}
		return gmlTextSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlMark> getGmlMarks() {
		if (gmlMarks == null) {
			gmlMarks = new EObjectWithInverseResolvingEList.ManyInverse<GmlMark>(GmlMark.class, this, InfGMLSupportPackage.GML_FILL__GML_MARKS, InfGMLSupportPackage.GML_MARK__GML_FILLS);
		}
		return gmlMarks;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_FILL__GML_COLOUR, oldGmlColour, gmlColour));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FILL__GML_COLOUR, oldGmlColour, newGmlColour);
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
				msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_FILLS, GmlColour.class, msgs);
			if (newGmlColour != null)
				msgs = ((InternalEObject)newGmlColour).eInverseAdd(this, InfGMLSupportPackage.GML_COLOUR__GML_FILLS, GmlColour.class, msgs);
			msgs = basicSetGmlColour(newGmlColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FILL__GML_COLOUR, newGmlColour, newGmlColour));
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
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPolygonSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSvgParameters()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTextSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlMarks()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				if (gmlColour != null)
					msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_FILLS, GmlColour.class, msgs);
				return basicSetGmlColour((GmlColour)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				return ((InternalEList<?>)getGmlPolygonSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				return ((InternalEList<?>)getGmlSvgParameters()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				return ((InternalEList<?>)getGmlTextSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				return ((InternalEList<?>)getGmlMarks()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				return basicSetGmlColour(null, msgs);
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
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				return getGmlPolygonSymbols();
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				return getGmlSvgParameters();
			case InfGMLSupportPackage.GML_FILL__OPACITY:
				return getOpacity();
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				return getGmlTextSymbols();
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				return getGmlMarks();
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				if (resolve) return getGmlColour();
				return basicGetGmlColour();
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
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				getGmlPolygonSymbols().addAll((Collection<? extends GmlPolygonSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				getGmlSvgParameters().addAll((Collection<? extends GmlSvgParameter>)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__OPACITY:
				setOpacity((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				getGmlTextSymbols().addAll((Collection<? extends GmlTextSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				getGmlMarks().clear();
				getGmlMarks().addAll((Collection<? extends GmlMark>)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				setGmlColour((GmlColour)newValue);
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
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				return;
			case InfGMLSupportPackage.GML_FILL__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				getGmlMarks().clear();
				return;
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				setGmlColour((GmlColour)null);
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
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				return gmlPolygonSymbols != null && !gmlPolygonSymbols.isEmpty();
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				return gmlSvgParameters != null && !gmlSvgParameters.isEmpty();
			case InfGMLSupportPackage.GML_FILL__OPACITY:
				return opacity != OPACITY_EDEFAULT;
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				return gmlTextSymbols != null && !gmlTextSymbols.isEmpty();
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				return gmlMarks != null && !gmlMarks.isEmpty();
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				return gmlColour != null;
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
		result.append(" (opacity: ");
		result.append(opacity);
		result.append(')');
		return result.toString();
	}

} //GmlFillImpl
