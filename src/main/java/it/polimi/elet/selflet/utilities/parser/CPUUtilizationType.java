//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.11 at 11:56:31 PM CEST 
//


package it.polimi.elet.selflet.utilities.parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPUUtilizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPUUtilizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lowerBound" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="upperBound" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPUUtilizationType", propOrder = {
    "lowerBound",
    "upperBound"
})
public class CPUUtilizationType {

    protected double lowerBound;
    protected double upperBound;

    /**
     * Gets the value of the lowerBound property.
     * 
     */
    public double getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets the value of the lowerBound property.
     * 
     */
    public void setLowerBound(double value) {
        this.lowerBound = value;
    }

    /**
     * Gets the value of the upperBound property.
     * 
     */
    public double getUpperBound() {
        return upperBound;
    }

    /**
     * Sets the value of the upperBound property.
     * 
     */
    public void setUpperBound(double value) {
        this.upperBound = value;
    }

}