package com.comviva.asa.orchestrator2pulsar.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2020-08-07T12:27:47.640-03:00
 * Generated source version: 3.3.4
 *
 */
@WebServiceClient(name = "PulsarInterfaceService",
                  wsdlLocation = "file:/C:/Users/tbel/Documents/workspace_new/ASA_recordPendingTask/WebContent/wsPulsar.wsdl",
                  targetNamespace = "http://ws.orchestrator2pulsar.asa.comviva.com/")
public class PulsarInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.orchestrator2pulsar.asa.comviva.com/", "PulsarInterfaceService");
    public final static QName PulsarInterfacePort = new QName("http://ws.orchestrator2pulsar.asa.comviva.com/", "PulsarInterfacePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/tbel/Documents/workspace_new/ASA_recordPendingTask/WebContent/wsPulsar.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PulsarInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/tbel/Documents/workspace_new/ASA_recordPendingTask/WebContent/wsPulsar.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PulsarInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PulsarInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PulsarInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PulsarInterfaceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PulsarInterfaceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PulsarInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PulsarInterface
     */
    @WebEndpoint(name = "PulsarInterfacePort")
    public PulsarInterface getPulsarInterfacePort() {
        return super.getPort(PulsarInterfacePort, PulsarInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PulsarInterface
     */
    @WebEndpoint(name = "PulsarInterfacePort")
    public PulsarInterface getPulsarInterfacePort(WebServiceFeature... features) {
        return super.getPort(PulsarInterfacePort, PulsarInterface.class, features);
    }

}
