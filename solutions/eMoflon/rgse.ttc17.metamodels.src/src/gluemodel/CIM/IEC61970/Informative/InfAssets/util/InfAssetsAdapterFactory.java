/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.util;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetContainer;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;
import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Core.Curve;
import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfAssets.*;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Role;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage
 * @generated
 */
public class InfAssetsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfAssetsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InfAssetsPackage.eINSTANCE;
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
	protected InfAssetsSwitch<Adapter> modelSwitch =
		new InfAssetsSwitch<Adapter>() {
			@Override
			public Adapter caseOrgAssetRole(OrgAssetRole object) {
				return createOrgAssetRoleAdapter();
			}
			@Override
			public Adapter caseShuntCompensatorInfo(ShuntCompensatorInfo object) {
				return createShuntCompensatorInfoAdapter();
			}
			@Override
			public Adapter casePotentialTransformerInfo(PotentialTransformerInfo object) {
				return createPotentialTransformerInfoAdapter();
			}
			@Override
			public Adapter caseDuctInfo(DuctInfo object) {
				return createDuctInfoAdapter();
			}
			@Override
			public Adapter caseDocAssetRole(DocAssetRole object) {
				return createDocAssetRoleAdapter();
			}
			@Override
			public Adapter caseMountingPoint(MountingPoint object) {
				return createMountingPointAdapter();
			}
			@Override
			public Adapter caseSVCInfo(SVCInfo object) {
				return createSVCInfoAdapter();
			}
			@Override
			public Adapter caseFinancialInfo(FinancialInfo object) {
				return createFinancialInfoAdapter();
			}
			@Override
			public Adapter caseShuntImpedanceInfo(ShuntImpedanceInfo object) {
				return createShuntImpedanceInfoAdapter();
			}
			@Override
			public Adapter caseCabinet(Cabinet object) {
				return createCabinetAdapter();
			}
			@Override
			public Adapter caseComEquipmentInfo(ComEquipmentInfo object) {
				return createComEquipmentInfoAdapter();
			}
			@Override
			public Adapter caseBreakerInfo(BreakerInfo object) {
				return createBreakerInfoAdapter();
			}
			@Override
			public Adapter caseGeneratorAsset(GeneratorAsset object) {
				return createGeneratorAssetAdapter();
			}
			@Override
			public Adapter caseElectricalInfo(ElectricalInfo object) {
				return createElectricalInfoAdapter();
			}
			@Override
			public Adapter caseWindingInsulation(WindingInsulation object) {
				return createWindingInsulationAdapter();
			}
			@Override
			public Adapter caseConductorAsset(ConductorAsset object) {
				return createConductorAssetAdapter();
			}
			@Override
			public Adapter caseTransformerAsset(TransformerAsset object) {
				return createTransformerAssetAdapter();
			}
			@Override
			public Adapter caseAssetPropertyCurve(AssetPropertyCurve object) {
				return createAssetPropertyCurveAdapter();
			}
			@Override
			public Adapter casePowerRating(PowerRating object) {
				return createPowerRatingAdapter();
			}
			@Override
			public Adapter caseAssetInfo(AssetInfo object) {
				return createAssetInfoAdapter();
			}
			@Override
			public Adapter caseJointInfo(JointInfo object) {
				return createJointInfoAdapter();
			}
			@Override
			public Adapter caseMountingConnection(MountingConnection object) {
				return createMountingConnectionAdapter();
			}
			@Override
			public Adapter caseSubstationInfo(SubstationInfo object) {
				return createSubstationInfoAdapter();
			}
			@Override
			public Adapter caseProtectionEquipmentInfo(ProtectionEquipmentInfo object) {
				return createProtectionEquipmentInfoAdapter();
			}
			@Override
			public Adapter caseSurgeProtectorInfo(SurgeProtectorInfo object) {
				return createSurgeProtectorInfoAdapter();
			}
			@Override
			public Adapter caseUndergroundStructureInfo(UndergroundStructureInfo object) {
				return createUndergroundStructureInfoAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseMedium(Medium object) {
				return createMediumAdapter();
			}
			@Override
			public Adapter caseStructureInfo(StructureInfo object) {
				return createStructureInfoAdapter();
			}
			@Override
			public Adapter caseFACTSDeviceInfo(FACTSDeviceInfo object) {
				return createFACTSDeviceInfoAdapter();
			}
			@Override
			public Adapter caseSwitchInfo(SwitchInfo object) {
				return createSwitchInfoAdapter();
			}
			@Override
			public Adapter caseProcedureDataSet(ProcedureDataSet object) {
				return createProcedureDataSetAdapter();
			}
			@Override
			public Adapter caseStreetlightInfo(StreetlightInfo object) {
				return createStreetlightInfoAdapter();
			}
			@Override
			public Adapter caseDimensionsInfo(DimensionsInfo object) {
				return createDimensionsInfoAdapter();
			}
			@Override
			public Adapter caseWorkEquipmentInfo(WorkEquipmentInfo object) {
				return createWorkEquipmentInfoAdapter();
			}
			@Override
			public Adapter caseCurrentTransformerInfo(CurrentTransformerInfo object) {
				return createCurrentTransformerInfoAdapter();
			}
			@Override
			public Adapter caseStructureSupportInfo(StructureSupportInfo object) {
				return createStructureSupportInfoAdapter();
			}
			@Override
			public Adapter caseElectricalAsset(ElectricalAsset object) {
				return createElectricalAssetAdapter();
			}
			@Override
			public Adapter caseFailureEvent(FailureEvent object) {
				return createFailureEventAdapter();
			}
			@Override
			public Adapter caseRecloserInfo(RecloserInfo object) {
				return createRecloserInfoAdapter();
			}
			@Override
			public Adapter caseTowerInfo(TowerInfo object) {
				return createTowerInfoAdapter();
			}
			@Override
			public Adapter caseTestDataSet(TestDataSet object) {
				return createTestDataSetAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseCompositeSwitchInfo(CompositeSwitchInfo object) {
				return createCompositeSwitchInfoAdapter();
			}
			@Override
			public Adapter caseFacility(Facility object) {
				return createFacilityAdapter();
			}
			@Override
			public Adapter caseFaultIndicatorInfo(FaultIndicatorInfo object) {
				return createFaultIndicatorInfoAdapter();
			}
			@Override
			public Adapter caseReliabilityInfo(ReliabilityInfo object) {
				return createReliabilityInfoAdapter();
			}
			@Override
			public Adapter caseTransformerObservation(TransformerObservation object) {
				return createTransformerObservationAdapter();
			}
			@Override
			public Adapter caseToolInfo(ToolInfo object) {
				return createToolInfoAdapter();
			}
			@Override
			public Adapter caseDuctBankInfo(DuctBankInfo object) {
				return createDuctBankInfoAdapter();
			}
			@Override
			public Adapter caseVehicleInfo(VehicleInfo object) {
				return createVehicleInfoAdapter();
			}
			@Override
			public Adapter caseBushingInsulationPF(BushingInsulationPF object) {
				return createBushingInsulationPFAdapter();
			}
			@Override
			public Adapter caseBushingInfo(BushingInfo object) {
				return createBushingInfoAdapter();
			}
			@Override
			public Adapter caseAssetAssetRole(AssetAssetRole object) {
				return createAssetAssetRoleAdapter();
			}
			@Override
			public Adapter casePoleInfo(PoleInfo object) {
				return createPoleInfoAdapter();
			}
			@Override
			public Adapter caseTapChangerAsset(TapChangerAsset object) {
				return createTapChangerAssetAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseAssetContainer(AssetContainer object) {
				return createAssetContainerAdapter();
			}
			@Override
			public Adapter caseCurve(Curve object) {
				return createCurveAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseActivityRecord(ActivityRecord object) {
				return createActivityRecordAdapter();
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
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole <em>Org Asset Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole
	 * @generated
	 */
	public Adapter createOrgAssetRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo <em>Shunt Compensator Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo
	 * @generated
	 */
	public Adapter createShuntCompensatorInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo <em>Potential Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo
	 * @generated
	 */
	public Adapter createPotentialTransformerInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo <em>Duct Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo
	 * @generated
	 */
	public Adapter createDuctInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole <em>Doc Asset Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole
	 * @generated
	 */
	public Adapter createDocAssetRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint <em>Mounting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint
	 * @generated
	 */
	public Adapter createMountingPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SVCInfo <em>SVC Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SVCInfo
	 * @generated
	 */
	public Adapter createSVCInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo <em>Financial Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo
	 * @generated
	 */
	public Adapter createFinancialInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo <em>Shunt Impedance Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo
	 * @generated
	 */
	public Adapter createShuntImpedanceInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Cabinet <em>Cabinet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Cabinet
	 * @generated
	 */
	public Adapter createCabinetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo <em>Com Equipment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo
	 * @generated
	 */
	public Adapter createComEquipmentInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BreakerInfo <em>Breaker Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BreakerInfo
	 * @generated
	 */
	public Adapter createBreakerInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.GeneratorAsset <em>Generator Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.GeneratorAsset
	 * @generated
	 */
	public Adapter createGeneratorAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo <em>Electrical Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo
	 * @generated
	 */
	public Adapter createElectricalInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation <em>Winding Insulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation
	 * @generated
	 */
	public Adapter createWindingInsulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset <em>Conductor Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ConductorAsset
	 * @generated
	 */
	public Adapter createConductorAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset <em>Transformer Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset
	 * @generated
	 */
	public Adapter createTransformerAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve <em>Asset Property Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve
	 * @generated
	 */
	public Adapter createAssetPropertyCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating <em>Power Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PowerRating
	 * @generated
	 */
	public Adapter createPowerRatingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo
	 * @generated
	 */
	public Adapter createAssetInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo <em>Joint Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.JointInfo
	 * @generated
	 */
	public Adapter createJointInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection <em>Mounting Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection
	 * @generated
	 */
	public Adapter createMountingConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationInfo <em>Substation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SubstationInfo
	 * @generated
	 */
	public Adapter createSubstationInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo <em>Protection Equipment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo
	 * @generated
	 */
	public Adapter createProtectionEquipmentInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo <em>Surge Protector Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo
	 * @generated
	 */
	public Adapter createSurgeProtectorInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo <em>Underground Structure Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo
	 * @generated
	 */
	public Adapter createUndergroundStructureInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Medium
	 * @generated
	 */
	public Adapter createMediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo <em>Structure Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo
	 * @generated
	 */
	public Adapter createStructureInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceInfo <em>FACTS Device Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceInfo
	 * @generated
	 */
	public Adapter createFACTSDeviceInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo <em>Switch Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.SwitchInfo
	 * @generated
	 */
	public Adapter createSwitchInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet <em>Procedure Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet
	 * @generated
	 */
	public Adapter createProcedureDataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo <em>Streetlight Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo
	 * @generated
	 */
	public Adapter createStreetlightInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo
	 * @generated
	 */
	public Adapter createDimensionsInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo <em>Work Equipment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo
	 * @generated
	 */
	public Adapter createWorkEquipmentInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo <em>Current Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo
	 * @generated
	 */
	public Adapter createCurrentTransformerInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo <em>Structure Support Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo
	 * @generated
	 */
	public Adapter createStructureSupportInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset <em>Electrical Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset
	 * @generated
	 */
	public Adapter createElectricalAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent <em>Failure Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent
	 * @generated
	 */
	public Adapter createFailureEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo <em>Recloser Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RecloserInfo
	 * @generated
	 */
	public Adapter createRecloserInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TowerInfo <em>Tower Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TowerInfo
	 * @generated
	 */
	public Adapter createTowerInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet <em>Test Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TestDataSet
	 * @generated
	 */
	public Adapter createTestDataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo <em>Composite Switch Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo
	 * @generated
	 */
	public Adapter createCompositeSwitchInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Facility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Facility
	 * @generated
	 */
	public Adapter createFacilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorInfo <em>Fault Indicator Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorInfo
	 * @generated
	 */
	public Adapter createFaultIndicatorInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo <em>Reliability Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo
	 * @generated
	 */
	public Adapter createReliabilityInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation
	 * @generated
	 */
	public Adapter createTransformerObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo <em>Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo
	 * @generated
	 */
	public Adapter createToolInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo
	 * @generated
	 */
	public Adapter createDuctBankInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo <em>Vehicle Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo
	 * @generated
	 */
	public Adapter createVehicleInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF <em>Bushing Insulation PF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF
	 * @generated
	 */
	public Adapter createBushingInsulationPFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInfo
	 * @generated
	 */
	public Adapter createBushingInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole <em>Asset Asset Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole
	 * @generated
	 */
	public Adapter createAssetAssetRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo <em>Pole Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo
	 * @generated
	 */
	public Adapter createPoleInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset <em>Tap Changer Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset
	 * @generated
	 */
	public Adapter createTapChangerAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.Assets.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.Assets.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.Assets.AssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetContainer
	 * @generated
	 */
	public Adapter createAssetContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Core.Curve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Core.Curve
	 * @generated
	 */
	public Adapter createCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.Common.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.Common.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord <em>Activity Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61968.Common.ActivityRecord
	 * @generated
	 */
	public Adapter createActivityRecordAdapter() {
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

} //InfAssetsAdapterFactory
