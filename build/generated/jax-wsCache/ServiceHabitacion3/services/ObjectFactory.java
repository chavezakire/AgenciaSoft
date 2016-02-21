
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

    private final static QName _FindHabDisponible_QNAME = new QName("http://services/", "findHabDisponible");
    private final static QName _FindHabDisponibleResponse_QNAME = new QName("http://services/", "findHabDisponibleResponse");
    private final static QName _Hello_QNAME = new QName("http://services/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://services/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindHabDisponible }
     * 
     */
    public FindHabDisponible createFindHabDisponible() {
        return new FindHabDisponible();
    }

    /**
     * Create an instance of {@link FindHabDisponibleResponse }
     * 
     */
    public FindHabDisponibleResponse createFindHabDisponibleResponse() {
        return new FindHabDisponibleResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHabDisponible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findHabDisponible")
    public JAXBElement<FindHabDisponible> createFindHabDisponible(FindHabDisponible value) {
        return new JAXBElement<FindHabDisponible>(_FindHabDisponible_QNAME, FindHabDisponible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHabDisponibleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findHabDisponibleResponse")
    public JAXBElement<FindHabDisponibleResponse> createFindHabDisponibleResponse(FindHabDisponibleResponse value) {
        return new JAXBElement<FindHabDisponibleResponse>(_FindHabDisponibleResponse_QNAME, FindHabDisponibleResponse.class, null, value);
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
