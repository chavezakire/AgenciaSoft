
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reserva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" type="{http://services/}cliente" minOccurs="0"/&gt;
 *         &lt;element name="dias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fec_fin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fec_inicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fec_reserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="habitacion" type="{http://services/}habitacion" minOccurs="0"/&gt;
 *         &lt;element name="id_reserva" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="venta_total" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserva", propOrder = {
    "cliente",
    "dias",
    "fecFin",
    "fecInicio",
    "fecReserva",
    "habitacion",
    "idReserva",
    "observacion",
    "ventaTotal"
})
public class Reserva {

    protected Cliente cliente;
    protected int dias;
    @XmlElement(name = "fec_fin")
    protected String fecFin;
    @XmlElement(name = "fec_inicio")
    protected String fecInicio;
    @XmlElement(name = "fec_reserva")
    protected String fecReserva;
    protected Habitacion habitacion;
    @XmlElement(name = "id_reserva")
    protected int idReserva;
    protected String observacion;
    @XmlElement(name = "venta_total")
    protected float ventaTotal;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     */
    public int getDias() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     */
    public void setDias(int value) {
        this.dias = value;
    }

    /**
     * Obtiene el valor de la propiedad fecFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecFin() {
        return fecFin;
    }

    /**
     * Define el valor de la propiedad fecFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecFin(String value) {
        this.fecFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fecInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecInicio() {
        return fecInicio;
    }

    /**
     * Define el valor de la propiedad fecInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecInicio(String value) {
        this.fecInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fecReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecReserva() {
        return fecReserva;
    }

    /**
     * Define el valor de la propiedad fecReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecReserva(String value) {
        this.fecReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad habitacion.
     * 
     * @return
     *     possible object is
     *     {@link Habitacion }
     *     
     */
    public Habitacion getHabitacion() {
        return habitacion;
    }

    /**
     * Define el valor de la propiedad habitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Habitacion }
     *     
     */
    public void setHabitacion(Habitacion value) {
        this.habitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idReserva.
     * 
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * Define el valor de la propiedad idReserva.
     * 
     */
    public void setIdReserva(int value) {
        this.idReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ventaTotal.
     * 
     */
    public float getVentaTotal() {
        return ventaTotal;
    }

    /**
     * Define el valor de la propiedad ventaTotal.
     * 
     */
    public void setVentaTotal(float value) {
        this.ventaTotal = value;
    }

}
