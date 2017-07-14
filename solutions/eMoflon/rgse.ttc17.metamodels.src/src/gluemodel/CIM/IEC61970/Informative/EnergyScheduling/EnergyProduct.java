/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling;

import gluemodel.CIM.IEC61968.Common.Agreement;

import gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider;
import gluemodel.CIM.IEC61970.Informative.Financial.Marketer;

import gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getGenerationProvider <em>Generation Provider</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getTitleHeldBy_Marketer <em>Title Held By Marketer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getEnergyTransactions <em>Energy Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getResoldBy_Marketers <em>Resold By Marketers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getServicePoint <em>Service Point</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyProduct()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An EnergyProduct is offered commercially as a ContractOrTariff.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An EnergyProduct is offered commercially as a ContractOrTariff.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An EnergyProduct is offered commercially as a ContractOrTariff.' Profile\040documentation='An EnergyProduct is offered commercially as a ContractOrTariff.'"
 * @generated
 */
public interface EnergyProduct extends Agreement {
	/**
	 * Returns the value of the '<em><b>Generation Provider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider#getEnergyProducts <em>Energy Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Provider</em>' reference.
	 * @see #setGenerationProvider(GenerationProvider)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyProduct_GenerationProvider()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider#getEnergyProducts
	 * @model opposite="EnergyProducts"
	 * @generated
	 */
	GenerationProvider getGenerationProvider();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getGenerationProvider <em>Generation Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Provider</em>' reference.
	 * @see #getGenerationProvider()
	 * @generated
	 */
	void setGenerationProvider(GenerationProvider value);

	/**
	 * Returns the value of the '<em><b>Title Held By Marketer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.Marketer#getHoldsTitleTo_EnergyProducts <em>Holds Title To Energy Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Held By Marketer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Held By Marketer</em>' reference.
	 * @see #setTitleHeldBy_Marketer(Marketer)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyProduct_TitleHeldBy_Marketer()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.Marketer#getHoldsTitleTo_EnergyProducts
	 * @model opposite="HoldsTitleTo_EnergyProducts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Marketer holds title to an EnergyProduct.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Marketer holds title to an EnergyProduct.'"
	 * @generated
	 */
	Marketer getTitleHeldBy_Marketer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getTitleHeldBy_Marketer <em>Title Held By Marketer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Held By Marketer</em>' reference.
	 * @see #getTitleHeldBy_Marketer()
	 * @generated
	 */
	void setTitleHeldBy_Marketer(Marketer value);

	/**
	 * Returns the value of the '<em><b>Energy Transactions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProduct <em>Energy Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Transactions</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyProduct_EnergyTransactions()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProduct
	 * @model opposite="EnergyProduct"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The \"Source\" for an EnergyTransaction is an EnergyProduct which is injected into a ControlArea.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The \"Source\" for an EnergyTransaction is an EnergyProduct which is injected into a ControlArea.'"
	 * @generated
	 */
	EList<EnergyTransaction> getEnergyTransactions();

	/**
	 * Returns the value of the '<em><b>Resold By Marketers</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Financial.Marketer}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.Marketer#getResells_EnergyProduct <em>Resells Energy Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resold By Marketers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resold By Marketers</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyProduct_ResoldBy_Marketers()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.Marketer#getResells_EnergyProduct
	 * @model opposite="Resells_EnergyProduct"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Marketer may resell an EnergyProduct.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Marketer may resell an EnergyProduct.'"
	 * @generated
	 */
	EList<Marketer> getResoldBy_Marketers();

	/**
	 * Returns the value of the '<em><b>Service Point</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getEnergyProducts <em>Energy Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Point</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyProduct_ServicePoint()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getEnergyProducts
	 * @model opposite="EnergyProducts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An EnergyProduct injects energy into a service point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An EnergyProduct injects energy into a service point.'"
	 * @generated
	 */
	EList<ServicePoint> getServicePoint();

} // EnergyProduct
