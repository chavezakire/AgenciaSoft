
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para habitacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="habitacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cod_habitacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hotel" type="{http://services/}hotel" minOccurs="0"/&gt;
 *         &lt;element name="id_habitacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numhab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="tipo_hab" type="{http://services/}tipoHabitacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "habitacion", propOrder = {
    "codHabitacion",
    "estado",
    "hotel",
    "idHabitacion",
    "numhab",
    "piso",
    "precio",
    "tipoHab"
})
public class Habitacion {

    @XmlElement(name = "cod_habitacion")
    protected String codHabitacion;
    protected String estado;
    protected Hotel hotel;
    @XmlElement(name = "id_habitacion")
    protected int idHabitacion;
    protected String numhab;
    protected String piso;
    protected float precio;
    @XmlElement(name = "tipo_hab")
    protected TipoHabitacion tipoHab;

    /**
     * Obtiene el valor de la propiedad codHabitacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodHabitacion() {
        return codHabitacion;
    }

    /**
     * Define el valor de la propiedad codHabitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodHabitacion(String value) {
        this.codHabitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
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
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad hotel.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Define el valor de la propiedad hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * Obtiene el valor de la propiedad idHabitacion.
     * 
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * Define el valor de la propiedad idHabitacion.
     * 
     */
    public void setIdHabitacion(int value) {
        this.idHabitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numhab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumhab() {
        return numhab;
    }

    /**
     * Define el valor de la propiedad numhab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumhab(String value) {
        this.numhab = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(float value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoHab.
     * 
     * @return
     *     possible object is
     *     {@link TipoHabitacion }
     *     
     */
    public TipoHabitacion getTipoHab() {
        return tipoHab;
    }

    /**
     * Define el valor de la propiedad tipoHab.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoHabitacion }
     *     
     */
    public void setTipoHab(TipoHabitacion value) {
        this.tipoHab = value;
    }

}
