/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingUnit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A generating unit whose prime mover is a hydraulic turbine (e.g., Francis, Pelton, Kaplan)'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A generating unit whose prime mover is a hydraulic turbine (e.g., Francis, Pelton, Kaplan)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generating unit whose prime mover is a hydraulic turbine (e.g., Francis, Pelton, Kaplan)' Profile\040documentation='A generating unit whose prime mover is a hydraulic turbine (e.g., Francis, Pelton, Kaplan)'"
 * @generated
 */
public interface HydroGeneratingUnit extends GeneratingUnit {
	/**
	 * Returns the value of the '<em><b>Energy Conversion Capability</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.HydroEnergyConversionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Conversion Capability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Conversion Capability</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroEnergyConversionKind
	 * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingUnit_EnergyConversionCapability()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Energy conversion capability for generating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Energy conversion capability for generating.'"
	 * @generated
	 */
	HydroEnergyConversionKind getEnergyConversionCapability();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Conversion Capability</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroEnergyConversionKind
	 * @see #getEnergyConversionCapability()
	 * @generated
	 */
	void setEnergyConversionCapability(HydroEnergyConversionKind value);

	/**
	 * Returns the value of the '<em><b>Tailbay Loss Curve</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.TailbayLossCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tailbay Loss Curve</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tailbay Loss Curve</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingUnit_TailbayLossCurve()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit
	 * @model opposite="HydroGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A hydro generating unit has a tailbay loss curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A hydro generating unit has a tailbay loss curve'"
	 * @generated
	 */
	EList<TailbayLossCurve> getTailbayLossCurve();

	/**
	 * Returns the value of the '<em><b>Hydro Power Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Power Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Power Plant</em>' reference.
	 * @see #setHydroPowerPlant(HydroPowerPlant)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingUnit_HydroPowerPlant()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits
	 * @model opposite="HydroGeneratingUnits"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydro generating unit belongs to a hydro power plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydro generating unit belongs to a hydro power plant'"
	 * @generated
	 */
	HydroPowerPlant getHydroPowerPlant();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Power Plant</em>' reference.
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	void setHydroPowerPlant(HydroPowerPlant value);

	/**
	 * Returns the value of the '<em><b>Hydro Generating Efficiency Curves</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Generating Efficiency Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Generating Efficiency Curves</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingUnit_HydroGeneratingEfficiencyCurves()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit
	 * @model opposite="HydroGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A hydro generating unit has an efficiency curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A hydro generating unit has an efficiency curve'"
	 * @generated
	 */
	EList<HydroGeneratingEfficiencyCurve> getHydroGeneratingEfficiencyCurves();

	/**
	 * Returns the value of the '<em><b>Hydro Unit Water Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Unit Water Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Unit Water Cost</em>' attribute.
	 * @see #setHydroUnitWaterCost(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingUnit_HydroUnitWaterCost()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The equivalent cost of water that drives the hydro turbine, expressed as cost per volume.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equivalent cost of water that drives the hydro turbine, expressed as cost per volume.'"
	 * @generated
	 */
	float getHydroUnitWaterCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Unit Water Cost</em>' attribute.
	 * @see #getHydroUnitWaterCost()
	 * @generated
	 */
	void setHydroUnitWaterCost(float value);

	/**
	 * Returns the value of the '<em><b>Penstock Loss Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penstock Loss Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penstock Loss Curve</em>' reference.
	 * @see #setPenstockLossCurve(PenstockLossCurve)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingUnit_PenstockLossCurve()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit
	 * @model opposite="HydroGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A hydro generating unit has a penstock loss curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A hydro generating unit has a penstock loss curve'"
	 * @generated
	 */
	PenstockLossCurve getPenstockLossCurve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penstock Loss Curve</em>' reference.
	 * @see #getPenstockLossCurve()
	 * @generated
	 */
	void setPenstockLossCurve(PenstockLossCurve value);

} // HydroGeneratingUnit
