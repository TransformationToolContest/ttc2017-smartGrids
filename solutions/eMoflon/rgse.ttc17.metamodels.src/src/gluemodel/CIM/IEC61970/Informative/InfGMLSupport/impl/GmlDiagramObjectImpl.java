/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.CoordinateSystem;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlObservation;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSelector;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol;
import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl#getGmlRasterSymbols <em>Gml Raster Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl#getGmlPointSymbols <em>Gml Point Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl#getGmlLineSymbols <em>Gml Line Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl#getCoordinateSystems <em>Coordinate Systems</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl#getGmlObservatins <em>Gml Observatins</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl#getGmlSelectors <em>Gml Selectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlDiagramObjectImpl extends IdentifiedObjectImpl implements GmlDiagramObject {
	/**
	 * The cached value of the '{@link #getGmlRasterSymbols() <em>Gml Raster Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlRasterSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlRasterSymbol> gmlRasterSymbols;

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Diagram> diagrams;

	/**
	 * The cached value of the '{@link #getGmlPointSymbols() <em>Gml Point Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlPointSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlPointSymbol> gmlPointSymbols;

	/**
	 * The cached value of the '{@link #getGmlPolygonSymbols() <em>Gml Polygon Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlPolygonSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlPolygonSymbol> gmlPolygonSymbols;

	/**
	 * The cached value of the '{@link #getGmlLineSymbols() <em>Gml Line Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLineSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlLineSymbol> gmlLineSymbols;

	/**
	 * The cached value of the '{@link #getGmlTextSymbols() <em>Gml Text Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlTextSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlTextSymbol> gmlTextSymbols;

	/**
	 * The cached value of the '{@link #getCoordinateSystems() <em>Coordinate Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinateSystem> coordinateSystems;

	/**
	 * The cached value of the '{@link #getGmlObservatins() <em>Gml Observatins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlObservatins()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlObservation> gmlObservatins;

	/**
	 * The cached value of the '{@link #getGmlSelectors() <em>Gml Selectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSelectors()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlSelector> gmlSelectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlDiagramObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_DIAGRAM_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlRasterSymbol> getGmlRasterSymbols() {
		if (gmlRasterSymbols == null) {
			gmlRasterSymbols = new EObjectWithInverseResolvingEList<GmlRasterSymbol>(GmlRasterSymbol.class, this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS, InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT);
		}
		return gmlRasterSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new EObjectWithInverseResolvingEList.ManyInverse<Diagram>(Diagram.class, this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS, InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS);
		}
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlPointSymbol> getGmlPointSymbols() {
		if (gmlPointSymbols == null) {
			gmlPointSymbols = new EObjectWithInverseResolvingEList<GmlPointSymbol>(GmlPointSymbol.class, this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS, InfGMLSupportPackage.GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT);
		}
		return gmlPointSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlPolygonSymbol> getGmlPolygonSymbols() {
		if (gmlPolygonSymbols == null) {
			gmlPolygonSymbols = new EObjectWithInverseResolvingEList<GmlPolygonSymbol>(GmlPolygonSymbol.class, this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS, InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT);
		}
		return gmlPolygonSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlLineSymbol> getGmlLineSymbols() {
		if (gmlLineSymbols == null) {
			gmlLineSymbols = new EObjectWithInverseResolvingEList<GmlLineSymbol>(GmlLineSymbol.class, this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS, InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT);
		}
		return gmlLineSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlTextSymbol> getGmlTextSymbols() {
		if (gmlTextSymbols == null) {
			gmlTextSymbols = new EObjectWithInverseResolvingEList<GmlTextSymbol>(GmlTextSymbol.class, this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS, InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT);
		}
		return gmlTextSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinateSystem> getCoordinateSystems() {
		if (coordinateSystems == null) {
			coordinateSystems = new EObjectWithInverseResolvingEList.ManyInverse<CoordinateSystem>(CoordinateSystem.class, this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS, CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS);
		}
		return coordinateSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlObservation> getGmlObservatins() {
		if (gmlObservatins == null) {
			gmlObservatins = new EObjectWithInverseResolvingEList.ManyInverse<GmlObservation>(GmlObservation.class, this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS, InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS);
		}
		return gmlObservatins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlSelector> getGmlSelectors() {
		if (gmlSelectors == null) {
			gmlSelectors = new EObjectWithInverseResolvingEList.ManyInverse<GmlSelector>(GmlSelector.class, this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS, InfGMLSupportPackage.GML_SELECTOR__GML_DIAGRAM_OBJECTS);
		}
		return gmlSelectors;
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlRasterSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagrams()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPointSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPolygonSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlLineSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTextSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoordinateSystems()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlObservatins()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSelectors()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				return ((InternalEList<?>)getGmlRasterSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				return ((InternalEList<?>)getGmlPointSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				return ((InternalEList<?>)getGmlPolygonSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				return ((InternalEList<?>)getGmlLineSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				return ((InternalEList<?>)getGmlTextSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				return ((InternalEList<?>)getCoordinateSystems()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				return ((InternalEList<?>)getGmlObservatins()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				return ((InternalEList<?>)getGmlSelectors()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				return getGmlRasterSymbols();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				return getDiagrams();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				return getGmlPointSymbols();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				return getGmlPolygonSymbols();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				return getGmlLineSymbols();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				return getGmlTextSymbols();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				return getCoordinateSystems();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				return getGmlObservatins();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				return getGmlSelectors();
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				getGmlRasterSymbols().clear();
				getGmlRasterSymbols().addAll((Collection<? extends GmlRasterSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends Diagram>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				getGmlPointSymbols().clear();
				getGmlPointSymbols().addAll((Collection<? extends GmlPointSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				getGmlPolygonSymbols().addAll((Collection<? extends GmlPolygonSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				getGmlLineSymbols().clear();
				getGmlLineSymbols().addAll((Collection<? extends GmlLineSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				getGmlTextSymbols().addAll((Collection<? extends GmlTextSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				getCoordinateSystems().clear();
				getCoordinateSystems().addAll((Collection<? extends CoordinateSystem>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				getGmlObservatins().clear();
				getGmlObservatins().addAll((Collection<? extends GmlObservation>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				getGmlSelectors().clear();
				getGmlSelectors().addAll((Collection<? extends GmlSelector>)newValue);
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				getGmlRasterSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				getDiagrams().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				getGmlPointSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				getGmlLineSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				getCoordinateSystems().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				getGmlObservatins().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				getGmlSelectors().clear();
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				return gmlRasterSymbols != null && !gmlRasterSymbols.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				return gmlPointSymbols != null && !gmlPointSymbols.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				return gmlPolygonSymbols != null && !gmlPolygonSymbols.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				return gmlLineSymbols != null && !gmlLineSymbols.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				return gmlTextSymbols != null && !gmlTextSymbols.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				return coordinateSystems != null && !coordinateSystems.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				return gmlObservatins != null && !gmlObservatins.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				return gmlSelectors != null && !gmlSelectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GmlDiagramObjectImpl
