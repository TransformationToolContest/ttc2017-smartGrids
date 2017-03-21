/**
 */
package COSEM.InterfaceClasses.impl;

import COSEM.InterfaceClasses.InterfaceClassesPackage;
import COSEM.InterfaceClasses.Script;
import COSEM.InterfaceClasses.Scripttable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripttable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.InterfaceClasses.impl.ScripttableImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScripttableImpl extends BaseImpl implements Scripttable {
	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> includes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScripttableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceClassesPackage.Literals.SCRIPTTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Script> getIncludes() {
		if (includes == null) {
			includes = new EObjectResolvingEList<Script>(Script.class, this, InterfaceClassesPackage.SCRIPTTABLE__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterfaceClassesPackage.SCRIPTTABLE__INCLUDES:
				return getIncludes();
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
			case InterfaceClassesPackage.SCRIPTTABLE__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends Script>)newValue);
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
			case InterfaceClassesPackage.SCRIPTTABLE__INCLUDES:
				getIncludes().clear();
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
			case InterfaceClassesPackage.SCRIPTTABLE__INCLUDES:
				return includes != null && !includes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InterfaceClassesPackage.SCRIPTTABLE___EXECUTE:
				execute();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ScripttableImpl
