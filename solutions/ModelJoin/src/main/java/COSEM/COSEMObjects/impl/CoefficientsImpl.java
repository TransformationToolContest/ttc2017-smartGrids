/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.Coefficients;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coefficients</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.CoefficientsImpl#getTransformer_magnetic_losses <em>Transformer magnetic losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.CoefficientsImpl#getTransformer_iron_losses <em>Transformer iron losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.CoefficientsImpl#getLine_resistance_losses <em>Line resistance losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.CoefficientsImpl#getLine_reactance_losses <em>Line reactance losses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoefficientsImpl extends DataImpl implements Coefficients {
	/**
	 * The default value of the '{@link #getTransformer_magnetic_losses() <em>Transformer magnetic losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer_magnetic_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSFORMER_MAGNETIC_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransformer_magnetic_losses() <em>Transformer magnetic losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer_magnetic_losses()
	 * @generated
	 * @ordered
	 */
	protected double transformer_magnetic_losses = TRANSFORMER_MAGNETIC_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformer_iron_losses() <em>Transformer iron losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer_iron_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSFORMER_IRON_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransformer_iron_losses() <em>Transformer iron losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer_iron_losses()
	 * @generated
	 * @ordered
	 */
	protected double transformer_iron_losses = TRANSFORMER_IRON_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine_resistance_losses() <em>Line resistance losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_resistance_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double LINE_RESISTANCE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLine_resistance_losses() <em>Line resistance losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_resistance_losses()
	 * @generated
	 * @ordered
	 */
	protected double line_resistance_losses = LINE_RESISTANCE_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine_reactance_losses() <em>Line reactance losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_reactance_losses()
	 * @generated
	 * @ordered
	 */
	protected static final double LINE_REACTANCE_LOSSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLine_reactance_losses() <em>Line reactance losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_reactance_losses()
	 * @generated
	 * @ordered
	 */
	protected double line_reactance_losses = LINE_REACTANCE_LOSSES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoefficientsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getCoefficients();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransformer_magnetic_losses() {
		return transformer_magnetic_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformer_magnetic_losses(double newTransformer_magnetic_losses) {
		double oldTransformer_magnetic_losses = transformer_magnetic_losses;
		transformer_magnetic_losses = newTransformer_magnetic_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_MAGNETIC_LOSSES, oldTransformer_magnetic_losses, transformer_magnetic_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransformer_iron_losses() {
		return transformer_iron_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformer_iron_losses(double newTransformer_iron_losses) {
		double oldTransformer_iron_losses = transformer_iron_losses;
		transformer_iron_losses = newTransformer_iron_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_IRON_LOSSES, oldTransformer_iron_losses, transformer_iron_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLine_resistance_losses() {
		return line_resistance_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine_resistance_losses(double newLine_resistance_losses) {
		double oldLine_resistance_losses = line_resistance_losses;
		line_resistance_losses = newLine_resistance_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.COEFFICIENTS__LINE_RESISTANCE_LOSSES, oldLine_resistance_losses, line_resistance_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLine_reactance_losses() {
		return line_reactance_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine_reactance_losses(double newLine_reactance_losses) {
		double oldLine_reactance_losses = line_reactance_losses;
		line_reactance_losses = newLine_reactance_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.COEFFICIENTS__LINE_REACTANCE_LOSSES, oldLine_reactance_losses, line_reactance_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_MAGNETIC_LOSSES:
				return getTransformer_magnetic_losses();
			case COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_IRON_LOSSES:
				return getTransformer_iron_losses();
			case COSEMObjectsPackage.COEFFICIENTS__LINE_RESISTANCE_LOSSES:
				return getLine_resistance_losses();
			case COSEMObjectsPackage.COEFFICIENTS__LINE_REACTANCE_LOSSES:
				return getLine_reactance_losses();
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
			case COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_MAGNETIC_LOSSES:
				setTransformer_magnetic_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_IRON_LOSSES:
				setTransformer_iron_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.COEFFICIENTS__LINE_RESISTANCE_LOSSES:
				setLine_resistance_losses((Double)newValue);
				return;
			case COSEMObjectsPackage.COEFFICIENTS__LINE_REACTANCE_LOSSES:
				setLine_reactance_losses((Double)newValue);
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
			case COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_MAGNETIC_LOSSES:
				setTransformer_magnetic_losses(TRANSFORMER_MAGNETIC_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_IRON_LOSSES:
				setTransformer_iron_losses(TRANSFORMER_IRON_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.COEFFICIENTS__LINE_RESISTANCE_LOSSES:
				setLine_resistance_losses(LINE_RESISTANCE_LOSSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.COEFFICIENTS__LINE_REACTANCE_LOSSES:
				setLine_reactance_losses(LINE_REACTANCE_LOSSES_EDEFAULT);
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
			case COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_MAGNETIC_LOSSES:
				return transformer_magnetic_losses != TRANSFORMER_MAGNETIC_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.COEFFICIENTS__TRANSFORMER_IRON_LOSSES:
				return transformer_iron_losses != TRANSFORMER_IRON_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.COEFFICIENTS__LINE_RESISTANCE_LOSSES:
				return line_resistance_losses != LINE_RESISTANCE_LOSSES_EDEFAULT;
			case COSEMObjectsPackage.COEFFICIENTS__LINE_REACTANCE_LOSSES:
				return line_reactance_losses != LINE_REACTANCE_LOSSES_EDEFAULT;
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
		result.append(" (Transformer_magnetic_losses: ");
		result.append(transformer_magnetic_losses);
		result.append(", Transformer_iron_losses: ");
		result.append(transformer_iron_losses);
		result.append(", Line_resistance_losses: ");
		result.append(line_resistance_losses);
		result.append(", Line_reactance_losses: ");
		result.append(line_reactance_losses);
		result.append(')');
		return result.toString();
	}

} //CoefficientsImpl
