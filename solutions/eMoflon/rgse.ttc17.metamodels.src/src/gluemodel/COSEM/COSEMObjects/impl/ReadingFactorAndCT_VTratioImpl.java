/**
 */
package gluemodel.COSEM.COSEMObjects.impl;

import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;
import gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio;

import gluemodel.COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reading Factor And CT VTratio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl#getReadingfactorforpower <em>Readingfactorforpower</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl#getReadingfactorforenergy <em>Readingfactorforenergy</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl#getTransformerratio_currentzaehler <em>Transformerratio currentzaehler</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl#getTransformerratio_voltagezaehler <em>Transformerratio voltagezaehler</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl#getOveralltransformerratiozaehler <em>Overalltransformerratiozaehler</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl#getTransformerratio_currentnenner <em>Transformerratio currentnenner</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl#getTransformerratio_voltagenenner <em>Transformerratio voltagenenner</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl#getOveralltransformer_rationenner <em>Overalltransformer rationenner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingFactorAndCT_VTratioImpl extends DataImpl implements ReadingFactorAndCT_VTratio {
	/**
	 * The default value of the '{@link #getReadingfactorforpower() <em>Readingfactorforpower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingfactorforpower()
	 * @generated
	 * @ordered
	 */
	protected static final double READINGFACTORFORPOWER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReadingfactorforpower() <em>Readingfactorforpower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingfactorforpower()
	 * @generated
	 * @ordered
	 */
	protected double readingfactorforpower = READINGFACTORFORPOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadingfactorforenergy() <em>Readingfactorforenergy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingfactorforenergy()
	 * @generated
	 * @ordered
	 */
	protected static final double READINGFACTORFORENERGY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReadingfactorforenergy() <em>Readingfactorforenergy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingfactorforenergy()
	 * @generated
	 * @ordered
	 */
	protected double readingfactorforenergy = READINGFACTORFORENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformerratio_currentzaehler() <em>Transformerratio currentzaehler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerratio_currentzaehler()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSFORMERRATIO_CURRENTZAEHLER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransformerratio_currentzaehler() <em>Transformerratio currentzaehler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerratio_currentzaehler()
	 * @generated
	 * @ordered
	 */
	protected int transformerratio_currentzaehler = TRANSFORMERRATIO_CURRENTZAEHLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformerratio_voltagezaehler() <em>Transformerratio voltagezaehler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerratio_voltagezaehler()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSFORMERRATIO_VOLTAGEZAEHLER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransformerratio_voltagezaehler() <em>Transformerratio voltagezaehler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerratio_voltagezaehler()
	 * @generated
	 * @ordered
	 */
	protected int transformerratio_voltagezaehler = TRANSFORMERRATIO_VOLTAGEZAEHLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOveralltransformerratiozaehler() <em>Overalltransformerratiozaehler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOveralltransformerratiozaehler()
	 * @generated
	 * @ordered
	 */
	protected static final int OVERALLTRANSFORMERRATIOZAEHLER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOveralltransformerratiozaehler() <em>Overalltransformerratiozaehler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOveralltransformerratiozaehler()
	 * @generated
	 * @ordered
	 */
	protected int overalltransformerratiozaehler = OVERALLTRANSFORMERRATIOZAEHLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformerratio_currentnenner() <em>Transformerratio currentnenner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerratio_currentnenner()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSFORMERRATIO_CURRENTNENNER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransformerratio_currentnenner() <em>Transformerratio currentnenner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerratio_currentnenner()
	 * @generated
	 * @ordered
	 */
	protected int transformerratio_currentnenner = TRANSFORMERRATIO_CURRENTNENNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformerratio_voltagenenner() <em>Transformerratio voltagenenner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerratio_voltagenenner()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSFORMERRATIO_VOLTAGENENNER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransformerratio_voltagenenner() <em>Transformerratio voltagenenner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerratio_voltagenenner()
	 * @generated
	 * @ordered
	 */
	protected int transformerratio_voltagenenner = TRANSFORMERRATIO_VOLTAGENENNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOveralltransformer_rationenner() <em>Overalltransformer rationenner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOveralltransformer_rationenner()
	 * @generated
	 * @ordered
	 */
	protected static final int OVERALLTRANSFORMER_RATIONENNER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOveralltransformer_rationenner() <em>Overalltransformer rationenner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOveralltransformer_rationenner()
	 * @generated
	 * @ordered
	 */
	protected int overalltransformer_rationenner = OVERALLTRANSFORMER_RATIONENNER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingFactorAndCT_VTratioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getReadingFactorAndCT_VTratio();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReadingfactorforpower() {
		return readingfactorforpower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingfactorforpower(double newReadingfactorforpower) {
		double oldReadingfactorforpower = readingfactorforpower;
		readingfactorforpower = newReadingfactorforpower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORPOWER, oldReadingfactorforpower, readingfactorforpower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReadingfactorforenergy() {
		return readingfactorforenergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingfactorforenergy(double newReadingfactorforenergy) {
		double oldReadingfactorforenergy = readingfactorforenergy;
		readingfactorforenergy = newReadingfactorforenergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORENERGY, oldReadingfactorforenergy, readingfactorforenergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransformerratio_currentzaehler() {
		return transformerratio_currentzaehler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerratio_currentzaehler(int newTransformerratio_currentzaehler) {
		int oldTransformerratio_currentzaehler = transformerratio_currentzaehler;
		transformerratio_currentzaehler = newTransformerratio_currentzaehler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTZAEHLER, oldTransformerratio_currentzaehler, transformerratio_currentzaehler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransformerratio_voltagezaehler() {
		return transformerratio_voltagezaehler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerratio_voltagezaehler(int newTransformerratio_voltagezaehler) {
		int oldTransformerratio_voltagezaehler = transformerratio_voltagezaehler;
		transformerratio_voltagezaehler = newTransformerratio_voltagezaehler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGEZAEHLER, oldTransformerratio_voltagezaehler, transformerratio_voltagezaehler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOveralltransformerratiozaehler() {
		return overalltransformerratiozaehler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOveralltransformerratiozaehler(int newOveralltransformerratiozaehler) {
		int oldOveralltransformerratiozaehler = overalltransformerratiozaehler;
		overalltransformerratiozaehler = newOveralltransformerratiozaehler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMERRATIOZAEHLER, oldOveralltransformerratiozaehler, overalltransformerratiozaehler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransformerratio_currentnenner() {
		return transformerratio_currentnenner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerratio_currentnenner(int newTransformerratio_currentnenner) {
		int oldTransformerratio_currentnenner = transformerratio_currentnenner;
		transformerratio_currentnenner = newTransformerratio_currentnenner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTNENNER, oldTransformerratio_currentnenner, transformerratio_currentnenner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransformerratio_voltagenenner() {
		return transformerratio_voltagenenner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerratio_voltagenenner(int newTransformerratio_voltagenenner) {
		int oldTransformerratio_voltagenenner = transformerratio_voltagenenner;
		transformerratio_voltagenenner = newTransformerratio_voltagenenner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGENENNER, oldTransformerratio_voltagenenner, transformerratio_voltagenenner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOveralltransformer_rationenner() {
		return overalltransformer_rationenner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOveralltransformer_rationenner(int newOveralltransformer_rationenner) {
		int oldOveralltransformer_rationenner = overalltransformer_rationenner;
		overalltransformer_rationenner = newOveralltransformer_rationenner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMER_RATIONENNER, oldOveralltransformer_rationenner, overalltransformer_rationenner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORPOWER:
				return getReadingfactorforpower();
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORENERGY:
				return getReadingfactorforenergy();
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTZAEHLER:
				return getTransformerratio_currentzaehler();
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGEZAEHLER:
				return getTransformerratio_voltagezaehler();
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMERRATIOZAEHLER:
				return getOveralltransformerratiozaehler();
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTNENNER:
				return getTransformerratio_currentnenner();
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGENENNER:
				return getTransformerratio_voltagenenner();
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMER_RATIONENNER:
				return getOveralltransformer_rationenner();
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
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORPOWER:
				setReadingfactorforpower((Double)newValue);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORENERGY:
				setReadingfactorforenergy((Double)newValue);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTZAEHLER:
				setTransformerratio_currentzaehler((Integer)newValue);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGEZAEHLER:
				setTransformerratio_voltagezaehler((Integer)newValue);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMERRATIOZAEHLER:
				setOveralltransformerratiozaehler((Integer)newValue);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTNENNER:
				setTransformerratio_currentnenner((Integer)newValue);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGENENNER:
				setTransformerratio_voltagenenner((Integer)newValue);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMER_RATIONENNER:
				setOveralltransformer_rationenner((Integer)newValue);
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
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORPOWER:
				setReadingfactorforpower(READINGFACTORFORPOWER_EDEFAULT);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORENERGY:
				setReadingfactorforenergy(READINGFACTORFORENERGY_EDEFAULT);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTZAEHLER:
				setTransformerratio_currentzaehler(TRANSFORMERRATIO_CURRENTZAEHLER_EDEFAULT);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGEZAEHLER:
				setTransformerratio_voltagezaehler(TRANSFORMERRATIO_VOLTAGEZAEHLER_EDEFAULT);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMERRATIOZAEHLER:
				setOveralltransformerratiozaehler(OVERALLTRANSFORMERRATIOZAEHLER_EDEFAULT);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTNENNER:
				setTransformerratio_currentnenner(TRANSFORMERRATIO_CURRENTNENNER_EDEFAULT);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGENENNER:
				setTransformerratio_voltagenenner(TRANSFORMERRATIO_VOLTAGENENNER_EDEFAULT);
				return;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMER_RATIONENNER:
				setOveralltransformer_rationenner(OVERALLTRANSFORMER_RATIONENNER_EDEFAULT);
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
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORPOWER:
				return readingfactorforpower != READINGFACTORFORPOWER_EDEFAULT;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORENERGY:
				return readingfactorforenergy != READINGFACTORFORENERGY_EDEFAULT;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTZAEHLER:
				return transformerratio_currentzaehler != TRANSFORMERRATIO_CURRENTZAEHLER_EDEFAULT;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGEZAEHLER:
				return transformerratio_voltagezaehler != TRANSFORMERRATIO_VOLTAGEZAEHLER_EDEFAULT;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMERRATIOZAEHLER:
				return overalltransformerratiozaehler != OVERALLTRANSFORMERRATIOZAEHLER_EDEFAULT;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTNENNER:
				return transformerratio_currentnenner != TRANSFORMERRATIO_CURRENTNENNER_EDEFAULT;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGENENNER:
				return transformerratio_voltagenenner != TRANSFORMERRATIO_VOLTAGENENNER_EDEFAULT;
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMER_RATIONENNER:
				return overalltransformer_rationenner != OVERALLTRANSFORMER_RATIONENNER_EDEFAULT;
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
		result.append(" (Readingfactorforpower: ");
		result.append(readingfactorforpower);
		result.append(", Readingfactorforenergy: ");
		result.append(readingfactorforenergy);
		result.append(", Transformerratio_currentzaehler: ");
		result.append(transformerratio_currentzaehler);
		result.append(", Transformerratio_voltagezaehler: ");
		result.append(transformerratio_voltagezaehler);
		result.append(", Overalltransformerratiozaehler: ");
		result.append(overalltransformerratiozaehler);
		result.append(", Transformerratio_currentnenner: ");
		result.append(transformerratio_currentnenner);
		result.append(", Transformerratio_voltagenenner: ");
		result.append(transformerratio_voltagenenner);
		result.append(", Overalltransformer_rationenner: ");
		result.append(overalltransformer_rationenner);
		result.append(')');
		return result.toString();
	}

} //ReadingFactorAndCT_VTratioImpl
