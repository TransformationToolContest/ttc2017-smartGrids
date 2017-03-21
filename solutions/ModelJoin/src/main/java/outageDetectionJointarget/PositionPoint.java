/**
 */
package outageDetectionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outageDetectionJointarget.PositionPoint#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link outageDetectionJointarget.PositionPoint#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link outageDetectionJointarget.PositionPoint#getZPosition <em>ZPosition</em>}</li>
 * </ul>
 *
 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getPositionPoint()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing' order='3'"
 * @generated
 */
public interface PositionPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPosition</em>' attribute.
	 * @see #setXPosition(String)
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getPositionPoint_XPosition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='X axis position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='X axis position.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepattributes'"
	 * @generated
	 */
	String getXPosition();

	/**
	 * Sets the value of the '{@link outageDetectionJointarget.PositionPoint#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPosition</em>' attribute.
	 * @see #getXPosition()
	 * @generated
	 */
	void setXPosition(String value);

	/**
	 * Returns the value of the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPosition</em>' attribute.
	 * @see #setYPosition(String)
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getPositionPoint_YPosition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Y axis position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Y axis position.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepattributes'"
	 * @generated
	 */
	String getYPosition();

	/**
	 * Sets the value of the '{@link outageDetectionJointarget.PositionPoint#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(String value);

	/**
	 * Returns the value of the '<em><b>ZPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZPosition</em>' attribute.
	 * @see #setZPosition(String)
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getPositionPoint_ZPosition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Z axis position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Z axis position.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepattributes'"
	 * @generated
	 */
	String getZPosition();

	/**
	 * Sets the value of the '{@link outageDetectionJointarget.PositionPoint#getZPosition <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZPosition</em>' attribute.
	 * @see #getZPosition()
	 * @generated
	 */
	void setZPosition(String value);

} // PositionPoint
