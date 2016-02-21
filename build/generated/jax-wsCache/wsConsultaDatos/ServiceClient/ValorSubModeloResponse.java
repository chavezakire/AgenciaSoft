
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
 *         &lt;element name="Valor_Sub_ModeloResult" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "valorSubModeloResult"
})
@XmlRootElement(name = "Valor_Sub_ModeloResponse")
public class ValorSubModeloResponse {

    @XmlElement(name = "Valor_Sub_ModeloResult")
    protected double valorSubModeloResult;

    /**
     * Obtiene el valor de la propiedad valorSubModeloResult.
     * 
     */
    public double getValorSubModeloResult() {
        return valorSubModeloResult;
    }

    /**
     * Define el valor de la propiedad valorSubModeloResult.
     * 
     */
    public void setValorSubModeloResult(double value) {
        this.valorSubModeloResult = value;
    }

}
