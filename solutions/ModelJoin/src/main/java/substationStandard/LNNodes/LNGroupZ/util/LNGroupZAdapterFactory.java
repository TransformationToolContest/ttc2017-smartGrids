/**
 */
package substationStandard.LNNodes.LNGroupZ.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import substationStandard.LNNodes.DomainLNs.DomainLN;

import substationStandard.LNNodes.LNGroupZ.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage
 * @generated
 */
public class LNGroupZAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupZPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupZAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LNGroupZPackage.eINSTANCE;
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
	protected LNGroupZSwitch<Adapter> modelSwitch =
		new LNGroupZSwitch<Adapter>() {
			@Override
			public Adapter caseGroupZ(GroupZ object) {
				return createGroupZAdapter();
			}
			@Override
			public Adapter caseZAXN(ZAXN object) {
				return createZAXNAdapter();
			}
			@Override
			public Adapter caseZGIL(ZGIL object) {
				return createZGILAdapter();
			}
			@Override
			public Adapter caseZBAT(ZBAT object) {
				return createZBATAdapter();
			}
			@Override
			public Adapter caseZLIN(ZLIN object) {
				return createZLINAdapter();
			}
			@Override
			public Adapter caseZMOT(ZMOT object) {
				return createZMOTAdapter();
			}
			@Override
			public Adapter caseZREA(ZREA object) {
				return createZREAAdapter();
			}
			@Override
			public Adapter caseZBSH(ZBSH object) {
				return createZBSHAdapter();
			}
			@Override
			public Adapter caseZRRC(ZRRC object) {
				return createZRRCAdapter();
			}
			@Override
			public Adapter caseZSAR(ZSAR object) {
				return createZSARAdapter();
			}
			@Override
			public Adapter caseZTCF(ZTCF object) {
				return createZTCFAdapter();
			}
			@Override
			public Adapter caseZTCR(ZTCR object) {
				return createZTCRAdapter();
			}
			@Override
			public Adapter caseZCAB(ZCAB object) {
				return createZCABAdapter();
			}
			@Override
			public Adapter caseZCAP(ZCAP object) {
				return createZCAPAdapter();
			}
			@Override
			public Adapter caseZCON(ZCON object) {
				return createZCONAdapter();
			}
			@Override
			public Adapter caseZGEN(ZGEN object) {
				return createZGENAdapter();
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
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.GroupZ <em>Group Z</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.GroupZ
	 * @generated
	 */
	public Adapter createGroupZAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZAXN <em>ZAXN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZAXN
	 * @generated
	 */
	public Adapter createZAXNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZGIL <em>ZGIL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZGIL
	 * @generated
	 */
	public Adapter createZGILAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZBAT <em>ZBAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZBAT
	 * @generated
	 */
	public Adapter createZBATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZLIN <em>ZLIN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZLIN
	 * @generated
	 */
	public Adapter createZLINAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZMOT <em>ZMOT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZMOT
	 * @generated
	 */
	public Adapter createZMOTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZREA <em>ZREA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZREA
	 * @generated
	 */
	public Adapter createZREAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZBSH <em>ZBSH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZBSH
	 * @generated
	 */
	public Adapter createZBSHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZRRC <em>ZRRC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZRRC
	 * @generated
	 */
	public Adapter createZRRCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZSAR <em>ZSAR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZSAR
	 * @generated
	 */
	public Adapter createZSARAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZTCF <em>ZTCF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZTCF
	 * @generated
	 */
	public Adapter createZTCFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZTCR <em>ZTCR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZTCR
	 * @generated
	 */
	public Adapter createZTCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZCAB <em>ZCAB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZCAB
	 * @generated
	 */
	public Adapter createZCABAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZCAP <em>ZCAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZCAP
	 * @generated
	 */
	public Adapter createZCAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZCON <em>ZCON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZCON
	 * @generated
	 */
	public Adapter createZCONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupZ.ZGEN <em>ZGEN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupZ.ZGEN
	 * @generated
	 */
	public Adapter createZGENAdapter() {
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

} //LNGroupZAdapterFactory
