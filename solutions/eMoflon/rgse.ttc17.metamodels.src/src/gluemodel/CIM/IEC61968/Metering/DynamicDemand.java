/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand#getSubInterval <em>Sub Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand#getInterval <em>Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDynamicDemand()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Dynamic demand description. The formula by which demand is measured is an important underlying definition to the measurement. Generally speaking, all of the meters in a given utility will be configured to measure demand the same way. Nevertheless, it must be defined. An \'interval\' of 60, 30, 15, 10, or 5 minutes must be defined to describe the interval of time over which usage is measured. When demand is defined to be DemandKind.rollingBlock, both an \'interval\' and a \'subinterval\' must be defined, where the \'subinterval\' must be a multiple of the \'interval\' which contains it. A common setting is \"15-minute rolling block with 5-minute subintervals.\"'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Dynamic demand description. The formula by which demand is measured is an important underlying definition to the measurement. Generally speaking, all of the meters in a given utility will be configured to measure demand the same way. Nevertheless, it must be defined. An \'interval\' of 60, 30, 15, 10, or 5 minutes must be defined to describe the interval of time over which usage is measured. When demand is defined to be DemandKind.rollingBlock, both an \'interval\' and a \'subinterval\' must be defined, where the \'subinterval\' must be a multiple of the \'interval\' which contains it. A common setting is \"15-minute rolling block with 5-minute subintervals.\"'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Dynamic demand description. The formula by which demand is measured is an important underlying definition to the measurement. Generally speaking, all of the meters in a given utility will be configured to measure demand the same way. Nevertheless, it must be defined. An \'interval\' of 60, 30, 15, 10, or 5 minutes must be defined to describe the interval of time over which usage is measured. When demand is defined to be DemandKind.rollingBlock, both an \'interval\' and a \'subinterval\' must be defined, where the \'subinterval\' must be a multiple of the \'interval\' which contains it. A common setting is \"15-minute rolling block with 5-minute subintervals.\"' Profile\040documentation='Dynamic demand description. The formula by which demand is measured is an important underlying definition to the measurement. Generally speaking, all of the meters in a given utility will be configured to measure demand the same way. Nevertheless, it must be defined. An \'interval\' of 60, 30, 15, 10, or 5 minutes must be defined to describe the interval of time over which usage is measured. When demand is defined to be DemandKind.rollingBlock, both an \'interval\' and a \'subinterval\' must be defined, where the \'subinterval\' must be a multiple of the \'interval\' which contains it. A common setting is \"15-minute rolling block with 5-minute subintervals.\"'"
 * @generated
 */
public interface DynamicDemand extends Element {
	/**
	 * Returns the value of the '<em><b>Sub Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Interval</em>' attribute.
	 * @see #setSubInterval(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDynamicDemand_SubInterval()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if \'kind\'=rollingBlock) Subinterval, must be multiple of \'interval\' that contains it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if \'kind\'=rollingBlock) Subinterval, must be multiple of \'interval\' that contains it.'"
	 * @generated
	 */
	float getSubInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand#getSubInterval <em>Sub Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Interval</em>' attribute.
	 * @see #getSubInterval()
	 * @generated
	 */
	void setSubInterval(float value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDynamicDemand_Interval()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Demand interval.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Demand interval.'"
	 * @generated
	 */
	float getInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(float value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.Metering.DemandKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.Metering.DemandKind
	 * @see #setKind(DemandKind)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getDynamicDemand_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of demand.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of demand.'"
	 * @generated
	 */
	DemandKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.Metering.DemandKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DemandKind value);

} // DynamicDemand
