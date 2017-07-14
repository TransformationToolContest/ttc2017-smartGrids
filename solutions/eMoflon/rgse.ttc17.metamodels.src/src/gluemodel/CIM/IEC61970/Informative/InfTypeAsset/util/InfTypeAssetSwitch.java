/**
 */
package gluemodel.CIM.IEC61970.Informative.InfTypeAsset.util;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage
 * @generated
 */
public class InfTypeAssetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfTypeAssetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfTypeAssetSwitch() {
		if (modelPackage == null) {
			modelPackage = InfTypeAssetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE: {
				TypeAssetCatalogue typeAssetCatalogue = (TypeAssetCatalogue)theEObject;
				T result = caseTypeAssetCatalogue(typeAssetCatalogue);
				if (result == null) result = caseIdentifiedObject(typeAssetCatalogue);
				if (result == null) result = caseElement(typeAssetCatalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET: {
				ElectricalTypeAsset electricalTypeAsset = (ElectricalTypeAsset)theEObject;
				T result = caseElectricalTypeAsset(electricalTypeAsset);
				if (result == null) result = caseTypeAsset(electricalTypeAsset);
				if (result == null) result = caseIdentifiedObject(electricalTypeAsset);
				if (result == null) result = caseElement(electricalTypeAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfTypeAssetPackage.TYPE_ASSET: {
				TypeAsset typeAsset = (TypeAsset)theEObject;
				T result = caseTypeAsset(typeAsset);
				if (result == null) result = caseIdentifiedObject(typeAsset);
				if (result == null) result = caseElement(typeAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET: {
				GeneratorTypeAsset generatorTypeAsset = (GeneratorTypeAsset)theEObject;
				T result = caseGeneratorTypeAsset(generatorTypeAsset);
				if (result == null) result = caseElectricalTypeAsset(generatorTypeAsset);
				if (result == null) result = caseTypeAsset(generatorTypeAsset);
				if (result == null) result = caseIdentifiedObject(generatorTypeAsset);
				if (result == null) result = caseElement(generatorTypeAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Asset Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Asset Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssetCatalogue(TypeAssetCatalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Type Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Type Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalTypeAsset(ElectricalTypeAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAsset(TypeAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Type Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Type Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorTypeAsset(GeneratorTypeAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InfTypeAssetSwitch
