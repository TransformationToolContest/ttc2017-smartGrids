/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;
import CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol;
import CIM.IEC61970.Informative.InfGMLSupport.GmlStroke;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Line Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineSymbolImpl#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineSymbolImpl#getGmlStroke <em>Gml Stroke</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineSymbolImpl#getSourceSide <em>Source Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlLineSymbolImpl extends GmlSymbolImpl implements GmlLineSymbol {
	/**
	 * The cached value of the '{@link #getGmlDiagramObject() <em>Gml Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlDiagramObject()
	 * @generated
	 * @ordered
	 */
	protected GmlDiagramObject gmlDiagramObject;

	/**
	 * The cached value of the '{@link #getGmlStroke() <em>Gml Stroke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlStroke()
	 * @generated
	 * @ordered
	 */
	protected GmlStroke gmlStroke;

	/**
	 * The default value of the '{@link #getSourceSide() <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSide()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_SIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceSide() <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSide()
	 * @generated
	 * @ordered
	 */
	protected String sourceSide = SOURCE_SIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlLineSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_LINE_SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlDiagramObject getGmlDiagramObject() {
		if (gmlDiagramObject != null && gmlDiagramObject.eIsProxy()) {
			InternalEObject oldGmlDiagramObject = (InternalEObject)gmlDiagramObject;
			gmlDiagramObject = (GmlDiagramObject)eResolveProxy(oldGmlDiagramObject);
			if (gmlDiagramObject != oldGmlDiagramObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT, oldGmlDiagramObject, gmlDiagramObject));
			}
		}
		return gmlDiagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlDiagramObject basicGetGmlDiagramObject() {
		return gmlDiagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlDiagramObject(GmlDiagramObject newGmlDiagramObject, NotificationChain msgs) {
		GmlDiagramObject oldGmlDiagramObject = gmlDiagramObject;
		gmlDiagramObject = newGmlDiagramObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT, oldGmlDiagramObject, newGmlDiagramObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlDiagramObject(GmlDiagramObject newGmlDiagramObject) {
		if (newGmlDiagramObject != gmlDiagramObject) {
			NotificationChain msgs = null;
			if (gmlDiagramObject != null)
				msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS, GmlDiagramObject.class, msgs);
			if (newGmlDiagramObject != null)
				msgs = ((InternalEObject)newGmlDiagramObject).eInverseAdd(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS, GmlDiagramObject.class, msgs);
			msgs = basicSetGmlDiagramObject(newGmlDiagramObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT, newGmlDiagramObject, newGmlDiagramObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlStroke getGmlStroke() {
		if (gmlStroke != null && gmlStroke.eIsProxy()) {
			InternalEObject oldGmlStroke = (InternalEObject)gmlStroke;
			gmlStroke = (GmlStroke)eResolveProxy(oldGmlStroke);
			if (gmlStroke != oldGmlStroke) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE, oldGmlStroke, gmlStroke));
			}
		}
		return gmlStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlStroke basicGetGmlStroke() {
		return gmlStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlStroke(GmlStroke newGmlStroke, NotificationChain msgs) {
		GmlStroke oldGmlStroke = gmlStroke;
		gmlStroke = newGmlStroke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE, oldGmlStroke, newGmlStroke);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlStroke(GmlStroke newGmlStroke) {
		if (newGmlStroke != gmlStroke) {
			NotificationChain msgs = null;
			if (gmlStroke != null)
				msgs = ((InternalEObject)gmlStroke).eInverseRemove(this, InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS, GmlStroke.class, msgs);
			if (newGmlStroke != null)
				msgs = ((InternalEObject)newGmlStroke).eInverseAdd(this, InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS, GmlStroke.class, msgs);
			msgs = basicSetGmlStroke(newGmlStroke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE, newGmlStroke, newGmlStroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceSide() {
		return sourceSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSide(String newSourceSide) {
		String oldSourceSide = sourceSide;
		sourceSide = newSourceSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LINE_SYMBOL__SOURCE_SIDE, oldSourceSide, sourceSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				if (gmlDiagramObject != null)
					msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS, GmlDiagramObject.class, msgs);
				return basicSetGmlDiagramObject((GmlDiagramObject)otherEnd, msgs);
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				if (gmlStroke != null)
					msgs = ((InternalEObject)gmlStroke).eInverseRemove(this, InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS, GmlStroke.class, msgs);
				return basicSetGmlStroke((GmlStroke)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				return basicSetGmlDiagramObject(null, msgs);
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				return basicSetGmlStroke(null, msgs);
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				if (resolve) return getGmlDiagramObject();
				return basicGetGmlDiagramObject();
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				if (resolve) return getGmlStroke();
				return basicGetGmlStroke();
			case InfGMLSupportPackage.GML_LINE_SYMBOL__SOURCE_SIDE:
				return getSourceSide();
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)newValue);
				return;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				setGmlStroke((GmlStroke)newValue);
				return;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__SOURCE_SIDE:
				setSourceSide((String)newValue);
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)null);
				return;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				setGmlStroke((GmlStroke)null);
				return;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__SOURCE_SIDE:
				setSourceSide(SOURCE_SIDE_EDEFAULT);
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				return gmlDiagramObject != null;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				return gmlStroke != null;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__SOURCE_SIDE:
				return SOURCE_SIDE_EDEFAULT == null ? sourceSide != null : !SOURCE_SIDE_EDEFAULT.equals(sourceSide);
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
		result.append(" (sourceSide: ");
		result.append(sourceSide);
		result.append(')');
		return result.toString();
	}

} //GmlLineSymbolImpl
