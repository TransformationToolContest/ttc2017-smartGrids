/**
 */
package gluemodel.substationStandard.Dataclasses.util;

import gluemodel.substationStandard.Dataclasses.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage
 * @generated
 */
public class DataclassesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataclassesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataclassesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataclassesPackage.eINSTANCE;
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
	protected DataclassesSwitch<Adapter> modelSwitch =
		new DataclassesSwitch<Adapter>() {
			@Override
			public Adapter caseTimeStamp(TimeStamp object) {
				return createTimeStampAdapter();
			}
			@Override
			public Adapter caseP_TimeStamp(P_TimeStamp object) {
				return createP_TimeStampAdapter();
			}
			@Override
			public Adapter caseTimeQuality(TimeQuality object) {
				return createTimeQualityAdapter();
			}
			@Override
			public Adapter caseAnalogueValue(AnalogueValue object) {
				return createAnalogueValueAdapter();
			}
			@Override
			public Adapter caseAngleReference(AngleReference object) {
				return createAngleReferenceAdapter();
			}
			@Override
			public Adapter caseBSControl(BSControl object) {
				return createBSControlAdapter();
			}
			@Override
			public Adapter caseCMVAngleReference(CMVAngleReference object) {
				return createCMVAngleReferenceAdapter();
			}
			@Override
			public Adapter caseControlOutput(ControlOutput object) {
				return createControlOutputAdapter();
			}
			@Override
			public Adapter caseCtlModels(CtlModels object) {
				return createCtlModelsAdapter();
			}
			@Override
			public Adapter caseCurveChar(CurveChar object) {
				return createCurveCharAdapter();
			}
			@Override
			public Adapter caseDirectionPhase(DirectionPhase object) {
				return createDirectionPhaseAdapter();
			}
			@Override
			public Adapter caseDPStatus(DPStatus object) {
				return createDPStatusAdapter();
			}
			@Override
			public Adapter caseFaultDirection(FaultDirection object) {
				return createFaultDirectionAdapter();
			}
			@Override
			public Adapter caseMagReference(MagReference object) {
				return createMagReferenceAdapter();
			}
			@Override
			public Adapter caseMultiplier(Multiplier object) {
				return createMultiplierAdapter();
			}
			@Override
			public Adapter caseOriginator(Originator object) {
				return createOriginatorAdapter();
			}
			@Override
			public Adapter caseOriginatorCategory(OriginatorCategory object) {
				return createOriginatorCategoryAdapter();
			}
			@Override
			public Adapter casePhaseReference(PhaseReference object) {
				return createPhaseReferenceAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter casePointArray(PointArray object) {
				return createPointArrayAdapter();
			}
			@Override
			public Adapter casePulseConfig(PulseConfig object) {
				return createPulseConfigAdapter();
			}
			@Override
			public Adapter caseQuality(Quality object) {
				return createQualityAdapter();
			}
			@Override
			public Adapter caseDetailQual(DetailQual object) {
				return createDetailQualAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseRangeConfig(RangeConfig object) {
				return createRangeConfigAdapter();
			}
			@Override
			public Adapter caseSboClasses(SboClasses object) {
				return createSboClassesAdapter();
			}
			@Override
			public Adapter caseScaledValueConfig(ScaledValueConfig object) {
				return createScaledValueConfigAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseSeverity(Severity object) {
				return createSeverityAdapter();
			}
			@Override
			public Adapter caseSlUnits(SlUnits object) {
				return createSlUnitsAdapter();
			}
			@Override
			public Adapter caseUnits(Units object) {
				return createUnitsAdapter();
			}
			@Override
			public Adapter caseValWithTrans(ValWithTrans object) {
				return createValWithTransAdapter();
			}
			@Override
			public Adapter caseVector(Vector object) {
				return createVectorAdapter();
			}
			@Override
			public Adapter caseVectorArray(VectorArray object) {
				return createVectorArrayAdapter();
			}
			@Override
			public Adapter caseC_PrimitiveCDC(C_PrimitiveCDC object) {
				return createC_PrimitiveCDCAdapter();
			}
			@Override
			public Adapter caseC_ComposedCDC(C_ComposedCDC object) {
				return createC_ComposedCDCAdapter();
			}
			@Override
			public Adapter caseStatusInfo(StatusInfo object) {
				return createStatusInfoAdapter();
			}
			@Override
			public Adapter caseSPS(SPS object) {
				return createSPSAdapter();
			}
			@Override
			public Adapter caseINS(INS object) {
				return createINSAdapter();
			}
			@Override
			public Adapter caseDPS(DPS object) {
				return createDPSAdapter();
			}
			@Override
			public Adapter caseACT(ACT object) {
				return createACTAdapter();
			}
			@Override
			public Adapter caseACD(ACD object) {
				return createACDAdapter();
			}
			@Override
			public Adapter caseSEC(SEC object) {
				return createSECAdapter();
			}
			@Override
			public Adapter caseBCR(BCR object) {
				return createBCRAdapter();
			}
			@Override
			public Adapter casePrimitiveMeasureAndInfo(PrimitiveMeasureAndInfo object) {
				return createPrimitiveMeasureAndInfoAdapter();
			}
			@Override
			public Adapter caseComposedMeasureAndInfo(ComposedMeasureAndInfo object) {
				return createComposedMeasureAndInfoAdapter();
			}
			@Override
			public Adapter caseMV(MV object) {
				return createMVAdapter();
			}
			@Override
			public Adapter caseCMV(CMV object) {
				return createCMVAdapter();
			}
			@Override
			public Adapter caseSAV(SAV object) {
				return createSAVAdapter();
			}
			@Override
			public Adapter caseDEL(DEL object) {
				return createDELAdapter();
			}
			@Override
			public Adapter caseWYE(WYE object) {
				return createWYEAdapter();
			}
			@Override
			public Adapter caseSEQ(SEQ object) {
				return createSEQAdapter();
			}
			@Override
			public Adapter caseHMV(HMV object) {
				return createHMVAdapter();
			}
			@Override
			public Adapter caseHYWE(HYWE object) {
				return createHYWEAdapter();
			}
			@Override
			public Adapter caseHDEL(HDEL object) {
				return createHDELAdapter();
			}
			@Override
			public Adapter caseControllableStatusInfo(ControllableStatusInfo object) {
				return createControllableStatusInfoAdapter();
			}
			@Override
			public Adapter caseSPC(SPC object) {
				return createSPCAdapter();
			}
			@Override
			public Adapter caseDPC(DPC object) {
				return createDPCAdapter();
			}
			@Override
			public Adapter caseINC(INC object) {
				return createINCAdapter();
			}
			@Override
			public Adapter caseBSC(BSC object) {
				return createBSCAdapter();
			}
			@Override
			public Adapter caseISC(ISC object) {
				return createISCAdapter();
			}
			@Override
			public Adapter caseControllableAnalogueInfo(ControllableAnalogueInfo object) {
				return createControllableAnalogueInfoAdapter();
			}
			@Override
			public Adapter caseAPC(APC object) {
				return createAPCAdapter();
			}
			@Override
			public Adapter caseSPG(SPG object) {
				return createSPGAdapter();
			}
			@Override
			public Adapter caseING(ING object) {
				return createINGAdapter();
			}
			@Override
			public Adapter caseAnalogueSettings(AnalogueSettings object) {
				return createAnalogueSettingsAdapter();
			}
			@Override
			public Adapter caseASG(ASG object) {
				return createASGAdapter();
			}
			@Override
			public Adapter caseCURVE(CURVE object) {
				return createCURVEAdapter();
			}
			@Override
			public Adapter caseDescriptionInfo(DescriptionInfo object) {
				return createDescriptionInfoAdapter();
			}
			@Override
			public Adapter caseDPL(DPL object) {
				return createDPLAdapter();
			}
			@Override
			public Adapter caseLPL(LPL object) {
				return createLPLAdapter();
			}
			@Override
			public Adapter caseCSD(CSD object) {
				return createCSDAdapter();
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
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.TimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.TimeStamp
	 * @generated
	 */
	public Adapter createTimeStampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.P_TimeStamp <em>PTime Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.P_TimeStamp
	 * @generated
	 */
	public Adapter createP_TimeStampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.TimeQuality <em>Time Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.TimeQuality
	 * @generated
	 */
	public Adapter createTimeQualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.AnalogueValue <em>Analogue Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.AnalogueValue
	 * @generated
	 */
	public Adapter createAnalogueValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.AngleReference <em>Angle Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.AngleReference
	 * @generated
	 */
	public Adapter createAngleReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.BSControl <em>BS Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.BSControl
	 * @generated
	 */
	public Adapter createBSControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.CMVAngleReference <em>CMV Angle Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.CMVAngleReference
	 * @generated
	 */
	public Adapter createCMVAngleReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ControlOutput <em>Control Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ControlOutput
	 * @generated
	 */
	public Adapter createControlOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.CtlModels <em>Ctl Models</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.CtlModels
	 * @generated
	 */
	public Adapter createCtlModelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.CurveChar <em>Curve Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.CurveChar
	 * @generated
	 */
	public Adapter createCurveCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.DirectionPhase <em>Direction Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.DirectionPhase
	 * @generated
	 */
	public Adapter createDirectionPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.DPStatus <em>DP Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.DPStatus
	 * @generated
	 */
	public Adapter createDPStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.FaultDirection <em>Fault Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.FaultDirection
	 * @generated
	 */
	public Adapter createFaultDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.MagReference <em>Mag Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.MagReference
	 * @generated
	 */
	public Adapter createMagReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.Multiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.Multiplier
	 * @generated
	 */
	public Adapter createMultiplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.Originator <em>Originator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.Originator
	 * @generated
	 */
	public Adapter createOriginatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.OriginatorCategory <em>Originator Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.OriginatorCategory
	 * @generated
	 */
	public Adapter createOriginatorCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.PhaseReference <em>Phase Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.PhaseReference
	 * @generated
	 */
	public Adapter createPhaseReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.PointArray <em>Point Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.PointArray
	 * @generated
	 */
	public Adapter createPointArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.PulseConfig <em>Pulse Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.PulseConfig
	 * @generated
	 */
	public Adapter createPulseConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.Quality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.Quality
	 * @generated
	 */
	public Adapter createQualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.DetailQual <em>Detail Qual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual
	 * @generated
	 */
	public Adapter createDetailQualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.RangeConfig <em>Range Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.RangeConfig
	 * @generated
	 */
	public Adapter createRangeConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.SboClasses <em>Sbo Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.SboClasses
	 * @generated
	 */
	public Adapter createSboClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ScaledValueConfig <em>Scaled Value Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ScaledValueConfig
	 * @generated
	 */
	public Adapter createScaledValueConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.Severity
	 * @generated
	 */
	public Adapter createSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.SlUnits <em>Sl Units</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.SlUnits
	 * @generated
	 */
	public Adapter createSlUnitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.Units
	 * @generated
	 */
	public Adapter createUnitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ValWithTrans <em>Val With Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ValWithTrans
	 * @generated
	 */
	public Adapter createValWithTransAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.Vector
	 * @generated
	 */
	public Adapter createVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.VectorArray <em>Vector Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.VectorArray
	 * @generated
	 */
	public Adapter createVectorArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC <em>CPrimitive CDC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC
	 * @generated
	 */
	public Adapter createC_PrimitiveCDCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.C_ComposedCDC <em>CComposed CDC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.C_ComposedCDC
	 * @generated
	 */
	public Adapter createC_ComposedCDCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.StatusInfo <em>Status Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.StatusInfo
	 * @generated
	 */
	public Adapter createStatusInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.SPS <em>SPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.SPS
	 * @generated
	 */
	public Adapter createSPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.INS <em>INS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.INS
	 * @generated
	 */
	public Adapter createINSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.DPS <em>DPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.DPS
	 * @generated
	 */
	public Adapter createDPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ACT <em>ACT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ACT
	 * @generated
	 */
	public Adapter createACTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ACD <em>ACD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ACD
	 * @generated
	 */
	public Adapter createACDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.SEC <em>SEC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.SEC
	 * @generated
	 */
	public Adapter createSECAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.BCR <em>BCR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.BCR
	 * @generated
	 */
	public Adapter createBCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo <em>Primitive Measure And Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo
	 * @generated
	 */
	public Adapter createPrimitiveMeasureAndInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ComposedMeasureAndInfo <em>Composed Measure And Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ComposedMeasureAndInfo
	 * @generated
	 */
	public Adapter createComposedMeasureAndInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.MV <em>MV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.MV
	 * @generated
	 */
	public Adapter createMVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.CMV <em>CMV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.CMV
	 * @generated
	 */
	public Adapter createCMVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.SAV <em>SAV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.SAV
	 * @generated
	 */
	public Adapter createSAVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.DEL <em>DEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.DEL
	 * @generated
	 */
	public Adapter createDELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.WYE <em>WYE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.WYE
	 * @generated
	 */
	public Adapter createWYEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.SEQ <em>SEQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.SEQ
	 * @generated
	 */
	public Adapter createSEQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.HMV <em>HMV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.HMV
	 * @generated
	 */
	public Adapter createHMVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.HYWE <em>HYWE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE
	 * @generated
	 */
	public Adapter createHYWEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.HDEL <em>HDEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL
	 * @generated
	 */
	public Adapter createHDELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo <em>Controllable Status Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo
	 * @generated
	 */
	public Adapter createControllableStatusInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.SPC <em>SPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.SPC
	 * @generated
	 */
	public Adapter createSPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.DPC <em>DPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.DPC
	 * @generated
	 */
	public Adapter createDPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.INC <em>INC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.INC
	 * @generated
	 */
	public Adapter createINCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.BSC <em>BSC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.BSC
	 * @generated
	 */
	public Adapter createBSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ISC <em>ISC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ISC
	 * @generated
	 */
	public Adapter createISCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ControllableAnalogueInfo <em>Controllable Analogue Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableAnalogueInfo
	 * @generated
	 */
	public Adapter createControllableAnalogueInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.APC <em>APC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.APC
	 * @generated
	 */
	public Adapter createAPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.SPG <em>SPG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.SPG
	 * @generated
	 */
	public Adapter createSPGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ING <em>ING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ING
	 * @generated
	 */
	public Adapter createINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.AnalogueSettings <em>Analogue Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.AnalogueSettings
	 * @generated
	 */
	public Adapter createAnalogueSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.ASG <em>ASG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.ASG
	 * @generated
	 */
	public Adapter createASGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.CURVE <em>CURVE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.CURVE
	 * @generated
	 */
	public Adapter createCURVEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.DescriptionInfo <em>Description Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.DescriptionInfo
	 * @generated
	 */
	public Adapter createDescriptionInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.DPL <em>DPL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.DPL
	 * @generated
	 */
	public Adapter createDPLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.LPL <em>LPL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.LPL
	 * @generated
	 */
	public Adapter createLPLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.Dataclasses.CSD <em>CSD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.Dataclasses.CSD
	 * @generated
	 */
	public Adapter createCSDAdapter() {
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

} //DataclassesAdapterFactory
