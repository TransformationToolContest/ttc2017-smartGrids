/**
 */
package substationStandard.Dataclasses.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import substationStandard.Dataclasses.CSD;
import substationStandard.Dataclasses.C_PrimitiveCDC;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.DescriptionInfo;
import substationStandard.Dataclasses.LPL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.DescriptionInfoImpl#getDPL <em>DPL</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DescriptionInfoImpl#getLPL <em>LPL</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DescriptionInfoImpl#getCSD <em>CSD</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DescriptionInfoImpl#getC_PrimitiveCDC <em>CPrimitive CDC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionInfoImpl extends MinimalEObjectImpl.Container implements DescriptionInfo {
	/**
	 * The cached value of the '{@link #getDPL() <em>DPL</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPL()
	 * @generated
	 * @ordered
	 */
	protected EList<DPL> dpl;

	/**
	 * The cached value of the '{@link #getLPL() <em>LPL</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPL()
	 * @generated
	 * @ordered
	 */
	protected EList<LPL> lpl;

	/**
	 * The cached value of the '{@link #getCSD() <em>CSD</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSD()
	 * @generated
	 * @ordered
	 */
	protected EList<CSD> csd;

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
	protected DescriptionInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.DESCRIPTION_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DPL> getDPL() {
		if (dpl == null) {
			dpl = new EObjectResolvingEList<DPL>(DPL.class, this, DataclassesPackage.DESCRIPTION_INFO__DPL);
		}
		return dpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPL> getLPL() {
		if (lpl == null) {
			lpl = new EObjectResolvingEList<LPL>(LPL.class, this, DataclassesPackage.DESCRIPTION_INFO__LPL);
		}
		return lpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSD> getCSD() {
		if (csd == null) {
			csd = new EObjectResolvingEList<CSD>(CSD.class, this, DataclassesPackage.DESCRIPTION_INFO__CSD);
		}
		return csd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C_PrimitiveCDC> getC_PrimitiveCDC() {
		if (c_PrimitiveCDC == null) {
			c_PrimitiveCDC = new EObjectResolvingEList<C_PrimitiveCDC>(C_PrimitiveCDC.class, this, DataclassesPackage.DESCRIPTION_INFO__CPRIMITIVE_CDC);
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
			case DataclassesPackage.DESCRIPTION_INFO__DPL:
				return getDPL();
			case DataclassesPackage.DESCRIPTION_INFO__LPL:
				return getLPL();
			case DataclassesPackage.DESCRIPTION_INFO__CSD:
				return getCSD();
			case DataclassesPackage.DESCRIPTION_INFO__CPRIMITIVE_CDC:
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
			case DataclassesPackage.DESCRIPTION_INFO__DPL:
				getDPL().clear();
				getDPL().addAll((Collection<? extends DPL>)newValue);
				return;
			case DataclassesPackage.DESCRIPTION_INFO__LPL:
				getLPL().clear();
				getLPL().addAll((Collection<? extends LPL>)newValue);
				return;
			case DataclassesPackage.DESCRIPTION_INFO__CSD:
				getCSD().clear();
				getCSD().addAll((Collection<? extends CSD>)newValue);
				return;
			case DataclassesPackage.DESCRIPTION_INFO__CPRIMITIVE_CDC:
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
			case DataclassesPackage.DESCRIPTION_INFO__DPL:
				getDPL().clear();
				return;
			case DataclassesPackage.DESCRIPTION_INFO__LPL:
				getLPL().clear();
				return;
			case DataclassesPackage.DESCRIPTION_INFO__CSD:
				getCSD().clear();
				return;
			case DataclassesPackage.DESCRIPTION_INFO__CPRIMITIVE_CDC:
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
			case DataclassesPackage.DESCRIPTION_INFO__DPL:
				return dpl != null && !dpl.isEmpty();
			case DataclassesPackage.DESCRIPTION_INFO__LPL:
				return lpl != null && !lpl.isEmpty();
			case DataclassesPackage.DESCRIPTION_INFO__CSD:
				return csd != null && !csd.isEmpty();
			case DataclassesPackage.DESCRIPTION_INFO__CPRIMITIVE_CDC:
				return c_PrimitiveCDC != null && !c_PrimitiveCDC.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DescriptionInfoImpl
