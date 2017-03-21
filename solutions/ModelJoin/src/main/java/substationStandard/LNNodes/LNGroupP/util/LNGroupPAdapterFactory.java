/**
 */
package substationStandard.LNNodes.LNGroupP.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import substationStandard.LNNodes.DomainLNs.DomainLN;

import substationStandard.LNNodes.LNGroupP.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage
 * @generated
 */
public class LNGroupPAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupPPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupPAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LNGroupPPackage.eINSTANCE;
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
	protected LNGroupPSwitch<Adapter> modelSwitch =
		new LNGroupPSwitch<Adapter>() {
			@Override
			public Adapter caseGroupP(GroupP object) {
				return createGroupPAdapter();
			}
			@Override
			public Adapter casePDIF(PDIF object) {
				return createPDIFAdapter();
			}
			@Override
			public Adapter casePDIR(PDIR object) {
				return createPDIRAdapter();
			}
			@Override
			public Adapter casePFRC(PFRC object) {
				return createPFRCAdapter();
			}
			@Override
			public Adapter casePHAR(PHAR object) {
				return createPHARAdapter();
			}
			@Override
			public Adapter casePOPF(POPF object) {
				return createPOPFAdapter();
			}
			@Override
			public Adapter casePPAM(PPAM object) {
				return createPPAMAdapter();
			}
			@Override
			public Adapter casePDIS(PDIS object) {
				return createPDISAdapter();
			}
			@Override
			public Adapter casePDOP(PDOP object) {
				return createPDOPAdapter();
			}
			@Override
			public Adapter casePHIZ(PHIZ object) {
				return createPHIZAdapter();
			}
			@Override
			public Adapter casePIOC(PIOC object) {
				return createPIOCAdapter();
			}
			@Override
			public Adapter casePMRI(PMRI object) {
				return createPMRIAdapter();
			}
			@Override
			public Adapter casePMSS(PMSS object) {
				return createPMSSAdapter();
			}
			@Override
			public Adapter casePSCH(PSCH object) {
				return createPSCHAdapter();
			}
			@Override
			public Adapter casePSDE(PSDE object) {
				return createPSDEAdapter();
			}
			@Override
			public Adapter casePDUP(PDUP object) {
				return createPDUPAdapter();
			}
			@Override
			public Adapter casePTEF(PTEF object) {
				return createPTEFAdapter();
			}
			@Override
			public Adapter casePTOC(PTOC object) {
				return createPTOCAdapter();
			}
			@Override
			public Adapter casePTOF(PTOF object) {
				return createPTOFAdapter();
			}
			@Override
			public Adapter casePTOV(PTOV object) {
				return createPTOVAdapter();
			}
			@Override
			public Adapter casePTTR(PTTR object) {
				return createPTTRAdapter();
			}
			@Override
			public Adapter casePTUC(PTUC object) {
				return createPTUCAdapter();
			}
			@Override
			public Adapter casePTUF(PTUF object) {
				return createPTUFAdapter();
			}
			@Override
			public Adapter casePVOC(PVOC object) {
				return createPVOCAdapter();
			}
			@Override
			public Adapter casePVPH(PVPH object) {
				return createPVPHAdapter();
			}
			@Override
			public Adapter casePTRC(PTRC object) {
				return createPTRCAdapter();
			}
			@Override
			public Adapter casePTUV(PTUV object) {
				return createPTUVAdapter();
			}
			@Override
			public Adapter casePUPF(PUPF object) {
				return createPUPFAdapter();
			}
			@Override
			public Adapter casePZSU(PZSU object) {
				return createPZSUAdapter();
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
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.GroupP <em>Group P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.GroupP
	 * @generated
	 */
	public Adapter createGroupPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PDIF <em>PDIF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PDIF
	 * @generated
	 */
	public Adapter createPDIFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PDIR <em>PDIR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PDIR
	 * @generated
	 */
	public Adapter createPDIRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PFRC <em>PFRC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PFRC
	 * @generated
	 */
	public Adapter createPFRCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PHAR <em>PHAR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PHAR
	 * @generated
	 */
	public Adapter createPHARAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.POPF <em>POPF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.POPF
	 * @generated
	 */
	public Adapter createPOPFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PPAM <em>PPAM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PPAM
	 * @generated
	 */
	public Adapter createPPAMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PDIS <em>PDIS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PDIS
	 * @generated
	 */
	public Adapter createPDISAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PDOP <em>PDOP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PDOP
	 * @generated
	 */
	public Adapter createPDOPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PHIZ <em>PHIZ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PHIZ
	 * @generated
	 */
	public Adapter createPHIZAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PIOC <em>PIOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PIOC
	 * @generated
	 */
	public Adapter createPIOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PMRI <em>PMRI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PMRI
	 * @generated
	 */
	public Adapter createPMRIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PMSS <em>PMSS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PMSS
	 * @generated
	 */
	public Adapter createPMSSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PSCH <em>PSCH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PSCH
	 * @generated
	 */
	public Adapter createPSCHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PSDE <em>PSDE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PSDE
	 * @generated
	 */
	public Adapter createPSDEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PDUP <em>PDUP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PDUP
	 * @generated
	 */
	public Adapter createPDUPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PTEF <em>PTEF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PTEF
	 * @generated
	 */
	public Adapter createPTEFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PTOC <em>PTOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PTOC
	 * @generated
	 */
	public Adapter createPTOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PTOF <em>PTOF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PTOF
	 * @generated
	 */
	public Adapter createPTOFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PTOV <em>PTOV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PTOV
	 * @generated
	 */
	public Adapter createPTOVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PTTR <em>PTTR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PTTR
	 * @generated
	 */
	public Adapter createPTTRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PTUC <em>PTUC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PTUC
	 * @generated
	 */
	public Adapter createPTUCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PTUF <em>PTUF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PTUF
	 * @generated
	 */
	public Adapter createPTUFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PVOC <em>PVOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PVOC
	 * @generated
	 */
	public Adapter createPVOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PVPH <em>PVPH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PVPH
	 * @generated
	 */
	public Adapter createPVPHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PTRC <em>PTRC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PTRC
	 * @generated
	 */
	public Adapter createPTRCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PTUV <em>PTUV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PTUV
	 * @generated
	 */
	public Adapter createPTUVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PUPF <em>PUPF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PUPF
	 * @generated
	 */
	public Adapter createPUPFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link substationStandard.LNNodes.LNGroupP.PZSU <em>PZSU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see substationStandard.LNNodes.LNGroupP.PZSU
	 * @generated
	 */
	public Adapter createPZSUAdapter() {
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

} //LNGroupPAdapterFactory
