/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfGMLSupportFactoryImpl extends EFactoryImpl implements InfGMLSupportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfGMLSupportFactory init() {
		try {
			InfGMLSupportFactory theInfGMLSupportFactory = (InfGMLSupportFactory)EPackage.Registry.INSTANCE.getEFactory(InfGMLSupportPackage.eNS_URI);
			if (theInfGMLSupportFactory != null) {
				return theInfGMLSupportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfGMLSupportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfGMLSupportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfGMLSupportPackage.GML_SELECTOR: return createGmlSelector();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT: return createGmlLabelPlacement();
			case InfGMLSupportPackage.GML_POLYGON_GEOMETRY: return createGmlPolygonGeometry();
			case InfGMLSupportPackage.GML_COLOUR: return createGmlColour();
			case InfGMLSupportPackage.GML_FEATURE_STYLE: return createGmlFeatureStyle();
			case InfGMLSupportPackage.GML_LINE_GEOMETRY: return createGmlLineGeometry();
			case InfGMLSupportPackage.GML_FONT: return createGmlFont();
			case InfGMLSupportPackage.GML_POINT_GEOMETRY: return createGmlPointGeometry();
			case InfGMLSupportPackage.GML_FILL: return createGmlFill();
			case InfGMLSupportPackage.GML_STROKE: return createGmlStroke();
			case InfGMLSupportPackage.DIAGRAM: return createDiagram();
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE: return createGmlTopologyStyle();
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL: return createGmlPolygonSymbol();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL: return createGmlRasterSymbol();
			case InfGMLSupportPackage.GML_VALUE: return createGmlValue();
			case InfGMLSupportPackage.MAP: return createMap();
			case InfGMLSupportPackage.GML_GRAPHIC: return createGmlGraphic();
			case InfGMLSupportPackage.GML_SVG_PARAMETER: return createGmlSvgParameter();
			case InfGMLSupportPackage.GML_BASE_SYMBOL: return createGmlBaseSymbol();
			case InfGMLSupportPackage.GML_POINT_SYMBOL: return createGmlPointSymbol();
			case InfGMLSupportPackage.GML_SYMBOL: return createGmlSymbol();
			case InfGMLSupportPackage.GML_MARK: return createGmlMark();
			case InfGMLSupportPackage.GML_POSITION: return createGmlPosition();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE: return createGmlGeometryStyle();
			case InfGMLSupportPackage.GML_OBSERVATION: return createGmlObservation();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL: return createGmlTextSymbol();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT: return createGmlDiagramObject();
			case InfGMLSupportPackage.GML_HALO: return createGmlHalo();
			case InfGMLSupportPackage.GML_LABEL_STYLE: return createGmlLabelStyle();
			case InfGMLSupportPackage.GML_FEATURE_TYPE: return createGmlFeatureType();
			case InfGMLSupportPackage.GML_LINE_SYMBOL: return createGmlLineSymbol();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfGMLSupportPackage.DIAGRAM_KIND:
				return createDiagramKindFromString(eDataType, initialValue);
			case InfGMLSupportPackage.QUERY_GRAMMAR_KIND:
				return createQueryGrammarKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfGMLSupportPackage.DIAGRAM_KIND:
				return convertDiagramKindToString(eDataType, instanceValue);
			case InfGMLSupportPackage.QUERY_GRAMMAR_KIND:
				return convertQueryGrammarKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlSelector createGmlSelector() {
		GmlSelectorImpl gmlSelector = new GmlSelectorImpl();
		return gmlSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelPlacement createGmlLabelPlacement() {
		GmlLabelPlacementImpl gmlLabelPlacement = new GmlLabelPlacementImpl();
		return gmlLabelPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPolygonGeometry createGmlPolygonGeometry() {
		GmlPolygonGeometryImpl gmlPolygonGeometry = new GmlPolygonGeometryImpl();
		return gmlPolygonGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlColour createGmlColour() {
		GmlColourImpl gmlColour = new GmlColourImpl();
		return gmlColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFeatureStyle createGmlFeatureStyle() {
		GmlFeatureStyleImpl gmlFeatureStyle = new GmlFeatureStyleImpl();
		return gmlFeatureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLineGeometry createGmlLineGeometry() {
		GmlLineGeometryImpl gmlLineGeometry = new GmlLineGeometryImpl();
		return gmlLineGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFont createGmlFont() {
		GmlFontImpl gmlFont = new GmlFontImpl();
		return gmlFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPointGeometry createGmlPointGeometry() {
		GmlPointGeometryImpl gmlPointGeometry = new GmlPointGeometryImpl();
		return gmlPointGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFill createGmlFill() {
		GmlFillImpl gmlFill = new GmlFillImpl();
		return gmlFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlStroke createGmlStroke() {
		GmlStrokeImpl gmlStroke = new GmlStrokeImpl();
		return gmlStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlTopologyStyle createGmlTopologyStyle() {
		GmlTopologyStyleImpl gmlTopologyStyle = new GmlTopologyStyleImpl();
		return gmlTopologyStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPolygonSymbol createGmlPolygonSymbol() {
		GmlPolygonSymbolImpl gmlPolygonSymbol = new GmlPolygonSymbolImpl();
		return gmlPolygonSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlRasterSymbol createGmlRasterSymbol() {
		GmlRasterSymbolImpl gmlRasterSymbol = new GmlRasterSymbolImpl();
		return gmlRasterSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlValue createGmlValue() {
		GmlValueImpl gmlValue = new GmlValueImpl();
		return gmlValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlGraphic createGmlGraphic() {
		GmlGraphicImpl gmlGraphic = new GmlGraphicImpl();
		return gmlGraphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlSvgParameter createGmlSvgParameter() {
		GmlSvgParameterImpl gmlSvgParameter = new GmlSvgParameterImpl();
		return gmlSvgParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlBaseSymbol createGmlBaseSymbol() {
		GmlBaseSymbolImpl gmlBaseSymbol = new GmlBaseSymbolImpl();
		return gmlBaseSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPointSymbol createGmlPointSymbol() {
		GmlPointSymbolImpl gmlPointSymbol = new GmlPointSymbolImpl();
		return gmlPointSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlSymbol createGmlSymbol() {
		GmlSymbolImpl gmlSymbol = new GmlSymbolImpl();
		return gmlSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlMark createGmlMark() {
		GmlMarkImpl gmlMark = new GmlMarkImpl();
		return gmlMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPosition createGmlPosition() {
		GmlPositionImpl gmlPosition = new GmlPositionImpl();
		return gmlPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlGeometryStyle createGmlGeometryStyle() {
		GmlGeometryStyleImpl gmlGeometryStyle = new GmlGeometryStyleImpl();
		return gmlGeometryStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlObservation createGmlObservation() {
		GmlObservationImpl gmlObservation = new GmlObservationImpl();
		return gmlObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlTextSymbol createGmlTextSymbol() {
		GmlTextSymbolImpl gmlTextSymbol = new GmlTextSymbolImpl();
		return gmlTextSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlDiagramObject createGmlDiagramObject() {
		GmlDiagramObjectImpl gmlDiagramObject = new GmlDiagramObjectImpl();
		return gmlDiagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlHalo createGmlHalo() {
		GmlHaloImpl gmlHalo = new GmlHaloImpl();
		return gmlHalo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelStyle createGmlLabelStyle() {
		GmlLabelStyleImpl gmlLabelStyle = new GmlLabelStyleImpl();
		return gmlLabelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFeatureType createGmlFeatureType() {
		GmlFeatureTypeImpl gmlFeatureType = new GmlFeatureTypeImpl();
		return gmlFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLineSymbol createGmlLineSymbol() {
		GmlLineSymbolImpl gmlLineSymbol = new GmlLineSymbolImpl();
		return gmlLineSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramKind createDiagramKindFromString(EDataType eDataType, String initialValue) {
		DiagramKind result = DiagramKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagramKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryGrammarKind createQueryGrammarKindFromString(EDataType eDataType, String initialValue) {
		QueryGrammarKind result = QueryGrammarKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryGrammarKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfGMLSupportPackage getInfGMLSupportPackage() {
		return (InfGMLSupportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfGMLSupportPackage getPackage() {
		return InfGMLSupportPackage.eINSTANCE;
	}

} //InfGMLSupportFactoryImpl
