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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage
 * @generated
 */
public class InfAssetsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfAssetsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetsSwitch() {
		if (modelPackage == null) {
			modelPackage = InfAssetsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InfAssetsPackage.ORG_ASSET_ROLE: {
				OrgAssetRole orgAssetRole = (OrgAssetRole)theEObject;
				T result = caseOrgAssetRole(orgAssetRole);
				if (result == null) result = caseRole(orgAssetRole);
				if (result == null) result = caseIdentifiedObject(orgAssetRole);
				if (result == null) result = caseElement(orgAssetRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO: {
				ShuntCompensatorInfo shuntCompensatorInfo = (ShuntCompensatorInfo)theEObject;
				T result = caseShuntCompensatorInfo(shuntCompensatorInfo);
				if (result == null) result = caseElectricalInfo(shuntCompensatorInfo);
				if (result == null) result = caseAssetInfo(shuntCompensatorInfo);
				if (result == null) result = caseIdentifiedObject(shuntCompensatorInfo);
				if (result == null) result = caseElement(shuntCompensatorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO: {
				PotentialTransformerInfo potentialTransformerInfo = (PotentialTransformerInfo)theEObject;
				T result = casePotentialTransformerInfo(potentialTransformerInfo);
				if (result == null) result = caseElectricalInfo(potentialTransformerInfo);
				if (result == null) result = caseAssetInfo(potentialTransformerInfo);
				if (result == null) result = caseIdentifiedObject(potentialTransformerInfo);
				if (result == null) result = caseElement(potentialTransformerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.DUCT_INFO: {
				DuctInfo ductInfo = (DuctInfo)theEObject;
				T result = caseDuctInfo(ductInfo);
				if (result == null) result = caseAssetInfo(ductInfo);
				if (result == null) result = caseIdentifiedObject(ductInfo);
				if (result == null) result = caseElement(ductInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.DOC_ASSET_ROLE: {
				DocAssetRole docAssetRole = (DocAssetRole)theEObject;
				T result = caseDocAssetRole(docAssetRole);
				if (result == null) result = caseRole(docAssetRole);
				if (result == null) result = caseIdentifiedObject(docAssetRole);
				if (result == null) result = caseElement(docAssetRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.MOUNTING_POINT: {
				MountingPoint mountingPoint = (MountingPoint)theEObject;
				T result = caseMountingPoint(mountingPoint);
				if (result == null) result = caseIdentifiedObject(mountingPoint);
				if (result == null) result = caseElement(mountingPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SVC_INFO: {
				SVCInfo svcInfo = (SVCInfo)theEObject;
				T result = caseSVCInfo(svcInfo);
				if (result == null) result = caseFACTSDeviceInfo(svcInfo);
				if (result == null) result = caseElectricalInfo(svcInfo);
				if (result == null) result = caseAssetInfo(svcInfo);
				if (result == null) result = caseIdentifiedObject(svcInfo);
				if (result == null) result = caseElement(svcInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.FINANCIAL_INFO: {
				FinancialInfo financialInfo = (FinancialInfo)theEObject;
				T result = caseFinancialInfo(financialInfo);
				if (result == null) result = caseIdentifiedObject(financialInfo);
				if (result == null) result = caseElement(financialInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO: {
				ShuntImpedanceInfo shuntImpedanceInfo = (ShuntImpedanceInfo)theEObject;
				T result = caseShuntImpedanceInfo(shuntImpedanceInfo);
				if (result == null) result = caseElectricalInfo(shuntImpedanceInfo);
				if (result == null) result = caseAssetInfo(shuntImpedanceInfo);
				if (result == null) result = caseIdentifiedObject(shuntImpedanceInfo);
				if (result == null) result = caseElement(shuntImpedanceInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.CABINET: {
				Cabinet cabinet = (Cabinet)theEObject;
				T result = caseCabinet(cabinet);
				if (result == null) result = caseAssetContainer(cabinet);
				if (result == null) result = caseAsset(cabinet);
				if (result == null) result = caseIdentifiedObject(cabinet);
				if (result == null) result = caseElement(cabinet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.COM_EQUIPMENT_INFO: {
				ComEquipmentInfo comEquipmentInfo = (ComEquipmentInfo)theEObject;
				T result = caseComEquipmentInfo(comEquipmentInfo);
				if (result == null) result = caseAssetInfo(comEquipmentInfo);
				if (result == null) result = caseIdentifiedObject(comEquipmentInfo);
				if (result == null) result = caseElement(comEquipmentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.BREAKER_INFO: {
				BreakerInfo breakerInfo = (BreakerInfo)theEObject;
				T result = caseBreakerInfo(breakerInfo);
				if (result == null) result = caseSwitchInfo(breakerInfo);
				if (result == null) result = caseElectricalInfo(breakerInfo);
				if (result == null) result = caseAssetInfo(breakerInfo);
				if (result == null) result = caseIdentifiedObject(breakerInfo);
				if (result == null) result = caseElement(breakerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.GENERATOR_ASSET: {
				GeneratorAsset generatorAsset = (GeneratorAsset)theEObject;
				T result = caseGeneratorAsset(generatorAsset);
				if (result == null) result = caseElectricalAsset(generatorAsset);
				if (result == null) result = caseAsset(generatorAsset);
				if (result == null) result = caseIdentifiedObject(generatorAsset);
				if (result == null) result = caseElement(generatorAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.ELECTRICAL_INFO: {
				ElectricalInfo electricalInfo = (ElectricalInfo)theEObject;
				T result = caseElectricalInfo(electricalInfo);
				if (result == null) result = caseAssetInfo(electricalInfo);
				if (result == null) result = caseIdentifiedObject(electricalInfo);
				if (result == null) result = caseElement(electricalInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.WINDING_INSULATION: {
				WindingInsulation windingInsulation = (WindingInsulation)theEObject;
				T result = caseWindingInsulation(windingInsulation);
				if (result == null) result = caseIdentifiedObject(windingInsulation);
				if (result == null) result = caseElement(windingInsulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.CONDUCTOR_ASSET: {
				ConductorAsset conductorAsset = (ConductorAsset)theEObject;
				T result = caseConductorAsset(conductorAsset);
				if (result == null) result = caseAsset(conductorAsset);
				if (result == null) result = caseIdentifiedObject(conductorAsset);
				if (result == null) result = caseElement(conductorAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TRANSFORMER_ASSET: {
				TransformerAsset transformerAsset = (TransformerAsset)theEObject;
				T result = caseTransformerAsset(transformerAsset);
				if (result == null) result = caseAsset(transformerAsset);
				if (result == null) result = caseIdentifiedObject(transformerAsset);
				if (result == null) result = caseElement(transformerAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.ASSET_PROPERTY_CURVE: {
				AssetPropertyCurve assetPropertyCurve = (AssetPropertyCurve)theEObject;
				T result = caseAssetPropertyCurve(assetPropertyCurve);
				if (result == null) result = caseCurve(assetPropertyCurve);
				if (result == null) result = caseIdentifiedObject(assetPropertyCurve);
				if (result == null) result = caseElement(assetPropertyCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.POWER_RATING: {
				PowerRating powerRating = (PowerRating)theEObject;
				T result = casePowerRating(powerRating);
				if (result == null) result = caseIdentifiedObject(powerRating);
				if (result == null) result = caseElement(powerRating);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.ASSET_INFO: {
				AssetInfo assetInfo = (AssetInfo)theEObject;
				T result = caseAssetInfo(assetInfo);
				if (result == null) result = caseIdentifiedObject(assetInfo);
				if (result == null) result = caseElement(assetInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.JOINT_INFO: {
				JointInfo jointInfo = (JointInfo)theEObject;
				T result = caseJointInfo(jointInfo);
				if (result == null) result = caseElectricalInfo(jointInfo);
				if (result == null) result = caseAssetInfo(jointInfo);
				if (result == null) result = caseIdentifiedObject(jointInfo);
				if (result == null) result = caseElement(jointInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.MOUNTING_CONNECTION: {
				MountingConnection mountingConnection = (MountingConnection)theEObject;
				T result = caseMountingConnection(mountingConnection);
				if (result == null) result = caseIdentifiedObject(mountingConnection);
				if (result == null) result = caseElement(mountingConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SUBSTATION_INFO: {
				SubstationInfo substationInfo = (SubstationInfo)theEObject;
				T result = caseSubstationInfo(substationInfo);
				if (result == null) result = caseAssetInfo(substationInfo);
				if (result == null) result = caseIdentifiedObject(substationInfo);
				if (result == null) result = caseElement(substationInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO: {
				ProtectionEquipmentInfo protectionEquipmentInfo = (ProtectionEquipmentInfo)theEObject;
				T result = caseProtectionEquipmentInfo(protectionEquipmentInfo);
				if (result == null) result = caseElectricalInfo(protectionEquipmentInfo);
				if (result == null) result = caseAssetInfo(protectionEquipmentInfo);
				if (result == null) result = caseIdentifiedObject(protectionEquipmentInfo);
				if (result == null) result = caseElement(protectionEquipmentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SURGE_PROTECTOR_INFO: {
				SurgeProtectorInfo surgeProtectorInfo = (SurgeProtectorInfo)theEObject;
				T result = caseSurgeProtectorInfo(surgeProtectorInfo);
				if (result == null) result = caseElectricalInfo(surgeProtectorInfo);
				if (result == null) result = caseAssetInfo(surgeProtectorInfo);
				if (result == null) result = caseIdentifiedObject(surgeProtectorInfo);
				if (result == null) result = caseElement(surgeProtectorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO: {
				UndergroundStructureInfo undergroundStructureInfo = (UndergroundStructureInfo)theEObject;
				T result = caseUndergroundStructureInfo(undergroundStructureInfo);
				if (result == null) result = caseStructureInfo(undergroundStructureInfo);
				if (result == null) result = caseAssetInfo(undergroundStructureInfo);
				if (result == null) result = caseIdentifiedObject(undergroundStructureInfo);
				if (result == null) result = caseElement(undergroundStructureInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseDocument(procedure);
				if (result == null) result = caseIdentifiedObject(procedure);
				if (result == null) result = caseElement(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.MEDIUM: {
				Medium medium = (Medium)theEObject;
				T result = caseMedium(medium);
				if (result == null) result = caseIdentifiedObject(medium);
				if (result == null) result = caseElement(medium);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.STRUCTURE_INFO: {
				StructureInfo structureInfo = (StructureInfo)theEObject;
				T result = caseStructureInfo(structureInfo);
				if (result == null) result = caseAssetInfo(structureInfo);
				if (result == null) result = caseIdentifiedObject(structureInfo);
				if (result == null) result = caseElement(structureInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.FACTS_DEVICE_INFO: {
				FACTSDeviceInfo factsDeviceInfo = (FACTSDeviceInfo)theEObject;
				T result = caseFACTSDeviceInfo(factsDeviceInfo);
				if (result == null) result = caseElectricalInfo(factsDeviceInfo);
				if (result == null) result = caseAssetInfo(factsDeviceInfo);
				if (result == null) result = caseIdentifiedObject(factsDeviceInfo);
				if (result == null) result = caseElement(factsDeviceInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SWITCH_INFO: {
				SwitchInfo switchInfo = (SwitchInfo)theEObject;
				T result = caseSwitchInfo(switchInfo);
				if (result == null) result = caseElectricalInfo(switchInfo);
				if (result == null) result = caseAssetInfo(switchInfo);
				if (result == null) result = caseIdentifiedObject(switchInfo);
				if (result == null) result = caseElement(switchInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.PROCEDURE_DATA_SET: {
				ProcedureDataSet procedureDataSet = (ProcedureDataSet)theEObject;
				T result = caseProcedureDataSet(procedureDataSet);
				if (result == null) result = caseDocument(procedureDataSet);
				if (result == null) result = caseIdentifiedObject(procedureDataSet);
				if (result == null) result = caseElement(procedureDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.STREETLIGHT_INFO: {
				StreetlightInfo streetlightInfo = (StreetlightInfo)theEObject;
				T result = caseStreetlightInfo(streetlightInfo);
				if (result == null) result = caseElectricalInfo(streetlightInfo);
				if (result == null) result = caseAssetInfo(streetlightInfo);
				if (result == null) result = caseIdentifiedObject(streetlightInfo);
				if (result == null) result = caseElement(streetlightInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.DIMENSIONS_INFO: {
				DimensionsInfo dimensionsInfo = (DimensionsInfo)theEObject;
				T result = caseDimensionsInfo(dimensionsInfo);
				if (result == null) result = caseIdentifiedObject(dimensionsInfo);
				if (result == null) result = caseElement(dimensionsInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.WORK_EQUIPMENT_INFO: {
				WorkEquipmentInfo workEquipmentInfo = (WorkEquipmentInfo)theEObject;
				T result = caseWorkEquipmentInfo(workEquipmentInfo);
				if (result == null) result = caseAssetInfo(workEquipmentInfo);
				if (result == null) result = caseIdentifiedObject(workEquipmentInfo);
				if (result == null) result = caseElement(workEquipmentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO: {
				CurrentTransformerInfo currentTransformerInfo = (CurrentTransformerInfo)theEObject;
				T result = caseCurrentTransformerInfo(currentTransformerInfo);
				if (result == null) result = caseElectricalInfo(currentTransformerInfo);
				if (result == null) result = caseAssetInfo(currentTransformerInfo);
				if (result == null) result = caseIdentifiedObject(currentTransformerInfo);
				if (result == null) result = caseElement(currentTransformerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO: {
				StructureSupportInfo structureSupportInfo = (StructureSupportInfo)theEObject;
				T result = caseStructureSupportInfo(structureSupportInfo);
				if (result == null) result = caseAssetInfo(structureSupportInfo);
				if (result == null) result = caseIdentifiedObject(structureSupportInfo);
				if (result == null) result = caseElement(structureSupportInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.ELECTRICAL_ASSET: {
				ElectricalAsset electricalAsset = (ElectricalAsset)theEObject;
				T result = caseElectricalAsset(electricalAsset);
				if (result == null) result = caseAsset(electricalAsset);
				if (result == null) result = caseIdentifiedObject(electricalAsset);
				if (result == null) result = caseElement(electricalAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.FAILURE_EVENT: {
				FailureEvent failureEvent = (FailureEvent)theEObject;
				T result = caseFailureEvent(failureEvent);
				if (result == null) result = caseActivityRecord(failureEvent);
				if (result == null) result = caseIdentifiedObject(failureEvent);
				if (result == null) result = caseElement(failureEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.RECLOSER_INFO: {
				RecloserInfo recloserInfo = (RecloserInfo)theEObject;
				T result = caseRecloserInfo(recloserInfo);
				if (result == null) result = caseSwitchInfo(recloserInfo);
				if (result == null) result = caseElectricalInfo(recloserInfo);
				if (result == null) result = caseAssetInfo(recloserInfo);
				if (result == null) result = caseIdentifiedObject(recloserInfo);
				if (result == null) result = caseElement(recloserInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TOWER_INFO: {
				TowerInfo towerInfo = (TowerInfo)theEObject;
				T result = caseTowerInfo(towerInfo);
				if (result == null) result = caseStructureInfo(towerInfo);
				if (result == null) result = caseAssetInfo(towerInfo);
				if (result == null) result = caseIdentifiedObject(towerInfo);
				if (result == null) result = caseElement(towerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TEST_DATA_SET: {
				TestDataSet testDataSet = (TestDataSet)theEObject;
				T result = caseTestDataSet(testDataSet);
				if (result == null) result = caseProcedureDataSet(testDataSet);
				if (result == null) result = caseDocument(testDataSet);
				if (result == null) result = caseIdentifiedObject(testDataSet);
				if (result == null) result = caseElement(testDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = caseDocument(specification);
				if (result == null) result = caseIdentifiedObject(specification);
				if (result == null) result = caseElement(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO: {
				CompositeSwitchInfo compositeSwitchInfo = (CompositeSwitchInfo)theEObject;
				T result = caseCompositeSwitchInfo(compositeSwitchInfo);
				if (result == null) result = caseElectricalInfo(compositeSwitchInfo);
				if (result == null) result = caseAssetInfo(compositeSwitchInfo);
				if (result == null) result = caseIdentifiedObject(compositeSwitchInfo);
				if (result == null) result = caseElement(compositeSwitchInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.FACILITY: {
				Facility facility = (Facility)theEObject;
				T result = caseFacility(facility);
				if (result == null) result = caseAssetContainer(facility);
				if (result == null) result = caseAsset(facility);
				if (result == null) result = caseIdentifiedObject(facility);
				if (result == null) result = caseElement(facility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.FAULT_INDICATOR_INFO: {
				FaultIndicatorInfo faultIndicatorInfo = (FaultIndicatorInfo)theEObject;
				T result = caseFaultIndicatorInfo(faultIndicatorInfo);
				if (result == null) result = caseElectricalInfo(faultIndicatorInfo);
				if (result == null) result = caseAssetInfo(faultIndicatorInfo);
				if (result == null) result = caseIdentifiedObject(faultIndicatorInfo);
				if (result == null) result = caseElement(faultIndicatorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.RELIABILITY_INFO: {
				ReliabilityInfo reliabilityInfo = (ReliabilityInfo)theEObject;
				T result = caseReliabilityInfo(reliabilityInfo);
				if (result == null) result = caseIdentifiedObject(reliabilityInfo);
				if (result == null) result = caseElement(reliabilityInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TRANSFORMER_OBSERVATION: {
				TransformerObservation transformerObservation = (TransformerObservation)theEObject;
				T result = caseTransformerObservation(transformerObservation);
				if (result == null) result = caseIdentifiedObject(transformerObservation);
				if (result == null) result = caseElement(transformerObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TOOL_INFO: {
				ToolInfo toolInfo = (ToolInfo)theEObject;
				T result = caseToolInfo(toolInfo);
				if (result == null) result = caseAssetInfo(toolInfo);
				if (result == null) result = caseIdentifiedObject(toolInfo);
				if (result == null) result = caseElement(toolInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.DUCT_BANK_INFO: {
				DuctBankInfo ductBankInfo = (DuctBankInfo)theEObject;
				T result = caseDuctBankInfo(ductBankInfo);
				if (result == null) result = caseAssetInfo(ductBankInfo);
				if (result == null) result = caseIdentifiedObject(ductBankInfo);
				if (result == null) result = caseElement(ductBankInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.VEHICLE_INFO: {
				VehicleInfo vehicleInfo = (VehicleInfo)theEObject;
				T result = caseVehicleInfo(vehicleInfo);
				if (result == null) result = caseAssetInfo(vehicleInfo);
				if (result == null) result = caseIdentifiedObject(vehicleInfo);
				if (result == null) result = caseElement(vehicleInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.BUSHING_INSULATION_PF: {
				BushingInsulationPF bushingInsulationPF = (BushingInsulationPF)theEObject;
				T result = caseBushingInsulationPF(bushingInsulationPF);
				if (result == null) result = caseIdentifiedObject(bushingInsulationPF);
				if (result == null) result = caseElement(bushingInsulationPF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.BUSHING_INFO: {
				BushingInfo bushingInfo = (BushingInfo)theEObject;
				T result = caseBushingInfo(bushingInfo);
				if (result == null) result = caseAssetInfo(bushingInfo);
				if (result == null) result = caseIdentifiedObject(bushingInfo);
				if (result == null) result = caseElement(bushingInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.ASSET_ASSET_ROLE: {
				AssetAssetRole assetAssetRole = (AssetAssetRole)theEObject;
				T result = caseAssetAssetRole(assetAssetRole);
				if (result == null) result = caseRole(assetAssetRole);
				if (result == null) result = caseIdentifiedObject(assetAssetRole);
				if (result == null) result = caseElement(assetAssetRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.POLE_INFO: {
				PoleInfo poleInfo = (PoleInfo)theEObject;
				T result = casePoleInfo(poleInfo);
				if (result == null) result = caseStructureInfo(poleInfo);
				if (result == null) result = caseAssetInfo(poleInfo);
				if (result == null) result = caseIdentifiedObject(poleInfo);
				if (result == null) result = caseElement(poleInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TAP_CHANGER_ASSET: {
				TapChangerAsset tapChangerAsset = (TapChangerAsset)theEObject;
				T result = caseTapChangerAsset(tapChangerAsset);
				if (result == null) result = caseAsset(tapChangerAsset);
				if (result == null) result = caseIdentifiedObject(tapChangerAsset);
				if (result == null) result = caseElement(tapChangerAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org Asset Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org Asset Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgAssetRole(OrgAssetRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shunt Compensator Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shunt Compensator Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShuntCompensatorInfo(ShuntCompensatorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Potential Transformer Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potential Transformer Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotentialTransformerInfo(PotentialTransformerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duct Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duct Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuctInfo(DuctInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Asset Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Asset Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocAssetRole(DocAssetRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mounting Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mounting Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMountingPoint(MountingPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVC Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVC Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVCInfo(SVCInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Financial Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Financial Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialInfo(FinancialInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shunt Impedance Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shunt Impedance Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShuntImpedanceInfo(ShuntImpedanceInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabinet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabinet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinet(Cabinet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Equipment Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Equipment Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComEquipmentInfo(ComEquipmentInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breaker Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breaker Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakerInfo(BreakerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorAsset(GeneratorAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalInfo(ElectricalInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Winding Insulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Winding Insulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindingInsulation(WindingInsulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conductor Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conductor Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductorAsset(ConductorAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerAsset(TransformerAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Property Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Property Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetPropertyCurve(AssetPropertyCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Rating</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Rating</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerRating(PowerRating object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetInfo(AssetInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joint Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joint Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJointInfo(JointInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mounting Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mounting Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMountingConnection(MountingConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substation Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substation Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstationInfo(SubstationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection Equipment Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection Equipment Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectionEquipmentInfo(ProtectionEquipmentInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surge Protector Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surge Protector Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurgeProtectorInfo(SurgeProtectorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underground Structure Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underground Structure Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndergroundStructureInfo(UndergroundStructureInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedium(Medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureInfo(StructureInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FACTS Device Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FACTS Device Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFACTSDeviceInfo(FACTSDeviceInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchInfo(SwitchInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDataSet(ProcedureDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Streetlight Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Streetlight Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreetlightInfo(StreetlightInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionsInfo(DimensionsInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Equipment Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Equipment Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkEquipmentInfo(WorkEquipmentInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Transformer Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Transformer Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentTransformerInfo(CurrentTransformerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Support Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Support Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureSupportInfo(StructureSupportInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalAsset(ElectricalAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureEvent(FailureEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recloser Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recloser Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecloserInfo(RecloserInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tower Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tower Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTowerInfo(TowerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestDataSet(TestDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Switch Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Switch Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSwitchInfo(CompositeSwitchInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacility(Facility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Indicator Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Indicator Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultIndicatorInfo(FaultIndicatorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliability Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliability Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliabilityInfo(ReliabilityInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerObservation(TransformerObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolInfo(ToolInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duct Bank Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duct Bank Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuctBankInfo(DuctBankInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleInfo(VehicleInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bushing Insulation PF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bushing Insulation PF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBushingInsulationPF(BushingInsulationPF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bushing Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bushing Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBushingInfo(BushingInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Asset Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Asset Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetAssetRole(AssetAssetRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pole Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pole Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoleInfo(PoleInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tap Changer Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tap Changer Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapChangerAsset(TapChangerAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetContainer(AssetContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurve(Curve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityRecord(ActivityRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InfAssetsSwitch
