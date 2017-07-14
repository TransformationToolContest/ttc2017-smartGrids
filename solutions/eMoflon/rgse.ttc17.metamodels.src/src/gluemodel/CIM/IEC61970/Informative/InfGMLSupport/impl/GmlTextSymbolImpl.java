/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFill;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlHalo;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Text Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getGmlHalo <em>Gml Halo</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getGmlFont <em>Gml Font</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getGmlFill <em>Gml Fill</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getMinFontSize <em>Min Font Size</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getGmlLabelPlacement <em>Gml Label Placement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl#getLabelType <em>Label Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlTextSymbolImpl extends GmlSymbolImpl implements GmlTextSymbol {
	/**
	 * The cached value of the '{@link #getGmlHalo() <em>Gml Halo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlHalo()
	 * @generated
	 * @ordered
	 */
	protected GmlHalo gmlHalo;

	/**
	 * The cached value of the '{@link #getGmlFont() <em>Gml Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFont()
	 * @generated
	 * @ordered
	 */
	protected GmlFont gmlFont;

	/**
	 * The cached value of the '{@link #getGmlFill() <em>Gml Fill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFill()
	 * @generated
	 * @ordered
	 */
	protected GmlFill gmlFill;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinFontSize() <em>Min Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_FONT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinFontSize() <em>Min Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFontSize()
	 * @generated
	 * @ordered
	 */
	protected int minFontSize = MIN_FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldID() <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldID()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldID() <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldID()
	 * @generated
	 * @ordered
	 */
	protected String fieldID = FIELD_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getGmlLabelPlacement() <em>Gml Label Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLabelPlacement()
	 * @generated
	 * @ordered
	 */
	protected GmlLabelPlacement gmlLabelPlacement;

	/**
	 * The default value of the '{@link #getLabelType() <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelType()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelType() <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelType()
	 * @generated
	 * @ordered
	 */
	protected String labelType = LABEL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlTextSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_TEXT_SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlHalo getGmlHalo() {
		if (gmlHalo != null && gmlHalo.eIsProxy()) {
			InternalEObject oldGmlHalo = (InternalEObject)gmlHalo;
			gmlHalo = (GmlHalo)eResolveProxy(oldGmlHalo);
			if (gmlHalo != oldGmlHalo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO, oldGmlHalo, gmlHalo));
			}
		}
		return gmlHalo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlHalo basicGetGmlHalo() {
		return gmlHalo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlHalo(GmlHalo newGmlHalo, NotificationChain msgs) {
		GmlHalo oldGmlHalo = gmlHalo;
		gmlHalo = newGmlHalo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO, oldGmlHalo, newGmlHalo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlHalo(GmlHalo newGmlHalo) {
		if (newGmlHalo != gmlHalo) {
			NotificationChain msgs = null;
			if (gmlHalo != null)
				msgs = ((InternalEObject)gmlHalo).eInverseRemove(this, InfGMLSupportPackage.GML_HALO__GML_TEXT_SYMBOLS, GmlHalo.class, msgs);
			if (newGmlHalo != null)
				msgs = ((InternalEObject)newGmlHalo).eInverseAdd(this, InfGMLSupportPackage.GML_HALO__GML_TEXT_SYMBOLS, GmlHalo.class, msgs);
			msgs = basicSetGmlHalo(newGmlHalo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO, newGmlHalo, newGmlHalo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFont getGmlFont() {
		if (gmlFont != null && gmlFont.eIsProxy()) {
			InternalEObject oldGmlFont = (InternalEObject)gmlFont;
			gmlFont = (GmlFont)eResolveProxy(oldGmlFont);
			if (gmlFont != oldGmlFont) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT, oldGmlFont, gmlFont));
			}
		}
		return gmlFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFont basicGetGmlFont() {
		return gmlFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlFont(GmlFont newGmlFont, NotificationChain msgs) {
		GmlFont oldGmlFont = gmlFont;
		gmlFont = newGmlFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT, oldGmlFont, newGmlFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlFont(GmlFont newGmlFont) {
		if (newGmlFont != gmlFont) {
			NotificationChain msgs = null;
			if (gmlFont != null)
				msgs = ((InternalEObject)gmlFont).eInverseRemove(this, InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS, GmlFont.class, msgs);
			if (newGmlFont != null)
				msgs = ((InternalEObject)newGmlFont).eInverseAdd(this, InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS, GmlFont.class, msgs);
			msgs = basicSetGmlFont(newGmlFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT, newGmlFont, newGmlFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFill getGmlFill() {
		if (gmlFill != null && gmlFill.eIsProxy()) {
			InternalEObject oldGmlFill = (InternalEObject)gmlFill;
			gmlFill = (GmlFill)eResolveProxy(oldGmlFill);
			if (gmlFill != oldGmlFill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL, oldGmlFill, gmlFill));
			}
		}
		return gmlFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFill basicGetGmlFill() {
		return gmlFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlFill(GmlFill newGmlFill, NotificationChain msgs) {
		GmlFill oldGmlFill = gmlFill;
		gmlFill = newGmlFill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL, oldGmlFill, newGmlFill);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlFill(GmlFill newGmlFill) {
		if (newGmlFill != gmlFill) {
			NotificationChain msgs = null;
			if (gmlFill != null)
				msgs = ((InternalEObject)gmlFill).eInverseRemove(this, InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS, GmlFill.class, msgs);
			if (newGmlFill != null)
				msgs = ((InternalEObject)newGmlFill).eInverseAdd(this, InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS, GmlFill.class, msgs);
			msgs = basicSetGmlFill(newGmlFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL, newGmlFill, newGmlFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinFontSize() {
		return minFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinFontSize(int newMinFontSize) {
		int oldMinFontSize = minFontSize;
		minFontSize = newMinFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__MIN_FONT_SIZE, oldMinFontSize, minFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldID() {
		return fieldID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldID(String newFieldID) {
		String oldFieldID = fieldID;
		fieldID = newFieldID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__FIELD_ID, oldFieldID, fieldID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT, oldGmlDiagramObject, gmlDiagramObject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT, oldGmlDiagramObject, newGmlDiagramObject);
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
				msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS, GmlDiagramObject.class, msgs);
			if (newGmlDiagramObject != null)
				msgs = ((InternalEObject)newGmlDiagramObject).eInverseAdd(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS, GmlDiagramObject.class, msgs);
			msgs = basicSetGmlDiagramObject(newGmlDiagramObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT, newGmlDiagramObject, newGmlDiagramObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelPlacement getGmlLabelPlacement() {
		if (gmlLabelPlacement != null && gmlLabelPlacement.eIsProxy()) {
			InternalEObject oldGmlLabelPlacement = (InternalEObject)gmlLabelPlacement;
			gmlLabelPlacement = (GmlLabelPlacement)eResolveProxy(oldGmlLabelPlacement);
			if (gmlLabelPlacement != oldGmlLabelPlacement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT, oldGmlLabelPlacement, gmlLabelPlacement));
			}
		}
		return gmlLabelPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelPlacement basicGetGmlLabelPlacement() {
		return gmlLabelPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlLabelPlacement(GmlLabelPlacement newGmlLabelPlacement, NotificationChain msgs) {
		GmlLabelPlacement oldGmlLabelPlacement = gmlLabelPlacement;
		gmlLabelPlacement = newGmlLabelPlacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT, oldGmlLabelPlacement, newGmlLabelPlacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmlLabelPlacement(GmlLabelPlacement newGmlLabelPlacement) {
		if (newGmlLabelPlacement != gmlLabelPlacement) {
			NotificationChain msgs = null;
			if (gmlLabelPlacement != null)
				msgs = ((InternalEObject)gmlLabelPlacement).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS, GmlLabelPlacement.class, msgs);
			if (newGmlLabelPlacement != null)
				msgs = ((InternalEObject)newGmlLabelPlacement).eInverseAdd(this, InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS, GmlLabelPlacement.class, msgs);
			msgs = basicSetGmlLabelPlacement(newGmlLabelPlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT, newGmlLabelPlacement, newGmlLabelPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelType() {
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelType(String newLabelType) {
		String oldLabelType = labelType;
		labelType = newLabelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL_TYPE, oldLabelType, labelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				if (gmlHalo != null)
					msgs = ((InternalEObject)gmlHalo).eInverseRemove(this, InfGMLSupportPackage.GML_HALO__GML_TEXT_SYMBOLS, GmlHalo.class, msgs);
				return basicSetGmlHalo((GmlHalo)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				if (gmlFont != null)
					msgs = ((InternalEObject)gmlFont).eInverseRemove(this, InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS, GmlFont.class, msgs);
				return basicSetGmlFont((GmlFont)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				if (gmlFill != null)
					msgs = ((InternalEObject)gmlFill).eInverseRemove(this, InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS, GmlFill.class, msgs);
				return basicSetGmlFill((GmlFill)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
				if (gmlDiagramObject != null)
					msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS, GmlDiagramObject.class, msgs);
				return basicSetGmlDiagramObject((GmlDiagramObject)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				if (gmlLabelPlacement != null)
					msgs = ((InternalEObject)gmlLabelPlacement).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS, GmlLabelPlacement.class, msgs);
				return basicSetGmlLabelPlacement((GmlLabelPlacement)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				return basicSetGmlHalo(null, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				return basicSetGmlFont(null, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				return basicSetGmlFill(null, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
				return basicSetGmlDiagramObject(null, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				return basicSetGmlLabelPlacement(null, msgs);
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				if (resolve) return getGmlHalo();
				return basicGetGmlHalo();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				if (resolve) return getGmlFont();
				return basicGetGmlFont();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				if (resolve) return getGmlFill();
				return basicGetGmlFill();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__PROPERTY:
				return getProperty();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL:
				return getLabel();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__MIN_FONT_SIZE:
				return getMinFontSize();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__FIELD_ID:
				return getFieldID();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
				if (resolve) return getGmlDiagramObject();
				return basicGetGmlDiagramObject();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				if (resolve) return getGmlLabelPlacement();
				return basicGetGmlLabelPlacement();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL_TYPE:
				return getLabelType();
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				setGmlHalo((GmlHalo)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				setGmlFont((GmlFont)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				setGmlFill((GmlFill)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__PROPERTY:
				setProperty((String)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL:
				setLabel((String)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__MIN_FONT_SIZE:
				setMinFontSize((Integer)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__FIELD_ID:
				setFieldID((String)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				setGmlLabelPlacement((GmlLabelPlacement)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL_TYPE:
				setLabelType((String)newValue);
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				setGmlHalo((GmlHalo)null);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				setGmlFont((GmlFont)null);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				setGmlFill((GmlFill)null);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__MIN_FONT_SIZE:
				setMinFontSize(MIN_FONT_SIZE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__FIELD_ID:
				setFieldID(FIELD_ID_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)null);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				setGmlLabelPlacement((GmlLabelPlacement)null);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL_TYPE:
				setLabelType(LABEL_TYPE_EDEFAULT);
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				return gmlHalo != null;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				return gmlFont != null;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				return gmlFill != null;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__MIN_FONT_SIZE:
				return minFontSize != MIN_FONT_SIZE_EDEFAULT;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__FIELD_ID:
				return FIELD_ID_EDEFAULT == null ? fieldID != null : !FIELD_ID_EDEFAULT.equals(fieldID);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
				return gmlDiagramObject != null;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				return gmlLabelPlacement != null;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL_TYPE:
				return LABEL_TYPE_EDEFAULT == null ? labelType != null : !LABEL_TYPE_EDEFAULT.equals(labelType);
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
		result.append(" (property: ");
		result.append(property);
		result.append(", label: ");
		result.append(label);
		result.append(", minFontSize: ");
		result.append(minFontSize);
		result.append(", fieldID: ");
		result.append(fieldID);
		result.append(", labelType: ");
		result.append(labelType);
		result.append(')');
		return result.toString();
	}

} //GmlTextSymbolImpl
