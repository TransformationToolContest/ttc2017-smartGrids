/**
 */
package substationStandard.LNNodes.LNGroupA.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import substationStandard.LNNodes.DomainLNs.DomainLN;

import substationStandard.LNNodes.LNGroupA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage
 * @generated
 */
public class LNGroupAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LNGroupAPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LNGroupASwitch<Adapter> modelSwitch =
		new LNGroupASwitch<Adapter>() {
			@Override
			public Adapter caseGroupA(GroupA object) {
				return createGroupAAdapter();
			}
			@Override
			public Adapter caseANCR(ANCR object) {
				return createANCRAdapter();
			}
			@Override
			public Adapter caseARCO(ARCO object) {
				return createARCOAdapter();
			}
			@Override
			public Adapter caseATCC(ATCC object) {
				return createATCCAdapter();
			}
			@Override
			public Adapter caseAVCO(AVCO object) {
				return createAVCOAdapter();
			}
			@Override
			public Adapter caseDomainLN(DomainLN object) {
				return createDomainLNAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupA.GroupA <em>Group A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupA.GroupA
	 * @generated
	 */
	public Adapter createGroupAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupA.ANCR <em>ANCR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupA.ANCR
	 * @generated
	 */
	public Adapter createANCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupA.ARCO <em>ARCO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupA.ARCO
	 * @generated
	 */
	public Adapter createARCOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupA.ATCC <em>ATCC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupA.ATCC
	 * @generated
	 */
	public Adapter createATCCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupA.AVCO <em>AVCO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupA.AVCO
	 * @generated
	 */
	public Adapter createAVCOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.DomainLNs.DomainLN <em>Domain LN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.DomainLNs.DomainLN
	 * @generated
	 */
	public Adapter createDomainLNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LNGroupAAdapterFactory
