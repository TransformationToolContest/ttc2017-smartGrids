/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.CurveData#getXvalue <em>Xvalue</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.CurveData#getCurve <em>Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.CurveData#getY2value <em>Y2value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.CurveData#getY3value <em>Y3value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.CurveData#getY1value <em>Y1value</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurveData()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multi-purpose data points for defining a curve.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Multi-purpose data points for defining a curve.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multi-purpose data points for defining a curve.' Profile\040documentation='Multi-purpose data points for defining a curve.'"
 * @generated
 */
public interface CurveData extends Element {
	/**
	 * Returns the value of the '<em><b>Xvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xvalue</em>' attribute.
	 * @see #setXvalue(float)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurveData_Xvalue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The data value of the X-axis variable,  depending on the X-axis units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The data value of the X-axis variable,  depending on the X-axis units'"
	 * @generated
	 */
	float getXvalue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.CurveData#getXvalue <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xvalue</em>' attribute.
	 * @see #getXvalue()
	 * @generated
	 */
	void setXvalue(float value);

	/**
	 * Returns the value of the '<em><b>Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Curve#getCurveDatas <em>Curve Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve</em>' reference.
	 * @see #setCurve(Curve)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurveData_Curve()
	 * @see gluemodel.CIM.IEC61970.Core.Curve#getCurveDatas
	 * @model opposite="CurveDatas"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Curve defined by this CurveData.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Curve defined by this CurveData.'"
	 * @generated
	 */
	Curve getCurve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.CurveData#getCurve <em>Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' reference.
	 * @see #getCurve()
	 * @generated
	 */
	void setCurve(Curve value);

	/**
	 * Returns the value of the '<em><b>Y2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2value</em>' attribute.
	 * @see #setY2value(float)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurveData_Y2value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The data value of the second Y-axis variable (if present), depending on the Y-axis units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The data value of the second Y-axis variable (if present), depending on the Y-axis units'"
	 * @generated
	 */
	float getY2value();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.CurveData#getY2value <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2value</em>' attribute.
	 * @see #getY2value()
	 * @generated
	 */
	void setY2value(float value);

	/**
	 * Returns the value of the '<em><b>Y3value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y3value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y3value</em>' attribute.
	 * @see #setY3value(float)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurveData_Y3value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The data value of the third Y-axis variable (if present), depending on the Y-axis units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The data value of the third Y-axis variable (if present), depending on the Y-axis units'"
	 * @generated
	 */
	float getY3value();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.CurveData#getY3value <em>Y3value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y3value</em>' attribute.
	 * @see #getY3value()
	 * @generated
	 */
	void setY3value(float value);

	/**
	 * Returns the value of the '<em><b>Y1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1value</em>' attribute.
	 * @see #setY1value(float)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getCurveData_Y1value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The data value of the  first Y-axis variable, depending on the Y-axis units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The data value of the  first Y-axis variable, depending on the Y-axis units'"
	 * @generated
	 */
	float getY1value();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.CurveData#getY1value <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1value</em>' attribute.
	 * @see #getY1value()
	 * @generated
	 */
	void setY1value(float value);

} // CurveData
