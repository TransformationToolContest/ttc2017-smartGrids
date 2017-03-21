/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;
import CIM.IEC61970.Informative.InfGMLSupport.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.MapImpl#getMapLocGrid <em>Map Loc Grid</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.MapImpl#getPageNumber <em>Page Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends DiagramImpl implements Map {
	/**
	 * The default value of the '{@link #getMapLocGrid() <em>Map Loc Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLocGrid()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_LOC_GRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapLocGrid() <em>Map Loc Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLocGrid()
	 * @generated
	 * @ordered
	 */
	protected String mapLocGrid = MAP_LOC_GRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageNumber() <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPageNumber() <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNumber()
	 * @generated
	 * @ordered
	 */
	protected int pageNumber = PAGE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapLocGrid() {
		return mapLocGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapLocGrid(String newMapLocGrid) {
		String oldMapLocGrid = mapLocGrid;
		mapLocGrid = newMapLocGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.MAP__MAP_LOC_GRID, oldMapLocGrid, mapLocGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageNumber(int newPageNumber) {
		int oldPageNumber = pageNumber;
		pageNumber = newPageNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.MAP__PAGE_NUMBER, oldPageNumber, pageNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfGMLSupportPackage.MAP__MAP_LOC_GRID:
				return getMapLocGrid();
			case InfGMLSupportPackage.MAP__PAGE_NUMBER:
				return getPageNumber();
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
			case InfGMLSupportPackage.MAP__MAP_LOC_GRID:
				setMapLocGrid((String)newValue);
				return;
			case InfGMLSupportPackage.MAP__PAGE_NUMBER:
				setPageNumber((Integer)newValue);
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
			case InfGMLSupportPackage.MAP__MAP_LOC_GRID:
				setMapLocGrid(MAP_LOC_GRID_EDEFAULT);
				return;
			case InfGMLSupportPackage.MAP__PAGE_NUMBER:
				setPageNumber(PAGE_NUMBER_EDEFAULT);
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
			case InfGMLSupportPackage.MAP__MAP_LOC_GRID:
				return MAP_LOC_GRID_EDEFAULT == null ? mapLocGrid != null : !MAP_LOC_GRID_EDEFAULT.equals(mapLocGrid);
			case InfGMLSupportPackage.MAP__PAGE_NUMBER:
				return pageNumber != PAGE_NUMBER_EDEFAULT;
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
		result.append(" (mapLocGrid: ");
		result.append(mapLocGrid);
		result.append(", pageNumber: ");
		result.append(pageNumber);
		result.append(')');
		return result.toString();
	}

} //MapImpl
