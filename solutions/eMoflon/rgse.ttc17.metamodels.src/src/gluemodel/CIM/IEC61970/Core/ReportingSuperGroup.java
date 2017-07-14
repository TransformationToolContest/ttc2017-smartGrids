/**
 */
package gluemodel.CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reporting Super Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getReportingSuperGroup()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reporting super group, groups reporting groups for a higher level report.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A reporting super group, groups reporting groups for a higher level report.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reporting super group, groups reporting groups for a higher level report.' Profile\040documentation='A reporting super group, groups reporting groups for a higher level report.'"
 * @generated
 */
public interface ReportingSuperGroup extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Reporting Group</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.ReportingGroup}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Group</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getReportingSuperGroup_ReportingGroup()
	 * @see gluemodel.CIM.IEC61970.Core.ReportingGroup#getReportingSuperGroup
	 * @model opposite="ReportingSuperGroup"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reporting groups that are grouped under this group group.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reporting groups that are grouped under this group group.'"
	 * @generated
	 */
	EList<ReportingGroup> getReportingGroup();

} // ReportingSuperGroup
