
package wspractica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calculadora complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calculadora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primerNumero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="segundoNumero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculadora", propOrder = {
    "primerNumero",
    "segundoNumero",
    "operacion"
})
public class Calculadora {

    protected int primerNumero;
    protected int segundoNumero;
    protected String operacion;

    /**
     * Obtiene el valor de la propiedad primerNumero.
     * 
     */
    public int getPrimerNumero() {
        return primerNumero;
    }

    /**
     * Define el valor de la propiedad primerNumero.
     * 
     */
    public void setPrimerNumero(int value) {
        this.primerNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNumero.
     * 
     */
    public int getSegundoNumero() {
        return segundoNumero;
    }

    /**
     * Define el valor de la propiedad segundoNumero.
     * 
     */
    public void setSegundoNumero(int value) {
        this.segundoNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

}
