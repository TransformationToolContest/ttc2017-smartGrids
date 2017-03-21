/**
 */
package CIM.IEC61970.Informative.EnergyScheduling.impl;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.TieLine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicImpl#getTieLines <em>Tie Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicImpl extends EnergyTransactionImpl implements CIM.IEC61970.Informative.EnergyScheduling.Dynamic {
	/**
	 * The cached value of the '{@link #getTieLines() <em>Tie Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TieLine> tieLines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.DYNAMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TieLine> getTieLines() {
		if (tieLines == null) {
			tieLines = new EObjectWithInverseResolvingEList<TieLine>(TieLine.class, this, EnergySchedulingPackage.DYNAMIC__TIE_LINES, EnergySchedulingPackage.TIE_LINE__DYNAMIC_ENERGY_TRANSACTION);
		}
		return tieLines;
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
			case EnergySchedulingPackage.DYNAMIC__TIE_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTieLines()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.DYNAMIC__TIE_LINES:
				return ((InternalEList<?>)getTieLines()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.DYNAMIC__TIE_LINES:
				return getTieLines();
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
			case EnergySchedulingPackage.DYNAMIC__TIE_LINES:
				getTieLines().clear();
				getTieLines().addAll((Collection<? extends TieLine>)newValue);
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
			case EnergySchedulingPackage.DYNAMIC__TIE_LINES:
				getTieLines().clear();
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
			case EnergySchedulingPackage.DYNAMIC__TIE_LINES:
				return tieLines != null && !tieLines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicImpl
