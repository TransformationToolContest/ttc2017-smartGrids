/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61968.WiresExt.DistributionLineSegment;

import CIM.IEC61970.Informative.InfOperations.CircuitSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod <em>Grounding Method</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection <em>Circuit Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment <em>Conductor Segment</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated <em>Insulated</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal <em>Is Horizontal</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getConductorAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Physical asset used to perform the conductor\'s role.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Physical asset used to perform the conductor\'s role.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Physical asset used to perform the conductor\'s role.' Profile\040documentation='Physical asset used to perform the conductor\'s role.'"
 * @generated
 */
public interface ConductorAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Grounding Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounding Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounding Method</em>' attribute.
	 * @see #setGroundingMethod(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getConductorAsset_GroundingMethod()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Description of the method used for grounding the conductor. For a cable, the grounding/bonding shield may be multi-point, single-point, cross cable, or other.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Description of the method used for grounding the conductor. For a cable, the grounding/bonding shield may be multi-point, single-point, cross cable, or other.'"
	 * @generated
	 */
	String getGroundingMethod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod <em>Grounding Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grounding Method</em>' attribute.
	 * @see #getGroundingMethod()
	 * @generated
	 */
	void setGroundingMethod(String value);

	/**
	 * Returns the value of the '<em><b>Circuit Section</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets <em>Conductor Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Section</em>' reference.
	 * @see #setCircuitSection(CircuitSection)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getConductorAsset_CircuitSection()
	 * @see CIM.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets
	 * @model opposite="ConductorAssets"
	 * @generated
	 */
	CircuitSection getCircuitSection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection <em>Circuit Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Section</em>' reference.
	 * @see #getCircuitSection()
	 * @generated
	 */
	void setCircuitSection(CircuitSection value);

	/**
	 * Returns the value of the '<em><b>Conductor Segment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorAssets <em>Conductor Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Segment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Segment</em>' reference.
	 * @see #setConductorSegment(DistributionLineSegment)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getConductorAsset_ConductorSegment()
	 * @see CIM.IEC61968.WiresExt.DistributionLineSegment#getConductorAssets
	 * @model opposite="ConductorAssets"
	 * @generated
	 */
	DistributionLineSegment getConductorSegment();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment <em>Conductor Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor Segment</em>' reference.
	 * @see #getConductorSegment()
	 * @generated
	 */
	void setConductorSegment(DistributionLineSegment value);

	/**
	 * Returns the value of the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulated</em>' attribute.
	 * @see #setInsulated(boolean)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getConductorAsset_Insulated()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if conductor asset has an insulator around the core material.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if conductor asset has an insulator around the core material.'"
	 * @generated
	 */
	boolean isInsulated();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulated</em>' attribute.
	 * @see #isInsulated()
	 * @generated
	 */
	void setInsulated(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Horizontal</em>' attribute.
	 * @see #setIsHorizontal(boolean)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getConductorAsset_IsHorizontal()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when orientation is horizontal (e.g., transmission and distribution lines), false if vertical (e.g. a riser for underground to overhead service).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when orientation is horizontal (e.g., transmission and distribution lines), false if vertical (e.g. a riser for underground to overhead service).'"
	 * @generated
	 */
	boolean isIsHorizontal();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Horizontal</em>' attribute.
	 * @see #isIsHorizontal()
	 * @generated
	 */
	void setIsHorizontal(boolean value);

} // ConductorAsset
