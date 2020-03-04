
package wspractica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ordenarNumeros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ordenarNumeros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordenarNumeros", propOrder = {
    "numero1",
    "numero2",
    "numero3",
    "numero4",
    "numero5"
})
public class OrdenarNumeros {

    protected int numero1;
    protected int numero2;
    protected int numero3;
    protected int numero4;
    protected int numero5;

    /**
     * Obtiene el valor de la propiedad numero1.
     * 
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * Define el valor de la propiedad numero1.
     * 
     */
    public void setNumero1(int value) {
        this.numero1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero2.
     * 
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * Define el valor de la propiedad numero2.
     * 
     */
    public void setNumero2(int value) {
        this.numero2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero3.
     * 
     */
    public int getNumero3() {
        return numero3;
    }

    /**
     * Define el valor de la propiedad numero3.
     * 
     */
    public void setNumero3(int value) {
        this.numero3 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero4.
     * 
     */
    public int getNumero4() {
        return numero4;
    }

    /**
     * Define el valor de la propiedad numero4.
     * 
     */
    public void setNumero4(int value) {
        this.numero4 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero5.
     * 
     */
    public int getNumero5() {
        return numero5;
    }

    /**
     * Define el valor de la propiedad numero5.
     * 
     */
    public void setNumero5(int value) {
        this.numero5 = value;
    }

}
