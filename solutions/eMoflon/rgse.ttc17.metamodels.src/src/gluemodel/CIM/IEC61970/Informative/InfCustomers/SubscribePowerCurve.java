/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCustomers;

import gluemodel.CIM.IEC61968.Customers.PricingStructure;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscribe Power Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve#getPricingStructure <em>Pricing Structure</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getSubscribePowerCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Price curve for specifying the cost of energy (X) at points in time (y1) according to a prcing structure, which is based on a tariff.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Price curve for specifying the cost of energy (X) at points in time (y1) according to a prcing structure, which is based on a tariff.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Price curve for specifying the cost of energy (X) at points in time (y1) according to a prcing structure, which is based on a tariff.' Profile\040documentation='Price curve for specifying the cost of energy (X) at points in time (y1) according to a prcing structure, which is based on a tariff.'"
 * @generated
 */
public interface SubscribePowerCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Pricing Structure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getSubscribePowerCurve <em>Subscribe Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structure</em>' reference.
	 * @see #setPricingStructure(PricingStructure)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getSubscribePowerCurve_PricingStructure()
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getSubscribePowerCurve
	 * @model opposite="SubscribePowerCurve"
	 * @generated
	 */
	PricingStructure getPricingStructure();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve#getPricingStructure <em>Pricing Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Structure</em>' reference.
	 * @see #getPricingStructure()
	 * @generated
	 */
	void setPricingStructure(PricingStructure value);

} // SubscribePowerCurve
