/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.AnchorKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Support Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl#getAnchorKind <em>Anchor Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl#getSize <em>Size</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl#getSecuredStructure <em>Secured Structure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl#getAnchorRodCount <em>Anchor Rod Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl#getLength <em>Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl#getAnchorRodLength <em>Anchor Rod Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureSupportInfoImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureSupportInfoImpl extends AssetInfoImpl implements StructureSupportInfo {
	/**
	 * The default value of the '{@link #getAnchorKind() <em>Anchor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorKind()
	 * @generated
	 * @ordered
	 */
	protected static final AnchorKind ANCHOR_KIND_EDEFAULT = AnchorKind.ROD;

	/**
	 * The cached value of the '{@link #getAnchorKind() <em>Anchor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorKind()
	 * @generated
	 * @ordered
	 */
	protected AnchorKind anchorKind = ANCHOR_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final StructureSupportKind KIND_EDEFAULT = StructureSupportKind.GUY;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected StructureSupportKind kind = KIND_EDEFAULT;

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
	 * The cached value of the '{@link #getSecuredStructure() <em>Secured Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuredStructure()
	 * @generated
	 * @ordered
	 */
	protected StructureInfo securedStructure;

	/**
	 * The default value of the '{@link #getAnchorRodCount() <em>Anchor Rod Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorRodCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ANCHOR_ROD_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnchorRodCount() <em>Anchor Rod Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorRodCount()
	 * @generated
	 * @ordered
	 */
	protected int anchorRodCount = ANCHOR_ROD_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnchorRodLength() <em>Anchor Rod Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorRodLength()
	 * @generated
	 * @ordered
	 */
	protected static final float ANCHOR_ROD_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAnchorRodLength() <em>Anchor Rod Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorRodLength()
	 * @generated
	 * @ordered
	 */
	protected float anchorRodLength = ANCHOR_ROD_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final float DIRECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected float direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureSupportInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getStructureSupportInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnchorKind getAnchorKind() {
		return anchorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorKind(AnchorKind newAnchorKind) {
		AnchorKind oldAnchorKind = anchorKind;
		anchorKind = newAnchorKind == null ? ANCHOR_KIND_EDEFAULT : newAnchorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_KIND, oldAnchorKind, anchorKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSupportKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(StructureSupportKind newKind) {
		StructureSupportKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureInfo getSecuredStructure() {
		if (securedStructure != null && securedStructure.eIsProxy()) {
			InternalEObject oldSecuredStructure = (InternalEObject)securedStructure;
			securedStructure = (StructureInfo)eResolveProxy(oldSecuredStructure);
			if (securedStructure != oldSecuredStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE, oldSecuredStructure, securedStructure));
			}
		}
		return securedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureInfo basicGetSecuredStructure() {
		return securedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuredStructure(StructureInfo newSecuredStructure, NotificationChain msgs) {
		StructureInfo oldSecuredStructure = securedStructure;
		securedStructure = newSecuredStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE, oldSecuredStructure, newSecuredStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuredStructure(StructureInfo newSecuredStructure) {
		if (newSecuredStructure != securedStructure) {
			NotificationChain msgs = null;
			if (securedStructure != null)
				msgs = ((InternalEObject)securedStructure).eInverseRemove(this, InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS, StructureInfo.class, msgs);
			if (newSecuredStructure != null)
				msgs = ((InternalEObject)newSecuredStructure).eInverseAdd(this, InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS, StructureInfo.class, msgs);
			msgs = basicSetSecuredStructure(newSecuredStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE, newSecuredStructure, newSecuredStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnchorRodCount() {
		return anchorRodCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorRodCount(int newAnchorRodCount) {
		int oldAnchorRodCount = anchorRodCount;
		anchorRodCount = newAnchorRodCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_COUNT, oldAnchorRodCount, anchorRodCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAnchorRodLength() {
		return anchorRodLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorRodLength(float newAnchorRodLength) {
		float oldAnchorRodLength = anchorRodLength;
		anchorRodLength = newAnchorRodLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_LENGTH, oldAnchorRodLength, anchorRodLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(float newDirection) {
		float oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE:
				if (securedStructure != null)
					msgs = ((InternalEObject)securedStructure).eInverseRemove(this, InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS, StructureInfo.class, msgs);
				return basicSetSecuredStructure((StructureInfo)otherEnd, msgs);
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
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE:
				return basicSetSecuredStructure(null, msgs);
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
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_KIND:
				return getAnchorKind();
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__KIND:
				return getKind();
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SIZE:
				return getSize();
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE:
				if (resolve) return getSecuredStructure();
				return basicGetSecuredStructure();
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_COUNT:
				return getAnchorRodCount();
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__LENGTH:
				return getLength();
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_LENGTH:
				return getAnchorRodLength();
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__DIRECTION:
				return getDirection();
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
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_KIND:
				setAnchorKind((AnchorKind)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__KIND:
				setKind((StructureSupportKind)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SIZE:
				setSize((String)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE:
				setSecuredStructure((StructureInfo)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_COUNT:
				setAnchorRodCount((Integer)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__LENGTH:
				setLength((Float)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_LENGTH:
				setAnchorRodLength((Float)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__DIRECTION:
				setDirection((Float)newValue);
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
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_KIND:
				setAnchorKind(ANCHOR_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE:
				setSecuredStructure((StructureInfo)null);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_COUNT:
				setAnchorRodCount(ANCHOR_ROD_COUNT_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_LENGTH:
				setAnchorRodLength(ANCHOR_ROD_LENGTH_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_KIND:
				return anchorKind != ANCHOR_KIND_EDEFAULT;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__KIND:
				return kind != KIND_EDEFAULT;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE:
				return securedStructure != null;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_COUNT:
				return anchorRodCount != ANCHOR_ROD_COUNT_EDEFAULT;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__LENGTH:
				return length != LENGTH_EDEFAULT;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__ANCHOR_ROD_LENGTH:
				return anchorRodLength != ANCHOR_ROD_LENGTH_EDEFAULT;
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		result.append(" (anchorKind: ");
		result.append(anchorKind);
		result.append(", kind: ");
		result.append(kind);
		result.append(", size: ");
		result.append(size);
		result.append(", anchorRodCount: ");
		result.append(anchorRodCount);
		result.append(", length: ");
		result.append(length);
		result.append(", anchorRodLength: ");
		result.append(anchorRodLength);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //StructureSupportInfoImpl
