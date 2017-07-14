/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol;
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
 * An implementation of the model object '<em><b>Gml Graphic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl#getSymbolID <em>Symbol ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl#getXScale <em>XScale</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl#getSize <em>Size</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl#getYScale <em>YScale</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl#getGmlMarks <em>Gml Marks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl#getGmlPointSymbols <em>Gml Point Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlGraphicImpl extends IdentifiedObjectImpl implements GmlGraphic {
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
	 * The default value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected int minSize = MIN_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolID() <em>Symbol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolID()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolID() <em>Symbol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolID()
	 * @generated
	 * @ordered
	 */
	protected String symbolID = SYMBOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getXScale() <em>XScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXScale()
	 * @generated
	 * @ordered
	 */
	protected static final float XSCALE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXScale() <em>XScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXScale()
	 * @generated
	 * @ordered
	 */
	protected float xScale = XSCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYScale() <em>YScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYScale()
	 * @generated
	 * @ordered
	 */
	protected static final float YSCALE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getYScale() <em>YScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYScale()
	 * @generated
	 * @ordered
	 */
	protected float yScale = YSCALE_EDEFAULT;

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
	 * The cached value of the '{@link #getGmlPointSymbols() <em>Gml Point Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlPointSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlPointSymbol> gmlPointSymbols;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final float ROTATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected float rotation = ROTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlGraphicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_GRAPHIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GRAPHIC__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinSize() {
		return minSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSize(int newMinSize) {
		int oldMinSize = minSize;
		minSize = newMinSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GRAPHIC__MIN_SIZE, oldMinSize, minSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolID() {
		return symbolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolID(String newSymbolID) {
		String oldSymbolID = symbolID;
		symbolID = newSymbolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GRAPHIC__SYMBOL_ID, oldSymbolID, symbolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXScale() {
		return xScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXScale(float newXScale) {
		float oldXScale = xScale;
		xScale = newXScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GRAPHIC__XSCALE, oldXScale, xScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GRAPHIC__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYScale() {
		return yScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYScale(float newYScale) {
		float oldYScale = yScale;
		yScale = newYScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GRAPHIC__YSCALE, oldYScale, yScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlMark> getGmlMarks() {
		if (gmlMarks == null) {
			gmlMarks = new EObjectWithInverseResolvingEList.ManyInverse<GmlMark>(GmlMark.class, this, InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS, InfGMLSupportPackage.GML_MARK__GML_GRAPHICS);
		}
		return gmlMarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlPointSymbol> getGmlPointSymbols() {
		if (gmlPointSymbols == null) {
			gmlPointSymbols = new EObjectWithInverseResolvingEList<GmlPointSymbol>(GmlPointSymbol.class, this, InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS, InfGMLSupportPackage.GML_POINT_SYMBOL__GML_GRAPHIC);
		}
		return gmlPointSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(float newRotation) {
		float oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_GRAPHIC__ROTATION, oldRotation, rotation));
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
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlMarks()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPointSymbols()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				return ((InternalEList<?>)getGmlMarks()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				return ((InternalEList<?>)getGmlPointSymbols()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_GRAPHIC__OPACITY:
				return getOpacity();
			case InfGMLSupportPackage.GML_GRAPHIC__MIN_SIZE:
				return getMinSize();
			case InfGMLSupportPackage.GML_GRAPHIC__SYMBOL_ID:
				return getSymbolID();
			case InfGMLSupportPackage.GML_GRAPHIC__XSCALE:
				return getXScale();
			case InfGMLSupportPackage.GML_GRAPHIC__SIZE:
				return getSize();
			case InfGMLSupportPackage.GML_GRAPHIC__YSCALE:
				return getYScale();
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				return getGmlMarks();
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				return getGmlPointSymbols();
			case InfGMLSupportPackage.GML_GRAPHIC__ROTATION:
				return getRotation();
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
			case InfGMLSupportPackage.GML_GRAPHIC__OPACITY:
				setOpacity((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__MIN_SIZE:
				setMinSize((Integer)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__SYMBOL_ID:
				setSymbolID((String)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__XSCALE:
				setXScale((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__SIZE:
				setSize((Integer)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__YSCALE:
				setYScale((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				getGmlMarks().clear();
				getGmlMarks().addAll((Collection<? extends GmlMark>)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				getGmlPointSymbols().clear();
				getGmlPointSymbols().addAll((Collection<? extends GmlPointSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__ROTATION:
				setRotation((Float)newValue);
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
			case InfGMLSupportPackage.GML_GRAPHIC__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__MIN_SIZE:
				setMinSize(MIN_SIZE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__SYMBOL_ID:
				setSymbolID(SYMBOL_ID_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__XSCALE:
				setXScale(XSCALE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__YSCALE:
				setYScale(YSCALE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				getGmlMarks().clear();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				getGmlPointSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__ROTATION:
				setRotation(ROTATION_EDEFAULT);
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
			case InfGMLSupportPackage.GML_GRAPHIC__OPACITY:
				return opacity != OPACITY_EDEFAULT;
			case InfGMLSupportPackage.GML_GRAPHIC__MIN_SIZE:
				return minSize != MIN_SIZE_EDEFAULT;
			case InfGMLSupportPackage.GML_GRAPHIC__SYMBOL_ID:
				return SYMBOL_ID_EDEFAULT == null ? symbolID != null : !SYMBOL_ID_EDEFAULT.equals(symbolID);
			case InfGMLSupportPackage.GML_GRAPHIC__XSCALE:
				return xScale != XSCALE_EDEFAULT;
			case InfGMLSupportPackage.GML_GRAPHIC__SIZE:
				return size != SIZE_EDEFAULT;
			case InfGMLSupportPackage.GML_GRAPHIC__YSCALE:
				return yScale != YSCALE_EDEFAULT;
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				return gmlMarks != null && !gmlMarks.isEmpty();
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				return gmlPointSymbols != null && !gmlPointSymbols.isEmpty();
			case InfGMLSupportPackage.GML_GRAPHIC__ROTATION:
				return rotation != ROTATION_EDEFAULT;
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
		result.append(", minSize: ");
		result.append(minSize);
		result.append(", symbolID: ");
		result.append(symbolID);
		result.append(", xScale: ");
		result.append(xScale);
		result.append(", size: ");
		result.append(size);
		result.append(", yScale: ");
		result.append(yScale);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(')');
		return result.toString();
	}

} //GmlGraphicImpl
