
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _HistorialReservaCliente_QNAME = new QName("http://services/", "HistorialReservaCliente");
    private final static QName _HistorialReservaClienteResponse_QNAME = new QName("http://services/", "HistorialReservaClienteResponse");
    private final static QName _AddReserva_QNAME = new QName("http://services/", "add_Reserva");
    private final static QName _AddReservaResponse_QNAME = new QName("http://services/", "add_ReservaResponse");
    private final static QName _Hello_QNAME = new QName("http://services/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://services/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HistorialReservaCliente }
     * 
     */
    public HistorialReservaCliente createHistorialReservaCliente() {
        return new HistorialReservaCliente();
    }

    /**
     * Create an instance of {@link HistorialReservaClienteResponse }
     * 
     */
    public HistorialReservaClienteResponse createHistorialReservaClienteResponse() {
        return new HistorialReservaClienteResponse();
    }

    /**
     * Create an instance of {@link AddReserva }
     * 
     */
    public AddReserva createAddReserva() {
        return new AddReserva();
    }

    /**
     * Create an instance of {@link AddReservaResponse }
     * 
     */
    public AddReservaResponse createAddReservaResponse() {
        return new AddReservaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Habitacion }
     * 
     */
    public Habitacion createHabitacion() {
        return new Habitacion();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link TipoHabitacion }
     * 
     */
    public TipoHabitacion createTipoHabitacion() {
        return new TipoHabitacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistorialReservaCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "HistorialReservaCliente")
    public JAXBElement<HistorialReservaCliente> createHistorialReservaCliente(HistorialReservaCliente value) {
        return new JAXBElement<HistorialReservaCliente>(_HistorialReservaCliente_QNAME, HistorialReservaCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistorialReservaClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "HistorialReservaClienteResponse")
    public JAXBElement<HistorialReservaClienteResponse> createHistorialReservaClienteResponse(HistorialReservaClienteResponse value) {
        return new JAXBElement<HistorialReservaClienteResponse>(_HistorialReservaClienteResponse_QNAME, HistorialReservaClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "add_Reserva")
    public JAXBElement<AddReserva> createAddReserva(AddReserva value) {
        return new JAXBElement<AddReserva>(_AddReserva_QNAME, AddReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "add_ReservaResponse")
    public JAXBElement<AddReservaResponse> createAddReservaResponse(AddReservaResponse value) {
        return new JAXBElement<AddReservaResponse>(_AddReservaResponse_QNAME, AddReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
