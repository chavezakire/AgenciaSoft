
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para add_Reserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="add_Reserva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="habitacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecfin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="venta" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add_Reserva", propOrder = {
    "habitacion",
    "fecini",
    "fecfin",
    "venta",
    "cliente"
})
public class AddReserva {

    protected int habitacion;
    protected String fecini;
    protected String fecfin;
    protected float venta;
    protected String cliente;

    /**
     * Obtiene el valor de la propiedad habitacion.
     * 
     */
    public int getHabitacion() {
        return habitacion;
    }

    /**
     * Define el valor de la propiedad habitacion.
     * 
     */
    public void setHabitacion(int value) {
        this.habitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fecini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecini() {
        return fecini;
    }

    /**
     * Define el valor de la propiedad fecini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecini(String value) {
        this.fecini = value;
    }

    /**
     * Obtiene el valor de la propiedad fecfin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecfin() {
        return fecfin;
    }

    /**
     * Define el valor de la propiedad fecfin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecfin(String value) {
        this.fecfin = value;
    }

    /**
     * Obtiene el valor de la propiedad venta.
     * 
     */
    public float getVenta() {
        return venta;
    }

    /**
     * Define el valor de la propiedad venta.
     * 
     */
    public void setVenta(float value) {
        this.venta = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

}
