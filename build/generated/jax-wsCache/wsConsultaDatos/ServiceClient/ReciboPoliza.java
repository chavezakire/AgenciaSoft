
package ServiceClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="p_Cod_Cia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p_Cod_Ramo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p_Num_Poliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p_Num_Spto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p_Num_Apli" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p_Num_Spto_Apli" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pCodCia",
    "pCodRamo",
    "pNumPoliza",
    "pNumSpto",
    "pNumApli",
    "pNumSptoApli"
})
@XmlRootElement(name = "ReciboPoliza")
public class ReciboPoliza {

    @XmlElement(name = "p_Cod_Cia")
    protected int pCodCia;
    @XmlElement(name = "p_Cod_Ramo")
    protected int pCodRamo;
    @XmlElement(name = "p_Num_Poliza")
    protected String pNumPoliza;
    @XmlElement(name = "p_Num_Spto")
    protected int pNumSpto;
    @XmlElement(name = "p_Num_Apli")
    protected int pNumApli;
    @XmlElement(name = "p_Num_Spto_Apli")
    protected int pNumSptoApli;

    /**
     * Obtiene el valor de la propiedad pCodCia.
     * 
     */
    public int getPCodCia() {
        return pCodCia;
    }

    /**
     * Define el valor de la propiedad pCodCia.
     * 
     */
    public void setPCodCia(int value) {
        this.pCodCia = value;
    }

    /**
     * Obtiene el valor de la propiedad pCodRamo.
     * 
     */
    public int getPCodRamo() {
        return pCodRamo;
    }

    /**
     * Define el valor de la propiedad pCodRamo.
     * 
     */
    public void setPCodRamo(int value) {
        this.pCodRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad pNumPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNumPoliza() {
        return pNumPoliza;
    }

    /**
     * Define el valor de la propiedad pNumPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNumPoliza(String value) {
        this.pNumPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad pNumSpto.
     * 
     */
    public int getPNumSpto() {
        return pNumSpto;
    }

    /**
     * Define el valor de la propiedad pNumSpto.
     * 
     */
    public void setPNumSpto(int value) {
        this.pNumSpto = value;
    }

    /**
     * Obtiene el valor de la propiedad pNumApli.
     * 
     */
    public int getPNumApli() {
        return pNumApli;
    }

    /**
     * Define el valor de la propiedad pNumApli.
     * 
     */
    public void setPNumApli(int value) {
        this.pNumApli = value;
    }

    /**
     * Obtiene el valor de la propiedad pNumSptoApli.
     * 
     */
    public int getPNumSptoApli() {
        return pNumSptoApli;
    }

    /**
     * Define el valor de la propiedad pNumSptoApli.
     * 
     */
    public void setPNumSptoApli(int value) {
        this.pNumSptoApli = value;
    }

}
