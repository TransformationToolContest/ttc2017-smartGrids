/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Wires.DCLineSegment;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.DCLineSegmentImpl#getDcSegmentResistance <em>Dc Segment Resistance</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.DCLineSegmentImpl#getDcSegmentInductance <em>Dc Segment Inductance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCLineSegmentImpl extends ConductorImpl implements DCLineSegment {
	/**
	 * The default value of the '{@link #getDcSegmentResistance() <em>Dc Segment Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcSegmentResistance()
	 * @generated
	 * @ordered
	 */
	protected static final float DC_SEGMENT_RESISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDcSegmentResistance() <em>Dc Segment Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcSegmentResistance()
	 * @generated
	 * @ordered
	 */
	protected float dcSegmentResistance = DC_SEGMENT_RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDcSegmentInductance() <em>Dc Segment Inductance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcSegmentInductance()
	 * @generated
	 * @ordered
	 */
	protected static final float DC_SEGMENT_INDUCTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDcSegmentInductance() <em>Dc Segment Inductance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcSegmentInductance()
	 * @generated
	 * @ordered
	 */
	protected float dcSegmentInductance = DC_SEGMENT_INDUCTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCLineSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.DC_LINE_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDcSegmentResistance() {
		return dcSegmentResistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDcSegmentResistance(float newDcSegmentResistance) {
		float oldDcSegmentResistance = dcSegmentResistance;
		dcSegmentResistance = newDcSegmentResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE, oldDcSegmentResistance, dcSegmentResistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDcSegmentInductance() {
		return dcSegmentInductance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDcSegmentInductance(float newDcSegmentInductance) {
		float oldDcSegmentInductance = dcSegmentInductance;
		dcSegmentInductance = newDcSegmentInductance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE, oldDcSegmentInductance, dcSegmentInductance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE:
				return getDcSegmentResistance();
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE:
				return getDcSegmentInductance();
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
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE:
				setDcSegmentResistance((Float)newValue);
				return;
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE:
				setDcSegmentInductance((Float)newValue);
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
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE:
				setDcSegmentResistance(DC_SEGMENT_RESISTANCE_EDEFAULT);
				return;
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE:
				setDcSegmentInductance(DC_SEGMENT_INDUCTANCE_EDEFAULT);
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
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE:
				return dcSegmentResistance != DC_SEGMENT_RESISTANCE_EDEFAULT;
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE:
				return dcSegmentInductance != DC_SEGMENT_INDUCTANCE_EDEFAULT;
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
		result.append(" (dcSegmentResistance: ");
		result.append(dcSegmentResistance);
		result.append(", dcSegmentInductance: ");
		result.append(dcSegmentInductance);
		result.append(')');
		return result.toString();
	}

} //DCLineSegmentImpl
