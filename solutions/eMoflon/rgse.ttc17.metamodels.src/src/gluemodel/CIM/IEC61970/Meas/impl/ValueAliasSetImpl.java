/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Meas.Command;
import gluemodel.CIM.IEC61970.Meas.Discrete;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.ValueAliasSet;
import gluemodel.CIM.IEC61970.Meas.ValueToAlias;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Alias Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.ValueAliasSetImpl#getValues <em>Values</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.ValueAliasSetImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.ValueAliasSetImpl#getDiscretes <em>Discretes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueAliasSetImpl extends IdentifiedObjectImpl implements ValueAliasSet {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueToAlias> values;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getDiscretes() <em>Discretes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretes()
	 * @generated
	 * @ordered
	 */
	protected EList<Discrete> discretes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueAliasSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.VALUE_ALIAS_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueToAlias> getValues() {
		if (values == null) {
			values = new EObjectWithInverseResolvingEList<ValueToAlias>(ValueToAlias.class, this, MeasPackage.VALUE_ALIAS_SET__VALUES, MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectWithInverseResolvingEList<Command>(Command.class, this, MeasPackage.VALUE_ALIAS_SET__COMMANDS, MeasPackage.COMMAND__VALUE_ALIAS_SET);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discrete> getDiscretes() {
		if (discretes == null) {
			discretes = new EObjectWithInverseResolvingEList<Discrete>(Discrete.class, this, MeasPackage.VALUE_ALIAS_SET__DISCRETES, MeasPackage.DISCRETE__VALUE_ALIAS_SET);
		}
		return discretes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommands()).basicAdd(otherEnd, msgs);
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiscretes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				return ((InternalEList<?>)getDiscretes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				return getValues();
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				return getCommands();
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				return getDiscretes();
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
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends ValueToAlias>)newValue);
				return;
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				getDiscretes().clear();
				getDiscretes().addAll((Collection<? extends Discrete>)newValue);
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
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				getValues().clear();
				return;
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				getCommands().clear();
				return;
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				getDiscretes().clear();
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
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				return values != null && !values.isEmpty();
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				return commands != null && !commands.isEmpty();
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				return discretes != null && !discretes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueAliasSetImpl
