/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlFill;
import CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic;
import CIM.IEC61970.Informative.InfGMLSupport.GmlMark;
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
 * An implementation of the model object '<em><b>Gml Mark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlMarkImpl#getGmlGraphics <em>Gml Graphics</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlMarkImpl#getGmlFIlls <em>Gml FIlls</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlMarkImpl#getWellKnownName <em>Well Known Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlMarkImpl#getGmlStrokes <em>Gml Strokes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlMarkImpl extends IdentifiedObjectImpl implements GmlMark {
	/**
	 * The cached value of the '{@link #getGmlGraphics() <em>Gml Graphics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlGraphics()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlGraphic> gmlGraphics;

	/**
	 * The cached value of the '{@link #getGmlFIlls() <em>Gml FIlls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFIlls()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFill> gmlFIlls;

	/**
	 * The default value of the '{@link #getWellKnownName() <em>Well Known Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellKnownName()
	 * @generated
	 * @ordered
	 */
	protected static final String WELL_KNOWN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWellKnownName() <em>Well Known Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellKnownName()
	 * @generated
	 * @ordered
	 */
	protected String wellKnownName = WELL_KNOWN_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlMarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_MARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlGraphic> getGmlGraphics() {
		if (gmlGraphics == null) {
			gmlGraphics = new EObjectWithInverseResolvingEList.ManyInverse<GmlGraphic>(GmlGraphic.class, this, InfGMLSupportPackage.GML_MARK__GML_GRAPHICS, InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS);
		}
		return gmlGraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlFill> getGmlFIlls() {
		if (gmlFIlls == null) {
			gmlFIlls = new EObjectWithInverseResolvingEList.ManyInverse<GmlFill>(GmlFill.class, this, InfGMLSupportPackage.GML_MARK__GML_FILLS, InfGMLSupportPackage.GML_FILL__GML_MARKS);
		}
		return gmlFIlls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWellKnownName() {
		return wellKnownName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWellKnownName(String newWellKnownName) {
		String oldWellKnownName = wellKnownName;
		wellKnownName = newWellKnownName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_MARK__WELL_KNOWN_NAME, oldWellKnownName, wellKnownName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlStroke> getGmlStrokes() {
		if (gmlStrokes == null) {
			gmlStrokes = new EObjectWithInverseResolvingEList.ManyInverse<GmlStroke>(GmlStroke.class, this, InfGMLSupportPackage.GML_MARK__GML_STROKES, InfGMLSupportPackage.GML_STROKE__GML_MARKS);
		}
		return gmlStrokes;
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlGraphics()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFIlls()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlStrokes()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				return ((InternalEList<?>)getGmlGraphics()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				return ((InternalEList<?>)getGmlFIlls()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				return ((InternalEList<?>)getGmlStrokes()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				return getGmlGraphics();
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				return getGmlFIlls();
			case InfGMLSupportPackage.GML_MARK__WELL_KNOWN_NAME:
				return getWellKnownName();
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				return getGmlStrokes();
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				getGmlGraphics().clear();
				getGmlGraphics().addAll((Collection<? extends GmlGraphic>)newValue);
				return;
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				getGmlFIlls().clear();
				getGmlFIlls().addAll((Collection<? extends GmlFill>)newValue);
				return;
			case InfGMLSupportPackage.GML_MARK__WELL_KNOWN_NAME:
				setWellKnownName((String)newValue);
				return;
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				getGmlStrokes().clear();
				getGmlStrokes().addAll((Collection<? extends GmlStroke>)newValue);
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				getGmlGraphics().clear();
				return;
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				getGmlFIlls().clear();
				return;
			case InfGMLSupportPackage.GML_MARK__WELL_KNOWN_NAME:
				setWellKnownName(WELL_KNOWN_NAME_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				getGmlStrokes().clear();
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				return gmlGraphics != null && !gmlGraphics.isEmpty();
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				return gmlFIlls != null && !gmlFIlls.isEmpty();
			case InfGMLSupportPackage.GML_MARK__WELL_KNOWN_NAME:
				return WELL_KNOWN_NAME_EDEFAULT == null ? wellKnownName != null : !WELL_KNOWN_NAME_EDEFAULT.equals(wellKnownName);
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				return gmlStrokes != null && !gmlStrokes.isEmpty();
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
		result.append(" (wellKnownName: ");
		result.append(wellKnownName);
		result.append(')');
		return result.toString();
	}

} //GmlMarkImpl
