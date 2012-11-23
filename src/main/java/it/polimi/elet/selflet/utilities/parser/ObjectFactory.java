//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.11 at 11:56:31 PM CEST 
//


package it.polimi.elet.selflet.utilities.parser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polimi.elet.selflet.utilities.parser package. 
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

    private final static QName _Service_QNAME = new QName("http://sourceforge.net/projects/selflet/service", "service");
    private final static QName _Selflet_QNAME = new QName("http://sourceforge.net/projects/selflet/", "selflet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polimi.elet.selflet.utilities.parser
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link CPUUtilizationType }
     * 
     */
    public CPUUtilizationType createCPUUtilizationType() {
        return new CPUUtilizationType();
    }

    /**
     * Create an instance of {@link InputType }
     * 
     */
    public InputType createInputType() {
        return new InputType();
    }

    /**
     * Create an instance of {@link GeneralKnowledgeType }
     * 
     */
    public GeneralKnowledgeType createGeneralKnowledgeType() {
        return new GeneralKnowledgeType();
    }

    /**
     * Create an instance of {@link TypeKnowledgeType }
     * 
     */
    public TypeKnowledgeType createTypeKnowledgeType() {
        return new TypeKnowledgeType();
    }

    /**
     * Create an instance of {@link ImplementedByType }
     * 
     */
    public ImplementedByType createImplementedByType() {
        return new ImplementedByType();
    }

    /**
     * Create an instance of {@link Empty }
     * 
     */
    public Empty createEmpty() {
        return new Empty();
    }

    /**
     * Create an instance of {@link RedsType }
     * 
     */
    public RedsType createRedsType() {
        return new RedsType();
    }

    /**
     * Create an instance of {@link ServiceInputType }
     * 
     */
    public ServiceInputType createServiceInputType() {
        return new ServiceInputType();
    }

    /**
     * Create an instance of {@link SelfletProperties }
     * 
     */
    public SelfletProperties createSelfletProperties() {
        return new SelfletProperties();
    }

    /**
     * Create an instance of {@link SelfletType }
     * 
     */
    public SelfletType createSelfletType() {
        return new SelfletType();
    }

    /**
     * Create an instance of {@link ServiceOutputType }
     * 
     */
    public ServiceOutputType createServiceOutputType() {
        return new ServiceOutputType();
    }

    /**
     * Create an instance of {@link ActiveType }
     * 
     */
    public ActiveType createActiveType() {
        return new ActiveType();
    }

    /**
     * Create an instance of {@link SelfLetProperty }
     * 
     */
    public SelfLetProperty createSelfLetProperty() {
        return new SelfLetProperty();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sourceforge.net/projects/selflet/service", name = "service")
    public JAXBElement<ServiceType> createService(ServiceType value) {
        return new JAXBElement<ServiceType>(_Service_QNAME, ServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelfletType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sourceforge.net/projects/selflet/", name = "selflet")
    public JAXBElement<SelfletType> createSelflet(SelfletType value) {
        return new JAXBElement<SelfletType>(_Selflet_QNAME, SelfletType.class, null, value);
    }

}
