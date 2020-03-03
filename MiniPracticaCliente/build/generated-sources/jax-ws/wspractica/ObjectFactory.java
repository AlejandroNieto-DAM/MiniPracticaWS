
package wspractica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wspractica package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendEmailResponse_QNAME = new QName("http://WSPractica/", "sendEmailResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://WSPractica/", "helloResponse");
    private final static QName _LoginAcces_QNAME = new QName("http://WSPractica/", "loginAcces");
    private final static QName _SendEmail_QNAME = new QName("http://WSPractica/", "sendEmail");
    private final static QName _Calculadora_QNAME = new QName("http://WSPractica/", "calculadora");
    private final static QName _CalculadoraResponse_QNAME = new QName("http://WSPractica/", "calculadoraResponse");
    private final static QName _LoginAccesResponse_QNAME = new QName("http://WSPractica/", "loginAccesResponse");
    private final static QName _Hello_QNAME = new QName("http://WSPractica/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wspractica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginAcces }
     * 
     */
    public LoginAcces createLoginAcces() {
        return new LoginAcces();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link LoginAccesResponse }
     * 
     */
    public LoginAccesResponse createLoginAccesResponse() {
        return new LoginAccesResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Calculadora }
     * 
     */
    public Calculadora createCalculadora() {
        return new Calculadora();
    }

    /**
     * Create an instance of {@link CalculadoraResponse }
     * 
     */
    public CalculadoraResponse createCalculadoraResponse() {
        return new CalculadoraResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPractica/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPractica/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAcces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPractica/", name = "loginAcces")
    public JAXBElement<LoginAcces> createLoginAcces(LoginAcces value) {
        return new JAXBElement<LoginAcces>(_LoginAcces_QNAME, LoginAcces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPractica/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculadora }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPractica/", name = "calculadora")
    public JAXBElement<Calculadora> createCalculadora(Calculadora value) {
        return new JAXBElement<Calculadora>(_Calculadora_QNAME, Calculadora.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculadoraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPractica/", name = "calculadoraResponse")
    public JAXBElement<CalculadoraResponse> createCalculadoraResponse(CalculadoraResponse value) {
        return new JAXBElement<CalculadoraResponse>(_CalculadoraResponse_QNAME, CalculadoraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAccesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPractica/", name = "loginAccesResponse")
    public JAXBElement<LoginAccesResponse> createLoginAccesResponse(LoginAccesResponse value) {
        return new JAXBElement<LoginAccesResponse>(_LoginAccesResponse_QNAME, LoginAccesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPractica/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
