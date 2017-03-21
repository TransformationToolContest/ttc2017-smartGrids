/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle;
import CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType;
import CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle;
import CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle;
import CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol;
import CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;
import CIM.IEC61970.Informative.InfGMLSupport.QueryGrammarKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gml Feature Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getFeatureConstraint <em>Feature Constraint</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getGmlSymbols <em>Gml Symbols</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getSemanticTypeIdentifier <em>Semantic Type Identifier</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getGmlLabelStyles <em>Gml Label Styles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getGmlGeometryStyles <em>Gml Geometry Styles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getFeatureTypeName <em>Feature Type Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getQueryGrammar <em>Query Grammar</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getFeatureType <em>Feature Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getGmlFeatureTypes <em>Gml Feature Types</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlFeatureStyleImpl#getGmlTobologyStyles <em>Gml Tobology Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlFeatureStyleImpl extends IdentifiedObjectImpl implements GmlFeatureStyle {
	/**
	 * The default value of the '{@link #getFeatureConstraint() <em>Feature Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureConstraint() <em>Feature Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureConstraint()
	 * @generated
	 * @ordered
	 */
	protected String featureConstraint = FEATURE_CONSTRAINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlSymbols() <em>Gml Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlSymbol> gmlSymbols;

	/**
	 * The default value of the '{@link #getSemanticTypeIdentifier() <em>Semantic Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_TYPE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticTypeIdentifier() <em>Semantic Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String semanticTypeIdentifier = SEMANTIC_TYPE_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlLabelStyles() <em>Gml Label Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLabelStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlLabelStyle> gmlLabelStyles;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlGeometryStyles() <em>Gml Geometry Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlGeometryStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlGeometryStyle> gmlGeometryStyles;

	/**
	 * The default value of the '{@link #getFeatureTypeName() <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureTypeName() <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypeName()
	 * @generated
	 * @ordered
	 */
	protected String featureTypeName = FEATURE_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryGrammar() <em>Query Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryGrammar()
	 * @generated
	 * @ordered
	 */
	protected static final QueryGrammarKind QUERY_GRAMMAR_EDEFAULT = QueryGrammarKind.XPATH;

	/**
	 * The cached value of the '{@link #getQueryGrammar() <em>Query Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryGrammar()
	 * @generated
	 * @ordered
	 */
	protected QueryGrammarKind queryGrammar = QUERY_GRAMMAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureType() <em>Feature Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureType()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureType() <em>Feature Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureType()
	 * @generated
	 * @ordered
	 */
	protected String featureType = FEATURE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected String baseType = BASE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlFeatureTypes() <em>Gml Feature Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFeatureTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFeatureType> gmlFeatureTypes;

	/**
	 * The cached value of the '{@link #getGmlTobologyStyles() <em>Gml Tobology Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlTobologyStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlTopologyStyle> gmlTobologyStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlFeatureStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_FEATURE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureConstraint() {
		return featureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureConstraint(String newFeatureConstraint) {
		String oldFeatureConstraint = featureConstraint;
		featureConstraint = newFeatureConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_CONSTRAINT, oldFeatureConstraint, featureConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlSymbol> getGmlSymbols() {
		if (gmlSymbols == null) {
			gmlSymbols = new EObjectWithInverseResolvingEList.ManyInverse<GmlSymbol>(GmlSymbol.class, this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS, InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES);
		}
		return gmlSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticTypeIdentifier() {
		return semanticTypeIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticTypeIdentifier(String newSemanticTypeIdentifier) {
		String oldSemanticTypeIdentifier = semanticTypeIdentifier;
		semanticTypeIdentifier = newSemanticTypeIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER, oldSemanticTypeIdentifier, semanticTypeIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlLabelStyle> getGmlLabelStyles() {
		if (gmlLabelStyles == null) {
			gmlLabelStyles = new EObjectWithInverseResolvingEList<GmlLabelStyle>(GmlLabelStyle.class, this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES, InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE);
		}
		return gmlLabelStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FEATURE_STYLE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlGeometryStyle> getGmlGeometryStyles() {
		if (gmlGeometryStyles == null) {
			gmlGeometryStyles = new EObjectWithInverseResolvingEList<GmlGeometryStyle>(GmlGeometryStyle.class, this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES, InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE);
		}
		return gmlGeometryStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureTypeName() {
		return featureTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureTypeName(String newFeatureTypeName) {
		String oldFeatureTypeName = featureTypeName;
		featureTypeName = newFeatureTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE_NAME, oldFeatureTypeName, featureTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryGrammarKind getQueryGrammar() {
		return queryGrammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryGrammar(QueryGrammarKind newQueryGrammar) {
		QueryGrammarKind oldQueryGrammar = queryGrammar;
		queryGrammar = newQueryGrammar == null ? QUERY_GRAMMAR_EDEFAULT : newQueryGrammar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FEATURE_STYLE__QUERY_GRAMMAR, oldQueryGrammar, queryGrammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureType() {
		return featureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureType(String newFeatureType) {
		String oldFeatureType = featureType;
		featureType = newFeatureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE, oldFeatureType, featureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(String newBaseType) {
		String oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_FEATURE_STYLE__BASE_TYPE, oldBaseType, baseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlFeatureType> getGmlFeatureTypes() {
		if (gmlFeatureTypes == null) {
			gmlFeatureTypes = new EObjectWithInverseResolvingEList.ManyInverse<GmlFeatureType>(GmlFeatureType.class, this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES, InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES);
		}
		return gmlFeatureTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlTopologyStyle> getGmlTobologyStyles() {
		if (gmlTobologyStyles == null) {
			gmlTobologyStyles = new EObjectWithInverseResolvingEList<GmlTopologyStyle>(GmlTopologyStyle.class, this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES, InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE);
		}
		return gmlTobologyStyles;
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlLabelStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlGeometryStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFeatureTypes()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTobologyStyles()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				return ((InternalEList<?>)getGmlSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				return ((InternalEList<?>)getGmlLabelStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				return ((InternalEList<?>)getGmlGeometryStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				return ((InternalEList<?>)getGmlFeatureTypes()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				return ((InternalEList<?>)getGmlTobologyStyles()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_CONSTRAINT:
				return getFeatureConstraint();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				return getGmlSymbols();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER:
				return getSemanticTypeIdentifier();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				return getGmlLabelStyles();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__VERSION:
				return getVersion();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				return getGmlGeometryStyles();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE_NAME:
				return getFeatureTypeName();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__QUERY_GRAMMAR:
				return getQueryGrammar();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE:
				return getFeatureType();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__BASE_TYPE:
				return getBaseType();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				return getGmlFeatureTypes();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				return getGmlTobologyStyles();
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_CONSTRAINT:
				setFeatureConstraint((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				getGmlSymbols().clear();
				getGmlSymbols().addAll((Collection<? extends GmlSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER:
				setSemanticTypeIdentifier((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				getGmlLabelStyles().clear();
				getGmlLabelStyles().addAll((Collection<? extends GmlLabelStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__VERSION:
				setVersion((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				getGmlGeometryStyles().clear();
				getGmlGeometryStyles().addAll((Collection<? extends GmlGeometryStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE_NAME:
				setFeatureTypeName((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__QUERY_GRAMMAR:
				setQueryGrammar((QueryGrammarKind)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE:
				setFeatureType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__BASE_TYPE:
				setBaseType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				getGmlFeatureTypes().clear();
				getGmlFeatureTypes().addAll((Collection<? extends GmlFeatureType>)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				getGmlTobologyStyles().clear();
				getGmlTobologyStyles().addAll((Collection<? extends GmlTopologyStyle>)newValue);
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_CONSTRAINT:
				setFeatureConstraint(FEATURE_CONSTRAINT_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				getGmlSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER:
				setSemanticTypeIdentifier(SEMANTIC_TYPE_IDENTIFIER_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				getGmlLabelStyles().clear();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				getGmlGeometryStyles().clear();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE_NAME:
				setFeatureTypeName(FEATURE_TYPE_NAME_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__QUERY_GRAMMAR:
				setQueryGrammar(QUERY_GRAMMAR_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE:
				setFeatureType(FEATURE_TYPE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__BASE_TYPE:
				setBaseType(BASE_TYPE_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				getGmlFeatureTypes().clear();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				getGmlTobologyStyles().clear();
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_CONSTRAINT:
				return FEATURE_CONSTRAINT_EDEFAULT == null ? featureConstraint != null : !FEATURE_CONSTRAINT_EDEFAULT.equals(featureConstraint);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				return gmlSymbols != null && !gmlSymbols.isEmpty();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER:
				return SEMANTIC_TYPE_IDENTIFIER_EDEFAULT == null ? semanticTypeIdentifier != null : !SEMANTIC_TYPE_IDENTIFIER_EDEFAULT.equals(semanticTypeIdentifier);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				return gmlLabelStyles != null && !gmlLabelStyles.isEmpty();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				return gmlGeometryStyles != null && !gmlGeometryStyles.isEmpty();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE_NAME:
				return FEATURE_TYPE_NAME_EDEFAULT == null ? featureTypeName != null : !FEATURE_TYPE_NAME_EDEFAULT.equals(featureTypeName);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__QUERY_GRAMMAR:
				return queryGrammar != QUERY_GRAMMAR_EDEFAULT;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE:
				return FEATURE_TYPE_EDEFAULT == null ? featureType != null : !FEATURE_TYPE_EDEFAULT.equals(featureType);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__BASE_TYPE:
				return BASE_TYPE_EDEFAULT == null ? baseType != null : !BASE_TYPE_EDEFAULT.equals(baseType);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				return gmlFeatureTypes != null && !gmlFeatureTypes.isEmpty();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				return gmlTobologyStyles != null && !gmlTobologyStyles.isEmpty();
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
		result.append(" (featureConstraint: ");
		result.append(featureConstraint);
		result.append(", semanticTypeIdentifier: ");
		result.append(semanticTypeIdentifier);
		result.append(", version: ");
		result.append(version);
		result.append(", featureTypeName: ");
		result.append(featureTypeName);
		result.append(", queryGrammar: ");
		result.append(queryGrammar);
		result.append(", featureType: ");
		result.append(featureType);
		result.append(", baseType: ");
		result.append(baseType);
		result.append(')');
		return result.toString();
	}

} //GmlFeatureStyleImpl
