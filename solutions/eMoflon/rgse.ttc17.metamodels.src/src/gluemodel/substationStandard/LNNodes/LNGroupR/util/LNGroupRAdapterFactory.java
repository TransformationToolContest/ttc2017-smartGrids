/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR.util;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN;

import gluemodel.substationStandard.LNNodes.LNGroupR.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage
 * @generated
 */
public class LNGroupRAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupRPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupRAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LNGroupRPackage.eINSTANCE;
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
	protected LNGroupRSwitch<Adapter> modelSwitch =
		new LNGroupRSwitch<Adapter>() {
			@Override
			public Adapter caseGroupR(GroupR object) {
				return createGroupRAdapter();
			}
			@Override
			public Adapter caseRDRE(RDRE object) {
				return createRDREAdapter();
			}
			@Override
			public Adapter caseRDRS(RDRS object) {
				return createRDRSAdapter();
			}
			@Override
			public Adapter caseRPSB(RPSB object) {
				return createRPSBAdapter();
			}
			@Override
			public Adapter caseRBRF(RBRF object) {
				return createRBRFAdapter();
			}
			@Override
			public Adapter caseRADR(RADR object) {
				return createRADRAdapter();
			}
			@Override
			public Adapter caseRBDR(RBDR object) {
				return createRBDRAdapter();
			}
			@Override
			public Adapter caseRDIR(RDIR object) {
				return createRDIRAdapter();
			}
			@Override
			public Adapter caseRFLO(RFLO object) {
				return createRFLOAdapter();
			}
			@Override
			public Adapter caseRREC(RREC object) {
				return createRRECAdapter();
			}
			@Override
			public Adapter caseRSYN(RSYN object) {
				return createRSYNAdapter();
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
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.GroupR <em>Group R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.GroupR
	 * @generated
	 */
	public Adapter createGroupRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE <em>RDRE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE
	 * @generated
	 */
	public Adapter createRDREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRS <em>RDRS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRS
	 * @generated
	 */
	public Adapter createRDRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB <em>RPSB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB
	 * @generated
	 */
	public Adapter createRPSBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF <em>RBRF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF
	 * @generated
	 */
	public Adapter createRBRFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR <em>RADR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR
	 * @generated
	 */
	public Adapter createRADRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR <em>RBDR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBDR
	 * @generated
	 */
	public Adapter createRBDRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR <em>RDIR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR
	 * @generated
	 */
	public Adapter createRDIRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO <em>RFLO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO
	 * @generated
	 */
	public Adapter createRFLOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC <em>RREC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC
	 * @generated
	 */
	public Adapter createRRECAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN <em>RSYN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN
	 * @generated
	 */
	public Adapter createRSYNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN <em>Domain LN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN
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

} //LNGroupRAdapterFactory
