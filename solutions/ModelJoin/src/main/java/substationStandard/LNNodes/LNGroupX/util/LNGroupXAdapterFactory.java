/**
 */
package substationStandard.LNNodes.LNGroupX.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import substationStandard.LNNodes.DomainLNs.DomainLN;

import substationStandard.LNNodes.LNGroupX.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage
 * @generated
 */
public class LNGroupXAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupXPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupXAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LNGroupXPackage.eINSTANCE;
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
	protected LNGroupXSwitch<Adapter> modelSwitch =
		new LNGroupXSwitch<Adapter>() {
			@Override
			public Adapter caseGroupX(GroupX object) {
				return createGroupXAdapter();
			}
			@Override
			public Adapter caseXCBR(XCBR object) {
				return createXCBRAdapter();
			}
			@Override
			public Adapter caseXSWI(XSWI object) {
				return createXSWIAdapter();
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
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupX.GroupX <em>Group X</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX
	 * @generated
	 */
	public Adapter createGroupXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupX.XCBR <em>XCBR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupX.XCBR
	 * @generated
	 */
	public Adapter createXCBRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupX.XSWI <em>XSWI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupX.XSWI
	 * @generated
	 */
	public Adapter createXSWIAdapter() {
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

} //LNGroupXAdapterFactory
