/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol;
import CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol;
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
 * An implementation of the model object '<em><b>Gml Base Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlBaseSymbolImpl#getGmlSymbols <em>Gml Symbols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlBaseSymbolImpl extends IdentifiedObjectImpl implements GmlBaseSymbol {
	/**
	 * The cached value of the '{@link #getGmlSymbols() <em>Gml Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlSymbol> gmlSymbols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlBaseSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_BASE_SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlSymbol> getGmlSymbols() {
		if (gmlSymbols == null) {
			gmlSymbols = new EObjectWithInverseResolvingEList<GmlSymbol>(GmlSymbol.class, this, InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS, InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL);
		}
		return gmlSymbols;
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
			case InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSymbols()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS:
				return ((InternalEList<?>)getGmlSymbols()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS:
				return getGmlSymbols();
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
			case InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS:
				getGmlSymbols().clear();
				getGmlSymbols().addAll((Collection<? extends GmlSymbol>)newValue);
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
			case InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS:
				getGmlSymbols().clear();
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
			case InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS:
				return gmlSymbols != null && !gmlSymbols.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GmlBaseSymbolImpl
