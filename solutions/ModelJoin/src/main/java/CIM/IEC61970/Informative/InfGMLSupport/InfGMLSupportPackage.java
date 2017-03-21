/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;

import CIM.CIMPackage;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61970.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The package contains portions of the model defined by graphic standards such as those proposed by OpenGIS Consortium referred to as the Geography Markup Language (GML). It facilitates integration among electric utility applications (CIM) and Geographical Information Systems (GIS) and other applications. Rather than inventing new CIM classes that accomplish similar functionality as in existing GML, the preferred approach is to use and extend \"Gml\" classes as appropriate. Note that care has been taken to separate the geometry of features from how features can be graphically represented.\nGML supports the concept of a geographic feature, which is \"an abstraction of a real world phenomenon; it is a geographic feature if it is associated with a location relative to the Earth\". So a digital representation of the real world can be thought of as a set of features. The state of a feature is defined by a set of properties, where each property can be thought of as a {name, type, value} triple.\nThe number of properties a feature may have, together with their names and types, are determined by its type definition. Geographic features with geometry are those with properties that may be geometry-valued.\n\nTODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"A Geographic Feature is \'an abstraction of a real world phenomenon; it is a geographic feature if it can is asociated with a location relative to the Earth. A digital representation of the real world can be thought of as a set of features. He state of a feature is defined by a set of properties, whre each property can be thought of as a (name, type, value) triple.\nThe number of propoerties a feature may have, together with their names and types, are determined by its type definition. Geographic features with geometry are those with properties tht may be geometry-valued.\nGeographic features in GML include coverages and observations as subtypes. A coverage is a type of feature that has a coverage function with a spatial domain and a value  set range of homogeneous 2 to n dimensional tuples. A coverage can represent one feature or a collection of features \"to model and make visible spatial relationships between, and the spatial distribution of, earth phenomena.\"\nA reference system provides a scale of measurement for assigning values to a location, time or other descriptive quantity or quality. A coordinate reference system consists of set of coordinate system axes that are related to the earth through a datum that defines the size and shape of the earth. Geometries in GML indicate the coordinate reference system in which the measurements have ben made. The \'parent\' geometry element of a geometric complex or geometric aggregate makes this indication for its constituent geometries.\"'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The package contains portions of the model defined by graphic standards such as those proposed by OpenGIS Consortium referred to as the Geography Markup Language (GML). It facilitates integration among electric utility applications (CIM) and Geographical Information Systems (GIS) and other applications. Rather than inventing new CIM classes that accomplish similar functionality as in existing GML, the preferred approach is to use and extend \"Gml\" classes as appropriate. Note that care has been taken to separate the geometry of features from how features can be graphically represented.\nGML supports the concept of a geographic feature, which is \"an abstraction of a real world phenomenon; it is a geographic feature if it is associated with a location relative to the Earth\". So a digital representation of the real world can be thought of as a set of features. The state of a feature is defined by a set of properties, where each property can be thought of as a {name, type, value} triple.\nThe number of properties a feature may have, together with their names and types, are determined by its type definition. Geographic features with geometry are those with properties that may be geometry-valued.\n\nTODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"A Geographic Feature is \'an abstraction of a real world phenomenon; it is a geographic feature if it can is asociated with a location relative to the Earth. A digital representation of the real world can be thought of as a set of features. He state of a feature is defined by a set of properties, whre each property can be thought of as a (name, type, value) triple.\nThe number of propoerties a feature may have, together with their names and types, are determined by its type definition. Geographic features with geometry are those with properties tht may be geometry-valued.\nGeographic features in GML include coverages and observations as subtypes. A coverage is a type of feature that has a coverage function with a spatial domain and a value  set range of homogeneous 2 to n dimensional tuples. A coverage can represent one feature or a collection of features \"to model and make visible spatial relationships between, and the spatial distribution of, earth phenomena.\"\nA reference system provides a scale of measurement for assigning values to a location, time or other descriptive quantity or quality. A coordinate reference system consists of set of coordinate system axes that are related to the earth through a datum that defines the size and shape of the earth. Geometries in GML indicate the coordinate reference system in which the measurements have ben made. The \'parent\' geometry element of a geometric complex or geometric aggregate makes this indication for its constituent geometries.\"'"
 * @generated
 */
public interface InfGMLSupportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfGMLSupport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfGMLSupport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfGMLSupport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfGMLSupportPackage eINSTANCE = CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSelectorImpl <em>Gml Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSelectorImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlSelector()
	 * @generated
	 */
	int GML_SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__GML_DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gml Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gml Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SELECTOR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl <em>Gml Label Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlLabelPlacement()
	 * @generated
	 */
	int GML_LABEL_PLACEMENT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__OFFSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anchor Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__ANCHOR_Y = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anchor X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__ANCHOR_X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__ROTATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Displacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__DISPLACEMENT_Y = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__DISPLACEMENT_X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Gml Label Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Gml Label Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_PLACEMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl <em>Gml Diagram Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlDiagramObject()
	 * @generated
	 */
	int GML_DIAGRAM_OBJECT = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__DIAGRAMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Observatins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__GML_OBSERVATINS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gml Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT__GML_SELECTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gml Diagram Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Gml Diagram Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_DIAGRAM_OBJECT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPolygonGeometryImpl <em>Gml Polygon Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPolygonGeometryImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPolygonGeometry()
	 * @generated
	 */
	int GML_POLYGON_GEOMETRY = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__UUID = GML_DIAGRAM_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__MRID = GML_DIAGRAM_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__NAME = GML_DIAGRAM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__DESCRIPTION = GML_DIAGRAM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__PATH_NAME = GML_DIAGRAM_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__MODELING_AUTHORITY_SET = GML_DIAGRAM_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__LOCAL_NAME = GML_DIAGRAM_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__ALIAS_NAME = GML_DIAGRAM_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__GML_RASTER_SYMBOLS = GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__DIAGRAMS = GML_DIAGRAM_OBJECT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__GML_POINT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__GML_POLYGON_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__GML_LINE_SYMBOLS = GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__GML_TEXT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__COORDINATE_SYSTEMS = GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Gml Observatins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__GML_OBSERVATINS = GML_DIAGRAM_OBJECT__GML_OBSERVATINS;

	/**
	 * The feature id for the '<em><b>Gml Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY__GML_SELECTORS = GML_DIAGRAM_OBJECT__GML_SELECTORS;

	/**
	 * The number of structural features of the '<em>Gml Polygon Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY_FEATURE_COUNT = GML_DIAGRAM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gml Polygon Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_GEOMETRY_OPERATION_COUNT = GML_DIAGRAM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl <em>Gml Colour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlColour()
	 * @generated
	 */
	int GML_COLOUR = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__GREEN = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Strokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__GML_STROKES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Fonts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__GML_FONTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__RED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Fills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__GML_FILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR__BLUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gml Colour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Gml Colour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_COLOUR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl <em>Gml Feature Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlFeatureStyle()
	 * @generated
	 */
	int GML_FEATURE_STYLE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Feature Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__FEATURE_CONSTRAINT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__GML_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semantic Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Label Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__GML_LABEL_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__VERSION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Geometry Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__GML_GEOMETRY_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Feature Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__FEATURE_TYPE_NAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Query Grammar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__QUERY_GRAMMAR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Feature Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__FEATURE_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__BASE_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Gml Feature Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__GML_FEATURE_TYPES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Gml Tobology Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Gml Feature Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Gml Feature Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_STYLE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineGeometryImpl <em>Gml Line Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineGeometryImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlLineGeometry()
	 * @generated
	 */
	int GML_LINE_GEOMETRY = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__UUID = GML_DIAGRAM_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__MRID = GML_DIAGRAM_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__NAME = GML_DIAGRAM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__DESCRIPTION = GML_DIAGRAM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__PATH_NAME = GML_DIAGRAM_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__MODELING_AUTHORITY_SET = GML_DIAGRAM_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__LOCAL_NAME = GML_DIAGRAM_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__ALIAS_NAME = GML_DIAGRAM_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__GML_RASTER_SYMBOLS = GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__DIAGRAMS = GML_DIAGRAM_OBJECT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__GML_POINT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__GML_POLYGON_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__GML_LINE_SYMBOLS = GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__GML_TEXT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__COORDINATE_SYSTEMS = GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Gml Observatins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__GML_OBSERVATINS = GML_DIAGRAM_OBJECT__GML_OBSERVATINS;

	/**
	 * The feature id for the '<em><b>Gml Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__GML_SELECTORS = GML_DIAGRAM_OBJECT__GML_SELECTORS;

	/**
	 * The feature id for the '<em><b>Source Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY__SOURCE_SIDE = GML_DIAGRAM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gml Line Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY_FEATURE_COUNT = GML_DIAGRAM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gml Line Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_GEOMETRY_OPERATION_COUNT = GML_DIAGRAM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl <em>Gml Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlFont()
	 * @generated
	 */
	int GML_FONT = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__WEIGHT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__FAMILY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Absolute Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__ABSOLUTE_SIZE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__GML_COLOUR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__SIZE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT__GML_SVG_PARAMETERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Gml Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Gml Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FONT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPointGeometryImpl <em>Gml Point Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPointGeometryImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPointGeometry()
	 * @generated
	 */
	int GML_POINT_GEOMETRY = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__UUID = GML_DIAGRAM_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__MRID = GML_DIAGRAM_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__NAME = GML_DIAGRAM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__DESCRIPTION = GML_DIAGRAM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__PATH_NAME = GML_DIAGRAM_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__MODELING_AUTHORITY_SET = GML_DIAGRAM_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__LOCAL_NAME = GML_DIAGRAM_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__ALIAS_NAME = GML_DIAGRAM_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__GML_RASTER_SYMBOLS = GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__DIAGRAMS = GML_DIAGRAM_OBJECT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__GML_POINT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__GML_POLYGON_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__GML_LINE_SYMBOLS = GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__GML_TEXT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__COORDINATE_SYSTEMS = GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Gml Observatins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__GML_OBSERVATINS = GML_DIAGRAM_OBJECT__GML_OBSERVATINS;

	/**
	 * The feature id for the '<em><b>Gml Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY__GML_SELECTORS = GML_DIAGRAM_OBJECT__GML_SELECTORS;

	/**
	 * The number of structural features of the '<em>Gml Point Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY_FEATURE_COUNT = GML_DIAGRAM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gml Point Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_GEOMETRY_OPERATION_COUNT = GML_DIAGRAM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl <em>Gml Fill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlFill()
	 * @generated
	 */
	int GML_FILL = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__GML_POLYGON_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__GML_SVG_PARAMETERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__OPACITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Marks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__GML_MARKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL__GML_COLOUR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gml Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Gml Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FILL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl <em>Gml Stroke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlStroke()
	 * @generated
	 */
	int GML_STROKE = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__LINE_CAP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__GML_COLOUR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__OPACITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__GML_SVG_PARAMETERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__WIDTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__GML_POLYGON_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__GML_LINE_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__DASH_ARRAY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__LINE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__DASH_OFFSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Gml Marks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__GML_MARKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE__LINEJOIN = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Gml Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Gml Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_STROKE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.DiagramImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__COORDINATE_SYSTEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__GML_DIAGRAM_OBJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DESIGN_LOCATIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTopologyStyleImpl <em>Gml Topology Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTopologyStyleImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlTopologyStyle()
	 * @generated
	 */
	int GML_TOPOLOGY_STYLE = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Lable Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__GML_LABLE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Feature Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gml Topology Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gml Topology Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TOPOLOGY_STYLE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSymbolImpl <em>Gml Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSymbolImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlSymbol()
	 * @generated
	 */
	int GML_SYMBOL = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__LEVEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__GML_FEATURE_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__VERSION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL__GML_BASE_SYMBOL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gml Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Gml Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SYMBOL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPolygonSymbolImpl <em>Gml Polygon Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPolygonSymbolImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPolygonSymbol()
	 * @generated
	 */
	int GML_POLYGON_SYMBOL = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__DESCRIPTION = GML_SYMBOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__PATH_NAME = GML_SYMBOL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__LOCAL_NAME = GML_SYMBOL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Stroke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__GML_STROKE = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Fill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL__GML_FILL = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gml Polygon Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gml Polygon Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POLYGON_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl <em>Gml Raster Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlRasterSymbol()
	 * @generated
	 */
	int GML_RASTER_SYMBOL = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__DESCRIPTION = GML_SYMBOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__PATH_NAME = GML_SYMBOL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__LOCAL_NAME = GML_SYMBOL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Gray Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__GRAY_SOURCENAME = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relief Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__RELIEF_FACTOR = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overlapbehaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__OPACITY = GML_SYMBOL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Green Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__GREEN_SOURCE_NAME = GML_SYMBOL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Brighness Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__BRIGHNESS_ONLY = GML_SYMBOL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Blue Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__BLUE_SOURCENAME = GML_SYMBOL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Red Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL__RED_SOURCENAME = GML_SYMBOL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gml Raster Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Gml Raster Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_RASTER_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlValueImpl <em>Gml Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlValueImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlValue()
	 * @generated
	 */
	int GML_VALUE = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__GML_OBSERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__TIME_PERIOD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Measurement Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE__MEASUREMENT_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Gml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_VALUE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.MapImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__UUID = DIAGRAM__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MRID = DIAGRAM__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__DESCRIPTION = DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__PATH_NAME = DIAGRAM__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MODELING_AUTHORITY_SET = DIAGRAM__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__LOCAL_NAME = DIAGRAM__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ALIAS_NAME = DIAGRAM__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SUBJECT = DIAGRAM__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SCHEDULED_EVENTS = DIAGRAM__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ERP_ORGANISATION_ROLES = DIAGRAM__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CREATED_DATE_TIME = DIAGRAM__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TO_DOCUMENT_ROLES = DIAGRAM__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ASSET_ROLES = DIAGRAM__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ERP_PERSON_ROLES = DIAGRAM__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__REVISION_NUMBER = DIAGRAM__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ELECTRONIC_ADDRESS = DIAGRAM__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__STATUS = DIAGRAM__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NETWORK_DATA_SETS = DIAGRAM__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__POWER_SYSTEM_RESOURCE_ROLES = DIAGRAM__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CATEGORY = DIAGRAM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ACTIVITY_RECORDS = DIAGRAM__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MEASUREMENTS = DIAGRAM__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__FROM_DOCUMENT_ROLES = DIAGRAM__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__LAST_MODIFIED_DATE_TIME = DIAGRAM__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CHANGE_SETS = DIAGRAM__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__DOC_STATUS = DIAGRAM__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CHANGE_ITEMS = DIAGRAM__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SCHEDULE_PARAMETER_INFOS = DIAGRAM__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TITLE = DIAGRAM__TITLE;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__COORDINATE_SYSTEM = DIAGRAM__COORDINATE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__KIND = DIAGRAM__KIND;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__GML_DIAGRAM_OBJECTS = DIAGRAM__GML_DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__DESIGN_LOCATIONS = DIAGRAM__DESIGN_LOCATIONS;

	/**
	 * The feature id for the '<em><b>Map Loc Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAP_LOC_GRID = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__PAGE_NUMBER = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl <em>Gml Graphic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlGraphic()
	 * @generated
	 */
	int GML_GRAPHIC = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__OPACITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__MIN_SIZE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbol ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__SYMBOL_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>XScale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__XSCALE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__SIZE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>YScale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__YSCALE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gml Marks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__GML_MARKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__GML_POINT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC__ROTATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gml Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Gml Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GRAPHIC_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSvgParameterImpl <em>Gml Svg Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSvgParameterImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlSvgParameter()
	 * @generated
	 */
	int GML_SVG_PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Stokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__GML_STOKES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Fills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__GML_FILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Fonts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__GML_FONTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER__ATTRIBUTE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gml Svg Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Gml Svg Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_SVG_PARAMETER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlBaseSymbolImpl <em>Gml Base Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlBaseSymbolImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlBaseSymbol()
	 * @generated
	 */
	int GML_BASE_SYMBOL = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL__GML_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gml Base Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gml Base Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_BASE_SYMBOL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPointSymbolImpl <em>Gml Point Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPointSymbolImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPointSymbol()
	 * @generated
	 */
	int GML_POINT_SYMBOL = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__DESCRIPTION = GML_SYMBOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__PATH_NAME = GML_SYMBOL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__LOCAL_NAME = GML_SYMBOL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Gml Graphic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__GML_GRAPHIC = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gml Point Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gml Point Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POINT_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlMarkImpl <em>Gml Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlMarkImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlMark()
	 * @generated
	 */
	int GML_MARK = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Graphics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__GML_GRAPHICS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml FIlls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__GML_FILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Well Known Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__WELL_KNOWN_NAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Strokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK__GML_STROKES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gml Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Gml Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_MARK_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPositionImpl <em>Gml Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPositionImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPosition()
	 * @generated
	 */
	int GML_POSITION = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION__UUID = CommonPackage.POSITION_POINT__UUID;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION__COORDINATE_SYSTEM = CommonPackage.POSITION_POINT__COORDINATE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION__SEQUENCE_NUMBER = CommonPackage.POSITION_POINT__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION__XPOSITION = CommonPackage.POSITION_POINT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION__YPOSITION = CommonPackage.POSITION_POINT__YPOSITION;

	/**
	 * The feature id for the '<em><b>ZPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION__ZPOSITION = CommonPackage.POSITION_POINT__ZPOSITION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION__LOCATION = CommonPackage.POSITION_POINT__LOCATION;

	/**
	 * The number of structural features of the '<em>Gml Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION_FEATURE_COUNT = CommonPackage.POSITION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gml Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION_OPERATION_COUNT = CommonPackage.POSITION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGeometryStyleImpl <em>Gml Geometry Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGeometryStyleImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlGeometryStyle()
	 * @generated
	 */
	int GML_GEOMETRY_STYLE = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__GML_LABEL_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Feature Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__GML_FEATURE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geometry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__GEOMETRY_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__SYMBOL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Geometry Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gml Geometry Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Gml Geometry Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_GEOMETRY_STYLE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl <em>Gml Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlObservation()
	 * @generated
	 */
	int GML_OBSERVATION = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION__GML_DIAGRAM_OBJECTS = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION__TARGET = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION__DATE_TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION__CHANGE_ITEMS = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION__RESULT_OF = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION__USING = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION__GML_VALUES = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Gml Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Gml Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBSERVATION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl <em>Gml Text Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlTextSymbol()
	 * @generated
	 */
	int GML_TEXT_SYMBOL = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__DESCRIPTION = GML_SYMBOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__PATH_NAME = GML_SYMBOL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__LOCAL_NAME = GML_SYMBOL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Gml Halo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__GML_HALO = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Font</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__GML_FONT = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Fill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__GML_FILL = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__PROPERTY = GML_SYMBOL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__LABEL = GML_SYMBOL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__MIN_FONT_SIZE = GML_SYMBOL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__FIELD_ID = GML_SYMBOL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gml Label Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT = GML_SYMBOL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL__LABEL_TYPE = GML_SYMBOL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Gml Text Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Gml Text Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_TEXT_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlHaloImpl <em>Gml Halo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlHaloImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlHalo()
	 * @generated
	 */
	int GML_HALO = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__OPACITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO__RADIUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gml Halo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gml Halo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_HALO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl <em>Gml Label Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlLabelStyle()
	 * @generated
	 */
	int GML_LABEL_STYLE = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Feature Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__GML_FEATURE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__TRANSFORM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__LABEL_EXPRESSION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Geometry Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__GML_GEOMETRY_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Topology Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE__GML_TOPOLOGY_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gml Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Gml Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LABEL_STYLE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureTypeImpl <em>Gml Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureTypeImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlFeatureType()
	 * @generated
	 */
	int GML_FEATURE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE__GML_FEATURE_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gml Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gml Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_FEATURE_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineSymbolImpl <em>Gml Line Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineSymbolImpl
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlLineSymbol()
	 * @generated
	 */
	int GML_LINE_SYMBOL = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__DESCRIPTION = GML_SYMBOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__PATH_NAME = GML_SYMBOL__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__LOCAL_NAME = GML_SYMBOL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Stroke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__GML_STROKE = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL__SOURCE_SIDE = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gml Line Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gml Line Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_LINE_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.DiagramKind <em>Diagram Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.DiagramKind
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getDiagramKind()
	 * @generated
	 */
	int DIAGRAM_KIND = 31;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind <em>Query Grammar Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
	 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getQueryGrammarKind()
	 * @generated
	 */
	int QUERY_GRAMMAR_KIND = 32;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSelector <em>Gml Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Selector</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSelector
	 * @generated
	 */
	EClass getGmlSelector();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Diagram Objects</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getGmlDiagramObjects()
	 * @see #getGmlSelector()
	 * @generated
	 */
	EReference getGmlSelector_GmlDiagramObjects();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getChangeItems()
	 * @see #getGmlSelector()
	 * @generated
	 */
	EReference getGmlSelector_ChangeItems();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement <em>Gml Label Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Label Placement</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement
	 * @generated
	 */
	EClass getGmlLabelPlacement();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	EAttribute getGmlLabelPlacement_Type();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	EAttribute getGmlLabelPlacement_Offset();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY <em>Anchor Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Y</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	EAttribute getGmlLabelPlacement_AnchorY();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX <em>Anchor X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor X</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	EAttribute getGmlLabelPlacement_AnchorX();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	EAttribute getGmlLabelPlacement_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY <em>Displacement Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displacement Y</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	EAttribute getGmlLabelPlacement_DisplacementY();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX <em>Displacement X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displacement X</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	EAttribute getGmlLabelPlacement_DisplacementX();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	EReference getGmlLabelPlacement_GmlTextSymbols();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry <em>Gml Polygon Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Polygon Geometry</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry
	 * @generated
	 */
	EClass getGmlPolygonGeometry();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Colour</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlColour
	 * @generated
	 */
	EClass getGmlColour();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen()
	 * @see #getGmlColour()
	 * @generated
	 */
	EAttribute getGmlColour_Green();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes <em>Gml Strokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Strokes</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes()
	 * @see #getGmlColour()
	 * @generated
	 */
	EReference getGmlColour_GmlStrokes();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts <em>Gml Fonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Fonts</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts()
	 * @see #getGmlColour()
	 * @generated
	 */
	EReference getGmlColour_GmlFonts();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getRed()
	 * @see #getGmlColour()
	 * @generated
	 */
	EAttribute getGmlColour_Red();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills <em>Gml Fills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Fills</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills()
	 * @see #getGmlColour()
	 * @generated
	 */
	EReference getGmlColour_GmlFills();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue()
	 * @see #getGmlColour()
	 * @generated
	 */
	EAttribute getGmlColour_Blue();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Feature Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle
	 * @generated
	 */
	EClass getGmlFeatureStyle();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint <em>Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Constraint</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EAttribute getGmlFeatureStyle_FeatureConstraint();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlSymbols <em>Gml Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlSymbols()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EReference getGmlFeatureStyle_GmlSymbols();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier <em>Semantic Type Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Type Identifier</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EAttribute getGmlFeatureStyle_SemanticTypeIdentifier();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles <em>Gml Label Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Label Styles</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EReference getGmlFeatureStyle_GmlLabelStyles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EAttribute getGmlFeatureStyle_Version();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Geometry Styles</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EReference getGmlFeatureStyle_GmlGeometryStyles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName <em>Feature Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Type Name</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EAttribute getGmlFeatureStyle_FeatureTypeName();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar <em>Query Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Grammar</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EAttribute getGmlFeatureStyle_QueryGrammar();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Type</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EAttribute getGmlFeatureStyle_FeatureType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EAttribute getGmlFeatureStyle_BaseType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes <em>Gml Feature Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Feature Types</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EReference getGmlFeatureStyle_GmlFeatureTypes();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles <em>Gml Tobology Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Tobology Styles</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	EReference getGmlFeatureStyle_GmlTobologyStyles();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineGeometry <em>Gml Line Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Line Geometry</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLineGeometry
	 * @generated
	 */
	EClass getGmlLineGeometry();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide <em>Source Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Side</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide()
	 * @see #getGmlLineGeometry()
	 * @generated
	 */
	EAttribute getGmlLineGeometry_SourceSide();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont <em>Gml Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Font</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont
	 * @generated
	 */
	EClass getGmlFont();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight()
	 * @see #getGmlFont()
	 * @generated
	 */
	EAttribute getGmlFont_Weight();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols()
	 * @see #getGmlFont()
	 * @generated
	 */
	EReference getGmlFont_GmlTextSymbols();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily()
	 * @see #getGmlFont()
	 * @generated
	 */
	EAttribute getGmlFont_Family();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle()
	 * @see #getGmlFont()
	 * @generated
	 */
	EAttribute getGmlFont_Style();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize <em>Absolute Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Size</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize()
	 * @see #getGmlFont()
	 * @generated
	 */
	EAttribute getGmlFont_AbsoluteSize();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Colour</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour()
	 * @see #getGmlFont()
	 * @generated
	 */
	EReference getGmlFont_GmlColour();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getSize()
	 * @see #getGmlFont()
	 * @generated
	 */
	EAttribute getGmlFont_Size();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Svg Parameters</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters()
	 * @see #getGmlFont()
	 * @generated
	 */
	EReference getGmlFont_GmlSvgParameters();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPointGeometry <em>Gml Point Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Point Geometry</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPointGeometry
	 * @generated
	 */
	EClass getGmlPointGeometry();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Fill</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFill
	 * @generated
	 */
	EClass getGmlFill();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Polygon Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols()
	 * @see #getGmlFill()
	 * @generated
	 */
	EReference getGmlFill_GmlPolygonSymbols();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Svg Parameters</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters()
	 * @see #getGmlFill()
	 * @generated
	 */
	EReference getGmlFill_GmlSvgParameters();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity()
	 * @see #getGmlFill()
	 * @generated
	 */
	EAttribute getGmlFill_Opacity();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols()
	 * @see #getGmlFill()
	 * @generated
	 */
	EReference getGmlFill_GmlTextSymbols();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Marks</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks()
	 * @see #getGmlFill()
	 * @generated
	 */
	EReference getGmlFill_GmlMarks();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Colour</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour()
	 * @see #getGmlFill()
	 * @generated
	 */
	EReference getGmlFill_GmlColour();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Stroke</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke
	 * @generated
	 */
	EClass getGmlStroke();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap <em>Line Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Cap</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EAttribute getGmlStroke_LineCap();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Colour</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EReference getGmlStroke_GmlColour();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EAttribute getGmlStroke_Opacity();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Svg Parameters</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EReference getGmlStroke_GmlSvgParameters();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EAttribute getGmlStroke_Width();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Polygon Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EReference getGmlStroke_GmlPolygonSymbols();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols <em>Gml Line Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Line Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EReference getGmlStroke_GmlLineSymbols();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray <em>Dash Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dash Array</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EAttribute getGmlStroke_DashArray();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EAttribute getGmlStroke_LineStyle();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset <em>Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dash Offset</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EAttribute getGmlStroke_DashOffset();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Marks</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EReference getGmlStroke_GmlMarks();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin <em>Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linejoin</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin()
	 * @see #getGmlStroke()
	 * @generated
	 */
	EAttribute getGmlStroke_Linejoin();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinate System</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_CoordinateSystem();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.Diagram#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Diagram#getKind()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Kind();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Diagram Objects</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_GmlDiagramObjects();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_DesignLocations();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle <em>Gml Topology Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Topology Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle
	 * @generated
	 */
	EClass getGmlTopologyStyle();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle <em>Gml Lable Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Lable Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle()
	 * @see #getGmlTopologyStyle()
	 * @generated
	 */
	EReference getGmlTopologyStyle_GmlLableStyle();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Feature Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle()
	 * @see #getGmlTopologyStyle()
	 * @generated
	 */
	EReference getGmlTopologyStyle_GmlFeatureStyle();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol <em>Gml Polygon Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Polygon Symbol</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol
	 * @generated
	 */
	EClass getGmlPolygonSymbol();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject()
	 * @see #getGmlPolygonSymbol()
	 * @generated
	 */
	EReference getGmlPolygonSymbol_GmlDiagramObject();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Stroke</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke()
	 * @see #getGmlPolygonSymbol()
	 * @generated
	 */
	EReference getGmlPolygonSymbol_GmlStroke();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Fill</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill()
	 * @see #getGmlPolygonSymbol()
	 * @generated
	 */
	EReference getGmlPolygonSymbol_GmlFill();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol <em>Gml Raster Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Raster Symbol</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol
	 * @generated
	 */
	EClass getGmlRasterSymbol();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename <em>Gray Sourcename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gray Sourcename</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	EAttribute getGmlRasterSymbol_GraySourcename();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor <em>Relief Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relief Factor</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	EAttribute getGmlRasterSymbol_ReliefFactor();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour <em>Overlapbehaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlapbehaviour</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	EAttribute getGmlRasterSymbol_Overlapbehaviour();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	EAttribute getGmlRasterSymbol_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName <em>Green Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green Source Name</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	EAttribute getGmlRasterSymbol_GreenSourceName();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly <em>Brighness Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brighness Only</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	EAttribute getGmlRasterSymbol_BrighnessOnly();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename <em>Blue Sourcename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue Sourcename</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	EAttribute getGmlRasterSymbol_BlueSourcename();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	EReference getGmlRasterSymbol_GmlDiagramObject();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename <em>Red Sourcename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red Sourcename</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	EAttribute getGmlRasterSymbol_RedSourcename();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue <em>Gml Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Value</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlValue
	 * @generated
	 */
	EClass getGmlValue();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Observation</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation()
	 * @see #getGmlValue()
	 * @generated
	 */
	EReference getGmlValue_GmlObservation();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime()
	 * @see #getGmlValue()
	 * @generated
	 */
	EAttribute getGmlValue_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getValue()
	 * @see #getGmlValue()
	 * @generated
	 */
	EAttribute getGmlValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Period</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod()
	 * @see #getGmlValue()
	 * @generated
	 */
	EAttribute getGmlValue_TimePeriod();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue()
	 * @see #getGmlValue()
	 * @generated
	 */
	EReference getGmlValue_MeasurementValue();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid <em>Map Loc Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Loc Grid</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_MapLocGrid();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.Map#getPageNumber <em>Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Number</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Map#getPageNumber()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_PageNumber();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic <em>Gml Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Graphic</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic
	 * @generated
	 */
	EClass getGmlGraphic();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getOpacity()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	EAttribute getGmlGraphic_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getMinSize <em>Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Size</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getMinSize()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	EAttribute getGmlGraphic_MinSize();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSymbolID <em>Symbol ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol ID</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSymbolID()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	EAttribute getGmlGraphic_SymbolID();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getXScale <em>XScale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XScale</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getXScale()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	EAttribute getGmlGraphic_XScale();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSize()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	EAttribute getGmlGraphic_Size();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getYScale <em>YScale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YScale</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getYScale()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	EAttribute getGmlGraphic_YScale();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Marks</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlMarks()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	EReference getGmlGraphic_GmlMarks();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlPointSymbols <em>Gml Point Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Point Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlPointSymbols()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	EReference getGmlGraphic_GmlPointSymbols();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getRotation()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	EAttribute getGmlGraphic_Rotation();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter <em>Gml Svg Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Svg Parameter</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter
	 * @generated
	 */
	EClass getGmlSvgParameter();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes <em>Gml Stokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Stokes</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	EReference getGmlSvgParameter_GmlStokes();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills <em>Gml Fills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Fills</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	EReference getGmlSvgParameter_GmlFills();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	EAttribute getGmlSvgParameter_Value();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts <em>Gml Fonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Fonts</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	EReference getGmlSvgParameter_GmlFonts();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	EAttribute getGmlSvgParameter_Attribute();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol <em>Gml Base Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Base Symbol</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol
	 * @generated
	 */
	EClass getGmlBaseSymbol();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol#getGmlSymbols <em>Gml Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol#getGmlSymbols()
	 * @see #getGmlBaseSymbol()
	 * @generated
	 */
	EReference getGmlBaseSymbol_GmlSymbols();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol <em>Gml Point Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Point Symbol</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol
	 * @generated
	 */
	EClass getGmlPointSymbol();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic <em>Gml Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Graphic</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic()
	 * @see #getGmlPointSymbol()
	 * @generated
	 */
	EReference getGmlPointSymbol_GmlGraphic();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject()
	 * @see #getGmlPointSymbol()
	 * @generated
	 */
	EReference getGmlPointSymbol_GmlDiagramObject();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol <em>Gml Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Symbol</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol
	 * @generated
	 */
	EClass getGmlSymbol();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getLevel()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	EAttribute getGmlSymbol_Level();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlFeatureStyles <em>Gml Feature Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Feature Styles</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlFeatureStyles()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	EReference getGmlSymbol_GmlFeatureStyles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getType()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	EAttribute getGmlSymbol_Type();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getVersion()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	EAttribute getGmlSymbol_Version();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlBaseSymbol <em>Gml Base Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Base Symbol</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlBaseSymbol()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	EReference getGmlSymbol_GmlBaseSymbol();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlMark <em>Gml Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Mark</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlMark
	 * @generated
	 */
	EClass getGmlMark();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlGraphics <em>Gml Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Graphics</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlGraphics()
	 * @see #getGmlMark()
	 * @generated
	 */
	EReference getGmlMark_GmlGraphics();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls <em>Gml FIlls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml FIlls</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls()
	 * @see #getGmlMark()
	 * @generated
	 */
	EReference getGmlMark_GmlFIlls();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName <em>Well Known Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Well Known Name</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName()
	 * @see #getGmlMark()
	 * @generated
	 */
	EAttribute getGmlMark_WellKnownName();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes <em>Gml Strokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Strokes</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes()
	 * @see #getGmlMark()
	 * @generated
	 */
	EReference getGmlMark_GmlStrokes();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPosition <em>Gml Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Position</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPosition
	 * @generated
	 */
	EClass getGmlPosition();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle <em>Gml Geometry Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Geometry Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle
	 * @generated
	 */
	EClass getGmlGeometryStyle();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle <em>Gml Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Label Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	EReference getGmlGeometryStyle_GmlLabelStyle();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Feature Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	EReference getGmlGeometryStyle_GmlFeatureStyle();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType <em>Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry Type</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	EAttribute getGmlGeometryStyle_GeometryType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	EAttribute getGmlGeometryStyle_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty <em>Geometry Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry Property</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	EAttribute getGmlGeometryStyle_GeometryProperty();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Observation</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation
	 * @generated
	 */
	EClass getGmlObservation();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Diagram Objects</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects()
	 * @see #getGmlObservation()
	 * @generated
	 */
	EReference getGmlObservation_GmlDiagramObjects();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget()
	 * @see #getGmlObservation()
	 * @generated
	 */
	EAttribute getGmlObservation_Target();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime()
	 * @see #getGmlObservation()
	 * @generated
	 */
	EAttribute getGmlObservation_DateTime();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems()
	 * @see #getGmlObservation()
	 * @generated
	 */
	EReference getGmlObservation_ChangeItems();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf <em>Result Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Of</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf()
	 * @see #getGmlObservation()
	 * @generated
	 */
	EAttribute getGmlObservation_ResultOf();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing()
	 * @see #getGmlObservation()
	 * @generated
	 */
	EAttribute getGmlObservation_Using();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues <em>Gml Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Values</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues()
	 * @see #getGmlObservation()
	 * @generated
	 */
	EReference getGmlObservation_GmlValues();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol <em>Gml Text Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Text Symbol</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol
	 * @generated
	 */
	EClass getGmlTextSymbol();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlHalo <em>Gml Halo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Halo</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlHalo()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EReference getGmlTextSymbol_GmlHalo();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont <em>Gml Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Font</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EReference getGmlTextSymbol_GmlFont();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Fill</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EReference getGmlTextSymbol_GmlFill();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EAttribute getGmlTextSymbol_Property();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EAttribute getGmlTextSymbol_Label();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize <em>Min Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Font Size</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EAttribute getGmlTextSymbol_MinFontSize();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID <em>Field ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field ID</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EAttribute getGmlTextSymbol_FieldID();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EReference getGmlTextSymbol_GmlDiagramObject();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement <em>Gml Label Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Label Placement</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EReference getGmlTextSymbol_GmlLabelPlacement();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Type</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	EAttribute getGmlTextSymbol_LabelType();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Diagram Object</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject
	 * @generated
	 */
	EClass getGmlDiagramObject();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols <em>Gml Raster Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Raster Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	EReference getGmlDiagramObject_GmlRasterSymbols();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diagrams</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	EReference getGmlDiagramObject_Diagrams();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols <em>Gml Point Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Point Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	EReference getGmlDiagramObject_GmlPointSymbols();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Polygon Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	EReference getGmlDiagramObject_GmlPolygonSymbols();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols <em>Gml Line Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Line Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	EReference getGmlDiagramObject_GmlLineSymbols();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	EReference getGmlDiagramObject_GmlTextSymbols();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems <em>Coordinate Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coordinate Systems</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	EReference getGmlDiagramObject_CoordinateSystems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins <em>Gml Observatins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Observatins</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	EReference getGmlDiagramObject_GmlObservatins();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlSelectors <em>Gml Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Selectors</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlSelectors()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	EReference getGmlDiagramObject_GmlSelectors();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlHalo <em>Gml Halo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Halo</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlHalo
	 * @generated
	 */
	EClass getGmlHalo();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlHalo#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlHalo#getGmlTextSymbols()
	 * @see #getGmlHalo()
	 * @generated
	 */
	EReference getGmlHalo_GmlTextSymbols();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlHalo#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlHalo#getOpacity()
	 * @see #getGmlHalo()
	 * @generated
	 */
	EAttribute getGmlHalo_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlHalo#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlHalo#getRadius()
	 * @see #getGmlHalo()
	 * @generated
	 */
	EAttribute getGmlHalo_Radius();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle <em>Gml Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Label Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle
	 * @generated
	 */
	EClass getGmlLabelStyle();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	EAttribute getGmlLabelStyle_Style();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Feature Style</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	EReference getGmlLabelStyle_GmlFeatureStyle();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	EAttribute getGmlLabelStyle_Transform();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	EAttribute getGmlLabelStyle_LabelExpression();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Geometry Styles</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	EReference getGmlLabelStyle_GmlGeometryStyles();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles <em>Gml Topology Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Topology Styles</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	EReference getGmlLabelStyle_GmlTopologyStyles();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType <em>Gml Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Feature Type</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType
	 * @generated
	 */
	EClass getGmlFeatureType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles <em>Gml Feature Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Feature Styles</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles()
	 * @see #getGmlFeatureType()
	 * @generated
	 */
	EReference getGmlFeatureType_GmlFeatureStyles();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol <em>Gml Line Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Line Symbol</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol
	 * @generated
	 */
	EClass getGmlLineSymbol();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject()
	 * @see #getGmlLineSymbol()
	 * @generated
	 */
	EReference getGmlLineSymbol_GmlDiagramObject();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Stroke</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke()
	 * @see #getGmlLineSymbol()
	 * @generated
	 */
	EReference getGmlLineSymbol_GmlStroke();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide <em>Source Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Side</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide()
	 * @see #getGmlLineSymbol()
	 * @generated
	 */
	EAttribute getGmlLineSymbol_SourceSide();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Informative.InfGMLSupport.DiagramKind <em>Diagram Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagram Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.DiagramKind
	 * @generated
	 */
	EEnum getDiagramKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind <em>Query Grammar Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Query Grammar Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
	 * @generated
	 */
	EEnum getQueryGrammarKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfGMLSupportFactory getInfGMLSupportFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSelectorImpl <em>Gml Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSelectorImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlSelector()
		 * @generated
		 */
		EClass GML_SELECTOR = eINSTANCE.getGmlSelector();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_SELECTOR__GML_DIAGRAM_OBJECTS = eINSTANCE.getGmlSelector_GmlDiagramObjects();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_SELECTOR__CHANGE_ITEMS = eINSTANCE.getGmlSelector_ChangeItems();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl <em>Gml Label Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelPlacementImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlLabelPlacement()
		 * @generated
		 */
		EClass GML_LABEL_PLACEMENT = eINSTANCE.getGmlLabelPlacement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_PLACEMENT__TYPE = eINSTANCE.getGmlLabelPlacement_Type();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_PLACEMENT__OFFSET = eINSTANCE.getGmlLabelPlacement_Offset();

		/**
		 * The meta object literal for the '<em><b>Anchor Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_PLACEMENT__ANCHOR_Y = eINSTANCE.getGmlLabelPlacement_AnchorY();

		/**
		 * The meta object literal for the '<em><b>Anchor X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_PLACEMENT__ANCHOR_X = eINSTANCE.getGmlLabelPlacement_AnchorX();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_PLACEMENT__ROTATION = eINSTANCE.getGmlLabelPlacement_Rotation();

		/**
		 * The meta object literal for the '<em><b>Displacement Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_PLACEMENT__DISPLACEMENT_Y = eINSTANCE.getGmlLabelPlacement_DisplacementY();

		/**
		 * The meta object literal for the '<em><b>Displacement X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_PLACEMENT__DISPLACEMENT_X = eINSTANCE.getGmlLabelPlacement_DisplacementX();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS = eINSTANCE.getGmlLabelPlacement_GmlTextSymbols();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPolygonGeometryImpl <em>Gml Polygon Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPolygonGeometryImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPolygonGeometry()
		 * @generated
		 */
		EClass GML_POLYGON_GEOMETRY = eINSTANCE.getGmlPolygonGeometry();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl <em>Gml Colour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlColourImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlColour()
		 * @generated
		 */
		EClass GML_COLOUR = eINSTANCE.getGmlColour();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_COLOUR__GREEN = eINSTANCE.getGmlColour_Green();

		/**
		 * The meta object literal for the '<em><b>Gml Strokes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_COLOUR__GML_STROKES = eINSTANCE.getGmlColour_GmlStrokes();

		/**
		 * The meta object literal for the '<em><b>Gml Fonts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_COLOUR__GML_FONTS = eINSTANCE.getGmlColour_GmlFonts();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_COLOUR__RED = eINSTANCE.getGmlColour_Red();

		/**
		 * The meta object literal for the '<em><b>Gml Fills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_COLOUR__GML_FILLS = eINSTANCE.getGmlColour_GmlFills();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_COLOUR__BLUE = eINSTANCE.getGmlColour_Blue();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl <em>Gml Feature Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlFeatureStyle()
		 * @generated
		 */
		EClass GML_FEATURE_STYLE = eINSTANCE.getGmlFeatureStyle();

		/**
		 * The meta object literal for the '<em><b>Feature Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FEATURE_STYLE__FEATURE_CONSTRAINT = eINSTANCE.getGmlFeatureStyle_FeatureConstraint();

		/**
		 * The meta object literal for the '<em><b>Gml Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FEATURE_STYLE__GML_SYMBOLS = eINSTANCE.getGmlFeatureStyle_GmlSymbols();

		/**
		 * The meta object literal for the '<em><b>Semantic Type Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER = eINSTANCE.getGmlFeatureStyle_SemanticTypeIdentifier();

		/**
		 * The meta object literal for the '<em><b>Gml Label Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FEATURE_STYLE__GML_LABEL_STYLES = eINSTANCE.getGmlFeatureStyle_GmlLabelStyles();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FEATURE_STYLE__VERSION = eINSTANCE.getGmlFeatureStyle_Version();

		/**
		 * The meta object literal for the '<em><b>Gml Geometry Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FEATURE_STYLE__GML_GEOMETRY_STYLES = eINSTANCE.getGmlFeatureStyle_GmlGeometryStyles();

		/**
		 * The meta object literal for the '<em><b>Feature Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FEATURE_STYLE__FEATURE_TYPE_NAME = eINSTANCE.getGmlFeatureStyle_FeatureTypeName();

		/**
		 * The meta object literal for the '<em><b>Query Grammar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FEATURE_STYLE__QUERY_GRAMMAR = eINSTANCE.getGmlFeatureStyle_QueryGrammar();

		/**
		 * The meta object literal for the '<em><b>Feature Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FEATURE_STYLE__FEATURE_TYPE = eINSTANCE.getGmlFeatureStyle_FeatureType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FEATURE_STYLE__BASE_TYPE = eINSTANCE.getGmlFeatureStyle_BaseType();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FEATURE_STYLE__GML_FEATURE_TYPES = eINSTANCE.getGmlFeatureStyle_GmlFeatureTypes();

		/**
		 * The meta object literal for the '<em><b>Gml Tobology Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES = eINSTANCE.getGmlFeatureStyle_GmlTobologyStyles();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineGeometryImpl <em>Gml Line Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineGeometryImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlLineGeometry()
		 * @generated
		 */
		EClass GML_LINE_GEOMETRY = eINSTANCE.getGmlLineGeometry();

		/**
		 * The meta object literal for the '<em><b>Source Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LINE_GEOMETRY__SOURCE_SIDE = eINSTANCE.getGmlLineGeometry_SourceSide();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl <em>Gml Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFontImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlFont()
		 * @generated
		 */
		EClass GML_FONT = eINSTANCE.getGmlFont();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FONT__WEIGHT = eINSTANCE.getGmlFont_Weight();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FONT__GML_TEXT_SYMBOLS = eINSTANCE.getGmlFont_GmlTextSymbols();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FONT__FAMILY = eINSTANCE.getGmlFont_Family();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FONT__STYLE = eINSTANCE.getGmlFont_Style();

		/**
		 * The meta object literal for the '<em><b>Absolute Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FONT__ABSOLUTE_SIZE = eINSTANCE.getGmlFont_AbsoluteSize();

		/**
		 * The meta object literal for the '<em><b>Gml Colour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FONT__GML_COLOUR = eINSTANCE.getGmlFont_GmlColour();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FONT__SIZE = eINSTANCE.getGmlFont_Size();

		/**
		 * The meta object literal for the '<em><b>Gml Svg Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FONT__GML_SVG_PARAMETERS = eINSTANCE.getGmlFont_GmlSvgParameters();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPointGeometryImpl <em>Gml Point Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPointGeometryImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPointGeometry()
		 * @generated
		 */
		EClass GML_POINT_GEOMETRY = eINSTANCE.getGmlPointGeometry();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl <em>Gml Fill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFillImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlFill()
		 * @generated
		 */
		EClass GML_FILL = eINSTANCE.getGmlFill();

		/**
		 * The meta object literal for the '<em><b>Gml Polygon Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FILL__GML_POLYGON_SYMBOLS = eINSTANCE.getGmlFill_GmlPolygonSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Svg Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FILL__GML_SVG_PARAMETERS = eINSTANCE.getGmlFill_GmlSvgParameters();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_FILL__OPACITY = eINSTANCE.getGmlFill_Opacity();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FILL__GML_TEXT_SYMBOLS = eINSTANCE.getGmlFill_GmlTextSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Marks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FILL__GML_MARKS = eINSTANCE.getGmlFill_GmlMarks();

		/**
		 * The meta object literal for the '<em><b>Gml Colour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FILL__GML_COLOUR = eINSTANCE.getGmlFill_GmlColour();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl <em>Gml Stroke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlStrokeImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlStroke()
		 * @generated
		 */
		EClass GML_STROKE = eINSTANCE.getGmlStroke();

		/**
		 * The meta object literal for the '<em><b>Line Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_STROKE__LINE_CAP = eINSTANCE.getGmlStroke_LineCap();

		/**
		 * The meta object literal for the '<em><b>Gml Colour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_STROKE__GML_COLOUR = eINSTANCE.getGmlStroke_GmlColour();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_STROKE__OPACITY = eINSTANCE.getGmlStroke_Opacity();

		/**
		 * The meta object literal for the '<em><b>Gml Svg Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_STROKE__GML_SVG_PARAMETERS = eINSTANCE.getGmlStroke_GmlSvgParameters();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_STROKE__WIDTH = eINSTANCE.getGmlStroke_Width();

		/**
		 * The meta object literal for the '<em><b>Gml Polygon Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_STROKE__GML_POLYGON_SYMBOLS = eINSTANCE.getGmlStroke_GmlPolygonSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Line Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_STROKE__GML_LINE_SYMBOLS = eINSTANCE.getGmlStroke_GmlLineSymbols();

		/**
		 * The meta object literal for the '<em><b>Dash Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_STROKE__DASH_ARRAY = eINSTANCE.getGmlStroke_DashArray();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_STROKE__LINE_STYLE = eINSTANCE.getGmlStroke_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_STROKE__DASH_OFFSET = eINSTANCE.getGmlStroke_DashOffset();

		/**
		 * The meta object literal for the '<em><b>Gml Marks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_STROKE__GML_MARKS = eINSTANCE.getGmlStroke_GmlMarks();

		/**
		 * The meta object literal for the '<em><b>Linejoin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_STROKE__LINEJOIN = eINSTANCE.getGmlStroke_Linejoin();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.DiagramImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Coordinate System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__COORDINATE_SYSTEM = eINSTANCE.getDiagram_CoordinateSystem();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__KIND = eINSTANCE.getDiagram_Kind();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__GML_DIAGRAM_OBJECTS = eINSTANCE.getDiagram_GmlDiagramObjects();

		/**
		 * The meta object literal for the '<em><b>Design Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__DESIGN_LOCATIONS = eINSTANCE.getDiagram_DesignLocations();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTopologyStyleImpl <em>Gml Topology Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTopologyStyleImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlTopologyStyle()
		 * @generated
		 */
		EClass GML_TOPOLOGY_STYLE = eINSTANCE.getGmlTopologyStyle();

		/**
		 * The meta object literal for the '<em><b>Gml Lable Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_TOPOLOGY_STYLE__GML_LABLE_STYLE = eINSTANCE.getGmlTopologyStyle_GmlLableStyle();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE = eINSTANCE.getGmlTopologyStyle_GmlFeatureStyle();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPolygonSymbolImpl <em>Gml Polygon Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPolygonSymbolImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPolygonSymbol()
		 * @generated
		 */
		EClass GML_POLYGON_SYMBOL = eINSTANCE.getGmlPolygonSymbol();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlPolygonSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Gml Stroke</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_POLYGON_SYMBOL__GML_STROKE = eINSTANCE.getGmlPolygonSymbol_GmlStroke();

		/**
		 * The meta object literal for the '<em><b>Gml Fill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_POLYGON_SYMBOL__GML_FILL = eINSTANCE.getGmlPolygonSymbol_GmlFill();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl <em>Gml Raster Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlRasterSymbolImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlRasterSymbol()
		 * @generated
		 */
		EClass GML_RASTER_SYMBOL = eINSTANCE.getGmlRasterSymbol();

		/**
		 * The meta object literal for the '<em><b>Gray Sourcename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_RASTER_SYMBOL__GRAY_SOURCENAME = eINSTANCE.getGmlRasterSymbol_GraySourcename();

		/**
		 * The meta object literal for the '<em><b>Relief Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_RASTER_SYMBOL__RELIEF_FACTOR = eINSTANCE.getGmlRasterSymbol_ReliefFactor();

		/**
		 * The meta object literal for the '<em><b>Overlapbehaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR = eINSTANCE.getGmlRasterSymbol_Overlapbehaviour();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_RASTER_SYMBOL__OPACITY = eINSTANCE.getGmlRasterSymbol_Opacity();

		/**
		 * The meta object literal for the '<em><b>Green Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_RASTER_SYMBOL__GREEN_SOURCE_NAME = eINSTANCE.getGmlRasterSymbol_GreenSourceName();

		/**
		 * The meta object literal for the '<em><b>Brighness Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_RASTER_SYMBOL__BRIGHNESS_ONLY = eINSTANCE.getGmlRasterSymbol_BrighnessOnly();

		/**
		 * The meta object literal for the '<em><b>Blue Sourcename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_RASTER_SYMBOL__BLUE_SOURCENAME = eINSTANCE.getGmlRasterSymbol_BlueSourcename();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlRasterSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Red Sourcename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_RASTER_SYMBOL__RED_SOURCENAME = eINSTANCE.getGmlRasterSymbol_RedSourcename();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlValueImpl <em>Gml Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlValueImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlValue()
		 * @generated
		 */
		EClass GML_VALUE = eINSTANCE.getGmlValue();

		/**
		 * The meta object literal for the '<em><b>Gml Observation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_VALUE__GML_OBSERVATION = eINSTANCE.getGmlValue_GmlObservation();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_VALUE__DATE_TIME = eINSTANCE.getGmlValue_DateTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_VALUE__VALUE = eINSTANCE.getGmlValue_Value();

		/**
		 * The meta object literal for the '<em><b>Time Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_VALUE__TIME_PERIOD = eINSTANCE.getGmlValue_TimePeriod();

		/**
		 * The meta object literal for the '<em><b>Measurement Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_VALUE__MEASUREMENT_VALUE = eINSTANCE.getGmlValue_MeasurementValue();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.MapImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Map Loc Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MAP_LOC_GRID = eINSTANCE.getMap_MapLocGrid();

		/**
		 * The meta object literal for the '<em><b>Page Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__PAGE_NUMBER = eINSTANCE.getMap_PageNumber();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl <em>Gml Graphic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGraphicImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlGraphic()
		 * @generated
		 */
		EClass GML_GRAPHIC = eINSTANCE.getGmlGraphic();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GRAPHIC__OPACITY = eINSTANCE.getGmlGraphic_Opacity();

		/**
		 * The meta object literal for the '<em><b>Min Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GRAPHIC__MIN_SIZE = eINSTANCE.getGmlGraphic_MinSize();

		/**
		 * The meta object literal for the '<em><b>Symbol ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GRAPHIC__SYMBOL_ID = eINSTANCE.getGmlGraphic_SymbolID();

		/**
		 * The meta object literal for the '<em><b>XScale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GRAPHIC__XSCALE = eINSTANCE.getGmlGraphic_XScale();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GRAPHIC__SIZE = eINSTANCE.getGmlGraphic_Size();

		/**
		 * The meta object literal for the '<em><b>YScale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GRAPHIC__YSCALE = eINSTANCE.getGmlGraphic_YScale();

		/**
		 * The meta object literal for the '<em><b>Gml Marks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_GRAPHIC__GML_MARKS = eINSTANCE.getGmlGraphic_GmlMarks();

		/**
		 * The meta object literal for the '<em><b>Gml Point Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_GRAPHIC__GML_POINT_SYMBOLS = eINSTANCE.getGmlGraphic_GmlPointSymbols();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GRAPHIC__ROTATION = eINSTANCE.getGmlGraphic_Rotation();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSvgParameterImpl <em>Gml Svg Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSvgParameterImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlSvgParameter()
		 * @generated
		 */
		EClass GML_SVG_PARAMETER = eINSTANCE.getGmlSvgParameter();

		/**
		 * The meta object literal for the '<em><b>Gml Stokes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_SVG_PARAMETER__GML_STOKES = eINSTANCE.getGmlSvgParameter_GmlStokes();

		/**
		 * The meta object literal for the '<em><b>Gml Fills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_SVG_PARAMETER__GML_FILLS = eINSTANCE.getGmlSvgParameter_GmlFills();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_SVG_PARAMETER__VALUE = eINSTANCE.getGmlSvgParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Gml Fonts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_SVG_PARAMETER__GML_FONTS = eINSTANCE.getGmlSvgParameter_GmlFonts();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_SVG_PARAMETER__ATTRIBUTE = eINSTANCE.getGmlSvgParameter_Attribute();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlBaseSymbolImpl <em>Gml Base Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlBaseSymbolImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlBaseSymbol()
		 * @generated
		 */
		EClass GML_BASE_SYMBOL = eINSTANCE.getGmlBaseSymbol();

		/**
		 * The meta object literal for the '<em><b>Gml Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_BASE_SYMBOL__GML_SYMBOLS = eINSTANCE.getGmlBaseSymbol_GmlSymbols();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPointSymbolImpl <em>Gml Point Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPointSymbolImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPointSymbol()
		 * @generated
		 */
		EClass GML_POINT_SYMBOL = eINSTANCE.getGmlPointSymbol();

		/**
		 * The meta object literal for the '<em><b>Gml Graphic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_POINT_SYMBOL__GML_GRAPHIC = eINSTANCE.getGmlPointSymbol_GmlGraphic();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlPointSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSymbolImpl <em>Gml Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlSymbolImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlSymbol()
		 * @generated
		 */
		EClass GML_SYMBOL = eINSTANCE.getGmlSymbol();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_SYMBOL__LEVEL = eINSTANCE.getGmlSymbol_Level();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_SYMBOL__GML_FEATURE_STYLES = eINSTANCE.getGmlSymbol_GmlFeatureStyles();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_SYMBOL__TYPE = eINSTANCE.getGmlSymbol_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_SYMBOL__VERSION = eINSTANCE.getGmlSymbol_Version();

		/**
		 * The meta object literal for the '<em><b>Gml Base Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_SYMBOL__GML_BASE_SYMBOL = eINSTANCE.getGmlSymbol_GmlBaseSymbol();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlMarkImpl <em>Gml Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlMarkImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlMark()
		 * @generated
		 */
		EClass GML_MARK = eINSTANCE.getGmlMark();

		/**
		 * The meta object literal for the '<em><b>Gml Graphics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_MARK__GML_GRAPHICS = eINSTANCE.getGmlMark_GmlGraphics();

		/**
		 * The meta object literal for the '<em><b>Gml FIlls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_MARK__GML_FILLS = eINSTANCE.getGmlMark_GmlFIlls();

		/**
		 * The meta object literal for the '<em><b>Well Known Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_MARK__WELL_KNOWN_NAME = eINSTANCE.getGmlMark_WellKnownName();

		/**
		 * The meta object literal for the '<em><b>Gml Strokes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_MARK__GML_STROKES = eINSTANCE.getGmlMark_GmlStrokes();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPositionImpl <em>Gml Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlPositionImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlPosition()
		 * @generated
		 */
		EClass GML_POSITION = eINSTANCE.getGmlPosition();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGeometryStyleImpl <em>Gml Geometry Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlGeometryStyleImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlGeometryStyle()
		 * @generated
		 */
		EClass GML_GEOMETRY_STYLE = eINSTANCE.getGmlGeometryStyle();

		/**
		 * The meta object literal for the '<em><b>Gml Label Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_GEOMETRY_STYLE__GML_LABEL_STYLE = eINSTANCE.getGmlGeometryStyle_GmlLabelStyle();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_GEOMETRY_STYLE__GML_FEATURE_STYLE = eINSTANCE.getGmlGeometryStyle_GmlFeatureStyle();

		/**
		 * The meta object literal for the '<em><b>Geometry Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GEOMETRY_STYLE__GEOMETRY_TYPE = eINSTANCE.getGmlGeometryStyle_GeometryType();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GEOMETRY_STYLE__SYMBOL = eINSTANCE.getGmlGeometryStyle_Symbol();

		/**
		 * The meta object literal for the '<em><b>Geometry Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY = eINSTANCE.getGmlGeometryStyle_GeometryProperty();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl <em>Gml Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlObservation()
		 * @generated
		 */
		EClass GML_OBSERVATION = eINSTANCE.getGmlObservation();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_OBSERVATION__GML_DIAGRAM_OBJECTS = eINSTANCE.getGmlObservation_GmlDiagramObjects();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_OBSERVATION__TARGET = eINSTANCE.getGmlObservation_Target();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_OBSERVATION__DATE_TIME = eINSTANCE.getGmlObservation_DateTime();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_OBSERVATION__CHANGE_ITEMS = eINSTANCE.getGmlObservation_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Result Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_OBSERVATION__RESULT_OF = eINSTANCE.getGmlObservation_ResultOf();

		/**
		 * The meta object literal for the '<em><b>Using</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_OBSERVATION__USING = eINSTANCE.getGmlObservation_Using();

		/**
		 * The meta object literal for the '<em><b>Gml Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_OBSERVATION__GML_VALUES = eINSTANCE.getGmlObservation_GmlValues();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl <em>Gml Text Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlTextSymbolImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlTextSymbol()
		 * @generated
		 */
		EClass GML_TEXT_SYMBOL = eINSTANCE.getGmlTextSymbol();

		/**
		 * The meta object literal for the '<em><b>Gml Halo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_TEXT_SYMBOL__GML_HALO = eINSTANCE.getGmlTextSymbol_GmlHalo();

		/**
		 * The meta object literal for the '<em><b>Gml Font</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_TEXT_SYMBOL__GML_FONT = eINSTANCE.getGmlTextSymbol_GmlFont();

		/**
		 * The meta object literal for the '<em><b>Gml Fill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_TEXT_SYMBOL__GML_FILL = eINSTANCE.getGmlTextSymbol_GmlFill();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_TEXT_SYMBOL__PROPERTY = eINSTANCE.getGmlTextSymbol_Property();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_TEXT_SYMBOL__LABEL = eINSTANCE.getGmlTextSymbol_Label();

		/**
		 * The meta object literal for the '<em><b>Min Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_TEXT_SYMBOL__MIN_FONT_SIZE = eINSTANCE.getGmlTextSymbol_MinFontSize();

		/**
		 * The meta object literal for the '<em><b>Field ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_TEXT_SYMBOL__FIELD_ID = eINSTANCE.getGmlTextSymbol_FieldID();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlTextSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Gml Label Placement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT = eINSTANCE.getGmlTextSymbol_GmlLabelPlacement();

		/**
		 * The meta object literal for the '<em><b>Label Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_TEXT_SYMBOL__LABEL_TYPE = eINSTANCE.getGmlTextSymbol_LabelType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl <em>Gml Diagram Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlDiagramObjectImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlDiagramObject()
		 * @generated
		 */
		EClass GML_DIAGRAM_OBJECT = eINSTANCE.getGmlDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Gml Raster Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlRasterSymbols();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_DIAGRAM_OBJECT__DIAGRAMS = eINSTANCE.getGmlDiagramObject_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Gml Point Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlPointSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Polygon Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlPolygonSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Line Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlLineSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlTextSymbols();

		/**
		 * The meta object literal for the '<em><b>Coordinate Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS = eINSTANCE.getGmlDiagramObject_CoordinateSystems();

		/**
		 * The meta object literal for the '<em><b>Gml Observatins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_DIAGRAM_OBJECT__GML_OBSERVATINS = eINSTANCE.getGmlDiagramObject_GmlObservatins();

		/**
		 * The meta object literal for the '<em><b>Gml Selectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_DIAGRAM_OBJECT__GML_SELECTORS = eINSTANCE.getGmlDiagramObject_GmlSelectors();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlHaloImpl <em>Gml Halo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlHaloImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlHalo()
		 * @generated
		 */
		EClass GML_HALO = eINSTANCE.getGmlHalo();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_HALO__GML_TEXT_SYMBOLS = eINSTANCE.getGmlHalo_GmlTextSymbols();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_HALO__OPACITY = eINSTANCE.getGmlHalo_Opacity();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_HALO__RADIUS = eINSTANCE.getGmlHalo_Radius();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl <em>Gml Label Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLabelStyleImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlLabelStyle()
		 * @generated
		 */
		EClass GML_LABEL_STYLE = eINSTANCE.getGmlLabelStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_STYLE__STYLE = eINSTANCE.getGmlLabelStyle_Style();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_LABEL_STYLE__GML_FEATURE_STYLE = eINSTANCE.getGmlLabelStyle_GmlFeatureStyle();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_STYLE__TRANSFORM = eINSTANCE.getGmlLabelStyle_Transform();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LABEL_STYLE__LABEL_EXPRESSION = eINSTANCE.getGmlLabelStyle_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Gml Geometry Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_LABEL_STYLE__GML_GEOMETRY_STYLES = eINSTANCE.getGmlLabelStyle_GmlGeometryStyles();

		/**
		 * The meta object literal for the '<em><b>Gml Topology Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_LABEL_STYLE__GML_TOPOLOGY_STYLES = eINSTANCE.getGmlLabelStyle_GmlTopologyStyles();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureTypeImpl <em>Gml Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureTypeImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlFeatureType()
		 * @generated
		 */
		EClass GML_FEATURE_TYPE = eINSTANCE.getGmlFeatureType();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_FEATURE_TYPE__GML_FEATURE_STYLES = eINSTANCE.getGmlFeatureType_GmlFeatureStyles();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineSymbolImpl <em>Gml Line Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.GmlLineSymbolImpl
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getGmlLineSymbol()
		 * @generated
		 */
		EClass GML_LINE_SYMBOL = eINSTANCE.getGmlLineSymbol();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlLineSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Gml Stroke</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_LINE_SYMBOL__GML_STROKE = eINSTANCE.getGmlLineSymbol_GmlStroke();

		/**
		 * The meta object literal for the '<em><b>Source Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_LINE_SYMBOL__SOURCE_SIDE = eINSTANCE.getGmlLineSymbol_SourceSide();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.DiagramKind <em>Diagram Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.DiagramKind
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getDiagramKind()
		 * @generated
		 */
		EEnum DIAGRAM_KIND = eINSTANCE.getDiagramKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind <em>Query Grammar Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
		 * @see CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl#getQueryGrammarKind()
		 * @generated
		 */
		EEnum QUERY_GRAMMAR_KIND = eINSTANCE.getQueryGrammarKind();

	}

} //InfGMLSupportPackage
