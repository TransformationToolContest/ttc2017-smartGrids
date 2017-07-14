/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Raster Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl#getGraySourcename <em>Gray Sourcename</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl#getReliefFactor <em>Relief Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl#getOverlapbehaviour <em>Overlapbehaviour</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl#getGreenSourceName <em>Green Source Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl#isBrighnessOnly <em>Brighness Only</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl#getBlueSourcename <em>Blue Sourcename</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl#getRedSourcename <em>Red Sourcename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlRasterSymbolImpl extends GmlSymbolImpl implements GmlRasterSymbol {
	/**
	 * The default value of the '{@link #getGraySourcename() <em>Gray Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraySourcename()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAY_SOURCENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraySourcename() <em>Gray Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraySourcename()
	 * @generated
	 * @ordered
	 */
	protected String graySourcename = GRAY_SOURCENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReliefFactor() <em>Relief Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliefFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String RELIEF_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReliefFactor() <em>Relief Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliefFactor()
	 * @generated
	 * @ordered
	 */
	protected String reliefFactor = RELIEF_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverlapbehaviour() <em>Overlapbehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlapbehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERLAPBEHAVIOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverlapbehaviour() <em>Overlapbehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlapbehaviour()
	 * @generated
	 * @ordered
	 */
	protected String overlapbehaviour = OVERLAPBEHAVIOUR_EDEFAULT;

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
	 * The default value of the '{@link #getGreenSourceName() <em>Green Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String GREEN_SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreenSourceName() <em>Green Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenSourceName()
	 * @generated
	 * @ordered
	 */
	protected String greenSourceName = GREEN_SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isBrighnessOnly() <em>Brighness Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBrighnessOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRIGHNESS_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBrighnessOnly() <em>Brighness Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBrighnessOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean brighnessOnly = BRIGHNESS_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlueSourcename() <em>Blue Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueSourcename()
	 * @generated
	 * @ordered
	 */
	protected static final String BLUE_SOURCENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlueSourcename() <em>Blue Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueSourcename()
	 * @generated
	 * @ordered
	 */
	protected String blueSourcename = BLUE_SOURCENAME_EDEFAULT;

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
	 * The default value of the '{@link #getRedSourcename() <em>Red Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedSourcename()
	 * @generated
	 * @ordered
	 */
	protected static final String RED_SOURCENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedSourcename() <em>Red Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedSourcename()
	 * @generated
	 * @ordered
	 */
	protected String redSourcename = RED_SOURCENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlRasterSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_RASTER_SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraySourcename() {
		return graySourcename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraySourcename(String newGraySourcename) {
		String oldGraySourcename = graySourcename;
		graySourcename = newGraySourcename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__GRAY_SOURCENAME, oldGraySourcename, graySourcename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReliefFactor() {
		return reliefFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliefFactor(String newReliefFactor) {
		String oldReliefFactor = reliefFactor;
		reliefFactor = newReliefFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__RELIEF_FACTOR, oldReliefFactor, reliefFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverlapbehaviour() {
		return overlapbehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlapbehaviour(String newOverlapbehaviour) {
		String oldOverlapbehaviour = overlapbehaviour;
		overlapbehaviour = newOverlapbehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR, oldOverlapbehaviour, overlapbehaviour));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGreenSourceName() {
		return greenSourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreenSourceName(String newGreenSourceName) {
		String oldGreenSourceName = greenSourceName;
		greenSourceName = newGreenSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__GREEN_SOURCE_NAME, oldGreenSourceName, greenSourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBrighnessOnly() {
		return brighnessOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrighnessOnly(boolean newBrighnessOnly) {
		boolean oldBrighnessOnly = brighnessOnly;
		brighnessOnly = newBrighnessOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__BRIGHNESS_ONLY, oldBrighnessOnly, brighnessOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlueSourcename() {
		return blueSourcename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlueSourcename(String newBlueSourcename) {
		String oldBlueSourcename = blueSourcename;
		blueSourcename = newBlueSourcename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__BLUE_SOURCENAME, oldBlueSourcename, blueSourcename));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT, oldGmlDiagramObject, gmlDiagramObject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT, oldGmlDiagramObject, newGmlDiagramObject);
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
				msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS, GmlDiagramObject.class, msgs);
			if (newGmlDiagramObject != null)
				msgs = ((InternalEObject)newGmlDiagramObject).eInverseAdd(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS, GmlDiagramObject.class, msgs);
			msgs = basicSetGmlDiagramObject(newGmlDiagramObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT, newGmlDiagramObject, newGmlDiagramObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedSourcename() {
		return redSourcename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedSourcename(String newRedSourcename) {
		String oldRedSourcename = redSourcename;
		redSourcename = newRedSourcename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_RASTER_SYMBOL__RED_SOURCENAME, oldRedSourcename, redSourcename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				if (gmlDiagramObject != null)
					msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS, GmlDiagramObject.class, msgs);
				return basicSetGmlDiagramObject((GmlDiagramObject)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				return basicSetGmlDiagramObject(null, msgs);
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GRAY_SOURCENAME:
				return getGraySourcename();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RELIEF_FACTOR:
				return getReliefFactor();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR:
				return getOverlapbehaviour();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OPACITY:
				return getOpacity();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GREEN_SOURCE_NAME:
				return getGreenSourceName();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BRIGHNESS_ONLY:
				return isBrighnessOnly();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BLUE_SOURCENAME:
				return getBlueSourcename();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				if (resolve) return getGmlDiagramObject();
				return basicGetGmlDiagramObject();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RED_SOURCENAME:
				return getRedSourcename();
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GRAY_SOURCENAME:
				setGraySourcename((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RELIEF_FACTOR:
				setReliefFactor((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR:
				setOverlapbehaviour((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OPACITY:
				setOpacity((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GREEN_SOURCE_NAME:
				setGreenSourceName((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BRIGHNESS_ONLY:
				setBrighnessOnly((Boolean)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BLUE_SOURCENAME:
				setBlueSourcename((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RED_SOURCENAME:
				setRedSourcename((String)newValue);
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GRAY_SOURCENAME:
				setGraySourcename(GRAY_SOURCENAME_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RELIEF_FACTOR:
				setReliefFactor(RELIEF_FACTOR_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR:
				setOverlapbehaviour(OVERLAPBEHAVIOUR_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GREEN_SOURCE_NAME:
				setGreenSourceName(GREEN_SOURCE_NAME_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BRIGHNESS_ONLY:
				setBrighnessOnly(BRIGHNESS_ONLY_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BLUE_SOURCENAME:
				setBlueSourcename(BLUE_SOURCENAME_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)null);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RED_SOURCENAME:
				setRedSourcename(RED_SOURCENAME_EDEFAULT);
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GRAY_SOURCENAME:
				return GRAY_SOURCENAME_EDEFAULT == null ? graySourcename != null : !GRAY_SOURCENAME_EDEFAULT.equals(graySourcename);
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RELIEF_FACTOR:
				return RELIEF_FACTOR_EDEFAULT == null ? reliefFactor != null : !RELIEF_FACTOR_EDEFAULT.equals(reliefFactor);
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR:
				return OVERLAPBEHAVIOUR_EDEFAULT == null ? overlapbehaviour != null : !OVERLAPBEHAVIOUR_EDEFAULT.equals(overlapbehaviour);
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OPACITY:
				return opacity != OPACITY_EDEFAULT;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GREEN_SOURCE_NAME:
				return GREEN_SOURCE_NAME_EDEFAULT == null ? greenSourceName != null : !GREEN_SOURCE_NAME_EDEFAULT.equals(greenSourceName);
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BRIGHNESS_ONLY:
				return brighnessOnly != BRIGHNESS_ONLY_EDEFAULT;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BLUE_SOURCENAME:
				return BLUE_SOURCENAME_EDEFAULT == null ? blueSourcename != null : !BLUE_SOURCENAME_EDEFAULT.equals(blueSourcename);
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				return gmlDiagramObject != null;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RED_SOURCENAME:
				return RED_SOURCENAME_EDEFAULT == null ? redSourcename != null : !RED_SOURCENAME_EDEFAULT.equals(redSourcename);
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
		result.append(" (graySourcename: ");
		result.append(graySourcename);
		result.append(", reliefFactor: ");
		result.append(reliefFactor);
		result.append(", overlapbehaviour: ");
		result.append(overlapbehaviour);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", greenSourceName: ");
		result.append(greenSourceName);
		result.append(", brighnessOnly: ");
		result.append(brighnessOnly);
		result.append(", blueSourcename: ");
		result.append(blueSourcename);
		result.append(", redSourcename: ");
		result.append(redSourcename);
		result.append(')');
		return result.toString();
	}

} //GmlRasterSymbolImpl
