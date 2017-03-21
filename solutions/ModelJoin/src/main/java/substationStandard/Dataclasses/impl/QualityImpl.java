/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.DetailQual;
import substationStandard.Dataclasses.Quality;

import substationStandard.Enumerations.SourceKind;
import substationStandard.Enumerations.ValidityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.QualityImpl#isTest <em>Test</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.QualityImpl#isOperatorBlocked <em>Operator Blocked</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.QualityImpl#getValidity <em>Validity</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.QualityImpl#getSource <em>Source</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.QualityImpl#getDetailQual <em>Detail Qual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityImpl extends MinimalEObjectImpl.Container implements Quality {
	/**
	 * The default value of the '{@link #isTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTest()
	 * @generated
	 * @ordered
	 */
	protected boolean test = TEST_EDEFAULT;

	/**
	 * The default value of the '{@link #isOperatorBlocked() <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperatorBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATOR_BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperatorBlocked() <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperatorBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean operatorBlocked = OPERATOR_BLOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected static final ValidityKind VALIDITY_EDEFAULT = ValidityKind.GOOD;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected ValidityKind validity = VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final SourceKind SOURCE_EDEFAULT = SourceKind.PROCESS;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SourceKind source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetailQual() <em>Detail Qual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailQual()
	 * @generated
	 * @ordered
	 */
	protected DetailQual detailQual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.QUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(boolean newTest) {
		boolean oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.QUALITY__TEST, oldTest, test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperatorBlocked() {
		return operatorBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorBlocked(boolean newOperatorBlocked) {
		boolean oldOperatorBlocked = operatorBlocked;
		operatorBlocked = newOperatorBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.QUALITY__OPERATOR_BLOCKED, oldOperatorBlocked, operatorBlocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidityKind getValidity() {
		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidity(ValidityKind newValidity) {
		ValidityKind oldValidity = validity;
		validity = newValidity == null ? VALIDITY_EDEFAULT : newValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.QUALITY__VALIDITY, oldValidity, validity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceKind getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SourceKind newSource) {
		SourceKind oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.QUALITY__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailQual getDetailQual() {
		if (detailQual != null && detailQual.eIsProxy()) {
			InternalEObject oldDetailQual = (InternalEObject)detailQual;
			detailQual = (DetailQual)eResolveProxy(oldDetailQual);
			if (detailQual != oldDetailQual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.QUALITY__DETAIL_QUAL, oldDetailQual, detailQual));
			}
		}
		return detailQual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailQual basicGetDetailQual() {
		return detailQual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailQual(DetailQual newDetailQual) {
		DetailQual oldDetailQual = detailQual;
		detailQual = newDetailQual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.QUALITY__DETAIL_QUAL, oldDetailQual, detailQual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.QUALITY__TEST:
				return isTest();
			case DataclassesPackage.QUALITY__OPERATOR_BLOCKED:
				return isOperatorBlocked();
			case DataclassesPackage.QUALITY__VALIDITY:
				return getValidity();
			case DataclassesPackage.QUALITY__SOURCE:
				return getSource();
			case DataclassesPackage.QUALITY__DETAIL_QUAL:
				if (resolve) return getDetailQual();
				return basicGetDetailQual();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataclassesPackage.QUALITY__TEST:
				setTest((Boolean)newValue);
				return;
			case DataclassesPackage.QUALITY__OPERATOR_BLOCKED:
				setOperatorBlocked((Boolean)newValue);
				return;
			case DataclassesPackage.QUALITY__VALIDITY:
				setValidity((ValidityKind)newValue);
				return;
			case DataclassesPackage.QUALITY__SOURCE:
				setSource((SourceKind)newValue);
				return;
			case DataclassesPackage.QUALITY__DETAIL_QUAL:
				setDetailQual((DetailQual)newValue);
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
			case DataclassesPackage.QUALITY__TEST:
				setTest(TEST_EDEFAULT);
				return;
			case DataclassesPackage.QUALITY__OPERATOR_BLOCKED:
				setOperatorBlocked(OPERATOR_BLOCKED_EDEFAULT);
				return;
			case DataclassesPackage.QUALITY__VALIDITY:
				setValidity(VALIDITY_EDEFAULT);
				return;
			case DataclassesPackage.QUALITY__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case DataclassesPackage.QUALITY__DETAIL_QUAL:
				setDetailQual((DetailQual)null);
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
			case DataclassesPackage.QUALITY__TEST:
				return test != TEST_EDEFAULT;
			case DataclassesPackage.QUALITY__OPERATOR_BLOCKED:
				return operatorBlocked != OPERATOR_BLOCKED_EDEFAULT;
			case DataclassesPackage.QUALITY__VALIDITY:
				return validity != VALIDITY_EDEFAULT;
			case DataclassesPackage.QUALITY__SOURCE:
				return source != SOURCE_EDEFAULT;
			case DataclassesPackage.QUALITY__DETAIL_QUAL:
				return detailQual != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (test: ");
		result.append(test);
		result.append(", operatorBlocked: ");
		result.append(operatorBlocked);
		result.append(", validity: ");
		result.append(validity);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //QualityImpl
