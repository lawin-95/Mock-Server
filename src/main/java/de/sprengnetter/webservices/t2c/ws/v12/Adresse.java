//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.24 um 09:44:22 AM CEST 
//


package de.sprengnetter.webservices.t2c.ws.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für adresse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="adresse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hausNummer" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stadtTeil" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="nation" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresse", propOrder = {
    "hausNummer",
    "ort",
    "plz",
    "strasse",
    "stadtTeil",
    "nation"
})
public class Adresse {

    @XmlSchemaType(name = "unsignedByte")
    protected short hausNummer;
    @XmlElement(required = true)
    protected String ort;
    @XmlElement(required = true)
    protected String plz;
    @XmlElement(required = true)
    protected String strasse;
    @XmlElement(required = true)
    protected Object stadtTeil;
    @XmlElement(required = true)
    protected Object nation;

    /**
     * Ruft den Wert der hausNummer-Eigenschaft ab.
     * 
     */
    public short getHausNummer() {
        return hausNummer;
    }

    /**
     * Legt den Wert der hausNummer-Eigenschaft fest.
     * 
     */
    public void setHausNummer(short value) {
        this.hausNummer = value;
    }

    /**
     * Ruft den Wert der ort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Legt den Wert der ort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Ruft den Wert der plz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlz() {
        return plz;
    }

    /**
     * Legt den Wert der plz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlz(String value) {
        this.plz = value;
    }

    /**
     * Ruft den Wert der strasse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Legt den Wert der strasse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Ruft den Wert der stadtTeil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStadtTeil() {
        return stadtTeil;
    }

    /**
     * Legt den Wert der stadtTeil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStadtTeil(Object value) {
        this.stadtTeil = value;
    }

    /**
     * Ruft den Wert der nation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNation() {
        return nation;
    }

    /**
     * Legt den Wert der nation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNation(Object value) {
        this.nation = value;
    }

}
