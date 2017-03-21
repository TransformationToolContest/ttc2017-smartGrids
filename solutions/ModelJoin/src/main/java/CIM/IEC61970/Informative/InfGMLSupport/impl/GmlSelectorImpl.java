/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;
import CIM.IEC61970.Informative.InfGMLSupport.GmlSelector;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSelectorImpl#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSelectorImpl#getChangeItems <em>Change Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlSelectorImpl extends IdentifiedObjectImpl implements GmlSelector {
	/**
	 * The cached value of the '{@link #getGmlDiagramObjects() <em>Gml Diagram Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlDiagramObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlDiagramObject> gmlDiagramObjects;

	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeItem> changeItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlDiagramObject> getGmlDiagramObjects() {
		if (gmlDiagramObjects == null) {
			gmlDiagramObjects = new EObjectWithInverseResolvingEList.ManyInverse<GmlDiagramObject>(GmlDiagramObject.class, this, InfGMLSupportPackage.GML_SELECTOR__GML_DIAGRAM_OBJECTS, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS);
		}
		return gmlDiagramObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__GML_SELECTOR);
		}
		return changeItems;
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
			case InfGMLSupportPackage.GML_SELECTOR__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlDiagramObjects()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_SELECTOR__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getGmlDiagramObjects()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_SELECTOR__GML_DIAGRAM_OBJECTS:
				return getGmlDiagramObjects();
			case InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS:
				return getChangeItems();
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
			case InfGMLSupportPackage.GML_SELECTOR__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				getGmlDiagramObjects().addAll((Collection<? extends GmlDiagramObject>)newValue);
				return;
			case InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
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
			case InfGMLSupportPackage.GML_SELECTOR__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				return;
			case InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS:
				getChangeItems().clear();
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
			case InfGMLSupportPackage.GML_SELECTOR__GML_DIAGRAM_OBJECTS:
				return gmlDiagramObjects != null && !gmlDiagramObjects.isEmpty();
			case InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GmlSelectorImpl
