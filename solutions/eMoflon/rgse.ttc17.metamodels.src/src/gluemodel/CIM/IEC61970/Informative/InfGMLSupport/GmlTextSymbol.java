/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Text Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlHalo <em>Gml Halo</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont <em>Gml Font</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill <em>Gml Fill</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty <em>Property</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel <em>Label</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize <em>Min Font Size</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement <em>Gml Label Placement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType <em>Label Type</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used for styling text labels, i.e., for rendering them according to various graphical parameters.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Used for styling text labels, i.e., for rendering them according to various graphical parameters.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used for styling text labels, i.e., for rendering them according to various graphical parameters.' Profile\040documentation='Used for styling text labels, i.e., for rendering them according to various graphical parameters.'"
 * @generated
 */
public interface GmlTextSymbol extends GmlSymbol {
	/**
	 * Returns the value of the '<em><b>Gml Halo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlHalo#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Halo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Halo</em>' reference.
	 * @see #setGmlHalo(GmlHalo)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_GmlHalo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlHalo#getGmlTextSymbols
	 * @model opposite="GmlTextSymbols"
	 * @generated
	 */
	GmlHalo getGmlHalo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlHalo <em>Gml Halo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Halo</em>' reference.
	 * @see #getGmlHalo()
	 * @generated
	 */
	void setGmlHalo(GmlHalo value);

	/**
	 * Returns the value of the '<em><b>Gml Font</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Font</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Font</em>' reference.
	 * @see #setGmlFont(GmlFont)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_GmlFont()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols
	 * @model opposite="GmlTextSymbols"
	 * @generated
	 */
	GmlFont getGmlFont();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont <em>Gml Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Font</em>' reference.
	 * @see #getGmlFont()
	 * @generated
	 */
	void setGmlFont(GmlFont value);

	/**
	 * Returns the value of the '<em><b>Gml Fill</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fill</em>' reference.
	 * @see #setGmlFill(GmlFill)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_GmlFill()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols
	 * @model opposite="GmlTextSymbols"
	 * @generated
	 */
	GmlFill getGmlFill();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill <em>Gml Fill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Fill</em>' reference.
	 * @see #getGmlFill()
	 * @generated
	 */
	void setGmlFill(GmlFill value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_Property()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generic method for capturing all unspecified information pertaining to the TextSymbol.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generic method for capturing all unspecified information pertaining to the TextSymbol.'"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_Label()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Text-label content. If the value is not provided, then no text will be rendered.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Text-label content. If the value is not provided, then no text will be rendered.'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Min Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Font Size</em>' attribute.
	 * @see #setMinFontSize(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_MinFontSize()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum font size allowed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum font size allowed.'"
	 * @generated
	 */
	int getMinFontSize();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize <em>Min Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Font Size</em>' attribute.
	 * @see #getMinFontSize()
	 * @generated
	 */
	void setMinFontSize(int value);

	/**
	 * Returns the value of the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field ID</em>' attribute.
	 * @see #setFieldID(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_FieldID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The name of the field of the class being annotated. Most objects will include name, description, and aliasName. Many objects may contain other fields such as comment, status, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The name of the field of the class being annotated. Most objects will include name, description, and aliasName. Many objects may contain other fields such as comment, status, etc.'"
	 * @generated
	 */
	String getFieldID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field ID</em>' attribute.
	 * @see #getFieldID()
	 * @generated
	 */
	void setFieldID(String value);

	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_GmlDiagramObject()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols
	 * @model opposite="GmlTextSymbols"
	 * @generated
	 */
	GmlDiagramObject getGmlDiagramObject();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	void setGmlDiagramObject(GmlDiagramObject value);

	/**
	 * Returns the value of the '<em><b>Gml Label Placement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Label Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Label Placement</em>' reference.
	 * @see #setGmlLabelPlacement(GmlLabelPlacement)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_GmlLabelPlacement()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols
	 * @model opposite="GmlTextSymbols"
	 * @generated
	 */
	GmlLabelPlacement getGmlLabelPlacement();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement <em>Gml Label Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Label Placement</em>' reference.
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	void setGmlLabelPlacement(GmlLabelPlacement value);

	/**
	 * Returns the value of the '<em><b>Label Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Type</em>' attribute.
	 * @see #setLabelType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol_LabelType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type-classification of a label.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type-classification of a label.'"
	 * @generated
	 */
	String getLabelType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Type</em>' attribute.
	 * @see #getLabelType()
	 * @generated
	 */
	void setLabelType(String value);

} // GmlTextSymbol
