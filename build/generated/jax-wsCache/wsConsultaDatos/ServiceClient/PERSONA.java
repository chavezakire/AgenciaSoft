
package ServiceClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PERSONA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PERSONA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_DOCUMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIP_DOCUMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APE_PATERNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APE_MATERNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TELEFONO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_DEPARTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_DEPARTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_DISTRITO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DES_DISTRITO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIRECCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FEC_NACIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_TIP_DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOM_TIP_DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_TIP_NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOM_TIP_NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_INTERIOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOM_INTERIOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_ZONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOM_ZONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_NACIONALIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_SEXO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MENSAJE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESPUESTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCA_ASEGURADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERSONA", propOrder = {
    "numdocumento",
    "tipdocumento",
    "nombres",
    "apepaterno",
    "apematerno",
    "telefono",
    "email",
    "coddepartamento",
    "desdepartamento",
    "codprovincia",
    "desprovincia",
    "coddistrito",
    "desdistrito",
    "direccion",
    "fecnacimiento",
    "codtipdomicilio",
    "nomtipdomicilio",
    "codtipnumero",
    "nomtipnumero",
    "codinterior",
    "nominterior",
    "codzona",
    "nomzona",
    "referencia",
    "codnacionalidad",
    "codsexo",
    "mensaje",
    "respuesta",
    "estado",
    "mcaasegurado"
})
public class PERSONA {

    @XmlElement(name = "NUM_DOCUMENTO")
    protected String numdocumento;
    @XmlElement(name = "TIP_DOCUMENTO")
    protected String tipdocumento;
    @XmlElement(name = "NOMBRES")
    protected String nombres;
    @XmlElement(name = "APE_PATERNO")
    protected String apepaterno;
    @XmlElement(name = "APE_MATERNO")
    protected String apematerno;
    @XmlElement(name = "TELEFONO")
    protected String telefono;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "COD_DEPARTAMENTO")
    protected String coddepartamento;
    @XmlElement(name = "DES_DEPARTAMENTO")
    protected String desdepartamento;
    @XmlElement(name = "COD_PROVINCIA")
    protected String codprovincia;
    @XmlElement(name = "DES_PROVINCIA")
    protected String desprovincia;
    @XmlElement(name = "COD_DISTRITO")
    protected String coddistrito;
    @XmlElement(name = "DES_DISTRITO")
    protected String desdistrito;
    @XmlElement(name = "DIRECCION")
    protected String direccion;
    @XmlElement(name = "FEC_NACIMIENTO")
    protected String fecnacimiento;
    @XmlElement(name = "COD_TIP_DOMICILIO")
    protected String codtipdomicilio;
    @XmlElement(name = "NOM_TIP_DOMICILIO")
    protected String nomtipdomicilio;
    @XmlElement(name = "COD_TIP_NUMERO")
    protected String codtipnumero;
    @XmlElement(name = "NOM_TIP_NUMERO")
    protected String nomtipnumero;
    @XmlElement(name = "COD_INTERIOR")
    protected String codinterior;
    @XmlElement(name = "NOM_INTERIOR")
    protected String nominterior;
    @XmlElement(name = "COD_ZONA")
    protected String codzona;
    @XmlElement(name = "NOM_ZONA")
    protected String nomzona;
    @XmlElement(name = "REFERENCIA")
    protected String referencia;
    @XmlElement(name = "COD_NACIONALIDAD")
    protected String codnacionalidad;
    @XmlElement(name = "COD_SEXO")
    protected String codsexo;
    @XmlElement(name = "MENSAJE")
    protected String mensaje;
    @XmlElement(name = "RESPUESTA")
    protected String respuesta;
    @XmlElement(name = "ESTADO")
    protected String estado;
    @XmlElement(name = "MCA_ASEGURADO")
    protected String mcaasegurado;

    /**
     * Obtiene el valor de la propiedad numdocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMDOCUMENTO() {
        return numdocumento;
    }

    /**
     * Define el valor de la propiedad numdocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMDOCUMENTO(String value) {
        this.numdocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipdocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPDOCUMENTO() {
        return tipdocumento;
    }

    /**
     * Define el valor de la propiedad tipdocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPDOCUMENTO(String value) {
        this.tipdocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRES() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRES(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad apepaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPEPATERNO() {
        return apepaterno;
    }

    /**
     * Define el valor de la propiedad apepaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPEPATERNO(String value) {
        this.apepaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apematerno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPEMATERNO() {
        return apematerno;
    }

    /**
     * Define el valor de la propiedad apematerno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPEMATERNO(String value) {
        this.apematerno = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONO() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONO(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad coddepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDEPARTAMENTO() {
        return coddepartamento;
    }

    /**
     * Define el valor de la propiedad coddepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDEPARTAMENTO(String value) {
        this.coddepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad desdepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESDEPARTAMENTO() {
        return desdepartamento;
    }

    /**
     * Define el valor de la propiedad desdepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESDEPARTAMENTO(String value) {
        this.desdepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad codprovincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPROVINCIA() {
        return codprovincia;
    }

    /**
     * Define el valor de la propiedad codprovincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPROVINCIA(String value) {
        this.codprovincia = value;
    }

    /**
     * Obtiene el valor de la propiedad desprovincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESPROVINCIA() {
        return desprovincia;
    }

    /**
     * Define el valor de la propiedad desprovincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESPROVINCIA(String value) {
        this.desprovincia = value;
    }

    /**
     * Obtiene el valor de la propiedad coddistrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDISTRITO() {
        return coddistrito;
    }

    /**
     * Define el valor de la propiedad coddistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDISTRITO(String value) {
        this.coddistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad desdistrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESDISTRITO() {
        return desdistrito;
    }

    /**
     * Define el valor de la propiedad desdistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESDISTRITO(String value) {
        this.desdistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECCION() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECCION(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad fecnacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECNACIMIENTO() {
        return fecnacimiento;
    }

    /**
     * Define el valor de la propiedad fecnacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECNACIMIENTO(String value) {
        this.fecnacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codtipdomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPDOMICILIO() {
        return codtipdomicilio;
    }

    /**
     * Define el valor de la propiedad codtipdomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPDOMICILIO(String value) {
        this.codtipdomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad nomtipdomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMTIPDOMICILIO() {
        return nomtipdomicilio;
    }

    /**
     * Define el valor de la propiedad nomtipdomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMTIPDOMICILIO(String value) {
        this.nomtipdomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad codtipnumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPNUMERO() {
        return codtipnumero;
    }

    /**
     * Define el valor de la propiedad codtipnumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPNUMERO(String value) {
        this.codtipnumero = value;
    }

    /**
     * Obtiene el valor de la propiedad nomtipnumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMTIPNUMERO() {
        return nomtipnumero;
    }

    /**
     * Define el valor de la propiedad nomtipnumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMTIPNUMERO(String value) {
        this.nomtipnumero = value;
    }

    /**
     * Obtiene el valor de la propiedad codinterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODINTERIOR() {
        return codinterior;
    }

    /**
     * Define el valor de la propiedad codinterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODINTERIOR(String value) {
        this.codinterior = value;
    }

    /**
     * Obtiene el valor de la propiedad nominterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMINTERIOR() {
        return nominterior;
    }

    /**
     * Define el valor de la propiedad nominterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMINTERIOR(String value) {
        this.nominterior = value;
    }

    /**
     * Obtiene el valor de la propiedad codzona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODZONA() {
        return codzona;
    }

    /**
     * Define el valor de la propiedad codzona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODZONA(String value) {
        this.codzona = value;
    }

    /**
     * Obtiene el valor de la propiedad nomzona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMZONA() {
        return nomzona;
    }

    /**
     * Define el valor de la propiedad nomzona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMZONA(String value) {
        this.nomzona = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCIA() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCIA(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codnacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODNACIONALIDAD() {
        return codnacionalidad;
    }

    /**
     * Define el valor de la propiedad codnacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODNACIONALIDAD(String value) {
        this.codnacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codsexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSEXO() {
        return codsexo;
    }

    /**
     * Define el valor de la propiedad codsexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSEXO(String value) {
        this.codsexo = value;
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
     * Obtiene el valor de la propiedad mcaasegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCAASEGURADO() {
        return mcaasegurado;
    }

    /**
     * Define el valor de la propiedad mcaasegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCAASEGURADO(String value) {
        this.mcaasegurado = value;
    }

}
