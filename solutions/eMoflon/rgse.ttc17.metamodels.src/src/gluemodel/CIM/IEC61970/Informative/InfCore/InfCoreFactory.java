/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfCore.InfCorePackage
 * @generated
 */
public interface InfCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfCoreFactory eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfCore.impl.InfCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modeling Authority Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modeling Authority Set</em>'.
	 * @generated
	 */
	ModelingAuthoritySet createModelingAuthoritySet();

	/**
	 * Returns a new object of class '<em>Modeling Authority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modeling Authority</em>'.
	 * @generated
	 */
	ModelingAuthority createModelingAuthority();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfCorePackage getInfCorePackage();

} //InfCoreFactory
