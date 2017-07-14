/**
 */
package gluemodel.CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Irregular Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.IrregularIntervalSchedule#getTimePoints <em>Time Points</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIrregularIntervalSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The schedule has TimePoints where the time between them varies.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The schedule has TimePoints where the time between them varies.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The schedule has TimePoints where the time between them varies.' Profile\040documentation='The schedule has TimePoints where the time between them varies.'"
 * @generated
 */
public interface IrregularIntervalSchedule extends BasicIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Time Points</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.IrregularTimePoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Points</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIrregularIntervalSchedule_TimePoints()
	 * @see gluemodel.CIM.IEC61970.Core.IrregularTimePoint#getIntervalSchedule
	 * @model opposite="IntervalSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The point data values that define a curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The point data values that define a curve'"
	 * @generated
	 */
	EList<IrregularTimePoint> getTimePoints();

} // IrregularIntervalSchedule
