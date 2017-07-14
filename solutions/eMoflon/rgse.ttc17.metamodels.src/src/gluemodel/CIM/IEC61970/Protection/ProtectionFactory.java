/**
 */
package gluemodel.CIM.IEC61970.Protection;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Protection.ProtectionPackage
 * @generated
 */
public interface ProtectionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtectionFactory eINSTANCE = gluemodel.CIM.IEC61970.Protection.impl.ProtectionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Current Relay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Relay</em>'.
	 * @generated
	 */
	CurrentRelay createCurrentRelay();

	/**
	 * Returns a new object of class '<em>Synchrocheck Relay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchrocheck Relay</em>'.
	 * @generated
	 */
	SynchrocheckRelay createSynchrocheckRelay();

	/**
	 * Returns a new object of class '<em>Reclose Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reclose Sequence</em>'.
	 * @generated
	 */
	RecloseSequence createRecloseSequence();

	/**
	 * Returns a new object of class '<em>Surge Protector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surge Protector</em>'.
	 * @generated
	 */
	SurgeProtector createSurgeProtector();

	/**
	 * Returns a new object of class '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipment</em>'.
	 * @generated
	 */
	ProtectionEquipment createProtectionEquipment();

	/**
	 * Returns a new object of class '<em>Fault Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Indicator</em>'.
	 * @generated
	 */
	FaultIndicator createFaultIndicator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProtectionPackage getProtectionPackage();

} //ProtectionFactory
