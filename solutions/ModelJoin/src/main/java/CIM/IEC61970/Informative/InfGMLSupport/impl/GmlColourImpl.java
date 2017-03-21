/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlColour;
import CIM.IEC61970.Informative.InfGMLSupport.GmlFill;
import CIM.IEC61970.Informative.InfGMLSupport.GmlFont;
import CIM.IEC61970.Informative.InfGMLSupport.GmlStroke;
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
 * An implementation of the model object '<em><b>Gml Colour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl#getGmlStrokes <em>Gml Strokes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl#getGmlFonts <em>Gml Fonts</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl#getRed <em>Red</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl#getGmlFills <em>Gml Fills</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlColourImpl extends IdentifiedObjectImpl implements GmlColour {
	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final String GREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected String green = GREEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlStrokes() <em>Gml Strokes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlStrokes()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlStroke> gmlStrokes;

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
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final String RED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected String red = RED_EDEFAULT;

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
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final String BLUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected String blue = BLUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlColourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_COLOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(String newGreen) {
		String oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_COLOUR__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlStroke> getGmlStrokes() {
		if (gmlStrokes == null) {
			gmlStrokes = new EObjectWithInverseResolvingEList<GmlStroke>(GmlStroke.class, this, InfGMLSupportPackage.GML_COLOUR__GML_STROKES, InfGMLSupportPackage.GML_STROKE__GML_COLOUR);
		}
		return gmlStrokes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlFont> getGmlFonts() {
		if (gmlFonts == null) {
			gmlFonts = new EObjectWithInverseResolvingEList<GmlFont>(GmlFont.class, this, InfGMLSupportPackage.GML_COLOUR__GML_FONTS, InfGMLSupportPackage.GML_FONT__GML_COLOUR);
		}
		return gmlFonts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(String newRed) {
		String oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_COLOUR__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlFill> getGmlFills() {
		if (gmlFills == null) {
			gmlFills = new EObjectWithInverseResolvingEList<GmlFill>(GmlFill.class, this, InfGMLSupportPackage.GML_COLOUR__GML_FILLS, InfGMLSupportPackage.GML_FILL__GML_COLOUR);
		}
		return gmlFills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(String newBlue) {
		String oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_COLOUR__BLUE, oldBlue, blue));
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
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlStrokes()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFonts()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFills()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				return ((InternalEList<?>)getGmlStrokes()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				return ((InternalEList<?>)getGmlFonts()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				return ((InternalEList<?>)getGmlFills()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_COLOUR__GREEN:
				return getGreen();
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				return getGmlStrokes();
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				return getGmlFonts();
			case InfGMLSupportPackage.GML_COLOUR__RED:
				return getRed();
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				return getGmlFills();
			case InfGMLSupportPackage.GML_COLOUR__BLUE:
				return getBlue();
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
			case InfGMLSupportPackage.GML_COLOUR__GREEN:
				setGreen((String)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				getGmlStrokes().clear();
				getGmlStrokes().addAll((Collection<? extends GmlStroke>)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				getGmlFonts().clear();
				getGmlFonts().addAll((Collection<? extends GmlFont>)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__RED:
				setRed((String)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				getGmlFills().clear();
				getGmlFills().addAll((Collection<? extends GmlFill>)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__BLUE:
				setBlue((String)newValue);
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
			case InfGMLSupportPackage.GML_COLOUR__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				getGmlStrokes().clear();
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				getGmlFonts().clear();
				return;
			case InfGMLSupportPackage.GML_COLOUR__RED:
				setRed(RED_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				getGmlFills().clear();
				return;
			case InfGMLSupportPackage.GML_COLOUR__BLUE:
				setBlue(BLUE_EDEFAULT);
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
			case InfGMLSupportPackage.GML_COLOUR__GREEN:
				return GREEN_EDEFAULT == null ? green != null : !GREEN_EDEFAULT.equals(green);
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				return gmlStrokes != null && !gmlStrokes.isEmpty();
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				return gmlFonts != null && !gmlFonts.isEmpty();
			case InfGMLSupportPackage.GML_COLOUR__RED:
				return RED_EDEFAULT == null ? red != null : !RED_EDEFAULT.equals(red);
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				return gmlFills != null && !gmlFills.isEmpty();
			case InfGMLSupportPackage.GML_COLOUR__BLUE:
				return BLUE_EDEFAULT == null ? blue != null : !BLUE_EDEFAULT.equals(blue);
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
		result.append(" (green: ");
		result.append(green);
		result.append(", red: ");
		result.append(red);
		result.append(", blue: ");
		result.append(blue);
		result.append(')');
		return result.toString();
	}

} //GmlColourImpl
