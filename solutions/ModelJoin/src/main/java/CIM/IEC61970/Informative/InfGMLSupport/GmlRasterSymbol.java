/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Raster Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename <em>Gray Sourcename</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor <em>Relief Factor</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour <em>Overlapbehaviour</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName <em>Green Source Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly <em>Brighness Only</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename <em>Blue Sourcename</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename <em>Red Sourcename</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Describes how to render raster/matrix-coverage data (e.g., satellite photos, DEMs).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Describes how to render raster/matrix-coverage data (e.g., satellite photos, DEMs).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Describes how to render raster/matrix-coverage data (e.g., satellite photos, DEMs).' Profile\040documentation='Describes how to render raster/matrix-coverage data (e.g., satellite photos, DEMs).'"
 * @generated
 */
public interface GmlRasterSymbol extends GmlSymbol {
	/**
	 * Returns the value of the '<em><b>Gray Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gray Sourcename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gray Sourcename</em>' attribute.
	 * @see #setGraySourcename(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol_GraySourcename()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A single colour channel may be selected to display in grayscale. Colour Channels are identified by a system and data-dependent character identifier. Contrast enhancement may be applied to each channel in isolation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A single colour channel may be selected to display in grayscale. Colour Channels are identified by a system and data-dependent character identifier. Contrast enhancement may be applied to each channel in isolation.'"
	 * @generated
	 */
	String getGraySourcename();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename <em>Gray Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gray Sourcename</em>' attribute.
	 * @see #getGraySourcename()
	 * @generated
	 */
	void setGraySourcename(String value);

	/**
	 * Returns the value of the '<em><b>Relief Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relief Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relief Factor</em>' attribute.
	 * @see #setReliefFactor(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol_ReliefFactor()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ReliefFactor gives the amount of exaggeration to use for the height of the \"hills\". A value of around 55 (times) gives reasonable results for Earth-based DEMs. The default value is system-dependent.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ReliefFactor gives the amount of exaggeration to use for the height of the \"hills\". A value of around 55 (times) gives reasonable results for Earth-based DEMs. The default value is system-dependent.'"
	 * @generated
	 */
	String getReliefFactor();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor <em>Relief Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relief Factor</em>' attribute.
	 * @see #getReliefFactor()
	 * @generated
	 */
	void setReliefFactor(String value);

	/**
	 * Returns the value of the '<em><b>Overlapbehaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlapbehaviour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlapbehaviour</em>' attribute.
	 * @see #setOverlapbehaviour(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol_Overlapbehaviour()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tells a system how to behave when multiple raster images in a layer overlap each other, for example with satellite-image scenes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tells a system how to behave when multiple raster images in a layer overlap each other, for example with satellite-image scenes.'"
	 * @generated
	 */
	String getOverlapbehaviour();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour <em>Overlapbehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlapbehaviour</em>' attribute.
	 * @see #getOverlapbehaviour()
	 * @generated
	 */
	void setOverlapbehaviour(String value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(float)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol_Opacity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the level of translucency to use when rendering the Graphic. The value is encoded as a floating-point value between 0.0 and 1.0 with 0.0 representing completely transparent and 1.0 representing completely opaque, with a linear scale of translucency for intermediate values. The default value is 1.0.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the level of translucency to use when rendering the Graphic. The value is encoded as a floating-point value between 0.0 and 1.0 with 0.0 representing completely transparent and 1.0 representing completely opaque, with a linear scale of translucency for intermediate values. The default value is 1.0.'"
	 * @generated
	 */
	float getOpacity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(float value);

	/**
	 * Returns the value of the '<em><b>Green Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green Source Name</em>' attribute.
	 * @see #setGreenSourceName(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol_GreenSourceName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Colour Channels are identified by a system and data-dependent character identifier. Contrast enhancement may be applied to each channel in isolation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Colour Channels are identified by a system and data-dependent character identifier. Contrast enhancement may be applied to each channel in isolation.'"
	 * @generated
	 */
	String getGreenSourceName();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName <em>Green Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green Source Name</em>' attribute.
	 * @see #getGreenSourceName()
	 * @generated
	 */
	void setGreenSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Brighness Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brighness Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brighness Only</em>' attribute.
	 * @see #setBrighnessOnly(boolean)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol_BrighnessOnly()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If the BrightnessOnly flag is 0 (false, default), the shading is applied to the layer being rendered as the current RasterSymbol. If BrightnessOnly is 1 (true), the shading is applied to the brightness of the colors in the rendering canvas generated so far by other layers, with the effect of relief-shading these other layers.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If the BrightnessOnly flag is 0 (false, default), the shading is applied to the layer being rendered as the current RasterSymbol. If BrightnessOnly is 1 (true), the shading is applied to the brightness of the colors in the rendering canvas generated so far by other layers, with the effect of relief-shading these other layers.'"
	 * @generated
	 */
	boolean isBrighnessOnly();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly <em>Brighness Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brighness Only</em>' attribute.
	 * @see #isBrighnessOnly()
	 * @generated
	 */
	void setBrighnessOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Blue Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue Sourcename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue Sourcename</em>' attribute.
	 * @see #setBlueSourcename(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol_BlueSourcename()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Colour Channels are identified by a system and data-dependent character identifier. Contrast enhancement may be applied to each channel in isolation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Colour Channels are identified by a system and data-dependent character identifier. Contrast enhancement may be applied to each channel in isolation.'"
	 * @generated
	 */
	String getBlueSourcename();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename <em>Blue Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue Sourcename</em>' attribute.
	 * @see #getBlueSourcename()
	 * @generated
	 */
	void setBlueSourcename(String value);

	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols <em>Gml Raster Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol_GmlDiagramObject()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols
	 * @model opposite="GmlRasterSymbols"
	 * @generated
	 */
	GmlDiagramObject getGmlDiagramObject();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	void setGmlDiagramObject(GmlDiagramObject value);

	/**
	 * Returns the value of the '<em><b>Red Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red Sourcename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Sourcename</em>' attribute.
	 * @see #setRedSourcename(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol_RedSourcename()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Colour Channels are identified by a system and data-dependent character identifier. Contrast enhancement may be applied to each channel in isolation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Colour Channels are identified by a system and data-dependent character identifier. Contrast enhancement may be applied to each channel in isolation.'"
	 * @generated
	 */
	String getRedSourcename();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename <em>Red Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Sourcename</em>' attribute.
	 * @see #getRedSourcename()
	 * @generated
	 */
	void setRedSourcename(String value);

} // GmlRasterSymbol
