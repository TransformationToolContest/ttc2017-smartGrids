/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Location;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getSubdivision <em>Subdivision</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getBlock <em>Block</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations <em>Design Locations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest <em>One Call Request</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getLot <em>Lot</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection <em>Nearest Intersection</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkLocation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information about a particular location for various forms of work such as a one call request.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Information about a particular location for various forms of work such as a one call request.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information about a particular location for various forms of work such as a one call request.' Profile\040documentation='Information about a particular location for various forms of work such as a one call request.'"
 * @generated
 */
public interface WorkLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Subdivision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subdivision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdivision</em>' attribute.
	 * @see #setSubdivision(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkLocation_Subdivision()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name, identifier, or description of the subdivision, if applicable, in which work is to occur.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name, identifier, or description of the subdivision, if applicable, in which work is to occur.'"
	 * @generated
	 */
	String getSubdivision();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getSubdivision <em>Subdivision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdivision</em>' attribute.
	 * @see #getSubdivision()
	 * @generated
	 */
	void setSubdivision(String value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute.
	 * @see #setBlock(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkLocation_Block()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name, identifier, or description of the block, if applicable, in which work is to occur.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name, identifier, or description of the block, if applicable, in which work is to occur.'"
	 * @generated
	 */
	String getBlock();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getBlock <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' attribute.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(String value);

	/**
	 * Returns the value of the '<em><b>Design Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.DesignLocation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations <em>Work Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Locations</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkLocation_DesignLocations()
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations
	 * @model opposite="WorkLocations"
	 * @generated
	 */
	EList<DesignLocation> getDesignLocations();

	/**
	 * Returns the value of the '<em><b>One Call Request</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations <em>Work Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Call Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Call Request</em>' reference.
	 * @see #setOneCallRequest(OneCallRequest)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkLocation_OneCallRequest()
	 * @see CIM.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations
	 * @model opposite="WorkLocations"
	 * @generated
	 */
	OneCallRequest getOneCallRequest();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest <em>One Call Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Call Request</em>' reference.
	 * @see #getOneCallRequest()
	 * @generated
	 */
	void setOneCallRequest(OneCallRequest value);

	/**
	 * Returns the value of the '<em><b>Lot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot</em>' attribute.
	 * @see #setLot(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkLocation_Lot()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name, identifier, or description of the lot, if applicable, in which work is to occur.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name, identifier, or description of the lot, if applicable, in which work is to occur.'"
	 * @generated
	 */
	String getLot();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getLot <em>Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot</em>' attribute.
	 * @see #getLot()
	 * @generated
	 */
	void setLot(String value);

	/**
	 * Returns the value of the '<em><b>Nearest Intersection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nearest Intersection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nearest Intersection</em>' attribute.
	 * @see #setNearestIntersection(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkLocation_NearestIntersection()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The names of streets at the nearest intersection to work area.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The names of streets at the nearest intersection to work area.'"
	 * @generated
	 */
	String getNearestIntersection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection <em>Nearest Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nearest Intersection</em>' attribute.
	 * @see #getNearestIntersection()
	 * @generated
	 */
	void setNearestIntersection(String value);

} // WorkLocation
