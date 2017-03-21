/**
 */
package substationStandard.Dataclasses.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import substationStandard.Dataclasses.*;

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
 * @see substationStandard.Dataclasses.DataclassesPackage
 * @generated
 */
public class DataclassesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataclassesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataclassesSwitch() {
		if (modelPackage == null) {
			modelPackage = DataclassesPackage.eINSTANCE;
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
			case DataclassesPackage.TIME_STAMP: {
				TimeStamp timeStamp = (TimeStamp)theEObject;
				T result = caseTimeStamp(timeStamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.PTIME_STAMP: {
				P_TimeStamp p_TimeStamp = (P_TimeStamp)theEObject;
				T result = caseP_TimeStamp(p_TimeStamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.TIME_QUALITY: {
				TimeQuality timeQuality = (TimeQuality)theEObject;
				T result = caseTimeQuality(timeQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ANALOGUE_VALUE: {
				AnalogueValue analogueValue = (AnalogueValue)theEObject;
				T result = caseAnalogueValue(analogueValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ANGLE_REFERENCE: {
				AngleReference angleReference = (AngleReference)theEObject;
				T result = caseAngleReference(angleReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.BS_CONTROL: {
				BSControl bsControl = (BSControl)theEObject;
				T result = caseBSControl(bsControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CMV_ANGLE_REFERENCE: {
				CMVAngleReference cmvAngleReference = (CMVAngleReference)theEObject;
				T result = caseCMVAngleReference(cmvAngleReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CONTROL_OUTPUT: {
				ControlOutput controlOutput = (ControlOutput)theEObject;
				T result = caseControlOutput(controlOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CTL_MODELS: {
				CtlModels ctlModels = (CtlModels)theEObject;
				T result = caseCtlModels(ctlModels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CURVE_CHAR: {
				CurveChar curveChar = (CurveChar)theEObject;
				T result = caseCurveChar(curveChar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.DIRECTION_PHASE: {
				DirectionPhase directionPhase = (DirectionPhase)theEObject;
				T result = caseDirectionPhase(directionPhase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.DP_STATUS: {
				DPStatus dpStatus = (DPStatus)theEObject;
				T result = caseDPStatus(dpStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.FAULT_DIRECTION: {
				FaultDirection faultDirection = (FaultDirection)theEObject;
				T result = caseFaultDirection(faultDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.MAG_REFERENCE: {
				MagReference magReference = (MagReference)theEObject;
				T result = caseMagReference(magReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.MULTIPLIER: {
				Multiplier multiplier = (Multiplier)theEObject;
				T result = caseMultiplier(multiplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ORIGINATOR: {
				Originator originator = (Originator)theEObject;
				T result = caseOriginator(originator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ORIGINATOR_CATEGORY: {
				OriginatorCategory originatorCategory = (OriginatorCategory)theEObject;
				T result = caseOriginatorCategory(originatorCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.PHASE_REFERENCE: {
				PhaseReference phaseReference = (PhaseReference)theEObject;
				T result = casePhaseReference(phaseReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.POINT_ARRAY: {
				PointArray pointArray = (PointArray)theEObject;
				T result = casePointArray(pointArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.PULSE_CONFIG: {
				PulseConfig pulseConfig = (PulseConfig)theEObject;
				T result = casePulseConfig(pulseConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.QUALITY: {
				Quality quality = (Quality)theEObject;
				T result = caseQuality(quality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.DETAIL_QUAL: {
				DetailQual detailQual = (DetailQual)theEObject;
				T result = caseDetailQual(detailQual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.RANGE_CONFIG: {
				RangeConfig rangeConfig = (RangeConfig)theEObject;
				T result = caseRangeConfig(rangeConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SBO_CLASSES: {
				SboClasses sboClasses = (SboClasses)theEObject;
				T result = caseSboClasses(sboClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SCALED_VALUE_CONFIG: {
				ScaledValueConfig scaledValueConfig = (ScaledValueConfig)theEObject;
				T result = caseScaledValueConfig(scaledValueConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SEVERITY: {
				Severity severity = (Severity)theEObject;
				T result = caseSeverity(severity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SL_UNITS: {
				SlUnits slUnits = (SlUnits)theEObject;
				T result = caseSlUnits(slUnits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.UNITS: {
				Units units = (Units)theEObject;
				T result = caseUnits(units);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.VAL_WITH_TRANS: {
				ValWithTrans valWithTrans = (ValWithTrans)theEObject;
				T result = caseValWithTrans(valWithTrans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.VECTOR: {
				Vector vector = (Vector)theEObject;
				T result = caseVector(vector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.VECTOR_ARRAY: {
				VectorArray vectorArray = (VectorArray)theEObject;
				T result = caseVectorArray(vectorArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CPRIMITIVE_CDC: {
				C_PrimitiveCDC c_PrimitiveCDC = (C_PrimitiveCDC)theEObject;
				T result = caseC_PrimitiveCDC(c_PrimitiveCDC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CCOMPOSED_CDC: {
				C_ComposedCDC c_ComposedCDC = (C_ComposedCDC)theEObject;
				T result = caseC_ComposedCDC(c_ComposedCDC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.STATUS_INFO: {
				StatusInfo statusInfo = (StatusInfo)theEObject;
				T result = caseStatusInfo(statusInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SPS: {
				SPS sps = (SPS)theEObject;
				T result = caseSPS(sps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.INS: {
				INS ins = (INS)theEObject;
				T result = caseINS(ins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.DPS: {
				DPS dps = (DPS)theEObject;
				T result = caseDPS(dps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ACT: {
				ACT act = (ACT)theEObject;
				T result = caseACT(act);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ACD: {
				ACD acd = (ACD)theEObject;
				T result = caseACD(acd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SEC: {
				SEC sec = (SEC)theEObject;
				T result = caseSEC(sec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.BCR: {
				BCR bcr = (BCR)theEObject;
				T result = caseBCR(bcr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.PRIMITIVE_MEASURE_AND_INFO: {
				PrimitiveMeasureAndInfo primitiveMeasureAndInfo = (PrimitiveMeasureAndInfo)theEObject;
				T result = casePrimitiveMeasureAndInfo(primitiveMeasureAndInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.COMPOSED_MEASURE_AND_INFO: {
				ComposedMeasureAndInfo composedMeasureAndInfo = (ComposedMeasureAndInfo)theEObject;
				T result = caseComposedMeasureAndInfo(composedMeasureAndInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.MV: {
				MV mv = (MV)theEObject;
				T result = caseMV(mv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CMV: {
				CMV cmv = (CMV)theEObject;
				T result = caseCMV(cmv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SAV: {
				SAV sav = (SAV)theEObject;
				T result = caseSAV(sav);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.DEL: {
				DEL del = (DEL)theEObject;
				T result = caseDEL(del);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.WYE: {
				WYE wye = (WYE)theEObject;
				T result = caseWYE(wye);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SEQ: {
				SEQ seq = (SEQ)theEObject;
				T result = caseSEQ(seq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.HMV: {
				HMV hmv = (HMV)theEObject;
				T result = caseHMV(hmv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.HYWE: {
				HYWE hywe = (HYWE)theEObject;
				T result = caseHYWE(hywe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.HDEL: {
				HDEL hdel = (HDEL)theEObject;
				T result = caseHDEL(hdel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO: {
				ControllableStatusInfo controllableStatusInfo = (ControllableStatusInfo)theEObject;
				T result = caseControllableStatusInfo(controllableStatusInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SPC: {
				SPC spc = (SPC)theEObject;
				T result = caseSPC(spc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.DPC: {
				DPC dpc = (DPC)theEObject;
				T result = caseDPC(dpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.INC: {
				INC inc = (INC)theEObject;
				T result = caseINC(inc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.BSC: {
				BSC bsc = (BSC)theEObject;
				T result = caseBSC(bsc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ISC: {
				ISC isc = (ISC)theEObject;
				T result = caseISC(isc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO: {
				ControllableAnalogueInfo controllableAnalogueInfo = (ControllableAnalogueInfo)theEObject;
				T result = caseControllableAnalogueInfo(controllableAnalogueInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.APC: {
				APC apc = (APC)theEObject;
				T result = caseAPC(apc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.SPG: {
				SPG spg = (SPG)theEObject;
				T result = caseSPG(spg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ING: {
				ING ing = (ING)theEObject;
				T result = caseING(ing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ANALOGUE_SETTINGS: {
				AnalogueSettings analogueSettings = (AnalogueSettings)theEObject;
				T result = caseAnalogueSettings(analogueSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.ASG: {
				ASG asg = (ASG)theEObject;
				T result = caseASG(asg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CURVE: {
				CURVE curve = (CURVE)theEObject;
				T result = caseCURVE(curve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.DESCRIPTION_INFO: {
				DescriptionInfo descriptionInfo = (DescriptionInfo)theEObject;
				T result = caseDescriptionInfo(descriptionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.DPL: {
				DPL dpl = (DPL)theEObject;
				T result = caseDPL(dpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.LPL: {
				LPL lpl = (LPL)theEObject;
				T result = caseLPL(lpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataclassesPackage.CSD: {
				CSD csd = (CSD)theEObject;
				T result = caseCSD(csd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStamp(TimeStamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTime Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTime Stamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP_TimeStamp(P_TimeStamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeQuality(TimeQuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analogue Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analogue Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogueValue(AnalogueValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleReference(AngleReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BS Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BS Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSControl(BSControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CMV Angle Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMV Angle Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMVAngleReference(CMVAngleReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlOutput(ControlOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctl Models</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctl Models</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtlModels(CtlModels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurveChar(CurveChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionPhase(DirectionPhase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPStatus(DPStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultDirection(FaultDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mag Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mag Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMagReference(MagReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplier(Multiplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Originator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Originator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginator(Originator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Originator Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Originator Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginatorCategory(OriginatorCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhaseReference(PhaseReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointArray(PointArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pulse Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pulse Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePulseConfig(PulseConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuality(Quality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail Qual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail Qual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailQual(DetailQual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeConfig(RangeConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sbo Classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sbo Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSboClasses(SboClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaled Value Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaled Value Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaledValueConfig(ScaledValueConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeverity(Severity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sl Units</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sl Units</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlUnits(SlUnits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Units</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Units</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnits(Units object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Val With Trans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Val With Trans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValWithTrans(ValWithTrans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector(Vector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorArray(VectorArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPrimitive CDC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPrimitive CDC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC_PrimitiveCDC(C_PrimitiveCDC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CComposed CDC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CComposed CDC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC_ComposedCDC(C_ComposedCDC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusInfo(StatusInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPS(SPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINS(INS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPS(DPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACT(ACT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACD(ACD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEC(SEC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCR(BCR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Measure And Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Measure And Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveMeasureAndInfo(PrimitiveMeasureAndInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Measure And Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Measure And Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedMeasureAndInfo(ComposedMeasureAndInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMV(MV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CMV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMV(CMV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAV(SAV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEL(DEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WYE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WYE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWYE(WYE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEQ(SEQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMV(HMV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HYWE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HYWE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHYWE(HYWE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDEL(HDEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controllable Status Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controllable Status Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllableStatusInfo(ControllableStatusInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPC(SPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPC(DPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINC(INC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSC(BSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISC(ISC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controllable Analogue Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controllable Analogue Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllableAnalogueInfo(ControllableAnalogueInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPC(APC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPG(SPG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseING(ING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analogue Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analogue Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogueSettings(AnalogueSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASG(ASG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CURVE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CURVE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCURVE(CURVE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionInfo(DescriptionInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DPL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DPL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPL(DPL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LPL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LPL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPL(LPL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSD(CSD object) {
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

} //DataclassesSwitch
