
package wspractica;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSPractica", targetNamespace = "http://WSPractica/", wsdlLocation = "http://localhost:8080/WebApplication3/WSPractica?wsdl")
public class WSPractica_Service
    extends Service
{

    private final static URL WSPRACTICA_WSDL_LOCATION;
    private final static WebServiceException WSPRACTICA_EXCEPTION;
    private final static QName WSPRACTICA_QNAME = new QName("http://WSPractica/", "WSPractica");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebApplication3/WSPractica?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSPRACTICA_WSDL_LOCATION = url;
        WSPRACTICA_EXCEPTION = e;
    }

    public WSPractica_Service() {
        super(__getWsdlLocation(), WSPRACTICA_QNAME);
    }

    public WSPractica_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSPRACTICA_QNAME, features);
    }

    public WSPractica_Service(URL wsdlLocation) {
        super(wsdlLocation, WSPRACTICA_QNAME);
    }

    public WSPractica_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSPRACTICA_QNAME, features);
    }

    public WSPractica_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSPractica_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSPractica
     */
    @WebEndpoint(name = "WSPracticaPort")
    public WSPractica getWSPracticaPort() {
        return super.getPort(new QName("http://WSPractica/", "WSPracticaPort"), WSPractica.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSPractica
     */
    @WebEndpoint(name = "WSPracticaPort")
    public WSPractica getWSPracticaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WSPractica/", "WSPracticaPort"), WSPractica.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSPRACTICA_EXCEPTION!= null) {
            throw WSPRACTICA_EXCEPTION;
        }
        return WSPRACTICA_WSDL_LOCATION;
    }

}
