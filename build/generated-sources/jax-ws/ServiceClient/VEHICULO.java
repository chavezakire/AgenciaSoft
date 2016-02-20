
package ServiceClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VEHICULO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VEHICULO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_PLACA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESPUESTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUM_CHASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUM_MOTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_MARCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_MARCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_MODELO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_MODELO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_MODELO_SOAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_SUBMODELO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANHO_FABRICACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VAL_SUBMODELO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_USO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_USO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_COLOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_COLOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIP_VOLANTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_ZONA_TARIFARIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CANTIDAD_ASIENTOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_CATEGORIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_CATEGORIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIP_DOCUM_CONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_DOCUM_CONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_PLAZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_PLAZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MENSAJE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VEHICULO", propOrder = {
    "numplaca",
    "respuesta",
    "estado",
    "numchasis",
    "nummotor",
    "codmarca",
    "desmarca",
    "codmodelo",
    "desmodelo",
    "desmodelosoat",
    "codsubmodelo",
    "anhofabricacion",
    "valsubmodelo",
    "coduso",
    "desuso",
    "codcolor",
    "descolor",
    "tipvolante",
    "codzonatarifaria",
    "cantidadasientos",
    "codcategoria",
    "descategoria",
    "tipdocumcont",
    "coddocumcont",
    "codplaza",
    "desplaza",
    "mensaje"
})
public class VEHICULO {

    @XmlElement(name = "NUM_PLACA")
    protected String numplaca;
    @XmlElement(name = "RESPUESTA")
    protected String respuesta;
    @XmlElement(name = "ESTADO")
    protected String estado;
    @XmlElement(name = "NUM_CHASIS")
    protected String numchasis;
    @XmlElement(name = "NUM_MOTOR")
    protected String nummotor;
    @XmlElement(name = "COD_MARCA")
    protected String codmarca;
    @XmlElement(name = "DES_MARCA")
    protected String desmarca;
    @XmlElement(name = "COD_MODELO")
    protected String codmodelo;
    @XmlElement(name = "DES_MODELO")
    protected String desmodelo;
    @XmlElement(name = "DES_MODELO_SOAT")
    protected String desmodelosoat;
    @XmlElement(name = "COD_SUBMODELO")
    protected String codsubmodelo;
    @XmlElement(name = "ANHO_FABRICACION")
    protected String anhofabricacion;
    @XmlElement(name = "VAL_SUBMODELO")
    protected String valsubmodelo;
    @XmlElement(name = "COD_USO")
    protected String coduso;
    @XmlElement(name = "DES_USO")
    protected String desuso;
    @XmlElement(name = "COD_COLOR")
    protected String codcolor;
    @XmlElement(name = "DES_COLOR")
    protected String descolor;
    @XmlElement(name = "TIP_VOLANTE")
    protected String tipvolante;
    @XmlElement(name = "COD_ZONA_TARIFARIA")
    protected String codzonatarifaria;
    @XmlElement(name = "CANTIDAD_ASIENTOS")
    protected String cantidadasientos;
    @XmlElement(name = "COD_CATEGORIA")
    protected String codcategoria;
    @XmlElement(name = "DES_CATEGORIA")
    protected String descategoria;
    @XmlElement(name = "TIP_DOCUM_CONT")
    protected String tipdocumcont;
    @XmlElement(name = "COD_DOCUM_CONT")
    protected String coddocumcont;
    @XmlElement(name = "COD_PLAZA")
    protected String codplaza;
    @XmlElement(name = "DES_PLAZA")
    protected String desplaza;
    @XmlElement(name = "MENSAJE")
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad numplaca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMPLACA() {
        return numplaca;
    }

    /**
     * Define el valor de la propiedad numplaca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMPLACA(String value) {
        this.numplaca = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPUESTA() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPUESTA(String value) {
        this.respuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADO() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADO(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad numchasis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMCHASIS() {
        return numchasis;
    }

    /**
     * Define el valor de la propiedad numchasis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMCHASIS(String value) {
        this.numchasis = value;
    }

    /**
     * Obtiene el valor de la propiedad nummotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMMOTOR() {
        return nummotor;
    }

    /**
     * Define el valor de la propiedad nummotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMMOTOR(String value) {
        this.nummotor = value;
    }

    /**
     * Obtiene el valor de la propiedad codmarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMARCA() {
        return codmarca;
    }

    /**
     * Define el valor de la propiedad codmarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMARCA(String value) {
        this.codmarca = value;
    }

    /**
     * Obtiene el valor de la propiedad desmarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESMARCA() {
        return desmarca;
    }

    /**
     * Define el valor de la propiedad desmarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESMARCA(String value) {
        this.desmarca = value;
    }

    /**
     * Obtiene el valor de la propiedad codmodelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMODELO() {
        return codmodelo;
    }

    /**
     * Define el valor de la propiedad codmodelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMODELO(String value) {
        this.codmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad desmodelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESMODELO() {
        return desmodelo;
    }

    /**
     * Define el valor de la propiedad desmodelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESMODELO(String value) {
        this.desmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad desmodelosoat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESMODELOSOAT() {
        return desmodelosoat;
    }

    /**
     * Define el valor de la propiedad desmodelosoat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESMODELOSOAT(String value) {
        this.desmodelosoat = value;
    }

    /**
     * Obtiene el valor de la propiedad codsubmodelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBMODELO() {
        return codsubmodelo;
    }

    /**
     * Define el valor de la propiedad codsubmodelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBMODELO(String value) {
        this.codsubmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad anhofabricacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANHOFABRICACION() {
        return anhofabricacion;
    }

    /**
     * Define el valor de la propiedad anhofabricacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANHOFABRICACION(String value) {
        this.anhofabricacion = value;
    }

    /**
     * Obtiene el valor de la propiedad valsubmodelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALSUBMODELO() {
        return valsubmodelo;
    }

    /**
     * Define el valor de la propiedad valsubmodelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALSUBMODELO(String value) {
        this.valsubmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad coduso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODUSO() {
        return coduso;
    }

    /**
     * Define el valor de la propiedad coduso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODUSO(String value) {
        this.coduso = value;
    }

    /**
     * Obtiene el valor de la propiedad desuso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESUSO() {
        return desuso;
    }

    /**
     * Define el valor de la propiedad desuso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESUSO(String value) {
        this.desuso = value;
    }

    /**
     * Obtiene el valor de la propiedad codcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCOLOR() {
        return codcolor;
    }

    /**
     * Define el valor de la propiedad codcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCOLOR(String value) {
        this.codcolor = value;
    }

    /**
     * Obtiene el valor de la propiedad descolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCOLOR() {
        return descolor;
    }

    /**
     * Define el valor de la propiedad descolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCOLOR(String value) {
        this.descolor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipvolante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPVOLANTE() {
        return tipvolante;
    }

    /**
     * Define el valor de la propiedad tipvolante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPVOLANTE(String value) {
        this.tipvolante = value;
    }

    /**
     * Obtiene el valor de la propiedad codzonatarifaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODZONATARIFARIA() {
        return codzonatarifaria;
    }

    /**
     * Define el valor de la propiedad codzonatarifaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODZONATARIFARIA(String value) {
        this.codzonatarifaria = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadasientos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANTIDADASIENTOS() {
        return cantidadasientos;
    }

    /**
     * Define el valor de la propiedad cantidadasientos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANTIDADASIENTOS(String value) {
        this.cantidadasientos = value;
    }

    /**
     * Obtiene el valor de la propiedad codcategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCATEGORIA() {
        return codcategoria;
    }

    /**
     * Define el valor de la propiedad codcategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCATEGORIA(String value) {
        this.codcategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad descategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCATEGORIA() {
        return descategoria;
    }

    /**
     * Define el valor de la propiedad descategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCATEGORIA(String value) {
        this.descategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad tipdocumcont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPDOCUMCONT() {
        return tipdocumcont;
    }

    /**
     * Define el valor de la propiedad tipdocumcont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPDOCUMCONT(String value) {
        this.tipdocumcont = value;
    }

    /**
     * Obtiene el valor de la propiedad coddocumcont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDOCUMCONT() {
        return coddocumcont;
    }

    /**
     * Define el valor de la propiedad coddocumcont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDOCUMCONT(String value) {
        this.coddocumcont = value;
    }

    /**
     * Obtiene el valor de la propiedad codplaza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPLAZA() {
        return codplaza;
    }

    /**
     * Define el valor de la propiedad codplaza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPLAZA(String value) {
        this.codplaza = value;
    }

    /**
     * Obtiene el valor de la propiedad desplaza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESPLAZA() {
        return desplaza;
    }

    /**
     * Define el valor de la propiedad desplaza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESPLAZA(String value) {
        this.desplaza = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMENSAJE() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMENSAJE(String value) {
        this.mensaje = value;
    }

}
