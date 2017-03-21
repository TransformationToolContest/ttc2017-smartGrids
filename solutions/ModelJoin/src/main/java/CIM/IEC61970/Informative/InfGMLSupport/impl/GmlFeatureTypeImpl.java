/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle;
import CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureTypeImpl#getGmlFeatureStyles <em>Gml Feature Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlFeatureTypeImpl extends IdentifiedObjectImpl implements GmlFeatureType {
	/**
	 * The cached value of the '{@link #getGmlFeatureStyles() <em>Gml Feature Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFeatureStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFeatureStyle> gmlFeatureStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_FEATURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlFeatureStyle> getGmlFeatureStyles() {
		if (gmlFeatureStyles == null) {
			gmlFeatureStyles = new EObjectWithInverseResolvingEList.ManyInverse<GmlFeatureStyle>(GmlFeatureStyle.class, this, InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES);
		}
		return gmlFeatureStyles;
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFeatureStyles()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				return ((InternalEList<?>)getGmlFeatureStyles()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				return getGmlFeatureStyles();
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				getGmlFeatureStyles().clear();
				getGmlFeatureStyles().addAll((Collection<? extends GmlFeatureStyle>)newValue);
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				getGmlFeatureStyles().clear();
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				return gmlFeatureStyles != null && !gmlFeatureStyles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GmlFeatureTypeImpl
