/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.APC;
import gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC;
import gluemodel.substationStandard.Dataclasses.ControllableAnalogueInfo;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controllable Analogue Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ControllableAnalogueInfoImpl#getAPC <em>APC</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ControllableAnalogueInfoImpl#getC_PrimitiveCDC <em>CPrimitive CDC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllableAnalogueInfoImpl extends MinimalEObjectImpl.Container implements ControllableAnalogueInfo {
	/**
	 * The cached value of the '{@link #getAPC() <em>APC</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPC()
	 * @generated
	 * @ordered
	 */
	protected EList<APC> apc;

	/**
	 * The cached value of the '{@link #getC_PrimitiveCDC() <em>CPrimitive CDC</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_PrimitiveCDC()
	 * @generated
	 * @ordered
	 */
	protected EList<C_PrimitiveCDC> c_PrimitiveCDC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllableAnalogueInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.CONTROLLABLE_ANALOGUE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APC> getAPC() {
		if (apc == null) {
			apc = new EObjectResolvingEList<APC>(APC.class, this, DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__APC);
		}
		return apc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C_PrimitiveCDC> getC_PrimitiveCDC() {
		if (c_PrimitiveCDC == null) {
			c_PrimitiveCDC = new EObjectResolvingEList<C_PrimitiveCDC>(C_PrimitiveCDC.class, this, DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__CPRIMITIVE_CDC);
		}
		return c_PrimitiveCDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__APC:
				return getAPC();
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__CPRIMITIVE_CDC:
				return getC_PrimitiveCDC();
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
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__APC:
				getAPC().clear();
				getAPC().addAll((Collection<? extends APC>)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__CPRIMITIVE_CDC:
				getC_PrimitiveCDC().clear();
				getC_PrimitiveCDC().addAll((Collection<? extends C_PrimitiveCDC>)newValue);
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
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__APC:
				getAPC().clear();
				return;
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__CPRIMITIVE_CDC:
				getC_PrimitiveCDC().clear();
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
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__APC:
				return apc != null && !apc.isEmpty();
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO__CPRIMITIVE_CDC:
				return c_PrimitiveCDC != null && !c_PrimitiveCDC.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControllableAnalogueInfoImpl
