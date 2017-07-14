/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer And Line Losses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses_P <em>Active line losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses_M <em>Active line losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses <em>Active line losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses_P <em>Active transformer losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses_M <em>Active transformer losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses <em>Active transformer losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses_P <em>Active losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses_M <em>Active losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses <em>Active losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses_P <em>Reactive line losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses_M <em>Reactive line losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses <em>Reactive line losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses_P <em>Reactive transformer losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses_M <em>Reactive transformer losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses <em>Reactive transformer losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses_P <em>Reactive losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses_M <em>Reactive losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses <em>Reactive losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getTotal_normalized_transformer_losses <em>Total normalized transformer losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getTotal_normalized_line_losses <em>Total normalized line losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_gross_P <em>Compensated active gross P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_net_P <em>Compensated active net P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_gross_M <em>Compensated active gross M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_net_M <em>Compensated active net M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_gross_P <em>Compensated reactive gross P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_net_P <em>Compensated reactive net P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_gross_M <em>Compensated reactive gross M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_net_M <em>Compensated reactive net M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_line_losses <em>L1active line losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_line_losses_M <em>L1active line losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses_P <em>L1active transformer losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses_M <em>L1active transformer losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses <em>L1active transformer losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses_P <em>L1active losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses_M <em>L1active losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses <em>L1active losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses_P <em>L1reactive line losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses_M <em>L1reactive line losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses <em>L1reactive line losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses_P <em>L1reactive transformer losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses_M <em>L1reactive transformer losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses <em>L1reactive transformer losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses_P <em>L1 Reactive losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses_M <em>L1 Reactive losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses <em>L1 Reactive losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Ampere_squared_hours <em>L1 Ampere squared hours</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Volt_squared_hours <em>L1 Volt squared hours</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_line_losses_P <em>L2active line losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_line_losses_M <em>L2active line losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses_P <em>L2active transformer losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses_M <em>L2active transformer losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses <em>L2active transformer losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses_P <em>L2active losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses_M <em>L2active losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses <em>L2active losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses_P <em>L2reactive line losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses_M <em>L2reactive line losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses <em>L2reactive line losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses <em>L2reactive transformer losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses_P <em>L2reactive transformer losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses_M <em>L2reactive transformer losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses <em>L2reactive losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses_P <em>L2reactive losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses_M <em>L2reactive losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2Ampere_squared_hours <em>L2 Ampere squared hours</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2Volt_squared_hours <em>L2 Volt squared hours</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Active_line_losses_P <em>L3 Active line losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Active_line_losses_M <em>L3 Active line losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses_P <em>L3active transformer losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses_M <em>L3active transformer losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses <em>L3active transformer losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses_P <em>L3active losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses_M <em>L3active losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses <em>L3active losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses_P <em>L3reactive line losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses_M <em>L3reactive line losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses <em>L3reactive line losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses_P <em>L3reactive transformer losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses_M <em>L3reactive transformer losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses <em>L3reactive transformer losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses_P <em>L3reactive losses P</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses_M <em>L3reactive losses M</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses <em>L3reactive losses</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Ampere_squared_hours <em>L3 Ampere squared hours</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Volt_Squared_hours <em>L3 Volt Squared hours</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses()
 * @model
 * @generated
 */
public interface TransformerAndLineLosses extends Data {
	/**
	 * Returns the value of the '<em><b>Active line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active line losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active line losses P</em>' attribute.
	 * @see #setActive_line_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Active_line_losses_P()
	 * @model
	 * @generated
	 */
	double getActive_line_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses_P <em>Active line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active line losses P</em>' attribute.
	 * @see #getActive_line_losses_P()
	 * @generated
	 */
	void setActive_line_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>Active line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active line losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active line losses M</em>' attribute.
	 * @see #setActive_line_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Active_line_losses_M()
	 * @model
	 * @generated
	 */
	double getActive_line_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses_M <em>Active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active line losses M</em>' attribute.
	 * @see #getActive_line_losses_M()
	 * @generated
	 */
	void setActive_line_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>Active line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active line losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active line losses</em>' attribute.
	 * @see #setActive_line_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Active_line_losses()
	 * @model
	 * @generated
	 */
	double getActive_line_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses <em>Active line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active line losses</em>' attribute.
	 * @see #getActive_line_losses()
	 * @generated
	 */
	void setActive_line_losses(double value);

	/**
	 * Returns the value of the '<em><b>Active transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active transformer losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active transformer losses P</em>' attribute.
	 * @see #setActive_transformer_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Active_transformer_losses_P()
	 * @model
	 * @generated
	 */
	double getActive_transformer_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses_P <em>Active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active transformer losses P</em>' attribute.
	 * @see #getActive_transformer_losses_P()
	 * @generated
	 */
	void setActive_transformer_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>Active transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active transformer losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active transformer losses M</em>' attribute.
	 * @see #setActive_transformer_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Active_transformer_losses_M()
	 * @model
	 * @generated
	 */
	double getActive_transformer_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses_M <em>Active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active transformer losses M</em>' attribute.
	 * @see #getActive_transformer_losses_M()
	 * @generated
	 */
	void setActive_transformer_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>Active transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active transformer losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active transformer losses</em>' attribute.
	 * @see #setActive_transformer_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Active_transformer_losses()
	 * @model
	 * @generated
	 */
	double getActive_transformer_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses <em>Active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active transformer losses</em>' attribute.
	 * @see #getActive_transformer_losses()
	 * @generated
	 */
	void setActive_transformer_losses(double value);

	/**
	 * Returns the value of the '<em><b>Active losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active losses P</em>' attribute.
	 * @see #setActive_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Active_losses_P()
	 * @model
	 * @generated
	 */
	double getActive_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses_P <em>Active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active losses P</em>' attribute.
	 * @see #getActive_losses_P()
	 * @generated
	 */
	void setActive_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>Active losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active losses M</em>' attribute.
	 * @see #setActive_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Active_losses_M()
	 * @model
	 * @generated
	 */
	double getActive_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses_M <em>Active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active losses M</em>' attribute.
	 * @see #getActive_losses_M()
	 * @generated
	 */
	void setActive_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>Active losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active losses</em>' attribute.
	 * @see #setActive_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Active_losses()
	 * @model
	 * @generated
	 */
	double getActive_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses <em>Active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active losses</em>' attribute.
	 * @see #getActive_losses()
	 * @generated
	 */
	void setActive_losses(double value);

	/**
	 * Returns the value of the '<em><b>Reactive line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive line losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive line losses P</em>' attribute.
	 * @see #setReactive_line_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Reactive_line_losses_P()
	 * @model
	 * @generated
	 */
	double getReactive_line_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses_P <em>Reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive line losses P</em>' attribute.
	 * @see #getReactive_line_losses_P()
	 * @generated
	 */
	void setReactive_line_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>Reactive line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive line losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive line losses M</em>' attribute.
	 * @see #setReactive_line_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Reactive_line_losses_M()
	 * @model
	 * @generated
	 */
	double getReactive_line_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses_M <em>Reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive line losses M</em>' attribute.
	 * @see #getReactive_line_losses_M()
	 * @generated
	 */
	void setReactive_line_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>Reactive line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive line losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive line losses</em>' attribute.
	 * @see #setReactive_line_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Reactive_line_losses()
	 * @model
	 * @generated
	 */
	double getReactive_line_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses <em>Reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive line losses</em>' attribute.
	 * @see #getReactive_line_losses()
	 * @generated
	 */
	void setReactive_line_losses(double value);

	/**
	 * Returns the value of the '<em><b>Reactive transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive transformer losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive transformer losses P</em>' attribute.
	 * @see #setReactive_transformer_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Reactive_transformer_losses_P()
	 * @model
	 * @generated
	 */
	double getReactive_transformer_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses_P <em>Reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive transformer losses P</em>' attribute.
	 * @see #getReactive_transformer_losses_P()
	 * @generated
	 */
	void setReactive_transformer_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>Reactive transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive transformer losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive transformer losses M</em>' attribute.
	 * @see #setReactive_transformer_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Reactive_transformer_losses_M()
	 * @model
	 * @generated
	 */
	double getReactive_transformer_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses_M <em>Reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive transformer losses M</em>' attribute.
	 * @see #getReactive_transformer_losses_M()
	 * @generated
	 */
	void setReactive_transformer_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>Reactive transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive transformer losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive transformer losses</em>' attribute.
	 * @see #setReactive_transformer_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Reactive_transformer_losses()
	 * @model
	 * @generated
	 */
	double getReactive_transformer_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses <em>Reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive transformer losses</em>' attribute.
	 * @see #getReactive_transformer_losses()
	 * @generated
	 */
	void setReactive_transformer_losses(double value);

	/**
	 * Returns the value of the '<em><b>Reactive losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive losses P</em>' attribute.
	 * @see #setReactive_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Reactive_losses_P()
	 * @model
	 * @generated
	 */
	double getReactive_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses_P <em>Reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive losses P</em>' attribute.
	 * @see #getReactive_losses_P()
	 * @generated
	 */
	void setReactive_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>Reactive losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive losses M</em>' attribute.
	 * @see #setReactive_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Reactive_losses_M()
	 * @model
	 * @generated
	 */
	double getReactive_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses_M <em>Reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive losses M</em>' attribute.
	 * @see #getReactive_losses_M()
	 * @generated
	 */
	void setReactive_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>Reactive losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive losses</em>' attribute.
	 * @see #setReactive_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Reactive_losses()
	 * @model
	 * @generated
	 */
	double getReactive_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses <em>Reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive losses</em>' attribute.
	 * @see #getReactive_losses()
	 * @generated
	 */
	void setReactive_losses(double value);

	/**
	 * Returns the value of the '<em><b>Total normalized transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total normalized transformer losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total normalized transformer losses</em>' attribute.
	 * @see #setTotal_normalized_transformer_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Total_normalized_transformer_losses()
	 * @model
	 * @generated
	 */
	double getTotal_normalized_transformer_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getTotal_normalized_transformer_losses <em>Total normalized transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total normalized transformer losses</em>' attribute.
	 * @see #getTotal_normalized_transformer_losses()
	 * @generated
	 */
	void setTotal_normalized_transformer_losses(double value);

	/**
	 * Returns the value of the '<em><b>Total normalized line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total normalized line losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total normalized line losses</em>' attribute.
	 * @see #setTotal_normalized_line_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Total_normalized_line_losses()
	 * @model
	 * @generated
	 */
	double getTotal_normalized_line_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getTotal_normalized_line_losses <em>Total normalized line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total normalized line losses</em>' attribute.
	 * @see #getTotal_normalized_line_losses()
	 * @generated
	 */
	void setTotal_normalized_line_losses(double value);

	/**
	 * Returns the value of the '<em><b>Compensated active gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensated active gross P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensated active gross P</em>' attribute.
	 * @see #setCompensated_active_gross_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Compensated_active_gross_P()
	 * @model
	 * @generated
	 */
	double getCompensated_active_gross_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_gross_P <em>Compensated active gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensated active gross P</em>' attribute.
	 * @see #getCompensated_active_gross_P()
	 * @generated
	 */
	void setCompensated_active_gross_P(double value);

	/**
	 * Returns the value of the '<em><b>Compensated active net P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensated active net P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensated active net P</em>' attribute.
	 * @see #setCompensated_active_net_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Compensated_active_net_P()
	 * @model
	 * @generated
	 */
	double getCompensated_active_net_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_net_P <em>Compensated active net P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensated active net P</em>' attribute.
	 * @see #getCompensated_active_net_P()
	 * @generated
	 */
	void setCompensated_active_net_P(double value);

	/**
	 * Returns the value of the '<em><b>Compensated active gross M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensated active gross M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensated active gross M</em>' attribute.
	 * @see #setCompensated_active_gross_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Compensated_active_gross_M()
	 * @model
	 * @generated
	 */
	double getCompensated_active_gross_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_gross_M <em>Compensated active gross M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensated active gross M</em>' attribute.
	 * @see #getCompensated_active_gross_M()
	 * @generated
	 */
	void setCompensated_active_gross_M(double value);

	/**
	 * Returns the value of the '<em><b>Compensated active net M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensated active net M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensated active net M</em>' attribute.
	 * @see #setCompensated_active_net_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Compensated_active_net_M()
	 * @model
	 * @generated
	 */
	double getCompensated_active_net_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_net_M <em>Compensated active net M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensated active net M</em>' attribute.
	 * @see #getCompensated_active_net_M()
	 * @generated
	 */
	void setCompensated_active_net_M(double value);

	/**
	 * Returns the value of the '<em><b>Compensated reactive gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensated reactive gross P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensated reactive gross P</em>' attribute.
	 * @see #setCompensated_reactive_gross_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Compensated_reactive_gross_P()
	 * @model
	 * @generated
	 */
	double getCompensated_reactive_gross_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_gross_P <em>Compensated reactive gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensated reactive gross P</em>' attribute.
	 * @see #getCompensated_reactive_gross_P()
	 * @generated
	 */
	void setCompensated_reactive_gross_P(double value);

	/**
	 * Returns the value of the '<em><b>Compensated reactive net P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensated reactive net P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensated reactive net P</em>' attribute.
	 * @see #setCompensated_reactive_net_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Compensated_reactive_net_P()
	 * @model
	 * @generated
	 */
	double getCompensated_reactive_net_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_net_P <em>Compensated reactive net P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensated reactive net P</em>' attribute.
	 * @see #getCompensated_reactive_net_P()
	 * @generated
	 */
	void setCompensated_reactive_net_P(double value);

	/**
	 * Returns the value of the '<em><b>Compensated reactive gross M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensated reactive gross M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensated reactive gross M</em>' attribute.
	 * @see #setCompensated_reactive_gross_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Compensated_reactive_gross_M()
	 * @model
	 * @generated
	 */
	double getCompensated_reactive_gross_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_gross_M <em>Compensated reactive gross M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensated reactive gross M</em>' attribute.
	 * @see #getCompensated_reactive_gross_M()
	 * @generated
	 */
	void setCompensated_reactive_gross_M(double value);

	/**
	 * Returns the value of the '<em><b>Compensated reactive net M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensated reactive net M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensated reactive net M</em>' attribute.
	 * @see #setCompensated_reactive_net_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_Compensated_reactive_net_M()
	 * @model
	 * @generated
	 */
	double getCompensated_reactive_net_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_net_M <em>Compensated reactive net M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensated reactive net M</em>' attribute.
	 * @see #getCompensated_reactive_net_M()
	 * @generated
	 */
	void setCompensated_reactive_net_M(double value);

	/**
	 * Returns the value of the '<em><b>L1active line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1active line losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1active line losses</em>' attribute.
	 * @see #setL1active_line_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1active_line_losses()
	 * @model
	 * @generated
	 */
	double getL1active_line_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_line_losses <em>L1active line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1active line losses</em>' attribute.
	 * @see #getL1active_line_losses()
	 * @generated
	 */
	void setL1active_line_losses(double value);

	/**
	 * Returns the value of the '<em><b>L1active line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1active line losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1active line losses M</em>' attribute.
	 * @see #setL1active_line_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1active_line_losses_M()
	 * @model
	 * @generated
	 */
	double getL1active_line_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_line_losses_M <em>L1active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1active line losses M</em>' attribute.
	 * @see #getL1active_line_losses_M()
	 * @generated
	 */
	void setL1active_line_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L1active transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1active transformer losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1active transformer losses P</em>' attribute.
	 * @see #setL1active_transformer_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1active_transformer_losses_P()
	 * @model
	 * @generated
	 */
	double getL1active_transformer_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses_P <em>L1active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1active transformer losses P</em>' attribute.
	 * @see #getL1active_transformer_losses_P()
	 * @generated
	 */
	void setL1active_transformer_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L1active transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1active transformer losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1active transformer losses M</em>' attribute.
	 * @see #setL1active_transformer_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1active_transformer_losses_M()
	 * @model
	 * @generated
	 */
	double getL1active_transformer_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses_M <em>L1active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1active transformer losses M</em>' attribute.
	 * @see #getL1active_transformer_losses_M()
	 * @generated
	 */
	void setL1active_transformer_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L1active transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1active transformer losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1active transformer losses</em>' attribute.
	 * @see #setL1active_transformer_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1active_transformer_losses()
	 * @model
	 * @generated
	 */
	double getL1active_transformer_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses <em>L1active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1active transformer losses</em>' attribute.
	 * @see #getL1active_transformer_losses()
	 * @generated
	 */
	void setL1active_transformer_losses(double value);

	/**
	 * Returns the value of the '<em><b>L1active losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1active losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1active losses P</em>' attribute.
	 * @see #setL1active_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1active_losses_P()
	 * @model
	 * @generated
	 */
	double getL1active_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses_P <em>L1active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1active losses P</em>' attribute.
	 * @see #getL1active_losses_P()
	 * @generated
	 */
	void setL1active_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L1active losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1active losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1active losses M</em>' attribute.
	 * @see #setL1active_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1active_losses_M()
	 * @model
	 * @generated
	 */
	double getL1active_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses_M <em>L1active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1active losses M</em>' attribute.
	 * @see #getL1active_losses_M()
	 * @generated
	 */
	void setL1active_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L1active losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1active losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1active losses</em>' attribute.
	 * @see #setL1active_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1active_losses()
	 * @model
	 * @generated
	 */
	double getL1active_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses <em>L1active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1active losses</em>' attribute.
	 * @see #getL1active_losses()
	 * @generated
	 */
	void setL1active_losses(double value);

	/**
	 * Returns the value of the '<em><b>L1reactive line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1reactive line losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1reactive line losses P</em>' attribute.
	 * @see #setL1reactive_line_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1reactive_line_losses_P()
	 * @model
	 * @generated
	 */
	double getL1reactive_line_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses_P <em>L1reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1reactive line losses P</em>' attribute.
	 * @see #getL1reactive_line_losses_P()
	 * @generated
	 */
	void setL1reactive_line_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L1reactive line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1reactive line losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1reactive line losses M</em>' attribute.
	 * @see #setL1reactive_line_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1reactive_line_losses_M()
	 * @model
	 * @generated
	 */
	double getL1reactive_line_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses_M <em>L1reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1reactive line losses M</em>' attribute.
	 * @see #getL1reactive_line_losses_M()
	 * @generated
	 */
	void setL1reactive_line_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L1reactive line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1reactive line losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1reactive line losses</em>' attribute.
	 * @see #setL1reactive_line_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1reactive_line_losses()
	 * @model
	 * @generated
	 */
	double getL1reactive_line_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses <em>L1reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1reactive line losses</em>' attribute.
	 * @see #getL1reactive_line_losses()
	 * @generated
	 */
	void setL1reactive_line_losses(double value);

	/**
	 * Returns the value of the '<em><b>L1reactive transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1reactive transformer losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1reactive transformer losses P</em>' attribute.
	 * @see #setL1reactive_transformer_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1reactive_transformer_losses_P()
	 * @model
	 * @generated
	 */
	double getL1reactive_transformer_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses_P <em>L1reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1reactive transformer losses P</em>' attribute.
	 * @see #getL1reactive_transformer_losses_P()
	 * @generated
	 */
	void setL1reactive_transformer_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L1reactive transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1reactive transformer losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1reactive transformer losses M</em>' attribute.
	 * @see #setL1reactive_transformer_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1reactive_transformer_losses_M()
	 * @model
	 * @generated
	 */
	double getL1reactive_transformer_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses_M <em>L1reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1reactive transformer losses M</em>' attribute.
	 * @see #getL1reactive_transformer_losses_M()
	 * @generated
	 */
	void setL1reactive_transformer_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L1reactive transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1reactive transformer losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1reactive transformer losses</em>' attribute.
	 * @see #setL1reactive_transformer_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1reactive_transformer_losses()
	 * @model
	 * @generated
	 */
	double getL1reactive_transformer_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses <em>L1reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1reactive transformer losses</em>' attribute.
	 * @see #getL1reactive_transformer_losses()
	 * @generated
	 */
	void setL1reactive_transformer_losses(double value);

	/**
	 * Returns the value of the '<em><b>L1 Reactive losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1 Reactive losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1 Reactive losses P</em>' attribute.
	 * @see #setL1Reactive_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1Reactive_losses_P()
	 * @model
	 * @generated
	 */
	double getL1Reactive_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses_P <em>L1 Reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1 Reactive losses P</em>' attribute.
	 * @see #getL1Reactive_losses_P()
	 * @generated
	 */
	void setL1Reactive_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L1 Reactive losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1 Reactive losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1 Reactive losses M</em>' attribute.
	 * @see #setL1Reactive_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1Reactive_losses_M()
	 * @model
	 * @generated
	 */
	double getL1Reactive_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses_M <em>L1 Reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1 Reactive losses M</em>' attribute.
	 * @see #getL1Reactive_losses_M()
	 * @generated
	 */
	void setL1Reactive_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L1 Reactive losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1 Reactive losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1 Reactive losses</em>' attribute.
	 * @see #setL1Reactive_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1Reactive_losses()
	 * @model
	 * @generated
	 */
	double getL1Reactive_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses <em>L1 Reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1 Reactive losses</em>' attribute.
	 * @see #getL1Reactive_losses()
	 * @generated
	 */
	void setL1Reactive_losses(double value);

	/**
	 * Returns the value of the '<em><b>L1 Ampere squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1 Ampere squared hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1 Ampere squared hours</em>' attribute.
	 * @see #setL1Ampere_squared_hours(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1Ampere_squared_hours()
	 * @model
	 * @generated
	 */
	double getL1Ampere_squared_hours();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Ampere_squared_hours <em>L1 Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1 Ampere squared hours</em>' attribute.
	 * @see #getL1Ampere_squared_hours()
	 * @generated
	 */
	void setL1Ampere_squared_hours(double value);

	/**
	 * Returns the value of the '<em><b>L1 Volt squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1 Volt squared hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1 Volt squared hours</em>' attribute.
	 * @see #setL1Volt_squared_hours(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L1Volt_squared_hours()
	 * @model
	 * @generated
	 */
	double getL1Volt_squared_hours();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Volt_squared_hours <em>L1 Volt squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1 Volt squared hours</em>' attribute.
	 * @see #getL1Volt_squared_hours()
	 * @generated
	 */
	void setL1Volt_squared_hours(double value);

	/**
	 * Returns the value of the '<em><b>L2active line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2active line losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2active line losses P</em>' attribute.
	 * @see #setL2active_line_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2active_line_losses_P()
	 * @model
	 * @generated
	 */
	double getL2active_line_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_line_losses_P <em>L2active line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2active line losses P</em>' attribute.
	 * @see #getL2active_line_losses_P()
	 * @generated
	 */
	void setL2active_line_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L2active line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2active line losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2active line losses M</em>' attribute.
	 * @see #setL2active_line_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2active_line_losses_M()
	 * @model
	 * @generated
	 */
	double getL2active_line_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_line_losses_M <em>L2active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2active line losses M</em>' attribute.
	 * @see #getL2active_line_losses_M()
	 * @generated
	 */
	void setL2active_line_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L2active transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2active transformer losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2active transformer losses P</em>' attribute.
	 * @see #setL2active_transformer_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2active_transformer_losses_P()
	 * @model
	 * @generated
	 */
	double getL2active_transformer_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses_P <em>L2active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2active transformer losses P</em>' attribute.
	 * @see #getL2active_transformer_losses_P()
	 * @generated
	 */
	void setL2active_transformer_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L2active transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2active transformer losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2active transformer losses M</em>' attribute.
	 * @see #setL2active_transformer_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2active_transformer_losses_M()
	 * @model
	 * @generated
	 */
	double getL2active_transformer_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses_M <em>L2active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2active transformer losses M</em>' attribute.
	 * @see #getL2active_transformer_losses_M()
	 * @generated
	 */
	void setL2active_transformer_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L2active transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2active transformer losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2active transformer losses</em>' attribute.
	 * @see #setL2active_transformer_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2active_transformer_losses()
	 * @model
	 * @generated
	 */
	double getL2active_transformer_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses <em>L2active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2active transformer losses</em>' attribute.
	 * @see #getL2active_transformer_losses()
	 * @generated
	 */
	void setL2active_transformer_losses(double value);

	/**
	 * Returns the value of the '<em><b>L2active losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2active losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2active losses P</em>' attribute.
	 * @see #setL2active_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2active_losses_P()
	 * @model
	 * @generated
	 */
	double getL2active_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses_P <em>L2active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2active losses P</em>' attribute.
	 * @see #getL2active_losses_P()
	 * @generated
	 */
	void setL2active_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L2active losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2active losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2active losses M</em>' attribute.
	 * @see #setL2active_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2active_losses_M()
	 * @model
	 * @generated
	 */
	double getL2active_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses_M <em>L2active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2active losses M</em>' attribute.
	 * @see #getL2active_losses_M()
	 * @generated
	 */
	void setL2active_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L2active losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2active losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2active losses</em>' attribute.
	 * @see #setL2active_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2active_losses()
	 * @model
	 * @generated
	 */
	double getL2active_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses <em>L2active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2active losses</em>' attribute.
	 * @see #getL2active_losses()
	 * @generated
	 */
	void setL2active_losses(double value);

	/**
	 * Returns the value of the '<em><b>L2reactive line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2reactive line losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2reactive line losses P</em>' attribute.
	 * @see #setL2reactive_line_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2reactive_line_losses_P()
	 * @model
	 * @generated
	 */
	double getL2reactive_line_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses_P <em>L2reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2reactive line losses P</em>' attribute.
	 * @see #getL2reactive_line_losses_P()
	 * @generated
	 */
	void setL2reactive_line_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L2reactive line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2reactive line losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2reactive line losses M</em>' attribute.
	 * @see #setL2reactive_line_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2reactive_line_losses_M()
	 * @model
	 * @generated
	 */
	double getL2reactive_line_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses_M <em>L2reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2reactive line losses M</em>' attribute.
	 * @see #getL2reactive_line_losses_M()
	 * @generated
	 */
	void setL2reactive_line_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L2reactive line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2reactive line losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2reactive line losses</em>' attribute.
	 * @see #setL2reactive_line_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2reactive_line_losses()
	 * @model
	 * @generated
	 */
	double getL2reactive_line_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses <em>L2reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2reactive line losses</em>' attribute.
	 * @see #getL2reactive_line_losses()
	 * @generated
	 */
	void setL2reactive_line_losses(double value);

	/**
	 * Returns the value of the '<em><b>L2reactive transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2reactive transformer losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2reactive transformer losses</em>' attribute.
	 * @see #setL2reactive_transformer_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2reactive_transformer_losses()
	 * @model
	 * @generated
	 */
	double getL2reactive_transformer_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses <em>L2reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2reactive transformer losses</em>' attribute.
	 * @see #getL2reactive_transformer_losses()
	 * @generated
	 */
	void setL2reactive_transformer_losses(double value);

	/**
	 * Returns the value of the '<em><b>L2reactive transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2reactive transformer losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2reactive transformer losses P</em>' attribute.
	 * @see #setL2reactive_transformer_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2reactive_transformer_losses_P()
	 * @model
	 * @generated
	 */
	double getL2reactive_transformer_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses_P <em>L2reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2reactive transformer losses P</em>' attribute.
	 * @see #getL2reactive_transformer_losses_P()
	 * @generated
	 */
	void setL2reactive_transformer_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L2reactive transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2reactive transformer losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2reactive transformer losses M</em>' attribute.
	 * @see #setL2reactive_transformer_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2reactive_transformer_losses_M()
	 * @model
	 * @generated
	 */
	double getL2reactive_transformer_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses_M <em>L2reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2reactive transformer losses M</em>' attribute.
	 * @see #getL2reactive_transformer_losses_M()
	 * @generated
	 */
	void setL2reactive_transformer_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L2reactive losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2reactive losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2reactive losses</em>' attribute.
	 * @see #setL2reactive_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2reactive_losses()
	 * @model
	 * @generated
	 */
	double getL2reactive_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses <em>L2reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2reactive losses</em>' attribute.
	 * @see #getL2reactive_losses()
	 * @generated
	 */
	void setL2reactive_losses(double value);

	/**
	 * Returns the value of the '<em><b>L2reactive losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2reactive losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2reactive losses P</em>' attribute.
	 * @see #setL2reactive_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2reactive_losses_P()
	 * @model
	 * @generated
	 */
	double getL2reactive_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses_P <em>L2reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2reactive losses P</em>' attribute.
	 * @see #getL2reactive_losses_P()
	 * @generated
	 */
	void setL2reactive_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L2reactive losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2reactive losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2reactive losses M</em>' attribute.
	 * @see #setL2reactive_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2reactive_losses_M()
	 * @model
	 * @generated
	 */
	double getL2reactive_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses_M <em>L2reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2reactive losses M</em>' attribute.
	 * @see #getL2reactive_losses_M()
	 * @generated
	 */
	void setL2reactive_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L2 Ampere squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2 Ampere squared hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2 Ampere squared hours</em>' attribute.
	 * @see #setL2Ampere_squared_hours(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2Ampere_squared_hours()
	 * @model
	 * @generated
	 */
	double getL2Ampere_squared_hours();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2Ampere_squared_hours <em>L2 Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2 Ampere squared hours</em>' attribute.
	 * @see #getL2Ampere_squared_hours()
	 * @generated
	 */
	void setL2Ampere_squared_hours(double value);

	/**
	 * Returns the value of the '<em><b>L2 Volt squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2 Volt squared hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2 Volt squared hours</em>' attribute.
	 * @see #setL2Volt_squared_hours(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L2Volt_squared_hours()
	 * @model
	 * @generated
	 */
	double getL2Volt_squared_hours();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2Volt_squared_hours <em>L2 Volt squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2 Volt squared hours</em>' attribute.
	 * @see #getL2Volt_squared_hours()
	 * @generated
	 */
	void setL2Volt_squared_hours(double value);

	/**
	 * Returns the value of the '<em><b>L3 Active line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3 Active line losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3 Active line losses P</em>' attribute.
	 * @see #setL3Active_line_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3Active_line_losses_P()
	 * @model
	 * @generated
	 */
	double getL3Active_line_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Active_line_losses_P <em>L3 Active line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3 Active line losses P</em>' attribute.
	 * @see #getL3Active_line_losses_P()
	 * @generated
	 */
	void setL3Active_line_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L3 Active line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3 Active line losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3 Active line losses M</em>' attribute.
	 * @see #setL3Active_line_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3Active_line_losses_M()
	 * @model
	 * @generated
	 */
	double getL3Active_line_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Active_line_losses_M <em>L3 Active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3 Active line losses M</em>' attribute.
	 * @see #getL3Active_line_losses_M()
	 * @generated
	 */
	void setL3Active_line_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L3active transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3active transformer losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3active transformer losses P</em>' attribute.
	 * @see #setL3active_transformer_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3active_transformer_losses_P()
	 * @model
	 * @generated
	 */
	double getL3active_transformer_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses_P <em>L3active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3active transformer losses P</em>' attribute.
	 * @see #getL3active_transformer_losses_P()
	 * @generated
	 */
	void setL3active_transformer_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L3active transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3active transformer losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3active transformer losses M</em>' attribute.
	 * @see #setL3active_transformer_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3active_transformer_losses_M()
	 * @model
	 * @generated
	 */
	double getL3active_transformer_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses_M <em>L3active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3active transformer losses M</em>' attribute.
	 * @see #getL3active_transformer_losses_M()
	 * @generated
	 */
	void setL3active_transformer_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L3active transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3active transformer losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3active transformer losses</em>' attribute.
	 * @see #setL3active_transformer_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3active_transformer_losses()
	 * @model
	 * @generated
	 */
	double getL3active_transformer_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses <em>L3active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3active transformer losses</em>' attribute.
	 * @see #getL3active_transformer_losses()
	 * @generated
	 */
	void setL3active_transformer_losses(double value);

	/**
	 * Returns the value of the '<em><b>L3active losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3active losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3active losses P</em>' attribute.
	 * @see #setL3active_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3active_losses_P()
	 * @model
	 * @generated
	 */
	double getL3active_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses_P <em>L3active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3active losses P</em>' attribute.
	 * @see #getL3active_losses_P()
	 * @generated
	 */
	void setL3active_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L3active losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3active losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3active losses M</em>' attribute.
	 * @see #setL3active_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3active_losses_M()
	 * @model
	 * @generated
	 */
	double getL3active_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses_M <em>L3active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3active losses M</em>' attribute.
	 * @see #getL3active_losses_M()
	 * @generated
	 */
	void setL3active_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L3active losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3active losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3active losses</em>' attribute.
	 * @see #setL3active_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3active_losses()
	 * @model
	 * @generated
	 */
	double getL3active_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses <em>L3active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3active losses</em>' attribute.
	 * @see #getL3active_losses()
	 * @generated
	 */
	void setL3active_losses(double value);

	/**
	 * Returns the value of the '<em><b>L3reactive line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3reactive line losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3reactive line losses P</em>' attribute.
	 * @see #setL3reactive_line_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3reactive_line_losses_P()
	 * @model
	 * @generated
	 */
	double getL3reactive_line_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses_P <em>L3reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3reactive line losses P</em>' attribute.
	 * @see #getL3reactive_line_losses_P()
	 * @generated
	 */
	void setL3reactive_line_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L3reactive line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3reactive line losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3reactive line losses M</em>' attribute.
	 * @see #setL3reactive_line_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3reactive_line_losses_M()
	 * @model
	 * @generated
	 */
	double getL3reactive_line_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses_M <em>L3reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3reactive line losses M</em>' attribute.
	 * @see #getL3reactive_line_losses_M()
	 * @generated
	 */
	void setL3reactive_line_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L3reactive line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3reactive line losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3reactive line losses</em>' attribute.
	 * @see #setL3reactive_line_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3reactive_line_losses()
	 * @model
	 * @generated
	 */
	double getL3reactive_line_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses <em>L3reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3reactive line losses</em>' attribute.
	 * @see #getL3reactive_line_losses()
	 * @generated
	 */
	void setL3reactive_line_losses(double value);

	/**
	 * Returns the value of the '<em><b>L3reactive transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3reactive transformer losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3reactive transformer losses P</em>' attribute.
	 * @see #setL3reactive_transformer_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3reactive_transformer_losses_P()
	 * @model
	 * @generated
	 */
	double getL3reactive_transformer_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses_P <em>L3reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3reactive transformer losses P</em>' attribute.
	 * @see #getL3reactive_transformer_losses_P()
	 * @generated
	 */
	void setL3reactive_transformer_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L3reactive transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3reactive transformer losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3reactive transformer losses M</em>' attribute.
	 * @see #setL3reactive_transformer_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3reactive_transformer_losses_M()
	 * @model
	 * @generated
	 */
	double getL3reactive_transformer_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses_M <em>L3reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3reactive transformer losses M</em>' attribute.
	 * @see #getL3reactive_transformer_losses_M()
	 * @generated
	 */
	void setL3reactive_transformer_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L3reactive transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3reactive transformer losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3reactive transformer losses</em>' attribute.
	 * @see #setL3reactive_transformer_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3reactive_transformer_losses()
	 * @model
	 * @generated
	 */
	double getL3reactive_transformer_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses <em>L3reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3reactive transformer losses</em>' attribute.
	 * @see #getL3reactive_transformer_losses()
	 * @generated
	 */
	void setL3reactive_transformer_losses(double value);

	/**
	 * Returns the value of the '<em><b>L3reactive losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3reactive losses P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3reactive losses P</em>' attribute.
	 * @see #setL3reactive_losses_P(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3reactive_losses_P()
	 * @model
	 * @generated
	 */
	double getL3reactive_losses_P();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses_P <em>L3reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3reactive losses P</em>' attribute.
	 * @see #getL3reactive_losses_P()
	 * @generated
	 */
	void setL3reactive_losses_P(double value);

	/**
	 * Returns the value of the '<em><b>L3reactive losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3reactive losses M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3reactive losses M</em>' attribute.
	 * @see #setL3reactive_losses_M(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3reactive_losses_M()
	 * @model
	 * @generated
	 */
	double getL3reactive_losses_M();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses_M <em>L3reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3reactive losses M</em>' attribute.
	 * @see #getL3reactive_losses_M()
	 * @generated
	 */
	void setL3reactive_losses_M(double value);

	/**
	 * Returns the value of the '<em><b>L3reactive losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3reactive losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3reactive losses</em>' attribute.
	 * @see #setL3reactive_losses(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3reactive_losses()
	 * @model
	 * @generated
	 */
	double getL3reactive_losses();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses <em>L3reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3reactive losses</em>' attribute.
	 * @see #getL3reactive_losses()
	 * @generated
	 */
	void setL3reactive_losses(double value);

	/**
	 * Returns the value of the '<em><b>L3 Ampere squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3 Ampere squared hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3 Ampere squared hours</em>' attribute.
	 * @see #setL3Ampere_squared_hours(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3Ampere_squared_hours()
	 * @model
	 * @generated
	 */
	double getL3Ampere_squared_hours();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Ampere_squared_hours <em>L3 Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3 Ampere squared hours</em>' attribute.
	 * @see #getL3Ampere_squared_hours()
	 * @generated
	 */
	void setL3Ampere_squared_hours(double value);

	/**
	 * Returns the value of the '<em><b>L3 Volt Squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L3 Volt Squared hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L3 Volt Squared hours</em>' attribute.
	 * @see #setL3Volt_Squared_hours(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTransformerAndLineLosses_L3Volt_Squared_hours()
	 * @model
	 * @generated
	 */
	double getL3Volt_Squared_hours();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Volt_Squared_hours <em>L3 Volt Squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L3 Volt Squared hours</em>' attribute.
	 * @see #getL3Volt_Squared_hours()
	 * @generated
	 */
	void setL3Volt_Squared_hours(double value);

} // TransformerAndLineLosses
