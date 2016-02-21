
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="p_cod_marca" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="p_cod_modelo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="p_cod_sub_modelo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="p_anio_sub_modelo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pCodMarca",
    "pCodModelo",
    "pCodSubModelo",
    "pAnioSubModelo"
})
@XmlRootElement(name = "Valor_Sub_Modelo")
public class ValorSubModelo {

    @XmlElement(name = "p_cod_marca")
    protected int pCodMarca;
    @XmlElement(name = "p_cod_modelo")
    protected int pCodModelo;
    @XmlElement(name = "p_cod_sub_modelo")
    protected int pCodSubModelo;
    @XmlElement(name = "p_anio_sub_modelo")
    protected int pAnioSubModelo;

    /**
     * Obtiene el valor de la propiedad pCodMarca.
     * 
     */
    public int getPCodMarca() {
        return pCodMarca;
    }

    /**
     * Define el valor de la propiedad pCodMarca.
     * 
     */
    public void setPCodMarca(int value) {
        this.pCodMarca = value;
    }

    /**
     * Obtiene el valor de la propiedad pCodModelo.
     * 
     */
    public int getPCodModelo() {
        return pCodModelo;
    }

    /**
     * Define el valor de la propiedad pCodModelo.
     * 
     */
    public void setPCodModelo(int value) {
        this.pCodModelo = value;
    }

    /**
     * Obtiene el valor de la propiedad pCodSubModelo.
     * 
     */
    public int getPCodSubModelo() {
        return pCodSubModelo;
    }

    /**
     * Define el valor de la propiedad pCodSubModelo.
     * 
     */
    public void setPCodSubModelo(int value) {
        this.pCodSubModelo = value;
    }

    /**
     * Obtiene el valor de la propiedad pAnioSubModelo.
     * 
     */
    public int getPAnioSubModelo() {
        return pAnioSubModelo;
    }

    /**
     * Define el valor de la propiedad pAnioSubModelo.
     * 
     */
    public void setPAnioSubModelo(int value) {
        this.pAnioSubModelo = value;
    }

}
