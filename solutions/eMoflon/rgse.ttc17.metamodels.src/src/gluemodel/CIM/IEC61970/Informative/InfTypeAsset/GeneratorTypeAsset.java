/**
 */
package gluemodel.CIM.IEC61970.Informative.InfTypeAsset;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Type Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSync <em>XDirect Sync</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSync <em>RDirect Sync</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadTrans <em>RQuad Trans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSync <em>XQuad Sync</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSubtrans <em>XQuad Subtrans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinP <em>Min P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxP <em>Max P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSync <em>RQuad Sync</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSubtrans <em>XDirect Subtrans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectTrans <em>XDirect Trans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectTrans <em>RDirect Trans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSubtrans <em>RDirect Subtrans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadTrans <em>XQuad Trans</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSubtrans <em>RQuad Subtrans</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documentation for generic generation equipment that may be used for various purposes such as work planning. It defines both the Real and Reactive power properties (modelled at the PSR level as a GeneratingUnit + SynchronousMachine)'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documentation for generic generation equipment that may be used for various purposes such as work planning. It defines both the Real and Reactive power properties (modelled at the PSR level as a GeneratingUnit + SynchronousMachine)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documentation for generic generation equipment that may be used for various purposes such as work planning. It defines both the Real and Reactive power properties (modelled at the PSR level as a GeneratingUnit + SynchronousMachine)' Profile\040documentation='Documentation for generic generation equipment that may be used for various purposes such as work planning. It defines both the Real and Reactive power properties (modelled at the PSR level as a GeneratingUnit + SynchronousMachine)'"
 * @generated
 */
public interface GeneratorTypeAsset extends ElectricalTypeAsset {
	/**
	 * Returns the value of the '<em><b>XDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDirect Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDirect Sync</em>' attribute.
	 * @see #setXDirectSync(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_XDirectSync()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direct-axis synchronous reactance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direct-axis synchronous reactance'"
	 * @generated
	 */
	float getXDirectSync();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSync <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDirect Sync</em>' attribute.
	 * @see #getXDirectSync()
	 * @generated
	 */
	void setXDirectSync(float value);

	/**
	 * Returns the value of the '<em><b>RDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDirect Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDirect Sync</em>' attribute.
	 * @see #setRDirectSync(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_RDirectSync()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direct-axis synchronous resistance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direct-axis synchronous resistance'"
	 * @generated
	 */
	float getRDirectSync();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSync <em>RDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDirect Sync</em>' attribute.
	 * @see #getRDirectSync()
	 * @generated
	 */
	void setRDirectSync(float value);

	/**
	 * Returns the value of the '<em><b>RQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RQuad Trans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RQuad Trans</em>' attribute.
	 * @see #setRQuadTrans(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_RQuadTrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quadrature-axis Transient resistance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quadrature-axis Transient resistance'"
	 * @generated
	 */
	float getRQuadTrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadTrans <em>RQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RQuad Trans</em>' attribute.
	 * @see #getRQuadTrans()
	 * @generated
	 */
	void setRQuadTrans(float value);

	/**
	 * Returns the value of the '<em><b>XQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuad Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuad Sync</em>' attribute.
	 * @see #setXQuadSync(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_XQuadSync()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quadrature-axis synchronous reactance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quadrature-axis synchronous reactance'"
	 * @generated
	 */
	float getXQuadSync();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSync <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuad Sync</em>' attribute.
	 * @see #getXQuadSync()
	 * @generated
	 */
	void setXQuadSync(float value);

	/**
	 * Returns the value of the '<em><b>XQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuad Subtrans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuad Subtrans</em>' attribute.
	 * @see #setXQuadSubtrans(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_XQuadSubtrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quadrature-axis subtransient reactance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quadrature-axis subtransient reactance'"
	 * @generated
	 */
	float getXQuadSubtrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuad Subtrans</em>' attribute.
	 * @see #getXQuadSubtrans()
	 * @generated
	 */
	void setXQuadSubtrans(float value);

	/**
	 * Returns the value of the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min P</em>' attribute.
	 * @see #setMinP(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_MinP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum real power generated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum real power generated.'"
	 * @generated
	 */
	float getMinP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinP <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min P</em>' attribute.
	 * @see #getMinP()
	 * @generated
	 */
	void setMinP(float value);

	/**
	 * Returns the value of the '<em><b>Min Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Q</em>' attribute.
	 * @see #setMinQ(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_MinQ()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum reactive power generated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum reactive power generated.'"
	 * @generated
	 */
	float getMinQ();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinQ <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Q</em>' attribute.
	 * @see #getMinQ()
	 * @generated
	 */
	void setMinQ(float value);

	/**
	 * Returns the value of the '<em><b>Max Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Q</em>' attribute.
	 * @see #setMaxQ(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_MaxQ()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum reactive power limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum reactive power limit.'"
	 * @generated
	 */
	float getMaxQ();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxQ <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Q</em>' attribute.
	 * @see #getMaxQ()
	 * @generated
	 */
	void setMaxQ(float value);

	/**
	 * Returns the value of the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max P</em>' attribute.
	 * @see #setMaxP(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_MaxP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum real power limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum real power limit.'"
	 * @generated
	 */
	float getMaxP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxP <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max P</em>' attribute.
	 * @see #getMaxP()
	 * @generated
	 */
	void setMaxP(float value);

	/**
	 * Returns the value of the '<em><b>RQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RQuad Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RQuad Sync</em>' attribute.
	 * @see #setRQuadSync(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_RQuadSync()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quadrature-axis synchronous resistance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quadrature-axis synchronous resistance'"
	 * @generated
	 */
	float getRQuadSync();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSync <em>RQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RQuad Sync</em>' attribute.
	 * @see #getRQuadSync()
	 * @generated
	 */
	void setRQuadSync(float value);

	/**
	 * Returns the value of the '<em><b>XDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDirect Subtrans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDirect Subtrans</em>' attribute.
	 * @see #setXDirectSubtrans(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_XDirectSubtrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direct-axis subtransient reactance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direct-axis subtransient reactance'"
	 * @generated
	 */
	float getXDirectSubtrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDirect Subtrans</em>' attribute.
	 * @see #getXDirectSubtrans()
	 * @generated
	 */
	void setXDirectSubtrans(float value);

	/**
	 * Returns the value of the '<em><b>XDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDirect Trans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDirect Trans</em>' attribute.
	 * @see #setXDirectTrans(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_XDirectTrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direct-axis Transient reactance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direct-axis Transient reactance'"
	 * @generated
	 */
	float getXDirectTrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectTrans <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDirect Trans</em>' attribute.
	 * @see #getXDirectTrans()
	 * @generated
	 */
	void setXDirectTrans(float value);

	/**
	 * Returns the value of the '<em><b>RDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDirect Trans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDirect Trans</em>' attribute.
	 * @see #setRDirectTrans(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_RDirectTrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direct-axis Transient resistance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direct-axis Transient resistance'"
	 * @generated
	 */
	float getRDirectTrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectTrans <em>RDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDirect Trans</em>' attribute.
	 * @see #getRDirectTrans()
	 * @generated
	 */
	void setRDirectTrans(float value);

	/**
	 * Returns the value of the '<em><b>RDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDirect Subtrans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDirect Subtrans</em>' attribute.
	 * @see #setRDirectSubtrans(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_RDirectSubtrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direct-axis subtransient resistance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direct-axis subtransient resistance'"
	 * @generated
	 */
	float getRDirectSubtrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSubtrans <em>RDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDirect Subtrans</em>' attribute.
	 * @see #getRDirectSubtrans()
	 * @generated
	 */
	void setRDirectSubtrans(float value);

	/**
	 * Returns the value of the '<em><b>XQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuad Trans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuad Trans</em>' attribute.
	 * @see #setXQuadTrans(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_XQuadTrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quadrature-axis transient reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quadrature-axis transient reactance.'"
	 * @generated
	 */
	float getXQuadTrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadTrans <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuad Trans</em>' attribute.
	 * @see #getXQuadTrans()
	 * @generated
	 */
	void setXQuadTrans(float value);

	/**
	 * Returns the value of the '<em><b>RQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RQuad Subtrans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RQuad Subtrans</em>' attribute.
	 * @see #setRQuadSubtrans(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset_RQuadSubtrans()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quadrature-axis subtransient resistance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quadrature-axis subtransient resistance'"
	 * @generated
	 */
	float getRQuadSubtrans();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSubtrans <em>RQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RQuad Subtrans</em>' attribute.
	 * @see #getRQuadSubtrans()
	 * @generated
	 */
	void setRQuadSubtrans(float value);

} // GeneratorTypeAsset
