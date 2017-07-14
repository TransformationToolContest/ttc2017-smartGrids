/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.IEC61970.Domain.UnitMultiplier;
import gluemodel.CIM.IEC61970.Domain.UnitSymbol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getY2Unit <em>Y2 Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getXMultiplier <em>XMultiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getY3Multiplier <em>Y3 Multiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getY1Unit <em>Y1 Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getCurveStyle <em>Curve Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getY3Unit <em>Y3 Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getCurveDatas <em>Curve Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getY2Multiplier <em>Y2 Multiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Curve#getY1Multiplier <em>Y1 Multiplier</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A multi-purpose curve or functional relationship between an independent variable (X-axis) and dependent (Y-axis) variables.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A multi-purpose curve or functional relationship between an independent variable (X-axis) and dependent (Y-axis) variables.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A multi-purpose curve or functional relationship between an independent variable (X-axis) and dependent (Y-axis) variables.' Profile\040documentation='A multi-purpose curve or functional relationship between an independent variable (X-axis) and dependent (Y-axis) variables.'"
 * @generated
 */
public interface Curve extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Y2 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2 Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #setY2Unit(UnitSymbol)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_Y2Unit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Y2-axis units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Y2-axis units of measure.'"
	 * @generated
	 */
	UnitSymbol getY2Unit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Curve#getY2Unit <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2 Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #getY2Unit()
	 * @generated
	 */
	void setY2Unit(UnitSymbol value);

	/**
	 * Returns the value of the '<em><b>XMultiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMultiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMultiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #setXMultiplier(UnitMultiplier)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_XMultiplier()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiplier for X-axis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiplier for X-axis.'"
	 * @generated
	 */
	UnitMultiplier getXMultiplier();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Curve#getXMultiplier <em>XMultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMultiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #getXMultiplier()
	 * @generated
	 */
	void setXMultiplier(UnitMultiplier value);

	/**
	 * Returns the value of the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y3 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y3 Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #setY3Multiplier(UnitMultiplier)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_Y3Multiplier()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiplier for Y3-axis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiplier for Y3-axis.'"
	 * @generated
	 */
	UnitMultiplier getY3Multiplier();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Curve#getY3Multiplier <em>Y3 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y3 Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #getY3Multiplier()
	 * @generated
	 */
	void setY3Multiplier(UnitMultiplier value);

	/**
	 * Returns the value of the '<em><b>Y1 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1 Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #setY1Unit(UnitSymbol)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_Y1Unit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Y1-axis units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Y1-axis units of measure.'"
	 * @generated
	 */
	UnitSymbol getY1Unit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Curve#getY1Unit <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1 Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #getY1Unit()
	 * @generated
	 */
	void setY1Unit(UnitSymbol value);

	/**
	 * Returns the value of the '<em><b>Curve Style</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Core.CurveStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Style</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.CurveStyle
	 * @see #setCurveStyle(CurveStyle)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_CurveStyle()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The style or shape of the curve.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The style or shape of the curve.'"
	 * @generated
	 */
	CurveStyle getCurveStyle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Curve#getCurveStyle <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Style</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.CurveStyle
	 * @see #getCurveStyle()
	 * @generated
	 */
	void setCurveStyle(CurveStyle value);

	/**
	 * Returns the value of the '<em><b>Y3 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y3 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y3 Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #setY3Unit(UnitSymbol)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_Y3Unit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Y3-axis units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Y3-axis units of measure.'"
	 * @generated
	 */
	UnitSymbol getY3Unit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Curve#getY3Unit <em>Y3 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y3 Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #getY3Unit()
	 * @generated
	 */
	void setY3Unit(UnitSymbol value);

	/**
	 * Returns the value of the '<em><b>XUnit</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XUnit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XUnit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #setXUnit(UnitSymbol)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_XUnit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The X-axis units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The X-axis units of measure.'"
	 * @generated
	 */
	UnitSymbol getXUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Curve#getXUnit <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XUnit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #getXUnit()
	 * @generated
	 */
	void setXUnit(UnitSymbol value);

	/**
	 * Returns the value of the '<em><b>Curve Datas</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.CurveData}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.CurveData#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Datas</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_CurveDatas()
	 * @see gluemodel.CIM.IEC61970.Core.CurveData#getCurve
	 * @model opposite="Curve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The point data values that define a curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The point data values that define a curve'"
	 * @generated
	 */
	EList<CurveData> getCurveDatas();

	/**
	 * Returns the value of the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2 Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #setY2Multiplier(UnitMultiplier)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_Y2Multiplier()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiplier for Y2-axis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiplier for Y2-axis.'"
	 * @generated
	 */
	UnitMultiplier getY2Multiplier();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Curve#getY2Multiplier <em>Y2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2 Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #getY2Multiplier()
	 * @generated
	 */
	void setY2Multiplier(UnitMultiplier value);

	/**
	 * Returns the value of the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1 Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #setY1Multiplier(UnitMultiplier)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurve_Y1Multiplier()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiplier for Y1-axis'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiplier for Y1-axis'"
	 * @generated
	 */
	UnitMultiplier getY1Multiplier();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Curve#getY1Multiplier <em>Y1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1 Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #getY1Multiplier()
	 * @generated
	 */
	void setY1Multiplier(UnitMultiplier value);

} // Curve
