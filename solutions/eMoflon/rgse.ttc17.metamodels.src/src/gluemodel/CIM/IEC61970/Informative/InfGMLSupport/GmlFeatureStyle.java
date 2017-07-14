/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Feature Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint <em>Feature Constraint</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlSymbols <em>Gml Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier <em>Semantic Type Identifier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles <em>Gml Label Styles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion <em>Version</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName <em>Feature Type Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar <em>Query Grammar</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType <em>Feature Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes <em>Gml Feature Types</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles <em>Gml Tobology Styles</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used for styling a particular aspect or aspects of a feature, such as geometry, topology or arbitrary text string.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Used for styling a particular aspect or aspects of a feature, such as geometry, topology or arbitrary text string.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used for styling a particular aspect or aspects of a feature, such as geometry, topology or arbitrary text string.' Profile\040documentation='Used for styling a particular aspect or aspects of a feature, such as geometry, topology or arbitrary text string.'"
 * @generated
 */
public interface GmlFeatureStyle extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Feature Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Constraint</em>' attribute.
	 * @see #setFeatureConstraint(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_FeatureConstraint()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This property is used to further constrain the feature instance set to which the style applies. It is optional and its value is an XPath expression. If the property does not exist, the style applies to all feature instances selected by \'featureType\' or \'baseType\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This property is used to further constrain the feature instance set to which the style applies. It is optional and its value is an XPath expression. If the property does not exist, the style applies to all feature instances selected by \'featureType\' or \'baseType\'.'"
	 * @generated
	 */
	String getFeatureConstraint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint <em>Feature Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Constraint</em>' attribute.
	 * @see #getFeatureConstraint()
	 * @generated
	 */
	void setFeatureConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Gml Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlFeatureStyles <em>Gml Feature Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_GmlSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlFeatureStyles
	 * @model opposite="GmlFeatureStyles"
	 * @generated
	 */
	EList<GmlSymbol> getGmlSymbols();

	/**
	 * Returns the value of the '<em><b>Semantic Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Type Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Type Identifier</em>' attribute.
	 * @see #setSemanticTypeIdentifier(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_SemanticTypeIdentifier()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The SemanticTypeIdentifier is experimental in GML and is intended to be used to identify what the feature style is suitable to be used for using community-controlled name(s). For example, a single style may be suitable to use with many different feature types.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SemanticTypeIdentifier is experimental in GML and is intended to be used to identify what the feature style is suitable to be used for using community-controlled name(s). For example, a single style may be suitable to use with many different feature types.'"
	 * @generated
	 */
	String getSemanticTypeIdentifier();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier <em>Semantic Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Type Identifier</em>' attribute.
	 * @see #getSemanticTypeIdentifier()
	 * @generated
	 */
	void setSemanticTypeIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Gml Label Styles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Label Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Label Styles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_GmlLabelStyles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle
	 * @model opposite="GmlFeatureStyle"
	 * @generated
	 */
	EList<GmlLabelStyle> getGmlLabelStyles();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_Version()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Allows version numbers to be identified when the SLD pieces are used independently.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Allows version numbers to be identified when the SLD pieces are used independently.'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Gml Geometry Styles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Geometry Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Geometry Styles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_GmlGeometryStyles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle
	 * @model opposite="GmlFeatureStyle"
	 * @generated
	 */
	EList<GmlGeometryStyle> getGmlGeometryStyles();

	/**
	 * Returns the value of the '<em><b>Feature Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Type Name</em>' attribute.
	 * @see #setFeatureTypeName(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_FeatureTypeName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Identifies the specific feature type that the feature-type style is for.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Identifies the specific feature type that the feature-type style is for.'"
	 * @generated
	 */
	String getFeatureTypeName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type Name</em>' attribute.
	 * @see #getFeatureTypeName()
	 * @generated
	 */
	void setFeatureTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Query Grammar</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Grammar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Grammar</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
	 * @see #setQueryGrammar(QueryGrammarKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_QueryGrammar()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Grammar used in the content of the gml:featureConstraint element.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Grammar used in the content of the gml:featureConstraint element.'"
	 * @generated
	 */
	QueryGrammarKind getQueryGrammar();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar <em>Query Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Grammar</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
	 * @see #getQueryGrammar()
	 * @generated
	 */
	void setQueryGrammar(QueryGrammarKind value);

	/**
	 * Returns the value of the '<em><b>Feature Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Type</em>' attribute.
	 * @see #setFeatureType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_FeatureType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The simplest and most common way of relating features and styles is by using this attribute. Its value will be the declared name of a feature, instances of which we want to style. For example, if the featureType = Switch, this FeatureStyle object will simply apply to all Switch features.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The simplest and most common way of relating features and styles is by using this attribute. Its value will be the declared name of a feature, instances of which we want to style. For example, if the featureType = Switch, this FeatureStyle object will simply apply to all Switch features.'"
	 * @generated
	 */
	String getFeatureType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType <em>Feature Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type</em>' attribute.
	 * @see #getFeatureType()
	 * @generated
	 */
	void setFeatureType(String value);

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see #setBaseType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_BaseType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Another way of selecting the feature instances to which the style applies is to specify, as the value of this attribute, the name of the base type from which feature or features derive.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Another way of selecting the feature instances to which the style applies is to specify, as the value of this attribute, the name of the base type from which feature or features derive.'"
	 * @generated
	 */
	String getBaseType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' attribute.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(String value);

	/**
	 * Returns the value of the '<em><b>Gml Feature Types</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles <em>Gml Feature Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Types</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_GmlFeatureTypes()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles
	 * @model opposite="GmlFeatureStyles"
	 * @generated
	 */
	EList<GmlFeatureType> getGmlFeatureTypes();

	/**
	 * Returns the value of the '<em><b>Gml Tobology Styles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Tobology Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Tobology Styles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle_GmlTobologyStyles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle
	 * @model opposite="GmlFeatureStyle"
	 * @generated
	 */
	EList<GmlTopologyStyle> getGmlTobologyStyles();

} // GmlFeatureStyle
