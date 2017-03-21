/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.TransformerAndLineLosses;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer And Line Losses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getActive_line_losses_P <em>Active line losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getActive_line_losses_M <em>Active line losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getActive_line_losses <em>Active line losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getActive_transformer_losses_P <em>Active transformer losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getActive_transformer_losses_M <em>Active transformer losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getActive_transformer_losses <em>Active transformer losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getActive_losses_P <em>Active losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getActive_losses_M <em>Active losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getActive_losses <em>Active losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getReactive_line_losses_P <em>Reactive line losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getReactive_line_losses_M <em>Reactive line losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getReactive_line_losses <em>Reactive line losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getReactive_transformer_losses_P <em>Reactive transformer losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getReactive_transformer_losses_M <em>Reactive transformer losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getReactive_transformer_losses <em>Reactive transformer losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getReactive_losses_P <em>Reactive losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getReactive_losses_M <em>Reactive losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getReactive_losses <em>Reactive losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getTotal_normalized_transformer_losses <em>Total normalized transformer losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getTotal_normalized_line_losses <em>Total normalized line losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getCompensated_active_gross_P <em>Compensated active gross P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getCompensated_active_net_P <em>Compensated active net P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getCompensated_active_gross_M <em>Compensated active gross M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getCompensated_active_net_M <em>Compensated active net M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getCompensated_reactive_gross_P <em>Compensated reactive gross P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getCompensated_reactive_net_P <em>Compensated reactive net P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getCompensated_reactive_gross_M <em>Compensated reactive gross M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getCompensated_reactive_net_M <em>Compensated reactive net M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1active_line_losses <em>L1active line losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1active_line_losses_M <em>L1active line losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1active_transformer_losses_P <em>L1active transformer losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1active_transformer_losses_M <em>L1active transformer losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1active_transformer_losses <em>L1active transformer losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1active_losses_P <em>L1active losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1active_losses_M <em>L1active losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1active_losses <em>L1active losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1reactive_line_losses_P <em>L1reactive line losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1reactive_line_losses_M <em>L1reactive line losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1reactive_line_losses <em>L1reactive line losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1reactive_transformer_losses_P <em>L1reactive transformer losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1reactive_transformer_losses_M <em>L1reactive transformer losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1reactive_transformer_losses <em>L1reactive transformer losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1Reactive_losses_P <em>L1 Reactive losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1Reactive_losses_M <em>L1 Reactive losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1Reactive_losses <em>L1 Reactive losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1Ampere_squared_hours <em>L1 Ampere squared hours</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL1Volt_squared_hours <em>L1 Volt squared hours</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2active_line_losses_P <em>L2active line losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2active_line_losses_M <em>L2active line losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2active_transformer_losses_P <em>L2active transformer losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2active_transformer_losses_M <em>L2active transformer losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2active_transformer_losses <em>L2active transformer losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2active_losses_P <em>L2active losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2active_losses_M <em>L2active losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2active_losses <em>L2active losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2reactive_line_losses_P <em>L2reactive line losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2reactive_line_losses_M <em>L2reactive line losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2reactive_line_losses <em>L2reactive line losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2reactive_transformer_losses <em>L2reactive transformer losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2reactive_transformer_losses_P <em>L2reactive transformer losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2reactive_transformer_losses_M <em>L2reactive transformer losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2reactive_losses <em>L2reactive losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2reactive_losses_P <em>L2reactive losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2reactive_losses_M <em>L2reactive losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2Ampere_squared_hours <em>L2 Ampere squared hours</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL2Volt_squared_hours <em>L2 Volt squared hours</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3Active_line_losses_P <em>L3 Active line losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3Active_line_losses_M <em>L3 Active line losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3active_transformer_losses_P <em>L3active transformer losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3active_transformer_losses_M <em>L3active transformer losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3active_transformer_losses <em>L3active transformer losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3active_losses_P <em>L3active losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3active_losses_M <em>L3active losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3active_losses <em>L3active losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3reactive_line_losses_P <em>L3reactive line losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3reactive_line_losses_M <em>L3reactive line losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3reactive_line_losses <em>L3reactive line losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3reactive_transformer_losses_P <em>L3reactive transformer losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3reactive_transformer_losses_M <em>L3reactive transformer losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3reactive_transformer_losses <em>L3reactive transformer losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3reactive_losses_P <em>L3reactive losses P</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3reactive_losses_M <em>L3reactive losses M</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3reactive_losses <em>L3reactive losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3Ampere_squared_hours <em>L3 Ampere squared hours</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl#getL3Volt_Squared_hours <em>L3 Volt Squared hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerAndLineLossesImpl extends DataImpl implements TransformerAndLineLosses {
	/**
	 * The default value of the '{@link #getActive_line_losses_P() <em>Active line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_LINE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_line_losses_P() <em>Active line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double active_line_losses_P = ACTIVE_LINE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_line_losses_M() <em>Active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_LINE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_line_losses_M() <em>Active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double active_line_losses_M = ACTIVE_LINE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_line_losses() <em>Active line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_LINE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_line_losses() <em>Active line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected double active_line_losses = ACTIVE_LINE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_transformer_losses_P() <em>Active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_transformer_losses_P() <em>Active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double active_transformer_losses_P = ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_transformer_losses_M() <em>Active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_transformer_losses_M() <em>Active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double active_transformer_losses_M = ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_transformer_losses() <em>Active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_TRANSFORMER_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_transformer_losses() <em>Active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected double active_transformer_losses = ACTIVE_TRANSFORMER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_losses_P() <em>Active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_losses_P() <em>Active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double active_losses_P = ACTIVE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_losses_M() <em>Active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_losses_M() <em>Active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double active_losses_M = ACTIVE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_losses() <em>Active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_losses() <em>Active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_losses()
	 * @generated
	 * @ordered
	 */
	protected double active_losses = ACTIVE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_line_losses_P() <em>Reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_LINE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_line_losses_P() <em>Reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double reactive_line_losses_P = REACTIVE_LINE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_line_losses_M() <em>Reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_LINE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_line_losses_M() <em>Reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double reactive_line_losses_M = REACTIVE_LINE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_line_losses() <em>Reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_LINE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_line_losses() <em>Reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected double reactive_line_losses = REACTIVE_LINE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_transformer_losses_P() <em>Reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_transformer_losses_P() <em>Reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double reactive_transformer_losses_P = REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_transformer_losses_M() <em>Reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_transformer_losses_M() <em>Reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double reactive_transformer_losses_M = REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_transformer_losses() <em>Reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_TRANSFORMER_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_transformer_losses() <em>Reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected double reactive_transformer_losses = REACTIVE_TRANSFORMER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_losses_P() <em>Reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_losses_P() <em>Reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double reactive_losses_P = REACTIVE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_losses_M() <em>Reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_losses_M() <em>Reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double reactive_losses_M = REACTIVE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_losses() <em>Reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_losses() <em>Reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_losses()
	 * @generated
	 * @ordered
	 */
	protected double reactive_losses = REACTIVE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_normalized_transformer_losses() <em>Total normalized transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_normalized_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_NORMALIZED_TRANSFORMER_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_normalized_transformer_losses() <em>Total normalized transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_normalized_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected double total_normalized_transformer_losses = TOTAL_NORMALIZED_TRANSFORMER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_normalized_line_losses() <em>Total normalized line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_normalized_line_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_NORMALIZED_LINE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_normalized_line_losses() <em>Total normalized line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_normalized_line_losses()
	 * @generated
	 * @ordered
	 */
	protected double total_normalized_line_losses = TOTAL_NORMALIZED_LINE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensated_active_gross_P() <em>Compensated active gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_active_gross_P()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPENSATED_ACTIVE_GROSS_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompensated_active_gross_P() <em>Compensated active gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_active_gross_P()
	 * @generated
	 * @ordered
	 */
	protected double compensated_active_gross_P = COMPENSATED_ACTIVE_GROSS_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensated_active_net_P() <em>Compensated active net P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_active_net_P()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPENSATED_ACTIVE_NET_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompensated_active_net_P() <em>Compensated active net P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_active_net_P()
	 * @generated
	 * @ordered
	 */
	protected double compensated_active_net_P = COMPENSATED_ACTIVE_NET_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensated_active_gross_M() <em>Compensated active gross M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_active_gross_M()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPENSATED_ACTIVE_GROSS_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompensated_active_gross_M() <em>Compensated active gross M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_active_gross_M()
	 * @generated
	 * @ordered
	 */
	protected double compensated_active_gross_M = COMPENSATED_ACTIVE_GROSS_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensated_active_net_M() <em>Compensated active net M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_active_net_M()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPENSATED_ACTIVE_NET_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompensated_active_net_M() <em>Compensated active net M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_active_net_M()
	 * @generated
	 * @ordered
	 */
	protected double compensated_active_net_M = COMPENSATED_ACTIVE_NET_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensated_reactive_gross_P() <em>Compensated reactive gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_reactive_gross_P()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPENSATED_REACTIVE_GROSS_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompensated_reactive_gross_P() <em>Compensated reactive gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_reactive_gross_P()
	 * @generated
	 * @ordered
	 */
	protected double compensated_reactive_gross_P = COMPENSATED_REACTIVE_GROSS_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensated_reactive_net_P() <em>Compensated reactive net P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_reactive_net_P()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPENSATED_REACTIVE_NET_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompensated_reactive_net_P() <em>Compensated reactive net P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_reactive_net_P()
	 * @generated
	 * @ordered
	 */
	protected double compensated_reactive_net_P = COMPENSATED_REACTIVE_NET_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensated_reactive_gross_M() <em>Compensated reactive gross M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_reactive_gross_M()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPENSATED_REACTIVE_GROSS_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompensated_reactive_gross_M() <em>Compensated reactive gross M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_reactive_gross_M()
	 * @generated
	 * @ordered
	 */
	protected double compensated_reactive_gross_M = COMPENSATED_REACTIVE_GROSS_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensated_reactive_net_M() <em>Compensated reactive net M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_reactive_net_M()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPENSATED_REACTIVE_NET_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompensated_reactive_net_M() <em>Compensated reactive net M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensated_reactive_net_M()
	 * @generated
	 * @ordered
	 */
	protected double compensated_reactive_net_M = COMPENSATED_REACTIVE_NET_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1active_line_losses() <em>L1active line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_line_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L1ACTIVE_LINE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1active_line_losses() <em>L1active line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_line_losses()
	 * @generated
	 * @ordered
	 */
	protected double l1active_line_losses = L1ACTIVE_LINE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1active_line_losses_M() <em>L1active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L1ACTIVE_LINE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1active_line_losses_M() <em>L1active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l1active_line_losses_M = L1ACTIVE_LINE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1active_transformer_losses_P() <em>L1active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L1ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1active_transformer_losses_P() <em>L1active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l1active_transformer_losses_P = L1ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1active_transformer_losses_M() <em>L1active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L1ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1active_transformer_losses_M() <em>L1active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l1active_transformer_losses_M = L1ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1active_transformer_losses() <em>L1active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L1ACTIVE_TRANSFORMER_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1active_transformer_losses() <em>L1active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected double l1active_transformer_losses = L1ACTIVE_TRANSFORMER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1active_losses_P() <em>L1active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L1ACTIVE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1active_losses_P() <em>L1active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l1active_losses_P = L1ACTIVE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1active_losses_M() <em>L1active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L1ACTIVE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1active_losses_M() <em>L1active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l1active_losses_M = L1ACTIVE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1active_losses() <em>L1active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L1ACTIVE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1active_losses() <em>L1active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1active_losses()
	 * @generated
	 * @ordered
	 */
	protected double l1active_losses = L1ACTIVE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1reactive_line_losses_P() <em>L1reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L1REACTIVE_LINE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1reactive_line_losses_P() <em>L1reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l1reactive_line_losses_P = L1REACTIVE_LINE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1reactive_line_losses_M() <em>L1reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L1REACTIVE_LINE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1reactive_line_losses_M() <em>L1reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l1reactive_line_losses_M = L1REACTIVE_LINE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1reactive_line_losses() <em>L1reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L1REACTIVE_LINE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1reactive_line_losses() <em>L1reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected double l1reactive_line_losses = L1REACTIVE_LINE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1reactive_transformer_losses_P() <em>L1reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L1REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1reactive_transformer_losses_P() <em>L1reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l1reactive_transformer_losses_P = L1REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1reactive_transformer_losses_M() <em>L1reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L1REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1reactive_transformer_losses_M() <em>L1reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l1reactive_transformer_losses_M = L1REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1reactive_transformer_losses() <em>L1reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L1REACTIVE_TRANSFORMER_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1reactive_transformer_losses() <em>L1reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1reactive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected double l1reactive_transformer_losses = L1REACTIVE_TRANSFORMER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1Reactive_losses_P() <em>L1 Reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Reactive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L1_REACTIVE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1Reactive_losses_P() <em>L1 Reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Reactive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l1Reactive_losses_P = L1_REACTIVE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1Reactive_losses_M() <em>L1 Reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Reactive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L1_REACTIVE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1Reactive_losses_M() <em>L1 Reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Reactive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l1Reactive_losses_M = L1_REACTIVE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1Reactive_losses() <em>L1 Reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Reactive_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L1_REACTIVE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1Reactive_losses() <em>L1 Reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Reactive_losses()
	 * @generated
	 * @ordered
	 */
	protected double l1Reactive_losses = L1_REACTIVE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1Ampere_squared_hours() <em>L1 Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Ampere_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected static final double L1_AMPERE_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1Ampere_squared_hours() <em>L1 Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Ampere_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected double l1Ampere_squared_hours = L1_AMPERE_SQUARED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getL1Volt_squared_hours() <em>L1 Volt squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Volt_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected static final double L1_VOLT_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL1Volt_squared_hours() <em>L1 Volt squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1Volt_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected double l1Volt_squared_hours = L1_VOLT_SQUARED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2active_line_losses_P() <em>L2active line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L2ACTIVE_LINE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2active_line_losses_P() <em>L2active line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l2active_line_losses_P = L2ACTIVE_LINE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2active_line_losses_M() <em>L2active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L2ACTIVE_LINE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2active_line_losses_M() <em>L2active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l2active_line_losses_M = L2ACTIVE_LINE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2active_transformer_losses_P() <em>L2active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L2ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2active_transformer_losses_P() <em>L2active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l2active_transformer_losses_P = L2ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2active_transformer_losses_M() <em>L2active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L2ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2active_transformer_losses_M() <em>L2active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l2active_transformer_losses_M = L2ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2active_transformer_losses() <em>L2active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L2ACTIVE_TRANSFORMER_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2active_transformer_losses() <em>L2active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected double l2active_transformer_losses = L2ACTIVE_TRANSFORMER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2active_losses_P() <em>L2active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L2ACTIVE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2active_losses_P() <em>L2active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l2active_losses_P = L2ACTIVE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2active_losses_M() <em>L2active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L2ACTIVE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2active_losses_M() <em>L2active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l2active_losses_M = L2ACTIVE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2active_losses() <em>L2active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L2ACTIVE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2active_losses() <em>L2active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2active_losses()
	 * @generated
	 * @ordered
	 */
	protected double l2active_losses = L2ACTIVE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2reactive_line_losses_P() <em>L2reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L2REACTIVE_LINE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2reactive_line_losses_P() <em>L2reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l2reactive_line_losses_P = L2REACTIVE_LINE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2reactive_line_losses_M() <em>L2reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L2REACTIVE_LINE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2reactive_line_losses_M() <em>L2reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l2reactive_line_losses_M = L2REACTIVE_LINE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2reactive_line_losses() <em>L2reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L2REACTIVE_LINE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2reactive_line_losses() <em>L2reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected double l2reactive_line_losses = L2REACTIVE_LINE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2reactive_transformer_losses() <em>L2reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L2REACTIVE_TRANSFORMER_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2reactive_transformer_losses() <em>L2reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected double l2reactive_transformer_losses = L2REACTIVE_TRANSFORMER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2reactive_transformer_losses_P() <em>L2reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L2REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2reactive_transformer_losses_P() <em>L2reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l2reactive_transformer_losses_P = L2REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2reactive_transformer_losses_M() <em>L2reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L2REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2reactive_transformer_losses_M() <em>L2reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l2reactive_transformer_losses_M = L2REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2reactive_losses() <em>L2reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L2REACTIVE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2reactive_losses() <em>L2reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_losses()
	 * @generated
	 * @ordered
	 */
	protected double l2reactive_losses = L2REACTIVE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2reactive_losses_P() <em>L2reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L2REACTIVE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2reactive_losses_P() <em>L2reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l2reactive_losses_P = L2REACTIVE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2reactive_losses_M() <em>L2reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L2REACTIVE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2reactive_losses_M() <em>L2reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2reactive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l2reactive_losses_M = L2REACTIVE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2Ampere_squared_hours() <em>L2 Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2Ampere_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected static final double L2_AMPERE_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2Ampere_squared_hours() <em>L2 Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2Ampere_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected double l2Ampere_squared_hours = L2_AMPERE_SQUARED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2Volt_squared_hours() <em>L2 Volt squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2Volt_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected static final double L2_VOLT_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL2Volt_squared_hours() <em>L2 Volt squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2Volt_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected double l2Volt_squared_hours = L2_VOLT_SQUARED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3Active_line_losses_P() <em>L3 Active line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3Active_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L3_ACTIVE_LINE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3Active_line_losses_P() <em>L3 Active line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3Active_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l3Active_line_losses_P = L3_ACTIVE_LINE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3Active_line_losses_M() <em>L3 Active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3Active_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L3_ACTIVE_LINE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3Active_line_losses_M() <em>L3 Active line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3Active_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l3Active_line_losses_M = L3_ACTIVE_LINE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3active_transformer_losses_P() <em>L3active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L3ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3active_transformer_losses_P() <em>L3active transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l3active_transformer_losses_P = L3ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3active_transformer_losses_M() <em>L3active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L3ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3active_transformer_losses_M() <em>L3active transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l3active_transformer_losses_M = L3ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3active_transformer_losses() <em>L3active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L3ACTIVE_TRANSFORMER_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3active_transformer_losses() <em>L3active transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected double l3active_transformer_losses = L3ACTIVE_TRANSFORMER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3active_losses_P() <em>L3active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L3ACTIVE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3active_losses_P() <em>L3active losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l3active_losses_P = L3ACTIVE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3active_losses_M() <em>L3active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L3ACTIVE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3active_losses_M() <em>L3active losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l3active_losses_M = L3ACTIVE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3active_losses() <em>L3active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L3ACTIVE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3active_losses() <em>L3active losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3active_losses()
	 * @generated
	 * @ordered
	 */
	protected double l3active_losses = L3ACTIVE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3reactive_line_losses_P() <em>L3reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L3REACTIVE_LINE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3reactive_line_losses_P() <em>L3reactive line losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_line_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l3reactive_line_losses_P = L3REACTIVE_LINE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3reactive_line_losses_M() <em>L3reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L3REACTIVE_LINE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3reactive_line_losses_M() <em>L3reactive line losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_line_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l3reactive_line_losses_M = L3REACTIVE_LINE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3reactive_line_losses() <em>L3reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L3REACTIVE_LINE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3reactive_line_losses() <em>L3reactive line losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_line_losses()
	 * @generated
	 * @ordered
	 */
	protected double l3reactive_line_losses = L3REACTIVE_LINE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3reactive_transformer_losses_P() <em>L3reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L3REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3reactive_transformer_losses_P() <em>L3reactive transformer losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_transformer_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l3reactive_transformer_losses_P = L3REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3reactive_transformer_losses_M() <em>L3reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L3REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3reactive_transformer_losses_M() <em>L3reactive transformer losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_transformer_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l3reactive_transformer_losses_M = L3REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3reactive_transformer_losses() <em>L3reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L3REACTIVE_TRANSFORMER_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3reactive_transformer_losses() <em>L3reactive transformer losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_transformer_losses()
	 * @generated
	 * @ordered
	 */
	protected double l3reactive_transformer_losses = L3REACTIVE_TRANSFORMER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3reactive_losses_P() <em>L3reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected static final double L3REACTIVE_LOSSES_P_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3reactive_losses_P() <em>L3reactive losses P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_losses_P()
	 * @generated
	 * @ordered
	 */
	protected double l3reactive_losses_P = L3REACTIVE_LOSSES_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3reactive_losses_M() <em>L3reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected static final double L3REACTIVE_LOSSES_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3reactive_losses_M() <em>L3reactive losses M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_losses_M()
	 * @generated
	 * @ordered
	 */
	protected double l3reactive_losses_M = L3REACTIVE_LOSSES_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3reactive_losses() <em>L3reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double L3REACTIVE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3reactive_losses() <em>L3reactive losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3reactive_losses()
	 * @generated
	 * @ordered
	 */
	protected double l3reactive_losses = L3REACTIVE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3Ampere_squared_hours() <em>L3 Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3Ampere_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected static final double L3_AMPERE_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3Ampere_squared_hours() <em>L3 Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3Ampere_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected double l3Ampere_squared_hours = L3_AMPERE_SQUARED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getL3Volt_Squared_hours() <em>L3 Volt Squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3Volt_Squared_hours()
	 * @generated
	 * @ordered
	 */
	protected static final double L3_VOLT_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL3Volt_Squared_hours() <em>L3 Volt Squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL3Volt_Squared_hours()
	 * @generated
	 * @ordered
	 */
	protected double l3Volt_Squared_hours = L3_VOLT_SQUARED_HOURS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerAndLineLossesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getTransformerAndLineLosses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_line_losses_P() {
		return active_line_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_line_losses_P(double newActive_line_losses_P) {
		double oldActive_line_losses_P = active_line_losses_P;
		active_line_losses_P = newActive_line_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_P, oldActive_line_losses_P, active_line_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_line_losses_M() {
		return active_line_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_line_losses_M(double newActive_line_losses_M) {
		double oldActive_line_losses_M = active_line_losses_M;
		active_line_losses_M = newActive_line_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_M, oldActive_line_losses_M, active_line_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_line_losses() {
		return active_line_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_line_losses(double newActive_line_losses) {
		double oldActive_line_losses = active_line_losses;
		active_line_losses = newActive_line_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES, oldActive_line_losses, active_line_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_transformer_losses_P() {
		return active_transformer_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_transformer_losses_P(double newActive_transformer_losses_P) {
		double oldActive_transformer_losses_P = active_transformer_losses_P;
		active_transformer_losses_P = newActive_transformer_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_P, oldActive_transformer_losses_P, active_transformer_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_transformer_losses_M() {
		return active_transformer_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_transformer_losses_M(double newActive_transformer_losses_M) {
		double oldActive_transformer_losses_M = active_transformer_losses_M;
		active_transformer_losses_M = newActive_transformer_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_M, oldActive_transformer_losses_M, active_transformer_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_transformer_losses() {
		return active_transformer_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_transformer_losses(double newActive_transformer_losses) {
		double oldActive_transformer_losses = active_transformer_losses;
		active_transformer_losses = newActive_transformer_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES, oldActive_transformer_losses, active_transformer_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_losses_P() {
		return active_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_losses_P(double newActive_losses_P) {
		double oldActive_losses_P = active_losses_P;
		active_losses_P = newActive_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_P, oldActive_losses_P, active_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_losses_M() {
		return active_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_losses_M(double newActive_losses_M) {
		double oldActive_losses_M = active_losses_M;
		active_losses_M = newActive_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_M, oldActive_losses_M, active_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_losses() {
		return active_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_losses(double newActive_losses) {
		double oldActive_losses = active_losses;
		active_losses = newActive_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES, oldActive_losses, active_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_line_losses_P() {
		return reactive_line_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_line_losses_P(double newReactive_line_losses_P) {
		double oldReactive_line_losses_P = reactive_line_losses_P;
		reactive_line_losses_P = newReactive_line_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_P, oldReactive_line_losses_P, reactive_line_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_line_losses_M() {
		return reactive_line_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_line_losses_M(double newReactive_line_losses_M) {
		double oldReactive_line_losses_M = reactive_line_losses_M;
		reactive_line_losses_M = newReactive_line_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_M, oldReactive_line_losses_M, reactive_line_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_line_losses() {
		return reactive_line_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_line_losses(double newReactive_line_losses) {
		double oldReactive_line_losses = reactive_line_losses;
		reactive_line_losses = newReactive_line_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES, oldReactive_line_losses, reactive_line_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_transformer_losses_P() {
		return reactive_transformer_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_transformer_losses_P(double newReactive_transformer_losses_P) {
		double oldReactive_transformer_losses_P = reactive_transformer_losses_P;
		reactive_transformer_losses_P = newReactive_transformer_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_P, oldReactive_transformer_losses_P, reactive_transformer_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_transformer_losses_M() {
		return reactive_transformer_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_transformer_losses_M(double newReactive_transformer_losses_M) {
		double oldReactive_transformer_losses_M = reactive_transformer_losses_M;
		reactive_transformer_losses_M = newReactive_transformer_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_M, oldReactive_transformer_losses_M, reactive_transformer_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_transformer_losses() {
		return reactive_transformer_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_transformer_losses(double newReactive_transformer_losses) {
		double oldReactive_transformer_losses = reactive_transformer_losses;
		reactive_transformer_losses = newReactive_transformer_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES, oldReactive_transformer_losses, reactive_transformer_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_losses_P() {
		return reactive_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_losses_P(double newReactive_losses_P) {
		double oldReactive_losses_P = reactive_losses_P;
		reactive_losses_P = newReactive_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_P, oldReactive_losses_P, reactive_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_losses_M() {
		return reactive_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_losses_M(double newReactive_losses_M) {
		double oldReactive_losses_M = reactive_losses_M;
		reactive_losses_M = newReactive_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_M, oldReactive_losses_M, reactive_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_losses() {
		return reactive_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_losses(double newReactive_losses) {
		double oldReactive_losses = reactive_losses;
		reactive_losses = newReactive_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES, oldReactive_losses, reactive_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotal_normalized_transformer_losses() {
		return total_normalized_transformer_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_normalized_transformer_losses(double newTotal_normalized_transformer_losses) {
		double oldTotal_normalized_transformer_losses = total_normalized_transformer_losses;
		total_normalized_transformer_losses = newTotal_normalized_transformer_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_TRANSFORMER_LOSSES, oldTotal_normalized_transformer_losses, total_normalized_transformer_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotal_normalized_line_losses() {
		return total_normalized_line_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_normalized_line_losses(double newTotal_normalized_line_losses) {
		double oldTotal_normalized_line_losses = total_normalized_line_losses;
		total_normalized_line_losses = newTotal_normalized_line_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_LINE_LOSSES, oldTotal_normalized_line_losses, total_normalized_line_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompensated_active_gross_P() {
		return compensated_active_gross_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensated_active_gross_P(double newCompensated_active_gross_P) {
		double oldCompensated_active_gross_P = compensated_active_gross_P;
		compensated_active_gross_P = newCompensated_active_gross_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_P, oldCompensated_active_gross_P, compensated_active_gross_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompensated_active_net_P() {
		return compensated_active_net_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensated_active_net_P(double newCompensated_active_net_P) {
		double oldCompensated_active_net_P = compensated_active_net_P;
		compensated_active_net_P = newCompensated_active_net_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_P, oldCompensated_active_net_P, compensated_active_net_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompensated_active_gross_M() {
		return compensated_active_gross_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensated_active_gross_M(double newCompensated_active_gross_M) {
		double oldCompensated_active_gross_M = compensated_active_gross_M;
		compensated_active_gross_M = newCompensated_active_gross_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_M, oldCompensated_active_gross_M, compensated_active_gross_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompensated_active_net_M() {
		return compensated_active_net_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensated_active_net_M(double newCompensated_active_net_M) {
		double oldCompensated_active_net_M = compensated_active_net_M;
		compensated_active_net_M = newCompensated_active_net_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_M, oldCompensated_active_net_M, compensated_active_net_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompensated_reactive_gross_P() {
		return compensated_reactive_gross_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensated_reactive_gross_P(double newCompensated_reactive_gross_P) {
		double oldCompensated_reactive_gross_P = compensated_reactive_gross_P;
		compensated_reactive_gross_P = newCompensated_reactive_gross_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_P, oldCompensated_reactive_gross_P, compensated_reactive_gross_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompensated_reactive_net_P() {
		return compensated_reactive_net_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensated_reactive_net_P(double newCompensated_reactive_net_P) {
		double oldCompensated_reactive_net_P = compensated_reactive_net_P;
		compensated_reactive_net_P = newCompensated_reactive_net_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_P, oldCompensated_reactive_net_P, compensated_reactive_net_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompensated_reactive_gross_M() {
		return compensated_reactive_gross_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensated_reactive_gross_M(double newCompensated_reactive_gross_M) {
		double oldCompensated_reactive_gross_M = compensated_reactive_gross_M;
		compensated_reactive_gross_M = newCompensated_reactive_gross_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_M, oldCompensated_reactive_gross_M, compensated_reactive_gross_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompensated_reactive_net_M() {
		return compensated_reactive_net_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensated_reactive_net_M(double newCompensated_reactive_net_M) {
		double oldCompensated_reactive_net_M = compensated_reactive_net_M;
		compensated_reactive_net_M = newCompensated_reactive_net_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_M, oldCompensated_reactive_net_M, compensated_reactive_net_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1active_line_losses() {
		return l1active_line_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1active_line_losses(double newL1active_line_losses) {
		double oldL1active_line_losses = l1active_line_losses;
		l1active_line_losses = newL1active_line_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES, oldL1active_line_losses, l1active_line_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1active_line_losses_M() {
		return l1active_line_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1active_line_losses_M(double newL1active_line_losses_M) {
		double oldL1active_line_losses_M = l1active_line_losses_M;
		l1active_line_losses_M = newL1active_line_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES_M, oldL1active_line_losses_M, l1active_line_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1active_transformer_losses_P() {
		return l1active_transformer_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1active_transformer_losses_P(double newL1active_transformer_losses_P) {
		double oldL1active_transformer_losses_P = l1active_transformer_losses_P;
		l1active_transformer_losses_P = newL1active_transformer_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_P, oldL1active_transformer_losses_P, l1active_transformer_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1active_transformer_losses_M() {
		return l1active_transformer_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1active_transformer_losses_M(double newL1active_transformer_losses_M) {
		double oldL1active_transformer_losses_M = l1active_transformer_losses_M;
		l1active_transformer_losses_M = newL1active_transformer_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_M, oldL1active_transformer_losses_M, l1active_transformer_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1active_transformer_losses() {
		return l1active_transformer_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1active_transformer_losses(double newL1active_transformer_losses) {
		double oldL1active_transformer_losses = l1active_transformer_losses;
		l1active_transformer_losses = newL1active_transformer_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES, oldL1active_transformer_losses, l1active_transformer_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1active_losses_P() {
		return l1active_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1active_losses_P(double newL1active_losses_P) {
		double oldL1active_losses_P = l1active_losses_P;
		l1active_losses_P = newL1active_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_P, oldL1active_losses_P, l1active_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1active_losses_M() {
		return l1active_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1active_losses_M(double newL1active_losses_M) {
		double oldL1active_losses_M = l1active_losses_M;
		l1active_losses_M = newL1active_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_M, oldL1active_losses_M, l1active_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1active_losses() {
		return l1active_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1active_losses(double newL1active_losses) {
		double oldL1active_losses = l1active_losses;
		l1active_losses = newL1active_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES, oldL1active_losses, l1active_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1reactive_line_losses_P() {
		return l1reactive_line_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1reactive_line_losses_P(double newL1reactive_line_losses_P) {
		double oldL1reactive_line_losses_P = l1reactive_line_losses_P;
		l1reactive_line_losses_P = newL1reactive_line_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_P, oldL1reactive_line_losses_P, l1reactive_line_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1reactive_line_losses_M() {
		return l1reactive_line_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1reactive_line_losses_M(double newL1reactive_line_losses_M) {
		double oldL1reactive_line_losses_M = l1reactive_line_losses_M;
		l1reactive_line_losses_M = newL1reactive_line_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_M, oldL1reactive_line_losses_M, l1reactive_line_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1reactive_line_losses() {
		return l1reactive_line_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1reactive_line_losses(double newL1reactive_line_losses) {
		double oldL1reactive_line_losses = l1reactive_line_losses;
		l1reactive_line_losses = newL1reactive_line_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES, oldL1reactive_line_losses, l1reactive_line_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1reactive_transformer_losses_P() {
		return l1reactive_transformer_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1reactive_transformer_losses_P(double newL1reactive_transformer_losses_P) {
		double oldL1reactive_transformer_losses_P = l1reactive_transformer_losses_P;
		l1reactive_transformer_losses_P = newL1reactive_transformer_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_P, oldL1reactive_transformer_losses_P, l1reactive_transformer_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1reactive_transformer_losses_M() {
		return l1reactive_transformer_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1reactive_transformer_losses_M(double newL1reactive_transformer_losses_M) {
		double oldL1reactive_transformer_losses_M = l1reactive_transformer_losses_M;
		l1reactive_transformer_losses_M = newL1reactive_transformer_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_M, oldL1reactive_transformer_losses_M, l1reactive_transformer_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1reactive_transformer_losses() {
		return l1reactive_transformer_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1reactive_transformer_losses(double newL1reactive_transformer_losses) {
		double oldL1reactive_transformer_losses = l1reactive_transformer_losses;
		l1reactive_transformer_losses = newL1reactive_transformer_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES, oldL1reactive_transformer_losses, l1reactive_transformer_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1Reactive_losses_P() {
		return l1Reactive_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1Reactive_losses_P(double newL1Reactive_losses_P) {
		double oldL1Reactive_losses_P = l1Reactive_losses_P;
		l1Reactive_losses_P = newL1Reactive_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_P, oldL1Reactive_losses_P, l1Reactive_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1Reactive_losses_M() {
		return l1Reactive_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1Reactive_losses_M(double newL1Reactive_losses_M) {
		double oldL1Reactive_losses_M = l1Reactive_losses_M;
		l1Reactive_losses_M = newL1Reactive_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_M, oldL1Reactive_losses_M, l1Reactive_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1Reactive_losses() {
		return l1Reactive_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1Reactive_losses(double newL1Reactive_losses) {
		double oldL1Reactive_losses = l1Reactive_losses;
		l1Reactive_losses = newL1Reactive_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES, oldL1Reactive_losses, l1Reactive_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1Ampere_squared_hours() {
		return l1Ampere_squared_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1Ampere_squared_hours(double newL1Ampere_squared_hours) {
		double oldL1Ampere_squared_hours = l1Ampere_squared_hours;
		l1Ampere_squared_hours = newL1Ampere_squared_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_AMPERE_SQUARED_HOURS, oldL1Ampere_squared_hours, l1Ampere_squared_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL1Volt_squared_hours() {
		return l1Volt_squared_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1Volt_squared_hours(double newL1Volt_squared_hours) {
		double oldL1Volt_squared_hours = l1Volt_squared_hours;
		l1Volt_squared_hours = newL1Volt_squared_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_VOLT_SQUARED_HOURS, oldL1Volt_squared_hours, l1Volt_squared_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2active_line_losses_P() {
		return l2active_line_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2active_line_losses_P(double newL2active_line_losses_P) {
		double oldL2active_line_losses_P = l2active_line_losses_P;
		l2active_line_losses_P = newL2active_line_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_P, oldL2active_line_losses_P, l2active_line_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2active_line_losses_M() {
		return l2active_line_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2active_line_losses_M(double newL2active_line_losses_M) {
		double oldL2active_line_losses_M = l2active_line_losses_M;
		l2active_line_losses_M = newL2active_line_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_M, oldL2active_line_losses_M, l2active_line_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2active_transformer_losses_P() {
		return l2active_transformer_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2active_transformer_losses_P(double newL2active_transformer_losses_P) {
		double oldL2active_transformer_losses_P = l2active_transformer_losses_P;
		l2active_transformer_losses_P = newL2active_transformer_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_P, oldL2active_transformer_losses_P, l2active_transformer_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2active_transformer_losses_M() {
		return l2active_transformer_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2active_transformer_losses_M(double newL2active_transformer_losses_M) {
		double oldL2active_transformer_losses_M = l2active_transformer_losses_M;
		l2active_transformer_losses_M = newL2active_transformer_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_M, oldL2active_transformer_losses_M, l2active_transformer_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2active_transformer_losses() {
		return l2active_transformer_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2active_transformer_losses(double newL2active_transformer_losses) {
		double oldL2active_transformer_losses = l2active_transformer_losses;
		l2active_transformer_losses = newL2active_transformer_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES, oldL2active_transformer_losses, l2active_transformer_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2active_losses_P() {
		return l2active_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2active_losses_P(double newL2active_losses_P) {
		double oldL2active_losses_P = l2active_losses_P;
		l2active_losses_P = newL2active_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_P, oldL2active_losses_P, l2active_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2active_losses_M() {
		return l2active_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2active_losses_M(double newL2active_losses_M) {
		double oldL2active_losses_M = l2active_losses_M;
		l2active_losses_M = newL2active_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_M, oldL2active_losses_M, l2active_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2active_losses() {
		return l2active_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2active_losses(double newL2active_losses) {
		double oldL2active_losses = l2active_losses;
		l2active_losses = newL2active_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES, oldL2active_losses, l2active_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2reactive_line_losses_P() {
		return l2reactive_line_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2reactive_line_losses_P(double newL2reactive_line_losses_P) {
		double oldL2reactive_line_losses_P = l2reactive_line_losses_P;
		l2reactive_line_losses_P = newL2reactive_line_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_P, oldL2reactive_line_losses_P, l2reactive_line_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2reactive_line_losses_M() {
		return l2reactive_line_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2reactive_line_losses_M(double newL2reactive_line_losses_M) {
		double oldL2reactive_line_losses_M = l2reactive_line_losses_M;
		l2reactive_line_losses_M = newL2reactive_line_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_M, oldL2reactive_line_losses_M, l2reactive_line_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2reactive_line_losses() {
		return l2reactive_line_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2reactive_line_losses(double newL2reactive_line_losses) {
		double oldL2reactive_line_losses = l2reactive_line_losses;
		l2reactive_line_losses = newL2reactive_line_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES, oldL2reactive_line_losses, l2reactive_line_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2reactive_transformer_losses() {
		return l2reactive_transformer_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2reactive_transformer_losses(double newL2reactive_transformer_losses) {
		double oldL2reactive_transformer_losses = l2reactive_transformer_losses;
		l2reactive_transformer_losses = newL2reactive_transformer_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES, oldL2reactive_transformer_losses, l2reactive_transformer_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2reactive_transformer_losses_P() {
		return l2reactive_transformer_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2reactive_transformer_losses_P(double newL2reactive_transformer_losses_P) {
		double oldL2reactive_transformer_losses_P = l2reactive_transformer_losses_P;
		l2reactive_transformer_losses_P = newL2reactive_transformer_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_P, oldL2reactive_transformer_losses_P, l2reactive_transformer_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2reactive_transformer_losses_M() {
		return l2reactive_transformer_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2reactive_transformer_losses_M(double newL2reactive_transformer_losses_M) {
		double oldL2reactive_transformer_losses_M = l2reactive_transformer_losses_M;
		l2reactive_transformer_losses_M = newL2reactive_transformer_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_M, oldL2reactive_transformer_losses_M, l2reactive_transformer_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2reactive_losses() {
		return l2reactive_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2reactive_losses(double newL2reactive_losses) {
		double oldL2reactive_losses = l2reactive_losses;
		l2reactive_losses = newL2reactive_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES, oldL2reactive_losses, l2reactive_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2reactive_losses_P() {
		return l2reactive_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2reactive_losses_P(double newL2reactive_losses_P) {
		double oldL2reactive_losses_P = l2reactive_losses_P;
		l2reactive_losses_P = newL2reactive_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_P, oldL2reactive_losses_P, l2reactive_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2reactive_losses_M() {
		return l2reactive_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2reactive_losses_M(double newL2reactive_losses_M) {
		double oldL2reactive_losses_M = l2reactive_losses_M;
		l2reactive_losses_M = newL2reactive_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_M, oldL2reactive_losses_M, l2reactive_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2Ampere_squared_hours() {
		return l2Ampere_squared_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2Ampere_squared_hours(double newL2Ampere_squared_hours) {
		double oldL2Ampere_squared_hours = l2Ampere_squared_hours;
		l2Ampere_squared_hours = newL2Ampere_squared_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_AMPERE_SQUARED_HOURS, oldL2Ampere_squared_hours, l2Ampere_squared_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL2Volt_squared_hours() {
		return l2Volt_squared_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2Volt_squared_hours(double newL2Volt_squared_hours) {
		double oldL2Volt_squared_hours = l2Volt_squared_hours;
		l2Volt_squared_hours = newL2Volt_squared_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_VOLT_SQUARED_HOURS, oldL2Volt_squared_hours, l2Volt_squared_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3Active_line_losses_P() {
		return l3Active_line_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3Active_line_losses_P(double newL3Active_line_losses_P) {
		double oldL3Active_line_losses_P = l3Active_line_losses_P;
		l3Active_line_losses_P = newL3Active_line_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_P, oldL3Active_line_losses_P, l3Active_line_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3Active_line_losses_M() {
		return l3Active_line_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3Active_line_losses_M(double newL3Active_line_losses_M) {
		double oldL3Active_line_losses_M = l3Active_line_losses_M;
		l3Active_line_losses_M = newL3Active_line_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_M, oldL3Active_line_losses_M, l3Active_line_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3active_transformer_losses_P() {
		return l3active_transformer_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3active_transformer_losses_P(double newL3active_transformer_losses_P) {
		double oldL3active_transformer_losses_P = l3active_transformer_losses_P;
		l3active_transformer_losses_P = newL3active_transformer_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_P, oldL3active_transformer_losses_P, l3active_transformer_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3active_transformer_losses_M() {
		return l3active_transformer_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3active_transformer_losses_M(double newL3active_transformer_losses_M) {
		double oldL3active_transformer_losses_M = l3active_transformer_losses_M;
		l3active_transformer_losses_M = newL3active_transformer_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_M, oldL3active_transformer_losses_M, l3active_transformer_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3active_transformer_losses() {
		return l3active_transformer_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3active_transformer_losses(double newL3active_transformer_losses) {
		double oldL3active_transformer_losses = l3active_transformer_losses;
		l3active_transformer_losses = newL3active_transformer_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES, oldL3active_transformer_losses, l3active_transformer_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3active_losses_P() {
		return l3active_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3active_losses_P(double newL3active_losses_P) {
		double oldL3active_losses_P = l3active_losses_P;
		l3active_losses_P = newL3active_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_P, oldL3active_losses_P, l3active_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3active_losses_M() {
		return l3active_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3active_losses_M(double newL3active_losses_M) {
		double oldL3active_losses_M = l3active_losses_M;
		l3active_losses_M = newL3active_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_M, oldL3active_losses_M, l3active_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3active_losses() {
		return l3active_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3active_losses(double newL3active_losses) {
		double oldL3active_losses = l3active_losses;
		l3active_losses = newL3active_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES, oldL3active_losses, l3active_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3reactive_line_losses_P() {
		return l3reactive_line_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3reactive_line_losses_P(double newL3reactive_line_losses_P) {
		double oldL3reactive_line_losses_P = l3reactive_line_losses_P;
		l3reactive_line_losses_P = newL3reactive_line_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_P, oldL3reactive_line_losses_P, l3reactive_line_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3reactive_line_losses_M() {
		return l3reactive_line_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3reactive_line_losses_M(double newL3reactive_line_losses_M) {
		double oldL3reactive_line_losses_M = l3reactive_line_losses_M;
		l3reactive_line_losses_M = newL3reactive_line_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_M, oldL3reactive_line_losses_M, l3reactive_line_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3reactive_line_losses() {
		return l3reactive_line_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3reactive_line_losses(double newL3reactive_line_losses) {
		double oldL3reactive_line_losses = l3reactive_line_losses;
		l3reactive_line_losses = newL3reactive_line_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES, oldL3reactive_line_losses, l3reactive_line_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3reactive_transformer_losses_P() {
		return l3reactive_transformer_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3reactive_transformer_losses_P(double newL3reactive_transformer_losses_P) {
		double oldL3reactive_transformer_losses_P = l3reactive_transformer_losses_P;
		l3reactive_transformer_losses_P = newL3reactive_transformer_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_P, oldL3reactive_transformer_losses_P, l3reactive_transformer_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3reactive_transformer_losses_M() {
		return l3reactive_transformer_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3reactive_transformer_losses_M(double newL3reactive_transformer_losses_M) {
		double oldL3reactive_transformer_losses_M = l3reactive_transformer_losses_M;
		l3reactive_transformer_losses_M = newL3reactive_transformer_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_M, oldL3reactive_transformer_losses_M, l3reactive_transformer_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3reactive_transformer_losses() {
		return l3reactive_transformer_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3reactive_transformer_losses(double newL3reactive_transformer_losses) {
		double oldL3reactive_transformer_losses = l3reactive_transformer_losses;
		l3reactive_transformer_losses = newL3reactive_transformer_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES, oldL3reactive_transformer_losses, l3reactive_transformer_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3reactive_losses_P() {
		return l3reactive_losses_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3reactive_losses_P(double newL3reactive_losses_P) {
		double oldL3reactive_losses_P = l3reactive_losses_P;
		l3reactive_losses_P = newL3reactive_losses_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_P, oldL3reactive_losses_P, l3reactive_losses_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3reactive_losses_M() {
		return l3reactive_losses_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3reactive_losses_M(double newL3reactive_losses_M) {
		double oldL3reactive_losses_M = l3reactive_losses_M;
		l3reactive_losses_M = newL3reactive_losses_M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_M, oldL3reactive_losses_M, l3reactive_losses_M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3reactive_losses() {
		return l3reactive_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3reactive_losses(double newL3reactive_losses) {
		double oldL3reactive_losses = l3reactive_losses;
		l3reactive_losses = newL3reactive_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES, oldL3reactive_losses, l3reactive_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3Ampere_squared_hours() {
		return l3Ampere_squared_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3Ampere_squared_hours(double newL3Ampere_squared_hours) {
		double oldL3Ampere_squared_hours = l3Ampere_squared_hours;
		l3Ampere_squared_hours = newL3Ampere_squared_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_AMPERE_SQUARED_HOURS, oldL3Ampere_squared_hours, l3Ampere_squared_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL3Volt_Squared_hours() {
		return l3Volt_Squared_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL3Volt_Squared_hours(double newL3Volt_Squared_hours) {
		double oldL3Volt_Squared_hours = l3Volt_Squared_hours;
		l3Volt_Squared_hours = newL3Volt_Squared_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_VOLT_SQUARED_HOURS, oldL3Volt_Squared_hours, l3Volt_Squared_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_P:
				return getActive_line_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_M:
				return getActive_line_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES:
				return getActive_line_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_P:
				return getActive_transformer_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_M:
				return getActive_transformer_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES:
				return getActive_transformer_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_P:
				return getActive_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_M:
				return getActive_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES:
				return getActive_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_P:
				return getReactive_line_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_M:
				return getReactive_line_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES:
				return getReactive_line_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_P:
				return getReactive_transformer_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_M:
				return getReactive_transformer_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES:
				return getReactive_transformer_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_P:
				return getReactive_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_M:
				return getReactive_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES:
				return getReactive_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_TRANSFORMER_LOSSES:
				return getTotal_normalized_transformer_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_LINE_LOSSES:
				return getTotal_normalized_line_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_P:
				return getCompensated_active_gross_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_P:
				return getCompensated_active_net_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_M:
				return getCompensated_active_gross_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_M:
				return getCompensated_active_net_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_P:
				return getCompensated_reactive_gross_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_P:
				return getCompensated_reactive_net_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_M:
				return getCompensated_reactive_gross_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_M:
				return getCompensated_reactive_net_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES:
				return getL1active_line_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES_M:
				return getL1active_line_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_P:
				return getL1active_transformer_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_M:
				return getL1active_transformer_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES:
				return getL1active_transformer_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_P:
				return getL1active_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_M:
				return getL1active_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES:
				return getL1active_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_P:
				return getL1reactive_line_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_M:
				return getL1reactive_line_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES:
				return getL1reactive_line_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_P:
				return getL1reactive_transformer_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_M:
				return getL1reactive_transformer_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES:
				return getL1reactive_transformer_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_P:
				return getL1Reactive_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_M:
				return getL1Reactive_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES:
				return getL1Reactive_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_AMPERE_SQUARED_HOURS:
				return getL1Ampere_squared_hours();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_VOLT_SQUARED_HOURS:
				return getL1Volt_squared_hours();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_P:
				return getL2active_line_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_M:
				return getL2active_line_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_P:
				return getL2active_transformer_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_M:
				return getL2active_transformer_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES:
				return getL2active_transformer_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_P:
				return getL2active_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_M:
				return getL2active_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES:
				return getL2active_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_P:
				return getL2reactive_line_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_M:
				return getL2reactive_line_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES:
				return getL2reactive_line_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES:
				return getL2reactive_transformer_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_P:
				return getL2reactive_transformer_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_M:
				return getL2reactive_transformer_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES:
				return getL2reactive_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_P:
				return getL2reactive_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_M:
				return getL2reactive_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_AMPERE_SQUARED_HOURS:
				return getL2Ampere_squared_hours();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_VOLT_SQUARED_HOURS:
				return getL2Volt_squared_hours();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_P:
				return getL3Active_line_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_M:
				return getL3Active_line_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_P:
				return getL3active_transformer_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_M:
				return getL3active_transformer_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES:
				return getL3active_transformer_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_P:
				return getL3active_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_M:
				return getL3active_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES:
				return getL3active_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_P:
				return getL3reactive_line_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_M:
				return getL3reactive_line_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES:
				return getL3reactive_line_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_P:
				return getL3reactive_transformer_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_M:
				return getL3reactive_transformer_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES:
				return getL3reactive_transformer_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_P:
				return getL3reactive_losses_P();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_M:
				return getL3reactive_losses_M();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES:
				return getL3reactive_losses();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_AMPERE_SQUARED_HOURS:
				return getL3Ampere_squared_hours();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_VOLT_SQUARED_HOURS:
				return getL3Volt_Squared_hours();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_P:
				setActive_line_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_M:
				setActive_line_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES:
				setActive_line_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_P:
				setActive_transformer_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_M:
				setActive_transformer_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES:
				setActive_transformer_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_P:
				setActive_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_M:
				setActive_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES:
				setActive_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_P:
				setReactive_line_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_M:
				setReactive_line_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES:
				setReactive_line_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_P:
				setReactive_transformer_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_M:
				setReactive_transformer_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES:
				setReactive_transformer_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_P:
				setReactive_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_M:
				setReactive_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES:
				setReactive_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_TRANSFORMER_LOSSES:
				setTotal_normalized_transformer_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_LINE_LOSSES:
				setTotal_normalized_line_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_P:
				setCompensated_active_gross_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_P:
				setCompensated_active_net_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_M:
				setCompensated_active_gross_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_M:
				setCompensated_active_net_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_P:
				setCompensated_reactive_gross_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_P:
				setCompensated_reactive_net_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_M:
				setCompensated_reactive_gross_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_M:
				setCompensated_reactive_net_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES:
				setL1active_line_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES_M:
				setL1active_line_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_P:
				setL1active_transformer_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_M:
				setL1active_transformer_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES:
				setL1active_transformer_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_P:
				setL1active_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_M:
				setL1active_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES:
				setL1active_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_P:
				setL1reactive_line_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_M:
				setL1reactive_line_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES:
				setL1reactive_line_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_P:
				setL1reactive_transformer_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_M:
				setL1reactive_transformer_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES:
				setL1reactive_transformer_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_P:
				setL1Reactive_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_M:
				setL1Reactive_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES:
				setL1Reactive_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_AMPERE_SQUARED_HOURS:
				setL1Ampere_squared_hours((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_VOLT_SQUARED_HOURS:
				setL1Volt_squared_hours((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_P:
				setL2active_line_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_M:
				setL2active_line_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_P:
				setL2active_transformer_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_M:
				setL2active_transformer_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES:
				setL2active_transformer_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_P:
				setL2active_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_M:
				setL2active_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES:
				setL2active_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_P:
				setL2reactive_line_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_M:
				setL2reactive_line_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES:
				setL2reactive_line_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES:
				setL2reactive_transformer_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_P:
				setL2reactive_transformer_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_M:
				setL2reactive_transformer_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES:
				setL2reactive_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_P:
				setL2reactive_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_M:
				setL2reactive_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_AMPERE_SQUARED_HOURS:
				setL2Ampere_squared_hours((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_VOLT_SQUARED_HOURS:
				setL2Volt_squared_hours((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_P:
				setL3Active_line_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_M:
				setL3Active_line_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_P:
				setL3active_transformer_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_M:
				setL3active_transformer_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES:
				setL3active_transformer_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_P:
				setL3active_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_M:
				setL3active_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES:
				setL3active_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_P:
				setL3reactive_line_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_M:
				setL3reactive_line_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES:
				setL3reactive_line_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_P:
				setL3reactive_transformer_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_M:
				setL3reactive_transformer_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES:
				setL3reactive_transformer_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_P:
				setL3reactive_losses_P((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_M:
				setL3reactive_losses_M((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES:
				setL3reactive_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_AMPERE_SQUARED_HOURS:
				setL3Ampere_squared_hours((Double)newValue);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_VOLT_SQUARED_HOURS:
				setL3Volt_Squared_hours((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_P:
				setActive_line_losses_P(ACTIVE_LINE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_M:
				setActive_line_losses_M(ACTIVE_LINE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES:
				setActive_line_losses(ACTIVE_LINE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_P:
				setActive_transformer_losses_P(ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_M:
				setActive_transformer_losses_M(ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES:
				setActive_transformer_losses(ACTIVE_TRANSFORMER_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_P:
				setActive_losses_P(ACTIVE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_M:
				setActive_losses_M(ACTIVE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES:
				setActive_losses(ACTIVE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_P:
				setReactive_line_losses_P(REACTIVE_LINE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_M:
				setReactive_line_losses_M(REACTIVE_LINE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES:
				setReactive_line_losses(REACTIVE_LINE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_P:
				setReactive_transformer_losses_P(REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_M:
				setReactive_transformer_losses_M(REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES:
				setReactive_transformer_losses(REACTIVE_TRANSFORMER_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_P:
				setReactive_losses_P(REACTIVE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_M:
				setReactive_losses_M(REACTIVE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES:
				setReactive_losses(REACTIVE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_TRANSFORMER_LOSSES:
				setTotal_normalized_transformer_losses(TOTAL_NORMALIZED_TRANSFORMER_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_LINE_LOSSES:
				setTotal_normalized_line_losses(TOTAL_NORMALIZED_LINE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_P:
				setCompensated_active_gross_P(COMPENSATED_ACTIVE_GROSS_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_P:
				setCompensated_active_net_P(COMPENSATED_ACTIVE_NET_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_M:
				setCompensated_active_gross_M(COMPENSATED_ACTIVE_GROSS_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_M:
				setCompensated_active_net_M(COMPENSATED_ACTIVE_NET_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_P:
				setCompensated_reactive_gross_P(COMPENSATED_REACTIVE_GROSS_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_P:
				setCompensated_reactive_net_P(COMPENSATED_REACTIVE_NET_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_M:
				setCompensated_reactive_gross_M(COMPENSATED_REACTIVE_GROSS_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_M:
				setCompensated_reactive_net_M(COMPENSATED_REACTIVE_NET_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES:
				setL1active_line_losses(L1ACTIVE_LINE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES_M:
				setL1active_line_losses_M(L1ACTIVE_LINE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_P:
				setL1active_transformer_losses_P(L1ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_M:
				setL1active_transformer_losses_M(L1ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES:
				setL1active_transformer_losses(L1ACTIVE_TRANSFORMER_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_P:
				setL1active_losses_P(L1ACTIVE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_M:
				setL1active_losses_M(L1ACTIVE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES:
				setL1active_losses(L1ACTIVE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_P:
				setL1reactive_line_losses_P(L1REACTIVE_LINE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_M:
				setL1reactive_line_losses_M(L1REACTIVE_LINE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES:
				setL1reactive_line_losses(L1REACTIVE_LINE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_P:
				setL1reactive_transformer_losses_P(L1REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_M:
				setL1reactive_transformer_losses_M(L1REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES:
				setL1reactive_transformer_losses(L1REACTIVE_TRANSFORMER_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_P:
				setL1Reactive_losses_P(L1_REACTIVE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_M:
				setL1Reactive_losses_M(L1_REACTIVE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES:
				setL1Reactive_losses(L1_REACTIVE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_AMPERE_SQUARED_HOURS:
				setL1Ampere_squared_hours(L1_AMPERE_SQUARED_HOURS_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_VOLT_SQUARED_HOURS:
				setL1Volt_squared_hours(L1_VOLT_SQUARED_HOURS_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_P:
				setL2active_line_losses_P(L2ACTIVE_LINE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_M:
				setL2active_line_losses_M(L2ACTIVE_LINE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_P:
				setL2active_transformer_losses_P(L2ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_M:
				setL2active_transformer_losses_M(L2ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES:
				setL2active_transformer_losses(L2ACTIVE_TRANSFORMER_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_P:
				setL2active_losses_P(L2ACTIVE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_M:
				setL2active_losses_M(L2ACTIVE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES:
				setL2active_losses(L2ACTIVE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_P:
				setL2reactive_line_losses_P(L2REACTIVE_LINE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_M:
				setL2reactive_line_losses_M(L2REACTIVE_LINE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES:
				setL2reactive_line_losses(L2REACTIVE_LINE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES:
				setL2reactive_transformer_losses(L2REACTIVE_TRANSFORMER_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_P:
				setL2reactive_transformer_losses_P(L2REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_M:
				setL2reactive_transformer_losses_M(L2REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES:
				setL2reactive_losses(L2REACTIVE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_P:
				setL2reactive_losses_P(L2REACTIVE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_M:
				setL2reactive_losses_M(L2REACTIVE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_AMPERE_SQUARED_HOURS:
				setL2Ampere_squared_hours(L2_AMPERE_SQUARED_HOURS_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_VOLT_SQUARED_HOURS:
				setL2Volt_squared_hours(L2_VOLT_SQUARED_HOURS_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_P:
				setL3Active_line_losses_P(L3_ACTIVE_LINE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_M:
				setL3Active_line_losses_M(L3_ACTIVE_LINE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_P:
				setL3active_transformer_losses_P(L3ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_M:
				setL3active_transformer_losses_M(L3ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES:
				setL3active_transformer_losses(L3ACTIVE_TRANSFORMER_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_P:
				setL3active_losses_P(L3ACTIVE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_M:
				setL3active_losses_M(L3ACTIVE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES:
				setL3active_losses(L3ACTIVE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_P:
				setL3reactive_line_losses_P(L3REACTIVE_LINE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_M:
				setL3reactive_line_losses_M(L3REACTIVE_LINE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES:
				setL3reactive_line_losses(L3REACTIVE_LINE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_P:
				setL3reactive_transformer_losses_P(L3REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_M:
				setL3reactive_transformer_losses_M(L3REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES:
				setL3reactive_transformer_losses(L3REACTIVE_TRANSFORMER_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_P:
				setL3reactive_losses_P(L3REACTIVE_LOSSES_P_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_M:
				setL3reactive_losses_M(L3REACTIVE_LOSSES_M_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES:
				setL3reactive_losses(L3REACTIVE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_AMPERE_SQUARED_HOURS:
				setL3Ampere_squared_hours(L3_AMPERE_SQUARED_HOURS_EDEFAULT);
				return;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_VOLT_SQUARED_HOURS:
				setL3Volt_Squared_hours(L3_VOLT_SQUARED_HOURS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_P:
				return active_line_losses_P != ACTIVE_LINE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_M:
				return active_line_losses_M != ACTIVE_LINE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES:
				return active_line_losses != ACTIVE_LINE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_P:
				return active_transformer_losses_P != ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_M:
				return active_transformer_losses_M != ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES:
				return active_transformer_losses != ACTIVE_TRANSFORMER_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_P:
				return active_losses_P != ACTIVE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_M:
				return active_losses_M != ACTIVE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES:
				return active_losses != ACTIVE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_P:
				return reactive_line_losses_P != REACTIVE_LINE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_M:
				return reactive_line_losses_M != REACTIVE_LINE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES:
				return reactive_line_losses != REACTIVE_LINE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_P:
				return reactive_transformer_losses_P != REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_M:
				return reactive_transformer_losses_M != REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES:
				return reactive_transformer_losses != REACTIVE_TRANSFORMER_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_P:
				return reactive_losses_P != REACTIVE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_M:
				return reactive_losses_M != REACTIVE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES:
				return reactive_losses != REACTIVE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_TRANSFORMER_LOSSES:
				return total_normalized_transformer_losses != TOTAL_NORMALIZED_TRANSFORMER_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_LINE_LOSSES:
				return total_normalized_line_losses != TOTAL_NORMALIZED_LINE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_P:
				return compensated_active_gross_P != COMPENSATED_ACTIVE_GROSS_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_P:
				return compensated_active_net_P != COMPENSATED_ACTIVE_NET_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_M:
				return compensated_active_gross_M != COMPENSATED_ACTIVE_GROSS_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_M:
				return compensated_active_net_M != COMPENSATED_ACTIVE_NET_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_P:
				return compensated_reactive_gross_P != COMPENSATED_REACTIVE_GROSS_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_P:
				return compensated_reactive_net_P != COMPENSATED_REACTIVE_NET_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_M:
				return compensated_reactive_gross_M != COMPENSATED_REACTIVE_GROSS_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_M:
				return compensated_reactive_net_M != COMPENSATED_REACTIVE_NET_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES:
				return l1active_line_losses != L1ACTIVE_LINE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES_M:
				return l1active_line_losses_M != L1ACTIVE_LINE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_P:
				return l1active_transformer_losses_P != L1ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_M:
				return l1active_transformer_losses_M != L1ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES:
				return l1active_transformer_losses != L1ACTIVE_TRANSFORMER_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_P:
				return l1active_losses_P != L1ACTIVE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_M:
				return l1active_losses_M != L1ACTIVE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES:
				return l1active_losses != L1ACTIVE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_P:
				return l1reactive_line_losses_P != L1REACTIVE_LINE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_M:
				return l1reactive_line_losses_M != L1REACTIVE_LINE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES:
				return l1reactive_line_losses != L1REACTIVE_LINE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_P:
				return l1reactive_transformer_losses_P != L1REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_M:
				return l1reactive_transformer_losses_M != L1REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES:
				return l1reactive_transformer_losses != L1REACTIVE_TRANSFORMER_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_P:
				return l1Reactive_losses_P != L1_REACTIVE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_M:
				return l1Reactive_losses_M != L1_REACTIVE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES:
				return l1Reactive_losses != L1_REACTIVE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_AMPERE_SQUARED_HOURS:
				return l1Ampere_squared_hours != L1_AMPERE_SQUARED_HOURS_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L1_VOLT_SQUARED_HOURS:
				return l1Volt_squared_hours != L1_VOLT_SQUARED_HOURS_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_P:
				return l2active_line_losses_P != L2ACTIVE_LINE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_M:
				return l2active_line_losses_M != L2ACTIVE_LINE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_P:
				return l2active_transformer_losses_P != L2ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_M:
				return l2active_transformer_losses_M != L2ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES:
				return l2active_transformer_losses != L2ACTIVE_TRANSFORMER_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_P:
				return l2active_losses_P != L2ACTIVE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_M:
				return l2active_losses_M != L2ACTIVE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES:
				return l2active_losses != L2ACTIVE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_P:
				return l2reactive_line_losses_P != L2REACTIVE_LINE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_M:
				return l2reactive_line_losses_M != L2REACTIVE_LINE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES:
				return l2reactive_line_losses != L2REACTIVE_LINE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES:
				return l2reactive_transformer_losses != L2REACTIVE_TRANSFORMER_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_P:
				return l2reactive_transformer_losses_P != L2REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_M:
				return l2reactive_transformer_losses_M != L2REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES:
				return l2reactive_losses != L2REACTIVE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_P:
				return l2reactive_losses_P != L2REACTIVE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_M:
				return l2reactive_losses_M != L2REACTIVE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_AMPERE_SQUARED_HOURS:
				return l2Ampere_squared_hours != L2_AMPERE_SQUARED_HOURS_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L2_VOLT_SQUARED_HOURS:
				return l2Volt_squared_hours != L2_VOLT_SQUARED_HOURS_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_P:
				return l3Active_line_losses_P != L3_ACTIVE_LINE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_M:
				return l3Active_line_losses_M != L3_ACTIVE_LINE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_P:
				return l3active_transformer_losses_P != L3ACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_M:
				return l3active_transformer_losses_M != L3ACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES:
				return l3active_transformer_losses != L3ACTIVE_TRANSFORMER_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_P:
				return l3active_losses_P != L3ACTIVE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_M:
				return l3active_losses_M != L3ACTIVE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES:
				return l3active_losses != L3ACTIVE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_P:
				return l3reactive_line_losses_P != L3REACTIVE_LINE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_M:
				return l3reactive_line_losses_M != L3REACTIVE_LINE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES:
				return l3reactive_line_losses != L3REACTIVE_LINE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_P:
				return l3reactive_transformer_losses_P != L3REACTIVE_TRANSFORMER_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_M:
				return l3reactive_transformer_losses_M != L3REACTIVE_TRANSFORMER_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES:
				return l3reactive_transformer_losses != L3REACTIVE_TRANSFORMER_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_P:
				return l3reactive_losses_P != L3REACTIVE_LOSSES_P_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_M:
				return l3reactive_losses_M != L3REACTIVE_LOSSES_M_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES:
				return l3reactive_losses != L3REACTIVE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_AMPERE_SQUARED_HOURS:
				return l3Ampere_squared_hours != L3_AMPERE_SQUARED_HOURS_EDEFAULT;
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES__L3_VOLT_SQUARED_HOURS:
				return l3Volt_Squared_hours != L3_VOLT_SQUARED_HOURS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Active_line_losses_P: ");
		result.append(active_line_losses_P);
		result.append(", Active_line_losses_M: ");
		result.append(active_line_losses_M);
		result.append(", Active_line_losses: ");
		result.append(active_line_losses);
		result.append(", Active_transformer_losses_P: ");
		result.append(active_transformer_losses_P);
		result.append(", Active_transformer_losses_M: ");
		result.append(active_transformer_losses_M);
		result.append(", Active_transformer_losses: ");
		result.append(active_transformer_losses);
		result.append(", Active_losses_P: ");
		result.append(active_losses_P);
		result.append(", Active_losses_M: ");
		result.append(active_losses_M);
		result.append(", Active_losses: ");
		result.append(active_losses);
		result.append(", Reactive_line_losses_P: ");
		result.append(reactive_line_losses_P);
		result.append(", Reactive_line_losses_M: ");
		result.append(reactive_line_losses_M);
		result.append(", Reactive_line_losses: ");
		result.append(reactive_line_losses);
		result.append(", Reactive_transformer_losses_P: ");
		result.append(reactive_transformer_losses_P);
		result.append(", Reactive_transformer_losses_M: ");
		result.append(reactive_transformer_losses_M);
		result.append(", Reactive_transformer_losses: ");
		result.append(reactive_transformer_losses);
		result.append(", Reactive_losses_P: ");
		result.append(reactive_losses_P);
		result.append(", Reactive_losses_M: ");
		result.append(reactive_losses_M);
		result.append(", Reactive_losses: ");
		result.append(reactive_losses);
		result.append(", Total_normalized_transformer_losses: ");
		result.append(total_normalized_transformer_losses);
		result.append(", Total_normalized_line_losses: ");
		result.append(total_normalized_line_losses);
		result.append(", Compensated_active_gross_P: ");
		result.append(compensated_active_gross_P);
		result.append(", Compensated_active_net_P: ");
		result.append(compensated_active_net_P);
		result.append(", Compensated_active_gross_M: ");
		result.append(compensated_active_gross_M);
		result.append(", Compensated_active_net_M: ");
		result.append(compensated_active_net_M);
		result.append(", Compensated_reactive_gross_P: ");
		result.append(compensated_reactive_gross_P);
		result.append(", Compensated_reactive_net_P: ");
		result.append(compensated_reactive_net_P);
		result.append(", Compensated_reactive_gross_M: ");
		result.append(compensated_reactive_gross_M);
		result.append(", Compensated_reactive_net_M: ");
		result.append(compensated_reactive_net_M);
		result.append(", L1active_line_losses: ");
		result.append(l1active_line_losses);
		result.append(", L1active_line_losses_M: ");
		result.append(l1active_line_losses_M);
		result.append(", L1active_transformer_losses_P: ");
		result.append(l1active_transformer_losses_P);
		result.append(", L1active_transformer_losses_M: ");
		result.append(l1active_transformer_losses_M);
		result.append(", L1active_transformer_losses: ");
		result.append(l1active_transformer_losses);
		result.append(", L1active_losses_P: ");
		result.append(l1active_losses_P);
		result.append(", L1active_losses_M: ");
		result.append(l1active_losses_M);
		result.append(", L1active_losses: ");
		result.append(l1active_losses);
		result.append(", L1reactive_line_losses_P: ");
		result.append(l1reactive_line_losses_P);
		result.append(", L1reactive_line_losses_M: ");
		result.append(l1reactive_line_losses_M);
		result.append(", L1reactive_line_losses: ");
		result.append(l1reactive_line_losses);
		result.append(", L1reactive_transformer_losses_P: ");
		result.append(l1reactive_transformer_losses_P);
		result.append(", L1reactive_transformer_losses_M: ");
		result.append(l1reactive_transformer_losses_M);
		result.append(", L1reactive_transformer_losses: ");
		result.append(l1reactive_transformer_losses);
		result.append(", L1Reactive_losses_P: ");
		result.append(l1Reactive_losses_P);
		result.append(", L1Reactive_losses_M: ");
		result.append(l1Reactive_losses_M);
		result.append(", L1Reactive_losses: ");
		result.append(l1Reactive_losses);
		result.append(", L1Ampere_squared_hours: ");
		result.append(l1Ampere_squared_hours);
		result.append(", L1Volt_squared_hours: ");
		result.append(l1Volt_squared_hours);
		result.append(", L2active_line_losses_P: ");
		result.append(l2active_line_losses_P);
		result.append(", L2active_line_losses_M: ");
		result.append(l2active_line_losses_M);
		result.append(", L2active_transformer_losses_P: ");
		result.append(l2active_transformer_losses_P);
		result.append(", L2active_transformer_losses_M: ");
		result.append(l2active_transformer_losses_M);
		result.append(", L2active_transformer_losses: ");
		result.append(l2active_transformer_losses);
		result.append(", L2active_losses_P: ");
		result.append(l2active_losses_P);
		result.append(", L2active_losses_M: ");
		result.append(l2active_losses_M);
		result.append(", L2active_losses: ");
		result.append(l2active_losses);
		result.append(", L2reactive_line_losses_P: ");
		result.append(l2reactive_line_losses_P);
		result.append(", L2reactive_line_losses_M: ");
		result.append(l2reactive_line_losses_M);
		result.append(", L2reactive_line_losses: ");
		result.append(l2reactive_line_losses);
		result.append(", L2reactive_transformer_losses: ");
		result.append(l2reactive_transformer_losses);
		result.append(", L2reactive_transformer_losses_P: ");
		result.append(l2reactive_transformer_losses_P);
		result.append(", L2reactive_transformer_losses_M: ");
		result.append(l2reactive_transformer_losses_M);
		result.append(", L2reactive_losses: ");
		result.append(l2reactive_losses);
		result.append(", L2reactive_losses_P: ");
		result.append(l2reactive_losses_P);
		result.append(", L2reactive_losses_M: ");
		result.append(l2reactive_losses_M);
		result.append(", L2Ampere_squared_hours: ");
		result.append(l2Ampere_squared_hours);
		result.append(", L2Volt_squared_hours: ");
		result.append(l2Volt_squared_hours);
		result.append(", L3Active_line_losses_P: ");
		result.append(l3Active_line_losses_P);
		result.append(", L3Active_line_losses_M: ");
		result.append(l3Active_line_losses_M);
		result.append(", L3active_transformer_losses_P: ");
		result.append(l3active_transformer_losses_P);
		result.append(", L3active_transformer_losses_M: ");
		result.append(l3active_transformer_losses_M);
		result.append(", L3active_transformer_losses: ");
		result.append(l3active_transformer_losses);
		result.append(", L3active_losses_P: ");
		result.append(l3active_losses_P);
		result.append(", L3active_losses_M: ");
		result.append(l3active_losses_M);
		result.append(", L3active_losses: ");
		result.append(l3active_losses);
		result.append(", L3reactive_line_losses_P: ");
		result.append(l3reactive_line_losses_P);
		result.append(", L3reactive_line_losses_M: ");
		result.append(l3reactive_line_losses_M);
		result.append(", L3reactive_line_losses: ");
		result.append(l3reactive_line_losses);
		result.append(", L3reactive_transformer_losses_P: ");
		result.append(l3reactive_transformer_losses_P);
		result.append(", L3reactive_transformer_losses_M: ");
		result.append(l3reactive_transformer_losses_M);
		result.append(", L3reactive_transformer_losses: ");
		result.append(l3reactive_transformer_losses);
		result.append(", L3reactive_losses_P: ");
		result.append(l3reactive_losses_P);
		result.append(", L3reactive_losses_M: ");
		result.append(l3reactive_losses_M);
		result.append(", L3reactive_losses: ");
		result.append(l3reactive_losses);
		result.append(", L3Ampere_squared_hours: ");
		result.append(l3Ampere_squared_hours);
		result.append(", L3Volt_Squared_hours: ");
		result.append(l3Volt_Squared_hours);
		result.append(')');
		return result.toString();
	}

} //TransformerAndLineLossesImpl
