/**
 */
package CIM.IEC61970.Informative.Financial;

import CIM.IEC61970.Generation.Production.GeneratingUnit;

import CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import CIM.IEC61970.Informative.Reservation.ServicePoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.GenerationProvider#getServicePoint <em>Service Point</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.GenerationProvider#getGeneratingUnits <em>Generating Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.GenerationProvider#getEnergyProducts <em>Energy Products</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getGenerationProvider()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The energy seller in the energy marketplace.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The energy seller in the energy marketplace.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The energy seller in the energy marketplace.' Profile\040documentation='The energy seller in the energy marketplace.'"
 * @generated
 */
public interface GenerationProvider extends ErpOrganisation {
	/**
	 * Returns the value of the '<em><b>Service Point</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.ServicePoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.ServicePoint#getGenerationProvider <em>Generation Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Point</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getGenerationProvider_ServicePoint()
	 * @see CIM.IEC61970.Informative.Reservation.ServicePoint#getGenerationProvider
	 * @model opposite="GenerationProvider"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A GenerationProvider has one or more ServicePoints where energy is injected into the network.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A GenerationProvider has one or more ServicePoints where energy is injected into the network.'"
	 * @generated
	 */
	EList<ServicePoint> getServicePoint();

	/**
	 * Returns the value of the '<em><b>Generating Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.GeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getOperatedBy_GenerationProvider <em>Operated By Generation Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getGenerationProvider_GeneratingUnits()
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getOperatedBy_GenerationProvider
	 * @model opposite="OperatedBy_GenerationProvider"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A GenerationProvider operates one or more GeneratingUnits.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A GenerationProvider operates one or more GeneratingUnits.'"
	 * @generated
	 */
	EList<GeneratingUnit> getGeneratingUnits();

	/**
	 * Returns the value of the '<em><b>Energy Products</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getGenerationProvider <em>Generation Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Products</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getGenerationProvider_EnergyProducts()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getGenerationProvider
	 * @model opposite="GenerationProvider"
	 * @generated
	 */
	EList<EnergyProduct> getEnergyProducts();

} // GenerationProvider
