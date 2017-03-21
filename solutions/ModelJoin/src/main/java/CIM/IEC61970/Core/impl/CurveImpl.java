/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Curve;
import CIM.IEC61970.Core.CurveData;
import CIM.IEC61970.Core.CurveStyle;

import CIM.IEC61970.Domain.UnitMultiplier;
import CIM.IEC61970.Domain.UnitSymbol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getY2Unit <em>Y2 Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getXMultiplier <em>XMultiplier</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getY3Multiplier <em>Y3 Multiplier</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getY1Unit <em>Y1 Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getCurveStyle <em>Curve Style</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getY3Unit <em>Y3 Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getCurveDatas <em>Curve Datas</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getY2Multiplier <em>Y2 Multiplier</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveImpl#getY1Multiplier <em>Y1 Multiplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveImpl extends IdentifiedObjectImpl implements Curve {
	/**
	 * The default value of the '{@link #getY2Unit() <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol Y2_UNIT_EDEFAULT = UnitSymbol.A;

	/**
	 * The cached value of the '{@link #getY2Unit() <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol y2Unit = Y2_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXMultiplier() <em>XMultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier XMULTIPLIER_EDEFAULT = UnitMultiplier.SMALL_M;

	/**
	 * The cached value of the '{@link #getXMultiplier() <em>XMultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMultiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier xMultiplier = XMULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getY3Multiplier() <em>Y3 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier Y3_MULTIPLIER_EDEFAULT = UnitMultiplier.SMALL_M;

	/**
	 * The cached value of the '{@link #getY3Multiplier() <em>Y3 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier y3Multiplier = Y3_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1Unit() <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol Y1_UNIT_EDEFAULT = UnitSymbol.A;

	/**
	 * The cached value of the '{@link #getY1Unit() <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol y1Unit = Y1_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurveStyle() <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveStyle()
	 * @generated
	 * @ordered
	 */
	protected static final CurveStyle CURVE_STYLE_EDEFAULT = CurveStyle.STRAIGHT_LINE_YVALUES;

	/**
	 * The cached value of the '{@link #getCurveStyle() <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveStyle()
	 * @generated
	 * @ordered
	 */
	protected CurveStyle curveStyle = CURVE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getY3Unit() <em>Y3 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol Y3_UNIT_EDEFAULT = UnitSymbol.A;

	/**
	 * The cached value of the '{@link #getY3Unit() <em>Y3 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol y3Unit = Y3_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol XUNIT_EDEFAULT = UnitSymbol.A;

	/**
	 * The cached value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol xUnit = XUNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurveDatas() <em>Curve Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<CurveData> curveDatas;

	/**
	 * The default value of the '{@link #getY2Multiplier() <em>Y2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier Y2_MULTIPLIER_EDEFAULT = UnitMultiplier.SMALL_M;

	/**
	 * The cached value of the '{@link #getY2Multiplier() <em>Y2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier y2Multiplier = Y2_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1Multiplier() <em>Y1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier Y1_MULTIPLIER_EDEFAULT = UnitMultiplier.SMALL_M;

	/**
	 * The cached value of the '{@link #getY1Multiplier() <em>Y1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier y1Multiplier = Y1_MULTIPLIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getY2Unit() {
		return y2Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2Unit(UnitSymbol newY2Unit) {
		UnitSymbol oldY2Unit = y2Unit;
		y2Unit = newY2Unit == null ? Y2_UNIT_EDEFAULT : newY2Unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE__Y2_UNIT, oldY2Unit, y2Unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMultiplier getXMultiplier() {
		return xMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMultiplier(UnitMultiplier newXMultiplier) {
		UnitMultiplier oldXMultiplier = xMultiplier;
		xMultiplier = newXMultiplier == null ? XMULTIPLIER_EDEFAULT : newXMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE__XMULTIPLIER, oldXMultiplier, xMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMultiplier getY3Multiplier() {
		return y3Multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY3Multiplier(UnitMultiplier newY3Multiplier) {
		UnitMultiplier oldY3Multiplier = y3Multiplier;
		y3Multiplier = newY3Multiplier == null ? Y3_MULTIPLIER_EDEFAULT : newY3Multiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE__Y3_MULTIPLIER, oldY3Multiplier, y3Multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getY1Unit() {
		return y1Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1Unit(UnitSymbol newY1Unit) {
		UnitSymbol oldY1Unit = y1Unit;
		y1Unit = newY1Unit == null ? Y1_UNIT_EDEFAULT : newY1Unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE__Y1_UNIT, oldY1Unit, y1Unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveStyle getCurveStyle() {
		return curveStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveStyle(CurveStyle newCurveStyle) {
		CurveStyle oldCurveStyle = curveStyle;
		curveStyle = newCurveStyle == null ? CURVE_STYLE_EDEFAULT : newCurveStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE__CURVE_STYLE, oldCurveStyle, curveStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getY3Unit() {
		return y3Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY3Unit(UnitSymbol newY3Unit) {
		UnitSymbol oldY3Unit = y3Unit;
		y3Unit = newY3Unit == null ? Y3_UNIT_EDEFAULT : newY3Unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE__Y3_UNIT, oldY3Unit, y3Unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getXUnit() {
		return xUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXUnit(UnitSymbol newXUnit) {
		UnitSymbol oldXUnit = xUnit;
		xUnit = newXUnit == null ? XUNIT_EDEFAULT : newXUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE__XUNIT, oldXUnit, xUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurveData> getCurveDatas() {
		if (curveDatas == null) {
			curveDatas = new EObjectWithInverseResolvingEList<CurveData>(CurveData.class, this, CorePackage.CURVE__CURVE_DATAS, CorePackage.CURVE_DATA__CURVE);
		}
		return curveDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMultiplier getY2Multiplier() {
		return y2Multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2Multiplier(UnitMultiplier newY2Multiplier) {
		UnitMultiplier oldY2Multiplier = y2Multiplier;
		y2Multiplier = newY2Multiplier == null ? Y2_MULTIPLIER_EDEFAULT : newY2Multiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE__Y2_MULTIPLIER, oldY2Multiplier, y2Multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMultiplier getY1Multiplier() {
		return y1Multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1Multiplier(UnitMultiplier newY1Multiplier) {
		UnitMultiplier oldY1Multiplier = y1Multiplier;
		y1Multiplier = newY1Multiplier == null ? Y1_MULTIPLIER_EDEFAULT : newY1Multiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE__Y1_MULTIPLIER, oldY1Multiplier, y1Multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CURVE__CURVE_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurveDatas()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CURVE__CURVE_DATAS:
				return ((InternalEList<?>)getCurveDatas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CURVE__Y2_UNIT:
				return getY2Unit();
			case CorePackage.CURVE__XMULTIPLIER:
				return getXMultiplier();
			case CorePackage.CURVE__Y3_MULTIPLIER:
				return getY3Multiplier();
			case CorePackage.CURVE__Y1_UNIT:
				return getY1Unit();
			case CorePackage.CURVE__CURVE_STYLE:
				return getCurveStyle();
			case CorePackage.CURVE__Y3_UNIT:
				return getY3Unit();
			case CorePackage.CURVE__XUNIT:
				return getXUnit();
			case CorePackage.CURVE__CURVE_DATAS:
				return getCurveDatas();
			case CorePackage.CURVE__Y2_MULTIPLIER:
				return getY2Multiplier();
			case CorePackage.CURVE__Y1_MULTIPLIER:
				return getY1Multiplier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.CURVE__Y2_UNIT:
				setY2Unit((UnitSymbol)newValue);
				return;
			case CorePackage.CURVE__XMULTIPLIER:
				setXMultiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.CURVE__Y3_MULTIPLIER:
				setY3Multiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.CURVE__Y1_UNIT:
				setY1Unit((UnitSymbol)newValue);
				return;
			case CorePackage.CURVE__CURVE_STYLE:
				setCurveStyle((CurveStyle)newValue);
				return;
			case CorePackage.CURVE__Y3_UNIT:
				setY3Unit((UnitSymbol)newValue);
				return;
			case CorePackage.CURVE__XUNIT:
				setXUnit((UnitSymbol)newValue);
				return;
			case CorePackage.CURVE__CURVE_DATAS:
				getCurveDatas().clear();
				getCurveDatas().addAll((Collection<? extends CurveData>)newValue);
				return;
			case CorePackage.CURVE__Y2_MULTIPLIER:
				setY2Multiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.CURVE__Y1_MULTIPLIER:
				setY1Multiplier((UnitMultiplier)newValue);
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
			case CorePackage.CURVE__Y2_UNIT:
				setY2Unit(Y2_UNIT_EDEFAULT);
				return;
			case CorePackage.CURVE__XMULTIPLIER:
				setXMultiplier(XMULTIPLIER_EDEFAULT);
				return;
			case CorePackage.CURVE__Y3_MULTIPLIER:
				setY3Multiplier(Y3_MULTIPLIER_EDEFAULT);
				return;
			case CorePackage.CURVE__Y1_UNIT:
				setY1Unit(Y1_UNIT_EDEFAULT);
				return;
			case CorePackage.CURVE__CURVE_STYLE:
				setCurveStyle(CURVE_STYLE_EDEFAULT);
				return;
			case CorePackage.CURVE__Y3_UNIT:
				setY3Unit(Y3_UNIT_EDEFAULT);
				return;
			case CorePackage.CURVE__XUNIT:
				setXUnit(XUNIT_EDEFAULT);
				return;
			case CorePackage.CURVE__CURVE_DATAS:
				getCurveDatas().clear();
				return;
			case CorePackage.CURVE__Y2_MULTIPLIER:
				setY2Multiplier(Y2_MULTIPLIER_EDEFAULT);
				return;
			case CorePackage.CURVE__Y1_MULTIPLIER:
				setY1Multiplier(Y1_MULTIPLIER_EDEFAULT);
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
			case CorePackage.CURVE__Y2_UNIT:
				return y2Unit != Y2_UNIT_EDEFAULT;
			case CorePackage.CURVE__XMULTIPLIER:
				return xMultiplier != XMULTIPLIER_EDEFAULT;
			case CorePackage.CURVE__Y3_MULTIPLIER:
				return y3Multiplier != Y3_MULTIPLIER_EDEFAULT;
			case CorePackage.CURVE__Y1_UNIT:
				return y1Unit != Y1_UNIT_EDEFAULT;
			case CorePackage.CURVE__CURVE_STYLE:
				return curveStyle != CURVE_STYLE_EDEFAULT;
			case CorePackage.CURVE__Y3_UNIT:
				return y3Unit != Y3_UNIT_EDEFAULT;
			case CorePackage.CURVE__XUNIT:
				return xUnit != XUNIT_EDEFAULT;
			case CorePackage.CURVE__CURVE_DATAS:
				return curveDatas != null && !curveDatas.isEmpty();
			case CorePackage.CURVE__Y2_MULTIPLIER:
				return y2Multiplier != Y2_MULTIPLIER_EDEFAULT;
			case CorePackage.CURVE__Y1_MULTIPLIER:
				return y1Multiplier != Y1_MULTIPLIER_EDEFAULT;
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
		result.append(" (y2Unit: ");
		result.append(y2Unit);
		result.append(", xMultiplier: ");
		result.append(xMultiplier);
		result.append(", y3Multiplier: ");
		result.append(y3Multiplier);
		result.append(", y1Unit: ");
		result.append(y1Unit);
		result.append(", curveStyle: ");
		result.append(curveStyle);
		result.append(", y3Unit: ");
		result.append(y3Unit);
		result.append(", xUnit: ");
		result.append(xUnit);
		result.append(", y2Multiplier: ");
		result.append(y2Multiplier);
		result.append(", y1Multiplier: ");
		result.append(y1Multiplier);
		result.append(')');
		return result.toString();
	}

} //CurveImpl
