
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para findHabDisponible complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="findHabDisponible"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idhotel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipohab" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findHabDisponible", propOrder = {
    "idhotel",
    "tipohab",
    "fd",
    "fh"
})
public class FindHabDisponible {

    protected int idhotel;
    protected int tipohab;
    protected String fd;
    protected String fh;

    /**
     * Obtiene el valor de la propiedad idhotel.
     * 
     */
    public int getIdhotel() {
        return idhotel;
    }

    /**
     * Define el valor de la propiedad idhotel.
     * 
     */
    public void setIdhotel(int value) {
        this.idhotel = value;
    }

    /**
     * Obtiene el valor de la propiedad tipohab.
     * 
     */
    public int getTipohab() {
        return tipohab;
    }

    /**
     * Define el valor de la propiedad tipohab.
     * 
     */
    public void setTipohab(int value) {
        this.tipohab = value;
    }

    /**
     * Obtiene el valor de la propiedad fd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFd() {
        return fd;
    }

    /**
     * Define el valor de la propiedad fd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFd(String value) {
        this.fd = value;
    }

    /**
     * Obtiene el valor de la propiedad fh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFh() {
        return fh;
    }

    /**
     * Define el valor de la propiedad fh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFh(String value) {
        this.fh = value;
    }

}
