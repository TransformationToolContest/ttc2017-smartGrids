/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement;
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
 * An implementation of the model object '<em><b>Gml Label Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl#getAnchorY <em>Anchor Y</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl#getAnchorX <em>Anchor X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlLabelPlacementImpl extends IdentifiedObjectImpl implements GmlLabelPlacement {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnchorY() <em>Anchor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorY()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchorY() <em>Anchor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorY()
	 * @generated
	 * @ordered
	 */
	protected String anchorY = ANCHOR_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnchorX() <em>Anchor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorX()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchorX() <em>Anchor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorX()
	 * @generated
	 * @ordered
	 */
	protected String anchorX = ANCHOR_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected String rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLACEMENT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected String displacementY = DISPLACEMENT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLACEMENT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected String displacementX = DISPLACEMENT_X_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlLabelPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_LABEL_PLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_PLACEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_PLACEMENT__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnchorY() {
		return anchorY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorY(String newAnchorY) {
		String oldAnchorY = anchorY;
		anchorY = newAnchorY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_Y, oldAnchorY, anchorY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnchorX() {
		return anchorX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorX(String newAnchorX) {
		String oldAnchorX = anchorX;
		anchorX = newAnchorX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_X, oldAnchorX, anchorX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(String newRotation) {
		String oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_PLACEMENT__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplacementY() {
		return displacementY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementY(String newDisplacementY) {
		String oldDisplacementY = displacementY;
		displacementY = newDisplacementY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_Y, oldDisplacementY, displacementY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplacementX() {
		return displacementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementX(String newDisplacementX) {
		String oldDisplacementX = displacementX;
		displacementX = newDisplacementX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_X, oldDisplacementX, displacementX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlTextSymbol> getGmlTextSymbols() {
		if (gmlTextSymbols == null) {
			gmlTextSymbols = new EObjectWithInverseResolvingEList<GmlTextSymbol>(GmlTextSymbol.class, this, InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT);
		}
		return gmlTextSymbols;
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTextSymbols()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				return ((InternalEList<?>)getGmlTextSymbols()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__TYPE:
				return getType();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__OFFSET:
				return getOffset();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_Y:
				return getAnchorY();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_X:
				return getAnchorX();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ROTATION:
				return getRotation();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_Y:
				return getDisplacementY();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_X:
				return getDisplacementX();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				return getGmlTextSymbols();
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__TYPE:
				setType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__OFFSET:
				setOffset((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_Y:
				setAnchorY((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_X:
				setAnchorX((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ROTATION:
				setRotation((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_Y:
				setDisplacementY((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_X:
				setDisplacementX((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				getGmlTextSymbols().addAll((Collection<? extends GmlTextSymbol>)newValue);
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_Y:
				setAnchorY(ANCHOR_Y_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_X:
				setAnchorX(ANCHOR_X_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_Y:
				setDisplacementY(DISPLACEMENT_Y_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_X:
				setDisplacementX(DISPLACEMENT_X_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_Y:
				return ANCHOR_Y_EDEFAULT == null ? anchorY != null : !ANCHOR_Y_EDEFAULT.equals(anchorY);
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_X:
				return ANCHOR_X_EDEFAULT == null ? anchorX != null : !ANCHOR_X_EDEFAULT.equals(anchorX);
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ROTATION:
				return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_Y:
				return DISPLACEMENT_Y_EDEFAULT == null ? displacementY != null : !DISPLACEMENT_Y_EDEFAULT.equals(displacementY);
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_X:
				return DISPLACEMENT_X_EDEFAULT == null ? displacementX != null : !DISPLACEMENT_X_EDEFAULT.equals(displacementX);
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				return gmlTextSymbols != null && !gmlTextSymbols.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", offset: ");
		result.append(offset);
		result.append(", anchorY: ");
		result.append(anchorY);
		result.append(", anchorX: ");
		result.append(anchorX);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", displacementY: ");
		result.append(displacementY);
		result.append(", displacementX: ");
		result.append(displacementX);
		result.append(')');
		return result.toString();
	}

} //GmlLabelPlacementImpl
